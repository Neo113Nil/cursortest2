package l1;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.app.l0;
import androidx.appcompat.app.v0;
import androidx.appcompat.app.y;
import androidx.core.view.g1;
import androidx.core.view.k2;
import androidx.core.view.o0;
import androidx.core.view.t1;
import androidx.core.view.v1;
import androidx.core.view.w1;
import androidx.core.view.x;
import androidx.core.view.x1;
import androidx.core.view.y1;
import androidx.core.view.z0;
import androidx.core.view.z1;
import cd.n;
import cg.l;
import com.android.billingclient.api.s0;
import com.android.billingclient.api.u0;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.cloudmessaging.zzd;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.play_billing.h5;
import com.google.android.gms.internal.play_billing.i5;
import com.google.android.gms.internal.play_billing.l5;
import com.google.android.gms.internal.play_billing.m5;
import com.google.android.gms.internal.play_billing.p1;
import com.google.android.gms.internal.play_billing.q4;
import com.google.android.gms.internal.play_billing.s4;
import com.google.android.gms.internal.play_billing.w4;
import com.google.android.gms.internal.play_billing.z4;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.sports.insider.MyApp;
import com.sports.insider.R;
import com.sports.insider.data.entity.prediction.GamesInfoData;
import e5.r;
import eg.c0;
import f7.q;
import g6.v;
import gf.u;
import hg.t0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.ILogger;
import io.sentry.a5;
import io.sentry.android.core.w0;
import io.sentry.b3;
import io.sentry.b5;
import io.sentry.b6;
import io.sentry.m4;
import io.sentry.protocol.e0;
import io.sentry.protocol.t;
import io.sentry.r4;
import io.sentry.v6;
import j$.util.Objects;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicLong;
import k2.a0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import la.m0;
import n3.m;
import rc.b0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class a implements n.a, x, l, s0, y7.c, OnCompleteListener, b3.a, g5.b, e6.k, b3, io.sentry.internal.debugmeta.a, io.sentry.clientreport.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19313a;

    /* renamed from: b, reason: collision with root package name */
    public Object f19314b;

    /* renamed from: c, reason: collision with root package name */
    public Object f19315c;

    public /* synthetic */ a(int i5, Object obj, Object obj2) {
        this.f19313a = i5;
        this.f19315c = obj;
        this.f19314b = obj2;
    }

    public static void E() {
        t0 t0Var = rc.x.f22455a;
        Intrinsics.checkNotNullParameter("Error open link", "msg");
        rc.x.f22455a.b(new u(null, 500, "Error open link"));
    }

    public static final cd.h e(a aVar) {
        if (((WeakReference) aVar.f19314b) == null) {
            aVar.f19314b = new WeakReference(new cd.h());
        }
        WeakReference weakReference = (WeakReference) aVar.f19314b;
        if ((weakReference != null ? (cd.h) weakReference.get() : null) == null) {
            aVar.f19314b = new WeakReference(new cd.h());
        }
        WeakReference weakReference2 = (WeakReference) aVar.f19314b;
        if (weakReference2 != null) {
            return (cd.h) weakReference2.get();
        }
        return null;
    }

    public static final void f(a aVar) {
        t0 t0Var = rc.x.f22455a;
        Intrinsics.checkNotNullParameter("Error open link (Missing Play Store)", "msg");
        rc.x.f22455a.b(new u(null, 2000, "Error open link (Missing Play Store)"));
    }

    public static final void g(a aVar, int i5) {
        aVar.getClass();
        if (i5 == 0) {
            t0 t0Var = rc.x.f22455a;
            rc.x.a(R.string.Lack_of_internet_connection, true);
        } else {
            if ((200 <= i5 && i5 < 400) || i5 == 404 || i5 == 1) {
                return;
            }
            t0 t0Var2 = rc.x.f22455a;
            rc.x.a(R.string.error_get_forecast, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a h(Context context) {
        FileChannel fileChannel;
        FileLock fileLock;
        try {
            fileChannel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLock = fileChannel.lock();
            } catch (IOException | Error | OverlappingFileLockException e7) {
                e = e7;
                fileLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e9) {
            e = e9;
            fileChannel = null;
            fileLock = null;
        }
        try {
            return new a(3, fileChannel, fileLock, false);
        } catch (IOException e10) {
            e = e10;
            w0.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
                try {
                    fileLock.release();
                } catch (IOException unused) {
                }
            }
            if (fileChannel != null) {
                try {
                    fileChannel.close();
                } catch (IOException unused2) {
                }
            }
            return null;
        } catch (Error e11) {
            e = e11;
            w0.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
            }
            if (fileChannel != null) {
            }
            return null;
        } catch (OverlappingFileLockException e12) {
            e = e12;
            w0.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e);
            if (fileLock != null) {
            }
            if (fileChannel != null) {
            }
            return null;
        }
    }

    public static io.sentry.l k(a5 a5Var) {
        return a5.Event.equals(a5Var) ? io.sentry.l.Error : a5.Session.equals(a5Var) ? io.sentry.l.Session : a5.Transaction.equals(a5Var) ? io.sentry.l.Transaction : a5.UserFeedback.equals(a5Var) ? io.sentry.l.UserReport : a5.Feedback.equals(a5Var) ? io.sentry.l.Feedback : a5.Profile.equals(a5Var) ? io.sentry.l.Profile : a5.ProfileChunk.equals(a5Var) ? io.sentry.l.ProfileChunkUi : a5.Attachment.equals(a5Var) ? io.sentry.l.Attachment : a5.CheckIn.equals(a5Var) ? io.sentry.l.Monitor : a5.ReplayVideo.equals(a5Var) ? io.sentry.l.Replay : a5.Log.equals(a5Var) ? io.sentry.l.LogItem : a5.Span.equals(a5Var) ? io.sentry.l.Span : a5.TraceMetric.equals(a5Var) ? io.sentry.l.TraceMetric : io.sentry.l.Default;
    }

    public static Object q(Integer num, mf.i iVar) {
        m0 r5 = r();
        int intValue = num.intValue();
        r5.getClass();
        fb.b bVar = new fb.b();
        lg.e eVar = eg.m0.f9201a;
        return c0.A(lg.d.f20063c, new kb.b(bVar, intValue, null, 4), iVar);
    }

    public static m0 r() {
        return (m0) y3.m(m0.class, null, 6);
    }

    public void A() {
        try {
            ((FileLock) this.f19315c).release();
            ((FileChannel) this.f19314b).close();
        } catch (IOException e7) {
            w0.e("CrossProcessLock", "encountered error while releasing, ignoring", e7);
        }
    }

    public void B(io.sentry.clientreport.c cVar) {
        if (cVar == null) {
            return;
        }
        Iterator it = cVar.f16279b.iterator();
        while (it.hasNext()) {
            io.sentry.clientreport.f fVar = (io.sentry.clientreport.f) it.next();
            z(fVar.f16283a, fVar.f16284b, fVar.f16285c);
        }
    }

    public void C(String str) {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.f19314b;
        if (str != null) {
            cVar.getClass();
            if (str.length() != 0) {
                cVar.f17221d = str;
                cVar.f17222e = ": ";
                return;
            }
        }
        cVar.f17221d = null;
        cVar.f17222e = StringUtils.PROCESS_POSTFIX_DELIMITER;
    }

    public void D(f3.k workSpecId, int i5) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        com.google.firebase.messaging.x xVar = (com.google.firebase.messaging.x) this.f19315c;
        ((a0) xVar.f6182a).execute(new m((f3.f) this.f19314b, workSpecId, false, i5));
    }

    public a F(double d10) {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.f19314b;
        cVar.y();
        if (cVar.f17223f || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            cVar.c();
            cVar.f17218a.append((CharSequence) Double.toString(d10));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
    }

    public a G(long j) {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.f19314b;
        cVar.y();
        cVar.c();
        cVar.f17218a.write(Long.toString(j));
        return this;
    }

    public a H(ILogger iLogger, Object obj) {
        ((i2.d) this.f19315c).B(this, iLogger, obj);
        return this;
    }

    public a I(Boolean bool) {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.f19314b;
        if (bool == null) {
            cVar.r();
            return this;
        }
        cVar.y();
        cVar.c();
        cVar.f17218a.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public a J(Number number) {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.f19314b;
        if (number == null) {
            cVar.r();
            return this;
        }
        cVar.y();
        String obj = number.toString();
        if (cVar.f17223f || !(obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            cVar.c();
            cVar.f17218a.append((CharSequence) obj);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public a K(String str) {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.f19314b;
        if (str == null) {
            cVar.r();
            return this;
        }
        cVar.y();
        cVar.c();
        cVar.w(str);
        return this;
    }

    public a L(boolean z5) {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.f19314b;
        cVar.y();
        cVar.c();
        cVar.f17218a.write(z5 ? "true" : "false");
        return this;
    }

    public int M(Context context, d6.c cVar) {
        int i5;
        v.h(context);
        v.h(cVar);
        int a7 = cVar.a();
        int N = N(a7);
        if (N != -1) {
            return N;
        }
        SparseIntArray sparseIntArray = (SparseIntArray) this.f19314b;
        synchronized (sparseIntArray) {
            i5 = 0;
            int i10 = 0;
            while (true) {
                try {
                    if (i10 >= sparseIntArray.size()) {
                        i5 = -1;
                        break;
                    }
                    int keyAt = sparseIntArray.keyAt(i10);
                    if (keyAt > a7 && sparseIntArray.get(keyAt) == 0) {
                        break;
                    }
                    i10++;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (i5 == -1) {
                i5 = ((c6.c) this.f19315c).b(context, a7);
            }
            sparseIntArray.put(a7, i5);
        }
        return i5;
    }

    public int N(int i5) {
        int i10;
        SparseIntArray sparseIntArray = (SparseIntArray) this.f19314b;
        synchronized (sparseIntArray) {
            i10 = sparseIntArray.get(i5, -1);
        }
        return i10;
    }

    public void O(q4 q4Var) {
        if (q4Var == null) {
            return;
        }
        try {
            h5 t3 = i5.t();
            t3.f((com.google.android.gms.internal.play_billing.a5) this.f19314b);
            t3.e();
            i5.n((i5) t3.f5450b, q4Var);
            ((u0) this.f19315c).m((i5) t3.b());
        } catch (Throwable th2) {
            p1.h("BillingLogger", "Unable to log.", th2);
        }
    }

    public void P(q4 q4Var, int i5) {
        try {
            z4 z4Var = (z4) ((com.google.android.gms.internal.play_billing.a5) this.f19314b).g();
            z4Var.e();
            com.google.android.gms.internal.play_billing.a5.n((com.google.android.gms.internal.play_billing.a5) z4Var.f5450b, i5);
            this.f19314b = (com.google.android.gms.internal.play_billing.a5) z4Var.b();
            O(q4Var);
        } catch (Throwable th2) {
            p1.h("BillingLogger", "Unable to log.", th2);
        }
    }

    public void Q(s4 s4Var) {
        if (s4Var == null) {
            return;
        }
        try {
            h5 t3 = i5.t();
            t3.f((com.google.android.gms.internal.play_billing.a5) this.f19314b);
            t3.e();
            i5.o((i5) t3.f5450b, s4Var);
            ((u0) this.f19315c).m((i5) t3.b());
        } catch (Throwable th2) {
            p1.h("BillingLogger", "Unable to log.", th2);
        }
    }

    public void R(w4 w4Var) {
        try {
            h5 t3 = i5.t();
            t3.f((com.google.android.gms.internal.play_billing.a5) this.f19314b);
            t3.e();
            i5.p((i5) t3.f5450b, w4Var);
            ((u0) this.f19315c).m((i5) t3.b());
        } catch (Throwable th2) {
            p1.h("BillingLogger", "Unable to log.", th2);
        }
    }

    public void S(l5 l5Var) {
        try {
            u0 u0Var = (u0) this.f19315c;
            h5 t3 = i5.t();
            t3.f((com.google.android.gms.internal.play_billing.a5) this.f19314b);
            t3.e();
            i5.r((i5) t3.f5450b, l5Var);
            u0Var.m((i5) t3.b());
        } catch (Throwable th2) {
            p1.h("BillingLogger", "Unable to log.", th2);
        }
    }

    public void T(m5 m5Var) {
        if (m5Var == null) {
            return;
        }
        try {
            h5 t3 = i5.t();
            t3.f((com.google.android.gms.internal.play_billing.a5) this.f19314b);
            t3.e();
            i5.s((i5) t3.f5450b, m5Var);
            ((u0) this.f19315c).m((i5) t3.b());
        } catch (Throwable th2) {
            p1.h("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // y7.c
    public Object a() {
        return new com.google.android.play.core.appupdate.k(((b2.e) ((h9.c) this.f19314b).f10430b).f2968a, (com.google.android.play.core.appupdate.l) ((y7.c) this.f19315c).a());
    }

    @Override // e6.k
    public void accept(Object obj, Object obj2) {
        f7.a aVar = new f7.a((f7.b) this.f19314b, (w7.g) obj2, 2);
        q qVar = (q) ((f7.d) obj).m();
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) this.f19315c;
        ApiMetadata a7 = f7.e.a();
        Parcel a10 = qVar.a();
        int i5 = f7.l.f9493a;
        a10.writeStrongBinder(aVar);
        f7.l.b(a10, getSignInIntentRequest);
        f7.l.b(a10, a7);
        qVar.e(a10, 3);
    }

    @Override // io.sentry.clientreport.g
    public void b(io.sentry.clientreport.e eVar, io.sentry.l lVar) {
        l(eVar, lVar, 1L);
    }

    @Override // io.sentry.clientreport.g
    public void c(io.sentry.clientreport.e eVar, a aVar) {
        if (aVar == null) {
            return;
        }
        try {
            Iterator it = ((Iterable) aVar.f19315c).iterator();
            while (it.hasNext()) {
                m(eVar, (r4) it.next());
            }
        } catch (Throwable th2) {
            ((b6) this.f19315c).getLogger().b(b5.ERROR, th2, "Unable to record lost envelope.", new Object[0]);
        }
    }

    @Override // io.sentry.internal.debugmeta.a
    public List d() {
        ILogger iLogger = (ILogger) this.f19315c;
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(((Context) this.f19314b).getAssets().open("sentry-debug-meta.properties"));
            try {
                Properties properties = new Properties();
                properties.load(bufferedInputStream);
                List singletonList = Collections.singletonList(properties);
                bufferedInputStream.close();
                return singletonList;
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (FileNotFoundException unused) {
            iLogger.h(b5.INFO, "%s file was not found.", "sentry-debug-meta.properties");
            return null;
        } catch (IOException e7) {
            iLogger.e(b5.ERROR, "Error getting Proguard UUIDs.", e7);
            return null;
        } catch (RuntimeException e9) {
            iLogger.b(b5.ERROR, e9, "%s file is malformed.", "sentry-debug-meta.properties");
            return null;
        }
    }

    @Override // ff.a
    public Object get() {
        return new f5.d((Context) ((c4.k) this.f19314b).f3593a, (v0) ((h9.c) this.f19315c).get());
    }

    @Override // b3.a
    public View getRoot() {
        switch (this.f19313a) {
            case 14:
                return (LinearLayout) this.f19314b;
            default:
                return (FrameLayout) this.f19314b;
        }
    }

    public void i(Object obj, String str) {
        int length = str.length();
        String valueOf = String.valueOf(obj);
        ((ArrayList) this.f19314b).add(d9.e.m(new StringBuilder(length + 1 + valueOf.length()), str, "=", valueOf));
    }

    public a j() {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.f19314b;
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
        iArr2[i10] = 3;
        cVar.f17218a.write(123);
        return this;
    }

    @Override // io.sentry.clientreport.g
    public void l(io.sentry.clientreport.e eVar, io.sentry.l lVar, long j) {
        try {
            z(eVar.getReason(), lVar.getCategory(), Long.valueOf(j));
            p();
        } catch (Throwable th2) {
            ((b6) this.f19315c).getLogger().b(b5.ERROR, th2, "Unable to record lost event.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.g
    public void m(io.sentry.clientreport.e eVar, r4 r4Var) {
        b6 b6Var = (b6) this.f19315c;
        if (r4Var == null) {
            return;
        }
        try {
            a5 a5Var = r4Var.f16985a.f17078e;
            if (a5.ClientReport.equals(a5Var)) {
                try {
                    B(r4Var.e(b6Var.getSerializer()));
                    return;
                } catch (Exception unused) {
                    b6Var.getLogger().h(b5.ERROR, "Unable to restore counts from previous client report.", new Object[0]);
                    return;
                }
            }
            io.sentry.l k6 = k(a5Var);
            if (k6.equals(io.sentry.l.Transaction)) {
                e0 i5 = r4Var.i(b6Var.getSerializer());
                if (i5 != null) {
                    ArrayList arrayList = i5.f16772s;
                    z(eVar.getReason(), io.sentry.l.Span.getCategory(), Long.valueOf(arrayList.size() + 1));
                    arrayList.size();
                    p();
                }
                z(eVar.getReason(), k6.getCategory(), 1L);
                p();
                return;
            }
            if (k6.equals(io.sentry.l.LogItem)) {
                if (r4Var.g(b6Var.getSerializer()) == null) {
                    b6Var.getLogger().h(b5.ERROR, "Unable to parse lost logs envelope item.", new Object[0]);
                    return;
                }
                z(eVar.getReason(), k6.getCategory(), Long.valueOf(r0.f16381a.size()));
                z(eVar.getReason(), io.sentry.l.LogByte.getCategory(), Long.valueOf(r4Var.f().length));
                p();
                return;
            }
            if (!k6.equals(io.sentry.l.TraceMetric)) {
                z(eVar.getReason(), k6.getCategory(), 1L);
                p();
                return;
            }
            if (r4Var.h(b6Var.getSerializer()) == null) {
                b6Var.getLogger().h(b5.ERROR, "Unable to parse lost metrics envelope item.", new Object[0]);
                return;
            }
            z(eVar.getReason(), k6.getCategory(), Long.valueOf(r12.f16489a.size()));
            p();
        } catch (Throwable th2) {
            b6Var.getLogger().b(b5.ERROR, th2, "Unable to record lost envelope item.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.g
    public a n(a aVar) {
        b6 b6Var = (b6) this.f19315c;
        Date n9 = com.google.android.play.core.appupdate.b.n();
        i2.d dVar = (i2.d) this.f19314b;
        dVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((Map) ((io.sentry.util.f) dVar.f10882b).a()).entrySet()) {
            long andSet = ((AtomicLong) entry.getValue()).getAndSet(0L);
            Long valueOf = Long.valueOf(andSet);
            if (andSet > 0) {
                arrayList.add(new io.sentry.clientreport.f(((io.sentry.clientreport.d) entry.getKey()).f16281a, ((io.sentry.clientreport.d) entry.getKey()).f16282b, valueOf));
            }
        }
        io.sentry.clientreport.c cVar = arrayList.isEmpty() ? null : new io.sentry.clientreport.c(n9, arrayList);
        if (cVar == null) {
            return aVar;
        }
        try {
            b6Var.getLogger().h(b5.DEBUG, "Attaching client report to envelope.", new Object[0]);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ((Iterable) aVar.f19315c).iterator();
            while (it.hasNext()) {
                arrayList2.add((r4) it.next());
            }
            arrayList2.add(r4.b(b6Var.getSerializer(), cVar));
            return new a((m4) aVar.f19314b, arrayList2);
        } catch (Throwable th2) {
            b6Var.getLogger().b(b5.ERROR, th2, "Unable to attach client report to envelope.", new Object[0]);
            return aVar;
        }
    }

    public a o() {
        ((io.sentry.vendor.gson.stream.c) this.f19314b).k('}', 3, 5);
        return this;
    }

    @Override // androidx.core.view.x
    public k2 onApplyWindowInsets(View view, k2 k2Var) {
        c3.h hVar = (c3.h) this.f19315c;
        k2 j = z0.j(view, k2Var);
        if (j.f1349a.n()) {
            return j;
        }
        Rect rect = (Rect) this.f19314b;
        rect.left = j.b();
        rect.top = j.d();
        rect.right = j.c();
        rect.bottom = j.a();
        int childCount = hVar.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            k2 b10 = z0.b(hVar.getChildAt(i5), j);
            rect.left = Math.min(b10.b(), rect.left);
            rect.top = Math.min(b10.d(), rect.top);
            rect.right = Math.min(b10.c(), rect.right);
            rect.bottom = Math.min(b10.a(), rect.bottom);
        }
        int i10 = Build.VERSION.SDK_INT;
        z1 y1Var = i10 >= 34 ? new y1(j) : i10 >= 31 ? new x1(j) : i10 >= 30 ? new w1(j) : i10 >= 29 ? new v1(j) : new t1(j);
        y1Var.g(g0.d.c(rect.left, rect.top, rect.right, rect.bottom));
        return y1Var.b();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        d8.c cVar = (d8.c) this.f19314b;
        w7.g gVar = (w7.g) this.f19315c;
        synchronized (cVar.f8285f) {
            cVar.f8284e.remove(gVar);
        }
    }

    public void p() {
        ((b6) this.f19315c).getOnDiscard();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:10)(2:15|16))(3:17|(2:21|(1:23))|24)|11|12))|27|6|7|(0)(0)|11|12) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0028, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        zc.d.b(6, null, r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object s(Integer num, mf.c cVar) {
        id.f fVar;
        int i5;
        if (cVar instanceof id.f) {
            fVar = (id.f) cVar;
            int i10 = fVar.f11153c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f11153c = i10 - Integer.MIN_VALUE;
                Object obj = fVar.f11151a;
                lf.a aVar = lf.a.f20034a;
                i5 = fVar.f11153c;
                if (i5 != 0) {
                    h8.b.B(obj);
                    if (num != null && num.intValue() > 0) {
                        m0 r5 = r();
                        int intValue = num.intValue();
                        fVar.f11153c = 1;
                        obj = r5.e(intValue, fVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    return null;
                }
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h8.b.B(obj);
                return (GamesInfoData) obj;
            }
        }
        fVar = new id.f(this, cVar);
        Object obj2 = fVar.f11151a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = fVar.f11153c;
        if (i5 != 0) {
        }
        return (GamesInfoData) obj2;
    }

    public n t() {
        if (((WeakReference) this.f19315c) == null) {
            this.f19315c = new WeakReference(new n());
        }
        WeakReference weakReference = (WeakReference) this.f19315c;
        if ((weakReference != null ? (n) weakReference.get() : null) == null) {
            this.f19315c = new WeakReference(new n());
        }
        WeakReference weakReference2 = (WeakReference) this.f19315c;
        if (weakReference2 != null) {
            return (n) weakReference2.get();
        }
        return null;
    }

    @Override // cg.l
    public cg.g toInstant() {
        throw new cg.h(((String) this.f19314b) + " when parsing an Instant from \"" + cg.j.e(64, (String) this.f19315c) + '\"', 0);
    }

    public String toString() {
        switch (this.f19313a) {
            case 20:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f19315c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f19314b;
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    sb2.append((String) arrayList.get(i5));
                    if (i5 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public a u(String str) {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.f19314b;
        if (str == null) {
            cVar.getClass();
            throw new NullPointerException("name == null");
        }
        if (cVar.f17224g != null) {
            throw new IllegalStateException();
        }
        if (cVar.f17220c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        cVar.f17224g = str;
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.appcompat.app.p, java.lang.Object] */
    public void v(n.b bVar) {
        com.google.firebase.messaging.x xVar = (com.google.firebase.messaging.x) this.f19314b;
        ((ActionMode.Callback) xVar.f6182a).onDestroyActionMode(xVar.u(bVar));
        l0 l0Var = (l0) this.f19315c;
        if (l0Var.f326w != null) {
            l0Var.f305l.getDecorView().removeCallbacks(l0Var.f328x);
        }
        if (l0Var.f324v != null) {
            g1 g1Var = l0Var.f329y;
            if (g1Var != null) {
                g1Var.b();
            }
            g1 a7 = z0.a(l0Var.f324v);
            a7.a(0.0f);
            l0Var.f329y = a7;
            a7.d(new y(2, this));
        }
        l0Var.f309n.onSupportActionModeFinished(l0Var.f322u);
        l0Var.f322u = null;
        ViewGroup viewGroup = l0Var.A;
        WeakHashMap weakHashMap = z0.f1413a;
        o0.c(viewGroup);
        l0Var.G();
    }

    public boolean w(n.b bVar, Menu menu) {
        ViewGroup viewGroup = ((l0) this.f19315c).A;
        WeakHashMap weakHashMap = z0.f1413a;
        o0.c(viewGroup);
        com.google.firebase.messaging.x xVar = (com.google.firebase.messaging.x) this.f19314b;
        ActionMode.Callback callback = (ActionMode.Callback) xVar.f6182a;
        n.f u10 = xVar.u(bVar);
        s.n nVar = (s.n) xVar.f6185d;
        Menu menu2 = (Menu) nVar.get(menu);
        if (menu2 == null) {
            menu2 = new androidx.appcompat.view.menu.c0((Context) xVar.f6183b, (androidx.appcompat.view.menu.n) menu);
            nVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(u10, menu2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x011b, code lost:
    
        if (r0 == r3) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x016d, code lost:
    
        if (r0 == r3) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e5, code lost:
    
        if (eg.c0.A(lg.d.f20063c, new kb.b(r0, r4, r8, r5), r1) == r3) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object x(kc.b bVar, int i5, mf.c cVar) {
        id.k kVar;
        a aVar;
        int i10;
        kc.b bVar2;
        int i11;
        n t3;
        int type;
        n t5;
        n t10;
        if (cVar instanceof id.k) {
            kVar = (id.k) cVar;
            int i12 = kVar.f11178e;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                kVar.f11178e = i12 - Integer.MIN_VALUE;
                aVar = this;
                Object obj = kVar.f11176c;
                Object obj2 = lf.a.f20034a;
                i10 = kVar.f11178e;
                int i13 = 6;
                Continuation continuation = null;
                if (i10 != 0) {
                    h8.b.B(obj);
                    int type2 = bVar.getType();
                    if (type2 == 1) {
                        n t11 = aVar.t();
                        if (t11 != null) {
                            t11.c("show_forecast_standart", null);
                        }
                    } else if (type2 == 2) {
                        n t12 = aVar.t();
                        if (t12 != null) {
                            int id2 = bVar.getId();
                            String status = bVar.statusPrediction();
                            int startTime = bVar.getStartTime();
                            Intrinsics.checkNotNullParameter(status, "status");
                            c0.t(MyApp.f6830c, b0.b(), null, new cd.m(t12, id2, status, startTime, null, 1), 2);
                        }
                    } else if (type2 == 3 && (t3 = aVar.t()) != null) {
                        int id3 = bVar.getId();
                        String status2 = bVar.statusPrediction();
                        int startTime2 = bVar.getStartTime();
                        Intrinsics.checkNotNullParameter(status2, "status");
                        c0.t(MyApp.f6830c, b0.b(), null, new cd.m(t3, id3, status2, startTime2, null, 0), 2);
                    }
                    m0 r5 = r();
                    int id4 = bVar.getId();
                    bVar2 = bVar;
                    kVar.f11174a = bVar2;
                    i11 = i5;
                    kVar.f11175b = i11;
                    kVar.f11178e = 1;
                    r5.getClass();
                    fb.b bVar3 = new fb.b();
                    lg.e eVar = eg.m0.f9201a;
                } else {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            h8.b.B(obj);
                            ja.a aVar2 = (ja.a) obj;
                            if (aVar2 != null && (t5 = aVar.t()) != null) {
                                String orderId = aVar2.f18360a;
                                String productId = aVar2.f18361b;
                                int i14 = aVar2.f18362c;
                                Intrinsics.checkNotNullParameter(orderId, "orderId");
                                Intrinsics.checkNotNullParameter(productId, "productId");
                                c0.t(MyApp.f6830c, b0.b(), null, new cd.j(orderId, t5, productId, i14, (Continuation) null, 1), 2);
                            }
                            return Unit.f19194a;
                        }
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        ja.a aVar3 = (ja.a) obj;
                        if (aVar3 != null && (t10 = aVar.t()) != null) {
                            String orderId2 = aVar3.f18360a;
                            String productId2 = aVar3.f18361b;
                            int i15 = aVar3.f18362c;
                            Intrinsics.checkNotNullParameter(orderId2, "orderId");
                            Intrinsics.checkNotNullParameter(productId2, "productId");
                            c0.t(MyApp.f6830c, b0.b(), null, new cd.j(orderId2, t10, productId2, i15, (Continuation) null, 1), 2);
                        }
                        return Unit.f19194a;
                    }
                    int i16 = kVar.f11175b;
                    bVar2 = kVar.f11174a;
                    h8.b.B(obj);
                    i11 = i16;
                }
                type = bVar2.getType();
                if (type == 1) {
                    if (type == 2) {
                        if (aVar.t() != null) {
                            new m3.f(i13).n("PredictionViewed", String.valueOf(bVar2.getId()));
                        }
                        kVar.f11174a = null;
                        kVar.f11175b = i11;
                        kVar.f11178e = 2;
                        obj = r().b(i11, kVar);
                    } else if (type == 3) {
                        if (aVar.t() != null) {
                            new m3.f(i13).n("PredictionViewed", String.valueOf(bVar2.getId()));
                        }
                        kVar.f11174a = null;
                        kVar.f11175b = i11;
                        kVar.f11178e = 3;
                        obj = r().b(i11, kVar);
                    }
                    return obj2;
                }
                if (aVar.t() != null) {
                    new m3.f(i13).n("PredictionViewed", String.valueOf(bVar2.getId()));
                }
                return Unit.f19194a;
            }
        }
        aVar = this;
        kVar = new id.k(aVar, cVar);
        Object obj3 = kVar.f11176c;
        Object obj22 = lf.a.f20034a;
        i10 = kVar.f11178e;
        int i132 = 6;
        Continuation continuation2 = null;
        if (i10 != 0) {
        }
        type = bVar2.getType();
        if (type == 1) {
        }
        return Unit.f19194a;
    }

    public void y(Context context, boolean z5) {
        if (context == null) {
            E();
        } else {
            c0.t(MyApp.f6830c, new eg.y("openPlayStoreSubs"), null, new hd.g(context, z5, this, null, 0), 2);
        }
    }

    public void z(String str, String str2, Long l6) {
        AtomicLong atomicLong = (AtomicLong) ((Map) ((io.sentry.util.f) ((i2.d) this.f19314b).f10882b).a()).get(new io.sentry.clientreport.d(str, str2));
        if (atomicLong != null) {
            atomicLong.addAndGet(l6.longValue());
        }
    }

    public /* synthetic */ a(int i5, Object obj, Object obj2, boolean z5) {
        this.f19313a = i5;
        this.f19314b = obj;
        this.f19315c = obj2;
    }

    public /* synthetic */ a(int i5, boolean z5) {
        this.f19313a = i5;
    }

    public a(Context context, com.google.android.gms.internal.play_billing.a5 a5Var) {
        this.f19313a = 8;
        u0 u0Var = new u0();
        try {
            r.b(context);
            u0Var.f4107b = r.a().c(c5.a.f3637e).a("PLAY_BILLING_LIBRARY", new b5.c("proto"), new y8.d());
        } catch (Throwable unused) {
            u0Var.f4106a = true;
        }
        this.f19315c = u0Var;
        this.f19314b = a5Var;
    }

    public a(IBinder iBinder) {
        this.f19313a = 2;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f19314b = new Messenger(iBinder);
            this.f19315c = null;
        } else if (Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
            this.f19315c = new zzd(iBinder);
            this.f19314b = null;
        } else {
            w0.m("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
            throw new RemoteException();
        }
    }

    public /* synthetic */ a(Object obj) {
        this.f19313a = 20;
        this.f19315c = obj;
        this.f19314b = new ArrayList();
    }

    public a(String str, y3 y3Var, d6.d dVar) {
        this.f19313a = 10;
        this.f19315c = str;
        this.f19314b = y3Var;
    }

    public a(int i5) {
        this.f19313a = i5;
        switch (i5) {
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                this.f19314b = gf.k.b(new b2.b(24));
                this.f19315c = new hd.f(0, this);
                break;
            default:
                c6.c cVar = c6.c.f3657e;
                this.f19314b = new SparseIntArray();
                this.f19315c = cVar;
                break;
        }
    }

    public a(Writer writer, int i5) {
        this.f19313a = 25;
        this.f19314b = new io.sentry.vendor.gson.stream.c(writer);
        this.f19315c = new i2.d(i5);
    }

    public a(MyApp myApp, ILogger iLogger) {
        this.f19313a = 28;
        Context applicationContext = myApp.getApplicationContext();
        this.f19314b = applicationContext != null ? applicationContext : myApp;
        this.f19315c = iLogger;
    }

    public a(b6 b6Var) {
        this.f19313a = 29;
        this.f19315c = b6Var;
        this.f19314b = new i2.d((byte) 0, 6);
    }

    public a(m4 m4Var, List list) {
        this.f19313a = 27;
        y4.a.C(m4Var, "SentryEnvelopeHeader is required.");
        this.f19314b = m4Var;
        y4.a.C(list, "SentryEnvelope items are required.");
        this.f19315c = list;
    }

    public a(v6 v6Var, Double d10) {
        this.f19313a = 26;
        this.f19314b = v6Var;
        this.f19315c = d10;
        Map map = Collections.EMPTY_MAP;
    }

    public a(f3.f processor, com.google.firebase.messaging.x workTaskExecutor) {
        this.f19313a = 17;
        Intrinsics.checkNotNullParameter(processor, "processor");
        Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
        this.f19314b = processor;
        this.f19315c = workTaskExecutor;
    }

    public a(io.sentry.protocol.v vVar, t tVar, r4 r4Var) {
        this.f19313a = 27;
        this.f19314b = new m4(vVar, tVar, null);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(r4Var);
        this.f19315c = arrayList;
    }

    public a(com.google.firebase.messaging.x _koin) {
        this.f19313a = 24;
        Intrinsics.checkNotNullParameter(_koin, "_koin");
        this.f19314b = _koin;
        this.f19315c = new ArrayList();
    }

    public a(ArrayList arrayList, ArrayList arrayList2) {
        this.f19313a = 16;
        int size = arrayList.size();
        this.f19314b = new int[size];
        this.f19315c = new float[size];
        for (int i5 = 0; i5 < size; i5++) {
            ((int[]) this.f19314b)[i5] = ((Integer) arrayList.get(i5)).intValue();
            ((float[]) this.f19315c)[i5] = ((Float) arrayList2.get(i5)).floatValue();
        }
    }

    public a(int i5, int i10) {
        this.f19313a = 16;
        this.f19314b = new int[]{i5, i10};
        this.f19315c = new float[]{0.0f, 1.0f};
    }

    public a(int i5, int i10, int i11) {
        this.f19313a = 16;
        this.f19314b = new int[]{i5, i10, i11};
        this.f19315c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public a(EditText editText) {
        this.f19313a = 0;
        this.f19314b = editText;
        j jVar = new j(editText);
        this.f19315c = jVar;
        editText.addTextChangedListener(jVar);
        if (b.f19317b == null) {
            synchronized (b.f19316a) {
                try {
                    if (b.f19317b == null) {
                        b bVar = new b();
                        try {
                            b.f19318c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        b.f19317b = bVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(b.f19317b);
    }

    public a(c3.h hVar) {
        this.f19313a = 4;
        this.f19315c = hVar;
        this.f19314b = new Rect();
    }

    public a(String error, String input) {
        this.f19313a = 5;
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(input, "input");
        this.f19314b = error;
        this.f19315c = input;
    }
}
