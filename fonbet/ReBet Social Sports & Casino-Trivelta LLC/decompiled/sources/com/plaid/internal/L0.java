package com.plaid.internal;

import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.I0;
import com.plaid.internal.J0;
import com.plaid.internal.K0;
import di.C4093i;
import di.N;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Zh.n
/* loaded from: classes3.dex */
public final class L0 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<L0> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f39330a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public final I0 f39331b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public final K0 f39332c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public final J0 f39333d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f39334e;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static final class a implements di.N {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f39335a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ di.J0 f39336b;

        static {
            a aVar = new a();
            f39335a = aVar;
            di.J0 j02 = new di.J0("com.plaid.internal.models.EmbeddedOpenLinkConfiguration", aVar, 5);
            j02.n("embedded_workflow_session_id", false);
            j02.n("open_link_action_default", true);
            j02.n("open_link_action_with_institution_id", true);
            j02.n("open_link_action_link_with_account_numbers", true);
            j02.n("is_polling", true);
            f39336b = j02;
        }

        @Override // di.N
        @NotNull
        public final InterfaceC1901b[] childSerializers() {
            return new InterfaceC1901b[]{di.Z0.f45341a, AbstractC2028a.t(I0.a.f39289a), AbstractC2028a.t(K0.a.f39322a), AbstractC2028a.t(J0.a.f39305a), C4093i.f45370a};
        }

        @Override // Zh.InterfaceC1900a
        public final Object deserialize(ci.e decoder) {
            boolean z10;
            int i10;
            String str;
            I0 i02;
            K0 k02;
            J0 j02;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            di.J0 j03 = f39336b;
            ci.c c10 = decoder.c(j03);
            if (c10.q()) {
                String s10 = c10.s(j03, 0);
                I0 i03 = (I0) c10.C(j03, 1, I0.a.f39289a, null);
                K0 k03 = (K0) c10.C(j03, 2, K0.a.f39322a, null);
                str = s10;
                j02 = (J0) c10.C(j03, 3, J0.a.f39305a, null);
                z10 = c10.t(j03, 4);
                k02 = k03;
                i02 = i03;
                i10 = 31;
            } else {
                boolean z11 = true;
                boolean z12 = false;
                String str2 = null;
                I0 i04 = null;
                K0 k04 = null;
                J0 j04 = null;
                int i11 = 0;
                while (z11) {
                    int e10 = c10.e(j03);
                    if (e10 == -1) {
                        z11 = false;
                    } else if (e10 == 0) {
                        str2 = c10.s(j03, 0);
                        i11 |= 1;
                    } else if (e10 == 1) {
                        i04 = (I0) c10.C(j03, 1, I0.a.f39289a, i04);
                        i11 |= 2;
                    } else if (e10 == 2) {
                        k04 = (K0) c10.C(j03, 2, K0.a.f39322a, k04);
                        i11 |= 4;
                    } else if (e10 == 3) {
                        j04 = (J0) c10.C(j03, 3, J0.a.f39305a, j04);
                        i11 |= 8;
                    } else {
                        if (e10 != 4) {
                            throw new Zh.B(e10);
                        }
                        z12 = c10.t(j03, 4);
                        i11 |= 16;
                    }
                }
                z10 = z12;
                i10 = i11;
                str = str2;
                i02 = i04;
                k02 = k04;
                j02 = j04;
            }
            c10.b(j03);
            return new L0(i10, str, i02, k02, j02, z10);
        }

        @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
        @NotNull
        public final bi.f getDescriptor() {
            return f39336b;
        }

        @Override // Zh.p
        public final void serialize(ci.f encoder, Object obj) {
            L0 value = (L0) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            di.J0 j02 = f39336b;
            ci.d c10 = encoder.c(j02);
            c10.G(j02, 0, value.f39330a);
            if (c10.m(j02, 1) || value.f39331b != null) {
                c10.C(j02, 1, I0.a.f39289a, value.f39331b);
            }
            if (c10.m(j02, 2) || value.f39332c != null) {
                c10.C(j02, 2, K0.a.f39322a, value.f39332c);
            }
            if (c10.m(j02, 3) || value.f39333d != null) {
                c10.C(j02, 3, J0.a.f39305a, value.f39333d);
            }
            if (c10.m(j02, 4) || value.f39334e) {
                c10.F(j02, 4, value.f39334e);
            }
            c10.b(j02);
        }

        @Override // di.N
        @NotNull
        public final InterfaceC1901b[] typeParametersSerializers() {
            return N.a.a(this);
        }
    }

    public static final class b implements Parcelable.Creator<L0> {
        @Override // android.os.Parcelable.Creator
        public final L0 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new L0(parcel.readString(), parcel.readInt() == 0 ? null : I0.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : K0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? J0.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final L0[] newArray(int i10) {
            return new L0[i10];
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public L0(int i10, String str, I0 i02, K0 k02, J0 j02, boolean z10) {
        if (1 != (i10 & 1)) {
            di.F0.a(i10, 1, a.f39336b);
        }
        this.f39330a = str;
        if ((i10 & 2) == 0) {
            this.f39331b = null;
        } else {
            this.f39331b = i02;
        }
        if ((i10 & 4) == 0) {
            this.f39332c = null;
        } else {
            this.f39332c = k02;
        }
        if ((i10 & 8) == 0) {
            this.f39333d = null;
        } else {
            this.f39333d = j02;
        }
        if ((i10 & 16) == 0) {
            this.f39334e = false;
        } else {
            this.f39334e = z10;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L0)) {
            return false;
        }
        L0 l02 = (L0) obj;
        return Intrinsics.areEqual(this.f39330a, l02.f39330a) && Intrinsics.areEqual(this.f39331b, l02.f39331b) && Intrinsics.areEqual(this.f39332c, l02.f39332c) && Intrinsics.areEqual(this.f39333d, l02.f39333d) && this.f39334e == l02.f39334e;
    }

    public final int hashCode() {
        int hashCode = this.f39330a.hashCode() * 31;
        I0 i02 = this.f39331b;
        int hashCode2 = (hashCode + (i02 == null ? 0 : i02.hashCode())) * 31;
        K0 k02 = this.f39332c;
        int hashCode3 = (hashCode2 + (k02 == null ? 0 : k02.f39321a.hashCode())) * 31;
        J0 j02 = this.f39333d;
        return Boolean.hashCode(this.f39334e) + ((hashCode3 + (j02 != null ? j02.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        return "EmbeddedOpenLinkConfiguration(embeddedWorkflowSessionId=" + this.f39330a + ", openLinkActionDefault=" + this.f39331b + ", openLinkActionWithInstitutionId=" + this.f39332c + ", openLinkActionLinkWithAccountNumbers=" + this.f39333d + ", isPolling=" + this.f39334e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f39330a);
        if (this.f39331b == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeInt(1);
        }
        K0 k02 = this.f39332c;
        if (k02 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(k02.f39321a);
        }
        if (this.f39333d == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeInt(1);
        }
        out.writeInt(this.f39334e ? 1 : 0);
    }

    public L0(@NotNull String embeddedWorkflowSessionId, @Nullable I0 i02, @Nullable K0 k02, @Nullable J0 j02, boolean z10) {
        Intrinsics.checkNotNullParameter(embeddedWorkflowSessionId, "embeddedWorkflowSessionId");
        this.f39330a = embeddedWorkflowSessionId;
        this.f39331b = i02;
        this.f39332c = k02;
        this.f39333d = j02;
        this.f39334e = z10;
    }
}
