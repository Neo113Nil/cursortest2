package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.AdPlayer;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.s3q0;
import xsna.spj;

/* compiled from: EmbeddableAdPlayer.kt */
/* loaded from: classes14.dex */
public interface EmbeddableAdPlayer extends AdPlayer {

    /* compiled from: EmbeddableAdPlayer.kt */
    public static final class DefaultImpls {
        public static Object destroy(EmbeddableAdPlayer embeddableAdPlayer, spj<? super s3q0> spjVar) {
            Object destroy = AdPlayer.DefaultImpls.destroy(embeddableAdPlayer, spjVar);
            return destroy == CoroutineSingletons.COROUTINE_SUSPENDED ? destroy : s3q0.a;
        }

        public static void show(EmbeddableAdPlayer embeddableAdPlayer, ShowOptions showOptions) {
            AdPlayer.DefaultImpls.show(embeddableAdPlayer, showOptions);
        }
    }
}
