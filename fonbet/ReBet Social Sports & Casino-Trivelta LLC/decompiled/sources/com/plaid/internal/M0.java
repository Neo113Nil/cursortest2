package com.plaid.internal;

import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.L0;
import di.C4087f;
import di.C4093i;
import di.N;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Zh.n
/* loaded from: classes3.dex */
public final class M0 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<M0> CREATOR = new b();

    /* renamed from: j, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final InterfaceC1901b[] f39357j = {null, null, null, null, null, null, null, null, new C4087f(di.Z0.f45341a)};

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f39358a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f39359b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f39360c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f39361d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f39362e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f39363f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f39364g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public final L0 f39365h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    public final List<String> f39366i;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static final class a implements di.N {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f39367a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ di.J0 f39368b;

        static {
            a aVar = new a();
            f39367a = aVar;
            di.J0 j02 = new di.J0("com.plaid.internal.models.EmbeddedSessionInfo", aVar, 9);
            j02.n("link_token", false);
            j02.n("link_open_id", false);
            j02.n("link_persistent_id", false);
            j02.n("institution_id", true);
            j02.n("webview_fallback_id", true);
            j02.n("enable_account_select", true);
            j02.n("embedded_workflow_session_id", true);
            j02.n("embedded_open_link_configuration", true);
            j02.n("web3_valid_chains", true);
            f39368b = j02;
        }

        @Override // di.N
        @NotNull
        public final InterfaceC1901b[] childSerializers() {
            InterfaceC1901b[] interfaceC1901bArr = M0.f39357j;
            InterfaceC1901b t10 = AbstractC2028a.t(L0.a.f39335a);
            InterfaceC1901b interfaceC1901b = interfaceC1901bArr[8];
            di.Z0 z02 = di.Z0.f45341a;
            return new InterfaceC1901b[]{z02, z02, z02, z02, z02, C4093i.f45370a, z02, t10, interfaceC1901b};
        }

        @Override // Zh.InterfaceC1900a
        public final Object deserialize(ci.e decoder) {
            boolean z10;
            List list;
            L0 l02;
            int i10;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            di.J0 j02 = f39368b;
            ci.c c10 = decoder.c(j02);
            InterfaceC1901b[] interfaceC1901bArr = M0.f39357j;
            if (c10.q()) {
                String s10 = c10.s(j02, 0);
                String s11 = c10.s(j02, 1);
                String s12 = c10.s(j02, 2);
                String s13 = c10.s(j02, 3);
                String s14 = c10.s(j02, 4);
                boolean t10 = c10.t(j02, 5);
                String s15 = c10.s(j02, 6);
                L0 l03 = (L0) c10.C(j02, 7, L0.a.f39335a, null);
                list = (List) c10.i(j02, 8, interfaceC1901bArr[8], null);
                str = s10;
                l02 = l03;
                str6 = s15;
                z10 = t10;
                str4 = s13;
                str5 = s14;
                str3 = s12;
                i10 = 511;
                str2 = s11;
            } else {
                boolean z11 = true;
                boolean z12 = false;
                List list2 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                int i11 = 0;
                L0 l04 = null;
                while (z11) {
                    int e10 = c10.e(j02);
                    switch (e10) {
                        case -1:
                            z11 = false;
                            break;
                        case 0:
                            i11 |= 1;
                            str7 = c10.s(j02, 0);
                            continue;
                        case 1:
                            i11 |= 2;
                            str8 = c10.s(j02, 1);
                            continue;
                        case 2:
                            str9 = c10.s(j02, 2);
                            i11 |= 4;
                            continue;
                        case 3:
                            str10 = c10.s(j02, 3);
                            i11 |= 8;
                            break;
                        case 4:
                            str11 = c10.s(j02, 4);
                            i11 |= 16;
                            break;
                        case 5:
                            z12 = c10.t(j02, 5);
                            i11 |= 32;
                            break;
                        case 6:
                            str12 = c10.s(j02, 6);
                            i11 |= 64;
                            break;
                        case 7:
                            l04 = (L0) c10.C(j02, 7, L0.a.f39335a, l04);
                            i11 |= 128;
                            break;
                        case 8:
                            list2 = (List) c10.i(j02, 8, interfaceC1901bArr[8], list2);
                            i11 |= 256;
                            break;
                        default:
                            throw new Zh.B(e10);
                    }
                }
                z10 = z12;
                list = list2;
                l02 = l04;
                i10 = i11;
                str = str7;
                str2 = str8;
                str3 = str9;
                str4 = str10;
                str5 = str11;
                str6 = str12;
            }
            c10.b(j02);
            return new M0(i10, str, str2, str3, str4, str5, z10, str6, l02, list);
        }

        @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
        @NotNull
        public final bi.f getDescriptor() {
            return f39368b;
        }

        @Override // Zh.p
        public final void serialize(ci.f encoder, Object obj) {
            M0 value = (M0) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            di.J0 j02 = f39368b;
            ci.d c10 = encoder.c(j02);
            InterfaceC1901b[] interfaceC1901bArr = M0.f39357j;
            c10.G(j02, 0, value.f39358a);
            c10.G(j02, 1, value.f39359b);
            c10.G(j02, 2, value.f39360c);
            if (c10.m(j02, 3) || !Intrinsics.areEqual(value.f39361d, "")) {
                c10.G(j02, 3, value.f39361d);
            }
            if (c10.m(j02, 4) || !Intrinsics.areEqual(value.f39362e, "")) {
                c10.G(j02, 4, value.f39362e);
            }
            if (c10.m(j02, 5) || value.f39363f) {
                c10.F(j02, 5, value.f39363f);
            }
            if (c10.m(j02, 6) || !Intrinsics.areEqual(value.f39364g, "")) {
                c10.G(j02, 6, value.f39364g);
            }
            if (c10.m(j02, 7) || value.f39365h != null) {
                c10.C(j02, 7, L0.a.f39335a, value.f39365h);
            }
            if (c10.m(j02, 8) || !Intrinsics.areEqual(value.f39366i, CollectionsKt.emptyList())) {
                c10.B(j02, 8, interfaceC1901bArr[8], value.f39366i);
            }
            c10.b(j02);
        }

        @Override // di.N
        @NotNull
        public final InterfaceC1901b[] typeParametersSerializers() {
            return N.a.a(this);
        }
    }

    public static final class b implements Parcelable.Creator<M0> {
        @Override // android.os.Parcelable.Creator
        public final M0 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new M0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : L0.CREATOR.createFromParcel(parcel), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final M0[] newArray(int i10) {
            return new M0[i10];
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public M0(int i10, String str, String str2, String str3, String str4, String str5, boolean z10, String str6, L0 l02, List list) {
        if (7 != (i10 & 7)) {
            di.F0.a(i10, 7, a.f39368b);
        }
        this.f39358a = str;
        this.f39359b = str2;
        this.f39360c = str3;
        if ((i10 & 8) == 0) {
            this.f39361d = "";
        } else {
            this.f39361d = str4;
        }
        if ((i10 & 16) == 0) {
            this.f39362e = "";
        } else {
            this.f39362e = str5;
        }
        if ((i10 & 32) == 0) {
            this.f39363f = false;
        } else {
            this.f39363f = z10;
        }
        if ((i10 & 64) == 0) {
            this.f39364g = "";
        } else {
            this.f39364g = str6;
        }
        if ((i10 & 128) == 0) {
            this.f39365h = null;
        } else {
            this.f39365h = l02;
        }
        if ((i10 & 256) == 0) {
            this.f39366i = CollectionsKt.emptyList();
        } else {
            this.f39366i = list;
        }
    }

    @NotNull
    public final String a() {
        return this.f39359b;
    }

    @NotNull
    public final String b() {
        return this.f39358a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof M0)) {
            return false;
        }
        M0 m02 = (M0) obj;
        return Intrinsics.areEqual(this.f39358a, m02.f39358a) && Intrinsics.areEqual(this.f39359b, m02.f39359b) && Intrinsics.areEqual(this.f39360c, m02.f39360c) && Intrinsics.areEqual(this.f39361d, m02.f39361d) && Intrinsics.areEqual(this.f39362e, m02.f39362e) && this.f39363f == m02.f39363f && Intrinsics.areEqual(this.f39364g, m02.f39364g) && Intrinsics.areEqual(this.f39365h, m02.f39365h) && Intrinsics.areEqual(this.f39366i, m02.f39366i);
    }

    public final int hashCode() {
        int a10 = C3783x.a(this.f39364g, (Boolean.hashCode(this.f39363f) + C3783x.a(this.f39362e, C3783x.a(this.f39361d, C3783x.a(this.f39360c, C3783x.a(this.f39359b, this.f39358a.hashCode() * 31, 31), 31), 31), 31)) * 31, 31);
        L0 l02 = this.f39365h;
        return this.f39366i.hashCode() + ((a10 + (l02 == null ? 0 : l02.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        return "EmbeddedSessionInfo(linkToken=" + this.f39358a + ", linkOpenId=" + this.f39359b + ", linkPersistentId=" + this.f39360c + ", institutionId=" + this.f39361d + ", webviewFallbackId=" + this.f39362e + ", enableAccountSelect=" + this.f39363f + ", embeddedWorkflowSessionId=" + this.f39364g + ", embeddedOpenLinkConfiguration=" + this.f39365h + ", web3ValidChains=" + this.f39366i + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f39358a);
        out.writeString(this.f39359b);
        out.writeString(this.f39360c);
        out.writeString(this.f39361d);
        out.writeString(this.f39362e);
        out.writeInt(this.f39363f ? 1 : 0);
        out.writeString(this.f39364g);
        L0 l02 = this.f39365h;
        if (l02 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            l02.writeToParcel(out, i10);
        }
        out.writeStringList(this.f39366i);
    }

    public M0(@NotNull String linkToken, @NotNull String linkOpenId, @NotNull String linkPersistentId, @NotNull String institutionId, @NotNull String webviewFallbackId, boolean z10, @NotNull String embeddedWorkflowSessionId, @Nullable L0 l02, @NotNull ArrayList web3ValidChains) {
        Intrinsics.checkNotNullParameter(linkToken, "linkToken");
        Intrinsics.checkNotNullParameter(linkOpenId, "linkOpenId");
        Intrinsics.checkNotNullParameter(linkPersistentId, "linkPersistentId");
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(webviewFallbackId, "webviewFallbackId");
        Intrinsics.checkNotNullParameter(embeddedWorkflowSessionId, "embeddedWorkflowSessionId");
        Intrinsics.checkNotNullParameter(web3ValidChains, "web3ValidChains");
        this.f39358a = linkToken;
        this.f39359b = linkOpenId;
        this.f39360c = linkPersistentId;
        this.f39361d = institutionId;
        this.f39362e = webviewFallbackId;
        this.f39363f = z10;
        this.f39364g = embeddedWorkflowSessionId;
        this.f39365h = l02;
        this.f39366i = web3ValidChains;
    }
}
