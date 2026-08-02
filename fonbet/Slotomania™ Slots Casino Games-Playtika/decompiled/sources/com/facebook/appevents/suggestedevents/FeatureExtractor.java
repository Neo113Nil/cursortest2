package com.facebook.appevents.suggestedevents;

import android.util.Patterns;
import androidx.autofill.HintConstants;
import androidx.exifinterface.media.ExifInterface;
import com.braze.Constants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.ironsource.Fc;
import com.ironsource.X3;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import io.ktor.sse.ServerSentEventKt;
import io.sentry.protocol.Device;
import io.sentry.protocol.MetricSummary;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FeatureExtractor.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0006H\u0007J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0019\u001a\u00020\u0012H\u0002J \u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0007J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0007J\u0010\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u0012H\u0002J\b\u0010#\u001a\u00020\u000fH\u0007J)\u0010$\u001a\u00020\u000f2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060&H\u0002¢\u0006\u0002\u0010(J0\u0010)\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0002J\u0010\u0010.\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u0012H\u0002J\u0018\u0010/\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010*\u001a\u00020+H\u0002J\u0018\u00100\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0006H\u0002J(\u00100\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0006H\u0002J\u0018\u00106\u001a\u00020\u001e2\u0006\u00107\u001a\u00020\u00152\u0006\u00108\u001a\u00020\u0015H\u0002J(\u00109\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00122\n\u0010:\u001a\u00060;j\u0002`<2\n\u0010=\u001a\u00060;j\u0002`<H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\rX\u0082.¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/facebook/appevents/suggestedevents/FeatureExtractor;", "", "()V", "NUM_OF_FEATURES", "", "REGEX_ADD_TO_CART_BUTTON_TEXT", "", "REGEX_ADD_TO_CART_PAGE_TITLE", "REGEX_CR_HAS_CONFIRM_PASSWORD_FIELD", "REGEX_CR_HAS_LOG_IN_KEYWORDS", "REGEX_CR_HAS_SIGN_ON_KEYWORDS", "REGEX_CR_PASSWORD_FIELD", "eventInfo", "", "initialized", "", "languageInfo", "rules", "Lorg/json/JSONObject;", "textTypeInfo", "getDenseFeatures", "", "viewHierarchy", "appName", "getInteractedNode", ViewHierarchyConstants.VIEW_KEY, "getTextFeature", "buttonText", "activityName", MobileAdsBridgeBase.initializeMethodName, "", "file", "Ljava/io/File;", "isButton", "node", "isInitialized", "matchIndicators", "indicators", "", "values", "([Ljava/lang/String;[Ljava/lang/String;)Z", "nonparseFeatures", "siblings", "Lorg/json/JSONArray;", "screenName", "formFieldsJSON", "parseFeatures", "pruneTree", "regexMatched", "pattern", "matchText", Device.JsonKeys.LANGUAGE, "event", "textType", MetricSummary.JsonKeys.SUM, Constants.BRAZE_PUSH_CONTENT_KEY, "b", "updateHintAndTextRecursively", "textSB", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "hintSB", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class FeatureExtractor {
    public static final FeatureExtractor INSTANCE = new FeatureExtractor();
    private static final int NUM_OF_FEATURES = 30;
    private static final String REGEX_ADD_TO_CART_BUTTON_TEXT = "(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart";
    private static final String REGEX_ADD_TO_CART_PAGE_TITLE = "(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy";
    private static final String REGEX_CR_HAS_CONFIRM_PASSWORD_FIELD = "(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)";
    private static final String REGEX_CR_HAS_LOG_IN_KEYWORDS = "(?i)(sign in)|login|signIn";
    private static final String REGEX_CR_HAS_SIGN_ON_KEYWORDS = "(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)";
    private static final String REGEX_CR_PASSWORD_FIELD = "password";
    private static Map<String, String> eventInfo;
    private static boolean initialized;
    private static Map<String, String> languageInfo;
    private static JSONObject rules;
    private static Map<String, String> textTypeInfo;

    private FeatureExtractor() {
    }

    @JvmStatic
    public static final boolean isInitialized() {
        if (CrashShieldHandler.isObjectCrashing(FeatureExtractor.class)) {
            return false;
        }
        try {
            return initialized;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, FeatureExtractor.class);
            return false;
        }
    }

    @JvmStatic
    public static final void initialize(File file) {
        if (CrashShieldHandler.isObjectCrashing(FeatureExtractor.class)) {
            return;
        }
        try {
            try {
                rules = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                rules = new JSONObject(new String(bArr, Charsets.UTF_8));
                languageInfo = MapsKt.mapOf(TuplesKt.to(ViewHierarchyConstants.ENGLISH, "1"), TuplesKt.to(ViewHierarchyConstants.GERMAN, "2"), TuplesKt.to(ViewHierarchyConstants.SPANISH, ExifInterface.GPS_MEASUREMENT_3D), TuplesKt.to(ViewHierarchyConstants.JAPANESE, "4"));
                eventInfo = MapsKt.mapOf(TuplesKt.to(ViewHierarchyConstants.VIEW_CONTENT, "0"), TuplesKt.to(ViewHierarchyConstants.SEARCH, "1"), TuplesKt.to(ViewHierarchyConstants.ADD_TO_CART, "2"), TuplesKt.to(ViewHierarchyConstants.ADD_TO_WISHLIST, ExifInterface.GPS_MEASUREMENT_3D), TuplesKt.to(ViewHierarchyConstants.INITIATE_CHECKOUT, "4"), TuplesKt.to(ViewHierarchyConstants.ADD_PAYMENT_INFO, "5"), TuplesKt.to(ViewHierarchyConstants.PURCHASE, "6"), TuplesKt.to(ViewHierarchyConstants.LEAD, Fc.e), TuplesKt.to(ViewHierarchyConstants.COMPLETE_REGISTRATION, "8"));
                textTypeInfo = MapsKt.mapOf(TuplesKt.to(ViewHierarchyConstants.BUTTON_TEXT, "1"), TuplesKt.to(ViewHierarchyConstants.PAGE_TITLE, "2"), TuplesKt.to(ViewHierarchyConstants.RESOLVED_DOCUMENT_LINK, ExifInterface.GPS_MEASUREMENT_3D), TuplesKt.to(ViewHierarchyConstants.BUTTON_ID, "4"));
                initialized = true;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, FeatureExtractor.class);
            }
        } catch (Exception unused) {
        }
    }

    @JvmStatic
    public static final String getTextFeature(String buttonText, String activityName, String appName) {
        if (CrashShieldHandler.isObjectCrashing(FeatureExtractor.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(buttonText, "buttonText");
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            Intrinsics.checkNotNullParameter(appName, "appName");
            String str = appName + " | " + activityName + ", " + buttonText;
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = str.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            return lowerCase;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, FeatureExtractor.class);
            return null;
        }
    }

    @JvmStatic
    public static final float[] getDenseFeatures(JSONObject viewHierarchy, String appName) {
        String lowerCase;
        JSONObject jSONObject;
        String screenName;
        JSONArray jSONArray;
        FeatureExtractor featureExtractor;
        JSONObject interactedNode;
        if (CrashShieldHandler.isObjectCrashing(FeatureExtractor.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(viewHierarchy, "viewHierarchy");
            Intrinsics.checkNotNullParameter(appName, "appName");
            if (!initialized) {
                return null;
            }
            float[] fArr = new float[30];
            for (int i = 0; i < 30; i++) {
                fArr[i] = 0.0f;
            }
            try {
                lowerCase = appName.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                jSONObject = new JSONObject(viewHierarchy.optJSONObject(ViewHierarchyConstants.VIEW_KEY).toString());
                screenName = viewHierarchy.optString(ViewHierarchyConstants.SCREEN_NAME_KEY);
                jSONArray = new JSONArray();
                featureExtractor = INSTANCE;
                featureExtractor.pruneTree(jSONObject, jSONArray);
                featureExtractor.sum(fArr, featureExtractor.parseFeatures(jSONObject));
                interactedNode = featureExtractor.getInteractedNode(jSONObject);
            } catch (JSONException unused) {
            }
            if (interactedNode == null) {
                return null;
            }
            Intrinsics.checkNotNullExpressionValue(screenName, "screenName");
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "viewTree.toString()");
            featureExtractor.sum(fArr, featureExtractor.nonparseFeatures(interactedNode, jSONArray, screenName, jSONObject2, lowerCase));
            return fArr;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, FeatureExtractor.class);
            return null;
        }
    }

    private final float[] parseFeatures(JSONObject node) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            int i = 0;
            for (int i2 = 0; i2 < 30; i2++) {
                fArr[i2] = 0.0f;
            }
            String optString = node.optString("text");
            Intrinsics.checkNotNullExpressionValue(optString, "node.optString(TEXT_KEY)");
            String lowerCase = optString.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            String optString2 = node.optString(ViewHierarchyConstants.HINT_KEY);
            Intrinsics.checkNotNullExpressionValue(optString2, "node.optString(HINT_KEY)");
            String lowerCase2 = optString2.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase()");
            String optString3 = node.optString(ViewHierarchyConstants.CLASS_NAME_KEY);
            Intrinsics.checkNotNullExpressionValue(optString3, "node.optString(CLASS_NAME_KEY)");
            String lowerCase3 = optString3.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "(this as java.lang.String).toLowerCase()");
            int optInt = node.optInt(ViewHierarchyConstants.INPUT_TYPE_KEY, -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (matchIndicators(new String[]{"$", "amount", "price", X3.i.l}, strArr)) {
                fArr[0] = fArr[0] + 1.0f;
            }
            if (matchIndicators(new String[]{"password", "pwd"}, strArr)) {
                fArr[1] = fArr[1] + 1.0f;
            }
            if (matchIndicators(new String[]{"tel", HintConstants.AUTOFILL_HINT_PHONE}, strArr)) {
                fArr[2] = fArr[2] + 1.0f;
            }
            if (matchIndicators(new String[]{"search"}, strArr)) {
                fArr[4] = fArr[4] + 1.0f;
            }
            if (optInt >= 0) {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (optInt == 3 || optInt == 2) {
                fArr[6] = fArr[6] + 1.0f;
            }
            if (optInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = fArr[7] + 1.0f;
            }
            if (StringsKt.contains$default((CharSequence) lowerCase3, (CharSequence) "checkbox", false, 2, (Object) null)) {
                fArr[8] = fArr[8] + 1.0f;
            }
            if (matchIndicators(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = fArr[10] + 1.0f;
            }
            if (StringsKt.contains$default((CharSequence) lowerCase3, (CharSequence) "radio", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) lowerCase3, (CharSequence) "button", false, 2, (Object) null)) {
                fArr[12] = fArr[12] + 1.0f;
            }
            try {
                JSONArray optJSONArray = node.optJSONArray(ViewHierarchyConstants.CHILDREN_VIEW_KEY);
                int length = optJSONArray.length();
                if (length > 0) {
                    while (true) {
                        int i3 = i + 1;
                        JSONObject jSONObject = optJSONArray.getJSONObject(i);
                        Intrinsics.checkNotNullExpressionValue(jSONObject, "childViews.getJSONObject(i)");
                        sum(fArr, parseFeatures(jSONObject));
                        if (i3 >= length) {
                            break;
                        }
                        i = i3;
                    }
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final float[] nonparseFeatures(JSONObject node, JSONArray siblings, String screenName, String formFieldsJSON, String appName) {
        float f;
        int length;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i = 0; i < 30; i++) {
                fArr[i] = 0.0f;
            }
            int length2 = siblings.length();
            float f2 = 1.0f;
            fArr[3] = length2 > 1 ? length2 - 1.0f : 0.0f;
            try {
                length = siblings.length();
            } catch (JSONException unused) {
            }
            if (length > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    JSONObject jSONObject = siblings.getJSONObject(i2);
                    f = f2;
                    try {
                        Intrinsics.checkNotNullExpressionValue(jSONObject, "siblings.getJSONObject(i)");
                        if (isButton(jSONObject)) {
                            fArr[9] = fArr[9] + f;
                        }
                        if (i3 >= length) {
                            break;
                        }
                        i2 = i3;
                        f2 = f;
                    } catch (JSONException unused2) {
                    }
                }
                fArr[13] = -1.0f;
                fArr[14] = -1.0f;
                String str = screenName + '|' + appName;
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                updateHintAndTextRecursively(node, sb2, sb);
                String sb3 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb3, "hintSB.toString()");
                String sb4 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(sb4, "textSB.toString()");
                fArr[15] = !regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.COMPLETE_REGISTRATION, ViewHierarchyConstants.BUTTON_TEXT, sb4) ? f : 0.0f;
                fArr[16] = !regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.COMPLETE_REGISTRATION, ViewHierarchyConstants.PAGE_TITLE, str) ? f : 0.0f;
                fArr[17] = !regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.COMPLETE_REGISTRATION, ViewHierarchyConstants.BUTTON_ID, sb3) ? f : 0.0f;
                fArr[18] = !StringsKt.contains$default((CharSequence) formFieldsJSON, (CharSequence) "password", false, 2, (Object) null) ? f : 0.0f;
                fArr[19] = !regexMatched(REGEX_CR_HAS_CONFIRM_PASSWORD_FIELD, formFieldsJSON) ? f : 0.0f;
                fArr[20] = !regexMatched(REGEX_CR_HAS_LOG_IN_KEYWORDS, formFieldsJSON) ? f : 0.0f;
                fArr[21] = !regexMatched(REGEX_CR_HAS_SIGN_ON_KEYWORDS, formFieldsJSON) ? f : 0.0f;
                fArr[22] = !regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.PURCHASE, ViewHierarchyConstants.BUTTON_TEXT, sb4) ? f : 0.0f;
                fArr[24] = !regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.PURCHASE, ViewHierarchyConstants.PAGE_TITLE, str) ? f : 0.0f;
                fArr[25] = !regexMatched(REGEX_ADD_TO_CART_BUTTON_TEXT, sb4) ? f : 0.0f;
                fArr[27] = !regexMatched(REGEX_ADD_TO_CART_PAGE_TITLE, str) ? f : 0.0f;
                fArr[28] = !regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.LEAD, ViewHierarchyConstants.BUTTON_TEXT, sb4) ? f : 0.0f;
                fArr[29] = !regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.LEAD, ViewHierarchyConstants.PAGE_TITLE, str) ? f : 0.0f;
                return fArr;
            }
            f = f2;
            fArr[13] = -1.0f;
            fArr[14] = -1.0f;
            String str2 = screenName + '|' + appName;
            StringBuilder sb5 = new StringBuilder();
            StringBuilder sb22 = new StringBuilder();
            updateHintAndTextRecursively(node, sb22, sb5);
            String sb32 = sb5.toString();
            Intrinsics.checkNotNullExpressionValue(sb32, "hintSB.toString()");
            String sb42 = sb22.toString();
            Intrinsics.checkNotNullExpressionValue(sb42, "textSB.toString()");
            fArr[15] = !regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.COMPLETE_REGISTRATION, ViewHierarchyConstants.BUTTON_TEXT, sb42) ? f : 0.0f;
            fArr[16] = !regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.COMPLETE_REGISTRATION, ViewHierarchyConstants.PAGE_TITLE, str2) ? f : 0.0f;
            fArr[17] = !regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.COMPLETE_REGISTRATION, ViewHierarchyConstants.BUTTON_ID, sb32) ? f : 0.0f;
            fArr[18] = !StringsKt.contains$default((CharSequence) formFieldsJSON, (CharSequence) "password", false, 2, (Object) null) ? f : 0.0f;
            fArr[19] = !regexMatched(REGEX_CR_HAS_CONFIRM_PASSWORD_FIELD, formFieldsJSON) ? f : 0.0f;
            fArr[20] = !regexMatched(REGEX_CR_HAS_LOG_IN_KEYWORDS, formFieldsJSON) ? f : 0.0f;
            fArr[21] = !regexMatched(REGEX_CR_HAS_SIGN_ON_KEYWORDS, formFieldsJSON) ? f : 0.0f;
            fArr[22] = !regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.PURCHASE, ViewHierarchyConstants.BUTTON_TEXT, sb42) ? f : 0.0f;
            fArr[24] = !regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.PURCHASE, ViewHierarchyConstants.PAGE_TITLE, str2) ? f : 0.0f;
            fArr[25] = !regexMatched(REGEX_ADD_TO_CART_BUTTON_TEXT, sb42) ? f : 0.0f;
            fArr[27] = !regexMatched(REGEX_ADD_TO_CART_PAGE_TITLE, str2) ? f : 0.0f;
            fArr[28] = !regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.LEAD, ViewHierarchyConstants.BUTTON_TEXT, sb42) ? f : 0.0f;
            fArr[29] = !regexMatched(ViewHierarchyConstants.ENGLISH, ViewHierarchyConstants.LEAD, ViewHierarchyConstants.PAGE_TITLE, str2) ? f : 0.0f;
            return fArr;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:6:0x0008, B:8:0x000d, B:17:0x0060, B:19:0x0045, B:22:0x004f, B:24:0x0053, B:25:0x0065, B:26:0x006b, B:27:0x002a, B:30:0x0034, B:32:0x0038, B:33:0x006c, B:34:0x0071, B:35:0x0018, B:37:0x001c, B:38:0x0072, B:39:0x0077, B:40:0x0078, B:41:0x007e), top: B:5:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:6:0x0008, B:8:0x000d, B:17:0x0060, B:19:0x0045, B:22:0x004f, B:24:0x0053, B:25:0x0065, B:26:0x006b, B:27:0x002a, B:30:0x0034, B:32:0x0038, B:33:0x006c, B:34:0x0071, B:35:0x0018, B:37:0x001c, B:38:0x0072, B:39:0x0077, B:40:0x0078, B:41:0x007e), top: B:5:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:6:0x0008, B:8:0x000d, B:17:0x0060, B:19:0x0045, B:22:0x004f, B:24:0x0053, B:25:0x0065, B:26:0x006b, B:27:0x002a, B:30:0x0034, B:32:0x0038, B:33:0x006c, B:34:0x0071, B:35:0x0018, B:37:0x001c, B:38:0x0072, B:39:0x0077, B:40:0x0078, B:41:0x007e), top: B:5:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean regexMatched(String language, String event, String textType, String matchText) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONObject optJSONObject4;
        Map<String, String> map;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            JSONObject jSONObject = rules;
            String str = null;
            if (jSONObject == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rules");
                throw null;
            }
            JSONObject optJSONObject5 = jSONObject.optJSONObject("rulesForLanguage");
            if (optJSONObject5 == null) {
                optJSONObject = null;
            } else {
                Map<String, String> map2 = languageInfo;
                if (map2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("languageInfo");
                    throw null;
                }
                optJSONObject = optJSONObject5.optJSONObject(map2.get(language));
            }
            if (optJSONObject != null && (optJSONObject2 = optJSONObject.optJSONObject("rulesForEvent")) != null) {
                Map<String, String> map3 = eventInfo;
                if (map3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventInfo");
                    throw null;
                }
                optJSONObject3 = optJSONObject2.optJSONObject(map3.get(event));
                if (optJSONObject3 != null && (optJSONObject4 = optJSONObject3.optJSONObject("positiveRules")) != null) {
                    map = textTypeInfo;
                    if (map != null) {
                        Intrinsics.throwUninitializedPropertyAccessException("textTypeInfo");
                        throw null;
                    }
                    str = optJSONObject4.optString(map.get(textType));
                }
                if (str != null) {
                    return false;
                }
                return regexMatched(str, matchText);
            }
            optJSONObject3 = null;
            if (optJSONObject3 != null) {
                map = textTypeInfo;
                if (map != null) {
                }
            }
            if (str != null) {
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean regexMatched(String pattern, String matchText) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            return Pattern.compile(pattern).matcher(matchText).find();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean matchIndicators(String[] indicators, String[] values) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            int length = indicators.length;
            int i = 0;
            while (i < length) {
                String str = indicators[i];
                i++;
                int length2 = values.length;
                int i2 = 0;
                while (i2 < length2) {
                    String str2 = values[i2];
                    i2++;
                    if (StringsKt.contains$default((CharSequence) str2, (CharSequence) str, false, 2, (Object) null)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean pruneTree(JSONObject node, JSONArray siblings) {
        boolean z;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            if (node.optBoolean(ViewHierarchyConstants.IS_INTERACTED_KEY)) {
                return true;
            }
            JSONArray optJSONArray = node.optJSONArray(ViewHierarchyConstants.CHILDREN_VIEW_KEY);
            int length = optJSONArray.length();
            if (length > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    if (optJSONArray.getJSONObject(i).optBoolean(ViewHierarchyConstants.IS_INTERACTED_KEY)) {
                        z = true;
                        break;
                    }
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
            z = false;
            boolean z2 = z;
            JSONArray jSONArray = new JSONArray();
            if (z) {
                int length2 = optJSONArray.length();
                if (length2 > 0) {
                    int i3 = 0;
                    while (true) {
                        int i4 = i3 + 1;
                        siblings.put(optJSONArray.getJSONObject(i3));
                        if (i4 >= length2) {
                            break;
                        }
                        i3 = i4;
                    }
                }
                return z2;
            }
            int length3 = optJSONArray.length();
            if (length3 > 0) {
                int i5 = 0;
                while (true) {
                    int i6 = i5 + 1;
                    JSONObject child = optJSONArray.getJSONObject(i5);
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    if (pruneTree(child, siblings)) {
                        jSONArray.put(child);
                        z2 = true;
                    }
                    if (i6 >= length3) {
                        break;
                    }
                    i5 = i6;
                }
            }
            node.put(ViewHierarchyConstants.CHILDREN_VIEW_KEY, jSONArray);
            return z2;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final void sum(float[] a, float[] b) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            int length = a.length - 1;
            if (length < 0) {
                return;
            }
            int i = 0;
            while (true) {
                int i2 = i + 1;
                a[i] = a[i] + b[i];
                if (i2 > length) {
                    return;
                } else {
                    i = i2;
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final boolean isButton(JSONObject node) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            return ((node.optInt(ViewHierarchyConstants.CLASS_TYPE_BITMASK_KEY) & 1) << 5) > 0;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final void updateHintAndTextRecursively(JSONObject view, StringBuilder textSB, StringBuilder hintSB) {
        int length;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            String optString = view.optString("text", "");
            Intrinsics.checkNotNullExpressionValue(optString, "view.optString(TEXT_KEY, \"\")");
            String lowerCase = optString.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            String optString2 = view.optString(ViewHierarchyConstants.HINT_KEY, "");
            Intrinsics.checkNotNullExpressionValue(optString2, "view.optString(HINT_KEY, \"\")");
            String lowerCase2 = optString2.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase()");
            if (lowerCase.length() > 0) {
                textSB.append(lowerCase).append(ServerSentEventKt.SPACE);
            }
            if (lowerCase2.length() > 0) {
                hintSB.append(lowerCase2).append(ServerSentEventKt.SPACE);
            }
            JSONArray optJSONArray = view.optJSONArray(ViewHierarchyConstants.CHILDREN_VIEW_KEY);
            if (optJSONArray == null || (length = optJSONArray.length()) <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                int i2 = i + 1;
                try {
                    JSONObject currentChildView = optJSONArray.getJSONObject(i);
                    Intrinsics.checkNotNullExpressionValue(currentChildView, "currentChildView");
                    updateHintAndTextRecursively(currentChildView, textSB, hintSB);
                } catch (JSONException unused) {
                }
                if (i2 >= length) {
                    return;
                } else {
                    i = i2;
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final JSONObject getInteractedNode(JSONObject view) {
        int length;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
        } catch (JSONException unused) {
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
        if (view.optBoolean(ViewHierarchyConstants.IS_INTERACTED_KEY)) {
            return view;
        }
        JSONArray optJSONArray = view.optJSONArray(ViewHierarchyConstants.CHILDREN_VIEW_KEY);
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                JSONObject jSONObject = optJSONArray.getJSONObject(i);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "children.getJSONObject(i)");
                JSONObject interactedNode = getInteractedNode(jSONObject);
                if (interactedNode != null) {
                    return interactedNode;
                }
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return null;
    }
}
