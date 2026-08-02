package md0;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Jb0.k;
import Kb0.K;
import R2.InterfaceC3917k;
import Sc.InterfaceC4008j;
import Sc.s;
import W2.f;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.J;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import md0.C8134b.a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import td0.C9864d;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmd0/b;", "Landroidx/fragment/app/m;", "<init>", "()V", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: md0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8134b extends ComponentCallbacksC5392m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C8135c f74729a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f74730b;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.ozonLimb.debug.preferences.OzonIdDebugDataStoreFragment$onViewCreated$1$1$1", f = "OzonIdDebugDataStoreFragment.kt", l = {AppUpdateInfo.Factory.DAYS_BETWEEN_30}, m = "invokeSuspend")
    /* renamed from: md0.b$a */
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f74731d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C8134b.this.new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f74731d;
            C8134b c8134b = C8134b.this;
            if (i11 == 0) {
                s.b(obj);
                InterfaceC2395h data = C8134b.u(c8134b).getData();
                this.f74731d = 1;
                obj = C2399j.u(data, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            Map<f.a<?>, Object> a11 = ((W2.f) obj).a();
            ArrayList arrayList = new ArrayList(a11.size());
            for (Map.Entry<f.a<?>, Object> entry : a11.entrySet()) {
                f.a<?> key = entry.getKey();
                Object value = entry.getValue();
                arrayList.add(key.a() + "=" + value);
            }
            C9864d.a(c8134b, C7714v.V(arrayList, null, null, null, null, 63));
            return Unit.f71690a;
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.ozonLimb.debug.preferences.OzonIdDebugDataStoreFragment$onViewCreated$2", f = "OzonIdDebugDataStoreFragment.kt", l = {43}, m = "invokeSuspend")
    /* renamed from: md0.b$b, reason: collision with other inner class name */
    static final class C1269b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f74733d;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.ozonLimb.debug.preferences.OzonIdDebugDataStoreFragment$onViewCreated$2$1", f = "OzonIdDebugDataStoreFragment.kt", l = {DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend")
        /* renamed from: md0.b$b$a */
        static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

            /* renamed from: d, reason: collision with root package name */
            int f74735d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C8134b f74736e;

            /* renamed from: md0.b$b$a$a, reason: collision with other inner class name */
            static final class C1270a<T> implements InterfaceC2397i {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ C8134b f74737a;

                C1270a(C8134b c8134b) {
                    this.f74737a = c8134b;
                }

                @Override // Ae.InterfaceC2397i
                public final Object emit(Object obj, kotlin.coroutines.d dVar) {
                    Map<f.a<?>, Object> a11 = ((W2.f) obj).a();
                    ArrayList arrayList = new ArrayList(a11.size());
                    for (Map.Entry<f.a<?>, Object> entry : a11.entrySet()) {
                        arrayList.add(new f(entry.getKey().a(), entry.getValue().toString()));
                    }
                    this.f74737a.f74729a.submitList(arrayList);
                    return Unit.f71690a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C8134b c8134b, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f74736e = c8134b;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f74736e, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f74735d;
                if (i11 == 0) {
                    s.b(obj);
                    C8134b c8134b = this.f74736e;
                    InterfaceC2395h data = C8134b.u(c8134b).getData();
                    C1270a c1270a = new C1270a(c8134b);
                    this.f74735d = 1;
                    if (data.collect(c1270a, this) == aVar) {
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

        C1269b(kotlin.coroutines.d<? super C1269b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C8134b.this.new C1269b(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C1269b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f74733d;
            if (i11 == 0) {
                s.b(obj);
                AbstractC5434v.b bVar = AbstractC5434v.b.RESUMED;
                C8134b c8134b = C8134b.this;
                a aVar2 = new a(c8134b, null);
                this.f74733d = 1;
                if (C5412d0.b(c8134b, bVar, aVar2, this) == aVar) {
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

    public C8134b() {
        super(R.layout.fragment_ozon_id_debug_preferences);
        this.f74729a = new C8135c();
        K k11 = Tb0.a.f26975d;
        if (k11 == null) {
            throw new Lb0.a();
        }
        this.f74730b = k11.x().c();
    }

    public static final InterfaceC3917k u(C8134b c8134b) {
        return (InterfaceC3917k) c8134b.f74730b.getValue();
    }

    @Override // androidx.fragment.app.ComponentCallbacksC5392m
    public final void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        k a11 = k.a(view);
        a11.f14490b.setOnClickListener(new View.OnClickListener() { // from class: md0.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C8134b c8134b = C8134b.this;
                C10727i.c(androidx.lifecycle.K.a(c8134b), null, null, c8134b.new a(null), 3);
            }
        });
        a11.f14492d.setAdapter(this.f74729a);
        J viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C10727i.c(androidx.lifecycle.K.a(viewLifecycleOwner), null, null, new C1269b(null), 3);
    }
}
