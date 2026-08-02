package md0;

import G.g;
import Kb0.K;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.s;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.J;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import md0.e.a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import td0.C9864d;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmd0/e;", "Landroidx/fragment/app/m;", "<init>", "()V", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e extends ComponentCallbacksC5392m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C8135c f74740a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f74741b;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.ozonLimb.debug.preferences.OzonIdDebugSPFragment$onViewCreated$1$1$1", f = "OzonIdDebugSPFragment.kt", l = {}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: md0.e$a$a, reason: collision with other inner class name */
        static final class C1271a extends AbstractC7737t implements Function1<f, CharSequence> {

            /* renamed from: b, reason: collision with root package name */
            public static final C1271a f74743b = new C1271a(1);

            @Override // kotlin.jvm.functions.Function1
            public final CharSequence invoke(f fVar) {
                f fVar2 = fVar;
                Intrinsics.checkNotNullParameter(fVar2, "<destruct>");
                return g.c(fVar2.a(), "=", fVar2.b());
            }
        }

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            e eVar = e.this;
            C9864d.a(eVar, C7714v.V(e.u(eVar), null, null, null, C1271a.f74743b, 31));
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.ozonLimb.debug.preferences.OzonIdDebugSPFragment$onViewCreated$2", f = "OzonIdDebugSPFragment.kt", l = {56}, m = "invokeSuspend")
    static final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f74744d;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.ozonLimb.debug.preferences.OzonIdDebugSPFragment$onViewCreated$2$1", f = "OzonIdDebugSPFragment.kt", l = {}, m = "invokeSuspend")
        static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ e f74746d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f74746d = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f74746d, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                s.b(obj);
                e eVar = this.f74746d;
                eVar.f74740a.submitList(e.u(eVar));
                return Unit.f71690a;
            }
        }

        b(kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return e.this.new b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f74744d;
            if (i11 == 0) {
                s.b(obj);
                AbstractC5434v.b bVar = AbstractC5434v.b.RESUMED;
                e eVar = e.this;
                a aVar2 = new a(eVar, null);
                this.f74744d = 1;
                if (C5412d0.b(eVar, bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function0<List<? extends SharedPreferences>> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends SharedPreferences> invoke() {
            K k11 = Tb0.a.f26975d;
            if (k11 == null) {
                throw new Lb0.a();
            }
            e eVar = e.this;
            return C7714v.b0(k11.x().d().getValue(), eVar.requireContext().getSharedPreferences("instant_login_prefs", 0), eVar.requireContext().getSharedPreferences("ozon_id_prefs_name", 0));
        }
    }

    public e() {
        super(R.layout.fragment_ozon_id_debug_preferences);
        this.f74740a = new C8135c();
        this.f74741b = k.b(new c());
    }

    public static final ArrayList u(e eVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) eVar.f74741b.getValue()).iterator();
        while (it.hasNext()) {
            Map<String, ?> all = ((SharedPreferences) it.next()).getAll();
            Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
            ArrayList arrayList2 = new ArrayList(all.size());
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
                arrayList2.add(new f(key, String.valueOf(entry.getValue())));
            }
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Jb0.k a11 = Jb0.k.a(view);
        a11.f14490b.setOnClickListener(new View.OnClickListener() { // from class: md0.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                e eVar = e.this;
                C10727i.c(androidx.lifecycle.K.a(eVar), null, null, eVar.new a(null), 3);
            }
        });
        a11.f14492d.setAdapter(this.f74740a);
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C10727i.c(androidx.lifecycle.K.a(viewLifecycleOwner), null, null, new b(null), 3);
    }
}
