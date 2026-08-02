package com.vk.search.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.core.fragments.BaseFragment;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.dto.common.data.VKList;
import com.vk.dto.user.UserProfile;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.lists.c;
import com.vk.search.models.VkRelation;
import com.vk.search.params.api.VkPeopleSearchParams;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.subjects.f;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.sdk.SharedKt;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.a960;
import xsna.ag20;
import xsna.bpn0;
import xsna.d02;
import xsna.dc20;
import xsna.dxh0;
import xsna.ecg0;
import xsna.eyh0;
import xsna.fyh0;
import xsna.gs00;
import xsna.gz30;
import xsna.hvt0;
import xsna.iah0;
import xsna.ies;
import xsna.izs;
import xsna.jq;
import xsna.k130;
import xsna.ln20;
import xsna.lq;
import xsna.m5y;
import xsna.mhy;
import xsna.mqe0;
import xsna.mru0;
import xsna.msy;
import xsna.n240;
import xsna.nex;
import xsna.nv90;
import xsna.o8;
import xsna.oz50;
import xsna.pq;
import xsna.px30;
import xsna.q6h;
import xsna.qea0;
import xsna.rf20;
import xsna.rsg0;
import xsna.s3q0;
import xsna.svz;
import xsna.tj2;
import xsna.w2o0;
import xsna.w8i;
import xsna.wq20;
import xsna.xsh0;
import xsna.xut0;
import xsna.ysg0;
import xsna.zif0;
import xsna.zoj0;

/* compiled from: RestoreSearchFragment.kt */
/* loaded from: classes5.dex */
public final class RestoreSearchFragment extends BaseFragment implements ies, c.l<VKList<zif0>>, w8i {
    public static final /* synthetic */ int h0 = 0;
    public final Object S;
    public final Object T;
    public VkSearchView U;
    public RecyclerPaginatedView V;
    public View W;
    public TextView X;
    public View Y;
    public xut0 Z;
    public b a0;
    public c b0;
    public io.reactivex.rxjava3.disposables.c c0;
    public String d0;
    public final VkPeopleSearchParams e0;
    public String f0;
    public final bpn0 g0;

    /* compiled from: RestoreSearchFragment.kt */
    public static final class a extends oz50 {
        public a(String str) {
            super(RestoreSearchFragment.class, null, null);
            this.j.putString(SharedKt.PARAM_ACCESS_TOKEN, str);
        }
    }

    /* compiled from: RestoreSearchFragment.kt */
    public final class b extends zoj0<zif0, RecyclerView.e0> {

