package defpackage;

import android.os.Build;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class m62 {
    public static /* synthetic */ int a() {
        int i = Build.VERSION.SDK_INT;
        return i < 36 ? i * DefaultOggSeeker.MATCH_BYTE_RANGE : Build.VERSION.SDK_INT_FULL;
    }
}
