package ru.ozon.android.messenger.framework.data.remote.models.items;

import Y9.c;
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
import org.joda.time.DateTime;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.data.remote.models.blocks.BlockDTO;
import ru.ozon.android.messenger.framework.data.remote.models.items.MessageModelDTO;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0018R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0018R(\u0010)\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020(\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0018R \u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0018¨\u0006-"}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/models/items/MessageModelDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/framework/data/remote/models/items/MessageModelDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/messenger/framework/data/remote/models/items/MessageModelDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/messenger/framework/data/remote/models/items/MessageModelDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lorg/joda/time/DateTime;", "dateTimeAdapter", "nullableDateTimeAdapter", "", "nullableBooleanAdapter", "Lru/ozon/android/messenger/framework/data/remote/models/items/MessageModelDTO$a;", "nullableLayoutTypeDTOAdapter", "booleanAdapter", "Lru/ozon/android/messenger/framework/data/remote/models/items/AuthorDTO;", "nullableAuthorDTOAdapter", "Lru/ozon/android/messenger/framework/data/remote/models/items/MessageModelDTO$b;", "nullableStatusDTOAdapter", "Lru/ozon/android/messenger/framework/data/remote/models/items/ContextMenuDTO;", "nullableContextMenuDTOAdapter", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "nullableMapOfStringMessengerTrackingInfoAdapter", "", "Lru/ozon/android/messenger/framework/data/remote/models/blocks/BlockDTO;", "listOfBlockDTOAdapter", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MessageModelDTOJsonAdapter extends JsonAdapter<MessageModelDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;

    @NotNull
    private final JsonAdapter<DateTime> dateTimeAdapter;

    @NotNull
    private final JsonAdapter<List<BlockDTO>> listOfBlockDTOAdapter;

    @NotNull
    private final JsonAdapter<AuthorDTO> nullableAuthorDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<ContextMenuDTO> nullableContextMenuDTOAdapter;

    @NotNull
    private final JsonAdapter<DateTime> nullableDateTimeAdapter;

    @NotNull
    private final JsonAdapter<MessageModelDTO.a> nullableLayoutTypeDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, MessengerTrackingInfo>> nullableMapOfStringMessengerTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<MessageModelDTO.b> nullableStatusDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public MessageModelDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("localId", "createdAt", "updatedAt", "isRead", "layout", "isMine", "author", "status", "contextMenu", "trackingInfo", "updateStatusLabel", "blocks");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, "localId");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableStringAdapter = f7;
        JsonAdapter<DateTime> f11 = moshi.f(DateTime.class, m11, "createdAt");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.dateTimeAdapter = f11;
        JsonAdapter<DateTime> f12 = moshi.f(DateTime.class, m11, "updatedAt");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableDateTimeAdapter = f12;
        JsonAdapter<Boolean> f13 = moshi.f(Boolean.class, m11, "isRead");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableBooleanAdapter = f13;
        JsonAdapter<MessageModelDTO.a> f14 = moshi.f(MessageModelDTO.a.class, m11, "layout");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableLayoutTypeDTOAdapter = f14;
        JsonAdapter<Boolean> f15 = moshi.f(Boolean.TYPE, m11, "isMine");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.booleanAdapter = f15;
        JsonAdapter<AuthorDTO> f16 = moshi.f(AuthorDTO.class, m11, "author");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableAuthorDTOAdapter = f16;
        JsonAdapter<MessageModelDTO.b> f17 = moshi.f(MessageModelDTO.b.class, m11, "status");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableStatusDTOAdapter = f17;
        JsonAdapter<ContextMenuDTO> f18 = moshi.f(ContextMenuDTO.class, m11, "contextMenu");
        Intrinsics.checkNotNullExpressionValue(f18, "adapter(...)");
        this.nullableContextMenuDTOAdapter = f18;
        JsonAdapter<Map<String, MessengerTrackingInfo>> f19 = moshi.f(D.e(Map.class, String.class, MessengerTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f19, "adapter(...)");
        this.nullableMapOfStringMessengerTrackingInfoAdapter = f19;
        JsonAdapter<List<BlockDTO>> f21 = moshi.f(D.e(List.class, BlockDTO.class), m11, "blocks");
        Intrinsics.checkNotNullExpressionValue(f21, "adapter(...)");
        this.listOfBlockDTOAdapter = f21;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(37, "GeneratedJsonAdapter(MessageModelDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public MessageModelDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Boolean bool = null;
        String str = null;
        DateTime dateTime = null;
        DateTime dateTime2 = null;
        Boolean bool2 = null;
        MessageModelDTO.a aVar = null;
        AuthorDTO authorDTO = null;
        MessageModelDTO.b bVar = null;
        ContextMenuDTO contextMenuDTO = null;
        Map<String, MessengerTrackingInfo> map = null;
        String str2 = null;
        List<BlockDTO> list = null;
        while (true) {
            Boolean bool3 = bool;
            if (!reader.hasNext()) {
                String str3 = str;
                reader.endObject();
                if (dateTime == null) {
                    throw c.j("createdAt", "createdAt", reader);
                }
                if (bool3 == null) {
                    throw c.j("isMine", "isMine", reader);
                }
                boolean booleanValue = bool3.booleanValue();
                if (list != null) {
                    return new MessageModelDTO(str3, dateTime, dateTime2, bool2, aVar, booleanValue, authorDTO, bVar, contextMenuDTO, map, str2, list);
                }
                throw c.j("blocks", "blocks", reader);
            }
            String str4 = str;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    bool = bool3;
                    str = str4;
                case 0:
                    str = this.nullableStringAdapter.fromJson(reader);
                    bool = bool3;
                case 1:
                    dateTime = this.dateTimeAdapter.fromJson(reader);
                    if (dateTime == null) {
                        throw c.q("createdAt", "createdAt", reader);
                    }
                    bool = bool3;
                    str = str4;
                case 2:
                    dateTime2 = this.nullableDateTimeAdapter.fromJson(reader);
                    bool = bool3;
                    str = str4;
                case 3:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    bool = bool3;
                    str = str4;
                case 4:
                    aVar = this.nullableLayoutTypeDTOAdapter.fromJson(reader);
                    bool = bool3;
                    str = str4;
                case 5:
                    Boolean fromJson = this.booleanAdapter.fromJson(reader);
                    if (fromJson == null) {
                        throw c.q("isMine", "isMine", reader);
                    }
                    bool = fromJson;
                    str = str4;
                case 6:
                    authorDTO = this.nullableAuthorDTOAdapter.fromJson(reader);
                    bool = bool3;
                    str = str4;
                case 7:
                    bVar = this.nullableStatusDTOAdapter.fromJson(reader);
                    bool = bool3;
                    str = str4;
                case 8:
                    contextMenuDTO = this.nullableContextMenuDTOAdapter.fromJson(reader);
                    bool = bool3;
                    str = str4;
                case 9:
                    map = this.nullableMapOfStringMessengerTrackingInfoAdapter.fromJson(reader);
                    bool = bool3;
                    str = str4;
                case 10:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    bool = bool3;
                    str = str4;
                case 11:
                    list = this.listOfBlockDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("blocks", "blocks", reader);
                    }
                    bool = bool3;
                    str = str4;
                default:
                    bool = bool3;
                    str = str4;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, MessageModelDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("localId");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getLocalId());
        writer.w("createdAt");
        this.dateTimeAdapter.mo44toJson(writer, (x) value_.getCreatedAt());
        writer.w("updatedAt");
        this.nullableDateTimeAdapter.mo44toJson(writer, (x) value_.getUpdatedAt());
        writer.w("isRead");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.isRead());
        writer.w("layout");
        this.nullableLayoutTypeDTOAdapter.mo44toJson(writer, (x) value_.getLayout());
        writer.w("isMine");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value_.isMine()));
        writer.w("author");
        this.nullableAuthorDTOAdapter.mo44toJson(writer, (x) value_.getAuthor());
        writer.w("status");
        this.nullableStatusDTOAdapter.mo44toJson(writer, (x) value_.getStatus());
        writer.w("contextMenu");
        this.nullableContextMenuDTOAdapter.mo44toJson(writer, (x) value_.getContextMenu());
        writer.w("trackingInfo");
        this.nullableMapOfStringMessengerTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.w("updateStatusLabel");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getUpdateStatusLabel());
        writer.w("blocks");
        this.listOfBlockDTOAdapter.mo44toJson(writer, (x) value_.getBlocks());
        writer.p();
    }
}
