package com.swmansion.rnscreens;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractActivityC2168s;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\b\u0017\b\u0016\u0018\u0000 V2\u00020\u00012\u00020\u0002:\u0003=WXB\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0011\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\u0004J-\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b&\u0010\"J\u000f\u0010'\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010\u0004J\u001f\u0010+\u001a\u00020\b2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u0014H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\b2\u0006\u0010\r\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\b2\u0006\u0010\r\u001a\u00020-H\u0016¢\u0006\u0004\b0\u0010/J\u000f\u00101\u001a\u00020\bH\u0016¢\u0006\u0004\b1\u0010\u0004J\u000f\u00102\u001a\u00020\bH\u0016¢\u0006\u0004\b2\u0010\u0004J\u000f\u00103\u001a\u00020\bH\u0016¢\u0006\u0004\b3\u0010\u0004J\u000f\u00104\u001a\u00020\bH\u0002¢\u0006\u0004\b4\u0010\u0004J\u000f\u00105\u001a\u00020\bH\u0002¢\u0006\u0004\b5\u0010\u0004J\u000f\u00106\u001a\u00020\bH\u0002¢\u0006\u0004\b6\u0010\u0004J\u000f\u00107\u001a\u00020\bH\u0002¢\u0006\u0004\b7\u0010\u0004J\u000f\u00108\u001a\u00020\bH\u0002¢\u0006\u0004\b8\u0010\u0004J\u0017\u0010:\u001a\u00020\b2\u0006\u00109\u001a\u00020\u0014H\u0002¢\u0006\u0004\b:\u0010;R(\u0010A\u001a\u00020\u00058\u0016@\u0016X\u0096.¢\u0006\u0018\n\u0004\b\u0018\u0010<\u0012\u0004\b@\u0010\u0004\u001a\u0004\b=\u0010>\"\u0004\b?\u0010\u0007R \u0010G\u001a\b\u0012\u0004\u0012\u00020-0B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0016\u0010J\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010M\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010O\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010IR\u0016\u0010Q\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010IR\u0016\u0010S\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010IR\u0014\u0010U\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010T¨\u0006Y"}, d2 = {"Lcom/swmansion/rnscreens/G;", "Landroidx/fragment/app/Fragment;", "Lcom/swmansion/rnscreens/H;", "<init>", "()V", "Lcom/swmansion/rnscreens/z;", "screenView", "(Lcom/swmansion/rnscreens/z;)V", "", "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "E", "", "j", "()Z", "Landroid/app/Activity;", X9.m.f13664a, "()Landroid/app/Activity;", "Lcom/facebook/react/bridge/ReactContext;", "R", "()Lcom/facebook/react/bridge/ReactContext;", "Lcom/swmansion/rnscreens/G$b;", "event", "e0", "(Lcom/swmansion/rnscreens/G$b;)Z", "J", "(Lcom/swmansion/rnscreens/G$b;)V", "fragmentWrapper", "g0", "(Lcom/swmansion/rnscreens/G$b;Lcom/swmansion/rnscreens/H;)V", "y", "f0", "", "alpha", "closing", "m0", "(FZ)V", "Lcom/swmansion/rnscreens/B;", "C", "(Lcom/swmansion/rnscreens/B;)V", "I", "q0", "p0", "onDestroy", "s0", "k0", "h0", "l0", "j0", "animationEnd", "n0", "(Z)V", "Lcom/swmansion/rnscreens/z;", com.google.crypto.tink.integration.android.b.f37029b, "()Lcom/swmansion/rnscreens/z;", "r0", "getScreen$annotations", "screen", "", "n", "Ljava/util/List;", "B", "()Ljava/util/List;", "childScreenContainers", "o", "Z", "shouldUpdateOnResume", "p", "F", "transitionProgress", "q", "canDispatchWillAppear", "r", "canDispatchAppear", "s", "isTransitioning", "()Landroidx/fragment/app/Fragment;", "fragment", "t", "c", "a", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScreenFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenFragment.kt\ncom/swmansion/rnscreens/ScreenFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,355:1\n1#2:356\n774#3:357\n865#3,2:358\n1869#3,2:360\n*S KotlinDebug\n*F\n+ 1 ScreenFragment.kt\ncom/swmansion/rnscreens/ScreenFragment\n*L\n233#1:357\n233#1:358,2\n233#1:360,2\n*E\n"})
/* loaded from: classes4.dex */
public class G extends Fragment implements H {

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public C3834z screen;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final List childScreenContainers;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public boolean shouldUpdateOnResume;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public float transitionProgress;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public boolean canDispatchWillAppear;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public boolean canDispatchAppear;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public boolean isTransitioning;

