package lc0;

import Pk0.h;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.core.view.C5316f0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.C7747g;
import kotlin.sequences.l;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

/* renamed from: lc0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7918a extends RecyclerView.n {

    /* renamed from: a, reason: collision with root package name */
    private final int f73168a;

    /* renamed from: b, reason: collision with root package name */
    private final int f73169b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Paint f73170c;

    /* renamed from: lc0.a$a, reason: collision with other inner class name */
    static final class C1231a extends AbstractC7737t implements Function1<View, Boolean> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ IntRange f73171b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ RecyclerView f73172c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1231a(IntRange intRange, RecyclerView recyclerView) {
            super(1);
            this.f73171b = intRange;
            this.f73172c = recyclerView;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            IntRange intRange = this.f73171b;
            int f71842a = intRange.getF71842a();
            int f71843b = intRange.getF71843b();
            int childAdapterPosition = this.f73172c.getChildAdapterPosition(it);
            boolean z11 = false;
            if (f71842a <= childAdapterPosition && childAdapterPosition <= f71843b) {
                z11 = true;
            }
            return Boolean.valueOf(z11);
        }
    }

    /* renamed from: lc0.a$b */
    static final class b extends AbstractC7737t implements Function1<View, RecyclerView.C> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ RecyclerView f73173b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(RecyclerView recyclerView) {
            super(1);
            this.f73173b = recyclerView;
        }

        @Override // kotlin.jvm.functions.Function1
        public final RecyclerView.C invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f73173b.getChildViewHolder(it);
        }
    }

    public C7918a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f73168a = UiExtKt.toPx(24);
        int px = UiExtKt.toPx(1);
        this.f73169b = px;
        Paint a11 = h.a(true);
        a11.setColor(androidx.core.content.a.getColor(context, R.color.graphic_neutral));
        a11.setStrokeWidth(px);
        this.f73170c = a11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDrawOver(@NotNull Canvas c11, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        Iterator it = l.w(l.h(C5316f0.b(parent), new C1231a(kotlin.ranges.h.o(1, state.b()), parent)), new b(parent)).iterator();
        while (true) {
            C7747g.a aVar = (C7747g.a) it;
            if (!aVar.hasNext()) {
                return;
            }
            View itemView = ((RecyclerView.C) aVar.next()).itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            int left = itemView.getLeft() + this.f73168a;
            int top = itemView.getTop();
            int right = itemView.getRight();
            int top2 = itemView.getTop() + this.f73169b;
            int save = c11.save();
            c11.clipRect(left, top, right, top2);
            try {
                c11.drawPaint(this.f73170c);
            } finally {
                c11.restoreToCount(save);
            }
        }
    }
}
