package ru.ozon.app.android.regulardraw.widgets.emptyscreen.presentation.main.adapter.holders;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import jk0.j;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.R$color;
import ru.ozon.app.android.regulardraw.R$style;
import ru.ozon.app.android.regulardraw.ui.OutlinedTextView;
import ru.ozon.app.android.regulardraw.widgets.emptyscreen.data.Text$Alignment;
import ru.ozon.app.android.regulardraw.widgets.emptyscreen.data.Text$TitleDTO;
import ru.ozon.app.android.regulardraw.widgets.emptyscreen.presentation.main.TextAlignmentExtensionsKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/emptyscreen/presentation/main/adapter/holders/TitleViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/regulardraw/ui/OutlinedTextView;", "view", "", "isSmallScreen", "<init>", "(Lru/ozon/app/android/regulardraw/ui/OutlinedTextView;Z)V", "Lru/ozon/app/android/regulardraw/widgets/emptyscreen/data/Text$Alignment;", "alignment", "hasBackground", "Lkotlin/Pair;", "", "resolveMargins", "(Lru/ozon/app/android/regulardraw/widgets/emptyscreen/data/Text$Alignment;Z)Lkotlin/Pair;", "Lru/ozon/app/android/regulardraw/widgets/emptyscreen/data/Text$TitleDTO;", "item", "", "bind", "(Lru/ozon/app/android/regulardraw/widgets/emptyscreen/data/Text$TitleDTO;)V", "Lru/ozon/app/android/regulardraw/ui/OutlinedTextView;", "Z", "strokeColor", "I", "", "strokeWidth", "F", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TitleViewHolder extends j {
    private final boolean isSmallScreen;
    private final int strokeColor;
    private final float strokeWidth;

    @NotNull
    private final OutlinedTextView view;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final int margin12 = ResourceExtKt.toPx(12);
    private static final int margin16 = ResourceExtKt.toPx(16);
    private static final int margin32 = ResourceExtKt.toPx(32);
    private static final int titleLineHeight = ResourceExtKt.toPx(24);

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/emptyscreen/presentation/main/adapter/holders/TitleViewHolder$Companion;", "", "<init>", "()V", "SMALL_SCREEN_TEXT_SIZE_SP", "", "margin12", "", "margin16", "margin32", "titleLineHeight", "create", "Lru/ozon/app/android/regulardraw/widgets/emptyscreen/presentation/main/adapter/holders/TitleViewHolder;", "context", "Landroid/content/Context;", "isSmallScreen", "", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TitleViewHolder create(@NotNull Context context, boolean isSmallScreen) {
            Intrinsics.checkNotNullParameter(context, "context");
            OutlinedTextView outlinedTextView = new OutlinedTextView(context, null, 0, 6, null);
            outlinedTextView.setLayoutParams(new RecyclerView.p(-1, -2));
            outlinedTextView.setTextAppearance(R$style.Text_Bold);
            outlinedTextView.setAllCaps(true);
            return new TitleViewHolder(outlinedTextView, isSmallScreen);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TitleViewHolder(@NotNull OutlinedTextView view, boolean z11) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
        this.isSmallScreen = z11;
        this.strokeColor = view.getContext().getColor(R$color.tabbar_very_dark_blue_stroke);
        this.strokeWidth = ResourceExtKt.toPx(2.6d);
    }

    private final Pair<Integer, Integer> resolveMargins(Text$Alignment alignment, boolean hasBackground) {
        if (hasBackground) {
            int i11 = margin16;
            return new Pair<>(Integer.valueOf(i11), Integer.valueOf(i11));
        }
        if (alignment == Text$Alignment.LEFT) {
            return new Pair<>(Integer.valueOf(margin12), Integer.valueOf(margin32));
        }
        int i12 = margin12;
        return new Pair<>(Integer.valueOf(i12), Integer.valueOf(i12));
    }

    public final void bind(@NotNull Text$TitleDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        OutlinedTextView outlinedTextView = this.view;
        Text$Alignment alignment = item.getAlignment();
        if (alignment != null) {
            outlinedTextView.setGravity(TextAlignmentExtensionsKt.resolveToGravity(alignment));
        }
        outlinedTextView.setText(item.getText());
        outlinedTextView.setTextSize(this.isSmallScreen ? 24.0f : item.getFontSize());
        outlinedTextView.setLineHeight(titleLineHeight);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = outlinedTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        outlinedTextView.setTextConfig(styleParser.parseColor(context, item.getTextColor(), UniColors.TEXT_PRIMARY.getResId()), this.strokeColor, this.strokeWidth);
        ViewGroup.LayoutParams layoutParams = outlinedTextView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Pair<Integer, Integer> resolveMargins = resolveMargins(item.getAlignment(), item.getShowBackground());
        marginLayoutParams.setMargins(resolveMargins.a().intValue(), marginLayoutParams.topMargin, resolveMargins.b().intValue(), marginLayoutParams.bottomMargin);
        outlinedTextView.setLayoutParams(marginLayoutParams);
    }
}
