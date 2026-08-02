package hb;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final f f10480a;

    /* renamed from: b, reason: collision with root package name */
    public final d f10481b;

    public g(f eventsDao, d eventPushMetricsDao) {
        Intrinsics.checkNotNullParameter(eventsDao, "eventsDao");
        Intrinsics.checkNotNullParameter(eventPushMetricsDao, "eventPushMetricsDao");
        this.f10480a = eventsDao;
        this.f10481b = eventPushMetricsDao;
    }
}
