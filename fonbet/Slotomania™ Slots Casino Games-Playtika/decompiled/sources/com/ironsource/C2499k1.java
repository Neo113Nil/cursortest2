package com.ironsource;

import com.ironsource.InterfaceC2592p4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.k1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C2499k1 implements InterfaceC2642s1 {
    private final InterfaceC2553n1 a;
    private final B7 b;
    private final Ib<Integer, Integer> c;
    private final InterfaceC2592p4 d;
    private List<InterfaceC2589p1> e;

    public C2499k1(InterfaceC2553n1 eventBaseData, B7 eventsManager, Ib<Integer, Integer> eventsMapper, InterfaceC2592p4 currentTimeProvider) {
        Intrinsics.checkNotNullParameter(eventBaseData, "eventBaseData");
        Intrinsics.checkNotNullParameter(eventsManager, "eventsManager");
        Intrinsics.checkNotNullParameter(eventsMapper, "eventsMapper");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.a = eventBaseData;
        this.b = eventsManager;
        this.c = eventsMapper;
        this.d = currentTimeProvider;
        this.e = new ArrayList();
    }

    public final void a(List<InterfaceC2589p1> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.e = list;
    }

    public final List<InterfaceC2589p1> b() {
        return this.e;
    }

    private final JSONObject b(List<? extends InterfaceC2589p1> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends InterfaceC2589p1> it = list.iterator();
        while (it.hasNext()) {
            it.next().a(linkedHashMap);
        }
        return new JSONObject(linkedHashMap);
    }

    @Override // com.ironsource.InterfaceC2642s1
    public void a(int i, List<InterfaceC2589p1> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "arrayList");
        try {
            Iterator<T> it = this.a.a().iterator();
            while (it.hasNext()) {
                arrayList.add((InterfaceC2589p1) it.next());
            }
            Iterator<InterfaceC2589p1> it2 = this.e.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
            this.b.a(new C2736x5(this.c.a(Integer.valueOf(i)).intValue(), this.d.a(), b(arrayList)));
        } catch (Exception e) {
            C2556n4.d().a(e);
            System.out.println((Object) ("LogRemote | Exception: " + e.getMessage()));
        }
    }

    public /* synthetic */ C2499k1(InterfaceC2553n1 interfaceC2553n1, B7 b7, Ib ib, InterfaceC2592p4 interfaceC2592p4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC2553n1, b7, ib, (i & 8) != 0 ? new InterfaceC2592p4.a() : interfaceC2592p4);
    }

    @Override // com.ironsource.InterfaceC2642s1
    public void a() {
        this.e.clear();
    }

    @Override // com.ironsource.InterfaceC2642s1
    public void a(InterfaceC2589p1... analyticsEventEntity) {
        Intrinsics.checkNotNullParameter(analyticsEventEntity, "analyticsEventEntity");
        for (InterfaceC2589p1 interfaceC2589p1 : analyticsEventEntity) {
            this.e.add(interfaceC2589p1);
        }
    }
}
