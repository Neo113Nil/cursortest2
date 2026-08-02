package com.vk.catalog2.feature.music.holders.vkmix.viewholders;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.vk.catalog2.common.dto.api.music.AudioStreamMixTitles;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.VkMixInteractiveViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.catalog2.feature.music.dto.ui.UiBlockInteractiveVkMix;
import com.vk.catalog2.feature.music.holders.vkmix.MusicVkMixVh;
import com.vk.catalog2.feature.music.holders.vkmix.viewholders.MusicBaseVkMixInteractiveVh;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.bottomsheets.domain.model.MixData;
import com.vk.music.bottomsheets.domain.model.mixsettings.MixSettings;
import com.vk.music.mixsettings.MixOptionEntity;
import com.vk.music.mixsettings.MixSettingsEntity;
import com.vk.music.player.PlayState;
import com.vk.music.player.StartPlaySource;
import com.vk.music.player.StartPlayVkMixSource;
import com.vk.music.view.MusicRoundPlayView;
import com.vk.music.view.vkmix.models.MusicMixMood;
import defpackage.v;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.aud;
import xsna.b5a;
import xsna.bwt0;
import xsna.c5g;
import xsna.cdi;
import xsna.cfp0;
import xsna.cqm0;
import xsna.cws;
import xsna.drm0;
import xsna.e3m;
import xsna.epx;
import xsna.gb40;
import xsna.gzs;
import xsna.hb40;
import xsna.ib40;
import xsna.ic40;
import xsna.izs;
import xsna.j41;
import xsna.j4v0;
import xsna.l4v0;
import xsna.lyd;
import xsna.maz;
import xsna.myc0;
import xsna.p01;
import xsna.r80;
import xsna.s3q0;
import xsna.tz;
import xsna.u2b0;
import xsna.w4v0;
import xsna.xwk;
import xsna.zaf0;

/* compiled from: MusicBaseVkMixInteractiveVh.kt */
/* loaded from: classes16.dex */
public abstract class MusicBaseVkMixInteractiveVh extends MusicVkMixVh<UiBlockInteractiveVkMix> {
    public final l4v0 i;
    public final b5a j;
    public final aud k;
    public c l;
    public final io.reactivex.rxjava3.disposables.b m;
    public final ib40 n;
    public MusicRoundPlayView o;
    public VkMixInteractiveViewStyle.Style p;

    /* compiled from: MusicBaseVkMixInteractiveVh.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            String str;
            ViewGroup viewGroup;
            Context context;
            Activity h;
            r80 a;
            MixSettingsEntity mixSettingsEntity;
            MusicBaseVkMixInteractiveVh musicBaseVkMixInteractiveVh = (MusicBaseVkMixInteractiveVh) this.receiver;
            UiBlockInteractiveVkMix a2 = musicBaseVkMixInteractiveVh.k.a();
            if (a2 != null && (str = a2.y) != null && (viewGroup = musicBaseVkMixInteractiveVh.e) != null && (context = viewGroup.getContext()) != null && (h = e3m.h(context)) != null) {
                ic40 w = lyd.g().w();
                String str2 = a2.b;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = a2.c;
                if (str3 == null) {
                    str3 = "";
                }
                AudioStreamMixTitles audioStreamMixTitles = a2.z;
                MixSettings mixSettings = null;
                String str4 = audioStreamMixTitles != null ? audioStreamMixTitles.b : null;
                if (str4 == null) {
                    str4 = "";
                }
                boolean z = a2.B;
                l4v0 l4v0Var = musicBaseVkMixInteractiveVh.i;
                if (l4v0Var != null && (a = l4v0Var.a()) != null && (mixSettingsEntity = (MixSettingsEntity) a.c) != null) {
                    mixSettings = cdi.E(mixSettingsEntity);
                }
                w.c(h, new MixData(str, str2, str3, str4, z, mixSettings), MusicBottomSheetLaunchPoint.App.b, false);
                musicBaseVkMixInteractiveVh.j.a(new cfp0(a2, new MusicAnalyticsInfo(MusicAnalyticsInfo.ClickTarget.Menu)));
            }
            return s3q0.a;
        }
    }

    /* compiled from: MusicBaseVkMixInteractiveVh.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<UIBlockActionOpenUrl, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(UIBlockActionOpenUrl uIBlockActionOpenUrl) {
            Context context;
            ActionOpenUrl actionOpenUrl;
            UIBlockActionOpenUrl uIBlockActionOpenUrl2 = uIBlockActionOpenUrl;
            MusicBaseVkMixInteractiveVh musicBaseVkMixInteractiveVh = (MusicBaseVkMixInteractiveVh) this.receiver;
            musicBaseVkMixInteractiveVh.getClass();
            maz e = xwk.d().e();
            ViewGroup viewGroup = musicBaseVkMixInteractiveVh.e;
            if (viewGroup != null && (context = viewGroup.getContext()) != null && uIBlockActionOpenUrl2 != null && (actionOpenUrl = uIBlockActionOpenUrl2.A) != null) {
                UiBlockInteractiveVkMix a = musicBaseVkMixInteractiveVh.k.a();
                String str = a != null ? a.f : null;
                if (str == null) {
                    str = "";
                }
                e.e(context, actionOpenUrl, str, null, Bundle.EMPTY);
            }
            return s3q0.a;
        }
    }

    /* compiled from: MusicBaseVkMixInteractiveVh.kt */
    public static final class c implements View.OnAttachStateChangeListener {
        public final /* synthetic */ gb40 b;

