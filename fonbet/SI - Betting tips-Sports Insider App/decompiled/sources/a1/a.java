package a1;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
import androidx.appcompat.widget.q4;
import androidx.appcompat.widget.u3;
import com.google.android.gms.internal.measurement.d4;
import j$.util.Objects;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(q4 q4Var) {
        super(null);
        Objects.requireNonNull(q4Var);
        this.f10b = q4Var;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.f9a) {
            case 0:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z5) {
        Cursor cursor;
        switch (this.f9a) {
            case 0:
                u3 u3Var = (u3) this.f10b;
                if (!u3Var.f14b || (cursor = u3Var.f15c) == null || cursor.isClosed()) {
                    return;
                }
                u3Var.f13a = u3Var.f15c.requery();
                return;
            case 1:
                ((AtomicBoolean) ((q4) this.f10b).f892b).set(true);
                return;
            default:
                d4 d4Var = (d4) this.f10b;
                synchronized (d4Var.f4968f) {
                    d4Var.f4969g = null;
                    d4Var.f4965c.run();
                }
                synchronized (d4Var) {
                    try {
                        Iterator it = d4Var.f4970h.iterator();
                        if (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            throw null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d4 d4Var) {
        super(null);
        this.f10b = d4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(u3 u3Var) {
        super(new Handler());
        this.f10b = u3Var;
    }
}
