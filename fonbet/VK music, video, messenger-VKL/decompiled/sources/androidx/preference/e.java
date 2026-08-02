package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.XmlResourceParser;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import xsna.gyc0;

/* compiled from: PreferenceManager.java */
/* loaded from: classes12.dex */
public final class e {
    public final Context a;
    public long b = 0;

    @Nullable
    public SharedPreferences c = null;

    @Nullable
    public SharedPreferences.Editor d;
    public boolean e;
    public final String f;
    public PreferenceScreen g;
    public Fragment h;
    public Fragment i;
    public Fragment j;

    /* compiled from: PreferenceManager.java */
    public interface a {
        void onDisplayPreferenceDialog(@NonNull Preference preference);
    }

    /* compiled from: PreferenceManager.java */
    public interface b {
        void onNavigateToScreen(@NonNull PreferenceScreen preferenceScreen);
    }

    /* compiled from: PreferenceManager.java */
    public interface c {
        boolean onPreferenceTreeClick(@NonNull Preference preference);
    }

    public e(@NonNull Context context) {
        this.a = context;
        this.f = context.getPackageName() + "_preferences";
    }

    @Nullable
    public final SharedPreferences.Editor a() {
        if (!this.e) {
            return b().edit();
        }
        if (this.d == null) {
            this.d = b().edit();
        }
        return this.d;
    }

    @Nullable
    public final SharedPreferences b() {
        if (this.c == null) {
            this.c = com.vk.core.preference.Preference.h(this.a, 0, this.f);
        }
        return this.c;
    }

    @NonNull
    public final PreferenceScreen c(@NonNull Context context, int i, @Nullable PreferenceScreen preferenceScreen) {
        this.e = true;
        gyc0 gyc0Var = new gyc0(context, this);
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            PreferenceGroup c2 = gyc0Var.c(xml, preferenceScreen);
            xml.close();
            PreferenceScreen preferenceScreen2 = (PreferenceScreen) c2;
            preferenceScreen2.r(this);
            SharedPreferences.Editor editor = this.d;
            if (editor != null) {
                editor.apply();
            }
            this.e = false;
            return preferenceScreen2;
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }
}
