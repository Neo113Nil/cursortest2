package ru.ozon.app.android.favorites.ui.favoritebutton.favoriteentity.models;

import a00.C4911f;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteentity.model.restriction.RestrictionModel;
import ru.ozon.app.android.favorites.ui.R$drawable;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u0004\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/restriction/RestrictionModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "", "show", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/restriction/RestrictionModel;Lru/ozon/app/android/composer/ComposerReferences;)V", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "ownerContainer", "(Lru/ozon/app/android/favorites/data/favoritebutton/favoriteentity/model/restriction/RestrictionModel;La00/f;)V", "favorites_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RestrictionModelKt {
    public static final void show(@NotNull RestrictionModel restrictionModel, @NotNull ComposerReferences references) {
        Intrinsics.checkNotNullParameter(restrictionModel, "<this>");
        Intrinsics.checkNotNullParameter(references, "references");
        show(restrictionModel, references.getContainer());
    }

    public static final void show(@NotNull RestrictionModel restrictionModel, @NotNull C4911f ownerContainer) {
        ViewGroup rootView;
        Intrinsics.checkNotNullParameter(restrictionModel, "<this>");
        Intrinsics.checkNotNullParameter(ownerContainer, "ownerContainer");
        ComponentCallbacksC5392m c11 = ownerContainer.c();
        if (c11 == null || (rootView = ContextExtKt.getRootView(c11)) == null) {
            rootView = ContextExtKt.getRootView(ownerContainer.i());
        }
        if (rootView != null) {
            FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
            OzonSpannableString message = restrictionModel.getMessage();
            long duration = restrictionModel.getDuration();
            ViewGroup viewGroup = rootView;
            FlashbarFactory.create$default(flashbarFactory, viewGroup, restrictionModel.getTitle(), message, null, null, Integer.valueOf(R$drawable.ic_favourites_tabbar), null, null, null, null, null, null, null, Long.valueOf(duration), null, null, ownerContainer.f(), 57304, null).show();
        }
    }
}
