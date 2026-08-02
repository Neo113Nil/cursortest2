package lc;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f19673a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f19674b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19675c;

    /* renamed from: d, reason: collision with root package name */
    public final String f19676d;

    public e(long j, Uri path, String name, String volumeName) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(volumeName, "volumeName");
        this.f19673a = j;
        this.f19674b = path;
        this.f19675c = name;
        this.f19676d = volumeName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f19673a == eVar.f19673a && Intrinsics.areEqual(this.f19674b, eVar.f19674b) && Intrinsics.areEqual(this.f19675c, eVar.f19675c) && Intrinsics.areEqual(this.f19676d, eVar.f19676d);
    }

    public final int hashCode() {
        long j = this.f19673a;
        return this.f19676d.hashCode() + k.j((this.f19674b.hashCode() + (((int) (j ^ (j >>> 32))) * 31)) * 31, 31, this.f19675c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Picture(id=");
        sb2.append(this.f19673a);
        sb2.append(", path=");
        sb2.append(this.f19674b);
        sb2.append(", name=");
        sb2.append(this.f19675c);
        sb2.append(", volumeName=");
        return d9.e.k(sb2, this.f19676d, ')');
    }
}
