package ru.ozon.app.android.travel.feature.hotels.shared.shelfCard.binders;

import Am.b;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.v3.containers.VerticalRecyclerContainer;
import ru.ozon.app.android.travel.feature.hotels.R$id;
import ru.ozon.app.android.travel.feature.hotels.shared.shelfCard.ShelfCardVO;
import ru.ozon.app.android.travel.feature.hotels.shared.shelfCard.ShelfCardView;
import ru.ozon.app.android.travel.utils.extensions.ViewExtensionsKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ:\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00152\u0006\u0010\u0018\u001a\u00020\u00192\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u001bR\u0018\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/binders/BottomContentBinder;", "", "parent", "Landroidx/constraintlayout/widget/ConstraintLayout;", "topConstraintId", "", "layoutContainerMode", "Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardView$LayoutContainerMode;", "<init>", "(Landroidx/constraintlayout/widget/ConstraintLayout;ILru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardView$LayoutContainerMode;)V", "context", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "Landroid/content/Context;", "contentDecorator", "Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/binders/BottomContentDecorator;", "bottomVrc", "Lru/ozon/app/android/atoms/v3/containers/VerticalRecyclerContainer;", "bind", "", "contentAtoms", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "contentMargins", "settings", "Lru/ozon/app/android/travel/feature/hotels/shared/shelfCard/ShelfCardVO$CardSettings;", "clickListener", "Lkotlin/Function0;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BottomContentBinder {

    @NotNull
    private final VerticalRecyclerContainer bottomVrc;

    @NotNull
    private final BottomContentDecorator contentDecorator;
    private final Context context;

    public BottomContentBinder(@NotNull ConstraintLayout parent, int i11, @NotNull ShelfCardView.LayoutContainerMode layoutContainerMode) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(layoutContainerMode, "layoutContainerMode");
        Context context = parent.getContext();
        this.context = context;
        BottomContentDecorator bottomContentDecorator = new BottomContentDecorator();
        this.contentDecorator = bottomContentDecorator;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        VerticalRecyclerContainer verticalRecyclerContainer = new VerticalRecyclerContainer(context, null, 0, 6, null);
        verticalRecyclerContainer.setId(R$id.shelfCardBottomContentVrc);
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41638j = i11;
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        bVar.f41642l = 0;
        bVar.f41599F = 0.0f;
        verticalRecyclerContainer.setLayoutParams(bVar);
        if (layoutContainerMode == ShelfCardView.LayoutContainerMode.HORIZONTAL) {
            verticalRecyclerContainer.setMinimumHeight(UiExtKt.toSp(92));
        }
        verticalRecyclerContainer.addItemDecoration(bottomContentDecorator);
        verticalRecyclerContainer.setNestedScrollingEnabled(false);
        verticalRecyclerContainer.setItemAnimator(null);
        this.bottomVrc = verticalRecyclerContainer;
        parent.addView(verticalRecyclerContainer);
    }

    public final void bind(@NotNull List<? extends AtomDTO> contentAtoms, @NotNull List<Integer> contentMargins, @NotNull ShelfCardVO.CardSettings settings, @NotNull Function0<Unit> clickListener) {
        Intrinsics.checkNotNullParameter(contentAtoms, "contentAtoms");
        Intrinsics.checkNotNullParameter(contentMargins, "contentMargins");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        this.bottomVrc.setItemClickListener(new b(clickListener, 3));
        ViewExtensionsKt.safeUpdateMargins$default(this.bottomVrc, null, Integer.valueOf(settings.getContentBottomMargin()), Integer.valueOf(settings.getContentHorizontalMargin()), Integer.valueOf(settings.getContentHorizontalMargin()), 1, null);
        if (this.contentDecorator.updateMargins(contentMargins)) {
            this.bottomVrc.invalidateItemDecorations();
        }
        this.bottomVrc.bind(contentAtoms);
        VerticalRecyclerContainer verticalRecyclerContainer = this.bottomVrc;
        if (!verticalRecyclerContainer.isLaidOut() || verticalRecyclerContainer.isLayoutRequested()) {
            verticalRecyclerContainer.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.travel.feature.hotels.shared.shelfCard.binders.BottomContentBinder$bind$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    Iterator<View> it = C5316f0.b(BottomContentBinder.this.bottomVrc).iterator();
                    while (true) {
                        C5314e0 c5314e0 = (C5314e0) it;
                        if (!c5314e0.hasNext()) {
                            return;
                        }
                        View view2 = (View) c5314e0.next();
                        if (view2 instanceof SingleAtom) {
                            View childAt = ((SingleAtom) view2).getChildAt(0);
                            if (childAt instanceof TextAtomV2View) {
                                ((TextAtomV2View) childAt).setTextIsSelectable(false);
                            }
                        }
                    }
                }
            });
            return;
        }
        Iterator<View> it = C5316f0.b(this.bottomVrc).iterator();
        while (true) {
            C5314e0 c5314e0 = (C5314e0) it;
            if (!c5314e0.hasNext()) {
                return;
            }
            View view = (View) c5314e0.next();
            if (view instanceof SingleAtom) {
                View childAt = ((SingleAtom) view).getChildAt(0);
                if (childAt instanceof TextAtomV2View) {
                    ((TextAtomV2View) childAt).setTextIsSelectable(false);
                }
            }
        }
    }
}
