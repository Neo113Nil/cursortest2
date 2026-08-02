package ru.ozon.app.android.favorites.createshoppinglist.presentation;

import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.vh.CreateShoppingListSuggestTitleViewHolder;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/vh/CreateShoppingListSuggestTitleViewHolder;", "view", "Landroid/view/View;", "<unused var>", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class CreateShoppingListSuggestTitleViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, CreateShoppingListSuggestTitleViewHolder> {
    public static final CreateShoppingListSuggestTitleViewMapper$holderProducer$1 INSTANCE = new CreateShoppingListSuggestTitleViewMapper$holderProducer$1();

    CreateShoppingListSuggestTitleViewMapper$holderProducer$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final CreateShoppingListSuggestTitleViewHolder invoke(View view, ComposerReferences composerReferences) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(composerReferences, "<unused var>");
        return new CreateShoppingListSuggestTitleViewHolder((TextView) view);
    }
}
