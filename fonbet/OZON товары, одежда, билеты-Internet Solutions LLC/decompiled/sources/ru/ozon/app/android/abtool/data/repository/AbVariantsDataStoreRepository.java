package ru.ozon.app.android.abtool.data.repository;

import Ae.InterfaceC2395h;
import Wc.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000e\u001a\u00020\t2\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\f\"\u00020\u0007H\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0012\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@¢\u0006\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/abtool/data/repository/AbVariantsDataStoreRepository;", "", "Lru/ozon/app/android/abtool/data/repository/AbVariantsDataSource;", "dataSource", "<init>", "(Lru/ozon/app/android/abtool/data/repository/AbVariantsDataSource;)V", "", "", "newVariants", "", "appendVariants", "(Ljava/util/Set;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "variants", "removeVariants", "([Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "clear", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "setVariants", "Lru/ozon/app/android/abtool/data/repository/AbVariantsDataSource;", "LAe/h;", "getVariants", "()LAe/h;", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AbVariantsDataStoreRepository {

    @NotNull
    private final AbVariantsDataSource dataSource;

    public AbVariantsDataStoreRepository(@NotNull AbVariantsDataSource dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.dataSource = dataSource;
    }

    public final Object appendVariants(@NotNull Set<String> set, @NotNull d<? super Unit> dVar) {
        Object updateVariants;
        return (!set.isEmpty() && (updateVariants = this.dataSource.updateVariants(new AbVariantsDataStoreRepository$appendVariants$2(set), dVar)) == a.COROUTINE_SUSPENDED) ? updateVariants : Unit.f71690a;
    }

    public final Object clear(@NotNull d<? super Unit> dVar) {
        Object clearVariants = this.dataSource.clearVariants(dVar);
        return clearVariants == a.COROUTINE_SUSPENDED ? clearVariants : Unit.f71690a;
    }

    @NotNull
    public final InterfaceC2395h<Set<String>> getVariants() {
        return this.dataSource.getVariants();
    }

    public final Object removeVariants(@NotNull String[] strArr, @NotNull d<? super Unit> dVar) {
        if (strArr.length == 0) {
            Object clear = clear(dVar);
            return clear == a.COROUTINE_SUSPENDED ? clear : Unit.f71690a;
        }
        Object updateVariants = this.dataSource.updateVariants(new AbVariantsDataStoreRepository$removeVariants$2(strArr), dVar);
        return updateVariants == a.COROUTINE_SUSPENDED ? updateVariants : Unit.f71690a;
    }

    public final Object setVariants(@NotNull Set<String> set, @NotNull d<? super Unit> dVar) {
        Object saveVariants = this.dataSource.saveVariants(set, dVar);
        return saveVariants == a.COROUTINE_SUSPENDED ? saveVariants : Unit.f71690a;
    }
}
