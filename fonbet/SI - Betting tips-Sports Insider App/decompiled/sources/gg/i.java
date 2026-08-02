package gg;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i extends FunctionReferenceImpl implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final i f10073a = new i(2, j.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long longValue = ((Number) obj).longValue();
        p pVar = (p) obj2;
        p pVar2 = j.f10074a;
        h hVar = pVar.f10096e;
        Intrinsics.checkNotNull(hVar);
        return new p(longValue, pVar, hVar, 0);
    }
}
