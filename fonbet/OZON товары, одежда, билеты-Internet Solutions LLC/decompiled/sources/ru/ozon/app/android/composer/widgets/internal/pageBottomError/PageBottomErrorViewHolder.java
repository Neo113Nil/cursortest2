package ru.ozon.app.android.composer.widgets.internal.pageBottomError;

import Nt.a;
import f20.C6406a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00022\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/composer/widgets/internal/pageBottomError/PageBottomErrorViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lf20/a;", "Lru/ozon/app/android/composer/widgets/internal/pageBottomError/PageBottomErrorView;", "itemView", "Ll10/b;", "controller", "<init>", "(Lru/ozon/app/android/composer/widgets/internal/pageBottomError/PageBottomErrorView;Ll10/b;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lf20/a;Ll20/d;)V", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PageBottomErrorViewHolder extends k<C6406a> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageBottomErrorViewHolder(@NotNull PageBottomErrorView itemView, @NotNull InterfaceC7851b controller) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(controller, "controller");
        itemView.setOnClickListener(new a(controller, 5));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull C6406a item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
    }
}
