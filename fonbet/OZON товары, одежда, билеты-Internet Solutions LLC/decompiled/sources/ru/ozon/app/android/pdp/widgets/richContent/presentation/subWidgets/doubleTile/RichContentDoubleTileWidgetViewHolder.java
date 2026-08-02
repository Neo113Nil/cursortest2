package ru.ozon.app.android.pdp.widgets.richContent.presentation.subWidgets.doubleTile;

import WZ.t;
import android.graphics.drawable.Drawable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.databinding.WidgetRichContentDoubleTileBinding;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentVO;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.binderDelegate.RichContentDoubleTileBinderDelegate;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.subWidgets.RichContentSubWidgetViewHolder;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/presentation/subWidgets/doubleTile/RichContentDoubleTileWidgetViewHolder;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/subWidgets/RichContentSubWidgetViewHolder;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/subWidgets/doubleTile/RichContentDoubleTileVoWrapper;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/binderDelegate/RichContentDoubleTileBinderDelegate;", "binding", "Lru/ozon/app/android/pdp/databinding/WidgetRichContentDoubleTileBinding;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "<init>", "(Lru/ozon/app/android/pdp/databinding/WidgetRichContentDoubleTileBinding;Lru/ozon/app/android/composer/ComposerReferences;)V", "bindSubWidget", "", "item", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RichContentDoubleTileWidgetViewHolder extends RichContentSubWidgetViewHolder<RichContentDoubleTileVoWrapper> implements RichContentDoubleTileBinderDelegate {

    @NotNull
    private final WidgetRichContentDoubleTileBinding binding;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RichContentDoubleTileWidgetViewHolder(@NotNull WidgetRichContentDoubleTileBinding binding, @NotNull ComposerReferences refs) {
        super(r0, refs);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
    }

    public void bindDoubleTile(@NotNull WidgetRichContentDoubleTileBinding widgetRichContentDoubleTileBinding, @NotNull RichContentVO.Item.DoubleTile doubleTile, @NotNull Function0<? extends Drawable> function0, @NotNull Function2<? super AtomAction, ? super t, Unit> function2) {
        RichContentDoubleTileBinderDelegate.DefaultImpls.bindDoubleTile(this, widgetRichContentDoubleTileBinding, doubleTile, function0, function2);
    }

    @Override // ru.ozon.app.android.pdp.widgets.richContent.presentation.subWidgets.RichContentSubWidgetViewHolder
    public void bindSubWidget(@NotNull RichContentDoubleTileVoWrapper item) {
        Intrinsics.checkNotNullParameter(item, "item");
        bindDoubleTile(this.binding, item.getItem(), new C(this) { // from class: ru.ozon.app.android.pdp.widgets.richContent.presentation.subWidgets.doubleTile.RichContentDoubleTileWidgetViewHolder$bindSubWidget$1
            @Override // kotlin.jvm.internal.C, kotlin.reflect.n
            public Object get() {
                Drawable backgroundColor;
                backgroundColor = ((RichContentDoubleTileWidgetViewHolder) this.receiver).getBackgroundColor();
                return backgroundColor;
            }
        }, new RichContentDoubleTileWidgetViewHolder$bindSubWidget$2(this));
    }
}
