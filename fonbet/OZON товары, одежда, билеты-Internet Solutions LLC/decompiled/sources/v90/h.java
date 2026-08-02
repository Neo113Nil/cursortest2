package v90;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.toolbar.FinToolbarView;

/* loaded from: classes3.dex */
public final class h implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f102658a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f102659b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f102660c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final View f102661d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final View f102662e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final View f102663f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final EditText f102664g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextView f102665h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final TextView f102666i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final FinToolbarView f102667j;

    private h(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull View view4, @NonNull View view5, @NonNull EditText editText, @NonNull TextView textView, @NonNull TextView textView2, @NonNull FinToolbarView finToolbarView) {
        this.f102658a = constraintLayout;
        this.f102659b = view;
        this.f102660c = view2;
        this.f102661d = view3;
        this.f102662e = view4;
        this.f102663f = view5;
        this.f102664g = editText;
        this.f102665h = textView;
        this.f102666i = textView2;
        this.f102667j = finToolbarView;
    }

    @NonNull
    public static h b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fintech_testing_features_v1_edit_fragment, viewGroup, false);
        int i11 = R.id.divider_current_features;
        View d11 = C2548q.d(R.id.divider_current_features, inflate);
        if (d11 != null) {
            i11 = R.id.divider_description;
            View d12 = C2548q.d(R.id.divider_description, inflate);
            if (d12 != null) {
                i11 = R.id.divider_disable_features;
                View d13 = C2548q.d(R.id.divider_disable_features, inflate);
                if (d13 != null) {
                    i11 = R.id.divider_features_description;
                    View d14 = C2548q.d(R.id.divider_features_description, inflate);
                    if (d14 != null) {
                        i11 = R.id.divider_toolbar;
                        View d15 = C2548q.d(R.id.divider_toolbar, inflate);
                        if (d15 != null) {
                            i11 = R.id.fintech_testing_features_v1_enable_features_input;
                            EditText editText = (EditText) C2548q.d(R.id.fintech_testing_features_v1_enable_features_input, inflate);
                            if (editText != null) {
                                i11 = R.id.fintech_testing_features_v1_enable_features_title;
                                if (((TextView) C2548q.d(R.id.fintech_testing_features_v1_enable_features_title, inflate)) != null) {
                                    i11 = R.id.testing_features_v1_current_features;
                                    TextView textView = (TextView) C2548q.d(R.id.testing_features_v1_current_features, inflate);
                                    if (textView != null) {
                                        i11 = R.id.testing_features_v1_current_features_title;
                                        if (((TextView) C2548q.d(R.id.testing_features_v1_current_features_title, inflate)) != null) {
                                            i11 = R.id.testing_features_v1_current_header;
                                            TextView textView2 = (TextView) C2548q.d(R.id.testing_features_v1_current_header, inflate);
                                            if (textView2 != null) {
                                                i11 = R.id.testing_features_v1_current_header_title;
                                                if (((TextView) C2548q.d(R.id.testing_features_v1_current_header_title, inflate)) != null) {
                                                    i11 = R.id.testing_features_v1_features_description;
                                                    if (((TextView) C2548q.d(R.id.testing_features_v1_features_description, inflate)) != null) {
                                                        i11 = R.id.tool_bar;
                                                        FinToolbarView finToolbarView = (FinToolbarView) C2548q.d(R.id.tool_bar, inflate);
                                                        if (finToolbarView != null) {
                                                            return new h((ConstraintLayout) inflate, d11, d12, d13, d14, d15, editText, textView, textView2, finToolbarView);
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
        return this.f102658a;
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f102658a;
    }
}
