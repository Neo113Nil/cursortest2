package com.vk.ecomm.products_selection.impl;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.core.compose.component.semantics.b;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.products_selection.api.model.SelectionProductId;
import com.vk.fave.di.FaveComponent;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketContextContent;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.a040;
import xsna.ao;
import xsna.ao50;
import xsna.b1z;
import xsna.b7;
import xsna.b9m;
import xsna.bo;
import xsna.bpn0;
import xsna.bsd0;
import xsna.cjl0;
import xsna.csd0;
import xsna.d0w;
import xsna.dw20;
import xsna.e4;
import xsna.epx;
import xsna.f540;
import xsna.fcn;
import xsna.fpf0;
import xsna.gko;
import xsna.gm50;
import xsna.hsc0;
import xsna.htd0;
import xsna.i0b0;
import xsna.iah0;
import xsna.iq;
import xsna.isq;
import xsna.k7m;
import xsna.kai0;
import xsna.km50;
import xsna.krv0;
import xsna.ktd0;
import xsna.lei0;
import xsna.m0q0;
import xsna.m7m;
import xsna.mk50;
import xsna.mtd0;
import xsna.nr;
import xsna.nt8;
import xsna.oe5;
import xsna.oq;
import xsna.otd0;
import xsna.ptd0;
import xsna.q530;
import xsna.qk;
import xsna.qoy;
import xsna.qw30;
import xsna.rgb0;
import xsna.s200;
import xsna.tl50;
import xsna.tlo0;
import xsna.ts90;
import xsna.tzp0;
import xsna.vk50;
import xsna.w8i;
import xsna.x550;
import xsna.xn50;
import xsna.yfb;
import xsna.z260;

/* compiled from: ProductsSelectionBottomSheet.kt */
/* loaded from: classes18.dex */
public final class ProductsSelectionBottomSheet extends tl50<ktd0, ptd0, htd0> implements w8i {
    public static final /* synthetic */ int u1 = 0;
    public RecyclerView i1;
    public VkTopBar j1;
    public kai0 k1;
    public boolean l1;
    public ComposeView m1;
    public VkSpinner n1;
    public final isq o1 = ((FaveComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(FaveComponent.class))).xf();
    public final bpn0 p1 = new bpn0(new f540(this, 18));
    public final bpn0 q1 = new bpn0(new x550(this, 19));
    public final bpn0 r1 = new bpn0(new b1z(this, 18));
    public final bpn0 s1 = new bpn0(new z260(this, 19));
    public final a t1 = new a();

    /* compiled from: ProductsSelectionBottomSheet.kt */
    public static final class Builder extends dw20.b implements w8i {
        public static final tzp0.c.a f = new tzp0.c.a(new a(), false);
        public final Arguments e;

        /* compiled from: ProductsSelectionBottomSheet.kt */
        public static final class AnalyticParams implements Parcelable {
            public static final Parcelable.Creator<AnalyticParams> CREATOR = new a();
            public final CommonMarketStat$TypeRefSource b;
            public final CommonMarketStat$TypeMarketContextContent.Type c;
            public final Integer d;
            public final Long e;

            /* compiled from: ProductsSelectionBottomSheet.kt */
            public static final class a implements Parcelable.Creator<AnalyticParams> {
                @Override // android.os.Parcelable.Creator
                public final AnalyticParams createFromParcel(Parcel parcel) {
                    return new AnalyticParams(CommonMarketStat$TypeRefSource.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : CommonMarketStat$TypeMarketContextContent.Type.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
                }

                @Override // android.os.Parcelable.Creator
                public final AnalyticParams[] newArray(int i) {
                    return new AnalyticParams[i];
                }
            }

            public AnalyticParams(CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource, CommonMarketStat$TypeMarketContextContent.Type type, Integer num, Long l) {
                this.b = commonMarketStat$TypeRefSource;
                this.c = type;
                this.d = num;
                this.e = l;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AnalyticParams)) {
                    return false;
                }
                AnalyticParams analyticParams = (AnalyticParams) obj;
                return this.b == analyticParams.b && this.c == analyticParams.c && epx.f(this.d, analyticParams.d) && epx.f(this.e, analyticParams.e);
            }

