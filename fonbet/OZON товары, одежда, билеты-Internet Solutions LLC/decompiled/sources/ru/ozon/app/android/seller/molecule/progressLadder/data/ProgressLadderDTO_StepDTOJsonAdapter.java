package ru.ozon.app.android.seller.molecule.progressLadder.data;

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
import ru.ozon.app.android.seller.molecule.progressLadder.data.ProgressLadderDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/seller/molecule/progressLadder/data/ProgressLadderDTO_StepDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/seller/molecule/progressLadder/data/ProgressLadderDTO$StepDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/seller/molecule/progressLadder/data/ProgressLadderDTO$StepDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/seller/molecule/progressLadder/data/ProgressLadderDTO$StepDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "nullableIntAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "nullableTextDTOAdapter", "Lru/ozon/app/android/seller/molecule/progressLadder/data/ProgressLadderDTO$StepDTO$GradientColor;", "nullableGradientColorAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "seller_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProgressLadderDTO_StepDTOJsonAdapter extends JsonAdapter<ProgressLadderDTO.StepDTO> {
    private volatile Constructor<ProgressLadderDTO.StepDTO> constructorRef;

    @NotNull
    private final JsonAdapter<ProgressLadderDTO.StepDTO.GradientColor> nullableGradientColorAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public ProgressLadderDTO_StepDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("percent", "backgroundColor", "fillColor", "discount", "thresholdFirst", "thresholdSecond", "fillGradientColor");
        M m11 = M.f71699a;
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "percent");
        this.stringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.nullableStringAdapter = moshi.f(String.class, m11, "fillColor");
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "discount");
        this.nullableGradientColorAdapter = moshi.f(ProgressLadderDTO.StepDTO.GradientColor.class, m11, "fillGradientColor");
    }

    @NotNull
    public String toString() {
        return b.c(47, "GeneratedJsonAdapter(ProgressLadderDTO.StepDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ProgressLadderDTO.StepDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        Integer num = null;
        String str = null;
        String str2 = null;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        TextDTO textDTO3 = null;
        ProgressLadderDTO.StepDTO.GradientColor gradientColor = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    num = this.nullableIntAdapter.fromJson(reader);
                    i11 = -2;
                    break;
                case 1:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("backgroundColor", "backgroundColor", reader);
                    }
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    textDTO = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    textDTO2 = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    textDTO3 = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    gradientColor = this.nullableGradientColorAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -2) {
            ProgressLadderDTO.StepDTO.GradientColor gradientColor2 = gradientColor;
            TextDTO textDTO4 = textDTO3;
            TextDTO textDTO5 = textDTO2;
            TextDTO textDTO6 = textDTO;
            String str3 = str2;
            String str4 = str;
            Integer num2 = num;
            if (str4 != null) {
                return new ProgressLadderDTO.StepDTO(num2, str4, str3, textDTO6, textDTO5, textDTO4, gradientColor2);
            }
            throw c.j("backgroundColor", "backgroundColor", reader);
        }
        ProgressLadderDTO.StepDTO.GradientColor gradientColor3 = gradientColor;
        TextDTO textDTO7 = textDTO3;
        TextDTO textDTO8 = textDTO2;
        TextDTO textDTO9 = textDTO;
        String str5 = str2;
        String str6 = str;
        Integer num3 = num;
        Constructor<ProgressLadderDTO.StepDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = ProgressLadderDTO.StepDTO.class.getDeclaredConstructor(Integer.class, String.class, String.class, TextDTO.class, TextDTO.class, TextDTO.class, ProgressLadderDTO.StepDTO.GradientColor.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (str6 == null) {
            throw c.j("backgroundColor", "backgroundColor", reader);
        }
        ProgressLadderDTO.StepDTO newInstance = constructor.newInstance(num3, str6, str5, textDTO9, textDTO8, textDTO7, gradientColor3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ProgressLadderDTO.StepDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("percent");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getPercent());
        writer.w("backgroundColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("fillColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getFillColor());
        writer.w("discount");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getDiscount());
        writer.w("thresholdFirst");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getThresholdFirst());
        writer.w("thresholdSecond");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getThresholdSecond());
        writer.w("fillGradientColor");
        this.nullableGradientColorAdapter.mo44toJson(writer, (x) value.getFillGradientColor());
        writer.p();
    }
}
