package com.vk.catalog.mvi.section.screen.impl.ui;

import com.vk.movika.sdk.base.ui.CoreInteractivePlayer$getIntents$$inlined$filterIsInstance$1$2;
import com.vk.video.playlist.playlistscreen.ui.view.PlaylistScreenLoadedContentViewKt$PlaylistScreenLoadedContentView_TnXJ0yg$lambda$6$lambda$5$lambda$4$$inlined$map$1$2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import xsna.ksr;
import xsna.lsr;
import xsna.nb9;
import xsna.s3q0;
import xsna.spj;

/* compiled from: SafeCollector.common.kt */
/* loaded from: classes16.dex */
public final class c implements ksr {
    public final /* synthetic */ int b;
    public final /* synthetic */ ksr c;

    public /* synthetic */ c(ksr ksrVar, int i) {
        this.b = i;
        this.c = ksrVar;
    }

    @Override // xsna.ksr
    public final Object collect(lsr lsrVar, spj spjVar) {
        switch (this.b) {
            case 0:
                Object collect = ((CatalogSectionScreenFragment$ScreenContent$lambda$16$lambda$15$lambda$13$$inlined$filterIsInstance$1) this.c).collect(new CatalogSectionScreenFragment$ScreenContent$lambda$16$lambda$15$lambda$13$$inlined$map$1$2(lsrVar), spjVar);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object collect2 = ((nb9) this.c).collect(new CoreInteractivePlayer$getIntents$$inlined$filterIsInstance$1$2(lsrVar), spjVar);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect3 = this.c.collect(new PlaylistScreenLoadedContentViewKt$PlaylistScreenLoadedContentView_TnXJ0yg$lambda$6$lambda$5$lambda$4$$inlined$map$1$2(lsrVar), spjVar);
                if (collect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return s3q0.a;
    }
}
