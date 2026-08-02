package ru.ozon.android.messenger.blocks.chat.search;

import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.chat.search.SearchChatDTO;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\"\u0010\u001f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\"\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020#\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R(\u0010'\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020&\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/android/messenger/blocks/chat/search/SearchChatDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/blocks/chat/search/SearchChatDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/messenger/blocks/chat/search/SearchChatDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/messenger/blocks/chat/search/SearchChatDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/blocks/chat/search/SearchChatDTO$SearchPreviewDTO;", "searchPreviewDTOAdapter", "stringAdapter", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableListOfBadgeDTOAdapter", "nullableTextDTOAdapter", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "nullableIconDTOAdapter", "Lru/ozon/uni/atoms/data/button/Icon;", "nullableListOfIconAdapter", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "nullableMapOfStringMessengerTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SearchChatDTOJsonAdapter extends JsonAdapter<SearchChatDTO> {
    public static final int $stable = 8;
    private volatile Constructor<SearchChatDTO> constructorRef;

    @NotNull
    private final JsonAdapter<IconDTO> nullableIconDTOAdapter;

    @NotNull
    private final JsonAdapter<List<BadgeDTO>> nullableListOfBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<List<Icon>> nullableListOfIconAdapter;

    @NotNull
    private final JsonAdapter<Map<String, MessengerTrackingInfo>> nullableMapOfStringMessengerTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<SearchChatDTO.SearchPreviewDTO> searchPreviewDTOAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public SearchChatDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "preview", "deeplink", "messageId", "chatId", "badges", "conversationId", "avatarIcon", "titleIcons", "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<TextDTO> f7 = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.textDTOAdapter = f7;
        JsonAdapter<SearchChatDTO.SearchPreviewDTO> f11 = moshi.f(SearchChatDTO.SearchPreviewDTO.class, m11, "preview");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.searchPreviewDTOAdapter = f11;
        JsonAdapter<String> f12 = moshi.f(String.class, m11, "deeplink");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.stringAdapter = f12;
        JsonAdapter<List<BadgeDTO>> f13 = moshi.f(D.e(List.class, BadgeDTO.class), m11, "badges");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableListOfBadgeDTOAdapter = f13;
        JsonAdapter<TextDTO> f14 = moshi.f(TextDTO.class, m11, "conversationId");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableTextDTOAdapter = f14;
        JsonAdapter<IconDTO> f15 = moshi.f(IconDTO.class, m11, "avatarIcon");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableIconDTOAdapter = f15;
        JsonAdapter<List<Icon>> f16 = moshi.f(D.e(List.class, Icon.class), m11, "titleIcons");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableListOfIconAdapter = f16;
        JsonAdapter<Map<String, MessengerTrackingInfo>> f17 = moshi.f(D.e(Map.class, String.class, MessengerTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableMapOfStringMessengerTrackingInfoAdapter = f17;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(35, "GeneratedJsonAdapter(SearchChatDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public SearchChatDTO fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        TextDTO textDTO = null;
        SearchChatDTO.SearchPreviewDTO searchPreviewDTO = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        List<BadgeDTO> list = null;
        TextDTO textDTO2 = null;
        IconDTO iconDTO = null;
        List<Icon> list2 = null;
        Map<String, MessengerTrackingInfo> map = null;
        while (true) {
            TextDTO textDTO3 = textDTO;
            SearchChatDTO.SearchPreviewDTO searchPreviewDTO2 = searchPreviewDTO;
            if (!reader.hasNext()) {
                String str4 = str;
                reader.endObject();
                if (i12 == -513) {
                    if (textDTO3 == null) {
                        throw Y9.c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    if (searchPreviewDTO2 == null) {
                        throw Y9.c.j("preview", "preview", reader);
                    }
                    if (str4 == null) {
                        throw Y9.c.j("deeplink", "deeplink", reader);
                    }
                    if (str2 == null) {
                        throw Y9.c.j("messageId", "messageId", reader);
                    }
                    if (str3 == null) {
                        throw Y9.c.j("chatId", "chatId", reader);
                    }
                    List<Icon> list3 = list2;
                    IconDTO iconDTO2 = iconDTO;
                    TextDTO textDTO4 = textDTO2;
                    return new SearchChatDTO(textDTO3, searchPreviewDTO2, str4, str2, str3, list, textDTO4, iconDTO2, list3, map);
                }
                Constructor<SearchChatDTO> constructor = this.constructorRef;
                if (constructor == null) {
                    i11 = i12;
                    constructor = SearchChatDTO.class.getDeclaredConstructor(TextDTO.class, SearchChatDTO.SearchPreviewDTO.class, String.class, String.class, String.class, List.class, TextDTO.class, IconDTO.class, List.class, Map.class, Integer.TYPE, Y9.c.f34864d);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                } else {
                    i11 = i12;
                }
                Constructor<SearchChatDTO> constructor2 = constructor;
                if (textDTO3 == null) {
                    throw Y9.c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
                if (searchPreviewDTO2 == null) {
                    throw Y9.c.j("preview", "preview", reader);
                }
                if (str4 == null) {
                    throw Y9.c.j("deeplink", "deeplink", reader);
                }
                if (str2 == null) {
                    throw Y9.c.j("messageId", "messageId", reader);
                }
                if (str3 == null) {
                    throw Y9.c.j("chatId", "chatId", reader);
                }
                SearchChatDTO newInstance = constructor2.newInstance(textDTO3, searchPreviewDTO2, str4, str2, str3, list, textDTO2, iconDTO, list2, map, Integer.valueOf(i11), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            String str5 = str;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    str = str5;
                    textDTO = textDTO3;
                    searchPreviewDTO = searchPreviewDTO2;
                case 0:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw Y9.c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    str = str5;
                    searchPreviewDTO = searchPreviewDTO2;
                case 1:
                    searchPreviewDTO = this.searchPreviewDTOAdapter.fromJson(reader);
                    if (searchPreviewDTO == null) {
                        throw Y9.c.q("preview", "preview", reader);
                    }
                    str = str5;
                    textDTO = textDTO3;
                case 2:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw Y9.c.q("deeplink", "deeplink", reader);
                    }
                    textDTO = textDTO3;
                    searchPreviewDTO = searchPreviewDTO2;
                case 3:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw Y9.c.q("messageId", "messageId", reader);
                    }
                    str = str5;
                    textDTO = textDTO3;
                    searchPreviewDTO = searchPreviewDTO2;
                case 4:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw Y9.c.q("chatId", "chatId", reader);
                    }
                    str = str5;
                    textDTO = textDTO3;
                    searchPreviewDTO = searchPreviewDTO2;
                case 5:
                    list = this.nullableListOfBadgeDTOAdapter.fromJson(reader);
                    str = str5;
                    textDTO = textDTO3;
                    searchPreviewDTO = searchPreviewDTO2;
                case 6:
                    textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
                    str = str5;
                    textDTO = textDTO3;
                    searchPreviewDTO = searchPreviewDTO2;
                case 7:
                    iconDTO = this.nullableIconDTOAdapter.fromJson(reader);
                    str = str5;
                    textDTO = textDTO3;
                    searchPreviewDTO = searchPreviewDTO2;
                case 8:
                    list2 = this.nullableListOfIconAdapter.fromJson(reader);
                    str = str5;
                    textDTO = textDTO3;
                    searchPreviewDTO = searchPreviewDTO2;
                case 9:
                    map = this.nullableMapOfStringMessengerTrackingInfoAdapter.fromJson(reader);
                    str = str5;
                    textDTO = textDTO3;
                    searchPreviewDTO = searchPreviewDTO2;
                    i12 = -513;
                default:
                    str = str5;
                    textDTO = textDTO3;
                    searchPreviewDTO = searchPreviewDTO2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, SearchChatDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value_.getTitle());
        writer.w("preview");
        this.searchPreviewDTOAdapter.mo44toJson(writer, (x) value_.getPreview());
        writer.w("deeplink");
        this.stringAdapter.mo44toJson(writer, (x) value_.getDeeplink());
        writer.w("messageId");
        this.stringAdapter.mo44toJson(writer, (x) value_.getMessageId());
        writer.w("chatId");
        this.stringAdapter.mo44toJson(writer, (x) value_.getChatId());
        writer.w("badges");
        this.nullableListOfBadgeDTOAdapter.mo44toJson(writer, (x) value_.getBadges());
        writer.w("conversationId");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value_.getConversationId());
        writer.w("avatarIcon");
        this.nullableIconDTOAdapter.mo44toJson(writer, (x) value_.getAvatarIcon());
        writer.w("titleIcons");
        this.nullableListOfIconAdapter.mo44toJson(writer, (x) value_.getTitleIcons());
        writer.w("trackingInfo");
        this.nullableMapOfStringMessengerTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.p();
    }
}
