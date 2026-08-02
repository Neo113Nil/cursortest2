package com.plaid.internal;

import android.app.Application;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.util.Base64;
import com.plaid.internal.C3556a6;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.plaid.internal.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3622f {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList<String> f40589a;

    /* renamed from: com.plaid.internal.f$a */
    public static final class a {
        public static String a(String str, String str2) {
            String str3 = str + " " + str2;
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                Charset UTF_8 = StandardCharsets.UTF_8;
                Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                byte[] bytes = str3.getBytes(UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                messageDigest.update(bytes);
                String encodeToString = Base64.encodeToString(Arrays.copyOfRange(messageDigest.digest(), 0, 9), 3);
                Intrinsics.checkNotNull(encodeToString);
                String substring = encodeToString.substring(0, 11);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                return substring;
            } catch (NoSuchAlgorithmException e10) {
                C3556a6.a.b(C3556a6.f39823a, "hash:NoSuchAlgorithm", new Object[]{e10});
                return null;
            }
        }
    }

    @Nullable
    public final String a(@NotNull Application application) {
        SigningInfo signingInfo;
        Signature[] apkContentsSigners;
        Intrinsics.checkNotNullParameter(application, "application");
        ArrayList<String> arrayList = null;
        if (this.f40589a == null) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            try {
                String packageName = application.getPackageName();
                PackageManager packageManager = application.getPackageManager();
                if (Build.VERSION.SDK_INT < 28) {
                    apkContentsSigners = packageManager.getPackageInfo(packageName, 64).signatures;
                } else {
                    signingInfo = packageManager.getPackageInfo(packageName, 134217728).signingInfo;
                    apkContentsSigners = signingInfo != null ? signingInfo.getApkContentsSigners() : null;
                }
                if (apkContentsSigners != null) {
                    Iterator it = ArrayIteratorKt.iterator(apkContentsSigners);
                    while (it.hasNext()) {
                        Signature signature = (Signature) it.next();
                        Intrinsics.checkNotNull(packageName);
                        String charsString = signature.toCharsString();
                        Intrinsics.checkNotNullExpressionValue(charsString, "toCharsString(...)");
                        String a10 = a.a(packageName, charsString);
                        if (a10 != null) {
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            String format = String.format("%s", Arrays.copyOf(new Object[]{a10}, 1));
                            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                            arrayList2.add(format);
                        }
                    }
                }
                this.f40589a = arrayList2;
            } catch (PackageManager.NameNotFoundException e10) {
                Object[] args = {e10};
                C3556a6.f39823a.getClass();
                Intrinsics.checkNotNullParameter(args, "args");
                C3556a6.f39824b.a("Unable to find package to obtain hash.", new Object[]{args}, true);
            }
        }
        ArrayList<String> arrayList3 = this.f40589a;
        if (arrayList3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("appSignatures");
        } else {
            arrayList = arrayList3;
        }
        return (String) CollectionsKt.firstOrNull((List) arrayList);
    }
}
