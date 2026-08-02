package v90;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.R;
import ru.ozon.fintech.preferences.ui.themeV2.FintechThemeRadioGroupV2View;
import ru.ozon.fintech.ui.button.radioV2.FinRadioButtonV2View;

/* loaded from: classes3.dex */
public final class g implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ViewGroup f102654a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FinRadioButtonV2View f102655b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final FinRadioButtonV2View f102656c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final FinRadioButtonV2View f102657d;

    private g(@NonNull ViewGroup viewGroup, @NonNull FinRadioButtonV2View finRadioButtonV2View, @NonNull FinRadioButtonV2View finRadioButtonV2View2, @NonNull FinRadioButtonV2View finRadioButtonV2View3) {
        this.f102654a = viewGroup;
        this.f102655b = finRadioButtonV2View;
        this.f102656c = finRadioButtonV2View2;
        this.f102657d = finRadioButtonV2View3;
    }

    @NonNull
    public static g a(@NonNull LayoutInflater layoutInflater, @NonNull FintechThemeRadioGroupV2View fintechThemeRadioGroupV2View) {
        layoutInflater.inflate(R.layout.fintech_radio_group_v2_view, fintechThemeRadioGroupV2View);
        int i11 = R.id.frbv_light;
        FinRadioButtonV2View finRadioButtonV2View = (FinRadioButtonV2View) C2548q.d(R.id.frbv_light, fintechThemeRadioGroupV2View);
        if (finRadioButtonV2View != null) {
            i11 = R.id.frbv_night;
            FinRadioButtonV2View finRadioButtonV2View2 = (FinRadioButtonV2View) C2548q.d(R.id.frbv_night, fintechThemeRadioGroupV2View);
            if (finRadioButtonV2View2 != null) {
                i11 = R.id.frbv_system;
                FinRadioButtonV2View finRadioButtonV2View3 = (FinRadioButtonV2View) C2548q.d(R.id.frbv_system, fintechThemeRadioGroupV2View);
                if (finRadioButtonV2View3 != null) {
                    return new g(fintechThemeRadioGroupV2View, finRadioButtonV2View, finRadioButtonV2View2, finRadioButtonV2View3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(fintechThemeRadioGroupV2View.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public final View getRoot() {
        return this.f102654a;
    }
}
