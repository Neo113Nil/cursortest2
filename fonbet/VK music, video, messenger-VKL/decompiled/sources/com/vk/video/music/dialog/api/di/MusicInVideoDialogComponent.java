package com.vk.video.music.dialog.api.di;

import com.vk.di.component.DiUnscopedComponent;
import xsna.a44;
import xsna.asf0;
import xsna.bsf0;
import xsna.fyd0;
import xsna.l7s;
import xsna.v0s0;
import xsna.wbb0;
import xsna.yus0;

/* compiled from: MusicInVideoDialogComponent.kt */
/* loaded from: classes6.dex */
public interface MusicInVideoDialogComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: MusicInVideoDialogComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final MusicInVideoDialogComponent$Companion$STUB$1 STUB = new MusicInVideoDialogComponent() { // from class: com.vk.video.music.dialog.api.di.MusicInVideoDialogComponent$Companion$STUB$1
            @Override // com.vk.video.music.dialog.api.di.MusicInVideoDialogComponent
            public final bsf0 I7(l7s l7sVar, wbb0 wbb0Var, v0s0 v0s0Var) {
                return new a();
            }

            @Override // com.vk.video.music.dialog.api.di.MusicInVideoDialogComponent
            public final bsf0 J1(l7s l7sVar, asf0 asf0Var, fyd0 fyd0Var, yus0 yus0Var, a44 a44Var) {
                return new b();
            }
        };
    }

    bsf0 I7(l7s l7sVar, wbb0 wbb0Var, v0s0 v0s0Var);

    bsf0 J1(l7s l7sVar, asf0 asf0Var, fyd0 fyd0Var, yus0 yus0Var, a44 a44Var);
}
