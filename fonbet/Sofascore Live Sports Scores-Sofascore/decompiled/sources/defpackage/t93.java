package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StageInfo;
import com.sofascore.model.mvvm.model.StageWinner;
import com.sofascore.model.mvvm.model.Status;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.results.R;
import com.sofascore.results.view.BellButton;
import com.unity3d.services.UnityAdsConstants;
import java.time.DayOfWeek;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class t93 extends p8 {
    public final int c;
    public final int d;
    public final int e;
    public final bv1 f;
    public final List g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t93(bv1 bv1Var, int i, int i2, int i3, ArrayList arrayList) {
        super(r0);
        arrayList.getClass();
        ConstraintLayout constraintLayout = (ConstraintLayout) bv1Var.b;
        constraintLayout.getClass();
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = bv1Var;
        this.g = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v26 */
    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        int i3;
        jxd jxdVar;
        int i4;
        int i5;
        ?? r11;
        String description;
        String name;
        String borderColor;
        Stage stage = (Stage) obj;
        stage.getClass();
        bv1 bv1Var = this.f;
        ConstraintLayout constraintLayout = (ConstraintLayout) bv1Var.b;
        dk2 dk2Var = (dk2) bv1Var.j;
        LinearLayout linearLayout = dk2Var.b;
        TextView textView = dk2Var.c;
        z3f z3fVar = (z3f) bv1Var.h;
        LinearLayout linearLayout2 = (LinearLayout) z3fVar.b;
        ImageView imageView = (ImageView) z3fVar.c;
        LinearLayout linearLayout3 = (LinearLayout) z3fVar.d;
        StageInfo info = stage.getInfo();
        Context context = this.b;
        if (info == null || (borderColor = info.getBorderColor()) == null) {
            i3 = 0;
            jxdVar = null;
        } else {
            int parseColor = Color.parseColor(borderColor);
            jxdVar = new jxd();
            float u = ao2.u(2, context);
            jxdVar.h.setStrokeWidth(u);
            jxdVar.a = u;
            jxdVar.c(ug5.c, (jxdVar.a / 2.0f) + ao2.u(8, context));
            jxdVar.d = true;
            i3 = 0;
            jxdVar.b(0, Integer.valueOf(parseColor), null);
        }
        constraintLayout.setForeground(jxdVar);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) bv1Var.i;
        constraintLayout2.getClass();
        int i6 = 3;
        aba.y(constraintLayout2, i3, 3);
        linearLayout3.setVisibility(8);
        ((BellButton) bv1Var.g).e(stage, wu.MAIN_FAVORITES);
        ImageView imageView2 = (ImageView) bv1Var.f;
        boolean z = as9.a;
        Context context2 = imageView2.getContext();
        context2.getClass();
        as9.n(imageView2, stage, hkg.b0(context2));
        ((TextView) bv1Var.d).setText(stage.getDescription());
        ((ImageView) bv1Var.e).setVisibility(8);
        TextView textView2 = (TextView) bv1Var.c;
        List<Stage> substages = stage.getSubstages();
        haa.N(textView2, yid.m(substages != null ? Integer.valueOf(substages.size()) : null) > 1 ? rik.r(stage.getEndDateTimestamp(), stage.getStartDateTimestamp()) : null);
        boolean z2 = stage.getStatus() != null && b.j(StatusKt.STATUS_FINISHED, StatusKt.STATUS_CANCELED, StatusKt.STATUS_POSTPONED).contains(stage.getStatusType());
        linearLayout2.setVisibility(!z2 ? 0 : 8);
        linearLayout.setVisibility(z2 ? 0 : 8);
        if (z2) {
            String str = "";
            if (stage.getWinner() != null) {
                haa.D(textView);
                StageWinner winner = stage.getWinner();
                context.getClass();
                if (winner != null && (name = winner.getName()) != null) {
                    str = tv3.c(context, name);
                }
                textView.setText(str);
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(context.getDrawable(R.drawable.ic_trophy_16), (Drawable) null, (Drawable) null, (Drawable) null);
                r11 = 0;
                textView.setVisibility(0);
            } else if (Intrinsics.c(stage.getStatusType(), StatusKt.STATUS_POSTPONED) || Intrinsics.c(stage.getStatusType(), StatusKt.STATUS_CANCELED)) {
                haa.A(textView);
                Status status = stage.getStatus();
                if (status != null && (description = status.getDescription()) != null) {
                    str = description;
                }
                UniqueStage uniqueStage = stage.getUniqueStage();
                textView.setText(afi.c(context, str, uniqueStage != null ? uniqueStage.getSportSlug() : null, true));
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                r11 = 0;
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
                r11 = 0;
            }
            if (linearLayout.getChildAt(r11) instanceof LinearLayout) {
                linearLayout.removeViewAt(r11);
            }
            Stage currentSubstage = stage.getCurrentSubstage();
            if (currentSubstage != null) {
                linearLayout.addView(d(linearLayout, currentSubstage, true, true), (int) r11);
                return;
            } else {
                linearLayout.addView(d(linearLayout, stage, r11, true), (int) r11);
                return;
            }
        }
        List<Stage> substages2 = stage.getSubstages();
        if (substages2 == null || substages2.isEmpty()) {
            linearLayout3.removeAllViews();
            i4 = 8;
            imageView.setVisibility(8);
            if ((stage.getStatus() == null || !b.j(StatusKt.STATUS_FINISHED, StatusKt.STATUS_CANCELED, StatusKt.STATUS_POSTPONED).contains(stage.getStatusType())) && stage.getCurrentSubstage() != null) {
                Stage currentSubstage2 = stage.getCurrentSubstage();
                if (currentSubstage2 != null) {
                    linearLayout3.addView(d(linearLayout3, currentSubstage2, true, false));
                }
            } else {
                linearLayout3.addView(d(linearLayout3, stage, false, false));
            }
        } else {
            List<Stage> substages3 = stage.getSubstages();
            imageView.setVisibility((substages3 != null ? substages3.size() : 0) > 1 ? 0 : 8);
            List<Stage> substages4 = stage.getSubstages();
            linearLayout3.removeAllViews();
            if (substages4 != null) {
                v6a it = b.h(substages4).iterator();
                while (it.c) {
                    int nextInt = it.nextInt();
                    linearLayout3.addView(d(linearLayout3, substages4.get(nextInt), true, false));
                    if (nextInt < substages4.size() - 1) {
                        linearLayout3.addView(LayoutInflater.from(context).inflate(R.layout.stage_sport_timeline_connector_row, (ViewGroup) linearLayout3, false));
                    }
                }
            }
            i4 = 8;
        }
        List<Stage> substages5 = stage.getSubstages();
        if (substages5 != null) {
            int i7 = 0;
            int i8 = 0;
            for (Object obj2 : substages5) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    b.q();
                    throw null;
                }
                Stage stage2 = (Stage) obj2;
                Stage currentSubstage3 = stage.getCurrentSubstage();
                if (currentSubstage3 != null && stage2.getId() == currentSubstage3.getId()) {
                    i7 = i8;
                }
                i8 = i9;
            }
            i5 = i7;
        } else {
            i5 = 0;
        }
        boolean contains = this.g.contains(Integer.valueOf(i));
        imageView.setRotation(contains ? 180.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Iterator it2 = new tsk(linearLayout3).iterator();
        int i10 = 0;
        while (true) {
            usk uskVar = (usk) it2;
            if (!uskVar.hasNext()) {
                linearLayout2.setOnClickListener(new u5(stage, this, i, i6));
                List<Stage> substages6 = stage.getSubstages();
                linearLayout2.setClickable((substages6 != null ? substages6.size() : 0) > 1);
                linearLayout3.setVisibility(0);
                return;
            }
            Object next = uskVar.next();
            int i11 = i10 + 1;
            if (i10 < 0) {
                b.q();
                throw null;
            }
            ((View) next).setVisibility(i10 == i5 * 2 ? true : contains ? 0 : i4);
            i10 = i11;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006a, code lost:
    
        if (r3.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_POSTPONED) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0076, code lost:
    
        if (r22 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0078, code lost:
    
        r9.setVisibility(8);
        r5.setTextColor(r14);
        r8.setTextColor(r14);
        r7.setTextColor(r14);
        r9 = r20.getStartDateTimestamp();
        r0 = java.lang.Long.valueOf(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008e, code lost:
    
        if (r9 <= 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0091, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0093, code lost:
    
        if (r0 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0095, code lost:
    
        r0 = r20.getStageEvent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0099, code lost:
    
        if (r0 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009b, code lost:
    
        r6 = java.lang.Long.valueOf(r0.getStartDateTimestamp());
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a8, code lost:
    
        if (r6 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00aa, code lost:
    
        r15 = defpackage.rik.r(r20.getEndDateTimestamp(), r6.longValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b6, code lost:
    
        r8.setText(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00fa, code lost:
    
        if (r21 == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00fc, code lost:
    
        r0 = defpackage.hwc.a;
        r7.setText(defpackage.hwc.d(r1, r20.getDescription(), false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x010b, code lost:
    
        r5.setVisibility(8);
        r7.setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a4, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a7, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c2, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r20.getStatusType(), com.sofascore.model.mvvm.model.StatusKt.STATUS_CANCELED) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c4, code lost:
    
        r8.setText(r1.getText(com.sofascore.results.R.string.canceled));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d9, code lost:
    
        r8.setTextColor(r6);
        r5.setTextColor(r6);
        r7.setTextColor(r6);
        r0 = r1.getDrawable(com.sofascore.results.R.drawable.ic_timeline_dot);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e6, code lost:
    
        if (r0 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e8, code lost:
    
        r0.mutate().setTintList(android.content.res.ColorStateList.valueOf(r6));
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f7, code lost:
    
        r9.setImageDrawable(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f5, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cf, code lost:
    
        r8.setText(r1.getText(com.sofascore.results.R.string.postponed));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0072, code lost:
    
        if (r3.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_CANCELED) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0119, code lost:
    
        if (r3.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_FINISHED) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0127, code lost:
    
        r0 = r1.getDrawable(com.sofascore.results.R.drawable.ic_timeline_dot);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x012b, code lost:
    
        if (r0 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012d, code lost:
    
        r0.mutate().setTintList(android.content.res.ColorStateList.valueOf(r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x013b, code lost:
    
        r9.setImageDrawable(r0);
        r8.setTextColor(r14);
        r9 = r20.getStartDateTimestamp();
        r0 = java.lang.Long.valueOf(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x014b, code lost:
    
        if (r9 <= 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x014e, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0150, code lost:
    
        if (r0 != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0152, code lost:
    
        r0 = r20.getStageEvent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0156, code lost:
    
        if (r0 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0158, code lost:
    
        r6 = java.lang.Long.valueOf(r0.getStartDateTimestamp());
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0165, code lost:
    
        r5.setTextColor(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0168, code lost:
    
        if (r6 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x016a, code lost:
    
        r15 = defpackage.rik.q(r6.longValue(), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0172, code lost:
    
        r8.setText(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0175, code lost:
    
        if (r21 == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0177, code lost:
    
        r0 = defpackage.hwc.a;
        r0 = defpackage.hwc.d(r1, r20.getDescription(), false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0189, code lost:
    
        r7.setText(r0);
        r7.setTextColor(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0182, code lost:
    
        r0 = r1.getString(com.sofascore.results.R.string.formula_race);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0161, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0164, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0139, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0123, code lost:
    
        if (r3.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_PRELIMINARY) == false) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0229  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LinearLayout d(LinearLayout linearLayout, Stage stage, boolean z, boolean z2) {
        String str;
        Long l;
        Long l2;
        linearLayout.getClass();
        stage.getClass();
        Context context = this.b;
        View inflate = LayoutInflater.from(context).inflate(R.layout.stage_sport_timeline_row, (ViewGroup) linearLayout, false);
        int i = R.id.stage_sport_dot_text;
        TextView textView = (TextView) nq8.B(R.id.stage_sport_dot_text, inflate);
        if (textView != null) {
            i = R.id.stage_sport_substage_text;
            TextView textView2 = (TextView) nq8.B(R.id.stage_sport_substage_text, inflate);
            if (textView2 != null) {
                i = R.id.stage_sport_time_text;
                TextView textView3 = (TextView) nq8.B(R.id.stage_sport_time_text, inflate);
                if (textView3 != null) {
                    i = R.id.stage_sport_timeline_image;
                    ImageView imageView = (ImageView) nq8.B(R.id.stage_sport_timeline_image, inflate);
                    if (imageView != null) {
                        LinearLayout linearLayout2 = (LinearLayout) inflate;
                        String statusType = stage.getStatusType();
                        int hashCode = statusType.hashCode();
                        str = "";
                        int i2 = this.e;
                        int i3 = this.d;
                        switch (hashCode) {
                            case -1411655086:
                                if (statusType.equals(StatusKt.STATUS_IN_PROGRESS)) {
                                    Drawable drawable = context.getDrawable(R.drawable.ic_timeline_dot);
                                    if (drawable != null) {
                                        drawable.mutate().setTintList(ColorStateList.valueOf(i2));
                                    } else {
                                        drawable = null;
                                    }
                                    imageView.setImageDrawable(drawable);
                                    textView3.setText(context.getText(R.string.now));
                                    textView3.setTextColor(i2);
                                    textView.setTextColor(i2);
                                    if (!z) {
                                        textView.setVisibility(8);
                                        textView2.setVisibility(8);
                                        break;
                                    } else {
                                        DayOfWeek dayOfWeek = hwc.a;
                                        textView2.setText(hwc.d(context, stage.getDescription(), false));
                                        textView2.setTextColor(i2);
                                        break;
                                    }
                                }
                                if (!fc6.B(fc6.t(Instant.ofEpochSecond(stage.getStartDateTimestamp())))) {
                                    Drawable drawable2 = context.getDrawable(R.drawable.ic_timeline_dot_upcoming);
                                    int i4 = this.c;
                                    if (drawable2 != null) {
                                        drawable2.mutate().setTintList(ColorStateList.valueOf(i4));
                                    } else {
                                        drawable2 = null;
                                    }
                                    imageView.setImageDrawable(drawable2);
                                    long startDateTimestamp = stage.getStartDateTimestamp();
                                    Long valueOf = Long.valueOf(startDateTimestamp);
                                    if (startDateTimestamp <= 0) {
                                        valueOf = null;
                                    }
                                    if (valueOf == null) {
                                        Stage stageEvent = stage.getStageEvent();
                                        l2 = stageEvent != null ? Long.valueOf(stageEvent.getStartDateTimestamp()) : null;
                                    } else {
                                        l2 = valueOf;
                                    }
                                    textView3.setText(l2 != null ? rik.r(stage.getEndDateTimestamp(), l2.longValue()) : "");
                                    textView3.setTextColor(i4);
                                    if (!z) {
                                        textView.setVisibility(8);
                                        textView2.setVisibility(8);
                                        break;
                                    } else {
                                        textView.setTextColor(i4);
                                        textView3.setText(rik.q(stage.getStartDateTimestamp(), context));
                                        DayOfWeek dayOfWeek2 = hwc.a;
                                        textView2.setText(hwc.d(context, stage.getDescription(), false));
                                        textView2.setTextColor(i4);
                                        break;
                                    }
                                } else {
                                    Drawable drawable3 = context.getDrawable(R.drawable.ic_timeline_dot_upcoming);
                                    if (drawable3 != null) {
                                        drawable3.mutate().setTintList(ColorStateList.valueOf(i3));
                                    } else {
                                        drawable3 = null;
                                    }
                                    imageView.setImageDrawable(drawable3);
                                    long startDateTimestamp2 = stage.getStartDateTimestamp();
                                    Long valueOf2 = Long.valueOf(startDateTimestamp2);
                                    if (startDateTimestamp2 <= 0) {
                                        valueOf2 = null;
                                    }
                                    if (valueOf2 == null) {
                                        Stage stageEvent2 = stage.getStageEvent();
                                        l = stageEvent2 != null ? Long.valueOf(stageEvent2.getStartDateTimestamp()) : null;
                                    } else {
                                        l = valueOf2;
                                    }
                                    textView3.setText(l != null ? rik.r(stage.getEndDateTimestamp(), l.longValue()) : "");
                                    textView3.setTextColor(i3);
                                    if (!z) {
                                        textView.setVisibility(8);
                                        textView2.setVisibility(8);
                                        break;
                                    } else {
                                        textView.setTextColor(i3);
                                        textView3.setText(l != null ? rik.q(l.longValue(), context) : "");
                                        DayOfWeek dayOfWeek3 = hwc.a;
                                        textView2.setText(hwc.d(context, stage.getDescription(), false));
                                        textView2.setTextColor(i3);
                                        break;
                                    }
                                }
                            case -1322584522:
                                break;
                            case -673660814:
                                break;
                            case -123173735:
                                break;
                            case 2018521742:
                                break;
                            default:
                                if (!fc6.B(fc6.t(Instant.ofEpochSecond(stage.getStartDateTimestamp())))) {
                                }
                                break;
                        }
                        linearLayout2.getClass();
                        return linearLayout2;
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }
}
