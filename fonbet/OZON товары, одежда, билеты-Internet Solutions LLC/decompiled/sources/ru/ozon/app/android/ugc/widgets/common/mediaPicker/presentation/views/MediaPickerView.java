package ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.views;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.utils.MarginItemDecoration;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/widgets/common/mediaPicker/presentation/views/MediaPickerView;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "canScroll", "", "getCanScroll", "()Z", "setCanScroll", "(Z)V", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MediaPickerView extends RecyclerView {
    private boolean canScroll;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaPickerView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.canScroll = true;
        setLayoutParams(new RecyclerView.p(-1, -2));
        setLayoutManager(new LinearLayoutManager(context) { // from class: ru.ozon.app.android.ugc.widgets.common.mediaPicker.presentation.views.MediaPickerView.1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
            public boolean canScrollHorizontally() {
                return this.getCanScroll();
            }
        });
        setNestedScrollingEnabled(false);
        Dimens dimens = Dimens.INSTANCE;
        addItemDecoration(new MarginItemDecoration(dimens.getDP_6(), dimens.getDP_16()));
        StyleParser styleParser = StyleParser.INSTANCE;
        UniColors uniColors = UniColors.LAYER_FLOOR_1;
        setBackgroundColor(styleParser.parseColor(context, uniColors.getToken(), uniColors.getResId()));
    }

    public final boolean getCanScroll() {
        return this.canScroll;
    }

    public final void setCanScroll(boolean z11) {
        this.canScroll = z11;
    }
}
