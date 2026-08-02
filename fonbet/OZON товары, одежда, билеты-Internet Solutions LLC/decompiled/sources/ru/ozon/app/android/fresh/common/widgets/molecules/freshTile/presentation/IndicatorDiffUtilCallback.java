package ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation;

import androidx.recyclerview.widget.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/IndicatorDiffUtilCallback;", "Landroidx/recyclerview/widget/i$b;", "", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "new", "old", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "getOldListSize", "()I", "getNewListSize", "oldItemPosition", "newItemPosition", "", "areItemsTheSame", "(II)Z", "areContentsTheSame", "Ljava/util/List;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class IndicatorDiffUtilCallback extends i.b {

    @NotNull
    private final List<BadgeDTO> new;

    @NotNull
    private final List<BadgeDTO> old;

    public IndicatorDiffUtilCallback(@NotNull List<BadgeDTO> list, @NotNull List<BadgeDTO> old) {
        Intrinsics.checkNotNullParameter(list, "new");
        Intrinsics.checkNotNullParameter(old, "old");
        this.new = list;
        this.old = old;
    }

    @Override // androidx.recyclerview.widget.i.b
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        return Intrinsics.d(this.old.get(oldItemPosition), this.new.get(newItemPosition));
    }

    @Override // androidx.recyclerview.widget.i.b
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return this.old.get(oldItemPosition) == this.new.get(newItemPosition);
    }

    @Override // androidx.recyclerview.widget.i.b
    public int getNewListSize() {
        return this.new.size();
    }

    @Override // androidx.recyclerview.widget.i.b
    public int getOldListSize() {
        return this.old.size();
    }
}
