package com.google.android.gms.ads.internal.client.hsdp;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.sdk_base.referrer.Payload;
import com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzcaq;
import com.google.android.gms.internal.ads.zzcas;
import com.google.android.gms.internal.playcore_hsdp.zzg;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory;
import defpackage.gg9;
import defpackage.jgo;
import defpackage.pqg;
import defpackage.rfn;
import defpackage.v3p;
import defpackage.vxn;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes3.dex */
public class HsdpDeepLinkServiceWrapper extends IHsdpDeepLinkServiceWrapper.Stub {
    public zzcas a;
    public zzcas b;
    public gg9 c;

    public final void E4(Context context, Throwable th, String str) {
        if (context == null) {
            zzo.zzg("Context is null, unable to report exception for method: ".concat(str), th);
            return;
        }
        if (((Boolean) zzba.zzc().a(zzbjg.Fe)).booleanValue()) {
            zzcas zzcasVar = this.b;
            if (zzcasVar == null) {
                zzcasVar = zzcaq.e(context);
                this.b = zzcasVar;
            }
            zzcasVar.a("HsdpDeepLinkServiceWrapperUnsampled.".concat(str), th);
            return;
        }
        zzcas zzcasVar2 = this.a;
        if (zzcasVar2 == null) {
            zzcasVar2 = zzcaq.c(context);
            this.a = zzcasVar2;
        }
        zzcasVar2.a("HsdpDeepLinkServiceWrapper.".concat(str), th);
    }

    @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper
    public void endSession(@NonNull IObjectWrapper iObjectWrapper, @Nullable String str) {
        Throwable th;
        Context context;
        try {
            context = (Context) ObjectWrapper.Z1(iObjectWrapper);
            if (context != null) {
                try {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    gg9 gg9Var = this.c;
                    if (gg9Var == null) {
                        gg9Var = HsdpDeepLinkServiceFactory.create(context);
                        this.c = gg9Var;
                    }
                    ((pqg) gg9Var).a(str);
                } catch (Throwable th2) {
                    th = th2;
                    E4(context, th, "endSession");
                }
            }
        } catch (Throwable th3) {
            th = th3;
            context = null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper
    public void open(@NonNull IObjectWrapper iObjectWrapper, @Nullable String str, @Nullable String str2, @Nullable Bundle bundle, boolean z, @Nullable IHsdpServiceCallback iHsdpServiceCallback) {
        Throwable th;
        Context context;
        try {
            context = (Context) ObjectWrapper.Z1(iObjectWrapper);
            if (context != null) {
                try {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    gg9 gg9Var = this.c;
                    if (gg9Var == null) {
                        gg9Var = HsdpDeepLinkServiceFactory.create(context);
                        this.c = gg9Var;
                    }
                    Map zzb = zzp.zzb(bundle);
                    if (str2 == null) {
                        str2 = "";
                    }
                    ((pqg) gg9Var).b(str, str2, new zzb(this, iHsdpServiceCallback), zzb, z);
                } catch (Throwable th2) {
                    th = th2;
                    E4(context, th, "open");
                }
            }
        } catch (Throwable th3) {
            th = th3;
            context = null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.hsdp.IHsdpDeepLinkServiceWrapper
    public void prewarm(@NonNull IObjectWrapper iObjectWrapper, @NonNull List<Bundle> list, @Nullable IHsdpPrewarmServiceCallback iHsdpPrewarmServiceCallback) {
        Throwable th;
        Context context = null;
        try {
            Context context2 = (Context) ObjectWrapper.Z1(iObjectWrapper);
            if (context2 == null) {
                return;
            }
            try {
                gg9 gg9Var = this.c;
                if (gg9Var == null) {
                    gg9Var = HsdpDeepLinkServiceFactory.create(context2);
                    this.c = gg9Var;
                }
                ArrayList arrayList = new ArrayList();
                if (list != null) {
                    for (Bundle bundle : list) {
                        String string = bundle.getString("targetPackage");
                        if (!TextUtils.isEmpty(string)) {
                            IBinder binder = bundle.getBinder("window_token");
                            String string2 = bundle.getString(Payload.RFR);
                            Map zzb = zzp.zzb(bundle.getBundle("extra_query_params"));
                            if (Collections.EMPTY_MAP == null) {
                                throw new NullPointerException("Null extraQueryParams");
                            }
                            if (string == null) {
                                throw new NullPointerException("Null targetAppPackageName");
                            }
                            if (zzb == null) {
                                throw new NullPointerException("Null extraQueryParams");
                            }
                            if (string2 == null) {
                                string2 = null;
                            }
                            if (binder == null) {
                                binder = null;
                            }
                            if (string2 == null) {
                                StringBuilder sb = new StringBuilder();
                                if (string2 == null) {
                                    sb.append(" referrer");
                                }
                                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                            }
                            arrayList.add(new vxn(string, string2, zzb, binder));
                        }
                    }
                }
                zza zzaVar = new zza(this, iHsdpPrewarmServiceCallback);
                rfn rfnVar = (rfn) ((v3p) ((zzg) ((pqg) gg9Var).f).zza());
                rfnVar.getClass();
                rfnVar.b.k(new jgo(17, rfnVar, arrayList, zzaVar));
            } catch (Throwable th2) {
                th = th2;
                context = context2;
                E4(context, th, "prewarm");
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
