package ru.ozon.android.messenger.framework.analytics;

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
import ru.ozon.tracker.model.TrinityEventEntityKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\"\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "longAdapter", "nullableStringAdapter", "", "nullableListOfMessengerTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MessengerTrackingInfoJsonAdapter extends JsonAdapter<MessengerTrackingInfo> {
    public static final int $stable = 8;
    private volatile Constructor<MessengerTrackingInfo> constructorRef;

    @NotNull
    private final JsonAdapter<Long> longAdapter;

    @NotNull
    private final JsonAdapter<List<MessengerTrackingInfo>> nullableListOfMessengerTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public MessengerTrackingInfoJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a(TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "key", "pageTimestamp", "sliceKey", "nested");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, TrinityEventEntityKt.ACTION_TYPE_JSON_NAME);
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<Long> f11 = moshi.f(Long.TYPE, m11, "pageTimestamp");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.longAdapter = f11;
        JsonAdapter<String> f12 = moshi.f(String.class, m11, "sliceKey");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableStringAdapter = f12;
        JsonAdapter<List<MessengerTrackingInfo>> f13 = moshi.f(D.e(List.class, MessengerTrackingInfo.class), m11, "nested");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableListOfMessengerTrackingInfoAdapter = f13;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(43, "GeneratedJsonAdapter(MessengerTrackingInfo)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public MessengerTrackingInfo fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Long l11 = 0L;
        String str = null;
        String str2 = null;
        String str3 = null;
        List<MessengerTrackingInfo> list = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw Y9.c.q(TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, reader);
                }
            } else if (v11 == 1) {
                str2 = this.stringAdapter.fromJson(reader);
                if (str2 == null) {
                    throw Y9.c.q("key", "key", reader);
                }
            } else if (v11 == 2) {
                l11 = this.longAdapter.fromJson(reader);
                if (l11 == null) {
                    throw Y9.c.q("pageTimestamp", "pageTimestamp", reader);
                }
                i11 &= -5;
            } else if (v11 == 3) {
                str3 = this.nullableStringAdapter.fromJson(reader);
                i11 &= -9;
            } else if (v11 == 4) {
                list = this.nullableListOfMessengerTrackingInfoAdapter.fromJson(reader);
                i11 &= -17;
            }
        }
        reader.endObject();
        if (i11 == -29) {
            String str4 = str3;
            if (str == null) {
                throw Y9.c.j(TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, reader);
            }
            if (str2 == null) {
                throw Y9.c.j("key", "key", reader);
            }
            return new MessengerTrackingInfo(str, str2, l11.longValue(), str4, list);
        }
        String str5 = str3;
        Constructor<MessengerTrackingInfo> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = MessengerTrackingInfo.class.getDeclaredConstructor(String.class, String.class, Long.TYPE, String.class, List.class, Integer.TYPE, Y9.c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (str == null) {
            throw Y9.c.j(TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, reader);
        }
        if (str2 == null) {
            throw Y9.c.j("key", "key", reader);
        }
        MessengerTrackingInfo newInstance = constructor.newInstance(str, str2, l11, str5, list, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, MessengerTrackingInfo value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(TrinityEventEntityKt.ACTION_TYPE_JSON_NAME);
        this.stringAdapter.mo44toJson(writer, (x) value_.getActionType());
        writer.w("key");
        this.stringAdapter.mo44toJson(writer, (x) value_.getKey());
        writer.w("pageTimestamp");
        this.longAdapter.mo44toJson(writer, (x) Long.valueOf(value_.getPageTimestamp()));
        writer.w("sliceKey");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getSliceKey());
        writer.w("nested");
        this.nullableListOfMessengerTrackingInfoAdapter.mo44toJson(writer, (x) value_.getNested());
        writer.p();
    }
}
