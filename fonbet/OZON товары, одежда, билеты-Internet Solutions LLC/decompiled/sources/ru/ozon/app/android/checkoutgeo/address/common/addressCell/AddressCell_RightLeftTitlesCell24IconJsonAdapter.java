package ru.ozon.app.android.checkoutgeo.address.common.addressCell;

import Ak.b;
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
import ru.ozon.app.android.checkoutgeo.address.common.addressCell.AddressCell;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R(\u0010\"\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020!\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R(\u0010$\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020#\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0018R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell_RightLeftTitlesCell24IconJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$RightLeftTitlesCell24Icon;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$RightLeftTitlesCell24Icon;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$RightLeftTitlesCell24Icon;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "nullableAtomActionDTOAdapter", "", "booleanAdapter", "Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$RightLeftTitlesCell24Icon$StyleType;", "nullableStyleTypeAdapter", "", "Lru/ozon/app/android/checkoutgeo/address/common/addressCell/AddressCell$RightLeftTitlesCell24Icon$StyleColors;", "nullableMapOfStringStyleColorsAdapter", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "checkout-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddressCell_RightLeftTitlesCell24IconJsonAdapter extends JsonAdapter<AddressCell.RightLeftTitlesCell24Icon> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<AddressCell.RightLeftTitlesCell24Icon> constructorRef;

    @NotNull
    private final JsonAdapter<AtomActionDTO> nullableAtomActionDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, AddressCell.RightLeftTitlesCell24Icon.StyleColors>> nullableMapOfStringStyleColorsAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<AddressCell.RightLeftTitlesCell24Icon.StyleType> nullableStyleTypeAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public AddressCell_RightLeftTitlesCell24IconJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("leftTitle", "rightTitle", "action", "icon", "iconTintColor", "titlesColor", "hideSeparator", "rightIcon", "rightIconTintColor", "styleType", "styleInfo", "trackingInfo");
        M m11 = M.f71699a;
        this.nullableStringAdapter = moshi.f(String.class, m11, "leftTitle");
        this.stringAdapter = moshi.f(String.class, m11, "rightTitle");
        this.nullableAtomActionDTOAdapter = moshi.f(AtomActionDTO.class, m11, "action");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "hideSeparator");
        this.nullableStyleTypeAdapter = moshi.f(AddressCell.RightLeftTitlesCell24Icon.StyleType.class, m11, "styleType");
        this.nullableMapOfStringStyleColorsAdapter = moshi.f(D.e(Map.class, String.class, AddressCell.RightLeftTitlesCell24Icon.StyleColors.class), m11, "styleInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(59, "GeneratedJsonAdapter(AddressCell.RightLeftTitlesCell24Icon)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AddressCell.RightLeftTitlesCell24Icon fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        int i11 = -1;
        Boolean bool2 = bool;
        String str = null;
        String str2 = null;
        AtomActionDTO atomActionDTO = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        AddressCell.RightLeftTitlesCell24Icon.StyleType styleType = null;
        Map<String, AddressCell.RightLeftTitlesCell24Icon.StyleColors> map = null;
        Map<String, TokenizedTrackingInfo> map2 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("rightTitle", "rightTitle", reader);
                    }
                    break;
                case 2:
                    atomActionDTO = this.nullableAtomActionDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    str5 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 6:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("hideSeparator", "hideSeparator", reader);
                    }
                    i11 = -65;
                    break;
                case 7:
                    str6 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 8:
                    str7 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 9:
                    styleType = this.nullableStyleTypeAdapter.fromJson(reader);
                    break;
                case 10:
                    map = this.nullableMapOfStringStyleColorsAdapter.fromJson(reader);
                    break;
                case 11:
                    map2 = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -65) {
            if (str2 == null) {
                throw c.j("rightTitle", "rightTitle", reader);
            }
            return new AddressCell.RightLeftTitlesCell24Icon(str, str2, atomActionDTO, str3, str4, str5, bool2.booleanValue(), str6, str7, styleType, map, map2);
        }
        Constructor<AddressCell.RightLeftTitlesCell24Icon> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = AddressCell.RightLeftTitlesCell24Icon.class.getDeclaredConstructor(String.class, String.class, AtomActionDTO.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, AddressCell.RightLeftTitlesCell24Icon.StyleType.class, Map.class, Map.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (str2 == null) {
            throw c.j("rightTitle", "rightTitle", reader);
        }
        AddressCell.RightLeftTitlesCell24Icon newInstance = constructor.newInstance(str, str2, atomActionDTO, str3, str4, str5, bool2, str6, str7, styleType, map, map2, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AddressCell.RightLeftTitlesCell24Icon value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("leftTitle");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getLeftTitle());
        writer.w("rightTitle");
        this.stringAdapter.mo44toJson(writer, (x) value.getRightTitle());
        writer.w("action");
        this.nullableAtomActionDTOAdapter.mo44toJson(writer, (x) value.getAction());
        writer.w("icon");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getIcon());
        writer.w("iconTintColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getIconTintColor());
        writer.w("titlesColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getTitlesColor());
        writer.w("hideSeparator");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getHideSeparator()));
        writer.w("rightIcon");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getRightIcon());
        writer.w("rightIconTintColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getRightIconTintColor());
        writer.w("styleType");
        this.nullableStyleTypeAdapter.mo44toJson(writer, (x) value.getStyleType());
        writer.w("styleInfo");
        this.nullableMapOfStringStyleColorsAdapter.mo44toJson(writer, (x) value.getStyleInfo());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
