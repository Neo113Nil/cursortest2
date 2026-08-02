package com.vk.ecomm.market.album;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.vk.api.generated.market.dto.MarketMarketItemDto;
import com.vk.api.generated.market.dto.MarketSearchResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.Good;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.market.album.MarketEditAlbumCoverFragment;
import com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment;
import com.vk.ecomm.market.album.compose.EditStorefrontAlbumError;
import com.vk.ecomm.market.album.editor.cover.presentation.MarketEditAlbumCoverFragment;
import com.vk.movika.tools.controls.seekbar.w;
import com.vk.toggle.features.SmbFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.VKRecyclerFragment;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.amt;
import xsna.ar;
import xsna.asp;
import xsna.b210;
import xsna.b8;
import xsna.b8v;
import xsna.baf0;
import xsna.bd0;
import xsna.bpn0;
import xsna.bwt0;
import xsna.c2u;
import xsna.c5g;
import xsna.cfz;
import xsna.d02;
import xsna.dhr0;
import xsna.du0;
import xsna.eiz;
import xsna.f2s;
import xsna.ff3;
import xsna.fq1;
import xsna.gb;
import xsna.h03;
import xsna.hg1;
import xsna.hs00;
import xsna.iah0;
import xsna.ikv0;
import xsna.j5g;
import xsna.j8;
import xsna.jai;
import xsna.ju;
import xsna.jx2;
import xsna.ki4;
import xsna.l6u;
import xsna.lxz;
import xsna.myc0;
import xsna.n3t;
import xsna.nef;
import xsna.nex;
import xsna.nwk;
import xsna.oz50;
import xsna.pq;
import xsna.rdi;
import xsna.rpj0;
import xsna.rr00;
import xsna.rsg0;
import xsna.sim;
import xsna.tfx;
import xsna.tx00;
import xsna.uq;
import xsna.ux00;
import xsna.vq;
import xsna.wq;
import xsna.wx00;
import xsna.wzs;
import xsna.xd10;
import xsna.xq;
import xsna.y8m;
import xsna.yb;
import xsna.yd10;
import xsna.yfb;
import xsna.yhu;
import xsna.yku;
import xsna.yx00;
import xsna.zf1;
import xsna.zrp;
import xsna.zx00;

/* compiled from: MarketEditAlbumGoodsFragment.kt */
/* loaded from: classes18.dex */
public final class MarketEditAlbumGoodsFragment extends VKRecyclerFragment<Good> {
    public static final /* synthetic */ int c1 = 0;
    public ComposeView I0;
    public VkSimpleButton J0;
    public VkImage K0;
    public VkText L0;
    public VkText M0;
    public VkImageSimple N0;
    public Group O0;
    public VkTabs P0;
    public VkSearchView Q0;
    public ComposeView R0;
    public boolean S0;
    public io.reactivex.rxjava3.disposables.c T0;
    public final boolean U0;
    public final bpn0 V0;
    public final r W0;
    public String X0;
    public GoodAlbumEditFlowEntity Y0;
    public final tx00 Z0;
    public boolean a1;
    public b b1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketEditAlbumGoodsFragment.kt */
    public static final class b {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b ALL;
        public static final b SELECTED;

        static {
            b bVar = new b("ALL", 0);
            ALL = bVar;
            b bVar2 = new b("SELECTED", 1);
            SELECTED = bVar2;
            b[] bVarArr = {bVar, bVar2};
            $VALUES = bVarArr;
            $ENTRIES = new asp(bVarArr);
        }

        public b() {
            throw null;
        }

        public static zrp<b> h() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* compiled from: MarketEditAlbumGoodsFragment.kt */
    public static final class c extends rpj0<MarketSearchResponseDto> {
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;

        public c(int i, int i2) {
            this.e = i;
            this.f = i2;
        }

