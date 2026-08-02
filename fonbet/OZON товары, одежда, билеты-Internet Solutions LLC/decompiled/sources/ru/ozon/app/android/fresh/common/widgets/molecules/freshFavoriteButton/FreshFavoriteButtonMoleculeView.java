package ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton;

import AW.a;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.common.widgets.R$drawable;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.delegate.FreshFavoriteProxy;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.delegate.FreshFavoriteState;
import ru.ozon.uni.android.haptic.HapticToken;
import ru.ozon.uni.android.haptic.HapticVibrator;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\f\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/FreshFavoriteButtonMoleculeView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/delegate/FreshFavoriteProxy;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/delegate/FreshFavoriteState;", "item", "Lkotlin/Function0;", "", "onClick", "bindOrGoneFavorite", "(Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/delegate/FreshFavoriteState;Lkotlin/jvm/functions/Function0;)V", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshFavoriteButtonMoleculeView extends AppCompatImageView implements FreshFavoriteProxy {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreshFavoriteButtonMoleculeView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindOrGoneFavorite$lambda$0(FreshFavoriteButtonMoleculeView freshFavoriteButtonMoleculeView, Function0 function0, View view) {
        HapticVibrator.INSTANCE.vibrate(freshFavoriteButtonMoleculeView, HapticToken.SUCCESS);
        function0.invoke();
    }

    @Override // ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.delegate.FreshFavoriteProxy
    public void bindOrGoneFavorite(FreshFavoriteState item, @NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        if (item == null) {
            ViewExtKt.gone(this);
            return;
        }
        setOnClickListener(new a(7, this, onClick));
        setImageResource(item.getIsFavorite() ? R$drawable.ic_fresh_favorite : R$drawable.ic_fresh_unfavorite);
        setContentDescription(item.getIsFavorite() ? "favorite" : "unfavorite");
        ViewExtKt.show(this);
    }
}
