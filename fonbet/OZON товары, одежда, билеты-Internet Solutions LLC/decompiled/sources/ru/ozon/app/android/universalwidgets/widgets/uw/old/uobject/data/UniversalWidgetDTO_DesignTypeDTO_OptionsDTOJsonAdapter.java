package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.data;

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
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.data.UniversalWidgetDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO_DesignTypeDTO_OptionsDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$DesignTypeDTO$OptionsDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$DesignTypeDTO$OptionsDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/data/UniversalWidgetDTO$DesignTypeDTO$OptionsDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "nullableBooleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "nullableIntAdapter", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "nullableCornerRadiusAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UniversalWidgetDTO_DesignTypeDTO_OptionsDTOJsonAdapter extends JsonAdapter<UniversalWidgetDTO.DesignTypeDTO.OptionsDTO> {
    private volatile Constructor<UniversalWidgetDTO.DesignTypeDTO.OptionsDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<CornerRadius> nullableCornerRadiusAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public UniversalWidgetDTO_DesignTypeDTO_OptionsDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("itemsAreFaded", "imageGrey", "textAlign", "textColor", "width", "height", "style", "span", "backgroundColor", "paddingTop", "paddingBottom", "paddingLeft", "paddingRight", "cornerRadius", "hidePagination");
        M m11 = M.f71699a;
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "itemsAreFaded");
        this.nullableStringAdapter = moshi.f(String.class, m11, "textAlign");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "width");
        this.nullableCornerRadiusAdapter = moshi.f(CornerRadius.class, m11, "cornerRadius");
    }

    @NotNull
    public String toString() {
        return b.c(65, "GeneratedJsonAdapter(UniversalWidgetDTO.DesignTypeDTO.OptionsDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public UniversalWidgetDTO.DesignTypeDTO.OptionsDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        Boolean bool = null;
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        Integer num = null;
        Integer num2 = null;
        String str3 = null;
        Integer num3 = null;
        String str4 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        Integer num7 = null;
        CornerRadius cornerRadius = null;
        Boolean bool3 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    i11 = -2;
                    break;
                case 1:
                    bool2 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 2:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 4:
                    num = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 5:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 6:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 7:
                    num3 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 8:
                    str4 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 9:
                    num4 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 10:
                    num5 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 11:
                    num6 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 12:
                    num7 = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 13:
                    cornerRadius = this.nullableCornerRadiusAdapter.fromJson(reader);
                    break;
                case 14:
                    bool3 = this.nullableBooleanAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -2) {
            String str5 = str4;
            Integer num8 = num3;
            String str6 = str3;
            Integer num9 = num2;
            Integer num10 = num;
            String str7 = str2;
            return new UniversalWidgetDTO.DesignTypeDTO.OptionsDTO(bool, bool2, str, str7, num10, num9, str6, num8, str5, num4, num5, num6, num7, cornerRadius, bool3);
        }
        String str8 = str4;
        Integer num11 = num3;
        String str9 = str3;
        Integer num12 = num2;
        Integer num13 = num;
        String str10 = str2;
        String str11 = str;
        Boolean bool4 = bool2;
        Boolean bool5 = bool;
        Constructor<UniversalWidgetDTO.DesignTypeDTO.OptionsDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = UniversalWidgetDTO.DesignTypeDTO.OptionsDTO.class.getDeclaredConstructor(Boolean.class, Boolean.class, String.class, String.class, Integer.class, Integer.class, String.class, Integer.class, String.class, Integer.class, Integer.class, Integer.class, Integer.class, CornerRadius.class, Boolean.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        UniversalWidgetDTO.DesignTypeDTO.OptionsDTO newInstance = constructor.newInstance(bool5, bool4, str11, str10, num13, num12, str9, num11, str8, num4, num5, num6, num7, cornerRadius, bool3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, UniversalWidgetDTO.DesignTypeDTO.OptionsDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("itemsAreFaded");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getItemsAreFaded());
        writer.w("imageGrey");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getImageGrey());
        writer.w("textAlign");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getTextAlign());
        writer.w("textColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getTextColor());
        writer.w("width");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getWidth());
        writer.w("height");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getHeight());
        writer.w("style");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getStyle());
        writer.w("span");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getSpan());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("paddingTop");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getPaddingTop());
        writer.w("paddingBottom");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getPaddingBottom());
        writer.w("paddingLeft");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getPaddingLeft());
        writer.w("paddingRight");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getPaddingRight());
        writer.w("cornerRadius");
        this.nullableCornerRadiusAdapter.mo44toJson(writer, (x) value.getCornerRadius());
        writer.w("hidePagination");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getHidePagination());
        writer.p();
    }
}
