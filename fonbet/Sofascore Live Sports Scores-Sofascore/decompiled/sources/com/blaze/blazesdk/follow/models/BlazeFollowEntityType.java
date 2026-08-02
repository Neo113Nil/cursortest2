package com.blaze.blazesdk.follow.models;

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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/blaze/blazesdk/follow/models/BlazeFollowEntityType;", "Landroid/os/Parcelable;", "<init>", "()V", "FirstAvailable", "Player", "Team", "Property", "Lcom/blaze/blazesdk/follow/models/BlazeFollowEntityType$FirstAvailable;", "Lcom/blaze/blazesdk/follow/models/BlazeFollowEntityType$Player;", "Lcom/blaze/blazesdk/follow/models/BlazeFollowEntityType$Property;", "Lcom/blaze/blazesdk/follow/models/BlazeFollowEntityType$Team;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class BlazeFollowEntityType implements Parcelable {
    public static final int $stable = 0;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, d2 = {"Lcom/blaze/blazesdk/follow/models/BlazeFollowEntityType$FirstAvailable;", "Lcom/blaze/blazesdk/follow/models/BlazeFollowEntityType;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FirstAvailable extends BlazeFollowEntityType {
        public static final int $stable = 0;

        @NotNull
        public static final FirstAvailable INSTANCE = new FirstAvailable();

        @NotNull
        public static final Parcelable.Creator<FirstAvailable> CREATOR = new a();

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return FirstAvailable.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FirstAvailable[i];
            }
        }

        private FirstAvailable() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof FirstAvailable);
        }

        public int hashCode() {
            return -1211720677;
        }

        @NotNull
        public String toString() {
            return "FirstAvailable";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            dest.getClass();
            dest.writeInt(1);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0006\u0010\t\u001a\u00020\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/blaze/blazesdk/follow/models/BlazeFollowEntityType$Player;", "Lcom/blaze/blazesdk/follow/models/BlazeFollowEntityType;", "fallbackType", "<init>", "(Lcom/blaze/blazesdk/follow/models/BlazeFollowEntityType;)V", "getFallbackType", "()Lcom/blaze/blazesdk/follow/models/BlazeFollowEntityType;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Player extends BlazeFollowEntityType {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<Player> CREATOR = new a();

        @Nullable
        private final BlazeFollowEntityType fallbackType;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Player((BlazeFollowEntityType) parcel.readParcelable(Player.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Player[i];
            }
        }

        public Player(@Nullable BlazeFollowEntityType blazeFollowEntityType) {
            super(null);
            this.fallbackType = blazeFollowEntityType;
        }

        public static /* synthetic */ Player copy$default(Player player, BlazeFollowEntityType blazeFollowEntityType, int i, Object obj) {
            if ((i & 1) != 0) {
                blazeFollowEntityType = player.fallbackType;
            }
            return player.copy(blazeFollowEntityType);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final BlazeFollowEntityType getFallbackType() {
            return this.fallbackType;
        }

        @NotNull
        public final Player copy(@Nullable BlazeFollowEntityType fallbackType) {
            return new Player(fallbackType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Player) && Intrinsics.c(this.fallbackType, ((Player) other).fallbackType);
        }

        @Nullable
        public final BlazeFollowEntityType getFallbackType() {
            return this.fallbackType;
        }

        public int hashCode() {
            BlazeFollowEntityType blazeFollowEntityType = this.fallbackType;
            if (blazeFollowEntityType == null) {
                return 0;
            }
            return blazeFollowEntityType.hashCode();
        }

        @NotNull
        public String toString() {
            return "Player(fallbackType=" + this.fallbackType + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            dest.getClass();
            dest.writeParcelable(this.fallbackType, flags);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0006\u0010\t\u001a\u00020\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/blaze/blazesdk/follow/models/BlazeFollowEntityType$Property;", "Lcom/blaze/blazesdk/follow/models/BlazeFollowEntityType;", "fallbackType", "<init>", "(Lcom/blaze/blazesdk/follow/models/BlazeFollowEntityType;)V", "getFallbackType", "()Lcom/blaze/blazesdk/follow/models/BlazeFollowEntityType;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Property extends BlazeFollowEntityType {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<Property> CREATOR = new a();

        @Nullable
        private final BlazeFollowEntityType fallbackType;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Property((BlazeFollowEntityType) parcel.readParcelable(Property.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Property[i];
            }
        }

        public Property(@Nullable BlazeFollowEntityType blazeFollowEntityType) {
            super(null);
            this.fallbackType = blazeFollowEntityType;
        }

        public static /* synthetic */ Property copy$default(Property property, BlazeFollowEntityType blazeFollowEntityType, int i, Object obj) {
            if ((i & 1) != 0) {
                blazeFollowEntityType = property.fallbackType;
            }
            return property.copy(blazeFollowEntityType);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final BlazeFollowEntityType getFallbackType() {
            return this.fallbackType;
        }

        @NotNull
        public final Property copy(@Nullable BlazeFollowEntityType fallbackType) {
            return new Property(fallbackType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Property) && Intrinsics.c(this.fallbackType, ((Property) other).fallbackType);
        }

        @Nullable
        public final BlazeFollowEntityType getFallbackType() {
            return this.fallbackType;
        }

        public int hashCode() {
            BlazeFollowEntityType blazeFollowEntityType = this.fallbackType;
            if (blazeFollowEntityType == null) {
                return 0;
            }
            return blazeFollowEntityType.hashCode();
        }

        @NotNull
        public String toString() {
            return "Property(fallbackType=" + this.fallbackType + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            dest.getClass();
            dest.writeParcelable(this.fallbackType, flags);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Keep
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0006\u0010\t\u001a\u00020\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/blaze/blazesdk/follow/models/BlazeFollowEntityType$Team;", "Lcom/blaze/blazesdk/follow/models/BlazeFollowEntityType;", "fallbackType", "<init>", "(Lcom/blaze/blazesdk/follow/models/BlazeFollowEntityType;)V", "getFallbackType", "()Lcom/blaze/blazesdk/follow/models/BlazeFollowEntityType;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Team extends BlazeFollowEntityType {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<Team> CREATOR = new a();

        @Nullable
        private final BlazeFollowEntityType fallbackType;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Team((BlazeFollowEntityType) parcel.readParcelable(Team.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Team[i];
            }
        }

        public Team(@Nullable BlazeFollowEntityType blazeFollowEntityType) {
            super(null);
            this.fallbackType = blazeFollowEntityType;
        }

        public static /* synthetic */ Team copy$default(Team team, BlazeFollowEntityType blazeFollowEntityType, int i, Object obj) {
            if ((i & 1) != 0) {
                blazeFollowEntityType = team.fallbackType;
            }
            return team.copy(blazeFollowEntityType);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final BlazeFollowEntityType getFallbackType() {
            return this.fallbackType;
        }

        @NotNull
        public final Team copy(@Nullable BlazeFollowEntityType fallbackType) {
            return new Team(fallbackType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Team) && Intrinsics.c(this.fallbackType, ((Team) other).fallbackType);
        }

        @Nullable
        public final BlazeFollowEntityType getFallbackType() {
            return this.fallbackType;
        }

        public int hashCode() {
            BlazeFollowEntityType blazeFollowEntityType = this.fallbackType;
            if (blazeFollowEntityType == null) {
                return 0;
            }
            return blazeFollowEntityType.hashCode();
        }

        @NotNull
        public String toString() {
            return "Team(fallbackType=" + this.fallbackType + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            dest.getClass();
            dest.writeParcelable(this.fallbackType, flags);
        }
    }

    public /* synthetic */ BlazeFollowEntityType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private BlazeFollowEntityType() {
    }
}
