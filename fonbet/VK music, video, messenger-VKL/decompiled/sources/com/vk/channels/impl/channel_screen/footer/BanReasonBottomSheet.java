package com.vk.channels.impl.channel_screen.footer;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.q0;
import xsna.bhu0;
import xsna.cp10;
import xsna.cri;
import xsna.d370;
import xsna.dt1;
import xsna.epx;
import xsna.f870;
import xsna.f9t;
import xsna.g06;
import xsna.gcv;
import xsna.gzs;
import xsna.h06;
import xsna.hr80;
import xsna.ja8;
import xsna.k9q0;
import xsna.kai;
import xsna.l71;
import xsna.lg90;
import xsna.lr;
import xsna.n34;
import xsna.na;
import xsna.nr;
import xsna.oe7;
import xsna.pg90;
import xsna.q630;
import xsna.qoy;
import xsna.qri;
import xsna.qzu0;
import xsna.re7;
import xsna.rrv0;
import xsna.s200;
import xsna.se7;
import xsna.sy90;
import xsna.txj0;
import xsna.ty6;
import xsna.ur;
import xsna.urd0;
import xsna.vjw;
import xsna.vog0;
import xsna.vpi;
import xsna.vu5;
import xsna.wkj;
import xsna.wlb0;
import xsna.yqv0;
import xsna.yya;
import xsna.z42;
import xsna.zcl;

/* compiled from: BanReasonBottomSheet.kt */
/* loaded from: classes16.dex */
public final class BanReasonBottomSheet extends vpi {
    public static final a g1 = new a();

    /* compiled from: BanReasonBottomSheet.kt */
    public static abstract class Params implements Parcelable {
        public final Integer b;
        public final String c;
        public final boolean d;

        /* compiled from: BanReasonBottomSheet.kt */
        public static final class PermanentBan extends Params {
            public static final Parcelable.Creator<PermanentBan> CREATOR = new a();
            public final Integer e;
            public final String f;
            public final boolean g;

            /* compiled from: BanReasonBottomSheet.kt */
            public static final class a implements Parcelable.Creator<PermanentBan> {
                @Override // android.os.Parcelable.Creator
                public final PermanentBan createFromParcel(Parcel parcel) {
                    return new PermanentBan(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final PermanentBan[] newArray(int i) {
                    return new PermanentBan[i];
                }
            }

            public PermanentBan(Integer num, String str, boolean z) {
                super(num, str, z, null);
                this.e = num;
                this.f = str;
                this.g = z;
            }

            @Override // com.vk.channels.impl.channel_screen.footer.BanReasonBottomSheet.Params
            public final String d() {
                return this.f;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.vk.channels.impl.channel_screen.footer.BanReasonBottomSheet.Params
            public final Integer e() {
                return this.e;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PermanentBan)) {
                    return false;
                }
                PermanentBan permanentBan = (PermanentBan) obj;
                return epx.f(this.e, permanentBan.e) && epx.f(this.f, permanentBan.f) && this.g == permanentBan.g;
            }

            @Override // com.vk.channels.impl.channel_screen.footer.BanReasonBottomSheet.Params
            public final boolean f() {
                return this.g;
            }

            public final int hashCode() {
                Integer num = this.e;
                return Boolean.hashCode(this.g) + urd0.a((num == null ? 0 : num.hashCode()) * 31, 31, this.f);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("PermanentBan(reasonResId=");
                sb.append(this.e);
                sb.append(", comment=");
                sb.append(this.f);
                sb.append(", isChannelsToCommunitiesRenamed=");
                return q0.a(sb, this.g, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                Integer num = this.e;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    nr.a(parcel, 1, num);
                }
                parcel.writeString(this.f);
                parcel.writeInt(this.g ? 1 : 0);
            }
        }

        /* compiled from: BanReasonBottomSheet.kt */
        public static final class TemporaryBan extends Params {
            public static final Parcelable.Creator<TemporaryBan> CREATOR = new a();
            public final Integer e;
            public final String f;
            public final boolean g;
            public final int h;

            /* compiled from: BanReasonBottomSheet.kt */
            public static final class a implements Parcelable.Creator<TemporaryBan> {
                @Override // android.os.Parcelable.Creator
                public final TemporaryBan createFromParcel(Parcel parcel) {
                    return new TemporaryBan(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0, parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final TemporaryBan[] newArray(int i) {
                    return new TemporaryBan[i];
                }
            }

            public TemporaryBan(Integer num, String str, boolean z, int i) {
                super(num, str, z, null);
                this.e = num;
                this.f = str;
                this.g = z;
                this.h = i;
            }

            @Override // com.vk.channels.impl.channel_screen.footer.BanReasonBottomSheet.Params
            public final String d() {
                return this.f;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.vk.channels.impl.channel_screen.footer.BanReasonBottomSheet.Params
            public final Integer e() {
                return this.e;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TemporaryBan)) {
                    return false;
                }
                TemporaryBan temporaryBan = (TemporaryBan) obj;
                return epx.f(this.e, temporaryBan.e) && epx.f(this.f, temporaryBan.f) && this.g == temporaryBan.g && this.h == temporaryBan.h;
            }

