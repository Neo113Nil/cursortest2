package ru.ozon.fintech.preferences.presentation.logcat;

import Sc.s;
import bd.h;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xe.M;

@e(c = "ru.ozon.fintech.preferences.presentation.logcat.LogCatViewModel$copyFileToDownloads$1", f = "LogCatViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ b f96842d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(b bVar, kotlin.coroutines.d<? super c> dVar) {
        super(2, dVar);
        this.f96842d = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new c(this.f96842d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        File f7;
        U30.a aVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        L80.c d11 = L80.a.d();
        if (d11 != null && (f7 = d11.f()) != null) {
            String name = f7.getName();
            b bVar = this.f96842d;
            aVar = bVar.f96826b;
            Intrinsics.f(name);
            if (aVar.l(name, h.j(f7)) != null) {
                b.g0(bVar, name);
            }
        }
        return Unit.f71690a;
    }
}
