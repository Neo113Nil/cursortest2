package n30;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m90.C8110a;
import org.jetbrains.annotations.NotNull;

/* renamed from: n30.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8438b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C8110a f76467a;

    public C8438b(@NotNull C8110a tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f76467a = tracker;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(C8438b c8438b, String url, boolean z11, String str, List list, int i11) {
        if ((i11 & 4) != 0) {
            str = null;
        }
        if ((i11 & 8) != 0) {
            list = null;
        }
        c8438b.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        c8438b.f76467a.endTotalTimeTrace(url, z11, str, list);
    }

    public static void d(C8438b c8438b, C8110a.EnumC1263a action, String str, String str2, String str3) {
        c8438b.getClass();
        Intrinsics.checkNotNullParameter(action, "action");
        c8438b.f76467a.sendEvent(action, str, str2, "", null, str3, null);
    }

    public final void b(@NotNull String url, @NotNull String pageType) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(pageType, "pageType");
        this.f76467a.beginTotalTimeTrace(url, pageType);
    }

    public final void c() {
        this.f76467a.sendAllPerfAnalytics();
    }

    public final void e() {
        C8110a.sendEvent$default(this.f76467a, C8110a.EnumC1263a.CLICK, "0", "ui", null, null, "fintech.offline.main.support.call", null, 88, null);
    }

    public final void f() {
        C8110a.sendEvent$default(this.f76467a, C8110a.EnumC1263a.CLICK, "0", "ui", null, null, "fintech.offline.send.next.button", null, 88, null);
    }

    public final void g(@NotNull C8437a page) {
        Intrinsics.checkNotNullParameter(page, "page");
        String a11 = page.a();
        if (a11 != null) {
            C8110a c8110a = this.f76467a;
            c8110a.setPageView(a11);
            c8110a.sendPageView();
            c8110a.dispatch();
        }
    }

    public final void h(int i11, @NotNull String selectedTabName) {
        Intrinsics.checkNotNullParameter(selectedTabName, "selectedTabName");
        C8110a.sendEvent$default(this.f76467a, C8110a.EnumC1263a.CLICK, String.valueOf(i11), "ui", selectedTabName, null, "fintech.tabbar", null, 80, null);
    }

    public final void i(String str) {
        this.f76467a.updateUserId(str);
    }
}
