package sm0;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import om0.C8754a;
import org.jetbrains.annotations.NotNull;

/* renamed from: sm0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9704a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final tm0.a f98825a;

    public C9704a(@NotNull tm0.a eventDataProvider) {
        Intrinsics.checkNotNullParameter(eventDataProvider, "eventDataProvider");
        this.f98825a = eventDataProvider;
    }

    @NotNull
    public final wm0.a a(@NotNull C8754a clickstreamEvent) {
        Intrinsics.checkNotNullParameter(clickstreamEvent, "clickstreamEvent");
        String c11 = clickstreamEvent.c();
        String e11 = clickstreamEvent.e();
        String d11 = clickstreamEvent.d();
        String f7 = clickstreamEvent.f();
        Set<Map.Entry> entrySet = clickstreamEvent.g().entrySet();
        ArrayList arrayList = new ArrayList(C7714v.z(entrySet, 10));
        for (Map.Entry entry : entrySet) {
            arrayList.add(new wm0.b((String) entry.getKey(), (String) entry.getValue()));
        }
        wm0.a aVar = new wm0.a(c11, e11, d11, f7, arrayList);
        this.f98825a.a(aVar);
        return aVar;
    }
}
