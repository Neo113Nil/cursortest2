package ru.ozon.app.android.travel.molecules.view.emptyState.v1;

import Ef0.c;
import android.content.Context;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.m;
import gk0.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0017H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateBottomButtonsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "defaultMargin", "", "buttonsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "imageView", "Landroidx/appcompat/widget/AppCompatImageView;", "titleTextView", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "messageTextView", "buttonsLayout", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "bind", "", "item", "Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Companion", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EmptyStateBottomButtonsView extends ConstraintLayout implements EmptyStateLayout {

    @NotNull
    private final AtomsAdapter buttonsAdapter;

    @NotNull
    private final VerticalAtomsLayout buttonsLayout;
    private final int defaultMargin;

    @NotNull
    private final AppCompatImageView imageView;

    @NotNull
    private final TextAtomView messageTextView;

    @NotNull
    private final TextAtomView titleTextView;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyStateBottomButtonsView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(8, context);
        this.defaultMargin = px;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.buttonsAdapter = atomsAdapter;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        int px2 = ResourceExtKt.toPx(168, context);
        appCompatImageView.setId(100);
        ConstraintLayout.b bVar = new ConstraintLayout.b(px2, px2);
        bVar.f41604K = 2;
        bVar.f41636i = 0;
        bVar.f41640k = m.e.DEFAULT_DRAG_ANIMATION_DURATION;
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        appCompatImageView.setLayoutParams(bVar);
        this.imageView = appCompatImageView;
        q qVar = q.f64554a;
        TextAtomView textAtomView = (TextAtomView) qVar.g(N.b(TextAtomView.class), context);
        ConstraintLayout.b b11 = c.b(textAtomView, m.e.DEFAULT_DRAG_ANIMATION_DURATION, 0, -2);
        ((ViewGroup.MarginLayoutParams) b11).topMargin = ResourceExtKt.toPx(20, context);
        b11.f41656t = 0;
        b11.f41638j = 100;
        b11.f41640k = 300;
        b11.f41658v = 0;
        textAtomView.setLayoutParams(b11);
        textAtomView.setGravity(17);
        this.titleTextView = textAtomView;
        TextAtomView textAtomView2 = (TextAtomView) qVar.g(N.b(TextAtomView.class), context);
        ConstraintLayout.b b12 = c.b(textAtomView2, 300, 0, -2);
        ((ViewGroup.MarginLayoutParams) b12).topMargin = px;
        b12.f41656t = 0;
        b12.f41638j = m.e.DEFAULT_DRAG_ANIMATION_DURATION;
        b12.f41642l = 0;
        b12.f41658v = 0;
        textAtomView2.setLayoutParams(b12);
        textAtomView2.setGravity(17);
        this.messageTextView = textAtomView2;
        VerticalAtomsLayout verticalAtomsLayout = new VerticalAtomsLayout(context, null, 0, 6, null);
        verticalAtomsLayout.setId(400);
        ConstraintLayout.b bVar2 = new ConstraintLayout.b(0, -2);
        bVar2.f41638j = 300;
        bVar2.f41656t = 0;
        bVar2.f41658v = 0;
        bVar2.f41642l = 0;
        bVar2.f41617X = true;
        bVar2.f41599F = 1.0f;
        verticalAtomsLayout.setLayoutParams(bVar2);
        verticalAtomsLayout.setAdapter(atomsAdapter);
        verticalAtomsLayout.setDecorator(new EmptyStateDecoration(context));
        this.buttonsLayout = verticalAtomsLayout;
        addView(appCompatImageView);
        addView(textAtomView);
        addView(textAtomView2);
        addView(verticalAtomsLayout);
    }

    @Override // ru.ozon.app.android.travel.molecules.view.emptyState.v1.EmptyStateLayout
    public void bind(@NotNull EmptyStateVO item, Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        ImageViewExtKt.load$default(this.imageView, item.getImageURL(), null, null, null, null, false, null, 126, null);
        TextAtomHolderKt.bind$default(this.titleTextView, item.getTitle(), null, 2, null);
        TextAtomHolderKt.bindOrGone$default(this.messageTextView, item.getMessage(), null, 2, null);
        this.buttonsLayout.setVisibility(item.getIsButtonsVisible() ? 0 : 8);
        this.buttonsAdapter.setOnAction(onAction);
        List<AtomDTO> buttons = item.getButtons();
        if (buttons != null) {
            AtomsAdapter atomsAdapter = this.buttonsAdapter;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            atomsAdapter.bind(context, buttons);
        }
        if (onAction != null) {
            onAction.invoke(new AtomAction.ViewAction(item.getTrackingInfo(), null, 2, null));
        }
    }
}
