package u80;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.screenstateV20.ScreenStateViewV20;

/* loaded from: classes3.dex */
public final class b implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f100397a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ScreenStateViewV20 f100398b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final FrameLayout f100399c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f100400d;

    private b(@NonNull ConstraintLayout constraintLayout, @NonNull ScreenStateViewV20 screenStateViewV20, @NonNull FrameLayout frameLayout, @NonNull ConstraintLayout constraintLayout2) {
        this.f100397a = constraintLayout;
        this.f100398b = screenStateViewV20;
        this.f100399c = frameLayout;
        this.f100400d = constraintLayout2;
    }

    @NonNull
    public static b b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fintech_web_view_fragment, viewGroup, false);
        int i11 = R.id.screen_state;
        ScreenStateViewV20 screenStateViewV20 = (ScreenStateViewV20) C2548q.d(R.id.screen_state, inflate);
        if (screenStateViewV20 != null) {
            i11 = R.id.web_view_holder;
            FrameLayout frameLayout = (FrameLayout) C2548q.d(R.id.web_view_holder, inflate);
            if (frameLayout != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                return new b(constraintLayout, screenStateViewV20, frameLayout, constraintLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @NonNull
    public final ConstraintLayout a() {
        return this.f100397a;
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f100397a;
    }
}
