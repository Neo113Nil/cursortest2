package com.braze.ui.inappmessage.jsinterface;

import android.content.Context;
import android.webkit.JavascriptInterface;
import androidx.autofill.HintConstants;
import com.braze.Braze;
import com.braze.BrazeUser;
import com.braze.enums.Gender;
import com.braze.enums.Month;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.events.IValueCallback;
import com.braze.models.IBrazeLocation;
import com.braze.support.BrazeLogger;
import com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import io.sentry.protocol.Device;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: InAppMessageUserJavascriptInterface.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 ?2\u00020\u0001:\u0001?B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0007J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\bH\u0007J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\bH\u0007J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\bH\u0007J!\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0002\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0007J\u0010\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\bH\u0007J\u0012\u0010\u001e\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\bH\u0007J \u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010#\u001a\u00020\bH\u0007J \u0010$\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&H\u0007J\u001a\u0010(\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\bH\u0007J\u0018\u0010)\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010#\u001a\u00020\bH\u0007J \u0010*\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u0014H\u0007J\u0012\u0010-\u001a\u00020\u00062\b\u0010.\u001a\u0004\u0018\u00010\bH\u0007J\u0010\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\bH\u0007J\u0012\u00101\u001a\u00020\u00062\b\u00102\u001a\u0004\u0018\u00010\bH\u0007J\u0010\u00103\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\bH\u0007J\u0012\u00104\u001a\u00020\u00062\b\u00105\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u00106\u001a\u00020\u00062\b\u00107\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u00108\u001a\u00020\u00062\b\u00109\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u0010:\u001a\u00020\u00062\b\u0010;\u001a\u0004\u0018\u00010\bH\u0007J\u0010\u0010<\u001a\u00020\u00062\u0006\u00100\u001a\u00020\bH\u0007J\u0014\u0010=\u001a\u0004\u0018\u00010>2\b\u00100\u001a\u0004\u0018\u00010\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/braze/ui/inappmessage/jsinterface/InAppMessageUserJavascriptInterface;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "addAlias", "", "alias", "", "label", "addToCustomAttributeArray", "key", "value", "addToSubscriptionGroup", "subscriptionGroupId", "incrementCustomUserAttribute", "attribute", "monthFromInt", "Lcom/braze/enums/Month;", "monthInt", "", "parseGender", "Lcom/braze/enums/Gender;", "genderString", "parseStringArrayFromJsonString", "", "jsonArrayString", "(Ljava/lang/String;)[Ljava/lang/String;", "removeFromCustomAttributeArray", "removeFromSubscriptionGroup", "setCountry", "country", "setCustomAttribute", "user", "Lcom/braze/BrazeUser;", "jsonStringValue", "setCustomLocationAttribute", IBrazeLocation.LATITUDE, "", IBrazeLocation.LONGITUDE, "setCustomUserAttributeArray", "setCustomUserAttributeJSON", "setDateOfBirth", "year", "day", "setEmail", "email", "setEmailNotificationSubscriptionType", "subscriptionType", "setFirstName", "firstName", "setGender", "setHomeCity", "homeCity", "setLanguage", Device.JsonKeys.LANGUAGE, "setLastName", "lastName", "setPhoneNumber", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "setPushNotificationSubscriptionType", "subscriptionTypeFromJavascriptString", "Lcom/braze/enums/NotificationSubscriptionType;", k.M, "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InAppMessageUserJavascriptInterface {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String JS_BRIDGE_ATTRIBUTE_VALUE = "value";
    private final Context context;

    public InAppMessageUserJavascriptInterface(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @JavascriptInterface
    public final void setFirstName(final String firstName) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1<BrazeUser, Unit>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setFirstName$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BrazeUser it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.setFirstName(firstName);
            }
        });
    }

    @JavascriptInterface
    public final void setLastName(final String lastName) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1<BrazeUser, Unit>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setLastName$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BrazeUser it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.setLastName(lastName);
            }
        });
    }

    @JavascriptInterface
    public final void setEmail(final String email) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1<BrazeUser, Unit>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setEmail$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BrazeUser it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.setEmail(email);
            }
        });
    }

    @JavascriptInterface
    public final void setGender(final String genderString) {
        Intrinsics.checkNotNullParameter(genderString, "genderString");
        final Gender parseGender = parseGender(genderString);
        if (parseGender == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setGender$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("Failed to parse gender in Braze HTML in-app message javascript interface with gender: ", genderString);
                }
            }, 2, (Object) null);
        } else {
            INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1<BrazeUser, Unit>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setGender$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
                    invoke2(brazeUser);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(BrazeUser it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    it.setGender(Gender.this);
                }
            });
        }
    }

    @JavascriptInterface
    public final void setDateOfBirth(final int year, final int monthInt, final int day) {
        final Month monthFromInt = monthFromInt(monthInt);
        if (monthFromInt == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setDateOfBirth$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("Failed to parse month for value ", Integer.valueOf(monthInt));
                }
            }, 2, (Object) null);
        } else {
            INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1<BrazeUser, Unit>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setDateOfBirth$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
                    invoke2(brazeUser);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(BrazeUser it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    it.setDateOfBirth(year, monthFromInt, day);
                }
            });
        }
    }

    @JavascriptInterface
    public final void setCountry(final String country) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1<BrazeUser, Unit>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setCountry$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BrazeUser it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.setCountry(country);
            }
        });
    }

    @JavascriptInterface
    public final void setLanguage(final String language) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1<BrazeUser, Unit>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setLanguage$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BrazeUser it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.setLanguage(language);
            }
        });
    }

    @JavascriptInterface
    public final void setHomeCity(final String homeCity) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1<BrazeUser, Unit>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setHomeCity$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BrazeUser it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.setHomeCity(homeCity);
            }
        });
    }

    @JavascriptInterface
    public final void setEmailNotificationSubscriptionType(final String subscriptionType) {
        Intrinsics.checkNotNullParameter(subscriptionType, "subscriptionType");
        final NotificationSubscriptionType subscriptionTypeFromJavascriptString = subscriptionTypeFromJavascriptString(subscriptionType);
        if (subscriptionTypeFromJavascriptString == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setEmailNotificationSubscriptionType$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("Failed to parse email subscription type in Braze HTML in-app message javascript interface with subscription ", subscriptionType);
                }
            }, 2, (Object) null);
        } else {
            INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1<BrazeUser, Unit>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setEmailNotificationSubscriptionType$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
                    invoke2(brazeUser);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(BrazeUser it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    it.setEmailNotificationSubscriptionType(NotificationSubscriptionType.this);
                }
            });
        }
    }

    @JavascriptInterface
    public final void setPushNotificationSubscriptionType(final String subscriptionType) {
        Intrinsics.checkNotNullParameter(subscriptionType, "subscriptionType");
        final NotificationSubscriptionType subscriptionTypeFromJavascriptString = subscriptionTypeFromJavascriptString(subscriptionType);
        if (subscriptionTypeFromJavascriptString == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setPushNotificationSubscriptionType$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("Failed to parse push subscription type in Braze HTML in-app message javascript interface with subscription: ", subscriptionType);
                }
            }, 2, (Object) null);
        } else {
            INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1<BrazeUser, Unit>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setPushNotificationSubscriptionType$2
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
                    invoke2(brazeUser);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(BrazeUser it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    it.setPushNotificationSubscriptionType(NotificationSubscriptionType.this);
                }
            });
        }
    }

    @JavascriptInterface
    public final void setPhoneNumber(final String phoneNumber) {
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1<BrazeUser, Unit>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setPhoneNumber$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BrazeUser it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.setPhoneNumber(phoneNumber);
            }
        });
    }

    @JavascriptInterface
    public final void setCustomUserAttributeJSON(final String key, final String jsonStringValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(jsonStringValue, "jsonStringValue");
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1<BrazeUser, Unit>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setCustomUserAttributeJSON$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BrazeUser it) {
                Intrinsics.checkNotNullParameter(it, "it");
                InAppMessageUserJavascriptInterface.this.setCustomAttribute(it, key, jsonStringValue);
            }
        });
    }

    @JavascriptInterface
    public final void setCustomUserAttributeArray(final String key, String jsonArrayString) {
        Intrinsics.checkNotNullParameter(key, "key");
        final String[] parseStringArrayFromJsonString = parseStringArrayFromJsonString(jsonArrayString);
        if (parseStringArrayFromJsonString == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setCustomUserAttributeArray$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("Failed to set custom attribute array for key ", key);
                }
            }, 2, (Object) null);
        } else {
            INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1<BrazeUser, Unit>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setCustomUserAttributeArray$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
                    invoke2(brazeUser);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(BrazeUser it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    it.setCustomAttributeArray(key, parseStringArrayFromJsonString);
                }
            });
        }
    }

    @JavascriptInterface
    public final void addToCustomAttributeArray(final String key, final String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1<BrazeUser, Unit>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$addToCustomAttributeArray$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BrazeUser it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.addToCustomAttributeArray(key, value);
            }
        });
    }

    @JavascriptInterface
    public final void removeFromCustomAttributeArray(final String key, final String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1<BrazeUser, Unit>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$removeFromCustomAttributeArray$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BrazeUser it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.removeFromCustomAttributeArray(key, value);
            }
        });
    }

    @JavascriptInterface
    public final void incrementCustomUserAttribute(final String attribute) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1<BrazeUser, Unit>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$incrementCustomUserAttribute$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BrazeUser it) {
                Intrinsics.checkNotNullParameter(it, "it");
                BrazeUser.incrementCustomUserAttribute$default(it, attribute, 0, 2, null);
            }
        });
    }

    @JavascriptInterface
    public final void setCustomLocationAttribute(final String attribute, final double latitude, final double longitude) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1<BrazeUser, Unit>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setCustomLocationAttribute$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BrazeUser it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.setLocationCustomAttribute(attribute, latitude, longitude);
            }
        });
    }

    @JavascriptInterface
    public final void addAlias(final String alias, final String label) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(label, "label");
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1<BrazeUser, Unit>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$addAlias$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BrazeUser it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.addAlias(alias, label);
            }
        });
    }

    @JavascriptInterface
    public final void addToSubscriptionGroup(final String subscriptionGroupId) {
        Intrinsics.checkNotNullParameter(subscriptionGroupId, "subscriptionGroupId");
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1<BrazeUser, Unit>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$addToSubscriptionGroup$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BrazeUser it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.addToSubscriptionGroup(subscriptionGroupId);
            }
        });
    }

    @JavascriptInterface
    public final void removeFromSubscriptionGroup(final String subscriptionGroupId) {
        Intrinsics.checkNotNullParameter(subscriptionGroupId, "subscriptionGroupId");
        INSTANCE.runOnUser(Braze.INSTANCE.getInstance(this.context), new Function1<BrazeUser, Unit>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$removeFromSubscriptionGroup$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BrazeUser brazeUser) {
                invoke2(brazeUser);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(BrazeUser it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.removeFromSubscriptionGroup(subscriptionGroupId);
            }
        });
    }

    public final Month monthFromInt(int monthInt) {
        if (monthInt < 1 || monthInt > 12) {
            return null;
        }
        return Month.INSTANCE.getMonth(monthInt - 1);
    }

    public final NotificationSubscriptionType subscriptionTypeFromJavascriptString(String subscriptionType) {
        return NotificationSubscriptionType.INSTANCE.fromValue(subscriptionType);
    }

    public final void setCustomAttribute(BrazeUser user, final String key, final String jsonStringValue) {
        Exception exc;
        Object obj;
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(jsonStringValue, "jsonStringValue");
        try {
            obj = new JSONObject(jsonStringValue).get("value");
        } catch (Exception e) {
            e = e;
        }
        try {
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
                return;
            }
            try {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setCustomAttribute$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Failed to parse custom attribute type for key: " + key + " and json string value: " + jsonStringValue;
                    }
                }, 2, (Object) null);
            } catch (Exception e2) {
                e = e2;
                exc = e;
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, exc, new Function0<String>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setCustomAttribute$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Failed to parse custom attribute type for key: " + key + " and json string value: " + jsonStringValue;
                    }
                });
            }
        } catch (Exception e3) {
            exc = e3;
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, exc, new Function0<String>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$setCustomAttribute$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Failed to parse custom attribute type for key: " + key + " and json string value: " + jsonStringValue;
                }
            });
        }
    }

    public final String[] parseStringArrayFromJsonString(String jsonArrayString) {
        try {
            JSONArray jSONArray = new JSONArray(jsonArrayString);
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(jSONArray.getString(i));
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, new Function0<String>() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$parseStringArrayFromJsonString$2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Failed to parse custom attribute array";
                }
            });
            return null;
        }
    }

    public final Gender parseGender(String genderString) {
        Intrinsics.checkNotNullParameter(genderString, "genderString");
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = genderString.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (Intrinsics.areEqual(lowerCase, Gender.MALE.getKey())) {
            return Gender.MALE;
        }
        if (Intrinsics.areEqual(lowerCase, Gender.FEMALE.getKey())) {
            return Gender.FEMALE;
        }
        if (Intrinsics.areEqual(lowerCase, Gender.OTHER.getKey())) {
            return Gender.OTHER;
        }
        if (Intrinsics.areEqual(lowerCase, Gender.UNKNOWN.getKey())) {
            return Gender.UNKNOWN;
        }
        if (Intrinsics.areEqual(lowerCase, Gender.NOT_APPLICABLE.getKey())) {
            return Gender.NOT_APPLICABLE;
        }
        if (Intrinsics.areEqual(lowerCase, Gender.PREFER_NOT_TO_SAY.getKey())) {
            return Gender.PREFER_NOT_TO_SAY;
        }
        return null;
    }

    /* compiled from: InAppMessageUserJavascriptInterface.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u0005\u001a\u00020\u0006*\u00020\u00072!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00060\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/braze/ui/inappmessage/jsinterface/InAppMessageUserJavascriptInterface$Companion;", "", "()V", "JS_BRIDGE_ATTRIBUTE_VALUE", "", "runOnUser", "", "Lcom/braze/Braze;", "block", "Lkotlin/Function1;", "Lcom/braze/BrazeUser;", "Lkotlin/ParameterName;", "name", "user", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void runOnUser(Braze braze, final Function1<? super BrazeUser, Unit> function1) {
            braze.getCurrentUser(new IValueCallback() { // from class: com.braze.ui.inappmessage.jsinterface.InAppMessageUserJavascriptInterface$Companion$$ExternalSyntheticLambda0
                @Override // com.braze.events.IValueCallback
                public final void onSuccess(Object obj) {
                    InAppMessageUserJavascriptInterface.Companion.m5226runOnUser$lambda0(Function1.this, (BrazeUser) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: runOnUser$lambda-0, reason: not valid java name */
        public static final void m5226runOnUser$lambda0(Function1 block, BrazeUser it) {
            Intrinsics.checkNotNullParameter(block, "$block");
            Intrinsics.checkNotNullParameter(it, "it");
            block.invoke(it);
        }
    }
}
