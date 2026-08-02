package com.blaze.blazesdk.delegates.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/blaze/blazesdk/delegates/models/BlazePlayerEvent;", "Landroid/os/Parcelable;", "<init>", "()V", "OnMomentStart", "OnStoryStart", "OnVideoStart", "Lcom/blaze/blazesdk/delegates/models/BlazePlayerEvent$OnMomentStart;", "Lcom/blaze/blazesdk/delegates/models/BlazePlayerEvent$OnStoryStart;", "Lcom/blaze/blazesdk/delegates/models/BlazePlayerEvent$OnVideoStart;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class BlazePlayerEvent implements Parcelable {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/blaze/blazesdk/delegates/models/BlazePlayerEvent$OnMomentStart;", "Lcom/blaze/blazesdk/delegates/models/BlazePlayerEvent;", "params", "Lcom/blaze/blazesdk/delegates/models/OnMomentStartParams;", "<init>", "(Lcom/blaze/blazesdk/delegates/models/OnMomentStartParams;)V", "getParams", "()Lcom/blaze/blazesdk/delegates/models/OnMomentStartParams;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnMomentStart extends BlazePlayerEvent {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<OnMomentStart> CREATOR = new a();

        @NotNull
        private final OnMomentStartParams params;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new OnMomentStart(OnMomentStartParams.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OnMomentStart[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnMomentStart(@NotNull OnMomentStartParams onMomentStartParams) {
            super(null);
            onMomentStartParams.getClass();
            this.params = onMomentStartParams;
        }

        public static /* synthetic */ OnMomentStart copy$default(OnMomentStart onMomentStart, OnMomentStartParams onMomentStartParams, int i, Object obj) {
            if ((i & 1) != 0) {
                onMomentStartParams = onMomentStart.params;
            }
            return onMomentStart.copy(onMomentStartParams);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final OnMomentStartParams getParams() {
            return this.params;
        }

        @NotNull
        public final OnMomentStart copy(@NotNull OnMomentStartParams params) {
            params.getClass();
            return new OnMomentStart(params);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnMomentStart) && Intrinsics.c(this.params, ((OnMomentStart) other).params);
        }

        @NotNull
        public final OnMomentStartParams getParams() {
            return this.params;
        }

        public int hashCode() {
            return this.params.hashCode();
        }

        @NotNull
        public String toString() {
            return "OnMomentStart(params=" + this.params + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            dest.getClass();
            this.params.writeToParcel(dest, flags);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/blaze/blazesdk/delegates/models/BlazePlayerEvent$OnStoryStart;", "Lcom/blaze/blazesdk/delegates/models/BlazePlayerEvent;", "params", "Lcom/blaze/blazesdk/delegates/models/OnStoryStartParams;", "<init>", "(Lcom/blaze/blazesdk/delegates/models/OnStoryStartParams;)V", "getParams", "()Lcom/blaze/blazesdk/delegates/models/OnStoryStartParams;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnStoryStart extends BlazePlayerEvent {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<OnStoryStart> CREATOR = new a();

        @NotNull
        private final OnStoryStartParams params;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new OnStoryStart(OnStoryStartParams.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OnStoryStart[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnStoryStart(@NotNull OnStoryStartParams onStoryStartParams) {
            super(null);
            onStoryStartParams.getClass();
            this.params = onStoryStartParams;
        }

        public static /* synthetic */ OnStoryStart copy$default(OnStoryStart onStoryStart, OnStoryStartParams onStoryStartParams, int i, Object obj) {
            if ((i & 1) != 0) {
                onStoryStartParams = onStoryStart.params;
            }
            return onStoryStart.copy(onStoryStartParams);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final OnStoryStartParams getParams() {
            return this.params;
        }

        @NotNull
        public final OnStoryStart copy(@NotNull OnStoryStartParams params) {
            params.getClass();
            return new OnStoryStart(params);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnStoryStart) && Intrinsics.c(this.params, ((OnStoryStart) other).params);
        }

        @NotNull
        public final OnStoryStartParams getParams() {
            return this.params;
        }

        public int hashCode() {
            return this.params.hashCode();
        }

        @NotNull
        public String toString() {
            return "OnStoryStart(params=" + this.params + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            dest.getClass();
            this.params.writeToParcel(dest, flags);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/blaze/blazesdk/delegates/models/BlazePlayerEvent$OnVideoStart;", "Lcom/blaze/blazesdk/delegates/models/BlazePlayerEvent;", "params", "Lcom/blaze/blazesdk/delegates/models/OnVideoStartParams;", "<init>", "(Lcom/blaze/blazesdk/delegates/models/OnVideoStartParams;)V", "getParams", "()Lcom/blaze/blazesdk/delegates/models/OnVideoStartParams;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnVideoStart extends BlazePlayerEvent {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<OnVideoStart> CREATOR = new a();

        @NotNull
        private final OnVideoStartParams params;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new OnVideoStart(OnVideoStartParams.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OnVideoStart[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnVideoStart(@NotNull OnVideoStartParams onVideoStartParams) {
            super(null);
            onVideoStartParams.getClass();
            this.params = onVideoStartParams;
        }

        public static /* synthetic */ OnVideoStart copy$default(OnVideoStart onVideoStart, OnVideoStartParams onVideoStartParams, int i, Object obj) {
            if ((i & 1) != 0) {
                onVideoStartParams = onVideoStart.params;
            }
            return onVideoStart.copy(onVideoStartParams);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final OnVideoStartParams getParams() {
            return this.params;
        }

        @NotNull
        public final OnVideoStart copy(@NotNull OnVideoStartParams params) {
            params.getClass();
            return new OnVideoStart(params);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OnVideoStart) && Intrinsics.c(this.params, ((OnVideoStart) other).params);
        }

        @NotNull
        public final OnVideoStartParams getParams() {
            return this.params;
        }

        public int hashCode() {
            return this.params.hashCode();
        }

        @NotNull
        public String toString() {
            return "OnVideoStart(params=" + this.params + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            dest.getClass();
            this.params.writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ BlazePlayerEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private BlazePlayerEvent() {
    }
}
