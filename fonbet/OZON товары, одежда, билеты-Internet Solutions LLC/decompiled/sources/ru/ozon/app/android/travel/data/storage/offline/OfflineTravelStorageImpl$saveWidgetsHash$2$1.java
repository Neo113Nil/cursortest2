package ru.ozon.app.android.travel.data.storage.offline;

import Je.InterfaceC3394a;
import Sc.s;
import Wc.a;
import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.data.storage.offline.OfflineTravelStorageImpl$saveWidgetsHash$2$1", f = "OfflineTravelStorageImpl.kt", l = {178}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class OfflineTravelStorageImpl$saveWidgetsHash$2$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $hash;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ OfflineTravelStorageImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OfflineTravelStorageImpl$saveWidgetsHash$2$1(OfflineTravelStorageImpl offlineTravelStorageImpl, String str, d<? super OfflineTravelStorageImpl$saveWidgetsHash$2$1> dVar) {
        super(2, dVar);
        this.this$0 = offlineTravelStorageImpl;
        this.$hash = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new OfflineTravelStorageImpl$saveWidgetsHash$2$1(this.this$0, this.$hash, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC3394a interfaceC3394a;
        OfflineTravelStorageImpl offlineTravelStorageImpl;
        InterfaceC3394a interfaceC3394a2;
        String str;
        Context context;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            interfaceC3394a = this.this$0.hashMutex;
            offlineTravelStorageImpl = this.this$0;
            String str2 = this.$hash;
            this.L$0 = interfaceC3394a;
            this.L$1 = offlineTravelStorageImpl;
            this.L$2 = str2;
            this.label = 1;
            if (interfaceC3394a.a(this) == aVar) {
                return aVar;
            }
            interfaceC3394a2 = interfaceC3394a;
            str = str2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$2;
            offlineTravelStorageImpl = (OfflineTravelStorageImpl) this.L$1;
            interfaceC3394a2 = (InterfaceC3394a) this.L$0;
            s.b(obj);
        }
        try {
            context = offlineTravelStorageImpl.context;
            SharedPreferences sharedPreferences = context.getSharedPreferences("OfflineWidgetPreferences", 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("WidgetsHash", str);
            edit.commit();
            Unit unit = Unit.f71690a;
            interfaceC3394a2.c(null);
            return Unit.f71690a;
        } catch (Throwable th2) {
            interfaceC3394a2.c(null);
            throw th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((OfflineTravelStorageImpl$saveWidgetsHash$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
