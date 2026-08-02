package ru.ozon.android.messenger.framework.presentation.common.view.recycler;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.messenger.databinding.MMessageBaseLayoutBinding;

/* loaded from: classes10.dex */
final class o extends AbstractC7737t implements Function1<View, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MMessageBaseLayoutBinding f91258b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(MMessageBaseLayoutBinding mMessageBaseLayoutBinding) {
        super(1);
        this.f91258b = mMessageBaseLayoutBinding;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f91258b.messageItemRootLl.performClick();
        return Unit.f71690a;
    }
}
