package ru.ozon.app.android.travel.data.storage.offline;

import Je.InterfaceC3394a;
import Sc.s;
import Wc.a;
import android.content.Context;
import android.util.AtomicFile;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.data.storage.offline.OfflineTravelStorageImpl$saveWidgetsState$2$1", f = "OfflineTravelStorageImpl.kt", l = {178}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class OfflineTravelStorageImpl$saveWidgetsState$2$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ String $serializedState;
    final /* synthetic */ OfflineTravelWidgetsStateDTO $state;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ OfflineTravelStorageImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OfflineTravelStorageImpl$saveWidgetsState$2$1(OfflineTravelStorageImpl offlineTravelStorageImpl, String str, OfflineTravelWidgetsStateDTO offlineTravelWidgetsStateDTO, d<? super OfflineTravelStorageImpl$saveWidgetsState$2$1> dVar) {
        super(2, dVar);
        this.this$0 = offlineTravelStorageImpl;
        this.$serializedState = str;
        this.$state = offlineTravelWidgetsStateDTO;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new OfflineTravelStorageImpl$saveWidgetsState$2$1(this.this$0, this.$serializedState, this.$state, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC3394a interfaceC3394a;
        String str;
        OfflineTravelStorageImpl offlineTravelStorageImpl;
        OfflineTravelWidgetsStateDTO offlineTravelWidgetsStateDTO;
        Context context;
        FileOutputStream fileOutputStream;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            interfaceC3394a = this.this$0.stateMutex;
            OfflineTravelStorageImpl offlineTravelStorageImpl2 = this.this$0;
            str = this.$serializedState;
            OfflineTravelWidgetsStateDTO offlineTravelWidgetsStateDTO2 = this.$state;
            this.L$0 = interfaceC3394a;
            this.L$1 = offlineTravelStorageImpl2;
            this.L$2 = str;
            this.L$3 = offlineTravelWidgetsStateDTO2;
            this.label = 1;
            if (interfaceC3394a.a(this) == aVar) {
                return aVar;
            }
            offlineTravelStorageImpl = offlineTravelStorageImpl2;
            offlineTravelWidgetsStateDTO = offlineTravelWidgetsStateDTO2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            offlineTravelWidgetsStateDTO = (OfflineTravelWidgetsStateDTO) this.L$3;
            str = (String) this.L$2;
            offlineTravelStorageImpl = (OfflineTravelStorageImpl) this.L$1;
            interfaceC3394a = (InterfaceC3394a) this.L$0;
            s.b(obj);
        }
        try {
            context = offlineTravelStorageImpl.context;
            AtomicFile atomicFile = new AtomicFile(new File(context.getFilesDir(), "OfflineWidgets.json"));
            try {
                fileOutputStream = atomicFile.startWrite();
                try {
                    byte[] bytes = str.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    fileOutputStream.write(bytes);
                    atomicFile.finishWrite(fileOutputStream);
                    offlineTravelStorageImpl._offlineStateObservable.setValue(offlineTravelWidgetsStateDTO.getWidgets());
                    Unit unit = Unit.f71690a;
                    interfaceC3394a.c(null);
                    return Unit.f71690a;
                } catch (Throwable th2) {
                    th = th2;
                    atomicFile.failWrite(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (Throwable th4) {
            interfaceC3394a.c(null);
            throw th4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((OfflineTravelStorageImpl$saveWidgetsState$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
