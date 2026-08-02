package com.blaze.blazesdk.features.moments.models.configuration;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.blaze.blazesdk.shared.results.k;
import com.blaze.blazesdk.utils.BlazeParcelable;
import defpackage.fn0;
import defpackage.j1m;
import defpackage.wv8;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsLoopBehavior;", "Lcom/blaze/blazesdk/utils/BlazeParcelable;", "InfiniteLoop", "LoopAndAdvance", "Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsLoopBehavior$InfiniteLoop;", "Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsLoopBehavior$LoopAndAdvance;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface BlazeMomentsLoopBehavior extends BlazeParcelable {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsLoopBehavior$InfiniteLoop;", "Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsLoopBehavior;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InfiniteLoop implements BlazeMomentsLoopBehavior {
        public static final int $stable = 0;

        @NotNull
        public static final InfiniteLoop INSTANCE = new InfiniteLoop();

        @NotNull
        public static final Parcelable.Creator<InfiniteLoop> CREATOR = new a();

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return InfiniteLoop.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InfiniteLoop[i];
            }
        }

        private InfiniteLoop() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof InfiniteLoop);
        }

        public int hashCode() {
            return 546454802;
        }

        @NotNull
        public String toString() {
            return "InfiniteLoop";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            dest.getClass();
            dest.writeInt(1);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\u0003J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\u0019"}, d2 = {"Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsLoopBehavior$LoopAndAdvance;", "Lcom/blaze/blazesdk/features/moments/models/configuration/BlazeMomentsLoopBehavior;", "numberOfPlays", "", "<init>", "(I)V", "getNumberOfPlays", "()I", "_numberOfPlays", "get_numberOfPlays$blazesdk_release", "component1", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LoopAndAdvance implements BlazeMomentsLoopBehavior {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<LoopAndAdvance> CREATOR = new a();
        private final int _numberOfPlays;
        private final int numberOfPlays;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new LoopAndAdvance(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LoopAndAdvance[i];
            }
        }

        public LoopAndAdvance(int i) {
            this.numberOfPlays = i;
            if (i < 1) {
                k kVar = new k();
                kVar.g = fn0.p("numberOfPlays", String.valueOf(i));
                kVar.b("Invalid numberOfPlays value (" + i + "). Value must be at least 1. Defaulting to 1.");
                j1m.a(kVar);
                i = 1;
            }
            this._numberOfPlays = i;
        }

        public static /* synthetic */ LoopAndAdvance copy$default(LoopAndAdvance loopAndAdvance, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = loopAndAdvance.numberOfPlays;
            }
            return loopAndAdvance.copy(i);
        }

        /* renamed from: component1, reason: from getter */
        public final int getNumberOfPlays() {
            return this.numberOfPlays;
        }

        @NotNull
        public final LoopAndAdvance copy(int numberOfPlays) {
            return new LoopAndAdvance(numberOfPlays);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LoopAndAdvance) && this.numberOfPlays == ((LoopAndAdvance) other).numberOfPlays;
        }

        public final int getNumberOfPlays() {
            return this.numberOfPlays;
        }

        /* renamed from: get_numberOfPlays$blazesdk_release, reason: from getter */
        public final int get_numberOfPlays() {
            return this._numberOfPlays;
        }

        public int hashCode() {
            return Integer.hashCode(this.numberOfPlays);
        }

        @NotNull
        public String toString() {
            return wv8.j(new StringBuilder("LoopAndAdvance(numberOfPlays="), this.numberOfPlays, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            dest.getClass();
            dest.writeInt(this.numberOfPlays);
        }
    }
}
