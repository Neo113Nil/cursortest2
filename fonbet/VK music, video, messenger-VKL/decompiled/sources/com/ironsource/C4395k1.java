package com.ironsource;

import com.ironsource.InterfaceC4488p4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;
import xsna.go9;
import xsna.zcl;

/* renamed from: com.ironsource.k1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4395k1 implements InterfaceC4538s1 {
    private final InterfaceC4449n1 a;
    private final C7 b;
    private final Jb<Integer, Integer> c;
    private final InterfaceC4488p4 d;
    private List<InterfaceC4485p1> e;

    public C4395k1(InterfaceC4449n1 interfaceC4449n1, C7 c7, Jb<Integer, Integer> jb, InterfaceC4488p4 interfaceC4488p4) {
        this.a = interfaceC4449n1;
        this.b = c7;
        this.c = jb;
        this.d = interfaceC4488p4;
        this.e = new ArrayList();
    }

    public final void a(List<InterfaceC4485p1> list) {
        this.e = list;
    }

    public final List<InterfaceC4485p1> b() {
        return this.e;
    }

    private final JSONObject b(List<? extends InterfaceC4485p1> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends InterfaceC4485p1> it = list.iterator();
        while (it.hasNext()) {
            it.next().a(linkedHashMap);
        }
        return new JSONObject(linkedHashMap);
    }

    @Override // com.ironsource.InterfaceC4538s1
    public void a(int i, List<InterfaceC4485p1> list) {
        try {
            Iterator<T> it = this.a.a().iterator();
            while (it.hasNext()) {
                list.add((InterfaceC4485p1) it.next());
            }
            Iterator<InterfaceC4485p1> it2 = this.e.iterator();
            while (it2.hasNext()) {
                list.add(it2.next());
            }
            this.b.a(new C4632x5(this.c.a(Integer.valueOf(i)).intValue(), this.d.a(), b(list)));
        } catch (Exception e) {
            C4452n4.d().a(e);
            System.out.println((Object) go9.b("LogRemote | Exception: ", e.getMessage()));
        }
    }

    public /* synthetic */ C4395k1(InterfaceC4449n1 interfaceC4449n1, C7 c7, Jb jb, InterfaceC4488p4 interfaceC4488p4, int i, zcl zclVar) {
        this(interfaceC4449n1, c7, jb, (i & 8) != 0 ? new InterfaceC4488p4.a() : interfaceC4488p4);
    }

    @Override // com.ironsource.InterfaceC4538s1
    public void a() {
        this.e.clear();
    }

    @Override // com.ironsource.InterfaceC4538s1
    public void a(InterfaceC4485p1... interfaceC4485p1Arr) {
        for (InterfaceC4485p1 interfaceC4485p1 : interfaceC4485p1Arr) {
            this.e.add(interfaceC4485p1);
        }
    }
}
