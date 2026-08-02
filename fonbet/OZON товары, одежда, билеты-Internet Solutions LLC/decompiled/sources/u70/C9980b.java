package u70;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.button.large.FinLargeButtonView;

/* renamed from: u70.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9980b implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f100353a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FinLargeButtonView f100354b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final FinLargeButtonView f100355c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ImageView f100356d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final RecyclerView f100357e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f100358f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f100359g;

    private C9980b(@NonNull FrameLayout frameLayout, @NonNull FinLargeButtonView finLargeButtonView, @NonNull FinLargeButtonView finLargeButtonView2, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2) {
        this.f100353a = frameLayout;
        this.f100354b = finLargeButtonView;
        this.f100355c = finLargeButtonView2;
        this.f100356d = imageView;
        this.f100357e = recyclerView;
        this.f100358f = appCompatTextView;
        this.f100359g = appCompatTextView2;
    }

    @NonNull
    public static C9980b b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_disclosure, viewGroup, false);
        int i11 = R.id.btn_disable;
        FinLargeButtonView finLargeButtonView = (FinLargeButtonView) C2548q.d(R.id.btn_disable, inflate);
        if (finLargeButtonView != null) {
            i11 = R.id.btn_enable;
            FinLargeButtonView finLargeButtonView2 = (FinLargeButtonView) C2548q.d(R.id.btn_enable, inflate);
            if (finLargeButtonView2 != null) {
                i11 = R.id.iv;
                ImageView imageView = (ImageView) C2548q.d(R.id.iv, inflate);
                if (imageView != null) {
                    i11 = R.id.recycler;
                    RecyclerView recyclerView = (RecyclerView) C2548q.d(R.id.recycler, inflate);
                    if (recyclerView != null) {
                        i11 = R.id.tv_subtitle;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(R.id.tv_subtitle, inflate);
                        if (appCompatTextView != null) {
                            i11 = R.id.tv_title;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(R.id.tv_title, inflate);
                            if (appCompatTextView2 != null) {
                                return new C9980b((FrameLayout) inflate, finLargeButtonView, finLargeButtonView2, imageView, recyclerView, appCompatTextView, appCompatTextView2);
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
        return this.f100353a;
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f100353a;
    }
}
