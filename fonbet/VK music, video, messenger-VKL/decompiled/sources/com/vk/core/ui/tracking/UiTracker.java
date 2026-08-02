package com.vk.core.ui.tracking;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.vk.core.apps.BuildInfo;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeAwayItem;
import com.vk.stat.scheme.SchemeStat$TypeBackgroundItem;
import com.vk.stat.scheme.SchemeStat$TypeVideoBackgroundListeningItem;
import com.vk.stat.scheme.t0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import xsna.asp;
import xsna.bpn0;
import xsna.e43;
import xsna.el3;
import xsna.er6;
import xsna.fxp0;
import xsna.iy50;
import xsna.j0q0;
import xsna.l1q0;
import xsna.m0q0;
import xsna.m1q0;
import xsna.n0q0;
import xsna.r63;
import xsna.t1q0;
import xsna.uzp0;
import xsna.w0q0;
import xsna.zrp;

/* compiled from: UiTracker.kt */
/* loaded from: classes.dex */
public final class UiTracker {
    public static fxp0 b;
    public static r63 c;
    public static w0q0 f;
    public static final uzp0 h;
    public static final l1q0 i;
    public static final t1q0 j;
    public static final UiTracker a = new UiTracker();
    public static final bpn0 d = new bpn0(new er6(10));
    public static final a e = new a();
    public static final b g = new b();

    /* compiled from: UiTracker.kt */
    /* loaded from: classes17.dex */
    public static final class AwayParams {
        public final Type a;
        public final String b;
        public final SchemeStat$TypeAwayItem c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: UiTracker.kt */
        public static final class Type {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            public static final Type EXTERNAL_APP;
            public static final Type EXTERNAL_LINK;
            public static final Type NOTIFICATIONS_SETTINGS;
            public static final Type VKAPP;
            public static final Type VKME;
            public static final Type VOICE_SEARCH;

            static {
                Type type = new Type("EXTERNAL_APP", 0);
                EXTERNAL_APP = type;
                Type type2 = new Type("EXTERNAL_LINK", 1);
                EXTERNAL_LINK = type2;
                Type type3 = new Type("VKAPP", 2);
                VKAPP = type3;
                Type type4 = new Type("VKME", 3);
                VKME = type4;
                Type type5 = new Type("NOTIFICATIONS_SETTINGS", 4);
                NOTIFICATIONS_SETTINGS = type5;
                Type type6 = new Type("VOICE_SEARCH", 5);
                VOICE_SEARCH = type6;
                Type[] typeArr = {type, type2, type3, type4, type5, type6};
                $VALUES = typeArr;
                $ENTRIES = new asp(typeArr);
            }

            public Type() {
                throw null;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        public AwayParams(Type type, String str, SchemeStat$TypeAwayItem schemeStat$TypeAwayItem) {
            this.a = type;
            this.b = str;
            this.c = schemeStat$TypeAwayItem;
        }

        public final SchemeStat$TypeAwayItem a() {
            return this.c;
        }

        public final Type b() {
            return this.a;
        }

        public final String c() {
            return this.b;
        }
    }

    /* compiled from: UiTracker.kt */
    public static final class a {
        public final void a(Fragment fragment, Fragment fragment2, boolean z) {
            UiTracker.i.i(fragment, fragment2, z);
            t1q0 t1q0Var = UiTracker.j;
            t1q0Var.a.clear();
            t1q0Var.a = new WeakReference<>(fragment2);
        }

        public final void b(UiTrackingScreen uiTrackingScreen) {
            UiTracker uiTracker = UiTracker.a;
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            uzp0Var.b = uzp0.a.SYSTEM;
            if (uiTrackingScreen != null) {
                uzp0Var.c(uiTrackingScreen);
            }
        }
    }

