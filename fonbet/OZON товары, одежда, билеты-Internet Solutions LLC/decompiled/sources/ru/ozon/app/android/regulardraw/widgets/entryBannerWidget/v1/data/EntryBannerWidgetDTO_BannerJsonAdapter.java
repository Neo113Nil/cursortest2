package ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.regulardraw.widgets.entryBannerWidget.v1.data.EntryBannerWidgetDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R(\u0010$\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020#\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019¨\u0006%"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/data/EntryBannerWidgetDTO_BannerJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/data/EntryBannerWidgetDTO$Banner;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/data/EntryBannerWidgetDTO$Banner;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/data/EntryBannerWidgetDTO$Banner;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/regulardraw/widgets/entryBannerWidget/v1/data/EntryBannerWidgetDTO$Banner$TitleBadge;", "titleBadgeAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badgeDTOAdapter", "nullableStringAdapter", "stringAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EntryBannerWidgetDTO_BannerJsonAdapter extends JsonAdapter<EntryBannerWidgetDTO.Banner> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<BadgeDTO> badgeDTOAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    @NotNull
    private final JsonAdapter<EntryBannerWidgetDTO.Banner.TitleBadge> titleBadgeAdapter;

    public EntryBannerWidgetDTO_BannerJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "titleBadge", "subtitle", "badge", "underImage", "animationName", "overImage", "backgroundColor", "action", "trackingInfo");
        M m11 = M.f71699a;
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.titleBadgeAdapter = moshi.f(EntryBannerWidgetDTO.Banner.TitleBadge.class, m11, "titleBadge");
        this.badgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "badge");
        this.nullableStringAdapter = moshi.f(String.class, m11, "underImage");
        this.stringAdapter = moshi.f(String.class, m11, "animationName");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(49, "GeneratedJsonAdapter(EntryBannerWidgetDTO.Banner)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public EntryBannerWidgetDTO.Banner fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TextDTO textDTO = null;
        EntryBannerWidgetDTO.Banner.TitleBadge titleBadge = null;
        TextDTO textDTO2 = null;
        BadgeDTO badgeDTO = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        AtomActionDTO atomActionDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (true) {
            TextDTO textDTO3 = textDTO;
            EntryBannerWidgetDTO.Banner.TitleBadge titleBadge2 = titleBadge;
            if (!reader.hasNext()) {
                TextDTO textDTO4 = textDTO2;
                reader.endObject();
                if (textDTO3 == null) {
                    throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                }
                if (titleBadge2 == null) {
                    throw c.j("titleBadge", "titleBadge", reader);
                }
                if (textDTO4 == null) {
                    throw c.j("subtitle", "subtitle", reader);
                }
                if (badgeDTO == null) {
                    throw c.j("badge", "badge", reader);
                }
                if (str2 == null) {
                    throw c.j("animationName", "animationName", reader);
                }
                if (str4 != null) {
                    return new EntryBannerWidgetDTO.Banner(textDTO3, titleBadge2, textDTO4, badgeDTO, str, str2, str3, str4, atomActionDTO, map);
                }
                throw c.j("backgroundColor", "backgroundColor", reader);
            }
            TextDTO textDTO5 = textDTO2;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    textDTO2 = textDTO5;
                    textDTO = textDTO3;
                    titleBadge = titleBadge2;
                case 0:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    textDTO2 = textDTO5;
                    titleBadge = titleBadge2;
                case 1:
                    titleBadge = this.titleBadgeAdapter.fromJson(reader);
                    if (titleBadge == null) {
                        throw c.q("titleBadge", "titleBadge", reader);
                    }
                    textDTO2 = textDTO5;
                    textDTO = textDTO3;
                case 2:
                    textDTO2 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO2 == null) {
                        throw c.q("subtitle", "subtitle", reader);
                    }
                    textDTO = textDTO3;
                    titleBadge = titleBadge2;
                case 3:
                    badgeDTO = this.badgeDTOAdapter.fromJson(reader);
                    if (badgeDTO == null) {
                        throw c.q("badge", "badge", reader);
                    }
                    textDTO2 = textDTO5;
                    textDTO = textDTO3;
                    titleBadge = titleBadge2;
                case 4:
                    str = this.nullableStringAdapter.fromJson(reader);
                    textDTO2 = textDTO5;
                    textDTO = textDTO3;
                    titleBadge = titleBadge2;
                case 5:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("animationName", "animationName", reader);
                    }
                    textDTO2 = textDTO5;
                    textDTO = textDTO3;
                    titleBadge = titleBadge2;
                case 6:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    textDTO2 = textDTO5;
                    textDTO = textDTO3;
                    titleBadge = titleBadge2;
                case 7:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw c.q("backgroundColor", "backgroundColor", reader);
                    }
                    textDTO2 = textDTO5;
                    textDTO = textDTO3;
                    titleBadge = titleBadge2;
                case 8:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    textDTO2 = textDTO5;
                    textDTO = textDTO3;
                    titleBadge = titleBadge2;
                case 9:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    textDTO2 = textDTO5;
                    textDTO = textDTO3;
                    titleBadge = titleBadge2;
                default:
                    textDTO2 = textDTO5;
                    textDTO = textDTO3;
                    titleBadge = titleBadge2;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, EntryBannerWidgetDTO.Banner value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value.getTitle());
        writer.w("titleBadge");
        this.titleBadgeAdapter.mo44toJson(writer, (x) value.getTitleBadge());
        writer.w("subtitle");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("badge");
        this.badgeDTOAdapter.mo44toJson(writer, (x) value.getBadge());
        writer.w("underImage");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getUnderImage());
        writer.w("animationName");
        this.stringAdapter.mo44toJson(writer, (x) value.getAnimationName());
        writer.w("overImage");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getOverImage());
        writer.w("backgroundColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
