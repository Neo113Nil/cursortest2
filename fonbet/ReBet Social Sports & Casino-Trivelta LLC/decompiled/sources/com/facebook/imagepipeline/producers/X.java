package com.facebook.imagepipeline.producers;

import java.io.InputStream;
import java.util.Map;

/* loaded from: classes2.dex */
public interface X {

    public interface a {
        void a();

        void b(InputStream inputStream, int i10);

        void onFailure(Throwable th2);
    }

    C createFetchState(InterfaceC3030n interfaceC3030n, e0 e0Var);

    void fetch(C c10, a aVar);

    Map getExtraMap(C c10, int i10);

    void onFetchCompletion(C c10, int i10);

    boolean shouldPropagate(C c10);
}
