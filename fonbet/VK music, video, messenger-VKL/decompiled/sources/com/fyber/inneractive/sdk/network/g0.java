package com.fyber.inneractive.sdk.network;

import java.util.List;
import okhttp3.Protocol;

/* loaded from: classes12.dex */
public final class g0 {
    public static final g0 c = new g0();
    public final k a = new k();
    public p1 b;

    public final h a() {
        String str;
        if (this.b == null) {
            try {
                str = System.getProperty("fyber.marketplace.http_executor_stack_name");
            } catch (Throwable unused) {
                str = "hurl";
            }
            if (str != null && str.equals("okhttp")) {
                try {
                    List<Protocol> list = okhttp3.o.D;
                    this.b = new p1();
                } catch (ClassNotFoundException unused2) {
                }
            }
        }
        p1 p1Var = this.b;
        return p1Var != null ? p1Var : this.a;
    }
}
