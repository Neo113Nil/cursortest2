package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import kotlin.Result;
import xsna.izs;
import xsna.s3q0;

/* renamed from: com.ironsource.f5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC4310f5<T> extends Oc {
    void b(C4671z8 c4671z8);

    String c();

    Y5 d();

    izs<Result<? extends T>, s3q0> i();

    default boolean j() {
        return k().exists();
    }

    C4671z8 k();

    InterfaceC4670z7 l();

    default void m() {
        l().a(this);
        if (k().exists()) {
            IronSourceStorageUtils.deleteFile(k());
        }
        try {
            l().a(k(), d().value(), 5, 5);
        } catch (Exception e) {
            C4452n4.d().a(e);
            i().invoke(new Result<>(new Result.Failure(e)));
        }
    }
}
