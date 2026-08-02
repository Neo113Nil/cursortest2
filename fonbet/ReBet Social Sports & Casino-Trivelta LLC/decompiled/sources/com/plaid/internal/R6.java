package com.plaid.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.plaid.internal.C3556a6;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class R6 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final EnumC3612d7 f39598a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final InterfaceC3621e7 f39599b;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39600a;

        static {
            int[] iArr = new int[EnumC3612d7.values().length];
            try {
                iArr[EnumC3612d7.SMS_RECEIVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3612d7.NO_SMS_AUTOFILL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f39600a = iArr;
        }
    }

    public R6(@NotNull EnumC3612d7 smsAutofillType, @NotNull InterfaceC3621e7 otpReceiver) {
        Intrinsics.checkNotNullParameter(smsAutofillType, "smsAutofillType");
        Intrinsics.checkNotNullParameter(otpReceiver, "otpReceiver");
        this.f39598a = smsAutofillType;
        this.f39599b = otpReceiver;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NotNull Context context, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Intrinsics.areEqual("com.google.android.gms.auth.api.phone.SMS_RETRIEVED", intent.getAction())) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                Intrinsics.checkNotNullParameter("SMS Retrieved action extras are null", "message");
                C3556a6.a.b(C3556a6.f39823a, "SMS Retrieved action extras are null");
                J5 j52 = Y6.f39796a;
                if (j52 != null) {
                    j52.a("SMS Retrieved action extras are null");
                    return;
                }
                return;
            }
            Status status = (Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
            Integer valueOf = status != null ? Integer.valueOf(status.i()) : null;
            if (valueOf == null || valueOf.intValue() != 0) {
                if (valueOf != null && valueOf.intValue() == 15) {
                    this.f39599b.a();
                    return;
                }
                return;
            }
            if (a.f39600a[this.f39598a.ordinal()] != 1) {
                return;
            }
            String string = extras.getString("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
            if (string != null) {
                this.f39599b.a(string);
                return;
            }
            Intrinsics.checkNotNullParameter("SMS Receiver message is null", "message");
            C3556a6.a.b(C3556a6.f39823a, "SMS Receiver message is null");
            J5 j53 = Y6.f39796a;
            if (j53 != null) {
                j53.a("SMS Receiver message is null");
            }
        }
    }
}
