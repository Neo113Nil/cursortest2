package ru.ozon.app.android.pdp.widgets.richContent.presentation.mainWidgetRecycler;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentVO;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentViewFactory;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.binderDelegate.RichContentSpacerBinderDelegate;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u000b2\u00020\u00012\u00020\u0002:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/presentation/mainWidgetRecycler/RichContentSpacerViewHolder;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/mainWidgetRecycler/RichContentItemViewHolder;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/binderDelegate/RichContentSpacerBinderDelegate;", "spacerV", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "bind", "", "item", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$Spacer;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RichContentSpacerViewHolder extends RichContentItemViewHolder implements RichContentSpacerBinderDelegate {

    @NotNull
    private final View spacerV;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/presentation/mainWidgetRecycler/RichContentSpacerViewHolder$Companion;", "", "<init>", "()V", "create", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/mainWidgetRecycler/RichContentSpacerViewHolder;", "parent", "Landroid/view/ViewGroup;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RichContentSpacerViewHolder create(@NotNull ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            RichContentViewFactory richContentViewFactory = RichContentViewFactory.INSTANCE;
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return new RichContentSpacerViewHolder(richContentViewFactory.createSpacerView(context));
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RichContentSpacerViewHolder(@NotNull View spacerV) {
        super(spacerV, null);
        Intrinsics.checkNotNullParameter(spacerV, "spacerV");
        this.spacerV = spacerV;
    }

    public final void bind(@NotNull RichContentVO.Item.Spacer item) {
        Intrinsics.checkNotNullParameter(item, "item");
        bindSpacer(this.spacerV, item);
    }

    public void bindSpacer(@NotNull View view, @NotNull RichContentVO.Item.Spacer spacer) {
        RichContentSpacerBinderDelegate.DefaultImpls.bindSpacer(this, view, spacer);
    }
}
