package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.qa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0428qa extends C2 {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0502ta f14509b;

    public C0428qa(int i5) {
        this(i5, null);
    }

    public int b(Object obj) {
        return 0;
    }

    public C0428qa(int i5, InterfaceC0502ta interfaceC0502ta) {
        super(i5);
        this.f14509b = interfaceC0502ta;
    }

    @Override // io.appmetrica.analytics.impl.C2, io.appmetrica.analytics.impl.InterfaceC0502ta
    @NonNull
    public final Mn a(List<Object> list) {
        int i5;
        int i10 = 0;
        if (list == null || (list.size() <= this.f12097a && this.f14509b == null)) {
            i5 = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            i5 = 0;
            int i11 = 0;
            for (Object obj : list) {
                if (i11 < this.f12097a) {
                    InterfaceC0502ta interfaceC0502ta = this.f14509b;
                    if (interfaceC0502ta != null) {
                        Mn a7 = interfaceC0502ta.a(obj);
                        Object obj2 = a7.f12615a;
                        i5 += a7.f12616b.getBytesTruncated();
                        lo.a(obj, a7.f12615a);
                        obj = obj2;
                    }
                    arrayList.add(obj);
                } else {
                    i10++;
                    i5 += b(obj);
                }
                i11++;
            }
            list = arrayList;
        }
        return new Mn(list, new C0347n4(i10, i5));
    }

    public final InterfaceC0502ta b() {
        return this.f14509b;
    }
}
