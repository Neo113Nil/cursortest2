package com.plaid.internal;

import Zh.InterfaceC1901b;
import android.os.Parcel;
import android.os.Parcelable;
import di.N;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Zh.n
/* loaded from: classes3.dex */
public final class K0 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<K0> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f39321a;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static final class a implements di.N {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f39322a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ di.J0 f39323b;

        static {
            a aVar = new a();
            f39322a = aVar;
            di.J0 j02 = new di.J0("com.plaid.internal.models.EmbeddedOpenLinkActionWithInstitutionId", aVar, 1);
            j02.n("institution_id", false);
            f39323b = j02;
        }

        @Override // di.N
        @NotNull
        public final InterfaceC1901b[] childSerializers() {
            return new InterfaceC1901b[]{di.Z0.f45341a};
        }

        @Override // Zh.InterfaceC1900a
        public final Object deserialize(ci.e decoder) {
            String str;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            di.J0 j02 = f39323b;
            ci.c c10 = decoder.c(j02);
            int i10 = 1;
            if (c10.q()) {
                str = c10.s(j02, 0);
            } else {
                str = null;
                boolean z10 = true;
                int i11 = 0;
                while (z10) {
                    int e10 = c10.e(j02);
                    if (e10 == -1) {
                        z10 = false;
                    } else {
                        if (e10 != 0) {
                            throw new Zh.B(e10);
                        }
                        str = c10.s(j02, 0);
                        i11 = 1;
                    }
                }
                i10 = i11;
            }
            c10.b(j02);
            return new K0(i10, str);
        }

        @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
        @NotNull
        public final bi.f getDescriptor() {
            return f39323b;
        }

        @Override // Zh.p
        public final void serialize(ci.f encoder, Object obj) {
            K0 value = (K0) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            di.J0 j02 = f39323b;
            ci.d c10 = encoder.c(j02);
            c10.G(j02, 0, value.f39321a);
            c10.b(j02);
        }

        @Override // di.N
        @NotNull
        public final InterfaceC1901b[] typeParametersSerializers() {
            return N.a.a(this);
        }
    }

    public static final class b implements Parcelable.Creator<K0> {
        @Override // android.os.Parcelable.Creator
        public final K0 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new K0(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final K0[] newArray(int i10) {
            return new K0[i10];
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public K0(int i10, String str) {
        if (1 != (i10 & 1)) {
            di.F0.a(i10, 1, a.f39323b);
        }
        this.f39321a = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof K0) && Intrinsics.areEqual(this.f39321a, ((K0) obj).f39321a);
    }

    public final int hashCode() {
        return this.f39321a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "EmbeddedOpenLinkActionWithInstitutionId(institutionId=" + this.f39321a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f39321a);
    }

    public K0(@NotNull String institutionId) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        this.f39321a = institutionId;
    }
}
