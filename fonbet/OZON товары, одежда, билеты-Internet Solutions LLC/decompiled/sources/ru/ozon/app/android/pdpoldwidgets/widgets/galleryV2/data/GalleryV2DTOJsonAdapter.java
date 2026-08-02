package ru.ozon.app.android.pdpoldwidgets.widgets.galleryV2.data;

import Y9.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
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
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pdpoldwidgets.widgets.galleryV2.data.GalleryV2DTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\"\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001aR\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001aR4\u0010'\u001a\"\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020&0%\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001aR\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001aR\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u001aR\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010\u001aR\u001e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/data/GalleryV2DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/data/GalleryV2DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/data/GalleryV2DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/data/GalleryV2DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/data/GalleryV2DTO$ImageDTO;", "listOfImageDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/badge/Badge;", "nullableListOfBadgeAdapter", "Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/data/GalleryV2DTO$Photo360;", "nullablePhoto360Adapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeIconButton;", "nullableListOfLargeIconButtonAdapter", "Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/data/GalleryV2DTO$Ratio;", "nullableRatioAdapter", "", "nullableBooleanAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringMapOfStringTokenizedTrackingInfoAdapter", "Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/data/GalleryV2DTO$ClassifiedInfo;", "nullableClassifiedInfoAdapter", "", "nullableFloatAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryV2DTOJsonAdapter extends JsonAdapter<GalleryV2DTO> {
    private volatile Constructor<GalleryV2DTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<GalleryV2DTO.ImageDTO>> listOfImageDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<GalleryV2DTO.ClassifiedInfo> nullableClassifiedInfoAdapter;

    @NotNull
    private final JsonAdapter<Float> nullableFloatAdapter;

    @NotNull
    private final JsonAdapter<List<Badge>> nullableListOfBadgeAdapter;

    @NotNull
    private final JsonAdapter<List<ButtonV3Atom.LargeIconButton>> nullableListOfLargeIconButtonAdapter;

    @NotNull
    private final JsonAdapter<Map<String, Map<String, TokenizedTrackingInfo>>> nullableMapOfStringMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<GalleryV2DTO.Photo360> nullablePhoto360Adapter;

    @NotNull
    private final JsonAdapter<GalleryV2DTO.Ratio> nullableRatioAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public GalleryV2DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("images", "badges", "photo360", "buttons", "ratio", "isBorderless", "trackingInfo", "isClassified", "classifiedInfo", "isParandjaEnabled", "imageAlpha", "backgroundColor");
        b e11 = D.e(List.class, GalleryV2DTO.ImageDTO.class);
        M m11 = M.f71699a;
        this.listOfImageDTOAdapter = moshi.f(e11, m11, "images");
        this.nullableListOfBadgeAdapter = moshi.f(D.e(List.class, Badge.class), m11, "badges");
        this.nullablePhoto360Adapter = moshi.f(GalleryV2DTO.Photo360.class, m11, "photo360");
        this.nullableListOfLargeIconButtonAdapter = moshi.f(D.e(List.class, ButtonV3Atom.LargeIconButton.class), m11, "buttons");
        this.nullableRatioAdapter = moshi.f(GalleryV2DTO.Ratio.class, m11, "ratio");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "isBorderless");
        this.nullableMapOfStringMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, D.e(Map.class, String.class, TokenizedTrackingInfo.class)), m11, "trackingInfo");
        this.nullableClassifiedInfoAdapter = moshi.f(GalleryV2DTO.ClassifiedInfo.class, m11, "classifiedInfo");
        this.nullableFloatAdapter = moshi.f(Float.class, m11, "imageAlpha");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(34, "GeneratedJsonAdapter(GalleryV2DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public GalleryV2DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<GalleryV2DTO.ImageDTO> list = null;
        List<Badge> list2 = null;
        GalleryV2DTO.Photo360 photo360 = null;
        List<ButtonV3Atom.LargeIconButton> list3 = null;
        GalleryV2DTO.Ratio ratio = null;
        Boolean bool = null;
        Map<String, Map<String, TokenizedTrackingInfo>> map = null;
        Boolean bool2 = null;
        GalleryV2DTO.ClassifiedInfo classifiedInfo = null;
        Boolean bool3 = null;
        Float f7 = null;
        String str = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    list = this.listOfImageDTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("images", "images", reader);
                    }
                    break;
                case 1:
                    list2 = this.nullableListOfBadgeAdapter.fromJson(reader);
                    break;
                case 2:
                    photo360 = this.nullablePhoto360Adapter.fromJson(reader);
                    break;
                case 3:
                    list3 = this.nullableListOfLargeIconButtonAdapter.fromJson(reader);
                    break;
                case 4:
                    ratio = this.nullableRatioAdapter.fromJson(reader);
                    break;
                case 5:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 6:
                    map = this.nullableMapOfStringMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
                case 7:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 8:
                    classifiedInfo = this.nullableClassifiedInfoAdapter.fromJson(reader);
                    break;
                case 9:
                    bool3 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 10:
                    f7 = this.nullableFloatAdapter.fromJson(reader);
                    break;
                case 11:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (list != null) {
            return new GalleryV2DTO(list, list2, photo360, list3, ratio, bool, map, bool2, classifiedInfo, bool3, f7, str, false, 4096, null);
        }
        throw c.j("images", "images", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, GalleryV2DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("images");
        this.listOfImageDTOAdapter.mo44toJson(writer, (x) value.getImages());
        writer.w("badges");
        this.nullableListOfBadgeAdapter.mo44toJson(writer, (x) value.getBadges());
        writer.w("photo360");
        this.nullablePhoto360Adapter.mo44toJson(writer, (x) value.getPhoto360());
        writer.w("buttons");
        this.nullableListOfLargeIconButtonAdapter.mo44toJson(writer, (x) value.getButtons());
        writer.w("ratio");
        this.nullableRatioAdapter.mo44toJson(writer, (x) value.getRatio());
        writer.w("isBorderless");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isBorderless());
        writer.w("trackingInfo");
        this.nullableMapOfStringMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.w("isClassified");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isClassified());
        writer.w("classifiedInfo");
        this.nullableClassifiedInfoAdapter.mo44toJson(writer, (x) value.getClassifiedInfo());
        writer.w("isParandjaEnabled");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.isParandjaEnabled());
        writer.w("imageAlpha");
        this.nullableFloatAdapter.mo44toJson(writer, (x) value.getImageAlpha());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.p();
    }
}
