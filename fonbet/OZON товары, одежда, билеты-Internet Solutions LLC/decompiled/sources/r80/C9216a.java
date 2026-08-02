package r80;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.button.large.FinLargeButtonView;
import ru.ozon.fintech.ui.screenstate.ScreenStateView;

/* renamed from: r80.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9216a implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f83207a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FinLargeButtonView f83208b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final LinearLayout f83209c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TextView f83210d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f83211e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final ScreenStateView f83212f;

    private C9216a(@NonNull FrameLayout frameLayout, @NonNull FinLargeButtonView finLargeButtonView, @NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ScreenStateView screenStateView) {
        this.f83207a = frameLayout;
        this.f83208b = finLargeButtonView;
        this.f83209c = linearLayout;
        this.f83210d = textView;
        this.f83211e = textView2;
        this.f83212f = screenStateView;
    }

    @NonNull
    public static C9216a b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_update_wall, viewGroup, false);
        int i11 = R.id.b_update;
        FinLargeButtonView finLargeButtonView = (FinLargeButtonView) C2548q.d(R.id.b_update, inflate);
        if (finLargeButtonView != null) {
            i11 = R.id.iv_banner;
            if (((ImageView) C2548q.d(R.id.iv_banner, inflate)) != null) {
                i11 = R.id.ll_update_steps;
                LinearLayout linearLayout = (LinearLayout) C2548q.d(R.id.ll_update_steps, inflate);
                if (linearLayout != null) {
                    i11 = R.id.tv_description;
                    TextView textView = (TextView) C2548q.d(R.id.tv_description, inflate);
                    if (textView != null) {
                        i11 = R.id.tv_title;
                        TextView textView2 = (TextView) C2548q.d(R.id.tv_title, inflate);
                        if (textView2 != null) {
                            i11 = R.id.update_wall_progress_view;
                            ScreenStateView screenStateView = (ScreenStateView) C2548q.d(R.id.update_wall_progress_view, inflate);
                            if (screenStateView != null) {
                                return new C9216a((FrameLayout) inflate, finLargeButtonView, linearLayout, textView, textView2, screenStateView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @NonNull
    public final FrameLayout a() {
        return this.f83207a;
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f83207a;
    }
}
