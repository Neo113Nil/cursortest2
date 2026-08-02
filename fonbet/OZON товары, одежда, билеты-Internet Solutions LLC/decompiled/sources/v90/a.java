package v90;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.toolbar.FinToolbarView;

/* loaded from: classes3.dex */
public final class a implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f102574a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FinToolbarView f102575b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final TextView f102576c;

    private a(@NonNull ConstraintLayout constraintLayout, @NonNull FinToolbarView finToolbarView, @NonNull TextView textView) {
        this.f102574a = constraintLayout;
        this.f102575b = finToolbarView;
        this.f102576c = textView;
    }

    @NonNull
    public static a b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fintech_antifraud_json_fragment, viewGroup, false);
        int i11 = R.id.scrollView;
        if (((NestedScrollView) C2548q.d(R.id.scrollView, inflate)) != null) {
            i11 = R.id.tool_bar;
            FinToolbarView finToolbarView = (FinToolbarView) C2548q.d(R.id.tool_bar, inflate);
            if (finToolbarView != null) {
                i11 = R.id.tv_json;
                TextView textView = (TextView) C2548q.d(R.id.tv_json, inflate);
                if (textView != null) {
                    return new a((ConstraintLayout) inflate, finToolbarView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @NonNull
    public final ConstraintLayout a() {
        return this.f102574a;
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f102574a;
    }
}
