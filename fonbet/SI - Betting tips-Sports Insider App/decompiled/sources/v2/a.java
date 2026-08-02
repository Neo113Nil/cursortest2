package v2;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements s2.a {

    /* renamed from: a, reason: collision with root package name */
    public final t2.a f24390a;

    public a(t2.a db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        this.f24390a = db2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f24390a.close();
    }

    @Override // s2.a
    public final boolean j() {
        return this.f24390a.j();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00d2, code lost:
    
        if (r0.equals("END") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00de, code lost:
    
        r5 = v2.c.f24392a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00db, code lost:
    
        if (r0.equals("COM") == false) goto L51;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // s2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s2.c r0(String sql) {
        String str;
        c cVar;
        int i5;
        Intrinsics.checkNotNullParameter(sql, "sql");
        t2.a db2 = this.f24390a;
        b bVar = null;
        if (!db2.isOpen()) {
            h8.b.C(21, "connection is closed");
            throw null;
        }
        Intrinsics.checkNotNullParameter(db2, "db");
        Intrinsics.checkNotNullParameter(sql, "sql");
        String sql2 = StringsKt.Z(sql).toString().toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(sql2, "toUpperCase(...)");
        Intrinsics.checkNotNullParameter(sql2, "sql");
        int length = sql2.length() - 2;
        int i10 = -1;
        if (length >= 0) {
            int i11 = 0;
            loop0: while (i11 < length) {
                char charAt = sql2.charAt(i11);
                if (Intrinsics.compare((int) charAt, 32) > 0) {
                    if (charAt != '-') {
                        if (charAt == '/') {
                            int i12 = i11 + 1;
                            if (sql2.charAt(i12) == '*') {
                                do {
                                    i12 = StringsKt.F(sql2, '*', i12 + 1, false, 4);
                                    if (i12 >= 0) {
                                        i5 = i12 + 1;
                                        if (i5 >= length) {
                                            break;
                                        }
                                    } else {
                                        break loop0;
                                    }
                                } while (sql2.charAt(i5) != '/');
                                i11 = i12 + 2;
                            }
                        }
                        i10 = i11;
                        break;
                    }
                    if (sql2.charAt(i11 + 1) == '-') {
                        i11 = StringsKt.F(sql2, '\n', i11 + 2, false, 4);
                        if (i11 < 0) {
                            break;
                        }
                    } else {
                        i10 = i11;
                        break;
                    }
                }
                i11++;
            }
        }
        if (i10 < 0 || i10 > sql2.length()) {
            str = null;
        } else {
            str = sql2.substring(i10, Math.min(i10 + 3, sql2.length()));
            Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
        }
        if (str == null) {
            return new d(db2, sql);
        }
        switch (str.hashCode()) {
            case 65636:
                if (str.equals("BEG")) {
                    if (!StringsKt.A(sql2, "EXCLUSIVE", false)) {
                        if (!StringsKt.A(sql2, "IMMEDIATE", false)) {
                            cVar = c.f24396e;
                            break;
                        } else {
                            cVar = c.f24395d;
                            break;
                        }
                    } else {
                        cVar = c.f24394c;
                        break;
                    }
                }
                cVar = null;
                break;
            case 66913:
                break;
            case 68795:
                break;
            case 81327:
                if (str.equals("ROL") && !StringsKt.A(sql2, " TO ", false)) {
                    cVar = c.f24393b;
                    break;
                }
                cVar = null;
                break;
            default:
                cVar = null;
                break;
        }
        if (cVar != null) {
            return new d(db2, sql, cVar);
        }
        if (Intrinsics.areEqual(str, "PRA")) {
            String lowerCase = sql2.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (StringsKt.A(StringsKt.U(lowerCase, "journal_mode", ""), "=", false)) {
                bVar = b.f24391a;
            }
        }
        if (bVar != null) {
            return new d(db2, sql, new e(db2, sql));
        }
        int hashCode = str.hashCode();
        return (hashCode == 79487 ? !str.equals("PRA") : hashCode == 81978 ? !str.equals("SEL") : !(hashCode == 85954 && str.equals("WIT"))) ? new d(db2, sql) : new e(db2, sql);
    }
}
