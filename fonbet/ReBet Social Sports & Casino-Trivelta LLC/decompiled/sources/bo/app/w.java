package bo.app;

import I0.InterfaceC1344i;
import Ph.P;
import com.braze.enums.DataStoreKey;
import com.braze.storage.C2987a;
import com.braze.support.BrazeLogger;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class w extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26147a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f26148b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2987a f26149c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f26150d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f26151e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(C2987a c2987a, ArrayList arrayList, long j10, Continuation continuation) {
        super(2, continuation);
        this.f26149c = c2987a;
        this.f26150d = arrayList;
        this.f26151e = j10;
    }

    public static final String a() {
        return "Failed to update last request time per placement for key: " + DataStoreKey.BANNERS_LAST_REQUEST_TIME_PER_PLACEMENT.getKey();
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        w wVar = new w(this.f26149c, this.f26150d, this.f26151e, continuation);
        wVar.f26148b = obj;
        return wVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((P) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        P p10 = (P) this.f26148b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f26147a;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            InterfaceC1344i dataStore = this.f26149c.getDataStore();
            v vVar = new v(this.f26150d, this.f26151e, null);
            this.f26148b = p10;
            this.f26147a = 1;
            Object a10 = L0.j.a(dataStore, vVar, this);
            return a10 == coroutine_suspended ? coroutine_suspended : a10;
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) p10, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.Hb
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.w.a();
                }
            }, 4, (Object) null);
            return Unit.INSTANCE;
        }
    }
}
