package com.socure.docv.capturesdk.common.mapper;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* compiled from: Mapper.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\b`\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u0019\u0010\u0004\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J%\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u00072\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/socure/docv/capturesdk/common/mapper/Mapper;", "I", "O", "", "map", MetricTracker.Object.INPUT, "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface Mapper<I, O> {
    Object map(I i, Continuation<? super O> continuation);

    Object map(List<? extends I> list, Continuation<? super List<? extends O>> continuation);

    /* compiled from: Mapper.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007b -> B:10:0x007f). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static <I, O> Object map(Mapper<I, O> mapper, List<? extends I> list, Continuation<? super List<? extends O>> continuation) {
            Mapper$map$1 mapper$map$1;
            int i;
            Mapper mapper2;
            Collection collection;
            Iterator it;
            if (continuation instanceof Mapper$map$1) {
                mapper$map$1 = (Mapper$map$1) continuation;
                if ((mapper$map$1.label & Integer.MIN_VALUE) != 0) {
                    mapper$map$1.label -= Integer.MIN_VALUE;
                    Object obj = mapper$map$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = mapper$map$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        List<? extends I> list2 = list;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                        Iterator it2 = list2.iterator();
                        mapper2 = mapper;
                        collection = arrayList;
                        it = it2;
                        if (it.hasNext()) {
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        collection = (Collection) mapper$map$1.L$3;
                        Iterator it3 = (Iterator) mapper$map$1.L$2;
                        Collection collection2 = (Collection) mapper$map$1.L$1;
                        Mapper mapper3 = (Mapper) mapper$map$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        Mapper$map$1 mapper$map$12 = mapper$map$1;
                        Iterator it4 = it3;
                        Mapper mapper4 = mapper3;
                        Mapper$map$1 mapper$map$13 = mapper$map$12;
                        collection.add(obj);
                        it = it4;
                        collection = collection2;
                        mapper$map$1 = mapper$map$13;
                        mapper2 = mapper4;
                        if (it.hasNext()) {
                            Object next = it.next();
                            mapper$map$1.L$0 = mapper2;
                            mapper$map$1.L$1 = collection;
                            mapper$map$1.L$2 = it;
                            mapper$map$1.L$3 = collection;
                            mapper$map$1.label = 1;
                            Object map = mapper2.map((Mapper) next, (Continuation) mapper$map$1);
                            if (map == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            mapper$map$13 = mapper$map$1;
                            it4 = it;
                            obj = map;
                            collection2 = collection;
                            mapper4 = mapper2;
                            collection.add(obj);
                            it = it4;
                            collection = collection2;
                            mapper$map$1 = mapper$map$13;
                            mapper2 = mapper4;
                            if (it.hasNext()) {
                                return (List) collection;
                            }
                        }
                    }
                }
            }
            mapper$map$1 = new Mapper$map$1(continuation);
            Object obj2 = mapper$map$1.result;
            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = mapper$map$1.label;
            if (i != 0) {
            }
        }
    }
}
