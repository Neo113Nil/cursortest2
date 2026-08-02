package defpackage;

import android.content.SharedPreferences;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class szg implements SharedPreferences.Editor {
    public final SharedPreferences.Editor a;
    public final /* synthetic */ tzg b;

    public szg(tzg tzgVar) {
        this.b = tzgVar;
        this.a = tzgVar.a.edit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        this.a.apply();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.a.clear();
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        return this.a.commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        this.a.putString(tzg.i(str), this.b.b(Boolean.toString(z)));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        this.a.putString(tzg.i(str), this.b.b(Float.toString(f)));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        this.a.putString(tzg.i(str), this.b.b(Integer.toString(i)));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        this.a.putString(tzg.i(str), this.b.b(Long.toString(j)));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        this.a.putString(tzg.i(str), this.b.b(str2));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(this.b.b((String) it.next()));
        }
        this.a.putStringSet(tzg.i(str), hashSet);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        this.a.remove(tzg.i(str));
        return this;
    }
}
