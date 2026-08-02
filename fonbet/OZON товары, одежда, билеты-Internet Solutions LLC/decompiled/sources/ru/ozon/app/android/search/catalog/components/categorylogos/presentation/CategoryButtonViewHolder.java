package ru.ozon.app.android.search.catalog.components.categorylogos.presentation;

import android.content.Context;
import androidx.cardview.widget.CardView;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.search.catalog.components.categorylogos.presentation.CategoryLogoVO;
import ru.ozon.app.android.search.databinding.ItemCategoryButtonBinding;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.ButtonIconAtom;
import ru.ozon.uni.atoms.data.button.ButtonIcon;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0002\b\u00030\u0004j\u0006\u0012\u0002\b\u0003`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/CategoryButtonViewHolder;", "Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/BaseCategoryLogoViewHolder;", "Lru/ozon/app/android/search/databinding/ItemCategoryButtonBinding;", "binding", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "widgetViewHolder", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "<init>", "(Lru/ozon/app/android/search/databinding/ItemCategoryButtonBinding;Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/CategoryLogoVO;", "logo", "", "bind", "(Lru/ozon/app/android/search/catalog/components/categorylogos/presentation/CategoryLogoVO;)V", "Lru/ozon/app/android/search/databinding/ItemCategoryButtonBinding;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "containerAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CategoryButtonViewHolder extends BaseCategoryLogoViewHolder {

    @NotNull
    private final ItemCategoryButtonBinding binding;

    @NotNull
    private final AtomsAdapter containerAdapter;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CategoryButtonViewHolder(@NotNull ItemCategoryButtonBinding binding, @NotNull k<?> widgetViewHolder, @NotNull ComposerReferences composerReferences) {
        super(r4);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        CardView constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        AtomsAdapter atomsAdapter = new AtomsAdapter(U.i(new Pair(new Atom.ConfCondition(ButtonIcon.class, null, 2, null), new ButtonIconAtom.Configuration(12, 12, 12, 12, 0, null, 48, null))), null, null, null, 14, null);
        this.containerAdapter = atomsAdapter;
        atomsAdapter.setOnAction(new ActionHandler.Builder(composerReferences, widgetViewHolder).buildHandler());
        binding.containerFAL.setAdapter(atomsAdapter);
    }

    @Override // ru.ozon.app.android.search.catalog.components.categorylogos.presentation.BaseCategoryLogoViewHolder
    public void bind(@NotNull CategoryLogoVO logo) {
        Intrinsics.checkNotNullParameter(logo, "logo");
        AtomsAdapter atomsAdapter = this.containerAdapter;
        Context context = this.binding.getConstraintLayout().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        atomsAdapter.bind(context, C7714v.a0(((CategoryLogoVO.Button) logo).getButton()));
    }
}
