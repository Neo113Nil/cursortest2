package com.sofascore.results.dialog;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.button.MaterialButton;
import com.sofascore.model.Sports;
import com.sofascore.model.network.response.TeamAverageRatingVersion;
import com.sofascore.results.R;
import com.sofascore.results.dialog.view.SofascoreRatingScaleView;
import defpackage.ajh;
import defpackage.ao2;
import defpackage.awj;
import defpackage.cne;
import defpackage.ez0;
import defpackage.gvh;
import defpackage.ht9;
import defpackage.joa;
import defpackage.llf;
import defpackage.mqi;
import defpackage.nq8;
import defpackage.pco;
import defpackage.ph0;
import defpackage.sl6;
import defpackage.st9;
import defpackage.urh;
import defpackage.wuh;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z1g;
import defpackage.z8e;
import defpackage.zzl;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/dialog/SofascoreRatingBottomSheetDialog;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "v9f", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SofascoreRatingBottomSheetDialog extends BaseModalBottomSheetDialog {
    public ez0 C;
    public final mqi w = ypa.b(new wuh(this, 1));
    public final mqi x = ypa.b(new wuh(this, 2));
    public final mqi y = ypa.b(new wuh(this, 3));
    public final mqi z = ypa.b(new wuh(this, 4));
    public final joa A = ypa.a(ysa.c, new wuh(this, 5));
    public final boolean B = true;

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        this.t.b = F();
        final int i = 0;
        View inflate = layoutInflater.inflate(R.layout.dialog_sofascore_rating_bottom_sheet, (ViewGroup) v().l, false);
        int i2 = R.id.got_it;
        MaterialButton materialButton = (MaterialButton) nq8.B(R.id.got_it, inflate);
        if (materialButton != null) {
            i2 = R.id.learn_more;
            TextView textView = (TextView) nq8.B(R.id.learn_more, inflate);
            if (textView != null) {
                i2 = R.id.rating_view;
                SofascoreRatingScaleView sofascoreRatingScaleView = (SofascoreRatingScaleView) nq8.B(R.id.rating_view, inflate);
                if (sofascoreRatingScaleView != null) {
                    i2 = R.id.upper_text;
                    TextView textView2 = (TextView) nq8.B(R.id.upper_text, inflate);
                    if (textView2 != null) {
                        this.C = new ez0((NestedScrollView) inflate, materialButton, textView, sofascoreRatingScaleView, textView2);
                        mqi mqiVar = this.x;
                        gvh gvhVar = (gvh) mqiVar.getValue();
                        TeamAverageRatingVersion teamAverageRatingVersion = (TeamAverageRatingVersion) this.A.getValue();
                        String F = F();
                        gvhVar.getClass();
                        teamAverageRatingVersion.getClass();
                        Integer num = gvhVar.b;
                        if (teamAverageRatingVersion != TeamAverageRatingVersion.WEIGHTED || !F.equals(Sports.FOOTBALL)) {
                            num = null;
                        }
                        textView2.setText(getString(num != null ? num.intValue() : gvhVar.a));
                        ez0 ez0Var = this.C;
                        if (ez0Var == null) {
                            Intrinsics.i("dialogBinding");
                            throw null;
                        }
                        ((MaterialButton) ez0Var.c).setOnClickListener(new cne(this, 25));
                        ez0 ez0Var2 = this.C;
                        if (ez0Var2 == null) {
                            Intrinsics.i("dialogBinding");
                            throw null;
                        }
                        final SofascoreRatingScaleView sofascoreRatingScaleView2 = (SofascoreRatingScaleView) ez0Var2.e;
                        Double d = (Double) this.y.getValue();
                        double doubleValue = d != null ? d.doubleValue() : 10.0d;
                        gvh gvhVar2 = (gvh) mqiVar.getValue();
                        Integer num2 = (Integer) this.z.getValue();
                        float f = sofascoreRatingScaleView2.o;
                        TextPaint textPaint = sofascoreRatingScaleView2.g;
                        gvhVar2.getClass();
                        sofascoreRatingScaleView2.s = llf.a(new BigDecimal(doubleValue).setScale(2, RoundingMode.HALF_UP).doubleValue(), 3.0d, 10.0d);
                        sofascoreRatingScaleView2.u = gvhVar2;
                        final int i3 = 1;
                        if (num2 != null) {
                            int intValue = num2.intValue();
                            int ordinal = gvhVar2.ordinal();
                            if (ordinal == 2) {
                                ht9 a = sofascoreRatingScaleView2.a(pco.M(intValue), (int) f, new Function1() { // from class: evh
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        int i4 = i3;
                                        SofascoreRatingScaleView sofascoreRatingScaleView3 = sofascoreRatingScaleView2;
                                        Bitmap bitmap = (Bitmap) obj;
                                        switch (i4) {
                                            case 0:
                                                sofascoreRatingScaleView3.v = bitmap;
                                                break;
                                            default:
                                                sofascoreRatingScaleView3.v = bitmap;
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                });
                                awj[] awjVarArr = {new urh()};
                                sl6 sl6Var = st9.a;
                                st9.b(a, ph0.X(awjVarArr));
                                Context context = sofascoreRatingScaleView2.getContext();
                                context.getClass();
                                ajh.a(context).a(a.a());
                            } else if (ordinal == 3 || ordinal == 4) {
                                ht9 a2 = sofascoreRatingScaleView2.a(pco.R(intValue), (int) f, new Function1() { // from class: evh
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        int i4 = i;
                                        SofascoreRatingScaleView sofascoreRatingScaleView3 = sofascoreRatingScaleView2;
                                        Bitmap bitmap = (Bitmap) obj;
                                        switch (i4) {
                                            case 0:
                                                sofascoreRatingScaleView3.v = bitmap;
                                                break;
                                            default:
                                                sofascoreRatingScaleView3.v = bitmap;
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                });
                                Context context2 = sofascoreRatingScaleView2.getContext();
                                context2.getClass();
                                ajh.a(context2).a(a2.a());
                            }
                        }
                        int ordinal2 = gvhVar2.ordinal();
                        if (ordinal2 == 0) {
                            textPaint.setTypeface(z1g.a(R.font.sofascore_sans_bold, sofascoreRatingScaleView2.getContext()));
                            Context context3 = sofascoreRatingScaleView2.getContext();
                            context3.getClass();
                            textPaint.setTextSize(ao2.u(24, context3));
                            textPaint.setColor(-1);
                        } else {
                            if (ordinal2 != 1 && ordinal2 != 2 && ordinal2 != 3 && ordinal2 != 4 && ordinal2 != 5) {
                                zzl.b();
                                return null;
                            }
                            textPaint.setTypeface(z1g.a(R.font.sofascore_sans_bold, sofascoreRatingScaleView2.getContext()));
                            Context context4 = sofascoreRatingScaleView2.getContext();
                            context4.getClass();
                            textPaint.setTextSize(ao2.u(45, context4));
                            textPaint.setColor(sofascoreRatingScaleView2.getContext().getColor(R.color.n_lv_1));
                        }
                        String str = sofascoreRatingScaleView2.t;
                        textPaint.getTextBounds(str, 0, str.length(), sofascoreRatingScaleView2.z);
                        ez0 ez0Var3 = this.C;
                        if (ez0Var3 == null) {
                            Intrinsics.i("dialogBinding");
                            throw null;
                        }
                        ((TextView) ez0Var3.d).setVisibility(kotlin.collections.b.j(Sports.FOOTBALL, Sports.BASKETBALL).contains(F()) ? 0 : 8);
                        ez0 ez0Var4 = this.C;
                        if (ez0Var4 == null) {
                            Intrinsics.i("dialogBinding");
                            throw null;
                        }
                        z8e.a0((TextView) ez0Var4.d, 1000L, new wuh(this, i));
                        ez0 ez0Var5 = this.C;
                        if (ez0Var5 == null) {
                            Intrinsics.i("dialogBinding");
                            throw null;
                        }
                        NestedScrollView nestedScrollView = (NestedScrollView) ez0Var5.b;
                        nestedScrollView.getClass();
                        return nestedScrollView;
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }

    public final String F() {
        Object value = this.w.getValue();
        value.getClass();
        return (String) value;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        int ordinal = ((gvh) this.x.getValue()).ordinal();
        if (ordinal == 0) {
            return "SpecificRatingGeneralModal";
        }
        if (ordinal == 1) {
            return "AverageRatingGeneralModal";
        }
        if (ordinal == 2) {
            return "AverageRatingPlayerModal";
        }
        if (ordinal == 3 || ordinal == 4) {
            return "AverageRatingTeamModal";
        }
        if (ordinal == 5) {
            return "AverageRatingGeneralModal";
        }
        zzl.b();
        return null;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getD() {
        return this.B;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = ((gvh) this.x.getValue()) == gvh.c ? getString(R.string.sofascore_rating) : getString(R.string.average_sofascore_rating);
        string.getClass();
        return string;
    }
}
