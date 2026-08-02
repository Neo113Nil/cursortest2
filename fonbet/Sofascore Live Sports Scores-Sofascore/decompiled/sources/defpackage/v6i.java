package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.divider.MaterialDivider;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.newNetwork.StageStandingsItem;
import com.sofascore.model.newNetwork.TyrePeriod;
import com.sofascore.results.R;
import com.vungle.ads.internal.protos.Sdk;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class v6i extends p8 {
    public final bv1 c;
    public final UniqueStage d;
    public final Integer e;
    public final k6i f;
    public final k6i g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v6i(bv1 bv1Var, UniqueStage uniqueStage, Integer num, k6i k6iVar, k6i k6iVar2) {
        super(r0);
        ConstraintLayout constraintLayout = (ConstraintLayout) bv1Var.b;
        constraintLayout.getClass();
        this.c = bv1Var;
        this.d = uniqueStage;
        this.e = num;
        this.f = k6iVar;
        this.g = k6iVar2;
        this.h = this.b.getColor(R.color.n_lv_1);
        this.i = this.b.getColor(R.color.n_lv_3);
        this.j = this.b.getColor(R.color.live);
        this.k = ao2.s(8, this.b);
        this.l = ao2.s(12, this.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:234:0x019b, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x01ad, code lost:
    
        r20 = r11;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x016f, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x01b8, code lost:
    
        r20 = r11;
        r2 = false;
        r15.setVisibility(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x014a, code lost:
    
        defpackage.zzl.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x014d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x014e, code lost:
    
        r2 = r2.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0151, code lost:
    
        r2 = r2.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0154, code lost:
    
        r2 = r2.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0157, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x00ec, code lost:
    
        if (r10 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c9, code lost:
    
        if (r10 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x010d, code lost:
    
        if (r10 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cc, code lost:
    
        r8 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0124, code lost:
    
        if (r10 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0126, code lost:
    
        r6.setText(r8);
        r8 = r5.getShirt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x012d, code lost:
    
        if (r8 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x012f, code lost:
    
        r2 = r2.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0131, code lost:
    
        if (r2 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0133, code lost:
    
        r8 = defpackage.h5i.a[r8.ordinal()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x013c, code lost:
    
        if (r8 == 1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x013f, code lost:
    
        if (r8 == 2) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0142, code lost:
    
        if (r8 == 3) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0145, code lost:
    
        if (r8 != 4) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0147, code lost:
    
        r2 = r2.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0158, code lost:
    
        if (r2 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x015a, code lost:
    
        r8 = defpackage.l5i.a;
        r9.getClass();
        r8 = r9.getDrawable(com.sofascore.results.R.drawable.ic_cycling_shirt);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0166, code lost:
    
        if (r8 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0168, code lost:
    
        r8 = r8.mutate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x016c, code lost:
    
        if (r8 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0170, code lost:
    
        if (r8 == null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0172, code lost:
    
        r8 = r8.mutate();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0176, code lost:
    
        if (r8 == null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0178, code lost:
    
        r20 = r11;
        r11 = r2.a;
        r2 = r2.b;
        defpackage.v9g.M(r8, com.sofascore.results.R.id.layer_colored, r9.getColor(r11));
        r10 = ((android.graphics.drawable.LayerDrawable) r8).findDrawableByLayerId(com.sofascore.results.R.id.layer_dots);
        r10.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0197, code lost:
    
        if (r2 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0199, code lost:
    
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x019c, code lost:
    
        defpackage.v9g.L(r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x019f, code lost:
    
        if (r2 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01a1, code lost:
    
        defpackage.v9g.M(r8, com.sofascore.results.R.id.layer_dots, r9.getColor(r2.intValue()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01b0, code lost:
    
        r15.setImageDrawable(r8);
        r2 = false;
        r15.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01c0, code lost:
    
        r10 = r2 ? 1 : 0;
        r11 = r20;
        r2 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13, types: [android.view.LayoutInflater] */
    /* JADX WARN: Type inference failed for: r10v19, types: [android.view.View, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r1v38, types: [android.view.View, n1h] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r5v3, types: [km5] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.ArrayList] */
    @Override // defpackage.p8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, int i2, Object obj) {
        TextView textView;
        boolean z;
        String str;
        Boolean bool;
        String str2;
        ?? r2;
        boolean z2;
        boolean z3;
        Integer num;
        Team parentTeam;
        Unit unit;
        int i3;
        TextView textView2;
        n1h n1hVar;
        ?? r5;
        int i4;
        String alpha2;
        String valueOf;
        o6i o6iVar = (o6i) obj;
        o6iVar.getClass();
        bv1 bv1Var = this.c;
        ConstraintLayout constraintLayout = (ConstraintLayout) bv1Var.b;
        ?? r4 = (LinearLayout) bv1Var.e;
        View view = (View) bv1Var.i;
        TextView textView3 = (TextView) bv1Var.c;
        ImageButton imageButton = (ImageButton) bv1Var.j;
        TextView textView4 = (TextView) bv1Var.g;
        TextView textView5 = (TextView) bv1Var.d;
        constraintLayout.getClass();
        if (i == i2 - 1) {
            textView = textView5;
            z = true;
        } else {
            textView = textView5;
            z = false;
        }
        TextView textView6 = textView;
        sea.v(constraintLayout, false, z, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        StageStandingsItem stageStandingsItem = o6iVar.a;
        List list = o6iVar.b;
        alf alfVar = o6iVar.c;
        int m = yid.m(stageStandingsItem.getPosition());
        String status = stageStandingsItem.getStatus();
        if (status != null) {
            str = status.toLowerCase(Locale.ROOT);
            str.getClass();
        } else {
            str = null;
        }
        boolean c = Intrinsics.c(str, StatusKt.STATUS_FINISHED);
        UniqueStage uniqueStage = this.d;
        boolean z4 = cga.z(uniqueStage);
        if (uniqueStage != null) {
            joa joaVar = l5i.a;
            bool = Boolean.valueOf(l5i.g(uniqueStage));
        } else {
            bool = null;
        }
        boolean c2 = Intrinsics.c(bool, Boolean.TRUE);
        int i5 = this.h;
        int i6 = this.i;
        str2 = "-";
        Context context = this.b;
        if (c2) {
            if (stageStandingsItem.getStatus() != null && c) {
                i5 = i6;
            }
            if (alfVar == ta4.f) {
                Integer youngRiderPosition = stageStandingsItem.getYoungRiderPosition();
                if (youngRiderPosition != null) {
                    if (youngRiderPosition.intValue() <= 0) {
                        youngRiderPosition = null;
                    }
                    valueOf = youngRiderPosition != null ? String.valueOf(youngRiderPosition.intValue()) : null;
                }
            } else if (alfVar == ta4.e) {
                Integer climbPosition = stageStandingsItem.getClimbPosition();
                if (climbPosition != null) {
                    if (climbPosition.intValue() <= 0) {
                        climbPosition = null;
                    }
                    valueOf = climbPosition != null ? String.valueOf(climbPosition.intValue()) : null;
                }
            } else if (alfVar == ta4.d) {
                Integer sprintPosition = stageStandingsItem.getSprintPosition();
                if (sprintPosition != null) {
                    if (sprintPosition.intValue() <= 0) {
                        sprintPosition = null;
                    }
                    valueOf = sprintPosition != null ? String.valueOf(sprintPosition.intValue()) : null;
                }
            } else {
                Integer valueOf2 = Integer.valueOf(m);
                if (m <= 0) {
                    valueOf2 = null;
                }
                valueOf = valueOf2 != null ? String.valueOf(valueOf2.intValue()) : null;
            }
        } else {
            r2 = 0;
            if ((stageStandingsItem.getStatus() != null || m <= 0) && !c) {
                textView4.setText("-");
                i5 = i6;
                z2 = true;
            } else {
                textView4.setText(m > 0 ? String.valueOf(m) : "-");
                z2 = false;
            }
            imageButton.setVisibility(8);
            z3 = z2;
        }
        textView4.setTextColor(i5);
        textView3.setTextColor(i5);
        if (z4 && z3) {
            num = Integer.valueOf(context.getColor(R.color.neutral_default));
        } else {
            if (z4 && (parentTeam = stageStandingsItem.getParentTeam()) != null) {
                context.getClass();
                String primary = parentTeam.getTeamColors().getPrimary();
                if (primary != null) {
                    int parseColor = Color.parseColor(primary);
                    if (Color.blue(parseColor) == 255 && Color.green(parseColor) == 255 && Color.red(parseColor) == 255) {
                        parseColor = context.getColor(R.color.k_e0);
                    }
                    num = Integer.valueOf(parseColor);
                }
            }
            num = null;
        }
        view.setVisibility(num != null ? r2 : 8);
        if (num != null) {
            view.setBackgroundTintList(ColorStateList.valueOf(num.intValue()));
        }
        Integer valueOf3 = Integer.valueOf(m);
        if (z3 || m <= 0) {
            valueOf3 = null;
        }
        Integer gridPosition = stageStandingsItem.getGridPosition();
        if (gridPosition == null || gridPosition.intValue() <= 0) {
            gridPosition = null;
        }
        if (valueOf3 == null || gridPosition == null) {
            unit = null;
        } else {
            int intValue = valueOf3.intValue() - gridPosition.intValue();
            n1k n1kVar = intValue > 0 ? new n1k(String.valueOf(intValue), Integer.valueOf(R.color.error), Integer.valueOf(R.drawable.ic_position_arrow_down_8)) : intValue < 0 ? new n1k(String.valueOf(Math.abs(intValue)), Integer.valueOf(R.color.success), Integer.valueOf(R.drawable.ic_position_arrow_up_8)) : new n1k(null, Integer.valueOf(R.color.n_lv_3), null);
            String str3 = (String) n1kVar.a;
            int intValue2 = ((Number) n1kVar.b).intValue();
            Integer num2 = (Integer) n1kVar.c;
            int color = context.getColor(intValue2);
            haa.N(textView6, str3);
            textView6.setTextColor(color);
            if (num2 != null) {
                textView6.setCompoundDrawableTintList(ColorStateList.valueOf(color));
            }
            haa.L(textView6, num2, ua5.b, Integer.valueOf(this.k));
            unit = Unit.a;
        }
        if (unit == null) {
            textView6.setVisibility(8);
        }
        textView3.setText(tba.p(context, stageStandingsItem.getTeam()));
        TextView textView7 = (TextView) bv1Var.h;
        Team parentTeam2 = stageStandingsItem.getParentTeam();
        haa.N(textView7, parentTeam2 != null ? tba.p(context, parentTeam2) : null);
        Country country = stageStandingsItem.getTeam().getCountry();
        String n = (country == null || (alpha2 = country.getAlpha2()) == null) ? null : fc6.n((Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "country/", alpha2, "/flag");
        if (n != null) {
            ua5 ua5Var = ua5.b;
            int i7 = this.l;
            t25.a(i7);
            haa.q(textView3, n, ua5Var, new t25(i7));
        } else {
            haa.K(textView3, null, ua5.b, null, null);
        }
        if (alfVar == fwc.c) {
            usk uskVar = new usk(r4);
            while (uskVar.hasNext()) {
                if (((View) uskVar.next()) instanceof TextView) {
                    uskVar.remove();
                }
            }
            if (r4.getChildCount() > 0) {
                View childAt = r4.getChildAt(r2);
                if (childAt == null) {
                    yhk.s("null cannot be cast to non-null type com.sofascore.results.stagesport.SegmentGraphView");
                    return;
                } else {
                    ?? r1 = (n1h) childAt;
                    r1.setVisibility(r2);
                    n1hVar = r1;
                }
            } else {
                n1h n1hVar2 = new n1h(context);
                Context context2 = n1hVar2.getContext();
                context2.getClass();
                n1hVar2.setLayoutParams(new LinearLayout.LayoutParams(ao2.s(176, context2), -2));
                r4.addView(n1hVar2);
                n1hVar = n1hVar2;
            }
            List<TyrePeriod> tyreInfo = stageStandingsItem.getTyreInfo();
            if (tyreInfo != null) {
                r5 = new ArrayList(k13.r(tyreInfo, 10));
                for (TyrePeriod tyrePeriod : tyreInfo) {
                    int m2 = yid.m(tyrePeriod.getLaps());
                    String valueOf4 = String.valueOf(tyrePeriod.getLaps());
                    DayOfWeek dayOfWeek = hwc.a;
                    r5.add(new l1h(m2, valueOf4, hwc.b(tyrePeriod.getType())));
                }
            } else {
                r5 = km5.a;
            }
            Integer num3 = this.e;
            if (num3 != null) {
                i4 = num3.intValue();
            } else {
                Iterator it = r5.iterator();
                int i8 = r2;
                while (it.hasNext()) {
                    i8 += ((l1h) it.next()).a;
                }
                i4 = i8;
            }
            r5.getClass();
            Iterator it2 = r5.iterator();
            int i9 = r2;
            while (it2.hasNext()) {
                i9 += ((l1h) it2.next()).a;
            }
            n1hVar.a = i4 < i9 ? i9 : i4;
            int i10 = i4 - i9;
            ArrayList arrayList = r5;
            if (i10 > 0) {
                arrayList = CollectionsKt.w0(a.c(new l1h(i10, "", R.color.surface_0)), r5);
            }
            Context context3 = n1hVar.getContext();
            context3.getClass();
            List list2 = arrayList;
            if (hkg.c0(context3)) {
                list2 = new sxb(arrayList);
            }
            n1hVar.b = list2;
            n1hVar.q = null;
            n1hVar.requestLayout();
            i3 = 1;
        } else {
            usk uskVar2 = new usk(r4);
            while (uskVar2.hasNext()) {
                if (((View) uskVar2.next()) instanceof n1h) {
                    uskVar2.remove();
                }
            }
            int i11 = r2;
            for (Object obj2 : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    b.q();
                    throw null;
                }
                d8i d8iVar = (d8i) obj2;
                if (i11 < r4.getChildCount()) {
                    View childAt2 = r4.getChildAt(i11);
                    if (childAt2 == null) {
                        yhk.s("null cannot be cast to non-null type android.widget.TextView");
                        return;
                    } else {
                        ?? r10 = (TextView) childAt2;
                        r10.setVisibility(r2);
                        textView2 = r10;
                    }
                } else {
                    View inflate = LayoutInflater.from(context).inflate(R.layout.item_race_stat_column, r4, r2);
                    if (inflate == null) {
                        yhk.s("rootView");
                        return;
                    } else {
                        TextView textView8 = (TextView) inflate;
                        r4.addView(textView8);
                        textView2 = textView8;
                    }
                }
                Function2 function2 = d8iVar.d;
                Context context4 = textView2.getContext();
                context4.getClass();
                textView2.setText((CharSequence) function2.invoke(context4, stageStandingsItem));
                ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
                if (layoutParams == null) {
                    yhk.s("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    return;
                }
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                int i13 = d8iVar.c;
                Context context5 = textView2.getContext();
                context5.getClass();
                layoutParams2.width = ao2.H(i13, context5);
                textView2.setLayoutParams(layoutParams2);
                textView2.setTextColor((d8iVar.e && ((Boolean) this.f.invoke()).booleanValue() && i5 != i6) ? this.j : i5);
                i11 = i12;
            }
            i3 = 1;
            z8e.J(r4, list.size() - 1);
        }
        ((MaterialDivider) bv1Var.f).setVisibility((i3 > i || i >= ((Number) this.g.invoke()).intValue()) ? 8 : r2);
    }
}
