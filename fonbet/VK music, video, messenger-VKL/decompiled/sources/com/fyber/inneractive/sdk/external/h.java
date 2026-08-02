package com.fyber.inneractive.sdk.external;

/* loaded from: classes12.dex */
public final class h implements Runnable {
    public final /* synthetic */ NativeAdUnitController a;

    public h(NativeAdUnitController nativeAdUnitController) {
        this.a = nativeAdUnitController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a();
    }
}
