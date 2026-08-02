package kc0;

import android.content.Context;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import androidx.recyclerview.widget.RecyclerView;
import kc0.InterfaceC7643a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.uni.android.component.sheet.SheetView;
import xe.C10727i;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.credentials.EntryCredentialsFragment$onShowCountryCodeSelector$$inlined$repeatOnStarted$1", f = "EntryCredentialsFragment.kt", l = {69}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class r extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f71374d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ androidx.lifecycle.J f71375e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InterfaceC7643a.d f71376f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ SheetView f71377g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ RecyclerView f71378h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ ru.ozon.id.nativeauth.credentials.countryCode.a f71379i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ Context f71380j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ int f71381k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ int f71382l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ int f71383m;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.credentials.EntryCredentialsFragment$onShowCountryCodeSelector$$inlined$repeatOnStarted$1$1", f = "EntryCredentialsFragment.kt", l = {}, m = "invokeSuspend")
    public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f71384d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC7643a.d f71385e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ SheetView f71386f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ RecyclerView f71387g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ru.ozon.id.nativeauth.credentials.countryCode.a f71388h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Context f71389i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f71390j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f71391k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f71392l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlin.coroutines.d dVar, InterfaceC7643a.d dVar2, SheetView sheetView, RecyclerView recyclerView, ru.ozon.id.nativeauth.credentials.countryCode.a aVar, Context context, int i11, int i12, int i13) {
            super(2, dVar);
            this.f71385e = dVar2;
            this.f71386f = sheetView;
            this.f71387g = recyclerView;
            this.f71388h = aVar;
            this.f71389i = context;
            this.f71390j = i11;
            this.f71391k = i12;
            this.f71392l = i13;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(dVar, this.f71385e, this.f71386f, this.f71387g, this.f71388h, this.f71389i, this.f71390j, this.f71391k, this.f71392l);
            aVar.f71384d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            C10727i.c((xe.M) this.f71384d, null, null, new C7661t(this.f71385e.a(), null, this.f71386f, this.f71387g, this.f71388h, this.f71389i, this.f71390j, this.f71391k, this.f71392l), 3);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(androidx.lifecycle.J j11, kotlin.coroutines.d dVar, InterfaceC7643a.d dVar2, SheetView sheetView, RecyclerView recyclerView, ru.ozon.id.nativeauth.credentials.countryCode.a aVar, Context context, int i11, int i12, int i13) {
        super(2, dVar);
        this.f71375e = j11;
        this.f71376f = dVar2;
        this.f71377g = sheetView;
        this.f71378h = recyclerView;
        this.f71379i = aVar;
        this.f71380j = context;
        this.f71381k = i11;
        this.f71382l = i12;
        this.f71383m = i13;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new r(this.f71375e, dVar, this.f71376f, this.f71377g, this.f71378h, this.f71379i, this.f71380j, this.f71381k, this.f71382l, this.f71383m);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((r) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f71374d;
        if (i11 == 0) {
            Sc.s.b(obj);
            AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
            a aVar2 = new a(null, this.f71376f, this.f71377g, this.f71378h, this.f71379i, this.f71380j, this.f71381k, this.f71382l, this.f71383m);
            this.f71374d = 1;
            if (C5412d0.b(this.f71375e, bVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
