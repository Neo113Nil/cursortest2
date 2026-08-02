package com.plaid.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.plaid.internal.j5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC3664j5 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EnumC3664j5> CREATOR;

    @NotNull
    public static final a Companion;
    public static final EnumC3664j5 DEVELOPMENT;
    public static final EnumC3664j5 DEVENV;
    public static final EnumC3664j5 PRODUCTION;
    public static final EnumC3664j5 SANDBOX;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Map<String, EnumC3664j5> f40705b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ EnumC3664j5[] f40706c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f40707d;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f40708a;

    @SourceDebugExtension({"SMAP\nPlaidEnvironment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaidEnvironment.kt\ncom/plaid/internal/configuration/PlaidEnvironment$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n13309#2,2:42\n1#3:44\n*S KotlinDebug\n*F\n+ 1 PlaidEnvironment.kt\ncom/plaid/internal/configuration/PlaidEnvironment$Companion\n*L\n28#1:42,2\n*E\n"})
    /* renamed from: com.plaid.internal.j5$a */
    public static final class a {
        @NotNull
        public static EnumC3664j5 a(@NotNull String json) {
            Intrinsics.checkNotNullParameter(json, "json");
            EnumC3664j5 enumC3664j5 = (EnumC3664j5) EnumC3664j5.f40705b.get(json);
            return enumC3664j5 == null ? EnumC3664j5.SANDBOX : enumC3664j5;
        }
    }

    static {
        EnumC3664j5 enumC3664j5 = new EnumC3664j5("PRODUCTION", 0, "production");
        PRODUCTION = enumC3664j5;
        EnumC3664j5 enumC3664j52 = new EnumC3664j5("DEVELOPMENT", 1, "development");
        DEVELOPMENT = enumC3664j52;
        EnumC3664j5 enumC3664j53 = new EnumC3664j5("SANDBOX", 2, "sandbox");
        SANDBOX = enumC3664j53;
        EnumC3664j5 enumC3664j54 = new EnumC3664j5("DEVENV", 3, "devenv");
        DEVENV = enumC3664j54;
        EnumC3664j5[] enumC3664j5Arr = {enumC3664j5, enumC3664j52, enumC3664j53, enumC3664j54};
        f40706c = enumC3664j5Arr;
        f40707d = EnumEntriesKt.enumEntries(enumC3664j5Arr);
        Companion = new a();
        CREATOR = new Parcelable.Creator<EnumC3664j5>() { // from class: com.plaid.internal.j5.b
            @Override // android.os.Parcelable.Creator
            public final EnumC3664j5 createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return EnumC3664j5.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final EnumC3664j5[] newArray(int i10) {
                return new EnumC3664j5[i10];
            }
        };
        f40705b = MapsKt.mapOf(TuplesKt.to("production", enumC3664j5), TuplesKt.to("development", enumC3664j52), TuplesKt.to("sandbox", enumC3664j53), TuplesKt.to("devenv", enumC3664j54));
    }

    public EnumC3664j5(String str, int i10, String str2) {
        this.f40708a = str2;
    }

    @NotNull
    public static EnumEntries<EnumC3664j5> getEntries() {
        return f40707d;
    }

    public static EnumC3664j5 valueOf(String str) {
        return (EnumC3664j5) Enum.valueOf(EnumC3664j5.class, str);
    }

    public static EnumC3664j5[] values() {
        return (EnumC3664j5[]) f40706c.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final String getJson() {
        return this.f40708a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i10) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(name());
    }
}
