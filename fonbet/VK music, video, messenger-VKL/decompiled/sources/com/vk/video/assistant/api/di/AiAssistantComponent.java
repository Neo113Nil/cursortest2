package com.vk.video.assistant.api.di;

import com.vk.di.component.DiUnscopedComponent;
import xsna.b7m;
import xsna.e7m;
import xsna.lc1;
import xsna.mc1;
import xsna.nc1;

/* compiled from: AiAssistantComponent.kt */
/* loaded from: classes5.dex */
public interface AiAssistantComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: AiAssistantComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final AiAssistantComponent STUB = new AiAssistantComponent() { // from class: com.vk.video.assistant.api.di.AiAssistantComponent$Companion$STUB$1
            public final lc1 a = lc1.a.a.getSTUB();
            public final nc1 b = nc1.a.a.getSTUB();
            public final mc1 c = mc1.a.a.getSTUB();

            @Override // com.vk.video.assistant.api.di.AiAssistantComponent
            public final lc1 Sd() {
                return this.a;
            }

            @Override // com.vk.video.assistant.api.di.AiAssistantComponent
            public final nc1 a() {
                return this.b;
            }

            @Override // com.vk.video.assistant.api.di.AiAssistantComponent
            public final mc1 b() {
                return this.c;
            }
        };

        public final AiAssistantComponent getSTUB() {
            return STUB;
        }
    }

    /* compiled from: AiAssistantComponent.kt */
    public static final class a implements b7m<AiAssistantComponent> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return AiAssistantComponent.Companion.getSTUB();
        }
    }

    lc1 Sd();

    nc1 a();

    mc1 b();
}
