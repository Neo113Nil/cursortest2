package t20;

import Sc.s;
import android.app.ActivityManager;
import android.app.Application;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f98975a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<kotlin.coroutines.d<? super Unit>, Object> f98976b;

    public e(@NotNull Application context, @NotNull Function1 onCleanAppData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onCleanAppData, "onCleanAppData");
        this.f98975a = context;
        this.f98976b = onCleanAppData;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        d dVar;
        int i11;
        e eVar;
        ActivityManager activityManager;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i12 = dVar.f98974g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                dVar.f98974g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = dVar.f98972e;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = dVar.f98974g;
                if (i11 != 0) {
                    s.b(obj);
                    dVar.f98971d = this;
                    dVar.f98974g = 1;
                    if (this.f98976b.invoke(dVar) == aVar) {
                        return aVar;
                    }
                    eVar = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    eVar = dVar.f98971d;
                    s.b(obj);
                }
                Object systemService = eVar.f98975a.getSystemService("activity");
                activityManager = !(systemService instanceof ActivityManager) ? (ActivityManager) systemService : null;
                if (activityManager != null) {
                    activityManager.clearApplicationUserData();
                }
                return Unit.f71690a;
            }
        }
        dVar = new d(this, cVar);
        Object obj2 = dVar.f98972e;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = dVar.f98974g;
        if (i11 != 0) {
        }
        Object systemService2 = eVar.f98975a.getSystemService("activity");
        if (!(systemService2 instanceof ActivityManager)) {
        }
        if (activityManager != null) {
        }
        return Unit.f71690a;
    }
}
