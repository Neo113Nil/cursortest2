package com.vk.ecomm.catalog.impl.catalog.simple;

import android.view.View;
import com.vk.api.generated.market.dto.MarketProfileInfoDto;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionMarketOptions;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import xsna.f4m;
import xsna.fpf0;
import xsna.jd4;
import xsna.k7m;
import xsna.m7m;
import xsna.maz;
import xsna.q9h;
import xsna.qt00;
import xsna.s3q0;
import xsna.w8i;
import xsna.wfc;
import xsna.wzs;
import xsna.yfc;

/* compiled from: MarketSimpleAppBarButtonsHolder.kt */
/* loaded from: classes18.dex */
public final class b implements w8i {
    public final View b;
    public final maz c;
    public final View d;
    public final View e;
    public final View f;
    public final View g;
    public final View h;
    public final qt00 i;
    public final q9h j;
    public final qt00 k;
    public final qt00 l;

    /* compiled from: MarketSimpleAppBarButtonsHolder.kt */
    public static final class a {
        public final UIBlockActionMarketOptions a;

        public a(UIBlockActionMarketOptions uIBlockActionMarketOptions) {
            this.a = uIBlockActionMarketOptions;
        }
    }

    /* compiled from: MarketSimpleAppBarButtonsHolder.kt */
    /* renamed from: com.vk.ecomm.catalog.impl.catalog.simple.b$b, reason: collision with other inner class name */
    public static final class C0929b {
        public final yfc a;
        public final List<Pair<String, Integer>> b;
        public final MarketProfileInfoDto c;
        public final wzs<String, Integer, s3q0> d;
        public final wfc e;
        public final ArrayList f;

        public C0929b(yfc yfcVar, List list, MarketProfileInfoDto marketProfileInfoDto, jd4 jd4Var, wfc wfcVar, ArrayList arrayList) {
            this.a = yfcVar;
            this.b = list;
            this.c = marketProfileInfoDto;
            this.d = jd4Var;
            this.e = wfcVar;
            this.f = arrayList;
        }
    }

    public b(View view, maz mazVar) {
        this.b = view;
        this.c = mazVar;
        View findViewById = view.findViewById(R.id.button_search);
        this.d = findViewById;
        View findViewById2 = view.findViewById(R.id.button_album_edit);
        this.e = findViewById2;
        View findViewById3 = view.findViewById(R.id.button_cart);
        this.f = findViewById3;
        View findViewById4 = view.findViewById(R.id.button_bookmark);
        this.g = findViewById4;
        View findViewById5 = view.findViewById(R.id.button_share);
        this.h = findViewById5;
        this.j = ((MarketComponent) ((k7m) m7m.f(this)).a(fpf0.a(MarketComponent.class))).C3();
        qt00 qt00Var = new qt00(R.drawable.vk_icon_shopping_cart_outline_28, R.string.classifieds_carts, findViewById3, null);
        this.k = qt00Var;
        qt00 qt00Var2 = new qt00(R.drawable.vk_icon_bookmark_outline_28, R.string.classifieds_catalog_menu_bookmarks, findViewById4, null);
        this.l = qt00Var2;
        qt00 qt00Var3 = new qt00(R.drawable.vk_icon_share_outline_28, R.string.share, findViewById5, null);
        this.i = qt00Var3;
        f4m.j(findViewById);
        f4m.j(findViewById2);
        qt00Var.a();
        qt00Var2.a();
        qt00Var3.a();
    }
}
