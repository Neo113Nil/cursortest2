package ru.ozon.app.android.travel.feature.general.main.widgets.topTravelModal.presentation;

import android.content.Context;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.feature.general.main.R$id;
import ru.ozon.app.android.travel.feature.general.main.widgets.topTravelModal.presentation.adapter.TopTravelModalItemDecoration;
import ru.ozon.app.android.travel.feature.general.main.widgets.topTravelModal.presentation.adapter.TopTravelModalItemsAdapter;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ-\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R*\u0010(\u001a\u00020\u00152\u0006\u0010'\u001a\u00020\u00158\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0017\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/presentation/TopTravelModalView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "addViews", "()V", "setConstraints", "setupViews", "Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/presentation/TopTravelModalVO;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/presentation/TopTravelModalVO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/presentation/adapter/TopTravelModalItemsAdapter;", "itemsAdapter", "Lru/ozon/app/android/travel/feature/general/main/widgets/topTravelModal/presentation/adapter/TopTravelModalItemsAdapter;", "", "dp16", "I", "dp36", "dp52", "dp68", "Landroidx/appcompat/widget/AppCompatImageView;", "backgroundImageIV", "Landroidx/appcompat/widget/AppCompatImageView;", "Lru/ozon/uni/android/atom/image/Image;", "topImageIV", "Lru/ozon/uni/android/atom/image/Image;", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "closeButtonIB", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "Landroidx/recyclerview/widget/RecyclerView;", "itemsRV", "Landroidx/recyclerview/widget/RecyclerView;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "bottomPadding", "getBottomPadding", "()I", "setBottomPadding", "(I)V", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TopTravelModalView extends ConstraintLayout {

    @NotNull
    private final AppCompatImageView backgroundImageIV;

    @NotNull
    private final IconButtonV3View closeButtonIB;
    private final int dp16;
    private final int dp36;
    private final int dp52;
    private final int dp68;

    @NotNull
    private final TopTravelModalItemsAdapter itemsAdapter;

    @NotNull
    private final RecyclerView itemsRV;

    @NotNull
    private final Image topImageIV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopTravelModalView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.itemsAdapter = new TopTravelModalItemsAdapter();
        this.dp16 = UiExtKt.toPx(16, context);
        this.dp36 = UiExtKt.toPx(36, context);
        this.dp52 = UiExtKt.toPx(52, context);
        this.dp68 = UiExtKt.toPx(68, context);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R$id.topTravelModalBackgroundImage);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER);
        appCompatImageView.setLayoutParams(new ConstraintLayout.b(0, 0));
        this.backgroundImageIV = appCompatImageView;
        Image image = new Image(context, null, 0, 6, null);
        image.setId(R$id.topTravelModalTopImage);
        image.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.topImageIV = image;
        IconButtonV3View iconButtonV3View = (IconButtonV3View) q.f64554a.i(N.b(IconButtonV3View.class), context);
        iconButtonV3View = iconButtonV3View == null ? new IconButtonV3View(context, null, 0, 0, 14, null) : iconButtonV3View;
        iconButtonV3View.setId(R$id.topTravelModalCloseButton);
        iconButtonV3View.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.closeButtonIB = iconButtonV3View;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.topTravelModalItems);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutParams(new ConstraintLayout.b(0, -2));
        this.itemsRV = recyclerView;
        addViews();
        setConstraints();
        setupViews();
    }

    private final void addViews() {
        addView(this.backgroundImageIV);
        addView(this.topImageIV);
        addView(this.closeButtonIB);
        addView(this.itemsRV);
    }

    private final void setConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new TopTravelModalView$setConstraints$1(this));
    }

    private final void setupViews() {
        RecyclerView recyclerView = this.itemsRV;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setAdapter(this.itemsAdapter);
        recyclerView.addItemDecoration(new TopTravelModalItemDecoration());
    }

    public final void bind(@NotNull TopTravelModalVO item, Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setBackgroundColor(styleParser.parseColor(context, item.getBackgroundColor(), R$color.graphic_active_rating));
        if (item.getBackgroundImage() != null) {
            ViewExtKt.show(this.backgroundImageIV);
            ImageViewExtKt.loadOriginal$default(this.backgroundImageIV, item.getBackgroundImage(), null, null, null, false, null, 62, null);
        } else {
            ViewExtKt.gone(this.backgroundImageIV);
        }
        ImageHolderKt.bindOrGone$default(this.topImageIV, item.getTopImage(), null, 2, null);
        IconButtonV3HolderKt.bindOrGone(this.closeButtonIB, item.getCloseButton(), actionHandler);
        this.itemsAdapter.setOnAction(actionHandler);
        this.itemsAdapter.setItems(item.getItems());
    }

    public final void setBottomPadding(int i11) {
        this.itemsRV.setPadding(0, 0, 0, i11);
    }
}
