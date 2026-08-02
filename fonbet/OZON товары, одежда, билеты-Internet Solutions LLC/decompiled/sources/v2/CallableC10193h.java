package v2;

import android.content.Context;
import java.util.concurrent.Callable;
import v2.C10191f;

/* renamed from: v2.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class CallableC10193h implements Callable<C10191f.b> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f101700a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f101701b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C10190e f101702c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f101703d;

    CallableC10193h(String str, Context context, C10190e c10190e, int i11) {
        this.f101700a = str;
        this.f101701b = context;
        this.f101702c = c10190e;
        this.f101703d = i11;
    }

    @Override // java.util.concurrent.Callable
    public final C10191f.b call() throws Exception {
        try {
            return C10191f.a(this.f101700a, this.f101701b, this.f101702c, this.f101703d);
        } catch (Throwable unused) {
            return new C10191f.b(-3);
        }
    }
}
