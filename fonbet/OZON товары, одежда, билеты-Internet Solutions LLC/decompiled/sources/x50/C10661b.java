package x50;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager2.widget.ViewPager2;
import ru.ozon.app.android.R;

/* renamed from: x50.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10661b implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final CoordinatorLayout f105032a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ViewPager2 f105033b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f105034c;

    private C10661b(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ViewPager2 viewPager2, @NonNull CoordinatorLayout coordinatorLayout2) {
        this.f105032a = coordinatorLayout;
        this.f105033b = viewPager2;
        this.f105034c = coordinatorLayout2;
    }

    @NonNull
    public static C10661b b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.stories_fragment, viewGroup, false);
        ViewPager2 viewPager2 = (ViewPager2) C2548q.d(R.id.stories_viewpager, inflate);
        if (viewPager2 == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.stories_viewpager)));
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
        return new C10661b(coordinatorLayout, viewPager2, coordinatorLayout);
    }

    @NonNull
    public final CoordinatorLayout a() {
        return this.f105032a;
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f105032a;
    }
}
