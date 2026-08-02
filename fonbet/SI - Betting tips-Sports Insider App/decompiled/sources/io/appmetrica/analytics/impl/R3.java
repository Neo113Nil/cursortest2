package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class R3 {

    /* renamed from: a, reason: collision with root package name */
    public final Q3 f12799a;

    /* renamed from: b, reason: collision with root package name */
    public volatile C0651z9 f12800b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C0651z9 f12801c;

    public R3() {
        this(new Q3());
    }

    public final IHandlerExecutor a() {
        if (this.f12800b == null) {
            synchronized (this) {
                try {
                    if (this.f12800b == null) {
                        this.f12799a.getClass();
                        HandlerThreadC0073cb a7 = C0651z9.a("IAA-CDE");
                        this.f12800b = new C0651z9(a7, a7.getLooper(), new Handler(a7.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f12800b;
    }

    public final ICommonExecutor b() {
        if (this.f12801c == null) {
            synchronized (this) {
                try {
                    if (this.f12801c == null) {
                        this.f12799a.getClass();
                        HandlerThreadC0073cb a7 = C0651z9.a("IAA-CRS");
                        this.f12801c = new C0651z9(a7, a7.getLooper(), new Handler(a7.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f12801c;
    }

    public R3(Q3 q3) {
        this.f12799a = q3;
    }
}
