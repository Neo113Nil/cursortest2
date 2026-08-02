package ru.ozon.fintech.features.cbottombase.ui;

import H40.b;
import android.content.Context;
import android.util.AttributeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/ozon/fintech/features/cbottombase/ui/CbottomUIScrollableView;", "LH40/b;", "cbottom-base_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CbottomUIScrollableView extends b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CbottomUIScrollableView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // H40.b
    public final int d() {
        return R.layout.cbottom_ui_scrollable_view;
    }
}
