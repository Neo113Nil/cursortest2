package ru.ozon.app.android.travel.feature.general.common.widgets.buttonWidget.v1.data;

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
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWidget/v1/data/ButtonWidgetDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWidget/v1/data/ButtonWidgetDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWidget/v1/data/ButtonWidgetDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/common/widgets/buttonWidget/v1/data/ButtonWidgetDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "largeButtonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "booleanAdapter", "nullableStringAdapter", "", "intAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ButtonWidgetDTOJsonAdapter extends JsonAdapter<ButtonWidgetDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<ButtonWidgetDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeButton> largeButtonAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public ButtonWidgetDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("button", "isSticky", "backgroundColor", "topRadius", "buttonTopMargin", "buttonBottomMargin", "buttonHorizontalMargin");
        M m11 = M.f71699a;
        this.largeButtonAdapter = moshi.f(ButtonV3Atom.LargeButton.class, m11, "button");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "isSticky");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.intAdapter = moshi.f(Integer.TYPE, m11, "topRadius");
    }

    @NotNull
    public String toString() {
        return b.c(37, "GeneratedJsonAdapter(ButtonWidgetDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ButtonWidgetDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.beginObject();
        int i11 = -1;
        Boolean bool2 = bool;
        Integer num = 0;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        ButtonV3Atom.LargeButton largeButton = null;
        String str = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    largeButton = this.largeButtonAdapter.fromJson(reader);
                    if (largeButton == null) {
                        throw c.q("button", "button", reader);
                    }
                    break;
                case 1:
                    bool2 = this.booleanAdapter.fromJson(reader);
                    if (bool2 == null) {
                        throw c.q("isSticky", "isSticky", reader);
                    }
                    i11 &= -3;
                    break;
                case 2:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 3:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("topRadius", "topRadius", reader);
                    }
                    i11 &= -9;
                    break;
                case 4:
                    num2 = this.intAdapter.fromJson(reader);
                    if (num2 == null) {
                        throw c.q("buttonTopMargin", "buttonTopMargin", reader);
                    }
                    i11 &= -17;
                    break;
                case 5:
                    num3 = this.intAdapter.fromJson(reader);
                    if (num3 == null) {
                        throw c.q("buttonBottomMargin", "buttonBottomMargin", reader);
                    }
                    i11 &= -33;
                    break;
                case 6:
                    num4 = this.intAdapter.fromJson(reader);
                    if (num4 == null) {
                        throw c.q("buttonHorizontalMargin", "buttonHorizontalMargin", reader);
                    }
                    i11 &= -65;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -123) {
            if (largeButton != null) {
                return new ButtonWidgetDTO(largeButton, bool2.booleanValue(), str, num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
            }
            throw c.j("button", "button", reader);
        }
        Constructor<ButtonWidgetDTO> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Integer.TYPE;
            constructor = ButtonWidgetDTO.class.getDeclaredConstructor(ButtonV3Atom.LargeButton.class, cls2, String.class, cls3, cls3, cls3, cls3, cls3, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (largeButton == null) {
            throw c.j("button", "button", reader);
        }
        ButtonWidgetDTO newInstance = constructor.newInstance(largeButton, bool2, str, num, num2, num3, num4, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ButtonWidgetDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("button");
        this.largeButtonAdapter.mo44toJson(writer, (x) value.getButton());
        writer.w("isSticky");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.isSticky()));
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("topRadius");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getTopRadius()));
        writer.w("buttonTopMargin");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getButtonTopMargin()));
        writer.w("buttonBottomMargin");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getButtonBottomMargin()));
        writer.w("buttonHorizontalMargin");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getButtonHorizontalMargin()));
        writer.p();
    }
}
