package y1;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a0 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f25524a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f25525b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25526c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25527d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f25528e;

    /* renamed from: f, reason: collision with root package name */
    public final int f25529f;

    public a0(b0 destination, Bundle bundle, boolean z5, int i5, boolean z7, int i10) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f25524a = destination;
        this.f25525b = bundle;
        this.f25526c = z5;
        this.f25527d = i5;
        this.f25528e = z7;
        this.f25529f = i10;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(a0 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        boolean z5 = this.f25526c;
        if (z5 && !other.f25526c) {
            return 1;
        }
        if (!z5 && other.f25526c) {
            return -1;
        }
        int i5 = other.f25527d;
        boolean z7 = other.f25528e;
        Bundle source = other.f25525b;
        int i10 = this.f25527d - i5;
        if (i10 > 0) {
            return 1;
        }
        if (i10 < 0) {
            return -1;
        }
        Bundle source2 = this.f25525b;
        if (source2 != null && source == null) {
            return 1;
        }
        if (source2 == null && source != null) {
            return -1;
        }
        if (source2 != null) {
            Intrinsics.checkNotNullParameter(source2, "source");
            int size = source2.size();
            Intrinsics.checkNotNull(source);
            Intrinsics.checkNotNullParameter(source, "source");
            int size2 = size - source.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z10 = this.f25528e;
        if (z10 && !z7) {
            return 1;
        }
        if (z10 || !z7) {
            return this.f25529f - other.f25529f;
        }
        return -1;
    }
}
