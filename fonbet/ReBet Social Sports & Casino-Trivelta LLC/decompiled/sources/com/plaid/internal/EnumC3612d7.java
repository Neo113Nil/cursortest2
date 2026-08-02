package com.plaid.internal;

import Zh.InterfaceC1901b;
import android.os.Parcel;
import android.os.Parcelable;
import di.N;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.ReplaceWith;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Zh.n
/* renamed from: com.plaid.internal.d7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC3612d7 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EnumC3612d7> CREATOR;

    @NotNull
    public static final c Companion;
    public static final EnumC3612d7 NO_SMS_AUTOFILL;
    public static final EnumC3612d7 SMS_RECEIVER;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Lazy<InterfaceC1901b> f40562a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC3612d7[] f40563b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f40564c;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    /* renamed from: com.plaid.internal.d7$a */
    public static final class a implements di.N {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f40565a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ di.G f40566b;

        static {
            di.G g10 = new di.G("com.plaid.internal.workflow.model.SmsAutofillType", 2);
            g10.n("SMS_RECEIVER", false);
            g10.n("NO_SMS_AUTOFILL", false);
            f40566b = g10;
        }

        @Override // di.N
        @NotNull
        public final InterfaceC1901b[] childSerializers() {
            return new InterfaceC1901b[0];
        }

        @Override // Zh.InterfaceC1900a
        public final Object deserialize(ci.e decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return EnumC3612d7.values()[decoder.f(f40566b)];
        }

        @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
        @NotNull
        public final bi.f getDescriptor() {
            return f40566b;
        }

        @Override // Zh.p
        public final void serialize(ci.f encoder, Object obj) {
            EnumC3612d7 value = (EnumC3612d7) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.o(f40566b, value.ordinal());
        }

        @Override // di.N
        @NotNull
        public final InterfaceC1901b[] typeParametersSerializers() {
            return N.a.a(this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.plaid.internal.d7$c] */
    static {
        EnumC3612d7 enumC3612d7 = new EnumC3612d7("SMS_RECEIVER", 0);
        SMS_RECEIVER = enumC3612d7;
        EnumC3612d7 enumC3612d72 = new EnumC3612d7("NO_SMS_AUTOFILL", 1);
        NO_SMS_AUTOFILL = enumC3612d72;
        EnumC3612d7[] enumC3612d7Arr = {enumC3612d7, enumC3612d72};
        f40563b = enumC3612d7Arr;
        f40564c = EnumEntriesKt.enumEntries(enumC3612d7Arr);
        Companion = new Object() { // from class: com.plaid.internal.d7.c
        };
        CREATOR = new Parcelable.Creator<EnumC3612d7>() { // from class: com.plaid.internal.d7.d
            @Override // android.os.Parcelable.Creator
            public final EnumC3612d7 createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return EnumC3612d7.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final EnumC3612d7[] newArray(int i10) {
                return new EnumC3612d7[i10];
            }
        };
        f40562a = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new Function0<InterfaceC1901b>() { // from class: com.plaid.internal.d7.b
            @Override // kotlin.jvm.functions.Function0
            public final InterfaceC1901b invoke() {
                return a.f40565a;
            }
        });
    }

    public EnumC3612d7(String str, int i10) {
    }

    @NotNull
    public static EnumEntries<EnumC3612d7> getEntries() {
        return f40564c;
    }

    public static EnumC3612d7 valueOf(String str) {
        return (EnumC3612d7) Enum.valueOf(EnumC3612d7.class, str);
    }

    public static EnumC3612d7[] values() {
        return (EnumC3612d7[]) f40563b.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(name());
    }
}
