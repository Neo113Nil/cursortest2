package com.unity3d.services.core.reflection;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import xsna.pn00;
import xsna.zcl;

/* compiled from: AppLovinCommunicatorBridge.kt */
/* loaded from: classes14.dex */
public final class AppLovinCommunicatorBridge extends GenericBridge {
    private static final String CLASS_NAME = "com.applovin.communicator.AppLovinCommunicator";
    public static final Companion Companion = new Companion(null);
    private static final String GET_INSTANCE = "getInstance";
    private static final String SUBSCRIBE = "subscribe";
    private static final String UNSUBSCRIBE = "unsubscribe";
    private final Context context;

    /* compiled from: AppLovinCommunicatorBridge.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map<String, Class<?>[]> buildFunctionMap() {
            LinkedHashMap m = pn00.m(new Pair("getInstance", new Class[]{Context.class}));
            try {
                Class<?> cls = Class.forName("com.applovin.communicator.AppLovinCommunicatorSubscriber");
                m.put(AppLovinCommunicatorBridge.SUBSCRIBE, new Class[]{cls, String.class});
                m.put(AppLovinCommunicatorBridge.UNSUBSCRIBE, new Class[]{cls, String.class});
            } catch (ClassNotFoundException unused) {
            }
            return m;
        }

        private Companion() {
        }
    }

    public AppLovinCommunicatorBridge(Context context) {
        super(Companion.buildFunctionMap(), false);
        this.context = context;
    }

    private final Object getCommunicatorInstance() {
        return callNonVoidMethod("getInstance", null, this.context);
    }

    @Override // com.unity3d.services.core.reflection.GenericBridge
    public String getClassName() {
        return CLASS_NAME;
    }

    public final Object subscribe(CommunicatorSubscriberProxy communicatorSubscriberProxy, String str) {
        Object communicatorInstance = getCommunicatorInstance();
        if (communicatorInstance == null) {
            return null;
        }
        try {
            Object proxyInstance = communicatorSubscriberProxy.getProxyInstance();
            callVoidMethod(SUBSCRIBE, communicatorInstance, proxyInstance, str);
            return proxyInstance;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public final void unsubscribe(Object obj, String str) {
        Object communicatorInstance = getCommunicatorInstance();
        if (communicatorInstance == null) {
            return;
        }
        callVoidMethod(UNSUBSCRIBE, communicatorInstance, obj, str);
    }
}
