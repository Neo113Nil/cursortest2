package ru.ozon.app.android.travel.molecules.extensions;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ViewExtensionsKt$getWidthAfterLayout$2$1 extends AbstractC7737t implements Function1<Throwable, Unit> {
    final /* synthetic */ ViewExtensionsKt$getWidthAfterLayout$2$listener$1 $listener;
    final /* synthetic */ View $this_getWidthAfterLayout;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ViewExtensionsKt$getWidthAfterLayout$2$1(View view, ViewExtensionsKt$getWidthAfterLayout$2$listener$1 viewExtensionsKt$getWidthAfterLayout$2$listener$1) {
        super(1);
        this.$this_getWidthAfterLayout = view;
        this.$listener = viewExtensionsKt$getWidthAfterLayout$2$listener$1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2) {
        this.$this_getWidthAfterLayout.removeOnLayoutChangeListener(this.$listener);
    }
}
