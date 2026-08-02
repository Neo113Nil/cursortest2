package com.sports.insider.data.entity.prediction;

import androidx.annotation.Keep;
import d9.e;
import kotlin.Metadata;
import nc.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\bJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\b\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0004\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/sports/insider/data/entity/prediction/Score;", "Lnc/d;", "", "home", "guest", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lcom/sports/insider/data/entity/prediction/Score;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getHome", "setHome", "(I)V", "getGuest", "setGuest", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Score implements d {
    private int guest;
    private int home;

    public Score(int i5, int i10) {
        this.home = i5;
        this.guest = i10;
    }

    public static /* synthetic */ Score copy$default(Score score, int i5, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i5 = score.home;
        }
        if ((i11 & 2) != 0) {
            i10 = score.guest;
        }
        return score.copy(i5, i10);
    }

    /* renamed from: component1, reason: from getter */
    public final int getHome() {
        return this.home;
    }

    /* renamed from: component2, reason: from getter */
    public final int getGuest() {
        return this.guest;
    }

    @NotNull
    public final Score copy(int home, int guest) {
        return new Score(home, guest);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Score)) {
            return false;
        }
        Score score = (Score) other;
        return this.home == score.home && this.guest == score.guest;
    }

    public int getGuest() {
        return this.guest;
    }

    public int getHome() {
        return this.home;
    }

    public int hashCode() {
        return (this.home * 31) + this.guest;
    }

    public void setGuest(int i5) {
        this.guest = i5;
    }

    public void setHome(int i5) {
        this.home = i5;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Score(home=");
        sb2.append(this.home);
        sb2.append(", guest=");
        return e.i(sb2, this.guest, ')');
    }
}
