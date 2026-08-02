package ru.ozon.fintech.ui.misc;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016¨\u0006\u001a"}, d2 = {"Lru/ozon/fintech/ui/misc/ExtraSpaceLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroid/content/Context;", "context", "", "orientation", "", "reverseLayout", "<init>", "(Landroid/content/Context;IZ)V", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "", "extraLayoutSpace", "", "calculateExtraLayoutSpace", "(Landroidx/recyclerview/widget/RecyclerView$A;[I)V", "extraLayoutSpaceStart", "I", "getExtraLayoutSpaceStart", "()I", "setExtraLayoutSpaceStart", "(I)V", "extraLayoutSpaceEnd", "getExtraLayoutSpaceEnd", "setExtraLayoutSpaceEnd", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExtraSpaceLayoutManager extends LinearLayoutManager {
    private int extraLayoutSpaceEnd;
    private int extraLayoutSpaceStart;

    public ExtraSpaceLayoutManager(Context context, int i11, boolean z11) {
        super(context, i11, z11);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    protected void calculateExtraLayoutSpace(@NotNull RecyclerView.A state, @NotNull int[] extraLayoutSpace) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(extraLayoutSpace, "extraLayoutSpace");
        extraLayoutSpace[0] = this.extraLayoutSpaceStart;
        extraLayoutSpace[1] = this.extraLayoutSpaceEnd;
    }

    public final int getExtraLayoutSpaceEnd() {
        return this.extraLayoutSpaceEnd;
    }

    public final int getExtraLayoutSpaceStart() {
        return this.extraLayoutSpaceStart;
    }

    public final void setExtraLayoutSpaceEnd(int i11) {
        this.extraLayoutSpaceEnd = i11;
    }

    public final void setExtraLayoutSpaceStart(int i11) {
        this.extraLayoutSpaceStart = i11;
    }
}
