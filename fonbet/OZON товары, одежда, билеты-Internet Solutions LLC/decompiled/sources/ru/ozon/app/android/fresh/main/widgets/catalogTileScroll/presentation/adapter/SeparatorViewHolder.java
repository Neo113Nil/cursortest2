package ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.presentation.adapter;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.domain.CatalogTile;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/presentation/adapter/SeparatorViewHolder;", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/presentation/adapter/CatalogTileItemViewHolder;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/CatalogTile;", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/domain/CatalogTile;Ll20/d;)V", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SeparatorViewHolder extends CatalogTileItemViewHolder {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeparatorViewHolder(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CatalogTile item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
    }
}
