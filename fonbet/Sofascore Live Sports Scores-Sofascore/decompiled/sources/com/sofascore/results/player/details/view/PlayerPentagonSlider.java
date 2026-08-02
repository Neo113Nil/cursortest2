package com.sofascore.results.player.details.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.setting.i;
import com.sofascore.results.R;
import com.vungle.ads.internal.task.g;
import defpackage.bi4;
import defpackage.bu1;
import defpackage.fn0;
import defpackage.hk4;
import defpackage.lac;
import defpackage.mqi;
import defpackage.nq8;
import defpackage.nzd;
import defpackage.o8;
import defpackage.ord;
import defpackage.uue;
import defpackage.v9g;
import defpackage.yhk;
import defpackage.ypa;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004R\u001b\u0010\b\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001b\u0010\u000b\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001b\u0010\u000e\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001b\u0010\u0011\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0013"}, d2 = {"Lcom/sofascore/results/player/details/view/PlayerPentagonSlider;", "Lo8;", "", "getLayoutId", "()I", g.e, "Ljoa;", "getColorSecondaryDefault", "colorSecondaryDefault", h.b, "getColorSurface1", "colorSurface1", i.a, "getColorNeutralDefault", "colorNeutralDefault", j.b, "getColorNeutralVariant", "colorNeutralVariant", "uue", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlayerPentagonSlider extends o8 {
    public static final /* synthetic */ int l = 0;
    public final bu1 d;
    public final ArrayList e;
    public int f;
    public final mqi g;
    public final mqi h;
    public final mqi i;
    public final mqi j;
    public final List k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerPentagonSlider(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.label_point_1;
        View B = nq8.B(R.id.label_point_1, root);
        if (B != null) {
            i = R.id.label_point_1_background;
            View B2 = nq8.B(R.id.label_point_1_background, root);
            if (B2 != null) {
                i = R.id.label_point_2;
                View B3 = nq8.B(R.id.label_point_2, root);
                if (B3 != null) {
                    i = R.id.label_point_2_background;
                    View B4 = nq8.B(R.id.label_point_2_background, root);
                    if (B4 != null) {
                        i = R.id.label_point_3;
                        View B5 = nq8.B(R.id.label_point_3, root);
                        if (B5 != null) {
                            i = R.id.label_point_3_background;
                            View B6 = nq8.B(R.id.label_point_3_background, root);
                            if (B6 != null) {
                                i = R.id.label_point_4;
                                View B7 = nq8.B(R.id.label_point_4, root);
                                if (B7 != null) {
                                    i = R.id.label_point_4_background;
                                    View B8 = nq8.B(R.id.label_point_4_background, root);
                                    if (B8 != null) {
                                        i = R.id.label_text_1;
                                        TextView textView = (TextView) nq8.B(R.id.label_text_1, root);
                                        if (textView != null) {
                                            i = R.id.label_text_2;
                                            TextView textView2 = (TextView) nq8.B(R.id.label_text_2, root);
                                            if (textView2 != null) {
                                                i = R.id.label_text_3;
                                                TextView textView3 = (TextView) nq8.B(R.id.label_text_3, root);
                                                if (textView3 != null) {
                                                    i = R.id.label_text_4;
                                                    TextView textView4 = (TextView) nq8.B(R.id.label_text_4, root);
                                                    if (textView4 != null) {
                                                        i = R.id.player_pentagon_seek_bar;
                                                        SeekBar seekBar = (SeekBar) nq8.B(R.id.player_pentagon_seek_bar, root);
                                                        if (seekBar != null) {
                                                            this.d = new bu1((ConstraintLayout) root, B, B2, B3, B4, B5, B6, B7, B8, textView, textView2, textView3, textView4, seekBar);
                                                            this.e = new ArrayList();
                                                            this.f = 3;
                                                            this.g = ypa.b(new nzd(context, 10));
                                                            this.h = ypa.b(new nzd(context, 11));
                                                            this.i = ypa.b(new nzd(context, 12));
                                                            this.j = ypa.b(new nzd(context, 13));
                                                            this.k = b.j(new uue(B, B2, textView), new uue(B3, B4, textView2), new uue(B5, B6, textView3), new uue(B7, B8, textView4));
                                                            return;
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
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getColorNeutralDefault() {
        return ((Number) this.i.getValue()).intValue();
    }

    private final int getColorNeutralVariant() {
        return ((Number) this.j.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getColorSecondaryDefault() {
        return ((Number) this.g.getValue()).intValue();
    }

    private final int getColorSurface1() {
        return ((Number) this.h.getValue()).intValue();
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.player_details_pentagon_slider;
    }

    public final void n(int i) {
        List list = this.k;
        if (i == 3) {
            v9g.K(((uue) list.get(i)).a.getBackground().mutate(), getColorSurface1());
            v9g.K(((uue) list.get(i)).b.getBackground().mutate(), getColorSecondaryDefault());
        } else if (this.f != i) {
            v9g.K(((uue) list.get(i)).a.getBackground().mutate(), getColorNeutralVariant());
            v9g.K(((uue) list.get(i)).b.getBackground().mutate(), getColorSurface1());
        } else {
            v9g.K(((uue) list.get(i)).a.getBackground().mutate(), getColorSurface1());
            v9g.K(((uue) list.get(i)).b.getBackground().mutate(), getColorNeutralDefault());
        }
    }

    public final void o(List list, ord ordVar) {
        list.getClass();
        ArrayList arrayList = this.e;
        arrayList.clear();
        arrayList.addAll(list);
        bu1 bu1Var = this.d;
        v9g.K(((SeekBar) bu1Var.k).getThumb().mutate(), getColorSecondaryDefault());
        SeekBar seekBar = (SeekBar) bu1Var.k;
        this.f = seekBar.getProgress();
        seekBar.setOnSeekBarChangeListener(new lac(this, ordVar));
        for (int i = 0; i < 4; i++) {
            List list2 = this.k;
            View view = ((uue) list2.get(i)).a;
            View view2 = ((uue) list2.get(i)).b;
            TextView textView = ((uue) list2.get(i)).c;
            n(i);
            int i2 = 3 - i;
            if (list.contains(Integer.valueOf(i2))) {
                view.setVisibility(0);
                view2.setVisibility(0);
            } else {
                view.setVisibility(4);
                view2.setVisibility(4);
            }
            Calendar calendar = Calendar.getInstance();
            calendar.add(1, i - 3);
            if (i == 3) {
                textView.setTextColor(getColorSecondaryDefault());
            }
            if (list.contains(Integer.valueOf(i2))) {
                long timeInMillis = calendar.getTimeInMillis() / 1000;
                bi4 bi4Var = bi4.PATTERN_MMY;
                ConcurrentHashMap concurrentHashMap = hk4.a;
                fn0.u(timeInMillis, hk4.a(bi4Var.d()), textView);
            } else {
                textView.setText("N/A");
            }
        }
    }
}
