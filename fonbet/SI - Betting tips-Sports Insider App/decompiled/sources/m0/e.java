package m0;

import android.content.Context;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20117a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f20118b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f20119c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f20121e;

    public /* synthetic */ e(String str, Context context, Object obj, int i5, int i10) {
        this.f20117a = i10;
        this.f20118b = str;
        this.f20119c = context;
        this.f20121e = obj;
        this.f20120d = i5;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i5 = this.f20117a;
        int i10 = this.f20120d;
        Object obj = this.f20121e;
        Context context = this.f20119c;
        String str = this.f20118b;
        switch (i5) {
            case 0:
                Object[] objArr = {(d) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return h.b(str, context, DesugarCollections.unmodifiableList(arrayList), i10);
            default:
                try {
                    return h.b(str, context, (ArrayList) obj, i10);
                } catch (Throwable unused) {
                    return new g(-3);
                }
        }
    }
}
