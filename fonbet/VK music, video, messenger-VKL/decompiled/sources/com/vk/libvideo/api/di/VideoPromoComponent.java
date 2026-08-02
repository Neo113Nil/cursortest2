package com.vk.libvideo.api.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.libvideo.api.di.VideoPromoComponent$Companion$STUB$1;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.g1;
import xsna.pwj0;
import xsna.u5e0;
import xsna.u9t0;

/* compiled from: VideoPromoComponent.kt */
/* loaded from: classes2.dex */
public interface VideoPromoComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: VideoPromoComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final VideoPromoComponent STUB = new VideoPromoComponent() { // from class: com.vk.libvideo.api.di.VideoPromoComponent$Companion$STUB$1
            public final a a = new a();

            /* compiled from: VideoPromoComponent.kt */
            public static final class a implements u5e0 {
            }

            /* compiled from: VideoPromoComponent.kt */
            public static final class b implements u9t0 {
                @Override // xsna.u9t0
                public final g1 a() {
                    return q.T(Boolean.FALSE);
                }

                @Override // xsna.u9t0
                public final g1 b() {
                    return q.T(Boolean.FALSE);
                }
            }

            @Override // com.vk.libvideo.api.di.VideoPromoComponent
            public final u9t0 L() {
                return new b();
            }

            @Override // com.vk.libvideo.api.di.VideoPromoComponent
            public final c jb() {
                return new c();
            }

            @Override // com.vk.libvideo.api.di.VideoPromoComponent
            public final a yf() {
                return this.a;
            }
        };

        public final VideoPromoComponent getSTUB() {
            return STUB;
        }
    }

    u9t0 L();

    c jb();

    VideoPromoComponent$Companion$STUB$1.a yf();
}
