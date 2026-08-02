package ru.ozon.fintech.ui.container;

import com.detmir.recycli.adapters.RecyclerItem;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J \u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\f"}, d2 = {"Lru/ozon/fintech/ui/container/AttachItemViewToWindowCallback;", "", "isNeedCreateCallback", "", "position", "", "absolutePosition", "item", "Lcom/detmir/recycli/adapters/RecyclerItem;", "onAttachViewToWindow", "", "onDetachViewToWindow", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface AttachItemViewToWindowCallback {
    boolean isNeedCreateCallback(int position, int absolutePosition, @NotNull RecyclerItem item);

    void onAttachViewToWindow(int position, int absolutePosition, @NotNull RecyclerItem item);

    void onDetachViewToWindow(int position, int absolutePosition, @NotNull RecyclerItem item);
}
