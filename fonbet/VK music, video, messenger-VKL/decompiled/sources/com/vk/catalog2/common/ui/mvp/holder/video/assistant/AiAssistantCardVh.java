package com.vk.catalog2.common.ui.mvp.holder.video.assistant;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.k;
import androidx.compose.ui.platform.ComposeView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.video.CatalogAiAssistantItem;
import com.vk.catalog2.common.dto.ui.UIBlockAiAssistant;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.video.assistant.c;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoAlbum;
import com.vk.movika.tools.controls.seekbar.h;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoAssistantChatOpenClick;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoAssistantLoaderShow;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.video.assistant.api.domain.model.AiAssistantType;
import com.vk.video.assistant.api.router.AiAssistantArguments;
import xsna.b25;
import xsna.bdn;
import xsna.bjc;
import xsna.bpn0;
import xsna.cb;
import xsna.e3m;
import xsna.epx;
import xsna.fks0;
import xsna.fxc0;
import xsna.hpj;
import xsna.ie00;
import xsna.jai;
import xsna.jc1;
import xsna.kc1;
import xsna.lc1;
import xsna.mc1;
import xsna.myc0;
import xsna.nc1;
import xsna.oc1;
import xsna.q3a;
import xsna.vb1;
import xsna.wh50;
import xsna.whn0;
import xsna.ydt0;
import xsna.yok0;
import xsna.zak0;
import xsna.zvj;

/* compiled from: AiAssistantCardVh.kt */
/* loaded from: classes16.dex */
public final class AiAssistantCardVh implements CatalogViewHolder {
    public final nc1 b;
    public final mc1 c;
    public final lc1 d;
    public final q3a e;
    public final b25 f;
    public final fks0 g;
    public final hpj h;
    public yok0 i;
    public UIBlockAiAssistant j;
    public oc1 k;
    public final wh50 l;
    public FrameLayout m;
    public Context n;

    /* compiled from: AiAssistantCardVh.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AiAssistantType.values().length];
            try {
                iArr[AiAssistantType.MUSIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AiAssistantType.COMMON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AiAssistantCardVh(nc1 nc1Var, mc1 mc1Var, lc1 lc1Var, q3a q3aVar, b25 b25Var, fks0 fks0Var) {
        this.b = nc1Var;
        this.c = mc1Var;
        this.d = lc1Var;
        this.e = q3aVar;
        this.f = b25Var;
        this.g = fks0Var;
        bdn bdnVar = bdn.a;
        this.h = zvj.a(ie00.a.U().plus(whn0.a()));
        this.l = k.b(c.C0512c.a);
        new bpn0(new cb(this, 4));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        zvj.c(this.h, null);
        FrameLayout frameLayout = this.m;
        if (frameLayout == null) {
            frameLayout = null;
        }
        frameLayout.removeAllViews();
        this.j = null;
        this.k = null;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        CatalogAiAssistantItem catalogAiAssistantItem;
        if ((uIBlock instanceof UIBlockAiAssistant) && !epx.f(this.j, uIBlock)) {
            UIBlockAiAssistant uIBlockAiAssistant = (UIBlockAiAssistant) uIBlock;
            this.j = uIBlockAiAssistant;
            this.k = null;
            ((zak0) this.l).setValue(c.C0512c.a);
            String a2 = a();
            UIBlockAiAssistant uIBlockAiAssistant2 = this.j;
            String str = (uIBlockAiAssistant2 == null || (catalogAiAssistantItem = uIBlockAiAssistant2.y) == null) ? null : catalogAiAssistantItem.c;
            String valueOf = String.valueOf(System.currentTimeMillis());
            vb1.b(new CommonVideoStat$TypeVideoAssistantLoaderShow(CommonVideoStat$TypeVideoAssistantLoaderShow.EventType.ASSISTANT_LOADER_SHOW, vb1.a(str), a2), valueOf, valueOf);
            FrameLayout frameLayout = this.m;
            if (frameLayout == null) {
                frameLayout = null;
            }
            frameLayout.removeAllViews();
            FrameLayout frameLayout2 = this.m;
            if (frameLayout2 == null) {
                frameLayout2 = null;
            }
            Context context = this.n;
            if (context == null) {
                context = null;
            }
            ComposeView composeView = new ComposeView(context, null, 6);
            composeView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            composeView.setContent(new jai(-36850374, new h(this, 1), true));
            frameLayout2.addView(composeView);
            CatalogAiAssistantItem catalogAiAssistantItem2 = uIBlockAiAssistant.y;
            String str2 = catalogAiAssistantItem2 != null ? catalogAiAssistantItem2.e : null;
            if (catalogAiAssistantItem2 != null && str2 != null) {
                String str3 = catalogAiAssistantItem2.d;
                String str4 = catalogAiAssistantItem2 != null ? catalogAiAssistantItem2.c : null;
                yok0 yok0Var = this.i;
                if (yok0Var != null) {
                    yok0Var.b(null);
                }
                this.i = myc0.h(this.h, null, null, new jc1(str4, this, str2, str3, null), 3);
            }
        }
    }

    public final String a() {
        CatalogAiAssistantItem catalogAiAssistantItem;
        UIBlockAiAssistant uIBlockAiAssistant = this.j;
        if (uIBlockAiAssistant == null || (catalogAiAssistantItem = uIBlockAiAssistant.y) == null) {
            return null;
        }
        return catalogAiAssistantItem.d;
    }

    public final void b() {
        CatalogAiAssistantItem catalogAiAssistantItem;
        CatalogAiAssistantItem catalogAiAssistantItem2;
        UIBlockAiAssistant uIBlockAiAssistant = this.j;
        String str = (uIBlockAiAssistant == null || (catalogAiAssistantItem2 = uIBlockAiAssistant.y) == null) ? null : catalogAiAssistantItem2.c;
        new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO_AI_ASSISTANT, null, null, null, null, null, 62, null), new CommonVideoStat$TypeVideoAssistantChatOpenClick(CommonVideoStat$TypeVideoAssistantChatOpenClick.EventType.ASSISTANT_CHAT_OPEN_CLICK, CommonVideoStat$TypeVideoAssistantChatOpenClick.Source.SEARCH, vb1.a(str), null, (uIBlockAiAssistant == null || (catalogAiAssistantItem = uIBlockAiAssistant.y) == null) ? null : catalogAiAssistantItem.d, null, CommonVideoStat$TypeVideoAssistantChatOpenClick.ClickType.NEW, 32, null), 2)).q();
        new AiAssistantArguments(new AiAssistantArguments.EntryPoint.SearchBanner(null, null), a());
        AiAssistantType.Companion.getClass();
        AiAssistantType.a.a(str);
        this.b.getClass();
    }

    public final void c(int i, UserId userId) {
        Context context = this.n;
        if (context == null) {
            context = null;
        }
        Activity h = e3m.h(context);
        if (h == null) {
            return;
        }
        ydt0.e(fxc0.B().Y(), h, new VideoAlbum(i, userId, null, null, 0, 0, null, false, null, false, false, 0, null, null, false, null, null, null, 262136, null), null, null, 28);
    }

    public final void d() {
        c cVar = (c) ((zak0) this.l).getValue();
        if (cVar instanceof c.d) {
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        myc0.h(this.h, null, null, new kc1(this, null), 3);
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        this.m = frameLayout;
        this.n = frameLayout.getContext();
        return frameLayout;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
