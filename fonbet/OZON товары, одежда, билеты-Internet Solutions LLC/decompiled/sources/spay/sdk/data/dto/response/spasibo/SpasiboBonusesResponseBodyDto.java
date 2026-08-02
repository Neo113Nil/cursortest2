package spay.sdk.data.dto.response.spasibo;

import Cm.e;
import J8.a;
import J8.b;
import Sc.x;
import Ve.C4452mn;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.h;
import com.google.gson.i;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import spay.sdk.data.dto.response.DataDtoInterface;
import spay.sdk.domain.model.response.spasibo.SpasiboBonusesResponseBody;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\b\u0010\u0015\u001a\u00020\u0002H\u0016J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001a"}, d2 = {"Lspay/sdk/data/dto/response/spasibo/SpasiboBonusesResponseBodyDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/spasibo/SpasiboBonusesResponseBody;", "loyaltyAppInfoDto", "Lspay/sdk/data/dto/response/spasibo/SpasiboBonusesResponseBodyDto$LoyaltyInfoDto;", "precalculateBonusesInfoDto", "Lspay/sdk/data/dto/response/spasibo/SpasiboBonusesResponseBodyDto$PrecalculateBonusesInfoDto;", "(Lspay/sdk/data/dto/response/spasibo/SpasiboBonusesResponseBodyDto$LoyaltyInfoDto;Lspay/sdk/data/dto/response/spasibo/SpasiboBonusesResponseBodyDto$PrecalculateBonusesInfoDto;)V", "getLoyaltyAppInfoDto", "()Lspay/sdk/data/dto/response/spasibo/SpasiboBonusesResponseBodyDto$LoyaltyInfoDto;", "getPrecalculateBonusesInfoDto", "()Lspay/sdk/data/dto/response/spasibo/SpasiboBonusesResponseBodyDto$PrecalculateBonusesInfoDto;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toModel", "toString", "", "LoyaltyInfoDto", "PrecalculateBonusesInfoDto", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SpasiboBonusesResponseBodyDto implements DataDtoInterface<SpasiboBonusesResponseBody> {

    @b("loyaltyAppInfo")
    private final LoyaltyInfoDto loyaltyAppInfoDto;

    @b("precalculateBonusesInfo")
    private final PrecalculateBonusesInfoDto precalculateBonusesInfoDto;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0016"}, d2 = {"Lspay/sdk/data/dto/response/spasibo/SpasiboBonusesResponseBodyDto$LoyaltyInfoDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/spasibo/SpasiboBonusesResponseBody$LoyaltyAppInfo;", "maxPointsAmount", "", "pointsPaymentAmount", "(II)V", "getMaxPointsAmount", "()I", "getPointsPaymentAmount", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toModel", "toString", "", "JsonIntOrStringDeserializer", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class LoyaltyInfoDto implements DataDtoInterface<SpasiboBonusesResponseBody.LoyaltyAppInfo> {

        @a(JsonIntOrStringDeserializer.class)
        @b("maxPointsAmount")
        private final int maxPointsAmount;

        @a(JsonIntOrStringDeserializer.class)
        @b("pointsPaymentAmount")
        private final int pointsPaymentAmount;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\u000b\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lspay/sdk/data/dto/response/spasibo/SpasiboBonusesResponseBodyDto$LoyaltyInfoDto$JsonIntOrStringDeserializer;", "Lcom/google/gson/i;", "", "<init>", "()V", "Lcom/google/gson/JsonElement;", "json", "Ljava/lang/reflect/Type;", "typeOfT", "Lcom/google/gson/h;", "context", "deserialize", "(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/h;)Ljava/lang/Integer;", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class JsonIntOrStringDeserializer implements i<Integer> {

            @NotNull
            public static final JsonIntOrStringDeserializer INSTANCE = new JsonIntOrStringDeserializer();

            private JsonIntOrStringDeserializer() {
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.gson.i
            @NotNull
            public Integer deserialize(JsonElement json, Type typeOfT, h context) {
                int parseInt;
                if (json == null || !json.isJsonPrimitive()) {
                    throw new x("Illegal type at SBonuses");
                }
                JsonPrimitive asJsonPrimitive = json.getAsJsonPrimitive();
                if (asJsonPrimitive.isNumber()) {
                    parseInt = asJsonPrimitive.getAsInt();
                } else {
                    if (!asJsonPrimitive.isString()) {
                        throw new x("Illegal type at SBonuses");
                    }
                    String dataString = asJsonPrimitive.getAsString();
                    Intrinsics.checkNotNullExpressionValue(dataString, "dataString");
                    parseInt = kotlin.text.h.t(dataString, ".", false) ? Integer.parseInt(kotlin.text.h.X(dataString, ".", "", false)) : Integer.parseInt(dataString.concat("00"));
                }
                return Integer.valueOf(parseInt);
            }
        }

        public LoyaltyInfoDto(int i11, int i12) {
            this.maxPointsAmount = i11;
            this.pointsPaymentAmount = i12;
        }

        public static /* synthetic */ LoyaltyInfoDto copy$default(LoyaltyInfoDto loyaltyInfoDto, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = loyaltyInfoDto.maxPointsAmount;
            }
            if ((i13 & 2) != 0) {
                i12 = loyaltyInfoDto.pointsPaymentAmount;
            }
            return loyaltyInfoDto.copy(i11, i12);
        }

        /* renamed from: component1, reason: from getter */
        public final int getMaxPointsAmount() {
            return this.maxPointsAmount;
        }

        /* renamed from: component2, reason: from getter */
        public final int getPointsPaymentAmount() {
            return this.pointsPaymentAmount;
        }

        @NotNull
        public final LoyaltyInfoDto copy(int maxPointsAmount, int pointsPaymentAmount) {
            return new LoyaltyInfoDto(maxPointsAmount, pointsPaymentAmount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoyaltyInfoDto)) {
                return false;
            }
            LoyaltyInfoDto loyaltyInfoDto = (LoyaltyInfoDto) other;
            return this.maxPointsAmount == loyaltyInfoDto.maxPointsAmount && this.pointsPaymentAmount == loyaltyInfoDto.pointsPaymentAmount;
        }

        public final int getMaxPointsAmount() {
            return this.maxPointsAmount;
        }

        public final int getPointsPaymentAmount() {
            return this.pointsPaymentAmount;
        }

        public int hashCode() {
            return Integer.hashCode(this.pointsPaymentAmount) + (Integer.hashCode(this.maxPointsAmount) * 31);
        }

        @NotNull
        public String toString() {
            return e.c("LoyaltyInfoDto(maxPointsAmount=", this.maxPointsAmount, ", pointsPaymentAmount=", ")", this.pointsPaymentAmount);
        }

        @Override // spay.sdk.data.dto.response.DataDtoInterface
        @NotNull
        public SpasiboBonusesResponseBody.LoyaltyAppInfo toModel() {
            return new SpasiboBonusesResponseBody.LoyaltyAppInfo(this.maxPointsAmount, this.pointsPaymentAmount);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\b\u0010\u0013\u001a\u00020\u0002H\u0016J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0015"}, d2 = {"Lspay/sdk/data/dto/response/spasibo/SpasiboBonusesResponseBodyDto$PrecalculateBonusesInfoDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/spasibo/SpasiboBonusesResponseBody$PrecalculateBonusesInfo;", "bonusesWithoutDeduction", "", "bonusesIsDeducted", "(Ljava/lang/String;Ljava/lang/String;)V", "getBonusesIsDeducted", "()Ljava/lang/String;", "getBonusesWithoutDeduction", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toModel", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class PrecalculateBonusesInfoDto implements DataDtoInterface<SpasiboBonusesResponseBody.PrecalculateBonusesInfo> {

        @b("bonusesIsDeducted")
        private final String bonusesIsDeducted;

        @b("bonusesWithoutDeduction")
        private final String bonusesWithoutDeduction;

        /* JADX WARN: Multi-variable type inference failed */
        public PrecalculateBonusesInfoDto() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ PrecalculateBonusesInfoDto copy$default(PrecalculateBonusesInfoDto precalculateBonusesInfoDto, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = precalculateBonusesInfoDto.bonusesWithoutDeduction;
            }
            if ((i11 & 2) != 0) {
                str2 = precalculateBonusesInfoDto.bonusesIsDeducted;
            }
            return precalculateBonusesInfoDto.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBonusesWithoutDeduction() {
            return this.bonusesWithoutDeduction;
        }

        /* renamed from: component2, reason: from getter */
        public final String getBonusesIsDeducted() {
            return this.bonusesIsDeducted;
        }

        @NotNull
        public final PrecalculateBonusesInfoDto copy(String bonusesWithoutDeduction, String bonusesIsDeducted) {
            return new PrecalculateBonusesInfoDto(bonusesWithoutDeduction, bonusesIsDeducted);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PrecalculateBonusesInfoDto)) {
                return false;
            }
            PrecalculateBonusesInfoDto precalculateBonusesInfoDto = (PrecalculateBonusesInfoDto) other;
            return Intrinsics.d(this.bonusesWithoutDeduction, precalculateBonusesInfoDto.bonusesWithoutDeduction) && Intrinsics.d(this.bonusesIsDeducted, precalculateBonusesInfoDto.bonusesIsDeducted);
        }

        public final String getBonusesIsDeducted() {
            return this.bonusesIsDeducted;
        }

        public final String getBonusesWithoutDeduction() {
            return this.bonusesWithoutDeduction;
        }

        public int hashCode() {
            String str = this.bonusesWithoutDeduction;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.bonusesIsDeducted;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return V.e.a("PrecalculateBonusesInfoDto(bonusesWithoutDeduction=", this.bonusesWithoutDeduction, ", bonusesIsDeducted=", this.bonusesIsDeducted, ")");
        }

        public PrecalculateBonusesInfoDto(String str, String str2) {
            this.bonusesWithoutDeduction = str;
            this.bonusesIsDeducted = str2;
        }

        @Override // spay.sdk.data.dto.response.DataDtoInterface
        @NotNull
        public SpasiboBonusesResponseBody.PrecalculateBonusesInfo toModel() {
            String str = this.bonusesWithoutDeduction;
            Integer w02 = str != null ? kotlin.text.h.w0(str) : null;
            String str2 = this.bonusesIsDeducted;
            return new SpasiboBonusesResponseBody.PrecalculateBonusesInfo(w02, str2 != null ? kotlin.text.h.w0(str2) : null);
        }

        public /* synthetic */ PrecalculateBonusesInfoDto(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SpasiboBonusesResponseBodyDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SpasiboBonusesResponseBodyDto copy$default(SpasiboBonusesResponseBodyDto spasiboBonusesResponseBodyDto, LoyaltyInfoDto loyaltyInfoDto, PrecalculateBonusesInfoDto precalculateBonusesInfoDto, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            loyaltyInfoDto = spasiboBonusesResponseBodyDto.loyaltyAppInfoDto;
        }
        if ((i11 & 2) != 0) {
            precalculateBonusesInfoDto = spasiboBonusesResponseBodyDto.precalculateBonusesInfoDto;
        }
        return spasiboBonusesResponseBodyDto.copy(loyaltyInfoDto, precalculateBonusesInfoDto);
    }

    /* renamed from: component1, reason: from getter */
    public final LoyaltyInfoDto getLoyaltyAppInfoDto() {
        return this.loyaltyAppInfoDto;
    }

    /* renamed from: component2, reason: from getter */
    public final PrecalculateBonusesInfoDto getPrecalculateBonusesInfoDto() {
        return this.precalculateBonusesInfoDto;
    }

    @NotNull
    public final SpasiboBonusesResponseBodyDto copy(LoyaltyInfoDto loyaltyAppInfoDto, PrecalculateBonusesInfoDto precalculateBonusesInfoDto) {
        return new SpasiboBonusesResponseBodyDto(loyaltyAppInfoDto, precalculateBonusesInfoDto);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpasiboBonusesResponseBodyDto)) {
            return false;
        }
        SpasiboBonusesResponseBodyDto spasiboBonusesResponseBodyDto = (SpasiboBonusesResponseBodyDto) other;
        return Intrinsics.d(this.loyaltyAppInfoDto, spasiboBonusesResponseBodyDto.loyaltyAppInfoDto) && Intrinsics.d(this.precalculateBonusesInfoDto, spasiboBonusesResponseBodyDto.precalculateBonusesInfoDto);
    }

    public final LoyaltyInfoDto getLoyaltyAppInfoDto() {
        return this.loyaltyAppInfoDto;
    }

    public final PrecalculateBonusesInfoDto getPrecalculateBonusesInfoDto() {
        return this.precalculateBonusesInfoDto;
    }

    public int hashCode() {
        LoyaltyInfoDto loyaltyInfoDto = this.loyaltyAppInfoDto;
        int hashCode = (loyaltyInfoDto == null ? 0 : loyaltyInfoDto.hashCode()) * 31;
        PrecalculateBonusesInfoDto precalculateBonusesInfoDto = this.precalculateBonusesInfoDto;
        return hashCode + (precalculateBonusesInfoDto != null ? precalculateBonusesInfoDto.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SpasiboBonusesResponseBodyDto(loyaltyAppInfoDto=" + this.loyaltyAppInfoDto + ", precalculateBonusesInfoDto=" + this.precalculateBonusesInfoDto + ")";
    }

    public SpasiboBonusesResponseBodyDto(LoyaltyInfoDto loyaltyInfoDto, PrecalculateBonusesInfoDto precalculateBonusesInfoDto) {
        this.loyaltyAppInfoDto = loyaltyInfoDto;
        this.precalculateBonusesInfoDto = precalculateBonusesInfoDto;
    }

    @Override // spay.sdk.data.dto.response.DataDtoInterface
    @NotNull
    public SpasiboBonusesResponseBody toModel() {
        SpasiboBonusesResponseBody.LoyaltyAppInfo model;
        SpasiboBonusesResponseBody.PrecalculateBonusesInfo model2;
        LoyaltyInfoDto loyaltyInfoDto = this.loyaltyAppInfoDto;
        if (loyaltyInfoDto == null || (model = loyaltyInfoDto.toModel()) == null) {
            throw new C4452mn("loyaltyAppInfoDto");
        }
        PrecalculateBonusesInfoDto precalculateBonusesInfoDto = this.precalculateBonusesInfoDto;
        if (precalculateBonusesInfoDto == null || (model2 = precalculateBonusesInfoDto.toModel()) == null) {
            throw new C4452mn("precalculateBonusesInfoDto");
        }
        return new SpasiboBonusesResponseBody(model, model2);
    }

    public /* synthetic */ SpasiboBonusesResponseBodyDto(LoyaltyInfoDto loyaltyInfoDto, PrecalculateBonusesInfoDto precalculateBonusesInfoDto, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : loyaltyInfoDto, (i11 & 2) != 0 ? null : precalculateBonusesInfoDto);
    }
}
