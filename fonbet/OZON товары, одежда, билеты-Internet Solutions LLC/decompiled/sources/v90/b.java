package v90;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.button.large.FinLargeButtonView;
import ru.ozon.fintech.ui.button.radio.FinRadioButtonView;
import ru.ozon.fintech.ui.toolbar.FinToolbarView;

/* loaded from: classes3.dex */
public final class b implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ConstraintLayout f102577a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final FinRadioButtonView f102578b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final FinRadioButtonView f102579c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final FinRadioButtonView f102580d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final FinRadioButtonView f102581e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final FinRadioButtonView f102582f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final FinRadioButtonView f102583g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final FinRadioButtonView f102584h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final FinRadioButtonView f102585i;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    public final FinRadioButtonView f102586j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public final FinRadioButtonView f102587k;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final FinRadioButtonView f102588l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final FinRadioButtonView f102589m;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final FinRadioButtonView f102590n;

    /* renamed from: o, reason: collision with root package name */
    @NonNull
    public final FinLargeButtonView f102591o;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    public final FinToolbarView f102592p;

    private b(@NonNull ConstraintLayout constraintLayout, @NonNull FinRadioButtonView finRadioButtonView, @NonNull FinRadioButtonView finRadioButtonView2, @NonNull FinRadioButtonView finRadioButtonView3, @NonNull FinRadioButtonView finRadioButtonView4, @NonNull FinRadioButtonView finRadioButtonView5, @NonNull FinRadioButtonView finRadioButtonView6, @NonNull FinRadioButtonView finRadioButtonView7, @NonNull FinRadioButtonView finRadioButtonView8, @NonNull FinRadioButtonView finRadioButtonView9, @NonNull FinRadioButtonView finRadioButtonView10, @NonNull FinRadioButtonView finRadioButtonView11, @NonNull FinRadioButtonView finRadioButtonView12, @NonNull FinRadioButtonView finRadioButtonView13, @NonNull FinLargeButtonView finLargeButtonView, @NonNull FinToolbarView finToolbarView) {
        this.f102577a = constraintLayout;
        this.f102578b = finRadioButtonView;
        this.f102579c = finRadioButtonView2;
        this.f102580d = finRadioButtonView3;
        this.f102581e = finRadioButtonView4;
        this.f102582f = finRadioButtonView5;
        this.f102583g = finRadioButtonView6;
        this.f102584h = finRadioButtonView7;
        this.f102585i = finRadioButtonView8;
        this.f102586j = finRadioButtonView9;
        this.f102587k = finRadioButtonView10;
        this.f102588l = finRadioButtonView11;
        this.f102589m = finRadioButtonView12;
        this.f102590n = finRadioButtonView13;
        this.f102591o = finLargeButtonView;
        this.f102592p = finToolbarView;
    }

    @NonNull
    public static b b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fintech_camera_settings_fragment, viewGroup, false);
        int i11 = R.id.frbv_back_camera;
        FinRadioButtonView finRadioButtonView = (FinRadioButtonView) C2548q.d(R.id.frbv_back_camera, inflate);
        if (finRadioButtonView != null) {
            i11 = R.id.frbv_front_camera;
            FinRadioButtonView finRadioButtonView2 = (FinRadioButtonView) C2548q.d(R.id.frbv_front_camera, inflate);
            if (finRadioButtonView2 != null) {
                i11 = R.id.frbv_video_chunk10;
                FinRadioButtonView finRadioButtonView3 = (FinRadioButtonView) C2548q.d(R.id.frbv_video_chunk10, inflate);
                if (finRadioButtonView3 != null) {
                    i11 = R.id.frbv_video_chunk3;
                    FinRadioButtonView finRadioButtonView4 = (FinRadioButtonView) C2548q.d(R.id.frbv_video_chunk3, inflate);
                    if (finRadioButtonView4 != null) {
                        i11 = R.id.frbv_video_chunk5;
                        FinRadioButtonView finRadioButtonView5 = (FinRadioButtonView) C2548q.d(R.id.frbv_video_chunk5, inflate);
                        if (finRadioButtonView5 != null) {
                            i11 = R.id.frbv_video_disabled;
                            FinRadioButtonView finRadioButtonView6 = (FinRadioButtonView) C2548q.d(R.id.frbv_video_disabled, inflate);
                            if (finRadioButtonView6 != null) {
                                i11 = R.id.frbv_video_enabled;
                                FinRadioButtonView finRadioButtonView7 = (FinRadioButtonView) C2548q.d(R.id.frbv_video_enabled, inflate);
                                if (finRadioButtonView7 != null) {
                                    i11 = R.id.frbv_video_fhd;
                                    FinRadioButtonView finRadioButtonView8 = (FinRadioButtonView) C2548q.d(R.id.frbv_video_fhd, inflate);
                                    if (finRadioButtonView8 != null) {
                                        i11 = R.id.frbv_video_hd;
                                        FinRadioButtonView finRadioButtonView9 = (FinRadioButtonView) C2548q.d(R.id.frbv_video_hd, inflate);
                                        if (finRadioButtonView9 != null) {
                                            i11 = R.id.frbv_video_pass;
                                            FinRadioButtonView finRadioButtonView10 = (FinRadioButtonView) C2548q.d(R.id.frbv_video_pass, inflate);
                                            if (finRadioButtonView10 != null) {
                                                i11 = R.id.frbv_video_reg;
                                                FinRadioButtonView finRadioButtonView11 = (FinRadioButtonView) C2548q.d(R.id.frbv_video_reg, inflate);
                                                if (finRadioButtonView11 != null) {
                                                    i11 = R.id.frbv_video_sd;
                                                    FinRadioButtonView finRadioButtonView12 = (FinRadioButtonView) C2548q.d(R.id.frbv_video_sd, inflate);
                                                    if (finRadioButtonView12 != null) {
                                                        i11 = R.id.frbv_video_self;
                                                        FinRadioButtonView finRadioButtonView13 = (FinRadioButtonView) C2548q.d(R.id.frbv_video_self, inflate);
                                                        if (finRadioButtonView13 != null) {
                                                            i11 = R.id.start_button;
                                                            FinLargeButtonView finLargeButtonView = (FinLargeButtonView) C2548q.d(R.id.start_button, inflate);
                                                            if (finLargeButtonView != null) {
                                                                i11 = R.id.tool_bar;
                                                                FinToolbarView finToolbarView = (FinToolbarView) C2548q.d(R.id.tool_bar, inflate);
                                                                if (finToolbarView != null) {
                                                                    return new b((ConstraintLayout) inflate, finRadioButtonView, finRadioButtonView2, finRadioButtonView3, finRadioButtonView4, finRadioButtonView5, finRadioButtonView6, finRadioButtonView7, finRadioButtonView8, finRadioButtonView9, finRadioButtonView10, finRadioButtonView11, finRadioButtonView12, finRadioButtonView13, finLargeButtonView, finToolbarView);
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
        return this.f102577a;
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public final View getConstraintLayout() {
        return this.f102577a;
    }
}
