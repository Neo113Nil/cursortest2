package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.AdPlayer;
import defpackage.lu3;
import defpackage.rq3;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/unity3d/ads/adplayer/FullscreenAdPlayer;", "Lcom/unity3d/ads/adplayer/AdPlayer;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FullscreenAdPlayer extends AdPlayer {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static Object destroy(@NotNull FullscreenAdPlayer fullscreenAdPlayer, @NotNull rq3<? super Unit> rq3Var) {
            Object destroy = AdPlayer.DefaultImpls.destroy(fullscreenAdPlayer, rq3Var);
            return destroy == lu3.a ? destroy : Unit.a;
        }

        public static void show(@NotNull FullscreenAdPlayer fullscreenAdPlayer, @NotNull ShowOptions showOptions) {
            showOptions.getClass();
            AdPlayer.DefaultImpls.show(fullscreenAdPlayer, showOptions);
        }
    }
}
