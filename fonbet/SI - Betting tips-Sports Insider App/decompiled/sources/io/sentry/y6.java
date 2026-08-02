package io.sentry;

import com.sports.insider.data.room.general.table.AccountTable;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y6 implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.protocol.v f17261a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17262b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17263c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17264d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f17265e;

    public y6(io.sentry.protocol.v vVar, String str, String str2, String str3) {
        this.f17261a = vVar;
        this.f17262b = str;
        this.f17263c = str2;
        this.f17264d = str3;
    }

    @Override // io.sentry.c2
    public final void serialize(b3 b3Var, ILogger iLogger) {
        l1.a aVar = (l1.a) b3Var;
        aVar.j();
        aVar.u("event_id");
        this.f17261a.serialize(aVar, iLogger);
        String str = this.f17262b;
        if (str != null) {
            aVar.u("name");
            aVar.K(str);
        }
        String str2 = this.f17263c;
        if (str2 != null) {
            aVar.u(AccountTable.emailColumn);
            aVar.K(str2);
        }
        String str3 = this.f17264d;
        if (str3 != null) {
            aVar.u("comments");
            aVar.K(str3);
        }
        HashMap hashMap = this.f17265e;
        if (hashMap != null) {
            for (String str4 : hashMap.keySet()) {
                d9.e.u(this.f17265e, str4, aVar, str4, iLogger);
            }
        }
        aVar.o();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserFeedback{eventId=");
        sb2.append(this.f17261a);
        sb2.append(", name='");
        sb2.append(this.f17262b);
        sb2.append("', email='");
        sb2.append(this.f17263c);
        sb2.append("', comments='");
        return d9.e.l(sb2, this.f17264d, "'}");
    }
}
