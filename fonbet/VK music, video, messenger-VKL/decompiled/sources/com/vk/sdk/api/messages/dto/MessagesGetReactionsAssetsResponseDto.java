package com.vk.sdk.api.messages.dto;

import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.vp;
import xsna.zcl;
import xsna.zn;

/* compiled from: MessagesGetReactionsAssetsResponseDto.kt */
/* loaded from: classes5.dex */
public final class MessagesGetReactionsAssetsResponseDto {

    @pmi0("assets")
    private final List<MessagesReactionAssetItemDto> assets;

    @pmi0("override_assets")
    private final List<MessagesReactionAssetItemDto> overrideAssets;

    @pmi0("version")
    private final int version;

    public MessagesGetReactionsAssetsResponseDto(int i, List<MessagesReactionAssetItemDto> list, List<MessagesReactionAssetItemDto> list2) {
        this.version = i;
        this.assets = list;
        this.overrideAssets = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetReactionsAssetsResponseDto)) {
            return false;
        }
        MessagesGetReactionsAssetsResponseDto messagesGetReactionsAssetsResponseDto = (MessagesGetReactionsAssetsResponseDto) obj;
        return this.version == messagesGetReactionsAssetsResponseDto.version && epx.f(this.assets, messagesGetReactionsAssetsResponseDto.assets) && epx.f(this.overrideAssets, messagesGetReactionsAssetsResponseDto.overrideAssets);
    }

    public final int hashCode() {
        int a = fw3.a(Integer.hashCode(this.version) * 31, 31, this.assets);
        List<MessagesReactionAssetItemDto> list = this.overrideAssets;
        return a + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        int i = this.version;
        List<MessagesReactionAssetItemDto> list = this.assets;
        return vp.b(")", zn.c(i, "MessagesGetReactionsAssetsResponseDto(version=", ", assets=", ", overrideAssets=", list), this.overrideAssets);
    }

    public /* synthetic */ MessagesGetReactionsAssetsResponseDto(int i, List list, List list2, int i2, zcl zclVar) {
        this(i, list, (i2 & 4) != 0 ? null : list2);
    }
}
