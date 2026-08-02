package Uc;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.swmansion.rnscreens.gamma.stack.screen.b;
import dd.C4062i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class n extends ViewGroup implements UIManagerListener, j, k {

    /* renamed from: f, reason: collision with root package name */
    public static final a f12174f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final ThemedReactContext f12175a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f12176b;

    /* renamed from: c, reason: collision with root package name */
    public final i f12177c;

    /* renamed from: d, reason: collision with root package name */
    public final l f12178d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12179e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[b.a.values().length];
            try {
                iArr[b.a.f41852a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.a.f41853b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ThemedReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f12175a = reactContext;
        this.f12176b = new ArrayList();
        i iVar = new i(reactContext, new WeakReference(this));
        this.f12177c = iVar;
        this.f12178d = new l();
        addView(iVar);
        UIManager uIManager = UIManagerHelper.getUIManager(reactContext, 2);
        if (uIManager == null) {
            throw new IllegalStateException("[RNScreens] UIManager must not be null.");
        }
        uIManager.addUIManagerEventListener(this);
    }

    public static final void i(n nVar) {
        nVar.f12179e = false;
        nVar.f();
    }

    @Override // Uc.j
    public void a(com.swmansion.rnscreens.gamma.stack.screen.b stackScreen) {
        Intrinsics.checkNotNullParameter(stackScreen, "stackScreen");
        if (stackScreen.getActivityMode() == b.a.f41853b) {
            stackScreen.setNativelyDismissed$react_native_screens_release(true);
        }
    }

    @Override // Uc.k
    public void b() {
        if (getMeasuredWidth() != this.f12177c.getMeasuredWidth() || getMeasuredHeight() != this.f12177c.getMeasuredHeight()) {
            this.f12177c.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        }
        this.f12177c.layout(getLeft(), getTop(), getRight(), getBottom());
    }

    public final void d(com.swmansion.rnscreens.gamma.stack.screen.b bVar) {
        if (bVar.getActivityMode() != b.a.f41853b || bVar.d()) {
            bVar.getScreenKey();
        } else {
            this.f12178d.a(bVar);
        }
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didDispatchMountItems(UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didMountItems(UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
        this.f12178d.c(this.f12177c, this.f12176b);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didScheduleMountItems(UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
    }

    public final void e(com.swmansion.rnscreens.gamma.stack.screen.b bVar) {
        if (bVar.getActivityMode() == b.a.f41853b) {
            this.f12178d.b(bVar);
        }
    }

    public final void f() {
        measure(View.MeasureSpec.makeMeasureSpec(getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getHeight(), 1073741824));
        layout(getLeft(), getTop(), getRight(), getBottom());
    }

    public final void g(com.swmansion.rnscreens.gamma.stack.screen.b stackScreen, int i10) {
        Intrinsics.checkNotNullParameter(stackScreen, "stackScreen");
        this.f12176b.add(i10, stackScreen);
        stackScreen.setStackHost$react_native_screens_release(new WeakReference<>(this));
        e(stackScreen);
    }

    @NotNull
    public final ArrayList<com.swmansion.rnscreens.gamma.stack.screen.b> getRenderedScreens$react_native_screens_release() {
        return this.f12176b;
    }

    public final void h() {
        if (this.f12179e) {
            return;
        }
        this.f12179e = true;
        post(new Runnable() { // from class: Uc.m
            @Override // java.lang.Runnable
            public final void run() {
                n.i(n.this);
            }
        });
    }

    public final void j(com.swmansion.rnscreens.gamma.stack.screen.b stackScreen) {
        Intrinsics.checkNotNullParameter(stackScreen, "stackScreen");
        int i10 = b.$EnumSwitchMapping$0[stackScreen.getActivityMode().ordinal()];
        if (i10 == 1) {
            this.f12178d.a(stackScreen);
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            this.f12178d.b(stackScreen);
        }
    }

    public final void k() {
        Iterator it = CollectionsKt.asReversedMutable(this.f12176b).iterator();
        while (it.hasNext()) {
            d((com.swmansion.rnscreens.gamma.stack.screen.b) it.next());
        }
        this.f12176b.clear();
    }

    public final void l(com.swmansion.rnscreens.gamma.stack.screen.b reactSubview) {
        Intrinsics.checkNotNullParameter(reactSubview, "reactSubview");
        this.f12176b.remove(reactSubview);
        d(reactSubview);
    }

    public final void m(int i10) {
        Object remove = this.f12176b.remove(i10);
        Intrinsics.checkNotNullExpressionValue(remove, "removeAt(...)");
        d((com.swmansion.rnscreens.gamma.stack.screen.b) remove);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        C4062i.f45172a.a("StackHost", "StackHost [" + getId() + "] attached to window");
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.f12177c.layout(i10, i11, i12, i13);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f12177c.measure(i10, i11);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        h();
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willDispatchViewUpdates(UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willMountItems(UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
    }
}
