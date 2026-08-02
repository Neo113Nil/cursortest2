package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: com.ironsource.f5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC2414f5<T> extends Nc {
    void b(C2757y8 c2757y8);

    String c();

    W5 d();

    Function1<Result<? extends T>, Unit> i();

    default boolean j() {
        return k().exists();
    }

    C2757y8 k();

    InterfaceC2756y7 l();

    default void m() {
        l().a(this);
        if (k().exists()) {
            IronSourceStorageUtils.deleteFile(k());
        }
        try {
            l().a(k(), d().value(), 5, 5);
        } catch (Exception e) {
            C2556n4.d().a(e);
            Function1<Result<? extends T>, Unit> i = i();
            Result.Companion companion = Result.INSTANCE;
            i.invoke(Result.m11179boximpl(Result.m11180constructorimpl(ResultKt.createFailure(e))));
        }
    }
}
