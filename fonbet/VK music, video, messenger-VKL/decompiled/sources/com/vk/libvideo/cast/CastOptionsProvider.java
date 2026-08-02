package com.vk.libvideo.cast;

import android.content.Context;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.cast.framework.zzk;
import com.google.android.gms.cast.framework.zzm;
import com.google.android.gms.internal.cast.zzhc;
import com.google.android.gms.internal.cast.zzhd;
import java.util.ArrayList;
import java.util.List;
import one.video.cast.activity.ExpandedControlsActivity;
import xsna.cu80;
import xsna.fxc0;
import xsna.lui0;

/* compiled from: CastOptionsProvider.kt */
/* loaded from: classes2.dex */
public final class CastOptionsProvider implements cu80 {
    public final boolean a = fxc0.B().J().V0();
    public final boolean b = fxc0.B().J().N();

    @Override // xsna.cu80
    public List<lui0> getAdditionalSessionProviders(Context context) {
        return null;
    }

    @Override // xsna.cu80
    public CastOptions getCastOptions(Context context) {
        boolean z = this.a;
        boolean z2 = this.b;
        if (z) {
            new NotificationOptions.a().a();
            ArrayList arrayList = new ArrayList();
            LaunchOptions launchOptions = new LaunchOptions();
            zzhc.zzb();
            ArrayList arrayList2 = new ArrayList();
            String str = z2 ? "B5C651B5" : "07A4434E";
            CastMediaOptions castMediaOptions = (CastMediaOptions) zzhc.zzc(new CastMediaOptions("com.google.android.gms.cast.framework.media.MediaIntentReceiver", null, null, null, false, true)).zza(CastOptions.v);
            zzk zzkVar = CastOptions.t;
            zzhd.zza(zzkVar, "use Optional.orNull() instead of Optional.or(null)");
            zzm zzmVar = CastOptions.u;
            zzhd.zza(zzmVar, "use Optional.orNull() instead of Optional.or(null)");
            return new CastOptions(str, arrayList, false, launchOptions, true, castMediaOptions, true, 0.05000000074505806d, false, false, false, arrayList2, true, false, zzkVar, zzmVar, false, false);
        }
        NotificationOptions.a aVar = new NotificationOptions.a();
        aVar.a = ExpandedControlsActivity.class.getName();
        NotificationOptions a = aVar.a();
        new NotificationOptions.a().a();
        CastMediaOptions castMediaOptions2 = new CastMediaOptions("com.google.android.gms.cast.framework.media.MediaIntentReceiver", ExpandedControlsActivity.class.getName(), null, a, false, true);
        ArrayList arrayList3 = new ArrayList();
        LaunchOptions launchOptions2 = new LaunchOptions();
        zzhc.zzb();
        ArrayList arrayList4 = new ArrayList();
        String str2 = z2 ? "B5C651B5" : "07A4434E";
        CastMediaOptions castMediaOptions3 = (CastMediaOptions) zzhc.zzc(castMediaOptions2).zza(CastOptions.v);
        zzk zzkVar2 = CastOptions.t;
        zzhd.zza(zzkVar2, "use Optional.orNull() instead of Optional.or(null)");
        zzm zzmVar2 = CastOptions.u;
        zzhd.zza(zzmVar2, "use Optional.orNull() instead of Optional.or(null)");
        return new CastOptions(str2, arrayList3, false, launchOptions2, true, castMediaOptions3, true, 0.05000000074505806d, false, false, false, arrayList4, true, false, zzkVar2, zzmVar2, false, false);
    }
}
