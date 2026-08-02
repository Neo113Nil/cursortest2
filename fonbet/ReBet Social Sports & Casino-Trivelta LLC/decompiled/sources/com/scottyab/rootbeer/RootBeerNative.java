package com.scottyab.rootbeer;

import xc.AbstractC6820a;

/* loaded from: classes4.dex */
public class RootBeerNative {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f41479a = false;

    static {
        try {
            System.loadLibrary("toolChecker");
            f41479a = true;
        } catch (UnsatisfiedLinkError e10) {
            AbstractC6820a.b(e10);
        }
    }

    public boolean a() {
        return f41479a;
    }

    public native int checkForRoot(Object[] objArr);

    public native int setLogDebugMessages(boolean z10);
}
