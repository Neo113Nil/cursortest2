package com.braze.support;

import bo.app.a9;
import bo.app.ka;
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

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final String f29487a = BrazeLogger.INSTANCE.getBrazeLogTag("InAppMessageModelUtils");

    public static final InAppMessageBase a(final JSONObject inAppMessageJson, a9 brazeManager) {
        InAppMessageBase inAppMessageFull;
        String upperCase;
        Intrinsics.checkNotNullParameter(inAppMessageJson, "inAppMessageJson");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        try {
            Intrinsics.checkNotNullParameter(inAppMessageJson, "inAppMessageJson");
            if (inAppMessageJson.optBoolean("is_control", false)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f29487a, BrazeLogger.Priority.f29469D, (Throwable) null, false, new Function0() { // from class: Y3.u1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return com.braze.support.i.a();
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
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f29487a, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: Y3.v1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return com.braze.support.i.a(inAppMessageJson);
                            }
                        }, 12, (Object) null);
                        return null;
                    }
                    int i10 = ka.f25663a[messageType.ordinal()];
                    if (i10 == 1) {
                        inAppMessageFull = new InAppMessageFull(inAppMessageJson, brazeManager);
                    } else if (i10 == 2) {
                        inAppMessageFull = new InAppMessageModal(inAppMessageJson, brazeManager);
                    } else if (i10 == 3) {
                        inAppMessageFull = new InAppMessageSlideup(inAppMessageJson, brazeManager);
                    } else if (i10 == 4) {
                        inAppMessageFull = new InAppMessageHtmlFull(inAppMessageJson, brazeManager);
                    } else {
                        if (i10 != 5) {
                            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f29487a, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: Y3.w1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return com.braze.support.i.b(inAppMessageJson);
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
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f29487a, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: Y3.x1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.support.i.c(inAppMessageJson);
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

    public static final InAppMessageBase a(final String inAppMessageJsonString, a9 brazeManager) {
        Intrinsics.checkNotNullParameter(inAppMessageJsonString, "inAppMessageJsonString");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        if (StringsKt.isBlank(inAppMessageJsonString)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f29487a, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: Y3.s1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.support.i.b();
                }
            }, 12, (Object) null);
            return null;
        }
        try {
            return a(new JSONObject(inAppMessageJsonString), brazeManager);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f29487a, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: Y3.t1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return com.braze.support.i.a(inAppMessageJsonString);
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
