package com.android.billingclient.api;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class q0 implements Consumer {
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (((h) obj) == null) {
            throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