        @Override // xsna.hx2
        public final void b(Object obj) {
            List<MarketMarketItemDto> d;
            MarketSearchResponseDto marketSearchResponseDto = (MarketSearchResponseDto) obj;
            if (marketSearchResponseDto == null || (d = marketSearchResponseDto.d()) == null) {
                return;
            }
            ArrayList e = b210.e(d);
            int i = MarketEditAlbumGoodsFragment.c1;
            MarketEditAlbumGoodsFragment.this.Io(e, this.e, this.f, 0);
        }

        @Override // xsna.rpj0, xsna.q76, xsna.hx2
        public final void e(VKApiExecutionException vKApiExecutionException) {
            MarketEditAlbumGoodsFragment.this.onError(vKApiExecutionException);
        }
    }

    public MarketEditAlbumGoodsFragment() {
        super(R.layout.market_edit_album_goods_fragment, 24);
        SmbFeatures smbFeatures = SmbFeatures.FEATURE_SMB_ALBUM_EDITOR_REFACTORING;
        smbFeatures.getClass();
        this.U0 = com.vk.toggle.b.A.a(smbFeatures);
        this.V0 = new bpn0(new nef(this, 18));
        this.W0 = new r(new d());
        this.Z0 = new tx00(new eiz(this, 3), new y8m(8));
        this.b1 = b.ALL;
    }

