package pb;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21591a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21592b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f21593c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Serializable f21594d;

    public /* synthetic */ a(int i5, String str, String str2, int i10) {
        this.f21591a = i10;
        this.f21592b = i5;
        this.f21593c = str;
        this.f21594d = str2;
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s2.c r02;
        switch (this.f21591a) {
            case 0:
                String str = (String) this.f21594d;
                int i5 = this.f21592b;
                s2.a _connection = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection, "_connection");
                r02 = _connection.r0("UPDATE sports_table SET nameCategoryEn = ?, logoCategory = ? WHERE idCategory == ?");
                String str2 = this.f21593c;
                try {
                    if (str2 == null) {
                        r02.h(1);
                    } else {
                        r02.B(1, str2);
                    }
                    if (str == null) {
                        r02.h(2);
                    } else {
                        r02.B(2, str);
                    }
                    r02.f(3, i5);
                    r02.n0();
                    int q = io.sentry.config.a.q(_connection);
                    r02.close();
                    return Integer.valueOf(q);
                } catch (Throwable th2) {
                    throw th2;
                }
            case 1:
                int i10 = this.f21592b;
                String str3 = (String) this.f21594d;
                s2.a _connection2 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection2, "_connection");
                r02 = _connection2.r0("INSERT INTO sports_table (idCategory, nameCategoryEn, nameCategoryRu, logoCategory)VALUES (?, ?, ?, ?)");
                try {
                    r02.f(1, i10);
                    String str4 = this.f21593c;
                    if (str4 == null) {
                        r02.h(2);
                    } else {
                        r02.B(2, str4);
                    }
                    if (str4 == null) {
                        r02.h(3);
                    } else {
                        r02.B(3, str4);
                    }
                    if (str3 == null) {
                        r02.h(4);
                    } else {
                        r02.B(4, str3);
                    }
                    r02.n0();
                    long p10 = io.sentry.config.a.p(_connection2);
                    r02.close();
                    return Long.valueOf(p10);
                } catch (Throwable th3) {
                    throw th3;
                }
            case 2:
                String str5 = (String) this.f21594d;
                int i11 = this.f21592b;
                s2.a _connection3 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection3, "_connection");
                r02 = _connection3.r0("UPDATE sports_table SET nameCategoryRu = ?, logoCategory = ? WHERE idCategory == ?");
                String str6 = this.f21593c;
                try {
                    if (str6 == null) {
                        r02.h(1);
                    } else {
                        r02.B(1, str6);
                    }
                    if (str5 == null) {
                        r02.h(2);
                    } else {
                        r02.B(2, str5);
                    }
                    r02.f(3, i11);
                    r02.n0();
                    int q3 = io.sentry.config.a.q(_connection3);
                    r02.close();
                    return Integer.valueOf(q3);
                } catch (Throwable th4) {
                    throw th4;
                }
            case 3:
                int i12 = this.f21592b;
                String str7 = this.f21593c;
                String str8 = (String) this.f21594d;
                s2.a _connection4 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection4, "_connection");
                r02 = _connection4.r0("INSERT INTO support_table (dateCreate, text, content, mime, sendDate, \n        dateUpdate, operatorName, remoteId, readDate, stateRead, type) \n        VALUES (?, ?, ?, \"application/json\", ?, ?, \"FAQ\", 0, ?, 2, 1)\n        ");
                long j = i12;
                try {
                    r02.f(1, j);
                    r02.B(2, str7);
                    r02.B(3, str8);
                    r02.f(4, j);
                    r02.f(5, j);
                    r02.f(6, j);
                    r02.n0();
                    long p11 = io.sentry.config.a.p(_connection4);
                    r02.close();
                    return Long.valueOf(p11);
                } finally {
                }
            case 4:
                int i13 = this.f21592b;
                String str9 = this.f21593c;
                String str10 = (String) this.f21594d;
                s2.a _connection5 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection5, "_connection");
                r02 = _connection5.r0("INSERT OR REPLACE INTO frequent_questions_table (id, question, answer) VALUES (?, ?, ?)");
                try {
                    r02.f(1, i13);
                    r02.B(2, str9);
                    r02.B(3, str10);
                    r02.n0();
                    r02.close();
                    return Unit.f19194a;
                } finally {
                }
            case 5:
                int i14 = this.f21592b;
                String str11 = this.f21593c;
                String str12 = (String) this.f21594d;
                s2.a _connection6 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection6, "_connection");
                r02 = _connection6.r0("INSERT INTO support_table (dateCreate, text, mime, content, sendDate, \n        dateUpdate, operatorName, remoteId, readDate, stateRead, type) \n        VALUES (?, null, ?, ?, 0, ?, null, 0, 0, 0, 0)\n    ");
                long j6 = i14;
                try {
                    r02.f(1, j6);
                    r02.B(2, str11);
                    r02.B(3, str12);
                    r02.f(4, j6);
                    r02.n0();
                    long p12 = io.sentry.config.a.p(_connection6);
                    r02.close();
                    return Long.valueOf(p12);
                } finally {
                }
            case 6:
                String str13 = this.f21593c;
                String str14 = (String) this.f21594d;
                int i15 = this.f21592b;
                s2.a _connection7 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection7, "_connection");
                r02 = _connection7.r0("INSERT INTO order_table (`order`, productPay, id, success)  VALUES (?, ?, ?, 0)");
                try {
                    r02.B(1, str13);
                    r02.B(2, str14);
                    r02.f(3, i15);
                    r02.n0();
                    long p13 = io.sentry.config.a.p(_connection7);
                    r02.close();
                    return Long.valueOf(p13);
                } finally {
                }
            default:
                int i16 = this.f21592b;
                Integer[] numArr = (Integer[]) this.f21594d;
                s2.a _connection8 = (s2.a) obj;
                Intrinsics.checkNotNullParameter(_connection8, "_connection");
                r02 = _connection8.r0(this.f21593c);
                try {
                    r02.f(1, i16);
                    int i17 = 2;
                    for (Integer num : numArr) {
                        r02.f(i17, num.intValue());
                        i17++;
                    }
                    r02.n0();
                    r02.close();
                    return Unit.f19194a;
                } finally {
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a(String str, int i5, Integer[] numArr) {
        this.f21591a = 7;
        this.f21593c = str;
        this.f21592b = i5;
        this.f21594d = numArr;
    }

    public /* synthetic */ a(String str, String str2, int i5, int i10) {
        this.f21591a = i10;
        this.f21593c = str;
        this.f21594d = str2;
        this.f21592b = i5;
    }
}
