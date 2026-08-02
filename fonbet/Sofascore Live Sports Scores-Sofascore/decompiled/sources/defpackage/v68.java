package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class v68 implements ew1 {
    public final g78 a;
    public final int b;
    public final b78 c = new b78();

    public v68(g78 g78Var, int i) {
        this.a = g78Var;
        this.b = i;
    }

    public final long a(ml6 ml6Var) {
        b78 b78Var;
        g78 g78Var;
        int a;
        while (true) {
            long peekPosition = ml6Var.getPeekPosition();
            long length = ml6Var.getLength() - 6;
            b78Var = this.c;
            g78Var = this.a;
            if (peekPosition >= length) {
                break;
            }
            long peekPosition2 = ml6Var.getPeekPosition();
            byte[] bArr = new byte[2];
            int i = 0;
            boolean r = false;
            ml6Var.peekFully(bArr, 0, 2);
            int i2 = ((bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            int i3 = this.b;
            if (i2 != i3) {
                ml6Var.resetPeekPosition();
                ml6Var.advancePeekPosition((int) (peekPosition2 - ml6Var.getPosition()));
            } else {
                nkk nkkVar = new nkk(16);
                System.arraycopy(bArr, 0, nkkVar.a, 0, 2);
                byte[] bArr2 = nkkVar.a;
                while (i < 14 && (a = ml6Var.a(2 + i, 14 - i, bArr2)) != -1) {
                    i += a;
                }
                nkkVar.D(i);
                ml6Var.resetPeekPosition();
                ml6Var.advancePeekPosition((int) (peekPosition2 - ml6Var.getPosition()));
                r = wkn.r(nkkVar, g78Var, i3, b78Var);
            }
            if (r) {
                break;
            }
            ml6Var.advancePeekPosition(1);
        }
        if (ml6Var.getPeekPosition() < ml6Var.getLength() - 6) {
            return b78Var.a;
        }
        ml6Var.advancePeekPosition((int) (ml6Var.getLength() - ml6Var.getPeekPosition()));
        return g78Var.k;
    }

    @Override // defpackage.ew1
    public final dw1 j(ml6 ml6Var, long j) {
        long position = ml6Var.getPosition();
        long a = a(ml6Var);
        long peekPosition = ml6Var.getPeekPosition();
        ml6Var.advancePeekPosition(Math.max(6, this.a.d));
        long a2 = a(ml6Var);
        return (a > j || a2 <= j) ? a2 <= j ? new dw1(-2, 0, a2, ml6Var.getPeekPosition()) : new dw1(-1, 0, a, position) : new dw1(0, 0, C.TIME_UNSET, peekPosition);
    }
}
