package androidx.customview.widget;

import android.graphics.Rect;
import io.sentry.hints.j;
import java.util.Comparator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f1545a = new Rect();

    /* renamed from: b, reason: collision with root package name */
    public final Rect f1546b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1547c;

    /* renamed from: d, reason: collision with root package name */
    public final c f1548d;

    public e(boolean z5, c cVar) {
        this.f1547c = z5;
        this.f1548d = cVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        j jVar = (j) this.f1548d;
        jVar.getClass();
        Rect rect = this.f1545a;
        ((q0.c) obj).f(rect);
        jVar.getClass();
        Rect rect2 = this.f1546b;
        ((q0.c) obj2).f(rect2);
        int i5 = rect.top;
        int i10 = rect2.top;
        if (i5 < i10) {
            return -1;
        }
        if (i5 > i10) {
            return 1;
        }
        int i11 = rect.left;
        int i12 = rect2.left;
        boolean z5 = this.f1547c;
        if (i11 < i12) {
            return z5 ? 1 : -1;
        }
        if (i11 > i12) {
            return z5 ? -1 : 1;
        }
        int i13 = rect.bottom;
        int i14 = rect2.bottom;
        if (i13 < i14) {
            return -1;
        }
        if (i13 > i14) {
            return 1;
        }
        int i15 = rect.right;
        int i16 = rect2.right;
        if (i15 < i16) {
            return z5 ? 1 : -1;
        }
        if (i15 > i16) {
            return z5 ? -1 : 1;
        }
        return 0;
    }
}
