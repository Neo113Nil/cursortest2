package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.isn;
import defpackage.jsn;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdrk extends zzbnd implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdso {
    public final WeakReference a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public zzdqm e;
    public final zzbfi f;

    public zzdrk(View view, HashMap hashMap, HashMap hashMap2) {
        ViewTreeObserver viewTreeObserver;
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        com.google.android.gms.ads.internal.zzt.zzC();
        isn isnVar = new isn(view, this);
        View view2 = (View) ((WeakReference) isnVar.b).get();
        ViewTreeObserver viewTreeObserver2 = null;
        ViewTreeObserver viewTreeObserver3 = (view2 == null || (viewTreeObserver3 = view2.getViewTreeObserver()) == null || !viewTreeObserver3.isAlive()) ? null : viewTreeObserver3;
        if (viewTreeObserver3 != null) {
            isnVar.R(viewTreeObserver3);
        }
        com.google.android.gms.ads.internal.zzt.zzC();
        jsn jsnVar = new jsn(view, this);
        View view3 = (View) ((WeakReference) jsnVar.b).get();
        if (view3 != null && (viewTreeObserver = view3.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            jsnVar.R(viewTreeObserver2);
        }
        this.a = new WeakReference(view);
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            View view4 = (View) entry.getValue();
            if (view4 != null) {
                this.b.put(str, new WeakReference(view4));
                if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
                    view4.setOnTouchListener(this);
                    view4.setClickable(true);
                    view4.setOnClickListener(this);
                }
            }
        }
        this.d.putAll(this.b);
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            View view5 = (View) entry2.getValue();
            if (view5 != null) {
                this.c.put((String) entry2.getKey(), new WeakReference(view5));
                view5.setOnTouchListener(this);
                view5.setClickable(false);
            }
        }
        this.d.putAll(this.c);
        this.f = new zzbfi(view.getContext(), view);
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final synchronized void J(View view, String str) {
        this.d.put(str, new WeakReference(view));
        if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
            this.b.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final FrameLayout S1() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final View l2() {
        return (View) this.a.get();
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        zzdqm zzdqmVar = this.e;
        if (zzdqmVar != null) {
            zzdqmVar.q(view, l2(), zzh(), zzi(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzdqm zzdqmVar = this.e;
        if (zzdqmVar != null) {
            zzdqmVar.r(l2(), zzh(), zzi(), zzdqm.d(l2()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzdqm zzdqmVar = this.e;
        if (zzdqmVar != null) {
            zzdqmVar.r(l2(), zzh(), zzi(), zzdqm.d(l2()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdqm zzdqmVar = this.e;
        if (zzdqmVar != null) {
            View l2 = l2();
            synchronized (zzdqmVar) {
                zzdqmVar.n.k(motionEvent, l2);
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final zzbfi zzf() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final synchronized Map zzh() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final synchronized Map zzi() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final synchronized Map zzj() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final synchronized View zzk(String str) {
        WeakReference weakReference = (WeakReference) this.d.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.gms.internal.ads.zzdso
    public final synchronized String zzl() {
        return "1007";
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final synchronized IObjectWrapper zzm() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final synchronized JSONObject zzn() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final synchronized JSONObject zzo() {
        JSONObject d;
        zzdqm zzdqmVar = this.e;
        if (zzdqmVar == null) {
            return null;
        }
        View l2 = l2();
        Map zzh = zzh();
        Map zzi = zzi();
        synchronized (zzdqmVar) {
            d = zzdqmVar.n.d(l2, zzh, zzi, zzdqmVar.k());
        }
        return d;
    }
}
