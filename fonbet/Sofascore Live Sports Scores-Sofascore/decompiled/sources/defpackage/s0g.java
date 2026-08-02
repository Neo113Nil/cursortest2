package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class s0g extends u01 {
    @Override // defpackage.u01
    public final go0 b(go0 go0Var) {
        int i = go0Var.c;
        if (i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4) {
            return i != 2 ? new go0(go0Var.a, go0Var.b, 2) : go0.e;
        }
        throw new jo0(go0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa A[ADDED_TO_REGION, LOOP:4: B:33:0x00aa->B:34:0x00ac, LOOP_START, PHI: r0
      0x00aa: PHI (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:12:0x0034, B:34:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.lo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void queueInput(ByteBuffer byteBuffer) {
        int i;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.b.c;
        if (i3 != 3) {
            if (i3 != 4) {
                if (i3 != 268435456) {
                    if (i3 == 536870912) {
                        i2 /= 3;
                    } else if (i3 != 805306368) {
                        zzl.s();
                        return;
                    }
                }
                ByteBuffer f = f(i2);
                i = this.b.c;
                if (i == 3) {
                    while (position < limit) {
                        f.put((byte) 0);
                        f.put((byte) ((byteBuffer.get(position) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) - 128));
                        position++;
                    }
                } else if (i == 4) {
                    while (position < limit) {
                        short g = (short) (lik.g(byteBuffer.getFloat(position), -1.0f, 1.0f) * 32767.0f);
                        f.put((byte) (g & 255));
                        f.put((byte) ((g >> 8) & 255));
                        position += 4;
                    }
                } else if (i == 268435456) {
                    while (position < limit) {
                        f.put(byteBuffer.get(position + 1));
                        f.put(byteBuffer.get(position));
                        position += 2;
                    }
                } else if (i == 536870912) {
                    while (position < limit) {
                        f.put(byteBuffer.get(position + 1));
                        f.put(byteBuffer.get(position + 2));
                        position += 3;
                    }
                } else {
                    if (i != 805306368) {
                        zzl.s();
                        return;
                    }
                    while (position < limit) {
                        f.put(byteBuffer.get(position + 2));
                        f.put(byteBuffer.get(position + 3));
                        position += 4;
                    }
                }
                byteBuffer.position(byteBuffer.limit());
                f.flip();
            }
            i2 /= 2;
            ByteBuffer f2 = f(i2);
            i = this.b.c;
            if (i == 3) {
            }
            byteBuffer.position(byteBuffer.limit());
            f2.flip();
        }
        i2 *= 2;
        ByteBuffer f22 = f(i2);
        i = this.b.c;
        if (i == 3) {
        }
        byteBuffer.position(byteBuffer.limit());
        f22.flip();
    }
}
