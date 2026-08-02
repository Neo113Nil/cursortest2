package ru.ozon.app.android.favorites.createshoppinglist.presentation.vh;

import FK.b;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.CreateShoppingListSuggestItemVO;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.CreateShoppingListUpdate;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.view.CreateShoppingListSuggestItemView;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00022\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/favorites/createshoppinglist/presentation/vh/CreateShoppingListSuggestItemViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/CreateShoppingListSuggestItemVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/view/CreateShoppingListSuggestItemView;", "containerView", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "bus", "<init>", "(Lru/ozon/app/android/favorites/createshoppinglist/presentation/view/CreateShoppingListSuggestItemView;Ll10/b;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/favorites/createshoppinglist/presentation/CreateShoppingListSuggestItemVO;Ll20/d;)V", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/view/CreateShoppingListSuggestItemView;", "getContainerView", "()Lru/ozon/app/android/favorites/createshoppinglist/presentation/view/CreateShoppingListSuggestItemView;", "", "suggest", "Ljava/lang/String;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CreateShoppingListSuggestItemViewHolder extends k<CreateShoppingListSuggestItemVO> {

    @NotNull
    private final CreateShoppingListSuggestItemView containerView;
    private String suggest;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateShoppingListSuggestItemViewHolder(@NotNull CreateShoppingListSuggestItemView containerView, @NotNull InterfaceC7851b bus) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(bus, "bus");
        this.containerView = containerView;
        containerView.setOnClickListener(new b(1, bus, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(InterfaceC7851b interfaceC7851b, CreateShoppingListSuggestItemViewHolder createShoppingListSuggestItemViewHolder, View view) {
        InterfaceC7851b.a.c(interfaceC7851b, "createShoppingList", null, 6);
        String str = createShoppingListSuggestItemViewHolder.suggest;
        if (str != null) {
            interfaceC7851b.update(new CreateShoppingListUpdate.Title(str));
        } else {
            Intrinsics.n("suggest");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CreateShoppingListSuggestItemVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.suggest = item.getText();
        CreateShoppingListSuggestItemView createShoppingListSuggestItemView = this.containerView;
        AppCompatTextView textTv = createShoppingListSuggestItemView.getTextTv();
        String str = this.suggest;
        if (str == null) {
            Intrinsics.n("suggest");
            throw null;
        }
        textTv.setText(str);
        String str2 = this.suggest;
        if (str2 != null) {
            createShoppingListSuggestItemView.setContentDescription(str2);
        } else {
            Intrinsics.n("suggest");
            throw null;
        }
    }
}
