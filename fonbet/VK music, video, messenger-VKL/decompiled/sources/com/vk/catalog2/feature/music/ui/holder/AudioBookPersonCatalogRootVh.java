package com.vk.catalog2.feature.music.ui.holder;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.LruCache;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.SwitchCatalogVh;
import com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder;
import com.vk.catalog2.common.ui.holders.api.CatalogVh;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.holders.search.b;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.container.ViewPagerVh;
import com.vk.catalog2.feature.music.dto.ui.UIBlockAudioBookPerson;
import com.vk.catalog2.feature.music.dto.ui.UIBlockLegalNotice;
import com.vk.catalog2.feature.music.holders.MusicCatalogErrorRedesignedStateScrollableVh;
import com.vk.catalog2.feature.music.holders.audiobook.AudioBookPersonHeaderVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.music.audiobook.AudioBookPerson;
import com.vk.dto.music.audiobook.AudioBookPersonRole;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.movika.sdk.base.logic.processor.actions.f;
import com.vk.movika.sdk.base.logic.processor.actions.g;
import com.vk.music.bottomsheets.audiobook.AudioBookPersonBottomSheetLaunchPoint;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import xsna.a0a;
import xsna.bnn0;
import xsna.cfp0;
import xsna.f5z;
import xsna.g3a;
import xsna.i5s;
import xsna.ic40;
import xsna.j5g;
import xsna.kbj0;
import xsna.ltz;
import xsna.lyd;
import xsna.m7m;
import xsna.mzp0;
import xsna.nda;
import xsna.nr4;
import xsna.o5a;
import xsna.qd4;
import xsna.rda;
import xsna.rzp0;
import xsna.swp;
import xsna.tfc;
import xsna.u4a;
import xsna.wk;

/* compiled from: AudioBookPersonCatalogRootVh.kt */
/* loaded from: classes16.dex */
public final class AudioBookPersonCatalogRootVh extends CatalogRootViewHolder implements CatalogVh, rda, CatalogStatesViewHolder {
    public String p;
    public AudioBookPerson q;
    public AudioBookPersonRole r;
    public final AudioBookPersonHeaderVh s;
    public final SearchStatsLoggingInfo t;
    public final mzp0 u;
    public final ViewPagerVh v;
    public final g3a w;
    public final SwitchCatalogVh x;
    public final tfc y;

    public AudioBookPersonCatalogRootVh() {
        throw null;
    }

    public AudioBookPersonCatalogRootVh(Bundle bundle, FragmentActivity fragmentActivity, o5a o5aVar) {
        super(bundle, (Class) null, (Activity) fragmentActivity, (nda) o5aVar, false, (f5z) null, 112);
        u4a u4aVar = this.m;
        this.s = new AudioBookPersonHeaderVh(u4aVar.c.a, u4aVar.b.f);
        SearchStatsLoggingInfo searchStatsLoggingInfo = bundle != null ? (SearchStatsLoggingInfo) bundle.getParcelable("search_stats_logging_info") : null;
        this.t = searchStatsLoggingInfo;
        LruCache<UUID, mzp0> lruCache = rzp0.a;
        mzp0 d = rzp0.d(bundle);
        this.u = d;
        if (searchStatsLoggingInfo != null) {
            SearchStatInfoProvider searchStatInfoProvider = this.m.b.m;
            searchStatInfoProvider.getClass();
            searchStatInfoProvider.b = SearchStatInfoProvider.Mode.EnabledOnlyForLocal;
            this.m.b.m.a = true;
        }
        ViewPagerVh viewPagerVh = new ViewPagerVh(this.m, false, null, false, null, null, null, N(), null, null, 7166);
        this.v = viewPagerVh;
        u4a u4aVar2 = this.m;
        this.w = u4aVar2.b.s.S(u4aVar2, null);
        this.x = new SwitchCatalogVh(viewPagerVh, null, new MusicCatalogErrorRedesignedStateScrollableVh(this, new f(this, 4), null, new g(this, 5), 4), null, null, R.layout.catalog_frame_layout_with_scrolling, null, null, false, false, d, 986);
        this.y = new tfc(m7m.f(this));
    }

