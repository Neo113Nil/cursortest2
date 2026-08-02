package defpackage;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Hex;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ivo implements Callable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ String b;
    public final /* synthetic */ pto c;

    public /* synthetic */ ivo(boolean z, String str, pto ptoVar) {
        this.a = z;
        this.b = str;
        this.c = ptoVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MessageDigest messageDigest;
        int i = 0;
        boolean z = this.a;
        String str = this.b;
        pto ptoVar = this.c;
        String str2 = (z || !rzo.b(str, ptoVar, true, false).a) ? "not allowed" : "debug cert rejected";
        while (true) {
            if (i >= 2) {
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
            i++;
        }
        Preconditions.i(messageDigest);
        StringBuilder s = mz1.s(str2, ": pkg=", str, ", sha256=", Hex.a(messageDigest.digest(ptoVar.c)));
        s.append(", atk=");
        s.append(z);
        s.append(", ver=12451000.false");
        return s.toString();
    }
}
