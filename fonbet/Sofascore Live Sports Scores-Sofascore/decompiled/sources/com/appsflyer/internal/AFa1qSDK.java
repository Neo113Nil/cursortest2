package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import defpackage.jp5;
import defpackage.kp5;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B%\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\fj\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013"}, d2 = {"Lcom/appsflyer/internal/AFa1qSDK;", "", "", "p0", "Lkotlin/Function1;", "", "", "p1", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/functions/Function1;)V", "d", "Ljava/lang/String;", "registerClient", "AFLogger", "Lkotlin/jvm/functions/Function1;", "unregisterClient", "AFKeystoreWrapper", "force", "w", "v"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFa1qSDK {
    private static final /* synthetic */ jp5 e;
    private static final /* synthetic */ AFa1qSDK[] i;
    private static AFa1qSDK v;

    /* renamed from: AFLogger, reason: from kotlin metadata */
    @NotNull
    public Function1<Object, Unit> d;

    /* renamed from: d, reason: from kotlin metadata */
    @NotNull
    final String registerClient;
    private static AFa1qSDK unregisterClient = new AFa1qSDK("DebugLog", 0, "debug_mode", new a(0));
    private static AFa1qSDK AFKeystoreWrapper = new AFa1qSDK("DisableAdvertisingIdentifiers", 1, "disable_advertising_identifiers", new a(1));
    private static AFa1qSDK registerClient = new AFa1qSDK("MinTimeBetweenSessions", 2, "min_time_between_sessions", new a(2));
    private static AFa1qSDK force = new AFa1qSDK("CurrencyCode", 3, "currency_code", new a(3));
    private static AFa1qSDK w = new AFa1qSDK("Host", 4, "host", new a(4));

    static {
        AFa1qSDK aFa1qSDK = new AFa1qSDK("DdlTimeout", 5, "ddlTimeout", new a(5));
        v = aFa1qSDK;
        AFa1qSDK[] aFa1qSDKArr = {unregisterClient, AFKeystoreWrapper, registerClient, force, w, aFa1qSDK};
        i = aFa1qSDKArr;
        e = new kp5(aFa1qSDKArr);
    }

    private AFa1qSDK(String str, int i2, String str2, Function1 function1) {
        this.registerClient = str2;
        this.d = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AFKeystoreWrapper(Object obj) {
        obj.getClass();
        AFa1zSDK.d().setDebugLog(((Boolean) obj).booleanValue());
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AFLogger(Object obj) {
        obj.getClass();
        AFa1zSDK.d().setMinTimeBetweenSessions(((Integer) obj).intValue());
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Object obj) {
        obj.getClass();
        AFa1zSDK.d().setCurrencyCode(obj.toString());
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(Object obj) {
        obj.getClass();
        AppsFlyerLib.getInstance().setDeepLinkTimeout(((Integer) obj).intValue());
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit registerClient(Object obj) {
        obj.getClass();
        AFa1zSDK.d().setDisableAdvertisingIdentifiers(((Boolean) obj).booleanValue());
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unregisterClient(Object obj) {
        obj.getClass();
        HashMap hashMap = (HashMap) obj;
        Object obj2 = hashMap.get("host");
        Object obj3 = hashMap.get("prefix");
        if (obj2 == null) {
            AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.INIT_BY_CONFIG, "Unsupported/Missing values - host value is mandatory for setHost method", false, 4, null);
        } else if (obj3 == null) {
            AFa1zSDK.d().setHost(null, obj2.toString());
        } else {
            AFa1zSDK.d().setHost(obj3.toString(), obj2.toString());
        }
        return Unit.a;
    }

    public static AFa1qSDK valueOf(String str) {
        return (AFa1qSDK) Enum.valueOf(AFa1qSDK.class, str);
    }

    public static AFa1qSDK[] values() {
        return (AFa1qSDK[]) i.clone();
    }

    @NotNull
    public static jp5 unregisterClient() {
        return e;
    }
}
