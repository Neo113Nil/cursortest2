package md0;

import Jb0.v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: md0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8135c extends t<f, b> {

    /* renamed from: md0.c$a */
    public static final class a extends i.d<f> {
        @Override // androidx.recyclerview.widget.i.d
        public final boolean areContentsTheSame(f fVar, f fVar2) {
            f oldItem = fVar;
            f newItem = fVar2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.i.d
        public final boolean areItemsTheSame(f fVar, f fVar2) {
            f oldItem = fVar;
            f newItem = fVar2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem.c(), newItem.c());
        }
    }

    /* renamed from: md0.c$b */
    public static final class b extends RecyclerView.C {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final v f74738a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull v binding) {
            super(binding.a());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f74738a = binding;
        }

        public final void e(@NotNull f item) {
            Intrinsics.checkNotNullParameter(item, "item");
            v vVar = this.f74738a;
            vVar.f14558b.setText(item.c());
            vVar.f14559c.setText(item.d());
        }
    }

    public C8135c() {
        super(new a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onBindViewHolder(RecyclerView.C c11, int i11) {
        b holder = (b) c11;
        Intrinsics.checkNotNullParameter(holder, "holder");
        f item = getItem(i11);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.e(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final RecyclerView.C onCreateViewHolder(ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        v b11 = v.b(LayoutInflater.from(parent.getContext()), parent);
        Intrinsics.checkNotNullExpressionValue(b11, "inflate(...)");
        return new b(b11);
    }
}
