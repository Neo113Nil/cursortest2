package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.results.R;
import com.sofascore.results.view.BellButton;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class s7i extends g7 {
    public ArrayList l;
    public final LayoutInflater m;
    public final int n;
    public final int o;
    public final int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7i(Context context) {
        super(context);
        context.getClass();
        this.m = LayoutInflater.from(context);
        this.n = context.getColor(R.color.n_lv_1);
        this.o = context.getColor(R.color.n_lv_3);
        this.p = context.getColor(R.color.live);
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, java.time.LocalDateTime] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, java.time.LocalDateTime] */
    @Override // defpackage.g7
    public final void F(List list) {
        list.getClass();
        if (this.l == null) {
            this.l = new ArrayList();
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (obj instanceof Stage) {
                    Stage stage = (Stage) obj;
                    if (Intrinsics.c(stage.getStatusType(), StatusKt.STATUS_NOT_STARTED)) {
                        joa joaVar = l5i.a;
                        ?? localDateTime = Instant.ofEpochSecond(stage.getStartDateTimestamp()).atZone(ZoneId.systemDefault()).toLocalDateTime();
                        localDateTime.getClass();
                        if (!ug5.s(localDateTime)) {
                            Long endDateTimestamp = stage.getEndDateTimestamp();
                            ?? localDateTime2 = Instant.ofEpochSecond(endDateTimestamp != null ? endDateTimestamp.longValue() : 0L).atZone(ZoneId.systemDefault()).toLocalDateTime();
                            localDateTime2.getClass();
                            if (!ug5.s(localDateTime2)) {
                                continue;
                            }
                        }
                        ArrayList arrayList = this.l;
                        if (arrayList == null) {
                            Intrinsics.i("stageExpanded");
                            throw null;
                        }
                        arrayList.add(Integer.valueOf(i));
                    } else {
                        continue;
                    }
                }
                i = i2;
            }
        }
        super.F(list);
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        if ((obj instanceof Stage) || (obj instanceof r7i)) {
            return true;
        }
        return (obj instanceof q7i) && cga.z(((q7i) obj).a.getUniqueStage());
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new ame(arrayList2, arrayList, 12);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        if (obj instanceof Stage) {
            return 1;
        }
        if (obj instanceof r7i) {
            return 2;
        }
        if (obj instanceof q7i) {
            return 3;
        }
        if (obj instanceof String) {
            return 4;
        }
        ilg.c();
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        int i2 = 0;
        LayoutInflater layoutInflater = this.m;
        int i3 = 1;
        if (i != 1) {
            if (i == 2) {
                return new nn3(bv1.a(layoutInflater, viewGroup), i3);
            }
            if (i == 3) {
                return new nn3(bv1.a(layoutInflater, viewGroup), i2);
            }
            if (i == 4) {
                return new ob5(h04.e(layoutInflater, viewGroup), 0);
            }
            ilg.c();
            return null;
        }
        View inflate = layoutInflater.inflate(R.layout.stage_sport_race_item, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        int i4 = R.id.stage_sport_bell_button;
        BellButton bellButton = (BellButton) nq8.B(R.id.stage_sport_bell_button, inflate);
        if (bellButton != null) {
            i4 = R.id.stage_sport_category_text;
            TextView textView = (TextView) nq8.B(R.id.stage_sport_category_text, inflate);
            if (textView != null) {
                i4 = R.id.stage_sport_country_logo;
                ImageView imageView = (ImageView) nq8.B(R.id.stage_sport_country_logo, inflate);
                if (imageView != null) {
                    i4 = R.id.stage_sport_main_logo;
                    ImageView imageView2 = (ImageView) nq8.B(R.id.stage_sport_main_logo, inflate);
                    if (imageView2 != null) {
                        i4 = R.id.stage_sport_main_text;
                        TextView textView2 = (TextView) nq8.B(R.id.stage_sport_main_text, inflate);
                        if (textView2 != null) {
                            i4 = R.id.stage_sport_vertical_divider;
                            if (((ImageView) nq8.B(R.id.stage_sport_vertical_divider, inflate)) != null) {
                                i4 = R.id.stages_layout;
                                View B = nq8.B(R.id.stages_layout, inflate);
                                if (B != null) {
                                    int i5 = R.id.stage_sport_expand_arrow;
                                    ImageView imageView3 = (ImageView) nq8.B(R.id.stage_sport_expand_arrow, B);
                                    if (imageView3 != null) {
                                        i5 = R.id.stage_sport_expand_layout;
                                        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.stage_sport_expand_layout, B);
                                        if (linearLayout != null) {
                                            z3f z3fVar = new z3f(7, linearLayout, (LinearLayout) B, imageView3);
                                            View B2 = nq8.B(R.id.winner_layout, inflate);
                                            if (B2 != null) {
                                                TextView textView3 = (TextView) nq8.B(R.id.stage_sport_winner_text, B2);
                                                if (textView3 == null) {
                                                    yhk.s("Missing required view with ID: ".concat(B2.getResources().getResourceName(R.id.stage_sport_winner_text)));
                                                    return null;
                                                }
                                                bv1 bv1Var = new bv1(constraintLayout, constraintLayout, bellButton, textView, imageView, imageView2, textView2, z3fVar, new dk2((LinearLayout) B2, textView3, 9));
                                                ArrayList arrayList = this.l;
                                                if (arrayList != null) {
                                                    return new t93(bv1Var, this.n, this.o, this.p, arrayList);
                                                }
                                                Intrinsics.i("stageExpanded");
                                                throw null;
                                            }
                                            i4 = R.id.winner_layout;
                                        }
                                    }
                                    yhk.s("Missing required view with ID: ".concat(B.getResources().getResourceName(i5)));
                                    return null;
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i4)));
        return null;
    }
}
