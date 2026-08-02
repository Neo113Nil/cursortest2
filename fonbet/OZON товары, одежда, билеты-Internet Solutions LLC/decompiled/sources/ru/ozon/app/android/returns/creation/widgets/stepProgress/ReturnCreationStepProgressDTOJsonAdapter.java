package ru.ozon.app.android.returns.creation.widgets.stepProgress;

import Ak.b;
import C.o0;
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

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/stepProgress/ReturnCreationStepProgressDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/returns/creation/widgets/stepProgress/ReturnCreationStepProgressDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/returns/creation/widgets/stepProgress/ReturnCreationStepProgressDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/returns/creation/widgets/stepProgress/ReturnCreationStepProgressDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnCreationStepProgressDTOJsonAdapter extends JsonAdapter<ReturnCreationStepProgressDTO> {
    public static final int $stable = 8;
    private volatile Constructor<ReturnCreationStepProgressDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public ReturnCreationStepProgressDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("count", "countOfSelected", "selectedColor", "unselectedColor", "horizontalPadding", "betweenSpacing", "bottomPadding", "topPadding", "bottomCornersRadius");
        M m11 = M.f71699a;
        this.intAdapter = moshi.f(Integer.TYPE, m11, "count");
        this.stringAdapter = moshi.f(String.class, m11, "selectedColor");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ReturnCreationStepProgressDTO fromJson(@NotNull n reader) {
        int i11 = -1;
        Integer a11 = o0.a(reader, "reader", 0);
        Integer num = a11;
        Integer num2 = num;
        Integer num3 = num2;
        Integer num4 = num3;
        Integer num5 = null;
        Integer num6 = null;
        String str = null;
        String str2 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    num5 = this.intAdapter.fromJson(reader);
                    if (num5 == null) {
                        throw c.q("count", "count", reader);
                    }
                    break;
                case 1:
                    num6 = this.intAdapter.fromJson(reader);
                    if (num6 == null) {
                        throw c.q("countOfSelected", "countOfSelected", reader);
                    }
                    break;
                case 2:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("selectedColor", "selectedColor", reader);
                    }
                    i11 &= -5;
                    break;
                case 3:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("unselectedColor", "unselectedColor", reader);
                    }
                    i11 &= -9;
                    break;
                case 4:
                    a11 = this.intAdapter.fromJson(reader);
                    if (a11 == null) {
                        throw c.q("horizontalPadding", "horizontalPadding", reader);
                    }
                    i11 &= -17;
                    break;
                case 5:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("betweenSpacing", "betweenSpacing", reader);
                    }
                    i11 &= -33;
                    break;
                case 6:
                    num2 = this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        throw c.q("bottomPadding", "bottomPadding", reader);
                    }
                    i11 &= -65;
                    break;
                case 7:
                    num3 = this.intAdapter.fromJson(reader);
                    if (num3 == null) {
                        throw c.q("topPadding", "topPadding", reader);
                    }
                    i11 &= -129;
                    break;
                case 8:
                    num4 = this.intAdapter.fromJson(reader);
                    if (num4 == null) {
                        throw c.q("bottomCornersRadius", "bottomCornersRadius", reader);
                    }
                    i11 &= -257;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -509) {
            if (num5 == null) {
                throw c.j("count", "count", reader);
            }
            int intValue = num5.intValue();
            if (num6 == null) {
                throw c.j("countOfSelected", "countOfSelected", reader);
            }
            int intValue2 = num6.intValue();
            Intrinsics.g(str, "null cannot be cast to non-null type kotlin.String");
            Intrinsics.g(str2, "null cannot be cast to non-null type kotlin.String");
            return new ReturnCreationStepProgressDTO(intValue, intValue2, str, str2, a11.intValue(), num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
        }
        String str3 = str;
        String str4 = str2;
        Constructor<ReturnCreationStepProgressDTO> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Integer.TYPE;
            constructor = ReturnCreationStepProgressDTO.class.getDeclaredConstructor(cls2, cls2, String.class, String.class, cls2, cls2, cls2, cls2, cls2, cls2, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (num5 == null) {
            throw c.j("count", "count", reader);
        }
        if (num6 == null) {
            throw c.j("countOfSelected", "countOfSelected", reader);
        }
        ReturnCreationStepProgressDTO newInstance = constructor.newInstance(num5, num6, str3, str4, a11, num, num2, num3, num4, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @NotNull
    public String toString() {
        return b.c(51, "GeneratedJsonAdapter(ReturnCreationStepProgressDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ReturnCreationStepProgressDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("count");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getCount()));
        writer.w("countOfSelected");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getCountOfSelected()));
        writer.w("selectedColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getSelectedColor());
        writer.w("unselectedColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getUnselectedColor());
        writer.w("horizontalPadding");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getHorizontalPadding()));
        writer.w("betweenSpacing");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getBetweenSpacing()));
        writer.w("bottomPadding");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getBottomPadding()));
        writer.w("topPadding");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getTopPadding()));
        writer.w("bottomCornersRadius");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getBottomCornersRadius()));
        writer.p();
    }
}
