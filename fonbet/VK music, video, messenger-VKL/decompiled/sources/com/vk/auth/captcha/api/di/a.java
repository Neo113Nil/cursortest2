package com.vk.auth.captcha.api.di;

import com.vk.di.component.DiUnscopedComponent;
import xsna.b7m;
import xsna.e7m;
import xsna.wzg0;

/* compiled from: CaptchaComponent.kt */
/* loaded from: classes.dex */
public final class a implements b7m<CaptchaComponent> {
    @Override // xsna.b7m
    public final DiUnscopedComponent a(e7m e7mVar) {
        return new CaptchaComponent() { // from class: com.vk.auth.captcha.api.di.CaptchaComponent$Companion$STUB$1
            public final wzg0 a = wzg0.a.a();

            @Override // com.vk.auth.captcha.api.di.CaptchaComponent
            public final wzg0 D1() {
                return this.a;
            }
        };
    }
}
