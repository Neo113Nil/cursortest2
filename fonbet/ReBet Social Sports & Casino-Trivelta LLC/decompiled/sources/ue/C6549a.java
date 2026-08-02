package ue;

import Uf.j;
import Yf.c;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.zoho.livechat.android.ZohoLiveChat;
import com.zoho.livechat.android.modules.notifications.ui.activities.NotificationReceiverActivity;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ue.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6549a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: e, reason: collision with root package name */
    public static boolean f66350e;

    /* renamed from: g, reason: collision with root package name */
    public static C6549a f66352g;

    /* renamed from: h, reason: collision with root package name */
    public static final C6549a f66353h;

    /* renamed from: a, reason: collision with root package name */
    public int f66354a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f66355b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f66356c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public static final C0923a f66349d = new C0923a(null);

    /* renamed from: f, reason: collision with root package name */
    public static boolean f66351f = true;

    /* renamed from: ue.a$a, reason: collision with other inner class name */
    public static final class C0923a {
        public /* synthetic */ C0923a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void e(C0923a c0923a, Application application, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            c0923a.d(application, z10);
        }

        public final C6549a a() {
            return C6549a.f66353h;
        }

        public final boolean b() {
            return C6549a.f66350e;
        }

        public final void c(boolean z10) {
            C6549a.f66350e = z10;
        }

        public final void d(Application application, boolean z10) {
            Intrinsics.checkNotNullParameter(application, "application");
            if (C6549a.f66351f) {
                application.registerActivityLifecycleCallbacks(a());
                C6549a.f66351f = false;
                if (z10) {
                    c(true);
                    a().f66354a = 1;
                }
            }
        }

        public C0923a() {
        }
    }

    static {
        C6549a c6549a = f66352g;
        if (c6549a == null) {
            c6549a = new C6549a();
            f66352g = c6549a;
        }
        f66353h = c6549a;
    }

    public static final C6549a h() {
        return f66349d.a();
    }

    public static final boolean k() {
        return f66349d.b();
    }

    public static final void l(Application application, boolean z10) {
        f66349d.d(application, z10);
    }

    public final void g() {
        Object m147constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Iterator it = CollectionsKt.reversed(this.f66355b).iterator();
            while (it.hasNext()) {
                c cVar = (c) ((WeakReference) it.next()).get();
                if (cVar != null && !cVar.isFinishing()) {
                    cVar.finish();
                }
            }
            this.f66355b.clear();
            m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
    }

    public final Activity i() {
        if (this.f66356c.size() <= 1) {
            return null;
        }
        return (Activity) ((WeakReference) this.f66356c.get(r0.size() - 2)).get();
    }

    public final boolean j(boolean z10) {
        return this.f66356c.isEmpty() || (this.f66356c.size() == 1 && z10 && (((WeakReference) this.f66356c.get(0)).get() instanceof NotificationReceiverActivity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f66356c.add(new WeakReference(activity));
        j.A(activity, bundle);
        if (activity instanceof c) {
            this.f66355b.add(new WeakReference(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(activity, "activity");
        ArrayList arrayList = this.f66356c;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i10 = -1;
                break;
            } else if (Intrinsics.areEqual(activity, ((WeakReference) listIterator.previous()).get())) {
                i10 = listIterator.nextIndex();
                break;
            }
        }
        Integer valueOf = Integer.valueOf(i10);
        if (valueOf.intValue() <= -1) {
            valueOf = null;
        }
        if (valueOf != null) {
        }
        j.B(activity);
        ArrayList arrayList2 = this.f66355b;
        ListIterator listIterator2 = arrayList2.listIterator(arrayList2.size());
        while (true) {
            if (!listIterator2.hasPrevious()) {
                i11 = -1;
                break;
            } else if (Intrinsics.areEqual(activity, ((WeakReference) listIterator2.previous()).get())) {
                i11 = listIterator2.nextIndex();
                break;
            }
        }
        Integer valueOf2 = Integer.valueOf(i11);
        Integer num = valueOf2.intValue() > -1 ? valueOf2 : null;
        if (num != null) {
        }
        if (this.f66356c.isEmpty()) {
            j.H();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        j.C(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        j.D(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
        j.E(activity, outState);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        j.F(activity);
        int i10 = this.f66354a + 1;
        this.f66354a = i10;
        if (i10 == 1) {
            f66350e = true;
            j applicationManager = ZohoLiveChat.getApplicationManager();
            if (applicationManager != null) {
                applicationManager.J();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        j.G(activity);
        int i10 = this.f66354a - 1;
        this.f66354a = i10;
        if (i10 == 0) {
            f66350e = false;
            j applicationManager = ZohoLiveChat.getApplicationManager();
            if (applicationManager != null) {
                applicationManager.I();
            }
        }
    }
}
