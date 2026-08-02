package ru.ozon.app.android.pdp.widgets.richContent.presentation.mainWidgetRecycler;

import android.content.Context;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentVO;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentViewFactory;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.binderDelegate.RichContentTextBinderDelegate;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u000b2\u00020\u00012\u00020\u0002:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/presentation/mainWidgetRecycler/RichContentTextViewHolder;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/mainWidgetRecycler/RichContentItemViewHolder;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/binderDelegate/RichContentTextBinderDelegate;", "richContentTextTAV", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "<init>", "(Lru/ozon/uni/android/atom/text/TextAtomV2View;)V", "bind", "", "item", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item$Text;", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RichContentTextViewHolder extends RichContentItemViewHolder implements RichContentTextBinderDelegate {

    @NotNull
    private final TextAtomV2View richContentTextTAV;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextAtomV2View.$stable;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/presentation/mainWidgetRecycler/RichContentTextViewHolder$Companion;", "", "<init>", "()V", "create", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/mainWidgetRecycler/RichContentTextViewHolder;", "parent", "Landroid/view/ViewGroup;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RichContentTextViewHolder create(@NotNull ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            RichContentViewFactory richContentViewFactory = RichContentViewFactory.INSTANCE;
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return new RichContentTextViewHolder(richContentViewFactory.createTextView(context));
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RichContentTextViewHolder(@NotNull TextAtomV2View richContentTextTAV) {
        super(richContentTextTAV, null);
        Intrinsics.checkNotNullParameter(richContentTextTAV, "richContentTextTAV");
        this.richContentTextTAV = richContentTextTAV;
    }

    public final void bind(@NotNull RichContentVO.Item.Text item) {
        Intrinsics.checkNotNullParameter(item, "item");
        bindText(this.richContentTextTAV, item);
    }

    public void bindText(@NotNull TextAtomV2View textAtomV2View, @NotNull RichContentVO.Item.Text text) {
        RichContentTextBinderDelegate.DefaultImpls.bindText(this, textAtomV2View, text);
    }
}
