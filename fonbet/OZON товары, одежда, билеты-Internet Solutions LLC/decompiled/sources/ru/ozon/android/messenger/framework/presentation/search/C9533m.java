package ru.ozon.android.messenger.framework.presentation.search;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.framework.presentation.search.InterfaceC9526f;
import ze.C11115c;

/* renamed from: ru.ozon.android.messenger.framework.presentation.search.m, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9533m extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9527g f91776b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9533m(C9527g c9527g) {
        super(0);
        this.f91776b = c9527g;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C11115c c11115c;
        ru.ozon.android.messenger.framework.presentation.common.notification.g gVar;
        C9527g c9527g = this.f91776b;
        c11115c = c9527g.f91737j;
        gVar = c9527g.f91732e;
        c11115c.b(new InterfaceC9526f.d(gVar.b()));
        return Unit.f71690a;
    }
}