        public c(gb40 gb40Var) {
            this.b = gb40Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnScrollChangedListener(this.b);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            view.getViewTreeObserver().removeOnScrollChangedListener(this.b);
        }
    }

    public MusicBaseVkMixInteractiveVh(u2b0 u2b0Var, int i, zaf0 zaf0Var, l4v0 l4v0Var, b5a b5aVar) {
        super(u2b0Var, zaf0Var, i);
        this.i = l4v0Var;
        this.j = b5aVar;
        this.k = new aud(l4v0Var);
        this.m = new io.reactivex.rxjava3.disposables.b();
        this.n = new ib40(this, u2b0Var);
    }

    @Override // com.vk.catalog2.feature.music.holders.vkmix.MusicVkMixVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        ViewGroup viewGroup = this.e;
        if (viewGroup != null) {
            c cVar = this.l;
            if (cVar == null) {
                cVar = null;
            }
            viewGroup.removeOnAttachStateChangeListener(cVar);
        }
        super.L();
        this.m.dispose();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void N6(UIBlock uIBlock) {
        r80 a2;
        if (uIBlock instanceof UIBlockList) {
            UIBlockList uIBlockList = (UIBlockList) uIBlock;
            ArrayList<UIBlock> arrayList = uIBlockList.y;
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator<T> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (!(((UIBlock) it.next()) instanceof UiBlockInteractiveVkMix)) {
                        return;
                    }
                }
            }
            ArrayList<UIBlock> arrayList2 = uIBlockList.y;
            ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
            Iterator<T> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add((UiBlockInteractiveVkMix) ((UIBlock) it2.next()));
            }
            this.k.b = arrayList3;
            boolean z = false;
            l4v0 l4v0Var = this.i;
            if (l4v0Var != null && (a2 = l4v0Var.a()) != null && ((String) a2.a).length() == 0) {
                z = true;
            }
            p(z);
            MusicRoundPlayView musicRoundPlayView = this.o;
            if (musicRoundPlayView == null) {
                musicRoundPlayView = null;
            }
            bwt0.i0(musicRoundPlayView, new hb40(this, 0));
            n().d(new a(0, this, MusicBaseVkMixInteractiveVh.class, "onSettingsClick", "onSettingsClick()V", 0), new b(1, this, MusicBaseVkMixInteractiveVh.class, "onPlaceholderActionClick", "onPlaceholderActionClick(Lcom/vk/catalog2/common/dto/ui/actions/UIBlockActionOpenUrl;)V", 0), new p01(this, 12));
        }
    }

    @Override // xsna.x4v0
    public final void a(MusicRoundPlayView.State state) {
        MusicRoundPlayView musicRoundPlayView = this.o;
        if (musicRoundPlayView == null) {
            musicRoundPlayView = null;
        }
        musicRoundPlayView.b(state);
    }

    @Override // com.vk.catalog2.feature.music.holders.vkmix.MusicVkMixVh
    public final String c() {
        UIBlockPlaceholder uIBlockPlaceholder;
        if (!this.k.d()) {
            return super.c();
        }
        UiBlockInteractiveVkMix b2 = b();
        if (b2 == null || (uIBlockPlaceholder = b2.D) == null) {
            return null;
        }
        return uIBlockPlaceholder.A;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [xsna.gb40] */
    @Override // com.vk.catalog2.feature.music.holders.vkmix.MusicVkMixVh
    public void d() {
        io.reactivex.rxjava3.disposables.c subscribe;
        o();
        this.o = n().e();
        final Rect rect = new Rect();
        ViewGroup viewGroup = this.e;
        if (viewGroup != null) {
            viewGroup.setBackgroundColor(0);
            viewGroup.getGlobalVisibleRect(rect);
            c cVar = new c(new ViewTreeObserver.OnScrollChangedListener() { // from class: xsna.gb40
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    MusicBaseVkMixInteractiveVh.this.r(rect);
                }
            });
            this.l = cVar;
            viewGroup.addOnAttachStateChangeListener(cVar);
        }
        n().b();
        io.reactivex.rxjava3.disposables.b bVar = this.m;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        l4v0 l4v0Var = this.i;
        if (l4v0Var != null && (subscribe = l4v0Var.g.E(new tz(new cws(this, 24), 24), lVar, kVar, kVar).subscribe()) != null) {
            bVar.b(subscribe);
        }
        if (l4v0Var != null) {
            bVar.b(l4v0Var.b().E(new j41(new v(15, this, rect), 25), lVar, kVar, kVar).subscribe());
        }
        this.c.d();
    }

    @Override // com.vk.catalog2.feature.music.holders.vkmix.MusicVkMixVh
    public final void j(PlayState playState) {
        r80 a2;
        if (e() && !g()) {
            u2b0 u2b0Var = this.b;
            StartPlaySource j = u2b0Var.j();
            StartPlayVkMixSource startPlayVkMixSource = j instanceof StartPlayVkMixSource ? (StartPlayVkMixSource) j : null;
            String str = startPlayVkMixSource != null ? startPlayVkMixSource.e : null;
            if (str == null) {
                str = "";
            }
            if (e()) {
                List list = (List) this.k.b;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (epx.f(((UiBlockInteractiveVkMix) it.next()).y, str)) {
                            if (playState != null && playState.h()) {
                                l4v0 l4v0Var = this.i;
                                if (l4v0Var != null && (a2 = l4v0Var.a()) != null) {
                                    StartPlaySource j2 = u2b0Var.j();
                                    StartPlayVkMixSource startPlayVkMixSource2 = j2 instanceof StartPlayVkMixSource ? (StartPlayVkMixSource) j2 : null;
                                    String str2 = startPlayVkMixSource2 != null ? startPlayVkMixSource2.e : null;
                                    a2.a = str2 != null ? str2 : "";
                                }
                                p(false);
                            }
                        }
                    }
                }
            }
        }
        super.j(playState);
        q();
    }

    @Override // com.vk.catalog2.feature.music.holders.vkmix.MusicVkMixVh
    public final void k(String str) {
        if (b() != null) {
            n().a(str);
        }
    }

    @Override // com.vk.catalog2.feature.music.holders.vkmix.MusicVkMixVh
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public UiBlockInteractiveVkMix b() {
        return this.k.a();
    }

    public abstract j4v0 n();

    public abstract void p(boolean z);

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r0 != null) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q() {
        String str;
        boolean z;
        boolean equals;
        MixSettingsEntity mixSettingsEntity;
        r80 a2;
        MusicMixMood musicMixMood;
        String str2;
        r80 a3;
        UiBlockInteractiveVkMix a4 = this.k.a();
        if (a4 == null || (str = a4.y) == null) {
            return;
        }
        u2b0 u2b0Var = this.b;
        if (u2b0Var.m0() == PlayState.PLAYING) {
            StartPlaySource j = u2b0Var.j();
            if ((j instanceof StartPlayVkMixSource) && epx.f(((StartPlayVkMixSource) j).e, str)) {
                z = true;
                equals = str.equals("common");
                l4v0 l4v0Var = this.i;
                if (equals) {
                    if (l4v0Var != null) {
                        l4v0Var.c(z ? MusicMixMood.MyMix : MusicMixMood.Idle);
                        return;
                    }
                    return;
                }
                StartPlaySource j2 = u2b0Var.j();
                MusicMixMood musicMixMood2 = null;
                StartPlayVkMixSource startPlayVkMixSource = j2 instanceof StartPlayVkMixSource ? (StartPlayVkMixSource) j2 : null;
                if (startPlayVkMixSource != null) {
                    if (!epx.f(startPlayVkMixSource.e, "common")) {
                        startPlayVkMixSource = null;
                    }
                    if (startPlayVkMixSource != null) {
                        mixSettingsEntity = startPlayVkMixSource.h;
                    }
                }
                mixSettingsEntity = (l4v0Var == null || (a2 = l4v0Var.a()) == null) ? null : (MixSettingsEntity) a2.c;
                if (l4v0Var != null && (a3 = l4v0Var.a()) != null) {
                    a3.c = mixSettingsEntity;
                }
                MixOptionEntity e = mixSettingsEntity != null ? mixSettingsEntity.e() : null;
                n().c(mixSettingsEntity);
                if (z) {
                    MusicMixMood.a aVar = MusicMixMood.Companion;
                    String str3 = e != null ? e.b : null;
                    aVar.getClass();
                    if (str3 != null && !drm0.N(str3)) {
                        Iterator<E> it = MusicMixMood.h().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            str2 = ((MusicMixMood) next).id;
                            if (epx.f(str2, cqm0.m(str3))) {
                                musicMixMood2 = next;
                                break;
                            }
                        }
                        musicMixMood2 = musicMixMood2;
                    }
                    musicMixMood = musicMixMood2 == null ? MusicMixMood.Play : musicMixMood2;
                } else {
                    musicMixMood = MusicMixMood.Idle;
                }
                if (l4v0Var != null) {
                    l4v0Var.c(musicMixMood);
                    return;
                }
                return;
            }
        }
        z = false;
        equals = str.equals("common");
        l4v0 l4v0Var2 = this.i;
        if (equals) {
        }
    }

    public final void r(Rect rect) {
        ViewGroup viewGroup = this.e;
        if (viewGroup != null) {
            viewGroup.getGlobalVisibleRect(rect);
        }
        l4v0 l4v0Var = this.i;
        if (l4v0Var != null) {
            l4v0Var.d(new w4v0(rect.bottom, rect.top <= 0, this.p == VkMixInteractiveViewStyle.Style.STATIC));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(boolean z) {
        UiBlockInteractiveVkMix b2;
        MixSettingsEntity mixSettingsEntity;
        Iterator it;
        Object obj;
        MixSettingsEntity mixSettingsEntity2;
        l4v0 l4v0Var;
        r80 a2;
        aud audVar = this.k;
        UiBlockInteractiveVkMix a3 = audVar.a();
        if (a3 != null) {
            j4v0 n = n();
            String c2 = c();
            if (c2 == null) {
                c2 = "";
            }
            n.f(z, a3, c2);
        }
        boolean d = audVar.d();
        u2b0 u2b0Var = this.b;
        if (!d && (b2 = b()) != null && b2.B) {
            StartPlaySource j = u2b0Var.j();
            StartPlayVkMixSource startPlayVkMixSource = j instanceof StartPlayVkMixSource ? (StartPlayVkMixSource) j : null;
            if (startPlayVkMixSource != null) {
                if (!epx.f(startPlayVkMixSource.e, "common")) {
                    startPlayVkMixSource = null;
                }
                if (startPlayVkMixSource != null) {
                    mixSettingsEntity = startPlayVkMixSource.h;
                    it = ((List) audVar.b).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it.next();
                            if (epx.f(((UiBlockInteractiveVkMix) obj).y, "common")) {
                                break;
                            }
                        }
                    }
                    UiBlockInteractiveVkMix uiBlockInteractiveVkMix = (UiBlockInteractiveVkMix) obj;
                    mixSettingsEntity2 = uiBlockInteractiveVkMix != null ? uiBlockInteractiveVkMix.C : null;
                    l4v0Var = this.i;
                    if (l4v0Var != null && (a2 = l4v0Var.a()) != null) {
                        if (mixSettingsEntity == null && (mixSettingsEntity = (MixSettingsEntity) a2.c) == null) {
                            mixSettingsEntity = mixSettingsEntity2;
                        }
                        a2.c = mixSettingsEntity;
                    }
                    q();
                }
            }
            mixSettingsEntity = null;
            it = ((List) audVar.b).iterator();
            while (true) {
                if (it.hasNext()) {
                }
            }
            UiBlockInteractiveVkMix uiBlockInteractiveVkMix2 = (UiBlockInteractiveVkMix) obj;
            if (uiBlockInteractiveVkMix2 != null) {
            }
            l4v0Var = this.i;
            if (l4v0Var != null) {
                if (mixSettingsEntity == null) {
                    mixSettingsEntity = mixSettingsEntity2;
                }
                a2.c = mixSettingsEntity;
            }
            q();
        }
        j(u2b0Var.m0());
    }

    public final void t(boolean z) {
        Object obj;
        String str;
        r80 a2;
        r80 a3;
        UIBlockPlaceholder uIBlockPlaceholder;
        r80 a4;
        Object obj2;
        aud audVar = this.k;
        l4v0 l4v0Var = this.i;
        if (l4v0Var != null && (a4 = l4v0Var.a()) != null && z && ((String) a4.a).length() == 0 && myc0.f((String) a4.b)) {
            Iterator it = ((List) audVar.b).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                String str2 = ((UiBlockInteractiveVkMix) obj2).y;
                r80 a5 = l4v0Var.a();
                if (!epx.f(str2, a5 != null ? (String) a5.b : null)) {
                    break;
                }
            }
            UiBlockInteractiveVkMix uiBlockInteractiveVkMix = (UiBlockInteractiveVkMix) obj2;
            if (uiBlockInteractiveVkMix != null) {
                str = uiBlockInteractiveVkMix.y;
            }
            str = null;
        } else {
            Iterator it2 = ((List) audVar.b).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it2.next();
                    if (!epx.f(((UiBlockInteractiveVkMix) obj).y, (l4v0Var == null || (a2 = l4v0Var.a()) == null) ? null : (String) a2.a)) {
                        break;
                    }
                }
            }
            UiBlockInteractiveVkMix uiBlockInteractiveVkMix2 = (UiBlockInteractiveVkMix) obj;
            if (uiBlockInteractiveVkMix2 != null) {
                str = uiBlockInteractiveVkMix2.y;
            }
            str = null;
        }
        if (str == null) {
            UiBlockInteractiveVkMix a6 = audVar.a();
            str = (a6 == null || (uIBlockPlaceholder = a6.D) == null) ? null : uIBlockPlaceholder.z;
            if (str == null) {
                str = "";
            }
        }
        if (l4v0Var == null || (a3 = l4v0Var.a()) == null) {
            return;
        }
        a3.a = str;
        a3.b = str;
        StartPlaySource j = this.b.j();
        StartPlayVkMixSource startPlayVkMixSource = j instanceof StartPlayVkMixSource ? (StartPlayVkMixSource) j : null;
        if (epx.f(startPlayVkMixSource != null ? startPlayVkMixSource.e : null, "common")) {
            a3.c = startPlayVkMixSource.h;
        }
    }

    @Override // com.vk.catalog2.feature.music.holders.vkmix.MusicVkMixVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        CatalogViewStyle catalogViewStyle = uIBlock.l;
        VkMixInteractiveViewStyle vkMixInteractiveViewStyle = catalogViewStyle instanceof VkMixInteractiveViewStyle ? (VkMixInteractiveViewStyle) catalogViewStyle : null;
        this.p = vkMixInteractiveViewStyle != null ? vkMixInteractiveViewStyle.b : null;
        N6(uIBlock);
    }

    public void o() {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }
}
