package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.bm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0058bm extends N5 {

    /* renamed from: d, reason: collision with root package name */
    public List f13463d;

    /* renamed from: e, reason: collision with root package name */
    public List f13464e;

    /* renamed from: f, reason: collision with root package name */
    public String f13465f;

    /* renamed from: g, reason: collision with root package name */
    public String f13466g;

    /* renamed from: h, reason: collision with root package name */
    public Map f13467h;

    /* renamed from: i, reason: collision with root package name */
    public C0445r3 f13468i;
    public List j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f13469k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f13470l;

    /* renamed from: m, reason: collision with root package name */
    public String f13471m;

    /* renamed from: n, reason: collision with root package name */
    public long f13472n;

    /* renamed from: o, reason: collision with root package name */
    public final C0309lg f13473o;

    /* renamed from: p, reason: collision with root package name */
    public final H7 f13474p;

    public C0058bm() {
        this(C0353na.k().u(), new H7());
    }

    public final long a(long j) {
        if (this.f13472n == 0) {
            this.f13472n = j;
        }
        return this.f13472n;
    }

    @NonNull
    public final C0445r3 c() {
        return this.f13468i;
    }

    public final Map<String, String> d() {
        return this.f13467h;
    }

    public final String e() {
        return this.f13471m;
    }

    public final String f() {
        return this.f13465f;
    }

    public final long g() {
        return this.f13472n;
    }

    public final String h() {
        return this.f13466g;
    }

    public final List<String> i() {
        return this.j;
    }

    @NonNull
    public final C0309lg j() {
        return this.f13473o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        if (r4 != null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<String> k() {
        ArrayList arrayList;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (!lo.a((Collection) this.f13463d)) {
            linkedHashSet.addAll(this.f13463d);
        }
        if (!lo.a((Collection) this.f13464e)) {
            linkedHashSet.addAll(this.f13464e);
        }
        String[] strArr = (String[]) this.f13474p.f12305a.a();
        if (strArr != null) {
            arrayList = new ArrayList();
            for (String str : strArr) {
                if (str == null || StringsKt.H(str)) {
                    str = null;
                }
                if (str != null) {
                    arrayList.add(str);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
        }
        String[] strArr2 = BuildConfig.DEFAULT_HOSTS;
        arrayList = new ArrayList();
        for (String str2 : strArr2) {
            if (str2 == null || StringsKt.H(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        linkedHashSet.addAll(arrayList);
        return new ArrayList(linkedHashSet);
    }

    public final List<String> l() {
        return this.f13464e;
    }

    public final List<String> m() {
        return this.f13463d;
    }

    public final boolean n() {
        return this.f13469k;
    }

    public final boolean o() {
        return this.f13470l;
    }

    @Override // io.appmetrica.analytics.impl.N5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public final String toString() {
        return "StartupRequestConfig{mStartupHostsFromStartup=" + this.f13463d + ", mStartupHostsFromClient=" + this.f13464e + ", mDistributionReferrer='" + this.f13465f + "', mInstallReferrerSource='" + this.f13466g + "', mClidsFromClient=" + this.f13467h + ", mNewCustomHosts=" + this.j + ", mHasNewCustomHosts=" + this.f13469k + ", mSuccessfulStartup=" + this.f13470l + ", mCountryInit='" + this.f13471m + "', mFirstStartupTime=" + this.f13472n + "} " + super.toString();
    }

    public C0058bm(C0309lg c0309lg, H7 h72) {
        this.f13468i = new C0445r3(null, S7.f12862c);
        this.f13472n = 0L;
        this.f13473o = c0309lg;
        this.f13474p = h72;
    }

    public final void a(List<String> list) {
        this.j = list;
    }

    public final void a(boolean z5) {
        this.f13469k = z5;
    }

    public final void a(String str) {
        this.f13471m = str;
    }
}
