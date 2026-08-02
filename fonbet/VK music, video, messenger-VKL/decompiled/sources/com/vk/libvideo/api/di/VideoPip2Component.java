package com.vk.libvideo.api.di;

import android.content.Intent;
import com.vk.di.component.DiScopedComponent;
import com.vk.libvideo.api.pip2.VideoPipModeAction;
import com.vk.libvideo.api.pip2.a;
import io.reactivex.rxjava3.subjects.f;
import xsna.c5b0;
import xsna.n3t0;
import xsna.pwj0;

/* compiled from: VideoPip2Component.kt */
/* loaded from: classes.dex */
public interface VideoPip2Component extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: VideoPip2Component.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final VideoPip2Component STUB = new VideoPip2Component() { // from class: com.vk.libvideo.api.di.VideoPip2Component$Companion$STUB$1
            public final a a = new a();
            public final f<n3t0> b = new f<>();
            public final f<VideoPipModeAction> c = new f<>();

            /* compiled from: VideoPip2Component.kt */
            public static final class a implements c5b0 {
                @Override // xsna.c5b0
                public final boolean a(Intent intent) {
                    return false;
                }
            }

            @Override // com.vk.libvideo.api.di.VideoPip2Component
            public final f<n3t0> L3() {
                return this.b;
            }

            @Override // com.vk.libvideo.api.di.VideoPip2Component
            public final f<VideoPipModeAction> Lb() {
                return this.c;
            }

            @Override // com.vk.libvideo.api.di.VideoPip2Component
            public final c5b0 N5() {
                return this.a;
            }

            @Override // com.vk.libvideo.api.di.VideoPip2Component
            public final com.vk.libvideo.api.pip2.a sd() {
                return a.C1198a.a;
            }
        };

        public final VideoPip2Component getSTUB() {
            return STUB;
        }
    }

    f<n3t0> L3();

    f<VideoPipModeAction> Lb();

    c5b0 N5();

    com.vk.libvideo.api.pip2.a sd();
}
