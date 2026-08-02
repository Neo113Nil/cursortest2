package ru.ozon.app.android.fresh.feature.b2b.domain;

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
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/domain/DocsDeliveryRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/feature/b2b/domain/DocsDeliveryRequest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/feature/b2b/domain/DocsDeliveryRequest;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/feature/b2b/domain/DocsDeliveryRequest;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "booleanAdapter", "", "intAdapter", "nullableStringAdapter", "nullableIntAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DocsDeliveryRequestJsonAdapter extends JsonAdapter<DocsDeliveryRequest> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<DocsDeliveryRequest> constructorRef;

    @NotNull
    private final JsonAdapter<Integer> intAdapter;

    @NotNull
    private final JsonAdapter<Integer> nullableIntAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public DocsDeliveryRequestJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("orderId", "deliveryVariantId", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "phone", "firstName", "lastName", "disablePatronymic", "index", "patronymic", "placeId");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "orderId");
        this.booleanAdapter = moshi.f(Boolean.TYPE, m11, "disablePatronymic");
        this.intAdapter = moshi.f(Integer.TYPE, m11, "index");
        this.nullableStringAdapter = moshi.f(String.class, m11, "patronymic");
        this.nullableIntAdapter = moshi.f(Integer.class, m11, "placeId");
    }

    @NotNull
    public String toString() {
        return b.c(41, "GeneratedJsonAdapter(DocsDeliveryRequest)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public DocsDeliveryRequest fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Boolean bool = null;
        Integer num = null;
        String str7 = null;
        Integer num2 = null;
        while (true) {
            String str8 = str;
            String str9 = str2;
            String str10 = str3;
            String str11 = str4;
            String str12 = str5;
            if (!reader.hasNext()) {
                String str13 = str6;
                reader.endObject();
                if (i11 == -769) {
                    if (str8 == null) {
                        throw c.j("orderId", "orderId", reader);
                    }
                    if (str9 == null) {
                        throw c.j("deliveryVariantId", "deliveryVariantId", reader);
                    }
                    if (str10 == null) {
                        throw c.j(FormPageDTO.Field.FIELD_TYPE_ADDRESS, FormPageDTO.Field.FIELD_TYPE_ADDRESS, reader);
                    }
                    if (str11 == null) {
                        throw c.j("phone", "phone", reader);
                    }
                    if (str12 == null) {
                        throw c.j("firstName", "firstName", reader);
                    }
                    if (str13 == null) {
                        throw c.j("lastName", "lastName", reader);
                    }
                    if (bool == null) {
                        throw c.j("disablePatronymic", "disablePatronymic", reader);
                    }
                    Integer num3 = num;
                    boolean booleanValue = bool.booleanValue();
                    if (num3 == null) {
                        throw c.j("index", "index", reader);
                    }
                    return new DocsDeliveryRequest(str8, str9, str10, str11, str12, str13, booleanValue, num3.intValue(), str7, num2);
                }
                Integer num4 = num;
                Constructor<DocsDeliveryRequest> constructor = this.constructorRef;
                if (constructor == null) {
                    Class<?> cls = c.f34864d;
                    Class cls2 = Integer.TYPE;
                    constructor = DocsDeliveryRequest.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, Boolean.TYPE, cls2, String.class, Integer.class, cls2, cls);
                    this.constructorRef = constructor;
                    Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
                }
                if (str8 == null) {
                    throw c.j("orderId", "orderId", reader);
                }
                if (str9 == null) {
                    throw c.j("deliveryVariantId", "deliveryVariantId", reader);
                }
                if (str10 == null) {
                    throw c.j(FormPageDTO.Field.FIELD_TYPE_ADDRESS, FormPageDTO.Field.FIELD_TYPE_ADDRESS, reader);
                }
                if (str11 == null) {
                    throw c.j("phone", "phone", reader);
                }
                if (str12 == null) {
                    throw c.j("firstName", "firstName", reader);
                }
                if (str13 == null) {
                    throw c.j("lastName", "lastName", reader);
                }
                if (bool == null) {
                    throw c.j("disablePatronymic", "disablePatronymic", reader);
                }
                if (num4 == null) {
                    throw c.j("index", "index", reader);
                }
                DocsDeliveryRequest newInstance = constructor.newInstance(str8, str9, str10, str11, str12, str13, bool, num4, str7, num2, Integer.valueOf(i11), null);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            String str14 = str6;
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    str6 = str14;
                    str = str8;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("orderId", "orderId", reader);
                    }
                    str6 = str14;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("deliveryVariantId", "deliveryVariantId", reader);
                    }
                    str6 = str14;
                    str = str8;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                case 2:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q(FormPageDTO.Field.FIELD_TYPE_ADDRESS, FormPageDTO.Field.FIELD_TYPE_ADDRESS, reader);
                    }
                    str6 = str14;
                    str = str8;
                    str2 = str9;
                    str4 = str11;
                    str5 = str12;
                case 3:
                    str4 = this.stringAdapter.fromJson(reader);
                    if (str4 == null) {
                        throw c.q("phone", "phone", reader);
                    }
                    str6 = str14;
                    str = str8;
                    str2 = str9;
                    str3 = str10;
                    str5 = str12;
                case 4:
                    str5 = this.stringAdapter.fromJson(reader);
                    if (str5 == null) {
                        throw c.q("firstName", "firstName", reader);
                    }
                    str6 = str14;
                    str = str8;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                case 5:
                    str6 = this.stringAdapter.fromJson(reader);
                    if (str6 == null) {
                        throw c.q("lastName", "lastName", reader);
                    }
                    str = str8;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                case 6:
                    bool = this.booleanAdapter.fromJson(reader);
                    if (bool == null) {
                        throw c.q("disablePatronymic", "disablePatronymic", reader);
                    }
                    str6 = str14;
                    str = str8;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                case 7:
                    num = this.intAdapter.fromJson(reader);
                    if (num == null) {
                        throw c.q("index", "index", reader);
                    }
                    str6 = str14;
                    str = str8;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                case 8:
                    str7 = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -257;
                    str6 = str14;
                    str = str8;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                case 9:
                    num2 = this.nullableIntAdapter.fromJson(reader);
                    i11 &= -513;
                    str6 = str14;
                    str = str8;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
                default:
                    str6 = str14;
                    str = str8;
                    str2 = str9;
                    str3 = str10;
                    str4 = str11;
                    str5 = str12;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, DocsDeliveryRequest value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("orderId");
        this.stringAdapter.mo44toJson(writer, (x) value.getOrderId());
        writer.w("deliveryVariantId");
        this.stringAdapter.mo44toJson(writer, (x) value.getDeliveryVariantId());
        writer.w(FormPageDTO.Field.FIELD_TYPE_ADDRESS);
        this.stringAdapter.mo44toJson(writer, (x) value.getAddress());
        writer.w("phone");
        this.stringAdapter.mo44toJson(writer, (x) value.getPhone());
        writer.w("firstName");
        this.stringAdapter.mo44toJson(writer, (x) value.getFirstName());
        writer.w("lastName");
        this.stringAdapter.mo44toJson(writer, (x) value.getLastName());
        writer.w("disablePatronymic");
        this.booleanAdapter.mo44toJson(writer, (x) Boolean.valueOf(value.getDisablePatronymic()));
        writer.w("index");
        this.intAdapter.mo44toJson(writer, (x) Integer.valueOf(value.getIndex()));
        writer.w("patronymic");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getPatronymic());
        writer.w("placeId");
        this.nullableIntAdapter.mo44toJson(writer, (x) value.getPlaceId());
        writer.p();
    }
}
