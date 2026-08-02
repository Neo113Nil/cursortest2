package com.vk.libvideo.api.di;

import android.app.Activity;
import com.vk.di.component.DiScopedComponent;
import com.vk.dto.common.VideoFile;
import xsna.a2f;
import xsna.fh5;
import xsna.pwj0;
import xsna.y1f;
import xsna.z1f;

/* compiled from: AutoPlayDelegateComponent.kt */
/* loaded from: classes.dex */
public interface AutoPlayDelegateComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: AutoPlayDelegateComponent.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final AutoPlayDelegateComponent STUB = new AutoPlayDelegateComponent() { // from class: com.vk.libvideo.api.di.AutoPlayDelegateComponent$Companion$STUB$1
            @Override // com.vk.libvideo.api.di.AutoPlayDelegateComponent
            public final a2f Y9() {
                return new a();
            }

            /* compiled from: AutoPlayDelegateComponent.kt */
            public static final class a implements a2f {
                @Override // xsna.a2f
                public final y1f a(boolean z, boolean z2) {
                    return new C1197a();
                }

                /* compiled from: AutoPlayDelegateComponent.kt */
                /* renamed from: com.vk.libvideo.api.di.AutoPlayDelegateComponent$Companion$STUB$1$a$a, reason: collision with other inner class name */
                public static final class C1197a implements y1f {
                    @Override // xsna.y1f
                    public final void b(z1f z1fVar) {
                    }

                    @Override // xsna.y1f
                    public final void a(Activity activity, String str, VideoFile videoFile, fh5 fh5Var) {
                    }
                }
            }
        };

        public final AutoPlayDelegateComponent getSTUB() {
            return STUB;
        }
    }

    a2f Y9();
}
