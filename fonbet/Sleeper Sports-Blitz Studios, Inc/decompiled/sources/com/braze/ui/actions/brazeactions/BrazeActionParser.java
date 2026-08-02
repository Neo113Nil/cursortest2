package com.braze.ui.actions.brazeactions;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.appsflyer.AppsFlyerProperties;
import com.braze.enums.Channel;
import com.braze.support.BrazeLogger;
import com.braze.support.JsonUtils;
import com.braze.ui.actions.brazeactions.BrazeActionParser;
import com.braze.ui.actions.brazeactions.steps.AddToCustomAttributeArrayStep;
import com.braze.ui.actions.brazeactions.steps.AddToSubscriptionGroupStep;
import com.braze.ui.actions.brazeactions.steps.ContainerStep;
import com.braze.ui.actions.brazeactions.steps.IBrazeActionStep;
import com.braze.ui.actions.brazeactions.steps.LogCustomEventStep;
import com.braze.ui.actions.brazeactions.steps.NoOpStep;
import com.braze.ui.actions.brazeactions.steps.OpenLinkExternallyStep;
import com.braze.ui.actions.brazeactions.steps.OpenLinkInWebViewStep;
import com.braze.ui.actions.brazeactions.steps.RemoveFromCustomAttributeArrayStep;
import com.braze.ui.actions.brazeactions.steps.RemoveFromSubscriptionGroupStep;
import com.braze.ui.actions.brazeactions.steps.RequestPushPermissionStep;
import com.braze.ui.actions.brazeactions.steps.SetCustomUserAttributeStep;
import com.braze.ui.actions.brazeactions.steps.SetEmailSubscriptionStep;
import com.braze.ui.actions.brazeactions.steps.SetPushNotificationSubscriptionStep;
import com.braze.ui.actions.brazeactions.steps.StepData;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.json.JSONObject;

