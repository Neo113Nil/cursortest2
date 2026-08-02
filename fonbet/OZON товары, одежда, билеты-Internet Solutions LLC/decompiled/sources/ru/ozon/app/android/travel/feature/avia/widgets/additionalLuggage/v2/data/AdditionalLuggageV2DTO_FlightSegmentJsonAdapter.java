package ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.data;

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
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.data.AdditionalLuggageV2DTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2DTO_FlightSegmentJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2DTO$FlightSegment;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2DTO$FlightSegment;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2DTO$FlightSegment;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2DTO$BaseTariff;", "nullableBaseTariffAdapter", "nullableTextAtomAdapter", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "nullableDisclaimerAtomAdapter", "", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2DTO$LuggageItem;", "listOfLuggageItemAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdditionalLuggageV2DTO_FlightSegmentJsonAdapter extends JsonAdapter<AdditionalLuggageV2DTO.FlightSegment> {
    public static final int $stable = 8;
    private volatile Constructor<AdditionalLuggageV2DTO.FlightSegment> constructorRef;

    @NotNull
    private final JsonAdapter<List<AdditionalLuggageV2DTO.LuggageItem>> listOfLuggageItemAdapter;

    @NotNull
    private final JsonAdapter<AdditionalLuggageV2DTO.BaseTariff> nullableBaseTariffAdapter;

    @NotNull
    private final JsonAdapter<DisclaimerAtom> nullableDisclaimerAtomAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public AdditionalLuggageV2DTO_FlightSegmentJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("route", "baseTariff", "additionalLuggageTitle", "additionalLuggageSubtitle", "noExtraLuggageInfo", "luggageTransportation", "luggageItems");
        M m11 = M.f71699a;
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, "route");
        this.nullableBaseTariffAdapter = moshi.f(AdditionalLuggageV2DTO.BaseTariff.class, m11, "baseTariff");
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "additionalLuggageSubtitle");
        this.nullableDisclaimerAtomAdapter = moshi.f(DisclaimerAtom.class, m11, "noExtraLuggageInfo");
        this.listOfLuggageItemAdapter = moshi.f(D.e(List.class, AdditionalLuggageV2DTO.LuggageItem.class), m11, "luggageItems");
    }

    @NotNull
    public String toString() {
        return b.c(58, "GeneratedJsonAdapter(AdditionalLuggageV2DTO.FlightSegment)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AdditionalLuggageV2DTO.FlightSegment fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        TextAtom textAtom = null;
        AdditionalLuggageV2DTO.BaseTariff baseTariff = null;
        TextAtom textAtom2 = null;
        TextAtom textAtom3 = null;
        DisclaimerAtom disclaimerAtom = null;
        DisclaimerAtom disclaimerAtom2 = null;
        List<AdditionalLuggageV2DTO.LuggageItem> list = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    textAtom = this.textAtomAdapter.fromJson(reader);
                    if (textAtom == null) {
                        throw c.q("route", "route", reader);
                    }
                    break;
                case 1:
                    baseTariff = this.nullableBaseTariffAdapter.fromJson(reader);
                    break;
                case 2:
                    textAtom2 = this.textAtomAdapter.fromJson(reader);
                    if (textAtom2 == null) {
                        throw c.q("additionalLuggageTitle", "additionalLuggageTitle", reader);
                    }
                    break;
                case 3:
                    textAtom3 = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 4:
                    disclaimerAtom = this.nullableDisclaimerAtomAdapter.fromJson(reader);
                    break;
                case 5:
                    disclaimerAtom2 = this.nullableDisclaimerAtomAdapter.fromJson(reader);
                    break;
                case 6:
                    list = this.listOfLuggageItemAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("luggageItems", "luggageItems", reader);
                    }
                    i11 = -65;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -65) {
            DisclaimerAtom disclaimerAtom3 = disclaimerAtom2;
            DisclaimerAtom disclaimerAtom4 = disclaimerAtom;
            TextAtom textAtom4 = textAtom3;
            TextAtom textAtom5 = textAtom2;
            AdditionalLuggageV2DTO.BaseTariff baseTariff2 = baseTariff;
            TextAtom textAtom6 = textAtom;
            if (textAtom6 == null) {
                throw c.j("route", "route", reader);
            }
            if (textAtom5 == null) {
                throw c.j("additionalLuggageTitle", "additionalLuggageTitle", reader);
            }
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.data.AdditionalLuggageV2DTO.LuggageItem>");
            return new AdditionalLuggageV2DTO.FlightSegment(textAtom6, baseTariff2, textAtom5, textAtom4, disclaimerAtom4, disclaimerAtom3, list);
        }
        DisclaimerAtom disclaimerAtom5 = disclaimerAtom2;
        DisclaimerAtom disclaimerAtom6 = disclaimerAtom;
        TextAtom textAtom7 = textAtom3;
        TextAtom textAtom8 = textAtom2;
        AdditionalLuggageV2DTO.BaseTariff baseTariff3 = baseTariff;
        TextAtom textAtom9 = textAtom;
        Constructor<AdditionalLuggageV2DTO.FlightSegment> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = AdditionalLuggageV2DTO.FlightSegment.class.getDeclaredConstructor(TextAtom.class, AdditionalLuggageV2DTO.BaseTariff.class, TextAtom.class, TextAtom.class, DisclaimerAtom.class, DisclaimerAtom.class, List.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<AdditionalLuggageV2DTO.FlightSegment> constructor2 = constructor;
        if (textAtom9 == null) {
            throw c.j("route", "route", reader);
        }
        if (textAtom8 == null) {
            throw c.j("additionalLuggageTitle", "additionalLuggageTitle", reader);
        }
        AdditionalLuggageV2DTO.FlightSegment newInstance = constructor2.newInstance(textAtom9, baseTariff3, textAtom8, textAtom7, disclaimerAtom6, disclaimerAtom5, list, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AdditionalLuggageV2DTO.FlightSegment value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("route");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getRoute());
        writer.w("baseTariff");
        this.nullableBaseTariffAdapter.mo44toJson(writer, (x) value.getBaseTariff());
        writer.w("additionalLuggageTitle");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getAdditionalLuggageTitle());
        writer.w("additionalLuggageSubtitle");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getAdditionalLuggageSubtitle());
        writer.w("noExtraLuggageInfo");
        this.nullableDisclaimerAtomAdapter.mo44toJson(writer, (x) value.getNoExtraLuggageInfo());
        writer.w("luggageTransportation");
        this.nullableDisclaimerAtomAdapter.mo44toJson(writer, (x) value.getLuggageTransportation());
        writer.w("luggageItems");
        this.listOfLuggageItemAdapter.mo44toJson(writer, (x) value.getLuggageItems());
        writer.p();
    }
}
