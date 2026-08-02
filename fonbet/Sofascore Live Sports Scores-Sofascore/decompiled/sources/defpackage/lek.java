package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h(with = pek.class)
/* loaded from: classes6.dex */
public final class lek implements Serializable {

    @NotNull
    public static final jek Companion = new jek();
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final boolean e;
    public final String f;
    public final o8k g;
    public final o8k h;
    public final mqi i;
    public final mqi j;
    public final mqi k;
    public final mqi l;
    public final mqi m;

    public lek(o8k o8kVar, String str, int i, ArrayList arrayList, t8e t8eVar, String str2, String str3, String str4, boolean z, String str5) {
        t8eVar.getClass();
        str2.getClass();
        this.a = str;
        this.b = i;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = str5;
        if (i < 0 || i >= 65536) {
            ogj.h(ljg.j(i, "Port must be between 0 and 65535, or 0 if not set. Provided: "));
            throw null;
        }
        final int i2 = 1;
        ypa.b(new f6h(arrayList, i2));
        this.g = o8kVar;
        this.h = o8kVar == null ? o8k.c : o8kVar;
        this.i = ypa.b(new fej(9, arrayList, this));
        final int i3 = 0;
        this.j = ypa.b(new Function0(this) { // from class: iek
            public final /* synthetic */ lek b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int y;
                int i4 = i3;
                lek lekVar = this.b;
                switch (i4) {
                    case 0:
                        String str6 = lekVar.f;
                        int O = StringsKt.O(str6, '?', 0, 6) + 1;
                        if (O == 0) {
                            return "";
                        }
                        int O2 = StringsKt.O(str6, '#', O, 4);
                        return O2 == -1 ? str6.substring(O) : str6.substring(O, O2);
                    case 1:
                        String str7 = lekVar.f;
                        int O3 = StringsKt.O(str7, '/', lekVar.h.a.length() + 3, 4);
                        if (O3 == -1) {
                            return "";
                        }
                        int O4 = StringsKt.O(str7, '#', O3, 4);
                        return O4 == -1 ? str7.substring(O3) : str7.substring(O3, O4);
                    case 2:
                        String str8 = lekVar.f;
                        String str9 = lekVar.c;
                        if (str9 == null) {
                            return null;
                        }
                        if (str9.length() == 0) {
                            return "";
                        }
                        int length = lekVar.h.a.length() + 3;
                        y = StringsKt__StringsKt.y(str8, new char[]{':', '@'}, length, false);
                        return str8.substring(length, y);
                    case 3:
                        String str10 = lekVar.f;
                        String str11 = lekVar.d;
                        if (str11 == null) {
                            return null;
                        }
                        return str11.length() == 0 ? "" : str10.substring(StringsKt.O(str10, ':', lekVar.h.a.length() + 3, 4) + 1, StringsKt.O(str10, '@', 0, 6));
                    default:
                        String str12 = lekVar.f;
                        int O5 = StringsKt.O(str12, '#', 0, 6) + 1;
                        return O5 == 0 ? "" : str12.substring(O5);
                }
            }
        });
        ypa.b(new Function0(this) { // from class: iek
            public final /* synthetic */ lek b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int y;
                int i4 = i2;
                lek lekVar = this.b;
                switch (i4) {
                    case 0:
                        String str6 = lekVar.f;
                        int O = StringsKt.O(str6, '?', 0, 6) + 1;
                        if (O == 0) {
                            return "";
                        }
                        int O2 = StringsKt.O(str6, '#', O, 4);
                        return O2 == -1 ? str6.substring(O) : str6.substring(O, O2);
                    case 1:
                        String str7 = lekVar.f;
                        int O3 = StringsKt.O(str7, '/', lekVar.h.a.length() + 3, 4);
                        if (O3 == -1) {
                            return "";
                        }
                        int O4 = StringsKt.O(str7, '#', O3, 4);
                        return O4 == -1 ? str7.substring(O3) : str7.substring(O3, O4);
                    case 2:
                        String str8 = lekVar.f;
                        String str9 = lekVar.c;
                        if (str9 == null) {
                            return null;
                        }
                        if (str9.length() == 0) {
                            return "";
                        }
                        int length = lekVar.h.a.length() + 3;
                        y = StringsKt__StringsKt.y(str8, new char[]{':', '@'}, length, false);
                        return str8.substring(length, y);
                    case 3:
                        String str10 = lekVar.f;
                        String str11 = lekVar.d;
                        if (str11 == null) {
                            return null;
                        }
                        return str11.length() == 0 ? "" : str10.substring(StringsKt.O(str10, ':', lekVar.h.a.length() + 3, 4) + 1, StringsKt.O(str10, '@', 0, 6));
                    default:
                        String str12 = lekVar.f;
                        int O5 = StringsKt.O(str12, '#', 0, 6) + 1;
                        return O5 == 0 ? "" : str12.substring(O5);
                }
            }
        });
        final int i4 = 2;
        this.k = ypa.b(new Function0(this) { // from class: iek
            public final /* synthetic */ lek b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int y;
                int i42 = i4;
                lek lekVar = this.b;
                switch (i42) {
                    case 0:
                        String str6 = lekVar.f;
                        int O = StringsKt.O(str6, '?', 0, 6) + 1;
                        if (O == 0) {
                            return "";
                        }
                        int O2 = StringsKt.O(str6, '#', O, 4);
                        return O2 == -1 ? str6.substring(O) : str6.substring(O, O2);
                    case 1:
                        String str7 = lekVar.f;
                        int O3 = StringsKt.O(str7, '/', lekVar.h.a.length() + 3, 4);
                        if (O3 == -1) {
                            return "";
                        }
                        int O4 = StringsKt.O(str7, '#', O3, 4);
                        return O4 == -1 ? str7.substring(O3) : str7.substring(O3, O4);
                    case 2:
                        String str8 = lekVar.f;
                        String str9 = lekVar.c;
                        if (str9 == null) {
                            return null;
                        }
                        if (str9.length() == 0) {
                            return "";
                        }
                        int length = lekVar.h.a.length() + 3;
                        y = StringsKt__StringsKt.y(str8, new char[]{':', '@'}, length, false);
                        return str8.substring(length, y);
                    case 3:
                        String str10 = lekVar.f;
                        String str11 = lekVar.d;
                        if (str11 == null) {
                            return null;
                        }
                        return str11.length() == 0 ? "" : str10.substring(StringsKt.O(str10, ':', lekVar.h.a.length() + 3, 4) + 1, StringsKt.O(str10, '@', 0, 6));
                    default:
                        String str12 = lekVar.f;
                        int O5 = StringsKt.O(str12, '#', 0, 6) + 1;
                        return O5 == 0 ? "" : str12.substring(O5);
                }
            }
        });
        final int i5 = 3;
        this.l = ypa.b(new Function0(this) { // from class: iek
            public final /* synthetic */ lek b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int y;
                int i42 = i5;
                lek lekVar = this.b;
                switch (i42) {
                    case 0:
                        String str6 = lekVar.f;
                        int O = StringsKt.O(str6, '?', 0, 6) + 1;
                        if (O == 0) {
                            return "";
                        }
                        int O2 = StringsKt.O(str6, '#', O, 4);
                        return O2 == -1 ? str6.substring(O) : str6.substring(O, O2);
                    case 1:
                        String str7 = lekVar.f;
                        int O3 = StringsKt.O(str7, '/', lekVar.h.a.length() + 3, 4);
                        if (O3 == -1) {
                            return "";
                        }
                        int O4 = StringsKt.O(str7, '#', O3, 4);
                        return O4 == -1 ? str7.substring(O3) : str7.substring(O3, O4);
                    case 2:
                        String str8 = lekVar.f;
                        String str9 = lekVar.c;
                        if (str9 == null) {
                            return null;
                        }
                        if (str9.length() == 0) {
                            return "";
                        }
                        int length = lekVar.h.a.length() + 3;
                        y = StringsKt__StringsKt.y(str8, new char[]{':', '@'}, length, false);
                        return str8.substring(length, y);
                    case 3:
                        String str10 = lekVar.f;
                        String str11 = lekVar.d;
                        if (str11 == null) {
                            return null;
                        }
                        return str11.length() == 0 ? "" : str10.substring(StringsKt.O(str10, ':', lekVar.h.a.length() + 3, 4) + 1, StringsKt.O(str10, '@', 0, 6));
                    default:
                        String str12 = lekVar.f;
                        int O5 = StringsKt.O(str12, '#', 0, 6) + 1;
                        return O5 == 0 ? "" : str12.substring(O5);
                }
            }
        });
        final int i6 = 4;
        this.m = ypa.b(new Function0(this) { // from class: iek
            public final /* synthetic */ lek b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int y;
                int i42 = i6;
                lek lekVar = this.b;
                switch (i42) {
                    case 0:
                        String str6 = lekVar.f;
                        int O = StringsKt.O(str6, '?', 0, 6) + 1;
                        if (O == 0) {
                            return "";
                        }
                        int O2 = StringsKt.O(str6, '#', O, 4);
                        return O2 == -1 ? str6.substring(O) : str6.substring(O, O2);
                    case 1:
                        String str7 = lekVar.f;
                        int O3 = StringsKt.O(str7, '/', lekVar.h.a.length() + 3, 4);
                        if (O3 == -1) {
                            return "";
                        }
                        int O4 = StringsKt.O(str7, '#', O3, 4);
                        return O4 == -1 ? str7.substring(O3) : str7.substring(O3, O4);
                    case 2:
                        String str8 = lekVar.f;
                        String str9 = lekVar.c;
                        if (str9 == null) {
                            return null;
                        }
                        if (str9.length() == 0) {
                            return "";
                        }
                        int length = lekVar.h.a.length() + 3;
                        y = StringsKt__StringsKt.y(str8, new char[]{':', '@'}, length, false);
                        return str8.substring(length, y);
                    case 3:
                        String str10 = lekVar.f;
                        String str11 = lekVar.d;
                        if (str11 == null) {
                            return null;
                        }
                        return str11.length() == 0 ? "" : str10.substring(StringsKt.O(str10, ':', lekVar.h.a.length() + 3, 4) + 1, StringsKt.O(str10, '@', 0, 6));
                    default:
                        String str12 = lekVar.f;
                        int O5 = StringsKt.O(str12, '#', 0, 6) + 1;
                        return O5 == 0 ? "" : str12.substring(O5);
                }
            }
        });
    }

    private final Object writeReplace() {
        pq4 pq4Var = new pq4();
        pq4Var.a = nek.a;
        pq4Var.b = this;
        return pq4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lek.class != obj.getClass()) {
            return false;
        }
        return this.f.equals(((lek) obj).f);
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String toString() {
        return this.f;
    }
}
