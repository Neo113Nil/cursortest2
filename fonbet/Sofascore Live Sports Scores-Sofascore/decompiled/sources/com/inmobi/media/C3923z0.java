package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.inmobi.adquality.models.AdQualityResult;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.a70;
import defpackage.hoi;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.v52;
import defpackage.x52;
import defpackage.y6a;
import java.io.FileNotFoundException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.z0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3923z0 extends hoi implements Function2 {
    public AdConfig a;
    public B0 b;
    public Iterator c;
    public AdQualityResult d;
    public int e;
    public final /* synthetic */ B0 f;
    public final /* synthetic */ AdConfig g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3923z0(B0 b0, AdConfig adConfig, rq3 rq3Var) {
        super(2, rq3Var);
        this.f = b0;
        this.g = adConfig;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new C3923z0(this.f, this.g, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3923z0(this.f, this.g, (rq3) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0103, code lost:
    
        if (r3 != r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0105, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x003b, code lost:
    
        if (r2 == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0103 -> B:6:0x0106). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        B0 b0;
        AdConfig adConfig;
        Iterator it;
        Na na;
        Bitmap bitmap;
        Bitmap bitmap2;
        C3475hi c3475hi;
        C3475hi c3475hi2;
        lu3 lu3Var = lu3.a;
        int i = this.e;
        if (i == 0) {
            y6a.M(obj);
            I0 i0 = (I0) F0.a.getValue();
            this.e = 1;
            a = i0.a(this);
        } else if (i == 1) {
            y6a.M(obj);
            a = obj;
        } else {
            if (i != 2) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AdQualityResult adQualityResult = this.d;
            it = this.c;
            b0 = this.b;
            adConfig = this.a;
            y6a.M(obj);
            Object a2 = obj;
            InterfaceC3317bf interfaceC3317bf = (InterfaceC3317bf) a2;
            C3437g6 c3437g6 = EnumC3489i6.b;
            if (interfaceC3317bf.c() == 0) {
                return Unit.a;
            }
            b0.getClass();
            boolean a3 = Fl.a(interfaceC3317bf);
            HashMap hashMap = b0.c;
            if (a3) {
                WeakReference weakReference = (WeakReference) hashMap.get(adQualityResult.getBeaconUrl());
                if (weakReference != null && (c3475hi2 = (C3475hi) weakReference.get()) != null) {
                    c3475hi2.a.h("window.mraidview.broadcastEvent('AdReportSuccess')");
                }
            } else {
                WeakReference weakReference2 = (WeakReference) hashMap.get(adQualityResult.getBeaconUrl());
                if (weakReference2 != null && (c3475hi = (C3475hi) weakReference2.get()) != null) {
                    c3475hi.a.h("window.mraidview.broadcastEvent('AdReportFailed')");
                }
            }
            B0.a(adQualityResult);
            if (it.hasNext()) {
                this.f.b.set(true);
                return Unit.a;
            }
            adQualityResult = (AdQualityResult) it.next();
            F9 f9 = (F9) Ve.e.getValue();
            AdConfig.AdQualityConfig adQuality = adConfig.getAdQuality();
            adQualityResult.getClass();
            adQuality.getClass();
            adQualityResult.getBeaconUrl().getClass();
            String beaconUrl = adQualityResult.getBeaconUrl();
            JSONObject jSONObject = new JSONObject();
            if (adQualityResult.getImageLocation().length() > 0) {
                x52 x52Var = new x52();
                try {
                } catch (FileNotFoundException unused) {
                    bitmap2 = null;
                } catch (Throwable th) {
                    th = th;
                    bitmap = null;
                }
                bitmap2 = BitmapFactory.decodeFile(adQualityResult.getImageLocation());
                if (bitmap2 != null) {
                    try {
                    } catch (FileNotFoundException unused2) {
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        na = null;
                        Ze ze = new Ze(beaconUrl, null, new Ok(2000L, 2000L, 5000L), na, new Vi(adQuality.getRetryInterval(), adQuality.getMaxRetries()), 2);
                        this.a = adConfig;
                        this.b = b0;
                        this.c = it;
                        this.d = adQualityResult;
                        this.e = 2;
                        a2 = f9.a.a(ze, this);
                    } catch (Throwable th2) {
                        th = th2;
                        bitmap = bitmap2;
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        throw th;
                    }
                    bitmap2.compress(Bitmap.CompressFormat.JPEG, 100, new v52(x52Var, 0));
                }
                if (!x52Var.w()) {
                    jSONObject.put("screenshotImageByte", N3.a(x52Var));
                }
                Na na2 = new Na(jSONObject);
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                na = na2;
                Ze ze2 = new Ze(beaconUrl, null, new Ok(2000L, 2000L, 5000L), na, new Vi(adQuality.getRetryInterval(), adQuality.getMaxRetries()), 2);
                this.a = adConfig;
                this.b = b0;
                this.c = it;
                this.d = adQualityResult;
                this.e = 2;
                a2 = f9.a.a(ze2, this);
            }
            na = null;
            Ze ze22 = new Ze(beaconUrl, null, new Ok(2000L, 2000L, 5000L), na, new Vi(adQuality.getRetryInterval(), adQuality.getMaxRetries()), 2);
            this.a = adConfig;
            this.b = b0;
            this.c = it;
            this.d = adQualityResult;
            this.e = 2;
            a2 = f9.a.a(ze22, this);
        }
        AdConfig adConfig2 = this.g;
        b0 = this.f;
        adConfig = adConfig2;
        it = ((List) a).iterator();
        if (it.hasNext()) {
        }
    }
}
