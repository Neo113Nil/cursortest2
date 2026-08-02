package ru.ozon.fintech.analytic.models;

import B90.C2616s;
import B90.C2618u;
import G.g;
import I1.w;
import N3.C3660k;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u0011\u0010 \u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0006HÆ\u0003J\u0087\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\f\u001a\u00020\u00032\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0006HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0007HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016¨\u0006,"}, d2 = {"Lru/ozon/fintech/analytic/models/HealthApplicationInfo;", "", "app", "", "appAlias", "appVer", "", "", "extLibs", "Lru/ozon/fintech/analytic/models/HealthExtLib;", "lib", "libVer", "store", "webviewVer", "widgets", "Lru/ozon/fintech/analytic/models/HealthWidget;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getApp", "()Ljava/lang/String;", "getAppAlias", "getAppVer", "()Ljava/util/List;", "getExtLibs", "getLib", "getLibVer", "getStore", "getWebviewVer", "getWidgets", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "fintech-analytic_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HealthApplicationInfo {

    @i(name = "app")
    @NotNull
    private final String app;

    @i(name = "app_alias")
    @NotNull
    private final String appAlias;

    @i(name = "app_ver")
    @NotNull
    private final List<Integer> appVer;

    @i(name = "ext_libs")
    private final List<HealthExtLib> extLibs;

    @i(name = "lib")
    @NotNull
    private final String lib;

    @i(name = "lib_ver")
    @NotNull
    private final List<Integer> libVer;

    @i(name = "store")
    @NotNull
    private final String store;

    @i(name = "webview_ver")
    private final List<Integer> webviewVer;

    @i(name = "widgets")
    private final List<HealthWidget> widgets;

    public HealthApplicationInfo(@NotNull String app, @NotNull String appAlias, @NotNull List<Integer> appVer, List<HealthExtLib> list, @NotNull String lib, @NotNull List<Integer> libVer, @NotNull String store, List<Integer> list2, List<HealthWidget> list3) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(appAlias, "appAlias");
        Intrinsics.checkNotNullParameter(appVer, "appVer");
        Intrinsics.checkNotNullParameter(lib, "lib");
        Intrinsics.checkNotNullParameter(libVer, "libVer");
        Intrinsics.checkNotNullParameter(store, "store");
        this.app = app;
        this.appAlias = appAlias;
        this.appVer = appVer;
        this.extLibs = list;
        this.lib = lib;
        this.libVer = libVer;
        this.store = store;
        this.webviewVer = list2;
        this.widgets = list3;
    }

    public static /* synthetic */ HealthApplicationInfo copy$default(HealthApplicationInfo healthApplicationInfo, String str, String str2, List list, List list2, String str3, List list3, String str4, List list4, List list5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = healthApplicationInfo.app;
        }
        if ((i11 & 2) != 0) {
            str2 = healthApplicationInfo.appAlias;
        }
        if ((i11 & 4) != 0) {
            list = healthApplicationInfo.appVer;
        }
        if ((i11 & 8) != 0) {
            list2 = healthApplicationInfo.extLibs;
        }
        if ((i11 & 16) != 0) {
            str3 = healthApplicationInfo.lib;
        }
        if ((i11 & 32) != 0) {
            list3 = healthApplicationInfo.libVer;
        }
        if ((i11 & 64) != 0) {
            str4 = healthApplicationInfo.store;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            list4 = healthApplicationInfo.webviewVer;
        }
        if ((i11 & 256) != 0) {
            list5 = healthApplicationInfo.widgets;
        }
        List list6 = list4;
        List list7 = list5;
        List list8 = list3;
        String str5 = str4;
        String str6 = str3;
        List list9 = list;
        return healthApplicationInfo.copy(str, str2, list9, list2, str6, list8, str5, list6, list7);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getApp() {
        return this.app;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getAppAlias() {
        return this.appAlias;
    }

    @NotNull
    public final List<Integer> component3() {
        return this.appVer;
    }

    public final List<HealthExtLib> component4() {
        return this.extLibs;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getLib() {
        return this.lib;
    }

    @NotNull
    public final List<Integer> component6() {
        return this.libVer;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getStore() {
        return this.store;
    }

    public final List<Integer> component8() {
        return this.webviewVer;
    }

    public final List<HealthWidget> component9() {
        return this.widgets;
    }

    @NotNull
    public final HealthApplicationInfo copy(@NotNull String app, @NotNull String appAlias, @NotNull List<Integer> appVer, List<HealthExtLib> extLibs, @NotNull String lib, @NotNull List<Integer> libVer, @NotNull String store, List<Integer> webviewVer, List<HealthWidget> widgets) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(appAlias, "appAlias");
        Intrinsics.checkNotNullParameter(appVer, "appVer");
        Intrinsics.checkNotNullParameter(lib, "lib");
        Intrinsics.checkNotNullParameter(libVer, "libVer");
        Intrinsics.checkNotNullParameter(store, "store");
        return new HealthApplicationInfo(app, appAlias, appVer, extLibs, lib, libVer, store, webviewVer, widgets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthApplicationInfo)) {
            return false;
        }
        HealthApplicationInfo healthApplicationInfo = (HealthApplicationInfo) other;
        return Intrinsics.d(this.app, healthApplicationInfo.app) && Intrinsics.d(this.appAlias, healthApplicationInfo.appAlias) && Intrinsics.d(this.appVer, healthApplicationInfo.appVer) && Intrinsics.d(this.extLibs, healthApplicationInfo.extLibs) && Intrinsics.d(this.lib, healthApplicationInfo.lib) && Intrinsics.d(this.libVer, healthApplicationInfo.libVer) && Intrinsics.d(this.store, healthApplicationInfo.store) && Intrinsics.d(this.webviewVer, healthApplicationInfo.webviewVer) && Intrinsics.d(this.widgets, healthApplicationInfo.widgets);
    }

    @NotNull
    public final String getApp() {
        return this.app;
    }

    @NotNull
    public final String getAppAlias() {
        return this.appAlias;
    }

    @NotNull
    public final List<Integer> getAppVer() {
        return this.appVer;
    }

    public final List<HealthExtLib> getExtLibs() {
        return this.extLibs;
    }

    @NotNull
    public final String getLib() {
        return this.lib;
    }

    @NotNull
    public final List<Integer> getLibVer() {
        return this.libVer;
    }

    @NotNull
    public final String getStore() {
        return this.store;
    }

    public final List<Integer> getWebviewVer() {
        return this.webviewVer;
    }

    public final List<HealthWidget> getWidgets() {
        return this.widgets;
    }

    public int hashCode() {
        int b11 = g.b(g.a(this.app.hashCode() * 31, 31, this.appAlias), 31, this.appVer);
        List<HealthExtLib> list = this.extLibs;
        int a11 = g.a(g.b(g.a((b11 + (list == null ? 0 : list.hashCode())) * 31, 31, this.lib), 31, this.libVer), 31, this.store);
        List<Integer> list2 = this.webviewVer;
        int hashCode = (a11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<HealthWidget> list3 = this.widgets;
        return hashCode + (list3 != null ? list3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.app;
        String str2 = this.appAlias;
        List<Integer> list = this.appVer;
        List<HealthExtLib> list2 = this.extLibs;
        String str3 = this.lib;
        List<Integer> list3 = this.libVer;
        String str4 = this.store;
        List<Integer> list4 = this.webviewVer;
        List<HealthWidget> list5 = this.widgets;
        StringBuilder d11 = C3660k.d("HealthApplicationInfo(app=", str, ", appAlias=", str2, ", appVer=");
        C2616s.g(", extLibs=", ", lib=", d11, list, list2);
        w.d(str3, ", libVer=", ", store=", d11, list3);
        w.d(str4, ", webviewVer=", ", widgets=", d11, list4);
        return C2618u.h(d11, list5, ")");
    }

    public /* synthetic */ HealthApplicationInfo(String str, String str2, List list, List list2, String str3, List list3, String str4, List list4, List list5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, (i11 & 8) != 0 ? null : list2, str3, list3, str4, list4, (i11 & 256) != 0 ? null : list5);
    }
}
