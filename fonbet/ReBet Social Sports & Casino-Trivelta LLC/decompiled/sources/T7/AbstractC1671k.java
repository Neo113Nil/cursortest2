package T7;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.util.Log;
import g6.C4331C;
import g6.C4357q;
import g6.InterfaceC4350j;
import g6.InterfaceC4354n;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: T7.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1671k {

    /* renamed from: f, reason: collision with root package name */
    public static final a f11137f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final Object f11138g = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Activity f11139a;

    /* renamed from: b, reason: collision with root package name */
    public final B f11140b;

    /* renamed from: c, reason: collision with root package name */
    public List f11141c;

    /* renamed from: d, reason: collision with root package name */
    public int f11142d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC4350j f11143e;

    /* renamed from: T7.k$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: T7.k$b */
    public abstract class b {

        /* renamed from: a, reason: collision with root package name */
        public Object f11144a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC1671k f11145b;

        public b(AbstractC1671k this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f11145b = this$0;
            this.f11144a = AbstractC1671k.f11138g;
        }

        public abstract boolean a(Object obj, boolean z10);

        public abstract C1661a b(Object obj);

        public Object c() {
            return this.f11144a;
        }
    }

    public AbstractC1671k(Activity activity, int i10) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f11139a = activity;
        this.f11140b = null;
        this.f11142d = i10;
        this.f11143e = null;
    }

    public final List a() {
        if (this.f11141c == null) {
            this.f11141c = g();
        }
        List list = this.f11141c;
        if (list != null) {
            return list;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<com.facebook.internal.FacebookDialogBase.ModeHandler<CONTENT of com.facebook.internal.FacebookDialogBase, RESULT of com.facebook.internal.FacebookDialogBase>>");
    }

    public boolean b(Object obj) {
        return c(obj, f11138g);
    }

    public boolean c(Object obj, Object mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        boolean z10 = mode == f11138g;
        for (b bVar : a()) {
            if (!z10) {
                Y y10 = Y.f11042a;
                if (!Y.e(bVar.c(), mode)) {
                    continue;
                }
            }
            if (bVar.a(obj, false)) {
                return true;
            }
        }
        return false;
    }

    public final C1661a d(Object obj, Object obj2) {
        C1661a c1661a;
        boolean z10 = obj2 == f11138g;
        Iterator it = a().iterator();
        while (true) {
            if (!it.hasNext()) {
                c1661a = null;
                break;
            }
            b bVar = (b) it.next();
            if (!z10) {
                Y y10 = Y.f11042a;
                if (!Y.e(bVar.c(), obj2)) {
                    continue;
                }
            }
            if (bVar.a(obj, true)) {
                try {
                    c1661a = bVar.b(obj);
                    break;
                } catch (C4357q e10) {
                    C1661a e11 = e();
                    C1670j c1670j = C1670j.f11136a;
                    C1670j.l(e11, e10);
                    c1661a = e11;
                }
            }
        }
        if (c1661a != null) {
            return c1661a;
        }
        C1661a e12 = e();
        C1670j.h(e12);
        return e12;
    }

    public abstract C1661a e();

    public final Activity f() {
        Activity activity = this.f11139a;
        if (activity != null) {
            return activity;
        }
        B b10 = this.f11140b;
        if (b10 == null) {
            return null;
        }
        return b10.a();
    }

    public abstract List g();

    public final int h() {
        return this.f11142d;
    }

    public final void i(InterfaceC4350j interfaceC4350j) {
        InterfaceC4350j interfaceC4350j2 = this.f11143e;
        if (interfaceC4350j2 == null) {
            this.f11143e = interfaceC4350j;
        } else if (interfaceC4350j2 != interfaceC4350j) {
            Log.w("FacebookDialog", "You're registering a callback on a Facebook dialog with two different callback managers. It's almost wrong and may cause unexpected results. Only the first callback manager will be used for handling activity result with androidx.");
        }
    }

    public void j(InterfaceC4350j callbackManager, InterfaceC4354n callback) {
        Intrinsics.checkNotNullParameter(callbackManager, "callbackManager");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!(callbackManager instanceof C1665e)) {
            throw new C4357q("Unexpected CallbackManager, please use the provided Factory.");
        }
        i(callbackManager);
        k((C1665e) callbackManager, callback);
    }

    public abstract void k(C1665e c1665e, InterfaceC4354n interfaceC4354n);

    public final void l(InterfaceC4350j interfaceC4350j) {
        this.f11143e = interfaceC4350j;
    }

    public void m(Object obj) {
        n(obj, f11138g);
    }

    public void n(Object obj, Object mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        C1661a d10 = d(obj, mode);
        if (d10 == null) {
            Log.e("FacebookDialog", "No code path should ever result in a null appCall");
            if (C4331C.D()) {
                throw new IllegalStateException("No code path should ever result in a null appCall");
            }
            return;
        }
        if (f() instanceof j.e) {
            ComponentCallbacks2 f10 = f();
            if (f10 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.activity.result.ActivityResultRegistryOwner");
            }
            C1670j c1670j = C1670j.f11136a;
            j.d activityResultRegistry = ((j.e) f10).getActivityResultRegistry();
            Intrinsics.checkNotNullExpressionValue(activityResultRegistry, "registryOwner.activityResultRegistry");
            C1670j.g(d10, activityResultRegistry, this.f11143e);
            d10.f();
            return;
        }
        B b10 = this.f11140b;
        if (b10 != null) {
            C1670j.e(d10, b10);
            return;
        }
        Activity activity = this.f11139a;
        if (activity != null) {
            C1670j.f(d10, activity);
        }
    }

    public AbstractC1671k(B fragmentWrapper, int i10) {
        Intrinsics.checkNotNullParameter(fragmentWrapper, "fragmentWrapper");
        this.f11140b = fragmentWrapper;
        this.f11139a = null;
        this.f11142d = i10;
        if (fragmentWrapper.a() == null) {
            throw new IllegalArgumentException("Cannot use a fragment that is not attached to an activity");
        }
    }
}
