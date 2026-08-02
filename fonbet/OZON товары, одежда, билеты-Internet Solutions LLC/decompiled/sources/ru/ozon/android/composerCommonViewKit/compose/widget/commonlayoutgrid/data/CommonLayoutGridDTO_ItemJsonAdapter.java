package ru.ozon.android.composerCommonViewKit.compose.widget.commonlayoutgrid.data;

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
import ru.ozon.android.composerCommonViewKit.compose.widget.commonlayoutgrid.data.CommonLayoutGridDTO;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R(\u0010%\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020$\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO_ItemJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO$Item;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO$Item;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/composerCommonViewKit/compose/widget/commonlayoutgrid/data/CommonLayoutGridDTO$Item;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "imageDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "nullableTextDTOAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "", "nullableBooleanAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CommonLayoutGridDTO_ItemJsonAdapter extends JsonAdapter<CommonLayoutGridDTO.Item> {
    public static final int $stable = 8;
    private volatile Constructor<CommonLayoutGridDTO.Item> constructorRef;

    @NotNull
    private final JsonAdapter<ImageDTO> imageDTOAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    public CommonLayoutGridDTO_ItemJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("image", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "adBadge", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "blurPlaceholderImage", "action", "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<ImageDTO> f7 = moshi.f(ImageDTO.class, m11, "image");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.imageDTOAdapter = f7;
        JsonAdapter<TextDTO> f11 = moshi.f(TextDTO.class, m11, SelectionItemFormDTO.TITLE_FIELD_NAME);
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableTextDTOAdapter = f11;
        JsonAdapter<BadgeDTO> f12 = moshi.f(BadgeDTO.class, m11, "adBadge");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableBadgeDTOAdapter = f12;
        JsonAdapter<Boolean> f13 = moshi.f(Boolean.class, m11, FavoriteProductMolecule.IS_ADULT_PARAMS_NAME);
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableBooleanAdapter = f13;
        JsonAdapter<String> f14 = moshi.f(String.class, m11, "blurPlaceholderImage");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableStringAdapter = f14;
        JsonAdapter<AtomActionDTO> f15 = moshi.f(AtomActionDTO.class, m11, "action");
        Intrinsics.checkNotNullExpressionValue(f15, "adapter(...)");
        this.nullableAtomActionDTOAdapter = f15;
        JsonAdapter<Map<String, TokenizedTrackingInfo>> f16 = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f16, "adapter(...)");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = f16;
    }

    @NotNull
    public String toString() {
        return b.c(46, "GeneratedJsonAdapter(CommonLayoutGridDTO.Item)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CommonLayoutGridDTO.Item fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        ImageDTO imageDTO = null;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        BadgeDTO badgeDTO = null;
        Boolean bool = null;
        String str = null;
        AtomActionDTO atomActionDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    imageDTO = this.imageDTOAdapter.fromJson(reader);
                    if (imageDTO == null) {
                        throw c.q("image", "image", reader);
                    }
                    break;
                case 1:
                    textDTO = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 6:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 7:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i11 &= -129;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -145) {
            Map<String, TokenizedTrackingInfo> map2 = map;
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            String str2 = str;
            Boolean bool2 = bool;
            BadgeDTO badgeDTO2 = badgeDTO;
            TextDTO textDTO3 = textDTO2;
            TextDTO textDTO4 = textDTO;
            ImageDTO imageDTO2 = imageDTO;
            if (imageDTO2 != null) {
                return new CommonLayoutGridDTO.Item(imageDTO2, textDTO4, textDTO3, badgeDTO2, bool2, str2, atomActionDTO2, map2);
            }
            throw c.j("image", "image", reader);
        }
        Map<String, TokenizedTrackingInfo> map3 = map;
        AtomActionDTO atomActionDTO3 = atomActionDTO;
        String str3 = str;
        Boolean bool3 = bool;
        BadgeDTO badgeDTO3 = badgeDTO;
        TextDTO textDTO5 = textDTO2;
        TextDTO textDTO6 = textDTO;
        ImageDTO imageDTO3 = imageDTO;
        Constructor<CommonLayoutGridDTO.Item> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CommonLayoutGridDTO.Item.class.getDeclaredConstructor(ImageDTO.class, TextDTO.class, TextDTO.class, BadgeDTO.class, Boolean.class, String.class, AtomActionDTO.class, Map.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (imageDTO3 == null) {
            throw c.j("image", "image", reader);
        }
        CommonLayoutGridDTO.Item newInstance = constructor.newInstance(imageDTO3, textDTO6, textDTO5, badgeDTO3, bool3, str3, atomActionDTO3, map3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CommonLayoutGridDTO.Item value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("image");
        this.imageDTOAdapter.mo44toJson(writer, (x) value_.getImage());
        writer.w(SelectionItemFormDTO.TITLE_FIELD_NAME);
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value_.getTitle());
        writer.w("subtitle");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value_.getSubtitle());
        writer.w("adBadge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value_.getAdBadge());
        writer.w(FavoriteProductMolecule.IS_ADULT_PARAMS_NAME);
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value_.isAdult());
        writer.w("blurPlaceholderImage");
        this.nullableStringAdapter.mo44toJson(writer, (x) value_.getBlurPlaceholderImage());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value_.getAction());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.p();
    }
}
