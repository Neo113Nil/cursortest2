package com.vk.clips.config.authors.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.mhd;
import xsna.ohd;
import xsna.pwj0;

/* compiled from: ClipsConfigAuthorsComponent.kt */
/* loaded from: classes.dex */
public interface ClipsConfigAuthorsComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: ClipsConfigAuthorsComponent.kt */
    /* loaded from: classes16.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final ClipsConfigAuthorsComponent STUB = new ClipsConfigAuthorsComponent() { // from class: com.vk.clips.config.authors.api.di.ClipsConfigAuthorsComponent$Companion$STUB$1
            public final ohd a = ohd.a;

            @Override // com.vk.clips.config.authors.api.di.ClipsConfigAuthorsComponent
            public final mhd getExperiments() {
                return this.a;
            }
        };

        public final ClipsConfigAuthorsComponent getSTUB() {
            return STUB;
        }
    }

    mhd getExperiments();
}
