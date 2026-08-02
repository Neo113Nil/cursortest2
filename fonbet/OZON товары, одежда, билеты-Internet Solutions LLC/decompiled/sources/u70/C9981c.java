package u70;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.button.large.FinLargeButtonView;
import ru.ozon.fintech.ui.screenstate.ScreenStateView;

/* renamed from: u70.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9981c implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f100360a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FinLargeButtonView f100361b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final FinLargeButtonView f100362c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f100363d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ScreenStateView f100364e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f100365f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f100366g;

    private C9981c(@NonNull ConstraintLayout constraintLayout, @NonNull FinLargeButtonView finLargeButtonView, @NonNull FinLargeButtonView finLargeButtonView2, @NonNull ImageView imageView, @NonNull ScreenStateView screenStateView, @NonNull TextView textView, @NonNull AppCompatTextView appCompatTextView) {
        this.f100360a = constraintLayout;
        this.f100361b = finLargeButtonView;
        this.f100362c = finLargeButtonView2;
        this.f100363d = imageView;
        this.f100364e = screenStateView;
        this.f100365f = textView;
        this.f100366g = appCompatTextView;
    }

    @NonNull
    public static C9981c b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_request_notifications, viewGroup, false);
        int i11 = R.id.btn_disable;
        FinLargeButtonView finLargeButtonView = (FinLargeButtonView) C2548q.d(R.id.btn_disable, inflate);
        if (finLargeButtonView != null) {
            i11 = R.id.btn_enable;
            FinLargeButtonView finLargeButtonView2 = (FinLargeButtonView) C2548q.d(R.id.btn_enable, inflate);
            if (finLargeButtonView2 != null) {
                i11 = R.id.iv_notifications;
                ImageView imageView = (ImageView) C2548q.d(R.id.iv_notifications, inflate);
                if (imageView != null) {
                    i11 = R.id.screen_state;
                    ScreenStateView screenStateView = (ScreenStateView) C2548q.d(R.id.screen_state, inflate);
                    if (screenStateView != null) {
                        i11 = R.id.tv_subtitle;
                        TextView textView = (TextView) C2548q.d(R.id.tv_subtitle, inflate);
                        if (textView != null) {
                            i11 = R.id.tv_title;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(R.id.tv_title, inflate);
                            if (appCompatTextView != null) {
                                return new C9981c((ConstraintLayout) inflate, finLargeButtonView, finLargeButtonView2, imageView, screenStateView, textView, appCompatTextView);
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
        return this.f100360a;
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f100360a;
    }
}
