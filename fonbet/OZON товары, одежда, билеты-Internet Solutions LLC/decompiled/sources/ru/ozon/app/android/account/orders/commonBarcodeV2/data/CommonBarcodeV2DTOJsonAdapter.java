package ru.ozon.app.android.account.orders.commonBarcodeV2.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0018R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0018R\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/account/orders/commonBarcodeV2/data/CommonBarcodeV2DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/account/orders/commonBarcodeV2/data/CommonBarcodeV2DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/account/orders/commonBarcodeV2/data/CommonBarcodeV2DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/account/orders/commonBarcodeV2/data/CommonBarcodeV2DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "nullableTextDTOAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "", "booleanAdapter", "Lru/ozon/uni/atoms/data/common/Paddings;", "nullablePaddingsAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "nullableCornerRadiusAdapter", "", "nullableIntAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonBarcodeV2DTOJsonAdapter extends JsonAdapter<CommonBarcodeV2DTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<CommonBarcodeV2DTO> constructorRef;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<CornerRadius> nullableCornerRadiusAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<Paddings> nullablePaddingsAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public CommonBarcodeV2DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("code", "visibleCode", "subtitle", "common", "isOfflineMode", "containerTopPadding", "containerHorizontalPadding", "containerBackdropColor", "containerCornerRadius", "barcodeHeight", "horizontalPadding", "barcodeTopLightPadding", "barcodeTopDarkPadding", "barcodeBottomLightPadding", "barcodeBottomDarkPadding", "barcodeCornerRadius");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "code");
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, "visibleCode");
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "subtitle");
        this.nullableCommonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "common");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isOfflineMode");
        this.nullablePaddingsAdapter = moshi.f(Paddings.class, m11, "containerTopPadding");
        this.nullableStringAdapter = moshi.f(String.class, m11, "containerBackdropColor");
        this.nullableCornerRadiusAdapter = moshi.f(CornerRadius.class, m11, "containerCornerRadius");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "barcodeHeight");
    }

    @NotNull
    public String toString() {
        return b.c(40, "GeneratedJsonAdapter(CommonBarcodeV2DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CommonBarcodeV2DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        int i11 = -1;
        Boolean bool2 = bool;
        String str = null;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        CommonControlSettings commonControlSettings = null;
        Integer num = null;
        Paddings paddings = null;
        Paddings paddings2 = null;
        String str2 = null;
        CornerRadius cornerRadius = null;
        Integer num2 = null;
        Paddings paddings3 = null;
        Paddings paddings4 = null;
        Paddings paddings5 = null;
        Paddings paddings6 = null;
        CornerRadius cornerRadius2 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("code", "code", reader);
                    }
                    break;
                case 1:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q("visibleCode", "visibleCode", reader);
                    }
                    break;
                case 2:
                    textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 3:
                    commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                    break;
                case 4:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("isOfflineMode", "isOfflineMode", reader);
                    }
                    i11 = -17;
                    break;
                case 5:
                    paddings = this.nullablePaddingsAdapter.fromJson(reader);
                    break;
                case 6:
                    paddings2 = this.nullablePaddingsAdapter.fromJson(reader);
                    break;
                case 7:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 8:
                    cornerRadius = this.nullableCornerRadiusAdapter.fromJson(reader);
                    break;
                case 9:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 10:
                    num = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 11:
                    paddings3 = this.nullablePaddingsAdapter.fromJson(reader);
                    break;
                case 12:
                    paddings4 = this.nullablePaddingsAdapter.fromJson(reader);
                    break;
                case 13:
                    paddings5 = this.nullablePaddingsAdapter.fromJson(reader);
                    break;
                case 14:
                    paddings6 = this.nullablePaddingsAdapter.fromJson(reader);
                    break;
                case 15:
                    cornerRadius2 = this.nullableCornerRadiusAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -17) {
            if (str == null) {
                throw c.j("code", "code", reader);
            }
            if (textDTO == null) {
                throw c.j("visibleCode", "visibleCode", reader);
            }
            return new CommonBarcodeV2DTO(str, textDTO, textDTO2, commonControlSettings, bool2.booleanValue(), paddings, paddings2, str2, cornerRadius, num2, num, paddings3, paddings4, paddings5, paddings6, cornerRadius2);
        }
        Integer num3 = num;
        Constructor<CommonBarcodeV2DTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CommonBarcodeV2DTO.class.getDeclaredConstructor(String.class, TextDTO.class, TextDTO.class, CommonControlSettings.class, Boolean.TYPE, Paddings.class, Paddings.class, String.class, CornerRadius.class, Integer.class, Integer.class, Paddings.class, Paddings.class, Paddings.class, Paddings.class, CornerRadius.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (str == null) {
            throw c.j("code", "code", reader);
        }
        if (textDTO == null) {
            throw c.j("visibleCode", "visibleCode", reader);
        }
        CommonBarcodeV2DTO newInstance = constructor.newInstance(str, textDTO, textDTO2, commonControlSettings, bool2, paddings, paddings2, str2, cornerRadius, num2, num3, paddings3, paddings4, paddings5, paddings6, cornerRadius2, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CommonBarcodeV2DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("code");
        this.stringAdapter.mo44toJson(writer, (x) value.getCode());
        writer.w("visibleCode");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getVisibleCode());
        writer.w("subtitle");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getSubtitle());
        writer.w("common");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value.getCommon());
        writer.w("isOfflineMode");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isOfflineMode()));
        writer.w("containerTopPadding");
        this.nullablePaddingsAdapter.mo44toJson(writer, (x) value.getContainerTopPadding());
        writer.w("containerHorizontalPadding");
        this.nullablePaddingsAdapter.mo44toJson(writer, (x) value.getContainerHorizontalPadding());
        writer.w("containerBackdropColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getContainerBackdropColor());
        writer.w("containerCornerRadius");
        this.nullableCornerRadiusAdapter.mo44toJson(writer, (x) value.getContainerCornerRadius());
        writer.w("barcodeHeight");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getBarcodeHeight());
        writer.w("horizontalPadding");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getHorizontalPadding());
        writer.w("barcodeTopLightPadding");
        this.nullablePaddingsAdapter.mo44toJson(writer, (x) value.getBarcodeTopLightPadding());
        writer.w("barcodeTopDarkPadding");
        this.nullablePaddingsAdapter.mo44toJson(writer, (x) value.getBarcodeTopDarkPadding());
        writer.w("barcodeBottomLightPadding");
        this.nullablePaddingsAdapter.mo44toJson(writer, (x) value.getBarcodeBottomLightPadding());
        writer.w("barcodeBottomDarkPadding");
        this.nullablePaddingsAdapter.mo44toJson(writer, (x) value.getBarcodeBottomDarkPadding());
        writer.w("barcodeCornerRadius");
        this.nullableCornerRadiusAdapter.mo44toJson(writer, (x) value.getBarcodeCornerRadius());
        writer.p();
    }
}
