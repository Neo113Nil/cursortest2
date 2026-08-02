package ru.ozon.app.android.search.dialogsearchscreen.withTopFilters;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC5434v;
import b20.C5521a;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.ui.taglist.R$id;
import ru.ozon.app.android.search.databinding.FragmentDialogSearchCoordinatorBinding;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.composer.ui.widget.l;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\u00020\u00122\n\u0010\u0010\u001a\u00060\u0004j\u0002`\u00052\u000e\u0010\u0011\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/search/dialogsearchscreen/withTopFilters/DialogSearchPlaceholderManager;", "", "<init>", "()V", "Lru/ozon/composer/ui/widget/l;", "Lru/ozon/app/android/composer/view/ComposerViewObject;", "viewObject", "Lru/ozon/app/android/search/databinding/FragmentDialogSearchCoordinatorBinding;", "binding", "Ll10/i;", "screenContainer", "Lb20/a;", "Ll20/c;", "addNestedWidget-T4d_Ons", "(Lru/ozon/composer/ui/widget/l;Lru/ozon/app/android/search/databinding/FragmentDialogSearchCoordinatorBinding;Ll10/i;)Lru/ozon/composer/ui/widget/k;", "addNestedWidget", "newPlaceholder", "oldPlaceholderViewItem", "", "arePlaceHoldersTheSame", "(Lru/ozon/composer/ui/widget/l;Lru/ozon/composer/ui/widget/l;)Z", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DialogSearchPlaceholderManager {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, androidx.recyclerview.widget.RecyclerView$C, java.lang.Object, ru.ozon.composer.ui.widget.k] */
    /* renamed from: addNestedWidget-T4d_Ons, reason: not valid java name */
    public final k m961addNestedWidgetT4d_Ons(@NotNull l viewObject, @NotNull FragmentDialogSearchCoordinatorBinding binding, @NotNull i screenContainer) {
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(screenContainer, "screenContainer");
        CollapsingToolbarLayout collapsingToolbar = binding.collapsingToolbar;
        Intrinsics.checkNotNullExpressionValue(collapsingToolbar, "collapsingToolbar");
        ru.ozon.composer.ui.widget.i iVar = new ru.ozon.composer.ui.widget.i(collapsingToolbar, screenContainer);
        M m11 = new M();
        screenContainer.d0().c(iVar, viewObject);
        ?? source = screenContainer.d0().f(iVar, viewObject.j());
        if (source != 0) {
            Intrinsics.checkNotNullParameter(source, "source");
            C5521a.c(source, AbstractC5434v.b.CREATED);
            Intrinsics.checkNotNullParameter(viewObject, "widgetViewItem");
            source.track(viewObject);
            C5521a.a(source, viewObject, screenContainer.c0());
            C5521a.c(source, AbstractC5434v.b.RESUMED);
            m11.f71787a = source;
            collapsingToolbar.addView(source.itemView, 0);
            if (source.itemView.getId() != R$id.tagListRv) {
                source.itemView.setId(ru.ozon.app.android.search.R$id.dialogDefaultView);
            }
            View itemView = source.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            ViewGroup.LayoutParams layoutParams = itemView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.appbar.CollapsingToolbarLayout.LayoutParams");
            }
            CollapsingToolbarLayout.a aVar = (CollapsingToolbarLayout.a) layoutParams;
            aVar.a(2);
            aVar.b(0.0f);
            itemView.setLayoutParams(aVar);
        }
        return (k) m11.f71787a;
    }

    public final boolean arePlaceHoldersTheSame(@NotNull l newPlaceholder, l oldPlaceholderViewItem) {
        Intrinsics.checkNotNullParameter(newPlaceholder, "newPlaceholder");
        return oldPlaceholderViewItem != null && oldPlaceholderViewItem.f() == newPlaceholder.f() && Intrinsics.d(oldPlaceholderViewItem.d(), newPlaceholder.d());
    }
}
