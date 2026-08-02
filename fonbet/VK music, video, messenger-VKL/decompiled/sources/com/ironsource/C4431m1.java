package com.ironsource;

import com.ironsource.C4467o1;
import com.ironsource.mediationsdk.IronSource;
import java.util.ArrayList;
import xsna.zcl;

/* renamed from: com.ironsource.m1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4431m1 implements InterfaceC4449n1 {
    private final String a;
    private final String b;
    private final IronSource.a c;
    private final boolean d;
    private final boolean e;
    private final boolean f;

    /* renamed from: com.ironsource.m1$a */
    public static final class a {
        public static final a a = new a();
        public static final int b = 1;
        public static final int c = 1;
        public static final int d = 1;

        private a() {
        }
    }

    public C4431m1(String str, String str2, IronSource.a aVar, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    @Override // com.ironsource.InterfaceC4449n1
    public ArrayList<InterfaceC4485p1> a() {
        ArrayList<InterfaceC4485p1> arrayList = new ArrayList<>();
        arrayList.add(new C4467o1.v(this.a));
        arrayList.add(new C4467o1.x(this.b));
        arrayList.add(new C4467o1.a(this.c));
        if (this.d) {
            arrayList.add(new C4467o1.p(1));
        }
        if (this.e) {
            arrayList.add(new C4467o1.e(1));
        }
        if (this.f) {
            arrayList.add(new C4467o1.o(1));
        }
        return arrayList;
    }

    public /* synthetic */ C4431m1(String str, String str2, IronSource.a aVar, boolean z, boolean z2, boolean z3, int i, zcl zclVar) {
        this(str, str2, aVar, (i & 8) != 0 ? false : z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? true : z3);
    }
}
