package ru.ozon.android.messenger.blocks.chat;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kd.C7665d;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.chat.common.b;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.C9513d;
import ru.ozon.android.messenger.utils.e;
import ru.ozon.android.messenger.utils.f;
import ru.ozon.app.android.messenger.R$attr;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

/* loaded from: classes10.dex */
public final class a extends RecyclerView.n {

    /* renamed from: b, reason: collision with root package name */
    private static final int f84477b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f84478c = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f84479a;

    /* renamed from: ru.ozon.android.messenger.blocks.chat.a$a, reason: collision with other inner class name */
    static final class C1476a extends AbstractC7737t implements Function0<Paint> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f84480b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1476a(Context context) {
            super(0);
            this.f84480b = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Paint invoke() {
            Paint paint = new Paint();
            paint.setColor(ThemeExtKt.themeColor(this.f84480b, R$attr.graphicNeutral));
            paint.setStyle(Paint.Style.FILL);
            return paint;
        }
    }

    static {
        int i11;
        i11 = e.f91904a;
        f84477b = i11;
    }

    public a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f84479a = f.b(new C1476a(context));
    }

    private static boolean a(View view, RecyclerView recyclerView) {
        int childAdapterPosition;
        RecyclerView.g adapter = recyclerView.getAdapter();
        C9513d c9513d = adapter instanceof C9513d ? (C9513d) adapter : null;
        if (c9513d == null || (childAdapterPosition = recyclerView.getChildAdapterPosition(view)) < 0 || childAdapterPosition > c9513d.getShimmersCount()) {
            return false;
        }
        List<ru.ozon.android.messenger.framework.presentation.models.e> currentList = c9513d.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        ru.ozon.android.messenger.framework.presentation.models.e eVar = (ru.ozon.android.messenger.framework.presentation.models.e) C7714v.Q(childAdapterPosition - 1, currentList);
        if (c9513d.getCurrentList().get(childAdapterPosition).b() instanceof b) {
            return (eVar != null ? eVar.b() : null) instanceof b;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void getItemOffsets(@NotNull Rect outRect, @NotNull View view, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.getItemOffsets(outRect, view, parent, state);
        if (a(view, parent)) {
            outRect.top = f84477b;
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [Sc.j, java.lang.Object] */
    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void onDraw(@NotNull Canvas c11, @NotNull RecyclerView parent, @NotNull RecyclerView.A state) {
        Canvas canvas;
        View findViewById;
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        super.onDraw(c11, parent, state);
        IntRange o11 = h.o(0, parent.getChildCount());
        ArrayList arrayList = new ArrayList(C7714v.z(o11, 10));
        C7665d it = o11.iterator();
        while (it.hasNext()) {
            arrayList.add(parent.getChildAt(it.b()));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            View view = (View) it2.next();
            Intrinsics.f(view);
            if (!a(view, parent) || (findViewById = view.findViewById(R$id.chatTitleTv)) == null) {
                canvas = c11;
            } else {
                canvas = c11;
                canvas.drawRect(view.getLeft() + findViewById.getLeft(), view.getTop() - f84477b, view.getRight(), view.getTop(), (Paint) this.f84479a.getValue());
            }
            c11 = canvas;
        }
    }
}