            @Override // com.vk.channels.impl.channel_screen.footer.BanReasonBottomSheet.Params
            public final boolean f() {
                return this.g;
            }

            public final int hashCode() {
                Integer num = this.e;
                return Integer.hashCode(this.h) + qoy.b(urd0.a((num == null ? 0 : num.hashCode()) * 31, 31, this.f), 31, this.g);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("TemporaryBan(reasonResId=");
                sb.append(this.e);
                sb.append(", comment=");
                sb.append(this.f);
                sb.append(", isChannelsToCommunitiesRenamed=");
                sb.append(this.g);
                sb.append(", endDate=");
                return vu5.b(sb, this.h, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                Integer num = this.e;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    nr.a(parcel, 1, num);
                }
                parcel.writeString(this.f);
                parcel.writeInt(this.g ? 1 : 0);
                parcel.writeInt(this.h);
            }
        }

        public Params(Integer num, String str, boolean z, zcl zclVar) {
            this.b = num;
            this.c = str;
            this.d = z;
        }

        public String d() {
            return this.c;
        }

        public Integer e() {
            return this.b;
        }

        public boolean f() {
            return this.d;
        }
    }

    /* compiled from: BanReasonBottomSheet.kt */
    public static final class a {
    }

    @Override // xsna.vpi
    public final void Zn(int i, androidx.compose.runtime.a aVar) {
        Parcelable parcelable;
        Object parcelable2;
        androidx.compose.runtime.a M = aVar.M(1065908884);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1065908884, i2, -1, "com.vk.channels.impl.channel_screen.footer.BanReasonBottomSheet.Content (BanReasonBottomSheet.kt:38)");
            }
            Bundle requireArguments = requireArguments();
            String simpleName = Params.class.getSimpleName();
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = requireArguments.getParcelable(simpleName, Params.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = requireArguments.getParcelable(simpleName);
                if (!(parcelable3 instanceof Params)) {
                    parcelable3 = null;
                }
                parcelable = (Params) parcelable3;
            }
            if (parcelable == null) {
                throw new IllegalStateException("Required value was null.");
            }
            rrv0.d(null, null, null, null, kai.c(951434959, new g06(0, this, (Params) parcelable), M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new l71(this, i, 1);
        }
    }

