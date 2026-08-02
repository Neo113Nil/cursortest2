package com.mbridge.msdk.config.component.common.express.operator.parts;

import com.mbridge.msdk.config.component.common.express.d;
import com.mbridge.msdk.config.component.common.express.e;
import java.util.concurrent.Callable;

/* compiled from: HighLevelFutureCallable.java */
/* loaded from: classes13.dex */
public class b implements Callable {
    private d a;
    private e b;
    private com.mbridge.msdk.config.component.common.express.node.d c;
    private com.mbridge.msdk.config.dynamic.binddata.wrapper.a d;

    public b(d dVar, e eVar, com.mbridge.msdk.config.component.common.express.node.d dVar2, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        this.c = dVar2;
        this.a = dVar;
        this.b = eVar;
        this.d = aVar;
    }

    public void a(Object obj) {
        this.d.a("this", obj);
    }

    @Override // java.util.concurrent.Callable
    public Object call() throws Exception {
        return this.c.a(this.a, this.b, this.d);
    }
}
