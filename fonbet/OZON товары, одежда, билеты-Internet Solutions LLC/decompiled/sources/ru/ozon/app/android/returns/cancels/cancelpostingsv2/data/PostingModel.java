package ru.ozon.app.android.returns.cancels.cancelpostingsv2.data;

import G.g;
import V.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0015\b\u0080\b\u0018\u00002\u00020\u0001:\u0001&BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0003\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u0011R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\"\u0010\u0011R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/returns/cancels/cancelpostingsv2/data/PostingModel;", "", "", "isSelected", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/returns/cancels/cancelpostingsv2/data/PostingModel$ItemModel;", "items", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "selectedIds", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "titleBadge", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getSelectedIds", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getTitleBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "ItemModel", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PostingModel {
    private final AtomActionDTO action;
    private final Boolean isSelected;

    @NotNull
    private final List<ItemModel> items;
    private final String selectedIds;

    @NotNull
    private final String title;
    private final BadgeDTO titleBadge;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/returns/cancels/cancelpostingsv2/data/PostingModel$ItemModel;", "", "", "image", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "getSubtitle", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ItemModel {

        @NotNull
        private final String image;
        private final String subtitle;

        public ItemModel(@NotNull String image, String str) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.image = image;
            this.subtitle = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemModel)) {
                return false;
            }
            ItemModel itemModel = (ItemModel) other;
            return Intrinsics.d(this.image, itemModel.image) && Intrinsics.d(this.subtitle, itemModel.subtitle);
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public int hashCode() {
            int hashCode = this.image.hashCode() * 31;
            String str = this.subtitle;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return e.a("ItemModel(image=", this.image, ", subtitle=", this.subtitle, ")");
        }
    }

    public PostingModel(Boolean bool, @NotNull String title, @NotNull List<ItemModel> items, AtomActionDTO atomActionDTO, String str, BadgeDTO badgeDTO) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.isSelected = bool;
        this.title = title;
        this.items = items;
        this.action = atomActionDTO;
        this.selectedIds = str;
        this.titleBadge = badgeDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostingModel)) {
            return false;
        }
        PostingModel postingModel = (PostingModel) other;
        return Intrinsics.d(this.isSelected, postingModel.isSelected) && Intrinsics.d(this.title, postingModel.title) && Intrinsics.d(this.items, postingModel.items) && Intrinsics.d(this.action, postingModel.action) && Intrinsics.d(this.selectedIds, postingModel.selectedIds) && Intrinsics.d(this.titleBadge, postingModel.titleBadge);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final List<ItemModel> getItems() {
        return this.items;
    }

    public final String getSelectedIds() {
        return this.selectedIds;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final BadgeDTO getTitleBadge() {
        return this.titleBadge;
    }

    public int hashCode() {
        Boolean bool = this.isSelected;
        int b11 = g.b(g.a((bool == null ? 0 : bool.hashCode()) * 31, 31, this.title), 31, this.items);
        AtomActionDTO atomActionDTO = this.action;
        int hashCode = (b11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        String str = this.selectedIds;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        BadgeDTO badgeDTO = this.titleBadge;
        return hashCode2 + (badgeDTO != null ? badgeDTO.hashCode() : 0);
    }

    /* renamed from: isSelected, reason: from getter */
    public final Boolean getIsSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        Boolean bool = this.isSelected;
        String str = this.title;
        List<ItemModel> list = this.items;
        AtomActionDTO atomActionDTO = this.action;
        String str2 = this.selectedIds;
        BadgeDTO badgeDTO = this.titleBadge;
        StringBuilder e11 = D3.g.e("PostingModel(isSelected=", bool, ", title=", str, ", items=");
        e11.append(list);
        e11.append(", action=");
        e11.append(atomActionDTO);
        e11.append(", selectedIds=");
        e11.append(str2);
        e11.append(", titleBadge=");
        e11.append(badgeDTO);
        e11.append(")");
        return e11.toString();
    }
}
