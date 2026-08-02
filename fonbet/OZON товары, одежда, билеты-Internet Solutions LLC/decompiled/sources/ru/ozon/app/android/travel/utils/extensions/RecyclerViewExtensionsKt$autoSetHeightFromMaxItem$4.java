package ru.ozon.app.android.travel.utils.extensions;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.M;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class RecyclerViewExtensionsKt$autoSetHeightFromMaxItem$4 extends AbstractC7737t implements Function1<Throwable, Unit> {
    final /* synthetic */ M<View.OnAttachStateChangeListener> $attachListener;
    final /* synthetic */ M<View.OnLayoutChangeListener> $parentLayoutListener;
    final /* synthetic */ RecyclerView $rv;
    final /* synthetic */ RecyclerView $this_autoSetHeightFromMaxItem;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecyclerViewExtensionsKt$autoSetHeightFromMaxItem$4(RecyclerView recyclerView, RecyclerView recyclerView2, M<View.OnAttachStateChangeListener> m11, M<View.OnLayoutChangeListener> m12) {
        super(1);
        this.$this_autoSetHeightFromMaxItem = recyclerView;
        this.$rv = recyclerView2;
        this.$attachListener = m11;
        this.$parentLayoutListener = m12;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2) {
        RecyclerViewExtensionsKt.autoSetHeightFromMaxItem$clearStartupListeners(this.$this_autoSetHeightFromMaxItem, this.$rv, this.$attachListener, this.$parentLayoutListener);
    }
}
