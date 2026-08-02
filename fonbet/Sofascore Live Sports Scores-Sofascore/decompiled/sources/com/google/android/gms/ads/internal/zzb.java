package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcbc;
import com.google.android.gms.internal.ads.zzcef;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzb {
    public final Context a;
    public boolean b;
    public final zzcef c;
    public final zzcbc d = new zzcbc(Collections.EMPTY_LIST, false);

    public zzb(Context context, @Nullable zzcef zzcefVar, @Nullable zzcbc zzcbcVar) {
        this.a = context;
        this.c = zzcefVar;
    }

    public final void zza() {
        this.b = true;
    }

    public final boolean zzb() {
        zzcef zzcefVar = this.c;
        return ((zzcefVar == null || !zzcefVar.zza().f) && !this.d.a) || this.b;
    }

    public final void zzc(@Nullable String str) {
        List<String> list;
        zzcbc zzcbcVar = this.d;
        zzcef zzcefVar = this.c;
        if ((zzcefVar == null || !zzcefVar.zza().f) && !zzcbcVar.a) {
            return;
        }
        if (str == null) {
            str = "";
        }
        if (zzcefVar != null) {
            zzcefVar.a(3, str, null);
            return;
        }
        if (!zzcbcVar.a || (list = zzcbcVar.b) == null) {
            return;
        }
        for (String str2 : list) {
            if (!TextUtils.isEmpty(str2)) {
                String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzO(this.a, "", replace);
            }
        }
    }
}
