package com.vk.catalog2.feature.music.ui.holder;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Values;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.compose.component.semantics.b;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.im.Image;
import com.vk.toggle.features.MusicFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.abg0;
import xsna.av40;
import xsna.awd;
import xsna.b5a;
import xsna.b8g;
import xsna.bwt0;
import xsna.dhr0;
import xsna.e3m;
import xsna.epx;
import xsna.fpf0;
import xsna.g380;
import xsna.gko;
import xsna.h720;
import xsna.iah0;
import xsna.j5g;
import xsna.mba;
import xsna.nda;
import xsna.oq;
import xsna.p5j;
import xsna.qcy;
import xsna.qhv0;
import xsna.qx;
import xsna.rl3;
import xsna.tlo0;
import xsna.tsk;
import xsna.ulw;
import xsna.upj0;
import xsna.vlw;
import xsna.wng0;
import xsna.wo40;
import xsna.x8m;
import xsna.yu40;
import xsna.zu40;

/* compiled from: MusicPlaceholderVh.kt */
/* loaded from: classes16.dex */
public final class MusicPlaceholderVh implements CatalogViewHolder, g380 {
    public static final /* synthetic */ qcy<Object>[] o = {new MutablePropertyReference1Impl(MusicPlaceholderVh.class, "top", "getTop()Lcom/vk/core/view/components/placeholder/VkPlaceholder$Top;", 0), p5j.a(0, MusicPlaceholderVh.class, "middle", "getMiddle()Lcom/vk/core/view/components/placeholder/VkPlaceholder$Middle;", fpf0.a), new MutablePropertyReference1Impl(MusicPlaceholderVh.class, "bottom", "getBottom()Lcom/vk/core/view/components/placeholder/VkPlaceholder$Bottom;", 0)};
    public final com.vk.catalog2.common.ui.mvp.util.a b;
    public final b5a c;
    public final Integer d;
    public final mba e;
    public final int f;
    public final nda g;
    public final boolean h;
    public VkPlaceholder i;
    public View j;
    public final yu40 k;
    public final zu40 l;
    public final av40 m;
    public UIBlockPlaceholder n;

