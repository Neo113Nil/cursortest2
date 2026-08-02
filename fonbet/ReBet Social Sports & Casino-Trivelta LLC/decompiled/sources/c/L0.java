package c;

import android.os.Build;
import com.surt.guardian.utils.Logger;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class L0 extends SuspendLambda implements Function2 {

    /* renamed from: n, reason: collision with root package name */
    public int f26455n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f26456o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f26457p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f26458q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f26459r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Map f26460s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C2438e f26461t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(String str, String str2, String str3, String str4, Map map, C2438e c2438e, Continuation continuation) {
        super(2, continuation);
        this.f26456o = str;
        this.f26457p = str2;
        this.f26458q = str3;
        this.f26459r = str4;
        this.f26460s = map;
        this.f26461t = c2438e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new L0(this.f26456o, this.f26457p, this.f26458q, this.f26459r, this.f26460s, this.f26461t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((L0) create((Ph.P) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f26455n != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            String str = this.f26456o;
            String str2 = this.f26457p;
            String str3 = Build.MANUFACTURER + ' ' + Build.MODEL;
            String RELEASE = Build.VERSION.RELEASE;
            Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
            C2438e.b(this.f26461t, new C2446i(str, str2, str3, RELEASE, System.currentTimeMillis(), this.f26458q, this.f26459r, this.f26460s));
        } catch (Exception e10) {
            Logger.f41582a.a("TelemetryClient", "Telemetry send failed (ignored): " + e10.getMessage());
        }
        return Unit.INSTANCE;
    }
}
