package ru.ozon.android.messenger.blocks.ai.input.presentation.view;

import j1.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
final class m extends AbstractC7737t implements Function1<v, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ o f84280b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(o oVar) {
        super(1);
        this.f84280b = oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(v vVar) {
        v focusState = vVar;
        Intrinsics.checkNotNullParameter(focusState, "focusState");
        if (focusState.a()) {
            this.f84280b.g0();
        }
        return Unit.f71690a;
    }
}
