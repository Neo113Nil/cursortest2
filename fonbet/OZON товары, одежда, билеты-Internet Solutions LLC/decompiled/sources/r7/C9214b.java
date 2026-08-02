package r7;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import ru.ozon.app.android.storefront.navBar.NavBarDTO;

/* renamed from: r7.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C9214b {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final View f83200a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f83201b = false;

    /* renamed from: c, reason: collision with root package name */
    private int f83202c = 0;

    public C9214b(FloatingActionButton floatingActionButton) {
        this.f83200a = floatingActionButton;
    }

    public final int a() {
        return this.f83202c;
    }

    public final boolean b() {
        return this.f83201b;
    }

    public final void c(@NonNull Bundle bundle) {
        this.f83201b = bundle.getBoolean(NavBarDTO.NESTED_PLACEHOLDER_EXPANDED, false);
        this.f83202c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f83201b) {
            View view = this.f83200a;
            ViewParent parent = view.getParent();
            if (parent instanceof CoordinatorLayout) {
                ((CoordinatorLayout) parent).dispatchDependentViewsChanged(view);
            }
        }
    }

    @NonNull
    public final Bundle d() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(NavBarDTO.NESTED_PLACEHOLDER_EXPANDED, this.f83201b);
        bundle.putInt("expandedComponentIdHint", this.f83202c);
        return bundle;
    }
}
