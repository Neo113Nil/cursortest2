package com.appsflyer.internal;

/* loaded from: classes6.dex */
public abstract class AFh1nSDK extends AFa1mSDK {
    private final boolean copy;
    private final boolean toString;

    AFh1nSDK() {
        this(null, null, null);
    }

    protected AFh1nSDK(String str, Boolean bool, Boolean bool2) {
        super(str, null, Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false));
        this.copy = bool != null ? bool.booleanValue() : true;
        this.toString = true;
    }
}
