package com.sofascore.results.event.details.view.promotion;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.sofascore.results.R;
import com.sofascore.results.dialog.BaseModalBottomSheetDialog;
import defpackage.ate;
import defpackage.bef;
import defpackage.bv;
import defpackage.cne;
import defpackage.duf;
import defpackage.fv;
import defpackage.gz8;
import defpackage.joa;
import defpackage.nq8;
import defpackage.nr1;
import defpackage.nv;
import defpackage.vz1;
import defpackage.x0f;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import defpackage.zbe;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/event/details/view/promotion/PromotionModal;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "Lvz1;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PromotionModal extends BaseModalBottomSheetDialog implements vz1 {
    public nr1 x;
    public final joa w = ypa.a(ysa.c, new ate(this, 19));
    public final boolean y = true;
    public final KClass z = duf.a.getOrCreateKotlinClass(x0f.class);

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        View inflate = getLayoutInflater().inflate(R.layout.modal_promotion, (ViewGroup) null, false);
        int i = R.id.body;
        TextView textView = (TextView) nq8.B(R.id.body, inflate);
        if (textView != null) {
            i = R.id.button_close;
            TextView textView2 = (TextView) nq8.B(R.id.button_close, inflate);
            if (textView2 != null) {
                i = R.id.button_confirm;
                MaterialButton materialButton = (MaterialButton) nq8.B(R.id.button_confirm, inflate);
                if (materialButton != null) {
                    i = R.id.drag_indicator_view;
                    ImageView imageView = (ImageView) nq8.B(R.id.drag_indicator_view, inflate);
                    if (imageView != null) {
                        i = R.id.image;
                        ImageView imageView2 = (ImageView) nq8.B(R.id.image, inflate);
                        if (imageView2 != null) {
                            i = R.id.logo;
                            ImageView imageView3 = (ImageView) nq8.B(R.id.logo, inflate);
                            if (imageView3 != null) {
                                i = R.id.spacer;
                                Space space = (Space) nq8.B(R.id.spacer, inflate);
                                if (space != null) {
                                    i = R.id.title;
                                    TextView textView3 = (TextView) nq8.B(R.id.title, inflate);
                                    if (textView3 != null) {
                                        LinearLayout linearLayout = (LinearLayout) inflate;
                                        this.x = new nr1(linearLayout, textView, textView2, materialButton, imageView, imageView2, imageView3, space, textView3);
                                        linearLayout.getClass();
                                        return linearLayout;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    public final bef F() {
        return (bef) this.w.getValue();
    }

    @Override // defpackage.vz1
    /* renamed from: b, reason: from getter */
    public final KClass getX() {
        return this.z;
    }

    @Override // defpackage.vz1
    public final bv e() {
        return null;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        fv fvVar = arguments != null ? (fv) gz8.M(arguments, "analytics_location", fv.class) : null;
        if (fvVar != null) {
            Context requireContext = requireContext();
            requireContext.getClass();
            nv.p0(requireContext, fvVar, F().b, "bottom_sheet", null);
        }
        ((LinearLayout) v().n).setVisibility(8);
        ((ImageView) v().c).setVisibility(F().g != null ? 0 : 8);
        nr1 nr1Var = this.x;
        if (nr1Var == null) {
            Intrinsics.i("dialogBinding");
            throw null;
        }
        ((ImageView) nr1Var.f).setVisibility(F().i != null ? 0 : 8);
        Integer num = F().h;
        if (num != null) {
            nr1 nr1Var2 = this.x;
            if (nr1Var2 == null) {
                Intrinsics.i("dialogBinding");
                throw null;
            }
            ((Space) nr1Var2.h).setVisibility(8);
            nr1 nr1Var3 = this.x;
            if (nr1Var3 == null) {
                Intrinsics.i("dialogBinding");
                throw null;
            }
            ((ImageView) nr1Var3.e).setVisibility(0);
            nr1 nr1Var4 = this.x;
            if (nr1Var4 == null) {
                Intrinsics.i("dialogBinding");
                throw null;
            }
            ((ImageView) nr1Var4.e).setImageResource(num.intValue());
        }
        Integer num2 = F().g;
        if (num2 != null) {
            ((ImageView) v().c).setImageResource(num2.intValue());
        }
        Integer num3 = F().i;
        if (num3 != null) {
            int intValue = num3.intValue();
            nr1 nr1Var5 = this.x;
            if (nr1Var5 == null) {
                Intrinsics.i("dialogBinding");
                throw null;
            }
            ((ImageView) nr1Var5.f).setImageResource(intValue);
        }
        Integer num4 = F().j;
        if (num4 != null) {
            int intValue2 = num4.intValue();
            nr1 nr1Var6 = this.x;
            if (nr1Var6 == null) {
                Intrinsics.i("dialogBinding");
                throw null;
            }
            ((TextView) nr1Var6.i).setText(intValue2);
        }
        Integer num5 = F().k;
        if (num5 != null) {
            int intValue3 = num5.intValue();
            nr1 nr1Var7 = this.x;
            if (nr1Var7 == null) {
                Intrinsics.i("dialogBinding");
                throw null;
            }
            nr1Var7.b.setText(intValue3);
        }
        F().getClass();
        Integer num6 = F().l;
        if (num6 != null) {
            int intValue4 = num6.intValue();
            nr1 nr1Var8 = this.x;
            if (nr1Var8 == null) {
                Intrinsics.i("dialogBinding");
                throw null;
            }
            ((MaterialButton) nr1Var8.g).setText(intValue4);
            nr1 nr1Var9 = this.x;
            if (nr1Var9 == null) {
                Intrinsics.i("dialogBinding");
                throw null;
            }
            z8e.a0((MaterialButton) nr1Var9.g, 1000L, new zbe(17, fvVar, this));
        }
        nr1 nr1Var10 = this.x;
        if (nr1Var10 != null) {
            ((TextView) nr1Var10.d).setOnClickListener(new cne(this, 11));
        } else {
            Intrinsics.i("dialogBinding");
            throw null;
        }
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return F().c;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getX() {
        return this.y;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        return null;
    }
}
