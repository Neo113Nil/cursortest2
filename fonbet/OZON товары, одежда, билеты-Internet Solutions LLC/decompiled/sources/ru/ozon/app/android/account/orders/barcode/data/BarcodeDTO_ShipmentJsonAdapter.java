package ru.ozon.app.android.account.orders.barcode.data;

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
import ru.ozon.app.android.account.orders.barcode.data.BarcodeDTO;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/account/orders/barcode/data/BarcodeDTO_ShipmentJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/account/orders/barcode/data/BarcodeDTO$Shipment;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/account/orders/barcode/data/BarcodeDTO$Shipment;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/account/orders/barcode/data/BarcodeDTO$Shipment;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "nullableTextAtomAdapter", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "nullableDisclaimerAtomAdapter", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "nullableOnBoardingDTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BarcodeDTO_ShipmentJsonAdapter extends JsonAdapter<BarcodeDTO.Shipment> {
    public static final int $stable = 8;
    private volatile Constructor<BarcodeDTO.Shipment> constructorRef;

    @NotNull
    private final JsonAdapter<DisclaimerAtom> nullableDisclaimerAtomAdapter;

    @NotNull
    private final JsonAdapter<OnBoardingDTO> nullableOnBoardingDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    public BarcodeDTO_ShipmentJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("package", "hint", "code", "description", "info", "annotation", "onboarding");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "packageTitle");
        this.nullableStringAdapter = moshi.f(String.class, m11, "hint");
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "description");
        this.nullableDisclaimerAtomAdapter = moshi.f(DisclaimerAtom.class, m11, "annotation");
        this.nullableOnBoardingDTOAdapter = moshi.f(OnBoardingDTO.class, m11, "onboarding");
    }

    @NotNull
    public String toString() {
        return b.c(41, "GeneratedJsonAdapter(BarcodeDTO.Shipment)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public BarcodeDTO.Shipment fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        TextAtom textAtom = null;
        TextAtom textAtom2 = null;
        DisclaimerAtom disclaimerAtom = null;
        OnBoardingDTO onBoardingDTO = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("packageTitle", "package", reader);
                    }
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 2:
                    str3 = this.stringAdapter.fromJson(reader);
                    if (str3 == null) {
                        throw c.q("code", "code", reader);
                    }
                    break;
                case 3:
                    textAtom = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 4:
                    textAtom2 = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 5:
                    disclaimerAtom = this.nullableDisclaimerAtomAdapter.fromJson(reader);
                    break;
                case 6:
                    onBoardingDTO = this.nullableOnBoardingDTOAdapter.fromJson(reader);
                    i11 = -65;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -65) {
            OnBoardingDTO onBoardingDTO2 = onBoardingDTO;
            DisclaimerAtom disclaimerAtom2 = disclaimerAtom;
            TextAtom textAtom3 = textAtom2;
            TextAtom textAtom4 = textAtom;
            String str4 = str3;
            String str5 = str2;
            String str6 = str;
            if (str6 == null) {
                throw c.j("packageTitle", "package", reader);
            }
            if (str4 != null) {
                return new BarcodeDTO.Shipment(str6, str5, str4, textAtom4, textAtom3, disclaimerAtom2, onBoardingDTO2);
            }
            throw c.j("code", "code", reader);
        }
        OnBoardingDTO onBoardingDTO3 = onBoardingDTO;
        DisclaimerAtom disclaimerAtom3 = disclaimerAtom;
        TextAtom textAtom5 = textAtom2;
        TextAtom textAtom6 = textAtom;
        String str7 = str3;
        String str8 = str2;
        String str9 = str;
        Constructor<BarcodeDTO.Shipment> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = BarcodeDTO.Shipment.class.getDeclaredConstructor(String.class, String.class, String.class, TextAtom.class, TextAtom.class, DisclaimerAtom.class, OnBoardingDTO.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (str9 == null) {
            throw c.j("packageTitle", "package", reader);
        }
        if (str7 == null) {
            throw c.j("code", "code", reader);
        }
        BarcodeDTO.Shipment newInstance = constructor.newInstance(str9, str8, str7, textAtom6, textAtom5, disclaimerAtom3, onBoardingDTO3, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, BarcodeDTO.Shipment value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("package");
        this.stringAdapter.mo44toJson(writer, (x) value.getPackageTitle());
        writer.w("hint");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getHint());
        writer.w("code");
        this.stringAdapter.mo44toJson(writer, (x) value.getCode());
        writer.w("description");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getDescription());
        writer.w("info");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getInfo());
        writer.w("annotation");
        this.nullableDisclaimerAtomAdapter.mo44toJson(writer, (x) value.getAnnotation());
        writer.w("onboarding");
        this.nullableOnBoardingDTOAdapter.mo44toJson(writer, (x) value.getOnboarding());
        writer.p();
    }
}
