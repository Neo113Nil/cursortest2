package ru.ozon.app.android.common.promobanner.data;

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
import ru.ozon.app.android.common.promobanner.data.PromoBannerV2DTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R(\u0010%\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020$\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0018R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0018¨\u0006*"}, d2 = {"Lru/ozon/app/android/common/promobanner/data/PromoBannerV2DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/common/promobanner/data/PromoBannerV2DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/common/promobanner/data/PromoBannerV2DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/common/promobanner/data/PromoBannerV2DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "nullableSmallIconButtonAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "nullableSmallButtonAdapter", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "nullableTextAtomAdapter", "", "nullableBooleanAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "Lru/ozon/app/android/common/promobanner/data/PromoBannerV2DTO$MarginsDTO;", "nullableMarginsDTOAdapter", "promo-banner_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PromoBannerV2DTOJsonAdapter extends JsonAdapter<PromoBannerV2DTO> {

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<PromoBannerV2DTO.MarginsDTO> nullableMarginsDTOAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.SmallButton> nullableSmallButtonAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.SmallIconButton> nullableSmallIconButtonAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public PromoBannerV2DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("theme", "image", "backgroundColor", "outerBackgroundColor", "iconButton", "actionButton", "titleAtom", "description", "isRounded", "showShadow", "hideParandja", "actionButtonPosition", "trackingInfo", "adBadge", "margins");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "theme");
        this.nullableStringAdapter = moshi.f(String.class, m11, "image");
        this.nullableSmallIconButtonAdapter = moshi.f(ButtonV3Atom.SmallIconButton.class, m11, "iconButton");
        this.nullableSmallButtonAdapter = moshi.f(ButtonV3Atom.SmallButton.class, m11, "actionButton");
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, "titleAtom");
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "description");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "isRounded");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "adBadge");
        this.nullableMarginsDTOAdapter = moshi.f(PromoBannerV2DTO.MarginsDTO.class, m11, "margins");
    }

    @NotNull
    public String toString() {
        return b.c(38, "GeneratedJsonAdapter(PromoBannerV2DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public PromoBannerV2DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ButtonV3Atom.SmallIconButton smallIconButton = null;
        ButtonV3Atom.SmallButton smallButton = null;
        TextAtom textAtom = null;
        TextAtom textAtom2 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        String str5 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        BadgeDTO badgeDTO = null;
        PromoBannerV2DTO.MarginsDTO marginsDTO = null;
        while (reader.hasNext()) {
            String str6 = str;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("theme", "theme", reader);
                    }
                    continue;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    smallIconButton = this.nullableSmallIconButtonAdapter.fromJson(reader);
                    break;
                case 5:
                    smallButton = this.nullableSmallButtonAdapter.fromJson(reader);
                    break;
                case 6:
                    textAtom = this.textAtomAdapter.fromJson(reader);
                    if (textAtom == null) {
                        throw c.q("titleAtom", "titleAtom", reader);
                    }
                    break;
                case 7:
                    textAtom2 = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 8:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 9:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 10:
                    bool3 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 11:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 12:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 13:
                    badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
                    break;
                case 14:
                    marginsDTO = this.nullableMarginsDTOAdapter.fromJson(reader);
                    break;
            }
            str = str6;
        }
        String str7 = str;
        reader.endObject();
        if (str7 == null) {
            throw c.j("theme", "theme", reader);
        }
        if (textAtom != null) {
            return new PromoBannerV2DTO(str7, str2, str3, str4, smallIconButton, smallButton, textAtom, textAtom2, bool, bool2, bool3, str5, map, badgeDTO, marginsDTO);
        }
        throw c.j("titleAtom", "titleAtom", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, PromoBannerV2DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("theme");
        this.stringAdapter.mo44toJson(writer, (x) value.getTheme());
        writer.w("image");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("outerBackgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getOuterBackgroundColor());
        writer.w("iconButton");
        this.nullableSmallIconButtonAdapter.mo44toJson(writer, (x) value.getIconButton());
        writer.w("actionButton");
        this.nullableSmallButtonAdapter.mo44toJson(writer, (x) value.getActionButton());
        writer.w("titleAtom");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getTitleAtom());
        writer.w("description");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getDescription());
        writer.w("isRounded");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isRounded());
        writer.w("showShadow");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getShowShadow());
        writer.w("hideParandja");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getHideParandja());
        writer.w("actionButtonPosition");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getActionButtonPosition());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("adBadge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getAdBadge());
        writer.w("margins");
        this.nullableMarginsDTOAdapter.mo44toJson(writer, (x) value.getMargins());
        writer.p();
    }
}
