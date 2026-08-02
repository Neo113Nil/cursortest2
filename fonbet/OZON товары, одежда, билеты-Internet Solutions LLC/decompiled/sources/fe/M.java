package fe;

import Od.C3680a;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.d0;

/* loaded from: classes.dex */
public final class M implements InterfaceC6531j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Pd.d f63163a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3680a f63164b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<Sd.b, d0> f63165c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f63166d;

    public M(@NotNull Nd.l proto, @NotNull Pd.d nameResolver, @NotNull C3680a metadataVersion, @NotNull Function1 classSource) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(classSource, "classSource");
        this.f63163a = nameResolver;
        this.f63164b = metadataVersion;
        this.f63165c = classSource;
        List<Nd.b> E11 = proto.E();
        Intrinsics.checkNotNullExpressionValue(E11, "getClass_List(...)");
        List<Nd.b> list = E11;
        int h11 = kotlin.collections.U.h(C7714v.z(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11 < 16 ? 16 : h11);
        for (Object obj : list) {
            linkedHashMap.put(L.a(this.f63163a, ((Nd.b) obj).u0()), obj);
        }
        this.f63166d = linkedHashMap;
    }

    @Override // fe.InterfaceC6531j
    public final C6530i a(@NotNull Sd.b classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        Nd.b bVar = (Nd.b) this.f63166d.get(classId);
        if (bVar == null) {
            return null;
        }
        return new C6530i(this.f63163a, bVar, this.f63164b, (d0) ((C6539s) this.f63165c).invoke(classId));
    }

    @NotNull
    public final Collection<Sd.b> b() {
        return this.f63166d.keySet();
    }
}
