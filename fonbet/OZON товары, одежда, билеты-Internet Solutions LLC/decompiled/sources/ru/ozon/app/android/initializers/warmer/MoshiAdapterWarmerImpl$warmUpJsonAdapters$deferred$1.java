package ru.ozon.app.android.initializers.warmer;

import Sc.s;
import Wc.a;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.network.abtool.flag.FeatureFlag;
import ru.ozon.app.android.warmup.WarmupAdaptersFacade;
import ru.ozon.app.android.warmup.WarmupInfo;
import xe.M;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxe/M;", "", "Lcom/squareup/moshi/JsonAdapter;", "", "kotlin.jvm.PlatformType", "<anonymous>", "(Lxe/M;)Ljava/util/List;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.initializers.warmer.MoshiAdapterWarmerImpl$warmUpJsonAdapters$deferred$1", f = "MoshiAdapterWarmer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class MoshiAdapterWarmerImpl$warmUpJsonAdapters$deferred$1 extends j implements Function2<M, d<? super List<? extends JsonAdapter<? extends Object>>>, Object> {
    final /* synthetic */ Set<FeatureFlag> $warmupConfigurationFlags;
    int label;
    final /* synthetic */ MoshiAdapterWarmerImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MoshiAdapterWarmerImpl$warmUpJsonAdapters$deferred$1(MoshiAdapterWarmerImpl moshiAdapterWarmerImpl, Set<? extends FeatureFlag> set, d<? super MoshiAdapterWarmerImpl$warmUpJsonAdapters$deferred$1> dVar) {
        super(2, dVar);
        this.this$0 = moshiAdapterWarmerImpl;
        this.$warmupConfigurationFlags = set;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new MoshiAdapterWarmerImpl$warmUpJsonAdapters$deferred$1(this.this$0, this.$warmupConfigurationFlags, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        WarmupAdaptersFacade warmupAdaptersFacade;
        Moshi moshi;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        warmupAdaptersFacade = this.this$0.warmupAdaptersFacade;
        List<WarmupInfo> warmupInfos = warmupAdaptersFacade.getWarmupInfos(this.$warmupConfigurationFlags);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = warmupInfos.iterator();
        while (it.hasNext()) {
            C7714v.p(((WarmupInfo) it.next()).getDtosToWarmup(), arrayList);
        }
        MoshiAdapterWarmerImpl moshiAdapterWarmerImpl = this.this$0;
        ArrayList arrayList2 = new ArrayList(C7714v.z(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Class cls = (Class) it2.next();
            moshi = moshiAdapterWarmerImpl.moshi;
            arrayList2.add(moshi.c(cls));
        }
        return arrayList2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super List<? extends JsonAdapter<? extends Object>>> dVar) {
        return ((MoshiAdapterWarmerImpl$warmUpJsonAdapters$deferred$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
