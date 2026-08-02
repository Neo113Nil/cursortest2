package defpackage;

import android.util.Base64;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class tr4 implements tmi {
    public final /* synthetic */ int a;

    @Override // defpackage.tmi
    public final Object get() {
        switch (this.a) {
            case 0:
                byte[] bArr = new byte[12];
                wr4.h.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 1:
                byte[] bArr2 = new byte[12];
                xr4.i.nextBytes(bArr2);
                return Base64.encodeToString(bArr2, 10);
            case 2:
                return new xq4();
            case 3:
                return new yq4(new zz0(5), DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, 1000, DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, 1000, 1000, 2000, 1000, false, true, 0, false, awf.g);
            case 4:
                try {
                    return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                } catch (Exception e) {
                    yhk.q(e);
                    return null;
                }
            default:
                throw new IllegalStateException();
        }
    }
}
