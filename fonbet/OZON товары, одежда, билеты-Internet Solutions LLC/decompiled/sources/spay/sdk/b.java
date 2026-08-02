package spay.sdk;

import Sc.s;
import Ve.C4311hq;
import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import xe.M;

/* loaded from: classes4.dex */
public final class b extends j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f98844a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f98845b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f98846c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, Function1 function1, d dVar, kotlin.coroutines.d dVar2) {
        super(2, dVar2);
        this.f98844a = context;
        this.f98845b = function1;
        this.f98846c = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new b(this.f98844a, this.f98845b, this.f98846c, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        SPaySdkApp companion = SPaySdkApp.INSTANCE.getInstance();
        Context context = this.f98844a;
        companion.reInitialize$SPaySDK_baseRelease(context, new C4311hq(this.f98845b, this.f98846c, context));
        return Unit.f71690a;
    }
}
