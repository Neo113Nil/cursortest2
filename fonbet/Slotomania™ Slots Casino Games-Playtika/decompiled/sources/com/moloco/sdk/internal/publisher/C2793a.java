package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.AdFormatType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: com.moloco.sdk.internal.publisher.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2793a implements s {
    public static final C0245a d = new C0245a(null);
    public static final int e = 8;
    public static final String f = "AdCreateLoadTimeoutManager";
    public final AdFormatType a;
    public final long b;
    public long c;

    /* renamed from: com.moloco.sdk.internal.publisher.a$a, reason: collision with other inner class name */
    public static final class C0245a {
        public /* synthetic */ C0245a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0245a() {
        }
    }

    public /* synthetic */ C2793a(AdFormatType adFormatType, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(adFormatType, j);
    }

    public final long a(long j) {
        long createAdObjectStartTime = j - getCreateAdObjectStartTime();
        long duration = DurationKt.toDuration(Duration.m12538getInWholeMillisecondsimpl(this.b) - createAdObjectStartTime, DurationUnit.MILLISECONDS);
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, f, this.a + " timeout: " + ((Object) Duration.m12567toStringimpl(this.b)) + " , create ad duration: " + createAdObjectStartTime + " ms (createTime: " + getCreateAdObjectStartTime() + " ms, loadStartTime: " + j + " ms). Return value: " + ((Object) Duration.m12567toStringimpl(duration)), false, 4, null);
        return duration;
    }

    @Override // com.moloco.sdk.internal.publisher.s
    public long getCreateAdObjectStartTime() {
        return this.c;
    }

    @Override // com.moloco.sdk.internal.publisher.s
    public void setCreateAdObjectStartTime(long j) {
        this.c = j;
    }

    public C2793a(AdFormatType adFormatType, long j) {
        Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        this.a = adFormatType;
        this.b = j;
    }
}