    public static m1 Jo(UserId userId, int i, List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf((int) ((Number) it.next()).longValue()));
        }
        tfx tfxVar = new tfx("market.setAlbumItems", new pq(12), new j8(15));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "album_id", i, 0, 0, 12);
        tfxVar.i("item_ids", arrayList);
        return rsg0.y0(yfb.x(tfxVar), null, null, 3);
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final void Go(CharSequence charSequence) {
        super.Go(null);
    }

    public final void Io(List<? extends Good> list, int i, int i2, int i3) {
        String str;
        int i4 = i + i2;
        boolean z = false;
        Bo(list, i4 < i3);
        if (this.b1 == b.SELECTED && ((str = this.X0) == null || str.length() == 0)) {
            z = true;
        }
        GoodAlbumEditFlowEntity goodAlbumEditFlowEntity = this.Y0;
        List<Good> list2 = goodAlbumEditFlowEntity != null ? goodAlbumEditFlowEntity.j : null;
        List list3 = this.v0;
        if (z && list2 != null) {
            list3 = j5g.u0(list2, list3);
        }
        GoodAlbumEditFlowEntity goodAlbumEditFlowEntity2 = this.Y0;
        List<Long> list4 = goodAlbumEditFlowEntity2 != null ? goodAlbumEditFlowEntity2.i : null;
        tx00 tx00Var = this.Z0;
        tx00Var.getClass();
        tx00Var.e = rdi.g(list3);
        if (list4 == null) {
            list4 = EmptyList.b;
        }
        tx00Var.f = list4;
        tx00Var.notifyDataSetChanged();
    }

    public final oz50 Ko(GoodAlbumEditFlowEntity goodAlbumEditFlowEntity) {
        if (this.U0) {
            MarketEditAlbumCoverFragment.a aVar = new MarketEditAlbumCoverFragment.a(goodAlbumEditFlowEntity.b);
            aVar.j.putParcelable("album", goodAlbumEditFlowEntity);
            return aVar;
        }
        MarketEditAlbumCoverFragment.a aVar2 = new MarketEditAlbumCoverFragment.a(goodAlbumEditFlowEntity.b);
        aVar2.j.putParcelable("album", goodAlbumEditFlowEntity);
        return aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Lo(GoodAlbumEditFlowEntity goodAlbumEditFlowEntity) {
        String str;
        VkText vkText;
        this.Y0 = goodAlbumEditFlowEntity;
        List<Long> list = goodAlbumEditFlowEntity.i;
        tx00 tx00Var = this.Z0;
        tx00Var.f = list;
        tx00Var.notifyDataSetChanged();
        VkImage vkImage = this.K0;
        VkImage vkImage2 = vkImage == null ? null : vkImage;
        Photo photo = goodAlbumEditFlowEntity.e;
        if (photo != null) {
            if (vkImage == null) {
                vkImage = null;
            }
            int width = vkImage.getWidth();
            VkImage vkImage3 = this.K0;
            if (vkImage3 == null) {
                vkImage3 = null;
            }
            ImageSize Ab = photo.Ab(width, vkImage3.getHeight());
            if (Ab != null) {
                str = Ab.d.d;
                vkImage2.o0(str, null);
                vkText = this.L0;
                if (vkText == null) {
                    vkText = null;
                }
                vkText.setText(goodAlbumEditFlowEntity.c);
                VkText vkText2 = this.M0;
                VkText vkText3 = vkText2 != null ? vkText2 : null;
                Resources resources = getResources();
                int i = goodAlbumEditFlowEntity.f;
                vkText3.setText(resources.getQuantityString(R.plurals.goods_count, i, Integer.valueOf(i)));
            }
        }
        str = null;
        vkImage2.o0(str, null);
        vkText = this.L0;
        if (vkText == null) {
        }
        vkText.setText(goodAlbumEditFlowEntity.c);
        VkText vkText22 = this.M0;
        if (vkText22 != null) {
        }
        Resources resources2 = getResources();
        int i2 = goodAlbumEditFlowEntity.f;
        vkText3.setText(resources2.getQuantityString(R.plurals.goods_count, i2, Integer.valueOf(i2)));
    }

    public final void Mo() {
        ikv0.a aVar = new ikv0.a(requireContext());
        aVar.u = new ikv0.d(new ikv0.d.c(requireContext().getString(R.string.market_album_error_snackbar)), (ikv0.d.b) null, (ikv0.d.a) null, 6);
        aVar.t = ikv0.c.b.a;
        aVar.n();
    }

    public final void No() {
        io.reactivex.rxjava3.disposables.c subscribe;
        GoodAlbumEditFlowEntity goodAlbumEditFlowEntity = this.Y0;
        if (goodAlbumEditFlowEntity != null) {
            boolean z = goodAlbumEditFlowEntity.h;
            boolean z2 = goodAlbumEditFlowEntity.g;
            Photo photo = goodAlbumEditFlowEntity.e;
            Integer num = goodAlbumEditFlowEntity.d;
            if (!this.a1 || num == null) {
                UserId userId = goodAlbumEditFlowEntity.b;
                String str = goodAlbumEditFlowEntity.c;
                Integer valueOf = photo != null ? Integer.valueOf(photo.c) : null;
                tfx tfxVar = new tfx("market.addAlbum", new uq(17), new vq(20));
                tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
                tfx.o(tfxVar, "title", str, 0, 128, 4);
                if (valueOf != null) {
                    tfx.l(tfxVar, "photo_id", valueOf.intValue(), 0, 0, 8);
                }
                tfxVar.j("main_album", z2);
                tfxVar.j("is_hidden", z);
                subscribe = hg1.m(rsg0.y0(yfb.x(tfxVar), null, null, 3).L(new fq1(new ju(10, this, goodAlbumEditFlowEntity), 23), false).L(new cfz(new zf1(17, this, goodAlbumEditFlowEntity), 1), false), requireContext(), 0L, false, 62).subscribe(new b8v(new du0(15, goodAlbumEditFlowEntity, this), 4), new ff3(new hs00(this, 1), 18));
            } else {
                UserId userId2 = goodAlbumEditFlowEntity.b;
                int intValue = num.intValue();
                String str2 = goodAlbumEditFlowEntity.c;
                Integer valueOf2 = photo != null ? Integer.valueOf(photo.c) : null;
                tfx tfxVar2 = new tfx("market.editAlbum", new wq(21), new xq(21));
                tfx.n(tfxVar2, "owner_id", userId2, 0L, 0L, 12);
                tfx.l(tfxVar2, "album_id", intValue, 0, 0, 8);
                tfx.o(tfxVar2, "title", str2, 0, 128, 4);
                if (valueOf2 != null) {
                    tfx.l(tfxVar2, "photo_id", valueOf2.intValue(), 0, 0, 8);
                }
                tfxVar2.j("main_album", z2);
                tfxVar2.j("is_hidden", z);
                subscribe = hg1.m(rsg0.y0(yfb.x(tfxVar2), null, null, 3).L(new b8(new ki4(this, goodAlbumEditFlowEntity, num, 4), 29), false), requireContext(), 0L, false, 62).subscribe(new nex(new gb(19, this, goodAlbumEditFlowEntity), 2), new wx00(new yhu(this, 5), 0));
            }
            this.i0 = subscribe;
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        if (this.a1) {
            rr00.a(requireContext(), new sim(this, 17));
            return true;
        }
        GoodAlbumEditFlowEntity goodAlbumEditFlowEntity = this.Y0;
        if (goodAlbumEditFlowEntity != null) {
            Ko(goodAlbumEditFlowEntity).l(this);
        }
        finish();
        return true;
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment, me.grishka.appkit.fragments.LoaderFragment, androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void h() {
        io.reactivex.rxjava3.disposables.c cVar = this.i0;
        if (cVar != null) {
            cVar.dispose();
        }
        super.h();
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment
    public final void no(View view, Throwable th) {
        ((ComposeView) view).setContent(new jai(-1992274093, new yku(3, ((th instanceof VKApiExecutionException) && h03.a(th)) ? EditStorefrontAlbumError.Internet : EditStorefrontAlbumError.Server, this), true));
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        GoodAlbumEditFlowEntity goodAlbumEditFlowEntity;
        if ((i != 16 && i != 20) || intent == null || (goodAlbumEditFlowEntity = (GoodAlbumEditFlowEntity) intent.getParcelableExtra("album")) == null) {
            return;
        }
        Lo(goodAlbumEditFlowEntity);
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.I0 = (ComposeView) onCreateView.findViewById(R.id.market_edit_album_top_bar_compose_view);
        this.J0 = (VkSimpleButton) onCreateView.findViewById(R.id.market_edit_album_save_button);
        this.L0 = (VkText) onCreateView.findViewById(R.id.market_album_edit_main_title_text);
        this.M0 = (VkText) onCreateView.findViewById(R.id.market_album_edit_main_prod_count_text);
        this.N0 = (VkImageSimple) onCreateView.findViewById(R.id.market_album_edit_main_edit_button);
        this.K0 = (VkImage) onCreateView.findViewById(R.id.market_album_edit_main_cover_image);
        this.O0 = (Group) onCreateView.findViewById(R.id.market_album_edit_main_group);
        VkTabs vkTabs = (VkTabs) onCreateView.findViewById(R.id.market_edit_album_tabs);
        VkTabs.c g = vkTabs.g();
        g.a.Y4(requireContext().getResources().getString(R.string.market_edit_album_tab_all_goods), null);
        vkTabs.b(g, true);
        VkTabs.c g2 = vkTabs.g();
        g2.a.Y4(requireContext().getResources().getString(R.string.market_edit_album_tab_selected_goods), null);
        vkTabs.b(g2, true);
        this.P0 = vkTabs;
        VkSearchView vkSearchView = (VkSearchView) onCreateView.findViewById(R.id.search_view);
        this.Q0 = vkSearchView;
        vkSearchView.X4(false);
        ComposeView composeView = (ComposeView) onCreateView.findViewById(R.id.market_edit_album_empty_compose_view);
        this.R0 = composeView;
        this.n0.setEmptyView(composeView);
        return onCreateView;
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment, me.grishka.appkit.fragments.LoaderFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        io.reactivex.rxjava3.disposables.c cVar = this.T0;
        if (cVar != null) {
            cVar.dispose();
        }
        super.onDestroyView();
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment, me.grishka.appkit.fragments.LoaderFragment, xsna.cbs
    public final void onError(Throwable th) {
        bwt0.p0(this.o0, false);
        super.onError(th);
    }

    @Override // com.vkontakte.android.fragments.VKRecyclerFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.a1 = requireArguments().getInt("album_id", -1) != -1;
        ComposeView composeView = this.I0;
        if (composeView == null) {
            composeView = null;
        }
        composeView.setContent(new jai(1387429150, new w(this, 11), true));
        Group group = this.O0;
        if (group == null) {
            group = null;
        }
        bwt0.p0(group, this.a1);
        if (this.a1) {
            VkImageSimple vkImageSimple = this.N0;
            if (vkImageSimple == null) {
                vkImageSimple = null;
            }
            vkImageSimple.setOnClickListener(new bd0(this, 8));
            baf0 x = dhr0.x(R.drawable.ic_goods_collection_56_placeholder_bordered_rounded_8, R.attr.vk_ui_image_placeholder, requireContext());
            VkImage vkImage = this.K0;
            if (vkImage == null) {
                vkImage = null;
            }
            vkImage.setCornerRadius(iah0.b(8.0f));
            VkImage vkImage2 = this.K0;
            if (vkImage2 == null) {
                vkImage2 = null;
            }
            vkImage2.setPlaceholderImage(x);
        }
        VkTabs vkTabs = this.P0;
        if (vkTabs == null) {
            vkTabs = null;
        }
        vkTabs.a(new com.vk.ecomm.market.album.a(this));
        VkSimpleButton vkSimpleButton = this.J0;
        if (vkSimpleButton == null) {
            vkSimpleButton = null;
        }
        vkSimpleButton.setOnClickListener(new yb(this, 7));
        VkSimpleButton vkSimpleButton2 = this.J0;
        if (vkSimpleButton2 == null) {
            vkSimpleButton2 = null;
        }
        bwt0.p0(vkSimpleButton2, !this.a1);
        this.n0.setHasFixedSize(true);
        if (this.b1 == b.SELECTED) {
            this.W0.l(this.n0);
        }
        VkSearchView vkSearchView = this.Q0;
        if (vkSearchView == null) {
            vkSearchView = null;
        }
        this.T0 = d02.y(vkSearchView, 300L, 2).subscribe(new amt(new lxz(this, 2), 5));
        VkSearchView vkSearchView2 = this.Q0;
        if (vkSearchView2 == null) {
            vkSearchView2 = null;
        }
        vkSearchView2.setOnActionClearListener(new nwk(this, 16));
        GoodAlbumEditFlowEntity goodAlbumEditFlowEntity = (GoodAlbumEditFlowEntity) requireArguments().getParcelable("album");
        if (goodAlbumEditFlowEntity != null) {
            Lo(goodAlbumEditFlowEntity);
            qo();
            return;
        }
        UserId userId = (UserId) requireArguments().getParcelable("owner_id");
        int i = requireArguments().getInt("album_id", -1);
        l6u l6uVar = new l6u(this, 9);
        List singletonList = Collections.singletonList(Integer.valueOf(i));
        tfx tfxVar = new tfx("market.getAlbumById", new com.vk.movika.sdk.android.defaultplayer.interactive.c(17), new ar(20));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfxVar.i("album_ids", singletonList);
        tfxVar.j("need_all_item_ids", true);
        int i2 = 8;
        this.i0 = hg1.m(rsg0.y0(yfb.x(tfxVar), null, null, 3), requireContext(), 0L, false, 62).subscribe(new n3t(new f2s(l6uVar, 17), i2), new ux00(new c2u(this, i2), 0));
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final void vo(int i, int i2) {
        Integer num;
        ComposeView composeView = this.R0;
        Integer num2 = null;
        if (composeView == null) {
            composeView = null;
        }
        bwt0.p0(composeView, false);
        final boolean z = this.b1 == b.ALL || myc0.f(this.X0);
        ComposeView composeView2 = this.R0;
        if (composeView2 == null) {
            composeView2 = null;
        }
        composeView2.setContent(new jai(-687916224, new wzs() { // from class: xsna.vx00
            @Override // xsna.wzs
            public final Object invoke(Object obj, Object obj2) {
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                int i3 = MarketEditAlbumGoodsFragment.c1;
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-687916224, intValue, -1, "com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment.setEmptyView.<anonymous> (MarketEditAlbumGoodsFragment.kt:466)");
                    }
                    final boolean z2 = z;
                    rrv0.d(null, null, null, null, kai.c(1405812091, new wzs() { // from class: xsna.xx00
                        @Override // xsna.wzs
                        public final Object invoke(Object obj3, Object obj4) {
                            androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                            int intValue2 = ((Integer) obj4).intValue();
                            int i4 = MarketEditAlbumGoodsFragment.c1;
                            if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1405812091, intValue2, -1, "com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment.setEmptyView.<anonymous>.<anonymous> (MarketEditAlbumGoodsFragment.kt:467)");
                                }
                                i1p.a(0, aVar2, null, z2);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                            } else {
                                aVar2.h();
                            }
                            return s3q0.a;
                        }
                    }, aVar), aVar, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            }
        }, true));
        String str = this.X0;
        if (str != null && str.length() != 0) {
            if (this.S0) {
                this.i0 = new jx2(yfb.x(xd10.p(new yd10(), (UserId) requireArguments().getParcelable("owner_id"), this.X0, null, null, null, 8186)), new c(i, i2)).a();
                return;
            }
            return;
        }
        if (this.b1 == b.SELECTED) {
            GoodAlbumEditFlowEntity goodAlbumEditFlowEntity = this.Y0;
            num2 = Integer.valueOf((goodAlbumEditFlowEntity == null || (num = goodAlbumEditFlowEntity.d) == null) ? requireArguments().getInt("album_id", -1) : num.intValue());
        }
        Integer num3 = num2;
        if (num3 != null && num3.intValue() == -1) {
            Io(EmptyList.b, i, i2, 0);
        } else {
            this.i0 = new jx2(yfb.x(xd10.A(new yd10(), (UserId) requireArguments().getParcelable("owner_id"), num3, Integer.valueOf(i2), Integer.valueOf(i), null, 1008)), new zx00(new yx00(this, i, i2), this)).a();
        }
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final RecyclerView.Adapter wo() {
        return this.Z0;
    }

    /* compiled from: MarketEditAlbumGoodsFragment.kt */
    public static final class a extends oz50 {
        public a(GoodAlbumEditFlowEntity goodAlbumEditFlowEntity) {
            this(goodAlbumEditFlowEntity.b, goodAlbumEditFlowEntity.d);
            this.j.putParcelable("album", goodAlbumEditFlowEntity);
        }

        public a(UserId userId, Integer num) {
            super(MarketEditAlbumGoodsFragment.class, null, null);
            this.j.putParcelable("owner_id", userId);
            if (num != null) {
                this.j.putInt("album_id", num.intValue());
            }
        }
    }

    /* compiled from: MarketEditAlbumGoodsFragment.kt */
    public static final class d extends r.g {
        public d() {
            super(3, 0);
        }

        @Override // androidx.recyclerview.widget.r.d
        public final boolean n(RecyclerView recyclerView, RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2) {
            int adapterPosition = e0Var.getAdapterPosition();
            int adapterPosition2 = e0Var2.getAdapterPosition();
            tx00 tx00Var = MarketEditAlbumGoodsFragment.this.Z0;
            List<Good> list = tx00Var.e;
            list.add(adapterPosition2, list.remove(adapterPosition));
            tx00Var.notifyItemMoved(adapterPosition, adapterPosition2);
            return true;
        }

        @Override // androidx.recyclerview.widget.r.d
        public final void o(RecyclerView.e0 e0Var, int i) {
            boolean z = i != 2;
            int i2 = MarketEditAlbumGoodsFragment.c1;
            MarketEditAlbumGoodsFragment.this.Ho(z);
        }

        @Override // androidx.recyclerview.widget.r.d
        public final void p(RecyclerView.e0 e0Var) {
        }
    }
}
