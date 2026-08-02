package com.vk.com.vk.donut.popup.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.h1o;
import xsna.pwj0;

/* compiled from: DonutPopupComponent.kt */
/* loaded from: classes.dex */
public interface DonutPopupComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: DonutPopupComponent.kt */
    /* loaded from: classes17.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final DonutPopupComponent STUB = new DonutPopupComponent() { // from class: com.vk.com.vk.donut.popup.api.di.DonutPopupComponent$Companion$STUB$1
            public final h1o a = h1o.a.a.getSTUB();

            @Override // com.vk.com.vk.donut.popup.api.di.DonutPopupComponent
            public final h1o a() {
                return this.a;
            }
        };

        public final DonutPopupComponent getSTUB() {
            return STUB;
        }
    }

    h1o a();
}
