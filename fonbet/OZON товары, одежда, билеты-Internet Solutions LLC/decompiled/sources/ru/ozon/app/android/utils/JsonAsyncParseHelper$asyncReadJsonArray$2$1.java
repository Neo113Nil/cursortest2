package ru.ozon.app.android.utils;

import Sc.s;
import Wc.a;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.C10721f;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.utils.JsonAsyncParseHelper$asyncReadJsonArray$2$1", f = "JsonAsyncParseHelper.kt", l = {28}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class JsonAsyncParseHelper$asyncReadJsonArray$2$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ JsonAdapter<T> $itemJsonAdapter;
    final /* synthetic */ n $jsonReader;
    final /* synthetic */ List<T> $this_apply;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0006\b\u0002\u0018\u00018\u0000*\u00020\u0000H\n"}, d2 = {"Lxe/M;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.utils.JsonAsyncParseHelper$asyncReadJsonArray$2$1$1", f = "JsonAsyncParseHelper.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.utils.JsonAsyncParseHelper$asyncReadJsonArray$2$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> extends j implements Function2<M, d<? super T>, Object> {
        final /* synthetic */ Object $item;
        final /* synthetic */ JsonAdapter<T> $itemJsonAdapter;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(JsonAdapter<T> jsonAdapter, Object obj, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$itemJsonAdapter = jsonAdapter;
            this.$item = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$itemJsonAdapter, this.$item, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            T fromJsonValue = this.$itemJsonAdapter.fromJsonValue(this.$item);
            if (fromJsonValue != null) {
                return fromJsonValue;
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super T> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    JsonAsyncParseHelper$asyncReadJsonArray$2$1(n nVar, List<T> list, JsonAdapter<T> jsonAdapter, d<? super JsonAsyncParseHelper$asyncReadJsonArray$2$1> dVar) {
        super(2, dVar);
        this.$jsonReader = nVar;
        this.$this_apply = list;
        this.$itemJsonAdapter = jsonAdapter;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        JsonAsyncParseHelper$asyncReadJsonArray$2$1 jsonAsyncParseHelper$asyncReadJsonArray$2$1 = new JsonAsyncParseHelper$asyncReadJsonArray$2$1(this.$jsonReader, this.$this_apply, this.$itemJsonAdapter, dVar);
        jsonAsyncParseHelper$asyncReadJsonArray$2$1.L$0 = obj;
        return jsonAsyncParseHelper$asyncReadJsonArray$2$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        List list;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            M m11 = (M) this.L$0;
            this.$jsonReader.beginArray();
            ArrayList arrayList = new ArrayList();
            while (this.$jsonReader.hasNext()) {
                arrayList.add(C10727i.a(m11, null, null, new AnonymousClass1(this.$itemJsonAdapter, this.$jsonReader.t(), null), 3));
            }
            List list2 = this.$this_apply;
            this.L$0 = list2;
            this.label = 1;
            Object a11 = C10721f.a(arrayList, this);
            if (a11 == aVar) {
                return aVar;
            }
            list = list2;
            obj = a11;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) this.L$0;
            s.b(obj);
        }
        list.addAll((Collection) obj);
        this.$jsonReader.endArray();
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((JsonAsyncParseHelper$asyncReadJsonArray$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
