package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class Xe {

    /* renamed from: c, reason: collision with root package name */
    public static final String f13186c = "Xe";

    /* renamed from: a, reason: collision with root package name */
    public final Ha f13187a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13188b;

    public Xe(Ha ha2, String str) {
        this.f13187a = ha2;
        this.f13188b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Xe> T a(String str, float f6) {
        synchronized (this) {
            this.f13187a.a(str, f6);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Xe> T b(String str, String str2) {
        synchronized (this) {
            this.f13187a.a(str, str2);
        }
        return this;
    }

    public final Ye c(String str) {
        return new Ye(str, this.f13188b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Xe> T d(String str) {
        synchronized (this) {
            this.f13187a.remove(str);
        }
        return this;
    }

    @NonNull
    public Set<String> c() {
        return this.f13187a.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Xe> T a(String str, String[] strArr) {
        String str2;
        try {
            JSONArray jSONArray = new JSONArray();
            for (String str3 : strArr) {
                jSONArray.put(str3);
            }
            str2 = jSONArray.toString();
        } catch (Throwable unused) {
            str2 = null;
        }
        this.f13187a.a(str, str2);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Xe> T b(String str, long j) {
        synchronized (this) {
            this.f13187a.a(str, j);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public final <T extends Xe> T b(String str, int i5) {
        synchronized (this) {
            this.f13187a.a(i5, str);
        }
        return this;
    }

    public final <T extends Xe> T a(String str, List<String> list) {
        return (T) a(str, (String[]) list.toArray(new String[list.size()]));
    }

    public final long a(String str, long j) {
        return this.f13187a.getLong(str, j);
    }

    public final int a(@NonNull String str, int i5) {
        return this.f13187a.getInt(str, i5);
    }

    public final String a(@NonNull String str, String str2) {
        return this.f13187a.getString(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends Xe> T b(String str, boolean z5) {
        synchronized (this) {
            this.f13187a.a(str, z5);
        }
        return this;
    }

    public final boolean a(String str, boolean z5) {
        return this.f13187a.getBoolean(str, z5);
    }

    public final void b() {
        synchronized (this) {
            this.f13187a.b();
        }
    }

    public final boolean b(@NonNull String str) {
        return this.f13187a.a(str);
    }
}
