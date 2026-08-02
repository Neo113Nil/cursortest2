package com.vk.auth.suspicious_auth;

import com.vk.auth.suspicious_auth.b;
import com.vk.di.component.DiScopedComponent;
import xsna.c8m;
import xsna.g8m;
import xsna.pwj0;

/* compiled from: SuspiciousAuthComponent.kt */
/* loaded from: classes.dex */
public final class a implements c8m<SuspiciousAuthComponent, pwj0> {
    @Override // xsna.c8m
    public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
        return new SuspiciousAuthComponent() { // from class: com.vk.auth.suspicious_auth.SuspiciousAuthComponent$Companion$STUB$1
            public final b a = b.a.a.getSTUB();

            @Override // com.vk.auth.suspicious_auth.SuspiciousAuthComponent
            public final b c() {
                return this.a;
            }
        };
    }
}
