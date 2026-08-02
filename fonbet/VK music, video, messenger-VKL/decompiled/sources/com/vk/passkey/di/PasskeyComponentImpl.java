package com.vk.passkey.di;

import android.content.Context;
import com.vk.di.component.DiScopedComponent;
import com.vk.passkey.api.di.PasskeyComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.ewy;
import xsna.fpf0;
import xsna.g8m;
import xsna.pwj0;
import xsna.qcy;
import xsna.w4u;
import xsna.zl90;

/* compiled from: PasskeyComponentImpl.kt */
/* loaded from: classes4.dex */
public final class PasskeyComponentImpl implements PasskeyComponent {
    public static final /* synthetic */ qcy<Object>[] c;
    public final Context a;
    public final ewy b = new ewy(new w4u(this, 27));

    /* compiled from: PasskeyComponentImpl.kt */
    public static final class a implements c8m<PasskeyComponent, pwj0> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new PasskeyComponentImpl(this.a);
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PasskeyComponentImpl.class, "passkeyNativeAvailabilityResolver", "getPasskeyNativeAvailabilityResolver()Lcom/vk/passkey/api/PasskeyNativeAvailabilityResolver;", 0);
        fpf0.a.getClass();
        c = new qcy[]{propertyReference1Impl};
    }

    public PasskeyComponentImpl(Context context) {
        this.a = context;
    }

    @Override // com.vk.passkey.api.di.PasskeyComponent
    public final zl90 i9() {
        qcy<Object> qcyVar = c[0];
        return (zl90) this.b.c();
    }
}
