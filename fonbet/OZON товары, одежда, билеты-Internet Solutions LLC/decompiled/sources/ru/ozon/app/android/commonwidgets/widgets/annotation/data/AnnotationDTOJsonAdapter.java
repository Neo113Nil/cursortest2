package ru.ozon.app.android.commonwidgets.widgets.annotation.data;

import Ak.b;
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
import ru.ozon.app.android.commonwidgets.widgets.annotation.data.AnnotationDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\"\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R(\u0010#\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\"\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/annotation/data/AnnotationDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/commonwidgets/widgets/annotation/data/AnnotationDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/commonwidgets/widgets/annotation/data/AnnotationDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/commonwidgets/widgets/annotation/data/AnnotationDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "ozonSpannableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "nullableStringAdapter", "", "booleanAdapter", "", "Lru/ozon/app/android/commonwidgets/widgets/annotation/data/AnnotationDTO$Button;", "nullableListOfButtonAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AnnotationDTOJsonAdapter extends JsonAdapter<AnnotationDTO> {

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<AnnotationDTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<AnnotationDTO.Button>> nullableListOfButtonAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<OzonSpannableString> ozonSpannableStringAdapter;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public AnnotationDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("text", "style", "icon", "isFullWidth", "isSticky", "bgColor", "actionButtons", "trackingInfo");
        M m11 = M.f71699a;
        this.ozonSpannableStringAdapter = moshi.f(OzonSpannableString.class, m11, "text");
        this.stringAdapter = moshi.f(String.class, m11, "style");
        this.nullableStringAdapter = moshi.f(String.class, m11, "icon");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isFullWidth");
        this.nullableListOfButtonAdapter = moshi.f(D.e(List.class, AnnotationDTO.Button.class), m11, "actionButtons");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(35, "GeneratedJsonAdapter(AnnotationDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AnnotationDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        int i11 = -1;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        OzonSpannableString ozonSpannableString = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        List<AnnotationDTO.Button> list = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    ozonSpannableString = this.ozonSpannableStringAdapter.fromJson(reader);
                    if (ozonSpannableString == null) {
                        throw c.q("text", "text", reader);
                    }
                    break;
                case 1:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("style", "style", reader);
                    }
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("isFullWidth", "isFullWidth", reader);
                    }
                    i11 &= -9;
                    break;
                case 4:
                    bool3 = this.booleanAdapter.fromJson(reader);
                    if (bool3 == null) {
                        throw c.q("isSticky", "isSticky", reader);
                    }
                    i11 &= -17;
                    break;
                case 5:
                    str3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 6:
                    list = this.nullableListOfButtonAdapter.fromJson(reader);
                    break;
                case 7:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -25) {
            if (ozonSpannableString == null) {
                throw c.j("text", "text", reader);
            }
            if (str == null) {
                throw c.j("style", "style", reader);
            }
            return new AnnotationDTO(ozonSpannableString, str, str2, bool2.booleanValue(), bool3.booleanValue(), str3, list, map);
        }
        Constructor<AnnotationDTO> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Boolean.TYPE;
            constructor = AnnotationDTO.class.getDeclaredConstructor(OzonSpannableString.class, String.class, String.class, cls2, cls2, String.class, List.class, Map.class, Integer.TYPE, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<AnnotationDTO> constructor2 = constructor;
        if (ozonSpannableString == null) {
            throw c.j("text", "text", reader);
        }
        if (str == null) {
            throw c.j("style", "style", reader);
        }
        AnnotationDTO newInstance = constructor2.newInstance(ozonSpannableString, str, str2, bool2, bool3, str3, list, map, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AnnotationDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("text");
        this.ozonSpannableStringAdapter.mo44toJson(writer, (x) value.getText());
        writer.w("style");
        this.stringAdapter.mo44toJson(writer, (x) value.getStyle());
        writer.w("icon");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getIcon());
        writer.w("isFullWidth");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isFullWidth()));
        writer.w("isSticky");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isSticky()));
        writer.w("bgColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBgColor());
        writer.w("actionButtons");
        this.nullableListOfButtonAdapter.mo44toJson(writer, (x) value.getActionButtons());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
