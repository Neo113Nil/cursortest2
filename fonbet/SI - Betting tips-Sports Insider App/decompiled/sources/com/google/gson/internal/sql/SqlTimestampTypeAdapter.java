package com.google.gson.internal.sql;

import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.x;
import com.google.gson.y;
import java.sql.Timestamp;
import java.util.Date;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
class SqlTimestampTypeAdapter extends x {

    /* renamed from: b, reason: collision with root package name */
    public static final y f6355b = new y() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // com.google.gson.y
        public final x a(j jVar, TypeToken typeToken) {
            if (typeToken.getRawType() != Timestamp.class) {
                return null;
            }
            jVar.getClass();
            return new SqlTimestampTypeAdapter(jVar.c(TypeToken.get(Date.class)));
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final x f6356a;

    public SqlTimestampTypeAdapter(x xVar) {
        this.f6356a = xVar;
    }

    @Override // com.google.gson.x
    public final Object b(r9.a aVar) {
        Date date = (Date) this.f6356a.b(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.gson.x
    public final void c(r9.b bVar, Object obj) {
        this.f6356a.c(bVar, (Timestamp) obj);
    }
}
