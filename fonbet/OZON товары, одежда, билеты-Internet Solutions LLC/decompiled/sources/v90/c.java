package v90;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.button.large.FinLargeButtonView;
import ru.ozon.fintech.ui.button.radio.FinRadioButtonView;
import ru.ozon.fintech.ui.toolbar.FinToolbarView;

/* loaded from: classes3.dex */
public final class c implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f102593a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FinLargeButtonView f102594b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f102595c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final FinRadioButtonView f102596d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final FinRadioButtonView f102597e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final FinRadioButtonView f102598f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final TextView f102599g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final FinToolbarView f102600h;

    private c(@NonNull ConstraintLayout constraintLayout, @NonNull FinLargeButtonView finLargeButtonView, @NonNull ConstraintLayout constraintLayout2, @NonNull FinRadioButtonView finRadioButtonView, @NonNull FinRadioButtonView finRadioButtonView2, @NonNull FinRadioButtonView finRadioButtonView3, @NonNull TextView textView, @NonNull FinToolbarView finToolbarView) {
        this.f102593a = constraintLayout;
        this.f102594b = finLargeButtonView;
        this.f102595c = constraintLayout2;
        this.f102596d = finRadioButtonView;
        this.f102597e = finRadioButtonView2;
        this.f102598f = finRadioButtonView3;
        this.f102599g = textView;
        this.f102600h = finToolbarView;
    }

    @NonNull
    public static c b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fintech_cbdc_debug_fragment, viewGroup, false);
        int i11 = R.id.download_btn;
        FinLargeButtonView finLargeButtonView = (FinLargeButtonView) C2548q.d(R.id.download_btn, inflate);
        if (finLargeButtonView != null) {
            i11 = R.id.download_container;
            ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(R.id.download_container, inflate);
            if (constraintLayout != null) {
                i11 = R.id.frbv_assets;
                FinRadioButtonView finRadioButtonView = (FinRadioButtonView) C2548q.d(R.id.frbv_assets, inflate);
                if (finRadioButtonView != null) {
                    i11 = R.id.frbv_downloaded;
                    FinRadioButtonView finRadioButtonView2 = (FinRadioButtonView) C2548q.d(R.id.frbv_downloaded, inflate);
                    if (finRadioButtonView2 != null) {
                        i11 = R.id.frbv_front;
                        FinRadioButtonView finRadioButtonView3 = (FinRadioButtonView) C2548q.d(R.id.frbv_front, inflate);
                        if (finRadioButtonView3 != null) {
                            i11 = R.id.last_downloaded_time;
                            TextView textView = (TextView) C2548q.d(R.id.last_downloaded_time, inflate);
                            if (textView != null) {
                                i11 = R.id.last_downloaded_time_title;
                                if (((TextView) C2548q.d(R.id.last_downloaded_time_title, inflate)) != null) {
                                    i11 = R.id.tool_bar;
                                    FinToolbarView finToolbarView = (FinToolbarView) C2548q.d(R.id.tool_bar, inflate);
                                    if (finToolbarView != null) {
                                        return new c((ConstraintLayout) inflate, finLargeButtonView, constraintLayout, finRadioButtonView, finRadioButtonView2, finRadioButtonView3, textView, finToolbarView);
                                    }
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
        return this.f102593a;
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f102593a;
    }
}
