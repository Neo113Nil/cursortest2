package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class w68 implements fw1 {
    public final g78 a;
    public final int b;
    public final b78 c = new b78();

    public w68(g78 g78Var, int i) {
        this.a = g78Var;
        this.b = i;
    }

    @Override // defpackage.fw1
    public final dw1 a(nl6 nl6Var, long j) {
        long position = nl6Var.getPosition();
        long b = b(nl6Var);
        long peekPosition = nl6Var.getPeekPosition();
        nl6Var.advancePeekPosition(Math.max(6, this.a.d));
        long b2 = b(nl6Var);
        return (b > j || b2 <= j) ? b2 <= j ? new dw1(-2, 1, b2, nl6Var.getPeekPosition()) : new dw1(-1, 1, b, position) : new dw1(0, 1, C.TIME_UNSET, peekPosition);
    }

    public final long b(nl6 nl6Var) {
        b78 b78Var;
        g78 g78Var;
        int a;
        while (true) {
            long peekPosition = nl6Var.getPeekPosition();
            long length = nl6Var.getLength() - 6;
            b78Var = this.c;
            g78Var = this.a;
            if (peekPosition >= length) {
                break;
            }
            long peekPosition2 = nl6Var.getPeekPosition();
            j9e j9eVar = new j9e(17);
            int i = 0;
            boolean z = false;
            nl6Var.peekFully(j9eVar.a, 0, 2);
            char g = j9eVar.g(0, ByteOrder.BIG_ENDIAN);
            int i2 = this.b;
            if (g != i2) {
                nl6Var.resetPeekPosition();
                nl6Var.advancePeekPosition((int) (peekPosition2 - nl6Var.getPosition()));
            } else {
                byte[] bArr = j9eVar.a;
                while (i < 15 && (a = nl6Var.a(2 + i, 15 - i, bArr)) != -1) {
                    i += a;
                }
                j9eVar.M(i + 2);
                nl6Var.resetPeekPosition();
                nl6Var.advancePeekPosition((int) (peekPosition2 - nl6Var.getPosition()));
                z = wnn.z(j9eVar, g78Var, i2, b78Var);
            }
            if (z) {
                break;
            }
            nl6Var.advancePeekPosition(1);
        }
        if (nl6Var.getPeekPosition() < nl6Var.getLength() - 6) {
            return b78Var.a;
        }
        nl6Var.advancePeekPosition((int) (nl6Var.getLength() - nl6Var.getPeekPosition()));
        return g78Var.k;
    }
}
