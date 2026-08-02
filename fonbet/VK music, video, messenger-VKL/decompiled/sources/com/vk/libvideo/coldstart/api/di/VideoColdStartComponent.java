package com.vk.libvideo.coldstart.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.c8m;
import xsna.g8m;
import xsna.n1s0;
import xsna.pwj0;

/* compiled from: VideoColdStartComponent.kt */
/* loaded from: classes2.dex */
public interface VideoColdStartComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: VideoColdStartComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final VideoColdStartComponent STUB = new VideoColdStartComponent() { // from class: com.vk.libvideo.coldstart.api.di.VideoColdStartComponent$Companion$STUB$1
            public final n1s0 a = n1s0.a.getSTUB();

            @Override // com.vk.libvideo.coldstart.api.di.VideoColdStartComponent
            public final n1s0 Eb() {
                return this.a;
            }
        };

        public final VideoColdStartComponent getSTUB() {
            return STUB;
        }
    }

    /* compiled from: VideoColdStartComponent.kt */
    public static final class a implements c8m<VideoColdStartComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return VideoColdStartComponent.Companion.getSTUB();
        }
    }

    n1s0 Eb();
}
