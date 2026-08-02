package ru.ozon.android.messenger.framework.presentation.chatlist.popup;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.common.keyboard.b;

/* loaded from: classes10.dex */
final class b extends AbstractC7737t implements Function1<View, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b.a f90516b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(b.a aVar) {
        super(1);
        this.f90516b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f90516b.c(false);
        return Unit.f71690a;
    }
}
