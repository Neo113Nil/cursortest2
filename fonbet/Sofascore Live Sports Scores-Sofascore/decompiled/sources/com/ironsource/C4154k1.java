package com.ironsource;

import com.ironsource.C4190m1;
import com.ironsource.mediationsdk.IronSource;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.k1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4154k1 implements InterfaceC4172l1 {

    @NotNull
    private final String a;

    @NotNull
    private final String b;

    @NotNull
    private final IronSource.a c;
    private final boolean d;
    private final boolean e;
    private final boolean f;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.k1$a */
    public static final class a {

        @NotNull
        public static final a a = new a();
        public static final int b = 1;
        public static final int c = 1;
        public static final int d = 1;

        private a() {
        }
    }

    public /* synthetic */ C4154k1(String str, String str2, IronSource.a aVar, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, aVar, (i & 8) != 0 ? false : z, (i & 16) != 0 ? true : z2, (i & 32) != 0 ? true : z3);
    }

    @Override // com.ironsource.InterfaceC4172l1
    @NotNull
    public ArrayList<InterfaceC4208n1> a() {
        ArrayList<InterfaceC4208n1> arrayList = new ArrayList<>();
        arrayList.add(new C4190m1.v(this.a));
        arrayList.add(new C4190m1.x(this.b));
        arrayList.add(new C4190m1.a(this.c));
        if (this.d) {
            arrayList.add(new C4190m1.p(1));
        }
        if (this.e) {
            arrayList.add(new C4190m1.e(1));
        }
        if (this.f) {
            arrayList.add(new C4190m1.o(1));
        }
        return arrayList;
    }

    public C4154k1(@NotNull String str, @NotNull String str2, @NotNull IronSource.a aVar, boolean z, boolean z2, boolean z3) {
        str.getClass();
        str2.getClass();
        aVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = aVar;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }
}
