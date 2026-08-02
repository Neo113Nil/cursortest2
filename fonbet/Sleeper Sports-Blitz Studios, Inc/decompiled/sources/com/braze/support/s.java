package com.braze.support;

import com.braze.enums.inappmessage.MessageType;
import com.braze.models.inappmessage.InAppMessageBase;
import com.braze.models.inappmessage.InAppMessageControl;
import com.braze.models.inappmessage.InAppMessageFull;
import com.braze.models.inappmessage.InAppMessageHtml;
import com.braze.models.inappmessage.InAppMessageHtmlFull;
import com.braze.models.inappmessage.InAppMessageModal;
import com.braze.models.inappmessage.InAppMessageSlideup;
import com.braze.support.BrazeLogger;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final String f791a = BrazeLogger.INSTANCE.getBrazeLogTag("InAppMessageModelUtils");

    public static final InAppMessageBase a(final JSONObject inAppMessageJson, com.braze.managers.r brazeManager) {
        InAppMessageBase inAppMessageFull;
        String upperCase;
        Intrinsics.checkNotNullParameter(inAppMessageJson, "inAppMessageJson");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        try {
            Intrinsics.checkNotNullParameter(inAppMessageJson, "inAppMessageJson");
            if (inAppMessageJson.optBoolean("is_control", false)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f791a, BrazeLogger.Priority.D, (Throwable) null, false, new Function0() { // from class: com.braze.support.s$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return s.a();
                    }
                }, 12, (Object) null);
                return new InAppMessageControl(inAppMessageJson, brazeManager);
            }
            try {
                String string = inAppMessageJson.getString("type");
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                upperCase = string.toUpperCase(US);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            } catch (Exception unused) {
                r5 = null;
            }
            for (MessageType messageType : MessageType.values()) {
                if (Intrinsics.areEqual(messageType.name(), upperCase)) {
                    if (messageType == null) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f791a, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.support.s$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return s.a(inAppMessageJson);
                            }
                        }, 12, (Object) null);
                        return null;
                    }
                    int i = r.f790a[messageType.ordinal()];
                    if (i == 1) {
                        inAppMessageFull = new InAppMessageFull(inAppMessageJson, brazeManager);
                    } else if (i == 2) {
                        inAppMessageFull = new InAppMessageModal(inAppMessageJson, brazeManager);
                    } else if (i == 3) {
                        inAppMessageFull = new InAppMessageSlideup(inAppMessageJson, brazeManager);
                    } else if (i == 4) {
                        inAppMessageFull = new InAppMessageHtmlFull(inAppMessageJson, brazeManager);
                    } else {
                        if (i != 5) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f791a, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.support.s$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return s.b(inAppMessageJson);
                                }
                            }, 12, (Object) null);
                            return null;
                        }
                        inAppMessageFull = new InAppMessageHtml(inAppMessageJson, brazeManager);
                    }
                    return inAppMessageFull;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f791a, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.support.s$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return s.c(inAppMessageJson);
                }
            }, 8, (Object) null);
            return null;
        }
    }

    public static final String b() {
        return "In-app message string was blank.";
    }

    public static final String c(JSONObject jSONObject) {
        return "Failed to deserialize the in-app message: " + JsonUtils.getPrettyPrintedString(jSONObject) + ". Returning null.";
    }

    public static final String b(JSONObject jSONObject) {
        return "Unknown in-app message type. Returning null: " + JsonUtils.getPrettyPrintedString(jSONObject);
    }

    public static final InAppMessageBase a(final String inAppMessageJsonString, com.braze.managers.r brazeManager) {
        Intrinsics.checkNotNullParameter(inAppMessageJsonString, "inAppMessageJsonString");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        if (StringsKt.isBlank(inAppMessageJsonString)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f791a, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.support.s$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return s.b();
                }
            }, 12, (Object) null);
            return null;
        }
        try {
            return a(new JSONObject(inAppMessageJsonString), brazeManager);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f791a, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.support.s$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return s.a(inAppMessageJsonString);
                }
            }, 8, (Object) null);
            return null;
        }
    }

    public static final String a(String str) {
        return "Failed to deserialize the in-app message string: " + str;
    }

    public static final String a() {
        return "Deserializing control in-app message.";
    }

    public static final String a(JSONObject jSONObject) {
        return "In-app message type was unknown for in-app message: " + JsonUtils.getPrettyPrintedString(jSONObject);
    }
}
