package com.sofascore.model.weeklyChallenge;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0010\u0011\u0012\u0013B)\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b\u0082\u0001\u0004\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/sofascore/model/weeklyChallenge/WeeklyStatus;", "Ljava/io/Serializable;", "previousRanking", "", "previousLeagueName", "", "newTier", "weeklyStreakCount", "<init>", "(ILjava/lang/String;II)V", "getPreviousRanking", "()I", "getPreviousLeagueName", "()Ljava/lang/String;", "getNewTier", "getWeeklyStreakCount", "WeeklyPromotion", "WeeklyDemotion", "WeeklyUnchanged", "WeeklyUnchangedOnTop", "Lcom/sofascore/model/weeklyChallenge/WeeklyStatus$WeeklyDemotion;", "Lcom/sofascore/model/weeklyChallenge/WeeklyStatus$WeeklyPromotion;", "Lcom/sofascore/model/weeklyChallenge/WeeklyStatus$WeeklyUnchanged;", "Lcom/sofascore/model/weeklyChallenge/WeeklyStatus$WeeklyUnchangedOnTop;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class WeeklyStatus implements Serializable {
    private final int newTier;

    @NotNull
    private final String previousLeagueName;
    private final int previousRanking;
    private final int weeklyStreakCount;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/sofascore/model/weeklyChallenge/WeeklyStatus$WeeklyDemotion;", "Lcom/sofascore/model/weeklyChallenge/WeeklyStatus;", "previousRanking", "", "previousLeagueName", "", "newTier", "weeklyStreakCount", "<init>", "(ILjava/lang/String;II)V", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class WeeklyDemotion extends WeeklyStatus {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WeeklyDemotion(int i, @NotNull String str, int i2, int i3) {
            super(i, str, i2, i3, null);
            str.getClass();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/sofascore/model/weeklyChallenge/WeeklyStatus$WeeklyPromotion;", "Lcom/sofascore/model/weeklyChallenge/WeeklyStatus;", "previousRanking", "", "previousLeagueName", "", "newTier", "weeklyStreakCount", "<init>", "(ILjava/lang/String;II)V", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class WeeklyPromotion extends WeeklyStatus {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WeeklyPromotion(int i, @NotNull String str, int i2, int i3) {
            super(i, str, i2, i3, null);
            str.getClass();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/sofascore/model/weeklyChallenge/WeeklyStatus$WeeklyUnchanged;", "Lcom/sofascore/model/weeklyChallenge/WeeklyStatus;", "previousRanking", "", "previousLeagueName", "", "newTier", "weeklyStreakCount", "streakBroken", "", "<init>", "(ILjava/lang/String;IIZ)V", "getStreakBroken", "()Z", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class WeeklyUnchanged extends WeeklyStatus {
        private final boolean streakBroken;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WeeklyUnchanged(int i, @NotNull String str, int i2, int i3, boolean z) {
            super(i, str, i2, i3, null);
            str.getClass();
            this.streakBroken = z;
        }

        public final boolean getStreakBroken() {
            return this.streakBroken;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/sofascore/model/weeklyChallenge/WeeklyStatus$WeeklyUnchangedOnTop;", "Lcom/sofascore/model/weeklyChallenge/WeeklyStatus;", "previousRanking", "", "previousLeagueName", "", "newTier", "weeklyStreakCount", "<init>", "(ILjava/lang/String;II)V", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class WeeklyUnchangedOnTop extends WeeklyStatus {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WeeklyUnchangedOnTop(int i, @NotNull String str, int i2, int i3) {
            super(i, str, i2, i3, null);
            str.getClass();
        }
    }

    private WeeklyStatus(int i, String str, int i2, int i3) {
        this.previousRanking = i;
        this.previousLeagueName = str;
        this.newTier = i2;
        this.weeklyStreakCount = i3;
    }

    public final int getNewTier() {
        return this.newTier;
    }

    @NotNull
    public final String getPreviousLeagueName() {
        return this.previousLeagueName;
    }

    public final int getPreviousRanking() {
        return this.previousRanking;
    }

    public final int getWeeklyStreakCount() {
        return this.weeklyStreakCount;
    }

    public /* synthetic */ WeeklyStatus(int i, String str, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, i2, i3);
    }
}
