package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Country;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StageWinner;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.UniqueStage;
import com.sofascore.model.newNetwork.TyreType;
import com.sofascore.results.R;
import com.vungle.ads.internal.protos.Sdk;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class pq5 extends p8 {
    public final /* synthetic */ int c = 0;
    public final int d;
    public final int e;
    public final krk f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pq5(ez0 ez0Var) {
        super(r0);
        FrameLayout frameLayout = (FrameLayout) ez0Var.c;
        frameLayout.getClass();
        this.f = ez0Var;
        this.d = ao2.s(8, this.b);
        this.e = ao2.H(36, this.b);
        aba.y((ConstraintLayout) ez0Var.b, 0, 3);
    }

    public static void d(h04 h04Var, Integer num, Integer num2) {
        TextView textView = h04Var.c;
        int intValue = num.intValue();
        TextView textView2 = h04Var.d;
        textView2.setText(intValue);
        textView2.setVisibility(0);
        if (num2 != null) {
            textView.setText(num2.intValue());
        }
        haa.K(textView, null, ua5.a, null, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x011b, code lost:
    
        if (r4.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_FINISHED) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0137, code lost:
    
        r4 = java.lang.Integer.valueOf(com.sofascore.results.R.drawable.ic_timeline_dot);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0124, code lost:
    
        if (r4.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_PRELIMINARY) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x012d, code lost:
    
        if (r4.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_IN_PROGRESS) == false) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, int i2, Object obj) {
        String str;
        boolean z;
        String str2;
        String str3;
        String str4;
        ty1 ty1Var;
        int i3;
        boolean z2;
        String position;
        String position2;
        Player player;
        Player player2;
        Player player3;
        String lastName;
        Player player4;
        Player player5;
        Player player6;
        String lastName2;
        Player player7;
        Player player8;
        ConstraintLayout e;
        int i4;
        ConstraintLayout e2;
        ConstraintLayout e3;
        String j;
        Category category;
        Integer valueOf;
        String alpha2;
        int i5 = this.c;
        str = "";
        int i6 = this.d;
        Context context = this.b;
        krk krkVar = this.f;
        int i7 = this.e;
        switch (i5) {
            case 0:
                qq5 qq5Var = (qq5) obj;
                qq5Var.getClass();
                bv1 bv1Var = (bv1) krkVar;
                TextView textView = (TextView) bv1Var.d;
                ConstraintLayout constraintLayout = (ConstraintLayout) bv1Var.b;
                ImageView imageView = (ImageView) bv1Var.i;
                ImageView imageView2 = (ImageView) bv1Var.e;
                ImageView imageView3 = (ImageView) bv1Var.j;
                ImageView imageView4 = (ImageView) bv1Var.f;
                PlayerData playerData = qq5Var.a;
                int i8 = qq5Var.c;
                PlayerData playerData2 = qq5Var.b;
                if (playerData == null || (player8 = playerData.getPlayer()) == null) {
                    z = true;
                    str2 = null;
                } else {
                    String t = tba.t(player8);
                    z = true;
                    str2 = t;
                }
                textView.setText(str2);
                TextView textView2 = (TextView) bv1Var.c;
                if (playerData == null || (player7 = playerData.getPlayer()) == null || (str3 = player7.getFirstName()) == null) {
                    str3 = "";
                }
                textView2.setText(str3 + " " + ((playerData == null || (player6 = playerData.getPlayer()) == null || (lastName2 = player6.getLastName()) == null) ? "" : lastName2));
                ((TextView) bv1Var.h).setText((playerData2 == null || (player5 = playerData2.getPlayer()) == null) ? null : tba.t(player5));
                TextView textView3 = (TextView) bv1Var.g;
                if (playerData2 == null || (player4 = playerData2.getPlayer()) == null || (str4 = player4.getFirstName()) == null) {
                    str4 = "";
                }
                if (playerData2 != null && (player3 = playerData2.getPlayer()) != null && (lastName = player3.getLastName()) != null) {
                    str = lastName;
                }
                textView3.setText(str4 + " " + str);
                if (playerData == null || (player2 = playerData.getPlayer()) == null) {
                    ty1Var = null;
                    i3 = 4;
                    imageView2.setVisibility(4);
                } else {
                    ty1Var = null;
                    as9.l(imageView2, player2.getId(), null);
                    i3 = 4;
                }
                if (playerData2 == null || (player = playerData2.getPlayer()) == null) {
                    imageView.setVisibility(i3);
                } else {
                    as9.l(imageView, player.getId(), ty1Var);
                }
                Integer valueOf2 = i8 == 1570 ? Integer.valueOf(context.getColor(R.color.n_lv_1)) : ty1Var;
                if (playerData == null || (position2 = playerData.getPosition()) == null) {
                    imageView4.setVisibility(8);
                } else {
                    Drawable a = gg5.a(context, i8, position2);
                    if (a != null) {
                        imageView4.setImageDrawable(a);
                        imageView4.setVisibility(0);
                        if (valueOf2 != 0) {
                            imageView4.setImageTintList(ColorStateList.valueOf(valueOf2.intValue()));
                        }
                    } else {
                        imageView4.setVisibility(8);
                        Unit unit = Unit.a;
                    }
                }
                if (playerData2 == null || (position = playerData2.getPosition()) == null) {
                    z2 = false;
                    imageView3.setVisibility(8);
                } else {
                    Drawable a2 = gg5.a(context, i8, position);
                    if (a2 != null) {
                        imageView3.setImageDrawable(a2);
                        z2 = false;
                        imageView3.setVisibility(0);
                        if (valueOf2 != 0) {
                            imageView3.setImageTintList(ColorStateList.valueOf(valueOf2.intValue()));
                        }
                    } else {
                        z2 = false;
                        imageView3.setVisibility(8);
                        Unit unit2 = Unit.a;
                    }
                }
                boolean z3 = i == i2 + (-1) ? z : z2;
                constraintLayout.getClass();
                sea.v(constraintLayout, false, z3, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                if (z3) {
                    i6 = i7;
                }
                constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingEnd(), i6);
                return;
            case 1:
                l6i l6iVar = (l6i) obj;
                l6iVar.getClass();
                ez0 ez0Var = (ez0) krkVar;
                FrameLayout frameLayout = (FrameLayout) ez0Var.c;
                LinearLayout linearLayout = (LinearLayout) ez0Var.d;
                frameLayout.getClass();
                sea.v(frameLayout, false, i == i2 + (-1), 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                ((ConstraintLayout) ez0Var.b).setOnClickListener(new cne(this, 28));
                List list = l6iVar.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((d8i) obj2).b != null) {
                        arrayList.add(obj2);
                    }
                }
                Iterator it = arrayList.iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        b.q();
                        throw null;
                    }
                    d8i d8iVar = (d8i) next;
                    if (i9 < linearLayout.getChildCount()) {
                        View childAt = linearLayout.getChildAt(i9);
                        if (childAt == null) {
                            yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                            return;
                        } else {
                            e3 = (ConstraintLayout) childAt;
                            e3.setVisibility(0);
                        }
                    } else {
                        e3 = e();
                        linearLayout.addView(e3);
                    }
                    d(h04.a(e3), d8iVar.a, d8iVar.b);
                    i9 = i10;
                }
                int size = arrayList.size() - 1;
                List<Pair> list2 = l6iVar.b;
                if (list2 != null) {
                    for (Pair pair : list2) {
                        int intValue = ((Number) pair.a).intValue();
                        int intValue2 = ((Number) pair.b).intValue();
                        size++;
                        if (size < linearLayout.getChildCount()) {
                            View childAt2 = linearLayout.getChildAt(size);
                            if (childAt2 == null) {
                                yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                                return;
                            } else {
                                e2 = (ConstraintLayout) childAt2;
                                e2.setVisibility(0);
                            }
                        } else {
                            e2 = e();
                            linearLayout.addView(e2);
                        }
                        d(h04.a(e2), Integer.valueOf(intValue), Integer.valueOf(intValue2));
                    }
                }
                if (l6iVar.c) {
                    for (TyreType tyreType : TyreType.getEntries()) {
                        size++;
                        if (size < linearLayout.getChildCount()) {
                            View childAt3 = linearLayout.getChildAt(size);
                            if (childAt3 == null) {
                                yhk.s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                                return;
                            } else {
                                e = (ConstraintLayout) childAt3;
                                e.setVisibility(0);
                            }
                        } else {
                            e = e();
                            linearLayout.addView(e);
                        }
                        h04 a3 = h04.a(e);
                        int i11 = t6i.a[tyreType.ordinal()];
                        if (i11 == 1) {
                            i4 = R.string.motorsport_legend_laps_on_hard_tyres;
                        } else if (i11 == 2) {
                            i4 = R.string.motorsport_legend_laps_on_medium_tyres;
                        } else if (i11 == 3) {
                            i4 = R.string.motorsport_legend_laps_on_soft_tyres;
                        } else if (i11 == 4) {
                            i4 = R.string.motorsport_legend_laps_on_intermediate_tyres;
                        } else {
                            if (i11 != 5) {
                                zzl.b();
                                return;
                            }
                            i4 = R.string.motorsport_legend_laps_on_wet_tyres;
                        }
                        DayOfWeek dayOfWeek = hwc.a;
                        int b = hwc.b(tyreType);
                        a3.d.setVisibility(8);
                        TextView textView4 = a3.c;
                        textView4.setText(i4);
                        textView4.setCompoundDrawableTintList(ColorStateList.valueOf(context.getColor(b)));
                        haa.K(textView4, textView4.getContext().getDrawable(R.drawable.rectangle_4dp_corners), ua5.a, Integer.valueOf(i7), Integer.valueOf(i6));
                    }
                }
                z8e.J(linearLayout, size);
                return;
            default:
                c7i c7iVar = (c7i) obj;
                c7iVar.getClass();
                Stage stage = c7iVar.a;
                e92 e92Var = (e92) krkVar;
                ConstraintLayout constraintLayout2 = (ConstraintLayout) e92Var.e;
                TextView textView5 = (TextView) e92Var.d;
                TextView textView6 = (TextView) e92Var.f;
                TextView textView7 = (TextView) e92Var.c;
                constraintLayout2.getClass();
                boolean z4 = c7iVar.b;
                sea.v(constraintLayout2, false, !z4, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                TextView textView8 = (TextView) e92Var.b;
                textView8.setText(cga.A(stage, context, false));
                Country country = stage.getCountry();
                if (country == null || (alpha2 = country.getAlpha2()) == null) {
                    UniqueStage uniqueStage = stage.getUniqueStage();
                    j = (uniqueStage == null || (category = uniqueStage.getCategory()) == null) ? null : vxd.j(category.getId(), (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "category/", "/image");
                } else {
                    j = fc6.n((Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "country/", alpha2, "/flag");
                }
                ua5 ua5Var = ua5.a;
                t25.a(i7);
                haa.q(textView8, j, ua5Var, new t25(i7));
                Stage substage = stage.getSubstage();
                if (substage != null) {
                    DayOfWeek dayOfWeek2 = hwc.a;
                    textView6.setSelected(hwc.f(substage));
                    long startDateTimestamp = substage.getStartDateTimestamp();
                    Long valueOf3 = Long.valueOf(startDateTimestamp);
                    if (startDateTimestamp <= 0) {
                        valueOf3 = null;
                    }
                    textView6.setText(context.getString(R.string.bullet_separator, valueOf3 != null ? rik.q(valueOf3.longValue(), context) : "", cga.A(substage, context, false)));
                    String statusType = substage.getStatusType();
                    switch (statusType.hashCode()) {
                        case -1411655086:
                            break;
                        case -1322584522:
                            break;
                        case -673660814:
                            break;
                        case -123173735:
                            if (statusType.equals(StatusKt.STATUS_CANCELED)) {
                                valueOf = null;
                                break;
                            }
                            valueOf = Integer.valueOf(R.drawable.ic_timeline_dot_upcoming);
                            break;
                        default:
                            valueOf = Integer.valueOf(R.drawable.ic_timeline_dot_upcoming);
                            break;
                    }
                    haa.M(textView6, valueOf != null ? context.getDrawable(valueOf.intValue()) : null, ua5Var);
                    textView7.setSelected(Intrinsics.c(substage.getStatusType(), StatusKt.STATUS_CANCELED));
                    if (Intrinsics.c(substage.getStatusType(), StatusKt.STATUS_CANCELED)) {
                        haa.M(textView7, null, ua5Var);
                        haa.N(textView7, context.getString(R.string.canceled));
                    } else {
                        haa.L(textView7, Integer.valueOf(R.drawable.ic_trophy_16), ua5Var, Integer.valueOf(i7));
                        StageWinner winner = substage.getWinner();
                        haa.N(textView7, winner != null ? winner.getName() : null);
                    }
                    textView5.setVisibility(hwc.f(substage) ? 0 : 8);
                } else {
                    textView6.setVisibility(8);
                    textView7.setVisibility(8);
                    textView5.setVisibility(8);
                }
                constraintLayout2.getClass();
                if (z4) {
                    i6 = 0;
                }
                constraintLayout2.setPadding(constraintLayout2.getPaddingLeft(), constraintLayout2.getPaddingTop(), constraintLayout2.getPaddingRight(), i6);
                return;
        }
    }

    public ConstraintLayout e() {
        ConstraintLayout constraintLayout = h04.d(LayoutInflater.from(this.b), (LinearLayout) ((ez0) this.f).d).b;
        constraintLayout.getClass();
        constraintLayout.setPadding(0, constraintLayout.getPaddingTop(), 0, constraintLayout.getPaddingBottom());
        return constraintLayout;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pq5(e92 e92Var) {
        super(r0);
        ConstraintLayout constraintLayout = (ConstraintLayout) e92Var.e;
        constraintLayout.getClass();
        this.f = e92Var;
        this.d = ao2.v(8, this.b);
        this.e = ao2.v(16, this.b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pq5(bv1 bv1Var) {
        super(r0);
        ConstraintLayout constraintLayout = (ConstraintLayout) bv1Var.b;
        constraintLayout.getClass();
        this.f = bv1Var;
        this.d = ao2.s(8, this.b);
        this.e = ao2.s(16, this.b);
    }
}
