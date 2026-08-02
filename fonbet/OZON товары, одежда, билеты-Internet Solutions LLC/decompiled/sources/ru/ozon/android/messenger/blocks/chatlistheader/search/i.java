package ru.ozon.android.messenger.blocks.chatlistheader.search;

import K1.S;
import Q1.K;
import S0.InterfaceC3978p0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.blocks.chatlistheader.search.SearchBarKt$SearchBar$1$1$2$1", f = "SearchBar.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class i extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f84813d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<K> f84814e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(String str, InterfaceC3978p0<K> interfaceC3978p0, kotlin.coroutines.d<? super i> dVar) {
        super(2, dVar);
        this.f84813d = str;
        this.f84814e = interfaceC3978p0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new i(this.f84813d, this.f84814e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((i) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        InterfaceC3978p0<K> interfaceC3978p0 = this.f84814e;
        String f7 = interfaceC3978p0.getValue().f();
        String str = this.f84813d;
        if (!Intrinsics.d(str, f7)) {
            K value = interfaceC3978p0.getValue();
            String str2 = str == null ? "" : str;
            if (str == null) {
                str = "";
            }
            int length = str.length();
            interfaceC3978p0.setValue(K.b(value, str2, S.a(length, length), 4));
        }
        return Unit.f71690a;
    }
}