    @Override // xsna.hha
    public final boolean A(String str) {
        return this.x.A(str);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        UIBlock uIBlock2;
        Object obj;
        if (uIBlock instanceof UIBlockCatalog) {
            Object a0 = j5g.a0(((UIBlockCatalog) uIBlock).A);
            UIBlockAudioBookPerson uIBlockAudioBookPerson = null;
            UIBlockList uIBlockList = a0 instanceof UIBlockList ? (UIBlockList) a0 : null;
            ArrayList<UIBlock> arrayList = uIBlockList != null ? uIBlockList.y : null;
            if (arrayList != null) {
                Iterator<T> it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((UIBlock) obj) instanceof UIBlockLegalNotice) {
                            break;
                        }
                    }
                }
                uIBlock2 = (UIBlock) obj;
            } else {
                uIBlock2 = null;
            }
            UIBlock uIBlock3 = arrayList != null ? (UIBlock) j5g.a0(arrayList) : null;
            UIBlockAudioBookPerson uIBlockAudioBookPerson2 = uIBlock3 instanceof UIBlockAudioBookPerson ? (UIBlockAudioBookPerson) uIBlock3 : null;
            if (uIBlockAudioBookPerson2 != null) {
                uIBlockAudioBookPerson = new UIBlockAudioBookPerson(uIBlockAudioBookPerson2.Ab(), AudioBookPerson.zb(uIBlockAudioBookPerson2.y), uIBlock2 instanceof UIBlockLegalNotice ? (UIBlockLegalNotice) uIBlock2 : null);
            }
            if (uIBlockAudioBookPerson != null) {
                this.s.N6(uIBlockAudioBookPerson);
                this.p = i5s.a(new StringBuilder("https://"), a0a.d, "/audiobook_person") + uIBlockAudioBookPerson.y.b;
                AudioBookPerson audioBookPerson = uIBlockAudioBookPerson.y;
                this.q = audioBookPerson;
                this.r = audioBookPerson.Ab();
            }
            this.y.c();
            this.x.N6(uIBlock);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.too0
    public final void Ng() {
        AudioBookPersonHeaderVh audioBookPersonHeaderVh = this.s;
        if (audioBookPersonHeaderVh == null) {
            audioBookPersonHeaderVh = null;
        }
        if (audioBookPersonHeaderVh != null) {
            audioBookPersonHeaderVh.Ng();
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void S(cfp0 cfp0Var) {
        if (this.t != null) {
            b.a(b.a, cfp0Var.a, cfp0Var.b, true, null, 16);
        } else {
            super.S(cfp0Var);
        }
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_audiobook_person_page, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        viewGroup2.addView(this.s.k5(layoutInflater, viewGroup2, null), 0);
        SwitchCatalogVh switchCatalogVh = this.x;
        viewGroup2.addView(switchCatalogVh.k5(layoutInflater, viewGroup2, null), 1);
        switchCatalogVh.i8(ltz.a);
        viewGroup2.post(new wk(this, 2));
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void Y() {
        this.x.L();
        this.w.b();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final bnn0 getState() {
        return this.x.r;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogStatesViewHolder
    public final void i8(bnn0 bnn0Var) {
        this.x.i8(bnn0Var);
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        this.x.onConfigurationChanged(configuration);
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onPause() {
        this.y.d();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder
    public final void onResume() {
        this.y.e();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void rg(Throwable th) {
        i8(new swp(th));
    }

    @Override // xsna.rda
    public final void s() {
        this.v.s();
    }

    @Override // com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        this.v.y(uiTrackingScreen);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void ya() {
        i8(ltz.a);
    }

    @Override // xsna.mba
    public final void z(int i, UIBlock uIBlock) {
        if (i == R.id.icon_menu) {
            AudioBookPerson audioBookPerson = this.q;
            if (audioBookPerson != null) {
                qd4.t(lyd.g().w(), this.b, AudioBookPersonBottomSheetLaunchPoint.AudioBookPersonScreen.b, null, audioBookPerson, MusicPlaybackLaunchContext.Fb(uIBlock != null ? uIBlock.f : null), 4);
                return;
            }
            return;
        }
        if (i == R.id.share_btn) {
            String str = this.p;
            if (str != null) {
                kbj0.c(nr4.b(), this.b, str, true, null, null, false, 120);
                return;
            }
            return;
        }
        if (i != R.id.show_more_tv) {
            this.m.b.b.c(false);
            return;
        }
        AudioBookPerson audioBookPerson2 = this.q;
        String str2 = audioBookPerson2 != null ? audioBookPerson2.c : null;
        String str3 = audioBookPerson2 != null ? audioBookPerson2.d : null;
        if (str2 == null || str3 == null) {
            return;
        }
        ic40 w = lyd.g().w();
        AudioBookPersonRole audioBookPersonRole = this.r;
        if (audioBookPersonRole == null) {
            audioBookPersonRole = AudioBookPersonRole.AUTHOR;
        }
        w.d(this.b, str2, str3, audioBookPersonRole, MusicPlaybackLaunchContext.Fb(uIBlock != null ? uIBlock.f : null));
    }

    @Override // xsna.tb0
    public final void onActivityResult(int i, int i2, Intent intent) {
    }
}
