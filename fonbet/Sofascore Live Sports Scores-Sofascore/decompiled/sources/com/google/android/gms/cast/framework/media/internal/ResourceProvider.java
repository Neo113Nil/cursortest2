package com.google.android.gms.cast.framework.media.internal;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.sofascore.results.R;
import defpackage.ljg;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ResourceProvider {
    public static final Map a;

    static {
        HashMap hashMap = new HashMap();
        ljg.s(R.drawable.cast_ic_notification_small_icon, R.drawable.cast_ic_notification_stop_live_stream, "smallIconDrawableResId", "stopLiveStreamDrawableResId", hashMap);
        ljg.s(R.drawable.cast_ic_notification_pause, R.drawable.cast_ic_notification_play, "pauseDrawableResId", "playDrawableResId", hashMap);
        ljg.s(R.drawable.cast_ic_notification_skip_next, R.drawable.cast_ic_notification_skip_prev, "skipNextDrawableResId", "skipPrevDrawableResId", hashMap);
        ljg.s(R.drawable.cast_ic_notification_forward, R.drawable.cast_ic_notification_forward10, "forwardDrawableResId", "forward10DrawableResId", hashMap);
        ljg.s(R.drawable.cast_ic_notification_forward30, R.drawable.cast_ic_notification_rewind, "forward30DrawableResId", "rewindDrawableResId", hashMap);
        ljg.s(R.drawable.cast_ic_notification_rewind10, R.drawable.cast_ic_notification_rewind30, "rewind10DrawableResId", "rewind30DrawableResId", hashMap);
        ljg.s(R.drawable.cast_ic_notification_disconnect, R.dimen.cast_notification_image_size, "disconnectDrawableResId", "notificationImageSizeDimenResId", hashMap);
        ljg.s(R.string.cast_casting_to_device, R.string.cast_stop_live_stream, "castingToDeviceStringResId", "stopLiveStreamStringResId", hashMap);
        ljg.s(R.string.cast_pause, R.string.cast_play, "pauseStringResId", "playStringResId", hashMap);
        ljg.s(R.string.cast_skip_next, R.string.cast_skip_prev, "skipNextStringResId", "skipPrevStringResId", hashMap);
        ljg.s(R.string.cast_forward, R.string.cast_forward_10, "forwardStringResId", "forward10StringResId", hashMap);
        ljg.s(R.string.cast_forward_30, R.string.cast_rewind, "forward30StringResId", "rewindStringResId", hashMap);
        ljg.s(R.string.cast_rewind_10, R.string.cast_rewind_30, "rewind10StringResId", "rewind30StringResId", hashMap);
        hashMap.put("disconnectStringResId", Integer.valueOf(R.string.cast_disconnect));
        a = Collections.unmodifiableMap(hashMap);
    }

    @Nullable
    @Keep
    public static Integer findResourceByName(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return (Integer) a.get(str);
    }
}
