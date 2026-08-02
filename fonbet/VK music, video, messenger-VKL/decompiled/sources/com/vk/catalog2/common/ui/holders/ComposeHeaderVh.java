package com.vk.catalog2.common.ui.holders;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.badge.CatalogBadge;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.HeaderCatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockBadge;
import com.vk.catalog2.common.dto.ui.UIBlockHeader;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenScreen;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSearchTab;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSwitchSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockHideBlockButton;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.group.header.VkGroupHeader;
import com.vk.core.view.components.group.header.e;
import com.vkontakte.android.R;
import java.util.HashSet;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.b5a;
import xsna.drm0;
import xsna.e3m;
import xsna.fnj;
import xsna.fpf0;
import xsna.iah0;
import xsna.nf3;
import xsna.oq;
import xsna.p5j;
import xsna.q3a;
import xsna.qcy;
import xsna.qpi;
import xsna.rpi;
import xsna.spi;
import xsna.tlo0;
import xsna.tpi;
import xsna.tq;
import xsna.v40;
import xsna.w40;
import xsna.ww;
import xsna.xga;

/* compiled from: ComposeHeaderVh.kt */
/* loaded from: classes16.dex */
public class ComposeHeaderVh implements CatalogViewHolder {
    public static final /* synthetic */ qcy<Object>[] n = {new MutablePropertyReference1Impl(ComposeHeaderVh.class, "itemView", "getItemView()Lcom/vk/core/view/components/group/header/VkGroupHeader;", 0), p5j.a(0, ComposeHeaderVh.class, "title", "getTitle()Lcom/vk/core/view/components/group/header/VkGroupHeader$Title;", fpf0.a), new MutablePropertyReference1Impl(ComposeHeaderVh.class, "subtitle", "getSubtitle()Lcom/vk/core/view/components/group/header/VkGroupHeader$Subtitle;", 0), new MutablePropertyReference1Impl(ComposeHeaderVh.class, "buttonText", "getButtonText()Lcom/vk/core/view/components/group/header/VkGroupHeader$Right;", 0), new MutablePropertyReference1Impl(ComposeHeaderVh.class, SignalingProtocol.KEY_OPTIONS, "getOptions()Lcom/vk/core/view/components/group/header/VkGroupHeader$Right;", 0)};
    public final q3a b;
    public final b5a c;
    public final xga d;
    public final boolean e;
    public final nf3 f;
    public final qpi g;
    public final rpi h;
    public final spi i;
    public final tpi j;
    public UIBlockHeader k;
    public String l;
    public io.reactivex.rxjava3.disposables.c m;

