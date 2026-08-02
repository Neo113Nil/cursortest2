package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import com.unity3d.services.UnityAdsConstants;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class njj extends v01 {
    public static final int i = Float.floatToIntBits(Float.NaN);

    public static void i(int i2, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i2 * 4.656612875245797E-10d));
        if (floatToIntBits == i) {
            floatToIntBits = Float.floatToIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // defpackage.v01
    public final ho0 d(ho0 ho0Var) {
        int i2 = ho0Var.c;
        if (nik.O(i2) || i2 == 2) {
            return i2 != 4 ? new ho0(ho0Var.a, ho0Var.b, 4) : ho0.e;
        }
        throw new ko0(ho0Var);
    }

    @Override // defpackage.mo0
    public final void queueInput(ByteBuffer byteBuffer) {
        ByteBuffer h;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.b.c;
        if (i3 == 2) {
            h = h(i2 * 2);
            while (position < limit) {
                i(((byteBuffer.get(position) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get(position + 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24), h);
                position += 2;
            }
        } else if (i3 == 1342177280) {
            h = h((i2 / 3) * 4);
            while (position < limit) {
                i(((byteBuffer.get(position + 2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((byteBuffer.get(position + 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get(position) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24), h);
                position += 3;
            }
        } else if (i3 == 1610612736) {
            h = h(i2);
            while (position < limit) {
                i((byteBuffer.get(position + 3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((byteBuffer.get(position + 2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((byteBuffer.get(position + 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get(position) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24), h);
                position += 4;
            }
        } else if (i3 == 1879048192) {
            h = h(i2 / 2);
            while (position < limit) {
                h.putFloat((float) byteBuffer.getDouble(position));
                position += 8;
            }
        } else if (i3 == 21) {
            h = h((i2 / 3) * 4);
            while (position < limit) {
                i(((byteBuffer.get(position) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((byteBuffer.get(position + 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get(position + 2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24), h);
                position += 3;
            }
        } else {
            if (i3 != 22) {
                zzl.s();
                return;
            }
            h = h(i2);
            while (position < limit) {
                i((byteBuffer.get(position) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((byteBuffer.get(position + 1) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((byteBuffer.get(position + 2) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((byteBuffer.get(position + 3) & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24), h);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        h.flip();
    }
}
