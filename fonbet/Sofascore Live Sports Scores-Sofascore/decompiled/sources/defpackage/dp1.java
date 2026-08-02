package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Trace;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import androidx.activity.ComponentActivity;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.ironsource.C4051e5;
import com.ironsource.C4185le;
import com.ironsource.C4289rb;
import com.ironsource.C4328te;
import com.ironsource.C4436ze;
import com.ironsource.InterfaceC4292re;
import com.unity3d.mediation.LevelPlayInitListener;
import com.unity3d.mediation.LevelPlayInitRequest;
import com.vungle.ads.internal.ui.view.o;
import com.vungle.ads.internal.ui.z;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;
import kotlinx.serialization.json.c;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class dp1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ dp1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v17, types: [kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r12v23, types: [kotlin.Unit] */
    @Override // java.lang.Runnable
    public final void run() {
        c1d C;
        int i = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                dfj dfjVar = (dfj) obj5;
                ema emaVar = (ema) obj4;
                String str = (String) obj3;
                kx4 kx4Var = (kx4) obj2;
                sf8 sf8Var = (sf8) obj;
                Trace.beginSection("BackgroundTextMeasurement");
                try {
                    nnh h = snh.h();
                    c1d c1dVar = h instanceof c1d ? (c1d) h : null;
                    if (c1dVar == null || (C = c1dVar.C(null, null)) == null) {
                        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                    }
                    try {
                        nnh j = C.j();
                        try {
                            dfj C2 = g7a.C(dfjVar, emaVar);
                            km5 km5Var = km5.a;
                            a20 a20Var = new a20(str, C2, km5Var, km5Var, sf8Var, kx4Var);
                            a20Var.c();
                            a20Var.d();
                            Unit unit = Unit.a;
                            nnh.q(j);
                            C.w().i();
                            C.c();
                            Trace.endSection();
                            return;
                        } catch (Throwable th) {
                            nnh.q(j);
                            throw th;
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            case 1:
                qqi qqiVar = (qqi) obj4;
                qqi qqiVar2 = (qqi) obj3;
                View view = (View) obj;
                Window window = ((ComponentActivity) obj2).getWindow();
                window.getClass();
                Function1 function1 = qqiVar.d;
                Resources resources = view.getResources();
                resources.getClass();
                boolean booleanValue = ((Boolean) function1.invoke(resources)).booleanValue();
                Function1 function12 = qqiVar2.d;
                Resources resources2 = view.getResources();
                resources2.getClass();
                ((pg5) obj5).b(qqiVar, qqiVar2, window, view, booleanValue, ((Boolean) function12.invoke(resources2)).booleanValue());
                return;
            case 2:
                fsf fsfVar = (fsf) obj4;
                String str2 = (String) obj3;
                ReentrantLock reentrantLock = (ReentrantLock) obj2;
                Condition condition = (Condition) obj;
                str2.getClass();
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(((URL) obj5).openConnection());
                uRLConnection.getClass();
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
                try {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        inputStream.getClass();
                        String E = d7a.E(new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8), 8192));
                        httpURLConnection.getInputStream().close();
                        fsfVar.a = new JSONObject(E).optString(str2);
                        httpURLConnection.disconnect();
                        reentrantLock.lock();
                        try {
                            condition.signal();
                            httpURLConnection = Unit.a;
                        } finally {
                        }
                    } catch (Exception e) {
                        e.getMessage();
                        httpURLConnection.disconnect();
                        reentrantLock.lock();
                        try {
                            condition.signal();
                            httpURLConnection = Unit.a;
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th3) {
                    httpURLConnection.disconnect();
                    reentrantLock.lock();
                    try {
                        condition.signal();
                        Unit unit2 = Unit.a;
                        throw th3;
                    } finally {
                    }
                }
            case 3:
                String str3 = (String) obj3;
                Function0 function0 = (Function0) obj4;
                yzc yzcVar = (yzc) obj2;
                uh2 uh2Var = (uh2) obj;
                ((dti) obj5).getClass();
                boolean M = h5a.M();
                if (M) {
                    try {
                        Trace.beginSection(h5a.U(str3));
                    } finally {
                        if (M) {
                            Trace.endSection();
                        }
                    }
                }
                try {
                    function0.invoke();
                    wud wudVar = sz8.d;
                    yzcVar.k(wudVar);
                    uh2Var.a(wudVar);
                } catch (Throwable th4) {
                    yzcVar.k(new vud(th4));
                    uh2Var.c(th4);
                }
                Unit unit3 = Unit.a;
                if (M) {
                    return;
                } else {
                    return;
                }
            case 4:
                C4289rb.a.a((C4185le) obj5, (LevelPlayInitRequest) obj4, (Context) obj3, (C4051e5) obj2, (LevelPlayInitListener) obj);
                return;
            case 5:
                z.a((o) obj5, (String) obj3, (c) obj4, (z) obj2, (WebView) obj);
                return;
            default:
                C4436ze.a((C4436ze) obj5, (InterfaceC4292re) obj4, (Context) obj3, (C4328te) obj2, (Context) obj);
                return;
        }
    }

    public /* synthetic */ dp1(Object obj, String str, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.d = str;
        this.c = obj2;
        this.e = obj3;
        this.f = obj4;
    }
}
