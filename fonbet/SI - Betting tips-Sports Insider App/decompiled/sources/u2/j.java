package u2;

import android.database.sqlite.SQLiteStatement;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j extends i implements t2.f {

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteStatement f24048b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(SQLiteStatement delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f24048b = delegate;
    }

    @Override // t2.f
    public final void i() {
        this.f24048b.execute();
    }
}
