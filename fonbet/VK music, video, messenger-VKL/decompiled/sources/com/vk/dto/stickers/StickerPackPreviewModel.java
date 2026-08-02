package com.vk.dto.stickers;

import java.util.List;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: StickerPackPreviewModel.kt */
/* loaded from: classes18.dex */
public final class StickerPackPreviewModel {

    @pmi0("author")
    private final String author;

    @pmi0("canPurchase")
    private final boolean canPurchase;

    @pmi0("description")
    private final String description;

    @pmi0("icon")
    private final StickerStockItemPreviewImage icon;

    @pmi0("id")
    private final int id;

    @pmi0("isActive")
    private final boolean isActive;

    @pmi0("isAnimated")
    private final boolean isAnimated;

    @pmi0("isPurchased")
    private final boolean isPurchased;

    @pmi0("isStyle")
    private final boolean isStyle;

    @pmi0("price")
    private final StickerPackPrice price;

    @pmi0("stickers")
    private final List<StickerItem> stickers;

    @pmi0("title")
    private final String title;

    @pmi0("trackCode")
    private final String trackCode;

    public StickerPackPreviewModel(int i, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, StickerPackPrice stickerPackPrice, StickerStockItemPreviewImage stickerStockItemPreviewImage, List<StickerItem> list, String str4) {
        this.id = i;
        this.title = str;
        this.description = str2;
        this.author = str3;
        this.isAnimated = z;
        this.isPurchased = z2;
        this.canPurchase = z3;
        this.isActive = z4;
        this.isStyle = z5;
        this.price = stickerPackPrice;
        this.icon = stickerStockItemPreviewImage;
        this.stickers = list;
        this.trackCode = str4;
    }

    public final String a() {
        return this.author;
    }

    public final boolean b() {
        return this.canPurchase;
    }

    public final String c() {
        return this.description;
    }

    public final StickerStockItemPreviewImage d() {
        return this.icon;
    }

    public final int e() {
        return this.id;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickerPackPreviewModel)) {
            return false;
        }
        StickerPackPreviewModel stickerPackPreviewModel = (StickerPackPreviewModel) obj;
        return this.id == stickerPackPreviewModel.id && epx.f(this.title, stickerPackPreviewModel.title) && epx.f(this.description, stickerPackPreviewModel.description) && epx.f(this.author, stickerPackPreviewModel.author) && this.isAnimated == stickerPackPreviewModel.isAnimated && this.isPurchased == stickerPackPreviewModel.isPurchased && this.canPurchase == stickerPackPreviewModel.canPurchase && this.isActive == stickerPackPreviewModel.isActive && this.isStyle == stickerPackPreviewModel.isStyle && epx.f(this.price, stickerPackPreviewModel.price) && epx.f(this.icon, stickerPackPreviewModel.icon) && epx.f(this.stickers, stickerPackPreviewModel.stickers) && epx.f(this.trackCode, stickerPackPreviewModel.trackCode);
    }

    public final StickerPackPrice f() {
        return this.price;
    }

    public final List<StickerItem> g() {
        return this.stickers;
    }

    public final String h() {
        return this.title;
    }

    public final int hashCode() {
        int a = urd0.a(Integer.hashCode(this.id) * 31, 31, this.title);
        String str = this.description;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.author;
        int b = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isAnimated), 31, this.isPurchased), 31, this.canPurchase), 31, this.isActive), 31, this.isStyle);
        StickerPackPrice stickerPackPrice = this.price;
        int hashCode2 = (b + (stickerPackPrice == null ? 0 : stickerPackPrice.hashCode())) * 31;
        StickerStockItemPreviewImage stickerStockItemPreviewImage = this.icon;
        int hashCode3 = (hashCode2 + (stickerStockItemPreviewImage == null ? 0 : stickerStockItemPreviewImage.hashCode())) * 31;
        List<StickerItem> list = this.stickers;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.trackCode;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String i() {
        return this.trackCode;
    }

    public final boolean j() {
        return this.isActive;
    }

    public final boolean k() {
        return this.isAnimated;
    }

    public final boolean l() {
        return this.isPurchased;
    }

    public final boolean m() {
        return this.isStyle;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerPackPreviewModel(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", author=");
        sb.append(this.author);
        sb.append(", isAnimated=");
        sb.append(this.isAnimated);
        sb.append(", isPurchased=");
        sb.append(this.isPurchased);
        sb.append(", canPurchase=");
        sb.append(this.canPurchase);
        sb.append(", isActive=");
        sb.append(this.isActive);
        sb.append(", isStyle=");
        sb.append(this.isStyle);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", stickers=");
        sb.append(this.stickers);
        sb.append(", trackCode=");
        return ho8.a(sb, this.trackCode, ')');
    }

    public /* synthetic */ StickerPackPreviewModel(int i, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, StickerPackPrice stickerPackPrice, StickerStockItemPreviewImage stickerStockItemPreviewImage, List list, String str4, int i2, zcl zclVar) {
        this(i, str, str2, str3, z, z2, z3, z4, z5, stickerPackPrice, stickerStockItemPreviewImage, list, (i2 & 4096) != 0 ? null : str4);
    }
}
