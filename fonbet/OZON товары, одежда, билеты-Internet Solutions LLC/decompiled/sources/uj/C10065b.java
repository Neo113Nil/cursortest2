package uj;

import Ae.InterfaceC2397i;
import Ae.M0;
import De.C2862e;
import Sc.C4005g;
import Sc.k;
import Sc.n;
import Sc.s;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luj/b;", "Landroidx/fragment/app/m;", "<init>", "()V", "ozon-logger-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: uj.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C10065b extends ComponentCallbacksC5392m {

    /* renamed from: a, reason: collision with root package name */
    private C2862e f100806a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f100807b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f100808c;

    /* renamed from: uj.b$a */
    /* synthetic */ class a extends C7735q implements Function0<C10064a> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f100809a = new a(0, C10064a.class, "<init>", "<init>()V", 0);

        @Override // kotlin.jvm.functions.Function0
        public final C10064a invoke() {
            return new C10064a();
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.ozonLogger.android.debug.history.HistoryLogsFragment$onViewCreated$2$1", f = "HistoryLogsFragment.kt", l = {DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend")
    /* renamed from: uj.b$b, reason: collision with other inner class name */
    static final class C2210b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f100810d;

        /* renamed from: uj.b$b$a */
        static final class a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C10065b f100812a;

            a(C10065b c10065b) {
                this.f100812a = c10065b;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                C10065b.t(this.f100812a).submitList((List) obj);
                return Unit.f71690a;
            }
        }

        C2210b(kotlin.coroutines.d<? super C2210b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C10065b.this.new C2210b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C2210b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f100810d;
            if (i11 == 0) {
                s.b(obj);
                C10065b c10065b = C10065b.this;
                M0<List<f>> h02 = C10065b.u(c10065b).h0();
                a aVar2 = new a(c10065b);
                this.f100810d = 1;
                if (h02.collect(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            throw new C4005g();
        }
    }

    /* renamed from: uj.b$c */
    static final class c extends AbstractC7737t implements Function0<e> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final e invoke() {
            return (e) new z0(C10065b.this).a(e.class);
        }
    }

    public C10065b() {
        n nVar = n.NONE;
        this.f100807b = k.a(nVar, new c());
        this.f100808c = k.a(nVar, a.f100809a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final C10064a t(C10065b c10065b) {
        return (C10064a) c10065b.f100808c.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final e u(C10065b c10065b) {
        return (e) c10065b.f100807b.getValue();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(R.layout.ozon_logger_android_debug_history_logs_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        super.onDestroyView();
        C2862e c2862e = this.f100806a;
        if (c2862e != null) {
            N.c(c2862e, null);
        }
        this.f100806a = null;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [Sc.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [Sc.j, java.lang.Object] */
    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        view.findViewById(R.id.backButton).setOnClickListener(new GW.a(this, 8));
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.historyRecyclerView);
        ?? r42 = this.f100808c;
        recyclerView.setAdapter((C10064a) r42.getValue());
        ((C10064a) r42.getValue()).submitList(((e) this.f100807b.getValue()).h0().getValue());
        C10720e0 c10720e0 = C10720e0.f105451a;
        C2862e a11 = N.a(De.s.f6650a.x());
        C10727i.c(a11, null, null, new C2210b(null), 3);
        this.f100806a = a11;
    }
}
