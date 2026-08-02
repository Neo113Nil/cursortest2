package com.vk.profile.community.details.impl.contacts;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.vk.dto.common.id.UserId;
import com.vk.profile.community.details.api.CommunityAddContactsParams;
import com.vk.profile.community.details.impl.contacts.CommunityAddContactsState;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.a470;
import xsna.ao50;
import xsna.cn70;
import xsna.dw20;
import xsna.eqg;
import xsna.gzs;
import xsna.i37;
import xsna.km50;
import xsna.mfc;
import xsna.mk50;
import xsna.msy;
import xsna.ncg;
import xsna.ng1;
import xsna.q69;
import xsna.qu;
import xsna.s3q0;
import xsna.tl50;
import xsna.tzp0;
import xsna.vk50;
import xsna.vq;
import xsna.xy80;
import xsna.yfb;

/* compiled from: CommunityAddContactsBottomSheet.kt */
/* loaded from: classes5.dex */
public final class b extends tl50<c, eqg, com.vk.profile.community.details.impl.contacts.a> {
    public static final /* synthetic */ int m1 = 0;
    public final gzs<s3q0> i1;
    public h j1;
    public xy80 k1;
    public final Object l1;

    /* compiled from: CommunityAddContactsBottomSheet.kt */
    public static final class a extends dw20.b {
        public final CommunityAddContactsParams e;
        public final UserId f;
        public final String g;
        public final ng1 h;

        public a(Context context, CommunityAddContactsParams communityAddContactsParams, UserId userId, String str, ng1 ng1Var) {
            super(context, tzp0.a(null, 3));
            this.e = communityAddContactsParams;
            this.f = userId;
            this.g = str;
            this.h = ng1Var;
            c(new a470());
            this.d.C1 = true;
            B(cn70.c(12), true, false);
            x(0);
            w0(context.getString(R.string.community_add_contacts_bs_title));
            t();
            w();
            K();
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            b bVar = new b(this.h);
            Bundle a = yfb.a();
            a.putParcelable("arg_community_id", this.f);
            a.putParcelable("arg_params", this.e);
            a.putString("arg_source", this.g);
            bVar.setArguments(a);
            return bVar;
        }
    }

    public b() {
        this(null);
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        h hVar = new h(requireContext(), this);
        vq.b(-1, -1, hVar.d);
        this.j1 = hVar;
        return new mk50.c(hVar.c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        eqg eqgVar = (eqg) ao50Var;
        h hVar = this.j1;
        if (hVar == null) {
            hVar = null;
        }
        hVar.f(eqgVar, new i37(1, this, b.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 4));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((c) vk50Var).g.a(new q69(1, this, b.class, "dispatchSideEffect", "dispatchSideEffect(Lcom/vk/profile/community/details/impl/contacts/CommunityAddContactsSideEffect;)V", 0, 2), this);
        getParentFragmentManager().l0("city_dialog_request_key", this, ((mfc) this.l1.getValue()).a(new qu(this, 24)));
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        xy80 xy80Var = this.k1;
        if (xy80Var != null) {
            xy80Var.i();
        }
        xy80 xy80Var2 = this.k1;
        if (xy80Var2 != null) {
            xy80Var2.g();
        }
        super.onDestroyView();
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        CommunityAddContactsParams communityAddContactsParams;
        Parcelable parcelable;
        Object parcelable2;
        Parcelable parcelable3;
        Object parcelable4;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable4 = arguments.getParcelable("arg_params", CommunityAddContactsParams.class);
                parcelable3 = (Parcelable) parcelable4;
            } else {
                Parcelable parcelable5 = arguments.getParcelable("arg_params");
                if (!(parcelable5 instanceof CommunityAddContactsParams)) {
                    parcelable5 = null;
                }
                parcelable3 = (CommunityAddContactsParams) parcelable5;
            }
            communityAddContactsParams = (CommunityAddContactsParams) parcelable3;
        } else {
            communityAddContactsParams = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments2.getParcelable("arg_community_id", UserId.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable6 = arguments2.getParcelable("arg_community_id");
                if (!(parcelable6 instanceof UserId)) {
                    parcelable6 = null;
                }
                parcelable = (UserId) parcelable6;
            }
            UserId userId = (UserId) parcelable;
            if (userId != null) {
                Bundle arguments3 = getArguments();
                String string = arguments3 != null ? arguments3.getString("arg_source") : null;
                String str = communityAddContactsParams != null ? communityAddContactsParams.c : null;
                Integer num = communityAddContactsParams != null ? communityAddContactsParams.b : null;
                return new c((str == null || num == null) ? null : new CommunityAddContactsState.a(str, num.intValue()), communityAddContactsParams != null ? communityAddContactsParams.d : null, communityAddContactsParams != null ? communityAddContactsParams.e : null, communityAddContactsParams != null ? communityAddContactsParams.f : null, userId, string);
            }
        }
        throw new IllegalArgumentException("'communityId' must be not null");
    }

    @Override // xsna.tl50, xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        xy80 xy80Var = new xy80(getActivity());
        this.k1 = xy80Var;
        xy80Var.f();
        return super.yn(bundle);
    }

    public b(ng1 ng1Var) {
        this.i1 = ng1Var;
        this.l1 = msy.a(LazyThreadSafetyMode.NONE, new ncg(this, 2));
    }
}
