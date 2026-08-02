package com.vk.push.core.test;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0001\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/vk/push/core/test/SendTestPushResult;", "", "Landroid/os/Parcelable;", "CREATOR", "a", "SUCCESS", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SendTestPushResult implements Parcelable {
    private static final /* synthetic */ SendTestPushResult[] $VALUES;

    /* renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final SendTestPushResult SUCCESS;

    /* renamed from: com.vk.push.core.test.SendTestPushResult$a, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<SendTestPushResult> {
        @Override // android.os.Parcelable.Creator
        public final SendTestPushResult createFromParcel(Parcel parcel) {
            Object valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            Object obj = SendTestPushResult.SUCCESS;
            if (readString != null) {
                try {
                    String upperCase = readString.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    valueOf = Enum.valueOf(SendTestPushResult.class, upperCase);
                } catch (IllegalArgumentException unused) {
                }
            } else {
                valueOf = obj;
            }
            Intrinsics.checkNotNullExpressionValue(valueOf, "{\n        if (this != nu…faultEnum\n        }\n    }");
            obj = valueOf;
            return (SendTestPushResult) obj;
        }

        @Override // android.os.Parcelable.Creator
        public final SendTestPushResult[] newArray(int i11) {
            return new SendTestPushResult[i11];
        }
    }

    static {
        SendTestPushResult sendTestPushResult = new SendTestPushResult("SUCCESS", 0);
        SUCCESS = sendTestPushResult;
        $VALUES = new SendTestPushResult[]{sendTestPushResult};
        INSTANCE = new Companion();
    }

    private SendTestPushResult() {
        throw null;
    }

    public static SendTestPushResult valueOf(String str) {
        return (SendTestPushResult) Enum.valueOf(SendTestPushResult.class, str);
    }

    public static SendTestPushResult[] values() {
        return (SendTestPushResult[]) $VALUES.clone();
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
