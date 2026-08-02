package com.vk.libvideo.api.di;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.vk.di.component.DiScopedComponent;
import com.vk.dto.common.VideoUrl;
import java.util.Set;
import kotlin.collections.EmptySet;
import one.video.player.OneVideoPlayer;
import xsna.bes0;
import xsna.ces0;
import xsna.fes0;
import xsna.pwj0;

/* compiled from: DebugComponent.kt */
/* loaded from: classes2.dex */
public interface DebugComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: DebugComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final DebugComponent STUB = new DebugComponent() { // from class: com.vk.libvideo.api.di.DebugComponent$Companion$STUB$1

            /* compiled from: DebugComponent.kt */
            public static final class b implements bes0 {
                @Override // xsna.bes0
                public final boolean a() {
                    return false;
                }

                @Override // xsna.bes0
                public final Integer b() {
                    return null;
                }

                @Override // xsna.bes0
                public final Set<VideoUrl> c() {
                    return EmptySet.b;
                }

                @Override // xsna.bes0
                public final boolean d() {
                    return false;
                }

                @Override // xsna.bes0
                public final boolean e() {
                    return false;
                }

                @Override // xsna.bes0
                public final boolean f() {
                    return false;
                }

                @Override // xsna.bes0
                public final boolean g() {
                    return false;
                }

                @Override // xsna.bes0
                public final boolean h() {
                    return false;
                }

                @Override // xsna.bes0
                public final String i() {
                    return "";
                }
            }

            @Override // com.vk.libvideo.api.di.DebugComponent
            public final fes0 W0(Context context) {
                return new a(context);
            }

            @Override // com.vk.libvideo.api.di.DebugComponent
            public final bes0 W2() {
                return new b();
            }

            /* compiled from: DebugComponent.kt */
            public static final class a implements fes0 {
                public final /* synthetic */ Context b;

                public a(Context context) {
                    this.b = context;
                }

                @Override // xsna.fes0
                public final boolean a(MotionEvent motionEvent) {
                    return false;
                }

                @Override // xsna.fes0
                public final View b() {
                    return new View(this.b);
                }

                @Override // xsna.fes0
                public final void setOnHideBtnClickListener(View.OnClickListener onClickListener) {
                }

                @Override // xsna.fes0
                public final void setPlayer(OneVideoPlayer oneVideoPlayer) {
                }

                @Override // xsna.fes0
                public final void setVideoDebugInfo(ces0 ces0Var) {
                }
            }
        };

        public final DebugComponent getSTUB() {
            return STUB;
        }
    }

    fes0 W0(Context context);

    bes0 W2();
}
