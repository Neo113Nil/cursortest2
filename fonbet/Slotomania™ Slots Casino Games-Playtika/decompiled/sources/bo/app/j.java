package bo.app;

import bo.app.e1;
import com.braze.Constants;
import com.braze.enums.inappmessage.InAppMessageFailureType;
import com.braze.models.FeatureFlag;
import com.braze.models.IBrazeLocation;
import com.braze.models.inappmessage.MessageButton;
import com.braze.models.outgoing.BrazeProperties;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.M6;
import com.ironsource.X3;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import org.apache.cordova.globalization.Globalization;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0017\u0018\u00002\u00020\u0001:\u0001\"B-\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b.\u0010/BG\b\u0016\u0012\u0006\u00100\u001a\u00020\f\u0012\b\b\u0002\u00101\u001a\u00020\u0002\u0012\b\b\u0002\u00102\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b.\u00103J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR/\u0010$\u001a\u0004\u0018\u00010\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010#R/\u0010*\u001a\u0004\u0018\u00010%2\b\u0010\u001e\u001a\u0004\u0018\u00010%8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b'\u0010(\"\u0004\b\"\u0010)R\u0014\u0010-\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00064"}, d2 = {"Lbo/app/j;", "Lbo/app/x1;", "Lorg/json/JSONObject;", "e", "", "toString", "", "other", "", "equals", "", "hashCode", "Lbo/app/e1;", "type", "Lbo/app/e1;", "j", "()Lbo/app/e1;", "data", "Lorg/json/JSONObject;", "k", "()Lorg/json/JSONObject;", "", "timestampSeconds", "D", "v", "()D", "uniqueIdentifier", "Ljava/lang/String;", AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, "()Ljava/lang/String;", "<set-?>", "userId$delegate", "Lbo/app/g3;", "w", Constants.BRAZE_PUSH_CONTENT_KEY, "(Ljava/lang/String;)V", "userId", "Lbo/app/o5;", "sessionId$delegate", "n", "()Lbo/app/o5;", "(Lbo/app/o5;)V", JsonStorageKeyNames.SESSION_ID_KEY, Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "()Z", "isNonPersistable", "<init>", "(Lbo/app/e1;Lorg/json/JSONObject;DLjava/lang/String;)V", "eventType", "eventData", "eventTimeInSeconds", "(Lbo/app/e1;Lorg/json/JSONObject;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class j implements x1 {
    private final e1 b;
    private final JSONObject c;
    private final double d;
    private final String e;
    private final g3 f;
    private final g3 g;
    static final /* synthetic */ KProperty<Object>[] i = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "userId", "getUserId()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, JsonStorageKeyNames.SESSION_ID_KEY, "getSessionId()Lcom/braze/models/SessionId;", 0))};
    public static final a h = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bH\u0010IJ\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J6\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J&\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0007J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0007J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001b\u001a\u00020\u0006H\u0007J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001b\u001a\u00020\u0006H\u0007J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001b\u001a\u00020\u0006H\u0007J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001b\u001a\u00020\u0006H\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001b\u001a\u00020\u0006H\u0007J\u0012\u0010 \u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001b\u001a\u00020\u0006H\u0007J\u001a\u0010 \u001a\u0004\u0018\u00010\u00032\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u0006H\u0007J\u0012\u0010$\u001a\u0004\u0018\u00010\u00032\u0006\u0010#\u001a\u00020\u0006H\u0007J\u0012\u0010%\u001a\u0004\u0018\u00010\u00032\u0006\u0010#\u001a\u00020\u0006H\u0007J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00032\u0006\u0010#\u001a\u00020\u0006H\u0007J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010#\u001a\u00020\u00062\u0006\u0010'\u001a\u00020&H\u0007J\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u00032\u0006\u0010#\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006H\u0007J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010#\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)H\u0007J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0007J\u0012\u0010,\u001a\u0004\u0018\u00010\u00032\u0006\u0010+\u001a\u00020\u0006H\u0007J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010-\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u000eH\u0007J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u0006H\u0007J\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00032\u0006\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u0006H\u0007J+\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010/\u001a\u00020\u00062\u0010\u00100\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u000101H\u0007¢\u0006\u0004\b\u0005\u00102J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u00104\u001a\u000203H\u0007J\"\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010/\u001a\u00020\u00062\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u000205H\u0007J\u0014\u00108\u001a\u0004\u0018\u00010\u00032\b\u0010/\u001a\u0004\u0018\u00010\u0006H\u0007J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010/\u001a\u00020\u00062\u0006\u0010:\u001a\u000209H\u0007J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010;\u001a\u00020\u00062\u0006\u0010=\u001a\u00020<H\u0007J\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u0006\u0010>\u001a\u00020\u00062\u0006\u0010?\u001a\u00020\u0006H\u0007J\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u0006\u0010@\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\u0006H\u0007J\u0017\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0005\u0010BJ3\u0010\u0005\u001a\u0002092\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)H\u0001¢\u0006\u0004\b\u0005\u0010CR\u0014\u0010D\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006J"}, d2 = {"Lbo/app/j$a;", "", "Lkotlin/Function0;", "Lbo/app/x1;", "block", Constants.BRAZE_PUSH_CONTENT_KEY, "", X3.i.j0, "Lcom/braze/models/outgoing/BrazeProperties;", FeatureFlag.PROPERTIES, InAppPurchaseMetaData.KEY_PRODUCT_ID, "currencyCode", "Ljava/math/BigDecimal;", "price", "", "quantity", "Lcom/braze/models/IBrazeLocation;", FirebaseAnalytics.Param.LOCATION, "", "throwable", "Lbo/app/o5;", JsonStorageKeyNames.SESSION_ID_KEY, "", "shouldPersist", "alias", "label", "g", "cardId", "f", "e", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "b", "c", "id", "eventType", "triggerId", "h", "i", "Lcom/braze/models/inappmessage/MessageButton;", "messageButton", "buttonId", "Lcom/braze/enums/inappmessage/InAppMessageFailureType;", "inAppMessageFailureType", "name", "j", "customUserAttributeKey", "incrementValue", "key", "value", "", "(Ljava/lang/String;[Ljava/lang/String;)Lbo/app/x1;", "", "sessionDurationSeconds", "", IBrazeLocation.LATITUDE, IBrazeLocation.LONGITUDE, "k", "Lorg/json/JSONObject;", "json", "subscriptionGroupId", "Lbo/app/x5;", "subscriptionGroupStatus", "campaignId", "pageId", "serializedEvent", "uniqueIdentifier", "(Ljava/lang/Throwable;)Ljava/lang/String;", "(Ljava/lang/String;Ljava/lang/String;Lcom/braze/enums/inappmessage/InAppMessageFailureType;)Lorg/json/JSONObject;", "MAX_STACK_TRACE_STRING_LENGTH", "I", "SHOULD_NOT_BE_PERSISTED_KEY", "Ljava/lang/String;", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbo/app/x1;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Lbo/app/x1;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: bo.app.j$a$a, reason: collision with other inner class name */
        static final class C0078a extends Lambda implements Function0<x1> {
            final /* synthetic */ String b;
            final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0078a(String str, String str2) {
                super(0);
                this.b = str;
                this.c = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x1 invoke() {
                JSONObject eventData = new JSONObject().put("key", this.b).put("value", this.c);
                e1 e1Var = e1.ADD_TO_CUSTOM_ATTRIBUTE_ARRAY;
                Intrinsics.checkNotNullExpressionValue(eventData, "eventData");
                return new j(e1Var, eventData, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbo/app/x1;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Lbo/app/x1;"}, k = 3, mv = {1, 6, 0})
        static final class a0 extends Lambda implements Function0<x1> {
            final /* synthetic */ long b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a0(long j) {
                super(0);
                this.b = j;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x1 invoke() {
                JSONObject eventData = new JSONObject().put(Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, this.b);
                e1 e1Var = e1.SESSION_END;
                Intrinsics.checkNotNullExpressionValue(eventData, "eventData");
                return new j(e1Var, eventData, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbo/app/x1;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Lbo/app/x1;"}, k = 3, mv = {1, 6, 0})
        static final class b extends Lambda implements Function0<x1> {
            final /* synthetic */ String b;
            final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str, String str2) {
                super(0);
                this.b = str;
                this.c = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x1 invoke() {
                JSONObject jSONObject = new JSONObject(this.b);
                String eventTypeString = jSONObject.getString("name");
                e1.a aVar = e1.c;
                Intrinsics.checkNotNullExpressionValue(eventTypeString, "eventTypeString");
                e1 a = aVar.a(eventTypeString);
                JSONObject data = jSONObject.getJSONObject("data");
                double d = jSONObject.getDouble(Globalization.TIME);
                String optionalString = JsonUtils.getOptionalString(jSONObject, "user_id");
                String optionalString2 = JsonUtils.getOptionalString(jSONObject, SDKAnalyticsEvents.PARAMETER_SESSION_ID);
                Intrinsics.checkNotNullExpressionValue(data, "data");
                return new j(a, data, d, this.c, optionalString, optionalString2);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbo/app/x1;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Lbo/app/x1;"}, k = 3, mv = {1, 6, 0})
        static final class b0 extends Lambda implements Function0<x1> {
            final /* synthetic */ o5 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b0(o5 o5Var) {
                super(0);
                this.b = o5Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x1 invoke() {
                j jVar = new j(e1.SESSION_START, (JSONObject) null, 0.0d, (String) null, 14, (DefaultConstructorMarker) null);
                jVar.a(this.b);
                return jVar;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbo/app/x1;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Lbo/app/x1;"}, k = 3, mv = {1, 6, 0})
        static final class c extends Lambda implements Function0<x1> {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(String str) {
                super(0);
                this.b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x1 invoke() {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(this.b);
                jSONObject.put("ids", jSONArray);
                return new j(e1.CONTENT_CARDS_CLICK, jSONObject, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbo/app/x1;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Lbo/app/x1;"}, k = 3, mv = {1, 6, 0})
        static final class c0 extends Lambda implements Function0<x1> {
            final /* synthetic */ String b;
            final /* synthetic */ String[] c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c0(String str, String[] strArr) {
                super(0);
                this.b = str;
                this.c = strArr;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x1 invoke() {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", this.b);
                String[] strArr = this.c;
                if (strArr == null) {
                    jSONObject.put("value", JSONObject.NULL);
                } else {
                    jSONObject.put("value", JsonUtils.constructJsonArray(strArr));
                }
                return new j(e1.SET_CUSTOM_ATTRIBUTE_ARRAY, jSONObject, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbo/app/x1;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Lbo/app/x1;"}, k = 3, mv = {1, 6, 0})
        static final class d extends Lambda implements Function0<x1> {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(String str) {
                super(0);
                this.b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x1 invoke() {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(this.b);
                jSONObject.put("ids", jSONArray);
                return new j(e1.CONTENT_CARDS_CONTROL_IMPRESSION, jSONObject, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbo/app/x1;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Lbo/app/x1;"}, k = 3, mv = {1, 6, 0})
        static final class d0 extends Lambda implements Function0<x1> {
            final /* synthetic */ String b;
            final /* synthetic */ x5 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d0(String str, x5 x5Var) {
                super(0);
                this.b = str;
                this.c = x5Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x1 invoke() {
                JSONObject eventData = new JSONObject().put(FirebaseAnalytics.Param.GROUP_ID, this.b).put("status", this.c.getJsonKey());
                e1 e1Var = e1.SUBSCRIPTION_GROUP_UPDATE;
                Intrinsics.checkNotNullExpressionValue(eventData, "eventData");
                return new j(e1Var, eventData, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbo/app/x1;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Lbo/app/x1;"}, k = 3, mv = {1, 6, 0})
        static final class e extends Lambda implements Function0<x1> {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(String str) {
                super(0);
                this.b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x1 invoke() {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(this.b);
                jSONObject.put("ids", jSONArray);
                return new j(e1.CONTENT_CARDS_DISMISS, jSONObject, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbo/app/x1;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Lbo/app/x1;"}, k = 3, mv = {1, 6, 0})
        static final class e0 extends Lambda implements Function0<x1> {
            final /* synthetic */ String b;
            final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e0(String str, String str2) {
                super(0);
                this.b = str;
                this.c = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x1 invoke() {
                JSONObject eventData = new JSONObject().put(Constants.BRAZE_PUSH_CONTENT_KEY, this.b).put("l", this.c);
                e1 e1Var = e1.USER_ALIAS;
                Intrinsics.checkNotNullExpressionValue(eventData, "eventData");
                return new j(e1Var, eventData, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbo/app/x1;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Lbo/app/x1;"}, k = 3, mv = {1, 6, 0})
        static final class f extends Lambda implements Function0<x1> {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(String str) {
                super(0);
                this.b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x1 invoke() {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(this.b);
                jSONObject.put("ids", jSONArray);
                return new j(e1.CONTENT_CARDS_IMPRESSION, jSONObject, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
        static final class f0 extends Lambda implements Function0<String> {
            public static final f0 b = new f0();

            f0() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Failed to create event";
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbo/app/x1;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Lbo/app/x1;"}, k = 3, mv = {1, 6, 0})
        static final class g extends Lambda implements Function0<x1> {
            final /* synthetic */ String b;
            final /* synthetic */ BrazeProperties c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(String str, BrazeProperties brazeProperties) {
                super(0);
                this.b = str;
                this.c = brazeProperties;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x1 invoke() {
                JSONObject eventData = new JSONObject().put("n", this.b);
                BrazeProperties brazeProperties = this.c;
                if (brazeProperties != null && brazeProperties.getSize() > 0) {
                    eventData.put("p", this.c.getJsonObject());
                }
                e1 e1Var = e1.CUSTOM_EVENT;
                Intrinsics.checkNotNullExpressionValue(eventData, "eventData");
                return new j(e1Var, eventData, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbo/app/x1;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Lbo/app/x1;"}, k = 3, mv = {1, 6, 0})
        static final class h extends Lambda implements Function0<x1> {
            final /* synthetic */ Throwable b;
            final /* synthetic */ o5 c;
            final /* synthetic */ boolean d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(Throwable th, o5 o5Var, boolean z) {
                super(0);
                this.b = th;
                this.c = o5Var;
                this.d = z;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x1 invoke() {
                StringBuilder append = new StringBuilder("\n                original_sdk_version: 26.2.1\n                exception_class: ").append((Object) this.b.getClass().getName()).append("\n                available_cpus: ").append(Runtime.getRuntime().availableProcessors()).append("\n                ");
                o5 o5Var = this.c;
                JSONObject eventData = new JSONObject().put("e", StringsKt.trimIndent(append.append((Object) (o5Var == null ? null : Intrinsics.stringPlus("session_id: ", o5Var))).append("\n                ").append(j.h.a(this.b)).append("\n            ").toString()));
                if (!this.d) {
                    eventData.put("nop", true);
                }
                e1 e1Var = e1.INTERNAL_ERROR;
                Intrinsics.checkNotNullExpressionValue(eventData, "eventData");
                return new j(e1Var, eventData, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbo/app/x1;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Lbo/app/x1;"}, k = 3, mv = {1, 6, 0})
        static final class i extends Lambda implements Function0<x1> {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            i(String str) {
                super(0);
                this.b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x1 invoke() {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(this.b);
                jSONObject.put("ids", jSONArray);
                return new j(e1.NEWS_FEED_CARD_CLICK, jSONObject, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbo/app/x1;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Lbo/app/x1;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: bo.app.j$a$j, reason: collision with other inner class name */
        static final class C0079j extends Lambda implements Function0<x1> {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0079j(String str) {
                super(0);
                this.b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x1 invoke() {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(this.b);
                jSONObject.put("ids", jSONArray);
                return new j(e1.NEWS_FEED_CARD_IMPRESSION, jSONObject, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbo/app/x1;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Lbo/app/x1;"}, k = 3, mv = {1, 6, 0})
        static final class k extends Lambda implements Function0<x1> {
            final /* synthetic */ String b;
            final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            k(String str, String str2) {
                super(0);
                this.b = str;
                this.c = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x1 invoke() {
                JSONObject eventData = new JSONObject().put("geo_id", this.b).put(StatsEvent.z, this.c);
                e1 e1Var = e1.GEOFENCE;
                Intrinsics.checkNotNullExpressionValue(eventData, "eventData");
                return new j(e1Var, eventData, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbo/app/x1;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Lbo/app/x1;"}, k = 3, mv = {1, 6, 0})
        static final class l extends Lambda implements Function0<x1> {
            final /* synthetic */ String b;
            final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            l(String str, String str2) {
                super(0);
                this.b = str;
                this.c = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x1 invoke() {
                String str = null;
                return new j(e1.INAPP_MESSAGE_BUTTON_CLICK, a.a(j.h, this.b, this.c, null, 4, null), 0.0d, str, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbo/app/x1;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Lbo/app/x1;"}, k = 3, mv = {1, 6, 0})
        static final class m extends Lambda implements Function0<x1> {
            final /* synthetic */ String b;
            final /* synthetic */ MessageButton c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            m(String str, MessageButton messageButton) {
                super(0);
                this.b = str;
                this.c = messageButton;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x1 invoke() {
                String str = null;
                return new j(e1.INAPP_MESSAGE_BUTTON_CLICK, a.a(j.h, this.b, this.c.getStringId(), null, 4, null), 0.0d, str, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbo/app/x1;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Lbo/app/x1;"}, k = 3, mv = {1, 6, 0})
        static final class n extends Lambda implements Function0<x1> {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            n(String str) {
                super(0);
                this.b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x1 invoke() {
                String str = null;
                return new j(e1.INAPP_MESSAGE_CLICK, a.a(j.h, this.b, null, null, 6, null), 0.0d, str, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbo/app/x1;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Lbo/app/x1;"}, k = 3, mv = {1, 6, 0})
        static final class o extends Lambda implements Function0<x1> {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            o(String str) {
                super(0);
                this.b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x1 invoke() {
                String str = null;
                return new j(e1.INAPP_MESSAGE_CONTROL_IMPRESSION, a.a(j.h, this.b, null, null, 6, null), 0.0d, str, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbo/app/x1;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Lbo/app/x1;"}, k = 3, mv = {1, 6, 0})
        static final class p extends Lambda implements Function0<x1> {
            final /* synthetic */ String b;
            final /* synthetic */ InAppMessageFailureType c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            p(String str, InAppMessageFailureType inAppMessageFailureType) {
                super(0);
                this.b = str;
                this.c = inAppMessageFailureType;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x1 invoke() {
                return new j(e1.INAPP_MESSAGE_DISPLAY_FAILURE, a.a(j.h, this.b, null, this.c, 2, null), 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbo/app/x1;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Lbo/app/x1;"}, k = 3, mv = {1, 6, 0})
        static final class q extends Lambda implements Function0<x1> {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            q(String str) {
                super(0);
                this.b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x1 invoke() {
                String str = null;
                return new j(e1.INAPP_MESSAGE_IMPRESSION, a.a(j.h, this.b, null, null, 6, null), 0.0d, str, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbo/app/x1;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Lbo/app/x1;"}, k = 3, mv = {1, 6, 0})
        static final class r extends Lambda implements Function0<x1> {
            final /* synthetic */ String b;
            final /* synthetic */ int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            r(String str, int i) {
                super(0);
                this.b = str;
                this.c = i;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x1 invoke() {
                JSONObject eventData = new JSONObject().put("key", this.b).put("value", this.c);
                e1 e1Var = e1.INCREMENT;
                Intrinsics.checkNotNullExpressionValue(eventData, "eventData");
                return new j(e1Var, eventData, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbo/app/x1;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Lbo/app/x1;"}, k = 3, mv = {1, 6, 0})
        static final class s extends Lambda implements Function0<x1> {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            s(String str) {
                super(0);
                this.b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x1 invoke() {
                JSONObject eventData = new JSONObject().put("n", this.b);
                e1 e1Var = e1.INTERNAL;
                Intrinsics.checkNotNullExpressionValue(eventData, "eventData");
                return new j(e1Var, eventData, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbo/app/x1;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Lbo/app/x1;"}, k = 3, mv = {1, 6, 0})
        static final class t extends Lambda implements Function0<x1> {
            final /* synthetic */ String b;
            final /* synthetic */ double c;
            final /* synthetic */ double d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            t(String str, double d, double d2) {
                super(0);
                this.b = str;
                this.c = d;
                this.d = d2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x1 invoke() {
                JSONObject eventData = new JSONObject().put("key", this.b).put(IBrazeLocation.LATITUDE, this.c).put(IBrazeLocation.LONGITUDE, this.d);
                e1 e1Var = e1.LOCATION_CUSTOM_ATTRIBUTE_ADD;
                Intrinsics.checkNotNullExpressionValue(eventData, "eventData");
                return new j(e1Var, eventData, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbo/app/x1;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Lbo/app/x1;"}, k = 3, mv = {1, 6, 0})
        static final class u extends Lambda implements Function0<x1> {
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            u(String str) {
                super(0);
                this.b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x1 invoke() {
                JSONObject eventData = new JSONObject().put("key", this.b);
                e1 e1Var = e1.LOCATION_CUSTOM_ATTRIBUTE_REMOVE;
                Intrinsics.checkNotNullExpressionValue(eventData, "eventData");
                return new j(e1Var, eventData, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbo/app/x1;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Lbo/app/x1;"}, k = 3, mv = {1, 6, 0})
        static final class v extends Lambda implements Function0<x1> {
            final /* synthetic */ IBrazeLocation b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            v(IBrazeLocation iBrazeLocation) {
                super(0);
                this.b = iBrazeLocation;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x1 invoke() {
                return new j(e1.LOCATION_RECORDED, this.b.getJsonObject(), 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbo/app/x1;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Lbo/app/x1;"}, k = 3, mv = {1, 6, 0})
        static final class w extends Lambda implements Function0<x1> {
            final /* synthetic */ String b;
            final /* synthetic */ JSONObject c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            w(String str, JSONObject jSONObject) {
                super(0);
                this.b = str;
                this.c = jSONObject;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x1 invoke() {
                JSONObject eventData = new JSONObject().put("key", this.b).put("value", this.c);
                e1 e1Var = e1.NESTED_CUSTOM_ATTRIBUTE_MERGE;
                Intrinsics.checkNotNullExpressionValue(eventData, "eventData");
                return new j(e1Var, eventData, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbo/app/x1;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Lbo/app/x1;"}, k = 3, mv = {1, 6, 0})
        static final class x extends Lambda implements Function0<x1> {
            final /* synthetic */ BrazeProperties b;
            final /* synthetic */ String c;
            final /* synthetic */ String d;
            final /* synthetic */ BigDecimal e;
            final /* synthetic */ int f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            x(BrazeProperties brazeProperties, String str, String str2, BigDecimal bigDecimal, int i) {
                super(0);
                this.b = brazeProperties;
                this.c = str;
                this.d = str2;
                this.e = bigDecimal;
                this.f = i;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x1 invoke() {
                JSONObject jSONObject = new JSONObject();
                String str = this.c;
                String str2 = this.d;
                BigDecimal bigDecimal = this.e;
                int i = this.f;
                jSONObject.put("pid", str);
                jSONObject.put("c", str2);
                jSONObject.put("p", r3.a(bigDecimal).doubleValue());
                jSONObject.put("q", i);
                BrazeProperties brazeProperties = this.b;
                if (brazeProperties != null && brazeProperties.getSize() > 0) {
                    jSONObject.put("pr", this.b.getJsonObject());
                }
                return new j(e1.PURCHASE, jSONObject, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbo/app/x1;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Lbo/app/x1;"}, k = 3, mv = {1, 6, 0})
        static final class y extends Lambda implements Function0<x1> {
            final /* synthetic */ String b;
            final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            y(String str, String str2) {
                super(0);
                this.b = str;
                this.c = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x1 invoke() {
                JSONObject eventData = new JSONObject().put(Constants.BRAZE_PUSH_CAMPAIGN_ID_KEY, this.b).put(Constants.BRAZE_PUSH_CONTENT_KEY, this.c);
                e1 e1Var = e1.PUSH_STORY_PAGE_CLICK;
                Intrinsics.checkNotNullExpressionValue(eventData, "eventData");
                return new j(e1Var, eventData, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbo/app/x1;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Lbo/app/x1;"}, k = 3, mv = {1, 6, 0})
        static final class z extends Lambda implements Function0<x1> {
            final /* synthetic */ String b;
            final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            z(String str, String str2) {
                super(0);
                this.b = str;
                this.c = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final x1 invoke() {
                JSONObject eventData = new JSONObject().put("key", this.b).put("value", this.c);
                e1 e1Var = e1.REMOVE_FROM_CUSTOM_ATTRIBUTE_ARRAY;
                Intrinsics.checkNotNullExpressionValue(eventData, "eventData");
                return new j(e1Var, eventData, 0.0d, (String) null, 12, (DefaultConstructorMarker) null);
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final x1 a(String eventName, BrazeProperties properties) {
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            return a(new g(eventName, properties));
        }

        @JvmStatic
        public final x1 b(String cardId) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            return a(new d(cardId));
        }

        @JvmStatic
        public final x1 c(String cardId) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            return a(new e(cardId));
        }

        @JvmStatic
        public final x1 d(String cardId) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            return a(new f(cardId));
        }

        @JvmStatic
        public final x1 e(String cardId) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            return a(new i(cardId));
        }

        @JvmStatic
        public final x1 f(String cardId) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            return a(new C0079j(cardId));
        }

        @JvmStatic
        public final x1 g(String alias, String label) {
            Intrinsics.checkNotNullParameter(alias, "alias");
            Intrinsics.checkNotNullParameter(label, "label");
            return a(new e0(alias, label));
        }

        @JvmStatic
        public final x1 h(String triggerId) {
            Intrinsics.checkNotNullParameter(triggerId, "triggerId");
            return a(new o(triggerId));
        }

        @JvmStatic
        public final x1 i(String triggerId) {
            Intrinsics.checkNotNullParameter(triggerId, "triggerId");
            return a(new q(triggerId));
        }

        @JvmStatic
        public final x1 j(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return a(new s(name));
        }

        @JvmStatic
        public final x1 k(String key) {
            return a(new u(key));
        }

        @JvmStatic
        public final x1 a(String productId, String currencyCode, BigDecimal price, int quantity, BrazeProperties properties) {
            Intrinsics.checkNotNullParameter(productId, "productId");
            Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
            Intrinsics.checkNotNullParameter(price, "price");
            return a(new x(properties, productId, currencyCode, price, quantity));
        }

        @JvmStatic
        public final x1 b(String serializedEvent, String uniqueIdentifier) {
            Intrinsics.checkNotNullParameter(serializedEvent, "serializedEvent");
            Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
            return a(new b(serializedEvent, uniqueIdentifier));
        }

        @JvmStatic
        public final x1 c(String id, String eventType) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            return a(new k(id, eventType));
        }

        @JvmStatic
        public final x1 d(String triggerId, String buttonId) {
            Intrinsics.checkNotNullParameter(triggerId, "triggerId");
            Intrinsics.checkNotNullParameter(buttonId, "buttonId");
            return a(new l(triggerId, buttonId));
        }

        @JvmStatic
        public final x1 e(String campaignId, String pageId) {
            Intrinsics.checkNotNullParameter(campaignId, "campaignId");
            Intrinsics.checkNotNullParameter(pageId, "pageId");
            return a(new y(campaignId, pageId));
        }

        @JvmStatic
        public final x1 f(String key, String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            return a(new z(key, value));
        }

        @JvmStatic
        public final x1 g(String triggerId) {
            Intrinsics.checkNotNullParameter(triggerId, "triggerId");
            return a(new n(triggerId));
        }

        @JvmStatic
        public final x1 a(IBrazeLocation location) {
            Intrinsics.checkNotNullParameter(location, "location");
            return a(new v(location));
        }

        @JvmStatic
        public final x1 a(Throwable throwable, o5 sessionId, boolean shouldPersist) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return a(new h(throwable, sessionId, shouldPersist));
        }

        @JvmStatic
        public final x1 a(String cardId) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            return a(new c(cardId));
        }

        @JvmStatic
        public final x1 a(String triggerId, MessageButton messageButton) {
            Intrinsics.checkNotNullParameter(triggerId, "triggerId");
            Intrinsics.checkNotNullParameter(messageButton, "messageButton");
            return a(new m(triggerId, messageButton));
        }

        @JvmStatic
        public final x1 a(String triggerId, InAppMessageFailureType inAppMessageFailureType) {
            Intrinsics.checkNotNullParameter(triggerId, "triggerId");
            Intrinsics.checkNotNullParameter(inAppMessageFailureType, "inAppMessageFailureType");
            return a(new p(triggerId, inAppMessageFailureType));
        }

        @JvmStatic
        public final x1 a() {
            return j("feed_displayed");
        }

        @JvmStatic
        public final x1 a(String customUserAttributeKey, int incrementValue) {
            Intrinsics.checkNotNullParameter(customUserAttributeKey, "customUserAttributeKey");
            return a(new r(customUserAttributeKey, incrementValue));
        }

        @JvmStatic
        public final x1 a(String key, String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            return a(new C0078a(key, value));
        }

        @JvmStatic
        public final x1 a(String key, String[] value) {
            Intrinsics.checkNotNullParameter(key, "key");
            return a(new c0(key, value));
        }

        @JvmStatic
        public final x1 a(o5 sessionId) {
            Intrinsics.checkNotNullParameter(sessionId, "sessionId");
            return a(new b0(sessionId));
        }

        @JvmStatic
        public final x1 a(long sessionDurationSeconds) {
            return a(new a0(sessionDurationSeconds));
        }

        @JvmStatic
        public final x1 a(String key, double latitude, double longitude) {
            Intrinsics.checkNotNullParameter(key, "key");
            return a(new t(key, latitude, longitude));
        }

        @JvmStatic
        public final x1 a(String key, JSONObject json) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(json, "json");
            return a(new w(key, json));
        }

        @JvmStatic
        public final x1 a(String subscriptionGroupId, x5 subscriptionGroupStatus) {
            Intrinsics.checkNotNullParameter(subscriptionGroupId, "subscriptionGroupId");
            Intrinsics.checkNotNullParameter(subscriptionGroupStatus, "subscriptionGroupStatus");
            return a(new d0(subscriptionGroupId, subscriptionGroupStatus));
        }

        @JvmStatic
        public final String a(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            StringWriter stringWriter = new StringWriter();
            throwable.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            Intrinsics.checkNotNullExpressionValue(stringWriter2, "result.toString()");
            return StringsKt.take(stringWriter2, 5000);
        }

        public static /* synthetic */ JSONObject a(a aVar, String str, String str2, InAppMessageFailureType inAppMessageFailureType, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = null;
            }
            if ((i2 & 2) != 0) {
                str2 = null;
            }
            if ((i2 & 4) != 0) {
                inAppMessageFailureType = null;
            }
            return aVar.a(str, str2, inAppMessageFailureType);
        }

        @JvmStatic
        public final JSONObject a(String triggerId, String buttonId, InAppMessageFailureType inAppMessageFailureType) {
            JSONObject jSONObject = new JSONObject();
            if (triggerId != null && triggerId.length() != 0) {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(triggerId);
                jSONObject.put("trigger_ids", jSONArray);
            }
            if (buttonId != null && buttonId.length() != 0) {
                jSONObject.put(M6.f, buttonId);
            }
            if (inAppMessageFailureType != null) {
                jSONObject.put("error_code", inAppMessageFailureType.getJsonObject());
            }
            return jSONObject;
        }

        private final x1 a(Function0<? extends x1> block) {
            try {
                return block.invoke();
            } catch (Exception e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, f0.b);
                return null;
            }
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
            return "Caught exception creating Braze event json";
        }
    }

    public j(e1 type, JSONObject data, double d, String uniqueIdentifier) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
        this.b = type;
        this.c = data;
        this.d = d;
        this.e = uniqueIdentifier;
        this.f = new g3();
        this.g = new g3();
        if (type == e1.UNKNOWN) {
            throw new IllegalArgumentException("Event type cannot be unknown.");
        }
    }

    @Override // bo.app.x1
    public final void a(String str) {
        this.f.setValue(this, i[0], str);
    }

    @Override // bo.app.x1
    public boolean d() {
        return this.b == e1.INTERNAL_ERROR && getC().optBoolean("nop", false);
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public JSONObject getJsonObject() {
        o5 n;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", this.b.getJsonObject());
            jSONObject.put("data", getC());
            jSONObject.put(Globalization.TIME, getD());
            String w = w();
            if (w != null && w.length() != 0) {
                jSONObject.put("user_id", w());
            }
            n = n();
        } catch (JSONException e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, b.b);
        }
        if (n == null) {
            return jSONObject;
        }
        jSONObject.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, n.getJsonObject());
        return jSONObject;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.areEqual(getClass(), other.getClass())) {
            return false;
        }
        return Intrinsics.areEqual(getE(), ((j) other).getE());
    }

    public int hashCode() {
        return getE().hashCode();
    }

    @Override // bo.app.x1
    /* renamed from: j, reason: from getter */
    public final e1 getB() {
        return this.b;
    }

    @Override // bo.app.x1
    /* renamed from: k, reason: from getter */
    public JSONObject getC() {
        return this.c;
    }

    @Override // bo.app.x1
    public final o5 n() {
        return (o5) this.g.getValue(this, i[1]);
    }

    @Override // bo.app.x1
    /* renamed from: r, reason: from getter */
    public String getE() {
        return this.e;
    }

    public String toString() {
        return p();
    }

    /* renamed from: v, reason: from getter */
    public double getD() {
        return this.d;
    }

    public final String w() {
        return (String) this.f.getValue(this, i[0]);
    }

    @Override // bo.app.x1
    public final void a(o5 o5Var) {
        this.g.setValue(this, i[1], o5Var);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ j(e1 e1Var, JSONObject jSONObject, double d, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(e1Var, r2, r3, str);
        JSONObject jSONObject2 = (i2 & 2) != 0 ? new JSONObject() : jSONObject;
        double nowInSecondsPrecise = (i2 & 4) != 0 ? DateTimeUtils.nowInSecondsPrecise() : d;
        if ((i2 & 8) != 0) {
            str = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(e1 eventType, JSONObject eventData, double d, String uniqueIdentifier, String str, String str2) {
        this(eventType, eventData, d, uniqueIdentifier);
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        Intrinsics.checkNotNullParameter(uniqueIdentifier, "uniqueIdentifier");
        a(str);
        a(str2 == null ? null : o5.d.a(str2));
    }
}
