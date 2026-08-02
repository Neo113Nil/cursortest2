package ru.ozon.app.android.abtool.data.repository;

import Sc.r;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.data.local.LocalDataSource;
import ru.ozon.app.android.abtool.data.local.entity.ExperimentEntity;
import xe.C10727i;
import xe.I;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0086@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u000f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/abtool/data/repository/AbVariantsRepository;", "", "Lru/ozon/app/android/abtool/data/local/LocalDataSource;", "localDataSource", "Lxe/I;", "dispatcher", "", "isRepositoryEnabled", "<init>", "(Lru/ozon/app/android/abtool/data/local/LocalDataSource;Lxe/I;Z)V", "", "Lru/ozon/app/android/abtool/data/local/entity/ExperimentEntity;", "getExperiments", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "getAbVariantsIds", "Lru/ozon/app/android/abtool/data/local/LocalDataSource;", "Lxe/I;", "Z", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AbVariantsRepository {

    @NotNull
    private final I dispatcher;
    private final boolean isRepositoryEnabled;

    @NotNull
    private final LocalDataSource localDataSource;

    public AbVariantsRepository(@NotNull LocalDataSource localDataSource, @NotNull I dispatcher, boolean z11) {
        Intrinsics.checkNotNullParameter(localDataSource, "localDataSource");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.localDataSource = localDataSource;
        this.dispatcher = dispatcher;
        this.isRepositoryEnabled = z11;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getAbVariantsIds(@NotNull d<? super String> dVar) {
        AbVariantsRepository$getAbVariantsIds$1 abVariantsRepository$getAbVariantsIds$1;
        int i11;
        if (dVar instanceof AbVariantsRepository$getAbVariantsIds$1) {
            abVariantsRepository$getAbVariantsIds$1 = (AbVariantsRepository$getAbVariantsIds$1) dVar;
            int i12 = abVariantsRepository$getAbVariantsIds$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                abVariantsRepository$getAbVariantsIds$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = abVariantsRepository$getAbVariantsIds$1.result;
                Object obj2 = a.COROUTINE_SUSPENDED;
                i11 = abVariantsRepository$getAbVariantsIds$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    abVariantsRepository$getAbVariantsIds$1.label = 1;
                    obj = getExperiments(abVariantsRepository$getAbVariantsIds$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return C7714v.V((Iterable) obj, ",", null, null, AbVariantsRepository$getAbVariantsIds$2.INSTANCE, 30);
            }
        }
        abVariantsRepository$getAbVariantsIds$1 = new AbVariantsRepository$getAbVariantsIds$1(this, dVar);
        Object obj3 = abVariantsRepository$getAbVariantsIds$1.result;
        Object obj22 = a.COROUTINE_SUSPENDED;
        i11 = abVariantsRepository$getAbVariantsIds$1.label;
        if (i11 != 0) {
        }
        return C7714v.V((Iterable) obj3, ",", null, null, AbVariantsRepository$getAbVariantsIds$2.INSTANCE, 30);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getExperiments(@NotNull d<? super List<ExperimentEntity>> dVar) {
        AbVariantsRepository$getExperiments$1 abVariantsRepository$getExperiments$1;
        int i11;
        if (dVar instanceof AbVariantsRepository$getExperiments$1) {
            abVariantsRepository$getExperiments$1 = (AbVariantsRepository$getExperiments$1) dVar;
            int i12 = abVariantsRepository$getExperiments$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                abVariantsRepository$getExperiments$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = abVariantsRepository$getExperiments$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = abVariantsRepository$getExperiments$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    if (!this.isRepositoryEnabled) {
                        return K.f71697a;
                    }
                    I i13 = this.dispatcher;
                    AbVariantsRepository$getExperiments$2 abVariantsRepository$getExperiments$2 = new AbVariantsRepository$getExperiments$2(this, null);
                    abVariantsRepository$getExperiments$1.label = 1;
                    obj = C10727i.f(i13, abVariantsRepository$getExperiments$2, abVariantsRepository$getExperiments$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                Object f26106a = ((r) obj).getF26106a();
                return !(f26106a instanceof r.b) ? K.f71697a : f26106a;
            }
        }
        abVariantsRepository$getExperiments$1 = new AbVariantsRepository$getExperiments$1(this, dVar);
        Object obj2 = abVariantsRepository$getExperiments$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = abVariantsRepository$getExperiments$1.label;
        if (i11 != 0) {
        }
        Object f26106a2 = ((r) obj2).getF26106a();
        if (!(f26106a2 instanceof r.b)) {
        }
    }
}
