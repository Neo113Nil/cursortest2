package ru.ozon.android.messenger.framework.data.requests;

import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.data.remote.models.items.ItemDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R(\u0010\u001d\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/android/messenger/framework/data/requests/UpdateMessageResponseDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/framework/data/requests/UpdateMessageResponseDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/messenger/framework/data/requests/UpdateMessageResponseDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/messenger/framework/data/requests/UpdateMessageResponseDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;", "nullableItemDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "nullableMapOfStringMessengerTrackingInfoAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class UpdateMessageResponseDTOJsonAdapter extends JsonAdapter<UpdateMessageResponseDTO> {
    public static final int $stable = 8;
    private volatile Constructor<UpdateMessageResponseDTO> constructorRef;

    @NotNull
    private final JsonAdapter<ItemDTO> nullableItemDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, MessengerTrackingInfo>> nullableMapOfStringMessengerTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public UpdateMessageResponseDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("item", "status", "trackingInfo", "token", "errorDescription");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<ItemDTO> f7 = moshi.f(ItemDTO.class, m11, "item");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableItemDTOAdapter = f7;
        JsonAdapter<String> f11 = moshi.f(String.class, m11, "status");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.stringAdapter = f11;
        JsonAdapter<Map<String, MessengerTrackingInfo>> f12 = moshi.f(D.e(Map.class, String.class, MessengerTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableMapOfStringMessengerTrackingInfoAdapter = f12;
        JsonAdapter<String> f13 = moshi.f(String.class, m11, "retryToken");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableStringAdapter = f13;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(46, "GeneratedJsonAdapter(UpdateMessageResponseDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public UpdateMessageResponseDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        ItemDTO itemDTO = null;
        String str = null;
        Map<String, MessengerTrackingInfo> map = null;
        String str2 = null;
        String str3 = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                itemDTO = this.nullableItemDTOAdapter.fromJson(reader);
                i11 = -2;
            } else if (v11 == 1) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw Y9.c.q("status", "status", reader);
                }
            } else if (v11 == 2) {
                map = this.nullableMapOfStringMessengerTrackingInfoAdapter.fromJson(reader);
            } else if (v11 == 3) {
                str2 = this.nullableStringAdapter.fromJson(reader);
            } else if (v11 == 4) {
                str3 = this.nullableStringAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (i11 == -2) {
            String str4 = str3;
            String str5 = str2;
            Map<String, MessengerTrackingInfo> map2 = map;
            String str6 = str;
            ItemDTO itemDTO2 = itemDTO;
            if (str6 != null) {
                return new UpdateMessageResponseDTO(itemDTO2, str6, map2, str5, str4);
            }
            throw Y9.c.j("status", "status", reader);
        }
        String str7 = str3;
        String str8 = str2;
        Map<String, MessengerTrackingInfo> map3 = map;
        String str9 = str;
        ItemDTO itemDTO3 = itemDTO;
        Constructor<UpdateMessageResponseDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = UpdateMessageResponseDTO.class.getDeclaredConstructor(ItemDTO.class, String.class, Map.class, String.class, String.class, Integer.TYPE, Y9.c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (str9 == null) {
            throw Y9.c.j("status", "status", reader);
        }
        UpdateMessageResponseDTO newInstance = constructor.newInstance(itemDTO3, str9, map3, str8, str7, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, UpdateMessageResponseDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("item");
        this.nullableItemDTOAdapter.mo44toJson(writer, (x) value_.getItem());
        writer.w("status");
        this.stringAdapter.mo44toJson(writer, (x) value_.getStatus());
        writer.w("trackingInfo");
        this.nullableMapOfStringMessengerTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.w("token");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getRetryToken());
        writer.w("errorDescription");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getErrorDescription());
        writer.p();
    }
}
