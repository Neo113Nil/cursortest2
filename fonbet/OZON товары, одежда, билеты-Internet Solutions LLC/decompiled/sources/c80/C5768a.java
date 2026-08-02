package c80;

import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.lifecycle.AbstractC5434v;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: c80.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5768a extends Z4.a {

    /* renamed from: a, reason: collision with root package name */
    private final int f56702a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5768a(int i11, @NotNull AbstractC5434v lifecycle, @NotNull G fragmentManager) {
        super(fragmentManager, lifecycle);
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        this.f56702a = i11;
    }

    @Override // Z4.a
    @NotNull
    public final ComponentCallbacksC5392m createFragment(int i11) {
        b bVar = new b();
        bVar.setArguments(androidx.core.os.d.b(new Pair("PAGE_ID", Integer.valueOf(i11))));
        return bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public final int getShimmersCount() {
        return this.f56702a;
    }
}
