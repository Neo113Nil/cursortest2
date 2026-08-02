package com.vk.stat.model.builders;

import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import xsna.asp;
import xsna.l5m;
import xsna.qrk0;
import xsna.zrp;

/* compiled from: ImageStatusEventBuilder.kt */
/* loaded from: classes5.dex */
public final class ImageStatusEventBuilder extends l5m {
    public final Status h;
    public final FetcherType i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ImageStatusEventBuilder.kt */
    public static final class FetcherType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ FetcherType[] $VALUES;
        public static final FetcherType Enqueue;
        public static final FetcherType Execute;
        public static final FetcherType Priority;
        private final int code;

        static {
            FetcherType fetcherType = new FetcherType("Execute", 0, 0);
            Execute = fetcherType;
            FetcherType fetcherType2 = new FetcherType("Enqueue", 1, 1);
            Enqueue = fetcherType2;
            FetcherType fetcherType3 = new FetcherType("Priority", 2, 2);
            Priority = fetcherType3;
            FetcherType[] fetcherTypeArr = {fetcherType, fetcherType2, fetcherType3};
            $VALUES = fetcherTypeArr;
            $ENTRIES = new asp(fetcherTypeArr);
        }

        public FetcherType(String str, int i, int i2) {
            this.code = i2;
        }

        public static FetcherType valueOf(String str) {
            return (FetcherType) Enum.valueOf(FetcherType.class, str);
        }

        public static FetcherType[] values() {
            return (FetcherType[]) $VALUES.clone();
        }

        public final int h() {
            return this.code;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ImageStatusEventBuilder.kt */
    public static final class Status {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status CancelRequested;
        public static final Status Cancelled;
        public static final Status Failed;
        public static final Status Loaded;
        public static final Status Scheduled;
        public static final Status StartedToLoad;
        private final int code;

        static {
            Status status = new Status("Scheduled", 0, 0);
            Scheduled = status;
            Status status2 = new Status("StartedToLoad", 1, 1);
            StartedToLoad = status2;
            Status status3 = new Status("Loaded", 2, 2);
            Loaded = status3;
            Status status4 = new Status("Cancelled", 3, 3);
            Cancelled = status4;
            Status status5 = new Status("Failed", 4, 4);
            Failed = status5;
            Status status6 = new Status("CancelRequested", 5, 5);
            CancelRequested = status6;
            Status[] statusArr = {status, status2, status3, status4, status5, status6};
            $VALUES = statusArr;
            $ENTRIES = new asp(statusArr);
        }

        public Status(String str, int i, int i2) {
            this.code = i2;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }

        public final int h() {
            return this.code;
        }
    }

    public ImageStatusEventBuilder(Status status, FetcherType fetcherType) {
        super(null, null, 3);
        this.h = status;
        this.i = fetcherType;
    }

    @Override // xsna.l5m, xsna.cd6
    /* renamed from: u */
    public final qrk0 p() {
        this.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.IMAGE_LOADING_STATUS.h(), null, null, Integer.valueOf(this.h.h()), null, Integer.valueOf(this.i.h()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -42, 3, null);
        return super.p();
    }
}
