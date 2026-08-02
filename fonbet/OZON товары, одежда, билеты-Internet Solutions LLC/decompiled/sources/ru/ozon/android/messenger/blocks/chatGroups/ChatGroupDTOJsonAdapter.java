package ru.ozon.android.messenger.blocks.chatGroups;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
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
import ru.ozon.android.messenger.blocks.chat.common.UnreadCountIndicatorDTO;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R(\u0010#\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\"\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0018R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/android/messenger/blocks/chatGroups/ChatGroupDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/blocks/chatGroups/ChatGroupDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/messenger/blocks/chatGroups/ChatGroupDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/messenger/blocks/chatGroups/ChatGroupDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableIntAdapter", "Lru/ozon/android/messenger/blocks/chat/common/UnreadCountIndicatorDTO;", "nullableUnreadCountIndicatorDTOAdapter", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "iconDTOAdapter", "", "nullableBooleanAdapter", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "nullableMapOfStringMessengerTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ChatGroupDTOJsonAdapter extends JsonAdapter<ChatGroupDTO> {
    public static final int $stable = 8;
    private volatile Constructor<ChatGroupDTO> constructorRef;

    @NotNull
    private final JsonAdapter<IconDTO> iconDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<Map<String, MessengerTrackingInfo>> nullableMapOfStringMessengerTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<UnreadCountIndicatorDTO> nullableUnreadCountIndicatorDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public ChatGroupDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a(AppMeasurementSdk.ConditionalUserProperty.NAME, "chatType", "unreadCount", "unreadCountIndicator", "groupIcon", "hasSearch", "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<String> f7 = moshi.f(String.class, m11, AppMeasurementSdk.ConditionalUserProperty.NAME);
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.stringAdapter = f7;
        JsonAdapter<Integer> f11 = moshi.f(Integer.class, m11, "unreadCount");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableIntAdapter = f11;
        JsonAdapter<UnreadCountIndicatorDTO> f12 = moshi.f(UnreadCountIndicatorDTO.class, m11, "unreadCountIndicator");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableUnreadCountIndicatorDTOAdapter = f12;
        JsonAdapter<IconDTO> f13 = moshi.f(IconDTO.class, m11, "groupIcon");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.iconDTOAdapter = f13;
        JsonAdapter<Boolean> f14 = moshi.f(Boolean.class, m11, "hasSearch");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableBooleanAdapter = f14;
        JsonAdapter<Map<String, MessengerTrackingInfo>> f15 = moshi.f(D.e(Map.class, String.class, MessengerTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableMapOfStringMessengerTrackingInfoAdapter = f15;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(34, "GeneratedJsonAdapter(ChatGroupDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ChatGroupDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        String str = null;
        String str2 = null;
        Integer num = null;
        UnreadCountIndicatorDTO unreadCountIndicatorDTO = null;
        IconDTO iconDTO = null;
        Boolean bool = null;
        Map<String, MessengerTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw Y9.c.q(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
                    }
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw Y9.c.q("chatType", "chatType", reader);
                    }
                    break;
                case 2:
                    num = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 3:
                    unreadCountIndicatorDTO = this.nullableUnreadCountIndicatorDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    iconDTO = this.iconDTOAdapter.fromJson(reader);
                    if (iconDTO == null) {
                        throw Y9.c.q("groupIcon", "groupIcon", reader);
                    }
                    break;
                case 5:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
                case 6:
                    map = this.nullableMapOfStringMessengerTrackingInfoAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -97) {
            Map<String, MessengerTrackingInfo> map2 = map;
            Boolean bool2 = bool;
            IconDTO iconDTO2 = iconDTO;
            UnreadCountIndicatorDTO unreadCountIndicatorDTO2 = unreadCountIndicatorDTO;
            Integer num2 = num;
            String str3 = str2;
            String str4 = str;
            if (str4 == null) {
                throw Y9.c.j(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
            }
            if (str3 == null) {
                throw Y9.c.j("chatType", "chatType", reader);
            }
            if (iconDTO2 != null) {
                return new ChatGroupDTO(str4, str3, num2, unreadCountIndicatorDTO2, iconDTO2, bool2, map2);
            }
            throw Y9.c.j("groupIcon", "groupIcon", reader);
        }
        Map<String, MessengerTrackingInfo> map3 = map;
        Boolean bool3 = bool;
        IconDTO iconDTO3 = iconDTO;
        UnreadCountIndicatorDTO unreadCountIndicatorDTO3 = unreadCountIndicatorDTO;
        Integer num3 = num;
        String str5 = str2;
        String str6 = str;
        Constructor<ChatGroupDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ChatGroupDTO.class.getDeclaredConstructor(String.class, String.class, Integer.class, UnreadCountIndicatorDTO.class, IconDTO.class, Boolean.class, Map.class, Integer.TYPE, Y9.c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<ChatGroupDTO> constructor2 = constructor;
        if (str6 == null) {
            throw Y9.c.j(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
        }
        if (str5 == null) {
            throw Y9.c.j("chatType", "chatType", reader);
        }
        if (iconDTO3 == null) {
            throw Y9.c.j("groupIcon", "groupIcon", reader);
        }
        ChatGroupDTO newInstance = constructor2.newInstance(str6, str5, num3, unreadCountIndicatorDTO3, iconDTO3, bool3, map3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ChatGroupDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.stringAdapter.mo44toJson(writer, (x) value_.getName());
        writer.w("chatType");
        this.stringAdapter.mo44toJson(writer, (x) value_.getChatType());
        writer.w("unreadCount");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getUnreadCount());
        writer.w("unreadCountIndicator");
        this.nullableUnreadCountIndicatorDTOAdapter.mo44toJson(writer, (x) value_.getUnreadCountIndicator());
        writer.w("groupIcon");
        this.iconDTOAdapter.mo44toJson(writer, (x) value_.getGroupIcon());
        writer.w("hasSearch");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.getHasSearch());
        writer.w("trackingInfo");
        this.nullableMapOfStringMessengerTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.p();
    }
}
