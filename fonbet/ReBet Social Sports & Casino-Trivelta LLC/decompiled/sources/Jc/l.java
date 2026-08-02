package Jc;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class l extends ReactViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public static final a f6123d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public boolean f6124a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6125b;

    /* renamed from: c, reason: collision with root package name */
    public k f6126c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean b(ViewGroup viewGroup) {
            UiThreadUtil.assertOnUiThread();
            for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof l) {
                    return true;
                }
                if (parent instanceof RootView) {
                    return false;
                }
            }
            return false;
        }

        public a() {
        }
    }

    public l(Context context) {
        super(context);
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (this.f6124a && Jc.a.c(ev)) {
            k kVar = this.f6126c;
            Intrinsics.checkNotNull(kVar);
            if (kVar.e(ev)) {
                return true;
            }
        }
        return super.dispatchGenericMotionEvent(ev);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f6124a) {
            k kVar = this.f6126c;
            Intrinsics.checkNotNull(kVar);
            if (kVar.e(event)) {
                return true;
            }
        }
        return super.dispatchTouchEvent(event);
    }

    public final void o(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        k kVar = this.f6126c;
        if (kVar != null) {
            kVar.d(view);
        }
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean z10 = this.f6125b || !f6123d.b(this);
        this.f6124a = z10;
        if (!z10) {
            Log.i(ReactConstants.TAG, "[GESTURE HANDLER] Gesture handler is already enabled for a parent view");
        }
        if (this.f6124a && this.f6126c == null) {
            Context context = getContext();
            Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            this.f6126c = new k((ReactContext) context, this);
        }
    }

    public final boolean p() {
        return this.f6124a;
    }

    public final void q() {
        k kVar = this.f6126c;
        if (kVar != null) {
            kVar.j();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (this.f6124a) {
            k kVar = this.f6126c;
            Intrinsics.checkNotNull(kVar);
            kVar.i();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final void setUnstableForceActive(boolean z10) {
        this.f6125b = z10;
    }
}
