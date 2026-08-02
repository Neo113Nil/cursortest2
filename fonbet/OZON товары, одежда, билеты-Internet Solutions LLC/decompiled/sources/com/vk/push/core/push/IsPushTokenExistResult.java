package com.vk.push.core.push;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0001\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/vk/push/core/push/IsPushTokenExistResult;", "", "Landroid/os/Parcelable;", "CREATOR", "a", "EXISTS", "DOES_NOT_EXIST", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class IsPushTokenExistResult implements Parcelable {
    private static final /* synthetic */ IsPushTokenExistResult[] $VALUES;

    /* renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final IsPushTokenExistResult DOES_NOT_EXIST;
    public static final IsPushTokenExistResult EXISTS;

    /* renamed from: com.vk.push.core.push.IsPushTokenExistResult$a, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<IsPushTokenExistResult> {
        @Override // android.os.Parcelable.Creator
        public final IsPushTokenExistResult createFromParcel(Parcel parcel) {
            Object valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            Object obj = IsPushTokenExistResult.DOES_NOT_EXIST;
            if (readString != null) {
                try {
                    String upperCase = readString.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    valueOf = Enum.valueOf(IsPushTokenExistResult.class, upperCase);
                } catch (IllegalArgumentException unused) {
                }
            } else {
                valueOf = obj;
            }
            Intrinsics.checkNotNullExpressionValue(valueOf, "{\n        if (this != nu…faultEnum\n        }\n    }");
            obj = valueOf;
            return (IsPushTokenExistResult) obj;
        }

        @Override // android.os.Parcelable.Creator
        public final IsPushTokenExistResult[] newArray(int i11) {
            return new IsPushTokenExistResult[i11];
        }
    }

    static {
        IsPushTokenExistResult isPushTokenExistResult = new IsPushTokenExistResult("EXISTS", 0);
        EXISTS = isPushTokenExistResult;
        IsPushTokenExistResult isPushTokenExistResult2 = new IsPushTokenExistResult("DOES_NOT_EXIST", 1);
        DOES_NOT_EXIST = isPushTokenExistResult2;
        $VALUES = new IsPushTokenExistResult[]{isPushTokenExistResult, isPushTokenExistResult2};
        INSTANCE = new Companion();
    }

    private IsPushTokenExistResult() {
        throw null;
    }

    public static IsPushTokenExistResult valueOf(String str) {
        return (IsPushTokenExistResult) Enum.valueOf(IsPushTokenExistResult.class, str);
    }

    public static IsPushTokenExistResult[] values() {
        return (IsPushTokenExistResult[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int i11) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}
