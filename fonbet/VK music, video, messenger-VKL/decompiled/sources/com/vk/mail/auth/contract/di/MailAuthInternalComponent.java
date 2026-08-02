package com.vk.mail.auth.contract.di;

import com.vk.di.component.DiScopedComponent;
import xsna.pwj0;

/* compiled from: MailAuthInternalComponent.kt */
/* loaded from: classes.dex */
public interface MailAuthInternalComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: MailAuthInternalComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        public final MailAuthInternalComponent getSTUB() {
            return new MailAuthInternalComponent() { // from class: com.vk.mail.auth.contract.di.MailAuthInternalComponent$Companion$STUB$1
                @Override // com.vk.mail.auth.contract.di.MailAuthInternalComponent
                public final b L8() {
                    return new b();
                }

                @Override // com.vk.mail.auth.contract.di.MailAuthInternalComponent
                public final d z2() {
                    return new d();
                }
            };
        }
    }

    b L8();

    d z2();
}
