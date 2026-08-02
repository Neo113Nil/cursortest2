package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.Window;
import com.inmobi.adquality.models.AdQualityResult;
import com.inmobi.media.ads.network.common.model.AdQualityControl;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.bnb;
import defpackage.dmi;
import defpackage.ku3;
import defpackage.s9a;
import defpackage.sr8;
import defpackage.wel;
import java.io.ByteArrayOutputStream;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class M0 {
    public final AdConfig.AdQualityConfig a;
    public final InterfaceC3880x9 b;
    public final AtomicBoolean c;
    public final AtomicBoolean d;
    public final AtomicBoolean e;
    public final CopyOnWriteArrayList f;
    public AdQualityControl g;
    public EnumC3481ho h;
    public AdQualityResult i;
    public String j;
    public JSONObject k;
    public final AtomicBoolean l;

    public M0(AdConfig.AdQualityConfig adQualityConfig, InterfaceC3880x9 interfaceC3880x9) {
        adQualityConfig.getClass();
        this.a = adQualityConfig;
        this.b = interfaceC3880x9;
        this.c = new AtomicBoolean(false);
        this.d = new AtomicBoolean(false);
        this.e = new AtomicBoolean(false);
        this.f = new CopyOnWriteArrayList();
        this.h = EnumC3481ho.UNKNOWN;
        this.j = "";
        this.k = new JSONObject();
        this.l = new AtomicBoolean(false);
    }

    public final void a(boolean z) {
        String beacon;
        AdQualityControl adQualityControl = this.g;
        if (adQualityControl == null || (beacon = adQualityControl.getBeacon()) == null) {
            return;
        }
        if (this.f.isEmpty() && this.d.get() && !this.e.get()) {
            this.e.set(true);
            a("session end - queuing result");
            AdQualityResult adQualityResult = this.i;
            if (adQualityResult == null) {
                adQualityResult = new AdQualityResult("null", null, beacon, null, 8, null);
            }
            a(adQualityResult, true);
            return;
        }
        if (!this.d.get() || z || this.e.get()) {
            this.f.size();
            this.d.get();
            Objects.toString(this.e);
            return;
        }
        this.e.set(true);
        a("session stop - queuing result");
        ku3 ku3Var = F0.e;
        if (ku3Var != null) {
            s9a.o(ku3Var, new CancellationException("Shutdown"));
        }
        F0.e = null;
        AdQualityResult adQualityResult2 = this.i;
        if (adQualityResult2 == null) {
            adQualityResult2 = new AdQualityResult("null", null, beacon, null, 8, null);
        }
        a(adQualityResult2, true);
    }

    public final void a(Activity activity, String str, boolean z, JSONObject jSONObject, C3475hi c3475hi) {
        activity.getClass();
        str.getClass();
        jSONObject.getClass();
        c3475hi.getClass();
        if (jSONObject.length() > 0 && str.length() > 0) {
            this.j = str;
            this.k = jSONObject;
            a("report ad starting");
            if (z) {
                a("report ad capture");
                a(activity, 0L, true, c3475hi);
                return;
            } else {
                a("report ad report");
                a(new AdQualityResult("", null, str, jSONObject.toString()), false);
                return;
            }
        }
        c3475hi.a.h("window.mraidview.broadcastEvent('AdReportFailed')");
        a("Incorrect parameters for reporting. url - " + str + " , extras - " + jSONObject, (Exception) null);
    }

    public final void a(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, String str, boolean z, JSONObject jSONObject, C3475hi c3475hi) {
        gestureDetectorOnGestureListenerC3889xi.getClass();
        str.getClass();
        jSONObject.getClass();
        c3475hi.getClass();
        if (jSONObject.length() > 0 && str.length() > 0) {
            this.j = str;
            this.k = jSONObject;
            if (z) {
                a(gestureDetectorOnGestureListenerC3889xi, 0L, true, c3475hi);
                return;
            } else {
                a(new AdQualityResult("", null, str, jSONObject.toString()), false);
                return;
            }
        }
        c3475hi.a.h("window.mraidview.broadcastEvent('AdReportFailed')");
        a("Incorrect parameters for reporting. url - " + str + " , extras - " + jSONObject, (Exception) null);
    }

    public final boolean a() {
        if (this.c.get()) {
            a("ad quality session is already in progress. skipping...");
            return false;
        }
        if (!this.a.getEnabled()) {
            a("config kill switch while state check - false. ad quality will skip");
            return false;
        }
        if (this.g == null) {
            a("setup not done. skipping");
            return false;
        }
        EnumC3481ho enumC3481ho = this.h;
        if (enumC3481ho != EnumC3481ho.UNKNOWN && enumC3481ho != EnumC3481ho.HIDDEN) {
            return true;
        }
        a("ad view is not visible. skipping");
        return false;
    }

    public final void a(AdQualityResult adQualityResult, boolean z) {
        if (adQualityResult.getBeaconUrl().length() != 0) {
            AbstractC3378e.a(new Ch(adQualityResult), new J0(this, z), null, new wel(19));
        } else {
            a("beacon is empty");
        }
    }

    public final void a(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, long j, boolean z, C3475hi c3475hi) {
        a("isCapture started - " + this.l.get() + ", isReporting - " + z);
        if (this.l.get() && !z) {
            a("Screenshot process already in progress... skipping...", (Exception) null);
        } else {
            gestureDetectorOnGestureListenerC3889xi.post(new bnb(this, gestureDetectorOnGestureListenerC3889xi, j, z, c3475hi, 0));
        }
    }

    public static final void a(M0 m0, View view, long j, boolean z, C3475hi c3475hi) {
        m0.getClass();
        view.getClass();
        m0.a(new C3373dj(view, m0.a), j, z, c3475hi);
        m0.l.set(!z);
    }

    public final void a(Activity activity, long j, boolean z, C3475hi c3475hi) {
        a("isCapture started - " + this.l.get() + ", isReporting - " + z);
        if (this.l.get() && !z) {
            a("Screenshot process already in progress... skipping...", (Exception) null);
        } else {
            activity.getWindow().getDecorView().post(new bnb(this, activity, j, z, c3475hi, 1));
        }
    }

    public static final void a(M0 m0, Activity activity, long j, boolean z, C3475hi c3475hi) {
        m0.a("activity is visible");
        Window window = activity.getWindow();
        window.getClass();
        window.getClass();
        m0.a(new Hg(window, m0.a), j, z, c3475hi);
        m0.l.set(!z);
    }

    public final void a(AbstractC3899y2 abstractC3899y2, long j, boolean z, C3475hi c3475hi) {
        if (!z) {
            this.f.add(abstractC3899y2);
        }
        AbstractC3378e.a(abstractC3899y2, new L0(this, abstractC3899y2, z, c3475hi), Long.valueOf(j), new sr8(this, 27));
    }

    public static final boolean a(M0 m0) {
        return m0.h == EnumC3481ho.VISIBLE;
    }

    public final void a(Bitmap bitmap, N0 n0, boolean z, C3475hi c3475hi) {
        String beacon;
        n0.getClass();
        a("Screen shot result received - isReporting - " + z);
        this.f.remove(n0);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmap != null) {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (bitmap != null && c3475hi != null) {
            c3475hi.a.h("window.mraidview.broadcastEvent('ScreenshotSuccess')");
        }
        if (!z) {
            AdQualityControl adQualityControl = this.g;
            if (adQualityControl != null && (beacon = adQualityControl.getBeacon()) != null) {
                a("saving to file - beacon - ".concat(beacon));
                byteArray.getClass();
                a(beacon, byteArray, false);
            }
        } else {
            String str = this.j;
            byteArray.getClass();
            a(str, byteArray, true);
        }
        this.l.set(false);
    }

    public final void a(Exception exc, N0 n0) {
        n0.getClass();
        a("error in running process - ".concat(n0.getClass().getSimpleName()), exc);
        this.f.remove(n0);
        a(true);
    }

    public final void a(String str, N0 n0, String str2, boolean z) {
        str.getClass();
        n0.getClass();
        str2.getClass();
        if (z) {
            a(new AdQualityResult(str, null, str2, this.k.toString()), false);
            return;
        }
        this.f.remove(n0);
        AdQualityResult adQualityResult = this.i;
        if (adQualityResult != null) {
            adQualityResult.setImageLocation(str);
        } else {
            this.i = new AdQualityResult(str, null, str2, null, 8, null);
        }
        a("file is saved. result - " + this.i);
        a(true);
    }

    public final void a(String str, byte[] bArr, boolean z) {
        Context context = AbstractC3424fj.a;
        if (context != null) {
            C3374dk c3374dk = new C3374dk(dmi.y(context.getFilesDir().getAbsolutePath(), "/adQuality/screenshots"), bArr);
            if (!z) {
                this.f.add(c3374dk);
            }
            AbstractC3378e.a(c3374dk, new K0(this, z, c3374dk, str), null, new wel(19));
        }
    }

    public final void a(String str) {
        InterfaceC3880x9 interfaceC3880x9 = this.b;
        if (interfaceC3880x9 != null) {
            ((C3906y9) interfaceC3880x9).a("AdQualityManager", str);
        }
    }

    public final void a(String str, Exception exc) {
        Unit unit;
        if (exc != null) {
            InterfaceC3880x9 interfaceC3880x9 = this.b;
            if (interfaceC3880x9 != null) {
                ((C3906y9) interfaceC3880x9).a("AdQualityManager", str, exc);
                unit = Unit.a;
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            }
        }
        InterfaceC3880x9 interfaceC3880x92 = this.b;
        if (interfaceC3880x92 != null) {
            ((C3906y9) interfaceC3880x92).b("AdQualityManager", dmi.q("Error with null exception : ", str));
            Unit unit2 = Unit.a;
        }
    }
}
