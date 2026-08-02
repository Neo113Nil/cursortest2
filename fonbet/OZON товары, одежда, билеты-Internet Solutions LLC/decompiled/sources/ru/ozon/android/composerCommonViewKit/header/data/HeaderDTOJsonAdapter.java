package ru.ozon.android.composerCommonViewKit.header.data;

import Ak.b;
import Y9.c;
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
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R(\u0010\"\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020!\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/android/composerCommonViewKit/header/data/HeaderDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/composerCommonViewKit/header/data/HeaderDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/composerCommonViewKit/header/data/HeaderDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/composerCommonViewKit/header/data/HeaderDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableTextDTOAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadiusAdapter", "Lru/ozon/uni/atoms/data/common/Paddings;", "paddingsAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HeaderDTOJsonAdapter extends JsonAdapter<HeaderDTO> {
    public static final int $stable = 8;
    private volatile Constructor<HeaderDTO> constructorRef;

    @NotNull
    private final JsonAdapter<CornerRadius> cornerRadiusAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<Paddings> paddingsAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public HeaderDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "badge", "backgroundColor", "action", "trackingInfo", "topIslandCornerRadius", "leftMargin", "topMargin", "rightMargin", "bottomMargin");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<TextDTO> f7 = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.textDTOAdapter = f7;
        JsonAdapter<TextDTO> f11 = moshi.f(TextDTO.class, m11, "subtitle");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableTextDTOAdapter = f11;
        JsonAdapter<BadgeDTO> f12 = moshi.f(BadgeDTO.class, m11, "badge");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableBadgeDTOAdapter = f12;
        JsonAdapter<String> f13 = moshi.f(String.class, m11, "backgroundColor");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableStringAdapter = f13;
        JsonAdapter<AtomActionDTO> f14 = moshi.f(AtomActionDTO.class, m11, "action");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableAtomActionDTOAdapter = f14;
        JsonAdapter<Map<String, TokenizedTrackingInfo>> f15 = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = f15;
        JsonAdapter<CornerRadius> f16 = moshi.f(CornerRadius.class, m11, "topIslandCornerRadius");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.cornerRadiusAdapter = f16;
        JsonAdapter<Paddings> f17 = moshi.f(Paddings.class, m11, "leftMargin");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.paddingsAdapter = f17;
    }

    @NotNull
    public String toString() {
        return b.c(31, "GeneratedJsonAdapter(HeaderDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public HeaderDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Paddings paddings = null;
        int i11 = -1;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        BadgeDTO badgeDTO = null;
        String str = null;
        AtomActionDTO atomActionDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        CornerRadius cornerRadius = null;
        Paddings paddings2 = null;
        Paddings paddings3 = null;
        Paddings paddings4 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
                    }
                    break;
                case 1:
                    textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 6:
                    cornerRadius = this.cornerRadiusAdapter.fromJson(reader);
                    if (cornerRadius == null) {
                        throw c.q("topIslandCornerRadius", "topIslandCornerRadius", reader);
                    }
                    i11 &= -129;
                    break;
                case 7:
                    paddings2 = this.paddingsAdapter.fromJson(reader);
                    if (paddings2 == null) {
                        throw c.q("leftMargin", "leftMargin", reader);
                    }
                    i11 &= -257;
                    break;
                case 8:
                    paddings3 = this.paddingsAdapter.fromJson(reader);
                    if (paddings3 == null) {
                        throw c.q("topMargin", "topMargin", reader);
                    }
                    i11 &= -513;
                    break;
                case 9:
                    paddings4 = this.paddingsAdapter.fromJson(reader);
                    if (paddings4 == null) {
                        throw c.q("rightMargin", "rightMargin", reader);
                    }
                    i11 &= -1025;
                    break;
                case 10:
                    paddings = this.paddingsAdapter.fromJson(reader);
                    if (paddings == null) {
                        throw c.q("bottomMargin", "bottomMargin", reader);
                    }
                    i11 &= -2049;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -3969) {
            BadgeDTO badgeDTO2 = badgeDTO;
            TextDTO textDTO3 = textDTO2;
            TextDTO textDTO4 = textDTO;
            if (textDTO4 == null) {
                throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
            }
            Intrinsics.g(cornerRadius, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.CornerRadius");
            Intrinsics.g(paddings2, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.Paddings");
            Intrinsics.g(paddings3, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.Paddings");
            Intrinsics.g(paddings4, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.Paddings");
            Intrinsics.g(paddings, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.Paddings");
            Paddings paddings5 = paddings2;
            CornerRadius cornerRadius2 = cornerRadius;
            return new HeaderDTO(textDTO4, textDTO3, badgeDTO2, false, str, atomActionDTO, map, cornerRadius2, paddings5, paddings3, paddings4, paddings, 8, null);
        }
        Paddings paddings6 = paddings;
        BadgeDTO badgeDTO3 = badgeDTO;
        Paddings paddings7 = paddings2;
        TextDTO textDTO5 = textDTO2;
        CornerRadius cornerRadius3 = cornerRadius;
        TextDTO textDTO6 = textDTO;
        Map<String, TokenizedTrackingInfo> map2 = map;
        AtomActionDTO atomActionDTO2 = atomActionDTO;
        String str2 = str;
        Constructor<HeaderDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = HeaderDTO.class.getDeclaredConstructor(TextDTO.class, TextDTO.class, BadgeDTO.class, Boolean.TYPE, String.class, AtomActionDTO.class, Map.class, CornerRadius.class, Paddings.class, Paddings.class, Paddings.class, Paddings.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (textDTO6 == null) {
            throw c.j(SelectionItemFormDTO.TITLE_FIELD_NAME, SelectionItemFormDTO.TITLE_FIELD_NAME, reader);
        }
        HeaderDTO newInstance = constructor.newInstance(textDTO6, textDTO5, badgeDTO3, Boolean.FALSE, str2, atomActionDTO2, map2, cornerRadius3, paddings7, paddings3, paddings4, paddings6, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, HeaderDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.textDTOAdapter.mo44toJson(writer, (x) value_.getTitle());
        writer.w("subtitle");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value_.getSubtitle());
        writer.w("badge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value_.getBadge());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getBackgroundColor());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value_.getAction());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.w("topIslandCornerRadius");
        this.cornerRadiusAdapter.mo44toJson(writer, (x) value_.getTopIslandCornerRadius());
        writer.w("leftMargin");
        this.paddingsAdapter.mo44toJson(writer, (x) value_.getLeftMargin());
        writer.w("topMargin");
        this.paddingsAdapter.mo44toJson(writer, (x) value_.getTopMargin());
        writer.w("rightMargin");
        this.paddingsAdapter.mo44toJson(writer, (x) value_.getRightMargin());
        writer.w("bottomMargin");
        this.paddingsAdapter.mo44toJson(writer, (x) value_.getBottomMargin());
        writer.p();
    }
}
