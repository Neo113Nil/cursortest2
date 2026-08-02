package ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.footer;

import Y9.b;
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
import ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.footer.FooterBlockV2DTO;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001aR\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001aR\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001aR\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/footer/FooterBlockV2DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/footer/FooterBlockV2DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/footer/FooterBlockV2DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/footer/FooterBlockV2DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/footer/FooterBlockV2DTO$PassengerV2DTO;", "listOfPassengerV2DTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/avia/widgets/flightSeatsScheme/v2/data/footer/FooterBlockV2DTO$TabStyleV2DTO;", "nullableTabStyleV2DTOAdapter", "Lru/ozon/uni/atoms/data/text/TextDTO;", "textDTOAdapter", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttonV3DTOAdapter", "Lru/ozon/uni/atoms/data/common/CommonAtomIconDTO;", "nullableCommonAtomIconDTOAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "nullableButtonV3DTOAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class FooterBlockV2DTOJsonAdapter extends JsonAdapter<FooterBlockV2DTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> buttonV3DTOAdapter;
    private volatile Constructor<FooterBlockV2DTO> constructorRef;

    @NotNull
    private final JsonAdapter<List<FooterBlockV2DTO.PassengerV2DTO>> listOfPassengerV2DTOAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> nullableButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<CommonAtomIconDTO> nullableCommonAtomIconDTOAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<FooterBlockV2DTO.TabStyleV2DTO> nullableTabStyleV2DTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextDTO> textDTOAdapter;

    public FooterBlockV2DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("passengers", "passengerTabStyles", "caption", "price", "submitButton", "infoIcon", "common", "skipButton");
        b e11 = D.e(List.class, FooterBlockV2DTO.PassengerV2DTO.class);
        M m11 = M.f71699a;
        this.listOfPassengerV2DTOAdapter = moshi.f(e11, m11, "passengers");
        this.nullableTabStyleV2DTOAdapter = moshi.f(FooterBlockV2DTO.TabStyleV2DTO.class, m11, "passengerTabStyles");
        this.textDTOAdapter = moshi.f(TextDTO.class, m11, "caption");
        this.buttonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "submitButton");
        this.nullableCommonAtomIconDTOAdapter = moshi.f(CommonAtomIconDTO.class, m11, "infoIcon");
        this.nullableCommonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "common");
        this.nullableButtonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "skipButton");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(38, "GeneratedJsonAdapter(FooterBlockV2DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public FooterBlockV2DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        List<FooterBlockV2DTO.PassengerV2DTO> list = null;
        FooterBlockV2DTO.TabStyleV2DTO tabStyleV2DTO = null;
        TextDTO textDTO = null;
        TextDTO textDTO2 = null;
        ButtonV3DTO buttonV3DTO = null;
        CommonAtomIconDTO commonAtomIconDTO = null;
        CommonControlSettings commonControlSettings = null;
        ButtonV3DTO buttonV3DTO2 = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    list = this.listOfPassengerV2DTOAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("passengers", "passengers", reader);
                    }
                    i11 = -2;
                    break;
                case 1:
                    tabStyleV2DTO = this.nullableTabStyleV2DTOAdapter.fromJson(reader);
                    break;
                case 2:
                    textDTO = this.textDTOAdapter.fromJson(reader);
                    if (textDTO == null) {
                        throw c.q("caption", "caption", reader);
                    }
                    break;
                case 3:
                    textDTO2 = this.textDTOAdapter.fromJson(reader);
                    if (textDTO2 == null) {
                        throw c.q("price", "price", reader);
                    }
                    break;
                case 4:
                    buttonV3DTO = this.buttonV3DTOAdapter.fromJson(reader);
                    if (buttonV3DTO == null) {
                        throw c.q("submitButton", "submitButton", reader);
                    }
                    break;
                case 5:
                    commonAtomIconDTO = this.nullableCommonAtomIconDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                    break;
                case 7:
                    buttonV3DTO2 = this.nullableButtonV3DTOAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -2) {
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.travel.feature.avia.widgets.flightSeatsScheme.v2.data.footer.FooterBlockV2DTO.PassengerV2DTO>");
            if (textDTO == null) {
                throw c.j("caption", "caption", reader);
            }
            if (textDTO2 == null) {
                throw c.j("price", "price", reader);
            }
            if (buttonV3DTO == null) {
                throw c.j("submitButton", "submitButton", reader);
            }
            ButtonV3DTO buttonV3DTO3 = buttonV3DTO2;
            CommonControlSettings commonControlSettings2 = commonControlSettings;
            CommonAtomIconDTO commonAtomIconDTO2 = commonAtomIconDTO;
            ButtonV3DTO buttonV3DTO4 = buttonV3DTO;
            TextDTO textDTO3 = textDTO2;
            return new FooterBlockV2DTO(list, tabStyleV2DTO, textDTO, textDTO3, buttonV3DTO4, commonAtomIconDTO2, commonControlSettings2, buttonV3DTO3);
        }
        Constructor<FooterBlockV2DTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = FooterBlockV2DTO.class.getDeclaredConstructor(List.class, FooterBlockV2DTO.TabStyleV2DTO.class, TextDTO.class, TextDTO.class, ButtonV3DTO.class, CommonAtomIconDTO.class, CommonControlSettings.class, ButtonV3DTO.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        if (textDTO == null) {
            throw c.j("caption", "caption", reader);
        }
        if (textDTO2 == null) {
            throw c.j("price", "price", reader);
        }
        if (buttonV3DTO == null) {
            throw c.j("submitButton", "submitButton", reader);
        }
        FooterBlockV2DTO newInstance = constructor.newInstance(list, tabStyleV2DTO, textDTO, textDTO2, buttonV3DTO, commonAtomIconDTO, commonControlSettings, buttonV3DTO2, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, FooterBlockV2DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("passengers");
        this.listOfPassengerV2DTOAdapter.mo44toJson(writer, (x) value.getPassengers());
        writer.w("passengerTabStyles");
        this.nullableTabStyleV2DTOAdapter.mo44toJson(writer, (x) value.getPassengerTabStyles());
        writer.w("caption");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getCaption());
        writer.w("price");
        this.textDTOAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w("submitButton");
        this.buttonV3DTOAdapter.mo44toJson(writer, (x) value.getSubmitButton());
        writer.w("infoIcon");
        this.nullableCommonAtomIconDTOAdapter.mo44toJson(writer, (x) value.getInfoIcon());
        writer.w("common");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value.getCommon());
        writer.w("skipButton");
        this.nullableButtonV3DTOAdapter.mo44toJson(writer, (x) value.getSkipButton());
        writer.p();
    }
}
