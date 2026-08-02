package ru.ozon.android.messenger.framework.data.requests;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class i extends e {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f88669c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f88670d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Map<String, Object> f88671e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@NotNull Uri deeplink, @NotNull Map<String, String> additionalParams) {
        super(d.START_OR_GET_CHAT, null, 6);
        Map<String, String> a11;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(additionalParams, "additionalParams");
        if (deeplink == null) {
            a11 = U.c();
        } else {
            Set<String> queryParameterNames = deeplink.getQueryParameterNames();
            List U02 = queryParameterNames != null ? C7714v.U0(queryParameterNames) : null;
            List list = U02 == null ? K.f71697a : U02;
            int h11 = U.h(C7714v.z(list, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(h11 < 16 ? 16 : h11);
            for (Object obj : list) {
                linkedHashMap.put(obj, deeplink.getQueryParameter((String) obj));
            }
            a11 = ru.ozon.android.messenger.utils.b.a(linkedHashMap);
        }
        this.f88669c = a11;
        additionalParams = additionalParams.isEmpty() ? a11 : additionalParams;
        this.f88670d = additionalParams;
        this.f88671e = U.i(new Pair("params", additionalParams));
    }

    @Override // ru.ozon.android.messenger.framework.data.requests.e
    @NotNull
    public final Map<String, Object> b() {
        return this.f88671e;
    }
}
