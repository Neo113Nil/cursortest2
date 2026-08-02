package com.vk.ecomm.reviews.impl.communities.yclients;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.api.di.ReviewsComponent;
import com.vk.ecomm.reviews.impl.communities.yclients.a;
import xsna.ao50;
import xsna.dig0;
import xsna.dw20;
import xsna.fpf0;
import xsna.ie8;
import xsna.k3j;
import xsna.k7m;
import xsna.km50;
import xsna.m7m;
import xsna.mk50;
import xsna.p4f;
import xsna.pzh;
import xsna.tl50;
import xsna.vk50;
import xsna.w8i;
import xsna.wpi;
import xsna.xn50;

/* compiled from: ConnectYClientsReviewsDialog.kt */
/* loaded from: classes18.dex */
public final class c extends tl50<e, i, com.vk.ecomm.reviews.impl.communities.yclients.a> implements w8i {
    public static final /* synthetic */ int j1 = 0;
    public b i1;

    /* compiled from: ConnectYClientsReviewsDialog.kt */
    public static final class a extends wpi {
        public final UserId g;

        public a(Context context, UserId userId) {
            super(context, dig0.b);
            this.g = userId;
            T0();
            P0();
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            c cVar = new c();
            Bundle bundle = new Bundle();
            bundle.putParcelable("COMMUNITY_ID_KEY", this.g);
            cVar.setArguments(bundle);
            return cVar;
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        b bVar = new b(requireContext(), this);
        this.i1 = bVar;
        return new mk50.c(bVar.c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        i iVar = (i) ao50Var;
        b bVar = this.i1;
        if (bVar == null) {
            bVar = null;
        }
        bVar.f(iVar, new ie8(1, this, c.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 5));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((e) vk50Var).h.a(new p4f(this, 9), this);
    }

    @Override // xsna.dw20, androidx.fragment.app.d, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        xn50.a.c(this, a.C1019a.b);
        super.onCancel(dialogInterface);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Parcelable parcelable;
        Object parcelable2;
        pzh v3 = ((ReviewsComponent) ((k7m) m7m.f(this)).a(fpf0.a(ReviewsComponent.class))).v3();
        Bundle requireArguments = requireArguments();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = requireArguments.getParcelable("COMMUNITY_ID_KEY", UserId.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = requireArguments.getParcelable("COMMUNITY_ID_KEY");
            if (!(parcelable3 instanceof UserId)) {
                parcelable3 = null;
            }
            parcelable = (UserId) parcelable3;
        }
        UserId userId = (UserId) parcelable;
        if (userId == null) {
            userId = UserId.d;
        }
        return new e(new g(new k3j(false, false, false)), v3, userId);
    }
}
