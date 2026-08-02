package i2;

import android.content.ClipDescription;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.v0;
import androidx.appcompat.widget.c1;
import androidx.profileinstaller.ProfileInstallReceiver;
import c4.p;
import c4.v;
import com.android.billingclient.api.l0;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.zab;
import com.google.android.gms.internal.measurement.y3;
import com.google.gson.x;
import com.sports.insider.ui.settings.SettingFragment;
import com.sports.insider.ui.strip.FollowPredictionsFragment;
import eg.c0;
import eg.f0;
import eg.g0;
import eg.m0;
import gh.b0;
import gh.p0;
import gh.r0;
import gh.s0;
import io.sentry.ILogger;
import io.sentry.android.core.w0;
import io.sentry.android.replay.util.l;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.c2;
import io.sentry.d5;
import io.sentry.f4;
import io.sentry.f5;
import io.sentry.i1;
import io.sentry.k0;
import io.sentry.k4;
import io.sentry.p6;
import io.sentry.protocol.i0;
import io.sentry.protocol.t;
import io.sentry.x3;
import io.sentry.z0;
import j$.time.Instant;
import j$.util.Optional;
import java.io.IOException;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import kh.q;
import kh.s;
import kh.u;
import kh.w;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.n0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import la.j1;
import oi.m;
import okio.BufferedSource;
import org.json.JSONObject;
import q4.n;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d implements e, e6.k, l, io.sentry.featureflags.b, io.sentry.logger.a, kh.i, s4.b, m, q4.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10881a;

    /* renamed from: b, reason: collision with root package name */
    public Object f10882b;

    public /* synthetic */ d(char c2, int i5) {
        this.f10881a = i5;
    }

    public static final JSONObject t(d dVar) {
        JSONObject put = new JSONObject().put("HARDWARE", Build.HARDWARE).put("PRODUCT", Build.PRODUCT).put("MODEL", Build.MODEL).put("DISPLAY", Build.DISPLAY).put("ANDROID", Build.VERSION.RELEASE).put("VERSION_NAME", "1.2.44.123").put("VERSION_CODE", 123).put("ERROR_CODE", -1);
        String c2 = ((ea.a) y3.m(ea.a.class, null, 6)).c();
        if (c2 == null) {
            c2 = ((ea.a) y3.m(ea.a.class, null, 6)).d();
        }
        JSONObject put2 = new JSONObject().put(String.valueOf(123), put.put("DEV_ID", c2).put("TIME", io.sentry.config.a.u(Instant.now().toEpochMilli())));
        Intrinsics.checkNotNullExpressionValue(put2, "put(...)");
        return put2;
    }

    public static final md.d u(d dVar) {
        md.d dVar2 = (md.d) ((WeakReference) dVar.f10882b).get();
        if (dVar2 != null) {
            return dVar2;
        }
        WeakReference weakReference = new WeakReference(new md.d());
        dVar.f10882b = weakReference;
        Object obj = weakReference.get();
        Intrinsics.checkNotNull(obj);
        return (md.d) obj;
    }

    public Serializable A(io.sentry.vendor.gson.stream.a aVar, int i5) {
        io.sentry.util.network.d dVar = (io.sentry.util.network.d) this.f10882b;
        if (dVar.f17180b) {
            return null;
        }
        if (i5 >= 100) {
            dVar.f17179a = true;
            return null;
        }
        try {
            switch (io.sentry.util.network.c.f17178a[aVar.h0().ordinal()]) {
                case 1:
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    try {
                        aVar.k();
                        while (aVar.z() && !dVar.f17180b) {
                            linkedHashMap.put(aVar.U(), A(aVar, i5 + 1));
                        }
                        aVar.w();
                        return linkedHashMap;
                    } catch (Exception unused) {
                        dVar.f17180b = true;
                        return linkedHashMap;
                    }
                case 2:
                    ArrayList arrayList = new ArrayList();
                    try {
                        aVar.c();
                        while (aVar.z() && !dVar.f17180b) {
                            arrayList.add(A(aVar, i5 + 1));
                        }
                        aVar.t();
                        return arrayList;
                    } catch (Exception unused2) {
                        dVar.f17180b = true;
                        return arrayList;
                    }
                case 3:
                    return aVar.d0();
                case 4:
                    return Double.valueOf(aVar.N());
                case 5:
                    return Boolean.valueOf(aVar.K());
                case 6:
                    aVar.Y();
                    return null;
                default:
                    dVar.f17180b = true;
                    return null;
            }
        } catch (Exception unused3) {
            dVar.f17180b = true;
            return null;
        }
        dVar.f17180b = true;
        return null;
    }

    public void B(l1.a aVar, ILogger iLogger, Object obj) {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) aVar.f19314b;
        if (obj == null) {
            cVar.r();
            return;
        }
        if (obj instanceof Character) {
            aVar.K(Character.toString(((Character) obj).charValue()));
            return;
        }
        if (obj instanceof String) {
            aVar.K((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            aVar.L(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Number) {
            aVar.J((Number) obj);
            return;
        }
        if (obj instanceof Date) {
            try {
                aVar.K(com.google.android.play.core.appupdate.b.u((Date) obj));
                return;
            } catch (Exception e7) {
                iLogger.e(b5.ERROR, "Error when serializing Date", e7);
                cVar.r();
                return;
            }
        }
        if (obj instanceof TimeZone) {
            try {
                aVar.K(((TimeZone) obj).getID());
                return;
            } catch (Exception e9) {
                iLogger.e(b5.ERROR, "Error when serializing TimeZone", e9);
                cVar.r();
                return;
            }
        }
        if (obj instanceof c2) {
            ((c2) obj).serialize(aVar, iLogger);
            return;
        }
        if (obj instanceof Collection) {
            C(aVar, iLogger, (Collection) obj);
            return;
        }
        int i5 = 0;
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            ArrayList arrayList = new ArrayList(zArr.length);
            int length = zArr.length;
            while (i5 < length) {
                arrayList.add(Boolean.valueOf(zArr[i5]));
                i5++;
            }
            C(aVar, iLogger, arrayList);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            ArrayList arrayList2 = new ArrayList(bArr.length);
            int length2 = bArr.length;
            while (i5 < length2) {
                arrayList2.add(Byte.valueOf(bArr[i5]));
                i5++;
            }
            C(aVar, iLogger, arrayList2);
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            ArrayList arrayList3 = new ArrayList(sArr.length);
            int length3 = sArr.length;
            while (i5 < length3) {
                arrayList3.add(Short.valueOf(sArr[i5]));
                i5++;
            }
            C(aVar, iLogger, arrayList3);
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            ArrayList arrayList4 = new ArrayList(cArr.length);
            int length4 = cArr.length;
            while (i5 < length4) {
                arrayList4.add(Character.valueOf(cArr[i5]));
                i5++;
            }
            C(aVar, iLogger, arrayList4);
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            ArrayList arrayList5 = new ArrayList(iArr.length);
            int length5 = iArr.length;
            while (i5 < length5) {
                arrayList5.add(Integer.valueOf(iArr[i5]));
                i5++;
            }
            C(aVar, iLogger, arrayList5);
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            ArrayList arrayList6 = new ArrayList(jArr.length);
            int length6 = jArr.length;
            while (i5 < length6) {
                arrayList6.add(Long.valueOf(jArr[i5]));
                i5++;
            }
            C(aVar, iLogger, arrayList6);
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            ArrayList arrayList7 = new ArrayList(fArr.length);
            int length7 = fArr.length;
            while (i5 < length7) {
                arrayList7.add(Float.valueOf(fArr[i5]));
                i5++;
            }
            C(aVar, iLogger, arrayList7);
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            ArrayList arrayList8 = new ArrayList(dArr.length);
            int length8 = dArr.length;
            while (i5 < length8) {
                arrayList8.add(Double.valueOf(dArr[i5]));
                i5++;
            }
            C(aVar, iLogger, arrayList8);
            return;
        }
        if (obj.getClass().isArray()) {
            C(aVar, iLogger, Arrays.asList((Object[]) obj));
            return;
        }
        if (obj instanceof Map) {
            D(aVar, iLogger, (Map) obj);
            return;
        }
        if (obj instanceof Locale) {
            aVar.K(obj.toString());
            return;
        }
        if (obj instanceof AtomicIntegerArray) {
            AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
            Charset charset = io.sentry.util.d.f17158a;
            int length9 = atomicIntegerArray.length();
            ArrayList arrayList9 = new ArrayList(length9);
            while (i5 < length9) {
                arrayList9.add(Integer.valueOf(atomicIntegerArray.get(i5)));
                i5++;
            }
            C(aVar, iLogger, arrayList9);
            return;
        }
        if (obj instanceof AtomicBoolean) {
            aVar.L(((AtomicBoolean) obj).get());
            return;
        }
        if (obj instanceof URI) {
            aVar.K(obj.toString());
            return;
        }
        if (obj instanceof InetAddress) {
            aVar.K(obj.toString());
            return;
        }
        if (obj instanceof UUID) {
            aVar.K(obj.toString());
            return;
        }
        if (obj instanceof Currency) {
            aVar.K(obj.toString());
            return;
        }
        if (obj instanceof Calendar) {
            D(aVar, iLogger, io.sentry.util.d.b((Calendar) obj));
            return;
        }
        if (obj.getClass().isEnum()) {
            aVar.K(obj.toString());
            return;
        }
        try {
            B(aVar, iLogger, ((l0) this.f10882b).k(iLogger, obj));
        } catch (Exception e10) {
            iLogger.e(b5.ERROR, "Failed serializing unknown object.", e10);
            aVar.K("[OBJECT]");
        }
    }

    public void C(l1.a aVar, ILogger iLogger, Collection collection) {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) aVar.f19314b;
        cVar.y();
        cVar.c();
        int i5 = cVar.f17220c;
        int[] iArr = cVar.f17219b;
        if (i5 == iArr.length) {
            cVar.f17219b = Arrays.copyOf(iArr, i5 * 2);
        }
        int[] iArr2 = cVar.f17219b;
        int i10 = cVar.f17220c;
        cVar.f17220c = i10 + 1;
        iArr2[i10] = 1;
        cVar.f17218a.write(91);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            B(aVar, iLogger, it.next());
        }
        cVar.k(']', 1, 2);
    }

    public void D(l1.a aVar, ILogger iLogger, Map map) {
        aVar.j();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                aVar.u((String) obj);
                B(aVar, iLogger, map.get(obj));
            }
        }
        aVar.o();
    }

    public boolean E(l4.a aVar, q4.h hVar, i4.a aVar2) {
        l4.c d10;
        if (aVar == null || !hVar.j.f21934b || !aVar2.f10923a.a() || (d10 = ((v) this.f10882b).d()) == null) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("coil#is_sampled", Boolean.valueOf(aVar2.f10924b));
        String str = aVar2.f10926d;
        if (str != null) {
            linkedHashMap.put("coil#disk_cache_key", str);
        }
        c4.m mVar = aVar2.f10923a;
        Map b02 = ci.c.b0(linkedHashMap);
        synchronized (d10.f19355c) {
            long b10 = mVar.b();
            if (b10 < 0) {
                throw new IllegalStateException(("Image size must be non-negative: " + b10).toString());
            }
            d10.f19353a.a(aVar, mVar, b02, b10);
            Unit unit = Unit.f19194a;
        }
        return true;
    }

    public void F() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f10882b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + H());
    }

    public void G(long j) {
        long H = H();
        if (H != j) {
            if (H != -1) {
                if (H != -2) {
                    return;
                } else {
                    H = -2;
                }
            }
            StringBuilder p10 = r4.k.p(j, "expected non-string scope or scope ", " but found ");
            p10.append(H);
            throw new IOException(p10.toString());
        }
    }

    public long H() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f10882b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override // kh.i
    public q a() {
        kh.v b10;
        IOException iOException = null;
        while (!((s) this.f10882b).f19182k.q) {
            try {
                b10 = ((s) this.f10882b).b();
            } catch (IOException e7) {
                if (iOException == null) {
                    iOException = e7;
                } else {
                    gf.d.a(iOException, e7);
                }
                if (!((s) this.f10882b).a(null)) {
                    throw iOException;
                }
            }
            if (!b10.c()) {
                u d10 = b10.d();
                if (d10.f19190b == null && d10.f19191c == null) {
                    d10 = b10.f();
                }
                kh.v vVar = d10.f19190b;
                Throwable th2 = d10.f19191c;
                if (th2 != null) {
                    throw th2;
                }
                if (vVar != null) {
                    ((s) this.f10882b).f19187p.addFirst(vVar);
                }
            }
            return b10.b();
        }
        throw new IOException("Canceled");
    }

    @Override // e6.k
    public void accept(Object obj, Object obj2) {
        Parcel obtain;
        w7.g gVar = (w7.g) obj2;
        switch (this.f10881a) {
            case 1:
                i6.b bVar = (i6.b) ((i6.a) obj).m();
                zab zabVar = (zab) this.f10882b;
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken(bVar.f5344g);
                int i5 = h7.a.f10385a;
                obtain.writeInt(1);
                zabVar.writeToParcel(obtain, 0);
                try {
                    bVar.f5343f.transact(1, obtain, null, 1);
                    obtain.recycle();
                    gVar.b(null);
                    return;
                } finally {
                }
            default:
                i6.c cVar = (i6.c) ((i6.e) obj).m();
                TelemetryData telemetryData = (TelemetryData) this.f10882b;
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken(cVar.f5344g);
                int i10 = h7.a.f10385a;
                if (telemetryData == null) {
                    obtain.writeInt(0);
                } else {
                    obtain.writeInt(1);
                    telemetryData.writeToParcel(obtain, 0);
                }
                try {
                    cVar.f5343f.transact(1, obtain, null, 1);
                    obtain.recycle();
                    gVar.b(null);
                    return;
                } finally {
                }
        }
    }

    @Override // s4.b
    public void b(c4.m mVar) {
        switch (this.f10881a) {
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                SettingFragment.K((SettingFragment) this.f10882b, mVar);
                break;
            default:
                ((FollowPredictionsFragment) this.f10882b).G(mVar);
                break;
        }
    }

    @Override // kh.i
    public w c() {
        return (s) this.f10882b;
    }

    @Override // io.sentry.featureflags.b
    /* renamed from: clone */
    public io.sentry.featureflags.b m104clone() {
        return new d((byte) 0, 7);
    }

    @Override // s4.b
    public void d(c4.m mVar) {
        switch (this.f10881a) {
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                SettingFragment.K((SettingFragment) this.f10882b, mVar);
                break;
            default:
                ((FollowPredictionsFragment) this.f10882b).G(mVar);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r2 == null) goto L10;
     */
    @Override // oi.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e(Object obj) {
        Charset charset;
        switch (this.f10881a) {
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                return Optional.ofNullable(((m) this.f10882b).e((r0) obj));
            default:
                r0 r0Var = (r0) obj;
                p0 p0Var = r0Var.f10298a;
                if (p0Var == null) {
                    BufferedSource m02 = r0Var.m0();
                    b0 n9 = r0Var.n();
                    if (n9 != null) {
                        Regex regex = b0.f10117d;
                        charset = n9.a(null);
                        break;
                    }
                    charset = Charsets.UTF_8;
                    p0Var = new p0(m02, charset);
                    r0Var.f10298a = p0Var;
                }
                r9.a aVar = new r9.a(p0Var);
                aVar.f22332o = 2;
                try {
                    Object b10 = ((x) this.f10882b).b(aVar);
                    if (aVar.i0() == 10) {
                        return b10;
                    }
                    throw new com.google.gson.m("JSON document was not fully consumed.");
                } finally {
                    r0Var.close();
                }
        }
    }

    @Override // s4.b
    public void f(c4.m mVar) {
        switch (this.f10881a) {
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                SettingFragment.K((SettingFragment) this.f10882b, mVar);
                break;
            default:
                ((FollowPredictionsFragment) this.f10882b).G(mVar);
                break;
        }
    }

    @Override // io.sentry.android.replay.util.l
    public int g(int i5) {
        return ((Layout) this.f10882b).getLineTop(i5);
    }

    @Override // io.sentry.android.replay.util.l
    public float h(int i5, int i10) {
        return ((Layout) this.f10882b).getPrimaryHorizontal(i10);
    }

    @Override // i2.e
    public void i() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // io.sentry.featureflags.b
    public io.sentry.protocol.h j() {
        ((io.sentry.util.a) this.f10882b).a().close();
        return null;
    }

    @Override // i2.e
    public void k(int i5, Object obj) {
        String str;
        switch (i5) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i5 == 6 || i5 == 7 || i5 == 8) {
            w0.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f10882b).setResultCode(i5);
    }

    @Override // io.sentry.android.replay.util.l
    public int l(int i5) {
        return ((Layout) this.f10882b).getLineBottom(i5);
    }

    @Override // io.sentry.android.replay.util.l
    public int m(int i5) {
        return ((Layout) this.f10882b).getLineStart(i5);
    }

    @Override // io.sentry.android.replay.util.l
    public int n() {
        return ((Layout) this.f10882b).getLineCount();
    }

    @Override // q4.c
    public f0 o() {
        return (g0) this.f10882b;
    }

    @Override // io.sentry.android.replay.util.l
    public Integer p() {
        int i5;
        Layout layout = (Layout) this.f10882b;
        if (!(layout.getText() instanceof Spanned)) {
            return null;
        }
        CharSequence text = layout.getText();
        Intrinsics.checkNotNull(text, "null cannot be cast to non-null type android.text.Spanned");
        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) ((Spanned) text).getSpans(0, layout.getText().length(), ForegroundColorSpan.class);
        Intrinsics.checkNotNull(foregroundColorSpanArr);
        int i10 = Integer.MIN_VALUE;
        Integer num = null;
        for (ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
            CharSequence text2 = layout.getText();
            Intrinsics.checkNotNull(text2, "null cannot be cast to non-null type android.text.Spanned");
            int spanStart = ((Spanned) text2).getSpanStart(foregroundColorSpan);
            CharSequence text3 = layout.getText();
            Intrinsics.checkNotNull(text3, "null cannot be cast to non-null type android.text.Spanned");
            int spanEnd = ((Spanned) text3).getSpanEnd(foregroundColorSpan);
            if (spanStart != -1 && spanEnd != -1 && (i5 = spanEnd - spanStart) > i10) {
                num = Integer.valueOf(foregroundColorSpan.getForegroundColor());
                i10 = i5;
            }
        }
        if (num != null) {
            return Integer.valueOf(num.intValue() | (-16777216));
        }
        return null;
    }

    @Override // io.sentry.android.replay.util.l
    public int q(int i5) {
        return ((Layout) this.f10882b).getLineVisibleEnd(i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0069 A[Catch: all -> 0x001f, TryCatch #1 {all -> 0x001f, blocks: (B:3:0x000a, B:5:0x0011, B:8:0x0022, B:10:0x002a, B:15:0x003c, B:18:0x005f, B:20:0x0069, B:22:0x0075, B:24:0x0082, B:25:0x008d, B:27:0x0087, B:28:0x007a, B:33:0x004f, B:30:0x0049), top: B:2:0x000a, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075 A[Catch: all -> 0x001f, TryCatch #1 {all -> 0x001f, blocks: (B:3:0x000a, B:5:0x0011, B:8:0x0022, B:10:0x002a, B:15:0x003c, B:18:0x005f, B:20:0x0069, B:22:0x0075, B:24:0x0082, B:25:0x008d, B:27:0x0087, B:28:0x007a, B:33:0x004f, B:30:0x0049), top: B:2:0x000a, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082 A[Catch: all -> 0x001f, TryCatch #1 {all -> 0x001f, blocks: (B:3:0x000a, B:5:0x0011, B:8:0x0022, B:10:0x002a, B:15:0x003c, B:18:0x005f, B:20:0x0069, B:22:0x0075, B:24:0x0082, B:25:0x008d, B:27:0x0087, B:28:0x007a, B:33:0x004f, B:30:0x0049), top: B:2:0x000a, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087 A[Catch: all -> 0x001f, TryCatch #1 {all -> 0x001f, blocks: (B:3:0x000a, B:5:0x0011, B:8:0x0022, B:10:0x002a, B:15:0x003c, B:18:0x005f, B:20:0x0069, B:22:0x0075, B:24:0x0082, B:25:0x008d, B:27:0x0087, B:28:0x007a, B:33:0x004f, B:30:0x0049), top: B:2:0x000a, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a A[Catch: all -> 0x001f, TryCatch #1 {all -> 0x001f, blocks: (B:3:0x000a, B:5:0x0011, B:8:0x0022, B:10:0x002a, B:15:0x003c, B:18:0x005f, B:20:0x0069, B:22:0x0075, B:24:0x0082, B:25:0x008d, B:27:0x0087, B:28:0x007a, B:33:0x004f, B:30:0x0049), top: B:2:0x000a, inners: #0 }] */
    @Override // io.sentry.logger.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void r(f5 f5Var, com.android.billingclient.api.a aVar, String str, Object... objArr) {
        String format;
        i1 i5;
        x3 x3Var = (x3) this.f10882b;
        b6 m6 = x3Var.m();
        z0 z0Var = x3Var.f17249e;
        try {
            if (!x3Var.isEnabled()) {
                m6.getLogger().h(b5.WARNING, "Instance is disabled and this 'logger' call is a no-op.", new Object[0]);
                return;
            }
            if (!m6.getLogs().f17101a) {
                m6.getLogger().h(b5.WARNING, "Sentry Log is disabled and this 'logger' call is a no-op.", new Object[0]);
                return;
            }
            if (str == null) {
                return;
            }
            k4 a7 = m6.getDateProvider().a();
            if (objArr.length != 0) {
                try {
                    format = String.format(str, objArr);
                } catch (Throwable th2) {
                    x3Var.m().getLogger().e(b5.ERROR, "Error while running log through String.format", th2);
                }
                v0 y5 = z0Var.y();
                i5 = z0Var.i();
                if (i5 == null) {
                    z0Var.I(new com.google.firebase.messaging.g(17, z0Var, m6));
                }
                io.sentry.protocol.v vVar = i5 != null ? (io.sentry.protocol.v) y5.f364b : i5.v().f16667a;
                p6 p6Var = i5 != null ? (p6) y5.f365c : i5.v().f16668b;
                d5 d5Var = new d5(vVar, Double.valueOf(a7.d() / 1.0E9d), format, f5Var);
                d5Var.f16318f = x(aVar, str, p6Var, objArr);
                d5Var.f16317e = Integer.valueOf(f5Var.getSeverityNumber());
                z0Var.C().h(d5Var, z0Var);
            }
            format = str;
            v0 y52 = z0Var.y();
            i5 = z0Var.i();
            if (i5 == null) {
            }
            if (i5 != null) {
            }
            if (i5 != null) {
            }
            d5 d5Var2 = new d5(vVar, Double.valueOf(a7.d() / 1.0E9d), format, f5Var);
            d5Var2.f16318f = x(aVar, str, p6Var, objArr);
            d5Var2.f16317e = Integer.valueOf(f5Var.getSeverityNumber());
            z0Var.C().h(d5Var2, z0Var);
        } catch (Throwable th3) {
            m6.getLogger().e(b5.ERROR, "Error while capturing log event", th3);
        }
    }

    @Override // io.sentry.android.replay.util.l
    public int s(int i5) {
        return ((Layout) this.f10882b).getEllipsisCount(i5);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|25|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0029, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0065, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, "ex");
        r13 = com.sports.insider.MyApp.f6830c;
        r0 = eg.m0.f9201a;
        eg.c0.t(r13, lg.d.f20063c, null, new q4.r(r0, r7, 18), 2);
        r12 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object v(String str, mf.c cVar) {
        md.e eVar;
        int i5;
        if (cVar instanceof md.e) {
            eVar = (md.e) cVar;
            int i10 = eVar.f20540c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f20540c = i10 - Integer.MIN_VALUE;
                Object obj = eVar.f20538a;
                lf.a aVar = lf.a.f20034a;
                i5 = eVar.f20540c;
                Continuation continuation = null;
                if (i5 != 0) {
                    h8.b.B(obj);
                    j1 j1Var = (j1) y3.m(j1.class, null, 6);
                    eVar.f20540c = 1;
                    j1Var.getClass();
                    fb.b bVar = new fb.b();
                    lg.e eVar2 = m0.f9201a;
                    obj = c0.A(lg.d.f20063c, new qb.a(bVar, (String) null, "application/json", str, (Continuation) null), eVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                long j = ((Number) obj).longValue();
                return new Long(j);
            }
        }
        eVar = new md.e(this, cVar);
        Object obj2 = eVar.f20538a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = eVar.f20540c;
        Continuation continuation2 = null;
        if (i5 != 0) {
        }
        long j6 = ((Number) obj2).longValue();
        return new Long(j6);
    }

    public synchronized void w(s0 route) {
        Intrinsics.checkNotNullParameter(route, "route");
        ((LinkedHashSet) this.f10882b).remove(route);
    }

    public HashMap x(com.android.billingclient.api.a aVar, String str, p6 p6Var, Object... objArr) {
        x3 x3Var = (x3) this.f10882b;
        HashMap hashMap = new HashMap();
        String str2 = aVar.f3966b;
        if (!"manual".equalsIgnoreCase(str2)) {
            hashMap.put("sentry.origin", new io.sentry.protocol.l(f4.STRING, (Object) str2));
        }
        int i5 = 0;
        for (Object obj : objArr) {
            hashMap.put(c1.i(i5, "sentry.message.parameter."), new io.sentry.protocol.l(obj instanceof Boolean ? f4.BOOLEAN : obj instanceof Integer ? f4.INTEGER : obj instanceof Number ? f4.DOUBLE : f4.STRING, obj));
            i5++;
        }
        if (i5 > 0 && hashMap.get("sentry.message.template") == null) {
            hashMap.put("sentry.message.template", new io.sentry.protocol.l(f4.STRING, (Object) str));
        }
        t sdkVersion = x3Var.m().getSdkVersion();
        if (sdkVersion != null) {
            f4 f4Var = f4.STRING;
            hashMap.put("sentry.sdk.name", new io.sentry.protocol.l(f4Var, (Object) sdkVersion.f16910a));
            hashMap.put("sentry.sdk.version", new io.sentry.protocol.l(sdkVersion.f16911b, f4Var.apiName()));
        }
        String environment = x3Var.m().getEnvironment();
        if (environment != null) {
            hashMap.put("sentry.environment", new io.sentry.protocol.l(f4.STRING, (Object) environment));
        }
        io.sentry.protocol.v k6 = x3Var.f17249e.k();
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f16922b;
        if (vVar.equals(k6)) {
            io.sentry.protocol.v k9 = x3Var.m().getReplayController().k();
            if (!vVar.equals(k9)) {
                hashMap.put("sentry.replay_id", new io.sentry.protocol.l(f4.STRING, (Object) k9.toString()));
                hashMap.put("sentry._internal.replay_is_buffering", new io.sentry.protocol.l(f4.BOOLEAN, Boolean.TRUE));
            }
        } else {
            hashMap.put("sentry.replay_id", new io.sentry.protocol.l(f4.STRING, (Object) k6.toString()));
        }
        String release = x3Var.m().getRelease();
        if (release != null) {
            hashMap.put("sentry.release", new io.sentry.protocol.l(f4.STRING, (Object) release));
        }
        f4 f4Var2 = f4.STRING;
        hashMap.put("sentry.trace.parent_span_id", new io.sentry.protocol.l(f4Var2, p6Var));
        if (!io.sentry.util.h.f17164a) {
            b6 m6 = x3Var.m();
            String serverName = m6.getServerName();
            if (serverName != null) {
                hashMap.put("server.address", new io.sentry.protocol.l(serverName, f4Var2.apiName()));
            } else if (m6.isAttachServerName()) {
                k0 a7 = k0.a();
                if (a7.f16589c < System.currentTimeMillis() && a7.f16590d.compareAndSet(false, true)) {
                    a7.b();
                }
                String str3 = a7.f16588b;
                if (str3 != null) {
                    hashMap.put("server.address", new io.sentry.protocol.l(str3, f4Var2.apiName()));
                }
            }
        }
        i0 user = x3Var.f17249e.getUser();
        if (user == null) {
            String distinctId = x3Var.m().getDistinctId();
            if (distinctId != null) {
                hashMap.put("user.id", new io.sentry.protocol.l(distinctId, f4Var2.apiName()));
                return hashMap;
            }
        } else {
            String str4 = user.f16817b;
            if (str4 != null) {
                hashMap.put("user.id", new io.sentry.protocol.l(str4, f4Var2.apiName()));
            }
            String str5 = user.f16818c;
            if (str5 != null) {
                hashMap.put("user.name", new io.sentry.protocol.l(str5, f4Var2.apiName()));
            }
            String str6 = user.f16816a;
            if (str6 != null) {
                hashMap.put("user.email", new io.sentry.protocol.l(str6, f4Var2.apiName()));
            }
        }
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01a7, code lost:
    
        if (r13 == 1.0d) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ca, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1, r19.toString()) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x019c, code lost:
    
        if (r13 <= 1.0d) goto L124;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l4.b y(q4.h hVar, l4.a aVar, r4.i iVar, r4.g gVar) {
        l4.b bVar;
        boolean i5;
        l4.b bVar2;
        int abs;
        boolean z5;
        boolean z7;
        q4.b bVar3 = hVar.j;
        r4.d dVar = hVar.f21991r;
        if (bVar3.f21933a) {
            l4.c d10 = ((v) this.f10882b).d();
            if (d10 != null) {
                synchronized (d10.f19355c) {
                    try {
                        l4.d dVar2 = (l4.d) ((LinkedHashMap) ((io.sentry.android.replay.gestures.c) d10.f19353a.f19361c).f16042a).get(aVar);
                        l4.b bVar4 = null;
                        bVar = dVar2 != null ? new l4.b(dVar2.f19356a, dVar2.f19357b) : null;
                        if (bVar == null) {
                            l0 l0Var = d10.f19354b;
                            ArrayList arrayList = (ArrayList) ((LinkedHashMap) l0Var.f4045c).get(aVar);
                            if (arrayList != null) {
                                int size = arrayList.size();
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= size) {
                                        break;
                                    }
                                    l4.f fVar = (l4.f) arrayList.get(i10);
                                    c4.m mVar = (c4.m) fVar.f19362a.get();
                                    l4.b bVar5 = mVar != null ? new l4.b(mVar, fVar.f19363b) : null;
                                    if (bVar5 != null) {
                                        bVar4 = bVar5;
                                        break;
                                    }
                                    i10++;
                                }
                                l0Var.b();
                            }
                            bVar = bVar4;
                        }
                        if (bVar != null && !bVar.f19351a.a()) {
                            d10.c(aVar);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else {
                bVar = null;
            }
            if (bVar != null) {
                c4.m mVar2 = bVar.f19351a;
                c4.a aVar2 = mVar2 instanceof c4.a ? (c4.a) mVar2 : null;
                if (aVar2 == null) {
                    i5 = true;
                } else {
                    Bitmap.Config config = aVar2.f3564a.getConfig();
                    if (config == null) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    i5 = x5.h.i(hVar, config);
                }
                if (i5) {
                    String str = (String) aVar.f19350b.get("coil#size");
                    if (str == null) {
                        Object obj = bVar.f19352b.get("coil#is_sampled");
                        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                        if ((bool != null ? bool.booleanValue() : false) || (!Intrinsics.areEqual(iVar, r4.i.f22306c) && dVar != r4.d.f22294b)) {
                            int width = mVar2.getWidth();
                            int height = mVar2.getHeight();
                            r4.i iVar2 = mVar2 instanceof c4.a ? (r4.i) p.e(hVar, q4.i.f21996b) : r4.i.f22306c;
                            r4.c cVar = iVar.f22307a;
                            int i11 = cVar instanceof r4.a ? ((r4.a) cVar).f22291a : Integer.MAX_VALUE;
                            r4.c cVar2 = iVar2.f22307a;
                            int min = Math.min(i11, cVar2 instanceof r4.a ? ((r4.a) cVar2).f22291a : Integer.MAX_VALUE);
                            r4.c cVar3 = iVar.f22308b;
                            int i12 = cVar3 instanceof r4.a ? ((r4.a) cVar3).f22291a : Integer.MAX_VALUE;
                            r4.c cVar4 = iVar2.f22308b;
                            int min2 = Math.min(i12, cVar4 instanceof r4.a ? ((r4.a) cVar4).f22291a : Integer.MAX_VALUE);
                            bVar2 = bVar;
                            double d11 = min / width;
                            double d12 = min2 / height;
                            int ordinal = ((min == Integer.MAX_VALUE || min2 == Integer.MAX_VALUE) ? r4.g.f22299b : gVar).ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 1) {
                                    throw new gf.m();
                                }
                                if (d11 < d12) {
                                    abs = Math.abs(min - width);
                                    z5 = true;
                                    if (abs > 1) {
                                        int ordinal2 = dVar.ordinal();
                                        if (ordinal2 != 0) {
                                            if (ordinal2 != 1) {
                                                throw new gf.m();
                                            }
                                        }
                                        if (z7) {
                                            return bVar2;
                                        }
                                    }
                                    z7 = z5;
                                    if (z7) {
                                    }
                                } else {
                                    abs = Math.abs(min2 - height);
                                    d11 = d12;
                                    z5 = true;
                                    if (abs > 1) {
                                    }
                                    z7 = z5;
                                    if (z7) {
                                    }
                                }
                            } else if (d11 > d12) {
                                abs = Math.abs(min - width);
                                z5 = true;
                                if (abs > 1) {
                                }
                                z7 = z5;
                                if (z7) {
                                }
                            } else {
                                abs = Math.abs(min2 - height);
                                d11 = d12;
                                z5 = true;
                                if (abs > 1) {
                                }
                                z7 = z5;
                                if (z7) {
                                }
                            }
                        }
                    }
                    bVar2 = bVar;
                    z5 = true;
                    z7 = z5;
                    if (z7) {
                    }
                }
                bVar2 = bVar;
                z7 = false;
                if (z7) {
                }
            }
        }
        return null;
    }

    public l4.a z(q4.h hVar, Object obj, n nVar, c4.i iVar) {
        String str;
        q4.b bVar = hVar.j;
        Map map = hVar.f21980e;
        if (bVar != q4.b.f21931d) {
            List list = ((v) this.f10882b).f3631d.f3584c;
            int size = list.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    str = null;
                    break;
                }
                Pair pair = (Pair) list.get(i5);
                j4.c cVar = (j4.c) pair.f19192a;
                if (((ag.c) pair.f19193b).isInstance(obj)) {
                    Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type coil3.key.Keyer<kotlin.Any>");
                    str = cVar.a(obj, nVar);
                    if (str != null) {
                        break;
                    }
                }
                i5++;
            }
            if (str != null) {
                if (((List) p.e(hVar, q4.i.f21995a)).isEmpty()) {
                    return new l4.a(str, map);
                }
                LinkedHashMap j = n0.j(map);
                j.put("coil#size", nVar.f22008b.toString());
                return new l4.a(str, j);
            }
        }
        return null;
    }

    public /* synthetic */ d(int i5, Object obj) {
        this.f10881a = i5;
        this.f10882b = obj;
    }

    /* renamed from: clone, reason: collision with other method in class */
    public Object m99clone() {
        switch (this.f10881a) {
            case 7:
                return new d((byte) 0, 7);
            default:
                return super.clone();
        }
    }

    public d(s routePlanner) {
        this.f10881a = 15;
        Intrinsics.checkNotNullParameter(routePlanner, "routePlanner");
        this.f10882b = routePlanner;
    }

    public d(v vVar, x5.h hVar) {
        this.f10881a = 18;
        this.f10882b = vVar;
    }

    public d(com.google.gson.j jVar, x xVar) {
        this.f10881a = 27;
        this.f10882b = xVar;
    }

    public d(int i5) {
        this.f10881a = 3;
        this.f10882b = new l0(i5, 2);
    }

    public d(byte b10, int i5) {
        this.f10881a = i5;
        switch (i5) {
            case 7:
                this.f10882b = new io.sentry.util.a();
                break;
            case 8:
            case 10:
            case 12:
            default:
                this.f10882b = new io.sentry.util.f(new io.sentry.clientreport.a(0));
                break;
            case 9:
                this.f10882b = new io.sentry.transport.p();
                break;
            case 11:
                this.f10882b = new io.sentry.util.network.d();
                break;
            case 13:
                this.f10882b = new ArrayDeque(16);
                break;
            case 14:
                this.f10882b = new LinkedHashSet();
                break;
        }
    }

    public d(TextView textView) {
        this.f10881a = 17;
        this.f10882b = new l1.h(textView);
    }

    public d(EditText editText) {
        this.f10881a = 16;
        this.f10882b = new l1.a(editText);
    }

    public d(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f10881a = 29;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f10882b = new r0.e(uri, clipDescription, uri2);
        } else {
            this.f10882b = new kh.g(uri, clipDescription, uri2, 1);
        }
    }

    public d(Layout layout) {
        this.f10881a = 4;
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f10882b = layout;
    }

    public d(hh.f threadFactory) {
        this.f10881a = 12;
        Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
        this.f10882b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
    }
}
