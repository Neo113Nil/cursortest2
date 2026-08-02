package defpackage;

import com.blaze.blazesdk.style.players.BlazeSeekBarStyle;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerSeekBarStyle;
import com.blaze.blazesdk.style.shared.models.BlazeDp;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class rtl {
    public static BlazeVideosPlayerSeekBarStyle a() {
        BlazeDp blazeDp = new BlazeDp(0);
        BlazeDp blazeDp2 = new BlazeDp(8);
        int i = l1m.k;
        int i2 = l1m.l;
        return new BlazeVideosPlayerSeekBarStyle(true, blazeDp, blazeDp2, new BlazeSeekBarStyle(true, i, i2, new BlazeDp(2), i2, null, false, new BlazeDp(4), new BlazeDp(8)), new BlazeSeekBarStyle(true, i, i2, new BlazeDp(4), i2, null, true, new BlazeDp(8), new BlazeDp(14)));
    }
}
