package T8;

import Ph.AbstractC1459k;
import Ph.C1452g0;
import Ph.C1483w0;
import Ph.P;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.giphy.sdk.core.models.Media;
import com.giphy.sdk.core.models.enums.MediaType;
import com.giphy.sdk.core.models.enums.RenditionType;
import com.giphy.sdk.ui.GPHContentType;
import com.giphy.sdk.ui.GPHSettings;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class g extends androidx.recyclerview.widget.p implements N8.b {

    /* renamed from: c, reason: collision with root package name */
    public final Context f11268c;

    /* renamed from: d, reason: collision with root package name */
    public final a f11269d;

    /* renamed from: e, reason: collision with root package name */
    public RecyclerView f11270e;

    /* renamed from: f, reason: collision with root package name */
    public Function1 f11271f;

    /* renamed from: g, reason: collision with root package name */
    public Function0 f11272g;

    /* renamed from: h, reason: collision with root package name */
    public MediaType f11273h;

    /* renamed from: i, reason: collision with root package name */
    public Function2 f11274i;

    /* renamed from: j, reason: collision with root package name */
    public Function2 f11275j;

    /* renamed from: k, reason: collision with root package name */
    public Function1 f11276k;

    @NotNull
    private final m[] typeValues;

    public static final class b extends Lambda implements Function2 {

        /* renamed from: d, reason: collision with root package name */
        public static final b f11286d = new b();

        public b() {
            super(2);
        }

        public final void a(l lVar, int i10) {
            Intrinsics.checkNotNullParameter(lVar, "<anonymous parameter 0>");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((l) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function2 {

        /* renamed from: d, reason: collision with root package name */
        public static final c f11287d = new c();

        public c() {
            super(2);
        }

        public final void a(l lVar, int i10) {
            Intrinsics.checkNotNullParameter(lVar, "<anonymous parameter 0>");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((l) obj, ((Number) obj2).intValue());
            return Unit.INSTANCE;
        }
    }

    public static final class e extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f11289n;

        public e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return g.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((e) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f11289n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            g.this.o().invoke();
            return Unit.INSTANCE;
        }
    }

    public static final class f extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final f f11291d = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m15invoke();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m15invoke() {
        }
    }

    /* renamed from: T8.g$g, reason: collision with other inner class name */
    public static final class C0218g extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final C0218g f11292d = new C0218g();

        public C0218g() {
            super(1);
        }

        public final void a(l lVar) {
            Intrinsics.checkNotNullParameter(lVar, "<anonymous parameter 0>");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((l) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, h.f diff) {
        super(diff);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(diff, "diff");
        this.f11268c = context;
        this.f11269d = new a();
        this.typeValues = m.values();
        this.f11271f = d.f11288d;
        this.f11272g = f.f11291d;
        this.f11273h = MediaType.gif;
        this.f11274i = c.f11287d;
        this.f11275j = b.f11286d;
        this.f11276k = C0218g.f11292d;
    }

    public static final void s(o viewHolder, g this$0, View view) {
        Intrinsics.checkNotNullParameter(viewHolder, "$viewHolder");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition > -1) {
            Function2 function2 = this$0.f11274i;
            Object c10 = this$0.c(bindingAdapterPosition);
            Intrinsics.checkNotNullExpressionValue(c10, "getItem(position)");
            function2.invoke(c10, Integer.valueOf(bindingAdapterPosition));
        }
    }

    public static final boolean t(o viewHolder, g this$0, View view) {
        Intrinsics.checkNotNullParameter(viewHolder, "$viewHolder");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition <= -1) {
            return true;
        }
        Function2 function2 = this$0.f11275j;
        Object c10 = this$0.c(bindingAdapterPosition);
        Intrinsics.checkNotNullExpressionValue(c10, "getItem(position)");
        function2.invoke(c10, Integer.valueOf(bindingAdapterPosition));
        return true;
    }

    public static final void u(o viewHolder, g this$0, View view) {
        Intrinsics.checkNotNullParameter(viewHolder, "$viewHolder");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition > -1) {
            Function1 function1 = this$0.f11276k;
            Object c10 = this$0.c(bindingAdapterPosition);
            Intrinsics.checkNotNullExpressionValue(c10, "getItem(position)");
            function1.invoke(c10);
        }
    }

    public final void A(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.f11272g = function0;
    }

    public final void B(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f11276k = function1;
    }

    @Override // N8.b
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public Media a(int i10) {
        return ((l) c(i10)).b();
    }

    @Override // N8.b
    public boolean b(int i10, Function0 onLoad) {
        Intrinsics.checkNotNullParameter(onLoad, "onLoad");
        RecyclerView recyclerView = this.f11270e;
        RecyclerView.F e02 = recyclerView != null ? recyclerView.e0(i10) : null;
        o oVar = e02 instanceof o ? (o) e02 : null;
        if (oVar != null) {
            return oVar.c(onLoad);
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        return ((l) c(i10)).d().ordinal();
    }

    public final a k() {
        return this.f11269d;
    }

    public final Function2 l() {
        return this.f11275j;
    }

    public final Function2 m() {
        return this.f11274i;
    }

    public final int n(int i10) {
        return ((l) c(i10)).c();
    }

    public final Function0 o() {
        return this.f11272g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f11270e = recyclerView;
    }

    public final Function1 p() {
        return this.f11276k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(o holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (i10 > getItemCount() - 12) {
            this.f11271f.invoke(Integer.valueOf(i10));
        }
        this.f11269d.p(getItemCount());
        holder.b(((l) c(i10)).a());
        AbstractC1459k.d(C1483w0.f9135a, C1452g0.c(), null, new e(null), 2, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public o onCreateViewHolder(ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        for (m mVar : this.typeValues) {
            if (mVar.ordinal() == i10) {
                final o oVar = (o) mVar.b().invoke(parent, this.f11269d);
                if (i10 == m.f11334f.ordinal()) {
                    P8.h.a(oVar.itemView).f8892i.setOnClickListener(new View.OnClickListener() { // from class: T8.f
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            g.u(o.this, this, view);
                        }
                    });
                    return oVar;
                }
                oVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: T8.d
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        g.s(o.this, this, view);
                    }
                });
                oVar.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: T8.e
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        boolean t10;
                        t10 = g.t(o.this, this, view);
                        return t10;
                    }
                });
                return oVar;
            }
        }
        throw new IllegalArgumentException("onCreateViewHolder: Invalid item type");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void onViewRecycled(o holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.d();
        super.onViewRecycled(holder);
    }

    public final void w(Function2 function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.f11275j = function2;
    }

    public final void x(Function2 function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.f11274i = function2;
    }

    public final void y(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f11271f = function1;
    }

    public final void z(MediaType mediaType) {
        Intrinsics.checkNotNullParameter(mediaType, "<set-?>");
        this.f11273h = mediaType;
    }

    public final class a {

        /* renamed from: a, reason: collision with root package name */
        public RenditionType f11277a;

        /* renamed from: b, reason: collision with root package name */
        public RenditionType f11278b;

        /* renamed from: c, reason: collision with root package name */
        public GPHSettings f11279c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f11280d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f11281e = true;

        /* renamed from: f, reason: collision with root package name */
        public Q8.e f11282f = Q8.e.WEBP;

        /* renamed from: g, reason: collision with root package name */
        public GPHContentType f11283g;

        /* renamed from: h, reason: collision with root package name */
        public int f11284h;

        public a() {
        }

        public final Float a() {
            RecyclerView.q layoutManager;
            if (!this.f11280d) {
                return null;
            }
            RecyclerView recyclerView = g.this.f11270e;
            return (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || !layoutManager.A()) ? Float.valueOf(1.0f) : Float.valueOf(1.3f);
        }

        public final RenditionType b() {
            return this.f11278b;
        }

        public final GPHContentType c() {
            return this.f11283g;
        }

        public final O8.n d() {
            return null;
        }

        public final GPHSettings e() {
            return this.f11279c;
        }

        public final Q8.e f() {
            return this.f11282f;
        }

        public final int g() {
            return this.f11284h;
        }

        public final RenditionType h() {
            return this.f11277a;
        }

        public final boolean i() {
            return this.f11281e;
        }

        public final boolean j() {
            return this.f11280d;
        }

        public final void k(RenditionType renditionType) {
            this.f11278b = renditionType;
        }

        public final void l(GPHContentType gPHContentType) {
            this.f11283g = gPHContentType;
        }

        public final void n(GPHSettings gPHSettings) {
            this.f11279c = gPHSettings;
        }

        public final void o(Q8.e eVar) {
            Intrinsics.checkNotNullParameter(eVar, "<set-?>");
            this.f11282f = eVar;
        }

        public final void p(int i10) {
            this.f11284h = i10;
        }

        public final void q(RenditionType renditionType) {
            this.f11277a = renditionType;
        }

        public final void r(boolean z10) {
            this.f11281e = z10;
        }

        public final void s(boolean z10) {
            this.f11280d = z10;
        }

        public final void m(O8.n nVar) {
        }
    }

    public static final class d extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final d f11288d = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void a(int i10) {
        }
    }
}
