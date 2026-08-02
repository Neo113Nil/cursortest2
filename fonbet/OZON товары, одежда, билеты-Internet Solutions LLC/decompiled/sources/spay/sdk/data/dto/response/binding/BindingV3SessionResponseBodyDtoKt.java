package spay.sdk.data.dto.response.binding;

import M1.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import spay.sdk.domain.model.response.BindingCheckResult;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\u001a\u001c\u0010\u0007\u001a\u0004\u0018\u00010\b*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"AVAILABLE", "", "CARD_BLOCKED", "CHECK_RESULT_BALANCE_CHECK_FIELD", "CHECK_RESULT_BINDING_SPAY_FIELD", "CHECK_RESULT_HAS_CARDS_FIELD", "NOT_AVAILABLE", "toBindingCheckResult", "Lspay/sdk/domain/model/response/BindingCheckResult;", "", "", "SPaySDK_baseRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BindingV3SessionResponseBodyDtoKt {

    @NotNull
    private static final String AVAILABLE = "available";

    @NotNull
    private static final String CARD_BLOCKED = "card_blocked";

    @NotNull
    public static final String CHECK_RESULT_BALANCE_CHECK_FIELD = "payBinding";

    @NotNull
    public static final String CHECK_RESULT_BINDING_SPAY_FIELD = "YmluZGluZ1NiZXJwYXk=";

    @NotNull
    public static final String CHECK_RESULT_HAS_CARDS_FIELD = "hasAdditionalCards";

    @NotNull
    private static final String NOT_AVAILABLE = "not_available";

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        if (r0.equals(spay.sdk.data.dto.response.binding.BindingV3SessionResponseBodyDtoKt.NOT_AVAILABLE) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        r0 = r0.equals(spay.sdk.data.dto.response.binding.BindingV3SessionResponseBodyDtoKt.CARD_BLOCKED);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
    
        if (r7 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        r3 = r7.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0080, code lost:
    
        r2 = new spay.sdk.domain.model.response.BindingCheckResult.NotAvailable(r1, r0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
    
        if (r0.equals(spay.sdk.data.dto.response.binding.BindingV3SessionResponseBodyDtoKt.CARD_BLOCKED) == false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final BindingCheckResult toBindingCheckResult(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Object obj = map.get(CHECK_RESULT_BALANCE_CHECK_FIELD);
        BindingCheckResult.NotAvailable notAvailable = null;
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get(b.m(CHECK_RESULT_BINDING_SPAY_FIELD));
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        boolean z11 = false;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Object obj3 = map.get(CHECK_RESULT_HAS_CARDS_FIELD);
        Boolean bool2 = obj3 instanceof Boolean ? (Boolean) obj3 : null;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1559039043) {
                if (hashCode != -982055843) {
                    if (hashCode == -733902135 && str.equals(AVAILABLE)) {
                        return new BindingCheckResult.Available(booleanValue);
                    }
                }
            }
        }
        return notAvailable;
    }
}
