package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import defpackage.f2n;
import defpackage.t94;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbki extends t94 {
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final List c = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.zb)).split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR));
    public final zzbkl d;
    public final t94 e;
    public final zzeao f;

    public zzbki(zzbkl zzbklVar, t94 t94Var, zzeao zzeaoVar) {
        this.e = t94Var;
        this.d = zzbklVar;
        this.f = zzeaoVar;
    }

    @Override // defpackage.t94
    public final void extraCallback(String str, Bundle bundle) {
        t94 t94Var = this.e;
        if (t94Var != null) {
            t94Var.extraCallback(str, bundle);
        }
    }

    @Override // defpackage.t94
    public final Bundle extraCallbackWithResult(String str, Bundle bundle) {
        t94 t94Var = this.e;
        if (t94Var != null) {
            return t94Var.extraCallbackWithResult(str, bundle);
        }
        return null;
    }

    @Override // defpackage.t94
    public final void onActivityResized(int i, int i2, Bundle bundle) {
        t94 t94Var = this.e;
        if (t94Var != null) {
            t94Var.onActivityResized(i, i2, bundle);
        }
    }

    @Override // defpackage.t94
    public final void onMessageChannelReady(Bundle bundle) {
        this.b.set(false);
        t94 t94Var = this.e;
        if (t94Var != null) {
            t94Var.onMessageChannelReady(bundle);
        }
    }

    @Override // defpackage.t94
    public final void onNavigationEvent(int i, Bundle bundle) {
        this.b.set(false);
        t94 t94Var = this.e;
        if (t94Var != null) {
            t94Var.onNavigationEvent(i, bundle);
        }
        long a = com.google.android.gms.ads.internal.zzt.zzk().a();
        zzbkl zzbklVar = this.d;
        zzbklVar.j = a;
        List list = this.c;
        if (list == null || !list.contains(String.valueOf(i))) {
            return;
        }
        zzbklVar.i = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() + ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.wb)).intValue();
        if (zzbklVar.e == null) {
            zzbklVar.e = new f2n(zzbklVar, 22);
        }
        zzbklVar.d();
        com.google.android.gms.ads.nonagon.signalgeneration.zzv.zze(this.f, null, "pact_action", new Pair("pe", "pact_reqpmc"));
    }

    @Override // defpackage.t94
    public final void onPostMessage(String str, Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.b.set(true);
                com.google.android.gms.ads.nonagon.signalgeneration.zzv.zze(this.f, null, "pact_action", new Pair("pe", "pact_con"));
                this.d.a(jSONObject.getString("paw_id"));
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Message is not in JSON format: ", e);
        }
        t94 t94Var = this.e;
        if (t94Var != null) {
            t94Var.onPostMessage(str, bundle);
        }
    }

    @Override // defpackage.t94
    public final void onRelationshipValidationResult(int i, Uri uri, boolean z, Bundle bundle) {
        t94 t94Var = this.e;
        if (t94Var != null) {
            t94Var.onRelationshipValidationResult(i, uri, z, bundle);
        }
    }
}
