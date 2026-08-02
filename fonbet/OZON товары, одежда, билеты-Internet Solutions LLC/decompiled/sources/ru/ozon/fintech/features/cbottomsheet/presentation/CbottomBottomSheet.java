package ru.ozon.fintech.features.cbottomsheet.presentation;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Ae.x0;
import C.D;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import Sc.s;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.b0;
import androidx.fragment.app.r;
import androidx.lifecycle.A0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.B0;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.InterfaceC5431s;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.RecyclerView;
import com.detmir.recycli.adapters.RecyclerItem;
import f3.AbstractC6409a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import n50.C8445a;
import org.jetbrains.annotations.NotNull;
import q50.C8989a;
import r50.C9174a;
import ru.ozon.app.android.R;
import ru.ozon.fintech.base.NoScrollRecycler;
import ru.ozon.fintech.base.bottom.m;
import ru.ozon.fintech.ui.buttonatom.ButtonAtomWrapperState;
import ru.ozon.fintech.ui.buttonatom.ButtonAtomWrapperView;
import ru.ozon.fintech.ui.columnV20.ColumnV20State;
import ru.ozon.fintech.ui.columnV20.ColumnV20View;
import ru.ozon.fintech.ui.common.CenterLinearLayoutManager;
import w40.InterfaceC10428a;
import xe.C10727i;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/fintech/features/cbottomsheet/presentation/CbottomBottomSheet;", "Lru/ozon/fintech/base/bottom/m;", "Lw40/a;", "<init>", "()V", "cbottom-sheet_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public class CbottomBottomSheet extends m implements InterfaceC10428a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f95217a = "CbottomBottomSheet";

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final y0 f95218b;

    /* renamed from: c, reason: collision with root package name */
    private C8445a f95219c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f95220d;

    /* renamed from: e, reason: collision with root package name */
    private ColumnV20View f95221e;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomsheet.presentation.CbottomBottomSheet$onCreateView$$inlined$observe$1", f = "CbottomBottomSheet.kt", l = {33}, m = "invokeSuspend")
    public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95222d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95223e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f95225g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ CbottomBottomSheet f95226h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomsheet.presentation.CbottomBottomSheet$onCreateView$$inlined$observe$1$1", f = "CbottomBottomSheet.kt", l = {34}, m = "invokeSuspend")
        /* renamed from: ru.ozon.fintech.features.cbottomsheet.presentation.CbottomBottomSheet$a$a, reason: collision with other inner class name */
        public static final class C2011a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95227d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f95228e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ CbottomBottomSheet f95229f;

            /* renamed from: ru.ozon.fintech.features.cbottomsheet.presentation.CbottomBottomSheet$a$a$a, reason: collision with other inner class name */
            public static final class C2012a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ CbottomBottomSheet f95230a;

                public C2012a(CbottomBottomSheet cbottomBottomSheet) {
                    this.f95230a = cbottomBottomSheet;
                }

                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    List list = (List) t2;
                    C8445a c8445a = this.f95230a.f95219c;
                    if (c8445a != null) {
                        com.detmir.recycli.adapters.d.a(c8445a.f76551b, list);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2011a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, CbottomBottomSheet cbottomBottomSheet) {
                super(2, dVar);
                this.f95228e = interfaceC2395h;
                this.f95229f = cbottomBottomSheet;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C2011a(this.f95228e, dVar, this.f95229f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C2011a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95227d;
                if (i11 == 0) {
                    s.b(obj);
                    C2012a c2012a = new C2012a(this.f95229f);
                    this.f95227d = 1;
                    if (this.f95228e.collect(c2012a, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, CbottomBottomSheet cbottomBottomSheet) {
            super(2, dVar);
            this.f95225g = interfaceC2395h;
            this.f95226h = cbottomBottomSheet;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = CbottomBottomSheet.this.new a(this.f95225g, dVar, this.f95226h);
            aVar.f95223e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95222d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95223e)) {
                    J viewLifecycleOwner = CbottomBottomSheet.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    C2011a c2011a = new C2011a(this.f95225g, null, this.f95226h);
                    this.f95222d = 1;
                    if (C5412d0.b(viewLifecycleOwner, bVar, c2011a, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomsheet.presentation.CbottomBottomSheet$onCreateView$$inlined$observe$2", f = "CbottomBottomSheet.kt", l = {33}, m = "invokeSuspend")
    public static final class b extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95231d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95232e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f95234g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ CbottomBottomSheet f95235h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomsheet.presentation.CbottomBottomSheet$onCreateView$$inlined$observe$2$1", f = "CbottomBottomSheet.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95236d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f95237e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ CbottomBottomSheet f95238f;

            /* renamed from: ru.ozon.fintech.features.cbottomsheet.presentation.CbottomBottomSheet$b$a$a, reason: collision with other inner class name */
            public static final class C2013a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ CbottomBottomSheet f95239a;

                public C2013a(CbottomBottomSheet cbottomBottomSheet) {
                    this.f95239a = cbottomBottomSheet;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    ColumnV20View columnV20View;
                    ColumnV20State columnV20State = (ColumnV20State) t2;
                    if (columnV20State != null && (columnV20View = this.f95239a.f95221e) != null) {
                        columnV20View.bindState(columnV20State);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, CbottomBottomSheet cbottomBottomSheet) {
                super(2, dVar);
                this.f95237e = interfaceC2395h;
                this.f95238f = cbottomBottomSheet;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95237e, dVar, this.f95238f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95236d;
                if (i11 == 0) {
                    s.b(obj);
                    C2013a c2013a = new C2013a(this.f95238f);
                    this.f95236d = 1;
                    if (this.f95237e.collect(c2013a, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, CbottomBottomSheet cbottomBottomSheet) {
            super(2, dVar);
            this.f95234g = interfaceC2395h;
            this.f95235h = cbottomBottomSheet;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = CbottomBottomSheet.this.new b(this.f95234g, dVar, this.f95235h);
            bVar.f95232e = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95231d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95232e)) {
                    J viewLifecycleOwner = CbottomBottomSheet.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95234g, null, this.f95235h);
                    this.f95231d = 1;
                    if (C5412d0.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomsheet.presentation.CbottomBottomSheet$onCreateView$$inlined$observe$3", f = "CbottomBottomSheet.kt", l = {33}, m = "invokeSuspend")
    public static final class c extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95240d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95241e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f95243g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ CbottomBottomSheet f95244h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomsheet.presentation.CbottomBottomSheet$onCreateView$$inlined$observe$3$1", f = "CbottomBottomSheet.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95245d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f95246e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ CbottomBottomSheet f95247f;

            /* renamed from: ru.ozon.fintech.features.cbottomsheet.presentation.CbottomBottomSheet$c$a$a, reason: collision with other inner class name */
            public static final class C2014a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ CbottomBottomSheet f95248a;

                public C2014a(CbottomBottomSheet cbottomBottomSheet) {
                    this.f95248a = cbottomBottomSheet;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    boolean booleanValue = ((Boolean) t2).booleanValue();
                    View dragger = this.f95248a.getDragger();
                    if (dragger != null) {
                        dragger.setVisibility(booleanValue ? 0 : 8);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, CbottomBottomSheet cbottomBottomSheet) {
                super(2, dVar);
                this.f95246e = interfaceC2395h;
                this.f95247f = cbottomBottomSheet;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95246e, dVar, this.f95247f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95245d;
                if (i11 == 0) {
                    s.b(obj);
                    C2014a c2014a = new C2014a(this.f95247f);
                    this.f95245d = 1;
                    if (this.f95246e.collect(c2014a, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, CbottomBottomSheet cbottomBottomSheet) {
            super(2, dVar);
            this.f95243g = interfaceC2395h;
            this.f95244h = cbottomBottomSheet;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            c cVar = CbottomBottomSheet.this.new c(this.f95243g, dVar, this.f95244h);
            cVar.f95241e = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95240d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95241e)) {
                    J viewLifecycleOwner = CbottomBottomSheet.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95243g, null, this.f95244h);
                    this.f95240d = 1;
                    if (C5412d0.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomsheet.presentation.CbottomBottomSheet$onCreateView$$inlined$observe$4", f = "CbottomBottomSheet.kt", l = {33}, m = "invokeSuspend")
    public static final class d extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95249d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95250e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f95252g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ CbottomBottomSheet f95253h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomsheet.presentation.CbottomBottomSheet$onCreateView$$inlined$observe$4$1", f = "CbottomBottomSheet.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95254d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f95255e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ CbottomBottomSheet f95256f;

            /* renamed from: ru.ozon.fintech.features.cbottomsheet.presentation.CbottomBottomSheet$d$a$a, reason: collision with other inner class name */
            public static final class C2015a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ CbottomBottomSheet f95257a;

                public C2015a(CbottomBottomSheet cbottomBottomSheet) {
                    this.f95257a = cbottomBottomSheet;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    this.f95257a.D();
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, CbottomBottomSheet cbottomBottomSheet) {
                super(2, dVar);
                this.f95255e = interfaceC2395h;
                this.f95256f = cbottomBottomSheet;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95255e, dVar, this.f95256f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95254d;
                if (i11 == 0) {
                    s.b(obj);
                    C2015a c2015a = new C2015a(this.f95256f);
                    this.f95254d = 1;
                    if (this.f95255e.collect(c2015a, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, CbottomBottomSheet cbottomBottomSheet) {
            super(2, dVar);
            this.f95252g = interfaceC2395h;
            this.f95253h = cbottomBottomSheet;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = CbottomBottomSheet.this.new d(this.f95252g, dVar, this.f95253h);
            dVar2.f95250e = obj;
            return dVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95249d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95250e)) {
                    J viewLifecycleOwner = CbottomBottomSheet.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95252g, null, this.f95253h);
                    this.f95249d = 1;
                    if (C5412d0.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomsheet.presentation.CbottomBottomSheet$onCreateView$$inlined$observe$5", f = "CbottomBottomSheet.kt", l = {33}, m = "invokeSuspend")
    public static final class e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95258d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95259e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f95261g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ CbottomBottomSheet f95262h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomsheet.presentation.CbottomBottomSheet$onCreateView$$inlined$observe$5$1", f = "CbottomBottomSheet.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95263d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f95264e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ CbottomBottomSheet f95265f;

            /* renamed from: ru.ozon.fintech.features.cbottomsheet.presentation.CbottomBottomSheet$e$a$a, reason: collision with other inner class name */
            public static final class C2016a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ CbottomBottomSheet f95266a;

                public C2016a(CbottomBottomSheet cbottomBottomSheet) {
                    this.f95266a = cbottomBottomSheet;
                }

                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    CbottomBottomSheet cbottomBottomSheet = this.f95266a;
                    List<RecyclerItem> value = cbottomBottomSheet.C().l0().getValue();
                    NoScrollRecycler bottomFloatingRv = cbottomBottomSheet.getBottomFloatingRv();
                    if (bottomFloatingRv != null) {
                        com.detmir.recycli.adapters.d.a(bottomFloatingRv, value);
                    }
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, CbottomBottomSheet cbottomBottomSheet) {
                super(2, dVar);
                this.f95264e = interfaceC2395h;
                this.f95265f = cbottomBottomSheet;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95264e, dVar, this.f95265f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95263d;
                if (i11 == 0) {
                    s.b(obj);
                    C2016a c2016a = new C2016a(this.f95265f);
                    this.f95263d = 1;
                    if (this.f95264e.collect(c2016a, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, CbottomBottomSheet cbottomBottomSheet) {
            super(2, dVar);
            this.f95261g = interfaceC2395h;
            this.f95262h = cbottomBottomSheet;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            e eVar = CbottomBottomSheet.this.new e(this.f95261g, dVar, this.f95262h);
            eVar.f95259e = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95258d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95259e)) {
                    J viewLifecycleOwner = CbottomBottomSheet.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95261g, null, this.f95262h);
                    this.f95258d = 1;
                    if (C5412d0.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomsheet.presentation.CbottomBottomSheet$onCreateView$$inlined$observe$6", f = "CbottomBottomSheet.kt", l = {33}, m = "invokeSuspend")
    public static final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f95267d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f95268e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f95270g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ CbottomBottomSheet f95271h;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.cbottomsheet.presentation.CbottomBottomSheet$onCreateView$$inlined$observe$6$1", f = "CbottomBottomSheet.kt", l = {34}, m = "invokeSuspend")
        public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f95272d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC2395h f95273e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ CbottomBottomSheet f95274f;

            /* renamed from: ru.ozon.fintech.features.cbottomsheet.presentation.CbottomBottomSheet$f$a$a, reason: collision with other inner class name */
            public static final class C2017a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ CbottomBottomSheet f95275a;

                public C2017a(CbottomBottomSheet cbottomBottomSheet) {
                    this.f95275a = cbottomBottomSheet;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // Ae.InterfaceC2397i
                public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                    this.f95275a.E();
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, CbottomBottomSheet cbottomBottomSheet) {
                super(2, dVar);
                this.f95273e = interfaceC2395h;
                this.f95274f = cbottomBottomSheet;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f95273e, dVar, this.f95274f);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f95272d;
                if (i11 == 0) {
                    s.b(obj);
                    C2017a c2017a = new C2017a(this.f95274f);
                    this.f95272d = 1;
                    if (this.f95273e.collect(c2017a, this) == aVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, CbottomBottomSheet cbottomBottomSheet) {
            super(2, dVar);
            this.f95270g = interfaceC2395h;
            this.f95271h = cbottomBottomSheet;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            f fVar = CbottomBottomSheet.this.new f(this.f95270g, dVar, this.f95271h);
            fVar.f95268e = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f95267d;
            if (i11 == 0) {
                s.b(obj);
                if (N.f((M) this.f95268e)) {
                    J viewLifecycleOwner = CbottomBottomSheet.this.getViewLifecycleOwner();
                    Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                    a aVar2 = new a(this.f95270g, null, this.f95271h);
                    this.f95267d = 1;
                    if (C5412d0.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.f71690a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return Unit.f71690a;
        }
    }

    public static final class g extends AbstractC7737t implements Function0<ComponentCallbacksC5392m> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ComponentCallbacksC5392m invoke() {
            return CbottomBottomSheet.this;
        }
    }

    public static final class h extends AbstractC7737t implements Function0<B0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f95277b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f95277b = gVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B0 invoke() {
            return (B0) this.f95277b.invoke();
        }
    }

    public static final class i extends AbstractC7737t implements Function0<A0> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f95278b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f95278b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final A0 invoke() {
            return ((B0) this.f95278b.getValue()).getViewModelStore();
        }
    }

    public static final class j extends AbstractC7737t implements Function0<AbstractC6409a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f95279b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC4008j interfaceC4008j) {
            super(0);
            this.f95279b = interfaceC4008j;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final AbstractC6409a invoke() {
            B0 b02 = (B0) this.f95279b.getValue();
            InterfaceC5431s interfaceC5431s = b02 instanceof InterfaceC5431s ? (InterfaceC5431s) b02 : null;
            return interfaceC5431s != null ? interfaceC5431s.getDefaultViewModelCreationExtras() : AbstractC6409a.C0988a.f62496b;
        }
    }

    public CbottomBottomSheet() {
        F70.c cVar = new F70.c(this, 6);
        InterfaceC4008j a11 = k.a(n.NONE, new h(new g()));
        this.f95218b = b0.b(this, kotlin.jvm.internal.N.b(C8989a.class), new i(a11), new j(a11), cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, ru.ozon.fintech.ui.buttonatom.ButtonAtomWrapperView] */
    /* JADX WARN: Type inference failed for: r6v2, types: [T, ru.ozon.fintech.ui.buttonatom.ButtonAtomWrapperView] */
    public final void D() {
        ViewGroup bottomFloatingLL;
        ViewGroup bottomFloatingLL2;
        if (this.f95220d || getContext() == null) {
            return;
        }
        Pair<RecyclerItem, RecyclerItem> value = C().k0().getValue();
        RecyclerItem e11 = value != null ? value.e() : null;
        Pair<RecyclerItem, RecyclerItem> value2 = C().k0().getValue();
        Object obj = value2 != null ? (RecyclerItem) value2.f() : null;
        kotlin.jvm.internal.M m11 = new kotlin.jvm.internal.M();
        kotlin.jvm.internal.M m12 = new kotlin.jvm.internal.M();
        ButtonAtomWrapperState buttonAtomWrapperState = e11 instanceof ButtonAtomWrapperState ? (ButtonAtomWrapperState) e11 : null;
        if (buttonAtomWrapperState != null) {
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            ?? buttonAtomWrapperView = new ButtonAtomWrapperView(requireContext, null, 0, 6, null);
            buttonAtomWrapperView.bindState(buttonAtomWrapperState);
            m11.f71787a = buttonAtomWrapperView;
        }
        ButtonAtomWrapperState buttonAtomWrapperState2 = obj instanceof ButtonAtomWrapperState ? (ButtonAtomWrapperState) obj : null;
        if (buttonAtomWrapperState2 != null) {
            Context requireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
            ?? buttonAtomWrapperView2 = new ButtonAtomWrapperView(requireContext2, null, 0, 6, null);
            buttonAtomWrapperView2.bindState(buttonAtomWrapperState2);
            m12.f71787a = buttonAtomWrapperView2;
        }
        ButtonAtomWrapperView buttonAtomWrapperView3 = (ButtonAtomWrapperView) m11.f71787a;
        float f7 = 1.0f;
        if (buttonAtomWrapperView3 != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.weight = (m11.f71787a == 0 || m12.f71787a == 0) ? 1.0f : 0.5f;
            buttonAtomWrapperView3.setLayoutParams(layoutParams);
        }
        ButtonAtomWrapperView buttonAtomWrapperView4 = (ButtonAtomWrapperView) m12.f71787a;
        if (buttonAtomWrapperView4 != null) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            if (m11.f71787a != 0 && m12.f71787a != 0) {
                f7 = 0.5f;
            }
            layoutParams2.weight = f7;
            buttonAtomWrapperView4.setLayoutParams(layoutParams2);
        }
        if ((m11.f71787a == 0 && m12.f71787a == 0) || getBottomFloatingLL() == null) {
            return;
        }
        this.f95220d = true;
        ButtonAtomWrapperView buttonAtomWrapperView5 = (ButtonAtomWrapperView) m11.f71787a;
        if (buttonAtomWrapperView5 != null && (bottomFloatingLL2 = getBottomFloatingLL()) != null) {
            bottomFloatingLL2.addView(buttonAtomWrapperView5);
        }
        ButtonAtomWrapperView buttonAtomWrapperView6 = (ButtonAtomWrapperView) m12.f71787a;
        if (buttonAtomWrapperView6 != null && (bottomFloatingLL = getBottomFloatingLL()) != null) {
            bottomFloatingLL.addView(buttonAtomWrapperView6);
        }
        ViewGroup bottomFloatingLL3 = getBottomFloatingLL();
        if (bottomFloatingLL3 != null) {
            bottomFloatingLL3.setBackgroundColor(androidx.core.content.a.getColor(requireContext(), R.color.oz_semantic_bg_secondary));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E() {
        Rect c11;
        Rect c12;
        Rect c13;
        Rect c14;
        Rect d11;
        Rect d12;
        Rect d13;
        Rect d14;
        FrameLayout bottomSheet;
        C9174a value = C().p0().getValue();
        if (value != null && value.b() && (bottomSheet = getBottomSheet()) != null) {
            setupFullHeight(bottomSheet);
        }
        View dragger = getDragger();
        int i11 = 0;
        if (dragger != null) {
            dragger.setVisibility((value == null || !value.a()) ? 0 : 8);
        }
        C8445a c8445a = this.f95219c;
        if (c8445a != null) {
            c8445a.f76551b.setPadding((value == null || (d14 = value.d()) == null) ? 0 : D.d(d14.left), (value == null || (d13 = value.d()) == null) ? 0 : D.d(d13.top), (value == null || (d12 = value.d()) == null) ? 0 : D.d(d12.right), (value == null || (d11 = value.d()) == null) ? 0 : D.d(d11.bottom));
        }
        NoScrollRecycler bottomFloatingRv = getBottomFloatingRv();
        if (bottomFloatingRv != null) {
            int d15 = (value == null || (c14 = value.c()) == null) ? 0 : D.d(c14.left);
            int d16 = (value == null || (c13 = value.c()) == null) ? 0 : D.d(c13.top);
            int d17 = (value == null || (c12 = value.c()) == null) ? 0 : D.d(c12.right);
            if (value != null && (c11 = value.c()) != null) {
                i11 = D.d(c11.bottom);
            }
            bottomFloatingRv.setPadding(d15, d16, d17, i11);
        }
    }

    @NotNull
    public C8989a C() {
        return (C8989a) this.f95218b.getValue();
    }

    @Override // w40.InterfaceC10428a
    public final void action(String str) {
    }

    @Override // ru.ozon.fintech.base.bottom.m
    public final void bottomRvAvailable() {
        NoScrollRecycler bottomFloatingRv;
        Context context = getContext();
        if (context == null || (bottomFloatingRv = getBottomFloatingRv()) == null) {
            return;
        }
        bottomFloatingRv.setLayoutManager(new CenterLinearLayoutManager(context, 1, false));
    }

    @Override // ru.ozon.fintech.base.bottom.m
    public final void fillBottomView() {
        D();
        List<RecyclerItem> value = C().l0().getValue();
        NoScrollRecycler bottomFloatingRv = getBottomFloatingRv();
        if (bottomFloatingRv != null) {
            com.detmir.recycli.adapters.d.a(bottomFloatingRv, value);
        }
        E();
    }

    @Override // ru.ozon.fintech.base.bottom.m
    @NotNull
    /* renamed from: getFragmentName, reason: from getter */
    public final String getF95217a() {
        return this.f95217a;
    }

    @Override // ru.ozon.fintech.base.bottom.m
    public final boolean isExpanded() {
        return true;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onAttach(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        r requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        ((o50.a) O30.a.a(O30.c.a(requireActivity)).a(o50.a.class)).t0(this);
        super.onAttach(context);
    }

    @Override // ru.ozon.fintech.base.bottom.h, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        C8989a C11 = C();
        Bundle arguments = getArguments();
        String string2 = arguments != null ? arguments.getString("PARAMETER_JSON") : null;
        Bundle arguments2 = getArguments();
        Parcelable parcelable = arguments2 != null ? arguments2.getParcelable("PARAMETER_PARCELABLE") : null;
        Bundle arguments3 = getArguments();
        Integer valueOf = Integer.valueOf(arguments3 != null ? arguments3.getInt("PARAMETER_VERSION") : 2);
        Bundle arguments4 = getArguments();
        String str = "";
        if (arguments4 != null && (string = arguments4.getString("PARAMETER_UUID", "")) != null) {
            str = string;
        }
        C11.j0(string2, parcelable, valueOf, str, null);
        C().g0();
    }

    @Override // ru.ozon.fintech.base.bottom.m, ru.ozon.fintech.base.bottom.h, androidx.appcompat.app.x, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k
    @NotNull
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setDimAmount(0.4f);
        }
        return onCreateDialog;
    }

    @Override // ru.ozon.fintech.base.bottom.m, androidx.fragment.app.ComponentCallbacksC5392m
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f95220d = false;
        Bundle arguments = getArguments();
        Integer valueOf = arguments != null ? Integer.valueOf(arguments.getInt("PARAMETER_VERSION")) : null;
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        C8445a b11 = C8445a.b(LayoutInflater.from(requireContext()), viewGroup);
        this.f95219c = b11;
        RecyclerView a11 = b11.a();
        Intrinsics.checkNotNullExpressionValue(a11, "getRoot(...)");
        if (valueOf != null && valueOf.intValue() == 2) {
            FrameLayout topContainer = getTopContainer();
            if (topContainer != null) {
                topContainer.setVisibility(0);
            }
            FrameLayout topContainer2 = getTopContainer();
            if (topContainer2 != null) {
                topContainer2.setMinimumHeight(0);
            }
            FrameLayout topContainer3 = getTopContainer();
            if (topContainer3 != null) {
                topContainer3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            }
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            ColumnV20View columnV20View = new ColumnV20View(requireContext, null, 0, 6, null);
            this.f95221e = columnV20View;
            columnV20View.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
            FrameLayout topContainer4 = getTopContainer();
            if (topContainer4 != null) {
                topContainer4.addView(this.f95221e);
            }
        } else {
            FrameLayout topContainer5 = getTopContainer();
            if (topContainer5 != null) {
                topContainer5.setVisibility(8);
            }
        }
        FrameLayout bottomContainer = getBottomContainer();
        if (bottomContainer != null) {
            bottomContainer.setVisibility(0);
        }
        FrameLayout mainContainer = getMainContainer();
        if (mainContainer != null) {
            mainContainer.addView(a11);
        }
        FrameLayout mainContainer2 = getMainContainer();
        if (mainContainer2 != null) {
            mainContainer2.setPadding(0, 0, 0, 0);
        }
        C8445a c8445a = this.f95219c;
        if (c8445a != null) {
            RecyclerView recyclerView = c8445a.f76551b;
            Context requireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
            recyclerView.setLayoutManager(new CenterLinearLayoutManager(requireContext2, 1, false));
        }
        C8445a c8445a2 = this.f95219c;
        if (c8445a2 != null) {
            H30.r.a(c8445a2.f76551b);
        }
        x0<List<RecyclerItem>> n02 = C().n0();
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner), null, null, new a(n02, null, this), 3);
        x0<ColumnV20State> q02 = C().q0();
        J viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner2), null, null, new b(q02, null, this), 3);
        x0<Boolean> m02 = C().m0();
        J viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner3), null, null, new c(m02, null, this), 3);
        x0<Pair<RecyclerItem, RecyclerItem>> k02 = C().k0();
        J viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner4), null, null, new d(k02, null, this), 3);
        x0<List<RecyclerItem>> l02 = C().l0();
        J viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner5), null, null, new e(l02, null, this), 3);
        x0<C9174a> p02 = C().p0();
        J viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "getViewLifecycleOwner(...)");
        C10727i.c(K.a(viewLifecycleOwner6), null, null, new f(p02, null, this), 3);
        return onCreateView;
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroy() {
        super.onDestroy();
        C().onDestroy();
    }

    @Override // ru.ozon.fintech.base.bottom.m, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onDestroyView() {
        super.onDestroyView();
        this.f95219c = null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NotNull DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        C().r0();
    }

    @Override // ru.ozon.fintech.base.bottom.m, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStart() {
        super.onStart();
        C().onStart();
    }

    @Override // ru.ozon.fintech.base.bottom.m, androidx.fragment.app.DialogInterfaceOnCancelListenerC5390k, androidx.fragment.app.ComponentCallbacksC5392m
    public final void onStop() {
        super.onStop();
        C().onStop();
    }

    @Override // w40.InterfaceC10428a
    public final String provideId() {
        return C().i0();
    }

    @Override // w40.InterfaceC10428a
    public final void updateState(String str, Parcelable parcelable, int i11, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        C().j0(null, parcelable, 2, uuid, null);
    }
}
