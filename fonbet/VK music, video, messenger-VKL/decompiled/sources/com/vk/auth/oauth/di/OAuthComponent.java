package com.vk.auth.oauth.di;

import com.vk.auth.oauth.di.a;
import com.vk.auth.oauth.di.b;
import com.vk.di.component.DiScopedComponent;
import xsna.pwj0;

/* compiled from: OAuthComponent.kt */
/* loaded from: classes.dex */
public interface OAuthComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: OAuthComponent.kt */
    /* loaded from: classes15.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        public final OAuthComponent getSTUB() {
            return new OAuthComponent() { // from class: com.vk.auth.oauth.di.OAuthComponent$Companion$STUB$1
                public final a a = a.C0408a.a();
                public final b b = b.a.a();

                @Override // com.vk.auth.oauth.di.OAuthComponent
                public final a B8() {
                    return this.a;
                }

                @Override // com.vk.auth.oauth.di.OAuthComponent
                public final b p1() {
                    return this.b;
                }
            };
        }
    }

    a B8();

    b p1();
}
