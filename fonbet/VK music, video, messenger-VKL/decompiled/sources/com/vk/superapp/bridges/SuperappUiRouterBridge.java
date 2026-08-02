package com.vk.superapp.bridges;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import com.vk.dto.common.id.UserId;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.api.dto.app.WebLeaderboardData;
import com.vk.superapp.api.dto.clips.WebClipBox;
import com.vk.superapp.api.dto.group.WebGroup;
import com.vk.superapp.api.dto.user.WebUserShortInfo;
import com.vk.superapp.bridges.dto.VkAlertData;
import com.vk.superapp.browser.internal.utils.VkWebFileChooserImpl;
import com.vk.superapp.verification.account.VerificationFlow;
import defpackage.l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import xsna.aex0;
import xsna.asp;
import xsna.bqu0;
import xsna.co0;
import xsna.e1s0;
import xsna.epx;
import xsna.g5i;
import xsna.gzs;
import xsna.ho8;
import xsna.i6m0;
import xsna.ihx0;
import xsna.im80;
import xsna.izs;
import xsna.kld0;
import xsna.l5g0;
import xsna.maj;
import xsna.mk;
import xsna.nex0;
import xsna.p8u0;
import xsna.pnr0;
import xsna.q7j0;
import xsna.qjo0;
import xsna.r8r0;
import xsna.rr1;
import xsna.s3q0;
import xsna.tsk0;
import xsna.ufg0;
import xsna.urd0;
import xsna.vbr0;
import xsna.vf1;
import xsna.wbr0;
import xsna.wzb0;
import xsna.zhx0;
import xsna.zrp;
import xsna.zu1;

/* compiled from: SuperappUiRouterBridge.kt */
/* loaded from: classes11.dex */
public interface SuperappUiRouterBridge {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SuperappUiRouterBridge.kt */
    /* loaded from: classes6.dex */
    public static final class Permission {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Permission[] $VALUES;
        public static final Permission CAMERA;
        public static final Permission CAMERA_AND_DISK;
        public static final Permission CAMERA_QR;
        public static final Permission CAMERA_VMOJI;
        public static final Permission DISK;

        static {
            Permission permission = new Permission("CAMERA", 0);
            CAMERA = permission;
            Permission permission2 = new Permission("CAMERA_QR", 1);
            CAMERA_QR = permission2;
            Permission permission3 = new Permission("CAMERA_VMOJI", 2);
            CAMERA_VMOJI = permission3;
            Permission permission4 = new Permission("CAMERA_AND_DISK", 3);
            CAMERA_AND_DISK = permission4;
            Permission permission5 = new Permission("DISK", 4);
            DISK = permission5;
            Permission[] permissionArr = {permission, permission2, permission3, permission4, permission5};
            $VALUES = permissionArr;
            $ENTRIES = new asp(permissionArr);
        }

        public Permission() {
            throw null;
        }

        public static Permission valueOf(String str) {
            return (Permission) Enum.valueOf(Permission.class, str);
        }

        public static Permission[] values() {
            return (Permission[]) $VALUES.clone();
        }
    }

    /* compiled from: SuperappUiRouterBridge.kt */
    /* loaded from: classes6.dex */
    public static abstract class a {

        /* compiled from: SuperappUiRouterBridge.kt */
        /* renamed from: com.vk.superapp.bridges.SuperappUiRouterBridge$a$a, reason: collision with other inner class name */
        public static final class C1869a extends a {
            public static final C1869a a = new C1869a();
        }

        /* compiled from: SuperappUiRouterBridge.kt */
        public static final class b extends a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 640594035;
            }

