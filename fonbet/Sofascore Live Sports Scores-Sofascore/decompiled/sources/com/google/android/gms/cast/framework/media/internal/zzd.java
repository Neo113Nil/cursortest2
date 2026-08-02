package com.google.android.gms.cast.framework.media.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.RemoteException;
import com.google.android.gms.cast.framework.ModuleUnavailableException;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.cast.zzay;
import com.google.android.gms.internal.cast.zzbc;
import defpackage.wqn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzd extends AsyncTask {
    public static final Logger c = new Logger("FetchBitmapTask", null);
    public final zzg a;
    public final zzb b;

    public zzd(Context context, int i, int i2, zzb zzbVar) {
        zzg zzgVar;
        this.b = zzbVar;
        Context applicationContext = context.getApplicationContext();
        wqn wqnVar = new wqn(this);
        Logger logger = zzay.a;
        try {
            zzbc a = zzay.a(applicationContext.getApplicationContext());
            zzgVar = a.zze() >= 233700000 ? a.b1(new ObjectWrapper(applicationContext.getApplicationContext()), new ObjectWrapper(this), wqnVar, i, i2) : a.d4(new ObjectWrapper(this), wqnVar, i, i2);
        } catch (RemoteException | ModuleUnavailableException unused) {
            zzay.a.b("Unable to call %s on %s.", "newFetchBitmapTaskImpl", "zzbc");
            zzgVar = null;
        }
        this.a = zzgVar;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Uri uri;
        zzg zzgVar;
        Uri[] uriArr = (Uri[]) objArr;
        if (uriArr.length == 1 && (uri = uriArr[0]) != null && (zzgVar = this.a) != null) {
            try {
                return zzgVar.b0(uri);
            } catch (RemoteException unused) {
                c.b("Unable to call %s on %s.", "doFetch", "zzg");
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        zzb zzbVar = this.b;
        if (zzbVar != null) {
            zza zzaVar = zzbVar.e;
            if (zzaVar != null) {
                zzaVar.b(bitmap);
            }
            zzbVar.d = null;
        }
    }
}
