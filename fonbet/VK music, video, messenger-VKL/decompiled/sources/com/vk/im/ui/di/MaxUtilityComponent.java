package com.vk.im.ui.di;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.im.ui.max.MaxRedirectHandler;

/* compiled from: MaxUtilityComponent.kt */
/* loaded from: classes2.dex */
public interface MaxUtilityComponent extends DiUnscopedComponent {
    public static final a Companion = a.a;

    /* compiled from: MaxUtilityComponent.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final MaxUtilityStubComponent STUB = new MaxUtilityStubComponent();

        public final MaxUtilityStubComponent getSTUB() {
            return STUB;
        }
    }

    MaxRedirectHandler j7();
}
