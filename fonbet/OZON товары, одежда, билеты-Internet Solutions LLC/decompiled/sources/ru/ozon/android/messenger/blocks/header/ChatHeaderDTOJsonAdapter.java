package ru.ozon.android.messenger.blocks.header;

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
import ru.ozon.android.messenger.blocks.header.ChatHeaderDTO;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\"\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020!\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\"\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020#\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R(\u0010'\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020&\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010+0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0019¨\u0006-"}, d2 = {"Lru/ozon/android/messenger/blocks/header/ChatHeaderDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/blocks/header/ChatHeaderDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/messenger/blocks/header/ChatHeaderDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/messenger/blocks/header/ChatHeaderDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableListOfTextDTOAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "nullableIconDTOAdapter", "stringAdapter", "Lru/ozon/android/messenger/blocks/header/ChatHeaderDTO$IconItemDTO;", "nullableListOfIconItemDTOAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButtonWithIcon;", "nullableListOfSmallButtonWithIconAdapter", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "nullableMapOfStringMessengerTrackingInfoAdapter", "nullableStringAdapter", "Lru/ozon/android/messenger/blocks/header/ChatHeaderDTO$a;", "nullableOnlineStatusAdapter", "Lru/ozon/uni/atoms/data/button/Icon;", "nullableIconAdapter", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ChatHeaderDTOJsonAdapter extends JsonAdapter<ChatHeaderDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Icon> nullableIconAdapter;

    @NotNull
    private final JsonAdapter<IconDTO> nullableIconDTOAdapter;

    @NotNull
    private final JsonAdapter<List<ChatHeaderDTO.IconItemDTO>> nullableListOfIconItemDTOAdapter;

    @NotNull
    private final JsonAdapter<List<ButtonV3Atom.SmallButtonWithIcon>> nullableListOfSmallButtonWithIconAdapter;

    @NotNull
    private final JsonAdapter<List<TextDTO>> nullableListOfTextDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, MessengerTrackingInfo>> nullableMapOfStringMessengerTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<ChatHeaderDTO.a> nullableOnlineStatusAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public ChatHeaderDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("titleAtom", "subtitles", "action", "avatarIcon", "backgroundColor", "titleIcons", "buttons", "trackingInfo", "animation", "status", "statusIcon", "statusIconUrl");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<TextDTO> f7 = moshi.f(TextDTO.class, m11, "titleAtom");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.textDTOAdapter = f7;
        JsonAdapter<List<TextDTO>> f11 = moshi.f(D.e(List.class, TextDTO.class), m11, "subtitles");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableListOfTextDTOAdapter = f11;
        JsonAdapter<AtomActionDTO> f12 = moshi.f(AtomActionDTO.class, m11, "action");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableAtomActionDTOAdapter = f12;
        JsonAdapter<IconDTO> f13 = moshi.f(IconDTO.class, m11, "avatarIcon");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableIconDTOAdapter = f13;
        JsonAdapter<String> f14 = moshi.f(String.class, m11, "backgroundColor");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.stringAdapter = f14;
        JsonAdapter<List<ChatHeaderDTO.IconItemDTO>> f15 = moshi.f(D.e(List.class, ChatHeaderDTO.IconItemDTO.class), m11, "titleIcons");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableListOfIconItemDTOAdapter = f15;
        JsonAdapter<List<ButtonV3Atom.SmallButtonWithIcon>> f16 = moshi.f(D.e(List.class, ButtonV3Atom.SmallButtonWithIcon.class), m11, "buttons");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableListOfSmallButtonWithIconAdapter = f16;
        JsonAdapter<Map<String, MessengerTrackingInfo>> f17 = moshi.f(D.e(Map.class, String.class, MessengerTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableMapOfStringMessengerTrackingInfoAdapter = f17;
        JsonAdapter<String> f18 = moshi.f(String.class, m11, "animation");
        Intrinsics.checkNotNullExpressionValue(f18, "adapter(...)");
        this.nullableStringAdapter = f18;
        JsonAdapter<ChatHeaderDTO.a> f19 = moshi.f(ChatHeaderDTO.a.class, m11, "status");
        Intrinsics.checkNotNullExpressionValue(f19, "adapter(...)");
        this.nullableOnlineStatusAdapter = f19;
        JsonAdapter<Icon> f21 = moshi.f(Icon.class, m11, "statusIcon");
        Intrinsics.checkNotNullExpressionValue(f21, "adapter(...)");
        this.nullableIconAdapter = f21;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(35, "GeneratedJsonAdapter(ChatHeaderDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ChatHeaderDTO fromJson(@NotNull com.squareup.moshi.n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TextDTO textDTO = null;
        List<TextDTO> list = null;
        AtomActionDTO atomActionDTO = null;
        IconDTO iconDTO = null;
        String str = null;
        List<ChatHeaderDTO.IconItemDTO> list2 = null;
        List<ButtonV3Atom.SmallButtonWithIcon> list3 = null;
        Map<String, MessengerTrackingInfo> map = null;
        String str2 = null;
        ChatHeaderDTO.a aVar = null;
        Icon icon = null;
        String str3 = null;
        while (reader.hasNext()) {
            TextDTO textDTO2 = textDTO;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw Y9.c.q("titleAtom", "titleAtom", reader);
                    }
                    continue;
                case 1:
                    list = this.nullableListOfTextDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    iconDTO = this.nullableIconDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw Y9.c.q("backgroundColor", "backgroundColor", reader);
                    }
                    break;
                case 5:
                    list2 = this.nullableListOfIconItemDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    list3 = this.nullableListOfSmallButtonWithIconAdapter.fromJson(reader);
                    break;
                case 7:
                    map = this.nullableMapOfStringMessengerTrackingInfoAdapter.fromJson(reader);
                    break;
                case 8:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 9:
                    aVar = this.nullableOnlineStatusAdapter.fromJson(reader);
                    break;
                case 10:
                    icon = this.nullableIconAdapter.fromJson(reader);
                    break;
                case 11:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
            }
            textDTO = textDTO2;
        }
        TextDTO textDTO3 = textDTO;
        reader.endObject();
        if (textDTO3 == null) {
            throw Y9.c.j("titleAtom", "titleAtom", reader);
        }
        if (str != null) {
            return new ChatHeaderDTO(textDTO3, list, atomActionDTO, iconDTO, str, list2, list3, map, str2, aVar, icon, str3);
        }
        throw Y9.c.j("backgroundColor", "backgroundColor", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ChatHeaderDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("titleAtom");
        this.textDTOAdapter.mo44toJson(writer, (x) value_.getTitleAtom());
        writer.w("subtitles");
        this.nullableListOfTextDTOAdapter.mo44toJson(writer, (x) value_.getSubtitles());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value_.getAction());
        writer.w("avatarIcon");
        this.nullableIconDTOAdapter.mo44toJson(writer, (x) value_.getAvatarIcon());
        writer.w("backgroundColor");
        this.stringAdapter.mo44toJson(writer, (x) value_.getBackgroundColor());
        writer.w("titleIcons");
        this.nullableListOfIconItemDTOAdapter.mo44toJson(writer, (x) value_.getTitleIcons());
        writer.w("buttons");
        this.nullableListOfSmallButtonWithIconAdapter.mo44toJson(writer, (x) value_.getButtons());
        writer.w("trackingInfo");
        this.nullableMapOfStringMessengerTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.w("animation");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getAnimation());
        writer.w("status");
        this.nullableOnlineStatusAdapter.mo44toJson(writer, (x) value_.getStatus());
        writer.w("statusIcon");
        this.nullableIconAdapter.mo44toJson(writer, (x) value_.getStatusIcon());
        writer.w("statusIconUrl");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getStatusIconUrl());
        writer.p();
    }
}
