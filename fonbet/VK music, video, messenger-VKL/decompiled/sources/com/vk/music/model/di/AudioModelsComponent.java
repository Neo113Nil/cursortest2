package com.vk.music.model.di;

import com.vk.di.component.DiScopedComponent;
import xsna.fa40;
import xsna.pwj0;
import xsna.u2b0;
import xsna.wgp;

/* compiled from: AudioModelsComponent.kt */
/* loaded from: classes.dex */
public interface AudioModelsComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: AudioModelsComponent.kt */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final AudioModelsComponent STUB = new AudioModelsComponent() { // from class: com.vk.music.model.di.AudioModelsComponent$Companion$STUB$1
            public final wgp a;
            public final wgp b;
            public final fa40 c;

            {
                u2b0.a aVar = u2b0.a;
                this.a = aVar.getSTUB();
                this.b = aVar.getSTUB();
                this.c = fa40.a.a.getSTUB();
            }

            @Override // com.vk.music.model.di.AudioModelsComponent
            public final fa40 P1() {
                return this.c;
            }

            @Override // com.vk.music.model.di.AudioModelsComponent
            public final u2b0 r() {
                return this.a;
            }

            @Override // com.vk.music.model.di.AudioModelsComponent
            public final u2b0 s8() {
                return this.b;
            }
        };

        public final AudioModelsComponent getSTUB() {
            return STUB;
        }
    }

    fa40 P1();

    u2b0 r();

    u2b0 s8();
}
