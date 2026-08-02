package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbc;
import defpackage.ddb;
import defpackage.dff;
import defpackage.f2n;
import defpackage.fsn;
import defpackage.hsn;
import defpackage.xlo;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdaw implements zzdgv, zzdmi {
    public zzcbr a;
    public final Context c;
    public final zzfrj d;
    public final VersionInfoParcel e;
    public final hsn f;
    public boolean g = false;
    public boolean h = false;
    public final AtomicBoolean b = new AtomicBoolean();

    public zzdaw(Context context, zzfrj zzfrjVar, VersionInfoParcel versionInfoParcel, hsn hsnVar) {
        this.c = context;
        this.d = zzfrjVar;
        this.e = versionInfoParcel;
        this.f = hsnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void Z(zzcbv zzcbvVar) {
        a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (android.text.TextUtils.equals(r0, androidx.core.app.NotificationCompat.CATEGORY_SERVICE) != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        zzcbr zzcbrVar;
        ddb ddbVar;
        int i;
        int i2;
        zzbva b;
        boolean andSet = this.b.getAndSet(true);
        hsn hsnVar = this.f;
        if (!andSet) {
            if (!((Boolean) zzblh.o.c()).booleanValue()) {
                i = 3;
                if (!((Boolean) zzblh.p.c()).booleanValue()) {
                    if (((Boolean) zzblh.n.c()).booleanValue()) {
                        try {
                            String optString = new JSONObject(com.google.android.gms.ads.internal.zzt.zzh().g().zzi().e).optString("local_flag_write");
                            if (TextUtils.equals(optString, "client")) {
                            }
                        } catch (JSONException unused) {
                        }
                    }
                    i = 1;
                }
                i2 = i - 1;
                zzfrj zzfrjVar = this.d;
                Context context = this.c;
                if (i2 != 1) {
                    b = com.google.android.gms.ads.internal.zzt.zzr().b(context, VersionInfoParcel.forPackage(), zzfrjVar);
                } else if (i2 == 2) {
                    b = com.google.android.gms.ads.internal.zzt.zzr().a(context, VersionInfoParcel.forPackage(), zzfrjVar);
                }
                dff dffVar = zzbux.a;
                this.a = new zzcbr(context, b.a("google.afma.sdkConstants.getSdkConstants", dffVar, dffVar), this.e, hsnVar);
                this.g = true;
            }
            i = 2;
            i2 = i - 1;
            zzfrj zzfrjVar2 = this.d;
            Context context2 = this.c;
            if (i2 != 1) {
            }
            dff dffVar2 = zzbux.a;
            this.a = new zzcbr(context2, b.a("google.afma.sdkConstants.getSdkConstants", dffVar2, dffVar2), this.e, hsnVar);
            this.g = true;
        }
        if (this.g && (zzcbrVar = this.a) != null) {
            if (!((Boolean) zzblh.a.c()).booleanValue()) {
                ddbVar = zzcbrVar.a();
            } else if (zzcbrVar.f.compareAndSet(false, true)) {
                ddb a = zzcbrVar.a();
                a.addListener(new f2n(zzcbrVar, 26), zzcgj.h);
                ddbVar = a;
            } else {
                ddbVar = xlo.b;
            }
            if (!this.h && ((Boolean) zzbkz.i.c()).booleanValue()) {
                ddbVar.addListener(new fsn(this, 15), hsnVar);
            }
            zzcgm.a(ddbVar, "persistFlagsClient", zzcgj.h);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdmi
    public final void zzd(zzbc zzbcVar) {
        a();
    }

    @Override // com.google.android.gms.internal.ads.zzdmi
    public final void zze(String str) {
        a();
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void N(zzflo zzfloVar) {
    }
}
