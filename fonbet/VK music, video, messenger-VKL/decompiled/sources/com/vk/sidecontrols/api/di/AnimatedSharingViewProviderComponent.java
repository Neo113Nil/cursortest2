package com.vk.sidecontrols.api.di;

import android.content.Context;
import android.view.View;
import com.vk.di.component.DiScopedComponent;
import xsna.pwj0;
import xsna.tl2;

/* compiled from: AnimatedSharingViewProviderComponent.kt */
/* loaded from: classes5.dex */
public interface AnimatedSharingViewProviderComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: AnimatedSharingViewProviderComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final AnimatedSharingViewProviderComponent STUB = new AnimatedSharingViewProviderComponent() { // from class: com.vk.sidecontrols.api.di.AnimatedSharingViewProviderComponent$Companion$STUB$1
            @Override // com.vk.sidecontrols.api.di.AnimatedSharingViewProviderComponent
            public final tl2 o0(Context context) {
                return new a();
            }

            /* compiled from: AnimatedSharingViewProviderComponent.kt */
            public static final class a implements tl2 {
                @Override // xsna.tl2
                public final View getAnimatedSharingView() {
                    throw new IllegalStateException("Must not be called from stub");
                }

                @Override // xsna.tl2
                public final void setControlOnClickListener(View.OnClickListener onClickListener) {
                }

                @Override // xsna.tl2
                public final void setControlOnLongClickListener(View.OnLongClickListener onLongClickListener) {
                }

                @Override // xsna.tl2
                public final void setVisibility(boolean z) {
                }

                @Override // xsna.tl2
                public final void a(String str, boolean z) {
                }
            }
        };

        public final AnimatedSharingViewProviderComponent getSTUB() {
            return STUB;
        }
    }

    tl2 o0(Context context);
}
