package ru.ozon.app.android.returns.ui.molecules.reason.viewHolder;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.molecules.textarea.viewObject.ReasonRow;
import ru.ozon.app.android.returns.ui.presentation.flexImages.FlexImagesView;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/reason/viewHolder/PickedImagesViewHolder;", "Lru/ozon/app/android/returns/ui/molecules/reason/viewHolder/ReasonViewHolder;", "flexImagesView", "Lru/ozon/app/android/returns/ui/presentation/flexImages/FlexImagesView;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "<init>", "(Lru/ozon/app/android/returns/ui/presentation/flexImages/FlexImagesView;Lkotlin/jvm/functions/Function1;)V", "bind", "item", "Lru/ozon/app/android/returns/ui/molecules/textarea/viewObject/ReasonRow$PickedImagesRow;", "Companion", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PickedImagesViewHolder extends ReasonViewHolder {

    @NotNull
    private final FlexImagesView flexImagesView;

    @NotNull
    private final Function1<AtomAction, Unit> onAction;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final float CORNER_RADIUS = ResourceExtKt.toPxF(16);
    private static final int PADDING = UiExtKt.toPx(12);
    private static final int TOP_PADDING = UiExtKt.toPx(8);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/reason/viewHolder/PickedImagesViewHolder$Companion;", "", "<init>", "()V", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PickedImagesViewHolder(@NotNull FlexImagesView flexImagesView, @NotNull Function1<? super AtomAction, Unit> onAction) {
        super(flexImagesView, null);
        Intrinsics.checkNotNullParameter(flexImagesView, "flexImagesView");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.flexImagesView = flexImagesView;
        this.onAction = onAction;
        GradientDrawable gradientDrawable = new GradientDrawable();
        Context context = flexImagesView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        gradientDrawable.setColor(ColorStateList.valueOf(ThemeExtKt.themeColor(context, R$attr.bgSecondary)));
        gradientDrawable.setCornerRadius(CORNER_RADIUS);
        flexImagesView.setBackground(gradientDrawable);
        int i11 = PADDING;
        flexImagesView.setPadding(i11, TOP_PADDING, i11, i11);
    }

    public final void bind(@NotNull ReasonRow.PickedImagesRow item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.flexImagesView.bind(item.getItems(), this.onAction);
    }
}
