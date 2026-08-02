package com.google.android.gms.measurement.api;

import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Pair;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.measurement.zzcm;
import com.google.android.gms.internal.measurement.zzez;
import com.google.android.gms.measurement.internal.zzjp;
import com.google.android.gms.measurement.internal.zzjq;
import defpackage.ezn;
import defpackage.kzn;
import defpackage.p5o;
import defpackage.y0o;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes3.dex */
public class AppMeasurementSdk {
    public final zzez a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @KeepForSdk
    public static final class ConditionalUserProperty {
        private ConditionalUserProperty() {
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @ShowFirstParty
    @KeepForSdk
    public interface EventInterceptor extends zzjp {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @ShowFirstParty
    @KeepForSdk
    public interface OnEventListener extends zzjq {
    }

    public AppMeasurementSdk(zzez zzezVar) {
        this.a = zzezVar;
    }

    @NonNull
    @Keep
    @ShowFirstParty
    @KeepForSdk
    public static AppMeasurementSdk getInstance(@NonNull Context context) {
        return zzez.f(context, null).c;
    }

    public final void a(OnEventListener onEventListener) {
        zzez zzezVar = this.a;
        ArrayList arrayList = zzezVar.d;
        synchronized (arrayList) {
            for (int i = 0; i < arrayList.size(); i++) {
                try {
                    if (onEventListener.equals(((Pair) arrayList.get(i)).first)) {
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            p5o p5oVar = new p5o(onEventListener);
            arrayList.add(new Pair(onEventListener, p5oVar));
            if (zzezVar.g != null) {
                try {
                    zzezVar.g.registerOnMeasurementEventListener(p5oVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                }
            }
            zzezVar.c(new kzn(zzezVar, p5oVar, 3));
        }
    }

    @Keep
    @KeepForSdk
    public void beginAdUnitExposure(@NonNull String str) {
        zzez zzezVar = this.a;
        zzezVar.c(new ezn(zzezVar, str, 1));
    }

    @Keep
    @KeepForSdk
    public void endAdUnitExposure(@NonNull String str) {
        zzez zzezVar = this.a;
        zzezVar.c(new ezn(zzezVar, str, 2));
    }

    @Keep
    @KeepForSdk
    public long generateEventId() {
        return this.a.h();
    }

    @Nullable
    @Keep
    @KeepForSdk
    public String getAppInstanceId() {
        zzcm zzcmVar = new zzcm();
        zzez zzezVar = this.a;
        zzezVar.c(new y0o(zzezVar, zzcmVar, 1));
        return zzcmVar.S1(50L);
    }

    @Nullable
    @Keep
    @KeepForSdk
    public String getGmpAppId() {
        zzcm zzcmVar = new zzcm();
        zzez zzezVar = this.a;
        zzezVar.c(new y0o(zzezVar, zzcmVar, 0));
        return zzcmVar.S1(500L);
    }

    @Keep
    @KeepForSdk
    public void logEvent(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle) {
        this.a.e(bundle, str, str2, true);
    }
}
