package ru.ozon.android.messenger.blocks.notification;

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
import ru.ozon.android.messenger.blocks.notification.NotificationDTO;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.data.modules.atoms.timerbadge.TimerBadge;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\"\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R(\u0010'\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020&\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019¨\u0006("}, d2 = {"Lru/ozon/android/messenger/blocks/notification/NotificationDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/blocks/notification/NotificationDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/messenger/blocks/notification/NotificationDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/messenger/blocks/notification/NotificationDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/android/messenger/blocks/notification/NotificationDTO$ImageDTO;", "nullableImageDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/uni/atoms/data/badge/Badge;", "nullableListOfBadgeAdapter", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "nullableListOfTextAtomAdapter", "Lru/ozon/android/messenger/blocks/notification/NotificationDTO$ButtonDTO;", "nullableListOfButtonDTOAdapter", "Lru/ozon/android/messenger/framework/data/modules/atoms/timerbadge/TimerBadge;", "nullableTimerBadgeAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "nullableMapOfStringMessengerTrackingInfoAdapter", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class NotificationDTOJsonAdapter extends JsonAdapter<NotificationDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<NotificationDTO.ImageDTO> nullableImageDTOAdapter;

    @NotNull
    private final JsonAdapter<List<Badge>> nullableListOfBadgeAdapter;

    @NotNull
    private final JsonAdapter<List<NotificationDTO.ButtonDTO>> nullableListOfButtonDTOAdapter;

    @NotNull
    private final JsonAdapter<List<TextAtom>> nullableListOfTextAtomAdapter;

    @NotNull
    private final JsonAdapter<Map<String, MessengerTrackingInfo>> nullableMapOfStringMessengerTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<TimerBadge> nullableTimerBadgeAdapter;

    @NotNull
    private final n.a options;

    public NotificationDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("image", "badges", "content", "buttons", DynamicElementDTO.TIMER, "action", "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<NotificationDTO.ImageDTO> f7 = moshi.f(NotificationDTO.ImageDTO.class, m11, "image");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableImageDTOAdapter = f7;
        JsonAdapter<List<Badge>> f11 = moshi.f(D.e(List.class, Badge.class), m11, "badges");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableListOfBadgeAdapter = f11;
        JsonAdapter<List<TextAtom>> f12 = moshi.f(D.e(List.class, TextAtom.class), m11, "content");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableListOfTextAtomAdapter = f12;
        JsonAdapter<List<NotificationDTO.ButtonDTO>> f13 = moshi.f(D.e(List.class, NotificationDTO.ButtonDTO.class), m11, "buttons");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableListOfButtonDTOAdapter = f13;
        JsonAdapter<TimerBadge> f14 = moshi.f(TimerBadge.class, m11, DynamicElementDTO.TIMER);
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableTimerBadgeAdapter = f14;
        JsonAdapter<AtomActionDTO> f15 = moshi.f(AtomActionDTO.class, m11, "action");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableAtomActionDTOAdapter = f15;
        JsonAdapter<Map<String, MessengerTrackingInfo>> f16 = moshi.f(D.e(Map.class, String.class, MessengerTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableMapOfStringMessengerTrackingInfoAdapter = f16;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(37, "GeneratedJsonAdapter(NotificationDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public NotificationDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        NotificationDTO.ImageDTO imageDTO = null;
        List<Badge> list = null;
        List<TextAtom> list2 = null;
        List<NotificationDTO.ButtonDTO> list3 = null;
        TimerBadge timerBadge = null;
        AtomActionDTO atomActionDTO = null;
        Map<String, MessengerTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    imageDTO = this.nullableImageDTOAdapter.fromJson(reader);
                    break;
                case 1:
                    list = this.nullableListOfBadgeAdapter.fromJson(reader);
                    break;
                case 2:
                    list2 = this.nullableListOfTextAtomAdapter.fromJson(reader);
                    break;
                case 3:
                    list3 = this.nullableListOfButtonDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    timerBadge = this.nullableTimerBadgeAdapter.fromJson(reader);
                    break;
                case 5:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    map = this.nullableMapOfStringMessengerTrackingInfoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        return new NotificationDTO(imageDTO, list, list2, list3, timerBadge, atomActionDTO, map);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, NotificationDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("image");
        this.nullableImageDTOAdapter.mo44toJson(writer, (x) value_.getImage());
        writer.w("badges");
        this.nullableListOfBadgeAdapter.mo44toJson(writer, (x) value_.getBadges());
        writer.w("content");
        this.nullableListOfTextAtomAdapter.mo44toJson(writer, (x) value_.getContent());
        writer.w("buttons");
        this.nullableListOfButtonDTOAdapter.mo44toJson(writer, (x) value_.getButtons());
        writer.w(DynamicElementDTO.TIMER);
        this.nullableTimerBadgeAdapter.mo44toJson(writer, (x) value_.getTimer());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value_.getAction());
        writer.w("trackingInfo");
        this.nullableMapOfStringMessengerTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.p();
    }
}
