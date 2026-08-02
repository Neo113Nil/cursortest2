package p6;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import g6.C4331C;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: c, reason: collision with root package name */
    public static final a f63099c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f63100a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f63101b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a() {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C4331C.l()).edit();
            edit.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
            edit.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
            edit.apply();
        }

        public final o b() {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C4331C.l());
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (defaultSharedPreferences.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
                return new o(defaultSharedPreferences.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), defaultSharedPreferences.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false), defaultConstructorMarker);
            }
            return null;
        }

        public a() {
        }
    }

    public /* synthetic */ o(String str, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z10);
    }

    public final void a() {
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C4331C.l()).edit();
        edit.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", this.f63100a);
        edit.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", this.f63101b);
        edit.apply();
    }

    public String toString() {
        String str = this.f63101b ? "Applink" : "Unclassified";
        if (this.f63100a == null) {
            return str;
        }
        return str + '(' + ((Object) this.f63100a) + ')';
    }

    public o(String str, boolean z10) {
        this.f63100a = str;
        this.f63101b = z10;
    }
}
