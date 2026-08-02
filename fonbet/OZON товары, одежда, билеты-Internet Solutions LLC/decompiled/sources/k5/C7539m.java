package k5;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;
import k5.InterfaceC7518g2;

/* renamed from: k5.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C7539m extends InterfaceC7518g2.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C7543n f70781a;

    C7539m(C7543n c7543n) {
        this.f70781a = c7543n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FileInputStream fileInputStream;
        Callable callable = new Callable() { // from class: k5.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context;
                Context context2;
                C7543n c7543n = C7539m.this.f70781a;
                try {
                    context = c7543n.f70787e;
                    PackageManager packageManager = context.getPackageManager();
                    context2 = c7543n.f70787e;
                    return new File(packageManager.getPackageInfo(context2.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN).applicationInfo.sourceDir);
                } catch (PackageManager.NameNotFoundException unused) {
                    return null;
                }
            }
        };
        C7543n c7543n = this.f70781a;
        File file = (File) c7543n.n(callable);
        if (file == null) {
            return;
        }
        String str = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (IOException | NoSuchAlgorithmException unused) {
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_ALL];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    break;
                } else {
                    messageDigest.update(bArr, 0, read);
                }
            }
            byte[] digest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            for (byte b11 : digest) {
                StringBuilder sb3 = new StringBuilder(Integer.toHexString(b11 & 255));
                while (sb3.length() < 2) {
                    sb3.insert(0, "0");
                }
                sb2.append((CharSequence) sb3);
            }
            str = sb2.toString();
            fileInputStream.close();
            c7543n.a(str);
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
