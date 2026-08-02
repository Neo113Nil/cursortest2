package gf0;

import Sc.o;
import gf0.AbstractC6729a;
import hf0.AbstractC6947b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: gf0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6730b<T extends AbstractC6729a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final T f64466a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final HashMap f64467b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final HashMap f64468c;

    public C6730b(@NotNull T destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f64466a = destination;
        HashMap hashMap = new HashMap();
        this.f64467b = hashMap;
        this.f64468c = hashMap;
        for (AbstractC6947b abstractC6947b : destination.b()) {
            if (abstractC6947b instanceof AbstractC6947b.C1067b) {
                HashMap hashMap2 = this.f64467b;
                ((AbstractC6947b.C1067b) abstractC6947b).getClass();
                hashMap2.put(abstractC6947b, null);
            } else {
                if (!(abstractC6947b instanceof AbstractC6947b.a)) {
                    throw new o();
                }
                HashMap hashMap3 = this.f64467b;
                ((AbstractC6947b.a) abstractC6947b).getClass();
                hashMap3.put(abstractC6947b, null);
            }
        }
    }

    public final void a() {
        HashMap hashMap = this.f64467b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((AbstractC6947b) ((Map.Entry) it.next()).getKey()).getClass();
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            if (((Map.Entry) it2.next()).getValue() == null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Iterator it3 = hashMap.entrySet().iterator();
                while (it3.hasNext()) {
                    ((AbstractC6947b) ((Map.Entry) it3.next()).getKey()).getClass();
                }
                ArrayList arrayList = new ArrayList(linkedHashMap2.size());
                Iterator it4 = linkedHashMap2.entrySet().iterator();
                while (it4.hasNext()) {
                    ((AbstractC6947b) ((Map.Entry) it4.next()).getKey()).getClass();
                    arrayList.add(null);
                }
                throw new IllegalStateException(("Не переданы все обязательные аргументы. Экран: " + this.f64466a.e() + ". Ненайденные обязательные аргументы: " + arrayList).toString());
            }
        }
    }

    @NotNull
    public final HashMap b() {
        return this.f64468c;
    }

    @NotNull
    public final T c() {
        return this.f64466a;
    }
}
