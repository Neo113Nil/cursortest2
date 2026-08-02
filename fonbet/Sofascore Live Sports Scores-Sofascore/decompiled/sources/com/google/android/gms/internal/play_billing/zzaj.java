package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.billingclient.api.h;
import com.android.billingclient.api.m;
import defpackage.kvn;
import defpackage.ljg;
import defpackage.yfa;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzaj extends zzav implements zzak {
    public zzaj() {
        super("com.android.vending.billing.IInAppBillingInitializeCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.zzav
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        zzcf zzcfVar;
        if (i != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) zzaw.a(parcel);
        zzav.S1(parcel);
        h hVar = (h) this;
        if (bundle == null) {
            int i2 = zzc.a;
            hVar.Z1(hVar.a, m.h, zzjs.NULL_BUNDLE_RETURNED_BY_PHONESKY, hVar.b.booleanValue(), null, hVar.c);
            return true;
        }
        if (!bundle.containsKey("RESPONSE_CODE")) {
            int i3 = zzc.a;
            hVar.Z1(hVar.a, m.h, zzjs.RESPONSE_CODE_NOT_SET_IN_BUNDLE, hVar.b.booleanValue(), null, hVar.c);
            return true;
        }
        if (bundle.getInt("RESPONSE_CODE") != 0) {
            hVar.Z1(hVar.a, m.a(bundle.getInt("RESPONSE_CODE"), bundle.getString("DEBUG_MESSAGE", "")), zzjs.NON_OK_CODE_RETURNED_BY_PHONESKY, hVar.b.booleanValue(), ljg.j(bundle.getInt("RESPONSE_CODE"), "Response code from Phonesky: "), hVar.c);
            return true;
        }
        if (!bundle.containsKey("BILLING_API_VERSION_KEY")) {
            int i4 = zzc.a;
            hVar.Z1(hVar.a, m.h, zzjs.BILLING_API_VERSION_NOT_SET_IN_BUNDLE, hVar.b.booleanValue(), null, hVar.c);
            return true;
        }
        int i5 = bundle.getInt("BILLING_API_VERSION_KEY");
        com.android.billingclient.api.a aVar = hVar.d;
        com.android.billingclient.api.a.k(aVar, i5);
        aVar.l = i5 >= 5;
        aVar.k = i5 >= 3;
        Bundle bundle2 = bundle.getBundle("EXPERIMENT_VALUES_KEY");
        if (bundle2 != null) {
            try {
                yfa.f = bundle2.getBoolean("DELEGATION_API_ENABLED_KEY");
            } catch (Throwable unused) {
                "Error reading EnableDelegationApi experiment flag: ".concat(bundle2.toString());
                int i6 = zzc.a;
            }
            try {
                yfa.g = bundle2.getLong("AUTO_SERVICE_RECONNECTION_SYNCHRONOUS_TIMEOUT_MS_KEY");
            } catch (Throwable unused2) {
                "Error reading AutoServiceReconnectionSynchronousTimeoutMs experiment flag: ".concat(bundle2.toString());
                int i7 = zzc.a;
            }
            try {
                yfa.h = bundle2.getLong("AUTO_SERVICE_RECONNECTION_ASYNCHRONOUS_TIMEOUT_MS_KEY");
            } catch (Throwable unused3) {
                "Error reading AutoServiceReconnectionAsynchronousTimeoutMs experiment flag: ".concat(bundle2.toString());
                int i8 = zzc.a;
            }
            try {
                yfa.i = bundle2.getInt("AUTO_SERVICE_RECONNECTION_MAX_NUM_RETRIES_KEY");
            } catch (Throwable unused4) {
                "Error reading AutoServiceReconnectionMaxNumRetries experiment flag: ".concat(bundle2.toString());
                int i9 = zzc.a;
            }
            try {
                yfa.j = bundle2.getBoolean("ENABLE_DEDUPLICATE_SERVICE_DISCONNECTED_CALLBACK");
            } catch (Throwable unused5) {
                "Error reading EnableDeduplicateServiceDisconnectedCallback experiment flag: ".concat(bundle2.toString());
                int i10 = zzc.a;
            }
        }
        Bundle bundle3 = bundle.getBundle("ENABLED_SUBSCRIPTION_CLIENT_ACTIONS_KEY");
        if (bundle3 != null) {
            zzce zzceVar = new zzce();
            for (com.android.billingclient.api.zzev zzevVar : com.android.billingclient.api.zzev.values()) {
                if (bundle3.getBoolean(zzevVar.name(), false)) {
                    int length = zzceVar.a.length;
                    int a = zzbw.a(length, zzceVar.b + 1);
                    if (a > length || zzceVar.c) {
                        zzceVar.a = Arrays.copyOf(zzceVar.a, a);
                        zzceVar.c = false;
                    }
                    Object[] objArr = zzceVar.a;
                    int i11 = zzceVar.b;
                    zzceVar.b = i11 + 1;
                    objArr[i11] = zzevVar;
                }
            }
            com.android.billingclient.api.a aVar2 = hVar.d;
            int i12 = zzceVar.b;
            if (i12 != 0) {
                Object[] objArr2 = zzceVar.a;
                if (i12 != 1) {
                    zzcfVar = zzcf.t(i12, objArr2);
                    zzceVar.b = zzcfVar.size();
                    zzceVar.c = true;
                } else {
                    Object obj = objArr2[0];
                    Objects.requireNonNull(obj);
                    zzcfVar = new kvn(obj);
                }
            } else {
                zzcfVar = b.j;
            }
            aVar2.J = zzcfVar;
            if (aVar2.f != null) {
                aVar2.f.i = aVar2.J;
            }
        }
        com.android.billingclient.api.a aVar3 = hVar.d;
        if (aVar3.m < 3) {
            int i13 = zzc.a;
            hVar.Z1(hVar.a, m.b, zzjs.ONE_TIME_PRODUCT_NOT_SUPPORTED, hVar.b.booleanValue(), null, hVar.c);
        } else {
            com.android.billingclient.api.c cVar = hVar.a;
            Boolean bool = hVar.b;
            int i14 = hVar.c;
            boolean booleanValue = bool.booleanValue();
            com.android.billingclient.api.a.l(aVar3, 0);
            synchronized (aVar3.a) {
                try {
                    if (aVar3.b != 3) {
                        cVar.f(i14, booleanValue);
                        cVar.g(m.i);
                    }
                } finally {
                }
            }
        }
        return true;
    }
}
