package io.sentry.util.network;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import androidx.appcompat.widget.c1;
import androidx.viewpager2.widget.o;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.sports.insider.R;
import com.sports.insider.ui.activities.SplashActivity;
import eg.m0;
import f3.z;
import gg.u;
import io.sentry.android.core.w0;
import j9.h;
import j9.k;
import j9.m;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.locks.ReentrantLock;
import k2.r;
import kotlin.jvm.internal.Intrinsics;
import mf.i;
import oi.g;
import oi.n;
import oi.s0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s7.f3;
import wg.a0;
import wg.b0;
import wg.c0;
import wg.f0;
import wg.i0;
import wg.j0;
import wg.x;
import wg.y;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class b implements s2.b, g, OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17175a;

    /* renamed from: b, reason: collision with root package name */
    public Object f17176b;

    /* renamed from: c, reason: collision with root package name */
    public Object f17177c;

    public /* synthetic */ b(int i5, Object obj, Object obj2) {
        this.f17175a = i5;
        this.f17176b = obj;
        this.f17177c = obj2;
    }

    public static a0 f(Context context, com.logrocket.core.f fVar, ArrayList arrayList) {
        b bVar = new b(context, fVar, arrayList);
        a0 w10 = j0.w();
        w10.d();
        j0.u((j0) w10.f6816b);
        b0 u10 = c0.u();
        u10.d();
        c0.p((c0) u10.f6816b);
        String str = Build.MODEL;
        u10.d();
        c0.q((c0) u10.f6816b);
        String str2 = Build.MANUFACTURER;
        u10.d();
        c0.r((c0) u10.f6816b);
        String str3 = Build.VERSION.RELEASE;
        u10.d();
        c0.t((c0) u10.f6816b);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        u10.d();
        c0.s((c0) u10.f6816b, availableProcessors);
        w10.d();
        j0.s((j0) w10.f6816b, (c0) u10.a());
        x q = y.q();
        try {
            String charSequence = context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
            q.d();
            y.p((y) q.f6816b, charSequence);
        } catch (Throwable unused) {
        }
        w10.d();
        j0.r((j0) w10.f6816b, (y) q.a());
        f0 r5 = i0.r();
        String fVar2 = ((com.logrocket.core.f) bVar.f17176b).toString();
        r5.d();
        i0.p((i0) r5.f6816b, fVar2);
        List list = (List) bVar.f17177c;
        r5.d();
        i0.q((i0) r5.f6816b, list);
        w10.d();
        j0.t((j0) w10.f6816b, (i0) r5.a());
        w10.d();
        j0.p((j0) w10.f6816b);
        try {
            String str4 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            w10.d();
            j0.q((j0) w10.f6816b, str4);
        } catch (Throwable unused2) {
        }
        return w10;
    }

    public synchronized void a() {
        if (!((LinkedHashSet) this.f17176b).isEmpty()) {
            ((k) this.f17177c).e(0L);
        }
    }

    @Override // oi.g
    public void b(oi.d dVar, Throwable th2) {
        ((n) this.f17177c).f21279a.execute(new androidx.fragment.app.d(this, (g) this.f17176b, th2, 22));
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009b A[Catch: all -> 0x009c, TRY_ENTER, TryCatch #5 {all -> 0x009c, blocks: (B:19:0x009b, B:21:0x009e, B:22:0x00a1), top: B:17:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e A[Catch: all -> 0x009c, TryCatch #5 {all -> 0x009c, blocks: (B:19:0x009b, B:21:0x009e, B:22:0x00a1), top: B:17:0x0099 }] */
    @Override // s2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s2.a c(String fileName) {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        r rVar = (r) this.f17177c;
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        if (!Intrinsics.areEqual(fileName, ":memory:")) {
            fileName = ((k2.b) rVar.f18749c).f18630a.getDatabasePath(fileName).getAbsolutePath();
            Intrinsics.checkNotNull(fileName);
        }
        boolean z5 = false;
        l2.a aVar = new l2.a(fileName, (rVar.f18747a || rVar.f18748b || Intrinsics.areEqual(fileName, ":memory:")) ? false : true);
        z onLocked = new z((Object) rVar, (Object) this, fileName, 3);
        u onLockError = new u(1, fileName);
        Intrinsics.checkNotNullParameter(onLocked, "onLocked");
        Intrinsics.checkNotNullParameter(onLockError, "onLockError");
        ReentrantLock reentrantLock = aVar.f19338a;
        reentrantLock.lock();
        b bVar = aVar.f19339b;
        if (bVar != null) {
            try {
                bVar.j();
            } catch (Throwable th2) {
                th = th2;
                try {
                    if (!z5) {
                        throw th;
                    }
                    onLockError.invoke(th);
                    throw null;
                } catch (Throwable th3) {
                    reentrantLock.unlock();
                    throw th3;
                }
            }
        }
        try {
            try {
                Object invoke = onLocked.invoke();
                if (bVar != null && (fileChannel2 = (FileChannel) bVar.f17177c) != null) {
                    try {
                        fileChannel2.close();
                        bVar.f17177c = null;
                    } finally {
                    }
                }
                reentrantLock.unlock();
                return (s2.a) invoke;
            } catch (Throwable th4) {
                if (bVar != null && (fileChannel = (FileChannel) bVar.f17177c) != null) {
                    try {
                        fileChannel.close();
                        bVar.f17177c = null;
                    } finally {
                    }
                }
                throw th4;
            }
        } catch (Throwable th5) {
            th = th5;
            z5 = true;
            if (!z5) {
            }
        }
    }

    @Override // oi.g
    public void d(oi.d dVar, s0 s0Var) {
        ((n) this.f17177c).f21279a.execute(new androidx.fragment.app.d(this, (g) this.f17176b, s0Var, 21));
    }

    @Override // s2.b
    public boolean e() {
        return ((s2.b) this.f17176b).e();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a A[Catch: JSONException -> 0x003d, TRY_ENTER, TRY_LEAVE, TryCatch #1 {JSONException -> 0x003d, blocks: (B:5:0x0013, B:7:0x002a, B:8:0x0040, B:13:0x005a, B:22:0x0070, B:24:0x0079, B:26:0x0083, B:28:0x0087, B:30:0x009e, B:31:0x00a5, B:34:0x00a6, B:35:0x00ad, B:37:0x00ae, B:38:0x00b5), top: B:4:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079 A[Catch: JSONException -> 0x003d, TryCatch #1 {JSONException -> 0x003d, blocks: (B:5:0x0013, B:7:0x002a, B:8:0x0040, B:13:0x005a, B:22:0x0070, B:24:0x0079, B:26:0x0083, B:28:0x0087, B:30:0x009e, B:31:0x00a5, B:34:0x00a6, B:35:0x00ad, B:37:0x00ae, B:38:0x00b5), top: B:4:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m9.d g(j9.e eVar) {
        String string;
        JSONArray jSONArray = eVar.f18308g;
        long j = eVar.f18307f;
        HashSet hashSet = new HashSet();
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i5);
                String string2 = jSONObject.getString("rolloutId");
                JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray2.length() > 1) {
                    w0.m("FirebaseRemoteConfig", String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string2, jSONArray2));
                }
                String optString = jSONArray2.optString(0, "");
                j9.e c2 = ((j9.d) this.f17176b).c();
                String str = null;
                if (c2 != null) {
                    try {
                        string = c2.f18303b.getString(optString);
                    } catch (JSONException unused) {
                    }
                    if (string == null) {
                        j9.e c8 = ((j9.d) this.f17177c).c();
                        if (c8 != null) {
                            try {
                                str = c8.f18303b.getString(optString);
                            } catch (JSONException unused2) {
                            }
                        }
                        string = str != null ? str : "";
                    }
                    int i10 = m9.e.f20520a;
                    m9.b bVar = new m9.b();
                    if (string2 != null) {
                        throw new NullPointerException("Null rolloutId");
                    }
                    bVar.f20508a = string2;
                    String string3 = jSONObject.getString("variantId");
                    if (string3 == null) {
                        throw new NullPointerException("Null variantId");
                    }
                    bVar.f20509b = string3;
                    if (optString == null) {
                        throw new NullPointerException("Null parameterKey");
                    }
                    bVar.f20510c = optString;
                    bVar.f20511d = string;
                    bVar.f20512e = j;
                    bVar.f20513f = (byte) (bVar.f20513f | 1);
                    hashSet.add(bVar.a());
                }
                string = null;
                if (string == null) {
                }
                int i102 = m9.e.f20520a;
                m9.b bVar2 = new m9.b();
                if (string2 != null) {
                }
            } catch (JSONException e7) {
                throw new i9.c("Exception parsing rollouts metadata to create RolloutsState.", e7);
            }
        }
        return new m9.d(hashSet);
    }

    public void h() {
        TypedValue typedValue = new TypedValue();
        SplashActivity splashActivity = (SplashActivity) this.f17176b;
        Resources.Theme theme = splashActivity.getTheme();
        theme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true);
        if (theme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
            h8.b.n(splashActivity, typedValue.resourceId);
        }
        theme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true);
        Intrinsics.checkNotNull(theme);
        m(theme, typedValue);
    }

    public Object i(i iVar) {
        lg.e eVar = m0.f9201a;
        return eg.c0.A(lg.d.f20063c, new cd.k(this, null, 8), iVar);
    }

    public void j() {
        String str = (String) this.f17176b;
        if (((FileChannel) this.f17177c) != null) {
            return;
        }
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            FileChannel channel = a.a.i(new FileOutputStream(file), file).getChannel();
            this.f17177c = channel;
            if (channel != null) {
                channel.lock();
            }
        } catch (Throwable th2) {
            FileChannel fileChannel = (FileChannel) this.f17177c;
            if (fileChannel != null) {
                fileChannel.close();
            }
            this.f17177c = null;
            throw new IllegalStateException(c1.n("Unable to lock file: '", str, "'."), th2);
        }
    }

    public void k(m0.g gVar) {
        e6.r rVar = (e6.r) this.f17177c;
        h9.c cVar = (h9.c) this.f17176b;
        int i5 = gVar.f20125b;
        if (i5 != 0) {
            rVar.execute(new o(i5, 3, cVar));
        } else {
            rVar.execute(new g8.a(24, cVar, gVar.f20124a));
        }
    }

    public void l(io.sentry.android.core.internal.gestures.c keepOnScreenCondition) {
        Intrinsics.checkNotNullParameter(keepOnScreenCondition, "keepOnScreenCondition");
        this.f17177c = keepOnScreenCondition;
        View findViewById = ((SplashActivity) this.f17176b).findViewById(android.R.id.content);
        findViewById.getViewTreeObserver().addOnPreDrawListener(new io.sentry.android.replay.a0(this, findViewById, 1));
    }

    public void m(Resources.Theme currentTheme, TypedValue typedValue) {
        int i5;
        Intrinsics.checkNotNullParameter(currentTheme, "currentTheme");
        Intrinsics.checkNotNullParameter(typedValue, "typedValue");
        if (!currentTheme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) || (i5 = typedValue.resourceId) == 0) {
            return;
        }
        ((SplashActivity) this.f17176b).setTheme(i5);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        y7.n nVar = (y7.n) this.f17176b;
        w7.g gVar = (w7.g) this.f17177c;
        synchronized (nVar.f25712f) {
            nVar.f25711e.remove(gVar);
        }
    }

    public String toString() {
        switch (this.f17175a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("NetworkBody{body=");
                sb2.append(this.f17176b);
                sb2.append(", warnings=");
                return c1.p(sb2, (List) this.f17177c, '}');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ b(int i5, Object obj, Object obj2, boolean z5) {
        this.f17175a = i5;
        this.f17177c = obj;
        this.f17176b = obj2;
    }

    public b(Context context, com.logrocket.core.f fVar, List list) {
        this.f17175a = 13;
        this.f17176b = fVar;
        this.f17177c = list;
    }

    public b(f3 f3Var) {
        this.f17175a = 12;
        this.f17177c = f3Var;
    }

    public b(int i5) {
        this.f17175a = i5;
        switch (i5) {
            case 7:
                this.f17176b = new eg.y("UpdateUseCase");
                this.f17177c = new md.o(4);
                break;
        }
    }

    public b(String filename) {
        this.f17175a = 4;
        Intrinsics.checkNotNullParameter(filename, "filename");
        this.f17176b = r4.k.l(filename, ".lck");
    }

    public b(h8.g gVar, b9.e eVar, h hVar, j9.d dVar, Context context, m mVar, ScheduledExecutorService scheduledExecutorService) {
        this.f17175a = 1;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f17176b = linkedHashSet;
        this.f17177c = new k(gVar, eVar, hVar, dVar, context, linkedHashSet, mVar, scheduledExecutorService);
    }

    public b(r rVar, s2.b actual) {
        this.f17175a = 2;
        Intrinsics.checkNotNullParameter(actual, "actual");
        this.f17177c = rVar;
        this.f17176b = actual;
    }

    public b(SplashActivity activity) {
        this.f17175a = 6;
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f17176b = activity;
        this.f17177c = new io.sentry.clientreport.a(11);
    }
}
