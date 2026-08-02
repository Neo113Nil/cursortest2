package c50;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.facebook.shimmer.ShimmerFrameLayout;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.cbottombase.ui.CbottomUINoScrollableView;
import ru.ozon.fintech.permissions.ui.PermissionsScreenStateView;
import ru.ozon.fintech.ui.screenstate.ScreenStateView;

/* renamed from: c50.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5747b implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f56512a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final CbottomUINoScrollableView f56513b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final Guideline f56514c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final PermissionsScreenStateView f56515d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ScreenStateView f56516e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ShimmerFrameLayout f56517f;

    private C5747b(@NonNull ConstraintLayout constraintLayout, @NonNull CbottomUINoScrollableView cbottomUINoScrollableView, @NonNull Guideline guideline, @NonNull PermissionsScreenStateView permissionsScreenStateView, @NonNull ScreenStateView screenStateView, @NonNull ShimmerFrameLayout shimmerFrameLayout) {
        this.f56512a = constraintLayout;
        this.f56513b = cbottomUINoScrollableView;
        this.f56514c = guideline;
        this.f56515d = permissionsScreenStateView;
        this.f56516e = screenStateView;
        this.f56517f = shimmerFrameLayout;
    }

    @NonNull
    public static C5747b b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.cbottom_pdf_preview_fragment, viewGroup, false);
        int i11 = R.id.cbottom_views;
        CbottomUINoScrollableView cbottomUINoScrollableView = (CbottomUINoScrollableView) C2548q.d(R.id.cbottom_views, inflate);
        if (cbottomUINoScrollableView != null) {
            i11 = R.id.guideline_cbottom_header;
            Guideline guideline = (Guideline) C2548q.d(R.id.guideline_cbottom_header, inflate);
            if (guideline != null) {
                i11 = R.id.permissions_screen_state;
                PermissionsScreenStateView permissionsScreenStateView = (PermissionsScreenStateView) C2548q.d(R.id.permissions_screen_state, inflate);
                if (permissionsScreenStateView != null) {
                    i11 = R.id.screen_state;
                    ScreenStateView screenStateView = (ScreenStateView) C2548q.d(R.id.screen_state, inflate);
                    if (screenStateView != null) {
                        i11 = R.id.shimmer_placeholder;
                        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C2548q.d(R.id.shimmer_placeholder, inflate);
                        if (shimmerFrameLayout != null) {
                            return new C5747b((ConstraintLayout) inflate, cbottomUINoScrollableView, guideline, permissionsScreenStateView, screenStateView, shimmerFrameLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @NonNull
    public final ConstraintLayout a() {
        return this.f56512a;
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f56512a;
    }
}
