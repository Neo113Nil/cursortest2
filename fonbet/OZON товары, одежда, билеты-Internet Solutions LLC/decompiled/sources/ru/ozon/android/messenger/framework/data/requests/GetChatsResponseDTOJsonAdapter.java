package ru.ozon.android.messenger.framework.data.requests;

import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.remote.models.items.ItemDTO;
import ru.ozon.android.messenger.framework.data.requests.GetChatsResponseDTO;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u0019\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR(\u0010\u001f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001a¨\u0006#"}, d2 = {"Lru/ozon/android/messenger/framework/data/requests/GetChatsResponseDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/framework/data/requests/GetChatsResponseDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/messenger/framework/data/requests/GetChatsResponseDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/messenger/framework/data/requests/GetChatsResponseDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;", "nullableListOfNullableItemDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableBooleanAdapter", "", "", "nullableMapOfIntItemDTOAdapter", "nullableStringAdapter", "Lru/ozon/android/messenger/framework/data/requests/GetChatsResponseDTO$ChatListFirstPageInfoDTO;", "nullableChatListFirstPageInfoDTOAdapter", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class GetChatsResponseDTOJsonAdapter extends JsonAdapter<GetChatsResponseDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<GetChatsResponseDTO.ChatListFirstPageInfoDTO> nullableChatListFirstPageInfoDTOAdapter;

    @NotNull
    private final JsonAdapter<List<ItemDTO>> nullableListOfNullableItemDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<Integer, ItemDTO>> nullableMapOfIntItemDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public GetChatsResponseDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("items", "hasItemsAfter", "absoluteItems", "lastUnreadChatId", "firstPageInfo");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        Y9.b e11 = D.e(List.class, ItemDTO.class);
        M m11 = M.f71699a;
        JsonAdapter<List<ItemDTO>> f7 = moshi.f(e11, m11, "items");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableListOfNullableItemDTOAdapter = f7;
        JsonAdapter<Boolean> f11 = moshi.f(Boolean.class, m11, "hasItemsAfter");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableBooleanAdapter = f11;
        JsonAdapter<Map<Integer, ItemDTO>> f12 = moshi.f(D.e(Map.class, Integer.class, ItemDTO.class), m11, "absoluteItems");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableMapOfIntItemDTOAdapter = f12;
        JsonAdapter<String> f13 = moshi.f(String.class, m11, "lastUnreadChatId");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableStringAdapter = f13;
        JsonAdapter<GetChatsResponseDTO.ChatListFirstPageInfoDTO> f14 = moshi.f(GetChatsResponseDTO.ChatListFirstPageInfoDTO.class, m11, "firstPageInfo");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableChatListFirstPageInfoDTOAdapter = f14;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(41, "GeneratedJsonAdapter(GetChatsResponseDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public GetChatsResponseDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<ItemDTO> list = null;
        Boolean bool = null;
        Map<Integer, ItemDTO> map = null;
        String str = null;
        GetChatsResponseDTO.ChatListFirstPageInfoDTO chatListFirstPageInfoDTO = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                list = this.nullableListOfNullableItemDTOAdapter.fromJson(reader);
            } else if (v11 == 1) {
                bool = this.nullableBooleanAdapter.fromJson(reader);
            } else if (v11 == 2) {
                map = this.nullableMapOfIntItemDTOAdapter.fromJson(reader);
            } else if (v11 == 3) {
                str = this.nullableStringAdapter.fromJson(reader);
            } else if (v11 == 4) {
                chatListFirstPageInfoDTO = this.nullableChatListFirstPageInfoDTOAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        return new GetChatsResponseDTO(list, bool, map, str, chatListFirstPageInfoDTO);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, GetChatsResponseDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("items");
        this.nullableListOfNullableItemDTOAdapter.mo44toJson(writer, (x) value_.getItems());
        writer.w("hasItemsAfter");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getHasItemsAfter());
        writer.w("absoluteItems");
        this.nullableMapOfIntItemDTOAdapter.mo44toJson(writer, (x) value_.getAbsoluteItems());
        writer.w("lastUnreadChatId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getLastUnreadChatId());
        writer.w("firstPageInfo");
        this.nullableChatListFirstPageInfoDTOAdapter.mo44toJson(writer, (x) value_.getFirstPageInfo());
        writer.p();
    }
}
