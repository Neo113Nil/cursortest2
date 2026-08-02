package com.appsflyer.internal;

/* loaded from: classes.dex */
public abstract class AFh1rSDK extends AFa1pSDK {
    private final boolean force;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f57480i;

    AFh1rSDK() {
        this(null, null, null);
    }

    protected AFh1rSDK(String str, Boolean bool, Boolean bool2) {
        super(str, null, Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false));
        this.f57480i = bool != null ? bool.booleanValue() : true;
        this.force = true;
    }
}
