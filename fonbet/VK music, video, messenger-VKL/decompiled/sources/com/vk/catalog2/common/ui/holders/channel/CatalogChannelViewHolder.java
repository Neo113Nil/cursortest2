package com.vk.catalog2.common.ui.holders.channel;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.channel.CatalogChannel;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockChannel;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.cell.VkCell;
import com.vk.imageloader.view.VKImageView;
import com.vk.movika.sdk.base.logic.interactor.h;
import com.vkontakte.android.R;
import xsna.b5a;
import xsna.bwt0;
import xsna.c98;
import xsna.cn70;
import xsna.cz;
import xsna.dhr0;
import xsna.dko;
import xsna.epx;
import xsna.gdb;
import xsna.gko;
import xsna.gzs;
import xsna.ho8;
import xsna.j3a;
import xsna.js5;
import xsna.ju;
import xsna.k1u0;
import xsna.ktr;
import xsna.m3a;
import xsna.n14;
import xsna.oo;
import xsna.oq;
import xsna.tlo0;
import xsna.tq;
import xsna.x7g;

/* compiled from: CatalogChannelViewHolder.kt */
/* loaded from: classes16.dex */
public final class CatalogChannelViewHolder implements CatalogViewHolder {
    public final gdb b;
    public VkCell c;

    /* compiled from: CatalogChannelViewHolder.kt */
    public static final class a implements VkCell.f {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("AvatarViewParams(avatarUri="), this.a, ')');
        }
    }

    /* compiled from: CatalogChannelViewHolder.kt */
    public static final class b implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new c(context);
        }
    }

    /* compiled from: CatalogChannelViewHolder.kt */
    public static final class c implements VkCell.d {
        public final VKImageView a;

        public c(Context context) {
            VKImageView vKImageView = new VKImageView(context, null, 6, 0);
            bwt0.d(vKImageView, cn70.b(24), (r4 & 2) != 0, (r4 & 4) != 0);
            vKImageView.setPlaceholderImage(dhr0.w(R.drawable.user_placeholder, bwt0.t(context)));
            this.a = vKImageView;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            a aVar = fVar instanceof a ? (a) fVar : null;
            if (aVar != null) {
                this.a.o0(aVar.a, null);
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    public CatalogChannelViewHolder(m3a m3aVar, b5a b5aVar) {
        this.b = new gdb(this, m3aVar, b5aVar);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.b.d.e();
        this.c = null;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockChannel) {
            UIBlockChannel uIBlockChannel = (UIBlockChannel) uIBlock;
            CatalogChannel catalogChannel = uIBlockChannel.y;
            String a2 = js5.a(cn70.b(48), catalogChannel.c);
            VkCell vkCell = this.c;
            if (vkCell != null) {
                vkCell.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.a(new a(String.valueOf(a2)), VkCell.Left.Main.Size.Medium)));
            }
            VkCell vkCell2 = this.c;
            if (vkCell2 != null) {
                vkCell2.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(oq.d(tlo0.Companion, catalogChannel.d), 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, catalogChannel.e ? new VkCell.Middle.e.b.C0817b(new gko(R.drawable.vk_icon_verified_16), new k1u0.a(new x7g(R.attr.vk_ui_icon_accent)), (tlo0.f) null, (Size) null, 12) : null, 18), null, null, 14));
            }
            a(catalogChannel);
            gdb gdbVar = this.b;
            gdbVar.e = uIBlockChannel;
            gdbVar.d.b(ktr.c(gdbVar.c.a).b0(j3a.class).subscribe(new cz(new ju(3, uIBlockChannel, gdbVar), 12)));
        }
    }

    public final void a(CatalogChannel catalogChannel) {
        VkCell.Right.d a2;
        if (catalogChannel.h) {
            VkCell.Right.c cVar = VkCell.Right.Companion;
            gko.b bVar = gko.Companion;
            a2 = VkCell.Right.c.a(cVar, null, new VkCell.Right.e.b((dko) new gko(R.drawable.vk_icon_done_outline_28), (k1u0) new k1u0.a(new x7g(R.attr.vk_ui_icon_medium)), (Size) null, (tlo0) tq.h(tlo0.Companion, R.string.catalog_channel_leave_accessibility), false, (gzs) new oo(this, 10), 16), null, null, 29);
        } else if (catalogChannel.g || catalogChannel.f) {
            a2 = null;
        } else {
            VkCell.Right.c cVar2 = VkCell.Right.Companion;
            gko.b bVar2 = gko.Companion;
            a2 = VkCell.Right.c.a(cVar2, null, new VkCell.Right.e.b((dko) new gko(R.drawable.vk_icon_add_square_outline_28), (k1u0) new k1u0.a(new x7g(R.attr.vk_ui_icon_accent)), (Size) null, (tlo0) tq.h(tlo0.Companion, R.string.catalog_channel_join_accessibility), false, (gzs) new h(this, 12), 16), null, null, 29);
        }
        VkCell vkCell = this.c;
        if (vkCell != null) {
            vkCell.setRight(a2);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_channel_list_item, viewGroup, false);
        VkCell vkCell = (VkCell) inflate.findViewById(R.id.catalog_channel);
        if (vkCell != null) {
            vkCell.setLeftMainAvatarController(new b());
            vkCell.setOnClickListener(new c98(new n14(this, 1), 1));
        } else {
            vkCell = null;
        }
        this.c = vkCell;
        return inflate;
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
