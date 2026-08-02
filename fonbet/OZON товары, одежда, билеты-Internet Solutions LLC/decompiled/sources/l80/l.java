package l80;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.bottomnavigation.FintechBottomNavigationView;

/* loaded from: classes3.dex */
public final class l extends ConstraintLayout {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final FrameLayout f73112c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final FintechBottomNavigationView f73113d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private FragmentContainerView f73114e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(f context, int i11) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R.layout.tabs_wrapper, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        FintechBottomNavigationView fintechBottomNavigationView = (FintechBottomNavigationView) findViewById(R.id.main_activity_bottom_navigation);
        this.f73113d = fintechBottomNavigationView;
        this.f73114e = (FragmentContainerView) findViewById(R.id.main_activity_host_fragment);
        this.f73112c = (FrameLayout) findViewById(R.id.main_activity_hidden_holder);
        fintechBottomNavigationView.setLabelVisibilityMode(1);
        fintechBottomNavigationView.setItemHorizontalTranslationEnabled(false);
    }

    @NotNull
    public final FintechBottomNavigationView b() {
        return this.f73113d;
    }

    @NotNull
    public final FragmentContainerView c() {
        return this.f73114e;
    }

    @NotNull
    public final FrameLayout d() {
        return this.f73112c;
    }

    public final void e(Float f7) {
        FintechBottomNavigationView fintechBottomNavigationView = this.f73113d;
        fintechBottomNavigationView.setAlpha(0.0f);
        fintechBottomNavigationView.setTranslationY(f7.floatValue());
        this.f73114e.setPadding(0, 0, 0, 0);
        this.f73112c.setPadding(0, 0, 0, 0);
    }
}
