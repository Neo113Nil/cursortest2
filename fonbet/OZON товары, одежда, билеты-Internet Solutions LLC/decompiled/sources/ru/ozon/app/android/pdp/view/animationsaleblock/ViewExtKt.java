package ru.ozon.app.android.pdp.view.animationsaleblock;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$drawable;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"GRADIENT_WIDTH", "", "createViewGradient", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ViewExtKt {
    private static final int GRADIENT_WIDTH = ResourceExtKt.toPx(158);

    @NotNull
    public static final View createViewGradient(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = new View(parent.getContext());
        view.setId(View.generateViewId());
        view.setLayoutParams(new ViewGroup.LayoutParams(GRADIENT_WIDTH, -1));
        view.setVisibility(8);
        view.setBackgroundResource(R$drawable.gradient_saleblock);
        parent.addView(view);
        return view;
    }
}
