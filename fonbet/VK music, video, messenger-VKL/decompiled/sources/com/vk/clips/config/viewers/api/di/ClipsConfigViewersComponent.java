package com.vk.clips.config.viewers.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.hpf;
import xsna.pwj0;
import xsna.zof;

/* compiled from: ClipsConfigViewersComponent.kt */
/* loaded from: classes.dex */
public interface ClipsConfigViewersComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: ClipsConfigViewersComponent.kt */
    /* loaded from: classes16.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final ClipsConfigViewersComponent STUB = new ClipsConfigViewersComponent() { // from class: com.vk.clips.config.viewers.api.di.ClipsConfigViewersComponent$Companion$STUB$1
            public final hpf a = hpf.b;

            @Override // com.vk.clips.config.viewers.api.di.ClipsConfigViewersComponent
            public final zof getExperiments() {
                return this.a;
            }
        };

        public final ClipsConfigViewersComponent getSTUB() {
            return STUB;
        }
    }

    zof getExperiments();
}
