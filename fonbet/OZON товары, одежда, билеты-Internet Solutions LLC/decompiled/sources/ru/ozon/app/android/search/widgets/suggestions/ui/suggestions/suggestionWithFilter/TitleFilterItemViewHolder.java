package ru.ozon.app.android.search.widgets.suggestions.ui.suggestions.suggestionWithFilter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import jk0.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.R$id;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/TitleFilterItemViewHolder;", "Ljk0/j;", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/ViewGroup;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "item", "", "bind", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "filterNameTv", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TitleFilterItemViewHolder extends j {
    private final TextAtomV2View filterNameTv;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = TextAtomV2View.$stable;
    private static final int MAX_WIDTH = ResourceExtKt.toPx(164);
    private static final int MARGIN_TOP = ResourceExtKt.toPx(4);
    private static final int MARGIN_BOTTOM = ResourceExtKt.toPx(12);

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/search/widgets/suggestions/ui/suggestions/suggestionWithFilter/TitleFilterItemViewHolder$Companion;", "", "<init>", "()V", "MAX_WIDTH", "", "MARGIN_START", "MARGIN_TOP", "MARGIN_END", "MARGIN_BOTTOM", "createView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "parent", "Landroid/view/ViewGroup;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final TextAtomV2View createView(ViewGroup parent) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
            textAtomV2View.setId(R$id.filterNameTv);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
            marginLayoutParams.setMargins(0, TitleFilterItemViewHolder.MARGIN_TOP, 0, TitleFilterItemViewHolder.MARGIN_BOTTOM);
            textAtomV2View.setLayoutParams(marginLayoutParams);
            textAtomV2View.setMaxWidth(TitleFilterItemViewHolder.MAX_WIDTH);
            textAtomV2View.setGravity(16);
            return textAtomV2View;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TitleFilterItemViewHolder(@NotNull ViewGroup parent) {
        super(INSTANCE.createView(parent));
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = this.itemView;
        this.filterNameTv = view instanceof TextAtomV2View ? (TextAtomV2View) view : null;
    }

    public final void bind(@NotNull TextDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextAtomV2View textAtomV2View = this.filterNameTv;
        if (textAtomV2View != null) {
            TextHolderKt.bind$default(textAtomV2View, item, null, 2, null);
        }
    }
}
