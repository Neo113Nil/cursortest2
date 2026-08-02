package Sc;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.activity.H;
import androidx.activity.OnBackPressedDispatcher;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.react.bridge.ReactContext;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class l extends CoordinatorLayout {

    /* renamed from: A, reason: collision with root package name */
    public FrameLayout f10743A;

    /* renamed from: u, reason: collision with root package name */
    public final com.swmansion.rnscreens.gamma.stack.screen.b f10744u;

    /* renamed from: v, reason: collision with root package name */
    public final f f10745v;

    /* renamed from: w, reason: collision with root package name */
    public final Tc.a f10746w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f10747x;

    /* renamed from: y, reason: collision with root package name */
    public final Tc.b f10748y;

    /* renamed from: z, reason: collision with root package name */
    public Tc.e f10749z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, com.swmansion.rnscreens.gamma.stack.screen.b stackScreen, boolean z10) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(stackScreen, "stackScreen");
        this.f10744u = stackScreen;
        this.f10745v = new f(context, z10, new Function1() { // from class: Sc.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit b02;
                b02 = l.b0(l.this, ((Integer) obj).intValue());
                return b02;
            }
        }, new Function0() { // from class: Sc.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit c02;
                c02 = l.c0(l.this);
                return c02;
            }
        });
        Tc.a aVar = new Tc.a() { // from class: Sc.i
            @Override // Tc.a
            public final void a(Tc.e eVar) {
                l.d0(l.this, eVar);
            }
        };
        this.f10746w = aVar;
        this.f10748y = new Tc.b() { // from class: Sc.j
            @Override // Tc.b
            public final void a(Tc.e eVar) {
                l.e0(l.this, eVar);
            }
        };
        setTransitionGroup(true);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(stackScreen);
        this.f10743A = frameLayout;
        addView(frameLayout, new CoordinatorLayout.f(-1, -1));
        stackScreen.setOnHeaderConfigAttachListener$react_native_screens_release(new WeakReference<>(aVar));
        a0(stackScreen.getHeaderConfig$react_native_screens_release());
    }

    public static final Unit b0(l lVar, int i10) {
        com.swmansion.rnscreens.gamma.stack.screen.b.j(lVar.f10744u, null, Integer.valueOf(i10), null, null, 13, null);
        return Unit.INSTANCE;
    }

    public static final Unit c0(l lVar) {
        OnBackPressedDispatcher onBackPressedDispatcher;
        Context context = lVar.f10744u.getContext();
        ReactContext reactContext = context instanceof ReactContext ? (ReactContext) context : null;
        Object currentActivity = reactContext != null ? reactContext.getCurrentActivity() : null;
        H h10 = currentActivity instanceof H ? (H) currentActivity : null;
        if (h10 != null && (onBackPressedDispatcher = h10.getOnBackPressedDispatcher()) != null) {
            onBackPressedDispatcher.l();
        }
        return Unit.INSTANCE;
    }

    public static final void d0(l lVar, Tc.e eVar) {
        lVar.a0(eVar);
    }

    public static final void e0(final l lVar, Tc.e it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (lVar.f10747x) {
            return;
        }
        lVar.f10747x = true;
        lVar.post(new Runnable() { // from class: Sc.k
            @Override // java.lang.Runnable
            public final void run() {
                l.f0(l.this);
            }
        });
    }

    public static final void f0(l lVar) {
        lVar.f10747x = false;
        lVar.f10745v.j(lVar, lVar.f10749z);
    }

    public final void a0(Tc.e eVar) {
        Tc.e eVar2 = this.f10749z;
        if (eVar2 != null) {
            eVar2.setOnConfigChangeListener(null);
        }
        this.f10749z = eVar;
        if (eVar != null) {
            eVar.setOnConfigChangeListener(this.f10748y);
        }
        this.f10745v.j(this, eVar);
    }

    @NotNull
    public final com.swmansion.rnscreens.gamma.stack.screen.b getStackScreen$react_native_screens_release() {
        return this.f10744u;
    }

    @NotNull
    public final FrameLayout getStackScreenWrapper$react_native_screens_release() {
        return this.f10743A;
    }

    public final void setStackScreenWrapper$react_native_screens_release(@NotNull FrameLayout frameLayout) {
        Intrinsics.checkNotNullParameter(frameLayout, "<set-?>");
        this.f10743A = frameLayout;
    }
}
