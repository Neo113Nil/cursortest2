package com.vk.id.network.util;

import We.A;
import We.E;
import We.G;
import We.InterfaceC4865g;
import We.K;
import com.google.android.gms.actions.SearchIntents;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aA\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0006H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LWe/E;", "", "host", "path", "LWe/K;", "requestBody", "", SearchIntents.EXTRA_QUERY, "LWe/g;", "createRequest", "(LWe/E;Ljava/lang/String;Ljava/lang/String;LWe/K;Ljava/util/Map;)LWe/g;", "network_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CreateRequestKt {
    @NotNull
    public static final InterfaceC4865g createRequest(@NotNull E e11, @NotNull String host, @NotNull String path, @NotNull K requestBody, @NotNull Map<String, String> query) {
        Intrinsics.checkNotNullParameter(e11, "<this>");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(requestBody, "requestBody");
        Intrinsics.checkNotNullParameter(query, "query");
        A.f33515l.getClass();
        A.a j11 = A.b.c(host).j();
        for (Map.Entry<String, String> entry : query.entrySet()) {
            j11.d(entry.getKey(), entry.getValue());
        }
        j11.c(path);
        A e12 = j11.e();
        G.a aVar = new G.a();
        aVar.j(e12);
        aVar.g(requestBody);
        return e11.a(aVar.b());
    }

    public static /* synthetic */ InterfaceC4865g createRequest$default(E e11, String str, String str2, K k11, Map map, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            map = U.c();
        }
        return createRequest(e11, str, str2, k11, map);
    }
}
