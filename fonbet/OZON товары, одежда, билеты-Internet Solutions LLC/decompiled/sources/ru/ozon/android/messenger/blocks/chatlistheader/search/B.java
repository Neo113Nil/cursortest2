package ru.ozon.android.messenger.blocks.chatlistheader.search;

import Q1.K;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class B extends AbstractC7737t implements Function1<K, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<String, Unit> f84767b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    B(Function1<? super String, Unit> function1) {
        super(1);
        this.f84767b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(K k11) {
        K query = k11;
        Intrinsics.checkNotNullParameter(query, "query");
        this.f84767b.invoke(query.f());
        return Unit.f71690a;
    }
}
