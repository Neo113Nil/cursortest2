package c6;

import g6.v;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f3679a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3680b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f3681c;

    public /* synthetic */ n(boolean z5, String str, m mVar) {
        this.f3679a = z5;
        this.f3680b = str;
        this.f3681c = mVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MessageDigest messageDigest;
        boolean z5 = this.f3679a;
        String str = this.f3680b;
        m mVar = this.f3681c;
        String str2 = (z5 || !p.c(str, mVar, true, false).f3692a) ? "not allowed" : "debug cert rejected";
        int i5 = 0;
        while (true) {
            if (i5 >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                break;
            }
            i5++;
        }
        v.h(messageDigest);
        byte[] digest = messageDigest.digest(mVar.f3678h);
        int length = digest.length;
        char[] cArr = new char[length + length];
        int i10 = 0;
        for (byte b10 : digest) {
            char[] cArr2 = q6.b.f22041b;
            cArr[i10] = cArr2[(b10 & 255) >>> 4];
            cArr[i10 + 1] = cArr2[b10 & 15];
            i10 += 2;
        }
        return str2 + ": pkg=" + str + ", sha256=" + new String(cArr) + ", atk=" + z5 + ", ver=12451000.false";
    }
}
