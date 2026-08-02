package com.appsflyer.internal;

import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import defpackage.wt3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0005\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u0007\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0012\u001a\u00020\u000e2\n\u0010\u0005\u001a\u00060\u000bj\u0002`\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/appsflyer/internal/AFe1pSDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/components/network/http/exceptions/HttpException;", "p0", "Lcom/appsflyer/internal/AFh1fSDK;", "p1", "", "d", "(Lcom/appsflyer/internal/components/network/http/exceptions/HttpException;Lcom/appsflyer/internal/AFh1fSDK;)Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "", "AFLogger", "(Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V", "p2", "AFKeystoreWrapper", "(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFe1pSDK {

    @NotNull
    public static final AFe1pSDK INSTANCE = new AFe1pSDK();

    private AFe1pSDK() {
    }

    private static void AFKeystoreWrapper(StringBuilder p0, String p1, String p2) {
        if (p1 == null || p1.length() == 0) {
            return;
        }
        wt3.A("; ", p2, p0, p1);
    }

    private final void AFLogger(StringBuilder p0, Throwable p1) {
        p0.append(p1.getClass().getSimpleName());
        String message = p1.getMessage();
        if (message != null) {
            if (message.length() <= 0) {
                message = null;
            }
            if (message != null) {
                p0.append(": ");
                p0.append(message);
            }
        }
        Throwable cause = p1.getCause();
        if (cause == null || cause.equals(p1)) {
            return;
        }
        p0.append(" (caused by: ");
        AFLogger(p0, cause);
        p0.append(')');
    }

    @NotNull
    public static final String d(@NotNull HttpException p0, @Nullable AFh1fSDK p1) {
        String obj;
        p0.getClass();
        StringBuilder sb = new StringBuilder();
        AFe1pSDK aFe1pSDK = INSTANCE;
        sb.append("Network error: ");
        Throwable cause = p0.getCause();
        if (cause != null) {
            aFe1pSDK.AFLogger(sb, cause);
        } else {
            String message = p0.getMessage();
            if (message != null) {
                if (message.length() <= 0) {
                    message = null;
                }
                if (message != null) {
                    sb.append(message);
                }
            }
        }
        sb.append("; httpLatencyMs=");
        sb.append(p0.getMetrics().registerClient);
        if (p1 != null) {
            AFh1iSDK aFh1iSDK = p1.d;
            AFh1dSDK AFKeystoreWrapper = aFh1iSDK != null ? aFh1iSDK.AFKeystoreWrapper() : null;
            if (AFKeystoreWrapper != null) {
                sb.append("; networkType=");
                sb.append(AFKeystoreWrapper.registerClient);
                Boolean bool = AFKeystoreWrapper.AFKeystoreWrapper;
                if (bool != null) {
                    sb.append("; ");
                    sb.append("hasInternetCapability=");
                    sb.append(bool.booleanValue());
                }
                Boolean bool2 = AFKeystoreWrapper.d;
                if (bool2 != null) {
                    sb.append("; ");
                    sb.append("hasValidatedCapability=");
                    sb.append(bool2.booleanValue());
                }
                AFKeystoreWrapper(sb, AFKeystoreWrapper.unregisterClient, "dataState=");
                Boolean valueOf = Boolean.valueOf(AFKeystoreWrapper.AFLogger);
                sb.append("; ");
                sb.append("vpnEnabled=");
                String obj2 = valueOf.toString();
                String str = "null";
                if (obj2 == null) {
                    obj2 = "null";
                }
                sb.append(obj2);
                AFKeystoreWrapper(sb, AFKeystoreWrapper.com.mbridge.msdk.setting.i.a java.lang.String, "vpnUnderlyingTransport=");
                if (AFKeystoreWrapper.AFLogger) {
                    AFKeystoreWrapper(sb, AFKeystoreWrapper.force, "devicePrivateVpnAddress=");
                }
                Boolean bool3 = AFKeystoreWrapper.v;
                sb.append("; ");
                sb.append("customDnsEnabled=");
                if (bool3 != null && (obj = bool3.toString()) != null) {
                    str = obj;
                }
                sb.append(str);
                if (Intrinsics.c(AFKeystoreWrapper.v, Boolean.TRUE)) {
                    AFKeystoreWrapper(sb, AFKeystoreWrapper.w, "customDnsServerName=");
                }
            }
        }
        return sb.toString();
    }
}
