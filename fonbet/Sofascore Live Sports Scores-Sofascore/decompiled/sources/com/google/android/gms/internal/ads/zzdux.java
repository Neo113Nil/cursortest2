package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.isn;
import defpackage.jsn;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdux extends zzbsv implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzbmf {
    public View a;
    public com.google.android.gms.ads.internal.client.zzea b;
    public zzdqm c;
    public boolean d;
    public boolean e;

    public final void E4(IObjectWrapper iObjectWrapper, zzbsz zzbszVar) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        Preconditions.e("#008 Must be called on the main UI thread.");
        if (this.d) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzf("Instream ad can not be shown after destroy().");
            try {
                zzbszVar.zzf(2);
                return;
            } catch (RemoteException e) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzl("#007 Could not call remote method.", e);
                return;
            }
        }
        View view = this.a;
        if (view == null || this.b == null) {
            String str = view == null ? "can not get video view." : "can not get video controller.";
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzf("Instream internal error: ".concat(str));
            try {
                zzbszVar.zzf(0);
                return;
            } catch (RemoteException e2) {
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzl("#007 Could not call remote method.", e2);
                return;
            }
        }
        if (this.e) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzf("Instream ad should not be used again.");
            try {
                zzbszVar.zzf(1);
                return;
            } catch (RemoteException e3) {
                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzl("#007 Could not call remote method.", e3);
                return;
            }
        }
        this.e = true;
        F4();
        ((ViewGroup) ObjectWrapper.Z1(iObjectWrapper)).addView(this.a, new ViewGroup.LayoutParams(-1, -1));
        com.google.android.gms.ads.internal.zzt.zzC();
        isn isnVar = new isn(this.a, this);
        View view2 = (View) ((WeakReference) isnVar.b).get();
        ViewTreeObserver viewTreeObserver3 = null;
        if (view2 == null || (viewTreeObserver = view2.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            viewTreeObserver = null;
        }
        if (viewTreeObserver != null) {
            isnVar.R(viewTreeObserver);
        }
        com.google.android.gms.ads.internal.zzt.zzC();
        jsn jsnVar = new jsn(this.a, this);
        View view3 = (View) ((WeakReference) jsnVar.b).get();
        if (view3 != null && (viewTreeObserver2 = view3.getViewTreeObserver()) != null && viewTreeObserver2.isAlive()) {
            viewTreeObserver3 = viewTreeObserver2;
        }
        if (viewTreeObserver3 != null) {
            jsnVar.R(viewTreeObserver3);
        }
        G4();
        try {
            zzbszVar.zze();
        } catch (RemoteException e4) {
            int i7 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzl("#007 Could not call remote method.", e4);
        }
    }

    public final void F4() {
        View view = this.a;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.a);
        }
    }

    public final void G4() {
        View view;
        zzdqm zzdqmVar = this.c;
        if (zzdqmVar == null || (view = this.a) == null) {
            return;
        }
        Map map = Collections.EMPTY_MAP;
        zzdqmVar.r(view, map, map, zzdqm.d(view));
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        G4();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        G4();
    }
}
