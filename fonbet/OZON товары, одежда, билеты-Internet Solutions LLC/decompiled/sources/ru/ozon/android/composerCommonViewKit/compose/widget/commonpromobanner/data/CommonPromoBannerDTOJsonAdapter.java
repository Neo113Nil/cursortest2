package ru.ozon.android.composerCommonViewKit.compose.widget.commonpromobanner.data;

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
import ru.ozon.android.composerCommonViewKit.compose.widget.commonpromobanner.data.CommonPromoBannerDTO;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.models.UniRadiusToken;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019R(\u0010-\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020,\u0018\u00010+0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0019R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010.0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0019R\u001e\u00101\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/data/CommonPromoBannerDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/data/CommonPromoBannerDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/data/CommonPromoBannerDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/data/CommonPromoBannerDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "nullableTextDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/data/CommonPromoBannerDTO$ThemeType;", "themeTypeAdapter", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "imageDTOAdapter", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/data/CommonPromoBannerDTO$Background;", "nullableBackgroundAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "nullableButtonV3DTOAdapter", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "nullableIconButtonV3DTOAdapter", "Lru/ozon/uni/core/models/UniRadiusToken;", "nullableUniRadiusTokenAdapter", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/data/CommonPromoBannerDTO$Margins;", "nullableMarginsAdapter", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/data/CommonPromoBannerDTO$Paddings;", "nullablePaddingsAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CommonPromoBannerDTOJsonAdapter extends JsonAdapter<CommonPromoBannerDTO> {
    public static final int $stable = 8;
    private volatile Constructor<CommonPromoBannerDTO> constructorRef;

    @NotNull
    private final JsonAdapter<ImageDTO> imageDTOAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<CommonPromoBannerDTO.Background> nullableBackgroundAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> nullableButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<IconButtonV3DTO> nullableIconButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<CommonPromoBannerDTO.Margins> nullableMarginsAdapter;

    @NotNull
    private final JsonAdapter<CommonPromoBannerDTO.Paddings> nullablePaddingsAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final JsonAdapter<UniRadiusToken> nullableUniRadiusTokenAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<CommonPromoBannerDTO.ThemeType> themeTypeAdapter;

    public CommonPromoBannerDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a(SelectionItemFormDTO.TITLE_FIELD_NAME, "description", "theme", "image", "backgroundColor", "backgroundImage", "actionButton", "closeButton", "cornerRadius", "margins", "paddings", "trackingInfo", "action");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<TextDTO> f7 = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.nullableTextDTOAdapter = f7;
        JsonAdapter<CommonPromoBannerDTO.ThemeType> f11 = moshi.f(CommonPromoBannerDTO.ThemeType.class, m11, "theme");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.themeTypeAdapter = f11;
        JsonAdapter<ImageDTO> f12 = moshi.f(ImageDTO.class, m11, "image");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.imageDTOAdapter = f12;
        JsonAdapter<CommonPromoBannerDTO.Background> f13 = moshi.f(CommonPromoBannerDTO.Background.class, m11, "backgroundColor");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableBackgroundAdapter = f13;
        JsonAdapter<String> f14 = moshi.f(String.class, m11, "backgroundImage");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableStringAdapter = f14;
        JsonAdapter<ButtonV3DTO> f15 = moshi.f(ButtonV3DTO.class, m11, "actionButton");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableButtonV3DTOAdapter = f15;
        JsonAdapter<IconButtonV3DTO> f16 = moshi.f(IconButtonV3DTO.class, m11, "closeButton");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableIconButtonV3DTOAdapter = f16;
        JsonAdapter<UniRadiusToken> f17 = moshi.f(UniRadiusToken.class, m11, "cornerRadius");
        Intrinsics.checkNotNullExpressionValue(f17, "adapter(...)");
        this.nullableUniRadiusTokenAdapter = f17;
        JsonAdapter<CommonPromoBannerDTO.Margins> f18 = moshi.f(CommonPromoBannerDTO.Margins.class, m11, "margins");
        Intrinsics.checkNotNullExpressionValue(f18, "adapter(...)");
        this.nullableMarginsAdapter = f18;
        JsonAdapter<CommonPromoBannerDTO.Paddings> f19 = moshi.f(CommonPromoBannerDTO.Paddings.class, m11, "paddings");
        Intrinsics.checkNotNullExpressionValue(f19, "adapter(...)");
        this.nullablePaddingsAdapter = f19;
        JsonAdapter<Map<String, TokenizedTrackingInfo>> f21 = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f21, "adapter(...)");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = f21;
        JsonAdapter<AtomActionDTO> f22 = moshi.f(AtomActionDTO.class, m11, "action");
        Intrinsics.checkNotNullExpressionValue(f22, "adapter(...)");
        this.nullableAtomActionDTOAdapter = f22;
    }

    @NotNull
    public String toString() {
        return b.c(42, "GeneratedJsonAdapter(CommonPromoBannerDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CommonPromoBannerDTO fromJson(@NotNull n reader) {
        int i11;
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i12 = -1;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        CommonPromoBannerDTO.ThemeType themeType = null;
        ImageDTO imageDTO = null;
        CommonPromoBannerDTO.Background background = null;
        String str = null;
        ButtonV3DTO buttonV3DTO = null;
        IconButtonV3DTO iconButtonV3DTO = null;
        UniRadiusToken uniRadiusToken = null;
        CommonPromoBannerDTO.Margins margins = null;
        CommonPromoBannerDTO.Paddings paddings = null;
        Map<String, TokenizedTrackingInfo> map = null;
        AtomActionDTO atomActionDTO = null;
        while (reader.hasNext()) {
            TextDTO textDTO3 = textDTO;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    textDTO = this.nullableTextDTOAdapter.fromJson(reader);
                    continue;
                case 1:
                    textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    themeType = this.themeTypeAdapter.fromJson(reader);
                    if (themeType == null) {
                        throw c.q("theme", "theme", reader);
                    }
                    break;
                case 3:
                    imageDTO = this.imageDTOAdapter.fromJson(reader);
                    if (imageDTO == null) {
                        throw c.q("image", "image", reader);
                    }
                    break;
                case 4:
                    background = this.nullableBackgroundAdapter.fromJson(reader);
                    break;
                case 5:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 6:
                    buttonV3DTO = this.nullableButtonV3DTOAdapter.fromJson(reader);
                    break;
                case 7:
                    iconButtonV3DTO = this.nullableIconButtonV3DTOAdapter.fromJson(reader);
                    break;
                case 8:
                    uniRadiusToken = this.nullableUniRadiusTokenAdapter.fromJson(reader);
                    break;
                case 9:
                    margins = this.nullableMarginsAdapter.fromJson(reader);
                    break;
                case 10:
                    paddings = this.nullablePaddingsAdapter.fromJson(reader);
                    break;
                case 11:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    textDTO = textDTO3;
                    i12 = -2049;
                    continue;
                case 12:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
            }
            textDTO = textDTO3;
        }
        TextDTO textDTO4 = textDTO;
        reader.endObject();
        if (i12 == -2049) {
            if (themeType == null) {
                throw c.j("theme", "theme", reader);
            }
            if (imageDTO == null) {
                throw c.j("image", "image", reader);
            }
            UniRadiusToken uniRadiusToken2 = uniRadiusToken;
            IconButtonV3DTO iconButtonV3DTO2 = iconButtonV3DTO;
            ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
            String str2 = str;
            CommonPromoBannerDTO.Background background2 = background;
            return new CommonPromoBannerDTO(textDTO4, textDTO2, themeType, imageDTO, background2, str2, buttonV3DTO2, iconButtonV3DTO2, uniRadiusToken2, margins, paddings, map, atomActionDTO);
        }
        Constructor<CommonPromoBannerDTO> constructor = this.constructorRef;
        if (constructor == null) {
            i11 = i12;
            constructor = CommonPromoBannerDTO.class.getDeclaredConstructor(TextDTO.class, TextDTO.class, CommonPromoBannerDTO.ThemeType.class, ImageDTO.class, CommonPromoBannerDTO.Background.class, String.class, ButtonV3DTO.class, IconButtonV3DTO.class, UniRadiusToken.class, CommonPromoBannerDTO.Margins.class, CommonPromoBannerDTO.Paddings.class, Map.class, AtomActionDTO.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        } else {
            i11 = i12;
        }
        Constructor<CommonPromoBannerDTO> constructor2 = constructor;
        if (themeType == null) {
            throw c.j("theme", "theme", reader);
        }
        if (imageDTO == null) {
            throw c.j("image", "image", reader);
        }
        CommonPromoBannerDTO newInstance = constructor2.newInstance(textDTO4, textDTO2, themeType, imageDTO, background, str, buttonV3DTO, iconButtonV3DTO, uniRadiusToken, margins, paddings, map, atomActionDTO, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CommonPromoBannerDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value_.getTitle());
        writer.w("description");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value_.getDescription());
        writer.w("theme");
        this.themeTypeAdapter.mo44toJson(writer, (x) value_.getTheme());
        writer.w("image");
        this.imageDTOAdapter.mo44toJson(writer, (x) value_.getImage());
        writer.w("backgroundColor");
        this.nullableBackgroundAdapter.mo44toJson(writer, (x) value_.getBackgroundColor());
        writer.w("backgroundImage");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getBackgroundImage());
        writer.w("actionButton");
        this.nullableButtonV3DTOAdapter.mo44toJson(writer, (x) value_.getActionButton());
        writer.w("closeButton");
        this.nullableIconButtonV3DTOAdapter.mo44toJson(writer, (x) value_.getCloseButton());
        writer.w("cornerRadius");
        this.nullableUniRadiusTokenAdapter.mo44toJson(writer, (x) value_.getCornerRadius());
        writer.w("margins");
        this.nullableMarginsAdapter.mo44toJson(writer, (x) value_.getMargins());
        writer.w("paddings");
        this.nullablePaddingsAdapter.mo44toJson(writer, (x) value_.getPaddings());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value_.getAction());
        writer.p();
    }
}
