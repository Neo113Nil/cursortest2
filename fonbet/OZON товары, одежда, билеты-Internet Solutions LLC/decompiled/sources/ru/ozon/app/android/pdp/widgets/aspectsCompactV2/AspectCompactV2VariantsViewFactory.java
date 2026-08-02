package ru.ozon.app.android.pdp.widgets.aspectsCompactV2;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/AspectCompactV2VariantsViewFactory;", "", "<init>", "()V", "createView", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AspectCompactV2VariantsViewFactory {

    @NotNull
    public static final AspectCompactV2VariantsViewFactory INSTANCE = new AspectCompactV2VariantsViewFactory();

    private AspectCompactV2VariantsViewFactory() {
    }

    @NotNull
    public final RecyclerView createView(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.variantsRv);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        recyclerView.setClipToPadding(false);
        return recyclerView;
    }
}
