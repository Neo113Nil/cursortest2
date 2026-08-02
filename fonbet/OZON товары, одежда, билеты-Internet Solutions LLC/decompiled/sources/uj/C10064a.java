package uj;

import Ve.C4636t5;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* renamed from: uj.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C10064a extends t<f, b> {

    /* renamed from: uj.a$a, reason: collision with other inner class name */
    public static final class C2209a extends i.d<f> {
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

    /* renamed from: uj.a$b */
    public static final class b extends RecyclerView.C {

        /* renamed from: a, reason: collision with root package name */
        private final TextView f100801a;

        /* renamed from: b, reason: collision with root package name */
        private final TextView f100802b;

        /* renamed from: c, reason: collision with root package name */
        private final TextView f100803c;

        /* renamed from: d, reason: collision with root package name */
        private final TextView f100804d;

        /* renamed from: e, reason: collision with root package name */
        private final TextView f100805e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.f100801a = (TextView) itemView.findViewById(R.id.dateText);
            this.f100802b = (TextView) itemView.findViewById(R.id.titleText);
            this.f100803c = (TextView) itemView.findViewById(R.id.fieldsText);
            this.f100804d = (TextView) itemView.findViewById(R.id.localBadge);
            this.f100805e = (TextView) itemView.findViewById(R.id.levelBadge);
        }

        public final void e(@NotNull f item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.f100802b.setText(item.e());
            this.f100803c.setText(item.b());
            this.f100801a.setText(item.a());
            String name = item.d().getName();
            TextView textView = this.f100805e;
            textView.setText(name);
            textView.setTextColor(androidx.core.content.a.getColorStateList(this.itemView.getContext(), item.d().getTextColor()));
            textView.setBackgroundTintList(androidx.core.content.a.getColorStateList(this.itemView.getContext(), item.d().getBackgroundColor()));
            TextView localBadge = this.f100804d;
            Intrinsics.checkNotNullExpressionValue(localBadge, "localBadge");
            localBadge.setVisibility(item.f() ? 0 : 8);
        }
    }

    public C10064a() {
        super(new C2209a());
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
    public final RecyclerView.C onCreateViewHolder(ViewGroup viewGroup, int i11) {
        View inflate = C4636t5.a(viewGroup, "parent").inflate(R.layout.ozon_logger_android_history_viewholder, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new b(inflate);
    }
}
