package R8;

import O8.k;
import O8.u;
import P8.e;
import T8.g;
import T8.o;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class c extends o {

    /* renamed from: b, reason: collision with root package name */
    public static final b f10098b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    public static final Function2 f10099c = a.f10101d;

    /* renamed from: a, reason: collision with root package name */
    public Function0 f10100a;

    public static final class a extends Lambda implements Function2 {

        /* renamed from: d, reason: collision with root package name */
        public static final a f10101d = new a();

        /* renamed from: R8.c$a$a, reason: collision with other inner class name */
        public static final class C0194a extends Lambda implements Function0 {

            /* renamed from: d, reason: collision with root package name */
            public static final C0194a f10102d = new C0194a();

            public C0194a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m12invoke();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m12invoke() {
            }
        }

        public a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke(ViewGroup parent, g.a aVar) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(aVar, "<anonymous parameter 1>");
            e c10 = e.c(LayoutInflater.from(parent.getContext()), parent, false);
            TextView textView = c10.f8866b;
            k kVar = k.f8390a;
            textView.setTextColor(kVar.h().f());
            Integer l10 = kVar.h().l();
            if (l10 != null) {
                c10.f8868d.setBackgroundColor(l10.intValue());
            }
            Integer m10 = kVar.h().m();
            if (m10 != null) {
                c10.f8868d.setTextColor(m10.intValue());
            }
            Intrinsics.checkNotNullExpressionValue(c10, "inflate(\n               …      }\n                }");
            ConstraintLayout b10 = c10.b();
            Intrinsics.checkNotNullExpressionValue(b10, "binding.root");
            return new c(b10, C0194a.f10102d);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Function2 a() {
            return c.f10099c;
        }

        public final int b(boolean z10) {
            return z10 ? 0 : 8;
        }

        public b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(View view, Function0 retryCallback) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(retryCallback, "retryCallback");
        this.f10100a = retryCallback;
    }

    public static final void j(c this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f10100a.invoke();
    }

    @Override // T8.o
    public void b(Object obj) {
        if (obj instanceof R8.a) {
            R8.a aVar = (R8.a) obj;
            Function0 e10 = aVar.e();
            if (e10 != null) {
                this.f10100a = e10;
            }
            i(aVar);
        }
    }

    public final void h(R8.a aVar) {
        boolean z10;
        LottieAnimationView lottieAnimationView = e.a(this.itemView).f8867c;
        b bVar = f10098b;
        if ((aVar != null ? aVar.g() : null) != d.RUNNING) {
            if ((aVar != null ? aVar.g() : null) != d.RUNNING_INITIAL) {
                z10 = false;
                lottieAnimationView.setVisibility(bVar.b(z10));
            }
        }
        z10 = true;
        lottieAnimationView.setVisibility(bVar.b(z10));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(R8.a aVar) {
        boolean z10;
        timber.log.a.a("networkState=" + aVar, new Object[0]);
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        StaggeredGridLayoutManager.c cVar = layoutParams instanceof StaggeredGridLayoutManager.c ? (StaggeredGridLayoutManager.c) layoutParams : null;
        if (cVar != null) {
            cVar.g(true);
        }
        ViewGroup.LayoutParams layoutParams2 = this.itemView.getLayoutParams();
        RecyclerView.r rVar = layoutParams2 instanceof RecyclerView.r ? (RecyclerView.r) layoutParams2 : null;
        if (rVar != null) {
            ((ViewGroup.MarginLayoutParams) rVar).width = Resources.getSystem().getDisplayMetrics().widthPixels;
        }
        h(aVar);
        e a10 = e.a(this.itemView);
        Button button = a10.f8868d;
        b bVar = f10098b;
        if ((aVar != null ? aVar.g() : null) != d.FAILED) {
            if ((aVar != null ? aVar.g() : null) != d.FAILED_INITIAL) {
                z10 = false;
                button.setVisibility(bVar.b(z10));
                a10.f8866b.setVisibility(bVar.b((aVar != null ? aVar.f() : null) != null));
                a10.f8866b.setText(this.itemView.getResources().getText(u.f8555i));
                a10.f8868d.setOnClickListener(new View.OnClickListener() { // from class: R8.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        c.j(c.this, view);
                    }
                });
            }
        }
        z10 = true;
        button.setVisibility(bVar.b(z10));
        a10.f8866b.setVisibility(bVar.b((aVar != null ? aVar.f() : null) != null));
        a10.f8866b.setText(this.itemView.getResources().getText(u.f8555i));
        a10.f8868d.setOnClickListener(new View.OnClickListener() { // from class: R8.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.j(c.this, view);
            }
        });
    }

    @Override // T8.o
    public void d() {
    }
}
