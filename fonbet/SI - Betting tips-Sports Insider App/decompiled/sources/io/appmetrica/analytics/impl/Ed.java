package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.util.Map;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Ed implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Dd f12195a = new Dd();

    /* renamed from: b, reason: collision with root package name */
    public static final Map f12196b = kotlin.collections.n0.e(new Pair(NativeCrashSource.UNKNOWN, 0), new Pair(NativeCrashSource.CRASHPAD, 3));

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final V5 fromModel(@NotNull Kd kd2) {
        V5 v5 = new V5();
        v5.f13025f = 1;
        U5 u52 = new U5();
        u52.f12957a = kd2.f12472a;
        Y5 y5 = new Y5();
        Integer num = (Integer) f12196b.get(kd2.f12473b.f12309a);
        if (num != null) {
            y5.f13209a = num.intValue();
        }
        String str = kd2.f12473b.f12310b;
        if (str == null) {
            str = "";
        }
        y5.f13210b = str;
        u52.f12958b = y5;
        v5.f13026g = u52;
        return v5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    @NotNull
    public final Kd a(@NotNull V5 v5) {
        throw new UnsupportedOperationException();
    }
}
