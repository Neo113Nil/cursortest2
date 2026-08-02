package ru.ozon.app.android.composer.compose;

import S0.InterfaceC3967k;
import Sc.InterfaceC3999a;
import a1.C4912a;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.k;

@InterfaceC3999a
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0004¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/composer/compose/ComposeWidgetViewHolder;", "Ll20/c;", "I", "Lru/ozon/composer/ui/widget/k;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "item", "Ll20/d;", "info", "Lkotlin/Function0;", "", "content", "(Ll20/c;Ll20/d;)Lkotlin/jvm/functions/Function2;", "bind", "(Ll20/c;Ll20/d;)V", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "Landroidx/compose/ui/platform/ComposeView;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class ComposeWidgetViewHolder<I extends c> extends k<I> {
    public static final int $stable;

    @NotNull
    private final ComposeView composeView;

    static {
        int i11 = ComposeView.f40612c;
        $stable = 8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeWidgetViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        View view2 = this.itemView;
        Intrinsics.g(view2, "null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView");
        this.composeView = (ComposeView) view2;
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected final void bind(@NotNull I item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.composeView.a(new C4912a(true, -979116207, new ComposeWidgetViewHolder$bind$1(info, this, item)));
    }

    @NotNull
    public abstract Function2<InterfaceC3967k, Integer, Unit> content(@NotNull I item, @NotNull d info);
}
