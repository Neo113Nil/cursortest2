package ru.ozon.app.android.search.common;

import X4.a;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000*\f\b\u0000\u0010\u0003*\u00060\u0001j\u0002`\u0002*\b\b\u0001\u0010\u0005*\u00020\u00042\u0012\u0012\u0004\u0012\u00028\u00000\u0006j\b\u0012\u0004\u0012\u00028\u0000`\u0007B-\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00010\nj\b\u0012\u0004\u0012\u00028\u0001`\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00028\u00018\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/search/common/BindingViewHolder;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "VO", "LX4/a;", "Binding", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lkotlin/Function1;", "Lru/ozon/app/android/search/common/Bind;", "bind", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "binding", "LX4/a;", "getBinding", "()LX4/a;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class BindingViewHolder<VO extends c, Binding extends a> extends k<VO> {

    @NotNull
    private final Binding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BindingViewHolder(@NotNull View containerView, @NotNull Function1<? super View, ? extends Binding> bind) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(bind, "bind");
        this.binding = bind.invoke(containerView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public final Binding getBinding() {
        return this.binding;
    }
}
