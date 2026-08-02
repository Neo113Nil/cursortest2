package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbmx;
import com.google.android.gms.internal.ads.zzbmy;
import com.google.android.gms.internal.ads.zzbmz;
import com.google.android.gms.internal.ads.zzbnc;
import com.google.android.gms.internal.ads.zzboo;
import com.google.android.gms.internal.ads.zzcaq;
import com.google.android.gms.internal.ads.zzcas;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
final class zzav extends zzax {
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ zzaw e;

    public zzav(zzaw zzawVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.b = frameLayout;
        this.c = frameLayout2;
        this.d = context;
        this.e = zzawVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaw.a(this.d, "native_ad_view_delegate");
        return new zzfk();
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    @Nullable
    public final Object zzb() throws RemoteException {
        Context context = this.d;
        zzbjg.a(context);
        boolean booleanValue = ((Boolean) zzba.zzc().a(zzbjg.oc)).booleanValue();
        zzaw zzawVar = this.e;
        FrameLayout frameLayout = this.c;
        FrameLayout frameLayout2 = this.b;
        if (booleanValue) {
            try {
                return zzbmy.zzdG(((zzbnc) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", zzau.a)).v1(new ObjectWrapper(context), new ObjectWrapper(frameLayout2), new ObjectWrapper(frameLayout)));
            } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e) {
                zzcas c = zzcaq.c(context);
                zzawVar.f = c;
                c.a("ClientApiBroker.createNativeAdViewDelegate", e);
                return null;
            }
        }
        zzboo zzbooVar = zzawVar.d;
        zzbooVar.getClass();
        try {
            IBinder v1 = ((zzbnc) zzbooVar.b(context)).v1(new ObjectWrapper(context), new ObjectWrapper(frameLayout2), new ObjectWrapper(frameLayout));
            if (v1 == null) {
                return null;
            }
            IInterface queryLocalInterface = v1.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return queryLocalInterface instanceof zzbmz ? (zzbmz) queryLocalInterface : new zzbmx(v1);
        } catch (RemoteException e2) {
            e = e2;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not create remote NativeAdViewDelegate.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e3) {
            e = e3;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzax
    public final Object zzc(zzco zzcoVar) throws RemoteException {
        return zzcoVar.zzd(new ObjectWrapper(this.b), new ObjectWrapper(this.c));
    }
}
