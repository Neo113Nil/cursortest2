package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.ironsource.C4018c8;
import com.ironsource.U3;
import com.sofascore.model.mvvm.model.PlayerKt;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcuu implements zzbut {
    public final Context a;
    public final zzbfd b;
    public final PowerManager c;

    public zzcuu(Context context, zzbfd zzbfdVar) {
        this.a = context;
        this.b = zzbfdVar;
        this.c = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.zzbut
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject zzb(zzcux zzcuxVar) {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzbff zzbffVar = zzcuxVar.e;
        if (zzbffVar == null) {
            jSONObject = new JSONObject();
        } else {
            zzbfd zzbfdVar = this.b;
            if (zzbfdVar.b == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z = zzbffVar.a;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject put = jSONObject3.put("afmaVersion", zzbfdVar.d).put("activeViewJSON", zzbfdVar.b).put("timestamp", zzcuxVar.c).put("adFormat", zzbfdVar.a).put("hashCode", zzbfdVar.c).put("isMraid", false).put("isStopped", false).put("isPaused", zzcuxVar.b).put("isNative", zzbfdVar.e).put("isScreenOn", this.c.isInteractive()).put("appMuted", com.google.android.gms.ads.internal.zzt.zzi().zzd()).put("appVolume", com.google.android.gms.ads.internal.zzt.zzi().zzb());
            Context context = this.a;
            put.put(U3.j.P, com.google.android.gms.ads.internal.util.zzaa.zze(context.getApplicationContext()));
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            JSONObject put2 = jSONObject3.put("windowVisibility", zzbffVar.b).put("isAttachedToWindow", z);
            JSONObject jSONObject4 = new JSONObject();
            Rect rect = zzbffVar.c;
            JSONObject put3 = put2.put("viewBox", jSONObject4.put(PlayerKt.E_SPORTS_TOP, rect.top).put("bottom", rect.bottom).put("left", rect.left).put("right", rect.right));
            JSONObject jSONObject5 = new JSONObject();
            Rect rect2 = zzbffVar.d;
            JSONObject put4 = put3.put("adBox", jSONObject5.put(PlayerKt.E_SPORTS_TOP, rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
            JSONObject jSONObject6 = new JSONObject();
            Rect rect3 = zzbffVar.e;
            JSONObject put5 = put4.put("globalVisibleBox", jSONObject6.put(PlayerKt.E_SPORTS_TOP, rect3.top).put("bottom", rect3.bottom).put("left", rect3.left).put("right", rect3.right)).put("globalVisibleBoxVisible", zzbffVar.f);
            JSONObject jSONObject7 = new JSONObject();
            Rect rect4 = zzbffVar.g;
            JSONObject put6 = put5.put("localVisibleBox", jSONObject7.put(PlayerKt.E_SPORTS_TOP, rect4.top).put("bottom", rect4.bottom).put("left", rect4.left).put("right", rect4.right)).put("localVisibleBoxVisible", zzbffVar.h);
            JSONObject jSONObject8 = new JSONObject();
            Rect rect5 = zzbffVar.i;
            put6.put("hitBox", jSONObject8.put(PlayerKt.E_SPORTS_TOP, rect5.top).put("bottom", rect5.bottom).put("left", rect5.left).put("right", rect5.right)).put("screenDensity", displayMetrics.density);
            jSONObject3.put(C4018c8.k, zzcuxVar.a);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.g2)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzbffVar.k;
                if (list != null) {
                    for (Rect rect6 : list) {
                        jSONArray2.put(new JSONObject().put(PlayerKt.E_SPORTS_TOP, rect6.top).put("bottom", rect6.bottom).put("left", rect6.left).put("right", rect6.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzcuxVar.d)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
