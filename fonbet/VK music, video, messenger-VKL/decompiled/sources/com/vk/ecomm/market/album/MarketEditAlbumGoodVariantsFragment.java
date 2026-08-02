package com.vk.ecomm.market.album;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.market.dto.MarketGetByIdResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.Good;
import com.vk.dto.market.GoodVariantItem;
import com.vk.ecomm.market.album.compose.EditStorefrontAlbumError;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.VKRecyclerFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import xsna.b210;
import xsna.c5g;
import xsna.ebx;
import xsna.f4m;
import xsna.h03;
import xsna.hx2;
import xsna.jai;
import xsna.jkg;
import xsna.jx2;
import xsna.ljf;
import xsna.oz50;
import xsna.rdi;
import xsna.s3q0;
import xsna.sx00;
import xsna.tx00;
import xsna.x8m;
import xsna.xd10;
import xsna.yd10;
import xsna.yfb;

/* compiled from: MarketEditAlbumGoodVariantsFragment.kt */
/* loaded from: classes18.dex */
public final class MarketEditAlbumGoodVariantsFragment extends VKRecyclerFragment<Good> {
    public static final /* synthetic */ int M0 = 0;
    public ComposeView I0;
    public Good J0;
    public GoodAlbumEditFlowEntity K0;
    public final tx00 L0;

    /* compiled from: MarketEditAlbumGoodVariantsFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: MarketEditAlbumGoodVariantsFragment.kt */
    public static final class b implements hx2<MarketGetByIdResponseDto> {
        public b() {
        }

        @Override // xsna.hx2
        public final void b(MarketGetByIdResponseDto marketGetByIdResponseDto) {
            MarketGetByIdResponseDto marketGetByIdResponseDto2 = marketGetByIdResponseDto;
            ArrayList e = b210.e(marketGetByIdResponseDto2.d());
            MarketEditAlbumGoodVariantsFragment marketEditAlbumGoodVariantsFragment = MarketEditAlbumGoodVariantsFragment.this;
            tx00 tx00Var = marketEditAlbumGoodVariantsFragment.L0;
            GoodAlbumEditFlowEntity goodAlbumEditFlowEntity = marketEditAlbumGoodVariantsFragment.K0;
            if (goodAlbumEditFlowEntity == null) {
                goodAlbumEditFlowEntity = null;
            }
            List<Long> list = goodAlbumEditFlowEntity.i;
            tx00Var.getClass();
            tx00Var.e = rdi.g(e);
            if (list == null) {
                list = EmptyList.b;
            }
            tx00Var.f = list;
            tx00Var.notifyDataSetChanged();
            marketEditAlbumGoodVariantsFragment.Bo(e, e.size() > marketGetByIdResponseDto2.getCount());
        }

        @Override // xsna.hx2
        public final void e(VKApiExecutionException vKApiExecutionException) {
            MarketEditAlbumGoodVariantsFragment.this.onError(vKApiExecutionException);
        }
    }

    public MarketEditAlbumGoodVariantsFragment() {
        super(R.layout.market_edit_album_good_variants_fragment, 24);
        this.L0 = new tx00(new ebx(this, 3), new x8m(15));
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        Intent intent = new Intent();
        GoodAlbumEditFlowEntity goodAlbumEditFlowEntity = this.K0;
        if (goodAlbumEditFlowEntity == null) {
            goodAlbumEditFlowEntity = null;
        }
        intent.putExtra("album", goodAlbumEditFlowEntity);
        s3q0 s3q0Var = s3q0.a;
        Mf(-1, intent);
        return true;
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment
    public final void no(View view, Throwable th) {
        ((ComposeView) view).setContent(new jai(1684975421, new ljf(3, ((th instanceof VKApiExecutionException) && h03.a(th)) ? EditStorefrontAlbumError.Internet : EditStorefrontAlbumError.Server, this), true));
    }

    @Override // com.vkontakte.android.fragments.VKRecyclerFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.I0 = (ComposeView) view.findViewById(R.id.market_edit_album_variants_top_bar_compose_view);
        Good good = (Good) requireArguments().getParcelable(DatabaseHelper.ITEM_COLUMN_NAME);
        if (good == null) {
            good = Good.zb().a();
        }
        this.J0 = good;
        this.K0 = (GoodAlbumEditFlowEntity) requireArguments().getParcelable("album");
        Toolbar toolbar = this.Q;
        if (toolbar != null) {
            f4m.j(toolbar);
        }
        ComposeView composeView = this.I0;
        if (composeView == null) {
            composeView = null;
        }
        composeView.setContent(new jai(-938145391, new jkg(this, 7), true));
        qo();
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final void vo(int i, int i2) {
        yd10 yd10Var = new yd10();
        Good good = this.J0;
        if (good == null) {
            good = null;
        }
        List<GoodVariantItem> list = good.u;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (GoodVariantItem goodVariantItem : list) {
            StringBuilder sb = new StringBuilder();
            Good good2 = this.J0;
            if (good2 == null) {
                good2 = null;
            }
            sb.append(good2.c);
            sb.append('_');
            sb.append(goodVariantItem.b);
            arrayList.add(sb.toString());
        }
        this.i0 = new jx2(yfb.x(xd10.j(yd10Var, arrayList, 14)), new b()).a();
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment
    public final RecyclerView.Adapter<sx00> wo() {
        return this.L0;
    }
}