            public final int hashCode() {
                int hashCode = this.b.hashCode() * 31;
                CommonMarketStat$TypeMarketContextContent.Type type = this.c;
                int hashCode2 = (hashCode + (type == null ? 0 : type.hashCode())) * 31;
                Integer num = this.d;
                int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
                Long l = this.e;
                return hashCode3 + (l != null ? l.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("AnalyticParams(refSource=");
                sb.append(this.b);
                sb.append(", contextContentType=");
                sb.append(this.c);
                sb.append(", contextContentId=");
                sb.append(this.d);
                sb.append(", contextContentOwnerId=");
                return iq.b(sb, this.e, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(this.b.name());
                CommonMarketStat$TypeMarketContextContent.Type type = this.c;
                if (type == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(type.name());
                }
                Integer num = this.d;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    nr.a(parcel, 1, num);
                }
                Long l = this.e;
                if (l == null) {
                    parcel.writeInt(0);
                } else {
                    io.reactivex.rxjava3.subjects.b.f(parcel, 1, l);
                }
            }
        }

        /* compiled from: ProductsSelectionBottomSheet.kt */
        public static final class Arguments implements Parcelable {
            public static final Parcelable.Creator<Arguments> CREATOR = new a();
            public final List<SelectionProductId> b;
            public final AnalyticParams c;
            public final boolean d;
            public final Map<Long, String> e;

            /* compiled from: ProductsSelectionBottomSheet.kt */
            public static final class a implements Parcelable.Creator<Arguments> {
                @Override // android.os.Parcelable.Creator
                public final Arguments createFromParcel(Parcel parcel) {
                    LinkedHashMap linkedHashMap;
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    int i = 0;
                    while (true) {
                        if (i == readInt) {
                            break;
                        }
                        i = bo.b(Arguments.class, parcel, arrayList, i, 1);
                    }
                    AnalyticParams createFromParcel = AnalyticParams.CREATOR.createFromParcel(parcel);
                    boolean z = parcel.readInt() != 0;
                    if (parcel.readInt() == 0) {
                        linkedHashMap = null;
                    } else {
                        int readInt2 = parcel.readInt();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt2);
                        for (int i2 = 0; i2 != readInt2; i2++) {
                            linkedHashMap2.put(Long.valueOf(parcel.readLong()), parcel.readString());
                        }
                        linkedHashMap = linkedHashMap2;
                    }
                    return new Arguments(arrayList, createFromParcel, z, linkedHashMap);
                }

                @Override // android.os.Parcelable.Creator
                public final Arguments[] newArray(int i) {
                    return new Arguments[i];
                }
            }

