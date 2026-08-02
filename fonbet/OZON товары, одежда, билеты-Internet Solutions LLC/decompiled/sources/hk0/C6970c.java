package hk0;

import androidx.recyclerview.widget.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lk0.InterfaceC7968a;
import org.jetbrains.annotations.NotNull;

/* renamed from: hk0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6970c extends i.b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList f65630a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<InterfaceC7968a> f65631b;

    public C6970c(@NotNull ArrayList oldItems, @NotNull List newItems) {
        Intrinsics.checkNotNullParameter(oldItems, "oldItems");
        Intrinsics.checkNotNullParameter(newItems, "newItems");
        this.f65630a = oldItems;
        this.f65631b = newItems;
    }

    @Override // androidx.recyclerview.widget.i.b
    public final boolean areContentsTheSame(int i11, int i12) {
        return Intrinsics.d(this.f65630a.get(i11), this.f65631b.get(i12));
    }

    @Override // androidx.recyclerview.widget.i.b
    public final boolean areItemsTheSame(int i11, int i12) {
        return ((InterfaceC7968a) this.f65630a.get(i11)).getItemType() == this.f65631b.get(i12).getItemType();
    }

    @Override // androidx.recyclerview.widget.i.b
    public final int getNewListSize() {
        return this.f65631b.size();
    }

    @Override // androidx.recyclerview.widget.i.b
    public final int getOldListSize() {
        return this.f65630a.size();
    }
}
