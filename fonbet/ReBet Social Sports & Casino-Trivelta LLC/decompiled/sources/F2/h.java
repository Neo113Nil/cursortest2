package F2;

import E2.k;
import android.database.sqlite.SQLiteStatement;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends g implements k {

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteStatement f3527b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SQLiteStatement delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f3527b = delegate;
    }

    @Override // E2.k
    public int G() {
        return this.f3527b.executeUpdateDelete();
    }

    @Override // E2.k
    public long J0() {
        return this.f3527b.executeInsert();
    }
}
