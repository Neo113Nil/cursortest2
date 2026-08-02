package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public interface i extends d {
    public static final a a = a.a;

    public static final class a {
        public static final /* synthetic */ a a = new a();

        public final i a(l worker) {
            Intrinsics.checkNotNullParameter(worker, "worker");
            return new j(worker);
        }
    }
}
