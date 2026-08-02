package com.braze;

import androidx.autofill.HintConstants;
import bo.app.j2;
import bo.app.k5;
import bo.app.w6;
import bo.app.x1;
import bo.app.x5;
import bo.app.z1;
import com.braze.enums.BrazeDateFormat;
import com.braze.enums.Gender;
import com.braze.enums.Month;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.models.IBrazeLocation;
import com.braze.models.outgoing.AttributionData;
import com.braze.models.outgoing.BrazeLocation;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import com.braze.support.ValidationUtils;
import io.sentry.protocol.Device;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B1\b\u0000\u0012\u0006\u0010U\u001a\u00020T\u0012\u0006\u0010W\u001a\u00020V\u0012\u0006\u0010J\u001a\u00020\u0002\u0012\u0006\u0010Y\u001a\u00020X\u0012\u0006\u0010[\u001a\u00020Z¢\u0006\u0004\b\\\u0010]J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0010\u0010\b\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rJ\u001e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0010J\u0010\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u001b\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cJ\u000e\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001cJ\u000e\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0002J\u000e\u0010#\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0002J\u0010\u0010%\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010\u0002J\u0016\u0010(\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0005J\u0016\u0010(\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0010J\u0016\u0010(\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020)J\u0016\u0010(\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020*J\u0016\u0010(\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0002J\u0016\u0010(\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020+J\"\u0010(\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020\u0005H\u0007J\u0016\u0010(\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020.J\u0016\u0010/\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0002J\u0016\u00100\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u0002J%\u00103\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00022\u000e\u00102\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000201¢\u0006\u0004\b3\u00104J\u000e\u00105\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0002J\u0016\u00107\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00022\u0006\u00106\u001a\u00020*J\u001a\u00109\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00022\b\b\u0002\u00108\u001a\u00020\u0010H\u0007J\u000e\u0010:\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0002J\u0010\u0010=\u001a\u00020\u00052\b\u0010<\u001a\u0004\u0018\u00010;JC\u0010D\u001a\u00020C2\u0006\u0010>\u001a\u00020+2\u0006\u0010?\u001a\u00020+2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010+H\u0007¢\u0006\u0004\bD\u0010EJ\u001e\u0010F\u001a\u00020C2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010>\u001a\u00020+2\u0006\u0010?\u001a\u00020+J\u000e\u0010G\u001a\u00020C2\u0006\u0010&\u001a\u00020\u0002J\"\u0010H\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00012\b\b\u0002\u0010-\u001a\u00020\u0005H\u0007J\u0016\u0010I\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00022\u0006\u00106\u001a\u00020*R\u0016\u0010J\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR$\u0010O\u001a\u00020\u00022\u0006\u0010O\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010S¨\u0006^"}, d2 = {"Lcom/braze/BrazeUser;", "", "", "alias", "label", "", "addAlias", "firstName", "setFirstName", "lastName", "setLastName", "email", "setEmail", "Lcom/braze/enums/Gender;", HintConstants.AUTOFILL_HINT_GENDER, "setGender", "", "year", "Lcom/braze/enums/Month;", "month", "day", "setDateOfBirth", "country", "setCountry", "homeCity", "setHomeCity", Device.JsonKeys.LANGUAGE, "setLanguage", "Lcom/braze/enums/NotificationSubscriptionType;", "emailNotificationSubscriptionType", "setEmailNotificationSubscriptionType", "pushNotificationSubscriptionType", "setPushNotificationSubscriptionType", "subscriptionGroupId", "addToSubscriptionGroup", "removeFromSubscriptionGroup", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "setPhoneNumber", "key", "value", "setCustomUserAttribute", "", "", "", "Lorg/json/JSONObject;", "merge", "Lorg/json/JSONArray;", "addToCustomAttributeArray", "removeFromCustomAttributeArray", "", "values", "setCustomAttributeArray", "(Ljava/lang/String;[Ljava/lang/String;)Z", "setCustomUserAttributeToNow", "secondsFromEpoch", "setCustomUserAttributeToSecondsFromEpoch", "incrementValue", "incrementCustomUserAttribute", "unsetCustomUserAttribute", "Lcom/braze/models/outgoing/AttributionData;", "attributionData", "setAttributionData", IBrazeLocation.LATITUDE, IBrazeLocation.LONGITUDE, IBrazeLocation.ALTITUDE, "accuracy", "verticalAccuracy", "", "setLastKnownLocation", "(DDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "setLocationCustomAttribute", "unsetLocationCustomAttribute", "setCustomAttribute", "setCustomAttributeToSecondsFromEpoch", "internalUserId", "Ljava/lang/String;", "Ljava/util/concurrent/locks/ReentrantLock;", "userIdLock", "Ljava/util/concurrent/locks/ReentrantLock;", "userId", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "Lbo/app/w6;", "userCache", "Lbo/app/z1;", "brazeManager", "Lbo/app/j2;", "locationManager", "Lbo/app/k5;", "serverConfigStorageProvider", "<init>", "(Lbo/app/w6;Lbo/app/z1;Ljava/lang/String;Lbo/app/j2;Lbo/app/k5;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class BrazeUser {
    private final z1 brazeManager;
    private volatile String internalUserId;
    private final j2 locationManager;
    private final k5 serverConfigStorageProvider;
    private final w6 userCache;
    private final ReentrantLock userIdLock;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class a extends Lambda implements Function0<String> {
        public static final a b = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Invalid alias parameter: alias is required to be non-null and non-empty. Not adding alias.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class a0 extends Lambda implements Function0<String> {
        final /* synthetic */ String b;
        final /* synthetic */ JSONArray c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(String str, JSONArray jSONArray) {
            super(0);
            this.b = str;
            this.c = jSONArray;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to set custom json attribute " + this.b + " with value \n" + JsonUtils.getPrettyPrintedString(this.c) + '.';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class a1 extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a1(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to unset custom attribute " + this.b + '.';
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
            return "Invalid label parameter: label is required to be non-null and non-empty. Not adding alias.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b0 extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b0(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to set custom attribute " + this.b + " to now.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b1 extends Lambda implements Function0<String> {
        public static final b1 b = new b1();

        b1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Custom location attribute key was invalid. Not setting attribute.";
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
            return Intrinsics.stringPlus("Failed to set alias: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c0 extends Lambda implements Function0<String> {
        final /* synthetic */ String b;
        final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c0(String str, long j) {
            super(0);
            this.b = str;
            this.c = j;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to set custom attribute " + this.b + " to " + this.c + " seconds from epoch.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c1 extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c1(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to unset custom location attribute with key '" + this.b + '\'';
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
            return "Custom attribute key was invalid. Not adding to attribute array.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d0 extends Lambda implements Function0<String> {
        final /* synthetic */ int b;
        final /* synthetic */ Month c;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d0(int i, Month month, int i2) {
            super(0);
            this.b = i;
            this.c = month;
            this.d = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to set date of birth to: " + this.b + '-' + this.c.getValue() + '-' + this.d;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d1 extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d1(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("User object user id set to: ", this.b);
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
            return "Failed to add custom attribute with key '" + this.b + "'.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class e0 extends Lambda implements Function0<String> {
        public static final e0 b = new e0();

        e0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Invalid email parameter: email is required to be non-empty. Not setting email.";
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
            return "Invalid subscription group ID: subscription group ID is required to be non-null and non-empty. Not adding user to subscription group.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class f0 extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f0(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Email address is not valid: ", this.b);
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
            return Intrinsics.stringPlus("Failed to add user to subscription group ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class g0 extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g0(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to set email to: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class h extends Lambda implements Function0<String> {
        final /* synthetic */ String b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, int i) {
            super(0);
            this.b = str;
            this.c = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to increment custom attribute " + this.b + " by " + this.c + '.';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class h0 extends Lambda implements Function0<String> {
        final /* synthetic */ NotificationSubscriptionType b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h0(NotificationSubscriptionType notificationSubscriptionType) {
            super(0);
            this.b = notificationSubscriptionType;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to set email notification subscription to: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class i extends Lambda implements Function0<String> {
        public static final i b = new i();

        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Custom attribute key was invalid. Not removing from attribute array.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class i0 extends Lambda implements Function0<String> {
        public static final i0 b = new i0();

        i0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Invalid first name parameter: first name is required to be non-empty. Not setting first name.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class j extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to remove custom attribute with key '" + this.b + "'.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class j0 extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j0(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to set first name to: ", this.b);
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
            return "Invalid subscription group ID: subscription group ID is required to be non-null and non-empty. Not removing user from subscription group.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class k0 extends Lambda implements Function0<String> {
        final /* synthetic */ Gender b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k0(Gender gender) {
            super(0);
            this.b = gender;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to set gender to: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class l extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to remove user from subscription group ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class l0 extends Lambda implements Function0<String> {
        public static final l0 b = new l0();

        l0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Invalid home city parameter: home city is required to be non-blank. Not setting home city.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class m extends Lambda implements Function0<String> {
        public static final m b = new m();

        m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to set attribution data.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class m0 extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m0(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to set home city to: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class n extends Lambda implements Function0<String> {
        public static final n b = new n();

        n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Invalid country parameter: country is required to be non-blank. Not setting country.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class n0 extends Lambda implements Function0<String> {
        public static final n0 b = new n0();

        n0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Invalid language parameter: language is required to be non-empty. Not setting language.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class o extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to set country to: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class o0 extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o0(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to set language to: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class p extends Lambda implements Function0<String> {
        public static final p b = new p();

        p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Custom attribute key cannot be null.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class p0 extends Lambda implements Function0<String> {
        public static final p0 b = new p0();

        p0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to manually set location.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class q extends Lambda implements Function0<String> {
        final /* synthetic */ String b;
        final /* synthetic */ Object c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(String str, Object obj) {
            super(0);
            this.b = str;
            this.c = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Could not add unsupported custom attribute value with key: " + this.b + " and value: " + this.c;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class q0 extends Lambda implements Function0<String> {
        public static final q0 b = new q0();

        q0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Invalid last name parameter: last name is required to be non-empty. Not setting last name.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class r extends Lambda implements Function0<String> {
        final /* synthetic */ String b;
        final /* synthetic */ Object c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(String str, Object obj) {
            super(0);
            this.b = str;
            this.c = obj;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Could not build NestedCustomAttributeEvent for key " + this.b + " and " + this.c;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class r0 extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r0(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to set last name to: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class s extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to set custom attribute array with key: '" + this.b + "'.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class s0 extends Lambda implements Function0<String> {
        public static final s0 b = new s0();

        s0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Custom location attribute key was invalid. Not setting attribute.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class t extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to set custom boolean attribute " + this.b + '.';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class t0 extends Lambda implements Function0<String> {
        final /* synthetic */ double b;
        final /* synthetic */ double c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t0(double d, double d2) {
            super(0);
            this.b = d;
            this.c = d2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Cannot set custom location attribute due with invalid latitude '" + this.b + " and longitude '" + this.c + '\'';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class u extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to set custom integer attribute " + this.b + '.';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class u0 extends Lambda implements Function0<String> {
        final /* synthetic */ String b;
        final /* synthetic */ double c;
        final /* synthetic */ double d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u0(String str, double d, double d2) {
            super(0);
            this.b = str;
            this.c = d;
            this.d = d2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to set custom location attribute with key '" + this.b + "' and latitude '" + this.c + "' and longitude '" + this.d + '\'';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class v extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to set custom float attribute " + this.b + '.';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class v0 extends Lambda implements Function0<String> {
        public static final v0 b = new v0();

        v0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Invalid phone number parameter: phone number is required to be non-empty. Not setting phone number.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class w extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to set custom long attribute " + this.b + '.';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class w0 extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w0(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Phone number contains invalid characters (allowed are digits, spaces, or any of the following +.-()): ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class x extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to set custom string attribute " + this.b + '.';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class x0 extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x0(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to set phone number to: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class y extends Lambda implements Function0<String> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to set custom double attribute " + this.b + '.';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class y0 extends Lambda implements Function0<String> {
        final /* synthetic */ NotificationSubscriptionType b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y0(NotificationSubscriptionType notificationSubscriptionType) {
            super(0);
            this.b = notificationSubscriptionType;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to set push notification subscription to: ", this.b);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class z extends Lambda implements Function0<String> {
        final /* synthetic */ String b;
        final /* synthetic */ JSONObject c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(String str, JSONObject jSONObject) {
            super(0);
            this.b = str;
            this.c = jSONObject;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to set custom json attribute " + this.b + " with value \n" + JsonUtils.getPrettyPrintedString(this.c) + '.';
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class z0 extends Lambda implements Function0<String> {
        public static final z0 b = new z0();

        z0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Custom attribute key cannot be null.";
        }
    }

    public BrazeUser(w6 userCache, z1 brazeManager, String internalUserId, j2 locationManager, k5 serverConfigStorageProvider) {
        Intrinsics.checkNotNullParameter(userCache, "userCache");
        Intrinsics.checkNotNullParameter(brazeManager, "brazeManager");
        Intrinsics.checkNotNullParameter(internalUserId, "internalUserId");
        Intrinsics.checkNotNullParameter(locationManager, "locationManager");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        this.userCache = userCache;
        this.brazeManager = brazeManager;
        this.internalUserId = internalUserId;
        this.locationManager = locationManager;
        this.serverConfigStorageProvider = serverConfigStorageProvider;
        this.userIdLock = new ReentrantLock();
    }

    public static /* synthetic */ boolean incrementCustomUserAttribute$default(BrazeUser brazeUser, String str, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        return brazeUser.incrementCustomUserAttribute(str, i2);
    }

    public static /* synthetic */ boolean setCustomAttribute$default(BrazeUser brazeUser, String str, Object obj, boolean z2, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return brazeUser.setCustomAttribute(str, obj, z2);
    }

    public static /* synthetic */ boolean setCustomUserAttribute$default(BrazeUser brazeUser, String str, JSONObject jSONObject, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return brazeUser.setCustomUserAttribute(str, jSONObject, z2);
    }

    public static /* synthetic */ void setLastKnownLocation$default(BrazeUser brazeUser, double d2, double d3, Double d4, Double d5, Double d6, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            d4 = null;
        }
        if ((i2 & 8) != 0) {
            d5 = null;
        }
        if ((i2 & 16) != 0) {
            d6 = null;
        }
        brazeUser.setLastKnownLocation(d2, d3, d4, d5, d6);
    }

    public final boolean addAlias(String alias, String label) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(label, "label");
        if (StringsKt.isBlank(alias)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, a.b, 2, (Object) null);
            return false;
        }
        if (StringsKt.isBlank(label)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, b.b, 2, (Object) null);
            return false;
        }
        try {
            x1 g2 = bo.app.j.h.g(alias, label);
            if (g2 == null) {
                return false;
            }
            return this.brazeManager.a(g2);
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e2, new c(alias));
            return false;
        }
    }

    public final boolean addToCustomAttributeArray(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
        } catch (Exception e2) {
            e = e2;
        }
        try {
            if (!bo.app.d0.a(key, this.serverConfigStorageProvider.b())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, d.b, 2, (Object) null);
                return false;
            }
            if (!bo.app.d0.b(value)) {
                return false;
            }
            x1 a2 = bo.app.j.h.a(ValidationUtils.ensureBrazeFieldLength(key), ValidationUtils.ensureBrazeFieldLength(value));
            if (a2 == null) {
                return false;
            }
            return this.brazeManager.a(a2);
        } catch (Exception e3) {
            e = e3;
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e, new e(key));
            return false;
        }
    }

    public final boolean addToSubscriptionGroup(String subscriptionGroupId) {
        Intrinsics.checkNotNullParameter(subscriptionGroupId, "subscriptionGroupId");
        try {
        } catch (Exception e2) {
            e = e2;
        }
        try {
            if (StringsKt.isBlank(subscriptionGroupId)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, f.b, 2, (Object) null);
                return false;
            }
            x1 a2 = bo.app.j.h.a(subscriptionGroupId, x5.SUBSCRIBED);
            if (a2 == null) {
                return true;
            }
            this.brazeManager.a(a2);
            return true;
        } catch (Exception e3) {
            e = e3;
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e, new g(subscriptionGroupId));
            return false;
        }
    }

    public final String getUserId() {
        ReentrantLock reentrantLock = this.userIdLock;
        reentrantLock.lock();
        try {
            return this.internalUserId;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean incrementCustomUserAttribute(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return incrementCustomUserAttribute$default(this, key, 0, 2, null);
    }

    public final boolean incrementCustomUserAttribute(String key, int incrementValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            if (!bo.app.d0.a(key, this.serverConfigStorageProvider.b())) {
                return false;
            }
            x1 a2 = bo.app.j.h.a(ValidationUtils.ensureBrazeFieldLength(key), incrementValue);
            if (a2 == null) {
                return false;
            }
            return this.brazeManager.a(a2);
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, new h(key, incrementValue));
            return false;
        }
    }

    public final boolean removeFromCustomAttributeArray(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
        } catch (Exception e2) {
            e = e2;
        }
        try {
            if (!bo.app.d0.a(key, this.serverConfigStorageProvider.b())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, i.b, 2, (Object) null);
                return false;
            }
            if (!bo.app.d0.b(value)) {
                return false;
            }
            x1 f2 = bo.app.j.h.f(ValidationUtils.ensureBrazeFieldLength(key), ValidationUtils.ensureBrazeFieldLength(value));
            if (f2 == null) {
                return false;
            }
            return this.brazeManager.a(f2);
        } catch (Exception e3) {
            e = e3;
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e, new j(key));
            return false;
        }
    }

    public final boolean removeFromSubscriptionGroup(String subscriptionGroupId) {
        Intrinsics.checkNotNullParameter(subscriptionGroupId, "subscriptionGroupId");
        try {
        } catch (Exception e2) {
            e = e2;
        }
        try {
            if (StringsKt.isBlank(subscriptionGroupId)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, k.b, 2, (Object) null);
                return false;
            }
            x1 a2 = bo.app.j.h.a(subscriptionGroupId, x5.UNSUBSCRIBED);
            if (a2 == null) {
                return true;
            }
            this.brazeManager.a(a2);
            return true;
        } catch (Exception e3) {
            e = e3;
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e, new l(subscriptionGroupId));
            return false;
        }
    }

    public final boolean setAttributionData(AttributionData attributionData) {
        try {
            this.userCache.a(attributionData);
            return true;
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, m.b);
            return false;
        }
    }

    public final boolean setCountry(String country) {
        try {
            if (country != null) {
                try {
                    if (StringsKt.isBlank(country)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, n.b, 2, (Object) null);
                        return false;
                    }
                } catch (Exception e2) {
                    e = e2;
                    BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e, new o(country));
                    return false;
                }
            }
            this.userCache.a(country);
            return true;
        } catch (Exception e3) {
            e = e3;
        }
    }

    public final boolean setCustomAttribute(String key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return setCustomAttribute$default(this, key, value, false, 4, null);
    }

    public final boolean setCustomAttribute(String key, Object value, boolean merge) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!bo.app.d0.a(key, this.serverConfigStorageProvider.b())) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, p.b, 2, (Object) null);
            return false;
        }
        String ensureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength(key);
        Object a2 = bo.app.d0.a(bo.app.d0.a, value, 0, 2, null);
        if (a2 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new q(key, value), 2, (Object) null);
            return false;
        }
        if (!(a2 instanceof JSONObject) || !merge) {
            return this.userCache.a(ensureBrazeFieldLength, a2);
        }
        x1 a3 = bo.app.j.h.a(ensureBrazeFieldLength, (JSONObject) a2);
        if (a3 != null) {
            return this.brazeManager.a(a3);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new r(ensureBrazeFieldLength, a2), 2, (Object) null);
        return false;
    }

    public final boolean setCustomAttributeArray(String key, String[] values) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        try {
            if (!bo.app.d0.a(key, this.serverConfigStorageProvider.b())) {
                return false;
            }
            x1 a2 = bo.app.j.h.a(ValidationUtils.ensureBrazeFieldLength(key), bo.app.d0.a(values));
            if (a2 == null) {
                return false;
            }
            return this.brazeManager.a(a2);
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, new s(key));
            return false;
        }
    }

    public final boolean setCustomAttributeToSecondsFromEpoch(String key, long secondsFromEpoch) {
        Intrinsics.checkNotNullParameter(key, "key");
        return setCustomAttribute$default(this, key, DateTimeUtils.createDate(secondsFromEpoch), false, 4, null);
    }

    public final boolean setCustomUserAttribute(String key, JSONObject value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return setCustomUserAttribute$default(this, key, value, false, 4, null);
    }

    public final boolean setCustomUserAttribute(String key, boolean value) {
        String str;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            str = key;
        } catch (Exception e2) {
            e = e2;
            str = key;
        }
        try {
            return setCustomAttribute$default(this, str, Boolean.valueOf(value), false, 4, null);
        } catch (Exception e3) {
            e = e3;
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e, new t(str));
            return false;
        }
    }

    public final boolean setCustomUserAttributeToNow(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return setCustomAttributeToSecondsFromEpoch(key, DateTimeUtils.nowInSeconds());
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, new b0(key));
            return false;
        }
    }

    public final boolean setCustomUserAttributeToSecondsFromEpoch(String key, long secondsFromEpoch) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return setCustomAttributeToSecondsFromEpoch(key, secondsFromEpoch);
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, new c0(key, secondsFromEpoch));
            return false;
        }
    }

    public final boolean setDateOfBirth(int year, Month month, int day) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(month, "month");
        try {
            i2 = year;
            i3 = day;
        } catch (Exception e2) {
            e = e2;
            i2 = year;
            i3 = day;
        }
        try {
            return this.userCache.b(DateTimeUtils.formatDate$default(DateTimeUtils.createDate$default(i2, month.getValue(), i3, 0, 0, 0, 56, null), BrazeDateFormat.SHORT, null, 2, null));
        } catch (Exception e3) {
            e = e3;
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e, new d0(i2, month, i3));
            return false;
        }
    }

    public final boolean setEmail(String email) {
        String obj;
        if (email != null) {
            try {
                if (StringsKt.isBlank(email)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, e0.b, 2, (Object) null);
                    return false;
                }
            } catch (Exception e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, new g0(email));
                return false;
            }
        }
        if (email == null) {
            obj = null;
        } else {
            int length = email.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                boolean z3 = Intrinsics.compare((int) email.charAt(!z2 ? i2 : length), 32) <= 0;
                if (z2) {
                    if (!z3) {
                        break;
                    }
                    length--;
                } else if (z3) {
                    i2++;
                } else {
                    z2 = true;
                }
            }
            obj = email.subSequence(i2, length + 1).toString();
        }
        if (obj != null && !ValidationUtils.isValidEmailAddress(obj)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, new f0(email), 3, (Object) null);
            return false;
        }
        return this.userCache.c(obj);
    }

    public final boolean setEmailNotificationSubscriptionType(NotificationSubscriptionType emailNotificationSubscriptionType) {
        Intrinsics.checkNotNullParameter(emailNotificationSubscriptionType, "emailNotificationSubscriptionType");
        try {
            this.userCache.a(emailNotificationSubscriptionType);
            return true;
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, new h0(emailNotificationSubscriptionType));
            return false;
        }
    }

    public final boolean setFirstName(String firstName) {
        try {
            if (firstName != null) {
                try {
                    if (StringsKt.isBlank(firstName)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, i0.b, 2, (Object) null);
                        return false;
                    }
                } catch (Exception e2) {
                    e = e2;
                    BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e, new j0(firstName));
                    return false;
                }
            }
            this.userCache.d(firstName);
            return true;
        } catch (Exception e3) {
            e = e3;
        }
    }

    public final boolean setGender(Gender gender) {
        Intrinsics.checkNotNullParameter(gender, "gender");
        try {
            this.userCache.a(gender);
            return true;
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, new k0(gender));
            return false;
        }
    }

    public final boolean setHomeCity(String homeCity) {
        try {
            if (homeCity != null) {
                try {
                    if (StringsKt.isBlank(homeCity)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, l0.b, 2, (Object) null);
                        return false;
                    }
                } catch (Exception e2) {
                    e = e2;
                    BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e, new m0(homeCity));
                    return false;
                }
            }
            this.userCache.e(homeCity);
            return true;
        } catch (Exception e3) {
            e = e3;
        }
    }

    public final boolean setLanguage(String language) {
        try {
            if (language != null) {
                try {
                    if (StringsKt.isBlank(language)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, n0.b, 2, (Object) null);
                        return false;
                    }
                } catch (Exception e2) {
                    e = e2;
                    BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e, new o0(language));
                    return false;
                }
            }
            this.userCache.f(language);
            return true;
        } catch (Exception e3) {
            e = e3;
        }
    }

    public final void setLastKnownLocation(double d2, double d3) {
        setLastKnownLocation$default(this, d2, d3, null, null, null, 28, null);
    }

    public final void setLastKnownLocation(double d2, double d3, Double d4) {
        setLastKnownLocation$default(this, d2, d3, d4, null, null, 24, null);
    }

    public final void setLastKnownLocation(double d2, double d3, Double d4, Double d5) {
        setLastKnownLocation$default(this, d2, d3, d4, d5, null, 16, null);
    }

    public final void setLastKnownLocation(double latitude, double longitude, Double altitude, Double accuracy, Double verticalAccuracy) {
        try {
            this.locationManager.a(new BrazeLocation(latitude, longitude, altitude, accuracy, verticalAccuracy));
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, p0.b);
        }
    }

    public final boolean setLastName(String lastName) {
        try {
            if (lastName != null) {
                try {
                    if (StringsKt.isBlank(lastName)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, q0.b, 2, (Object) null);
                        return false;
                    }
                } catch (Exception e2) {
                    e = e2;
                    BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e, new r0(lastName));
                    return false;
                }
            }
            this.userCache.g(lastName);
            return true;
        } catch (Exception e3) {
            e = e3;
        }
    }

    public final void setLocationCustomAttribute(String key, double latitude, double longitude) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            if (!bo.app.d0.a(key, this.serverConfigStorageProvider.b())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, s0.b, 2, (Object) null);
                return;
            }
            if (ValidationUtils.isValidLocation(latitude, longitude)) {
                x1 a2 = bo.app.j.h.a(ValidationUtils.ensureBrazeFieldLength(key), latitude, longitude);
                if (a2 == null) {
                    return;
                }
                this.brazeManager.a(a2);
                return;
            }
            try {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new t0(latitude, longitude), 2, (Object) null);
            } catch (Exception e2) {
                e = e2;
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e, new u0(key, latitude, longitude));
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    public final boolean setPhoneNumber(String phoneNumber) {
        String obj;
        if (phoneNumber != null) {
            try {
                if (StringsKt.isBlank(phoneNumber)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, v0.b, 2, (Object) null);
                    return false;
                }
            } catch (Exception e2) {
                BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, new x0(phoneNumber));
                return false;
            }
        }
        if (phoneNumber == null) {
            obj = null;
        } else {
            int length = phoneNumber.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                boolean z3 = Intrinsics.compare((int) phoneNumber.charAt(!z2 ? i2 : length), 32) <= 0;
                if (z2) {
                    if (!z3) {
                        break;
                    }
                    length--;
                } else if (z3) {
                    i2++;
                } else {
                    z2 = true;
                }
            }
            obj = phoneNumber.subSequence(i2, length + 1).toString();
        }
        if (obj != null && !ValidationUtils.isValidPhoneNumber(obj)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, new w0(obj), 2, (Object) null);
            return false;
        }
        return this.userCache.h(obj);
    }

    public final boolean setPushNotificationSubscriptionType(NotificationSubscriptionType pushNotificationSubscriptionType) {
        Intrinsics.checkNotNullParameter(pushNotificationSubscriptionType, "pushNotificationSubscriptionType");
        try {
            this.userCache.b(pushNotificationSubscriptionType);
            return true;
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, new y0(pushNotificationSubscriptionType));
            return false;
        }
    }

    public final void setUserId(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new d1(userId), 2, (Object) null);
        ReentrantLock reentrantLock = this.userIdLock;
        reentrantLock.lock();
        try {
            if (!Intrinsics.areEqual(this.internalUserId, "") && !Intrinsics.areEqual(this.internalUserId, userId)) {
                throw new IllegalArgumentException("setExternalId can not be used to change the external ID of a UserCache from a non-empty value to a new value. Was: [" + this.internalUserId + "], tried to change to: [" + userId + AbstractJsonLexerKt.END_LIST);
            }
            this.internalUserId = userId;
            this.userCache.i(userId);
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean unsetCustomUserAttribute(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
        } catch (Exception e2) {
            e = e2;
        }
        try {
            if (bo.app.d0.a(key, this.serverConfigStorageProvider.b())) {
                return this.userCache.j(key);
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, z0.b, 2, (Object) null);
            return false;
        } catch (Exception e3) {
            e = e3;
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e, new a1(key));
            return false;
        }
    }

    public final void unsetLocationCustomAttribute(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
        } catch (Exception e2) {
            e = e2;
        }
        try {
            if (!bo.app.d0.a(key, this.serverConfigStorageProvider.b())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.W, (Throwable) null, b1.b, 2, (Object) null);
                return;
            }
            x1 k2 = bo.app.j.h.k(ValidationUtils.ensureBrazeFieldLength(key));
            if (k2 == null) {
                return;
            }
            this.brazeManager.a(k2);
        } catch (Exception e3) {
            e = e3;
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e, new c1(key));
        }
    }

    public final boolean setCustomUserAttribute(String key, int value) {
        String str;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            str = key;
        } catch (Exception e2) {
            e = e2;
            str = key;
        }
        try {
            return setCustomAttribute$default(this, str, Integer.valueOf(value), false, 4, null);
        } catch (Exception e3) {
            e = e3;
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e, new u(str));
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String key, float value) {
        String str;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            str = key;
        } catch (Exception e2) {
            e = e2;
            str = key;
        }
        try {
            return setCustomAttribute$default(this, str, Float.valueOf(value), false, 4, null);
        } catch (Exception e3) {
            e = e3;
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e, new v(str));
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String key, long value) {
        String str;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            str = key;
        } catch (Exception e2) {
            e = e2;
            str = key;
        }
        try {
            return setCustomAttribute$default(this, str, Long.valueOf(value), false, 4, null);
        } catch (Exception e3) {
            e = e3;
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e, new w(str));
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            return setCustomAttribute$default(this, key, value, false, 4, null);
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, new x(key));
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String key, double value) {
        String str;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            str = key;
        } catch (Exception e2) {
            e = e2;
            str = key;
        }
        try {
            return setCustomAttribute$default(this, str, Double.valueOf(value), false, 4, null);
        } catch (Exception e3) {
            e = e3;
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e, new y(str));
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String key, JSONObject value, boolean merge) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            return setCustomAttribute(key, value, merge);
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, new z(key, value));
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String key, JSONArray value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            return setCustomAttribute$default(this, key, value, false, 4, null);
        } catch (Exception e2) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.W, e2, new a0(key, value));
            return false;
        }
    }
}