    /* compiled from: ComposeHeaderVh.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[HeaderCatalogViewStyle.Style.values().length];
            try {
                iArr[HeaderCatalogViewStyle.Style.TwoLine.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogViewType.values().length];
            try {
                iArr2[CatalogViewType.HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[CatalogViewType.HEADER_LARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CatalogViewType.HEADER_COMPACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public ComposeHeaderVh() {
        this(null, null, false, 15);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void L() {
        io.reactivex.rxjava3.disposables.c cVar = this.m;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void N6(UIBlock uIBlock) {
        String str;
        CatalogBadge catalogBadge;
        String str2 = null;
        UIBlockHeader uIBlockHeader = uIBlock instanceof UIBlockHeader ? (UIBlockHeader) uIBlock : null;
        if (uIBlockHeader == null) {
            return;
        }
        String str3 = uIBlockHeader.z;
        String str4 = uIBlockHeader.y;
        if (str4 == null) {
            str4 = "";
        }
        CatalogViewStyle catalogViewStyle = uIBlock.l;
        HeaderCatalogViewStyle headerCatalogViewStyle = catalogViewStyle instanceof HeaderCatalogViewStyle ? (HeaderCatalogViewStyle) catalogViewStyle : null;
        HeaderCatalogViewStyle.Style style = headerCatalogViewStyle != null ? headerCatalogViewStyle.b : null;
        VkGroupHeader.d dVar = new VkGroupHeader.d(str4, null, null, null, (style == null ? -1 : a.$EnumSwitchMapping$0[style.ordinal()]) == 1 ? 2 : Integer.MAX_VALUE, null, 446);
        qcy<?>[] qcyVarArr = n;
        qcy<?> qcyVar = qcyVarArr[1];
        qpi qpiVar = this.g;
        qpiVar.setValue(this, qcyVar, dVar);
        if (this.e) {
            View findViewById = a().findViewById(R.id.ds_internal_group_header_right_layout);
            findViewById.setPadding(e3m.a(R.dimen.vk_ui_spacing_size_xl, a().getContext()), findViewById.getPaddingTop(), findViewById.getPaddingRight(), findViewById.getPaddingBottom());
            VkGroupHeader a2 = a();
            a2.setPadding(a2.getPaddingLeft(), a2.getPaddingTop(), a2.getPaddingRight(), e3m.a(R.dimen.vk_ui_spacing_size_m, a().getContext()));
        }
        this.h.setValue(this, qcyVarArr[2], !(str3 == null || drm0.N(str3)) ? new VkGroupHeader.c(str3, null, null, 14) : null);
        VkGroupHeader a3 = a();
        int i = a.$EnumSwitchMapping$1[uIBlock.d.ordinal()];
        a3.setSize(i != 1 ? i != 2 ? i != 3 ? VkGroupHeader.Size.Large : VkGroupHeader.Size.Small : VkGroupHeader.Size.Large : VkGroupHeader.Size.Medium);
        qcy<?> qcyVar2 = qcyVarArr[4];
        tpi tpiVar = this.j;
        tpiVar.setValue(this, qcyVar2, null);
        UIBlockActionOpenScreen uIBlockActionOpenScreen = uIBlockHeader.I;
        if (uIBlockActionOpenScreen == null || (str = uIBlockActionOpenScreen.z) == null) {
            UIBlockActionOpenSection uIBlockActionOpenSection = uIBlockHeader.E;
            if (uIBlockActionOpenSection != null) {
                str = uIBlockActionOpenSection.z;
            } else {
                UIBlockActionSwitchSection uIBlockActionSwitchSection = uIBlockHeader.F;
                str = uIBlockActionSwitchSection != null ? uIBlockActionSwitchSection.z : null;
                if (str == null) {
                    UIBlockActionOpenSearchTab uIBlockActionOpenSearchTab = uIBlockHeader.G;
                    str = uIBlockActionOpenSearchTab != null ? uIBlockActionOpenSearchTab.z : null;
                    if (str == null) {
                        UIBlockActionOpenUrl uIBlockActionOpenUrl = uIBlockHeader.J;
                        str = uIBlockActionOpenUrl != null ? uIBlockActionOpenUrl.z : null;
                    }
                }
            }
        }
        UIBlockHideBlockButton uIBlockHideBlockButton = uIBlockHeader.K;
        if (uIBlockHideBlockButton != null) {
            c(null);
            tpiVar.setValue(this, qcyVarArr[4], new VkGroupHeader.Right(new VkGroupHeader.Right.ExtraContent.c(new ww(8, this, uIBlockHideBlockButton), tq.h(tlo0.Companion, R.string.common_actions)), null, null, 6));
        } else if (uIBlockHeader.D != null) {
            c(new VkGroupHeader.Right(new VkGroupHeader.Right.ExtraContent.Dropdown(a().getContext().getString(R.string.catalog_lists), new v40(this, 28)), null, null, 6));
        } else if (str != null) {
            c(new VkGroupHeader.Right(new VkGroupHeader.Right.ExtraContent.a(oq.d(tlo0.Companion, str), new w40(this, 28), null, null, VkButton.Appearance.Accent, null, 492), null, null, 6));
        } else {
            c(null);
        }
        this.l = str;
        UIBlockBadge uIBlockBadge = uIBlockHeader.C;
        if (uIBlockBadge != null && (catalogBadge = uIBlockBadge.y) != null) {
            str2 = catalogBadge.b;
        }
        if (str2 != null && str2.length() > 0) {
            qpiVar.setValue(this, qcyVarArr[1], new VkGroupHeader.d(qpiVar.getValue(this, qcyVarArr[1]).a, null, new e(str2), null, 0, 502));
        }
        this.k = uIBlockHeader;
    }

    public final VkGroupHeader a() {
        return (VkGroupHeader) this.f.getValue(this, n[0]);
    }

    public final void c(VkGroupHeader.Right right) {
        this.i.setValue(this, n[3], right);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VkGroupHeader vkGroupHeader = new VkGroupHeader(layoutInflater.getContext(), null, 6);
        qcy<Object> qcyVar = n[0];
        this.f.c = vkGroupHeader;
        ConstraintLayout constraintLayout = (ConstraintLayout) vkGroupHeader.findViewById(R.id.ds_internal_group_header_root);
        Context context = vkGroupHeader.getContext();
        HashSet hashSet = iah0.a;
        int a2 = e3m.a(fnj.b(context) ? R.dimen.vk_standard_list_item_padding : R.dimen.vk_ui_spacing_size_xl, vkGroupHeader.getContext());
        constraintLayout.setPadding(a2, constraintLayout.getPaddingTop(), a2, constraintLayout.getPaddingBottom());
        return vkGroupHeader;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public boolean ze(Rect rect) {
        return false;
    }

    public ComposeHeaderVh(q3a q3aVar, b5a b5aVar, boolean z, int i) {
        q3aVar = (i & 1) != 0 ? null : q3aVar;
        b5aVar = (i & 2) != 0 ? null : b5aVar;
        xga xgaVar = new xga();
        z = (i & 8) != 0 ? false : z;
        this.b = q3aVar;
        this.c = b5aVar;
        this.d = xgaVar;
        this.e = z;
        this.f = new nf3();
        this.g = new qpi(new VkGroupHeader.d("", null, null, null, 0, null, 510), this);
        this.h = new rpi(this);
        this.i = new spi(this);
        this.j = new tpi(this);
    }

    public void b(ClickType clickType) {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