/* compiled from: BrazeActionParser.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001 B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\b\u001a\u00020\t*\u0004\u0018\u00010\nJ \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u0011J\u001d\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0015J\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u0019J\u001f\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001b*\u00020\nH\u0000¢\u0006\u0002\b\u001cJ\u0015\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/braze/ui/actions/brazeactions/BrazeActionParser;", "", "<init>", "()V", "BRAZE_ACTIONS_V1", "", CredentialProviderBaseController.TYPE_TAG, "BRAZE_ACTIONS_SCHEME", "isBrazeActionUri", "", "Landroid/net/Uri;", "execute", "", "context", "Landroid/content/Context;", "uri", AppsFlyerProperties.CHANNEL, "Lcom/braze/enums/Channel;", "parse", "data", "Lcom/braze/ui/actions/brazeactions/steps/StepData;", "parse$android_sdk_ui_release", "parseEncodedActionToJson", "Lorg/json/JSONObject;", "action", "parseEncodedActionToJson$android_sdk_ui_release", "getBrazeActionVersionAndJson", "Lkotlin/Pair;", "getBrazeActionVersionAndJson$android_sdk_ui_release", "getActionType", "Lcom/braze/ui/actions/brazeactions/BrazeActionParser$ActionType;", "getActionType$android_sdk_ui_release", "ActionType", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BrazeActionParser {
    public static final String BRAZE_ACTIONS_SCHEME = "brazeActions";
    private static final String BRAZE_ACTIONS_V1 = "v1";
    public static final BrazeActionParser INSTANCE = new BrazeActionParser();
    public static final String TYPE = "type";

    private BrazeActionParser() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BrazeActionParser.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0080\u0081\u0002\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0019B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u001a"}, d2 = {"Lcom/braze/ui/actions/brazeactions/BrazeActionParser$ActionType;", "", SDKConstants.PARAM_KEY, "", "impl", "Lcom/braze/ui/actions/brazeactions/steps/IBrazeActionStep;", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lcom/braze/ui/actions/brazeactions/steps/IBrazeActionStep;)V", "getKey", "()Ljava/lang/String;", "getImpl", "()Lcom/braze/ui/actions/brazeactions/steps/IBrazeActionStep;", "CONTAINER", "LOG_CUSTOM_EVENT", "SET_CUSTOM_ATTRIBUTE", "REQUEST_PUSH_PERMISSION", "ADD_TO_SUBSCRIPTION_GROUP", "REMOVE_FROM_SUBSCRIPTION_GROUP", "ADD_TO_CUSTOM_ATTRIBUTE_ARRAY", "REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY", "SET_EMAIL_SUBSCRIPTION", "SET_PUSH_NOTIFICATION_SUBSCRIPTION", "OPEN_LINK_IN_WEBVIEW", "OPEN_LINK_EXTERNALLY", "INVALID", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ActionType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ActionType[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Map<String, ActionType> map;
        private final IBrazeActionStep impl;
        private final String key;
        public static final ActionType CONTAINER = new ActionType("CONTAINER", 0, "container", ContainerStep.INSTANCE);
        public static final ActionType LOG_CUSTOM_EVENT = new ActionType("LOG_CUSTOM_EVENT", 1, "logCustomEvent", LogCustomEventStep.INSTANCE);
        public static final ActionType SET_CUSTOM_ATTRIBUTE = new ActionType("SET_CUSTOM_ATTRIBUTE", 2, "setCustomUserAttribute", SetCustomUserAttributeStep.INSTANCE);
        public static final ActionType REQUEST_PUSH_PERMISSION = new ActionType("REQUEST_PUSH_PERMISSION", 3, "requestPushPermission", RequestPushPermissionStep.INSTANCE);
        public static final ActionType ADD_TO_SUBSCRIPTION_GROUP = new ActionType("ADD_TO_SUBSCRIPTION_GROUP", 4, "addToSubscriptionGroup", AddToSubscriptionGroupStep.INSTANCE);
        public static final ActionType REMOVE_FROM_SUBSCRIPTION_GROUP = new ActionType("REMOVE_FROM_SUBSCRIPTION_GROUP", 5, "removeFromSubscriptionGroup", RemoveFromSubscriptionGroupStep.INSTANCE);
        public static final ActionType ADD_TO_CUSTOM_ATTRIBUTE_ARRAY = new ActionType("ADD_TO_CUSTOM_ATTRIBUTE_ARRAY", 6, "addToCustomAttributeArray", AddToCustomAttributeArrayStep.INSTANCE);
        public static final ActionType REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY = new ActionType("REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY", 7, "removeFromCustomAttributeArray", RemoveFromCustomAttributeArrayStep.INSTANCE);
        public static final ActionType SET_EMAIL_SUBSCRIPTION = new ActionType("SET_EMAIL_SUBSCRIPTION", 8, "setEmailNotificationSubscriptionType", SetEmailSubscriptionStep.INSTANCE);
        public static final ActionType SET_PUSH_NOTIFICATION_SUBSCRIPTION = new ActionType("SET_PUSH_NOTIFICATION_SUBSCRIPTION", 9, "setPushNotificationSubscriptionType", SetPushNotificationSubscriptionStep.INSTANCE);
        public static final ActionType OPEN_LINK_IN_WEBVIEW = new ActionType("OPEN_LINK_IN_WEBVIEW", 10, "openLinkInWebview", OpenLinkInWebViewStep.INSTANCE);
        public static final ActionType OPEN_LINK_EXTERNALLY = new ActionType("OPEN_LINK_EXTERNALLY", 11, "openLink", OpenLinkExternallyStep.INSTANCE);
        public static final ActionType INVALID = new ActionType("INVALID", 12, "", NoOpStep.INSTANCE);

        private static final /* synthetic */ ActionType[] $values() {
            return new ActionType[]{CONTAINER, LOG_CUSTOM_EVENT, SET_CUSTOM_ATTRIBUTE, REQUEST_PUSH_PERMISSION, ADD_TO_SUBSCRIPTION_GROUP, REMOVE_FROM_SUBSCRIPTION_GROUP, ADD_TO_CUSTOM_ATTRIBUTE_ARRAY, REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY, SET_EMAIL_SUBSCRIPTION, SET_PUSH_NOTIFICATION_SUBSCRIPTION, OPEN_LINK_IN_WEBVIEW, OPEN_LINK_EXTERNALLY, INVALID};
        }

        @JvmStatic
        public static final ActionType fromValue(String str) {
            return INSTANCE.fromValue(str);
        }

        public static EnumEntries<ActionType> getEntries() {
            return $ENTRIES;
        }

        private ActionType(String str, int i, String str2, IBrazeActionStep iBrazeActionStep) {
            this.key = str2;
            this.impl = iBrazeActionStep;
        }

        public final IBrazeActionStep getImpl() {
            return this.impl;
        }

        public final String getKey() {
            return this.key;
        }

        static {
            ActionType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
            INSTANCE = new Companion(null);
            EnumEntries<ActionType> entries = getEntries();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(entries, 10)), 16));
            for (Object obj : entries) {
                linkedHashMap.put(((ActionType) obj).key, obj);
            }
            map = linkedHashMap;
        }

        /* compiled from: BrazeActionParser.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0007R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/braze/ui/actions/brazeactions/BrazeActionParser$ActionType$Companion;", "", "<init>", "()V", "map", "", "", "Lcom/braze/ui/actions/brazeactions/BrazeActionParser$ActionType;", "fromValue", "value", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final ActionType fromValue(String value) {
                Map map = ActionType.map;
                if (value == null) {
                    value = "";
                }
                Object obj = map.get(value);
                if (obj == null) {
                    obj = ActionType.INVALID;
                }
                return (ActionType) obj;
            }
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) $VALUES.clone();
        }
    }

    public final boolean isBrazeActionUri(Uri uri) {
        return Intrinsics.areEqual(uri != null ? uri.getScheme() : null, BRAZE_ACTIONS_SCHEME);
    }

    public static /* synthetic */ void execute$default(BrazeActionParser brazeActionParser, Context context, Uri uri, Channel channel, int i, Object obj) {
        if ((i & 4) != 0) {
            channel = Channel.UNKNOWN;
        }
        brazeActionParser.execute(context, uri, channel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String execute$lambda$0(Channel channel, Uri uri) {
        return "Attempting to parse Braze Action with channel " + channel + " and uri:\n'" + uri + "'";
    }

    public final void execute(Context context, final Uri uri, final Channel channel) {
        Pair brazeActionVersionAndJson$android_sdk_ui_release;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(channel, "channel");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.ui.actions.brazeactions.BrazeActionParser$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String execute$lambda$0;
                execute$lambda$0 = BrazeActionParser.execute$lambda$0(Channel.this, uri);
                return execute$lambda$0;
            }
        }, 6, (Object) null);
        try {
            brazeActionVersionAndJson$android_sdk_ui_release = getBrazeActionVersionAndJson$android_sdk_ui_release(uri);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.ui.actions.brazeactions.BrazeActionParser$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String execute$lambda$3;
                    execute$lambda$3 = BrazeActionParser.execute$lambda$3(uri);
                    return execute$lambda$3;
                }
            }, 4, (Object) null);
        }
        if (brazeActionVersionAndJson$android_sdk_ui_release == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.ui.actions.brazeactions.BrazeActionParser$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String execute$lambda$1;
                    execute$lambda$1 = BrazeActionParser.execute$lambda$1();
                    return execute$lambda$1;
                }
            }, 6, (Object) null);
            return;
        }
        final String str = (String) brazeActionVersionAndJson$android_sdk_ui_release.component1();
        JSONObject jSONObject = (JSONObject) brazeActionVersionAndJson$android_sdk_ui_release.component2();
        if (!Intrinsics.areEqual(str, BRAZE_ACTIONS_V1)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.actions.brazeactions.BrazeActionParser$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String execute$lambda$2;
                    execute$lambda$2 = BrazeActionParser.execute$lambda$2(str);
                    return execute$lambda$2;
                }
            }, 7, (Object) null);
        } else {
            parse$android_sdk_ui_release(context, new StepData(jSONObject, channel));
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.ui.actions.brazeactions.BrazeActionParser$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String execute$lambda$4;
                    execute$lambda$4 = BrazeActionParser.execute$lambda$4(uri);
                    return execute$lambda$4;
                }
            }, 6, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String execute$lambda$1() {
        return "Failed to decode Braze Action into both version and json components. Doing nothing.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String execute$lambda$2(String str) {
        return "Braze Actions version " + str + " is unsupported. Version must be v1";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String execute$lambda$3(Uri uri) {
        return "Failed to parse uri as a Braze Action.\n'" + uri + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String execute$lambda$4(Uri uri) {
        return "Done handling Braze uri\n'" + uri + "'";
    }

    public final /* synthetic */ void parse$android_sdk_ui_release(Context context, final StepData data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            final ActionType actionType$android_sdk_ui_release = getActionType$android_sdk_ui_release(data);
            if (actionType$android_sdk_ui_release == ActionType.INVALID) {
                return;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.ui.actions.brazeactions.BrazeActionParser$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String parse$lambda$5;
                    parse$lambda$5 = BrazeActionParser.parse$lambda$5(BrazeActionParser.ActionType.this, data);
                    return parse$lambda$5;
                }
            }, 6, (Object) null);
            actionType$android_sdk_ui_release.getImpl().run(context, data);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.ui.actions.brazeactions.BrazeActionParser$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String parse$lambda$6;
                    parse$lambda$6 = BrazeActionParser.parse$lambda$6(StepData.this);
                    return parse$lambda$6;
                }
            }, 4, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String parse$lambda$5(ActionType actionType, StepData stepData) {
        return "Performing Braze Action type " + actionType + " with data " + stepData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String parse$lambda$6(StepData stepData) {
        return "Failed to run with data " + stepData;
    }

    public final /* synthetic */ JSONObject parseEncodedActionToJson$android_sdk_ui_release(String action) {
        Intrinsics.checkNotNullParameter(action, "action");
        byte[] decode = Base64.decode(action, 8);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
        int length = decode.length / 2;
        int[] iArr = new int[length];
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, decode.length - 1, 2);
        if (progressionLastElement >= 0) {
            int i = 0;
            while (true) {
                iArr[i / 2] = (decode[i] & 255) | ((decode[i + 1] & 255) << 8);
                if (i == progressionLastElement) {
                    break;
                }
                i += 2;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = iArr[i2];
            if (i3 < 0 || i3 > 65535) {
                throw new IllegalArgumentException("Invalid Char code: " + i3);
            }
            sb.append((char) i3);
        }
        return new JSONObject(sb.toString());
    }

    public final /* synthetic */ Pair getBrazeActionVersionAndJson$android_sdk_ui_release(final Uri uri) {
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(uri, "<this>");
        String host = uri.getHost();
        final String lastPathSegment = uri.getLastPathSegment();
        if (host == null || lastPathSegment == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) uri, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.actions.brazeactions.BrazeActionParser$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String brazeActionVersionAndJson$lambda$7;
                    brazeActionVersionAndJson$lambda$7 = BrazeActionParser.getBrazeActionVersionAndJson$lambda$7(uri);
                    return brazeActionVersionAndJson$lambda$7;
                }
            }, 7, (Object) null);
            return null;
        }
        try {
            jSONObject = parseEncodedActionToJson$android_sdk_ui_release(lastPathSegment);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) uri, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.ui.actions.brazeactions.BrazeActionParser$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String brazeActionVersionAndJson$lambda$8;
                    brazeActionVersionAndJson$lambda$8 = BrazeActionParser.getBrazeActionVersionAndJson$lambda$8(lastPathSegment);
                    return brazeActionVersionAndJson$lambda$8;
                }
            }, 4, (Object) null);
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        return new Pair(host, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBrazeActionVersionAndJson$lambda$7(Uri uri) {
        return "Failed to parse version and encoded action from uri: " + uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getBrazeActionVersionAndJson$lambda$8(String str) {
        return "Failed to decode action into json. Action:\n'" + str + "'";
    }

    public final /* synthetic */ ActionType getActionType$android_sdk_ui_release(final StepData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        final ActionType fromValue = ActionType.INSTANCE.fromValue(JsonUtils.getOptionalString(data.getSrcJson(), "type"));
        if (fromValue.getImpl().isValid(data)) {
            return fromValue;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.actions.brazeactions.BrazeActionParser$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String actionType$lambda$9;
                actionType$lambda$9 = BrazeActionParser.getActionType$lambda$9(BrazeActionParser.ActionType.this, data);
                return actionType$lambda$9;
            }
        }, 7, (Object) null);
        return ActionType.INVALID;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getActionType$lambda$9(ActionType actionType, StepData stepData) {
        return "Cannot parse invalid action of type " + actionType + " and data " + stepData;
    }
}
