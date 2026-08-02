package ru.ozon.android.messenger.framework.data.remote.parser;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.h;
import com.squareup.moshi.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.remote.models.items.BlockContainerModelDTO;
import ru.ozon.android.messenger.framework.data.remote.models.items.ItemDTO;
import ru.ozon.android.messenger.framework.data.remote.models.items.MessageModelDTO;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/parser/ItemAdapter;", "", "<init>", "()V", "Lcom/squareup/moshi/n;", "jsonReader", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/framework/data/remote/parser/ItemJson;", "itemJsonAdapter", "Lru/ozon/android/messenger/framework/data/remote/models/items/MessageModelDTO;", "messageAdapter", "Lru/ozon/android/messenger/framework/data/remote/models/items/BlockContainerModelDTO;", "blockAdapter", "Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;", "itemFromJson", "(Lcom/squareup/moshi/n;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;Lcom/squareup/moshi/JsonAdapter;)Lru/ozon/android/messenger/framework/data/remote/models/items/ItemDTO;", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ItemAdapter {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f87825a;

        static {
            int[] iArr = new int[ru.ozon.android.messenger.framework.data.remote.models.items.b.values().length];
            try {
                iArr[ru.ozon.android.messenger.framework.data.remote.models.items.b.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.data.remote.models.items.b.BLOCK_CONTAINER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f87825a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006e A[Catch: Exception -> 0x0025, TryCatch #0 {Exception -> 0x0025, blocks: (B:3:0x0018, B:5:0x0020, B:16:0x005a, B:18:0x006e, B:20:0x0077, B:24:0x007b, B:26:0x003e, B:28:0x004a, B:29:0x002e), top: B:2:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    @h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ItemDTO itemFromJson(@NotNull n jsonReader, @NotNull JsonAdapter<ItemJson> itemJsonAdapter, @NotNull JsonAdapter<MessageModelDTO> messageAdapter, @NotNull JsonAdapter<BlockContainerModelDTO> blockAdapter) {
        MessageModelDTO fromJson;
        Object obj;
        Intrinsics.checkNotNullParameter(jsonReader, "jsonReader");
        Intrinsics.checkNotNullParameter(itemJsonAdapter, "itemJsonAdapter");
        Intrinsics.checkNotNullParameter(messageAdapter, "messageAdapter");
        Intrinsics.checkNotNullParameter(blockAdapter, "blockAdapter");
        try {
            ItemJson fromJson2 = itemJsonAdapter.fromJson(jsonReader);
            ru.ozon.android.messenger.framework.data.remote.models.items.b type = fromJson2 != null ? fromJson2.getType() : null;
            int i11 = type == null ? -1 : a.f87825a[type.ordinal()];
            if (i11 == 1) {
                fromJson = messageAdapter.fromJson(fromJson2.getModel());
            } else {
                if (i11 != 2) {
                    obj = null;
                    if (fromJson2 != null && obj != null) {
                        String id2 = fromJson2.getId();
                        ru.ozon.android.messenger.framework.data.remote.models.items.b type2 = fromJson2.getType();
                        int version = fromJson2.getVersion();
                        Double orderBy = fromJson2.getOrderBy();
                        return new ItemDTO(id2, type2, version, orderBy == null ? orderBy.doubleValue() : 0.0d, obj);
                    }
                    Lm0.a.f17149a.w("Failed to parse item json " + fromJson2, new Object[0]);
                    return null;
                }
                fromJson = blockAdapter.fromJson(fromJson2.getModel());
            }
            obj = fromJson;
            if (fromJson2 != null) {
                String id22 = fromJson2.getId();
                ru.ozon.android.messenger.framework.data.remote.models.items.b type22 = fromJson2.getType();
                int version2 = fromJson2.getVersion();
                Double orderBy2 = fromJson2.getOrderBy();
                return new ItemDTO(id22, type22, version2, orderBy2 == null ? orderBy2.doubleValue() : 0.0d, obj);
            }
            Lm0.a.f17149a.w("Failed to parse item json " + fromJson2, new Object[0]);
            return null;
        } catch (Exception e11) {
            Lm0.a.f17149a.w(e11, "Failed to parse item json", new Object[0]);
            return null;
        }
    }
}
