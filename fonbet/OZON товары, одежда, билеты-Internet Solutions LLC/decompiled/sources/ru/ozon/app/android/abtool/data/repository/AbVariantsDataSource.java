package ru.ozon.app.android.abtool.data.repository;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import R2.InterfaceC3917k;
import Sc.s;
import W2.f;
import W2.i;
import W2.j;
import Wc.a;
import android.app.Application;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.M;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\tH\u0086@¢\u0006\u0004\b\f\u0010\rJ0\u0010\u0010\u001a\u00020\t2\u001e\u0010\u000f\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u000eH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R#\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00168\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/abtool/data/repository/AbVariantsDataSource;", "", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "", "", "variants", "", "saveVariants", "(Ljava/util/Set;Lkotlin/coroutines/d;)Ljava/lang/Object;", "clearVariants", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Function1;", "updateAction", "updateVariants", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/d;)Ljava/lang/Object;", "LR2/k;", "LW2/f;", "dataStore", "LR2/k;", "LAe/h;", "LAe/h;", "getVariants", "()LAe/h;", "Companion", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AbVariantsDataSource {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final f.a<Set<String>> keyAbVariants = i.d("key_ab_variants");

    @NotNull
    private final InterfaceC3917k<f> dataStore;

    @NotNull
    private final InterfaceC2395h<Set<String>> variants;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/abtool/data/repository/AbVariantsDataSource$Companion;", "", "<init>", "()V", "LW2/f$a;", "", "", "keyAbVariants", "LW2/f$a;", "getKeyAbVariants", "()LW2/f$a;", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final f.a<Set<String>> getKeyAbVariants() {
            return AbVariantsDataSource.keyAbVariants;
        }

        private Companion() {
        }
    }

    public AbVariantsDataSource(@NotNull Application application) {
        InterfaceC3917k<f> dataStore;
        Intrinsics.checkNotNullParameter(application, "application");
        Context applicationContext = application.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        dataStore = AbVariantsDataSourceKt.getDataStore(applicationContext);
        this.dataStore = dataStore;
        final InterfaceC2395h<f> data = dataStore.getData();
        this.variants = new InterfaceC2395h<Set<? extends String>>() { // from class: ru.ozon.app.android.abtool.data.repository.AbVariantsDataSource$special$$inlined$map$1

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
            /* renamed from: ru.ozon.app.android.abtool.data.repository.AbVariantsDataSource$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC2397i {
                final /* synthetic */ InterfaceC2397i $this_unsafeFlow;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @e(c = "ru.ozon.app.android.abtool.data.repository.AbVariantsDataSource$special$$inlined$map$1$2", f = "AbVariantsDataSource.kt", l = {223}, m = "emit")
                /* renamed from: ru.ozon.app.android.abtool.data.repository.AbVariantsDataSource$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends c {
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= LinearLayoutManager.INVALID_OFFSET;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC2397i interfaceC2397i) {
                    this.$this_unsafeFlow = interfaceC2397i;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                @Override // Ae.InterfaceC2397i
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, @NotNull d dVar) {
                    AnonymousClass1 anonymousClass1;
                    int i11;
                    if (dVar instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) dVar;
                        int i12 = anonymousClass1.label;
                        if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                            anonymousClass1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                            Object obj2 = anonymousClass1.result;
                            Object obj3 = a.COROUTINE_SUSPENDED;
                            i11 = anonymousClass1.label;
                            if (i11 != 0) {
                                s.b(obj2);
                                InterfaceC2397i interfaceC2397i = this.$this_unsafeFlow;
                                Collection collection = (Set) ((f) obj).c(AbVariantsDataSource.keyAbVariants);
                                if (collection == null) {
                                    collection = M.f71699a;
                                }
                                anonymousClass1.label = 1;
                                if (interfaceC2397i.emit(collection, anonymousClass1) == obj3) {
                                    return obj3;
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                s.b(obj2);
                            }
                            return Unit.f71690a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(dVar);
                    Object obj22 = anonymousClass1.result;
                    Object obj32 = a.COROUTINE_SUSPENDED;
                    i11 = anonymousClass1.label;
                    if (i11 != 0) {
                    }
                    return Unit.f71690a;
                }
            }

            @Override // Ae.InterfaceC2395h
            public Object collect(@NotNull InterfaceC2397i<? super Set<? extends String>> interfaceC2397i, @NotNull d dVar) {
                Object collect = InterfaceC2395h.this.collect(new AnonymousClass2(interfaceC2397i), dVar);
                return collect == a.COROUTINE_SUSPENDED ? collect : Unit.f71690a;
            }
        };
    }

    public final Object clearVariants(@NotNull d<? super Unit> dVar) {
        Object a11 = j.a(this.dataStore, new AbVariantsDataSource$clearVariants$2(null), dVar);
        return a11 == a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }

    @NotNull
    public final InterfaceC2395h<Set<String>> getVariants() {
        return this.variants;
    }

    public final Object saveVariants(@NotNull Set<String> set, @NotNull d<? super Unit> dVar) {
        Object a11 = j.a(this.dataStore, new AbVariantsDataSource$saveVariants$2(set, null), dVar);
        return a11 == a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }

    public final Object updateVariants(@NotNull Function1<? super Set<String>, ? extends Set<String>> function1, @NotNull d<? super Unit> dVar) {
        Object a11 = j.a(this.dataStore, new AbVariantsDataSource$updateVariants$2(function1, null), dVar);
        return a11 == a.COROUTINE_SUSPENDED ? a11 : Unit.f71690a;
    }
}
