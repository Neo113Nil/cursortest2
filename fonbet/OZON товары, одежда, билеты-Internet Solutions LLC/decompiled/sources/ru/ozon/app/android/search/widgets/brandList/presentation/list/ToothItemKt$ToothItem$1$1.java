package ru.ozon.app.android.search.widgets.brandList.presentation.list;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorView;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorView;", "context", "Landroid/content/Context;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ToothItemKt$ToothItem$1$1 extends AbstractC7737t implements Function1<Context, IslandSeparatorView> {
    final /* synthetic */ int $islandSeparatorHeight;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ToothItemKt$ToothItem$1$1(int i11) {
        super(1);
        this.$islandSeparatorHeight = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final IslandSeparatorView invoke(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        IslandSeparatorView islandSeparatorView = new IslandSeparatorView(context, null, 0, 6, null);
        islandSeparatorView.setViewState(new IslandSeparatorView.ViewState(false, false, this.$islandSeparatorHeight, ThemeExtKt.themeColor(context, R$attr.bgDarkKey), 2, null));
        return islandSeparatorView;
    }
}
