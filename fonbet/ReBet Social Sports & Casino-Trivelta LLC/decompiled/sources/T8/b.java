package T8;

import O8.s;
import O8.t;
import T8.g;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class b extends o {

    /* renamed from: a, reason: collision with root package name */
    public static final C0216b f11253a = new C0216b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final Function2 f11254b = a.f11255d;

    public static final class a extends Lambda implements Function2 {

        /* renamed from: d, reason: collision with root package name */
        public static final a f11255d = new a();

        public a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b invoke(ViewGroup parent, g.a aVar) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(aVar, "<anonymous parameter 1>");
            View itemView = LayoutInflater.from(parent.getContext()).inflate(t.f8537h, parent, false);
            ((TextView) itemView.findViewById(s.f8510q)).setTextColor(O8.k.f8390a.h().f());
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            return new b(itemView);
        }
    }

    /* renamed from: T8.b$b, reason: collision with other inner class name */
    public static final class C0216b {
        public /* synthetic */ C0216b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Function2 a() {
            return b.f11254b;
        }

        public C0216b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // T8.o
    public void b(Object obj) {
        String str = obj instanceof String ? (String) obj : null;
        if (str != null) {
            ((TextView) this.itemView.findViewById(s.f8510q)).setText(str);
        }
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        StaggeredGridLayoutManager.c cVar = layoutParams instanceof StaggeredGridLayoutManager.c ? (StaggeredGridLayoutManager.c) layoutParams : null;
        if (cVar != null) {
            cVar.g(true);
        }
        ViewGroup.LayoutParams layoutParams2 = this.itemView.getLayoutParams();
        RecyclerView.r rVar = layoutParams2 instanceof RecyclerView.r ? (RecyclerView.r) layoutParams2 : null;
        if (rVar == null) {
            return;
        }
        ((ViewGroup.MarginLayoutParams) rVar).width = Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    @Override // T8.o
    public void d() {
    }
}
