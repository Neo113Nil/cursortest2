package com.vk.popupmanager.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.pwj0;
import xsna.ywb0;

/* compiled from: PopupManagerComponent.kt */
/* loaded from: classes.dex */
public interface PopupManagerComponent extends DiScopedComponent<pwj0> {
    public static final /* synthetic */ Companion Companion = Companion.a;

    /* compiled from: PopupManagerComponent.kt */
    /* loaded from: classes18.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        private static final PopupManagerComponent STUB = new PopupManagerComponent() { // from class: com.vk.popupmanager.api.di.PopupManagerComponent$Companion$STUB$1
            public final ywb0 a = ywb0.a.a.getSTUB();

            @Override // com.vk.popupmanager.api.di.PopupManagerComponent
            public final ywb0 Dc() {
                return this.a;
            }
        };

        public final PopupManagerComponent getSTUB() {
            return STUB;
        }
    }

    ywb0 Dc();
}
