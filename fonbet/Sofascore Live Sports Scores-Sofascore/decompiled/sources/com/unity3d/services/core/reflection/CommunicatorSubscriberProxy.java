package com.unity3d.services.core.reflection;

import android.os.Bundle;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.unity3d.ads.core.log.Logger;
import defpackage.lnb;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0002\u0018\u0019B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\f\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\fH\u0016J2\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0010\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0002\u0010\u0014J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u000eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/unity3d/services/core/reflection/CommunicatorSubscriberProxy;", "Lcom/unity3d/services/core/reflection/GenericListenerProxy;", "communicatorId", "", "topic", "messageListener", "Lcom/unity3d/services/core/reflection/CommunicatorSubscriberProxy$CommunicatorMessageListener;", "logger", "Lcom/unity3d/ads/core/log/Logger;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/unity3d/services/core/reflection/CommunicatorSubscriberProxy$CommunicatorMessageListener;Lcom/unity3d/ads/core/log/Logger;)V", "getProxyClass", "Ljava/lang/Class;", "invoke", "", "proxy", InneractiveMediationDefs.GENDER_MALE, "Ljava/lang/reflect/Method;", "args", "", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "handleMessage", "", PglCryptUtils.KEY_MESSAGE, "CommunicatorMessageListener", "Companion", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommunicatorSubscriberProxy extends GenericListenerProxy {

    @NotNull
    private static final String GET_COMMUNICATOR_ID = "getCommunicatorId";

    @NotNull
    private static final String MESSAGE_CLASS = "com.applovin.communicator.AppLovinCommunicatorMessage";

    @NotNull
    private static final String ON_MESSAGE_RECEIVED = "onMessageReceived";

    @NotNull
    private static final String SUBSCRIBER_CLASS = "com.applovin.communicator.AppLovinCommunicatorSubscriber";

    @NotNull
    private final String communicatorId;

    @NotNull
    private final Logger logger;

    @NotNull
    private final CommunicatorMessageListener messageListener;

    @NotNull
    private final String topic;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/unity3d/services/core/reflection/CommunicatorSubscriberProxy$CommunicatorMessageListener;", "", CommunicatorSubscriberProxy.ON_MESSAGE_RECEIVED, "", "messageData", "Landroid/os/Bundle;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface CommunicatorMessageListener {
        void onMessageReceived(@NotNull Bundle messageData);
    }

    public CommunicatorSubscriberProxy(@NotNull String str, @NotNull String str2, @NotNull CommunicatorMessageListener communicatorMessageListener, @NotNull Logger logger) {
        str.getClass();
        str2.getClass();
        communicatorMessageListener.getClass();
        logger.getClass();
        this.communicatorId = str;
        this.topic = str2;
        this.messageListener = communicatorMessageListener;
        this.logger = logger;
    }

    private final void handleMessage(Object message) {
        try {
            Class<?> cls = Class.forName(MESSAGE_CLASS);
            Object invoke = cls.getMethod("getTopic", null).invoke(message, null);
            if (Intrinsics.c(this.topic, invoke instanceof String ? (String) invoke : null)) {
                Object invoke2 = cls.getMethod("getMessageData", null).invoke(message, null);
                if (invoke2 instanceof Bundle) {
                    this.messageListener.onMessageReceived((Bundle) invoke2);
                }
            }
        } catch (Exception e) {
            this.logger.trace("Failed to handle proxy communicator message", e);
        }
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy
    @NotNull
    public Class<?> getProxyClass() throws ClassNotFoundException {
        return Class.forName(SUBSCRIBER_CLASS);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.unity3d.services.core.reflection.GenericListenerProxy, java.lang.reflect.InvocationHandler
    @Nullable
    public Object invoke(@NotNull Object proxy, @NotNull Method m, @Nullable Object[] args) throws Throwable {
        proxy.getClass();
        m.getClass();
        String name = m.getName();
        if (name != null) {
            boolean z = false;
            switch (name.hashCode()) {
                case -1776922004:
                    if (name.equals("toString")) {
                        return lnb.q(new StringBuilder("CommunicatorSubscriber("), this.communicatorId, ')');
                    }
                    break;
                case -1437096151:
                    if (name.equals(ON_MESSAGE_RECEIVED) && args != null && args.length != 0) {
                        handleMessage(args[0]);
                    }
                    return null;
                case -1295482945:
                    if (name.equals("equals")) {
                        if (args != null && args.length == 1 && proxy == args[0]) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                    break;
                case 147696667:
                    if (name.equals("hashCode")) {
                        return Integer.valueOf(System.identityHashCode(proxy));
                    }
                    break;
                case 1974057286:
                    if (name.equals(GET_COMMUNICATOR_ID)) {
                        return this.communicatorId;
                    }
                    break;
            }
        }
        return null;
    }
}
