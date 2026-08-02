package com.facebook.ads.redexgen.core;

import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: com.facebook.ads.redexgen.X.Lg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class CallableC1865Lg implements Callable<Void> {
    public final File A00;
    public final /* synthetic */ AbstractC2891kr A01;

    public CallableC1865Lg(AbstractC2891kr abstractC2891kr, File file) {
        this.A01 = abstractC2891kr;
        this.A00 = file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Void call() throws Exception {
        this.A01.A06(this.A00);
        return null;
    }
}
