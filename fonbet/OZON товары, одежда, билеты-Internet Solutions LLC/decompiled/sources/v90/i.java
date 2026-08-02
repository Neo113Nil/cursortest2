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
public final class i implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f102668a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f102669b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final View f102670c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final View f102671d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final View f102672e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final View f102673f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final EditText f102674g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final EditText f102675h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final EditText f102676i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final TextView f102677j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final FinToolbarView f102678k;

    private i(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull View view4, @NonNull View view5, @NonNull EditText editText, @NonNull EditText editText2, @NonNull EditText editText3, @NonNull TextView textView, @NonNull FinToolbarView finToolbarView) {
        this.f102668a = constraintLayout;
        this.f102669b = view;
        this.f102670c = view2;
        this.f102671d = view3;
        this.f102672e = view4;
        this.f102673f = view5;
        this.f102674g = editText;
        this.f102675h = editText2;
        this.f102676i = editText3;
        this.f102677j = textView;
        this.f102678k = finToolbarView;
    }

    @NonNull
    public static i b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fintech_testing_features_v2_edit_fragment, viewGroup, false);
        int i11 = R.id.divider_description;
        View d11 = C2548q.d(R.id.divider_description, inflate);
        if (d11 != null) {
            i11 = R.id.divider_disable_features;
            View d12 = C2548q.d(R.id.divider_disable_features, inflate);
            if (d12 != null) {
                i11 = R.id.divider_disable_switches;
                View d13 = C2548q.d(R.id.divider_disable_switches, inflate);
                if (d13 != null) {
                    i11 = R.id.divider_edit_features;
                    View d14 = C2548q.d(R.id.divider_edit_features, inflate);
                    if (d14 != null) {
                        i11 = R.id.divider_toolbar;
                        View d15 = C2548q.d(R.id.divider_toolbar, inflate);
                        if (d15 != null) {
                            i11 = R.id.fintech_testing_features_v2_disable_features_input;
                            EditText editText = (EditText) C2548q.d(R.id.fintech_testing_features_v2_disable_features_input, inflate);
                            if (editText != null) {
                                i11 = R.id.fintech_testing_features_v2_disable_features_title;
                                if (((TextView) C2548q.d(R.id.fintech_testing_features_v2_disable_features_title, inflate)) != null) {
                                    i11 = R.id.fintech_testing_features_v2_disable_switches_input;
                                    EditText editText2 = (EditText) C2548q.d(R.id.fintech_testing_features_v2_disable_switches_input, inflate);
                                    if (editText2 != null) {
                                        i11 = R.id.fintech_testing_features_v2_disable_switches_title;
                                        if (((TextView) C2548q.d(R.id.fintech_testing_features_v2_disable_switches_title, inflate)) != null) {
                                            i11 = R.id.fintech_testing_features_v2_edit_features_input;
                                            EditText editText3 = (EditText) C2548q.d(R.id.fintech_testing_features_v2_edit_features_input, inflate);
                                            if (editText3 != null) {
                                                i11 = R.id.fintech_testing_features_v2_edit_features_title;
                                                if (((TextView) C2548q.d(R.id.fintech_testing_features_v2_edit_features_title, inflate)) != null) {
                                                    i11 = R.id.testing_features_v2_current_state;
                                                    TextView textView = (TextView) C2548q.d(R.id.testing_features_v2_current_state, inflate);
                                                    if (textView != null) {
                                                        i11 = R.id.testing_features_v2_current_state_title;
                                                        if (((TextView) C2548q.d(R.id.testing_features_v2_current_state_title, inflate)) != null) {
                                                            i11 = R.id.testing_features_v2_description;
                                                            if (((TextView) C2548q.d(R.id.testing_features_v2_description, inflate)) != null) {
                                                                i11 = R.id.tool_bar;
                                                                FinToolbarView finToolbarView = (FinToolbarView) C2548q.d(R.id.tool_bar, inflate);
                                                                if (finToolbarView != null) {
                                                                    return new i((ConstraintLayout) inflate, d11, d12, d13, d14, d15, editText, editText2, editText3, textView, finToolbarView);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @NonNull
    public final ConstraintLayout a() {
        return this.f102668a;
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f102668a;
    }
}
