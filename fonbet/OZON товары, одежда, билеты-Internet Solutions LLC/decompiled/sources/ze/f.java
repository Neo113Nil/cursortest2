package ze;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;

/* loaded from: classes.dex */
final /* synthetic */ class f extends C7735q implements Function2<Long, m<Object>, m<Object>> {

    /* renamed from: a, reason: collision with root package name */
    public static final f f108923a = new f(2, g.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);

    @Override // kotlin.jvm.functions.Function2
    public final m<Object> invoke(Long l11, m<Object> mVar) {
        long longValue = l11.longValue();
        m<Object> mVar2 = mVar;
        int i11 = g.f108925b;
        return new m<>(longValue, mVar2, mVar2.r(), 0);
    }
}
