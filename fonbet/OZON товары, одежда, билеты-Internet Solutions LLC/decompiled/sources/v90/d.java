package v90;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.R;
import ru.ozon.fintech.preferences.ui.themeV2.FintechThemeRadioGroupV2View;
import ru.ozon.fintech.ui.toggleatom.ToggleAtomWrapperView;
import ru.ozon.fintech.ui.toolbar.FinToolbarView;

/* loaded from: classes3.dex */
public final class d implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f102601a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FintechThemeRadioGroupV2View f102602b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final ToggleAtomWrapperView f102603c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f102604d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final ImageView f102605e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final FrameLayout f102606f;

    private d(@NonNull ConstraintLayout constraintLayout, @NonNull FintechThemeRadioGroupV2View fintechThemeRadioGroupV2View, @NonNull ToggleAtomWrapperView toggleAtomWrapperView, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout) {
        this.f102601a = constraintLayout;
        this.f102602b = fintechThemeRadioGroupV2View;
        this.f102603c = toggleAtomWrapperView;
        this.f102604d = constraintLayout2;
        this.f102605e = imageView;
        this.f102606f = frameLayout;
    }

    @NonNull
    public static d b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fintech_fragment_theme, viewGroup, false);
        int i11 = R.id.frgv_selector_theme_v2;
        FintechThemeRadioGroupV2View fintechThemeRadioGroupV2View = (FintechThemeRadioGroupV2View) C2548q.d(R.id.frgv_selector_theme_v2, inflate);
        if (fintechThemeRadioGroupV2View != null) {
            i11 = R.id.subtitle;
            if (((AppCompatTextView) C2548q.d(R.id.subtitle, inflate)) != null) {
                i11 = R.id.switch_ultra;
                ToggleAtomWrapperView toggleAtomWrapperView = (ToggleAtomWrapperView) C2548q.d(R.id.switch_ultra, inflate);
                if (toggleAtomWrapperView != null) {
                    i11 = R.id.tb_theme;
                    if (((FinToolbarView) C2548q.d(R.id.tb_theme, inflate)) != null) {
                        i11 = R.id.title;
                        if (((AppCompatTextView) C2548q.d(R.id.title, inflate)) != null) {
                            i11 = R.id.ultra_container;
                            ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(R.id.ultra_container, inflate);
                            if (constraintLayout != null) {
                                i11 = R.id.ultra_icon_app_icon;
                                ImageView imageView = (ImageView) C2548q.d(R.id.ultra_icon_app_icon, inflate);
                                if (imageView != null) {
                                    i11 = R.id.ultra_icon_back;
                                    if (((ImageView) C2548q.d(R.id.ultra_icon_back, inflate)) != null) {
                                        i11 = R.id.ultra_icon_holder;
                                        FrameLayout frameLayout = (FrameLayout) C2548q.d(R.id.ultra_icon_holder, inflate);
                                        if (frameLayout != null) {
                                            return new d((ConstraintLayout) inflate, fintechThemeRadioGroupV2View, toggleAtomWrapperView, constraintLayout, imageView, frameLayout);
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
        return this.f102601a;
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f102601a;
    }
}
