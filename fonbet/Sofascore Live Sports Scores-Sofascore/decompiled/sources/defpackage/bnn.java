package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.PowerManager;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzfw;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.n;
import com.google.android.gms.internal.ads.s;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbkf;
import com.google.android.gms.internal.ads.zzbmd;
import com.google.android.gms.internal.ads.zzbme;
import com.google.android.gms.internal.ads.zzbmg;
import com.google.android.gms.internal.ads.zzbmk;
import com.google.android.gms.internal.ads.zzbms;
import com.google.android.gms.internal.ads.zzbsr;
import com.google.android.gms.internal.ads.zzbtp;
import com.google.android.gms.internal.ads.zzcaq;
import com.google.android.gms.internal.ads.zzcas;
import com.google.android.gms.internal.ads.zzcbt;
import com.google.android.gms.internal.ads.zzcgo;
import com.google.android.gms.internal.ads.zzchj;
import com.google.android.gms.internal.ads.zzcht;
import com.google.android.gms.internal.ads.zzcix;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzcmi;
import com.google.android.gms.internal.ads.zzcms;
import com.google.android.gms.internal.ads.zzcub;
import com.google.android.gms.internal.ads.zzcvi;
import com.google.android.gms.internal.ads.zzdn;
import com.google.android.gms.internal.ads.zzdqm;
import com.google.android.gms.internal.ads.zzdqo;
import com.google.android.gms.internal.ads.zzdqr;
import com.google.android.gms.internal.ads.zzdqw;
import com.google.android.gms.internal.ads.zzdrm;
import com.google.android.gms.internal.ads.zzdrq;
import com.google.android.gms.internal.ads.zzdso;
import com.google.android.gms.internal.ads.zzeaj;
import com.google.android.gms.internal.ads.zzeau;
import com.google.android.gms.internal.ads.zzecu;
import com.google.android.gms.internal.ads.zzefd;
import com.google.android.gms.internal.ads.zzeg;
import com.google.android.gms.internal.ads.zzenq;
import com.google.android.gms.internal.ads.zzeux;
import com.google.android.gms.internal.ads.zzfjg;
import com.google.android.gms.internal.ads.zzflw;
import com.google.android.gms.internal.ads.zzfmd;
import com.google.android.gms.internal.ads.zzfmu;
import com.google.android.gms.internal.ads.zzfqw;
import com.google.android.gms.internal.ads.zzfrj;
import com.google.android.gms.internal.ads.zzftp;
import com.google.android.gms.internal.ads.zzfvd;
import com.google.android.gms.internal.ads.zzfvk;
import com.google.android.gms.internal.ads.zzfvq;
import com.google.android.gms.internal.ads.zzgrk;
import com.google.android.gms.internal.ads.zzgrl;
import com.google.android.gms.internal.ads.zzgrm;
import com.google.android.gms.internal.ads.zzgtj;
import com.google.android.gms.internal.ads.zzgxi;
import com.google.android.gms.internal.ads.zzgxm;
import com.google.android.gms.internal.ads.zzhcx;
import com.google.android.gms.internal.ads.zzhcy;
import com.google.android.gms.internal.cast.zzbx;
import com.google.android.gms.internal.playcore_hsdp.zzc;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzic;
import com.google.android.gms.measurement.internal.zzjp;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzpp;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class bnn implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public bnn(zzlj zzljVar, AtomicReference atomicReference) {
        this.a = 27;
        this.b = atomicReference;
        Objects.requireNonNull(zzljVar);
        this.c = zzljVar;
    }

    private final void a() {
        PowerManager.WakeLock wakeLock;
        nzk nzkVar = (nzk) this.b;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
        synchronized (nzkVar) {
            if (!atomicBoolean.get() || (wakeLock = nzkVar.b) == null) {
                return;
            }
            wakeLock.release();
        }
    }

    private final void b() {
        Object zzgrkVar;
        zzgrm zzgrmVar;
        IBinder iBinder = (IBinder) this.c;
        int i = zzgrl.a;
        if (iBinder == null) {
            zzgrkVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
            zzgrkVar = queryLocalInterface instanceof zzgrm ? (zzgrm) queryLocalInterface : new zzgrk(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
        }
        zxc zxcVar = (zxc) this.b;
        u53 u53Var = (u53) zxcVar.b;
        u53Var.i = zzgrkVar;
        ((zzgtj) u53Var.d).a("linkToDeath", new Object[0]);
        try {
            zzgrmVar = (zzgrm) u53Var.i;
        } catch (RemoteException e) {
            ((zzgtj) ((u53) zxcVar.b).d).d(e, "linkToDeath failed", new Object[0]);
        }
        if (zzgrmVar == null) {
            throw null;
        }
        zzgrmVar.asBinder().linkToDeath((fnn) u53Var.g, 0);
        u53 u53Var2 = (u53) zxcVar.b;
        u53Var2.a = false;
        synchronized (((ArrayList) u53Var2.e)) {
            try {
                Iterator it = ((ArrayList) u53Var2.e).iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                ((ArrayList) u53Var2.e).clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c() {
        IBinder iBinder = (IBinder) this.c;
        b1p b1pVar = (b1p) this.b;
        synchronized (b1pVar) {
            if (iBinder == null) {
                b1pVar.d("Null service connection");
                return;
            }
            try {
                b1pVar.c = new gvo(iBinder);
                b1pVar.a = 2;
                b1pVar.f.b.execute(new uro(b1pVar, 1));
            } catch (RemoteException e) {
                b1pVar.d(e.getMessage());
            }
        }
    }

    private final void d() {
        AtomicReference atomicReference = (AtomicReference) this.b;
        synchronized (atomicReference) {
            try {
                try {
                    zzic zzicVar = (zzic) ((zzlj) this.c).b;
                    atomicReference.set(Long.valueOf(zzicVar.d.Y(zzicVar.q().W(), zzfy.c0)));
                } finally {
                    ((AtomicReference) this.b).notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0454 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        IInterface iInterface;
        DataOutputStream dataOutputStream;
        MediaPlayer.TrackInfo[] trackInfoArr;
        MediaFormat format;
        ViewGroup viewGroup;
        zzdqr zzdqrVar;
        View view;
        View view2;
        ViewGroup viewGroup2;
        zzbms zzbmsVar;
        Drawable drawable;
        zzeau zzeauVar;
        zzfmu a;
        Executor executor;
        zzecu zzecuVar;
        String b;
        DataOutputStream dataOutputStream2 = null;
        dataOutputStream2 = null;
        int i = 2;
        int i2 = 1;
        int i3 = 0;
        switch (this.a) {
            case 0:
                if (((zmn) this.b).isCancelled()) {
                    ((Future) this.c).cancel(true);
                    return;
                }
                return;
            case 1:
                zxc zxcVar = (zxc) this.b;
                i1k i1kVar = (i1k) zxcVar.b;
                i1kVar.k = (IInterface) ((eln) i1kVar.h).e((IBinder) this.c);
                Iterator it = ((CopyOnWriteArrayList) i1kVar.f).iterator();
                while (it.hasNext()) {
                    ((rfn) it.next()).getClass();
                }
                try {
                    iInterface = (IInterface) i1kVar.k;
                } catch (RemoteException unused) {
                }
                if (iInterface == null) {
                    throw null;
                }
                iInterface.asBinder().linkToDeath((fnn) i1kVar.i, 0);
                i1k i1kVar2 = (i1k) zxcVar.b;
                i1kVar2.a = false;
                synchronized (((ArrayList) i1kVar2.e)) {
                    try {
                        Iterator it2 = ((ArrayList) i1kVar2.e).iterator();
                        while (it2.hasNext()) {
                            ((Runnable) it2.next()).run();
                        }
                        ((ArrayList) i1kVar2.e).clear();
                    } finally {
                    }
                }
                return;
            case 2:
                zzbtp zzbtpVar = (zzbtp) this.b;
                String str = (String) this.c;
                zzclm zzclmVar = zzbtpVar.a;
                if (zzclmVar != null) {
                    zzclmVar.loadUrl(str);
                    return;
                }
                return;
            case 3:
                ((zzbx) this.b).l2((ibc) this.c);
                return;
            case 4:
                Parcelable.Creator<zzcbt> creator = zzcbt.CREATOR;
                byte[] bArr = (byte[]) this.c;
                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = (ParcelFileDescriptor.AutoCloseOutputStream) this.b;
                try {
                    try {
                        dataOutputStream = new DataOutputStream(autoCloseOutputStream);
                    } catch (IOException e) {
                        e = e;
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    dataOutputStream.writeInt(bArr.length);
                    dataOutputStream.write(bArr);
                    IOUtils.a(dataOutputStream);
                    return;
                } catch (IOException e2) {
                    e = e2;
                    dataOutputStream2 = dataOutputStream;
                    int i4 = zze.zza;
                    zzo.zzg("Error transporting the ad response", e);
                    zzt.zzh().d("LargeParcelTeleporter.pipeData.1", e);
                    if (dataOutputStream2 == null) {
                        IOUtils.a(autoCloseOutputStream);
                        return;
                    } else {
                        IOUtils.a(dataOutputStream2);
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    dataOutputStream2 = dataOutputStream;
                    if (dataOutputStream2 == null) {
                        IOUtils.a(autoCloseOutputStream);
                    } else {
                        IOUtils.a(dataOutputStream2);
                    }
                    throw th;
                }
            case 5:
                zzchj zzchjVar = (zzchj) this.c;
                MediaPlayer mediaPlayer = (MediaPlayer) this.b;
                zzcmi zzcmiVar = zzchjVar.c;
                if (((Boolean) zzba.zzc().a(zzbjg.G2)).booleanValue() && zzcmiVar != null && mediaPlayer != null) {
                    try {
                        MediaPlayer.TrackInfo[] trackInfo = mediaPlayer.getTrackInfo();
                        if (trackInfo != null) {
                            HashMap hashMap = new HashMap();
                            int i5 = 0;
                            while (i5 < trackInfo.length) {
                                MediaPlayer.TrackInfo trackInfo2 = trackInfo[i5];
                                if (trackInfo2 == null) {
                                    trackInfoArr = trackInfo;
                                } else {
                                    int trackType = trackInfo2.getTrackType();
                                    trackInfoArr = trackInfo;
                                    if (trackType == i2) {
                                        MediaFormat format2 = trackInfo2.getFormat();
                                        if (format2 != null) {
                                            if (format2.containsKey("frame-rate")) {
                                                try {
                                                    hashMap.put("frameRate", String.valueOf(format2.getFloat("frame-rate")));
                                                } catch (ClassCastException unused2) {
                                                    hashMap.put("frameRate", String.valueOf(format2.getInteger("frame-rate")));
                                                }
                                            }
                                            if (format2.containsKey("bitrate")) {
                                                Integer valueOf = Integer.valueOf(format2.getInteger("bitrate"));
                                                zzchjVar.s = valueOf;
                                                hashMap.put("bitRate", String.valueOf(valueOf));
                                            }
                                            if (format2.containsKey("width") && format2.containsKey("height")) {
                                                int integer = format2.getInteger("width");
                                                int integer2 = format2.getInteger("height");
                                                StringBuilder sb = new StringBuilder(fn0.a(integer, i2) + String.valueOf(integer2).length());
                                                sb.append(integer);
                                                sb.append("x");
                                                sb.append(integer2);
                                                hashMap.put("resolution", sb.toString());
                                            }
                                            if (format2.containsKey("mime")) {
                                                hashMap.put("videoMime", format2.getString("mime"));
                                            }
                                            if (Build.VERSION.SDK_INT >= 30 && format2.containsKey("codecs-string")) {
                                                hashMap.put("videoCodec", format2.getString("codecs-string"));
                                            }
                                        }
                                    } else if (trackType == i && (format = trackInfo2.getFormat()) != null) {
                                        if (format.containsKey("mime")) {
                                            hashMap.put("audioMime", format.getString("mime"));
                                        }
                                        if (Build.VERSION.SDK_INT >= 30 && format.containsKey("codecs-string")) {
                                            hashMap.put("audioCodec", format.getString("codecs-string"));
                                        }
                                    }
                                }
                                i5++;
                                trackInfo = trackInfoArr;
                                i = 2;
                                i2 = 1;
                            }
                            if (!hashMap.isEmpty()) {
                                zzcmiVar.n("onMetadataEvent", hashMap);
                            }
                        }
                    } catch (RuntimeException e3) {
                        zzt.zzh().d("AdMediaPlayerView.reportMetadata", e3);
                    }
                }
                zzcht zzchtVar = zzchjVar.q;
                if (zzchtVar != null) {
                    zzchtVar.f();
                    return;
                }
                return;
            case 6:
                zzcix zzcixVar = (zzcix) this.b;
                String str2 = (String) this.c;
                zzcht zzchtVar2 = zzcixVar.g;
                if (zzchtVar2 != null) {
                    zzchtVar2.j("ExoPlayerAdapter error", str2);
                    return;
                }
                return;
            case 7:
                ((n) this.b).u0((String) this.c);
                return;
            case 8:
                zzcub zzcubVar = (zzcub) this.b;
                Throwable th3 = (Throwable) this.c;
                boolean booleanValue = ((Boolean) zzba.zzc().a(zzbjg.Vb)).booleanValue();
                Context context = zzcubVar.a;
                if (booleanValue) {
                    zzcas e4 = zzcaq.e(context);
                    zzcubVar.i = e4;
                    e4.a("AttributionReporting", th3);
                    return;
                } else {
                    zzcas c = zzcaq.c(context);
                    zzcubVar.h = c;
                    c.a("AttributionReportingSampled", th3);
                    return;
                }
            case 9:
                zzcvi zzcviVar = (zzcvi) this.b;
                JSONObject jSONObject = (JSONObject) this.c;
                String obj = jSONObject.toString();
                String m = wt3.m("Calling AFMA_updateActiveView(", obj, new StringBuilder(obj.length() + 31), ")");
                int i6 = zze.zza;
                zzo.zzd(m);
                zzcviVar.a.h("AFMA_updateActiveView", jSONObject);
                return;
            case 10:
                zzdn zzdnVar = (zzdn) this.b;
                Object obj2 = this.c;
                int i7 = zzdnVar.f - 1;
                zzdnVar.f = i7;
                if (i7 == 0) {
                    Object obj3 = zzdnVar.d;
                    zzdnVar.d = obj2;
                    if (obj3.equals(obj2)) {
                        return;
                    }
                    xto xtoVar = zzdnVar.c;
                    Integer num = (Integer) obj2;
                    int intValue = num.intValue();
                    cwo cwoVar = (cwo) xtoVar.b;
                    cwoVar.o();
                    cwoVar.p(1, 10, num);
                    cwoVar.p(2, 10, num);
                    pff pffVar = new pff(intValue);
                    zzeg zzegVar = cwoVar.m;
                    zzegVar.c(21, pffVar);
                    zzegVar.d();
                    return;
                }
                return;
            case 11:
                ((zzdqm) this.b).h((zzdso) this.c);
                return;
            case 12:
                zzdrq zzdrqVar = (zzdrq) this.b;
                zzdso zzdsoVar = (zzdso) this.c;
                zzdqw zzdqwVar = zzdrqVar.c;
                if (zzdqwVar.d() || zzdqwVar.b()) {
                    String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
                    for (int i8 = 0; i8 < 2; i8++) {
                        View zzk = zzdsoVar.zzk(strArr[i8]);
                        if (zzk instanceof ViewGroup) {
                            viewGroup = (ViewGroup) zzk;
                            Context context2 = zzdsoVar.l2().getContext();
                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                            zzdqrVar = zzdrqVar.d;
                            synchronized (zzdqrVar) {
                                view = zzdqrVar.d;
                            }
                            if (view != null) {
                                synchronized (zzdqrVar) {
                                    view2 = zzdqrVar.d;
                                }
                                zzbmk zzbmkVar = zzdrqVar.i;
                                if (zzbmkVar != null && viewGroup == null) {
                                    zzdrq.b(layoutParams, zzbmkVar.e);
                                    view2.setLayoutParams(layoutParams);
                                    viewGroup = null;
                                }
                            } else if (zzdqrVar.s() instanceof zzbmd) {
                                zzbmd zzbmdVar = (zzbmd) zzdqrVar.s();
                                if (viewGroup == null) {
                                    zzdrq.b(layoutParams, zzbmdVar.h);
                                    viewGroup = null;
                                }
                                zzbme zzbmeVar = new zzbme(context2);
                                Preconditions.i(zzbmdVar);
                                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(zzbme.b, null, null));
                                shapeDrawable.getPaint().setColor(zzbmdVar.d);
                                zzbmeVar.setLayoutParams(layoutParams);
                                zzbmeVar.setBackground(shapeDrawable);
                                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                                String str3 = zzbmdVar.a;
                                if (!TextUtils.isEmpty(str3)) {
                                    RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                                    TextView textView = new TextView(context2);
                                    textView.setLayoutParams(layoutParams3);
                                    textView.setId(1195835393);
                                    textView.setTypeface(Typeface.DEFAULT);
                                    textView.setText(str3);
                                    textView.setTextColor(zzbmdVar.e);
                                    textView.setTextSize(zzbmdVar.f);
                                    zzay.zza();
                                    int zzE = zzf.zzE(context2, 4);
                                    zzay.zza();
                                    textView.setPadding(zzE, 0, zzf.zzE(context2, 4), 0);
                                    zzbmeVar.addView(textView);
                                    layoutParams2.addRule(1, textView.getId());
                                }
                                ImageView imageView = new ImageView(context2);
                                imageView.setLayoutParams(layoutParams2);
                                imageView.setId(1195835394);
                                ArrayList arrayList = zzbmdVar.b;
                                if (arrayList != null && arrayList.size() > 1) {
                                    zzbmeVar.a = new AnimationDrawable();
                                    Iterator it3 = arrayList.iterator();
                                    while (it3.hasNext()) {
                                        try {
                                            zzbmeVar.a.addFrame((Drawable) ObjectWrapper.Z1(((zzbmg) it3.next()).zza()), zzbmdVar.g);
                                        } catch (Exception e5) {
                                            int i9 = zze.zza;
                                            zzo.zzg("Error while getting drawable.", e5);
                                        }
                                    }
                                    imageView.setBackground(zzbmeVar.a);
                                } else if (arrayList.size() == 1) {
                                    try {
                                        imageView.setImageDrawable((Drawable) ObjectWrapper.Z1(((zzbmg) arrayList.get(0)).zza()));
                                    } catch (Exception e6) {
                                        int i10 = zze.zza;
                                        zzo.zzg("Error while getting drawable.", e6);
                                    }
                                }
                                zzbmeVar.addView(imageView);
                                zzbmeVar.setContentDescription((CharSequence) zzba.zzc().a(zzbjg.Q4));
                                view2 = zzbmeVar;
                            } else {
                                view2 = null;
                            }
                            if (view2 != null) {
                                if (view2.getParent() instanceof ViewGroup) {
                                    ((ViewGroup) view2.getParent()).removeView(view2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.removeAllViews();
                                    viewGroup.addView(view2);
                                } else {
                                    zza zzaVar = new zza(zzdsoVar.l2().getContext());
                                    zzaVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                    zzaVar.addView(view2);
                                    FrameLayout S1 = zzdsoVar.S1();
                                    if (S1 != null) {
                                        S1.addView(zzaVar);
                                    }
                                }
                                zzdsoVar.J(view2, zzdsoVar.zzl());
                            }
                            s sVar = zzdrm.o;
                            int i11 = sVar.d;
                            int i12 = 0;
                            while (true) {
                                if (i12 < i11) {
                                    View zzk2 = zzdsoVar.zzk((String) sVar.get(i12));
                                    i12++;
                                    if (zzk2 instanceof ViewGroup) {
                                        viewGroup2 = (ViewGroup) zzk2;
                                    }
                                } else {
                                    viewGroup2 = null;
                                }
                            }
                            Object[] objArr = 0;
                            Object[] objArr2 = 0;
                            zzdrqVar.h.execute(new nkn(zzdrqVar, viewGroup2, false, 14));
                            if (viewGroup2 == null) {
                                return;
                            }
                            if (zzdrqVar.c(viewGroup2, true)) {
                                if (zzdqrVar.h() != null) {
                                    zzdqrVar.h().k0(new f0o((int) (objArr2 == true ? 1 : 0), (Object) zzdsoVar, (Object) viewGroup2));
                                    return;
                                }
                                return;
                            }
                            if (((Boolean) zzba.zzc().a(zzbjg.Gb)).booleanValue() && zzdrqVar.c(viewGroup2, false)) {
                                if (zzdqrVar.i() != null) {
                                    zzdqrVar.i().k0(new f0o((int) (objArr == true ? 1 : 0), (Object) zzdsoVar, (Object) viewGroup2));
                                    return;
                                }
                                return;
                            }
                            viewGroup2.removeAllViews();
                            View l2 = zzdsoVar.l2();
                            Context context3 = l2 != null ? l2.getContext() : null;
                            if (context3 != null) {
                                zzdqo zzdqoVar = zzdrqVar.j;
                                synchronized (zzdqoVar) {
                                    zzbmsVar = zzdqoVar.a;
                                }
                                if (zzbmsVar != null) {
                                    try {
                                        IObjectWrapper zzg = zzbmsVar.zzg();
                                        if (zzg == null || (drawable = (Drawable) ObjectWrapper.Z1(zzg)) == null) {
                                            return;
                                        }
                                        ImageView imageView2 = new ImageView(context3);
                                        imageView2.setImageDrawable(drawable);
                                        IObjectWrapper zzm = zzdsoVar.zzm();
                                        if (zzm != null) {
                                            if (((Boolean) zzba.zzc().a(zzbjg.m7)).booleanValue()) {
                                                imageView2.setScaleType((ImageView.ScaleType) ObjectWrapper.Z1(zzm));
                                                imageView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                                viewGroup2.addView(imageView2);
                                                return;
                                            }
                                        }
                                        imageView2.setScaleType(zzdrq.k);
                                        imageView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                        viewGroup2.addView(imageView2);
                                        return;
                                    } catch (RemoteException unused3) {
                                        int i13 = zze.zza;
                                        zzo.zzi("Could not get main image drawable");
                                        return;
                                    }
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
                viewGroup = null;
                Context context22 = zzdsoVar.l2().getContext();
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
                zzdqrVar = zzdrqVar.d;
                synchronized (zzdqrVar) {
                }
                break;
            case 13:
                final zzecu zzecuVar2 = (zzecu) ((ewm) this.b).b;
                String str4 = (String) this.c;
                Context context4 = zzecuVar2.f;
                int i14 = 5;
                zzfqw e7 = zzfqw.e(5, context4);
                e7.zza();
                try {
                    ArrayList arrayList2 = new ArrayList();
                    JSONObject jSONObject2 = new JSONObject(str4).getJSONObject("initializer_settings").getJSONObject("config");
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        final String next = keys.next();
                        final zzfqw e8 = zzfqw.e(i14, context4);
                        e8.zza();
                        e8.zzi(next);
                        final Object obj4 = new Object();
                        final zzcgo zzcgoVar = new zzcgo();
                        ddb g = zzhcy.g(zzcgoVar, ((Long) zzba.zzc().a(zzbjg.E2)).longValue(), TimeUnit.SECONDS, zzecuVar2.k);
                        zzecuVar2.l.a(next);
                        zzecuVar2.o.zza(next);
                        final long elapsedRealtime = zzt.zzk().elapsedRealtime();
                        g.addListener(new Runnable() { // from class: c3o
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                zzecu zzecuVar3 = zzecuVar2;
                                Object obj5 = obj4;
                                zzcgo zzcgoVar2 = zzcgoVar;
                                String str5 = next;
                                long j = elapsedRealtime;
                                zzfqw zzfqwVar = e8;
                                zzecuVar3.getClass();
                                synchronized (obj5) {
                                    try {
                                        if (!zzcgoVar2.isDone()) {
                                            zzecuVar3.d((int) (zzt.zzk().elapsedRealtime() - j), str5, "Timeout.", false);
                                            zzecuVar3.l.c(str5, "timeout");
                                            zzecuVar3.o.c(str5, "timeout");
                                            zzfrj zzfrjVar = zzecuVar3.p;
                                            zzfqwVar.zzk(AndroidInitializeBoldSDK.MSG_TIMEOUT);
                                            zzfqwVar.zzd(false);
                                            zzfrjVar.b(zzfqwVar.zzm());
                                            zzcgoVar2.zzc(Boolean.FALSE);
                                        }
                                    } catch (Throwable th4) {
                                        throw th4;
                                    }
                                }
                            }
                        }, zzecuVar2.i);
                        arrayList2.add(g);
                        a3o a3oVar = new a3o(elapsedRealtime, zzcgoVar, zzecuVar2, e8, obj4, next);
                        JSONObject optJSONObject = jSONObject2.optJSONObject(next);
                        ArrayList arrayList3 = new ArrayList();
                        if (optJSONObject != null) {
                            try {
                                JSONArray jSONArray = optJSONObject.getJSONArray("data");
                                int i15 = i3;
                                while (i15 < jSONArray.length()) {
                                    JSONObject jSONObject3 = jSONArray.getJSONObject(i15);
                                    String optString = jSONObject3.optString("format", "");
                                    JSONObject optJSONObject2 = jSONObject3.optJSONObject("data");
                                    Bundle bundle = new Bundle();
                                    if (optJSONObject2 != null) {
                                        Iterator<String> keys2 = optJSONObject2.keys();
                                        while (keys2.hasNext()) {
                                            String next2 = keys2.next();
                                            bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                            jSONArray = jSONArray;
                                        }
                                    }
                                    JSONArray jSONArray2 = jSONArray;
                                    arrayList3.add(new zzbsr(bundle, optString));
                                    i15++;
                                    jSONArray = jSONArray2;
                                }
                            } catch (JSONException unused4) {
                            }
                        }
                        zzecuVar2.d(0, next, "", false);
                        try {
                            a = zzecuVar2.h.a(next, new JSONObject());
                            executor = zzecuVar2.j;
                            try {
                                zzecuVar = zzecuVar2;
                            } catch (zzfmd e9) {
                                e = e9;
                            }
                        } catch (zzfmd e10) {
                            e = e10;
                        }
                        try {
                            zzecuVar2 = zzecuVar;
                            executor.execute(new g3g(zzecuVar, next, a3oVar, a, arrayList3, 4, false));
                        } catch (zzfmd e11) {
                            e = e11;
                            zzecuVar2 = zzecuVar;
                            a3oVar = a3oVar;
                            try {
                                String str5 = "Failed to create Adapter.";
                                if (((Boolean) zzba.zzc().a(zzbjg.Pe)).booleanValue()) {
                                    String message = e.getMessage();
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 26);
                                    sb2.append("Failed to create Adapter.");
                                    sb2.append(" ");
                                    sb2.append(message);
                                    str5 = sb2.toString();
                                }
                                a3oVar.zzf(str5);
                            } catch (RemoteException e12) {
                                int i16 = zze.zza;
                                zzo.zzg("", e12);
                            }
                            i14 = 5;
                            i3 = 0;
                        } catch (JSONException e13) {
                            e = e13;
                            zzecuVar2 = zzecuVar;
                            zze.zzb("Malformed CLD response", e);
                            zzecuVar2.o.n("MalformedJson");
                            zzeauVar = zzecuVar2.l;
                            synchronized (zzeauVar) {
                            }
                        }
                        i14 = 5;
                        i3 = 0;
                    }
                    new zzhcx(zzgxm.x(arrayList2), false).a(zzecuVar2.i, new een(5, zzecuVar2, e7));
                    return;
                } catch (JSONException e14) {
                    e = e14;
                    zze.zzb("Malformed CLD response", e);
                    zzecuVar2.o.n("MalformedJson");
                    zzeauVar = zzecuVar2.l;
                    synchronized (zzeauVar) {
                        if (((Boolean) zzba.zzc().a(zzbjg.P2)).booleanValue()) {
                            HashMap e15 = zzeauVar.e();
                            e15.put("action", "aaia");
                            e15.put("aair", "MalformedJson");
                            zzeauVar.b.add(e15);
                        }
                    }
                    zzecuVar2.e.zzd(e);
                    zzt.zzh().d("AdapterInitializer.updateAdapterStatus", e);
                    zzfrj zzfrjVar = zzecuVar2.p;
                    e7.a(e);
                    e7.zzd(false);
                    zzfrjVar.b(e7.zzm());
                    return;
                }
            case 14:
                zzefd zzefdVar = (zzefd) this.b;
                Context context5 = (Context) this.c;
                zzeaj zzeajVar = zzefdVar.b;
                zzbkf zzn = zzt.zzn();
                if (zzn.b.getAndSet(true)) {
                    return;
                }
                zzn.c = context5;
                zzn.d = zzeajVar;
                if (zzn.f != null || (b = ba4.b(context5)) == null || b.equals(context5.getPackageName())) {
                    return;
                }
                ba4.a(context5, b, zzn);
                return;
            case 15:
                if (((Boolean) zzba.zzc().a(zzbjg.q6)).booleanValue() && zzfvk.a.a) {
                    ((zzfvq) this.b).a((View) this.c);
                    return;
                }
                return;
            case 16:
                zzenq zzenqVar = (zzenq) this.b;
                zzclm zzclmVar2 = (zzclm) this.c;
                zzclmVar2.zzJ();
                zzflw zzflwVar = zzenqVar.d;
                zzcms zzh = zzclmVar2.zzh();
                zzfw zzfwVar = zzflwVar.a;
                if (zzfwVar != null && zzh != null) {
                    zzh.E4(zzfwVar);
                }
                if (!((Boolean) zzba.zzc().a(zzbjg.Z1)).booleanValue() || zzclmVar2.isAttachedToWindow()) {
                    return;
                }
                zzclmVar2.onPause();
                zzclmVar2.U();
                return;
            case 17:
                ((zzeux) ((p03) this.b).f).d.c.i0((com.google.android.gms.ads.internal.client.zze) this.c);
                return;
            case 18:
                ((zzfjg) ((p03) this.b).f).d.i0((com.google.android.gms.ads.internal.client.zze) this.c);
                return;
            case 19:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) this.c;
                InputStream inputStream = (InputStream) this.b;
                try {
                    try {
                        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream2 = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor);
                        try {
                            IOUtils.b(inputStream, autoCloseOutputStream2, false);
                            autoCloseOutputStream2.close();
                            inputStream.close();
                            return;
                        } finally {
                        }
                    } catch (IOException unused5) {
                        return;
                    }
                } finally {
                }
            case 20:
                a();
                return;
            case 21:
                zzftp zzftpVar = (zzftp) this.b;
                zzfvd zzfvdVar = (zzfvd) this.c;
                if (!zzftpVar.b.get() && zzfvdVar.t() == 0 && zzfvdVar.u()) {
                    zzfvdVar.k();
                }
                zzftpVar.k(((Long) zzba.zzc().a(zzbjg.d0)).longValue());
                return;
            case 22:
                b();
                return;
            case 23:
                ((klo) this.b).u((zzgxi) this.c);
                return;
            case 24:
                y0p y0pVar = (y0p) this.b;
                Bundle bundle2 = (Bundle) this.c;
                try {
                    i1k i1kVar3 = y0pVar.a;
                    if (i1kVar3 == null) {
                        throw null;
                    }
                    tqn tqnVar = (tqn) ((IInterface) i1kVar3.k);
                    if (tqnVar == null) {
                        return;
                    }
                    x3n x3nVar = (x3n) tqnVar;
                    Parcel J = x3nVar.J();
                    int i17 = zzc.a;
                    J.writeInt(1);
                    bundle2.writeToParcel(J, 0);
                    x3nVar.S1(J, 2);
                    return;
                } catch (RemoteException unused6) {
                    return;
                }
            case 25:
                c();
                return;
            case 26:
                zzlj zzljVar = (zzlj) this.c;
                zzljVar.Q();
                zzljVar.R();
                Bundle bundle3 = (Bundle) this.b;
                String string = bundle3.getString("name");
                Preconditions.f(string);
                zzic zzicVar = (zzic) zzljVar.b;
                if (!zzicVar.c()) {
                    zzgu zzguVar = zzicVar.f;
                    zzic.m(zzguVar);
                    zzguVar.o.a("Conditional property not cleared since app measurement is disabled");
                    return;
                } else {
                    zzpl zzplVar = new zzpl(0L, null, string, "");
                    try {
                        zzpp zzppVar = zzicVar.i;
                        zzic.k(zzppVar);
                        bundle3.getString(MBridgeConstans.APP_ID);
                        zzicVar.o().j0(new zzah(bundle3.getString(MBridgeConstans.APP_ID), "", zzplVar, bundle3.getLong("creation_timestamp"), bundle3.getBoolean("active"), bundle3.getString("trigger_event_name"), null, bundle3.getLong("trigger_timeout"), null, bundle3.getLong("time_to_live"), zzppVar.x0(bundle3.getString("expired_event_name"), bundle3.getBundle("expired_event_params"), "", bundle3.getLong("creation_timestamp"), 0L, true)));
                        return;
                    } catch (IllegalArgumentException unused7) {
                        return;
                    }
                }
            case 27:
                d();
                return;
            case 28:
                ((zzlj) this.c).h0((Boolean) this.b, true);
                return;
            default:
                zzlj zzljVar2 = ((AppMeasurementDynamiteService) this.c).a.m;
                zzic.l(zzljVar2);
                gvo gvoVar = (gvo) this.b;
                zzljVar2.Q();
                zzljVar2.R();
                zzjp zzjpVar = zzljVar2.e;
                if (gvoVar != zzjpVar) {
                    Preconditions.k("EventInterceptor already set.", zzjpVar == null);
                }
                zzljVar2.e = gvoVar;
                return;
        }
    }

    public /* synthetic */ bnn(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj2;
        this.c = obj;
    }

    public /* synthetic */ bnn(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