        /* compiled from: RestoreSearchFragment.kt */
        public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<UserProfile, s3q0> {
            @Override // xsna.izs
            public final s3q0 invoke(UserProfile userProfile) {
                RestoreSearchFragment restoreSearchFragment = (RestoreSearchFragment) this.receiver;
                int i = RestoreSearchFragment.h0;
                restoreSearchFragment.getClass();
                Intent intent = new Intent();
                intent.putExtra("user_id", userProfile.c);
                restoreSearchFragment.Mf(-1, intent);
                return s3q0.a;
            }
        }

        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i) {
            return ((zif0) this.c.c(i)).b();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
            zif0 zif0Var = (zif0) this.c.c(i);
            if (e0Var instanceof eyh0) {
                ((eyh0) e0Var).V5(((fyh0) zif0Var).a);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 0) {
                return new eyh0(viewGroup, new a(1, RestoreSearchFragment.this, RestoreSearchFragment.class, "handleUserProfileClick", "handleUserProfileClick(Lcom/vk/dto/user/UserProfile;)V", 0));
            }
            throw new IllegalStateException("Unsupported view type");
        }
    }

    public RestoreSearchFragment() {
        tj2 tj2Var = new tj2(20);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.S = msy.a(lazyThreadSafetyMode, tj2Var);
        this.T = msy.a(lazyThreadSafetyMode, new ag20(this, 27));
        this.d0 = "";
        this.e0 = new VkPeopleSearchParams();
        this.g0 = new bpn0(new rf20(this, 22));
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final int Pn() {
        return 48;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        String query;
        VkPeopleSearchParams vkPeopleSearchParams = this.e0;
        if (vkPeopleSearchParams.I()) {
            VkSearchView vkSearchView = this.U;
            query = vkSearchView != null ? vkSearchView.getQuery() : null;
            if (query == null || query.length() == 0) {
                return false;
            }
            VkSearchView vkSearchView2 = this.U;
            if (vkSearchView2 != null) {
                vkSearchView2.setQuery("");
            }
            return true;
        }
        vkPeopleSearchParams.reset();
        VkSearchView vkSearchView3 = this.U;
        query = vkSearchView3 != null ? vkSearchView3.getQuery() : null;
        if (query == null || query.length() == 0) {
            ysg0<Object> ysg0Var = ysg0.b;
            ysg0.b.a(new mru0(vkPeopleSearchParams, true));
        } else {
            VkSearchView vkSearchView4 = this.U;
            if (vkSearchView4 != null) {
                vkSearchView4.setQuery("");
            }
            ysg0<Object> ysg0Var2 = ysg0.b;
            ysg0.b.a(new mru0(vkPeopleSearchParams, false));
        }
        return true;
    }

    @Override // com.vk.lists.c.k
    public final q<VKList<zif0>> hj(c cVar, boolean z) {
        return ui(0, cVar);
    }

    public final void io(String str, boolean z) {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        if (z) {
            xut0 xut0Var = this.Z;
            if (xut0Var != null) {
                xut0Var.a(true);
            }
            RecyclerPaginatedView recyclerPaginatedView = this.V;
            if (recyclerPaginatedView == null || (recyclerView2 = recyclerPaginatedView.getRecyclerView()) == null) {
                return;
            }
            float f = 8;
            recyclerView2.setPadding(0, iah0.a(f), 0, iah0.a(f));
            return;
        }
        TextView textView = this.X;
        if (textView != null) {
            textView.setText(str);
        }
        xut0 xut0Var2 = this.Z;
        if (xut0Var2 != null) {
            xut0Var2.b();
        }
        RecyclerPaginatedView recyclerPaginatedView2 = this.V;
        if (recyclerPaginatedView2 == null || (recyclerView = recyclerPaginatedView2.getRecyclerView()) == null) {
            return;
        }
        recyclerView.setPadding(0, iah0.a(8), 0, iah0.a(64));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    public final void jo() {
        VkSearchView vkSearchView = this.U;
        if (vkSearchView != null) {
            vkSearchView.d0();
        }
        boolean booleanValue = ((Boolean) this.S.getValue()).booleanValue();
        VkPeopleSearchParams vkPeopleSearchParams = this.e0;
        if (booleanValue) {
            ((xsh0) this.T.getValue()).a(requireContext(), getChildFragmentManager(), vkPeopleSearchParams.copy());
        } else {
            new dxh0(kn(), new nv90(vkPeopleSearchParams.copy(), kn())).a(getChildFragmentManager());
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f0 = requireArguments().getString(SharedKt.PARAM_ACCESS_TOKEN, "");
        f<Object> fVar = ysg0.b.a;
        pq pqVar = new pq(17);
        fVar.getClass();
        eo(new i0(fVar, pqVar).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new n240(this, 15)));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.vk_recover_search, viewGroup, false);
        RecyclerPaginatedView recyclerPaginatedView = (RecyclerPaginatedView) inflate.findViewById(R.id.rv_search);
        this.V = recyclerPaginatedView;
        AbstractPaginatedView.LayoutType layoutType = AbstractPaginatedView.LayoutType.LINEAR;
        recyclerPaginatedView.getClass();
        new AbstractPaginatedView.d(layoutType, recyclerPaginatedView).a();
        b bVar = new b();
        this.a0 = bVar;
        recyclerPaginatedView.setAdapter(bVar);
        float f = 8;
        recyclerPaginatedView.getRecyclerView().setPadding(0, iah0.a(f), 0, iah0.a(f));
        RecyclerView recyclerView = recyclerPaginatedView.getRecyclerView();
        if (recyclerView != null) {
            recyclerView.setClipToPadding(false);
        }
        RecyclerView recyclerView2 = recyclerPaginatedView.getRecyclerView();
        if (recyclerView2 != null) {
            recyclerView2.addOnScrollListener(new ecg0());
        }
        c.h hVar = new c.h(this);
        hVar.i = 30;
        hVar.p = 300L;
        this.b0 = com.vk.lists.f.a(hVar, recyclerPaginatedView);
        VkSearchView vkSearchView = (VkSearchView) inflate.findViewById(R.id.search);
        this.U = vkSearchView;
        eo(d02.y(vkSearchView, 200L, 2).a0(io.reactivex.rxjava3.android.schedulers.a.b()).U(new gs00(new gz30(14), 7)).subscribe(new k130(new o8(1, this, RestoreSearchFragment.class, "updateQuery", "updateQuery(Ljava/lang/String;)V", 0, 9), 18)));
        vkSearchView.setVoiceInputEnabled(true);
        vkSearchView.setSecondaryActionListener(new mqe0(this, 2));
        vkSearchView.j5(w2o0.a.a(R.drawable.vk_icon_filter_24, R.string.talkback_ic_search_params));
        vkSearchView.h5(true, !this.e0.I());
        vkSearchView.a5();
        vkSearchView.setOnBackClickListener(new ln20(this, 25));
        ysg0<Object> ysg0Var = ysg0.b;
        f<Object> fVar = ysg0Var.a;
        jq jqVar = new jq(29);
        fVar.getClass();
        eo(new i0(fVar, jqVar).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new nex(vkSearchView, 18)));
        f<Object> fVar2 = ysg0Var.a;
        lq lqVar = new lq(26);
        fVar2.getClass();
        eo(new i0(fVar2, lqVar).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new dc20(1, this, vkSearchView)));
        this.W = hvt0.a(R.id.ll_bottom_parameters_container, inflate, new wq20(this, 23));
        this.Y = hvt0.a(R.id.iv_close, inflate, new px30(this, 29));
        this.X = (TextView) inflate.findViewById(R.id.tv_subtitle);
        View view = this.W;
        if (view != null) {
            view.setVisibility(8);
        }
        this.Z = new xut0(this.W);
        mhy.h(getActivity());
        return inflate;
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.U = null;
        super.onDestroyView();
    }

    @Override // com.vk.lists.c.l
    public final q<VKList<zif0>> ui(int i, c cVar) {
        String str = this.d0;
        int k = cVar.k();
        qea0 qea0Var = new qea0("users.search");
        if (str != null && str.length() > 0) {
            qea0Var.K(CampaignEx.JSON_KEY_AD_Q, str);
        }
        qea0Var.C(k, SignalingProtocol.KEY_LIMIT);
        qea0Var.C(i, SignalingProtocol.KEY_OFFSET);
        qea0Var.C(1, "func_v");
        qea0Var.K("fields", "name,screen_name,photo_base,verified,online_info,trending,city,is_nft");
        qea0Var.K("screen_ref", "restore");
        VkPeopleSearchParams vkPeopleSearchParams = this.e0;
        if (vkPeopleSearchParams != null) {
            if (vkPeopleSearchParams.d() > 0) {
                qea0Var.C(vkPeopleSearchParams.d(), "city_id");
            }
            qea0Var.C(vkPeopleSearchParams.c, "sex");
            int i2 = vkPeopleSearchParams.d;
            if (i2 > 0) {
                qea0Var.C(i2, "age_from");
            }
            int i3 = vkPeopleSearchParams.e;
            if (i3 > 0) {
                qea0Var.C(i3, "age_to");
            }
            VkRelation vkRelation = vkPeopleSearchParams.f;
            if (vkRelation != VkPeopleSearchParams.i) {
                qea0Var.C(vkRelation.id, "status");
            }
        }
        String str2 = this.f0;
        if (str2 == null) {
            str2 = null;
        }
        qea0Var.l = str2;
        qea0Var.m = null;
        return rsg0.y0(qea0Var, null, null, 3);
    }

    @Override // com.vk.lists.c.k
    public final void wd(q<VKList<zif0>> qVar, boolean z, c cVar) {
        io.reactivex.rxjava3.disposables.c subscribe = qVar.subscribe(new m5y(new q6h(z, this, cVar, 2), 23), new a960(new svz(22), 16));
        eo(subscribe);
        this.c0 = subscribe;
    }
}
