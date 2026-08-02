package com.google.firebase.messaging;

import android.os.Build;
import com.google.android.gms.tasks.Task;
import io.sentry.b5;
import io.sentry.u3;
import io.sentry.z0;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class q implements w7.f, com.google.gson.internal.l, u3, io.sentry.util.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6165a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f6166b;

    public /* synthetic */ q(io.sentry.protocol.v vVar, String str) {
        this.f6165a = 8;
        this.f6166b = str;
    }

    @Override // io.sentry.util.e
    public Object b() {
        int i5 = this.f6165a;
        String str = this.f6166b;
        switch (i5) {
            case 6:
                return str;
            default:
                Charset charset = io.sentry.util.l.f17171a;
                if (str.equals("0000-0000")) {
                    str = "00000000-0000-0000-0000-000000000000";
                }
                return str.replace("-", "");
        }
    }

    @Override // com.google.gson.internal.l
    public Object d() {
        switch (this.f6165a) {
            case 2:
                throw new com.google.gson.m(this.f6166b);
            case 3:
                throw new com.google.gson.m(this.f6166b);
            default:
                throw new com.google.gson.m(this.f6166b);
        }
    }

    @Override // w7.f
    public Task e(Object obj) {
        int i5 = this.f6165a;
        String str = this.f6166b;
        e0 e0Var = (e0) obj;
        switch (i5) {
            case 0:
                h9.c cVar = FirebaseMessaging.f6059l;
                e0Var.getClass();
                w7.m g10 = e0Var.g(new b0("S", str));
                e0Var.i();
                return g10;
            default:
                h9.c cVar2 = FirebaseMessaging.f6059l;
                e0Var.getClass();
                w7.m g11 = e0Var.g(new b0("U", str));
                e0Var.i();
                return g11;
        }
    }

    @Override // io.sentry.u3
    public void g(z0 scope) {
        switch (this.f6165a) {
            case 5:
                Intrinsics.checkNotNullParameter(scope, "scope");
                scope.f("logrocket_session", this.f6166b);
                break;
            case 6:
            case 8:
            default:
                String str = this.f6166b;
                if (str != null) {
                    scope.f("catch_fun", str);
                }
                Intrinsics.checkNotNull(scope);
                if (Build.VERSION.SDK_INT >= 25) {
                    try {
                        com.logrocket.core.e0.b(new io.sentry.util.m(scope));
                    } catch (Exception unused) {
                    }
                }
                scope.r(b5.INFO);
                break;
            case 7:
                scope.A(this.f6166b);
                break;
            case 9:
                String str2 = this.f6166b;
                if (str2 != null) {
                    scope.f("coroutineName", str2);
                }
                scope.r(b5.INFO);
                break;
        }
    }

    public /* synthetic */ q(String str, int i5) {
        this.f6165a = i5;
        this.f6166b = str;
    }
}
