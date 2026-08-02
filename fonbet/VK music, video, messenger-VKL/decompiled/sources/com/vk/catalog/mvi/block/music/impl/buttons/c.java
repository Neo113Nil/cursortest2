package com.vk.catalog.mvi.block.music.impl.buttons;

import com.vk.catalog.mvi.block.music.impl.buttons.SavePlaylistByFilterButton;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.SavePlaylistViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSaveAsPlaylistFromBlock;
import xsna.wzs;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements wzs {
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        CatalogBlockVariant catalogBlockVariant = (CatalogBlockVariant) obj;
        UIBlock uIBlock = (UIBlock) obj2;
        UIBlockActionSaveAsPlaylistFromBlock uIBlockActionSaveAsPlaylistFromBlock = uIBlock instanceof UIBlockActionSaveAsPlaylistFromBlock ? (UIBlockActionSaveAsPlaylistFromBlock) uIBlock : null;
        if (uIBlockActionSaveAsPlaylistFromBlock != null) {
            CatalogViewStyle Lb = uIBlockActionSaveAsPlaylistFromBlock.Lb();
            if ((Lb instanceof SavePlaylistViewStyle) && ((SavePlaylistViewStyle) Lb).zb() == SavePlaylistViewStyle.Style.MyMusic) {
                return new SavePlaylistByFilterButton.State(uIBlockActionSaveAsPlaylistFromBlock.w(), catalogBlockVariant, new SavePlaylistByFilterButton.ViewState(uIBlockActionSaveAsPlaylistFromBlock.w(), uIBlockActionSaveAsPlaylistFromBlock.getTitle(), null), uIBlockActionSaveAsPlaylistFromBlock.Rb(), null);
            }
        }
        return null;
    }
}
