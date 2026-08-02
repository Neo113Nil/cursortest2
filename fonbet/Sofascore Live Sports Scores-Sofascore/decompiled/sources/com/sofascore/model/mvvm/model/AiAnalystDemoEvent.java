package com.sofascore.model.mvvm.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.fc6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0003J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006$"}, d2 = {"Lcom/sofascore/model/mvvm/model/AiAnalystDemoEvent;", "Landroid/os/Parcelable;", "id", "", "homeTeam", "Lcom/sofascore/model/mvvm/model/Team;", "awayTeam", "startTimestamp", "", "<init>", "(ILcom/sofascore/model/mvvm/model/Team;Lcom/sofascore/model/mvvm/model/Team;J)V", "getId", "()I", "getHomeTeam", "()Lcom/sofascore/model/mvvm/model/Team;", "getAwayTeam", "getStartTimestamp", "()J", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AiAnalystDemoEvent implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AiAnalystDemoEvent> CREATOR = new Creator();

    @NotNull
    private final Team awayTeam;

    @NotNull
    private final Team homeTeam;
    private final int id;
    private final long startTimestamp;

    public AiAnalystDemoEvent(int i, @NotNull Team team, @NotNull Team team2, long j) {
        team.getClass();
        team2.getClass();
        this.id = i;
        this.homeTeam = team;
        this.awayTeam = team2;
        this.startTimestamp = j;
    }

    public static /* synthetic */ AiAnalystDemoEvent copy$default(AiAnalystDemoEvent aiAnalystDemoEvent, int i, Team team, Team team2, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = aiAnalystDemoEvent.id;
        }
        if ((i2 & 2) != 0) {
            team = aiAnalystDemoEvent.homeTeam;
        }
        if ((i2 & 4) != 0) {
            team2 = aiAnalystDemoEvent.awayTeam;
        }
        if ((i2 & 8) != 0) {
            j = aiAnalystDemoEvent.startTimestamp;
        }
        Team team3 = team2;
        return aiAnalystDemoEvent.copy(i, team, team3, j);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Team getHomeTeam() {
        return this.homeTeam;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Team getAwayTeam() {
        return this.awayTeam;
    }

    /* renamed from: component4, reason: from getter */
    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    @NotNull
    public final AiAnalystDemoEvent copy(int id, @NotNull Team homeTeam, @NotNull Team awayTeam, long startTimestamp) {
        homeTeam.getClass();
        awayTeam.getClass();
        return new AiAnalystDemoEvent(id, homeTeam, awayTeam, startTimestamp);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiAnalystDemoEvent)) {
            return false;
        }
        AiAnalystDemoEvent aiAnalystDemoEvent = (AiAnalystDemoEvent) other;
        return this.id == aiAnalystDemoEvent.id && Intrinsics.c(this.homeTeam, aiAnalystDemoEvent.homeTeam) && Intrinsics.c(this.awayTeam, aiAnalystDemoEvent.awayTeam) && this.startTimestamp == aiAnalystDemoEvent.startTimestamp;
    }

    @NotNull
    public final Team getAwayTeam() {
        return this.awayTeam;
    }

    @NotNull
    public final Team getHomeTeam() {
        return this.homeTeam;
    }

    public final int getId() {
        return this.id;
    }

    public final long getStartTimestamp() {
        return this.startTimestamp;
    }

    public int hashCode() {
        return Long.hashCode(this.startTimestamp) + fc6.b(fc6.b(Integer.hashCode(this.id) * 31, 31, this.homeTeam), 31, this.awayTeam);
    }

    @NotNull
    public String toString() {
        return "AiAnalystDemoEvent(id=" + this.id + ", homeTeam=" + this.homeTeam + ", awayTeam=" + this.awayTeam + ", startTimestamp=" + this.startTimestamp + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.id);
        dest.writeSerializable(this.homeTeam);
        dest.writeSerializable(this.awayTeam);
        dest.writeLong(this.startTimestamp);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AiAnalystDemoEvent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AiAnalystDemoEvent createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new AiAnalystDemoEvent(parcel.readInt(), (Team) parcel.readSerializable(), (Team) parcel.readSerializable(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AiAnalystDemoEvent[] newArray(int i) {
            return new AiAnalystDemoEvent[i];
        }
    }
}
