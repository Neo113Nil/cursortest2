package ru.ozon.app.android.fresh.common.widgets.molecules.freshTextPair.data;

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
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/freshTextPair/data/FreshTextPairDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTextPair/data/FreshTextPairDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/common/widgets/molecules/freshTextPair/data/FreshTextPairDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/common/widgets/molecules/freshTextPair/data/FreshTextPairDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "Lru/ozon/uni/atoms/data/common/Paddings;", "nullablePaddingsAtEnumNullFallbackAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshTextPairDTOJsonAdapter extends JsonAdapter<FreshTextPairDTO> {
    private volatile Constructor<FreshTextPairDTO> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<Paddings> nullablePaddingsAtEnumNullFallbackAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public FreshTextPairDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("ellipsizableText", "trailingText", "maxLines", "paddingLeft", "paddingRight", "paddingTop", "paddingBottom");
        M m11 = M.f71699a;
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, "ellipsizableText");
        this.intAdapter = moshi.f(Integer.TYPE, m11, "maxLines");
        this.nullablePaddingsAtEnumNullFallbackAdapter = moshi.f(Paddings.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.app.android.fresh.common.widgets.molecules.freshTextPair.data.FreshTextPairDTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return EnumNullFallback.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return obj instanceof EnumNullFallback;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return 0;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                return "@ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback()";
            }
        }), "paddingLeft");
    }

    @NotNull
    public String toString() {
        return b.c(38, "GeneratedJsonAdapter(FreshTextPairDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FreshTextPairDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        Integer num = null;
        Paddings paddings = null;
        Paddings paddings2 = null;
        Paddings paddings3 = null;
        Paddings paddings4 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q("ellipsizableText", "ellipsizableText", reader);
                    }
                    break;
                case 1:
                    textDTO2 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO2 == null) {
                        throw c.q("trailingText", "trailingText", reader);
                    }
                    break;
                case 2:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("maxLines", "maxLines", reader);
                    }
                    break;
                case 3:
                    paddings = this.nullablePaddingsAtEnumNullFallbackAdapter.fromJson(reader);
                    i11 &= -9;
                    break;
                case 4:
                    paddings2 = this.nullablePaddingsAtEnumNullFallbackAdapter.fromJson(reader);
                    i11 &= -17;
                    break;
                case 5:
                    paddings3 = this.nullablePaddingsAtEnumNullFallbackAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
                case 6:
                    paddings4 = this.nullablePaddingsAtEnumNullFallbackAdapter.fromJson(reader);
                    i11 &= -65;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -121) {
            Integer num2 = num;
            TextDTO textDTO3 = textDTO2;
            TextDTO textDTO4 = textDTO;
            if (textDTO4 == null) {
                throw c.j("ellipsizableText", "ellipsizableText", reader);
            }
            if (textDTO3 == null) {
                throw c.j("trailingText", "trailingText", reader);
            }
            if (num2 == null) {
                throw c.j("maxLines", "maxLines", reader);
            }
            Paddings paddings5 = paddings4;
            Paddings paddings6 = paddings3;
            return new FreshTextPairDTO(textDTO4, textDTO3, num2.intValue(), paddings, paddings2, paddings6, paddings5);
        }
        Integer num3 = num;
        TextDTO textDTO5 = textDTO2;
        TextDTO textDTO6 = textDTO;
        Paddings paddings7 = paddings4;
        Paddings paddings8 = paddings3;
        Paddings paddings9 = paddings2;
        Paddings paddings10 = paddings;
        Constructor<FreshTextPairDTO> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = c.f34864d;
            Class cls2 = Integer.TYPE;
            constructor = FreshTextPairDTO.class.getDeclaredConstructor(TextDTO.class, TextDTO.class, cls2, Paddings.class, Paddings.class, Paddings.class, Paddings.class, cls2, cls);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<FreshTextPairDTO> constructor2 = constructor;
        if (textDTO6 == null) {
            throw c.j("ellipsizableText", "ellipsizableText", reader);
        }
        if (textDTO5 == null) {
            throw c.j("trailingText", "trailingText", reader);
        }
        if (num3 == null) {
            throw c.j("maxLines", "maxLines", reader);
        }
        FreshTextPairDTO newInstance = constructor2.newInstance(textDTO6, textDTO5, num3, paddings10, paddings9, paddings8, paddings7, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FreshTextPairDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("ellipsizableText");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getEllipsizableText());
        writer.w("trailingText");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getTrailingText());
        writer.w("maxLines");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getMaxLines()));
        writer.w("paddingLeft");
        this.nullablePaddingsAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value.getPaddingLeft());
        writer.w("paddingRight");
        this.nullablePaddingsAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value.getPaddingRight());
        writer.w("paddingTop");
        this.nullablePaddingsAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value.getPaddingTop());
        writer.w("paddingBottom");
        this.nullablePaddingsAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value.getPaddingBottom());
        writer.p();
    }
}
