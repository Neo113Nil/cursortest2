package rb;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22364a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22365b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f22366c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22367d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f22368e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f22369f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f22370g;

    public /* synthetic */ c(int i5, String str, int i10, String str2, String str3, String str4, int i11) {
        this.f22364a = i11;
        this.f22365b = i5;
        this.f22366c = str;
        this.f22367d = i10;
        this.f22368e = str2;
        this.f22369f = str3;
        this.f22370g = str4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s2.c r02;
        switch (this.f22364a) {
            case 0:
                int i5 = this.f22365b;
                int i10 = this.f22367d;
                s2.a _connection = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection, "_connection");
                r02 = _connection.r0("INSERT INTO support_table (remoteId, operatorName, dateCreate, text, mime, \n        content, readDate, sendDate, stateRead, type, dateUpdate) \n        VALUES (?, ?, ?, ?, ?, ?, 0, ?, 2, \n        0, ?)\n    ");
                try {
                    r02.f(1, i5);
                    String str = this.f22366c;
                    if (str == null) {
                        r02.h(2);
                    } else {
                        r02.B(2, str);
                    }
                    long j = i10;
                    r02.f(3, j);
                    String str2 = this.f22368e;
                    if (str2 == null) {
                        r02.h(4);
                    } else {
                        r02.B(4, str2);
                    }
                    String str3 = this.f22369f;
                    if (str3 == null) {
                        r02.h(5);
                    } else {
                        r02.B(5, str3);
                    }
                    String str4 = this.f22370g;
                    if (str4 == null) {
                        r02.h(6);
                    } else {
                        r02.B(6, str4);
                    }
                    r02.f(7, j);
                    r02.f(8, j);
                    r02.n0();
                    r02.close();
                    return Unit.f19194a;
                } finally {
                    r02.close();
                }
            case 1:
                int i11 = this.f22365b;
                int i12 = this.f22367d;
                s2.a _connection2 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection2, "_connection");
                s2.c r03 = _connection2.r0("INSERT INTO support_table (remoteId, operatorName, dateCreate, text, mime, \n        content, readDate, sendDate, stateRead, type, dateUpdate) \n        VALUES (?, ?, ?, ?, ?, ?, 0, ?, 2, \n        0, ?)\n    ");
                try {
                    r03.f(1, i11);
                    String str5 = this.f22366c;
                    if (str5 == null) {
                        r03.h(2);
                    } else {
                        r03.B(2, str5);
                    }
                    long j6 = i12;
                    r03.f(3, j6);
                    String str6 = this.f22368e;
                    if (str6 == null) {
                        r03.h(4);
                    } else {
                        r03.B(4, str6);
                    }
                    String str7 = this.f22369f;
                    if (str7 == null) {
                        r03.h(5);
                    } else {
                        r03.B(5, str7);
                    }
                    String str8 = this.f22370g;
                    if (str8 == null) {
                        r03.h(6);
                    } else {
                        r03.B(6, str8);
                    }
                    r03.f(7, j6);
                    r03.f(8, j6);
                    r03.n0();
                    r03.close();
                    return Unit.f19194a;
                } finally {
                    r03.close();
                }
            case 2:
                int i13 = this.f22365b;
                int i14 = this.f22367d;
                s2.a _connection3 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection3, "_connection");
                r02 = _connection3.r0("UPDATE support_table \n                    SET operatorName = ?, text = ?, content = ?, mime = ?, \n                        dateUpdate = ?, stateRead = 2, sendDate =?\n                    WHERE remoteId == ? ");
                String str9 = this.f22366c;
                try {
                    if (str9 == null) {
                        r02.h(1);
                    } else {
                        r02.B(1, str9);
                    }
                    String str10 = this.f22368e;
                    if (str10 == null) {
                        r02.h(2);
                    } else {
                        r02.B(2, str10);
                    }
                    String str11 = this.f22369f;
                    if (str11 == null) {
                        r02.h(3);
                    } else {
                        r02.B(3, str11);
                    }
                    String str12 = this.f22370g;
                    if (str12 == null) {
                        r02.h(4);
                    } else {
                        r02.B(4, str12);
                    }
                    long j10 = i13;
                    r02.f(5, j10);
                    r02.f(6, j10);
                    r02.f(7, i14);
                    r02.n0();
                    r02.close();
                    return Unit.f19194a;
                } finally {
                }
            default:
                int i15 = this.f22365b;
                int i16 = this.f22367d;
                s2.a _connection4 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection4, "_connection");
                r02 = _connection4.r0("UPDATE support_table \n                    SET operatorName = ?, text = ?, content = ?, mime = ?, \n                        dateUpdate = ?, stateRead = 2, sendDate =?,\n                        remoteId = ?\n                    WHERE remoteId == ? ");
                String str13 = this.f22366c;
                try {
                    if (str13 == null) {
                        r02.h(1);
                    } else {
                        r02.B(1, str13);
                    }
                    String str14 = this.f22368e;
                    if (str14 == null) {
                        r02.h(2);
                    } else {
                        r02.B(2, str14);
                    }
                    String str15 = this.f22369f;
                    if (str15 == null) {
                        r02.h(3);
                    } else {
                        r02.B(3, str15);
                    }
                    String str16 = this.f22370g;
                    if (str16 == null) {
                        r02.h(4);
                    } else {
                        r02.B(4, str16);
                    }
                    long j11 = i15;
                    r02.f(5, j11);
                    r02.f(6, j11);
                    long j12 = i16;
                    r02.f(7, j12);
                    r02.f(8, j12);
                    r02.n0();
                    r02.close();
                    return Unit.f19194a;
                } finally {
                }
        }
    }

    public /* synthetic */ c(String str, String str2, String str3, String str4, int i5, int i10, int i11) {
        this.f22364a = i11;
        this.f22366c = str;
        this.f22368e = str2;
        this.f22369f = str3;
        this.f22370g = str4;
        this.f22365b = i5;
        this.f22367d = i10;
    }
}
