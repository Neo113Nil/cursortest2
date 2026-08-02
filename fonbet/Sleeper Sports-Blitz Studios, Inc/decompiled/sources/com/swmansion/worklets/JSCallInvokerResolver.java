package com.swmansion.worklets;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;

/* loaded from: classes8.dex */
public class JSCallInvokerResolver {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public static CallInvokerHolderImpl getJSCallInvokerHolder(ReactApplicationContext reactApplicationContext) {
        try {
            try {
                return (CallInvokerHolderImpl) reactApplicationContext.getClass().getMethod("getJSCallInvokerHolder", null).invoke(reactApplicationContext, null);
            } catch (Exception e) {
                throw new RuntimeException("Failed to get JSCallInvokerHolder", e);
            }
        } catch (Exception unused) {
            Object invoke = reactApplicationContext.getClass().getMethod("getCatalystInstance", null).invoke(reactApplicationContext, null);
            return (CallInvokerHolderImpl) invoke.getClass().getMethod("getJSCallInvokerHolder", null).invoke(invoke, null);
        }
    }
}
