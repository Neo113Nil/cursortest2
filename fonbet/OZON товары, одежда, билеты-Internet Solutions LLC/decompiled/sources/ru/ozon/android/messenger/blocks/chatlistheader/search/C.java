package ru.ozon.android.messenger.blocks.chatlistheader.search;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.messenger.blocks.chatlistheader.f;

/* loaded from: classes10.dex */
final class C extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Function1<f.b, Unit> f84768b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ f.b f84769c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C(Function1<? super f.b, Unit> function1, f.b bVar) {
        super(0);
        this.f84768b = function1;
        this.f84769c = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f84768b.invoke(this.f84769c);
        return Unit.f71690a;
    }
}
