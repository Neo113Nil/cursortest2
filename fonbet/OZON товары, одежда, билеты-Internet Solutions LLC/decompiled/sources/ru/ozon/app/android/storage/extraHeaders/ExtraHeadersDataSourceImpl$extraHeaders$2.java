package ru.ozon.app.android.storage.extraHeaders;

import Sc.s;
import Wc.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import pf0.InterfaceC8918a;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.storage.extraHeaders.ExtraHeadersDataSourceImpl$extraHeaders$2", f = "ExtraHeadersDataSourceImpl.kt", l = {28, AppUpdateInfo.Factory.DAYS_BETWEEN_30}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ExtraHeadersDataSourceImpl$extraHeaders$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Map<String, String> $value;
    int label;
    final /* synthetic */ ExtraHeadersDataSourceImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExtraHeadersDataSourceImpl$extraHeaders$2(ExtraHeadersDataSourceImpl extraHeadersDataSourceImpl, Map<String, String> map, d<? super ExtraHeadersDataSourceImpl$extraHeaders$2> dVar) {
        super(2, dVar);
        this.this$0 = extraHeadersDataSourceImpl;
        this.$value = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ExtraHeadersDataSourceImpl$extraHeaders$2(this.this$0, this.$value, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r5.b(r4) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        if (r5.e(r1, r4) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC8918a extraHeadersRepository;
        InterfaceC8918a extraHeadersRepository2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            if (this.this$0.getExtraHeaders().isEmpty()) {
                extraHeadersRepository2 = this.this$0.getExtraHeadersRepository();
                this.label = 1;
            } else {
                extraHeadersRepository = this.this$0.getExtraHeadersRepository();
                Map<String, String> map = this.$value;
                this.label = 2;
            }
        } else {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ExtraHeadersDataSourceImpl$extraHeaders$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
