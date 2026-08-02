package ru.ozon.app.android.pdp.ui.configurators.base;

import X4.a;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b'\u0018\u0000*\f\b\u0000\u0010\u0003*\u00060\u0001j\u0002`\u0002*\b\b\u0001\u0010\u0005*\u00020\u00042\b\u0012\u0004\u0012\u00028\u00000\u00062\u00020\u0007B-\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00010\nj\b\u0012\u0004\u0012\u00028\u0001`\u000b¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u000f0\nH\u0004¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0011\u001a\u00028\u00018\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/base/BindingWidgetViewHolder;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "VO", "LX4/a;", "Binding", "Lru/ozon/composer/ui/widget/k;", "", "Landroid/view/View;", "containerView", "Lkotlin/Function1;", "Lru/ozon/app/android/pdp/ui/configurators/base/Bind;", "bind", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "", "bindingBlock", "binding", "(Lkotlin/jvm/functions/Function1;)V", "LX4/a;", "getBinding", "()LX4/a;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BindingWidgetViewHolder<VO extends c, Binding extends a> extends k<VO> {

    @NotNull
    private final Binding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BindingWidgetViewHolder(@NotNull View containerView, @NotNull Function1<? super View, ? extends Binding> bind) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(bind, "bind");
        this.binding = bind.invoke(containerView);
    }

    protected final void binding(@NotNull Function1<? super Binding, Unit> bindingBlock) {
        Intrinsics.checkNotNullParameter(bindingBlock, "bindingBlock");
        bindingBlock.invoke(this.binding);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public final Binding getBinding() {
        return this.binding;
    }
}
