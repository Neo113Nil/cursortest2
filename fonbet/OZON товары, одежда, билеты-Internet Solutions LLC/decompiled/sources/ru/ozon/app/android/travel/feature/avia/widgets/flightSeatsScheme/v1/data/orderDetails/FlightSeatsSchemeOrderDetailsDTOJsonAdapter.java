package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.orderDetails;

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
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.orderDetails.FlightSeatsSchemeOrderDetailsDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/orderDetails/FlightSeatsSchemeOrderDetailsDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/orderDetails/FlightSeatsSchemeOrderDetailsDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/orderDetails/FlightSeatsSchemeOrderDetailsDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/orderDetails/FlightSeatsSchemeOrderDetailsDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "largeButtonAdapter", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v1/data/orderDetails/FlightSeatsSchemeOrderDetailsDTO$FlightPrice;", "listOfFlightPriceAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FlightSeatsSchemeOrderDetailsDTOJsonAdapter extends JsonAdapter<FlightSeatsSchemeOrderDetailsDTO> {
    public static final int $stable = 8;
    private volatile Constructor<FlightSeatsSchemeOrderDetailsDTO> constructorRef;

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeButton> largeButtonAdapter;

    @NotNull
    private final JsonAdapter<List<FlightSeatsSchemeOrderDetailsDTO.FlightPrice>> listOfFlightPriceAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public FlightSeatsSchemeOrderDetailsDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(CommentV3DTO.HEADER_FIELD_NAME, "totalPriceTitle", "totalPrice", "submitButton", "flightPrices");
        M m11 = M.f71699a;
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, CommentV3DTO.HEADER_FIELD_NAME);
        this.largeButtonAdapter = moshi.f(ButtonV3Atom.LargeButton.class, m11, "submitButton");
        this.listOfFlightPriceAdapter = moshi.f(D.e(List.class, FlightSeatsSchemeOrderDetailsDTO.FlightPrice.class), m11, "flightPrices");
    }

    @NotNull
    public String toString() {
        return b.c(54, "GeneratedJsonAdapter(FlightSeatsSchemeOrderDetailsDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FlightSeatsSchemeOrderDetailsDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        TextAtom textAtom = null;
        TextAtom textAtom2 = null;
        TextAtom textAtom3 = null;
        ButtonV3Atom.LargeButton largeButton = null;
        List<FlightSeatsSchemeOrderDetailsDTO.FlightPrice> list = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                textAtom = this.textAtomAdapter.fromJson(reader);
                if (textAtom == null) {
                    throw c.q("header_", CommentV3DTO.HEADER_FIELD_NAME, reader);
                }
            } else if (v11 == 1) {
                textAtom2 = this.textAtomAdapter.fromJson(reader);
                if (textAtom2 == null) {
                    throw c.q("totalPriceTitle", "totalPriceTitle", reader);
                }
            } else if (v11 == 2) {
                textAtom3 = this.textAtomAdapter.fromJson(reader);
                if (textAtom3 == null) {
                    throw c.q("totalPrice", "totalPrice", reader);
                }
            } else if (v11 == 3) {
                largeButton = this.largeButtonAdapter.fromJson(reader);
                if (largeButton == null) {
                    throw c.q("submitButton", "submitButton", reader);
                }
            } else if (v11 == 4) {
                list = this.listOfFlightPriceAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("flightPrices", "flightPrices", reader);
                }
                i11 = -17;
            } else {
                continue;
            }
        }
        reader.endObject();
        if (i11 == -17) {
            ButtonV3Atom.LargeButton largeButton2 = largeButton;
            TextAtom textAtom4 = textAtom3;
            TextAtom textAtom5 = textAtom2;
            TextAtom textAtom6 = textAtom;
            if (textAtom6 == null) {
                throw c.j("header_", CommentV3DTO.HEADER_FIELD_NAME, reader);
            }
            if (textAtom5 == null) {
                throw c.j("totalPriceTitle", "totalPriceTitle", reader);
            }
            if (textAtom4 == null) {
                throw c.j("totalPrice", "totalPrice", reader);
            }
            if (largeButton2 == null) {
                throw c.j("submitButton", "submitButton", reader);
            }
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v1.data.orderDetails.FlightSeatsSchemeOrderDetailsDTO.FlightPrice>");
            return new FlightSeatsSchemeOrderDetailsDTO(textAtom6, textAtom5, textAtom4, largeButton2, list);
        }
        ButtonV3Atom.LargeButton largeButton3 = largeButton;
        TextAtom textAtom7 = textAtom3;
        TextAtom textAtom8 = textAtom2;
        TextAtom textAtom9 = textAtom;
        Constructor<FlightSeatsSchemeOrderDetailsDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = FlightSeatsSchemeOrderDetailsDTO.class.getDeclaredConstructor(TextAtom.class, TextAtom.class, TextAtom.class, ButtonV3Atom.LargeButton.class, List.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (textAtom9 == null) {
            throw c.j("header_", CommentV3DTO.HEADER_FIELD_NAME, reader);
        }
        if (textAtom8 == null) {
            throw c.j("totalPriceTitle", "totalPriceTitle", reader);
        }
        if (textAtom7 == null) {
            throw c.j("totalPrice", "totalPrice", reader);
        }
        if (largeButton3 == null) {
            throw c.j("submitButton", "submitButton", reader);
        }
        FlightSeatsSchemeOrderDetailsDTO newInstance = constructor.newInstance(textAtom9, textAtom8, textAtom7, largeButton3, list, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FlightSeatsSchemeOrderDetailsDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(CommentV3DTO.HEADER_FIELD_NAME);
        this.textAtomAdapter.mo44toJson(writer, (x) value.getHeader());
        writer.w("totalPriceTitle");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getTotalPriceTitle());
        writer.w("totalPrice");
        this.textAtomAdapter.mo44toJson(writer, (x) value.getTotalPrice());
        writer.w("submitButton");
        this.largeButtonAdapter.mo44toJson(writer, (x) value.getSubmitButton());
        writer.w("flightPrices");
        this.listOfFlightPriceAdapter.mo44toJson(writer, (x) value.getFlightPrices());
        writer.p();
    }
}
