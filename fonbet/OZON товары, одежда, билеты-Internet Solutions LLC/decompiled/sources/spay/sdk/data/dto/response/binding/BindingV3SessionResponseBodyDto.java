package spay.sdk.data.dto.response.binding;

import Bk.C2638a;
import J8.b;
import Lf.a;
import N3.C3660k;
import Ve.C4452mn;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import spay.sdk.data.dto.response.DataDtoInterface;
import spay.sdk.domain.model.response.BindingCheckResult;
import spay.sdk.domain.model.response.BindingPaymentFeatures;
import spay.sdk.domain.model.response.BindingSessionId;
import spay.sdk.domain.model.response.CardRegion;
import spay.sdk.domain.model.response.paymentToken.errorResponse.FraudMonCheckResult;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0019\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u000bHÆ\u0003JQ\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\b\u0010 \u001a\u00020\u0002H\u0016J\t\u0010!\u001a\u00020\u0004HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR&\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006\""}, d2 = {"Lspay/sdk/data/dto/response/binding/BindingV3SessionResponseBodyDto;", "Lspay/sdk/data/dto/response/DataDtoInterface;", "Lspay/sdk/domain/model/response/BindingSessionId;", "sessionId", "", "cardRegion", "features", "checkResult", "", "", "fraudMonCheckResult", "Lspay/sdk/data/dto/response/binding/FraudMonCheckResultResponseBodyDto;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lspay/sdk/data/dto/response/binding/FraudMonCheckResultResponseBodyDto;)V", "getCardRegion", "()Ljava/lang/String;", "getCheckResult", "()Ljava/util/Map;", "getFeatures", "getFraudMonCheckResult", "()Lspay/sdk/data/dto/response/binding/FraudMonCheckResultResponseBodyDto;", "getSessionId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toModel", "toString", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BindingV3SessionResponseBodyDto implements DataDtoInterface<BindingSessionId> {

    @b("cardRegion")
    @NotNull
    private final String cardRegion;

    @b("checkResult")
    private final Map<String, Object> checkResult;

    @b("features")
    private final String features;

    @b("fraudMonCheckResult")
    private final FraudMonCheckResultResponseBodyDto fraudMonCheckResult;

    @b("sessionId")
    private final String sessionId;

    public BindingV3SessionResponseBodyDto(String str, @NotNull String cardRegion, String str2, Map<String, ? extends Object> map, FraudMonCheckResultResponseBodyDto fraudMonCheckResultResponseBodyDto) {
        Intrinsics.checkNotNullParameter(cardRegion, "cardRegion");
        this.sessionId = str;
        this.cardRegion = cardRegion;
        this.features = str2;
        this.checkResult = map;
        this.fraudMonCheckResult = fraudMonCheckResultResponseBodyDto;
    }

    public static /* synthetic */ BindingV3SessionResponseBodyDto copy$default(BindingV3SessionResponseBodyDto bindingV3SessionResponseBodyDto, String str, String str2, String str3, Map map, FraudMonCheckResultResponseBodyDto fraudMonCheckResultResponseBodyDto, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bindingV3SessionResponseBodyDto.sessionId;
        }
        if ((i11 & 2) != 0) {
            str2 = bindingV3SessionResponseBodyDto.cardRegion;
        }
        if ((i11 & 4) != 0) {
            str3 = bindingV3SessionResponseBodyDto.features;
        }
        if ((i11 & 8) != 0) {
            map = bindingV3SessionResponseBodyDto.checkResult;
        }
        if ((i11 & 16) != 0) {
            fraudMonCheckResultResponseBodyDto = bindingV3SessionResponseBodyDto.fraudMonCheckResult;
        }
        FraudMonCheckResultResponseBodyDto fraudMonCheckResultResponseBodyDto2 = fraudMonCheckResultResponseBodyDto;
        String str4 = str3;
        return bindingV3SessionResponseBodyDto.copy(str, str2, str4, map, fraudMonCheckResultResponseBodyDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getCardRegion() {
        return this.cardRegion;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFeatures() {
        return this.features;
    }

    public final Map<String, Object> component4() {
        return this.checkResult;
    }

    /* renamed from: component5, reason: from getter */
    public final FraudMonCheckResultResponseBodyDto getFraudMonCheckResult() {
        return this.fraudMonCheckResult;
    }

    @NotNull
    public final BindingV3SessionResponseBodyDto copy(String sessionId, @NotNull String cardRegion, String features, Map<String, ? extends Object> checkResult, FraudMonCheckResultResponseBodyDto fraudMonCheckResult) {
        Intrinsics.checkNotNullParameter(cardRegion, "cardRegion");
        return new BindingV3SessionResponseBodyDto(sessionId, cardRegion, features, checkResult, fraudMonCheckResult);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BindingV3SessionResponseBodyDto)) {
            return false;
        }
        BindingV3SessionResponseBodyDto bindingV3SessionResponseBodyDto = (BindingV3SessionResponseBodyDto) other;
        return Intrinsics.d(this.sessionId, bindingV3SessionResponseBodyDto.sessionId) && Intrinsics.d(this.cardRegion, bindingV3SessionResponseBodyDto.cardRegion) && Intrinsics.d(this.features, bindingV3SessionResponseBodyDto.features) && Intrinsics.d(this.checkResult, bindingV3SessionResponseBodyDto.checkResult) && Intrinsics.d(this.fraudMonCheckResult, bindingV3SessionResponseBodyDto.fraudMonCheckResult);
    }

    @NotNull
    public final String getCardRegion() {
        return this.cardRegion;
    }

    public final Map<String, Object> getCheckResult() {
        return this.checkResult;
    }

    public final String getFeatures() {
        return this.features;
    }

    public final FraudMonCheckResultResponseBodyDto getFraudMonCheckResult() {
        return this.fraudMonCheckResult;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public int hashCode() {
        String str = this.sessionId;
        int b02 = a.b0((str == null ? 0 : str.hashCode()) * 31, this.cardRegion);
        String str2 = this.features;
        int hashCode = (b02 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, Object> map = this.checkResult;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        FraudMonCheckResultResponseBodyDto fraudMonCheckResultResponseBodyDto = this.fraudMonCheckResult;
        return hashCode2 + (fraudMonCheckResultResponseBodyDto != null ? fraudMonCheckResultResponseBodyDto.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.sessionId;
        String str2 = this.cardRegion;
        String str3 = this.features;
        Map<String, Object> map = this.checkResult;
        FraudMonCheckResultResponseBodyDto fraudMonCheckResultResponseBodyDto = this.fraudMonCheckResult;
        StringBuilder d11 = C3660k.d("BindingV3SessionResponseBodyDto(sessionId=", str, ", cardRegion=", str2, ", features=");
        C2638a.e(d11, str3, ", checkResult=", map, ", fraudMonCheckResult=");
        d11.append(fraudMonCheckResultResponseBodyDto);
        d11.append(")");
        return d11.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        if (r4 == null) goto L33;
     */
    @Override // spay.sdk.data.dto.response.DataDtoInterface
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public BindingSessionId toModel() {
        BindingPaymentFeatures bindingPaymentFeatures;
        CardRegion cardRegion;
        CardRegion[] values = CardRegion.values();
        int length = values.length;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            bindingPaymentFeatures = null;
            if (i12 >= length) {
                cardRegion = null;
                break;
            }
            cardRegion = values[i12];
            if (Intrinsics.d(cardRegion.getDtoValue(), this.cardRegion)) {
                break;
            }
            i12++;
        }
        if (cardRegion == null) {
            cardRegion = CardRegion.UNKNOWN;
        }
        CardRegion cardRegion2 = cardRegion;
        String str = this.sessionId;
        if (str == null) {
            throw new C4452mn("sessionId");
        }
        Map<String, Object> map = this.checkResult;
        BindingCheckResult bindingCheckResult = map != null ? BindingV3SessionResponseBodyDtoKt.toBindingCheckResult(map) : null;
        FraudMonCheckResultResponseBodyDto fraudMonCheckResultResponseBodyDto = this.fraudMonCheckResult;
        FraudMonCheckResult model = fraudMonCheckResultResponseBodyDto != null ? fraudMonCheckResultResponseBodyDto.toModel() : null;
        if (this.features != null) {
            BindingPaymentFeatures[] values2 = BindingPaymentFeatures.values();
            int length2 = values2.length;
            while (true) {
                if (i11 >= length2) {
                    break;
                }
                BindingPaymentFeatures bindingPaymentFeatures2 = values2[i11];
                if (Intrinsics.d(bindingPaymentFeatures2.getDtoValue(), this.features)) {
                    bindingPaymentFeatures = bindingPaymentFeatures2;
                    break;
                }
                i11++;
            }
        }
        bindingPaymentFeatures = BindingPaymentFeatures.UNKNOWN;
        return new BindingSessionId(str, cardRegion2, bindingCheckResult, model, bindingPaymentFeatures);
    }

    public /* synthetic */ BindingV3SessionResponseBodyDto(String str, String str2, String str3, Map map, FraudMonCheckResultResponseBodyDto fraudMonCheckResultResponseBodyDto, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : map, (i11 & 16) != 0 ? null : fraudMonCheckResultResponseBodyDto);
    }
}
