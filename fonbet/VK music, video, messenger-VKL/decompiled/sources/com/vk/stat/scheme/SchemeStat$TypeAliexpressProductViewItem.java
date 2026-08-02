package com.vk.stat.scheme;

import com.ironsource.X3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SchemeStat.kt */
/* loaded from: classes5.dex */
public final class SchemeStat$TypeAliexpressProductViewItem {

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

    public SchemeStat$TypeAliexpressProductViewItem() {
        this(null, null, null, null, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeAliexpressProductViewItem)) {
            return false;
        }
        SchemeStat$TypeAliexpressProductViewItem schemeStat$TypeAliexpressProductViewItem = (SchemeStat$TypeAliexpressProductViewItem) obj;
        return epx.f(this.productId, schemeStat$TypeAliexpressProductViewItem.productId) && epx.f(this.productUrl, schemeStat$TypeAliexpressProductViewItem.productUrl) && epx.f(this.ownerId, schemeStat$TypeAliexpressProductViewItem.ownerId) && epx.f(this.position, schemeStat$TypeAliexpressProductViewItem.position) && epx.f(this.content, schemeStat$TypeAliexpressProductViewItem.content);
    }

    public final int hashCode() {
        String str = this.productId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.productUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.ownerId;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.position;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        SchemeStat$TypeClassifiedsContentItem schemeStat$TypeClassifiedsContentItem = this.content;
        return hashCode4 + (schemeStat$TypeClassifiedsContentItem != null ? schemeStat$TypeClassifiedsContentItem.hashCode() : 0);
    }

    public final String toString() {
        return "TypeAliexpressProductViewItem(productId=" + this.productId + ", productUrl=" + this.productUrl + ", ownerId=" + this.ownerId + ", position=" + this.position + ", content=" + this.content + ')';
    }

    public SchemeStat$TypeAliexpressProductViewItem(String str, String str2, Long l, Integer num, SchemeStat$TypeClassifiedsContentItem schemeStat$TypeClassifiedsContentItem) {
        this.productId = str;
        this.productUrl = str2;
        this.ownerId = l;
        this.position = num;
        this.content = schemeStat$TypeClassifiedsContentItem;
    }

    public /* synthetic */ SchemeStat$TypeAliexpressProductViewItem(String str, String str2, Long l, Integer num, SchemeStat$TypeClassifiedsContentItem schemeStat$TypeClassifiedsContentItem, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : schemeStat$TypeClassifiedsContentItem);
    }
}
