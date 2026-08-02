package Vj;

import Ej.q;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;

/* loaded from: classes5.dex */
public final class a {
    public final h a(q talkRestServiceProvider) {
        Retrofit retrofit;
        Intrinsics.checkNotNullParameter(talkRestServiceProvider, "talkRestServiceProvider");
        retrofit = talkRestServiceProvider.f3205b;
        Object create = retrofit.create(h.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return (h) create;
    }
}
