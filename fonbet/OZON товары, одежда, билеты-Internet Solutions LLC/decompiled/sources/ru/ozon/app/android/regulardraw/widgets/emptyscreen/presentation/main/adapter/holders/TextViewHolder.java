package ru.ozon.app.android.regulardraw.widgets.emptyscreen.presentation.main.adapter.holders;

import android.content.Context;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import jk0.j;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.R$style;
import ru.ozon.app.android.regulardraw.widgets.emptyscreen.data.Text$Alignment;
import ru.ozon.app.android.regulardraw.widgets.emptyscreen.data.Text$TextDTO;
import ru.ozon.app.android.regulardraw.widgets.emptyscreen.presentation.main.TextAlignmentExtensionsKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/emptyscreen/presentation/main/adapter/holders/TextViewHolder;", "Ljk0/j;", "Landroidx/appcompat/widget/AppCompatTextView;", "view", "<init>", "(Landroidx/appcompat/widget/AppCompatTextView;)V", "Lru/ozon/app/android/regulardraw/widgets/emptyscreen/data/Text$Alignment;", "alignment", "", "hasBackground", "Lkotlin/Pair;", "", "resolveMargins", "(Lru/ozon/app/android/regulardraw/widgets/emptyscreen/data/Text$Alignment;Z)Lkotlin/Pair;", "Lru/ozon/app/android/regulardraw/widgets/emptyscreen/data/Text$TextDTO;", "item", "", "bind", "(Lru/ozon/app/android/regulardraw/widgets/emptyscreen/data/Text$TextDTO;)V", "Landroidx/appcompat/widget/AppCompatTextView;", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TextViewHolder extends j {

    @NotNull
    private final AppCompatTextView view;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final int margin12 = ResourceExtKt.toPx(12);
    private static final int margin32 = ResourceExtKt.toPx(32);

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/emptyscreen/presentation/main/adapter/holders/TextViewHolder$Companion;", "", "<init>", "()V", "margin12", "", "margin32", "create", "Lru/ozon/app/android/regulardraw/widgets/emptyscreen/presentation/main/adapter/holders/TextViewHolder;", "context", "Landroid/content/Context;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TextViewHolder create(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            AppCompatTextView appCompatTextView = new AppCompatTextView(context);
            appCompatTextView.setLayoutParams(new RecyclerView.p(-1, -2));
            appCompatTextView.setTextAppearance(R$style.Text_Body);
            return new TextViewHolder(appCompatTextView);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextViewHolder(@NotNull AppCompatTextView view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    private final Pair<Integer, Integer> resolveMargins(Text$Alignment alignment, boolean hasBackground) {
        if (hasBackground) {
            int i11 = margin12;
            return new Pair<>(Integer.valueOf(i11), Integer.valueOf(i11));
        }
        if (alignment == Text$Alignment.LEFT) {
            return new Pair<>(Integer.valueOf(margin12), Integer.valueOf(margin32));
        }
        int i12 = margin32;
        return new Pair<>(Integer.valueOf(i12), Integer.valueOf(i12));
    }

    public final void bind(@NotNull Text$TextDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        AppCompatTextView appCompatTextView = this.view;
        Text$Alignment alignment = item.getAlignment();
        appCompatTextView.setGravity(alignment != null ? TextAlignmentExtensionsKt.resolveToGravity(alignment) : 1);
        appCompatTextView.setText(item.getText());
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = appCompatTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        appCompatTextView.setTextColor(styleParser.parseColor(context, item.getTextColor(), UniColors.TEXT_PRIMARY.getResId()));
        appCompatTextView.setTextSize(item.getFontSize());
        ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Pair<Integer, Integer> resolveMargins = resolveMargins(item.getAlignment(), item.getShowBackground());
        marginLayoutParams.setMargins(resolveMargins.a().intValue(), marginLayoutParams.topMargin, resolveMargins.b().intValue(), marginLayoutParams.bottomMargin);
        appCompatTextView.setLayoutParams(marginLayoutParams);
    }
}
