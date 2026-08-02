package c0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import io.sentry.android.core.w0;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m0 implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3284a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final Context f3285b;

    public m0(Context context) {
        this.f3285b = context;
    }

    public final void a(ComponentName componentName) {
        Context context = this.f3285b;
        ArrayList arrayList = this.f3284a;
        int size = arrayList.size();
        try {
            for (Intent a7 = d.a(context, componentName); a7 != null; a7 = d.a(context, a7.getComponent())) {
                arrayList.add(size, a7);
            }
        } catch (PackageManager.NameNotFoundException e7) {
            w0.d("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e7);
        }
    }

    public final void b() {
        ArrayList arrayList = this.f3284a;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        this.f3285b.startActivities(intentArr, null);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f3284a.iterator();
    }
}
