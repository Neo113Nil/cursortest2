package com.vk.catalog2.feature.music.holders;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.music.RadioStation;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.music.dto.ui.UIBlockRadioStation;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.music.Thumb;
import com.vk.music.track.a;
import com.vk.stat.scheme.CommonAudioStat$AudioDomainEventEntity;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.g;
import xsna.ai0;
import xsna.ajc;
import xsna.aoa;
import xsna.b5a;
import xsna.boa;
import xsna.doa;
import xsna.eoa;
import xsna.ew3;
import xsna.iah0;
import xsna.k840;
import xsna.oq;
import xsna.s750;
import xsna.tlo0;
import xsna.u2b0;
import xsna.u750;
import xsna.xue0;
import xsna.yue0;

/* compiled from: RadioStationCellVh.kt */
/* loaded from: classes16.dex */
public final class RadioStationCellVh implements CatalogViewHolder {
    public final u2b0 b;
    public final a c;
    public final b5a d;
    public final u750 e;
    public VkCell f;
    public UIBlockRadioStation g;
    public final g h;
    public final yue0 i;
    public final xue0 j;

    public RadioStationCellVh(u2b0 u2b0Var, a aVar, b5a b5aVar) {
        this.b = u2b0Var;
        this.c = aVar;
        this.d = b5aVar;
        s750 s750Var = k840.a.e;
        this.e = s750Var == null ? null : s750Var;
        this.h = new g();
        this.i = new yue0(this);
        this.j = new xue0(this);
    }

    public static ajc a(UIBlockRadioStation uIBlockRadioStation) {
        String str = uIBlockRadioStation.b;
        String str2 = uIBlockRadioStation.c;
        RadioStation radioStation = uIBlockRadioStation.y;
        return new ajc(str, str2, radioStation.i, new CommonAudioStat$AudioDomainEventEntity(CommonAudioStat$AudioDomainEventEntity.Type.RADIO, String.valueOf(radioStation.b)), uIBlockRadioStation.z.indexOf(radioStation));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        UIBlockRadioStation uIBlockRadioStation = uIBlock instanceof UIBlockRadioStation ? (UIBlockRadioStation) uIBlock : null;
        if (uIBlockRadioStation == null) {
            return;
        }
        this.g = uIBlockRadioStation;
        VkCell vkCell = this.f;
        if (vkCell == null) {
            vkCell = null;
        }
        UIBlockRadioStation uIBlockRadioStation2 = (UIBlockRadioStation) uIBlock;
        RadioStation radioStation = uIBlockRadioStation2.y;
        vkCell.setEnabled(radioStation.h);
        VkCell vkCell2 = this.f;
        if (vkCell2 == null) {
            vkCell2 = null;
        }
        vkCell2.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(oq.d(tlo0.Companion, radioStation.e), 3, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), null, null, 14));
        VkCell vkCell3 = this.f;
        if (vkCell3 == null) {
            vkCell3 = null;
        }
        vkCell3.setRight(VkCell.Right.c.a(VkCell.Right.Companion, null, null, new VkCell.Right.ExtraAction.e(new eoa(uIBlockRadioStation2, new ew3(20, this, uIBlock)), Integer.valueOf(iah0.a(28))), null, 27));
        Thumb thumb = radioStation.c;
        if (thumb != null) {
            VkCell vkCell4 = this.f;
            (vkCell4 != null ? vkCell4 : null).setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.d(new boa(thumb, this.b, uIBlockRadioStation2), VkCell.Left.Main.Size.Large)));
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_vk_cell_item, viewGroup, false);
        inflate.setOnClickListener(new ai0(this, 7));
        inflate.addOnAttachStateChangeListener(this.j);
        VkCell vkCell = (VkCell) inflate.findViewById(R.id.cell);
        vkCell.setLeftMainPictureController(new aoa());
        vkCell.setRightExtraActionPictureController(new doa());
        this.f = vkCell;
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

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
