package ik0;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.content.res.g;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: ik0.a$a, reason: collision with other inner class name */
    public static final class C1101a extends j {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f66505e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1101a(Context context, int i11, boolean z11) {
            super(context, i11);
            this.f66505e = z11;
        }

        @Override // androidx.recyclerview.widget.j, androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect outRect, View view, RecyclerView recyclerView, RecyclerView.A a11) {
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            int a12 = Nh.a.a(recyclerView, "parent", a11, "state", view);
            if (this.f66505e || a12 != a11.b() - 1) {
                super.getItemOffsets(outRect, view, recyclerView, a11);
            } else {
                outRect.setEmpty();
            }
        }
    }

    public static final void a(@NotNull RecyclerView recyclerView, @NotNull Context context, int i11, int i12, boolean z11) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        C1101a c1101a = new C1101a(context, i12, z11);
        Drawable d11 = g.d(context.getResources(), i11, context.getTheme());
        if (d11 != null) {
            c1101a.setDrawable(d11);
        }
        recyclerView.addItemDecoration(c1101a);
    }
}
