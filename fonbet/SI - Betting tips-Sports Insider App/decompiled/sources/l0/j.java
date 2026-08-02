package l0;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    public final LocaleList f19310a;

    public j(Object obj) {
        this.f19310a = (LocaleList) obj;
    }

    @Override // l0.i
    public final String a() {
        return this.f19310a.toLanguageTags();
    }

    @Override // l0.i
    public final Object b() {
        return this.f19310a;
    }

    public final boolean equals(Object obj) {
        return this.f19310a.equals(((i) obj).b());
    }

    @Override // l0.i
    public final Locale get(int i5) {
        return this.f19310a.get(i5);
    }

    public final int hashCode() {
        return this.f19310a.hashCode();
    }

    @Override // l0.i
    public final boolean isEmpty() {
        return this.f19310a.isEmpty();
    }

    @Override // l0.i
    public final int size() {
        return this.f19310a.size();
    }

    public final String toString() {
        return this.f19310a.toString();
    }
}
