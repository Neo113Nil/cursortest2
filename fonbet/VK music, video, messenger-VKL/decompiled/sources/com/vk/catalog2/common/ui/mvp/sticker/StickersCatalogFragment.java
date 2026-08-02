package com.vk.catalog2.common.ui.mvp.sticker;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.LruCache;
import android.util.TypedValue;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.ironsource.X3;
import com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.sticker.StickerCatalogRootVh;
import com.vk.core.performance.score.PerformanceScoreProduct;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.stickers.bridge.GiftData;
import com.vkontakte.android.R;
import java.util.UUID;
import kotlin.Pair;
import xsna.anj;
import xsna.dhr0;
import xsna.fdi;
import xsna.g2v;
import xsna.hf8;
import xsna.krv0;
import xsna.lbs;
import xsna.mzp0;
import xsna.nds;
import xsna.o5a;
import xsna.r1l0;
import xsna.rzp0;
import xsna.t6g0;
import xsna.y9l0;
import xsna.yw90;
import xsna.zal0;
import xsna.zrd0;

/* compiled from: StickersCatalogFragment.kt */
/* loaded from: classes16.dex */
public final class StickersCatalogFragment extends BaseCatalogFragment implements nds {
    public String Q;
    public StickerStockItem R;
    public final StickersCatalogFragment$mGiftsReceiver$1 S;
    public final fdi T;

    /* compiled from: StickersCatalogFragment.kt */
    public static final class a extends BaseCatalogFragment.b {
        public a() {
            super(StickersCatalogFragment.class, null, null);
        }

        @Override // xsna.oz50
        public final void r(Intent intent) {
            LruCache<UUID, mzp0> lruCache = rzp0.a;
            Pair c = rzp0.c(UiMeasuringScreen.STICKERS_CATALOG, null, false, 62);
            UUID uuid = (UUID) c.d();
            ((mzp0) c.g()).init();
            Bundle bundleExtra = intent.getBundleExtra("args");
            if (bundleExtra != null) {
                rzp0.f(bundleExtra, uuid);
            }
            zrd0 zrd0Var = zrd0.a;
            Pair a = zrd0.a(PerformanceScoreProduct.STICKERS_CATALOG);
            UUID uuid2 = (UUID) a.d();
            ((yw90) a.g()).init();
            Bundle bundleExtra2 = intent.getBundleExtra("args");
            if (bundleExtra2 != null) {
                zrd0.d(bundleExtra2, uuid2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.vk.catalog2.common.ui.mvp.sticker.StickersCatalogFragment$mGiftsReceiver$1] */
    public StickersCatalogFragment() {
        super(StickerCatalogRootVh.class, false);
        this.S = new BroadcastReceiver() { // from class: com.vk.catalog2.common.ui.mvp.sticker.StickersCatalogFragment$mGiftsReceiver$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                y9l0.a(r1l0.a);
            }
        };
        this.T = new fdi();
    }

    @Override // xsna.nds
    public final boolean W9() {
        TypedValue typedValue = krv0.a;
        return krv0.j();
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment
    public final CatalogRootViewHolder eo(Bundle bundle) {
        boolean l = lbs.l(this);
        this.T.getClass();
        return new StickerCatalogRootVh(kn(), new o5a(this), getArguments(), getId(), !fdi.k(bundle, l), this.J, On());
    }

    @Override // xsna.nds, xsna.xoo0
    public final int l2() {
        return dhr0.t.c(R.attr.vk_ui_header_background);
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        t6g0 t6g0Var = t6g0.b;
        t6g0.d().h();
        Bundle arguments = getArguments();
        this.R = arguments != null ? (StickerStockItem) arguments.getParcelable("sticker_item") : null;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (str = arguments2.getString("ref")) == null) {
            str = X3.i.U;
        }
        this.Q = str;
        t6g0.d().P0();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            anj.d(activity, this.S, new IntentFilter("com.vkontakte.android.ACTION_GIFT_SENT"), hf8.a, 4);
        }
        super.onCreate(bundle);
    }

    @Override // com.vk.catalog2.common.ui.mvp.fragment.BaseCatalogFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.unregisterReceiver(this.S);
        }
        super.onDestroy();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        fdi.I(this.T, bundle, Boolean.valueOf(lbs.l(this)), null, 12);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        StickerStockItem stickerStockItem = this.R;
        if (stickerStockItem != null) {
            stickerStockItem.O = this.Q;
            Context mo2getContext = mo2getContext();
            if (mo2getContext != null) {
                zal0.m(g2v.d().a(), mo2getContext, this.R, GiftData.d, null, 56);
            }
        }
    }
}
