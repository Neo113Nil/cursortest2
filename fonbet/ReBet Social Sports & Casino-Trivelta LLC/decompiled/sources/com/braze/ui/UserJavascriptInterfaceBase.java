package com.braze.ui;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.appsflyer.AdRevenueScheme;
import com.braze.Braze;
import com.braze.BrazeUser;
import com.braze.enums.Gender;
import com.braze.enums.Month;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.events.IValueCallback;
import com.braze.support.BrazeLogger;
import com.braze.ui.UserJavascriptInterfaceBase;
import com.twilio.voice.EventKeys;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 B2\u00020\u0001:\u0001BB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\u0012\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0007J\u0012\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0007J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\tH\u0007J \u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0007J\u0012\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\tH\u0007J\u0012\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\tH\u0007J\u0012\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\tH\u0007J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\tH\u0007J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\tH\u0007J\u0012\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\tH\u0007J\u0012\u0010\u001f\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\tH\u0007J \u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020%H\u0007J\u001a\u0010&\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010\tH\u0007J\u0018\u0010(\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\t2\u0006\u0010)\u001a\u00020\tH\u0007J\u0018\u0010*\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\t2\u0006\u0010)\u001a\u00020\tH\u0007J\u0018\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\t2\u0006\u0010)\u001a\u00020\tH\u0007J \u0010-\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\t2\u0006\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u00020\tH\u0007J\u0018\u00100\u001a\u00020\u00072\u0006\u00101\u001a\u00020\t2\u0006\u00102\u001a\u00020\tH\u0007J\u0010\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\tH\u0007J\u0010\u00105\u001a\u00020\u00072\u0006\u00104\u001a\u00020\tH\u0007J\u0012\u00106\u001a\u0004\u0018\u0001072\u0006\u0010\u0012\u001a\u00020\tH\u0007J\u0014\u00108\u001a\u0004\u0018\u0001092\b\u0010\u001b\u001a\u0004\u0018\u00010\tH\u0007J(\u0010:\u001a\u00020\u00072\u0006\u0010;\u001a\u00020<2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020%H\u0007J!\u0010=\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010>2\b\u0010'\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0002\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010A2\u0006\u0010\u000f\u001a\u00020\tH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lcom/braze/ui/UserJavascriptInterfaceBase;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "setFirstName", "", "firstName", "", "setLastName", "lastName", "setEmail", "email", "setGender", "genderString", "setDateOfBirth", "year", "month", "day", "setCountry", AdRevenueScheme.COUNTRY, "setLanguage", "language", "setHomeCity", "homeCity", "setEmailNotificationSubscriptionType", "subscriptionType", "setPushNotificationSubscriptionType", "setPhoneNumber", "phoneNumber", "setLineId", "lineId", "setCustomUserAttributeJSON", "key", "jsonStringValue", "merge", "", "setCustomUserAttributeArray", "jsonArrayString", "addToCustomAttributeArray", EventKeys.VALUE_KEY, "removeFromCustomAttributeArray", "incrementCustomUserAttribute", "attribute", "setCustomLocationAttribute", "latitude", "longitude", "addAlias", "alias", AnnotatedPrivateKey.LABEL, "addToSubscriptionGroup", "subscriptionGroupId", "removeFromSubscriptionGroup", "monthFromInt", "Lcom/braze/enums/Month;", "subscriptionTypeFromJavascriptString", "Lcom/braze/enums/NotificationSubscriptionType;", "setCustomAttribute", "user", "Lcom/braze/BrazeUser;", "parseStringArrayFromJsonString", "", "(Ljava/lang/String;)[Ljava/lang/String;", "parseGender", "Lcom/braze/enums/Gender;", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUserJavascriptInterfaceBase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserJavascriptInterfaceBase.kt\ncom/braze/ui/UserJavascriptInterfaceBase\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,349:1\n1#2:350\n37#3,2:351\n*S KotlinDebug\n*F\n+ 1 UserJavascriptInterfaceBase.kt\ncom/braze/ui/UserJavascriptInterfaceBase\n*L\n300#1:351,2\n*E\n"})
/* loaded from: classes.dex */
public abstract class UserJavascriptInterfaceBase {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Context context;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u0006\u001a\u00020\u0007*\u00020\b2!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u00070\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/braze/ui/UserJavascriptInterfaceBase$Companion;", "", "<init>", "()V", "JS_BRIDGE_ATTRIBUTE_VALUE", "", "runOnUser", "", "Lcom/braze/Braze;", "block", "Lkotlin/Function1;", "Lcom/braze/BrazeUser;", "Lkotlin/ParameterName;", "name", "user", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void runOnUser(Braze braze, final Function1<? super BrazeUser, Unit> function1) {
            braze.getCurrentUser(new IValueCallback() { // from class: Z3.a0
                @Override // com.braze.events.IValueCallback
                public final void onSuccess(Object obj) {
                    UserJavascriptInterfaceBase.Companion.runOnUser$lambda$0(Function1.this, (BrazeUser) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void runOnUser$lambda$0(Function1 function1, BrazeUser it) {
            Intrinsics.checkNotNullParameter(it, "it");
            function1.invoke(it);
        }

        private Companion() {
        }
    }

    public UserJavascriptInterfaceBase(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addAlias$lambda$0(String str, String str2, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.addAlias(str, str2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addToCustomAttributeArray$lambda$0(String str, String str2, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.addToCustomAttributeArray(str, str2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addToSubscriptionGroup$lambda$0(String str, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.addToSubscriptionGroup(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String incrementCustomUserAttribute$lambda$0(String str) {
        return "Failed to parse incrementCustomUserAttribute increment value '" + str + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit incrementCustomUserAttribute$lambda$1(String str, Integer num, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.incrementCustomUserAttribute(str, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String parseStringArrayFromJsonString$lambda$1() {
        return "Failed to parse custom attribute array";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeFromCustomAttributeArray$lambda$0(String str, String str2, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.removeFromCustomAttributeArray(str, str2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeFromSubscriptionGroup$lambda$0(String str, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.removeFromSubscriptionGroup(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setCountry$lambda$0(String str, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setCountry(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomAttribute$lambda$0(String str, String str2) {
        return "Failed to parse custom attribute type for key: " + str + " and json string value: " + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomAttribute$lambda$1(String str, String str2) {
        return "Failed to parse custom attribute type for key: " + str + " and json string value: " + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomLocationAttribute$lambda$0(String str) {
        return "Failed to parse setCustomLocationAttribute latitude value '" + str + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomLocationAttribute$lambda$1(String str) {
        return "Failed to parse setCustomLocationAttribute longitude value '" + str + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setCustomLocationAttribute$lambda$2(String str, Double d10, Double d11, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setLocationCustomAttribute(str, d10.doubleValue(), d11.doubleValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttributeArray$lambda$0(String str) {
        return "Failed to set custom attribute array for key " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setCustomUserAttributeArray$lambda$1(String str, String[] strArr, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setCustomAttributeArray(str, strArr);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setCustomUserAttributeJSON$lambda$0(UserJavascriptInterfaceBase userJavascriptInterfaceBase, String str, String str2, boolean z10, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        userJavascriptInterfaceBase.setCustomAttribute(it, str, str2, z10);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setDateOfBirth$lambda$0(String str) {
        return "Failed to parse setDateOfBirth year value '" + str + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setDateOfBirth$lambda$1(String str) {
        return "Failed to parse setDateOfBirth month for value " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setDateOfBirth$lambda$2(String str) {
        return "Failed to parse setDateOfBirth day value '" + str + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setDateOfBirth$lambda$3(Integer num, Month month, Integer num2, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setDateOfBirth(num.intValue(), month, num2.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setEmail$lambda$0(String str, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setEmail(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setEmailNotificationSubscriptionType$lambda$0(String str) {
        return "Failed to parse email subscription type in Braze HTML in-app message javascript interface with subscription " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setEmailNotificationSubscriptionType$lambda$1(NotificationSubscriptionType notificationSubscriptionType, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setEmailNotificationSubscriptionType(notificationSubscriptionType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setFirstName$lambda$0(String str, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setFirstName(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setGender$lambda$0(String str) {
        return "Failed to parse gender in Braze HTML in-app message javascript interface with gender: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setGender$lambda$1(Gender gender, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setGender(gender);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setHomeCity$lambda$0(String str, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setHomeCity(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setLanguage$lambda$0(String str, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setLanguage(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setLastName$lambda$0(String str, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setLastName(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setLineId$lambda$0(String str, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setLineId(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setPhoneNumber$lambda$0(String str, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setPhoneNumber(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setPushNotificationSubscriptionType$lambda$0(String str) {
        return "Failed to parse push subscription type in Braze HTML in-app message javascript interface with subscription: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setPushNotificationSubscriptionType$lambda$1(NotificationSubscriptionType notificationSubscriptionType, BrazeUser it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.setPushNotificationSubscriptionType(notificationSubscriptionType);
        return Unit.INSTANCE;
    }

    @JavascriptInterface
    public final void addAlias(@NotNull final String alias, @NotNull final String label) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(label, "label");
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1() { // from class: Z3.V
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit addAlias$lambda$0;
                addAlias$lambda$0 = UserJavascriptInterfaceBase.addAlias$lambda$0(alias, label, (BrazeUser) obj);
                return addAlias$lambda$0;
            }
        });
    }

    @JavascriptInterface
    public final void addToCustomAttributeArray(@NotNull final String key, @NotNull final String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1() { // from class: Z3.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit addToCustomAttributeArray$lambda$0;
                addToCustomAttributeArray$lambda$0 = UserJavascriptInterfaceBase.addToCustomAttributeArray$lambda$0(key, value, (BrazeUser) obj);
                return addToCustomAttributeArray$lambda$0;
            }
        });
    }

    @JavascriptInterface
    public final void addToSubscriptionGroup(@NotNull final String subscriptionGroupId) {
        Intrinsics.checkNotNullParameter(subscriptionGroupId, "subscriptionGroupId");
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1() { // from class: Z3.H
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit addToSubscriptionGroup$lambda$0;
                addToSubscriptionGroup$lambda$0 = UserJavascriptInterfaceBase.addToSubscriptionGroup$lambda$0(subscriptionGroupId, (BrazeUser) obj);
                return addToSubscriptionGroup$lambda$0;
            }
        });
    }

    @JavascriptInterface
    public final void incrementCustomUserAttribute(@NotNull final String attribute, @NotNull final String value) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        Intrinsics.checkNotNullParameter(value, "value");
        final Integer intOrNull = StringsKt.toIntOrNull(value);
        if (intOrNull == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: Z3.z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String incrementCustomUserAttribute$lambda$0;
                    incrementCustomUserAttribute$lambda$0 = UserJavascriptInterfaceBase.incrementCustomUserAttribute$lambda$0(value);
                    return incrementCustomUserAttribute$lambda$0;
                }
            }, 6, (Object) null);
        } else {
            INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1() { // from class: Z3.A
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit incrementCustomUserAttribute$lambda$1;
                    incrementCustomUserAttribute$lambda$1 = UserJavascriptInterfaceBase.incrementCustomUserAttribute$lambda$1(attribute, intOrNull, (BrazeUser) obj);
                    return incrementCustomUserAttribute$lambda$1;
                }
            });
        }
    }

    @Nullable
    public final Month monthFromInt(@NotNull String month) {
        int intValue;
        Intrinsics.checkNotNullParameter(month, "month");
        Integer intOrNull = StringsKt.toIntOrNull(month);
        if (intOrNull == null || (intValue = intOrNull.intValue()) < 1 || intValue > 12) {
            return null;
        }
        return Month.INSTANCE.getMonth(intValue - 1);
    }

    @Nullable
    public final Gender parseGender(@NotNull String genderString) {
        Intrinsics.checkNotNullParameter(genderString, "genderString");
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = genderString.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        Gender gender = Gender.MALE;
        if (Intrinsics.areEqual(lowerCase, gender.getKey())) {
            return gender;
        }
        Gender gender2 = Gender.FEMALE;
        if (Intrinsics.areEqual(lowerCase, gender2.getKey())) {
            return gender2;
        }
        Gender gender3 = Gender.OTHER;
        if (Intrinsics.areEqual(lowerCase, gender3.getKey())) {
            return gender3;
        }
        Gender gender4 = Gender.UNKNOWN;
        if (Intrinsics.areEqual(lowerCase, gender4.getKey())) {
            return gender4;
        }
        Gender gender5 = Gender.NOT_APPLICABLE;
        if (Intrinsics.areEqual(lowerCase, gender5.getKey())) {
            return gender5;
        }
        Gender gender6 = Gender.PREFER_NOT_TO_SAY;
        if (Intrinsics.areEqual(lowerCase, gender6.getKey())) {
            return gender6;
        }
        return null;
    }

    @Nullable
    public final String[] parseStringArrayFromJsonString(@Nullable String jsonArrayString) {
        try {
            JSONArray jSONArray = new JSONArray(jsonArrayString);
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(jSONArray.getString(i10));
            }
            return (String[]) arrayList.toArray(new String[0]);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: Z3.P
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String parseStringArrayFromJsonString$lambda$1;
                    parseStringArrayFromJsonString$lambda$1 = UserJavascriptInterfaceBase.parseStringArrayFromJsonString$lambda$1();
                    return parseStringArrayFromJsonString$lambda$1;
                }
            }, 4, (Object) null);
            return null;
        }
    }

    @JavascriptInterface
    public final void removeFromCustomAttributeArray(@NotNull final String key, @NotNull final String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1() { // from class: Z3.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit removeFromCustomAttributeArray$lambda$0;
                removeFromCustomAttributeArray$lambda$0 = UserJavascriptInterfaceBase.removeFromCustomAttributeArray$lambda$0(key, value, (BrazeUser) obj);
                return removeFromCustomAttributeArray$lambda$0;
            }
        });
    }

    @JavascriptInterface
    public final void removeFromSubscriptionGroup(@NotNull final String subscriptionGroupId) {
        Intrinsics.checkNotNullParameter(subscriptionGroupId, "subscriptionGroupId");
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1() { // from class: Z3.J
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit removeFromSubscriptionGroup$lambda$0;
                removeFromSubscriptionGroup$lambda$0 = UserJavascriptInterfaceBase.removeFromSubscriptionGroup$lambda$0(subscriptionGroupId, (BrazeUser) obj);
                return removeFromSubscriptionGroup$lambda$0;
            }
        });
    }

    @JavascriptInterface
    public final void setCountry(@Nullable final String country) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1() { // from class: Z3.K
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit country$lambda$0;
                country$lambda$0 = UserJavascriptInterfaceBase.setCountry$lambda$0(country, (BrazeUser) obj);
                return country$lambda$0;
            }
        });
    }

    public final void setCustomAttribute(@NotNull BrazeUser user, @NotNull final String key, @NotNull final String jsonStringValue, boolean merge) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(jsonStringValue, "jsonStringValue");
        try {
            Object obj = new JSONObject(jsonStringValue).get(EventKeys.VALUE_KEY);
            if (obj instanceof String) {
                user.setCustomUserAttribute(key, (String) obj);
                return;
            }
            if (obj instanceof Boolean) {
                user.setCustomUserAttribute(key, ((Boolean) obj).booleanValue());
                return;
            }
            if (obj instanceof Integer) {
                user.setCustomUserAttribute(key, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Double) {
                user.setCustomUserAttribute(key, ((Number) obj).doubleValue());
            } else if (obj instanceof JSONObject) {
                user.setCustomUserAttribute(key, (JSONObject) obj, merge);
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: Z3.Q
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String customAttribute$lambda$0;
                        customAttribute$lambda$0 = UserJavascriptInterfaceBase.setCustomAttribute$lambda$0(key, jsonStringValue);
                        return customAttribute$lambda$0;
                    }
                }, 6, (Object) null);
            }
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: Z3.S
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String customAttribute$lambda$1;
                    customAttribute$lambda$1 = UserJavascriptInterfaceBase.setCustomAttribute$lambda$1(key, jsonStringValue);
                    return customAttribute$lambda$1;
                }
            }, 4, (Object) null);
        }
    }

    @JavascriptInterface
    public final void setCustomLocationAttribute(@NotNull final String attribute, @NotNull final String latitude, @NotNull final String longitude) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        Intrinsics.checkNotNullParameter(latitude, "latitude");
        Intrinsics.checkNotNullParameter(longitude, "longitude");
        final Double doubleOrNull = StringsKt.toDoubleOrNull(latitude);
        if (doubleOrNull == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: Z3.v
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String customLocationAttribute$lambda$0;
                    customLocationAttribute$lambda$0 = UserJavascriptInterfaceBase.setCustomLocationAttribute$lambda$0(latitude);
                    return customLocationAttribute$lambda$0;
                }
            }, 6, (Object) null);
            return;
        }
        final Double doubleOrNull2 = StringsKt.toDoubleOrNull(longitude);
        if (doubleOrNull2 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: Z3.w
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String customLocationAttribute$lambda$1;
                    customLocationAttribute$lambda$1 = UserJavascriptInterfaceBase.setCustomLocationAttribute$lambda$1(longitude);
                    return customLocationAttribute$lambda$1;
                }
            }, 6, (Object) null);
        } else {
            INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1() { // from class: Z3.x
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit customLocationAttribute$lambda$2;
                    customLocationAttribute$lambda$2 = UserJavascriptInterfaceBase.setCustomLocationAttribute$lambda$2(attribute, doubleOrNull, doubleOrNull2, (BrazeUser) obj);
                    return customLocationAttribute$lambda$2;
                }
            });
        }
    }

    @JavascriptInterface
    public final void setCustomUserAttributeArray(@NotNull final String key, @Nullable String jsonArrayString) {
        Intrinsics.checkNotNullParameter(key, "key");
        final String[] parseStringArrayFromJsonString = parseStringArrayFromJsonString(jsonArrayString);
        if (parseStringArrayFromJsonString == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: Z3.F
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String customUserAttributeArray$lambda$0;
                    customUserAttributeArray$lambda$0 = UserJavascriptInterfaceBase.setCustomUserAttributeArray$lambda$0(key);
                    return customUserAttributeArray$lambda$0;
                }
            }, 6, (Object) null);
        } else {
            INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1() { // from class: Z3.G
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit customUserAttributeArray$lambda$1;
                    customUserAttributeArray$lambda$1 = UserJavascriptInterfaceBase.setCustomUserAttributeArray$lambda$1(key, parseStringArrayFromJsonString, (BrazeUser) obj);
                    return customUserAttributeArray$lambda$1;
                }
            });
        }
    }

    @JavascriptInterface
    public final void setCustomUserAttributeJSON(@NotNull final String key, @NotNull final String jsonStringValue, final boolean merge) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(jsonStringValue, "jsonStringValue");
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1() { // from class: Z3.I
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit customUserAttributeJSON$lambda$0;
                customUserAttributeJSON$lambda$0 = UserJavascriptInterfaceBase.setCustomUserAttributeJSON$lambda$0(UserJavascriptInterfaceBase.this, key, jsonStringValue, merge, (BrazeUser) obj);
                return customUserAttributeJSON$lambda$0;
            }
        });
    }

    @JavascriptInterface
    public final void setDateOfBirth(@NotNull final String year, @NotNull final String month, @NotNull final String day) {
        Intrinsics.checkNotNullParameter(year, "year");
        Intrinsics.checkNotNullParameter(month, "month");
        Intrinsics.checkNotNullParameter(day, "day");
        final Integer intOrNull = StringsKt.toIntOrNull(year);
        if (intOrNull == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: Z3.Y
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String dateOfBirth$lambda$0;
                    dateOfBirth$lambda$0 = UserJavascriptInterfaceBase.setDateOfBirth$lambda$0(year);
                    return dateOfBirth$lambda$0;
                }
            }, 6, (Object) null);
            return;
        }
        final Month monthFromInt = monthFromInt(month);
        if (monthFromInt == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: Z3.Z
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String dateOfBirth$lambda$1;
                    dateOfBirth$lambda$1 = UserJavascriptInterfaceBase.setDateOfBirth$lambda$1(month);
                    return dateOfBirth$lambda$1;
                }
            }, 6, (Object) null);
            return;
        }
        final Integer intOrNull2 = StringsKt.toIntOrNull(day);
        if (intOrNull2 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: Z3.s
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String dateOfBirth$lambda$2;
                    dateOfBirth$lambda$2 = UserJavascriptInterfaceBase.setDateOfBirth$lambda$2(day);
                    return dateOfBirth$lambda$2;
                }
            }, 6, (Object) null);
        } else {
            INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1() { // from class: Z3.t
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit dateOfBirth$lambda$3;
                    dateOfBirth$lambda$3 = UserJavascriptInterfaceBase.setDateOfBirth$lambda$3(intOrNull, monthFromInt, intOrNull2, (BrazeUser) obj);
                    return dateOfBirth$lambda$3;
                }
            });
        }
    }

    @JavascriptInterface
    public final void setEmail(@Nullable final String email) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1() { // from class: Z3.U
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit email$lambda$0;
                email$lambda$0 = UserJavascriptInterfaceBase.setEmail$lambda$0(email, (BrazeUser) obj);
                return email$lambda$0;
            }
        });
    }

    @JavascriptInterface
    public final void setEmailNotificationSubscriptionType(@NotNull final String subscriptionType) {
        Intrinsics.checkNotNullParameter(subscriptionType, "subscriptionType");
        final NotificationSubscriptionType subscriptionTypeFromJavascriptString = subscriptionTypeFromJavascriptString(subscriptionType);
        if (subscriptionTypeFromJavascriptString == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: Z3.r
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String emailNotificationSubscriptionType$lambda$0;
                    emailNotificationSubscriptionType$lambda$0 = UserJavascriptInterfaceBase.setEmailNotificationSubscriptionType$lambda$0(subscriptionType);
                    return emailNotificationSubscriptionType$lambda$0;
                }
            }, 6, (Object) null);
        } else {
            INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1() { // from class: Z3.C
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit emailNotificationSubscriptionType$lambda$1;
                    emailNotificationSubscriptionType$lambda$1 = UserJavascriptInterfaceBase.setEmailNotificationSubscriptionType$lambda$1(NotificationSubscriptionType.this, (BrazeUser) obj);
                    return emailNotificationSubscriptionType$lambda$1;
                }
            });
        }
    }

    @JavascriptInterface
    public final void setFirstName(@Nullable final String firstName) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1() { // from class: Z3.L
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit firstName$lambda$0;
                firstName$lambda$0 = UserJavascriptInterfaceBase.setFirstName$lambda$0(firstName, (BrazeUser) obj);
                return firstName$lambda$0;
            }
        });
    }

    @JavascriptInterface
    public final void setGender(@NotNull final String genderString) {
        Intrinsics.checkNotNullParameter(genderString, "genderString");
        final Gender parseGender = parseGender(genderString);
        if (parseGender == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: Z3.B
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String gender$lambda$0;
                    gender$lambda$0 = UserJavascriptInterfaceBase.setGender$lambda$0(genderString);
                    return gender$lambda$0;
                }
            }, 6, (Object) null);
        } else {
            INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1() { // from class: Z3.D
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit gender$lambda$1;
                    gender$lambda$1 = UserJavascriptInterfaceBase.setGender$lambda$1(Gender.this, (BrazeUser) obj);
                    return gender$lambda$1;
                }
            });
        }
    }

    @JavascriptInterface
    public final void setHomeCity(@Nullable final String homeCity) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1() { // from class: Z3.M
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit homeCity$lambda$0;
                homeCity$lambda$0 = UserJavascriptInterfaceBase.setHomeCity$lambda$0(homeCity, (BrazeUser) obj);
                return homeCity$lambda$0;
            }
        });
    }

    @JavascriptInterface
    public final void setLanguage(@Nullable final String language) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1() { // from class: Z3.E
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit language$lambda$0;
                language$lambda$0 = UserJavascriptInterfaceBase.setLanguage$lambda$0(language, (BrazeUser) obj);
                return language$lambda$0;
            }
        });
    }

    @JavascriptInterface
    public final void setLastName(@Nullable final String lastName) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1() { // from class: Z3.X
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit lastName$lambda$0;
                lastName$lambda$0 = UserJavascriptInterfaceBase.setLastName$lambda$0(lastName, (BrazeUser) obj);
                return lastName$lambda$0;
            }
        });
    }

    @JavascriptInterface
    public final void setLineId(@Nullable final String lineId) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1() { // from class: Z3.W
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit lineId$lambda$0;
                lineId$lambda$0 = UserJavascriptInterfaceBase.setLineId$lambda$0(lineId, (BrazeUser) obj);
                return lineId$lambda$0;
            }
        });
    }

    @JavascriptInterface
    public final void setPhoneNumber(@Nullable final String phoneNumber) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1() { // from class: Z3.O
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit phoneNumber$lambda$0;
                phoneNumber$lambda$0 = UserJavascriptInterfaceBase.setPhoneNumber$lambda$0(phoneNumber, (BrazeUser) obj);
                return phoneNumber$lambda$0;
            }
        });
    }

    @JavascriptInterface
    public final void setPushNotificationSubscriptionType(@NotNull final String subscriptionType) {
        Intrinsics.checkNotNullParameter(subscriptionType, "subscriptionType");
        final NotificationSubscriptionType subscriptionTypeFromJavascriptString = subscriptionTypeFromJavascriptString(subscriptionType);
        if (subscriptionTypeFromJavascriptString == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: Z3.N
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String pushNotificationSubscriptionType$lambda$0;
                    pushNotificationSubscriptionType$lambda$0 = UserJavascriptInterfaceBase.setPushNotificationSubscriptionType$lambda$0(subscriptionType);
                    return pushNotificationSubscriptionType$lambda$0;
                }
            }, 6, (Object) null);
        } else {
            INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1() { // from class: Z3.T
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit pushNotificationSubscriptionType$lambda$1;
                    pushNotificationSubscriptionType$lambda$1 = UserJavascriptInterfaceBase.setPushNotificationSubscriptionType$lambda$1(NotificationSubscriptionType.this, (BrazeUser) obj);
                    return pushNotificationSubscriptionType$lambda$1;
                }
            });
        }
    }

    @Nullable
    public final NotificationSubscriptionType subscriptionTypeFromJavascriptString(@Nullable String subscriptionType) {
        return NotificationSubscriptionType.INSTANCE.fromValue(subscriptionType);
    }
}