    /* compiled from: UiTracker.kt */
    public static final class b implements w0q0.a {
        @Override // xsna.w0q0.a
        public final void a() {
            uzp0 uzp0Var = UiTracker.h;
            AwayParams awayParams = uzp0Var.e;
            if (awayParams != null) {
                uzp0Var.a(awayParams);
            }
            UiTrackingScreen uiTrackingScreen = uzp0.k;
            UiTrackingScreen uiTrackingScreen2 = UiTracker.j.b;
            if (uiTrackingScreen2 != null) {
                el3<j0q0> el3Var = uzp0Var.f;
                ArrayList arrayList = new ArrayList();
                el3Var.getClass();
                el3.a aVar = new el3.a();
                while (aVar.hasNext()) {
                    SchemeStat$TypeVideoBackgroundListeningItem b = ((j0q0) aVar.next()).b();
                    SchemeStat$TypeBackgroundItem a = b == null ? null : SchemeStat$TypeBackgroundItem.a.a(true, b);
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
                iy50 iy50Var = new iy50(uzp0Var.a);
                iy50Var.K(uiTrackingScreen2.f());
                MobileOfficialAppsCoreNavStat$EventScreen a2 = uiTrackingScreen.f().a();
                SchemeStat$EventItem c = uiTrackingScreen.f().c();
                SchemeStat$TypeBackgroundItem[] schemeStat$TypeBackgroundItemArr = (SchemeStat$TypeBackgroundItem[]) arrayList.toArray(new SchemeStat$TypeBackgroundItem[0]);
                iy50Var.E(new iy50.a(a2, c, e43.a(Arrays.copyOf(schemeStat$TypeBackgroundItemArr, schemeStat$TypeBackgroundItemArr.length))));
                iy50Var.x();
                iy50Var.q();
                uzp0Var.b(uiTrackingScreen2, uiTrackingScreen);
            }
            uzp0Var.c = uzp0.b.HIDDEN;
            uzp0Var.e = null;
        }

        @Override // xsna.w0q0.a
        public final void b() {
            boolean z;
            m0q0 m0q0Var;
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.e = null;
            if (uzp0Var.d) {
                UiTrackingScreen uiTrackingScreen = UiTracker.j.b;
                if (uiTrackingScreen != null) {
                    UiTrackingScreen b = UiTrackingScreen.b(uiTrackingScreen, null, null, 15);
                    WeakReference<m0q0> weakReference = b.c;
                    if (weakReference != null && (m0q0Var = weakReference.get()) != null) {
                        m0q0Var.y(b);
                    }
                    if (BuildInfo.h() && !b.c(uiTrackingScreen)) {
                        L l = L.a;
                        l.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l, L.LogType.e, new Object[]{"diff in " + b + " and " + uiTrackingScreen});
                        }
                    }
                    z = uzp0Var.d(b);
                } else {
                    z = false;
                }
                uzp0Var.d = true;
                uzp0Var.b = uzp0.a.APP_START;
                uzp0Var.c = z ? uzp0.b.SHOWN : uzp0.b.WAIT_FOR_VALID_SCREEN;
            }
        }
    }

    static {
        uzp0 uzp0Var = new uzp0();
        h = uzp0Var;
        i = new l1q0(uzp0Var);
        j = new t1q0();
    }

    public static void a(m1q0 m1q0Var) {
        h.j.add(m1q0Var);
    }

    public static void b() {
        l1q0 l1q0Var = i;
        l1q0Var.b = true;
        l1q0Var.c = true;
    }

    public static MobileOfficialAppsCoreNavStat$EventScreen c() {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
        UiTrackingScreen uiTrackingScreen = j.b;
        return (uiTrackingScreen == null || (mobileOfficialAppsCoreNavStat$EventScreen = uiTrackingScreen.a) == null) ? MobileOfficialAppsCoreNavStat$EventScreen.NOWHERE : mobileOfficialAppsCoreNavStat$EventScreen;
    }

    public static String d() {
        return t0.a(c());
    }

    public static com.vk.core.ui.tracking.b e() {
        return (com.vk.core.ui.tracking.b) d.getValue();
    }

    public static a f(Activity activity) {
        L.e("get tracking listener on activity=" + activity);
        return e;
    }

    public static void g(m1q0 m1q0Var) {
        h.j.remove(m1q0Var);
    }

    public static void h(n0q0 n0q0Var) {
        l1q0 l1q0Var = i;
        if (l1q0Var.c()) {
            boolean z = l1q0Var.b;
            l1q0Var.b = false;
            if (z) {
                return;
            }
            l1q0Var.f(e().g(n0q0Var), true);
        }
    }

    public static void i(String str, boolean z) {
        l1q0 l1q0Var = i;
        if (z) {
            l1q0Var.g();
            return;
        }
        UiTrackingScreen uiTrackingScreen = new UiTrackingScreen(MobileOfficialAppsCoreNavStat$EventScreen.BROWSER);
        if (str != null) {
            uiTrackingScreen.f = new SchemeStat$EventItem(SchemeStat$EventItem.Type.BROWSER, null, null, str, null, null);
        }
        l1q0Var.j(uiTrackingScreen, true);
    }
}
