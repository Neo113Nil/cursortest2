package com.unity3d.services.core.reflection;

import android.os.Bundle;
import com.unity3d.ads.core.log.Logger;
import java.lang.reflect.Method;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: CommunicatorSubscriberProxy.kt */
/* loaded from: classes14.dex */
public final class CommunicatorSubscriberProxy extends GenericListenerProxy {
    public static final Companion Companion = new Companion(null);
    private static final String GET_COMMUNICATOR_ID = "getCommunicatorId";
    private static final String MESSAGE_CLASS = "com.applovin.communicator.AppLovinCommunicatorMessage";
    private static final String ON_MESSAGE_RECEIVED = "onMessageReceived";
    private static final String SUBSCRIBER_CLASS = "com.applovin.communicator.AppLovinCommunicatorSubscriber";
    private final String communicatorId;
    private final Logger logger;
    private final CommunicatorMessageListener messageListener;
    private final String topic;

    /* compiled from: CommunicatorSubscriberProxy.kt */
    public interface CommunicatorMessageListener {
        void onMessageReceived(Bundle bundle);
    }

    /* compiled from: CommunicatorSubscriberProxy.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public CommunicatorSubscriberProxy(String str, String str2, CommunicatorMessageListener communicatorMessageListener, Logger logger) {
        this.communicatorId = str;
        this.topic = str2;
        this.messageListener = communicatorMessageListener;
        this.logger = logger;
    }

    private final void handleMessage(Object obj) {
        try {
            Class<?> cls = Class.forName(MESSAGE_CLASS);
            Object invoke = cls.getMethod("getTopic", null).invoke(obj, null);
            if (epx.f(this.topic, invoke instanceof String ? (String) invoke : null)) {
                Object invoke2 = cls.getMethod("getMessageData", null).invoke(obj, null);
                if (invoke2 instanceof Bundle) {
                    this.messageListener.onMessageReceived((Bundle) invoke2);
                }
            }
        } catch (Exception e) {
            this.logger.trace("Failed to handle proxy communicator message", e);
        }
    }

    @Override // com.unity3d.services.core.reflection.GenericListenerProxy
    public Class<?> getProxyClass() throws ClassNotFoundException {
        return Class.forName(SUBSCRIBER_CLASS);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.unity3d.services.core.reflection.GenericListenerProxy, java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        String name = method.getName();
        if (name != null) {
            boolean z = false;
            switch (name.hashCode()) {
                case -1776922004:
                    if (name.equals("toString")) {
                        return ho8.a(new StringBuilder("CommunicatorSubscriber("), this.communicatorId, ')');
                    }
                    break;
                case -1437096151:
                    if (name.equals(ON_MESSAGE_RECEIVED) && objArr != null && objArr.length != 0) {
                        handleMessage(objArr[0]);
                    }
                    return null;
                case -1295482945:
                    if (name.equals("equals")) {
                        if (objArr != null && objArr.length == 1 && obj == objArr[0]) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    }
                    break;
                case 147696667:
                    if (name.equals("hashCode")) {
                        return Integer.valueOf(System.identityHashCode(obj));
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
