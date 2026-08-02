package ru.ozon.app.android.favorites.shoppinglistv2.data;

import B90.C2618u;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/favorites/shoppinglistv2/data/ShoppingListsV2DTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "createList", "Lru/ozon/app/android/favorites/shoppinglistv2/data/CreateListDTO;", "lists", "", "Lru/ozon/app/android/favorites/shoppinglistv2/data/ShoppingListV2DTO;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/favorites/shoppinglistv2/data/CreateListDTO;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getCreateList", "()Lru/ozon/app/android/favorites/shoppinglistv2/data/CreateListDTO;", "getLists", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ShoppingListsV2DTO {
    private final CreateListDTO createList;
    private final List<ShoppingListV2DTO> lists;
    private final String title;

    public ShoppingListsV2DTO(String str, CreateListDTO createListDTO, List<ShoppingListV2DTO> list) {
        this.title = str;
        this.createList = createListDTO;
        this.lists = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShoppingListsV2DTO copy$default(ShoppingListsV2DTO shoppingListsV2DTO, String str, CreateListDTO createListDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = shoppingListsV2DTO.title;
        }
        if ((i11 & 2) != 0) {
            createListDTO = shoppingListsV2DTO.createList;
        }
        if ((i11 & 4) != 0) {
            list = shoppingListsV2DTO.lists;
        }
        return shoppingListsV2DTO.copy(str, createListDTO, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final CreateListDTO getCreateList() {
        return this.createList;
    }

    public final List<ShoppingListV2DTO> component3() {
        return this.lists;
    }

    @NotNull
    public final ShoppingListsV2DTO copy(String title, CreateListDTO createList, List<ShoppingListV2DTO> lists) {
        return new ShoppingListsV2DTO(title, createList, lists);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShoppingListsV2DTO)) {
            return false;
        }
        ShoppingListsV2DTO shoppingListsV2DTO = (ShoppingListsV2DTO) other;
        return Intrinsics.d(this.title, shoppingListsV2DTO.title) && Intrinsics.d(this.createList, shoppingListsV2DTO.createList) && Intrinsics.d(this.lists, shoppingListsV2DTO.lists);
    }

    public final CreateListDTO getCreateList() {
        return this.createList;
    }

    public final List<ShoppingListV2DTO> getLists() {
        return this.lists;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        CreateListDTO createListDTO = this.createList;
        int hashCode2 = (hashCode + (createListDTO == null ? 0 : createListDTO.hashCode())) * 31;
        List<ShoppingListV2DTO> list = this.lists;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        CreateListDTO createListDTO = this.createList;
        List<ShoppingListV2DTO> list = this.lists;
        StringBuilder sb2 = new StringBuilder("ShoppingListsV2DTO(title=");
        sb2.append(str);
        sb2.append(", createList=");
        sb2.append(createListDTO);
        sb2.append(", lists=");
        return C2618u.h(sb2, list, ")");
    }
}
