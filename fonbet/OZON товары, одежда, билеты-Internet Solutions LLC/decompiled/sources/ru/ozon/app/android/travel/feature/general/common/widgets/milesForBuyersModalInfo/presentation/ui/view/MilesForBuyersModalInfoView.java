package ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.presentation.ui.view;

import Sc.o;
import android.content.Context;
import android.view.View;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.R$id;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.presentation.ui.MilesForBuyersModalInfoVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.presentation.ui.content.ContentAdapter;
import ru.ozon.app.android.travel.molecules.utils.ShapeDrawableWithBorder;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020!2\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\nJ(\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020'H\u0002J\u0012\u0010(\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010*H\u0002J\b\u0010+\u001a\u00020\tH\u0002R\"\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007j\u0004\u0018\u0001`\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/view/MilesForBuyersModalInfoView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "dp24", "", "dp64", "headerContentAdapter", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/content/ContentAdapter;", "bodyContentAdapter", "headerContainerBackgroundDrawable", "Lru/ozon/app/android/travel/molecules/utils/ShapeDrawableWithBorder;", "bodyContainerBackgroundDrawable", "headerContainerBackgroundV", "Landroid/view/View;", "headerContainerRv", "Landroidx/recyclerview/widget/RecyclerView;", "headerSpace", "Landroid/widget/Space;", "bodyContainerBackgroundV", "bodyContainerRv", "imageIv", "Lru/ozon/uni/android/atom/image/Image;", "imageSpace", "bind", "item", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO;", "bindContent", "adapter", "container", "backgroundDrawable", "content", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$Content;", "bindOrGoneImage", "image", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/ui/MilesForBuyersModalInfoVO$Image;", "placeViews", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MilesForBuyersModalInfoView extends ConstraintLayout {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final ShapeDrawableWithBorder bodyContainerBackgroundDrawable;

    @NotNull
    private final View bodyContainerBackgroundV;

    @NotNull
    private final RecyclerView bodyContainerRv;

    @NotNull
    private final ContentAdapter bodyContentAdapter;
    private final int dp24;
    private final int dp64;

    @NotNull
    private final ShapeDrawableWithBorder headerContainerBackgroundDrawable;

    @NotNull
    private final View headerContainerBackgroundV;

    @NotNull
    private final RecyclerView headerContainerRv;

    @NotNull
    private final ContentAdapter headerContentAdapter;

    @NotNull
    private final Space headerSpace;

    @NotNull
    private final Image imageIv;

    @NotNull
    private final Space imageSpace;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MilesForBuyersModalInfoView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(24, context);
        this.dp24 = px;
        int px2 = ResourceExtKt.toPx(64, context);
        this.dp64 = px2;
        ContentAdapter contentAdapter = new ContentAdapter(new MilesForBuyersModalInfoView$headerContentAdapter$1(this));
        this.headerContentAdapter = contentAdapter;
        ContentAdapter contentAdapter2 = new ContentAdapter(new MilesForBuyersModalInfoView$bodyContentAdapter$1(this));
        this.bodyContentAdapter = contentAdapter2;
        ShapeDrawableWithBorder shapeDrawableWithBorder = new ShapeDrawableWithBorder(context, null, null, null, 14, null);
        this.headerContainerBackgroundDrawable = shapeDrawableWithBorder;
        float f7 = px;
        ShapeDrawableWithBorder shapeDrawableWithBorder2 = new ShapeDrawableWithBorder(context, null, new float[]{f7, f7, f7, f7, 0.0f, 0.0f, 0.0f, 0.0f}, null, 10, null);
        this.bodyContainerBackgroundDrawable = shapeDrawableWithBorder2;
        View view = new View(context);
        view.setId(R$id.milesForBuyersModalInfoHeaderBackground);
        view.setLayoutParams(new ConstraintLayout.b(0, 0));
        view.setBackground(shapeDrawableWithBorder);
        this.headerContainerBackgroundV = view;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.milesForBuyersModalInfoHeaderContainer);
        recyclerView.setLayoutParams(new ConstraintLayout.b(0, -2));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(contentAdapter);
        this.headerContainerRv = recyclerView;
        Space space = new Space(context);
        space.setId(R$id.milesForBuyersModalInfoHeaderSpace);
        space.setLayoutParams(new ConstraintLayout.b(0, px));
        this.headerSpace = space;
        View view2 = new View(context);
        view2.setId(R$id.milesForBuyersModalInfoBodyBackground);
        view2.setLayoutParams(new ConstraintLayout.b(0, 0));
        view2.setBackground(shapeDrawableWithBorder2);
        this.bodyContainerBackgroundV = view2;
        RecyclerView recyclerView2 = new RecyclerView(context);
        recyclerView2.setId(R$id.milesForBuyersModalInfoBodyContainer);
        recyclerView2.setLayoutParams(new ConstraintLayout.b(0, -2));
        recyclerView2.setNestedScrollingEnabled(false);
        recyclerView2.setLayoutManager(new LinearLayoutManager(context));
        recyclerView2.setAdapter(contentAdapter2);
        this.bodyContainerRv = recyclerView2;
        q qVar = q.f64554a;
        d type = N.b(Image.class);
        Intrinsics.checkNotNullParameter(type, "type");
        Image image = (Image) qVar.i(type, null);
        image = image == null ? new Image(context, null, 0, 6, null) : image;
        image.setId(R$id.milesForBuyersModalInfoImage);
        image.setLayoutParams(new ConstraintLayout.b(0, -2));
        image.setVisibility(8);
        this.imageIv = image;
        Space space2 = new Space(context);
        space2.setId(R$id.milesForBuyersModalInfoImageSpace);
        space2.setLayoutParams(new ConstraintLayout.b(0, px2));
        space2.setVisibility(8);
        this.imageSpace = space2;
        placeViews();
    }

    private final void bindContent(ContentAdapter adapter, View container, ShapeDrawableWithBorder backgroundDrawable, MilesForBuyersModalInfoVO.Content content) {
        adapter.submitList(content.getItems());
        MilesForBuyersModalInfoVO.Paddings paddings = content.getPaddings();
        container.setPadding(paddings.getLeading(), paddings.getTop(), paddings.getTrailing(), paddings.getBottom());
        ShapeDrawableWithBorder.setFillColor$default(backgroundDrawable, content.getBackgroundColor(), 0, 2, null);
        backgroundDrawable.invalidateSelf();
    }

    private final void bindOrGoneImage(MilesForBuyersModalInfoVO.Image image) {
        ImageHolderKt.bindOrGone$default(this.imageIv, image != null ? image.getImage() : null, null, 2, null);
        this.imageSpace.setVisibility(this.imageIv.getVisibility() == 0 ? 0 : 8);
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.p(this);
        Boolean valueOf = image != null ? Boolean.valueOf(image.getIsImageForeground()) : null;
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.d(valueOf, bool)) {
            ConstraintSetExtKt.bottomToBottom$default(dVar, this.headerContainerBackgroundV.getId(), this.imageIv.getId(), 0, 4, null);
            ConstraintSetExtKt.topToBottom$default(dVar, this.bodyContainerRv.getId(), this.imageIv.getId(), 0, 4, null);
            ConstraintSetExtKt.topToTop$default(dVar, this.bodyContainerBackgroundV.getId(), this.imageSpace.getId(), 0, 4, null);
        } else if (Intrinsics.d(valueOf, Boolean.FALSE)) {
            ConstraintSetExtKt.bottomToBottom$default(dVar, this.headerContainerBackgroundV.getId(), this.imageIv.getId(), 0, 4, null);
            ConstraintSetExtKt.topToTop$default(dVar, this.bodyContainerRv.getId(), this.imageSpace.getId(), 0, 4, null);
            ConstraintSetExtKt.topToTop$default(dVar, this.bodyContainerBackgroundV.getId(), this.bodyContainerRv.getId(), 0, 4, null);
        } else {
            if (valueOf != null) {
                throw new o();
            }
            ConstraintSetExtKt.bottomToBottom$default(dVar, this.headerContainerBackgroundV.getId(), this.headerSpace.getId(), 0, 4, null);
            ConstraintSetExtKt.topToBottom$default(dVar, this.bodyContainerRv.getId(), this.headerContainerRv.getId(), 0, 4, null);
            ConstraintSetExtKt.topToTop$default(dVar, this.bodyContainerBackgroundV.getId(), this.bodyContainerRv.getId(), 0, 4, null);
        }
        Boolean valueOf2 = image != null ? Boolean.valueOf(image.getIsBackgroundHeader()) : null;
        if (Intrinsics.d(valueOf2, bool)) {
            ConstraintSetExtKt.topToTop$default(dVar, this.imageIv.getId(), this.headerContainerRv.getId(), 0, 4, null);
        } else if (Intrinsics.d(valueOf2, Boolean.FALSE)) {
            ConstraintSetExtKt.topToBottom$default(dVar, this.imageIv.getId(), this.headerContainerRv.getId(), 0, 4, null);
        } else {
            if (valueOf2 != null) {
                throw new o();
            }
            ConstraintSetExtKt.topToBottom$default(dVar, this.imageIv.getId(), this.headerContainerRv.getId(), 0, 4, null);
        }
        dVar.f(this);
        if (image == null) {
            return;
        }
        this.imageIv.setTranslationZ(image.getIsImageForeground() ? 1.0f : 0.0f);
    }

    private final void placeViews() {
        addView(this.headerContainerBackgroundV);
        addView(this.headerContainerRv);
        addView(this.headerSpace);
        addView(this.imageIv);
        addView(this.imageSpace);
        addView(this.bodyContainerBackgroundV);
        addView(this.bodyContainerRv);
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.p(this);
        ConstraintSetExtKt.topToTop$default(dVar, this.headerContainerRv.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.startToStart$default(dVar, this.headerContainerRv.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, this.headerContainerRv.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.topToBottom$default(dVar, this.headerSpace.getId(), this.headerContainerRv.getId(), 0, 4, null);
        ConstraintSetExtKt.startToStart$default(dVar, this.headerSpace.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, this.headerSpace.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.topToTop$default(dVar, this.headerContainerBackgroundV.getId(), this.headerContainerRv.getId(), 0, 4, null);
        ConstraintSetExtKt.startToStart$default(dVar, this.headerContainerBackgroundV.getId(), this.headerContainerRv.getId(), 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, this.headerContainerBackgroundV.getId(), this.headerContainerRv.getId(), 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(dVar, this.headerContainerBackgroundV.getId(), this.headerSpace.getId(), 0, 4, null);
        ConstraintSetExtKt.topToBottom$default(dVar, this.bodyContainerRv.getId(), this.headerContainerRv.getId(), 0, 4, null);
        ConstraintSetExtKt.startToStart$default(dVar, this.bodyContainerRv.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, this.bodyContainerRv.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.topToTop$default(dVar, this.bodyContainerBackgroundV.getId(), this.bodyContainerRv.getId(), 0, 4, null);
        ConstraintSetExtKt.startToStart$default(dVar, this.bodyContainerBackgroundV.getId(), this.bodyContainerRv.getId(), 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, this.bodyContainerBackgroundV.getId(), this.bodyContainerRv.getId(), 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(dVar, this.bodyContainerBackgroundV.getId(), this.bodyContainerRv.getId(), 0, 4, null);
        ConstraintSetExtKt.topToBottom$default(dVar, this.imageIv.getId(), this.headerContainerRv.getId(), 0, 4, null);
        ConstraintSetExtKt.startToStart$default(dVar, this.imageIv.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, this.imageIv.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.startToStart$default(dVar, this.imageSpace.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.endToEnd$default(dVar, this.imageSpace.getId(), 0, 0, 4, null);
        ConstraintSetExtKt.bottomToBottom$default(dVar, this.imageSpace.getId(), this.imageIv.getId(), 0, 4, null);
        dVar.f(this);
    }

    public final void bind(@NotNull MilesForBuyersModalInfoVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
        bindContent(this.headerContentAdapter, this.headerContainerRv, this.headerContainerBackgroundDrawable, item.getHeader());
        bindContent(this.bodyContentAdapter, this.bodyContainerRv, this.bodyContainerBackgroundDrawable, item.getBody());
        bindOrGoneImage(item.getHeaderImage());
    }
}
