package com.android.billingclient.api;

import androidx.annotation.Nullable;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zzek {
    public final List a;
    public final BillingResult b;

    public zzek(BillingResult billingResult, @Nullable List list) {
        this.a = list;
        this.b = billingResult;
    }

    public final BillingResult zza() {
        return this.b;
    }

    @Nullable
    public final List zzb() {
        return this.a;
    }
}
