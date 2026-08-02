package ru.ozon.android.messenger.blocks.ai.aiMessageActions;

import f3.AbstractC6409a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.h;
import ru.ozon.android.messenger.blocks.ai.aiMessageActions.presentation.l;

/* loaded from: classes10.dex */
final class d extends AbstractC7737t implements Function1<AbstractC6409a, h> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f83974b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(ru.ozon.android.messenger.framework.core.d dVar) {
        super(1);
        this.f83974b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final h invoke(AbstractC6409a abstractC6409a) {
        AbstractC6409a viewModel = abstractC6409a;
        Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
        return new h(this.f83974b.c(), new l.a());
    }
}
