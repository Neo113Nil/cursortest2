package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.m3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0321m3 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14224a;

    /* renamed from: b, reason: collision with root package name */
    public final We f14225b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14226c;

    /* renamed from: d, reason: collision with root package name */
    public final SafePackageManager f14227d;

    public C0321m3(Context context, We we2, String str, SafePackageManager safePackageManager) {
        this.f14224a = context;
        this.f14225b = we2;
        this.f14226c = str;
        this.f14227d = safePackageManager;
    }

    public final List a() {
        Signature[] signatureArr;
        String str;
        SigningInfo signingInfo;
        List<String> g10 = this.f14225b.g();
        boolean isEmpty = g10.isEmpty();
        List<String> list = g10;
        if (isEmpty) {
            ArrayList arrayList = new ArrayList();
            try {
                if (AndroidUtils.isApiAchieved(28)) {
                    signingInfo = this.f14227d.getPackageInfo(this.f14224a, this.f14226c, 134217728).signingInfo;
                    signatureArr = signingInfo.hasMultipleSigners() ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
                } else {
                    signatureArr = this.f14227d.getPackageInfo(this.f14224a, this.f14226c, 64).signatures;
                }
                if (signatureArr != null) {
                    for (Signature signature : signatureArr) {
                        try {
                            str = StringUtils.formatSha1(MessageDigest.getInstance("SHA1").digest(signature.toByteArray()));
                        } catch (Throwable unused) {
                            str = null;
                        }
                        if (str != null) {
                            arrayList.add(str);
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
            Collections.sort(arrayList);
            boolean isEmpty2 = arrayList.isEmpty();
            list = arrayList;
            if (!isEmpty2) {
                this.f14225b.a(arrayList).b();
                list = arrayList;
            }
        }
        return list;
    }
}
