package v90;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.button.large.FinLargeButtonView;
import ru.ozon.fintech.ui.button.radio.FinRadioButtonView;
import ru.ozon.fintech.ui.toolbar.FinToolbarView;

/* loaded from: classes3.dex */
public final class f implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final NestedScrollView f102644a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FinRadioButtonView f102645b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final Switch f102646c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final FinRadioButtonView f102647d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final FinRadioButtonView f102648e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final FinRadioButtonView f102649f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final FinRadioButtonView f102650g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final FinRadioButtonView f102651h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final FinLargeButtonView f102652i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final FinToolbarView f102653j;

    private f(@NonNull NestedScrollView nestedScrollView, @NonNull FinRadioButtonView finRadioButtonView, @NonNull Switch r32, @NonNull FinRadioButtonView finRadioButtonView2, @NonNull FinRadioButtonView finRadioButtonView3, @NonNull FinRadioButtonView finRadioButtonView4, @NonNull FinRadioButtonView finRadioButtonView5, @NonNull FinRadioButtonView finRadioButtonView6, @NonNull FinLargeButtonView finLargeButtonView, @NonNull FinToolbarView finToolbarView) {
        this.f102644a = nestedScrollView;
        this.f102645b = finRadioButtonView;
        this.f102646c = r32;
        this.f102647d = finRadioButtonView2;
        this.f102648e = finRadioButtonView3;
        this.f102649f = finRadioButtonView4;
        this.f102650g = finRadioButtonView5;
        this.f102651h = finRadioButtonView6;
        this.f102652i = finLargeButtonView;
        this.f102653j = finToolbarView;
    }

    @NonNull
    public static f b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fintech_qr_scanner_settings_fragment, viewGroup, false);
        int i11 = R.id.barcode_mode;
        FinRadioButtonView finRadioButtonView = (FinRadioButtonView) C2548q.d(R.id.barcode_mode, inflate);
        if (finRadioButtonView != null) {
            i11 = R.id.confirm_switch;
            Switch r42 = (Switch) C2548q.d(R.id.confirm_switch, inflate);
            if (r42 != null) {
                i11 = R.id.frbv_photo_value;
                FinRadioButtonView finRadioButtonView2 = (FinRadioButtonView) C2548q.d(R.id.frbv_photo_value, inflate);
                if (finRadioButtonView2 != null) {
                    i11 = R.id.frbv_return_value;
                    FinRadioButtonView finRadioButtonView3 = (FinRadioButtonView) C2548q.d(R.id.frbv_return_value, inflate);
                    if (finRadioButtonView3 != null) {
                        i11 = R.id.frbv_try_to_go;
                        FinRadioButtonView finRadioButtonView4 = (FinRadioButtonView) C2548q.d(R.id.frbv_try_to_go, inflate);
                        if (finRadioButtonView4 != null) {
                            i11 = R.id.mix_mode;
                            FinRadioButtonView finRadioButtonView5 = (FinRadioButtonView) C2548q.d(R.id.mix_mode, inflate);
                            if (finRadioButtonView5 != null) {
                                i11 = R.id.qr_action_header1;
                                if (((TextView) C2548q.d(R.id.qr_action_header1, inflate)) != null) {
                                    i11 = R.id.qr_action_header2;
                                    if (((TextView) C2548q.d(R.id.qr_action_header2, inflate)) != null) {
                                        i11 = R.id.qr_mode;
                                        FinRadioButtonView finRadioButtonView6 = (FinRadioButtonView) C2548q.d(R.id.qr_mode, inflate);
                                        if (finRadioButtonView6 != null) {
                                            i11 = R.id.scanner_mode_header;
                                            if (((TextView) C2548q.d(R.id.scanner_mode_header, inflate)) != null) {
                                                i11 = R.id.start_button;
                                                FinLargeButtonView finLargeButtonView = (FinLargeButtonView) C2548q.d(R.id.start_button, inflate);
                                                if (finLargeButtonView != null) {
                                                    i11 = R.id.tool_bar;
                                                    FinToolbarView finToolbarView = (FinToolbarView) C2548q.d(R.id.tool_bar, inflate);
                                                    if (finToolbarView != null) {
                                                        return new f((NestedScrollView) inflate, finRadioButtonView, r42, finRadioButtonView2, finRadioButtonView3, finRadioButtonView4, finRadioButtonView5, finRadioButtonView6, finLargeButtonView, finToolbarView);
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
    public final NestedScrollView a() {
        return this.f102644a;
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f102644a;
    }
}
