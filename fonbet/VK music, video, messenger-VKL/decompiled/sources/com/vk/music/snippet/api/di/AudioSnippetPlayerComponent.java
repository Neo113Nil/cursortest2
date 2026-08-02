package com.vk.music.snippet.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.gck0;
import xsna.pwj0;

/* compiled from: AudioSnippetPlayerComponent.kt */
/* loaded from: classes.dex */
public interface AudioSnippetPlayerComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: AudioSnippetPlayerComponent.kt */
    /* loaded from: classes3.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final AudioSnippetPlayerComponent STUB = new AudioSnippetPlayerComponent() { // from class: com.vk.music.snippet.api.di.AudioSnippetPlayerComponent$Companion$STUB$1
            public final gck0 a = gck0.a.a.getSTUB();

            @Override // com.vk.music.snippet.api.di.AudioSnippetPlayerComponent
            public final gck0 U2() {
                return this.a;
            }
        };

        public final AudioSnippetPlayerComponent getSTUB() {
            return STUB;
        }
    }

    gck0 U2();
}
