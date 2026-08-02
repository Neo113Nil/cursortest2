package U1;

import b1.C2333B;
import b1.C2334C;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b implements C2334C.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f12004a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12005b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12006c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12007d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f12008e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12009f;

    public b(int i10, String str, String str2, String str3, boolean z10, int i11) {
        AbstractC4134a.a(i11 == -1 || i11 > 0);
        this.f12004a = i10;
        this.f12005b = str;
        this.f12006c = str2;
        this.f12007d = str3;
        this.f12008e = z10;
        this.f12009f = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static b d(Map map) {
        boolean z10;
        int i10;
        List list;
        b bVar;
        List list2;
        String str;
        List list3;
        String str2;
        List list4;
        boolean z11;
        List list5;
        int i11;
        List list6 = (List) map.get("icy-br");
        boolean z12 = true;
        int i12 = -1;
        if (list6 != null) {
            String str3 = (String) list6.get(0);
            try {
                i11 = Integer.parseInt(str3) * 1000;
                if (i11 > 0) {
                    z10 = true;
                } else {
                    try {
                        AbstractC4156x.i("IcyHeaders", "Invalid bitrate: " + str3);
                        z10 = false;
                        i11 = -1;
                    } catch (NumberFormatException unused) {
                        AbstractC4156x.i("IcyHeaders", "Invalid bitrate header: " + str3);
                        z10 = false;
                        i10 = i11;
                        list = (List) map.get("icy-genre");
                        String str4 = null;
                        if (list == null) {
                        }
                        list2 = (List) map.get("icy-name");
                        if (list2 == null) {
                        }
                        list3 = (List) map.get("icy-url");
                        if (list3 == null) {
                        }
                        list4 = (List) map.get("icy-pub");
                        if (list4 == null) {
                        }
                        list5 = (List) map.get("icy-metaint");
                        if (list5 != null) {
                        }
                        int i13 = i12;
                        if (z10) {
                        }
                        return bVar;
                    }
                }
            } catch (NumberFormatException unused2) {
                i11 = -1;
            }
            i10 = i11;
        } else {
            z10 = false;
            i10 = -1;
        }
        list = (List) map.get("icy-genre");
        String str42 = null;
        if (list == null) {
            String str5 = (String) list.get(0);
            bVar = null;
            str42 = str5;
            z10 = true;
        } else {
            bVar = null;
        }
        list2 = (List) map.get("icy-name");
        if (list2 == null) {
            str = (String) list2.get(0);
            z10 = true;
        } else {
            str = bVar;
        }
        list3 = (List) map.get("icy-url");
        if (list3 == null) {
            str2 = (String) list3.get(0);
            z10 = true;
        } else {
            str2 = bVar;
        }
        list4 = (List) map.get("icy-pub");
        if (list4 == null) {
            z11 = ((String) list4.get(0)).equals("1");
            z10 = true;
        } else {
            z11 = false;
        }
        list5 = (List) map.get("icy-metaint");
        if (list5 != null) {
            String str6 = (String) list5.get(0);
            try {
                int parseInt = Integer.parseInt(str6);
                if (parseInt > 0) {
                    i12 = parseInt;
                } else {
                    try {
                        AbstractC4156x.i("IcyHeaders", "Invalid metadata interval: " + str6);
                        z12 = z10;
                    } catch (NumberFormatException unused3) {
                        i12 = parseInt;
                        AbstractC4156x.i("IcyHeaders", "Invalid metadata interval: " + str6);
                        int i132 = i12;
                        if (z10) {
                        }
                        return bVar;
                    }
                }
                z10 = z12;
            } catch (NumberFormatException unused4) {
            }
        }
        int i1322 = i12;
        if (z10) {
            bVar = new b(i10, str42, str, str2, z11, i1322);
        }
        return bVar;
    }

    @Override // b1.C2334C.a
    public void b(C2333B.b bVar) {
        String str = this.f12006c;
        if (str != null) {
            bVar.m0(str);
        }
        String str2 = this.f12005b;
        if (str2 != null) {
            bVar.c0(str2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f12004a == bVar.f12004a && Objects.equals(this.f12005b, bVar.f12005b) && Objects.equals(this.f12006c, bVar.f12006c) && Objects.equals(this.f12007d, bVar.f12007d) && this.f12008e == bVar.f12008e && this.f12009f == bVar.f12009f) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (527 + this.f12004a) * 31;
        String str = this.f12005b;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f12006c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f12007d;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f12008e ? 1 : 0)) * 31) + this.f12009f;
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f12006c + "\", genre=\"" + this.f12005b + "\", bitrate=" + this.f12004a + ", metadataInterval=" + this.f12009f;
    }
}
