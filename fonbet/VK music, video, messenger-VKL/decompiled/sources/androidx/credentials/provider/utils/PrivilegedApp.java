package androidx.credentials.provider.utils;

import android.os.Build;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.epx;
import xsna.ur;
import xsna.zcl;

/* compiled from: PrivilegedApp.kt */
/* loaded from: classes12.dex */
public final class PrivilegedApp {
    private static final String ANDROID_TYPE_KEY = "android";
    private static final String APPS_KEY = "apps";
    private static final String APP_INFO_KEY = "info";
    private static final String BUILD_KEY = "build";
    public static final Companion Companion = new Companion(null);
    private static final String FINGERPRINT_KEY = "cert_fingerprint_sha256";
    private static final String PACKAGE_NAME_KEY = "package_name";
    private static final String SIGNATURES_KEY = "signatures";
    private static final String TYPE_KEY = "type";
    private static final String USER_BUILD_TYPE = "userdebug";
    private static final String USER_DEBUG_KEY = "userdebug";
    private final Set<String> fingerprints;
    private final String packageName;

    /* compiled from: PrivilegedApp.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final PrivilegedApp createFromJSONObject(JSONObject jSONObject, boolean z) {
            JSONArray jSONArray = jSONObject.getJSONArray(PrivilegedApp.SIGNATURES_KEY);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                if (!z || !"userdebug".equals(jSONArray.getJSONObject(i).optString(PrivilegedApp.BUILD_KEY)) || "userdebug".equals(Build.TYPE)) {
                    linkedHashSet.add(jSONArray.getJSONObject(i).getString(PrivilegedApp.FINGERPRINT_KEY));
                }
            }
            return new PrivilegedApp(jSONObject.getString("package_name"), linkedHashSet);
        }

        public final List<PrivilegedApp> extractPrivilegedApps$credentials_release(JSONObject jSONObject) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray(PrivilegedApp.APPS_KEY);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (epx.f(jSONObject2.getString("type"), "android")) {
                    arrayList.add(createFromJSONObject(jSONObject2.getJSONObject(PrivilegedApp.APP_INFO_KEY), true));
                }
            }
            return arrayList;
        }

        private Companion() {
        }
    }

    public PrivilegedApp(String str, Set<String> set) {
        this.packageName = str;
        this.fingerprints = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PrivilegedApp copy$default(PrivilegedApp privilegedApp, String str, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            str = privilegedApp.packageName;
        }
        if ((i & 2) != 0) {
            set = privilegedApp.fingerprints;
        }
        return privilegedApp.copy(str, set);
    }

    public static final PrivilegedApp createFromJSONObject(JSONObject jSONObject, boolean z) {
        return Companion.createFromJSONObject(jSONObject, z);
    }

    public final String component1() {
        return this.packageName;
    }

    public final Set<String> component2() {
        return this.fingerprints;
    }

    public final PrivilegedApp copy(String str, Set<String> set) {
        return new PrivilegedApp(str, set);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivilegedApp)) {
            return false;
        }
        PrivilegedApp privilegedApp = (PrivilegedApp) obj;
        return epx.f(this.packageName, privilegedApp.packageName) && epx.f(this.fingerprints, privilegedApp.fingerprints);
    }

    public final Set<String> getFingerprints() {
        return this.fingerprints;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public int hashCode() {
        return this.fingerprints.hashCode() + (this.packageName.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PrivilegedApp(packageName=");
        sb.append(this.packageName);
        sb.append(", fingerprints=");
        return ur.c(sb, this.fingerprints, ')');
    }
}
