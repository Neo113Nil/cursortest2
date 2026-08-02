package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.dti;
import defpackage.hj2;
import defpackage.jbd;
import defpackage.ktd;
import defpackage.ltd;
import defpackage.md4;
import defpackage.n5h;
import defpackage.nad;
import defpackage.nq8;
import defpackage.ti3;
import defpackage.ww9;
import defpackage.xbl;
import defpackage.yz1;
import defpackage.zbl;
import defpackage.zm3;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes.dex */
public class WorkManagerUtil extends zzbn {
    @UsedByReflection("This class must be instantiated reflectively so that the default class loader can be used.")
    public WorkManagerUtil() {
    }

    @Override // com.google.android.gms.ads.internal.util.zzbo
    public final boolean zze(@NonNull IObjectWrapper iObjectWrapper, @NonNull String str, @NonNull String str2) {
        return zzg(iObjectWrapper, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, ""));
    }

    @Override // com.google.android.gms.ads.internal.util.zzbo
    public final void zzf(@NonNull IObjectWrapper iObjectWrapper) {
        Context context = (Context) ObjectWrapper.Z1(iObjectWrapper);
        try {
            Context applicationContext = context.getApplicationContext();
            ti3 ti3Var = new ti3(new yz1(1));
            applicationContext.getClass();
            xbl.e(applicationContext, ti3Var);
        } catch (IllegalStateException unused) {
        }
        try {
            context.getClass();
            xbl d = xbl.d(context);
            d.getClass();
            dti dtiVar = d.b.g;
            String concat = "CancelWorkByTag_".concat("offline_ping_sender_work");
            n5h n5hVar = ((zbl) d.d).a;
            n5hVar.getClass();
            nq8.G(dtiVar, concat, n5hVar, new hj2(d, 0));
            jbd jbdVar = jbd.a;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            zm3 zm3Var = new zm3(new nad(null), jbd.b, false, false, false, false, -1L, -1L, CollectionsKt.W0(linkedHashSet));
            ktd ktdVar = new ktd(OfflinePingSender.class);
            ktdVar.c.j = zm3Var;
            ktdVar.d.add("offline_ping_sender_work");
            d.a((ltd) ktdVar.a());
        } catch (IllegalStateException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to instantiate WorkManager.", e);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbo
    public final boolean zzg(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) {
        Context context = (Context) ObjectWrapper.Z1(iObjectWrapper);
        try {
            Context applicationContext = context.getApplicationContext();
            ti3 ti3Var = new ti3(new yz1(1));
            applicationContext.getClass();
            xbl.e(applicationContext, ti3Var);
        } catch (IllegalStateException unused) {
        }
        jbd jbdVar = jbd.a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        zm3 zm3Var = new zm3(new nad(null), jbd.b, false, false, false, false, -1L, -1L, CollectionsKt.W0(linkedHashSet));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("uri", zzaVar.zza);
        linkedHashMap.put("gws_query_id", zzaVar.zzb);
        linkedHashMap.put(CampaignEx.JSON_KEY_IMAGE_URL, zzaVar.zzc);
        md4 md4Var = new md4(linkedHashMap);
        ww9.I(md4Var);
        ktd ktdVar = new ktd(OfflineNotificationPoster.class);
        ktdVar.c.j = zm3Var;
        ktd ktdVar2 = (ktd) ktdVar.f(md4Var);
        ktdVar2.d.add("offline_notification_work");
        ltd ltdVar = (ltd) ktdVar2.a();
        try {
            context.getClass();
            xbl d = xbl.d(context);
            d.getClass();
            d.a(ltdVar);
            return true;
        } catch (IllegalStateException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to instantiate WorkManager.", e);
            return false;
        }
    }
}