            public Arguments(List<SelectionProductId> list, AnalyticParams analyticParams, boolean z, Map<Long, String> map) {
                this.b = list;
                this.c = analyticParams;
                this.d = z;
                this.e = map;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Arguments)) {
                    return false;
                }
                Arguments arguments = (Arguments) obj;
                return epx.f(this.b, arguments.b) && epx.f(this.c, arguments.c) && this.d == arguments.d && epx.f(this.e, arguments.e);
            }

            public final int hashCode() {
                int b = qoy.b((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d);
                Map<Long, String> map = this.e;
                return b + (map == null ? 0 : map.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Arguments(productIds=");
                sb.append(this.b);
                sb.append(", analyticParams=");
                sb.append(this.c);
                sb.append(", forceDarkTheme=");
                sb.append(this.d);
                sb.append(", adsLabels=");
                return cjl0.a(sb, this.e, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                Iterator a2 = ao.a(parcel, this.b);
                while (a2.hasNext()) {
                    parcel.writeParcelable((Parcelable) a2.next(), i);
                }
                this.c.writeToParcel(parcel, i);
                parcel.writeInt(this.d ? 1 : 0);
                Map<Long, String> map = this.e;
                if (map == null) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(1);
                parcel.writeInt(map.size());
                for (Map.Entry<Long, String> entry : map.entrySet()) {
                    parcel.writeLong(entry.getKey().longValue());
                    parcel.writeString(entry.getValue());
                }
            }
        }

        /* compiled from: ProductsSelectionBottomSheet.kt */
        public static final class a implements m0q0 {
            @Override // xsna.m0q0
            public final void y(UiTrackingScreen uiTrackingScreen) {
                uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.MARKET_ATTACHED_ITEMS;
            }
        }

        /* compiled from: ProductsSelectionBottomSheet.kt */
        public static final class b implements fcn {
            @Override // xsna.fcn
            public final boolean M4() {
                return true;
            }

            @Override // xsna.fcn
            public final boolean N8() {
                return false;
            }

            @Override // xsna.fcn
            public final void b(boolean z) {
                b(false);
            }

            @Override // xsna.fcn
            public final void dismiss() {
                b(false);
            }

            @Override // xsna.fcn
            public final boolean v6() {
                return false;
            }
        }

        public Builder(Context context, Arguments arguments) {
            super(context, f);
            this.e = arguments;
            c(new ts90(0.8f, 2));
            F0(true);
            x(iah0.a(4));
            if (arguments.d) {
                TypedValue typedValue = krv0.a;
                Integer d = krv0.d();
                if (d != null) {
                    u0(d.intValue());
                }
                l(krv0.m(R.attr.vk_ui_background_content, s200.p(context)));
            } else {
                l(krv0.m(R.attr.vk_ui_background_content, context));
            }
            this.d.C1 = true;
            E(true);
            B(iah0.b(12.0f), true, true);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            ProductsSelectionBottomSheet productsSelectionBottomSheet = new ProductsSelectionBottomSheet();
            productsSelectionBottomSheet.setArguments(yfb.b(new Pair("arguments", this.e)));
            b bVar = new b();
            d0(new qk(16, productsSelectionBottomSheet, bVar));
            a0(new oe5(18, productsSelectionBottomSheet, bVar));
            return productsSelectionBottomSheet;
        }
    }

    /* compiled from: ProductsSelectionBottomSheet.kt */
    public static final class a implements csd0<bsd0> {
        public a() {
        }

        @Override // xsna.csd0
        public final void a(bsd0 bsd0Var) {
            boolean z = bsd0Var instanceof bsd0.d;
            ProductsSelectionBottomSheet productsSelectionBottomSheet = ProductsSelectionBottomSheet.this;
            if (z) {
                xn50.a.c(productsSelectionBottomSheet, new htd0.g(((bsd0.d) bsd0Var).a));
                return;
            }
            if (bsd0Var instanceof bsd0.b) {
                xn50.a.c(productsSelectionBottomSheet, new htd0.f(((bsd0.b) bsd0Var).a));
            } else if (bsd0Var instanceof bsd0.c) {
                xn50.a.c(productsSelectionBottomSheet, new htd0.d(((bsd0.c) bsd0Var).a));
            } else {
                if (!(bsd0Var instanceof bsd0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                xn50.a.c(productsSelectionBottomSheet, new htd0.b(((bsd0.a) bsd0Var).a));
            }
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        if (!this.l1) {
            return new mk50.b(R.layout.products_selection_bottom_sheet);
        }
        Context mo2getContext = mo2getContext();
        return new mk50.c(LayoutInflater.from(mo2getContext != null ? s200.p(mo2getContext) : null).inflate(R.layout.products_selection_bottom_sheet, (ViewGroup) null));
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ptd0 ptd0Var = (ptd0) ao50Var;
        this.j1 = (VkTopBar) view.findViewById(R.id.selection_top_bar);
        bo(0);
        q530 q530Var = (q530) this.s1.getValue();
        kai0 kai0Var = new kai0();
        kai0Var.x0(lei0.class, new b7(22, this.t1, q530Var));
        q530Var.d(new nt8(kai0Var));
        this.k1 = kai0Var;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.products_recycler);
        this.i1 = recyclerView;
        kai0 kai0Var2 = this.k1;
        if (kai0Var2 == null) {
            kai0Var2 = null;
        }
        recyclerView.setAdapter(kai0Var2);
        RecyclerView recyclerView2 = this.i1;
        RecyclerView recyclerView3 = recyclerView2 != null ? recyclerView2 : null;
        if (this.l1) {
            Context mo2getContext = mo2getContext();
            if (mo2getContext != null) {
                s200.p(mo2getContext);
            }
        } else {
            mo2getContext();
        }
        recyclerView3.setLayoutManager(new GridLayoutManager(2));
        this.m1 = (ComposeView) view.findViewById(R.id.placeholder_state_view);
        this.n1 = (VkSpinner) view.findViewById(R.id.products_selection_spinner);
        gm50.a.b(this, ptd0Var.a, new i0b0(this, 5));
        gm50.a.b(this, ptd0Var.b, new d0w(this, 17));
        gm50.a.b(this, ptd0Var.c, new qw30(this, 22));
    }

    @Override // xsna.tl50, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((ktd0) vk50Var).i.a(new hsc0(this, 1), this);
    }

    public final void bo(int i) {
        VkTopBar vkTopBar = this.j1;
        if (vkTopBar == null) {
            vkTopBar = null;
        }
        vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(getResources().getString(R.string.product_selection_topbar_title), (e4) null, (VkTopBar.Middle.Text.Title.a) null, (VkTopBar.Middle.Text.Title.Size) null, 14), null, null, null, 14));
        VkTopBar.l.c cVar = i > 0 ? new VkTopBar.l.c(i, VkCounter.CounterAppearance.Appearance.AccentRed, null, 12) : null;
        String string = getString(R.string.product_selection_topbar_cart_icon_description);
        String quantityString = i > 0 ? requireContext().getResources().getQuantityString(R.plurals.product_selection_topbar_cart_item_count_description, i, Integer.valueOf(i)) : string;
        VkTopBar vkTopBar2 = this.j1;
        if (vkTopBar2 == null) {
            vkTopBar2 = null;
        }
        gko.b bVar = gko.Companion;
        vkTopBar2.setAfter(VkTopBar.a.C0875a.a(new VkTopBar.a.c.f(new gko(R.drawable.vk_icon_shopping_cart_outline_28), oq.d(tlo0.Companion, string), new a040(this, 29), cVar, null, b.a(SemanticsConfiguration.Mode.ClearAndSet, new rgb0(quantityString, 1), 2), 16), null, 6));
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Parcelable parcelable;
        Object parcelable2;
        Bundle requireArguments = requireArguments();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = requireArguments.getParcelable("arguments", Builder.Arguments.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = requireArguments.getParcelable("arguments");
            if (!(parcelable3 instanceof Builder.Arguments)) {
                parcelable3 = null;
            }
            parcelable = (Builder.Arguments) parcelable3;
        }
        Builder.Arguments arguments = (Builder.Arguments) parcelable;
        this.l1 = arguments != null ? arguments.d : false;
        return new ktd0(new mtd0(new otd0(arguments != null ? arguments.c.b : CommonMarketStat$TypeRefSource.LINK, arguments != null ? arguments.c.c : null, arguments != null ? arguments.c.d : null, arguments != null ? arguments.c.e : null, arguments != null ? arguments.b : EmptyList.b, EmptyList.b, 0, arguments != null ? arguments.e : null, null, false)), ((MarketComponent) ((k7m) m7m.f(this)).a(fpf0.a(MarketComponent.class))).U1(), new b9m(), ((MarketComponent) ((k7m) m7m.f(this)).a(fpf0.a(MarketComponent.class))).Y4(), ((MarketComponent) ((k7m) m7m.f(this)).a(fpf0.a(MarketComponent.class))).l7());
    }
}
