package v90;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import ru.ozon.app.android.R;
import ru.ozon.fintech.permissions.ui.PermissionsScreenStateView;
import ru.ozon.fintech.ui.button.large.FinLargeButtonView;
import ru.ozon.fintech.ui.screenstate.ScreenStateView;
import ru.ozon.fintech.ui.toolbar.FinToolbarView;

/* loaded from: classes3.dex */
public final class k implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f102692a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FinLargeButtonView f102693b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final PermissionsScreenStateView f102694c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ScreenStateView f102695d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final SwipeRefreshLayout f102696e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final FinToolbarView f102697f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f102698g;

    private k(@NonNull ConstraintLayout constraintLayout, @NonNull FinLargeButtonView finLargeButtonView, @NonNull PermissionsScreenStateView permissionsScreenStateView, @NonNull ScreenStateView screenStateView, @NonNull SwipeRefreshLayout swipeRefreshLayout, @NonNull FinToolbarView finToolbarView, @NonNull TextView textView) {
        this.f102692a = constraintLayout;
        this.f102693b = finLargeButtonView;
        this.f102694c = permissionsScreenStateView;
        this.f102695d = screenStateView;
        this.f102696e = swipeRefreshLayout;
        this.f102697f = finToolbarView;
        this.f102698g = textView;
    }

    @NonNull
    public static k b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.logcat_fragment, viewGroup, false);
        int i11 = R.id.btn_clear_log;
        FinLargeButtonView finLargeButtonView = (FinLargeButtonView) C2548q.d(R.id.btn_clear_log, inflate);
        if (finLargeButtonView != null) {
            i11 = R.id.permissions_screen_state;
            PermissionsScreenStateView permissionsScreenStateView = (PermissionsScreenStateView) C2548q.d(R.id.permissions_screen_state, inflate);
            if (permissionsScreenStateView != null) {
                i11 = R.id.screen_state;
                ScreenStateView screenStateView = (ScreenStateView) C2548q.d(R.id.screen_state, inflate);
                if (screenStateView != null) {
                    i11 = R.id.scrollView;
                    if (((NestedScrollView) C2548q.d(R.id.scrollView, inflate)) != null) {
                        i11 = R.id.swipe;
                        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) C2548q.d(R.id.swipe, inflate);
                        if (swipeRefreshLayout != null) {
                            i11 = R.id.tool_bar;
                            FinToolbarView finToolbarView = (FinToolbarView) C2548q.d(R.id.tool_bar, inflate);
                            if (finToolbarView != null) {
                                i11 = R.id.tv_logcat;
                                TextView textView = (TextView) C2548q.d(R.id.tv_logcat, inflate);
                                if (textView != null) {
                                    return new k((ConstraintLayout) inflate, finLargeButtonView, permissionsScreenStateView, screenStateView, swipeRefreshLayout, finToolbarView, textView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @NonNull
    public final ConstraintLayout a() {
        return this.f102692a;
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f102692a;
    }
}
