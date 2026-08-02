package Rc;

import Qc.k;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ScrollView;
import androidx.core.view.AbstractC2094j0;
import androidx.core.widget.NestedScrollView;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.views.view.ReactViewGroup;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a extends ReactViewGroup implements UIManagerListener {

    /* renamed from: a, reason: collision with root package name */
    public final ThemedReactContext f10180a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10181b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ThemedReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f10180a = reactContext;
        k.a(UIManagerHelper.INSTANCE, reactContext).addUIManagerEventListener(this);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didDispatchMountItems(UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didMountItems(UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
        q();
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didScheduleMountItems(UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
    }

    public final b o() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
        }
        return null;
    }

    public final ViewGroup p() {
        Object obj;
        Iterator it = AbstractC2094j0.a(this).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            View view = (View) obj;
            if ((view instanceof ScrollView) || (view instanceof NestedScrollView)) {
                break;
            }
        }
        if (obj == null) {
            throw new IllegalStateException("[RNScreens] Failed to find supported type of ScrollView in children of ScrollViewMarker");
        }
        View view2 = (View) obj;
        Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type android.view.ViewGroup");
        return (ViewGroup) view2;
    }

    public final void q() {
        if (this.f10181b) {
            return;
        }
        s();
        this.f10181b = true;
    }

    public final void r() {
        k.a(UIManagerHelper.INSTANCE, this.f10180a).removeUIManagerEventListener(this);
    }

    public final void s() {
        p();
        o();
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
