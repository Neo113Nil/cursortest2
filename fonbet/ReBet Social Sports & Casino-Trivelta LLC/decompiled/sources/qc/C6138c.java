package qc;

import android.util.Log;
import com.facebook.react.bridge.Promise;

/* renamed from: qc.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6138c {

    /* renamed from: a, reason: collision with root package name */
    public Promise f63454a;

    /* renamed from: b, reason: collision with root package name */
    public String f63455b;

    /* renamed from: c, reason: collision with root package name */
    public final String f63456c;

    public C6138c(String str) {
        this.f63456c = str;
    }

    public String a() {
        return this.f63455b;
    }

    public void b(Exception exc) {
        Promise promise = this.f63454a;
        String str = this.f63455b;
        if (promise == null) {
            Log.e(this.f63456c, "cannot reject promise because it's null");
            return;
        }
        C6136a c6136a = new C6136a(exc, str);
        f();
        promise.reject(c6136a.a(), c6136a.b(), exc);
    }

    public void c(String str) {
        d(this.f63455b, str);
    }

    public void d(String str, String str2) {
        Promise promise = this.f63454a;
        if (promise == null) {
            Log.e(this.f63456c, "cannot reject promise because it's null");
        } else {
            f();
            promise.reject(str, str2);
        }
    }

    public final void e(Promise promise, String str) {
        promise.reject("ASYNC_OP_IN_PROGRESS", "Warning: previous promise did not settle and was overwritten. You've called \"" + str + "\" while \"" + a() + "\" was already in progress and has not completed yet.");
    }

    public final void f() {
        this.f63455b = null;
        this.f63454a = null;
    }

    public void g(Object obj) {
        Promise promise = this.f63454a;
        if (promise == null) {
            Log.e(this.f63456c, "cannot resolve promise because it's null");
        } else {
            f();
            promise.resolve(obj);
        }
    }

    public void h(Promise promise, String str) {
        Promise promise2 = this.f63454a;
        if (promise2 != null) {
            e(promise2, str);
        }
        this.f63454a = promise;
        this.f63455b = str;
    }
}
