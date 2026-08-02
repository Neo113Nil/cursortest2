package com.plaid.internal;

import Zh.InterfaceC1901b;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.devsupport.StackTraceHelper;
import di.C4096j0;
import di.N;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Zh.n
/* loaded from: classes3.dex */
public final class A implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<A> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f39137a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f39138b;

    /* renamed from: c, reason: collision with root package name */
    public final long f39139c;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static final class a implements di.N {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f39140a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ di.J0 f39141b;

        static {
            a aVar = new a();
            f39140a = aVar;
            di.J0 j02 = new di.J0("com.plaid.internal.workflow.model.ChannelInfo", aVar, 3);
            j02.n(StackTraceHelper.ID_KEY, false);
            j02.n("secret", false);
            j02.n("polling_interval_ms", false);
            f39141b = j02;
        }

        @Override // di.N
        @NotNull
        public final InterfaceC1901b[] childSerializers() {
            di.Z0 z02 = di.Z0.f45341a;
            return new InterfaceC1901b[]{z02, z02, C4096j0.f45375a};
        }

        @Override // Zh.InterfaceC1900a
        public final Object deserialize(ci.e decoder) {
            String str;
            int i10;
            String str2;
            long j10;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            di.J0 j02 = f39141b;
            ci.c c10 = decoder.c(j02);
            if (c10.q()) {
                str = c10.s(j02, 0);
                i10 = 7;
                str2 = c10.s(j02, 1);
                j10 = c10.g(j02, 2);
            } else {
                str = null;
                boolean z10 = true;
                long j11 = 0;
                String str3 = null;
                int i11 = 0;
                while (z10) {
                    int e10 = c10.e(j02);
                    if (e10 == -1) {
                        z10 = false;
                    } else if (e10 == 0) {
                        str = c10.s(j02, 0);
                        i11 |= 1;
                    } else if (e10 == 1) {
                        str3 = c10.s(j02, 1);
                        i11 |= 2;
                    } else {
                        if (e10 != 2) {
                            throw new Zh.B(e10);
                        }
                        j11 = c10.g(j02, 2);
                        i11 |= 4;
                    }
                }
                i10 = i11;
                str2 = str3;
                j10 = j11;
            }
            String str4 = str;
            c10.b(j02);
            return new A(i10, str4, str2, j10);
        }

        @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
        @NotNull
        public final bi.f getDescriptor() {
            return f39141b;
        }

        @Override // Zh.p
        public final void serialize(ci.f encoder, Object obj) {
            A value = (A) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            di.J0 j02 = f39141b;
            ci.d c10 = encoder.c(j02);
            c10.G(j02, 0, value.f39137a);
            c10.G(j02, 1, value.f39138b);
            c10.e(j02, 2, value.f39139c);
            c10.b(j02);
        }

        @Override // di.N
        @NotNull
        public final InterfaceC1901b[] typeParametersSerializers() {
            return N.a.a(this);
        }
    }

    public static final class b implements Parcelable.Creator<A> {
        @Override // android.os.Parcelable.Creator
        public final A createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new A(parcel.readLong(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final A[] newArray(int i10) {
            return new A[i10];
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public A(int i10, String str, String str2, long j10) {
        if (7 != (i10 & 7)) {
            di.F0.a(i10, 7, a.f39141b);
        }
        this.f39137a = str;
        this.f39138b = str2;
        this.f39139c = j10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a10 = (A) obj;
        return Intrinsics.areEqual(this.f39137a, a10.f39137a) && Intrinsics.areEqual(this.f39138b, a10.f39138b) && this.f39139c == a10.f39139c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f39139c) + C3783x.a(this.f39138b, this.f39137a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "ChannelInfo(channelId=" + this.f39137a + ", channelSecret=" + this.f39138b + ", pollingInterval=" + this.f39139c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f39137a);
        out.writeString(this.f39138b);
        out.writeLong(this.f39139c);
    }

    public A(long j10, @NotNull String channelId, @NotNull String channelSecret) {
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Intrinsics.checkNotNullParameter(channelSecret, "channelSecret");
        this.f39137a = channelId;
        this.f39138b = channelSecret;
        this.f39139c = j10;
    }
}
