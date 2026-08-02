package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.kk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0288kk {

    /* renamed from: a, reason: collision with root package name */
    public final C0262jk f14148a;

    /* renamed from: b, reason: collision with root package name */
    public volatile C0651z9 f14149b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C0651z9 f14150c;

    /* renamed from: d, reason: collision with root package name */
    public volatile C0651z9 f14151d;

    /* renamed from: e, reason: collision with root package name */
    public volatile C0651z9 f14152e;

    /* renamed from: f, reason: collision with root package name */
    public volatile C0651z9 f14153f;

    /* renamed from: g, reason: collision with root package name */
    public volatile C0651z9 f14154g;

    /* renamed from: h, reason: collision with root package name */
    public volatile ExecutorC0236ik f14155h;

    public C0288kk() {
        this(new C0262jk());
    }

    public final IHandlerExecutor a() {
        if (this.f14154g == null) {
            synchronized (this) {
                try {
                    if (this.f14154g == null) {
                        this.f14148a.getClass();
                        HandlerThreadC0073cb a7 = C0651z9.a("IAA-SDE");
                        this.f14154g = new C0651z9(a7, a7.getLooper(), new Handler(a7.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f14154g;
    }

    public final IHandlerExecutor b() {
        if (this.f14151d == null) {
            synchronized (this) {
                try {
                    if (this.f14151d == null) {
                        this.f14148a.getClass();
                        HandlerThreadC0073cb a7 = C0651z9.a("IAA-SMH-1");
                        this.f14151d = new C0651z9(a7, a7.getLooper(), new Handler(a7.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f14151d;
    }

    public final IHandlerExecutor c() {
        if (this.f14152e == null) {
            synchronized (this) {
                try {
                    if (this.f14152e == null) {
                        this.f14148a.getClass();
                        HandlerThreadC0073cb a7 = C0651z9.a("IAA-SNTPE");
                        this.f14152e = new C0651z9(a7, a7.getLooper(), new Handler(a7.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f14152e;
    }

    public final IHandlerExecutor d() {
        if (this.f14150c == null) {
            synchronized (this) {
                try {
                    if (this.f14150c == null) {
                        this.f14148a.getClass();
                        HandlerThreadC0073cb a7 = C0651z9.a("IAA-STE");
                        this.f14150c = new C0651z9(a7, a7.getLooper(), new Handler(a7.getLooper()));
                    }
                } finally {
                }
            }
        }
        return this.f14150c;
    }

    public C0288kk(C0262jk c0262jk) {
        new HashMap();
        this.f14148a = c0262jk;
    }
}
