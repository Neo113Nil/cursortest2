package ru.ozon.app.android.returns.ui.presentation.flexImages.imageView;

import AI.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.presentation.flexImages.ImageVI;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000  2\u00020\u0001:\u0001 B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R.\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/returns/ui/presentation/flexImages/imageView/BaseImageView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/returns/ui/presentation/flexImages/ImageVI;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "bind", "(Lru/ozon/app/android/returns/ui/presentation/flexImages/ImageVI;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "boundedCommonControlSettings", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "setActionHandler", "(Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/uni/android/atom/icon/IconView;", "iconView", "Lru/ozon/uni/android/atom/icon/IconView;", "getIconView", "()Lru/ozon/uni/android/atom/icon/IconView;", "Companion", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class BaseImageView extends FrameLayout {

    @NotNull
    protected static final Companion Companion = new Companion(null);
    private static final int ID_ICON = View.generateViewId();

    @NotNull
    private Function1<? super AtomAction, Unit> actionHandler;
    private CommonControlSettings boundedCommonControlSettings;

    @NotNull
    private final IconView iconView;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0084\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/returns/ui/presentation/flexImages/imageView/BaseImageView$Companion;", "", "<init>", "()V", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    protected static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseImageView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.actionHandler = BaseImageView$actionHandler$1.INSTANCE;
        IconView iconView = new IconView(context, null, 0, 6, null);
        iconView.setId(ID_ICON);
        iconView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.iconView = iconView;
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        iconView.setOnClickListener(new a(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(BaseImageView baseImageView, View view) {
        AtomActionDTO action;
        AtomAction atomAction;
        CommonControlSettings commonControlSettings = baseImageView.boundedCommonControlSettings;
        if (commonControlSettings == null || (action = commonControlSettings.getAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(action, commonControlSettings.getTrackingInfo())) == null) {
            return;
        }
        baseImageView.actionHandler.invoke(atomAction);
    }

    public final void bind(@NotNull ImageVI item, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.actionHandler = onAction;
        this.boundedCommonControlSettings = item.getCommon();
        IconHolderKt.bind(this.iconView, item.getIcon(), this.actionHandler);
    }

    @NotNull
    protected final Function1<AtomAction, Unit> getActionHandler() {
        return this.actionHandler;
    }

    @NotNull
    protected final IconView getIconView() {
        return this.iconView;
    }
}
