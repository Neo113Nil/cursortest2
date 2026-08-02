package ru.ozon.app.android.storage.extraHeaders;

import Sc.s;
import Wc.a;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import pf0.InterfaceC8918a;
import xe.M;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxe/M;", "", "", "<anonymous>", "(Lxe/M;)Ljava/util/Map;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.storage.extraHeaders.ExtraHeadersDataSourceImpl$extraHeaders$1", f = "ExtraHeadersDataSourceImpl.kt", l = {23}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class ExtraHeadersDataSourceImpl$extraHeaders$1 extends j implements Function2<M, d<? super Map<String, ? extends String>>, Object> {
    int label;
    final /* synthetic */ ExtraHeadersDataSourceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExtraHeadersDataSourceImpl$extraHeaders$1(ExtraHeadersDataSourceImpl extraHeadersDataSourceImpl, d<? super ExtraHeadersDataSourceImpl$extraHeaders$1> dVar) {
        super(2, dVar);
        this.this$0 = extraHeadersDataSourceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ExtraHeadersDataSourceImpl$extraHeaders$1(this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(M m11, d<? super Map<String, ? extends String>> dVar) {
        return invoke2(m11, (d<? super Map<String, String>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC8918a extraHeadersRepository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            return obj;
        }
        s.b(obj);
        extraHeadersRepository = this.this$0.getExtraHeadersRepository();
        this.label = 1;
        Serializable a11 = extraHeadersRepository.a(this);
        return a11 == aVar ? aVar : a11;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(M m11, d<? super Map<String, String>> dVar) {
        return ((ExtraHeadersDataSourceImpl$extraHeaders$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
