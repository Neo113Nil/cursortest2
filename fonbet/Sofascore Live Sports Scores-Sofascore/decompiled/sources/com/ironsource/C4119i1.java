package com.ironsource;

import com.ironsource.InterfaceC4193m4;
import defpackage.dmi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.i1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4119i1 implements InterfaceC4262q1 {

    @NotNull
    private final InterfaceC4172l1 a;

    @NotNull
    private final InterfaceC4411y7 b;

    @NotNull
    private final Hb<Integer, Integer> c;

    @NotNull
    private final InterfaceC4193m4 d;

    @NotNull
    private List<InterfaceC4208n1> e;

    public C4119i1(@NotNull InterfaceC4172l1 interfaceC4172l1, @NotNull InterfaceC4411y7 interfaceC4411y7, @NotNull Hb<Integer, Integer> hb, @NotNull InterfaceC4193m4 interfaceC4193m4) {
        interfaceC4172l1.getClass();
        interfaceC4411y7.getClass();
        hb.getClass();
        interfaceC4193m4.getClass();
        this.a = interfaceC4172l1;
        this.b = interfaceC4411y7;
        this.c = hb;
        this.d = interfaceC4193m4;
        this.e = new ArrayList();
    }

    private final JSONObject b(List<? extends InterfaceC4208n1> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends InterfaceC4208n1> it = list.iterator();
        while (it.hasNext()) {
            it.next().a(linkedHashMap);
        }
        return new JSONObject(linkedHashMap);
    }

    @Override // com.ironsource.InterfaceC4262q1
    public void a(int i, @NotNull List<InterfaceC4208n1> list) {
        list.getClass();
        try {
            Iterator<T> it = this.a.a().iterator();
            while (it.hasNext()) {
                list.add((InterfaceC4208n1) it.next());
            }
            Iterator<InterfaceC4208n1> it2 = this.e.iterator();
            while (it2.hasNext()) {
                list.add(it2.next());
            }
            this.b.a(new C4355v5(this.c.a(Integer.valueOf(i)).intValue(), this.d.a(), b(list)));
        } catch (Exception e) {
            C4157k4.d().a(e);
            System.out.println((Object) dmi.q("LogRemote | Exception: ", e.getMessage()));
        }
    }

    public /* synthetic */ C4119i1(InterfaceC4172l1 interfaceC4172l1, InterfaceC4411y7 interfaceC4411y7, Hb hb, InterfaceC4193m4 interfaceC4193m4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC4172l1, interfaceC4411y7, hb, (i & 8) != 0 ? new InterfaceC4193m4.a() : interfaceC4193m4);
    }

    @NotNull
    public final List<InterfaceC4208n1> b() {
        return this.e;
    }

    public final void a(@NotNull List<InterfaceC4208n1> list) {
        list.getClass();
        this.e = list;
    }

    @Override // com.ironsource.InterfaceC4262q1
    public void a() {
        this.e.clear();
    }

    @Override // com.ironsource.InterfaceC4262q1
    public void a(@NotNull InterfaceC4208n1... interfaceC4208n1Arr) {
        interfaceC4208n1Arr.getClass();
        for (InterfaceC4208n1 interfaceC4208n1 : interfaceC4208n1Arr) {
            this.e.add(interfaceC4208n1);
        }
    }
}
