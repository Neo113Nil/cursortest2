package com.braze.ui.actions.brazeactions;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
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
import com.braze.ui.actions.brazeactions.steps.RequestPushPermissionStep;
import com.braze.ui.actions.brazeactions.steps.SetCustomUserAttributeStep;
import com.braze.ui.actions.brazeactions.steps.SetEmailSubscriptionStep;
import com.braze.ui.actions.brazeactions.steps.SetPushNotificationSubscriptionStep;
import com.braze.ui.actions.brazeactions.steps.StepData;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.json.JSONObject;

/* compiled from: BrazeActionParser.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eJ\u0015\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0013J\u001d\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0015J\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0019J\u001f\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001b*\u00020\fH\u0000¢\u0006\u0002\b\u001cJ\f\u0010\u001d\u001a\u00020\u001e*\u0004\u0018\u00010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/braze/ui/actions/brazeactions/BrazeActionParser;", "", "()V", "BRAZE_ACTIONS_SCHEME", "", "BRAZE_ACTIONS_V1", "TYPE", "execute", "", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", AppsFlyerProperties.CHANNEL, "Lcom/braze/enums/Channel;", "getActionType", "Lcom/braze/ui/actions/brazeactions/BrazeActionParser$ActionType;", "data", "Lcom/braze/ui/actions/brazeactions/steps/StepData;", "getActionType$android_sdk_ui_release", "parse", "parse$android_sdk_ui_release", "parseEncodedActionToJson", "Lorg/json/JSONObject;", "action", "parseEncodedActionToJson$android_sdk_ui_release", "getBrazeActionVersionAndJson", "Lkotlin/Pair;", "getBrazeActionVersionAndJson$android_sdk_ui_release", "isBrazeActionUri", "", "ActionType", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BrazeActionParser {
    public static final String BRAZE_ACTIONS_SCHEME = "brazeActions";
    private static final String BRAZE_ACTIONS_V1 = "v1";
    public static final BrazeActionParser INSTANCE = new BrazeActionParser();
    public static final String TYPE = "type";

    private BrazeActionParser() {
    }

    /* compiled from: BrazeActionParser.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0080\u0001\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0019"}, d2 = {"Lcom/braze/ui/actions/brazeactions/BrazeActionParser$ActionType;", "", "key", "", "impl", "Lcom/braze/ui/actions/brazeactions/steps/IBrazeActionStep;", "(Ljava/lang/String;ILjava/lang/String;Lcom/braze/ui/actions/brazeactions/steps/IBrazeActionStep;)V", "getImpl", "()Lcom/braze/ui/actions/brazeactions/steps/IBrazeActionStep;", "getKey", "()Ljava/lang/String;", "CONTAINER", "LOG_CUSTOM_EVENT", "SET_CUSTOM_ATTRIBUTE", "REQUEST_PUSH_PERMISSION", "ADD_TO_SUBSCRIPTION_GROUP", "REMOVE_FROM_SUBSCRIPTION_GROUP", "ADD_TO_CUSTOM_ATTRIBUTE_ARRAY", "REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY", "SET_EMAIL_SUBSCRIPTION", "SET_PUSH_NOTIFICATION_SUBSCRIPTION", "OPEN_LINK_IN_WEBVIEW", "OPEN_LINK_EXTERNALLY", "INVALID", k.M, "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum ActionType {
        CONTAINER("container", ContainerStep.INSTANCE),
        LOG_CUSTOM_EVENT("logCustomEvent", LogCustomEventStep.INSTANCE),
        SET_CUSTOM_ATTRIBUTE("setCustomUserAttribute", SetCustomUserAttributeStep.INSTANCE),
        REQUEST_PUSH_PERMISSION("requestPushPermission", RequestPushPermissionStep.INSTANCE),
        ADD_TO_SUBSCRIPTION_GROUP("addToSubscriptionGroup", AddToSubscriptionGroupStep.INSTANCE),
        REMOVE_FROM_SUBSCRIPTION_GROUP("removeFromSubscriptionGroup", AddToSubscriptionGroupStep.INSTANCE),
        ADD_TO_CUSTOM_ATTRIBUTE_ARRAY("addToCustomAttributeArray", AddToCustomAttributeArrayStep.INSTANCE),
        REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY("removeFromCustomAttributeArray", RemoveFromCustomAttributeArrayStep.INSTANCE),
        SET_EMAIL_SUBSCRIPTION("setEmailNotificationSubscriptionType", SetEmailSubscriptionStep.INSTANCE),
        SET_PUSH_NOTIFICATION_SUBSCRIPTION("setPushNotificationSubscriptionType", SetPushNotificationSubscriptionStep.INSTANCE),
        OPEN_LINK_IN_WEBVIEW("openLinkInWebview", OpenLinkInWebViewStep.INSTANCE),
        OPEN_LINK_EXTERNALLY("openLink", OpenLinkExternallyStep.INSTANCE),
        INVALID("", NoOpStep.INSTANCE);


        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Map<String, ActionType> map;
        private final IBrazeActionStep impl;
        private final String key;

        @JvmStatic
        public static final ActionType fromValue(String str) {
            return INSTANCE.fromValue(str);
        }

        ActionType(String str, IBrazeActionStep iBrazeActionStep) {
            this.key = str;
            this.impl = iBrazeActionStep;
        }

        public final IBrazeActionStep getImpl() {
            return this.impl;
        }

        public final String getKey() {
            return this.key;
        }

        static {
            int i = 0;
            ActionType[] values = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(values.length), 16));
            int length = values.length;
            while (i < length) {
                ActionType actionType = values[i];
                i++;
                linkedHashMap.put(actionType.getKey(), actionType);
            }
            map = linkedHashMap;
        }

        /* compiled from: BrazeActionParser.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/braze/ui/actions/brazeactions/BrazeActionParser$ActionType$Companion;", "", "()V", "map", "", "", "Lcom/braze/ui/actions/brazeactions/BrazeActionParser$ActionType;", "fromValue", "value", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
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
    }

    public final boolean isBrazeActionUri(Uri uri) {
        return Intrinsics.areEqual(uri == null ? null : uri.getScheme(), BRAZE_ACTIONS_SCHEME);
    }

    public static /* synthetic */ void execute$default(BrazeActionParser brazeActionParser, Context context, Uri uri, Channel channel, int i, Object obj) {
        if ((i & 4) != 0) {
            channel = Channel.UNKNOWN;
        }
        brazeActionParser.execute(context, uri, channel);
    }

    public final void execute(Context context, final Uri uri, final Channel channel) {
        Pair brazeActionVersionAndJson$android_sdk_ui_release;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(channel, "channel");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.actions.brazeactions.BrazeActionParser$execute$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Attempting to parse Braze Action with channel " + Channel.this + " and uri:\n'" + uri + '\'';
            }
        }, 2, (Object) null);
        try {
            brazeActionVersionAndJson$android_sdk_ui_release = getBrazeActionVersionAndJson$android_sdk_ui_release(uri);
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, new Function0<String>() { // from class: com.braze.ui.actions.brazeactions.BrazeActionParser$execute$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Failed to parse uri as a Braze Action.\n'" + uri + '\'';
                }
            });
        }
        if (brazeActionVersionAndJson$android_sdk_ui_release == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.actions.brazeactions.BrazeActionParser$execute$2
                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Failed to decode Braze Action into both version and json components. Doing nothing.";
                }
            }, 2, (Object) null);
            return;
        }
        final String str = (String) brazeActionVersionAndJson$android_sdk_ui_release.component1();
        JSONObject jSONObject = (JSONObject) brazeActionVersionAndJson$android_sdk_ui_release.component2();
        if (!Intrinsics.areEqual(str, "v1")) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.actions.brazeactions.BrazeActionParser$execute$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Braze Actions version " + str + " is unsupported. Version must be v1";
                }
            }, 3, (Object) null);
        } else {
            parse$android_sdk_ui_release(context, new StepData(jSONObject, channel));
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.actions.brazeactions.BrazeActionParser$execute$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Done handling Braze uri\n'" + uri + '\'';
                }
            }, 2, (Object) null);
        }
    }

    public final /* synthetic */ void parse$android_sdk_ui_release(Context context, final StepData data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            final ActionType actionType$android_sdk_ui_release = getActionType$android_sdk_ui_release(data);
            if (actionType$android_sdk_ui_release == ActionType.INVALID) {
                return;
            }
            try {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.actions.brazeactions.BrazeActionParser$parse$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return "Performing Braze Action type " + BrazeActionParser.ActionType.this + " with data " + data;
                    }
                }, 2, (Object) null);
                actionType$android_sdk_ui_release.getImpl().run(context, data);
            } catch (Exception e) {
                e = e;
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, new Function0<String>() { // from class: com.braze.ui.actions.brazeactions.BrazeActionParser$parse$2
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final String invoke() {
                        return Intrinsics.stringPlus("Failed to run with data ", StepData.this);
                    }
                });
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final /* synthetic */ JSONObject parseEncodedActionToJson$android_sdk_ui_release(String action) {
        Intrinsics.checkNotNullParameter(action, "action");
        byte[] decode = Base64.decode(action, 8);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(action, Base64.URL_SAFE)");
        int length = decode.length / 2;
        int[] iArr = new int[length];
        int i = 0;
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, decode.length - 1, 2);
        if (progressionLastElement >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 2;
                iArr[i2 / 2] = (decode[i2] & 255) | ((decode[i2 + 1] & 255) << 8);
                if (i2 == progressionLastElement) {
                    break;
                }
                i2 = i3;
            }
        }
        StringBuilder sb = new StringBuilder();
        while (i < length) {
            int i4 = iArr[i];
            i++;
            if (i4 < 0 || i4 > 65535) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("Invalid Char code: ", Integer.valueOf(i4)));
            }
            sb.append((char) i4);
        }
        return new JSONObject(sb.toString());
    }

    public final /* synthetic */ Pair getBrazeActionVersionAndJson$android_sdk_ui_release(final Uri uri) {
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(uri, "<this>");
        String host = uri.getHost();
        final String lastPathSegment = uri.getLastPathSegment();
        if (host == null || lastPathSegment == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, uri, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.actions.brazeactions.BrazeActionParser$getBrazeActionVersionAndJson$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return Intrinsics.stringPlus("Failed to parse version and encoded action from uri: ", uri);
                }
            }, 3, (Object) null);
            return null;
        }
        try {
            jSONObject = parseEncodedActionToJson$android_sdk_ui_release(lastPathSegment);
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(uri, BrazeLogger.Priority.E, e, new Function0<String>() { // from class: com.braze.ui.actions.brazeactions.BrazeActionParser$getBrazeActionVersionAndJson$json$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final String invoke() {
                    return "Failed to decode action into json. Action:\n'" + ((Object) lastPathSegment) + '\'';
                }
            });
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        return new Pair(host, jSONObject);
    }

    public final /* synthetic */ ActionType getActionType$android_sdk_ui_release(final StepData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        final ActionType fromValue = ActionType.INSTANCE.fromValue(JsonUtils.getOptionalString(data.getSrcJson(), "type"));
        if (fromValue.getImpl().isValid(data)) {
            return fromValue;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new Function0<String>() { // from class: com.braze.ui.actions.brazeactions.BrazeActionParser$getActionType$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return "Cannot parse invalid action of type " + BrazeActionParser.ActionType.this + " and data " + data;
            }
        }, 3, (Object) null);
        return ActionType.INVALID;
    }
}
