package com.vk.auth.oauth.component.di;

import com.vk.di.component.DiScopedComponent;
import xsna.hsm0;
import xsna.pwj0;
import xsna.zn70;

/* compiled from: OAuthUiComponent.kt */
/* loaded from: classes.dex */
public interface OAuthUiComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: OAuthUiComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        public final OAuthUiComponent getSTUB() {
            return new OAuthUiComponent() { // from class: com.vk.auth.oauth.component.di.OAuthUiComponent$Companion$STUB$1
                @Override // com.vk.auth.oauth.component.di.OAuthUiComponent
                public final zn70 n1() {
                    return new hsm0();
                }
            };
        }
    }

    zn70 n1();
}
