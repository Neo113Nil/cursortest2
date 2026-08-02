package com.vk.superapp.verification.account;

import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vkontakte.android.R;
import java.util.List;
import xsna.epx;
import xsna.ho8;
import xsna.ms9;
import xsna.shy;
import xsna.urd0;

/* compiled from: VkVerificationAccountContentState.kt */
/* loaded from: classes6.dex */
public abstract class b {
    public final int a;
    public final int b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;
    public final SchemeStatSak$EventScreen g;

    /* compiled from: VkVerificationAccountContentState.kt */
    public static final class a extends b {
        public final String h;
        public final String i;

        public a(String str, String str2) {
            super(R.string.vk_verification_account_connect_request_title, R.string.vk_verification_account_connect_request_subtitle, Integer.valueOf(R.drawable.vk_icon_user_square_outline_56), Integer.valueOf(R.attr.vk_ui_icon_accent), Integer.valueOf(R.string.vk_verification_account_link), Integer.valueOf(R.string.vk_verification_account_cancel), SchemeStatSak$EventScreen.CONNECT_ACCOUNTS_VKID_OAUTH_START);
            this.h = str;
            this.i = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i);
        }

        public final int hashCode() {
            return this.i.hashCode() + (this.h.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ConnectRequest(vkidAccountName=");
            sb.append(this.h);
            sb.append(", esiaAccountName=");
            return ho8.a(sb, this.i, ')');
        }
    }

    /* compiled from: VkVerificationAccountContentState.kt */
    /* renamed from: com.vk.superapp.verification.account.b$b, reason: collision with other inner class name */
    public static final class C1911b extends b {
        public final List<f> h;

        public C1911b(int i, int i2, List<f> list) {
            super(R.string.vk_verification_account_data_not_match_title, i, Integer.valueOf(R.drawable.vk_icon_error_outline_56), Integer.valueOf(R.attr.vk_ui_accent_orange), Integer.valueOf(i2), Integer.valueOf(R.string.vk_verification_account_leave_unchanged), SchemeStatSak$EventScreen.REQUEST_SYNCHRONIZE_DATA_VKID_OAUTH);
            this.h = list;
        }
    }

    /* compiled from: VkVerificationAccountContentState.kt */
    public static final class c extends b {
        public final List<f> h;

        public c(List<f> list) {
            super(R.string.vk_verification_account_data_will_change_title, R.string.vk_verification_account_data_will_change_subtitle, Integer.valueOf(R.drawable.vk_icon_error_outline_56), Integer.valueOf(R.attr.vk_ui_accent_orange), Integer.valueOf(R.string.vk_verification_account_sync), SchemeStatSak$EventScreen.REQUEST_SYNCHRONIZE_DATA_VKID_OAUTH, 32);
            this.h = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.h, ((c) obj).h);
        }

        public final int hashCode() {
            return this.h.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("DataWillChange(migrationItems="), this.h);
        }
    }

    /* compiled from: VkVerificationAccountContentState.kt */
    public static final class d extends b {
        public static final d h = new d(R.string.vk_verification_account_link_esia_title, R.string.vk_verification_account_verificate_esia_subtitle, Integer.valueOf(R.drawable.vk_icon_logo_gosuslugi_color_56), null, Integer.valueOf(R.string.vk_auth_continue), SchemeStatSak$EventScreen.ONBOARDING_VERIFICATION, 32);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -2034343384;
        }

        public final String toString() {
            return "EduLinkEsiaAccount";
        }
    }

    /* compiled from: VkVerificationAccountContentState.kt */
    public static final class e extends b {
        public e(int i) {
            super(i, R.string.vk_verification_account_account_is_busy_subtitile, Integer.valueOf(R.drawable.vk_icon_cancel_circle_outline_56), Integer.valueOf(R.attr.vk_ui_icon_negative), Integer.valueOf(R.string.vk_verification_account_go_to_support), Integer.valueOf(R.string.vk_verification_account_close), SchemeStatSak$EventScreen.OAUTH_LINKED_TO_ANOTHER_VKID);
        }
    }

    /* compiled from: VkVerificationAccountContentState.kt */
    public static final class f {
        public final String a;
        public final int b;
        public final String c;
        public final String d;

        public f(String str, int i, String str2, String str3) {
            this.a = str;
            this.b = i;
            this.c = str2;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.a, fVar.a) && this.b == fVar.b && this.c.equals(fVar.c) && this.d.equals(fVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + urd0.a(shy.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MigrationData(oldValue=");
            sb.append(this.a);
            sb.append(", defaultOldValueResId=");
            sb.append(this.b);
            sb.append(", newValue=");
            sb.append(this.c);
            sb.append(", statsName=");
            return ho8.a(sb, this.d, ')');
        }
    }

    /* compiled from: VkVerificationAccountContentState.kt */
    public static final class g extends b {
        public g(int i) {
            super(i, R.string.vk_verification_account_not_available_subtitle, Integer.valueOf(R.drawable.vk_icon_error_outline_56), Integer.valueOf(R.attr.vk_ui_icon_negative), (Integer) null, SchemeStatSak$EventScreen.VERIFICATION_ERROR_CONNECTION, 16);
        }
    }

    /* compiled from: VkVerificationAccountContentState.kt */
    public static final class h extends b {
        public h(int i, Integer num) {
            super(i, R.string.vk_verification_account_account_not_verified_subtitile, Integer.valueOf(R.drawable.vk_icon_cancel_circle_outline_56), Integer.valueOf(R.attr.vk_ui_icon_negative), num, Integer.valueOf(R.string.vk_verification_account_close), SchemeStatSak$EventScreen.OAUTH_NOT_VERIFIED);
        }
    }

    /* compiled from: VkVerificationAccountContentState.kt */
    public interface i {
        l a();

        h b();

        e c();

        C1911b d(List<f> list);

        g e();
    }

    /* compiled from: VkVerificationAccountContentState.kt */
    public static final class j extends b {
        public static final j h = new j(0, 0, 0, 0, 0, 0, SchemeStatSak$EventScreen.NOWHERE);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 512148818;
        }

        public final String toString() {
            return "StubState";
        }
    }

    /* compiled from: VkVerificationAccountContentState.kt */
    public static final class k extends b {
        public static final k h = new k(R.string.vk_verification_account_successful_verification_titile, R.string.vk_verification_account_successful_verification_subtitile, Integer.valueOf(R.drawable.vk_icon_check_circle_outline_56), Integer.valueOf(R.attr.vk_ui_accent_green), Integer.valueOf(R.string.vk_verification_account_successful_verification_approve), SchemeStatSak$EventScreen.CONNECT_ACCOUNTS_VKID_OAUTH_SUCCESS, 32);
    }

    /* compiled from: VkVerificationAccountContentState.kt */
    public static final class l extends b {
        public l(int i) {
            super(R.string.vk_verification_account_not_completed_title, i, (Integer) null, (Integer) null, Integer.valueOf(R.string.vk_verification_account_retry), Integer.valueOf(R.string.vk_verification_account_close), SchemeStatSak$EventScreen.OAUTH_ACTIVATED_SUCCESS);
        }
    }

    public /* synthetic */ b(int i2, int i3, Integer num, Integer num2, Integer num3, SchemeStatSak$EventScreen schemeStatSak$EventScreen, int i4) {
        this(i2, i3, num, num2, (i4 & 16) != 0 ? null : num3, (i4 & 32) != 0 ? null : Integer.valueOf(R.string.vk_verification_account_close), schemeStatSak$EventScreen);
    }

    public b(int i2, int i3, Integer num, Integer num2, Integer num3, Integer num4, SchemeStatSak$EventScreen schemeStatSak$EventScreen) {
        this.a = i2;
        this.b = i3;
        this.c = num;
        this.d = num2;
        this.e = num3;
        this.f = num4;
        this.g = schemeStatSak$EventScreen;
    }
}
