package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import com.unity3d.services.UnityAdsConstants;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class b88 extends u01 {
    public static final int i = Float.floatToIntBits(Float.NaN);

    @Override // defpackage.u01
    public final go0 b(go0 go0Var) {
        int i2 = go0Var.c;
        if (i2 == 536870912 || i2 == 805306368 || i2 == 4) {
            return i2 != 4 ? new go0(go0Var.a, go0Var.b, 4) : go0.e;
        }
        throw new jo0(go0Var);
    }

    @Override // defpackage.lo0
    public final void queueInput(ByteBuffer byteBuffer) {
        ByteBuffer f;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.b.c;
        int i4 = i;
        if (i3 == 536870912) {
            f = f((i2 / 3) * 4);
            while (position < limit) {
                int floatToIntBits = Float.floatToIntBits((float) ((((byteBuffer.get(position) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((byteBuffer.get(position + 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get(position + 2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24)) * 4.656612875245797E-10d));
                if (floatToIntBits == i4) {
                    floatToIntBits = Float.floatToIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                f.putInt(floatToIntBits);
                position += 3;
            }
        } else {
            if (i3 != 805306368) {
                zzl.s();
                return;
            }
            f = f(i2);
            while (position < limit) {
                int floatToIntBits2 = Float.floatToIntBits((float) (((byteBuffer.get(position) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((byteBuffer.get(position + 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((byteBuffer.get(position + 2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get(position + 3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24)) * 4.656612875245797E-10d));
                if (floatToIntBits2 == i4) {
                    floatToIntBits2 = Float.floatToIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                f.putInt(floatToIntBits2);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        f.flip();
    }
}
