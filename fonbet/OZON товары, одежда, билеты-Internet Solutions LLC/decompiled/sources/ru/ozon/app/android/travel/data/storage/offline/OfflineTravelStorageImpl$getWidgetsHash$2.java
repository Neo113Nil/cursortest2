package ru.ozon.app.android.travel.data.storage.offline;

import Je.InterfaceC3394a;
import Sc.s;
import Wc.a;
import android.content.Context;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)Ljava/lang/String;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.data.storage.offline.OfflineTravelStorageImpl$getWidgetsHash$2", f = "OfflineTravelStorageImpl.kt", l = {178}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class OfflineTravelStorageImpl$getWidgetsHash$2 extends j implements Function2<M, d<? super String>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ OfflineTravelStorageImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OfflineTravelStorageImpl$getWidgetsHash$2(OfflineTravelStorageImpl offlineTravelStorageImpl, d<? super OfflineTravelStorageImpl$getWidgetsHash$2> dVar) {
        super(2, dVar);
        this.this$0 = offlineTravelStorageImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new OfflineTravelStorageImpl$getWidgetsHash$2(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC3394a interfaceC3394a;
        OfflineTravelStorageImpl offlineTravelStorageImpl;
        Context context;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                interfaceC3394a = this.this$0.hashMutex;
                OfflineTravelStorageImpl offlineTravelStorageImpl2 = this.this$0;
                this.L$0 = interfaceC3394a;
                this.L$1 = offlineTravelStorageImpl2;
                this.label = 1;
                if (interfaceC3394a.a(this) == aVar) {
                    return aVar;
                }
                offlineTravelStorageImpl = offlineTravelStorageImpl2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                offlineTravelStorageImpl = (OfflineTravelStorageImpl) this.L$1;
                interfaceC3394a = (InterfaceC3394a) this.L$0;
                s.b(obj);
            }
            try {
                context = offlineTravelStorageImpl.context;
                return context.getSharedPreferences("OfflineWidgetPreferences", 0).getString("WidgetsHash", "");
            } finally {
                interfaceC3394a.c(null);
            }
        } catch (CancellationException e11) {
            throw e11;
        } catch (Throwable th2) {
            Lm0.a.f17149a.e(th2);
            return null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super String> dVar) {
        return ((OfflineTravelStorageImpl$getWidgetsHash$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
