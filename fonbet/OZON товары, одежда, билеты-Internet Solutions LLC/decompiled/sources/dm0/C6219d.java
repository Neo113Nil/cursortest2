package dm0;

import Sc.r;
import com.vk.push.core.base.AidlResult;
import com.vk.push.core.push.RegisterForPushesResult;
import em0.C6382a;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: dm0.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6219d extends AbstractC7737t implements Function2<AidlResult<?>, Za.a, r<? extends C6382a>> {

    /* renamed from: b, reason: collision with root package name */
    public static final C6219d f61672b = new C6219d(2);

    @Override // kotlin.jvm.functions.Function2
    public final r<? extends C6382a> invoke(AidlResult<?> aidlResult, Za.a aVar) {
        AidlResult<?> result = aidlResult;
        Za.a host = aVar;
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(host, "host");
        Object b11 = result.b();
        Intrinsics.g(b11, "null cannot be cast to non-null type com.vk.push.core.push.RegisterForPushesResult");
        r.Companion companion = r.INSTANCE;
        return r.a(new C6382a((RegisterForPushesResult) b11, host));
    }
}
