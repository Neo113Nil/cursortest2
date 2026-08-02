package ru.ozon.android.messenger.framework.data.requests;

import C.o0;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.remote.models.items.ItemDTO;
import ru.ozon.android.messenger.framework.data.requests.GetMessagesResponseDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/android/messenger/framework/data/requests/GetMessagesResponseDTO_FirstPageInfoDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/framework/data/requests/GetMessagesResponseDTO$FirstPageInfoDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/messenger/framework/data/requests/GetMessagesResponseDTO$FirstPageInfoDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/messenger/framework/data/requests/GetMessagesResponseDTO$FirstPageInfoDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;", "nullableItemDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableListOfItemDTOAdapter", "listOfNullableItemDTOAdapter", "", "intAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class GetMessagesResponseDTO_FirstPageInfoDTOJsonAdapter extends JsonAdapter<GetMessagesResponseDTO.FirstPageInfoDTO> {
    public static final int $stable = 8;
    private volatile Constructor<GetMessagesResponseDTO.FirstPageInfoDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<List<ItemDTO>> listOfNullableItemDTOAdapter;

    @NotNull
    private final JsonAdapter<ItemDTO> nullableItemDTOAdapter;

    @NotNull
    private final JsonAdapter<List<ItemDTO>> nullableListOfItemDTOAdapter;

    @NotNull
    private final n.a options;

    public GetMessagesResponseDTO_FirstPageInfoDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a(CommentV3DTO.HEADER_FIELD_NAME, CommentV3DTO.FOOTER_FIELD_NAME, "chatRoomActions", "pinned", "unreadCount", "emptyState", "snackbar", "itemsBefore", "itemsAfter");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<ItemDTO> f7 = moshi.f(ItemDTO.class, m11, CommentV3DTO.HEADER_FIELD_NAME);
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableItemDTOAdapter = f7;
        JsonAdapter<List<ItemDTO>> f11 = moshi.f(D.e(List.class, ItemDTO.class), m11, "chatRoomActions");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableListOfItemDTOAdapter = f11;
        JsonAdapter<List<ItemDTO>> f12 = moshi.f(D.e(List.class, ItemDTO.class), m11, "pinned");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.listOfNullableItemDTOAdapter = f12;
        JsonAdapter<Integer> f13 = moshi.f(Integer.TYPE, m11, "unreadCount");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.intAdapter = f13;
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public GetMessagesResponseDTO.FirstPageInfoDTO fromJson(@NotNull n reader) {
        int i11 = -1;
        Integer a11 = o0.a(reader, "reader", 0);
        ItemDTO itemDTO = null;
        ItemDTO itemDTO2 = null;
        List<ItemDTO> list = null;
        List<ItemDTO> list2 = null;
        ItemDTO itemDTO3 = null;
        ItemDTO itemDTO4 = null;
        List<ItemDTO> list3 = null;
        List<ItemDTO> list4 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    itemDTO = this.nullableItemDTOAdapter.fromJson(reader);
                    break;
                case 1:
                    itemDTO2 = this.nullableItemDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    list = this.nullableListOfItemDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    list2 = this.listOfNullableItemDTOAdapter.fromJson(reader);
                    if (list2 == null) {
                        throw Y9.c.q("pinned", "pinned", reader);
                    }
                    i11 &= -9;
                    break;
                case 4:
                    a11 = this.intAdapter.fromJson(reader);
                    if (a11 == null) {
                        throw Y9.c.q("unreadCount", "unreadCount", reader);
                    }
                    i11 &= -17;
                    break;
                case 5:
                    itemDTO3 = this.nullableItemDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    itemDTO4 = this.nullableItemDTOAdapter.fromJson(reader);
                    break;
                case 7:
                    list3 = this.nullableListOfItemDTOAdapter.fromJson(reader);
                    break;
                case 8:
                    list4 = this.nullableListOfItemDTOAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -25) {
            Intrinsics.g(list2, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.android.messenger.framework.data.remote.models.items.ItemDTO?>");
            return new GetMessagesResponseDTO.FirstPageInfoDTO(itemDTO, itemDTO2, list, list2, a11.intValue(), itemDTO3, itemDTO4, list3, list4);
        }
        Constructor<GetMessagesResponseDTO.FirstPageInfoDTO> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = Y9.c.f34864d;
            Class cls2 = Integer.TYPE;
            constructor = GetMessagesResponseDTO.FirstPageInfoDTO.class.getDeclaredConstructor(ItemDTO.class, ItemDTO.class, List.class, List.class, cls2, ItemDTO.class, ItemDTO.class, List.class, List.class, cls2, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        GetMessagesResponseDTO.FirstPageInfoDTO newInstance = constructor.newInstance(itemDTO, itemDTO2, list, list2, a11, itemDTO3, itemDTO4, list3, list4, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(61, "GeneratedJsonAdapter(GetMessagesResponseDTO.FirstPageInfoDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, GetMessagesResponseDTO.FirstPageInfoDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(CommentV3DTO.HEADER_FIELD_NAME);
        this.nullableItemDTOAdapter.mo44toJson(writer, (x) value_.getHeader());
        writer.w(CommentV3DTO.FOOTER_FIELD_NAME);
        this.nullableItemDTOAdapter.mo44toJson(writer, (x) value_.getFooter());
        writer.w("chatRoomActions");
        this.nullableListOfItemDTOAdapter.mo44toJson(writer, (x) value_.getChatRoomActions());
        writer.w("pinned");
        this.listOfNullableItemDTOAdapter.mo44toJson(writer, (x) value_.getPinned());
        writer.w("unreadCount");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value_.getUnreadCount()));
        writer.w("emptyState");
        this.nullableItemDTOAdapter.mo44toJson(writer, (x) value_.getEmptyState());
        writer.w("snackbar");
        this.nullableItemDTOAdapter.mo44toJson(writer, (x) value_.getSnackbar());
        writer.w("itemsBefore");
        this.nullableListOfItemDTOAdapter.mo44toJson(writer, (x) value_.getItemsBefore());
        writer.w("itemsAfter");
        this.nullableListOfItemDTOAdapter.mo44toJson(writer, (x) value_.getItemsAfter());
        writer.p();
    }
}
