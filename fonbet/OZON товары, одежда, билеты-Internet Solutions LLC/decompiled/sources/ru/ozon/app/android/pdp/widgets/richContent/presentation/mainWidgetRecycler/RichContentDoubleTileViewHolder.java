package ru.ozon.app.android.pdp.widgets.richContent.presentation.mainWidgetRecycler;

import WZ.t;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.databinding.WidgetRichContentDoubleTileBinding;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentVO;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.binderDelegate.RichContentDoubleTileBinderDelegate;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0015B+\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R(\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/presentation/mainWidgetRecycler/RichContentDoubleTileViewHolder;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/mainWidgetRecycler/RichContentItemViewHolder;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/binderDelegate/RichContentDoubleTileBinderDelegate;", "Lru/ozon/app/android/pdp/databinding/WidgetRichContentDoubleTileBinding;", "binding", "Lkotlin/Function2;", "Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "", "onClickAction", "<init>", "(Lru/ozon/app/android/pdp/databinding/WidgetRichContentDoubleTileBinding;Lkotlin/jvm/functions/Function2;)V", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$DoubleTile;", "item", "Lkotlin/Function0;", "Landroid/graphics/drawable/Drawable;", "backgroundColor", "bind", "(Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$DoubleTile;Lkotlin/jvm/functions/Function0;)V", "Lru/ozon/app/android/pdp/databinding/WidgetRichContentDoubleTileBinding;", "Lkotlin/jvm/functions/Function2;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RichContentDoubleTileViewHolder extends RichContentItemViewHolder implements RichContentDoubleTileBinderDelegate {

    @NotNull
    private final WidgetRichContentDoubleTileBinding binding;

    @NotNull
    private final Function2<AtomAction, t, Unit> onClickAction;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/presentation/mainWidgetRecycler/RichContentDoubleTileViewHolder$Companion;", "", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "Lkotlin/Function2;", "Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "", "onClickAction", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/mainWidgetRecycler/RichContentDoubleTileViewHolder;", "create", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function2;)Lru/ozon/app/android/pdp/widgets/richContent/presentation/mainWidgetRecycler/RichContentDoubleTileViewHolder;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RichContentDoubleTileViewHolder create(@NotNull ViewGroup parent, @NotNull Function2<? super AtomAction, ? super t, Unit> onClickAction) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(onClickAction, "onClickAction");
            WidgetRichContentDoubleTileBinding inflate = WidgetRichContentDoubleTileBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            return new RichContentDoubleTileViewHolder(inflate, onClickAction);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RichContentDoubleTileViewHolder(@NotNull WidgetRichContentDoubleTileBinding binding, @NotNull Function2<? super AtomAction, ? super t, Unit> onClickAction) {
        super(r0, null);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(onClickAction, "onClickAction");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.onClickAction = onClickAction;
    }

    public final void bind(@NotNull RichContentVO.Item.DoubleTile item, @NotNull Function0<? extends Drawable> backgroundColor) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        bindDoubleTile(this.binding, item, backgroundColor, this.onClickAction);
    }

    public void bindDoubleTile(@NotNull WidgetRichContentDoubleTileBinding widgetRichContentDoubleTileBinding, @NotNull RichContentVO.Item.DoubleTile doubleTile, @NotNull Function0<? extends Drawable> function0, @NotNull Function2<? super AtomAction, ? super t, Unit> function2) {
        RichContentDoubleTileBinderDelegate.DefaultImpls.bindDoubleTile(this, widgetRichContentDoubleTileBinding, doubleTile, function0, function2);
    }
}
