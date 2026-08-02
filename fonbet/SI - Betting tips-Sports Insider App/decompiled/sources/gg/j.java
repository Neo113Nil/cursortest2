package gg;

import io.appmetrica.analytics.AppMetricaDefaultValues;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final p f10074a = new p(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f10075b = jg.h.j(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");

    /* renamed from: c, reason: collision with root package name */
    public static final int f10076c = jg.h.j(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");

    /* renamed from: d, reason: collision with root package name */
    public static final com.android.billingclient.api.a f10077d = new com.android.billingclient.api.a("BUFFERED", 9);

    /* renamed from: e, reason: collision with root package name */
    public static final com.android.billingclient.api.a f10078e = new com.android.billingclient.api.a("SHOULD_BUFFER", 9);

    /* renamed from: f, reason: collision with root package name */
    public static final com.android.billingclient.api.a f10079f = new com.android.billingclient.api.a("S_RESUMING_BY_RCV", 9);

    /* renamed from: g, reason: collision with root package name */
    public static final com.android.billingclient.api.a f10080g = new com.android.billingclient.api.a("RESUMING_BY_EB", 9);

    /* renamed from: h, reason: collision with root package name */
    public static final com.android.billingclient.api.a f10081h = new com.android.billingclient.api.a("POISONED", 9);

    /* renamed from: i, reason: collision with root package name */
    public static final com.android.billingclient.api.a f10082i = new com.android.billingclient.api.a("DONE_RCV", 9);
    public static final com.android.billingclient.api.a j = new com.android.billingclient.api.a("INTERRUPTED_SEND", 9);

    /* renamed from: k, reason: collision with root package name */
    public static final com.android.billingclient.api.a f10083k = new com.android.billingclient.api.a("INTERRUPTED_RCV", 9);

    /* renamed from: l, reason: collision with root package name */
    public static final com.android.billingclient.api.a f10084l = new com.android.billingclient.api.a("CHANNEL_CLOSED", 9);

    /* renamed from: m, reason: collision with root package name */
    public static final com.android.billingclient.api.a f10085m = new com.android.billingclient.api.a("SUSPEND", 9);

    /* renamed from: n, reason: collision with root package name */
    public static final com.android.billingclient.api.a f10086n = new com.android.billingclient.api.a("SUSPEND_NO_WAITER", 9);

    /* renamed from: o, reason: collision with root package name */
    public static final com.android.billingclient.api.a f10087o = new com.android.billingclient.api.a("FAILED", 9);

    /* renamed from: p, reason: collision with root package name */
    public static final com.android.billingclient.api.a f10088p = new com.android.billingclient.api.a("NO_RECEIVE_RESULT", 9);
    public static final com.android.billingclient.api.a q = new com.android.billingclient.api.a("CLOSE_HANDLER_CLOSED", 9);

    /* renamed from: r, reason: collision with root package name */
    public static final com.android.billingclient.api.a f10089r = new com.android.billingclient.api.a("CLOSE_HANDLER_INVOKED", 9);

    /* renamed from: s, reason: collision with root package name */
    public static final com.android.billingclient.api.a f10090s = new com.android.billingclient.api.a("NO_CLOSE_CAUSE", 9);

    public static final boolean a(eg.j jVar, Object obj, vf.a aVar) {
        com.android.billingclient.api.a f6 = jVar.f(obj, aVar);
        if (f6 == null) {
            return false;
        }
        jVar.i(f6);
        return true;
    }
}
