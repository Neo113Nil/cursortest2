package ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.data;

import Ak.b;
import B0.A0;
import C.C2702w;
import Fj.c;
import N3.C3660k;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import ed.C6345a;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.data.ButtonStackDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonsDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019¨\u0006\u001e"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO_WidgetButtonsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO$WidgetButtons;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO$WidgetButtons;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO$WidgetButtons;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/controls/button/ButtonsDTO;", "buttonsDTOAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/composerCommonViewKit/compose/widget/buttonStack/data/ButtonStackDTO$WidgetButtons$Sizing;", "sizingAdapter", "", "nullableIntAdapter", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ButtonStackDTO_WidgetButtonsJsonAdapter extends JsonAdapter<ButtonStackDTO.WidgetButtons> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ButtonsDTO> buttonsDTOAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<ButtonStackDTO.WidgetButtons.Sizing> sizingAdapter;

    public ButtonStackDTO_WidgetButtonsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        final String str = "button";
        n.a a11 = n.a.C0918a.a("button", "sizing", "buttonWidth");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        final String str2 = "type";
        ProtoOneOf protoOneOf = new ProtoOneOf(str2) { // from class: ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.data.ButtonStackDTO_WidgetButtonsJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOf$0
            private final /* synthetic */ String label;

            {
                Intrinsics.checkNotNullParameter(str2, "label");
                this.label = str2;
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return ProtoOneOf.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return (obj instanceof ProtoOneOf) && Intrinsics.d(label(), ((ProtoOneOf) obj).label());
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return this.label.hashCode() ^ 161479436;
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf
            public final /* synthetic */ String label() {
                return this.label;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                return A0.b("@ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf(label=", this.label, ")");
            }
        };
        final d b11 = N.b(ButtonV3DTO.class);
        final String str3 = "";
        ProtoOneOfSignature protoOneOfSignature = new ProtoOneOfSignature(str, str3, b11) { // from class: ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.data.ButtonStackDTO_WidgetButtonsJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str, "name");
                Intrinsics.checkNotNullParameter(str3, "fieldName");
                Intrinsics.checkNotNullParameter(b11, "type");
                this.name = str;
                this.fieldName = str3;
                this.type = C6345a.b(b11);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return ProtoOneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof ProtoOneOfSignature)) {
                    return false;
                }
                ProtoOneOfSignature protoOneOfSignature2 = (ProtoOneOfSignature) obj;
                return Intrinsics.d(name(), protoOneOfSignature2.name()) && Intrinsics.d(fieldName(), protoOneOfSignature2.fieldName()) && C2702w.f(protoOneOfSignature2, N.b(type()));
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str4 = this.name;
                String str5 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature(name=", str4, ", fieldName=", str5, ", type="), this.type, ")");
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        };
        final d b12 = N.b(IconButtonV3DTO.class);
        final String str4 = "iconButton";
        Annotation[] elements = {protoOneOf, protoOneOfSignature, new ProtoOneOfSignature(str4, str3, b12) { // from class: ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.data.ButtonStackDTO_WidgetButtonsJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str4, "name");
                Intrinsics.checkNotNullParameter(str3, "fieldName");
                Intrinsics.checkNotNullParameter(b12, "type");
                this.name = str4;
                this.fieldName = str3;
                this.type = C6345a.b(b12);
            }

            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return ProtoOneOfSignature.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                if (!(obj instanceof ProtoOneOfSignature)) {
                    return false;
                }
                ProtoOneOfSignature protoOneOfSignature2 = (ProtoOneOfSignature) obj;
                return Intrinsics.d(name(), protoOneOfSignature2.name()) && Intrinsics.d(fieldName(), protoOneOfSignature2.fieldName()) && C2702w.f(protoOneOfSignature2, N.b(type()));
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String fieldName() {
                return this.fieldName;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return (this.name.hashCode() ^ 428460789) + (this.fieldName.hashCode() ^ 1742393307) + (this.type.hashCode() ^ 454102470);
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ String name() {
                return this.name;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                String str42 = this.name;
                String str5 = this.fieldName;
                return c.c(C3660k.d("@ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature(name=", str42, ", fieldName=", str5, ", type="), this.type, ")");
            }

            @Override // ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature
            public final /* synthetic */ Class type() {
                return this.type;
            }
        }};
        Intrinsics.checkNotNullParameter(elements, "elements");
        JsonAdapter<ButtonsDTO> f7 = moshi.f(ButtonsDTO.class, C7705l.j0(elements), "button");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.buttonsDTOAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter = f7;
        M m11 = M.f71699a;
        JsonAdapter<ButtonStackDTO.WidgetButtons.Sizing> f11 = moshi.f(ButtonStackDTO.WidgetButtons.Sizing.class, m11, "sizing");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.sizingAdapter = f11;
        JsonAdapter<Integer> f12 = moshi.f(Integer.class, m11, "buttonWidth");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableIntAdapter = f12;
    }

    @NotNull
    public String toString() {
        return b.c(50, "GeneratedJsonAdapter(ButtonStackDTO.WidgetButtons)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ButtonStackDTO.WidgetButtons fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        ButtonsDTO buttonsDTO = null;
        ButtonStackDTO.WidgetButtons.Sizing sizing = null;
        Integer num = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                buttonsDTO = this.buttonsDTOAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter.fromJson(reader);
                if (buttonsDTO == null) {
                    throw Y9.c.q("button", "button", reader);
                }
            } else if (v11 == 1) {
                sizing = this.sizingAdapter.fromJson(reader);
                if (sizing == null) {
                    throw Y9.c.q("sizing", "sizing", reader);
                }
            } else if (v11 == 2) {
                num = this.nullableIntAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (buttonsDTO == null) {
            throw Y9.c.j("button", "button", reader);
        }
        if (sizing != null) {
            return new ButtonStackDTO.WidgetButtons(buttonsDTO, sizing, num);
        }
        throw Y9.c.j("sizing", "sizing", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ButtonStackDTO.WidgetButtons value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("button");
        this.buttonsDTOAtProtoOneOfAtProtoOneOfSignatureAtProtoOneOfSignatureAdapter.mo44toJson(writer, (x) value_.getButton());
        writer.w("sizing");
        this.sizingAdapter.mo44toJson(writer, (x) value_.getSizing());
        writer.w("buttonWidth");
        this.nullableIntAdapter.mo44toJson(writer, (x) value_.getButtonWidth());
        writer.p();
    }
}
