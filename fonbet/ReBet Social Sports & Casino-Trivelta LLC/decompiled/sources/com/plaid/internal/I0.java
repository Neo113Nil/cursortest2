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

@Zh.n
/* loaded from: classes3.dex */
public final class I0 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<I0> CREATOR = new b();

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public static final class a implements di.N {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f39289a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ di.J0 f39290b;

        static {
            a aVar = new a();
            f39289a = aVar;
            f39290b = new di.J0("com.plaid.internal.models.EmbeddedOpenLinkActionDefault", aVar, 0);
        }

        @Override // di.N
        @NotNull
        public final InterfaceC1901b[] childSerializers() {
            return new InterfaceC1901b[0];
        }

        @Override // Zh.InterfaceC1900a
        public final Object deserialize(ci.e decoder) {
            int e10;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            di.J0 j02 = f39290b;
            ci.c c10 = decoder.c(j02);
            if (!c10.q() && (e10 = c10.e(j02)) != -1) {
                throw new Zh.B(e10);
            }
            c10.b(j02);
            return new I0(0);
        }

        @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
        @NotNull
        public final bi.f getDescriptor() {
            return f39290b;
        }

        @Override // Zh.p
        public final void serialize(ci.f encoder, Object obj) {
            I0 value = (I0) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            di.J0 j02 = f39290b;
            encoder.c(j02).b(j02);
        }

        @Override // di.N
        @NotNull
        public final InterfaceC1901b[] typeParametersSerializers() {
            return N.a.a(this);
        }
    }

    public static final class b implements Parcelable.Creator<I0> {
        @Override // android.os.Parcelable.Creator
        public final I0 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return new I0();
        }

        @Override // android.os.Parcelable.Creator
        public final I0[] newArray(int i10) {
            return new I0[i10];
        }
    }

    public I0() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(1);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public I0(int i10) {
    }
}
