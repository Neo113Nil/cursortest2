package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.AdPlayer;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.s3q0;
import xsna.spj;

/* compiled from: FullscreenAdPlayer.kt */
/* loaded from: classes14.dex */
public interface FullscreenAdPlayer extends AdPlayer {

    /* compiled from: FullscreenAdPlayer.kt */
    public static final class DefaultImpls {
        public static Object destroy(FullscreenAdPlayer fullscreenAdPlayer, spj<? super s3q0> spjVar) {
            Object destroy = AdPlayer.DefaultImpls.destroy(fullscreenAdPlayer, spjVar);
            return destroy == CoroutineSingletons.COROUTINE_SUSPENDED ? destroy : s3q0.a;
        }

        public static void show(FullscreenAdPlayer fullscreenAdPlayer, ShowOptions showOptions) {
            AdPlayer.DefaultImpls.show(fullscreenAdPlayer, showOptions);
        }
    }
}
