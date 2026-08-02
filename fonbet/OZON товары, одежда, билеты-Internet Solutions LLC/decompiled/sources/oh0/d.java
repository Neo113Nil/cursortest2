package oh0;

import android.app.NotificationChannel;
import androidx.core.app.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Zg0.g f78344a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final n f78345b;

    public d(@NotNull Zg0.g pushConfiguration, @NotNull n notificationManager) {
        Intrinsics.checkNotNullParameter(pushConfiguration, "pushConfiguration");
        Intrinsics.checkNotNullParameter(notificationManager, "notificationManager");
        this.f78344a = pushConfiguration;
        this.f78345b = notificationManager;
    }

    public final boolean a() {
        n nVar = this.f78345b;
        if (!nVar.a()) {
            return false;
        }
        List<Zg0.h> j11 = this.f78344a.j();
        if ((j11 instanceof Collection) && j11.isEmpty()) {
            return true;
        }
        Iterator<T> it = j11.iterator();
        while (it.hasNext()) {
            NotificationChannel h11 = nVar.h(((Zg0.h) it.next()).b());
            if (h11 != null && h11.getImportance() == 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean b() {
        List<Zg0.h> j11 = this.f78344a.j();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = j11.iterator();
        while (it.hasNext()) {
            NotificationChannel h11 = this.f78345b.h(((Zg0.h) it.next()).b());
            Integer valueOf = h11 != null ? Integer.valueOf(h11.getImportance()) : null;
            if (valueOf != null) {
                arrayList.add(valueOf);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (((Number) it2.next()).intValue() <= 2) {
                return false;
            }
        }
        return true;
    }
}
