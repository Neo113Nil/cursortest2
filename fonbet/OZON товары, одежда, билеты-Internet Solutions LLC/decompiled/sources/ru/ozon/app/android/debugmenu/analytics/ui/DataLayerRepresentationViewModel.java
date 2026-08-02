package ru.ozon.app.android.debugmenu.analytics.ui;

import He.c;
import Sc.s;
import Wc.a;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import kotlin.reflect.o;
import ld.C7924e;
import md.C8128a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.AnalyticsCache;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R)\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/debugmenu/analytics/ui/DataLayerRepresentationViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/analytics/AnalyticsCache;", "analyticsCache", "<init>", "(Lru/ozon/app/android/analytics/AnalyticsCache;)V", "", "", "", "parseCache", "()Ljava/util/Map;", "any", "convert", "(Ljava/lang/Object;)Ljava/lang/Object;", "toMap", "(Ljava/lang/Object;)Ljava/util/Map;", "Lru/ozon/app/android/analytics/AnalyticsCache;", "Landroidx/lifecycle/P;", "cache", "Landroidx/lifecycle/P;", "getCache", "()Landroidx/lifecycle/P;", "Companion", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DataLayerRepresentationViewModel extends w0 {

    @NotNull
    private static final Set<Class<? extends Object>> primitives;

    @NotNull
    private final AnalyticsCache analyticsCache;

    @NotNull
    private final P<Map<String, Object>> cache;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.debugmenu.analytics.ui.DataLayerRepresentationViewModel$1", f = "DataLayerRepresentationViewModel.kt", l = {47}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.debugmenu.analytics.ui.DataLayerRepresentationViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ V<Map<String, Object>> $cache;
        Object L$0;
        int label;
        final /* synthetic */ DataLayerRepresentationViewModel this$0;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxe/M;", "", "", "", "<anonymous>", "(Lxe/M;)Ljava/util/Map;"}, k = 3, mv = {2, 0, 0})
        @e(c = "ru.ozon.app.android.debugmenu.analytics.ui.DataLayerRepresentationViewModel$1$1", f = "DataLayerRepresentationViewModel.kt", l = {}, m = "invokeSuspend")
        /* renamed from: ru.ozon.app.android.debugmenu.analytics.ui.DataLayerRepresentationViewModel$1$1, reason: invalid class name and collision with other inner class name */
        static final class C17651 extends j implements Function2<M, d<? super Map<String, ? extends Object>>, Object> {
            int label;
            final /* synthetic */ DataLayerRepresentationViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C17651(DataLayerRepresentationViewModel dataLayerRepresentationViewModel, d<? super C17651> dVar) {
                super(2, dVar);
                this.this$0 = dataLayerRepresentationViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<Unit> create(Object obj, d<?> dVar) {
                return new C17651(this.this$0, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                a aVar = a.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return this.this$0.parseCache();
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(M m11, d<? super Map<String, ? extends Object>> dVar) {
                return ((C17651) create(m11, dVar)).invokeSuspend(Unit.f71690a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(V<Map<String, Object>> v11, DataLayerRepresentationViewModel dataLayerRepresentationViewModel, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$cache = v11;
            this.this$0 = dataLayerRepresentationViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$cache, this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V v11;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                V<Map<String, Object>> v12 = this.$cache;
                c a11 = C10720e0.a();
                C17651 c17651 = new C17651(this.this$0, null);
                this.L$0 = v12;
                this.label = 1;
                Object f7 = C10727i.f(a11, c17651, this);
                if (f7 == aVar) {
                    return aVar;
                }
                v11 = v12;
                obj = f7;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v11 = (V) this.L$0;
                s.b(obj);
            }
            v11.setValue(obj);
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    static {
        Class[] elements = {Boolean.class, Boolean.TYPE, Character.class, Character.TYPE, Byte.class, Byte.TYPE, Short.class, Short.TYPE, Integer.class, Integer.TYPE, Long.class, Long.TYPE, Float.class, Float.TYPE, Double.class, Double.TYPE, String.class};
        Intrinsics.checkNotNullParameter(elements, "elements");
        primitives = C7705l.j0(elements);
    }

    public DataLayerRepresentationViewModel(@NotNull AnalyticsCache analyticsCache) {
        Intrinsics.checkNotNullParameter(analyticsCache, "analyticsCache");
        this.analyticsCache = analyticsCache;
        V v11 = new V();
        C10727i.c(x0.a(this), null, null, new AnonymousClass1(v11, this, null), 3);
        this.cache = v11;
    }

    private final Object convert(Object any) {
        if (any == null) {
            return null;
        }
        if (any instanceof Iterable) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Iterable) any).iterator();
            while (it.hasNext()) {
                Object convert = convert(it.next());
                if (convert != null) {
                    arrayList.add(convert);
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
        if (!(any instanceof Map)) {
            return primitives.contains(any.getClass()) ? any.toString() : toMap(any);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((Map) any).entrySet()) {
            Object convert2 = convert(entry.getKey());
            Object convert3 = convert(entry.getValue());
            if (convert3 != null) {
                linkedHashMap.put(convert2, convert3);
            }
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Object> parseCache() {
        Map<String, AnalyticsDataLayer> cache = this.analyticsCache.getCache();
        LinkedHashMap linkedHashMap = new LinkedHashMap(cache.size());
        for (Map.Entry<String, AnalyticsDataLayer> entry : cache.entrySet()) {
            String key = entry.getKey();
            Object convert = convert(entry.getValue());
            if (convert != null) {
                linkedHashMap.put(key, convert);
            }
        }
        return linkedHashMap;
    }

    private final Map<String, Object> toMap(Object any) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = C7924e.a(N.b(any.getClass())).iterator();
        while (it.hasNext()) {
            o oVar = (o) it.next();
            Intrinsics.g(oVar, "null cannot be cast to non-null type kotlin.reflect.KProperty1<kotlin.Any, kotlin.Any?>");
            C8128a.b(oVar, true);
            Object convert = convert(oVar.get(any));
            if (convert != null) {
                linkedHashMap.put(oVar.getName(), convert);
            }
            C8128a.b(oVar, false);
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        return linkedHashMap;
    }

    @NotNull
    public final P<Map<String, Object>> getCache() {
        return this.cache;
    }
}
