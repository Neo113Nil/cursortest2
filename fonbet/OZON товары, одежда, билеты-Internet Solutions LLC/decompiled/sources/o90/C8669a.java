package o90;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.button.large.FinLargeButtonView;

/* renamed from: o90.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8669a implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f77833a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FinLargeButtonView f77834b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final FinLargeButtonView f77835c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f77836d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TextView f77837e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TextView f77838f;

    private C8669a(@NonNull ConstraintLayout constraintLayout, @NonNull FinLargeButtonView finLargeButtonView, @NonNull FinLargeButtonView finLargeButtonView2, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f77833a = constraintLayout;
        this.f77834b = finLargeButtonView;
        this.f77835c = finLargeButtonView2;
        this.f77836d = imageView;
        this.f77837e = textView;
        this.f77838f = textView2;
    }

    @NonNull
    public static C8669a a(@NonNull LayoutInflater layoutInflater, FrameLayout frameLayout) {
        View inflate = layoutInflater.inflate(R.layout.fintech_permissions_bottom_sheet_content, (ViewGroup) frameLayout, false);
        frameLayout.addView(inflate);
        int i11 = R.id.btn_negative;
        FinLargeButtonView finLargeButtonView = (FinLargeButtonView) C2548q.d(R.id.btn_negative, inflate);
        if (finLargeButtonView != null) {
            i11 = R.id.btn_positive;
            FinLargeButtonView finLargeButtonView2 = (FinLargeButtonView) C2548q.d(R.id.btn_positive, inflate);
            if (finLargeButtonView2 != null) {
                i11 = R.id.imageView;
                ImageView imageView = (ImageView) C2548q.d(R.id.imageView, inflate);
                if (imageView != null) {
                    i11 = R.id.tv_description;
                    TextView textView = (TextView) C2548q.d(R.id.tv_description, inflate);
                    if (textView != null) {
                        i11 = R.id.tv_title;
                        TextView textView2 = (TextView) C2548q.d(R.id.tv_title, inflate);
                        if (textView2 != null) {
                            return new C8669a((ConstraintLayout) inflate, finLargeButtonView, finLargeButtonView2, imageView, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f77833a;
    }
}
