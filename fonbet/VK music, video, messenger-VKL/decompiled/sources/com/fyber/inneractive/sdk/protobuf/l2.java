package com.fyber.inneractive.sdk.protobuf;

/* loaded from: classes12.dex */
public abstract class l2 {
    public static final k2 a;
    public static final k2 b;

    static {
        k2 k2Var = null;
        try {
            k2Var = (k2) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = k2Var;
        b = new k2();
    }
}
