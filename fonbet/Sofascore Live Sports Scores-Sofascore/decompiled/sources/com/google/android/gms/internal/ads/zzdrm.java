package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import defpackage.fsn;
import defpackage.hsn;
import defpackage.isn;
import defpackage.jsn;
import defpackage.mio;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdrm extends zzbmy implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdso {
    public static final s o;
    public final String a;
    public FrameLayout c;
    public FrameLayout d;
    public final hsn e;
    public View f;
    public zzdqm h;
    public zzbfi i;
    public zzbms k;
    public boolean l;
    public GestureDetector n;
    public HashMap b = new HashMap();
    public IObjectWrapper j = null;
    public boolean m = false;
    public final int g = ModuleDescriptor.MODULE_VERSION;

    static {
        mio mioVar = zzgxm.b;
        Object[] objArr = {"2011", "1009", "3010"};
        zzgzf.a(3, objArr);
        o = zzgxm.z(3, objArr);
    }

    public zzdrm(FrameLayout frameLayout, FrameLayout frameLayout2) {
        String str;
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2 = null;
        this.c = frameLayout;
        this.d = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
            str = "3012";
        }
        this.a = str;
        com.google.android.gms.ads.internal.zzt.zzC();
        isn isnVar = new isn(frameLayout, this);
        View view = (View) ((WeakReference) isnVar.b).get();
        ViewTreeObserver viewTreeObserver3 = (view == null || (viewTreeObserver3 = view.getViewTreeObserver()) == null || !viewTreeObserver3.isAlive()) ? null : viewTreeObserver3;
        if (viewTreeObserver3 != null) {
            isnVar.R(viewTreeObserver3);
        }
        com.google.android.gms.ads.internal.zzt.zzC();
        jsn jsnVar = new jsn(frameLayout, this);
        View view2 = (View) ((WeakReference) jsnVar.b).get();
        if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null && viewTreeObserver.isAlive()) {
            viewTreeObserver2 = viewTreeObserver;
        }
        if (viewTreeObserver2 != null) {
            jsnVar.R(viewTreeObserver2);
        }
        this.e = zzcgj.f;
        this.i = new zzbfi(this.c.getContext(), this.c);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    public final synchronized void E4() {
        int zzu;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.jd)).booleanValue()) {
            zzdqm zzdqmVar = this.h;
            synchronized (zzdqmVar) {
                zzu = zzdqmVar.n.zzu();
            }
            if (zzu != 0) {
                this.n = new GestureDetector(this.c.getContext(), new zzdru(this.h, this));
            }
        }
    }

    public final synchronized void F4(String str) {
        DisplayMetrics displayMetrics;
        try {
            View frameLayout = new FrameLayout(this.d.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Context context = this.d.getContext();
            frameLayout.setClickable(false);
            frameLayout.setFocusable(false);
            if (!TextUtils.isEmpty(str)) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                Resources resources = context.getResources();
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                    try {
                        byte[] decode = Base64.decode(str, 0);
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeByteArray(decode, 0, decode.length));
                        bitmapDrawable.setTargetDensity(displayMetrics.densityDpi);
                        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                        bitmapDrawable.setTileModeXY(tileMode, tileMode);
                        frameLayout.setBackground(bitmapDrawable);
                    } catch (IllegalArgumentException e) {
                        zzo.zzj("Encountered invalid base64 watermark.", e);
                    }
                }
            }
            this.d.addView(frameLayout);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final synchronized void J(View view, String str) {
        if (!this.m) {
            HashMap hashMap = this.b;
            if (view == null) {
                hashMap.remove(str);
                return;
            }
            hashMap.put(str, new WeakReference(view));
            if (!NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) && !"3011".equals(str)) {
                if (com.google.android.gms.ads.internal.util.zzbs.zza(this.g)) {
                    view.setOnTouchListener(this);
                }
                view.setClickable(true);
                view.setOnClickListener(this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final FrameLayout S1() {
        return this.d;
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final /* synthetic */ View l2() {
        return this.c;
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        boolean zzv;
        zzdqm zzdqmVar = this.h;
        if (zzdqmVar != null) {
            synchronized (zzdqmVar) {
                zzv = zzdqmVar.n.zzv();
            }
            if (zzv) {
                zzdqm zzdqmVar2 = this.h;
                synchronized (zzdqmVar2) {
                    zzdqmVar2.n.zzq();
                }
                this.h.q(view, this.c, zzh(), zzi(), false);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        zzdqm zzdqmVar = this.h;
        if (zzdqmVar != null) {
            FrameLayout frameLayout = this.c;
            zzdqmVar.r(frameLayout, zzh(), zzi(), zzdqm.d(frameLayout));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        zzdqm zzdqmVar = this.h;
        if (zzdqmVar != null) {
            FrameLayout frameLayout = this.c;
            zzdqmVar.r(frameLayout, zzh(), zzi(), zzdqm.d(frameLayout));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        int zzu;
        zzdqm zzdqmVar = this.h;
        if (zzdqmVar != null) {
            FrameLayout frameLayout = this.c;
            synchronized (zzdqmVar) {
                zzdqmVar.n.k(motionEvent, frameLayout);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.jd)).booleanValue() && this.n != null) {
                zzdqm zzdqmVar2 = this.h;
                synchronized (zzdqmVar2) {
                    zzu = zzdqmVar2.n.zzu();
                }
                if (zzu != 0) {
                    this.n.onTouchEvent(motionEvent);
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final synchronized void zza(String str, IObjectWrapper iObjectWrapper) {
        J((View) ObjectWrapper.Z1(iObjectWrapper), str);
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final synchronized IObjectWrapper zzb(String str) {
        return new ObjectWrapper(zzk(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final synchronized void zzc(IObjectWrapper iObjectWrapper) {
        if (this.m) {
            return;
        }
        Object Z1 = ObjectWrapper.Z1(iObjectWrapper);
        if (!(Z1 instanceof zzdqm)) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("Not an instance of native engine. This is most likely a transient error");
            return;
        }
        zzdqm zzdqmVar = this.h;
        if (zzdqmVar != null) {
            zzdqmVar.p(this);
        }
        synchronized (this) {
            this.e.execute(new fsn(this, 23));
            zzdqm zzdqmVar2 = (zzdqm) Z1;
            this.h = zzdqmVar2;
            zzdqmVar2.o(this);
            this.h.f(this.c);
            zzdqm zzdqmVar3 = this.h;
            FrameLayout frameLayout = this.d;
            zzeml k = zzdqmVar3.m.k();
            if (zzdqmVar3.p.c() && k != null && frameLayout != null) {
                com.google.android.gms.ads.internal.zzt.zzu().b(k.a, frameLayout);
            }
            if (this.l) {
                zzdqo zzdqoVar = this.h.F;
                zzbms zzbmsVar = this.k;
                synchronized (zzdqoVar) {
                    zzdqoVar.a = zzbmsVar;
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.V4)).booleanValue() && !TextUtils.isEmpty(this.h.p.e())) {
                F4(this.h.p.e());
            }
            E4();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final synchronized void zzd() {
        try {
            if (this.m) {
                return;
            }
            zzdqm zzdqmVar = this.h;
            if (zzdqmVar != null) {
                zzdqmVar.p(this);
                this.h = null;
            }
            this.b.clear();
            this.c.removeAllViews();
            this.d.removeAllViews();
            this.b = null;
            this.c = null;
            this.d = null;
            this.f = null;
            this.i = null;
            this.m = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final synchronized void zzdB(IObjectWrapper iObjectWrapper) {
        zzdqm zzdqmVar = this.h;
        View view = (View) ObjectWrapper.Z1(iObjectWrapper);
        synchronized (zzdqmVar) {
            zzdqmVar.n.b(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final synchronized void zzdC(IObjectWrapper iObjectWrapper) {
        if (this.m) {
            return;
        }
        this.j = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final void zzdD(IObjectWrapper iObjectWrapper) {
        onTouch(this.c, (MotionEvent) ObjectWrapper.Z1(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final synchronized void zzdE(zzbms zzbmsVar) {
        if (!this.m) {
            this.l = true;
            this.k = zzbmsVar;
            zzdqm zzdqmVar = this.h;
            if (zzdqmVar != null) {
                zzdqo zzdqoVar = zzdqmVar.F;
                synchronized (zzdqoVar) {
                    zzdqoVar.a = zzbmsVar;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmz
    public final synchronized void zze(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final zzbfi zzf() {
        return this.i;
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final synchronized Map zzh() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final synchronized Map zzi() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final synchronized Map zzj() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final synchronized View zzk(String str) {
        WeakReference weakReference;
        if (!this.m && (weakReference = (WeakReference) this.b.get(str)) != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final synchronized String zzl() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final IObjectWrapper zzm() {
        return this.j;
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final synchronized JSONObject zzn() {
        JSONObject l;
        zzdqm zzdqmVar = this.h;
        if (zzdqmVar == null) {
            return null;
        }
        FrameLayout frameLayout = this.c;
        Map zzh = zzh();
        Map zzi = zzi();
        synchronized (zzdqmVar) {
            l = zzdqmVar.n.l(frameLayout, zzh, zzi, zzdqmVar.k());
        }
        return l;
    }

    @Override // com.google.android.gms.internal.ads.zzdso
    public final synchronized JSONObject zzo() {
        JSONObject d;
        zzdqm zzdqmVar = this.h;
        if (zzdqmVar == null) {
            return null;
        }
        FrameLayout frameLayout = this.c;
        Map zzh = zzh();
        Map zzi = zzi();
        synchronized (zzdqmVar) {
            d = zzdqmVar.n.d(frameLayout, zzh, zzi, zzdqmVar.k());
        }
        return d;
    }
}
