package com.sofascore.results.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.sofascore.results.R;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.dialog.ProposeFollowEntityDialog;
import defpackage.as9;
import defpackage.av;
import defpackage.bea;
import defpackage.bv;
import defpackage.cv;
import defpackage.duf;
import defpackage.dv;
import defpackage.gk;
import defpackage.haa;
import defpackage.hjg;
import defpackage.joa;
import defpackage.l31;
import defpackage.m61;
import defpackage.nr1;
import defpackage.nv;
import defpackage.p4h;
import defpackage.qef;
import defpackage.s01;
import defpackage.sef;
import defpackage.ua5;
import defpackage.v7a;
import defpackage.v9g;
import defpackage.vm;
import defpackage.wt3;
import defpackage.y0f;
import defpackage.yaa;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z8e;
import defpackage.zzl;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/dialog/ProposeFollowEntityDialog;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ProposeFollowEntityDialog extends Hilt_ProposeFollowEntityDialog {
    public sef v;
    public nr1 w;
    public final joa x;
    public final joa y;
    public boolean z;

    public ProposeFollowEntityDialog() {
        final int i = 0;
        Function0 function0 = new Function0(this) { // from class: oef
            public final /* synthetic */ ProposeFollowEntityDialog b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ProposeFollowEntityDialog proposeFollowEntityDialog = this.b;
                switch (i2) {
                    case 0:
                        return Integer.valueOf(proposeFollowEntityDialog.requireArguments().getInt("ID"));
                    default:
                        Bundle requireArguments = proposeFollowEntityDialog.requireArguments();
                        requireArguments.getClass();
                        return (qef) gz8.M(requireArguments, "ENTITY_TYPE", qef.class);
                }
            }
        };
        ysa ysaVar = ysa.c;
        this.x = ypa.a(ysaVar, function0);
        final int i2 = 1;
        this.y = ypa.a(ysaVar, new Function0(this) { // from class: oef
            public final /* synthetic */ ProposeFollowEntityDialog b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ProposeFollowEntityDialog proposeFollowEntityDialog = this.b;
                switch (i22) {
                    case 0:
                        return Integer.valueOf(proposeFollowEntityDialog.requireArguments().getInt("ID"));
                    default:
                        Bundle requireArguments = proposeFollowEntityDialog.requireArguments();
                        requireArguments.getClass();
                        return (qef) gz8.M(requireArguments, "ENTITY_TYPE", qef.class);
                }
            }
        });
        this.z = true;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog l(Bundle bundle) {
        Drawable mutate;
        int i = s01.i;
        Context requireContext = requireContext();
        requireContext.getClass();
        s01 o = hjg.o(requireContext, duf.a.getOrCreateKotlinClass(y0f.class));
        qef qefVar = (qef) this.y.getValue();
        if (qefVar == null) {
            k(true, false);
            return o;
        }
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        nv.l0(requireContext2, dv.OTHER, qefVar.a, Integer.valueOf(s()));
        o.setCanceledOnTouchOutside(false);
        nr1 f = nr1.f(o.getLayoutInflater());
        ImageView imageView = (ImageView) f.e;
        MaterialButton materialButton = (MaterialButton) f.g;
        TextView textView = (TextView) f.d;
        int ordinal = qefVar.ordinal();
        Drawable drawable = null;
        if (ordinal == 0) {
            as9.o(imageView, s());
        } else if (ordinal == 1) {
            as9.l(imageView, s(), null);
        } else {
            if (ordinal != 2) {
                zzl.b();
                return null;
            }
            as9.q(imageView, Integer.valueOf(s()), 0, null);
        }
        ((TextView) f.i).setVisibility(8);
        textView.setText(o.getContext().getString(R.string.popover_favourites_proposal));
        textView.setMaxLines(2);
        f.b.setText(o.getContext().getString(R.string.popover_favourites_proposal_description));
        TextView textView2 = (TextView) f.h;
        textView2.setText(textView2.getContext().getString(R.string.button_not_now));
        z8e.a0(textView2, 1000L, new m61(this, qefVar, f, o, 17));
        materialButton.setText(materialButton.getContext().getString(R.string.button_favourite));
        z8e.a0(materialButton, 1000L, new l31(materialButton, this, qefVar, f, o, 8));
        Drawable drawable2 = o.getContext().getDrawable(R.drawable.ic_star_empty);
        if (drawable2 != null && (mutate = drawable2.mutate()) != null) {
            v9g.K(mutate, o.getContext().getColor(R.color.surface_1));
            drawable = mutate;
        }
        haa.M(materialButton, drawable, ua5.b);
        ConstraintLayout constraintLayout = (ConstraintLayout) f.c;
        vm vmVar = o.g;
        vmVar.g = constraintLayout;
        vmVar.h = false;
        this.w = f;
        return o;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        qef qefVar;
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        if (!this.z || (qefVar = (qef) this.y.getValue()) == null) {
            return;
        }
        sef sefVar = this.v;
        if (sefVar == null) {
            Intrinsics.i("proposeFollowManager");
            throw null;
        }
        sefVar.a(qefVar);
        Context requireContext = requireContext();
        requireContext.getClass();
        bv bvVar = qefVar.a;
        av avVar = av.CLOSE;
        dv dvVar = dv.OTHER;
        int s = s();
        nr1 nr1Var = this.w;
        nv.j0(requireContext, bvVar, avVar, dvVar, Intrinsics.c(nr1Var != null ? Boolean.valueOf(((MaterialCheckBox) nr1Var.f).isChecked()) : null, Boolean.TRUE) ? cv.DO_NOT_SHOW_AGAIN : cv.SHOW_AGAIN, Integer.valueOf(s));
    }

    public final int s() {
        return ((Number) this.x.getValue()).intValue();
    }

    public final void t(qef qefVar, av avVar, boolean z, boolean z2) {
        this.z = false;
        Context requireContext = requireContext();
        requireContext.getClass();
        nv.j0(requireContext, qefVar.a, avVar, dv.OTHER, z2 ? cv.DO_NOT_SHOW_AGAIN : cv.SHOW_AGAIN, Integer.valueOf(s()));
        if (!z) {
            u(qefVar, false, z2);
            return;
        }
        FragmentActivity requireActivity = requireActivity();
        requireActivity.getClass();
        p4h.t((BaseActivity) requireActivity, true, new gk(this, qefVar, z2, 11), null, 56);
    }

    public final void u(qef qefVar, boolean z, boolean z2) {
        if (z) {
            int ordinal = qefVar.ordinal();
            if (ordinal == 0) {
                Context requireContext = requireContext();
                requireContext.getClass();
                v7a.h(s(), requireContext);
            } else if (ordinal == 1) {
                Context requireContext2 = requireContext();
                requireContext2.getClass();
                bea.m(s(), requireContext2);
            } else if (ordinal != 2) {
                zzl.b();
                return;
            } else {
                Context requireContext3 = requireContext();
                requireContext3.getClass();
                yaa.k(s(), false, requireContext3);
            }
        } else {
            sef sefVar = this.v;
            if (sefVar == null) {
                Intrinsics.i("proposeFollowManager");
                throw null;
            }
            sefVar.a(qefVar);
        }
        if (z2) {
            sef sefVar2 = this.v;
            if (sefVar2 == null) {
                Intrinsics.i("proposeFollowManager");
                throw null;
            }
            SharedPreferences sharedPreferences = sefVar2.a;
            int ordinal2 = qefVar.ordinal();
            if (ordinal2 == 0) {
                wt3.v(sharedPreferences, "TEAM_DO_NOT_SHOW_AGAIN", true);
                return;
            }
            if (ordinal2 == 1) {
                wt3.v(sharedPreferences, "PLAYER_DO_NOT_SHOW_AGAIN", true);
            } else if (ordinal2 == 2) {
                wt3.v(sharedPreferences, "LEAGUE_DO_NOT_SHOW_AGAIN", true);
            } else {
                zzl.b();
            }
        }
    }
}
