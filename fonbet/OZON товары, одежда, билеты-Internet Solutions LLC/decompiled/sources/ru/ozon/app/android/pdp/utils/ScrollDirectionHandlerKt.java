package ru.ozon.app.android.pdp.utils;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0006"}, d2 = {"addScrollDirectionHandler", "", "Landroidx/recyclerview/widget/RecyclerView;", "handler", "Lru/ozon/app/android/pdp/utils/ScrollDirectionHandler;", "removeScrollDirectionHandler", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScrollDirectionHandlerKt {
    public static final void addScrollDirectionHandler(@NotNull RecyclerView recyclerView, @NotNull ScrollDirectionHandler handler) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(handler, "handler");
        recyclerView.addOnItemTouchListener(handler);
        recyclerView.addOnScrollListener(handler);
    }

    public static final void removeScrollDirectionHandler(@NotNull RecyclerView recyclerView, @NotNull ScrollDirectionHandler handler) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(handler, "handler");
        recyclerView.removeOnItemTouchListener(handler);
        recyclerView.removeOnScrollListener(handler);
    }
}
