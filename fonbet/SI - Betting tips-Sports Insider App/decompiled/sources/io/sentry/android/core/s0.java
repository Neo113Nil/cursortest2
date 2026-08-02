package io.sentry.android.core;

import android.os.FileObserver;
import io.sentry.ILogger;
import io.sentry.b5;
import io.sentry.c3;
import java.io.File;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class s0 extends FileObserver {

    /* renamed from: a, reason: collision with root package name */
    public final String f15838a;

    /* renamed from: b, reason: collision with root package name */
    public final c3 f15839b;

    /* renamed from: c, reason: collision with root package name */
    public final ILogger f15840c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15841d;

    public s0(String str, c3 c3Var, ILogger iLogger, long j) {
        super(str);
        this.f15838a = str;
        this.f15839b = c3Var;
        y4.a.C(iLogger, "Logger is required.");
        this.f15840c = iLogger;
        this.f15841d = j;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i5, String str) {
        if (str == null || i5 != 8) {
            return;
        }
        b5 b5Var = b5.DEBUG;
        String str2 = this.f15838a;
        Object[] objArr = {Integer.valueOf(i5), str2, str};
        ILogger iLogger = this.f15840c;
        iLogger.h(b5Var, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s.", objArr);
        io.sentry.h0 k6 = k2.x.k(new r0(this.f15841d, iLogger));
        StringBuilder b10 = v.f.b(str2);
        b10.append(File.separator);
        b10.append(str);
        String sb2 = b10.toString();
        c3 c3Var = this.f15839b;
        c3Var.getClass();
        y4.a.C(sb2, "Path is required.");
        c3Var.b(new File(sb2), k6);
    }
}
