package ru.ozon.android.messenger.framework.presentation.search.composable;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l1.AbstractC7799Q;
import l1.C7807Z;
import m0.O;

/* renamed from: ru.ozon.android.messenger.framework.presentation.search.composable.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9522d extends AbstractC7737t implements Function0<AbstractC7799Q> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List<C7807Z> f91650b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ O.a f91651c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ float f91652d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9522d(List list, O.a aVar, float f7) {
        super(0);
        this.f91650b = list;
        this.f91651c = aVar;
        this.f91652d = f7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AbstractC7799Q invoke() {
        AbstractC7799Q.a aVar = AbstractC7799Q.Companion;
        O.a aVar2 = this.f91651c;
        return AbstractC7799Q.a.d(aVar, this.f91650b, P9.a.a(((Number) aVar2.getValue()).floatValue() - this.f91652d, 0.0f), P9.a.a(((Number) aVar2.getValue()).floatValue(), 0.0f), 8);
    }
}
