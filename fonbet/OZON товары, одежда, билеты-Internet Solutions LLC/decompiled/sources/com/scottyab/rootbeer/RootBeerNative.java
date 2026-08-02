package com.scottyab.rootbeer;

import ru.ozon.android.messenger.framework.data.remote.serialize.a;

/* loaded from: classes9.dex */
public class RootBeerNative {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f60345a = false;

    static {
        try {
            System.loadLibrary("toolChecker");
            f60345a = true;
        } catch (UnsatisfiedLinkError e11) {
            a.a(e11);
        }
    }

    public static boolean a() {
        return f60345a;
    }

    public native int checkForRoot(Object[] objArr);

    public native int setLogDebugMessages(boolean z11);
}
