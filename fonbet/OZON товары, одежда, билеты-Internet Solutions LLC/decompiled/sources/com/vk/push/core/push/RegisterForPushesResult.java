package com.vk.push.core.push;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cabinet.activationtitle.data.DiscountCodeResponse;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0001\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/vk/push/core/push/RegisterForPushesResult;", "", "Landroid/os/Parcelable;", "CREATOR", "a", DiscountCodeResponse.RESULT_OK, "ALREADY_REGISTERED", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RegisterForPushesResult implements Parcelable {
    private static final /* synthetic */ RegisterForPushesResult[] $VALUES;
    public static final RegisterForPushesResult ALREADY_REGISTERED;

    /* renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final RegisterForPushesResult OK;

    /* renamed from: com.vk.push.core.push.RegisterForPushesResult$a, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<RegisterForPushesResult> {
        @Override // android.os.Parcelable.Creator
        public final RegisterForPushesResult createFromParcel(Parcel parcel) {
            Object valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            Object obj = RegisterForPushesResult.OK;
            if (readString != null) {
                try {
                    String upperCase = readString.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    valueOf = Enum.valueOf(RegisterForPushesResult.class, upperCase);
                } catch (IllegalArgumentException unused) {
                }
            } else {
                valueOf = obj;
            }
            Intrinsics.checkNotNullExpressionValue(valueOf, "{\n        if (this != nu…faultEnum\n        }\n    }");
            obj = valueOf;
            return (RegisterForPushesResult) obj;
        }

        @Override // android.os.Parcelable.Creator
        public final RegisterForPushesResult[] newArray(int i11) {
            return new RegisterForPushesResult[i11];
        }
    }

    static {
        RegisterForPushesResult registerForPushesResult = new RegisterForPushesResult(DiscountCodeResponse.RESULT_OK, 0);
        OK = registerForPushesResult;
        RegisterForPushesResult registerForPushesResult2 = new RegisterForPushesResult("ALREADY_REGISTERED", 1);
        ALREADY_REGISTERED = registerForPushesResult2;
        $VALUES = new RegisterForPushesResult[]{registerForPushesResult, registerForPushesResult2};
        INSTANCE = new Companion();
    }

    private RegisterForPushesResult() {
        throw null;
    }

    public static RegisterForPushesResult valueOf(String str) {
        return (RegisterForPushesResult) Enum.valueOf(RegisterForPushesResult.class, str);
    }

    public static RegisterForPushesResult[] values() {
        return (RegisterForPushesResult[]) $VALUES.clone();
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
