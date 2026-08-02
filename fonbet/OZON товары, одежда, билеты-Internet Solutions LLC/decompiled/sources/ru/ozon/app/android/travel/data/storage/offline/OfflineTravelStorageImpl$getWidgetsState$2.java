package ru.ozon.app.android.travel.data.storage.offline;

import Je.InterfaceC3394a;
import Sc.s;
import Vd0.b;
import Wc.a;
import android.content.Context;
import android.util.AtomicFile;
import bd.C5652b;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "Lru/ozon/app/android/travel/data/storage/offline/OfflineTravelWidgetsStateDTO;", "<anonymous>", "(Lxe/M;)Lru/ozon/app/android/travel/data/storage/offline/OfflineTravelWidgetsStateDTO;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.data.storage.offline.OfflineTravelStorageImpl$getWidgetsState$2", f = "OfflineTravelStorageImpl.kt", l = {178}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class OfflineTravelStorageImpl$getWidgetsState$2 extends j implements Function2<M, d<? super OfflineTravelWidgetsStateDTO>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ OfflineTravelStorageImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OfflineTravelStorageImpl$getWidgetsState$2(OfflineTravelStorageImpl offlineTravelStorageImpl, d<? super OfflineTravelStorageImpl$getWidgetsState$2> dVar) {
        super(2, dVar);
        this.this$0 = offlineTravelStorageImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new OfflineTravelStorageImpl$getWidgetsState$2(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC3394a interfaceC3394a;
        OfflineTravelStorageImpl offlineTravelStorageImpl;
        Context context;
        String str;
        OfflineTravelWidgetsStateDTO offlineTravelWidgetsStateDTO;
        JsonParser jsonParser;
        FileInputStream openRead;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                interfaceC3394a = this.this$0.stateMutex;
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
                AtomicFile atomicFile = new AtomicFile(new File(context.getFilesDir(), "OfflineWidgets.json"));
                try {
                    openRead = atomicFile.openRead();
                } catch (FileNotFoundException unused) {
                    str = null;
                }
                try {
                    Intrinsics.f(openRead);
                    str = new String(C5652b.c(openRead), Charsets.UTF_8);
                    openRead.close();
                    if (str != null) {
                        jsonParser = offlineTravelStorageImpl.jsonDeserializer;
                        offlineTravelWidgetsStateDTO = (OfflineTravelWidgetsStateDTO) jsonParser.fromJson(str, OfflineTravelWidgetsStateDTO.class);
                        if (offlineTravelWidgetsStateDTO != null) {
                            if (System.currentTimeMillis() - offlineTravelWidgetsStateDTO.getCreated() >= offlineTravelWidgetsStateDTO.getCacheLifetimeLimitInMillis()) {
                                atomicFile.delete();
                            }
                            interfaceC3394a.c(null);
                            return offlineTravelWidgetsStateDTO;
                        }
                    }
                    offlineTravelWidgetsStateDTO = null;
                    interfaceC3394a.c(null);
                    return offlineTravelWidgetsStateDTO;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        b.a(openRead, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                interfaceC3394a.c(null);
                throw th4;
            }
        } catch (CancellationException e11) {
            throw e11;
        } catch (Throwable th5) {
            Lm0.a.f17149a.e(th5);
            return null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super OfflineTravelWidgetsStateDTO> dVar) {
        return ((OfflineTravelStorageImpl$getWidgetsState$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
