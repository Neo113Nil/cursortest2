package vZ;

import AZ.a;
import AZ.d;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import java.util.LinkedList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: vZ.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10287b extends AbstractC10286a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final G f102712a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Handler f102713b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f102714c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final LinkedList<Function0<Unit>> f102715d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final H.a f102716e;

    public C10287b(@NotNull G fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.f102712a = fragmentManager;
        this.f102713b = new Handler(Looper.getMainLooper());
        this.f102715d = new LinkedList<>();
        this.f102716e = new H.a(this, 5);
    }

    public static void a(C10287b c10287b) {
        if (!c10287b.c()) {
            c10287b.f102713b.removeCallbacks(c10287b.f102716e);
            return;
        }
        c10287b.f102714c = true;
        while (true) {
            LinkedList<Function0<Unit>> linkedList = c10287b.f102715d;
            try {
                if (linkedList.isEmpty()) {
                    return;
                } else {
                    linkedList.pop().invoke();
                }
            } catch (Exception unused) {
                int i11 = AZ.b.f679a;
                ru.ozon.android.ozonLogger.core.c cVar = ru.ozon.android.ozonLogger.core.c.WARNING;
                AZ.b.b();
                AZ.a a11 = AZ.b.a();
                if (a11 != d.a()) {
                    cVar.getClass();
                    a11.a(new a.C0019a("Failed to call transaction"));
                }
                c10287b.d();
                return;
            } finally {
                c10287b.f102714c = false;
            }
        }
    }

    private final boolean c() {
        G g10 = this.f102712a;
        if (g10.H0() || g10.C0()) {
            return false;
        }
        List<ComponentCallbacksC5392m> r02 = g10.r0();
        Intrinsics.checkNotNullExpressionValue(r02, "getFragments(...)");
        ComponentCallbacksC5392m componentCallbacksC5392m = (ComponentCallbacksC5392m) C7714v.Z(r02);
        return componentCallbacksC5392m != null ? componentCallbacksC5392m.isResumed() : true;
    }

    public final void b(@NotNull Function0<Unit> transaction) {
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        this.f102715d.add(transaction);
        boolean c11 = c();
        H.a aVar = this.f102716e;
        if (c11) {
            aVar.run();
            return;
        }
        Handler handler = this.f102713b;
        handler.removeCallbacks(aVar);
        handler.post(aVar);
    }

    public final void d() {
        this.f102713b.removeCallbacks(this.f102716e);
        this.f102715d.clear();
    }

    @Override // androidx.fragment.app.G.m
    public final void onFragmentResumed(@NotNull G fm, @NotNull ComponentCallbacksC5392m fragment) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (this.f102714c || this.f102715d.isEmpty() || !c()) {
            return;
        }
        Handler handler = this.f102713b;
        H.a aVar = this.f102716e;
        handler.removeCallbacks(aVar);
        handler.post(aVar);
    }
}
