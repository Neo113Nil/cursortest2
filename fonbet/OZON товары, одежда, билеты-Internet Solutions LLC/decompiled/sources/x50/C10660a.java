package x50;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.features.cbottomstories.presentation.views.LeftRightFrameLayout;

/* renamed from: x50.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10660a implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final LeftRightFrameLayout f105029a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FrameLayout f105030b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final LeftRightFrameLayout f105031c;

    private C10660a(@NonNull LeftRightFrameLayout leftRightFrameLayout, @NonNull FrameLayout frameLayout, @NonNull LeftRightFrameLayout leftRightFrameLayout2) {
        this.f105029a = leftRightFrameLayout;
        this.f105030b = frameLayout;
        this.f105031c = leftRightFrameLayout2;
    }

    @NonNull
    public static C10660a b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.one_frame_fragment, viewGroup, false);
        FrameLayout frameLayout = (FrameLayout) C2548q.d(R.id.container, inflate);
        if (frameLayout == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.container)));
        }
        LeftRightFrameLayout leftRightFrameLayout = (LeftRightFrameLayout) inflate;
        return new C10660a(leftRightFrameLayout, frameLayout, leftRightFrameLayout);
    }

    @NonNull
    public final LeftRightFrameLayout a() {
        return this.f105029a;
    }

    @Override // X4.a
    @NonNull
    public final View getRoot() {
        return this.f105029a;
    }
}
