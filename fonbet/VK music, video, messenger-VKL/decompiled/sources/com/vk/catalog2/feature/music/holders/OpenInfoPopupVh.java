package com.vk.catalog2.feature.music.holders;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.MBridgeConstans;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenInfoPopup;
import com.vk.catalog2.common.ui.holders.ActionVh;
import com.vk.core.formatters.spans.ThemedForegroundColorSpan;
import com.vk.core.ui.modal.VkModal;
import com.vk.core.ui.modal.b;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vkontakte.android.R;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.c5v0;
import xsna.epx;
import xsna.f4m;
import xsna.fpf0;
import xsna.gko;
import xsna.hp30;
import xsna.iah0;
import xsna.k1u0;
import xsna.nf3;
import xsna.oq;
import xsna.qcy;
import xsna.s3q0;
import xsna.tlo0;
import xsna.tq;
import xsna.vlw;
import xsna.x7g;

/* compiled from: OpenInfoPopupVh.kt */
/* loaded from: classes16.dex */
public final class OpenInfoPopupVh extends ActionVh {
    public static final /* synthetic */ qcy<Object>[] d;
    public final nf3 b = new nf3();
    public UIBlockActionOpenInfoPopup c;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(OpenInfoPopupVh.class, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "getView()Lcom/vk/core/view/components/cell/VkCell;", 0);
        fpf0.a.getClass();
        d = new qcy[]{mutablePropertyReference1Impl};
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        VkCell.Middle.e.b.C0817b c0817b;
        if (uIBlock instanceof UIBlockActionOpenInfoPopup) {
            UIBlockActionOpenInfoPopup uIBlockActionOpenInfoPopup = (UIBlockActionOpenInfoPopup) uIBlock;
            this.c = uIBlockActionOpenInfoPopup;
            qcy<Object>[] qcyVarArr = d;
            qcy<Object> qcyVar = qcyVarArr[0];
            nf3 nf3Var = this.b;
            VkCell vkCell = (VkCell) nf3Var.getValue(this, qcyVar);
            String str = uIBlockActionOpenInfoPopup.B;
            Integer valueOf = epx.f(uIBlockActionOpenInfoPopup.C, "info_circle_16") ? Integer.valueOf(R.drawable.vk_icon_info_circle_16) : null;
            VkCell.Middle.a aVar = VkCell.Middle.Companion;
            tlo0.a aVar2 = tlo0.Companion;
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new ThemedForegroundColorSpan(R.attr.vk_ui_text_secondary), 0, str.length(), 18);
            s3q0 s3q0Var = s3q0.a;
            aVar2.getClass();
            tlo0.h hVar = new tlo0.h(spannableString);
            if (valueOf != null) {
                float f = 16;
                c0817b = new VkCell.Middle.e.b.C0817b(new gko(valueOf.intValue()), new k1u0.a(new x7g(R.attr.vk_ui_icon_secondary)), (tlo0.f) null, new Size(iah0.a(f), iah0.a(f)), 4);
            } else {
                c0817b = null;
            }
            vkCell.setMiddle(VkCell.Middle.a.a(aVar, new VkCell.Middle.e(hVar, 0, (TextUtils.TruncateAt) null, c0817b, new VkCell.Middle.e.b.C0817b(new gko(R.drawable.vk_icon_chevron_compact_right_24), new k1u0.a(new x7g(R.attr.vk_ui_icon_tertiary)), (tlo0.f) null, new Size(iah0.a(16), iah0.a(24)), 4), 14), null, null, 14));
            ((VkCell) nf3Var.getValue(this, qcyVarArr[0])).setOnClickListener(this);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VkCell vkCell = new VkCell(layoutInflater.getContext(), null, 6, 0);
        vkCell.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        qcy<Object> qcyVar = d[0];
        this.b.c = vkCell;
        return vkCell;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [T, xsna.dw20] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        c5v0.c.C2644c c2644c;
        ImageSize Cb;
        UIBlockActionOpenInfoPopup uIBlockActionOpenInfoPopup = this.c;
        if (uIBlockActionOpenInfoPopup == null || view == null || (context = view.getContext()) == null) {
            return;
        }
        Image image = uIBlockActionOpenInfoPopup.D;
        String str = (image == null || (Cb = image.Cb(iah0.a((float) 56), true, true)) == null) ? null : Cb.d.d;
        String str2 = uIBlockActionOpenInfoPopup.z;
        if (str2.length() <= 0) {
            str2 = null;
        }
        tlo0.h d2 = str2 != null ? oq.d(tlo0.Companion, str2) : null;
        String str3 = uIBlockActionOpenInfoPopup.A;
        if (str3.length() <= 0) {
            str3 = null;
        }
        tlo0.h d3 = str3 != null ? oq.d(tlo0.Companion, str3) : null;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        c5v0 c5v0Var = new c5v0(context);
        if (str != null) {
            int a = iah0.a(56);
            c2644c = new c5v0.c.C2644c(new vlw(str, null), new Size(a, a), false, 4);
        } else {
            c2644c = null;
        }
        c5v0Var.setTop(c2644c);
        c5v0Var.setMain(new c5v0.b(12, d2, d3));
        c5v0Var.setButtons(new c5v0.a(new c5v0.a.C2643a(tq.h(tlo0.Companion, R.string.music_info_popup_button), new hp30(ref$ObjectRef, 7), null, null, null, false, IronSourceError.ERROR_CODE_INIT_FAILED), (c5v0.a.C2643a) null, 6));
        c5v0Var.setWithPaddings(false);
        f4m.y(iah0.a(24), c5v0Var);
        ref$ObjectRef.element = new VkModal(VkModal.Mode.Card, new b.a.C0790b(null, null, c5v0Var, null, 27), null, false, 28).b(context, "MusicInfoModalCard");
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }
}
