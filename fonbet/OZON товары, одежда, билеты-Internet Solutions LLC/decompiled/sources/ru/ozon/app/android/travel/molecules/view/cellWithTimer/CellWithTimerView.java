package ru.ozon.app.android.travel.molecules.view.cellWithTimer;

import Ez.ViewOnClickListenerC2978b;
import android.content.Context;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.travel.ui.molecules.databinding.ViewCellWithTimerBinding;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001bB\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000b2\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rJ\u000e\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/cellWithTimer/CellWithTimerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lru/ozon/app/android/travel/ui/molecules/databinding/ViewCellWithTimerBinding;", "cellItem", "Lru/ozon/app/android/travel/molecules/view/cellWithTimer/CellWithTimerVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "cellOutlineProvider", "Lru/ozon/app/android/travel/molecules/view/cellWithTimer/CellWithTimerView$CellOutlineProvider;", "bind", "item", "onAction", "updateTimerText", "timerText", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "updateCornerRadius", "newRadius", "", "CellOutlineProvider", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CellWithTimerView extends ConstraintLayout {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final ViewCellWithTimerBinding binding;
    private CellWithTimerVO cellItem;

    @NotNull
    private final CellOutlineProvider cellOutlineProvider;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0005¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/molecules/view/cellWithTimer/CellWithTimerView$CellOutlineProvider;", "Landroid/view/ViewOutlineProvider;", "", "radius", "<init>", "(F)V", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "outline", "", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "F", "getRadius", "()F", "setRadius", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class CellOutlineProvider extends ViewOutlineProvider {
        private float radius;

        public CellOutlineProvider(float f7) {
            this.radius = f7;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (view == null || outline == null) {
                return;
            }
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.radius);
        }

        public final void setRadius(float f7) {
            this.radius = f7;
        }
    }

    public /* synthetic */ CellWithTimerView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(CellWithTimerView cellWithTimerView, View view) {
        AtomAction clickAction;
        Function1<? super AtomAction, Unit> function1;
        CellWithTimerVO cellWithTimerVO = cellWithTimerView.cellItem;
        if (cellWithTimerVO == null || (clickAction = cellWithTimerVO.getClickAction()) == null || (function1 = cellWithTimerView.actionHandler) == null) {
            return;
        }
        function1.invoke(clickAction);
    }

    private final void updateCornerRadius(float newRadius) {
        this.cellOutlineProvider.setRadius(newRadius);
        invalidateOutline();
    }

    public final void bind(@NotNull CellWithTimerVO item, Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        CellWithTimerVO cellWithTimerVO = this.cellItem;
        boolean d11 = Intrinsics.d(cellWithTimerVO != null ? cellWithTimerVO.getCellBackgroundColor() : null, item.getCellBackgroundColor());
        CellWithTimerVO cellWithTimerVO2 = this.cellItem;
        boolean b11 = Intrinsics.b(cellWithTimerVO2 != null ? Float.valueOf(cellWithTimerVO2.getCellCornerRadius()) : null, item.getCellCornerRadius());
        this.cellItem = item;
        this.actionHandler = onAction;
        ViewCellWithTimerBinding viewCellWithTimerBinding = this.binding;
        Image timerImageView = viewCellWithTimerBinding.timerImageView;
        Intrinsics.checkNotNullExpressionValue(timerImageView, "timerImageView");
        ImageHolderKt.bind$default(timerImageView, item.getImage(), null, 2, null);
        TextAtomView titleTextView = viewCellWithTimerBinding.titleTextView;
        Intrinsics.checkNotNullExpressionValue(titleTextView, "titleTextView");
        TextAtomHolderKt.bind$default(titleTextView, item.getTitle(), null, 2, null);
        TextAtomView timerTextView = viewCellWithTimerBinding.timerTextView;
        Intrinsics.checkNotNullExpressionValue(timerTextView, "timerTextView");
        TextAtomHolderKt.bind$default(timerTextView, item.getTimerText(), null, 2, null);
        TextAtomView subtitleTextView = viewCellWithTimerBinding.subtitleTextView;
        Intrinsics.checkNotNullExpressionValue(subtitleTextView, "subtitleTextView");
        TextAtomHolderKt.bindOrGone$default(subtitleTextView, item.getSubtitle(), null, 2, null);
        AppCompatImageView rightIconView = viewCellWithTimerBinding.rightIconView;
        Intrinsics.checkNotNullExpressionValue(rightIconView, "rightIconView");
        rightIconView.setVisibility(item.getIsRightIconVisible() ? 0 : 8);
        AppCompatImageView rightIconView2 = viewCellWithTimerBinding.rightIconView;
        Intrinsics.checkNotNullExpressionValue(rightIconView2, "rightIconView");
        ImageViewExtKt.load$default(rightIconView2, item.getRightIcon(), null, null, null, null, false, null, 126, null);
        AppCompatImageView rightIconView3 = viewCellWithTimerBinding.rightIconView;
        Intrinsics.checkNotNullExpressionValue(rightIconView3, "rightIconView");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ThemeExtKt.tint(rightIconView3, styleParser.parseColor(context, item.getRightIconTint()));
        if (!d11) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            setBackgroundColor(styleParser.parseColor(context2, item.getCellBackgroundColor(), UniColors.LAYER_FLOOR_1.getResId()));
        }
        if (b11) {
            return;
        }
        updateCornerRadius(item.getCellCornerRadius());
    }

    public final void updateTimerText(@NotNull OzonSpannableString timerText) {
        TextAtom timerText2;
        TextAtom copy$default;
        Intrinsics.checkNotNullParameter(timerText, "timerText");
        CellWithTimerVO cellWithTimerVO = this.cellItem;
        if (cellWithTimerVO == null || (timerText2 = cellWithTimerVO.getTimerText()) == null || (copy$default = TextAtom.copy$default(timerText2, timerText, null, null, null, null, null, null, 126, null)) == null) {
            return;
        }
        CellWithTimerVO cellWithTimerVO2 = this.cellItem;
        this.cellItem = cellWithTimerVO2 != null ? CellWithTimerVO.copy$default(cellWithTimerVO2, null, copy$default, null, null, false, null, null, 0.0f, null, null, 1021, null) : null;
        TextAtomView timerTextView = this.binding.timerTextView;
        Intrinsics.checkNotNullExpressionValue(timerTextView, "timerTextView");
        TextAtomHolderKt.bind$default(timerTextView, copy$default, null, 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CellWithTimerView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewCellWithTimerBinding inflate = ViewCellWithTimerBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
        CellOutlineProvider cellOutlineProvider = new CellOutlineProvider(ResourceExtKt.toPxF(16, context));
        this.cellOutlineProvider = cellOutlineProvider;
        setOnClickListener(new ViewOnClickListenerC2978b(this, 12));
        setClipToOutline(true);
        setOutlineProvider(cellOutlineProvider);
    }
}
