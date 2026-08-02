package qd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import je.H0;
import je.N;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.InterfaceC9820K;
import td.InterfaceC9842h;
import td.InterfaceC9845k;

/* loaded from: classes10.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Set<Sd.f> f81928a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final Set<Sd.f> f81929b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final HashMap<Sd.b, Sd.b> f81930c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final HashMap<Sd.b, Sd.b> f81931d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final LinkedHashSet f81932e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f81933f = 0;

    static {
        v[] values = v.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (v vVar : values) {
            arrayList.add(vVar.d());
        }
        f81928a = C7714v.Y0(arrayList);
        u[] values2 = u.values();
        ArrayList arrayList2 = new ArrayList(values2.length);
        for (u uVar : values2) {
            arrayList2.add(uVar.a());
        }
        f81929b = C7714v.Y0(arrayList2);
        f81930c = new HashMap<>();
        f81931d = new HashMap<>();
        U.f(new Pair(u.UBYTEARRAY, Sd.f.f("ubyteArrayOf")), new Pair(u.USHORTARRAY, Sd.f.f("ushortArrayOf")), new Pair(u.UINTARRAY, Sd.f.f("uintArrayOf")), new Pair(u.ULONGARRAY, Sd.f.f("ulongArrayOf")));
        v[] values3 = v.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (v vVar2 : values3) {
            linkedHashSet.add(vVar2.a().h());
        }
        f81932e = linkedHashSet;
        for (v vVar3 : v.values()) {
            f81930c.put(vVar3.a(), vVar3.b());
            f81931d.put(vVar3.b(), vVar3.a());
        }
    }

    public static Sd.b a(@NotNull Sd.b arrayClassId) {
        Intrinsics.checkNotNullParameter(arrayClassId, "arrayClassId");
        return f81930c.get(arrayClassId);
    }

    public static boolean b(@NotNull Sd.f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return f81932e.contains(name);
    }

    public static final boolean c(@NotNull N type) {
        InterfaceC9842h descriptor;
        Intrinsics.checkNotNullParameter(type, "type");
        if (H0.q(type) || (descriptor = type.H0().p()) == null) {
            return false;
        }
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        InterfaceC9845k d11 = descriptor.d();
        return (d11 instanceof InterfaceC9820K) && Intrinsics.d(((InterfaceC9820K) d11).c(), s.f81865l) && f81928a.contains(descriptor.getName());
    }
}
