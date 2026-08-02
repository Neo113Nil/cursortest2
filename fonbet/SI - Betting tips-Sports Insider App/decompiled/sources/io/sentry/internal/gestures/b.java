package io.sentry.internal.gestures;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f16519a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16520b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16521c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16522d = "old_view_system";

    public b(View view, String str, String str2) {
        this.f16519a = new WeakReference(view);
        this.f16520b = str;
        this.f16521c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return y4.a.s(this.f16520b, bVar.f16520b) && y4.a.s(this.f16521c, bVar.f16521c) && y4.a.s(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16519a, this.f16521c, null});
    }
}
