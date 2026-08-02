package Y2;

import Q2.AbstractC1507s;
import Q2.AbstractC1508t;
import Q2.K;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkProgress;
import androidx.work.impl.model.WorkSpec;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public class L implements Q2.D {

    /* renamed from: c, reason: collision with root package name */
    public static final String f13933c = AbstractC1508t.i("WorkProgressUpdater");

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase f13934a;

    /* renamed from: b, reason: collision with root package name */
    public final Z2.b f13935b;

    public L(WorkDatabase workDatabase, Z2.b bVar) {
        this.f13934a = workDatabase;
        this.f13935b = bVar;
    }

    public static /* synthetic */ Void b(L l10, UUID uuid, androidx.work.b bVar) {
        l10.getClass();
        String uuid2 = uuid.toString();
        AbstractC1508t e10 = AbstractC1508t.e();
        String str = f13933c;
        e10.a(str, "Updating progress for " + uuid + " (" + bVar + ")");
        l10.f13934a.beginTransaction();
        try {
            WorkSpec i10 = l10.f13934a.l().i(uuid2);
            if (i10 == null) {
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            }
            if (i10.state == K.c.RUNNING) {
                l10.f13934a.k().c(new WorkProgress(uuid2, bVar));
            } else {
                AbstractC1508t.e().k(str, "Ignoring setProgressAsync(...). WorkSpec (" + uuid2 + ") is not in a RUNNING state.");
            }
            l10.f13934a.setTransactionSuccessful();
            l10.f13934a.endTransaction();
            return null;
        } catch (Throwable th2) {
            try {
                AbstractC1508t.e().d(f13933c, "Error updating Worker progress", th2);
                throw th2;
            } catch (Throwable th3) {
                l10.f13934a.endTransaction();
                throw th3;
            }
        }
    }

    @Override // Q2.D
    public Ta.o a(Context context, final UUID uuid, final androidx.work.b bVar) {
        return AbstractC1507s.f(this.f13935b.c(), "updateProgress", new Function0() { // from class: Y2.K
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return L.b(L.this, uuid, bVar);
            }
        });
    }
}