    /* renamed from: com.swmansion.rnscreens.G$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final short a(float f10) {
            return (short) (f10 == 0.0f ? 1 : f10 == 1.0f ? 2 : 3);
        }

        public Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;

        /* renamed from: a, reason: collision with root package name */
        public static final b f41654a = new b("DID_APPEAR", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final b f41655b = new b("WILL_APPEAR", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final b f41656c = new b("DID_DISAPPEAR", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final b f41657d = new b("WILL_DISAPPEAR", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f41658e;

        static {
            b[] a10 = a();
            $VALUES = a10;
            f41658e = EnumEntriesKt.enumEntries(a10);
        }

        public b(String str, int i10) {
        }

        public static final /* synthetic */ b[] a() {
            return new b[]{f41654a, f41655b, f41656c, f41657d};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public static final class c extends FrameLayout {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        @Override // android.view.ViewGroup, android.view.View
        public void clearFocus() {
            if (getVisibility() != 4) {
                super.clearFocus();
            }
        }
    }

    public /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f41655b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.f41654a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.f41657d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.f41656c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public G() {
        this.childScreenContainers = new ArrayList();
        this.transitionProgress = -1.0f;
        this.canDispatchWillAppear = true;
        this.canDispatchAppear = true;
        throw new IllegalStateException("Screen fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }

    public static final void o0(boolean z10, G g10) {
        if (z10) {
            g10.h0();
        } else {
            g10.k0();
        }
    }

    @Override // com.swmansion.rnscreens.H
    /* renamed from: B, reason: from getter */
    public List getChildScreenContainers() {
        return this.childScreenContainers;
    }

    @Override // com.swmansion.rnscreens.H
    public void C(B container) {
        Intrinsics.checkNotNullParameter(container, "container");
        getChildScreenContainers().add(container);
    }

    @Override // com.swmansion.rnscreens.H
    public void E() {
        s0();
    }

    @Override // com.swmansion.rnscreens.H
    public void I(B container) {
        Intrinsics.checkNotNullParameter(container, "container");
        getChildScreenContainers().remove(container);
    }

    @Override // com.swmansion.rnscreens.D
    public void J(b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int i10 = d.$EnumSwitchMapping$0[event.ordinal()];
        if (i10 == 1) {
            this.canDispatchWillAppear = false;
            return;
        }
        if (i10 == 2) {
            this.canDispatchAppear = false;
        } else if (i10 == 3) {
            this.canDispatchWillAppear = true;
        } else {
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            this.canDispatchAppear = true;
        }
    }

    @Override // com.swmansion.rnscreens.H
    public ReactContext R() {
        if (getContext() instanceof ReactContext) {
            Context context = getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            return (ReactContext) context;
        }
        if (b().getContext() instanceof ReactContext) {
            Context context2 = b().getContext();
            Intrinsics.checkNotNull(context2, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            return (ReactContext) context2;
        }
        for (ViewParent container = b().getContainer(); container != null; container = container.getParent()) {
            if (container instanceof C3834z) {
                C3834z c3834z = (C3834z) container;
                if (c3834z.getContext() instanceof ReactContext) {
                    Context context3 = c3834z.getContext();
                    Intrinsics.checkNotNull(context3, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                    return (ReactContext) context3;
                }
            }
        }
        return null;
    }

    @Override // com.swmansion.rnscreens.H
    public C3834z b() {
        C3834z c3834z = this.screen;
        if (c3834z != null) {
            return c3834z;
        }
        Intrinsics.throwUninitializedPropertyAccessException("screen");
        return null;
    }

    public boolean e0(b event) {
        Intrinsics.checkNotNullParameter(event, "event");
        int i10 = d.$EnumSwitchMapping$0[event.ordinal()];
        if (i10 == 1) {
            return this.canDispatchWillAppear;
        }
        if (i10 == 2) {
            return this.canDispatchAppear;
        }
        if (i10 == 3) {
            return !this.canDispatchWillAppear;
        }
        if (i10 == 4) {
            return !this.canDispatchAppear;
        }
        throw new NoWhenBranchMatchedException();
    }

    public void f0() {
        Context context = b().getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int surfaceId = UIManagerHelper.getSurfaceId(reactContext);
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, b().getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new Mc.b(surfaceId, b().getId()));
        }
    }

    public void g0(b event, H fragmentWrapper) {
        Event<?> kVar;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(fragmentWrapper, "fragmentWrapper");
        Fragment o10 = fragmentWrapper.o();
        if (o10 instanceof Y) {
            Y y10 = (Y) o10;
            if (y10.e0(event)) {
                C3834z b10 = y10.b();
                fragmentWrapper.J(event);
                int surfaceId = UIManagerHelper.getSurfaceId(b10);
                int i10 = d.$EnumSwitchMapping$0[event.ordinal()];
                if (i10 == 1) {
                    kVar = new Mc.k(surfaceId, b10.getId());
                } else if (i10 == 2) {
                    kVar = new Mc.f(surfaceId, b10.getId());
                } else if (i10 == 3) {
                    kVar = new Mc.l(surfaceId, b10.getId());
                } else {
                    if (i10 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kVar = new Mc.g(surfaceId, b10.getId());
                }
                Context context = b().getContext();
                Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, b().getId());
                if (eventDispatcherForReactTag != null) {
                    eventDispatcherForReactTag.dispatchEvent(kVar);
                }
                fragmentWrapper.y(event);
            }
        }
    }

    public final void h0() {
        g0(b.f41654a, this);
        m0(1.0f, false);
    }

    @Override // com.swmansion.rnscreens.H
    public boolean j() {
        return false;
    }

    public final void j0() {
        g0(b.f41656c, this);
        m0(1.0f, true);
    }

    public final void k0() {
        g0(b.f41655b, this);
        m0(0.0f, false);
    }

    public final void l0() {
        g0(b.f41657d, this);
        m0(0.0f, true);
    }

    @Override // com.swmansion.rnscreens.H
    public Activity m() {
        Fragment fragment;
        AbstractActivityC2168s activity;
        AbstractActivityC2168s activity2 = getActivity();
        if (activity2 != null) {
            return activity2;
        }
        Context context = b().getContext();
        if (context instanceof ReactContext) {
            ReactContext reactContext = (ReactContext) context;
            if (reactContext.getCurrentActivity() != null) {
                return reactContext.getCurrentActivity();
            }
        }
        for (ViewParent container = b().getContainer(); container != null; container = container.getParent()) {
            if ((container instanceof C3834z) && (fragment = ((C3834z) container).getFragment()) != null && (activity = fragment.getActivity()) != null) {
                return activity;
            }
        }
        return null;
    }

    public void m0(float alpha, boolean closing) {
        if (!(this instanceof Y) || this.transitionProgress == alpha) {
            return;
        }
        float max = Math.max(0.0f, Math.min(1.0f, alpha));
        this.transitionProgress = max;
        short a10 = INSTANCE.a(max);
        Y y10 = (Y) this;
        B container = y10.b().getContainer();
        boolean goingForward = container instanceof T ? ((T) container).getGoingForward() : false;
        Context context = y10.b().getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, y10.b().getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new Mc.j(UIManagerHelper.getSurfaceId(reactContext), y10.b().getId(), this.transitionProgress, closing, goingForward, a10));
        }
    }

    public final void n0(final boolean animationEnd) {
        this.isTransitioning = !animationEnd;
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null && (parentFragment instanceof G) && ((G) parentFragment).isTransitioning) {
            return;
        }
        if (isResumed()) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.rnscreens.F
                @Override // java.lang.Runnable
                public final void run() {
                    G.o0(animationEnd, this);
                }
            });
        } else if (animationEnd) {
            j0();
        } else {
            l0();
        }
    }

    @Override // com.swmansion.rnscreens.InterfaceC3818i
    public Fragment o() {
        return this;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        b().setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = getContext();
        if (context == null) {
            return null;
        }
        c cVar = new c(context);
        cVar.addView(Nc.c.f(b()));
        return cVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        B container = b().getContainer();
        if (container == null || !container.n(b().getFragmentWrapper())) {
            Context context = b().getContext();
            if (context instanceof ReactContext) {
                int surfaceId = UIManagerHelper.getSurfaceId(context);
                EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, b().getId());
                if (eventDispatcherForReactTag != null) {
                    eventDispatcherForReactTag.dispatchEvent(new Mc.h(surfaceId, b().getId()));
                }
            }
        }
        getChildScreenContainers().clear();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.shouldUpdateOnResume) {
            this.shouldUpdateOnResume = false;
            g0.f41803a.p(b(), m(), R());
        }
    }

    public void p0() {
        n0(true);
    }

    public void q0() {
        n0(false);
    }

    public void r0(C3834z c3834z) {
        Intrinsics.checkNotNullParameter(c3834z, "<set-?>");
        this.screen = c3834z;
    }

    public final void s0() {
        AbstractActivityC2168s activity = getActivity();
        if (activity == null) {
            this.shouldUpdateOnResume = true;
        } else {
            g0.f41803a.p(b(), activity, R());
        }
    }

    @Override // com.swmansion.rnscreens.D
    public void y(b event) {
        H fragmentWrapper;
        Intrinsics.checkNotNullParameter(event, "event");
        List childScreenContainers = getChildScreenContainers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : childScreenContainers) {
            if (((B) obj).getScreenCount() > 0) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C3834z topScreen = ((B) it.next()).getTopScreen();
            if (topScreen != null && (fragmentWrapper = topScreen.getFragmentWrapper()) != null) {
                g0(event, fragmentWrapper);
            }
        }
    }

    public G(C3834z screenView) {
        Intrinsics.checkNotNullParameter(screenView, "screenView");
        this.childScreenContainers = new ArrayList();
        this.transitionProgress = -1.0f;
        this.canDispatchWillAppear = true;
        this.canDispatchAppear = true;
        r0(screenView);
    }
}
