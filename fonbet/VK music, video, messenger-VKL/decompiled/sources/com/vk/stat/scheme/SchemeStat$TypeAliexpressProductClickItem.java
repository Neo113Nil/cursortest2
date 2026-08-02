package com.vk.stat.scheme;

import com.ironsource.X3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeAliexpressProductClickItem {

    @pmi0(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)
    private final SchemeStat$TypeClassifiedsContentItem content;

    @pmi0("owner_id")
    private final Long ownerId;

    @pmi0(X3.i.L)
    private final Integer position;

    @pmi0("product_id")
    private final String productId;

    @pmi0("product_url")
    private final String productUrl;

    public SchemeStat$TypeAliexpressProductClickItem() {
        this(null, null, null, null, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeAliexpressProductClickItem)) {
            return false;
        }
        SchemeStat$TypeAliexpressProductClickItem schemeStat$TypeAliexpressProductClickItem = (SchemeStat$TypeAliexpressProductClickItem) obj;
        return epx.f(this.productId, schemeStat$TypeAliexpressProductClickItem.productId) && epx.f(this.productUrl, schemeStat$TypeAliexpressProductClickItem.productUrl) && epx.f(this.position, schemeStat$TypeAliexpressProductClickItem.position) && epx.f(this.ownerId, schemeStat$TypeAliexpressProductClickItem.ownerId) && epx.f(this.content, schemeStat$TypeAliexpressProductClickItem.content);
    }

    public final int hashCode() {
        String str = this.productId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.productUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.position;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.ownerId;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        SchemeStat$TypeClassifiedsContentItem schemeStat$TypeClassifiedsContentItem = this.content;
        return hashCode4 + (schemeStat$TypeClassifiedsContentItem != null ? schemeStat$TypeClassifiedsContentItem.hashCode() : 0);
    }

    public final String toString() {
        return "TypeAliexpressProductClickItem(productId=" + this.productId + ", productUrl=" + this.productUrl + ", position=" + this.position + ", ownerId=" + this.ownerId + ", content=" + this.content + ')';
    }

    public SchemeStat$TypeAliexpressProductClickItem(String str, String str2, Integer num, Long l, SchemeStat$TypeClassifiedsContentItem schemeStat$TypeClassifiedsContentItem) {
        this.productId = str;
        this.productUrl = str2;
        this.position = num;
        this.ownerId = l;
        this.content = schemeStat$TypeClassifiedsContentItem;
    }

    public /* synthetic */ SchemeStat$TypeAliexpressProductClickItem(String str, String str2, Integer num, Long l, SchemeStat$TypeClassifiedsContentItem schemeStat$TypeClassifiedsContentItem, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : schemeStat$TypeClassifiedsContentItem);
    }
}
