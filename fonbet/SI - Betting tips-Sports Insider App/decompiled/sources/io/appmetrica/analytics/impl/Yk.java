package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Yk {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0270k2 f13238a;

    public Yk(InterfaceC0270k2 interfaceC0270k2) {
        this.f13238a = interfaceC0270k2;
    }

    public final ArrayList a(Iterable iterable) {
        String str;
        String a7;
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            try {
                a7 = this.f13238a.a(str2);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (a7 == null || (str = StringUtils.toHexString(MessageDigest.getInstance("SHA-256").digest(a7.getBytes(Charsets.UTF_8)))) == null) {
                PublicLogger.INSTANCE.getAnonymousInstance().info("Input " + str2 + " is not a valid data", new Object[0]);
                str = null;
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
