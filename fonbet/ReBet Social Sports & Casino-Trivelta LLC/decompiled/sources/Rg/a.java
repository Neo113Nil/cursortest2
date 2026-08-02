package Rg;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a implements Qg.h {

    /* renamed from: a, reason: collision with root package name */
    public static final a f10229a = new a();

    @Override // Qg.h
    public Qg.b a(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        c cVar = new c();
        block.invoke(cVar);
        return new d(cVar);
    }
}
