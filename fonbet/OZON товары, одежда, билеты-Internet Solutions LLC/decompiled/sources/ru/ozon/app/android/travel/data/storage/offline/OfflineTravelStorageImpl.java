package ru.ozon.app.android.travel.data.storage.offline;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import Ae.x0;
import Je.InterfaceC3394a;
import Sc.s;
import Wc.a;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.network.serialize.JsonSerializer;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import xe.C10727i;
import xe.I;
import xe.M;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u000fH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0016H\u0096@¢\u0006\u0004\b\u001a\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R \u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R&\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/data/storage/offline/OfflineTravelStorageImpl;", "Lru/ozon/app/android/travel/data/storage/offline/OfflineTravelStorage;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatchersProvider", "Lru/ozon/app/android/network/serialize/JsonSerializer;", "jsonSerializer", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Lxe/M;", "coroutineScope", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;Lru/ozon/app/android/network/serialize/JsonSerializer;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lxe/M;)V", "", "hash", "", "saveWidgetsHash", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "getWidgetsHash", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/travel/data/storage/offline/OfflineTravelWidgetsStateDTO;", "state", "saveWidgetsState", "(Lru/ozon/app/android/travel/data/storage/offline/OfflineTravelWidgetsStateDTO;Lkotlin/coroutines/d;)Ljava/lang/Object;", "getWidgetsState", "Landroid/content/Context;", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "Lru/ozon/app/android/network/serialize/JsonSerializer;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "LJe/a;", "hashMutex", "LJe/a;", "stateMutex", "LAe/x0;", "", "Lru/ozon/app/android/travel/data/storage/offline/OfflineTravelWidget;", "_offlineStateObservable", "LAe/x0;", "LAe/M0;", "offlineStateObservable", "LAe/M0;", "getOfflineStateObservable", "()LAe/M0;", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OfflineTravelStorageImpl implements OfflineTravelStorage {

    @NotNull
    private final x0<List<OfflineTravelWidget>> _offlineStateObservable;

    @NotNull
    private final Context context;

    @NotNull
    private final CoroutineDispatcherProvider dispatchersProvider;

    @NotNull
    private final InterfaceC3394a hashMutex;

    @NotNull
    private final JsonParser jsonDeserializer;

    @NotNull
    private final JsonSerializer jsonSerializer;

    @NotNull
    private final M0<List<OfflineTravelWidget>> offlineStateObservable;

    @NotNull
    private final InterfaceC3394a stateMutex;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.travel.data.storage.offline.OfflineTravelStorageImpl$1", f = "OfflineTravelStorageImpl.kt", l = {46}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.travel.data.storage.offline.OfflineTravelStorageImpl$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        Object L$0;
        int label;

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return OfflineTravelStorageImpl.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            x0 x0Var;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                x0 x0Var2 = OfflineTravelStorageImpl.this._offlineStateObservable;
                OfflineTravelStorageImpl offlineTravelStorageImpl = OfflineTravelStorageImpl.this;
                this.L$0 = x0Var2;
                this.label = 1;
                Object widgetsState = offlineTravelStorageImpl.getWidgetsState(this);
                if (widgetsState == aVar) {
                    return aVar;
                }
                x0Var = x0Var2;
                obj = widgetsState;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x0Var = (x0) this.L$0;
                s.b(obj);
            }
            OfflineTravelWidgetsStateDTO offlineTravelWidgetsStateDTO = (OfflineTravelWidgetsStateDTO) obj;
            List<OfflineTravelWidget> widgets = offlineTravelWidgetsStateDTO != null ? offlineTravelWidgetsStateDTO.getWidgets() : null;
            if (widgets == null) {
                widgets = K.f71697a;
            }
            x0Var.setValue(widgets);
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    public OfflineTravelStorageImpl(@NotNull Context context, @NotNull CoroutineDispatcherProvider dispatchersProvider, @NotNull JsonSerializer jsonSerializer, @NotNull JsonParser jsonDeserializer, @NotNull M coroutineScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dispatchersProvider, "dispatchersProvider");
        Intrinsics.checkNotNullParameter(jsonSerializer, "jsonSerializer");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.context = context;
        this.dispatchersProvider = dispatchersProvider;
        this.jsonSerializer = jsonSerializer;
        this.jsonDeserializer = jsonDeserializer;
        this.hashMutex = Je.e.a();
        this.stateMutex = Je.e.a();
        x0<List<OfflineTravelWidget>> a11 = O0.a(K.f71697a);
        this._offlineStateObservable = a11;
        this.offlineStateObservable = C2399j.b(a11);
        C10727i.c(coroutineScope, null, null, new AnonymousClass1(null), 3);
    }

    @Override // ru.ozon.app.android.travel.data.storage.offline.OfflineTravelStorage
    @NotNull
    public M0<List<OfflineTravelWidget>> getOfflineStateObservable() {
        return this.offlineStateObservable;
    }

    @Override // ru.ozon.app.android.travel.data.storage.offline.OfflineTravelStorage
    public Object getWidgetsHash(@NotNull d<? super String> dVar) {
        return C10727i.f(this.dispatchersProvider.getIO(), new OfflineTravelStorageImpl$getWidgetsHash$2(this, null), dVar);
    }

    public Object getWidgetsState(@NotNull d<? super OfflineTravelWidgetsStateDTO> dVar) {
        return C10727i.f(this.dispatchersProvider.getIO(), new OfflineTravelStorageImpl$getWidgetsState$2(this, null), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // ru.ozon.app.android.travel.data.storage.offline.OfflineTravelStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object saveWidgetsHash(@NotNull String str, @NotNull d<? super Unit> dVar) {
        OfflineTravelStorageImpl$saveWidgetsHash$1 offlineTravelStorageImpl$saveWidgetsHash$1;
        int i11;
        try {
            if (dVar instanceof OfflineTravelStorageImpl$saveWidgetsHash$1) {
                offlineTravelStorageImpl$saveWidgetsHash$1 = (OfflineTravelStorageImpl$saveWidgetsHash$1) dVar;
                int i12 = offlineTravelStorageImpl$saveWidgetsHash$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    offlineTravelStorageImpl$saveWidgetsHash$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = offlineTravelStorageImpl$saveWidgetsHash$1.result;
                    a aVar = a.COROUTINE_SUSPENDED;
                    i11 = offlineTravelStorageImpl$saveWidgetsHash$1.label;
                    if (i11 != 0) {
                        s.b(obj);
                        I io2 = this.dispatchersProvider.getIO();
                        OfflineTravelStorageImpl$saveWidgetsHash$2$1 offlineTravelStorageImpl$saveWidgetsHash$2$1 = new OfflineTravelStorageImpl$saveWidgetsHash$2$1(this, str, null);
                        offlineTravelStorageImpl$saveWidgetsHash$1.label = 1;
                        if (C10727i.f(io2, offlineTravelStorageImpl$saveWidgetsHash$2$1, offlineTravelStorageImpl$saveWidgetsHash$1) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                    }
                    return Unit.f71690a;
                }
            }
            if (i11 != 0) {
            }
            return Unit.f71690a;
        } catch (CancellationException e11) {
            throw e11;
        } catch (Throwable th2) {
            throw new SaveOfflineHashFailedException("Unable to save hash", th2);
        }
        offlineTravelStorageImpl$saveWidgetsHash$1 = new OfflineTravelStorageImpl$saveWidgetsHash$1(this, dVar);
        Object obj2 = offlineTravelStorageImpl$saveWidgetsHash$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = offlineTravelStorageImpl$saveWidgetsHash$1.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0086, code lost:
    
        if (xe.C10727i.f(r4, r6, r0) != r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, ru.ozon.app.android.travel.data.storage.offline.OfflineTravelWidgetsStateDTO] */
    /* JADX WARN: Type inference failed for: r9v1, types: [ru.ozon.app.android.travel.data.storage.offline.OfflineTravelStorageImpl] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object, ru.ozon.app.android.travel.data.storage.offline.OfflineTravelStorageImpl] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Object, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Object] */
    @Override // ru.ozon.app.android.travel.data.storage.offline.OfflineTravelStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object saveWidgetsState(@NotNull OfflineTravelWidgetsStateDTO offlineTravelWidgetsStateDTO, @NotNull d<? super Unit> dVar) {
        OfflineTravelStorageImpl$saveWidgetsState$1 offlineTravelStorageImpl$saveWidgetsState$1;
        int i11;
        Object obj;
        OfflineTravelWidgetsStateDTO offlineTravelWidgetsStateDTO2;
        try {
            try {
                try {
                    try {
                        if (dVar instanceof OfflineTravelStorageImpl$saveWidgetsState$1) {
                            offlineTravelStorageImpl$saveWidgetsState$1 = (OfflineTravelStorageImpl$saveWidgetsState$1) dVar;
                            int i12 = offlineTravelStorageImpl$saveWidgetsState$1.label;
                            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                                offlineTravelStorageImpl$saveWidgetsState$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                                Object obj2 = offlineTravelStorageImpl$saveWidgetsState$1.result;
                                a aVar = a.COROUTINE_SUSPENDED;
                                i11 = offlineTravelStorageImpl$saveWidgetsState$1.label;
                                if (i11 != 0) {
                                    s.b(obj2);
                                    I i13 = this.dispatchersProvider.getDefault();
                                    OfflineTravelStorageImpl$saveWidgetsState$serializedState$1$1 offlineTravelStorageImpl$saveWidgetsState$serializedState$1$1 = new OfflineTravelStorageImpl$saveWidgetsState$serializedState$1$1(this, offlineTravelWidgetsStateDTO, null);
                                    offlineTravelStorageImpl$saveWidgetsState$1.L$0 = this;
                                    offlineTravelStorageImpl$saveWidgetsState$1.L$1 = offlineTravelWidgetsStateDTO;
                                    offlineTravelStorageImpl$saveWidgetsState$1.label = 1;
                                    Object f7 = C10727i.f(i13, offlineTravelStorageImpl$saveWidgetsState$serializedState$1$1, offlineTravelStorageImpl$saveWidgetsState$1);
                                    if (f7 != aVar) {
                                        obj = f7;
                                        offlineTravelWidgetsStateDTO2 = offlineTravelWidgetsStateDTO;
                                        offlineTravelWidgetsStateDTO = this;
                                    }
                                    return aVar;
                                }
                                if (i11 != 1) {
                                    if (i11 != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    s.b(obj2);
                                    offlineTravelWidgetsStateDTO = Unit.f71690a;
                                    return offlineTravelWidgetsStateDTO;
                                }
                                OfflineTravelWidgetsStateDTO offlineTravelWidgetsStateDTO3 = (OfflineTravelWidgetsStateDTO) offlineTravelStorageImpl$saveWidgetsState$1.L$1;
                                OfflineTravelStorageImpl offlineTravelStorageImpl = (OfflineTravelStorageImpl) offlineTravelStorageImpl$saveWidgetsState$1.L$0;
                                s.b(obj2);
                                offlineTravelWidgetsStateDTO2 = offlineTravelWidgetsStateDTO3;
                                offlineTravelWidgetsStateDTO = offlineTravelStorageImpl;
                                obj = obj2;
                                String str = (String) obj;
                                I io2 = offlineTravelWidgetsStateDTO.dispatchersProvider.getIO();
                                OfflineTravelStorageImpl$saveWidgetsState$2$1 offlineTravelStorageImpl$saveWidgetsState$2$1 = new OfflineTravelStorageImpl$saveWidgetsState$2$1(offlineTravelWidgetsStateDTO, str, offlineTravelWidgetsStateDTO2, null);
                                offlineTravelStorageImpl$saveWidgetsState$1.L$0 = offlineTravelWidgetsStateDTO;
                                offlineTravelStorageImpl$saveWidgetsState$1.L$1 = null;
                                offlineTravelStorageImpl$saveWidgetsState$1.label = 2;
                            }
                        }
                        String str2 = (String) obj;
                        I io22 = offlineTravelWidgetsStateDTO.dispatchersProvider.getIO();
                        OfflineTravelStorageImpl$saveWidgetsState$2$1 offlineTravelStorageImpl$saveWidgetsState$2$12 = new OfflineTravelStorageImpl$saveWidgetsState$2$1(offlineTravelWidgetsStateDTO, str2, offlineTravelWidgetsStateDTO2, null);
                        offlineTravelStorageImpl$saveWidgetsState$1.L$0 = offlineTravelWidgetsStateDTO;
                        offlineTravelStorageImpl$saveWidgetsState$1.L$1 = null;
                        offlineTravelStorageImpl$saveWidgetsState$1.label = 2;
                    } catch (Throwable th2) {
                        OfflineTravelWidgetsStateDTO offlineTravelWidgetsStateDTO4 = offlineTravelWidgetsStateDTO2;
                        th = th2;
                        offlineTravelWidgetsStateDTO = offlineTravelWidgetsStateDTO4;
                        throw new SaveOfflineStateFailedException("Unable to serialize ".concat(offlineTravelWidgetsStateDTO.getClass().getName()), th);
                    }
                    if (i11 != 0) {
                    }
                } catch (CancellationException e11) {
                    throw e11;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (CancellationException e12) {
            throw e12;
        } catch (Throwable th4) {
            throw new SaveOfflineStateFailedException("Unable to write OfflineWidgets.json to " + offlineTravelWidgetsStateDTO.context.getFilesDir(), th4);
        }
        offlineTravelStorageImpl$saveWidgetsState$1 = new OfflineTravelStorageImpl$saveWidgetsState$1(this, dVar);
        Object obj22 = offlineTravelStorageImpl$saveWidgetsState$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = offlineTravelStorageImpl$saveWidgetsState$1.label;
    }
}
