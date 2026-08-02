package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfbj implements zzfdg {
    public final zzflw a;
    public final PackageInfo b;
    public final com.google.android.gms.ads.internal.util.zzg c;

    public zzfbj(zzflw zzflwVar, PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.a = zzflwVar;
        this.b = packageInfo;
        this.c = zzgVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e8, code lost:
    
        if (r12 == 3) goto L72;
     */
    @Override // com.google.android.gms.internal.ads.zzfdg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        JSONArray optJSONArray;
        zzflw zzflwVar = this.a;
        ArrayList<String> arrayList = zzflwVar.h;
        Bundle bundle = (Bundle) obj;
        if (arrayList == null) {
            return;
        }
        if (arrayList.isEmpty()) {
            bundle.putInt("native_version", 0);
            return;
        }
        bundle.putInt("native_version", 3);
        bundle.putStringArrayList("native_templates", arrayList);
        bundle.putStringArrayList("native_custom_templates", zzflwVar.i);
        zzbmk zzbmkVar = zzflwVar.j;
        if (zzbmkVar != null) {
            if (zzbmkVar.a > 3) {
                bundle.putBoolean("enable_native_media_orientation", true);
                int i = zzbmkVar.h;
                String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "unknown" : "square" : U3.i.D : U3.i.C : "any";
                if (!"unknown".equals(str)) {
                    bundle.putString("native_media_orientation", str);
                }
            }
            int i2 = zzbmkVar.c;
            String str2 = i2 != 0 ? i2 != 1 ? i2 != 2 ? "unknown" : U3.i.C : U3.i.D : "any";
            if (!"unknown".equals(str2)) {
                bundle.putString("native_image_orientation", str2);
            }
            bundle.putBoolean("native_multiple_images", zzbmkVar.d);
            bundle.putBoolean("use_custom_mute", zzbmkVar.g);
            int i3 = zzbmkVar.i;
            if (i3 != 0) {
                bundle.putBoolean("sccg_tap", zzbmkVar.j);
                bundle.putInt("sccg_dir", i3);
            }
        }
        PackageInfo packageInfo = this.b;
        int i4 = packageInfo != null ? packageInfo.versionCode : 0;
        com.google.android.gms.ads.internal.util.zzg zzgVar = this.c;
        if (i4 > zzgVar.zzg()) {
            zzgVar.zzt();
            zzgVar.zzf(i4);
        }
        JSONObject zzs = zzgVar.zzs();
        String str3 = null;
        if (zzs != null && (optJSONArray = zzs.optJSONArray(zzflwVar.g)) != null) {
            str3 = optJSONArray.toString();
        }
        if (!TextUtils.isEmpty(str3)) {
            bundle.putString("native_advanced_settings", str3);
        }
        int i5 = zzflwVar.l;
        if (i5 > 1) {
            bundle.putInt("max_num_ads", i5);
        }
        zzbst zzbstVar = zzflwVar.b;
        if (zzbstVar != null) {
            String str4 = zzbstVar.c;
            if (TextUtils.isEmpty(str4)) {
                int i6 = zzbstVar.a;
                String str5 = TtmlNode.TAG_P;
                if (i6 >= 2) {
                    int i7 = zzbstVar.d;
                    if (i7 != 2) {
                    }
                    str5 = "l";
                    bundle.putString("ia_var", str5);
                } else {
                    int i8 = zzbstVar.b;
                    if (i8 != 1) {
                        if (i8 != 2) {
                            StringBuilder sb = new StringBuilder(String.valueOf(i8).length() + 41);
                            sb.append("Instream ad video aspect ratio ");
                            sb.append(i8);
                            sb.append(" is wrong.");
                            zzo.zzf(sb.toString());
                        }
                        bundle.putString("ia_var", str5);
                    }
                    str5 = "l";
                    bundle.putString("ia_var", str5);
                }
            } else {
                bundle.putString("ad_tag", str4);
            }
            bundle.putBoolean("instr", true);
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ad)).booleanValue() || zzbmkVar == null) {
            return;
        }
        com.google.android.gms.ads.internal.client.zzfw zzfwVar = zzbmkVar.f;
        if (zzfwVar != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("startMuted", zzfwVar.zza);
            bundle2.putBoolean("clickToExpandRequested", zzfwVar.zzc);
            bundle2.putBoolean("customControlsRequested", zzfwVar.zzb);
            bundle.putBundle("video", bundle2);
        }
        bundle.putBoolean("disable_image_loading", zzbmkVar.b);
        bundle.putInt("preferred_ad_choices_position", zzbmkVar.e);
    }
}