    public MusicPlaceholderVh(com.vk.catalog2.common.ui.mvp.util.a aVar, b5a b5aVar, Integer num, mba mbaVar, nda ndaVar, int i) {
        num = (i & 4) != 0 ? null : num;
        mbaVar = (i & 8) != 0 ? null : mbaVar;
        int i2 = (i & 16) != 0 ? R.layout.catalog_music_placeholder_view : R.layout.catalog_music_offline_placeholder_view;
        ndaVar = (i & 32) != 0 ? null : ndaVar;
        boolean z = (i & 64) == 0;
        this.b = aVar;
        this.c = b5aVar;
        this.d = num;
        this.e = mbaVar;
        this.f = i2;
        this.g = ndaVar;
        this.h = z;
        this.k = new yu40(this);
        this.l = new zu40(this);
        this.m = new av40(this);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.b.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [com.vk.catalog2.common.dto.api.ui.action.UIBlockAction[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v18, types: [android.view.View] */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        VkPlaceholder vkPlaceholder;
        VkPlaceholder.c.C0856c b;
        Image image;
        String str;
        com.vk.catalog2.common.ui.mvp.util.a aVar;
        Object obj;
        Object obj2;
        Object obj3;
        VkPlaceholder.a.C0854a a;
        if (uIBlock instanceof UIBlockPlaceholder) {
            UIBlockPlaceholder uIBlockPlaceholder = (UIBlockPlaceholder) uIBlock;
            String str2 = uIBlockPlaceholder.A;
            this.n = uIBlockPlaceholder;
            tlo0.h d = (this.h && str2.length() == 0) ? null : oq.d(tlo0.Companion, str2);
            com.vk.core.compose.component.semantics.a a2 = b.a(null, new wo40(3), 3);
            tlo0.a aVar2 = tlo0.Companion;
            String str3 = uIBlockPlaceholder.D;
            if (str3 == null) {
                str3 = "";
            }
            VkPlaceholder.b bVar = new VkPlaceholder.b(d, a2, oq.d(aVar2, str3), b.a(null, new x8m(23), 3));
            zu40 zu40Var = this.l;
            qcy<?>[] qcyVarArr = o;
            zu40Var.setValue(this, qcyVarArr[1], bVar);
            UIBlockPlaceholder uIBlockPlaceholder2 = this.n;
            if (uIBlockPlaceholder2 != null) {
                View view = this.j;
                if (view == null) {
                    view = null;
                }
                Context context = view.getContext();
                if (context != null) {
                    ArrayList<UIBlockAction> arrayList = uIBlockPlaceholder2.G;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        aVar = this.b;
                        if (!hasNext) {
                            break;
                        }
                        Object next = it.next();
                        aVar.getClass();
                        if (com.vk.catalog2.common.ui.mvp.util.a.d((UIBlockAction) next)) {
                            arrayList2.add(next);
                        }
                    }
                    ?? r10 = new UIBlockAction[3];
                    ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            obj = null;
                            break;
                        }
                        obj = listIterator.previous();
                        aVar.getClass();
                        if (com.vk.catalog2.common.ui.mvp.util.a.b((UIBlockAction) obj) == VkButton.Mode.Primary) {
                            break;
                        }
                    }
                    r10[0] = obj;
                    ListIterator listIterator2 = arrayList2.listIterator(arrayList2.size());
                    while (true) {
                        if (!listIterator2.hasPrevious()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = listIterator2.previous();
                        aVar.getClass();
                        if (com.vk.catalog2.common.ui.mvp.util.a.b((UIBlockAction) obj2) == VkButton.Mode.Secondary) {
                            break;
                        }
                    }
                    r10[1] = obj2;
                    ListIterator listIterator3 = arrayList2.listIterator(arrayList2.size());
                    while (true) {
                        if (!listIterator3.hasPrevious()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = listIterator3.previous();
                        aVar.getClass();
                        if (com.vk.catalog2.common.ui.mvp.util.a.b((UIBlockAction) obj3) == VkButton.Mode.Tertiary) {
                            break;
                        }
                    }
                    r10[2] = obj3;
                    List I = rl3.I(r10);
                    ArrayList arrayList3 = (ArrayList) I;
                    if (!arrayList3.isEmpty() && (a = a((UIBlockAction) arrayList3.get(0), context, uIBlockPlaceholder2, "MusicUiHolderPlaceholderFirstButton")) != null) {
                        UIBlockAction uIBlockAction = (UIBlockAction) j5g.b0(1, I);
                        VkPlaceholder.a.C0854a a3 = uIBlockAction != null ? a(uIBlockAction, context, uIBlockPlaceholder2, "MusicUiHolderPlaceholderSecondButton") : null;
                        UIBlockAction uIBlockAction2 = (UIBlockAction) j5g.b0(2, I);
                        this.m.setValue(this, qcyVarArr[2], new VkPlaceholder.a(a, a3, uIBlockAction2 != null ? a(uIBlockAction2, context, uIBlockPlaceholder2, "MusicUiHolderPlaceholderThirdButton") : null));
                    }
                }
            }
            if (epx.f(uIBlockPlaceholder.z, "synthetic_offline_my_audios_placeholder_id")) {
                b = b(R.drawable.vk_icon_download_outline_28);
                vkPlaceholder = null;
            } else {
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(dhr0.t.c(R.attr.vk_ui_icon_medium), PorterDuff.Mode.SRC_ATOP);
                View view2 = this.j;
                if (view2 == null) {
                    view2 = null;
                }
                Context context2 = view2.getContext();
                int a4 = context2 != null ? e3m.a(R.dimen.catalog_music_placeholder_icon_height, context2) : 0;
                com.vk.dto.common.Image image2 = uIBlockPlaceholder.B;
                ImageSize Cb = image2 != null ? image2.Cb(a4, false, true) : null;
                if (Cb == null || (str = (image = Cb.d).d) == null) {
                    vkPlaceholder = null;
                    Integer num = this.d;
                    b = num != null ? b(num.intValue()) : null;
                } else {
                    vlw vlwVar = new vlw(str, qhv0.c.a);
                    Size size = new Size(image.b, image.c);
                    h720 h720Var = new h720(str, 1);
                    vkPlaceholder = null;
                    b = new VkPlaceholder.c.C0856c(vlwVar, size, porterDuffColorFilter, null, b.a(null, h720Var, 3), 56);
                }
            }
            this.k.setValue(this, qcyVarArr[0], b);
            VkPlaceholder vkPlaceholder2 = this.i;
            if (vkPlaceholder2 == null) {
                vkPlaceholder2 = vkPlaceholder;
            }
            vkPlaceholder2.post(new tsk(this, 4));
            ?? r2 = this.j;
            bwt0.Q(r2 == 0 ? vkPlaceholder : r2, R.id.catalog_ui_test_placeholder, uIBlock.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bc  */
    /* JADX WARN: Type inference failed for: r14v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final VkPlaceholder.a.C0854a a(UIBlockAction uIBlockAction, Context context, UIBlockPlaceholder uIBlockPlaceholder, String str) {
        VkPlaceholder.a.C0854a.C0855a c0855a;
        VkPlaceholder.a.C0854a.C0855a c0855a2;
        VkButton.Mode b;
        String str2;
        VkPlaceholder.a.C0854a.C0855a c0855a3;
        qx qxVar = new qx(this, uIBlockAction, context, uIBlockPlaceholder, 3);
        VkButton.Appearance appearance = VkButton.Appearance.Accent;
        this.b.getClass();
        if (uIBlockAction.d == CatalogViewType.SYNTHETIC_ACTION_CLOSE_BANNER) {
            return null;
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = com.vk.catalog2.common.ui.mvp.util.a.c(uIBlockAction);
        if (uIBlockAction instanceof UIBlockActionOpenUrl) {
            UIBlockActionOpenUrl uIBlockActionOpenUrl = (UIBlockActionOpenUrl) uIBlockAction;
            String str3 = uIBlockActionOpenUrl.C;
            ref$ObjectRef.element = uIBlockActionOpenUrl.z;
            if (CatalogCustomAttributes$Values.OUTLINE_WITH_CHEVRON.i(uIBlockActionOpenUrl.B)) {
                if (!epx.f(str3, "recoms_onboarding_heart") || !MusicFeatures.ONBOARDING_MUSIC.h()) {
                    c0855a2 = new VkPlaceholder.a.C0854a.C0855a(new gko(R.drawable.vk_icon_chevron_16), new b8g(dhr0.t.c(R.attr.vk_ui_icon_accent_themed)));
                    c0855a = null;
                    b = com.vk.catalog2.common.ui.mvp.util.a.b(uIBlockAction);
                    if (b == null) {
                        b = VkButton.Mode.Primary;
                    }
                    VkButton.Mode mode = b;
                    tlo0.a aVar = tlo0.Companion;
                    str2 = (String) ref$ObjectRef.element;
                    if (str2 == null) {
                        str2 = "";
                    }
                    return new VkPlaceholder.a.C0854a(oq.d(aVar, str2), qxVar, c0855a, c0855a2, null, mode, appearance, false, b.a(null, new com.vk.im.engine.commands.messages.a(6, str, ref$ObjectRef), 3), 112);
                }
                c0855a3 = new VkPlaceholder.a.C0854a.C0855a(new gko(R.drawable.vk_icon_heart_settings_outline_20), new b8g(dhr0.t.c(R.attr.vk_ui_icon_accent_themed)));
            } else if (str3 != null && str3.equals("switch_24")) {
                c0855a3 = new VkPlaceholder.a.C0854a.C0855a(new gko(R.drawable.vk_icon_switch_24), new b8g(dhr0.t.c(R.attr.vk_ui_icon_accent_themed)));
            }
            c0855a = c0855a3;
            c0855a2 = null;
            b = com.vk.catalog2.common.ui.mvp.util.a.b(uIBlockAction);
            if (b == null) {
            }
            VkButton.Mode mode2 = b;
            tlo0.a aVar2 = tlo0.Companion;
            str2 = (String) ref$ObjectRef.element;
            if (str2 == null) {
            }
            return new VkPlaceholder.a.C0854a(oq.d(aVar2, str2), qxVar, c0855a, c0855a2, null, mode2, appearance, false, b.a(null, new com.vk.im.engine.commands.messages.a(6, str, ref$ObjectRef), 3), 112);
        }
        c0855a = null;
        c0855a2 = null;
        b = com.vk.catalog2.common.ui.mvp.util.a.b(uIBlockAction);
        if (b == null) {
        }
        VkButton.Mode mode22 = b;
        tlo0.a aVar22 = tlo0.Companion;
        str2 = (String) ref$ObjectRef.element;
        if (str2 == null) {
        }
        return new VkPlaceholder.a.C0854a(oq.d(aVar22, str2), qxVar, c0855a, c0855a2, null, mode22, appearance, false, b.a(null, new com.vk.im.engine.commands.messages.a(6, str, ref$ObjectRef), 3), 112);
    }

    public final VkPlaceholder.c.C0856c b(int i) {
        View view = this.j;
        if (view == null) {
            view = null;
        }
        Context context = view.getContext();
        int a = context != null ? e3m.a(R.dimen.catalog_music_placeholder_icon_height, context) : 0;
        abg0 abg0Var = dhr0.t;
        wng0 wng0Var = new wng0(abg0Var.c(R.attr.vk_ui_background_secondary_alpha), iah0.a(12));
        wng0Var.setBounds(0, 0, a, a);
        return new VkPlaceholder.c.C0856c(new ulw(i), new Size(a, a), new upj0(abg0Var.c(R.attr.vk_ui_icon_medium)), wng0Var, b.a(null, new awd(i, 1), 3), 16);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.f, viewGroup, false);
        this.i = (VkPlaceholder) inflate.findViewById(R.id.catalog_placeholder);
        this.j = inflate;
        return inflate;
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        VkPlaceholder vkPlaceholder = this.i;
        if (vkPlaceholder == null) {
            vkPlaceholder = null;
        }
        vkPlaceholder.post(new tsk(this, 4));
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
