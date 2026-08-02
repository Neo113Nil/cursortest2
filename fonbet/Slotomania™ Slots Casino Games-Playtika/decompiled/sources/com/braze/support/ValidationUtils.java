package com.braze.support;

import androidx.autofill.HintConstants;
import bo.app.k5;
import com.braze.Constants;
import com.braze.models.IBrazeLocation;
import com.braze.support.BrazeLogger;
import com.ironsource.X3;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b*\u0010'J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0007J6\u0010\u0012\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\u001c\u0010\u0017\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0007J\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0007R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u000e8\u0006X\u0087T¢\u0006\f\n\u0004\b$\u0010%\u0012\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010#R\u0014\u0010)\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010%¨\u0006+"}, d2 = {"Lcom/braze/support/ValidationUtils;", "", "", HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS, "", "isValidEmailAddress", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "isValidPhoneNumber", "field", "ensureBrazeFieldLength", InAppPurchaseMetaData.KEY_PRODUCT_ID, "currencyCode", "Ljava/math/BigDecimal;", "price", "", "quantity", "Lbo/app/k5;", "serverConfigStorageProvider", "isValidLogPurchaseInput", X3.i.j0, "isValidLogCustomEventInput", "campaignId", "pageId", "isValidPushStoryClickInput", "", IBrazeLocation.LATITUDE, IBrazeLocation.LONGITUDE, "isValidLocation", "", "VALID_CURRENCY_CODES", "Ljava/util/Set;", "getVALID_CURRENCY_CODES", "()Ljava/util/Set;", "Lkotlin/text/Regex;", "EMAIL_ADDRESS_REGEX", "Lkotlin/text/Regex;", "EMAIL_ADDRESS_MAX_LENGTH", "I", "getEMAIL_ADDRESS_MAX_LENGTH$annotations", "()V", "PHONE_NUMBER_REGEX", "BRAZE_STRING_MAX_LENGTH", "<init>", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes7.dex */
public final class ValidationUtils {
    public static final int BRAZE_STRING_MAX_LENGTH = 255;
    public static final int EMAIL_ADDRESS_MAX_LENGTH = 255;
    public static final ValidationUtils INSTANCE = new ValidationUtils();
    private static final Set<String> VALID_CURRENCY_CODES = SetsKt.setOf((Object[]) new String[]{"AED", "AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN", "BAM", "BBD", "BDT", "BGN", "BHD", "BIF", "BMD", "BND", "BOB", "BRL", "BSD", "BTC", "BTN", "BWP", "BYR", "BZD", "CAD", "CDF", "CHF", "CLF", "CLP", "CNY", "COP", "CRC", "CUC", "CUP", "CVE", "CZK", "DJF", "DKK", "DOP", "DZD", "EEK", "EGP", "ERN", "ETB", "EUR", "FJD", "FKP", "GBP", "GEL", "GGP", "GHS", "GIP", "GMD", "GNF", "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG", "HUF", "IDR", "ILS", "IMP", "INR", "IQD", "IRR", "ISK", "JEP", "JMD", "JOD", "JPY", "KES", "KGS", "KHR", "KMF", "KPW", "KRW", "KWD", "KYD", "KZT", "LAK", "LBP", "LKR", "LRD", "LSL", "LTL", "LVL", "LYD", "MAD", "MDL", "MGA", "MKD", "MMK", "MNT", "MOP", "MRO", "MTL", "MUR", "MVR", "MWK", "MXN", "MYR", "MZN", "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN", "PGK", "PHP", "PKR", "PLN", "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR", "SBD", "SCR", "SDG", "SEK", "SGD", "SHP", "SLL", "SOS", "SRD", "STD", "SVC", "SYP", "SZL", "THB", "TJS", "TMT", "TND", "TOP", "TRY", "TTD", "TWD", "TZS", "UAH", "UGX", "USD", "UYU", "UZS", "VEF", "VND", "VUV", "WST", "XAF", "XAG", "XAU", "XCD", "XDR", "XOF", "XPD", "XPF", "XPT", "YER", "ZAR", "ZMK", "ZMW", "ZWL"});
    private static final Regex EMAIL_ADDRESS_REGEX = new Regex(".+@.+\\..+");
    private static final Regex PHONE_NUMBER_REGEX = new Regex("^[0-9 .\\(\\)\\+\\-]+$");

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class a extends Lambda implements Function0<String> {
        final /* synthetic */ Ref.ObjectRef<String> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Ref.ObjectRef<String> objectRef) {
            super(0);
            this.b = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Provided string field is too long [" + this.b.element.length() + "]. The max length is 255, truncating provided field.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        public static final b b = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "The custom event name cannot be null or contain only whitespaces. Invalid custom event.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "The custom event is a blocklisted custom event: " + ((Object) this.b) + ". Invalid custom event.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d extends Lambda implements Function0<String> {
        public static final d b = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "The productId is empty, not logging in-app purchase to Braze.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class e extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("The productId is a blocklisted productId: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class f extends Lambda implements Function0<String> {
        public static final f b = new f();

        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("The currencyCode is empty. Expected one of ", ValidationUtils.INSTANCE.getVALID_CURRENCY_CODES());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class g extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "The currencyCode " + ((Object) this.b) + " is invalid. Expected one of " + ValidationUtils.INSTANCE.getVALID_CURRENCY_CODES();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class h extends Lambda implements Function0<String> {
        public static final h b = new h();

        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "The price is null.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class i extends Lambda implements Function0<String> {
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(int i) {
            super(0);
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "The requested purchase quantity of " + this.b + " is less than one. Invalid purchase";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class j extends Lambda implements Function0<String> {
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i) {
            super(0);
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "The requested purchase quantity of " + this.b + " is greater than the maximum of 100";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class k extends Lambda implements Function0<String> {
        public static final k b = new k();

        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Campaign ID cannot be null or blank";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class l extends Lambda implements Function0<String> {
        public static final l b = new l();

        l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Push story page ID cannot be null or blank";
        }
    }

    private ValidationUtils() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v4, types: [T, java.lang.String] */
    @JvmStatic
    public static final String ensureBrazeFieldLength(String field) {
        if (field == null || StringsKt.isBlank(field)) {
            return "";
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        ?? obj = StringsKt.trim((CharSequence) field).toString();
        objectRef.element = obj;
        int length = obj.length();
        ValidationUtils validationUtils = INSTANCE;
        if (length > 255) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, validationUtils, BrazeLogger.Priority.W, (Throwable) null, new a(objectRef), 2, (Object) null);
            ?? substring = ((String) objectRef.element).substring(0, 255);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            objectRef.element = substring;
        }
        return (String) objectRef.element;
    }

    public static /* synthetic */ void getEMAIL_ADDRESS_MAX_LENGTH$annotations() {
    }

    @JvmStatic
    public static final boolean isValidEmailAddress(String emailAddress) {
        if (emailAddress == null || emailAddress.length() == 0 || emailAddress.length() > 255) {
            return false;
        }
        return EMAIL_ADDRESS_REGEX.matches(emailAddress);
    }

    @JvmStatic
    public static final boolean isValidLocation(double latitude, double longitude) {
        return latitude < 90.0d && latitude > -90.0d && longitude < 180.0d && longitude > -180.0d;
    }

    @JvmStatic
    public static final boolean isValidLogCustomEventInput(String eventName, k5 serverConfigStorageProvider) {
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        if (eventName == null || StringsKt.isBlank(eventName)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, b.b, 2, (Object) null);
            return false;
        }
        if (!serverConfigStorageProvider.c().contains(eventName)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, new c(eventName), 2, (Object) null);
        return false;
    }

    @JvmStatic
    public static final boolean isValidLogPurchaseInput(String productId, String currencyCode, BigDecimal price, int quantity, k5 serverConfigStorageProvider) {
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        if (productId == null || StringsKt.isBlank(productId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, d.b, 2, (Object) null);
            return false;
        }
        if (serverConfigStorageProvider.d().contains(productId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, new e(productId), 2, (Object) null);
            return false;
        }
        if (currencyCode == null || StringsKt.isBlank(currencyCode)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, f.b, 2, (Object) null);
            return false;
        }
        ValidationUtils validationUtils = INSTANCE;
        Set<String> set = VALID_CURRENCY_CODES;
        String obj = StringsKt.trim((CharSequence) currencyCode).toString();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String upperCase = obj.toUpperCase(US);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        if (!set.contains(upperCase)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, validationUtils, BrazeLogger.Priority.W, (Throwable) null, new g(currencyCode), 2, (Object) null);
            return false;
        }
        if (price == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, validationUtils, BrazeLogger.Priority.W, (Throwable) null, h.b, 2, (Object) null);
            return false;
        }
        if (quantity <= 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, validationUtils, BrazeLogger.Priority.W, (Throwable) null, new i(quantity), 2, (Object) null);
            return false;
        }
        if (quantity <= 100) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, validationUtils, BrazeLogger.Priority.W, (Throwable) null, new j(quantity), 2, (Object) null);
        return false;
    }

    @JvmStatic
    public static final boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber != null && PHONE_NUMBER_REGEX.matches(phoneNumber);
    }

    @JvmStatic
    public static final boolean isValidPushStoryClickInput(String campaignId, String pageId) {
        if (campaignId == null || StringsKt.isBlank(campaignId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, k.b, 2, (Object) null);
            return false;
        }
        if (pageId != null && !StringsKt.isBlank(pageId)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, INSTANCE, BrazeLogger.Priority.W, (Throwable) null, l.b, 2, (Object) null);
        return false;
    }

    public final Set<String> getVALID_CURRENCY_CODES() {
        return VALID_CURRENCY_CODES;
    }
}
