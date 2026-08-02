package ru.ozon.moshi.adapters.serialize.collection.reader;

import Sc.s;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.n;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.C10721f;
import xe.C10727i;
import xe.I;
import xe.M;

/* JADX INFO: Add missing generic type declarations: [C] */
/* JADX WARN: Incorrect field signature: TC; */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0000*\u00020\u0002H\n"}, d2 = {"", "C", "Lxe/M;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.moshi.adapters.serialize.collection.reader.CoroutineCollectionJsonReader$read$1", f = "CoroutineCollectionJsonReader.kt", l = {28}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CoroutineCollectionJsonReader$read$1<C> extends j implements Function2<M, d<? super C>, Object> {
    final /* synthetic */ I $arg0;
    final /* synthetic */ Collection $collection;
    final /* synthetic */ JsonAdapter<T> $elementAdapter;
    final /* synthetic */ n $this_read;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lxe/M;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.moshi.adapters.serialize.collection.reader.CoroutineCollectionJsonReader$read$1$1", f = "CoroutineCollectionJsonReader.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.moshi.adapters.serialize.collection.reader.CoroutineCollectionJsonReader$read$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> extends j implements Function2<M, d<? super T>, Object> {
        final /* synthetic */ JsonAdapter<T> $elementAdapter;
        final /* synthetic */ Object $next;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonAdapter<T> jsonAdapter, Object obj, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$elementAdapter = jsonAdapter;
            this.$next = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$elementAdapter, this.$next, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return this.$elementAdapter.fromJsonValue(this.$next);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super T> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lcom/squareup/moshi/n;Lxe/I;TC;Lcom/squareup/moshi/JsonAdapter<TT;>;Lkotlin/coroutines/d<-Lru/ozon/moshi/adapters/serialize/collection/reader/CoroutineCollectionJsonReader$read$1;>;)V */
    CoroutineCollectionJsonReader$read$1(n nVar, I i11, Collection collection, JsonAdapter jsonAdapter, d dVar) {
        super(2, dVar);
        this.$this_read = nVar;
        this.$arg0 = i11;
        this.$collection = collection;
        this.$elementAdapter = jsonAdapter;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        CoroutineCollectionJsonReader$read$1 coroutineCollectionJsonReader$read$1 = new CoroutineCollectionJsonReader$read$1(this.$this_read, this.$arg0, this.$collection, this.$elementAdapter, dVar);
        coroutineCollectionJsonReader$read$1.L$0 = obj;
        return coroutineCollectionJsonReader$read$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Collection collection;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            M m11 = (M) this.L$0;
            this.$this_read.beginArray();
            ArrayList arrayList = new ArrayList();
            while (this.$this_read.hasNext()) {
                arrayList.add(C10727i.a(m11, this.$arg0, null, new AnonymousClass1(this.$elementAdapter, this.$this_read.t(), null), 2));
            }
            Collection collection2 = this.$collection;
            this.L$0 = collection2;
            this.label = 1;
            Object a11 = C10721f.a(arrayList, this);
            if (a11 == aVar) {
                return aVar;
            }
            collection = collection2;
            obj = a11;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            collection = (Collection) this.L$0;
            s.b(obj);
        }
        collection.addAll((Collection) obj);
        this.$this_read.endArray();
        return this.$collection;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super C> dVar) {
        return ((CoroutineCollectionJsonReader$read$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
