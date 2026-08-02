package com.braze;

import Ph.AbstractC1459k;
import bo.app.a3;
import bo.app.a9;
import bo.app.b3;
import bo.app.c2;
import bo.app.c3;
import bo.app.d3;
import bo.app.e2;
import bo.app.e3;
import bo.app.f3;
import bo.app.k1;
import bo.app.mf;
import bo.app.ne;
import bo.app.o9;
import bo.app.r2;
import bo.app.s2;
import bo.app.t2;
import bo.app.u2;
import bo.app.ue;
import bo.app.v2;
import bo.app.w2;
import bo.app.x2;
import bo.app.xg;
import bo.app.y2;
import bo.app.y8;
import bo.app.z2;
import com.appsflyer.AdRevenueScheme;
import com.braze.BrazeUser;
import com.braze.enums.BrazeDateFormat;
import com.braze.enums.Gender;
import com.braze.enums.Month;
import com.braze.enums.NotificationSubscriptionType;
import com.braze.models.outgoing.AttributionData;
import com.braze.models.outgoing.BrazeLocation;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.JsonUtils;
import com.braze.support.ValidationUtils;
import com.twilio.voice.EventKeys;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0019\u0010\u0015J\u0017\u0010\u001c\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010#\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001e¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00102\b\u0010%\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b&\u0010\u0015J\u0017\u0010(\u001a\u00020\u00102\b\u0010'\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b(\u0010\u0015J\u0017\u0010*\u001a\u00020\u00102\b\u0010)\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b*\u0010\u0015J\u0015\u0010-\u001a\u00020\u00102\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020\u00102\u0006\u0010/\u001a\u00020+¢\u0006\u0004\b0\u0010.J\u0015\u00102\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u0006¢\u0006\u0004\b2\u0010\u0015J\u0015\u00103\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u0006¢\u0006\u0004\b3\u0010\u0015J\u0017\u00105\u001a\u00020\u00102\b\u00104\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b5\u0010\u0015J\u0017\u00107\u001a\u00020\u00102\b\u00106\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b7\u0010\u0015J\u001d\u0010:\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u0010¢\u0006\u0004\b:\u0010;J\u001d\u0010:\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u001e¢\u0006\u0004\b:\u0010<J\u001d\u0010:\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020=¢\u0006\u0004\b:\u0010>J\u001d\u0010:\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u0006¢\u0006\u0004\b:\u0010\u0012J\u001d\u0010:\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020?¢\u0006\u0004\b:\u0010@J)\u0010:\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020A2\b\b\u0002\u0010B\u001a\u00020\u0010H\u0007¢\u0006\u0004\b:\u0010CJ\u001d\u0010:\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020D¢\u0006\u0004\b:\u0010EJ\u001d\u0010F\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u0006¢\u0006\u0004\bF\u0010\u0012J\u001d\u0010G\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u0006¢\u0006\u0004\bG\u0010\u0012J%\u0010J\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u000e\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060H¢\u0006\u0004\bJ\u0010KJ\u001d\u0010N\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u0010M\u001a\u00020L¢\u0006\u0004\bN\u0010OJ!\u0010Q\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\b\b\u0002\u0010P\u001a\u00020\u001eH\u0007¢\u0006\u0004\bQ\u0010<J\u0015\u0010R\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u0006¢\u0006\u0004\bR\u0010\u0015J\u0017\u0010U\u001a\u00020\u00102\b\u0010T\u001a\u0004\u0018\u00010S¢\u0006\u0004\bU\u0010VJC\u0010]\u001a\u00020\\2\u0006\u0010W\u001a\u00020?2\u0006\u0010X\u001a\u00020?2\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010?2\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010?2\n\b\u0002\u0010[\u001a\u0004\u0018\u00010?H\u0007¢\u0006\u0004\b]\u0010^J%\u0010_\u001a\u00020\\2\u0006\u00108\u001a\u00020\u00062\u0006\u0010W\u001a\u00020?2\u0006\u0010X\u001a\u00020?¢\u0006\u0004\b_\u0010`J)\u0010a\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u00012\b\b\u0002\u0010B\u001a\u00020\u0010H\u0007¢\u0006\u0004\ba\u0010bJ\u001d\u0010c\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00062\u0006\u0010M\u001a\u00020L¢\u0006\u0004\bc\u0010OR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010eR\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010gR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010hR\u0014\u0010j\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR$\u0010l\u001a\u00020\u00062\u0006\u0010l\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bm\u0010n\"\u0004\bo\u0010p¨\u0006q"}, d2 = {"Lcom/braze/BrazeUser;", "", "Lbo/app/xg;", "userCache", "Lbo/app/a9;", "brazeManager", "", "internalUserId", "Lbo/app/o9;", "locationManager", "Lbo/app/ue;", "serverConfigStorageProvider", "<init>", "(Lbo/app/xg;Lbo/app/a9;Ljava/lang/String;Lbo/app/o9;Lbo/app/ue;)V", "alias", AnnotatedPrivateKey.LABEL, "", "addAlias", "(Ljava/lang/String;Ljava/lang/String;)Z", "firstName", "setFirstName", "(Ljava/lang/String;)Z", "lastName", "setLastName", "email", "setEmail", "Lcom/braze/enums/Gender;", "gender", "setGender", "(Lcom/braze/enums/Gender;)Z", "", "year", "Lcom/braze/enums/Month;", "month", "day", "setDateOfBirth", "(ILcom/braze/enums/Month;I)Z", AdRevenueScheme.COUNTRY, "setCountry", "homeCity", "setHomeCity", "language", "setLanguage", "Lcom/braze/enums/NotificationSubscriptionType;", "emailNotificationSubscriptionType", "setEmailNotificationSubscriptionType", "(Lcom/braze/enums/NotificationSubscriptionType;)Z", "pushNotificationSubscriptionType", "setPushNotificationSubscriptionType", "subscriptionGroupId", "addToSubscriptionGroup", "removeFromSubscriptionGroup", "phoneNumber", "setPhoneNumber", "lineId", "setLineId", "key", EventKeys.VALUE_KEY, "setCustomUserAttribute", "(Ljava/lang/String;Z)Z", "(Ljava/lang/String;I)Z", "", "(Ljava/lang/String;F)Z", "", "(Ljava/lang/String;D)Z", "Lorg/json/JSONObject;", "merge", "(Ljava/lang/String;Lorg/json/JSONObject;Z)Z", "Lorg/json/JSONArray;", "(Ljava/lang/String;Lorg/json/JSONArray;)Z", "addToCustomAttributeArray", "removeFromCustomAttributeArray", "", EventKeys.VALUES_KEY, "setCustomAttributeArray", "(Ljava/lang/String;[Ljava/lang/String;)Z", "", "secondsFromEpoch", "setCustomUserAttributeToSecondsFromEpoch", "(Ljava/lang/String;J)Z", "incrementValue", "incrementCustomUserAttribute", "unsetCustomUserAttribute", "Lcom/braze/models/outgoing/AttributionData;", "attributionData", "setAttributionData", "(Lcom/braze/models/outgoing/AttributionData;)Z", "latitude", "longitude", "altitude", "accuracy", "verticalAccuracy", "", "setLastKnownLocation", "(DDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "setLocationCustomAttribute", "(Ljava/lang/String;DD)V", "setCustomAttribute", "(Ljava/lang/String;Ljava/lang/Object;Z)Z", "setCustomAttributeToSecondsFromEpoch", "Lbo/app/xg;", "Lbo/app/a9;", "Ljava/lang/String;", "Lbo/app/o9;", "Lbo/app/ue;", "Ljava/util/concurrent/locks/ReentrantLock;", "userIdLock", "Ljava/util/concurrent/locks/ReentrantLock;", "userId", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BrazeUser {
    private final a9 brazeManager;
    private volatile String internalUserId;
    private final o9 locationManager;
    private final ue serverConfigStorageProvider;
    private final xg userCache;
    private final ReentrantLock userIdLock;

    public BrazeUser(xg userCache, a9 brazeManager, String internalUserId, o9 locationManager, ue serverConfigStorageProvider) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addAlias$lambda$0() {
        return "Invalid alias parameter: alias is required to be non-null and non-empty. Not adding alias.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addAlias$lambda$1() {
        return "Invalid label parameter: label is required to be non-null and non-empty. Not adding alias.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addAlias$lambda$3(String str) {
        return "Failed to set alias: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addToCustomAttributeArray$lambda$0() {
        return "Custom attribute key was invalid. Not adding to attribute array.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addToCustomAttributeArray$lambda$1(String str) {
        return "Failed to add custom attribute with key '" + str + "'.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addToSubscriptionGroup$lambda$0() {
        return "Invalid subscription group ID: subscription group ID is required to be non-null and non-empty. Not adding user to subscription group.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String addToSubscriptionGroup$lambda$2(String str) {
        return "Failed to add user to subscription group " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String incrementCustomUserAttribute$lambda$0(String str, int i10) {
        return "Failed to increment custom attribute " + str + " by " + i10 + ".";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeFromCustomAttributeArray$lambda$0() {
        return "Custom attribute key was invalid. Not removing from attribute array.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeFromCustomAttributeArray$lambda$1(String str) {
        return "Failed to remove custom attribute with key '" + str + "'.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeFromSubscriptionGroup$lambda$0() {
        return "Invalid subscription group ID: subscription group ID is required to be non-null and non-empty. Not removing user from subscription group.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeFromSubscriptionGroup$lambda$2(String str) {
        return "Failed to remove user from subscription group " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setAttributionData$lambda$0() {
        return "Failed to set attribution data.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCountry$lambda$0() {
        return "Invalid country parameter: country is required to be non-blank. Not setting country.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCountry$lambda$1(String str) {
        return "Failed to set country to: " + str;
    }

    public static /* synthetic */ boolean setCustomAttribute$default(BrazeUser brazeUser, String str, Object obj, boolean z10, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return brazeUser.setCustomAttribute(str, obj, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomAttribute$lambda$0() {
        return "Custom attribute key cannot be null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomAttribute$lambda$1$0(String str, Object obj) {
        return "Could not add unsupported custom attribute value with key: " + str + " and value: " + obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomAttribute$lambda$1$1(String str, Object obj) {
        return "Could not build NestedCustomAttributeEvent for key " + str + " and " + obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomAttributeArray$lambda$0(String str) {
        return "Failed to set custom attribute array with key: '" + str + "'.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttribute$lambda$0(String str) {
        return "Failed to set custom boolean attribute " + str + ".";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttribute$lambda$1(String str) {
        return "Failed to set custom integer attribute " + str + ".";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttribute$lambda$2(String str) {
        return "Failed to set custom float attribute " + str + ".";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttribute$lambda$4(String str) {
        return "Failed to set custom string attribute " + str + ".";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttribute$lambda$5(String str) {
        return "Failed to set custom double attribute " + str + ".";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttribute$lambda$6(String str, JSONObject jSONObject) {
        return "Failed to set custom json attribute " + str + " with value \n" + JsonUtils.getPrettyPrintedString(jSONObject) + ".";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttribute$lambda$7(String str, JSONArray jSONArray) {
        return "Failed to set custom json attribute " + str + " with value \n" + JsonUtils.getPrettyPrintedString(jSONArray) + ".";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setCustomUserAttributeToSecondsFromEpoch$lambda$0(String str, long j10) {
        return "Failed to set custom attribute " + str + " to " + j10 + " seconds from epoch.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setDateOfBirth$lambda$0(int i10, Month month, int i11) {
        return "Failed to set date of birth to: " + i10 + "-" + month.getValue() + "-" + i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setEmail$lambda$0() {
        return "Invalid email parameter: email is required to be non-empty. Not setting email.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setEmail$lambda$2$0(String str) {
        return "Email address is not valid: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setEmail$lambda$3(String str) {
        return "Failed to set email to: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setEmailNotificationSubscriptionType$lambda$0(NotificationSubscriptionType notificationSubscriptionType) {
        return "Failed to set email notification subscription to: " + notificationSubscriptionType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setFirstName$lambda$0() {
        return "Invalid first name parameter: first name is required to be non-empty. Not setting first name.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setFirstName$lambda$1(String str) {
        return "Failed to set first name to: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setGender$lambda$0(Gender gender) {
        return "Failed to set gender to: " + gender;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setHomeCity$lambda$0() {
        return "Invalid home city parameter: home city is required to be non-blank. Not setting home city.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setHomeCity$lambda$1(String str) {
        return "Failed to set home city to: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLanguage$lambda$0() {
        return "Invalid language parameter: language is required to be non-empty. Not setting language.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLanguage$lambda$1(String str) {
        return "Failed to set language to: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLastKnownLocation$lambda$0() {
        return "Failed to manually set location.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLastName$lambda$0() {
        return "Invalid last name parameter: last name is required to be non-empty. Not setting last name.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLastName$lambda$1(String str) {
        return "Failed to set last name to: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLineId$lambda$0() {
        return "Invalid LINE ID parameter: LINE ID is required to be non-empty or null. Not setting LINE ID.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLineId$lambda$2$0(String str) {
        return "LINE ID is longer than 33 characters: Failed to set LINE ID: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLineId$lambda$3(String str) {
        return "Failed to set LINE ID to: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLocationCustomAttribute$lambda$0() {
        return "Custom location attribute key was invalid. Not setting attribute.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLocationCustomAttribute$lambda$1(double d10, double d11) {
        return "Cannot set custom location attribute due with invalid latitude '" + d10 + " and longitude '" + d11 + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setLocationCustomAttribute$lambda$3(String str, double d10, double d11) {
        return "Failed to set custom location attribute with key '" + str + "' and latitude '" + d10 + "' and longitude '" + d11 + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setPhoneNumber$lambda$0() {
        return "Invalid phone number parameter: phone number is required to be non-empty. Not setting phone number.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setPhoneNumber$lambda$2$0(String str) {
        return "Phone number contains invalid characters (allowed are digits, spaces, or any of the following +.-()): " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setPhoneNumber$lambda$3(String str) {
        return "Failed to set phone number to: " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setPushNotificationSubscriptionType$lambda$0(NotificationSubscriptionType notificationSubscriptionType) {
        return "Failed to set push notification subscription to: " + notificationSubscriptionType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unsetCustomUserAttribute$lambda$0() {
        return "Custom attribute key cannot be null.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unsetCustomUserAttribute$lambda$1(String str) {
        return "Failed to unset custom attribute " + str + ".";
    }

    public final boolean addAlias(final String alias, String label) {
        BrazeUser brazeUser;
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(label, "label");
        if (StringsKt.isBlank(alias)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.I4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String addAlias$lambda$0;
                    addAlias$lambda$0 = BrazeUser.addAlias$lambda$0();
                    return addAlias$lambda$0;
                }
            }, 6, (Object) null);
            return false;
        }
        if (StringsKt.isBlank(label)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.K4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String addAlias$lambda$1;
                    addAlias$lambda$1 = BrazeUser.addAlias$lambda$1();
                    return addAlias$lambda$1;
                }
            }, 6, (Object) null);
            return false;
        }
        try {
            y8 s10 = k1.f25630g.s(alias, label);
            if (s10 == null) {
                return false;
            }
            brazeUser = this;
            try {
                return ((e2) brazeUser.brazeManager).a(s10);
            } catch (Exception e10) {
                e = e10;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f29470E, (Throwable) e, false, new Function0() { // from class: H3.L4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String addAlias$lambda$3;
                        addAlias$lambda$3 = BrazeUser.addAlias$lambda$3(alias);
                        return addAlias$lambda$3;
                    }
                }, 4, (Object) null);
                return false;
            }
        } catch (Exception e11) {
            e = e11;
            brazeUser = this;
        }
    }

    public final boolean addToCustomAttributeArray(final String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            if (!com.braze.support.c.a(key, this.serverConfigStorageProvider.e())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.t4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String addToCustomAttributeArray$lambda$0;
                        addToCustomAttributeArray$lambda$0 = BrazeUser.addToCustomAttributeArray$lambda$0();
                        return addToCustomAttributeArray$lambda$0;
                    }
                }, 6, (Object) null);
                return false;
            }
            if (!com.braze.support.c.c(value)) {
                return false;
            }
            y8 a10 = k1.f25630g.a(ValidationUtils.ensureBrazeFieldLength(key), ValidationUtils.ensureBrazeFieldLength(value));
            if (a10 == null) {
                return false;
            }
            return ((e2) this.brazeManager).a(a10);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: H3.u4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String addToCustomAttributeArray$lambda$1;
                    addToCustomAttributeArray$lambda$1 = BrazeUser.addToCustomAttributeArray$lambda$1(key);
                    return addToCustomAttributeArray$lambda$1;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean addToSubscriptionGroup(final String subscriptionGroupId) {
        BrazeUser brazeUser;
        Intrinsics.checkNotNullParameter(subscriptionGroupId, "subscriptionGroupId");
        try {
            if (StringsKt.isBlank(subscriptionGroupId)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.Z3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String addToSubscriptionGroup$lambda$0;
                        addToSubscriptionGroup$lambda$0 = BrazeUser.addToSubscriptionGroup$lambda$0();
                        return addToSubscriptionGroup$lambda$0;
                    }
                }, 6, (Object) null);
                return false;
            }
            y8 a10 = k1.f25630g.a(subscriptionGroupId, mf.f25759a);
            if (a10 == null) {
                return true;
            }
            brazeUser = this;
            try {
                ((e2) brazeUser.brazeManager).a(a10);
                return true;
            } catch (Exception e10) {
                e = e10;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f29473W, (Throwable) e, false, new Function0() { // from class: H3.a4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String addToSubscriptionGroup$lambda$2;
                        addToSubscriptionGroup$lambda$2 = BrazeUser.addToSubscriptionGroup$lambda$2(subscriptionGroupId);
                        return addToSubscriptionGroup$lambda$2;
                    }
                }, 4, (Object) null);
                return false;
            }
        } catch (Exception e11) {
            e = e11;
            brazeUser = this;
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

    public final boolean incrementCustomUserAttribute(final String key, final int incrementValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            if (!com.braze.support.c.a(key, this.serverConfigStorageProvider.e())) {
                return false;
            }
            y8 a10 = k1.f25630g.a(ValidationUtils.ensureBrazeFieldLength(key), incrementValue);
            if (a10 == null) {
                return false;
            }
            return ((e2) this.brazeManager).a(a10);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: H3.W3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String incrementCustomUserAttribute$lambda$0;
                    incrementCustomUserAttribute$lambda$0 = BrazeUser.incrementCustomUserAttribute$lambda$0(key, incrementValue);
                    return incrementCustomUserAttribute$lambda$0;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean removeFromCustomAttributeArray(final String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            if (!com.braze.support.c.a(key, this.serverConfigStorageProvider.e())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.S4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String removeFromCustomAttributeArray$lambda$0;
                        removeFromCustomAttributeArray$lambda$0 = BrazeUser.removeFromCustomAttributeArray$lambda$0();
                        return removeFromCustomAttributeArray$lambda$0;
                    }
                }, 6, (Object) null);
                return false;
            }
            if (!com.braze.support.c.c(value)) {
                return false;
            }
            y8 q10 = k1.f25630g.q(ValidationUtils.ensureBrazeFieldLength(key), ValidationUtils.ensureBrazeFieldLength(value));
            if (q10 == null) {
                return false;
            }
            return ((e2) this.brazeManager).a(q10);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: H3.S3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String removeFromCustomAttributeArray$lambda$1;
                    removeFromCustomAttributeArray$lambda$1 = BrazeUser.removeFromCustomAttributeArray$lambda$1(key);
                    return removeFromCustomAttributeArray$lambda$1;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean removeFromSubscriptionGroup(final String subscriptionGroupId) {
        BrazeUser brazeUser;
        Intrinsics.checkNotNullParameter(subscriptionGroupId, "subscriptionGroupId");
        try {
            if (StringsKt.isBlank(subscriptionGroupId)) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.y4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String removeFromSubscriptionGroup$lambda$0;
                        removeFromSubscriptionGroup$lambda$0 = BrazeUser.removeFromSubscriptionGroup$lambda$0();
                        return removeFromSubscriptionGroup$lambda$0;
                    }
                }, 6, (Object) null);
                return false;
            }
            y8 a10 = k1.f25630g.a(subscriptionGroupId, mf.f25760b);
            if (a10 == null) {
                return true;
            }
            brazeUser = this;
            try {
                ((e2) brazeUser.brazeManager).a(a10);
                return true;
            } catch (Exception e10) {
                e = e10;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f29473W, (Throwable) e, false, new Function0() { // from class: H3.J4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String removeFromSubscriptionGroup$lambda$2;
                        removeFromSubscriptionGroup$lambda$2 = BrazeUser.removeFromSubscriptionGroup$lambda$2(subscriptionGroupId);
                        return removeFromSubscriptionGroup$lambda$2;
                    }
                }, 4, (Object) null);
                return false;
            }
        } catch (Exception e11) {
            e = e11;
            brazeUser = this;
        }
    }

    public final boolean setAttributionData(AttributionData attributionData) {
        try {
            AbstractC1459k.d(ne.f25833a, null, null, new r2(this, attributionData, null), 3, null);
            return true;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: H3.B4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String attributionData$lambda$0;
                    attributionData$lambda$0 = BrazeUser.setAttributionData$lambda$0();
                    return attributionData$lambda$0;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setCountry(final String country) {
        BrazeUser brazeUser;
        if (country != null) {
            try {
                if (StringsKt.isBlank(country)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.b4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String country$lambda$0;
                            country$lambda$0 = BrazeUser.setCountry$lambda$0();
                            return country$lambda$0;
                        }
                    }, 6, (Object) null);
                    return false;
                }
            } catch (Exception e10) {
                e = e10;
                brazeUser = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f29473W, (Throwable) e, false, new Function0() { // from class: H3.d4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String country$lambda$1;
                        country$lambda$1 = BrazeUser.setCountry$lambda$1(country);
                        return country$lambda$1;
                    }
                }, 4, (Object) null);
                return false;
            }
        }
        brazeUser = this;
        try {
            AbstractC1459k.d(ne.f25833a, null, null, new s2(brazeUser, country, null), 3, null);
            return true;
        } catch (Exception e11) {
            e = e11;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f29473W, (Throwable) e, false, new Function0() { // from class: H3.d4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String country$lambda$1;
                    country$lambda$1 = BrazeUser.setCountry$lambda$1(country);
                    return country$lambda$1;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomAttribute(final String key, final Object value, boolean merge) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!com.braze.support.c.a(key, this.serverConfigStorageProvider.e())) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.T3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String customAttribute$lambda$0;
                    customAttribute$lambda$0 = BrazeUser.setCustomAttribute$lambda$0();
                    return customAttribute$lambda$0;
                }
            }, 6, (Object) null);
            return false;
        }
        final String ensureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength(key);
        final Object a10 = com.braze.support.c.f29479a.a(value, 0);
        if (a10 == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.U3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String customAttribute$lambda$1$0;
                    customAttribute$lambda$1$0 = BrazeUser.setCustomAttribute$lambda$1$0(key, value);
                    return customAttribute$lambda$1$0;
                }
            }, 6, (Object) null);
            return false;
        }
        if (!(a10 instanceof JSONObject) || !merge) {
            AbstractC1459k.d(ne.f25833a, null, null, new t2(this, ensureBrazeFieldLength, a10, null), 3, null);
            return true;
        }
        y8 a11 = k1.f25630g.a(ensureBrazeFieldLength, (JSONObject) a10);
        if (a11 != null) {
            return ((e2) this.brazeManager).a(a11);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.V3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String customAttribute$lambda$1$1;
                customAttribute$lambda$1$1 = BrazeUser.setCustomAttribute$lambda$1$1(ensureBrazeFieldLength, a10);
                return customAttribute$lambda$1$1;
            }
        }, 6, (Object) null);
        return false;
    }

    public final boolean setCustomAttributeArray(final String key, String[] values) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        try {
            if (!com.braze.support.c.a(key, this.serverConfigStorageProvider.e())) {
                return false;
            }
            String ensureBrazeFieldLength = ValidationUtils.ensureBrazeFieldLength(key);
            Intrinsics.checkNotNullParameter(values, "values");
            ArrayList arrayList = new ArrayList(values.length);
            for (String str : values) {
                arrayList.add(ValidationUtils.ensureBrazeFieldLength(str));
            }
            y8 a10 = k1.f25630g.a(ensureBrazeFieldLength, (String[]) arrayList.toArray(new String[0]));
            if (a10 == null) {
                return false;
            }
            return ((e2) this.brazeManager).a(a10);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: H3.O4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String customAttributeArray$lambda$0;
                    customAttributeArray$lambda$0 = BrazeUser.setCustomAttributeArray$lambda$0(key);
                    return customAttributeArray$lambda$0;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomAttributeToSecondsFromEpoch(String key, long secondsFromEpoch) {
        Intrinsics.checkNotNullParameter(key, "key");
        return setCustomAttribute$default(this, key, DateTimeUtils.createDate(secondsFromEpoch), false, 4, null);
    }

    public final boolean setCustomUserAttribute(String key, boolean value) {
        String str;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            str = key;
        } catch (Exception e10) {
            e = e10;
            str = key;
        }
        try {
            return setCustomAttribute$default(this, str, Boolean.valueOf(value), false, 4, null);
        } catch (Exception e11) {
            e = e11;
            final String str2 = str;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e, false, new Function0() { // from class: H3.C4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String customUserAttribute$lambda$0;
                    customUserAttribute$lambda$0 = BrazeUser.setCustomUserAttribute$lambda$0(str2);
                    return customUserAttribute$lambda$0;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttributeToSecondsFromEpoch(final String key, final long secondsFromEpoch) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return setCustomAttributeToSecondsFromEpoch(key, secondsFromEpoch);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: H3.s4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String customUserAttributeToSecondsFromEpoch$lambda$0;
                    customUserAttributeToSecondsFromEpoch$lambda$0 = BrazeUser.setCustomUserAttributeToSecondsFromEpoch$lambda$0(key, secondsFromEpoch);
                    return customUserAttributeToSecondsFromEpoch$lambda$0;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setDateOfBirth(int year, final Month month, int day) {
        final int i10;
        final int i11;
        Intrinsics.checkNotNullParameter(month, "month");
        try {
            i10 = year;
            i11 = day;
        } catch (Exception e10) {
            e = e10;
            i10 = year;
            i11 = day;
        }
        try {
            AbstractC1459k.d(ne.f25833a, null, null, new u2(this, DateTimeUtils.formatDate$default(DateTimeUtils.createDate$default(i10, month.getValue(), i11, 0, 0, 0, 56, null), BrazeDateFormat.SHORT, null, 2, null), null), 3, null);
            return true;
        } catch (Exception e11) {
            e = e11;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e, false, new Function0() { // from class: H3.A4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String dateOfBirth$lambda$0;
                    dateOfBirth$lambda$0 = BrazeUser.setDateOfBirth$lambda$0(i10, month, i11);
                    return dateOfBirth$lambda$0;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setEmail(final String email) {
        BrazeUser brazeUser;
        String str;
        if (email != null) {
            try {
                if (StringsKt.isBlank(email)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.P4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String email$lambda$0;
                            email$lambda$0 = BrazeUser.setEmail$lambda$0();
                            return email$lambda$0;
                        }
                    }, 6, (Object) null);
                    return false;
                }
            } catch (Exception e10) {
                e = e10;
                brazeUser = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f29473W, (Throwable) e, false, new Function0() { // from class: H3.R4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String email$lambda$3;
                        email$lambda$3 = BrazeUser.setEmail$lambda$3(email);
                        return email$lambda$3;
                    }
                }, 4, (Object) null);
                return false;
            }
        }
        if (email != null) {
            int length = email.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = Intrinsics.compare((int) email.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    }
                    length--;
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            str = email.subSequence(i10, length + 1).toString();
        } else {
            str = null;
        }
        if (str != null && !ValidationUtils.isValidEmailAddress(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: H3.Q4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String email$lambda$2$0;
                    email$lambda$2$0 = BrazeUser.setEmail$lambda$2$0(email);
                    return email$lambda$2$0;
                }
            }, 7, (Object) null);
            return false;
        }
        brazeUser = this;
        try {
            AbstractC1459k.d(ne.f25833a, null, null, new v2(brazeUser, str, null), 3, null);
            return true;
        } catch (Exception e11) {
            e = e11;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f29473W, (Throwable) e, false, new Function0() { // from class: H3.R4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String email$lambda$3;
                    email$lambda$3 = BrazeUser.setEmail$lambda$3(email);
                    return email$lambda$3;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setEmailNotificationSubscriptionType(final NotificationSubscriptionType emailNotificationSubscriptionType) {
        Intrinsics.checkNotNullParameter(emailNotificationSubscriptionType, "emailNotificationSubscriptionType");
        try {
            AbstractC1459k.d(ne.f25833a, null, null, new w2(this, emailNotificationSubscriptionType, null), 3, null);
            return true;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: H3.i4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String emailNotificationSubscriptionType$lambda$0;
                    emailNotificationSubscriptionType$lambda$0 = BrazeUser.setEmailNotificationSubscriptionType$lambda$0(NotificationSubscriptionType.this);
                    return emailNotificationSubscriptionType$lambda$0;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setFirstName(final String firstName) {
        BrazeUser brazeUser;
        if (firstName != null) {
            try {
                if (StringsKt.isBlank(firstName)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.p4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String firstName$lambda$0;
                            firstName$lambda$0 = BrazeUser.setFirstName$lambda$0();
                            return firstName$lambda$0;
                        }
                    }, 6, (Object) null);
                    return false;
                }
            } catch (Exception e10) {
                e = e10;
                brazeUser = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f29473W, (Throwable) e, false, new Function0() { // from class: H3.q4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String firstName$lambda$1;
                        firstName$lambda$1 = BrazeUser.setFirstName$lambda$1(firstName);
                        return firstName$lambda$1;
                    }
                }, 4, (Object) null);
                return false;
            }
        }
        brazeUser = this;
        try {
            AbstractC1459k.d(ne.f25833a, null, null, new x2(brazeUser, firstName, null), 3, null);
            return true;
        } catch (Exception e11) {
            e = e11;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f29473W, (Throwable) e, false, new Function0() { // from class: H3.q4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String firstName$lambda$1;
                    firstName$lambda$1 = BrazeUser.setFirstName$lambda$1(firstName);
                    return firstName$lambda$1;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setGender(final Gender gender) {
        try {
            AbstractC1459k.d(ne.f25833a, null, null, new y2(this, gender, null), 3, null);
            return true;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: H3.k4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String gender$lambda$0;
                    gender$lambda$0 = BrazeUser.setGender$lambda$0(Gender.this);
                    return gender$lambda$0;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setHomeCity(final String homeCity) {
        BrazeUser brazeUser;
        if (homeCity != null) {
            try {
                if (StringsKt.isBlank(homeCity)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.x4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String homeCity$lambda$0;
                            homeCity$lambda$0 = BrazeUser.setHomeCity$lambda$0();
                            return homeCity$lambda$0;
                        }
                    }, 6, (Object) null);
                    return false;
                }
            } catch (Exception e10) {
                e = e10;
                brazeUser = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f29473W, (Throwable) e, false, new Function0() { // from class: H3.z4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String homeCity$lambda$1;
                        homeCity$lambda$1 = BrazeUser.setHomeCity$lambda$1(homeCity);
                        return homeCity$lambda$1;
                    }
                }, 4, (Object) null);
                return false;
            }
        }
        brazeUser = this;
        try {
            AbstractC1459k.d(ne.f25833a, null, null, new z2(brazeUser, homeCity, null), 3, null);
            return true;
        } catch (Exception e11) {
            e = e11;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f29473W, (Throwable) e, false, new Function0() { // from class: H3.z4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String homeCity$lambda$1;
                    homeCity$lambda$1 = BrazeUser.setHomeCity$lambda$1(homeCity);
                    return homeCity$lambda$1;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setLanguage(final String language) {
        BrazeUser brazeUser;
        if (language != null) {
            try {
                if (StringsKt.isBlank(language)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.m4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String language$lambda$0;
                            language$lambda$0 = BrazeUser.setLanguage$lambda$0();
                            return language$lambda$0;
                        }
                    }, 6, (Object) null);
                    return false;
                }
            } catch (Exception e10) {
                e = e10;
                brazeUser = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f29473W, (Throwable) e, false, new Function0() { // from class: H3.o4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String language$lambda$1;
                        language$lambda$1 = BrazeUser.setLanguage$lambda$1(language);
                        return language$lambda$1;
                    }
                }, 4, (Object) null);
                return false;
            }
        }
        brazeUser = this;
        try {
            AbstractC1459k.d(ne.f25833a, null, null, new a3(brazeUser, language, null), 3, null);
            return true;
        } catch (Exception e11) {
            e = e11;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f29473W, (Throwable) e, false, new Function0() { // from class: H3.o4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String language$lambda$1;
                    language$lambda$1 = BrazeUser.setLanguage$lambda$1(language);
                    return language$lambda$1;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final void setLastKnownLocation(double latitude, double longitude, Double altitude, Double accuracy, Double verticalAccuracy) {
        try {
            ((c2) this.locationManager).a(new BrazeLocation(latitude, longitude, altitude, accuracy, verticalAccuracy));
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: H3.D4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String lastKnownLocation$lambda$0;
                    lastKnownLocation$lambda$0 = BrazeUser.setLastKnownLocation$lambda$0();
                    return lastKnownLocation$lambda$0;
                }
            }, 4, (Object) null);
        }
    }

    public final boolean setLastName(final String lastName) {
        BrazeUser brazeUser;
        if (lastName != null) {
            try {
                if (StringsKt.isBlank(lastName)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.v4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String lastName$lambda$0;
                            lastName$lambda$0 = BrazeUser.setLastName$lambda$0();
                            return lastName$lambda$0;
                        }
                    }, 6, (Object) null);
                    return false;
                }
            } catch (Exception e10) {
                e = e10;
                brazeUser = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f29473W, (Throwable) e, false, new Function0() { // from class: H3.w4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String lastName$lambda$1;
                        lastName$lambda$1 = BrazeUser.setLastName$lambda$1(lastName);
                        return lastName$lambda$1;
                    }
                }, 4, (Object) null);
                return false;
            }
        }
        brazeUser = this;
        try {
            AbstractC1459k.d(ne.f25833a, null, null, new b3(brazeUser, lastName, null), 3, null);
            return true;
        } catch (Exception e11) {
            e = e11;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f29473W, (Throwable) e, false, new Function0() { // from class: H3.w4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String lastName$lambda$1;
                    lastName$lambda$1 = BrazeUser.setLastName$lambda$1(lastName);
                    return lastName$lambda$1;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setLineId(final String lineId) {
        BrazeUser brazeUser;
        final String str;
        if (lineId != null) {
            try {
                if (StringsKt.isBlank(lineId)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.E4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String lineId$lambda$0;
                            lineId$lambda$0 = BrazeUser.setLineId$lambda$0();
                            return lineId$lambda$0;
                        }
                    }, 6, (Object) null);
                    return false;
                }
            } catch (Exception e10) {
                e = e10;
                brazeUser = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f29473W, (Throwable) e, false, new Function0() { // from class: H3.G4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String lineId$lambda$3;
                        lineId$lambda$3 = BrazeUser.setLineId$lambda$3(lineId);
                        return lineId$lambda$3;
                    }
                }, 4, (Object) null);
                return false;
            }
        }
        if (lineId != null) {
            int length = lineId.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = Intrinsics.compare((int) lineId.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    }
                    length--;
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            str = lineId.subSequence(i10, length + 1).toString();
        } else {
            str = null;
        }
        if (str != null && !ValidationUtils.isValidLineId(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.F4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String lineId$lambda$2$0;
                    lineId$lambda$2$0 = BrazeUser.setLineId$lambda$2$0(str);
                    return lineId$lambda$2$0;
                }
            }, 6, (Object) null);
            return false;
        }
        brazeUser = this;
        try {
            AbstractC1459k.d(ne.f25833a, null, null, new c3(brazeUser, str, null), 3, null);
            return true;
        } catch (Exception e11) {
            e = e11;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f29473W, (Throwable) e, false, new Function0() { // from class: H3.G4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String lineId$lambda$3;
                    lineId$lambda$3 = BrazeUser.setLineId$lambda$3(lineId);
                    return lineId$lambda$3;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final void setLocationCustomAttribute(final String key, final double latitude, final double longitude) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            if (!com.braze.support.c.a(key, this.serverConfigStorageProvider.e())) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.f4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String locationCustomAttribute$lambda$0;
                        locationCustomAttribute$lambda$0 = BrazeUser.setLocationCustomAttribute$lambda$0();
                        return locationCustomAttribute$lambda$0;
                    }
                }, 6, (Object) null);
                return;
            }
            if (ValidationUtils.isValidLocation(latitude, longitude)) {
                y8 a10 = k1.f25630g.a(ValidationUtils.ensureBrazeFieldLength(key), latitude, longitude);
                if (a10 != null) {
                    ((e2) this.brazeManager).a(a10);
                    return;
                }
                return;
            }
            try {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.g4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String locationCustomAttribute$lambda$1;
                        locationCustomAttribute$lambda$1 = BrazeUser.setLocationCustomAttribute$lambda$1(latitude, longitude);
                        return locationCustomAttribute$lambda$1;
                    }
                }, 6, (Object) null);
            } catch (Exception e10) {
                e = e10;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e, false, new Function0() { // from class: H3.h4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String locationCustomAttribute$lambda$3;
                        locationCustomAttribute$lambda$3 = BrazeUser.setLocationCustomAttribute$lambda$3(key, latitude, longitude);
                        return locationCustomAttribute$lambda$3;
                    }
                }, 4, (Object) null);
            }
        } catch (Exception e11) {
            e = e11;
        }
    }

    public final boolean setPhoneNumber(final String phoneNumber) {
        BrazeUser brazeUser;
        final String str;
        if (phoneNumber != null) {
            try {
                if (StringsKt.isBlank(phoneNumber)) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.R3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            String phoneNumber$lambda$0;
                            phoneNumber$lambda$0 = BrazeUser.setPhoneNumber$lambda$0();
                            return phoneNumber$lambda$0;
                        }
                    }, 6, (Object) null);
                    return false;
                }
            } catch (Exception e10) {
                e = e10;
                brazeUser = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f29473W, (Throwable) e, false, new Function0() { // from class: H3.n4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String phoneNumber$lambda$3;
                        phoneNumber$lambda$3 = BrazeUser.setPhoneNumber$lambda$3(phoneNumber);
                        return phoneNumber$lambda$3;
                    }
                }, 4, (Object) null);
                return false;
            }
        }
        if (phoneNumber != null) {
            int length = phoneNumber.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = Intrinsics.compare((int) phoneNumber.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    }
                    length--;
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            str = phoneNumber.subSequence(i10, length + 1).toString();
        } else {
            str = null;
        }
        if (str != null && !ValidationUtils.isValidPhoneNumber(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.c4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String phoneNumber$lambda$2$0;
                    phoneNumber$lambda$2$0 = BrazeUser.setPhoneNumber$lambda$2$0(str);
                    return phoneNumber$lambda$2$0;
                }
            }, 6, (Object) null);
            return false;
        }
        brazeUser = this;
        try {
            AbstractC1459k.d(ne.f25833a, null, null, new d3(brazeUser, str, null), 3, null);
            return true;
        } catch (Exception e11) {
            e = e11;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) brazeUser, BrazeLogger.Priority.f29473W, (Throwable) e, false, new Function0() { // from class: H3.n4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String phoneNumber$lambda$3;
                    phoneNumber$lambda$3 = BrazeUser.setPhoneNumber$lambda$3(phoneNumber);
                    return phoneNumber$lambda$3;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setPushNotificationSubscriptionType(final NotificationSubscriptionType pushNotificationSubscriptionType) {
        Intrinsics.checkNotNullParameter(pushNotificationSubscriptionType, "pushNotificationSubscriptionType");
        try {
            AbstractC1459k.d(ne.f25833a, null, null, new e3(this, pushNotificationSubscriptionType, null), 3, null);
            return true;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: H3.H4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String pushNotificationSubscriptionType$lambda$0;
                    pushNotificationSubscriptionType$lambda$0 = BrazeUser.setPushNotificationSubscriptionType$lambda$0(NotificationSubscriptionType.this);
                    return pushNotificationSubscriptionType$lambda$0;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean unsetCustomUserAttribute(final String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            if (com.braze.support.c.a(key, this.serverConfigStorageProvider.e())) {
                AbstractC1459k.d(ne.f25833a, null, null, new f3(this, key, null), 3, null);
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: H3.X3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String unsetCustomUserAttribute$lambda$0;
                    unsetCustomUserAttribute$lambda$0 = BrazeUser.unsetCustomUserAttribute$lambda$0();
                    return unsetCustomUserAttribute$lambda$0;
                }
            }, 6, (Object) null);
            return false;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: H3.Y3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String unsetCustomUserAttribute$lambda$1;
                    unsetCustomUserAttribute$lambda$1 = BrazeUser.unsetCustomUserAttribute$lambda$1(key);
                    return unsetCustomUserAttribute$lambda$1;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String key, int value) {
        String str;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            str = key;
        } catch (Exception e10) {
            e = e10;
            str = key;
        }
        try {
            return setCustomAttribute$default(this, str, Integer.valueOf(value), false, 4, null);
        } catch (Exception e11) {
            e = e11;
            final String str2 = str;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e, false, new Function0() { // from class: H3.l4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String customUserAttribute$lambda$1;
                    customUserAttribute$lambda$1 = BrazeUser.setCustomUserAttribute$lambda$1(str2);
                    return customUserAttribute$lambda$1;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String key, float value) {
        String str;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            str = key;
        } catch (Exception e10) {
            e = e10;
            str = key;
        }
        try {
            return setCustomAttribute$default(this, str, Float.valueOf(value), false, 4, null);
        } catch (Exception e11) {
            e = e11;
            final String str2 = str;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e, false, new Function0() { // from class: H3.j4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String customUserAttribute$lambda$2;
                    customUserAttribute$lambda$2 = BrazeUser.setCustomUserAttribute$lambda$2(str2);
                    return customUserAttribute$lambda$2;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttribute(final String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            return setCustomAttribute$default(this, key, value, false, 4, null);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: H3.e4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String customUserAttribute$lambda$4;
                    customUserAttribute$lambda$4 = BrazeUser.setCustomUserAttribute$lambda$4(key);
                    return customUserAttribute$lambda$4;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttribute(String key, double value) {
        String str;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            str = key;
        } catch (Exception e10) {
            e = e10;
            str = key;
        }
        try {
            return setCustomAttribute$default(this, str, Double.valueOf(value), false, 4, null);
        } catch (Exception e11) {
            e = e11;
            final String str2 = str;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e, false, new Function0() { // from class: H3.N4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String customUserAttribute$lambda$5;
                    customUserAttribute$lambda$5 = BrazeUser.setCustomUserAttribute$lambda$5(str2);
                    return customUserAttribute$lambda$5;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttribute(final String key, final JSONObject value, boolean merge) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            return setCustomAttribute(key, value, merge);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: H3.M4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String customUserAttribute$lambda$6;
                    customUserAttribute$lambda$6 = BrazeUser.setCustomUserAttribute$lambda$6(key, value);
                    return customUserAttribute$lambda$6;
                }
            }, 4, (Object) null);
            return false;
        }
    }

    public final boolean setCustomUserAttribute(final String key, final JSONArray value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            return setCustomAttribute$default(this, key, value, false, 4, null);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) e10, false, new Function0() { // from class: H3.r4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    String customUserAttribute$lambda$7;
                    customUserAttribute$lambda$7 = BrazeUser.setCustomUserAttribute$lambda$7(key, value);
                    return customUserAttribute$lambda$7;
                }
            }, 4, (Object) null);
            return false;
        }
    }
}
