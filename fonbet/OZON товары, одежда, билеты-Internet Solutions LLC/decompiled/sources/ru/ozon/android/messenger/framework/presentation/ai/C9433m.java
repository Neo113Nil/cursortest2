package ru.ozon.android.messenger.framework.presentation.ai;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: ru.ozon.android.messenger.framework.presentation.ai.m, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C9433m extends AbstractC7737t implements Function1<Boolean, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9413c f89636b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C9433m(C9413c c9413c) {
        super(1);
        this.f89636b = c9413c;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        C9413c c9413c = this.f89636b;
        if (booleanValue) {
            AiFloatingButtonContainer.b(C9413c.y(c9413c).scrollButtonContainer);
        } else {
            C9413c.y(c9413c).scrollButtonContainer.c();
        }
        return Unit.f71690a;
    }
}