            public final String toString() {
                return "GlobalNotifications";
            }
        }

        /* compiled from: SuperappUiRouterBridge.kt */
        public static final class c extends a {
            public final WebGroup a;

            public c(WebGroup webGroup) {
                this.a = webGroup;
            }

            public final WebGroup a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "GroupJoin(group=" + this.a + ')';
            }
        }

        /* compiled from: SuperappUiRouterBridge.kt */
        public static final class d extends a {
            public final WebGroup a;

            public d(WebGroup webGroup) {
                this.a = webGroup;
            }

            public final WebGroup a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "GroupMessage(group=" + this.a + ')';
            }
        }

        /* compiled from: SuperappUiRouterBridge.kt */
        public static final class e extends a {
            public final String a;
            public final String b;
            public final String c;

            public e(String str, String str2, String str3) {
                this.a = str;
                this.b = str2;
                this.c = str3;
            }

            public final String a() {
                return this.a;
            }

            public final String b() {
                return this.c;
            }

            public final String c() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("HomeScreenShortcut(imageUrl=");
                sb.append(this.a);
                sb.append(", title=");
                sb.append(this.b);
                sb.append(", subTitle=");
                return ho8.a(sb, this.c, ')');
            }
        }

        /* compiled from: SuperappUiRouterBridge.kt */
        public static final class f extends a {
            public static final f a = new f();
        }

        /* compiled from: SuperappUiRouterBridge.kt */
        public static final class g extends a {
            public static final g a = new g();
        }

        /* compiled from: SuperappUiRouterBridge.kt */
        public static final class h extends a {
            public final String a;
            public final String b;

            public h(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final String a() {
                return this.b;
            }

            public final String b() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return epx.f(this.a, hVar.a) && epx.f(this.b, hVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Recommendation(title=");
                sb.append(this.a);
                sb.append(", subtitle=");
                return ho8.a(sb, this.b, ')');
            }
        }
    }

    /* compiled from: SuperappUiRouterBridge.kt */
    /* loaded from: classes6.dex */
    public static final class b {
        public static s3q0 a() {
            return s3q0.a;
        }

        public static /* synthetic */ void b(SuperappUiRouterBridge superappUiRouterBridge, Context context, WebApiApplication webApiApplication, nex0 nex0Var, String str, String str2, Integer num, String str3, int i) {
            if ((i & 8) != 0) {
                str = null;
            }
            if ((i & 16) != 0) {
                str2 = null;
            }
            if ((i & 32) != 0) {
                num = null;
            }
            if ((i & 64) != 0) {
                str3 = null;
            }
            superappUiRouterBridge.k(context, webApiApplication, nex0Var, str, str2, num, str3, (i & 128) == 0);
        }
    }

    /* compiled from: SuperappUiRouterBridge.kt */
    /* loaded from: classes6.dex */
    public interface c {
        void dismiss();
    }

    /* compiled from: SuperappUiRouterBridge.kt */
    /* loaded from: classes6.dex */
    public interface d {
        void a(VkAlertData.a aVar);

        void onDismiss();
    }

    /* compiled from: SuperappUiRouterBridge.kt */
    /* loaded from: classes6.dex */
    public interface e {
        void a();

        void b();
    }

    /* compiled from: SuperappUiRouterBridge.kt */
    /* loaded from: classes6.dex */
    public interface f {
        void a();

        void b();

        void onSuccess();
    }

    /* compiled from: SuperappUiRouterBridge.kt */
    /* loaded from: classes6.dex */
    public interface g {
        void a(ArrayList arrayList);

        void b(ArrayList arrayList, List list);
    }

    void A(long j);

    boolean B(WebView webView);

    void C(Context context, String str, List<String> list);

    void D(int i, Context context);

    void E(Context context, String str);

    Fragment F(WebApiApplication webApiApplication, String str, String str2, String str3);

    void G(String str, VerificationFlow verificationFlow);

    void H(List list);

    io.reactivex.rxjava3.disposables.c I(JSONObject jSONObject, zhx0 zhx0Var, ufg0 ufg0Var);

    void J(WebGroup webGroup, LinkedHashMap linkedHashMap, zu1 zu1Var, com.vk.newsfeed.common.recycler.holders.attachments.a aVar);

    void K(mk mkVar, maj majVar);

    void L(Activity activity);

    void M(Context context, UserId userId, Map<String, String> map) throws IllegalStateException;

    void N(int i);

    void O(Activity activity, VkAlertData vkAlertData, d dVar);

    VkWebFileChooserImpl P(Fragment fragment);

    void Q(Context context);

    void R(Activity activity, VkAlertData.b bVar, rr1 rr1Var);

    c S(Activity activity, Rect rect, wzb0 wzb0Var);

    boolean T(long j, String str, String str2, boolean z, boolean z2);

    void U(String str);

    void V(Context context, Map map);

    void W(WebApiApplication webApiApplication, String str);

    void X(Context context, String str, izs<? super String, s3q0> izsVar, gzs<s3q0> gzsVar, Map<String, String> map);

    void Y(String str, String str2, String str3);

    void Z(String str, WebUserShortInfo webUserShortInfo, WebApiApplication webApiApplication, wbr0 wbr0Var);

    void a(WebApiApplication webApiApplication, int i, int i2, im80 im80Var, e1s0 e1s0Var, pnr0 pnr0Var, Context context);

    void a0(Context context);

    boolean b(long j);

    void b0(Context context);

    void c(VkAlertData vkAlertData, d dVar);

    void c0(long j, WebApiApplication webApiApplication, f fVar, Integer num, nex0 nex0Var);

    void d(Context context);

    void d0(String str, r8r0 r8r0Var);

    Long e();

    void e0(aex0 aex0Var);

    void f(long j, String str);

    Object f0(long j);

    void g(WebApiApplication webApiApplication, String str, q7j0 q7j0Var, String str2);

    void g0(a aVar, aex0.d dVar);

    ViewGroup h(long j, LayoutInflater layoutInflater, ViewGroup viewGroup, qjo0 qjo0Var);

    void h0(Context context, String str, Map<String, String> map);

    void i(WebLeaderboardData webLeaderboardData, kld0 kld0Var, i6m0 i6m0Var);

    void i0(Context context, UserId userId);

    void j(String str);

    void j0(String str, String str2, vbr0 vbr0Var);

    void k(Context context, WebApiApplication webApiApplication, nex0 nex0Var, String str, String str2, Integer num, String str3, boolean z);

    void k0(Permission permission, e eVar);

    boolean l(String str);

    void l0(l5g0 l5g0Var, l lVar);

    c m(Activity activity, Rect rect, vf1 vf1Var);

    io.reactivex.rxjava3.disposables.c m0(WebClipBox webClipBox, Long l, String str);

    void n(boolean z);

    boolean n0(int i, ArrayList arrayList);

    void o(Context context);

    void o0(List list, ArrayList arrayList, g gVar);

    boolean p();

    c p0(Activity activity, Rect rect, tsk0 tsk0Var);

    boolean q(String str);

    void q0(co0 co0Var);

    void r(Context context);

    void r0(Context context);

    boolean s(int i, long j, boolean z, gzs<s3q0> gzsVar);

    List<UserId> s0(Intent intent);

    boolean t(ihx0 ihx0Var);

    void t0(Context context);

    p8u0 u(Context context, boolean z);

    boolean v(ihx0 ihx0Var, String str);

    void w(String str, String str2, String str3);

    bqu0 x(boolean z);

    void y(g5i g5iVar);

    void z(String str);
}