    public final void co(Params params, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        cri.a.e eVar;
        ColorFilter porterDuffColorFilter;
        int i2;
        String string;
        LayoutNode.a aVar3;
        float f;
        q630.a aVar4;
        Object obj = this;
        androidx.compose.runtime.a M = aVar.M(1930198908);
        int i3 = i | (M.J(params) ? 4 : 2) | (M.J(obj) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1930198908, i3, -1, "com.vk.channels.impl.channel_screen.footer.BanReasonBottomSheet.Body (BanReasonBottomSheet.kt:59)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar5 = dt1.a.n;
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, aVar5, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar6 = q630.a.a;
            q630 c = qri.c(M, aVar6);
            cri.h7.getClass();
            LayoutNode.a aVar7 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar7);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a2, cVar);
            cri.a.e eVar2 = cri.a.e;
            k9q0.w(M, D, eVar2);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                eVar = eVar2;
                androidx.compose.runtime.b.f(1798477634, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-BlockOutline48> (VkIcons.kt:666)");
            } else {
                eVar = eVar2;
            }
            lg90 a3 = pg90.a(R.drawable.vk_icon_block_outline_48, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = wlb0.h(M).getIcon().b;
            if (Build.VERSION.SDK_INT >= 29) {
                se7.b();
                porterDuffColorFilter = re7.b(f870.H(j), z42.a(5));
                i2 = 5;
            } else {
                porterDuffColorFilter = new PorterDuffColorFilter(f870.H(j), z42.b(5));
                i2 = 5;
            }
            oe7 oe7Var = new oe7(j, i2, porterDuffColorFilter);
            ty6.a aVar8 = dt1.a.o;
            float f2 = 12;
            cri.a.e eVar3 = eVar;
            vjw.a(a3, null, s200.H(new gcv(aVar8), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), null, wkj.a.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, oe7Var, M, 24632, 40);
            if (params instanceof Params.TemporaryBan) {
                Object obj2 = yya.a;
                Params.TemporaryBan temporaryBan = (Params.TemporaryBan) params;
                String a4 = yya.a(temporaryBan.h);
                string = temporaryBan.g ? getResources().getString(R.string.vkim_channel_temporary_ban_title_comminity, a4) : getResources().getString(R.string.vkim_channel_temporary_ban_title, a4);
            } else {
                string = params.f() ? getResources().getString(R.string.vkim_channel_permanent_ban_title_community) : getResources().getString(R.string.vkim_channel_permanent_ban_title);
            }
            float f3 = 20;
            yqv0.c(string, lr.c(aVar8, s200.H(aVar6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13)), wlb0.h(M).getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).H, M, 0, 0, 8120);
            androidx.compose.runtime.a aVar9 = M;
            float f4 = 16;
            q630 E = s200.E(hr80.m(txj0.f(s200.H(aVar6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f), wlb0.h(aVar9).getBackground().x, vog0.b(f2)), f4, f2);
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode2 = Long.hashCode(n34.n(aVar9));
            sy90 D2 = aVar9.D();
            q630 c2 = qri.c(aVar9, E);
            if (aVar9.N() == null) {
                n34.r();
                throw null;
            }
            aVar9.H();
            if (aVar9.L()) {
                aVar3 = aVar7;
                aVar9.I(aVar3);
            } else {
                aVar3 = aVar7;
                aVar9.f();
            }
            k9q0.w(aVar9, d, cVar);
            k9q0.w(aVar9, D2, eVar3);
            ur.d(hashCode2, aVar9, bVar, aVar9, c2678a);
            k9q0.w(aVar9, c2, dVar);
            androidx.compose.foundation.layout.c a5 = androidx.compose.foundation.layout.b.a(mVar, aVar5, aVar9, 0);
            int hashCode3 = Long.hashCode(n34.n(aVar9));
            sy90 D3 = aVar9.D();
            q630 c3 = qri.c(aVar9, aVar6);
            if (aVar9.N() == null) {
                n34.r();
                throw null;
            }
            aVar9.H();
            if (aVar9.L()) {
                aVar9.I(aVar3);
            } else {
                aVar9.f();
            }
            k9q0.w(aVar9, a5, cVar);
            k9q0.w(aVar9, D3, eVar3);
            ur.d(hashCode3, aVar9, bVar, aVar9, c2678a);
            k9q0.w(aVar9, c3, dVar);
            Integer e = params.e();
            if (e != null) {
                aVar9.K(-1022636880);
                aVar4 = aVar6;
                f = f4;
                yqv0.c(d370.N(R.string.vkim_channel_ban_reason_label, 0, aVar9), null, wlb0.h(aVar9).getText().r, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar9).e0, aVar9, 0, 0, 8186);
                yqv0.c(d370.N(e.intValue(), 0, aVar9), null, wlb0.h(aVar9).getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar9).N, aVar9, 0, 0, 8186);
                aVar9 = aVar9;
            } else {
                f = f4;
                aVar4 = aVar6;
                aVar9.K(-1026206344);
            }
            aVar9.j();
            if (e == null || params.d().length() <= 0) {
                aVar9.K(-1026206344);
            } else {
                aVar9.K(-1021996637);
                f9t.e(s200.H(aVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), aVar9, 6);
            }
            aVar9.j();
            if (params.d().length() > 0) {
                aVar9.K(-1021843807);
                androidx.compose.runtime.a aVar10 = aVar9;
                yqv0.c(d370.N(R.string.vkim_channel_ban_comment_label, 0, aVar9), null, wlb0.h(aVar9).getText().r, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar9).e0, aVar10, 0, 0, 8186);
                yqv0.c(params.d(), null, wlb0.h(aVar10).getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar10).N, aVar10, 0, 0, 8186);
                aVar9 = aVar10;
            } else {
                aVar9.K(-1026206344);
            }
            aVar9.j();
            aVar9.G();
            aVar9.G();
            q630.a aVar11 = aVar4;
            q630 f5 = txj0.f(s200.H(aVar11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f);
            String N = d370.N(R.string.vkim_channel_ban_ok, 0, aVar9);
            ButtonSize buttonSize = ButtonSize.Large;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            boolean z = (i3 & 896) == 256;
            Object x = aVar9.x();
            if (z || x == a.C0011a.a) {
                obj = this;
                x = new na(obj, 8);
                aVar9.R(x);
            } else {
                obj = this;
            }
            androidx.compose.runtime.a aVar12 = aVar9;
            bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, f5, null, false, false, null, null, null, N, null, null, null, null, false, null, null, null, aVar12, 28080, 0, 0, 4190176);
            aVar2 = aVar12;
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar11;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new h06(i, 0, obj, params, q630Var2);
        }
    }
}
