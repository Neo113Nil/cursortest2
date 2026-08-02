package defpackage;

import java.security.MessageDigest;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class s79 extends jn8 {
    public final MessageDigest b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s79(fx1 fx1Var) {
        super(fx1Var);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.getClass();
        this.b = messageDigest;
    }

    @Override // defpackage.jn8, defpackage.ejh
    public final void W(x52 x52Var, long j) {
        x52Var.getClass();
        yqo.x(x52Var.b, 0L, j);
        b1h b1hVar = x52Var.a;
        b1hVar.getClass();
        long j2 = 0;
        while (j2 < j) {
            int min = (int) Math.min(j - j2, b1hVar.c - b1hVar.b);
            this.b.update(b1hVar.a, b1hVar.b, min);
            j2 += min;
            b1hVar = b1hVar.f;
            b1hVar.getClass();
        }
        this.a.W(x52Var, j);
    }
}
