package ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.data;

import B0.A0;
import C.C2702w;
import Fj.c;
import N3.C3660k;
import Y9.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import ed.C6345a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.data.OrderNavBarDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/data/OrderNavBarDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/data/OrderNavBarDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/data/OrderNavBarDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/data/OrderNavBarDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "listOfIconButtonV3DTOAtProtoOneOfAtProtoOneOfSignatureAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/data/OrderNavBarDTO$ButtonsColors;", "buttonsColorsAdapter", "Lru/ozon/app/android/travel/feature/general/order/widgets/orderNavBar/data/OrderNavBarDTO$WidgetBackground;", "widgetBackgroundAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OrderNavBarDTOJsonAdapter extends JsonAdapter<OrderNavBarDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<OrderNavBarDTO.ButtonsColors> buttonsColorsAdapter;
    private volatile Constructor<OrderNavBarDTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<IconButtonV3DTO>> listOfIconButtonV3DTOAtProtoOneOfAtProtoOneOfSignatureAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<OrderNavBarDTO.WidgetBackground> widgetBackgroundAdapter;

    public OrderNavBarDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("leftButtons", "rightButtons", "buttonsColors", "background");
        b e11 = D.e(List.class, IconButtonV3DTO.class);
        final String str = "type";
        ProtoOneOf protoOneOf = new ProtoOneOf(str) { // from class: ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.data.OrderNavBarDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOf$0
            private final /* synthetic */ String label;

            {
                Intrinsics.checkNotNullParameter(str, "label");
                this.label = str;
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
        final d b11 = N.b(IconButtonV3DTO.class);
        final String str2 = "iconButton";
        final String str3 = "";
        Annotation[] elements = {protoOneOf, new ProtoOneOfSignature(str2, str3, b11) { // from class: ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.data.OrderNavBarDTOJsonAdapter$annotationImpl$ru_ozon_moshi_adapters_serialize_proto_ProtoOneOfSignature$0
            private final /* synthetic */ String fieldName;
            private final /* synthetic */ String name;
            private final /* synthetic */ Class<?> type;

            {
                Intrinsics.checkNotNullParameter(str2, "name");
                Intrinsics.checkNotNullParameter(str3, "fieldName");
                Intrinsics.checkNotNullParameter(b11, "type");
                this.name = str2;
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
                ProtoOneOfSignature protoOneOfSignature = (ProtoOneOfSignature) obj;
                return Intrinsics.d(name(), protoOneOfSignature.name()) && Intrinsics.d(fieldName(), protoOneOfSignature.fieldName()) && C2702w.f(protoOneOfSignature, N.b(type()));
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
        }};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.listOfIconButtonV3DTOAtProtoOneOfAtProtoOneOfSignatureAdapter = moshi.f(e11, C7705l.j0(elements), "leftButtons");
        M m11 = M.f71699a;
        this.buttonsColorsAdapter = moshi.f(OrderNavBarDTO.ButtonsColors.class, m11, "buttonsColors");
        this.widgetBackgroundAdapter = moshi.f(OrderNavBarDTO.WidgetBackground.class, m11, "background");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(36, "GeneratedJsonAdapter(OrderNavBarDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public OrderNavBarDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<IconButtonV3DTO> list = null;
        List<IconButtonV3DTO> list2 = null;
        OrderNavBarDTO.ButtonsColors buttonsColors = null;
        OrderNavBarDTO.WidgetBackground widgetBackground = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                list = this.listOfIconButtonV3DTOAtProtoOneOfAtProtoOneOfSignatureAdapter.fromJson(reader);
                if (list == null) {
                    throw Y9.c.q("leftButtons", "leftButtons", reader);
                }
                i11 &= -2;
            } else if (v11 == 1) {
                list2 = this.listOfIconButtonV3DTOAtProtoOneOfAtProtoOneOfSignatureAdapter.fromJson(reader);
                if (list2 == null) {
                    throw Y9.c.q("rightButtons", "rightButtons", reader);
                }
                i11 &= -3;
            } else if (v11 == 2) {
                buttonsColors = this.buttonsColorsAdapter.fromJson(reader);
                if (buttonsColors == null) {
                    throw Y9.c.q("buttonsColors", "buttonsColors", reader);
                }
            } else if (v11 == 3 && (widgetBackground = this.widgetBackgroundAdapter.fromJson(reader)) == null) {
                throw Y9.c.q("background", "background", reader);
            }
        }
        reader.endObject();
        if (i11 == -4) {
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO>");
            Intrinsics.g(list2, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO>");
            if (buttonsColors == null) {
                throw Y9.c.j("buttonsColors", "buttonsColors", reader);
            }
            if (widgetBackground != null) {
                return new OrderNavBarDTO(list, list2, buttonsColors, widgetBackground);
            }
            throw Y9.c.j("background", "background", reader);
        }
        Constructor<OrderNavBarDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = OrderNavBarDTO.class.getDeclaredConstructor(List.class, List.class, OrderNavBarDTO.ButtonsColors.class, OrderNavBarDTO.WidgetBackground.class, Integer.TYPE, Y9.c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (buttonsColors == null) {
            throw Y9.c.j("buttonsColors", "buttonsColors", reader);
        }
        if (widgetBackground == null) {
            throw Y9.c.j("background", "background", reader);
        }
        OrderNavBarDTO newInstance = constructor.newInstance(list, list2, buttonsColors, widgetBackground, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, OrderNavBarDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("leftButtons");
        this.listOfIconButtonV3DTOAtProtoOneOfAtProtoOneOfSignatureAdapter.mo44toJson(writer, (x) value.getLeftButtons());
        writer.w("rightButtons");
        this.listOfIconButtonV3DTOAtProtoOneOfAtProtoOneOfSignatureAdapter.mo44toJson(writer, (x) value.getRightButtons());
        writer.w("buttonsColors");
        this.buttonsColorsAdapter.mo44toJson(writer, (x) value.getButtonsColors());
        writer.w("background");
        this.widgetBackgroundAdapter.mo44toJson(writer, (x) value.getBackground());
        writer.p();
    }
}
