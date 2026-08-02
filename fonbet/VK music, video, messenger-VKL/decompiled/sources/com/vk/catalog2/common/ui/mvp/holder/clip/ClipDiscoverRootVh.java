package com.vk.catalog2.common.ui.mvp.holder.clip;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.ui.holders.api.CatalogVh;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipDiscoverVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vkontakte.android.R;
import java.io.Serializable;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.b00;
import xsna.b5a;
import xsna.c6f;
import xsna.f5z;
import xsna.g380;
import xsna.k9;
import xsna.mba;
import xsna.o5a;
import xsna.rda;
import xsna.t180;
import xsna.zrp;

/* compiled from: ClipDiscoverRootVh.kt */
/* loaded from: classes16.dex */
public final class ClipDiscoverRootVh extends CatalogRootViewHolder implements CatalogVh, rda {
    public final ClipDiscoverVh p;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipDiscoverRootVh.kt */
    public static final class CatalogViewType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CatalogViewType[] $VALUES;
        public static final CatalogViewType DEFAULT;
        public static final CatalogViewType MUSIC_TEMPLATES;
        public static final CatalogViewType TRENDS;

        static {
            CatalogViewType catalogViewType = new CatalogViewType("DEFAULT", 0);
            DEFAULT = catalogViewType;
            CatalogViewType catalogViewType2 = new CatalogViewType("MUSIC_TEMPLATES", 1);
            MUSIC_TEMPLATES = catalogViewType2;
            CatalogViewType catalogViewType3 = new CatalogViewType("TRENDS", 2);
            TRENDS = catalogViewType3;
            CatalogViewType[] catalogViewTypeArr = {catalogViewType, catalogViewType2, catalogViewType3};
            $VALUES = catalogViewTypeArr;
            $ENTRIES = new asp(catalogViewTypeArr);
        }

        public CatalogViewType() {
            throw null;
        }

        public static CatalogViewType valueOf(String str) {
            return (CatalogViewType) Enum.valueOf(CatalogViewType.class, str);
        }

        public static CatalogViewType[] values() {
            return (CatalogViewType[]) $VALUES.clone();
        }
    }

    public ClipDiscoverRootVh() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ClipDiscoverRootVh(c6f c6fVar, FragmentActivity fragmentActivity, o5a o5aVar, Bundle bundle) {
        super(bundle, (Class) null, fragmentActivity, o5aVar, r0 == CatalogViewType.MUSIC_TEMPLATES || r0 == CatalogViewType.TRENDS, (f5z) null, 96);
        Serializable serializable = bundle != null ? bundle.getSerializable("clips_catalog_view_type") : null;
        this.p = new ClipDiscoverVh(c6fVar, this.m, N(), bundle, null);
    }

    @Override // xsna.hha
    public final boolean A(String str) {
        return this.p.m.A(str);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockCatalog) {
            this.p.N6(uIBlock);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final boolean W() {
        return this.p.m.a0();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.p.k5(layoutInflater, viewGroup, null);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Y() {
        this.p.L();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final io.reactivex.rxjava3.disposables.c g0(b5a b5aVar) {
        ClipDiscoverVh clipDiscoverVh = this.p;
        clipDiscoverVh.getClass();
        return b5aVar.a.b0(t180.class).subscribe(new b00(new k9(clipDiscoverVh, 26), 10));
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        ClipDiscoverVh clipDiscoverVh = this.p;
        clipDiscoverVh.m.A.onConfigurationChanged(configuration);
        int i = ClipDiscoverVh.a.$EnumSwitchMapping$1[clipDiscoverVh.h.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                CatalogViewHolder catalogViewHolder = clipDiscoverVh.k;
                if (catalogViewHolder instanceof g380) {
                    ((g380) catalogViewHolder).onConfigurationChanged(configuration);
                }
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void rg(Throwable th) {
        this.p.rg(th);
    }

    @Override // xsna.rda
    public final void s() {
        this.p.s();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        this.p.y(uiTrackingScreen);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void ya() {
        this.p.ya();
    }

    @Override // xsna.mba
    public final void z(int i, UIBlock uIBlock) {
        ClipDiscoverVh clipDiscoverVh = this.p;
        if (i == R.id.toolbar) {
            clipDiscoverVh.s();
            return;
        }
        mba mbaVar = clipDiscoverVh.e;
        if (mbaVar != null) {
            mbaVar.z(i, uIBlock);
        } else {
            clipDiscoverVh.c.b.b.c(false);
        }
    }

    @Override // xsna.tb0
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
