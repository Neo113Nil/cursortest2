package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data;

import Ak.b;
import C.o0;
import Y9.c;
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
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R(\u0010\u001f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO_ReviewGalleryV2Item_ProductRatingDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ProductRatingDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ProductRatingDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/data/ReviewGalleryV2DTO$ReviewGalleryV2Item$ProductRatingDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "nullableFloatAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "", "intAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReviewGalleryV2DTO_ReviewGalleryV2Item_ProductRatingDTOJsonAdapter extends JsonAdapter<ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductRatingDTO> {
    public static final int $stable = 8;
    private volatile Constructor<ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductRatingDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Float> nullableFloatAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public ReviewGalleryV2DTO_ReviewGalleryV2Item_ProductRatingDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("mark", "text", "textStyle", "textColor", "action", "trackingInfo", "iconSize", "contentSpacing", "maxLines");
        M m11 = M.f71699a;
        this.nullableFloatAdapter = moshi.f(Float.class, m11, "mark");
        this.stringAdapter = moshi.f(String.class, m11, "text");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
        this.intAdapter = moshi.f(Integer.TYPE, m11, "iconSize");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductRatingDTO fromJson(@NotNull n reader) {
        String str = null;
        Integer a11 = o0.a(reader, "reader", 0);
        Integer num = a11;
        Integer num2 = num;
        Float f7 = null;
        String str2 = null;
        AtomActionDTO atomActionDTO = null;
        Map<String, TokenizedTrackingInfo> map = null;
        int i11 = -1;
        String str3 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    f7 = this.nullableFloatAdapter.fromJson(reader);
                    break;
                case 1:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("text", "text", reader);
                    }
                    break;
                case 2:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("textStyle", "textStyle", reader);
                    }
                    i11 &= -5;
                    break;
                case 3:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("textColor", "textColor", reader);
                    }
                    i11 &= -9;
                    break;
                case 4:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 6:
                    a11 = this.intAdapter.fromJson(reader);
                    if (a11 == null) {
                        throw c.q("iconSize", "iconSize", reader);
                    }
                    i11 &= -65;
                    break;
                case 7:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("contentSpacing", "contentSpacing", reader);
                    }
                    i11 &= -129;
                    break;
                case 8:
                    num2 = this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        throw c.q("maxLines", "maxLines", reader);
                    }
                    i11 &= -257;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -461) {
            if (str == null) {
                throw c.j("text", "text", reader);
            }
            Intrinsics.g(str3, "null cannot be cast to non-null type kotlin.String");
            Intrinsics.g(str2, "null cannot be cast to non-null type kotlin.String");
            return new ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductRatingDTO(f7, str, str3, str2, atomActionDTO, map, a11.intValue(), num.intValue(), num2.intValue());
        }
        Constructor<ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductRatingDTO> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Integer.TYPE;
            constructor = ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductRatingDTO.class.getDeclaredConstructor(Float.class, String.class, String.class, String.class, AtomActionDTO.class, Map.class, cls2, cls2, cls2, cls2, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (str == null) {
            throw c.j("text", "text", reader);
        }
        ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductRatingDTO newInstance = constructor.newInstance(f7, str, str3, str2, atomActionDTO, map, a11, num, num2, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @NotNull
    public String toString() {
        return b.c(77, "GeneratedJsonAdapter(ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductRatingDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ReviewGalleryV2DTO.ReviewGalleryV2Item.ProductRatingDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("mark");
        this.nullableFloatAdapter.mo44toJson(writer, (x) value.getMark());
        writer.w("text");
        this.stringAdapter.mo44toJson(writer, (x) value.getText());
        writer.w("textStyle");
        this.stringAdapter.mo44toJson(writer, (x) value.getTextStyle());
        writer.w("textColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getTextColor());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("iconSize");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getIconSize()));
        writer.w("contentSpacing");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getContentSpacing()));
        writer.w("maxLines");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getMaxLines()));
        writer.p();
    }
}
