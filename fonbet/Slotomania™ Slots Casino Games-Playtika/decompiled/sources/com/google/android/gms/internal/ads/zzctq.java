package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.ironsource.C2399e8;
import com.ironsource.X3;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public final class zzctq implements zzbtp {
    private final Context zza;
    private final zzbeb zzb;
    private final PowerManager zzc;

    public zzctq(Context context, zzbeb zzbebVar) {
        this.zza = context;
        this.zzb = zzbebVar;
        this.zzc = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.zzbtp
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final JSONObject zzb(zzctt zzcttVar) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzbed zzbedVar = zzcttVar.zzf;
        if (zzbedVar == null) {
            jSONObject = new JSONObject();
        } else {
            zzbeb zzbebVar = this.zzb;
            if (zzbebVar.zzc() == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z = zzbedVar.zza;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject put = jSONObject3.put("afmaVersion", zzbebVar.zzb()).put("activeViewJSON", zzbebVar.zzc()).put("timestamp", zzcttVar.zzd).put("adFormat", zzbebVar.zza()).put("hashCode", zzbebVar.zzd()).put("isMraid", false);
            boolean z2 = zzcttVar.zzc;
            JSONObject put2 = put.put("isStopped", false).put("isPaused", zzcttVar.zzb).put("isNative", zzbebVar.zze()).put("isScreenOn", this.zzc.isInteractive()).put("appMuted", com.google.android.gms.ads.internal.zzt.zzi().zzd()).put("appVolume", com.google.android.gms.ads.internal.zzt.zzi().zzb());
            Context context = this.zza;
            put2.put(X3.j.P, com.google.android.gms.ads.internal.util.zzaa.zze(context.getApplicationContext()));
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            JSONObject put3 = jSONObject3.put("windowVisibility", zzbedVar.zzb).put("isAttachedToWindow", z);
            JSONObject jSONObject4 = new JSONObject();
            Rect rect = zzbedVar.zzc;
            JSONObject put4 = put3.put("viewBox", jSONObject4.put("top", rect.top).put("bottom", rect.bottom).put("left", rect.left).put(TtmlNode.RIGHT, rect.right));
            JSONObject jSONObject5 = new JSONObject();
            Rect rect2 = zzbedVar.zzd;
            JSONObject put5 = put4.put("adBox", jSONObject5.put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put(TtmlNode.RIGHT, rect2.right));
            JSONObject jSONObject6 = new JSONObject();
            Rect rect3 = zzbedVar.zze;
            JSONObject put6 = put5.put("globalVisibleBox", jSONObject6.put("top", rect3.top).put("bottom", rect3.bottom).put("left", rect3.left).put(TtmlNode.RIGHT, rect3.right)).put("globalVisibleBoxVisible", zzbedVar.zzf);
            JSONObject jSONObject7 = new JSONObject();
            Rect rect4 = zzbedVar.zzg;
            JSONObject put7 = put6.put("localVisibleBox", jSONObject7.put("top", rect4.top).put("bottom", rect4.bottom).put("left", rect4.left).put(TtmlNode.RIGHT, rect4.right)).put("localVisibleBoxVisible", zzbedVar.zzh);
            JSONObject jSONObject8 = new JSONObject();
            Rect rect5 = zzbedVar.zzi;
            put7.put("hitBox", jSONObject8.put("top", rect5.top).put("bottom", rect5.bottom).put("left", rect5.left).put(TtmlNode.RIGHT, rect5.right)).put("screenDensity", displayMetrics.density);
            jSONObject3.put(C2399e8.k, zzcttVar.zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcb)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzbedVar.zzk;
                if (list != null) {
                    for (Rect rect6 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect6.top).put("bottom", rect6.bottom).put("left", rect6.left).put(TtmlNode.RIGHT, rect6.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzcttVar.zze)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
