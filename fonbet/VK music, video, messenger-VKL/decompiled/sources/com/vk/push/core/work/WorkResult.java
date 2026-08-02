package com.vk.push.core.work;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.b;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import xsna.zcl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WorkResult.kt */
/* loaded from: classes5.dex */
public final class WorkResult implements Parcelable {
    private static final /* synthetic */ WorkResult[] $VALUES;
    public static final CREATOR CREATOR;
    public static final WorkResult FAILURE;
    public static final WorkResult RETRY;
    public static final WorkResult SUCESSS;

    /* compiled from: WorkResult.kt */
    public static final class CREATOR implements Parcelable.Creator<WorkResult> {
        public /* synthetic */ CREATOR(zcl zclVar) {
            this();
        }

        public CREATOR() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WorkResult createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            Enum r0 = WorkResult.FAILURE;
            if (readString != null) {
                try {
                    r0 = Enum.valueOf(WorkResult.class, readString.toUpperCase(Locale.ROOT));
                } catch (IllegalArgumentException unused) {
                }
            }
            return (WorkResult) r0;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WorkResult[] newArray(int i) {
            return new WorkResult[i];
        }
    }

    /* compiled from: WorkResult.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WorkResult.values().length];
            try {
                iArr[WorkResult.SUCESSS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkResult.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WorkResult.RETRY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        WorkResult workResult = new WorkResult("SUCESSS", 0);
        SUCESSS = workResult;
        WorkResult workResult2 = new WorkResult("FAILURE", 1);
        FAILURE = workResult2;
        WorkResult workResult3 = new WorkResult("RETRY", 2);
        RETRY = workResult3;
        $VALUES = new WorkResult[]{workResult, workResult2, workResult3};
        CREATOR = new CREATOR(null);
    }

    public WorkResult() {
        throw null;
    }

    public static WorkResult valueOf(String str) {
        return (WorkResult) Enum.valueOf(WorkResult.class, str);
    }

    public static WorkResult[] values() {
        return (WorkResult[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final b.a toListenableWorkerResult() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return new b.a.c();
        }
        if (i == 2) {
            return new b.a.C0092a();
        }
        if (i == 3) {
            return new b.a.C0093b();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
