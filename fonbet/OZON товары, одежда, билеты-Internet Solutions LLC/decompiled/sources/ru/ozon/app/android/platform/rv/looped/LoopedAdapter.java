package ru.ozon.app.android.platform.rv.looped;

import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import jk0.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.view.recycler.adapter.lifecycle.LifecycleAdapter;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000f\u001a\u00020\u000e2\n\u0010\u000b\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u0007H&¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\u000e2\n\u0010\u000b\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u0015\u001a\u00020\u000e2\n\u0010\u000b\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\r\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u0015\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u0014J9\u0010\u001c\u001a\u00020\u000e2\n\u0010\u000b\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u00072\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u0012J\u0015\u0010\u001f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\"\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000!8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/platform/rv/looped/LoopedAdapter;", "T", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleAdapter;", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "Landroidx/lifecycle/J;", "lifecycleOwner", "", "minItemsCountForLoop", "<init>", "(Landroidx/lifecycle/J;I)V", "holder", "item", "position", "", "onBind", "(Ljk0/j;Ljava/lang/Object;I)V", "getItemCount", "()I", "getItemViewType", "(I)I", "onBindViewHolder", "(Ljk0/j;I)V", "", "", "payloads", "(Ljk0/j;ILjava/util/List;)V", "getViewType", "onBindWithPayload", "(Ljk0/j;Ljava/lang/Object;ILjava/util/List;)V", "getCorrectItemsCount", "getFixedPosition", "I", "", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "items", "android-platform_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class LoopedAdapter<T> extends LifecycleAdapter<j> {
    private final int minItemsCountForLoop;

    public /* synthetic */ LoopedAdapter(J j11, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, (i12 & 2) != 0 ? 2 : i11);
    }

    public final int getCorrectItemsCount() {
        return getItems().size();
    }

    public final int getFixedPosition(int position) {
        return LoopedRecyclerView.INSTANCE.getCorrectPosition(position, getCorrectItemsCount());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int getItemCount() {
        if (getItems().size() >= this.minItemsCountForLoop) {
            return 100000;
        }
        return getItems().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int getItemViewType(int position) {
        return getViewType(getFixedPosition(position));
    }

    @NotNull
    public abstract List<T> getItems();

    public int getViewType(int position) {
        return 0;
    }

    public abstract void onBind(@NotNull j holder, T item, int position);

    public void onBindWithPayload(@NotNull j holder, T item, int position, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        onBind(holder, item, position);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoopedAdapter(@NotNull J lifecycleOwner, int i11) {
        super(lifecycleOwner, null, 2, null);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.minItemsCountForLoop = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.C c11, int i11, List list) {
        onBindViewHolder((j) c11, i11, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onBindViewHolder(@NotNull j holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        int fixedPosition = getFixedPosition(position);
        onBind(holder, getItems().get(fixedPosition), fixedPosition);
    }

    public final void onBindViewHolder(@NotNull j holder, int position, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        int fixedPosition = getFixedPosition(position);
        onBindWithPayload(holder, getItems().get(fixedPosition), fixedPosition, payloads);
    }
}
