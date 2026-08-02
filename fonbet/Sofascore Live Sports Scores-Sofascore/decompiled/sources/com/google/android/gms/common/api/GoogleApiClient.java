package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import com.google.android.gms.common.api.internal.zaaz;
import com.google.android.gms.common.api.internal.zas;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;
import defpackage.a70;
import defpackage.ah0;
import defpackage.dh0;
import defpackage.lnb;
import defpackage.t1n;
import defpackage.wt3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Deprecated
/* loaded from: classes3.dex */
public abstract class GoogleApiClient {
    public static final Set a = Collections.newSetFromMap(new WeakHashMap());

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Deprecated
    public static final class Builder {
        public final String c;
        public final String d;
        public final Context f;
        public final Looper h;
        public final HashSet a = new HashSet();
        public final HashSet b = new HashSet();
        public final dh0 e = new dh0(0);
        public final dh0 g = new dh0(0);
        public final GoogleApiAvailability i = GoogleApiAvailability.e;
        public final t1n j = zad.a;
        public final ArrayList k = new ArrayList();
        public final ArrayList l = new ArrayList();

        public Builder(Context context) {
            this.f = context;
            this.h = context.getMainLooper();
            this.c = context.getPackageName();
            this.d = context.getClass().getName();
        }

        public final zaaz a() {
            dh0 dh0Var = this.g;
            Preconditions.a("must call addApi() to add at least one API", !dh0Var.isEmpty());
            SignInOptions signInOptions = SignInOptions.a;
            dh0 dh0Var2 = this.g;
            Api api = zad.b;
            if (dh0Var2.containsKey(api)) {
                signInOptions = (SignInOptions) dh0Var2.get(api);
            }
            ClientSettings clientSettings = new ClientSettings(null, this.a, this.e, this.c, this.d, signInOptions);
            Map map = clientSettings.d;
            boolean z = false;
            dh0 dh0Var3 = new dh0(0);
            dh0 dh0Var4 = new dh0(0);
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ah0) dh0Var.keySet()).iterator();
            Api api2 = null;
            while (it.hasNext()) {
                Api api3 = (Api) it.next();
                ClientSettings clientSettings2 = clientSettings;
                Object obj = dh0Var.get(api3);
                boolean z2 = map.get(api3) != null ? true : z;
                dh0Var3.put(api3, Boolean.valueOf(z2));
                zas zasVar = new zas(api3, z2);
                arrayList.add(zasVar);
                Api.Client b = api3.a.b(this.f, this.h, clientSettings2, obj, zasVar, zasVar);
                clientSettings = clientSettings2;
                dh0Var4.put(api3.b, b);
                if (b.providesSignIn()) {
                    if (api2 != null) {
                        String str = api3.c;
                        String str2 = api2.c;
                        a70.r(wt3.m(str, " cannot be used with ", new StringBuilder(str.length() + 21 + str2.length()), str2));
                        return null;
                    }
                    api2 = api3;
                }
                z = false;
            }
            if (api2 != null) {
                boolean equals = this.a.equals(this.b);
                String str3 = api2.c;
                if (!equals) {
                    a70.r(lnb.o("Must not set scopes in GoogleApiClient.Builder when using ", str3, ". Set account in GoogleSignInOptions.Builder instead."));
                    return null;
                }
            }
            zaaz zaazVar = new zaaz(this.f, new ReentrantLock(), this.h, clientSettings, this.i, this.j, dh0Var3, this.k, this.l, dh0Var4, zaaz.i(dh0Var4.values(), true), arrayList);
            Set set = GoogleApiClient.a;
            synchronized (set) {
                set.add(zaazVar);
            }
            return zaazVar;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Deprecated
    public interface ConnectionCallbacks extends com.google.android.gms.common.api.internal.ConnectionCallbacks {
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Deprecated
    public interface OnConnectionFailedListener extends com.google.android.gms.common.api.internal.OnConnectionFailedListener {
    }

    public abstract void a();

    public abstract void b();

    public Looper c() {
        throw new UnsupportedOperationException();
    }

    public boolean d(SignInConnectionListener signInConnectionListener) {
        throw new UnsupportedOperationException();
    }

    public void e() {
        throw new UnsupportedOperationException();
    }
}
