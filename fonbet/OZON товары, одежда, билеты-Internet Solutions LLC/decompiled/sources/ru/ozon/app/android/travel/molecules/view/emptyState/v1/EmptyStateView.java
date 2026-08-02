package ru.ozon.app.android.travel.molecules.view.emptyState.v1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import gk0.q;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001dH\u0016R\u000e\u0010\f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateView;", "Landroid/widget/LinearLayout;", "Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "imageSize", "standardMarginTop", "messageMarginTop", "buttonsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "imageACIV", "Landroidx/appcompat/widget/AppCompatImageView;", "titleTAV", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "messageTAV", "buttonsVAL", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "bind", "", "item", "Lru/ozon/app/android/travel/molecules/view/emptyState/v1/EmptyStateVO;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EmptyStateView extends LinearLayout implements EmptyStateLayout {

    @NotNull
    private final AtomsAdapter buttonsAdapter;

    @NotNull
    private final VerticalAtomsLayout buttonsVAL;

    @NotNull
    private final AppCompatImageView imageACIV;
    private final int imageSize;
    private final int messageMarginTop;

    @NotNull
    private final TextAtomView messageTAV;
    private final int standardMarginTop;

    @NotNull
    private final TextAtomView titleTAV;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmptyStateView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ru.ozon.app.android.travel.molecules.view.emptyState.v1.EmptyStateLayout
    public void bind(@NotNull EmptyStateVO item, Function1<? super AtomAction, Unit> onAction) {
        Integer num;
        Intrinsics.checkNotNullParameter(item, "item");
        ImageViewExtKt.load$default(this.imageACIV, item.getImageURL(), null, null, null, null, false, null, 126, null);
        TextAtomHolderKt.bind$default(this.titleTAV, item.getTitle(), null, 2, null);
        TextAtomHolderKt.bindOrGone$default(this.messageTAV, item.getMessage(), null, 2, null);
        this.buttonsVAL.setVisibility(item.getIsButtonsVisible() ? 0 : 8);
        List<AtomDTO> buttons = item.getButtons();
        if (buttons != null) {
            AtomsAdapter atomsAdapter = this.buttonsAdapter;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            atomsAdapter.bind(context, buttons);
            this.buttonsAdapter.setOnAction(onAction);
            VerticalAtomsLayout verticalAtomsLayout = this.buttonsVAL;
            if (!verticalAtomsLayout.isLaidOut() || verticalAtomsLayout.isLayoutRequested()) {
                verticalAtomsLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.ozon.app.android.travel.molecules.view.emptyState.v1.EmptyStateView$bind$lambda$14$lambda$13$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(@NotNull View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        view.removeOnLayoutChangeListener(this);
                        Integer num2 = null;
                        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                        Iterable<View> children = viewGroup != null ? ViewGroupExtKt.children(viewGroup) : null;
                        if (children != null) {
                            Iterator<View> it = children.iterator();
                            if (!it.hasNext()) {
                                throw new NoSuchElementException();
                            }
                            View next = it.next();
                            num2 = Integer.valueOf(next instanceof SmallButtonView ? ((SmallButtonView) next).getWidth() : 0);
                            while (it.hasNext()) {
                                View next2 = it.next();
                                Integer valueOf = Integer.valueOf(next2 instanceof SmallButtonView ? ((SmallButtonView) next2).getWidth() : 0);
                                if (num2.compareTo(valueOf) < 0) {
                                    num2 = valueOf;
                                }
                            }
                        }
                        if (num2 != null) {
                            for (View view2 : children) {
                                if (view2 instanceof SmallButtonView) {
                                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                                    if (layoutParams == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                                    }
                                    layoutParams.width = num2.intValue();
                                    view2.setLayoutParams(layoutParams);
                                }
                            }
                        }
                    }
                });
            } else {
                Iterable<View> children = ViewGroupExtKt.children(verticalAtomsLayout);
                if (children != null) {
                    Iterator<View> it = children.iterator();
                    if (!it.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    View next = it.next();
                    num = Integer.valueOf(next instanceof SmallButtonView ? ((SmallButtonView) next).getWidth() : 0);
                    while (it.hasNext()) {
                        View next2 = it.next();
                        Integer valueOf = Integer.valueOf(next2 instanceof SmallButtonView ? ((SmallButtonView) next2).getWidth() : 0);
                        if (num.compareTo(valueOf) < 0) {
                            num = valueOf;
                        }
                    }
                } else {
                    num = null;
                }
                if (num != null) {
                    for (View view : children) {
                        if (view instanceof SmallButtonView) {
                            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                            if (layoutParams == null) {
                                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                            }
                            layoutParams.width = num.intValue();
                            view.setLayoutParams(layoutParams);
                        }
                    }
                }
            }
        }
        if (onAction != null) {
            onAction.invoke(new AtomAction.ViewAction(item.getTrackingInfo(), null, 2, null));
        }
    }

    public /* synthetic */ EmptyStateView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyStateView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(168, context);
        this.imageSize = px;
        int px2 = ResourceExtKt.toPx(24, context);
        this.standardMarginTop = px2;
        int px3 = ResourceExtKt.toPx(12, context);
        this.messageMarginTop = px3;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.buttonsAdapter = atomsAdapter;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(px, px);
        layoutParams.gravity = 1;
        appCompatImageView.setLayoutParams(layoutParams);
        this.imageACIV = appCompatImageView;
        q qVar = q.f64554a;
        TextAtomView textAtomView = (TextAtomView) qVar.g(N.b(TextAtomView.class), context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = px2;
        layoutParams2.gravity = 1;
        textAtomView.setLayoutParams(layoutParams2);
        textAtomView.setGravity(1);
        this.titleTAV = textAtomView;
        TextAtomView textAtomView2 = (TextAtomView) qVar.g(N.b(TextAtomView.class), context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.topMargin = px3;
        layoutParams3.gravity = 1;
        textAtomView2.setLayoutParams(layoutParams3);
        textAtomView2.setGravity(1);
        this.messageTAV = textAtomView2;
        VerticalAtomsLayout verticalAtomsLayout = new VerticalAtomsLayout(context, null, 0, 6, null);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.topMargin = px2;
        layoutParams4.gravity = 1;
        verticalAtomsLayout.setLayoutParams(layoutParams4);
        verticalAtomsLayout.setGravity(1);
        verticalAtomsLayout.setAdapter(atomsAdapter);
        verticalAtomsLayout.setDecorator(new EmptyStateDecoration(context));
        this.buttonsVAL = verticalAtomsLayout;
        setOrientation(1);
        addView(appCompatImageView);
        addView(textAtomView);
        addView(textAtomView2);
        addView(verticalAtomsLayout);
    }
}
