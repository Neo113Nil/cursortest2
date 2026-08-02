package com.vk.music.snippet.api.di;

import com.vk.di.component.DiUnscopedComponent;
import xsna.lx4;

/* compiled from: AudioSnippetComponent.kt */
/* loaded from: classes3.dex */
public interface AudioSnippetComponent extends DiUnscopedComponent {
    public static final Companion Companion = Companion.a;

    /* compiled from: AudioSnippetComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final AudioSnippetComponent STUB = new AudioSnippetComponent() { // from class: com.vk.music.snippet.api.di.AudioSnippetComponent$Companion$STUB$1
            public final lx4 a = lx4.a.a.getSTUB();

            @Override // com.vk.music.snippet.api.di.AudioSnippetComponent
            public final lx4 H3() {
                return this.a;
            }
        };

        public final AudioSnippetComponent getSTUB() {
            return STUB;
        }
    }

    lx4 H3();
}
