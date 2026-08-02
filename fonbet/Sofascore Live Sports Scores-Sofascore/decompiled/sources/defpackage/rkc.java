package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class rkc extends v5h {
    public final List a;
    public final String b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rkc(String str, ArrayList arrayList) {
        this(r0, null, arrayList, str);
        String str2;
        str.getClass();
        if (arrayList.size() == 1) {
            str2 = fc6.o(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", str, "', but it was missing");
        } else {
            str2 = "Fields " + arrayList + " are required for type with serial name '" + str + "', but they were missing";
        }
    }

    public rkc(String str, rkc rkcVar, List list, String str2) {
        super(str, rkcVar);
        this.a = list;
        this.b = str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public rkc(String str, String str2) {
        this(bf3.k("Field '", str, "' is required for type with serial name '", str2, "', but it was missing"), null, a.c(str), str2);
        str2.getClass();
    }
}
