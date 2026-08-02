package u0;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    public final LocaleList f65920a;

    public k(Object obj) {
        this.f65920a = (LocaleList) obj;
    }

    @Override // u0.j
    public String a() {
        return this.f65920a.toLanguageTags();
    }

    @Override // u0.j
    public Object b() {
        return this.f65920a;
    }

    public boolean equals(Object obj) {
        return this.f65920a.equals(((j) obj).b());
    }

    @Override // u0.j
    public Locale get(int i10) {
        return this.f65920a.get(i10);
    }

    public int hashCode() {
        return this.f65920a.hashCode();
    }

    @Override // u0.j
    public boolean isEmpty() {
        return this.f65920a.isEmpty();
    }

    @Override // u0.j
    public int size() {
        return this.f65920a.size();
    }

    public String toString() {
        return this.f65920a.toString();
    }
}
