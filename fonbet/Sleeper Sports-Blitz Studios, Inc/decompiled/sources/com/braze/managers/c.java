package com.braze.managers;

import android.content.Context;
import com.amazon.device.messaging.ADM;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class c {
    public static final b c = new b();

    /* renamed from: a, reason: collision with root package name */
    public final Context f577a;
    public final q0 b;

    public c(Context context, q0 admRegistrationDataProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(admRegistrationDataProvider, "admRegistrationDataProvider");
        this.f577a = context;
        this.b = admRegistrationDataProvider;
    }

    public static final String b() {
        return "Registering with ADM server...";
    }

    public final void a() {
        if (((z0) this.b).b() != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.managers.c$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return c.a(c.this);
                }
            }, 6, (Object) null);
            z0 z0Var = (z0) this.b;
            z0Var.a(z0Var.b());
        } else {
            ADM adm = new ADM(this.f577a);
            if (adm.isSupported()) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.managers.c$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return c.b();
                    }
                }, 6, (Object) null);
                adm.startRegister();
            }
        }
    }

    public static final String a(c cVar) {
        return "The device is already registered with the ADM server and is eligible to receive ADM messages.ADM registration id: " + ((z0) cVar.b).b();
    }
}
