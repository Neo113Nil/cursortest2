package io.sentry.instrumentation.file;

import androidx.appcompat.widget.c1;
import io.sentry.b6;
import io.sentry.i1;
import io.sentry.q6;
import io.sentry.t;
import io.sentry.util.l;
import io.sentry.z4;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public long f16494a;

    /* renamed from: b, reason: collision with root package name */
    public Object f16495b;

    /* renamed from: c, reason: collision with root package name */
    public Object f16496c;

    /* renamed from: d, reason: collision with root package name */
    public Object f16497d;

    /* renamed from: e, reason: collision with root package name */
    public Object f16498e = q6.OK;

    /* renamed from: f, reason: collision with root package name */
    public Object f16499f;

    public b(i1 i1Var, File file, b6 b6Var) {
        this.f16495b = i1Var;
        this.f16496c = file;
        this.f16497d = b6Var;
        this.f16499f = new t(b6Var, 2);
        z4.d().a("FileIO");
    }

    public j9.e a() {
        return new j9.e((JSONObject) this.f16495b, (Date) this.f16496c, (JSONArray) this.f16497d, (JSONObject) this.f16498e, this.f16494a, (JSONArray) this.f16499f);
    }

    public void b(Closeable closeable) {
        i1 i1Var = (i1) this.f16495b;
        try {
            try {
                closeable.close();
            } catch (IOException e7) {
                this.f16498e = q6.INTERNAL_ERROR;
                if (i1Var != null) {
                    i1Var.g(e7);
                }
                throw e7;
            }
        } finally {
            c();
        }
    }

    public void c() {
        String n9;
        File file = (File) this.f16496c;
        b6 b6Var = (b6) this.f16497d;
        i1 i1Var = (i1) this.f16495b;
        if (i1Var != null) {
            String a7 = l.a(this.f16494a);
            if (file != null) {
                String a10 = l.a(this.f16494a);
                if (b6Var.isSendDefaultPii()) {
                    n9 = file.getName() + " (" + a10 + ")";
                } else {
                    int lastIndexOf = file.getName().lastIndexOf(46);
                    if (lastIndexOf <= 0 || lastIndexOf >= file.getName().length() - 1) {
                        n9 = c1.n("*** (", a10, ")");
                    } else {
                        n9 = "***" + file.getName().substring(lastIndexOf) + " (" + a10 + ")";
                    }
                }
                i1Var.p(n9);
                if (b6Var.isSendDefaultPii()) {
                    i1Var.m(file.getAbsolutePath(), "file.path");
                }
            } else {
                i1Var.p(a7);
            }
            i1Var.m(Long.valueOf(this.f16494a), "file.size");
            boolean c2 = b6Var.getThreadChecker().c();
            i1Var.m(Boolean.valueOf(c2), "blocked_main_thread");
            if (c2) {
                i1Var.m(((t) this.f16499f).b(), "call_stack");
            }
            i1Var.h((q6) this.f16498e);
        }
    }

    public Object d(a aVar) {
        try {
            Object call = aVar.call();
            if (call instanceof Integer) {
                int intValue = ((Integer) call).intValue();
                if (intValue != -1) {
                    this.f16494a += intValue;
                    return call;
                }
            } else if (call instanceof Long) {
                long longValue = ((Long) call).longValue();
                if (longValue != -1) {
                    this.f16494a += longValue;
                }
            }
            return call;
        } catch (IOException e7) {
            this.f16498e = q6.INTERNAL_ERROR;
            i1 i1Var = (i1) this.f16495b;
            if (i1Var != null) {
                i1Var.g(e7);
            }
            throw e7;
        }
    }
}
