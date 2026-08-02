package ru.ozon.app.android.session.sessionList.presentation.viewFactory;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.view.atoms.cells.subtitled.CellWithSubtitleDefaultView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\f\u0010\b\u001a\u00020\u0005*\u00020\u0005H\u0002¨\u0006\t"}, d2 = {"Lru/ozon/app/android/session/sessionList/presentation/viewFactory/SessionListItemViewFactory;", "", "<init>", "()V", "create", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "addHorizontalMargins", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SessionListItemViewFactory {
    private final View addHorizontalMargins(View view) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMarginStart(ResourceExtKt.toPx(16));
        layoutParams.setMarginEnd(ResourceExtKt.toPx(16));
        view.setLayoutParams(layoutParams);
        return view;
    }

    @NotNull
    public final View create(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return addHorizontalMargins(new CellWithSubtitleDefaultView(context, null, 0, 6, null));
    }
}
