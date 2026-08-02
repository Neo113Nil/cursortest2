package com.sofascore.model.weeklyChallenge;

import defpackage.dmi;
import defpackage.oea;
import defpackage.r5h;
import defpackage.t5h;
import defpackage.wf3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fBU\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJL\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010\u001dJ\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001bJ\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b1\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b2\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b3\u0010\u001d¨\u00066"}, d2 = {"Lcom/sofascore/model/weeklyChallenge/WeeklyChallengeLeagueAsset;", "", "", "level", "", "title", "Lcom/sofascore/model/weeklyChallenge/WeeklyLeagueImageUrl;", "imageUrl", "lockedImageLightUrl", "lockedImageAmoledUrl", "hex", "<init>", "(ILjava/lang/String;Lcom/sofascore/model/weeklyChallenge/WeeklyLeagueImageUrl;Lcom/sofascore/model/weeklyChallenge/WeeklyLeagueImageUrl;Lcom/sofascore/model/weeklyChallenge/WeeklyLeagueImageUrl;Ljava/lang/String;)V", "seen0", "Lt5h;", "serializationConstructorMarker", "(IILjava/lang/String;Lcom/sofascore/model/weeklyChallenge/WeeklyLeagueImageUrl;Lcom/sofascore/model/weeklyChallenge/WeeklyLeagueImageUrl;Lcom/sofascore/model/weeklyChallenge/WeeklyLeagueImageUrl;Ljava/lang/String;Lt5h;)V", "self", "Lwf3;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$model_release", "(Lcom/sofascore/model/weeklyChallenge/WeeklyChallengeLeagueAsset;Lwf3;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Lcom/sofascore/model/weeklyChallenge/WeeklyLeagueImageUrl;", "component4", "component5", "component6", "copy", "(ILjava/lang/String;Lcom/sofascore/model/weeklyChallenge/WeeklyLeagueImageUrl;Lcom/sofascore/model/weeklyChallenge/WeeklyLeagueImageUrl;Lcom/sofascore/model/weeklyChallenge/WeeklyLeagueImageUrl;Ljava/lang/String;)Lcom/sofascore/model/weeklyChallenge/WeeklyChallengeLeagueAsset;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getLevel", "Ljava/lang/String;", "getTitle", "Lcom/sofascore/model/weeklyChallenge/WeeklyLeagueImageUrl;", "getImageUrl", "getLockedImageLightUrl", "getLockedImageAmoledUrl", "getHex", "Companion", "$serializer", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class WeeklyChallengeLeagueAsset {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String hex;

    @NotNull
    private final WeeklyLeagueImageUrl imageUrl;
    private final int level;

    @NotNull
    private final WeeklyLeagueImageUrl lockedImageAmoledUrl;

    @NotNull
    private final WeeklyLeagueImageUrl lockedImageLightUrl;

    @NotNull
    private final String title;

    public /* synthetic */ WeeklyChallengeLeagueAsset(int i, int i2, String str, WeeklyLeagueImageUrl weeklyLeagueImageUrl, WeeklyLeagueImageUrl weeklyLeagueImageUrl2, WeeklyLeagueImageUrl weeklyLeagueImageUrl3, String str2, t5h t5hVar) {
        if (63 != (i & 63)) {
            oea.z(i, 63, WeeklyChallengeLeagueAsset$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.level = i2;
        this.title = str;
        this.imageUrl = weeklyLeagueImageUrl;
        this.lockedImageLightUrl = weeklyLeagueImageUrl2;
        this.lockedImageAmoledUrl = weeklyLeagueImageUrl3;
        this.hex = str2;
    }

    public static /* synthetic */ WeeklyChallengeLeagueAsset copy$default(WeeklyChallengeLeagueAsset weeklyChallengeLeagueAsset, int i, String str, WeeklyLeagueImageUrl weeklyLeagueImageUrl, WeeklyLeagueImageUrl weeklyLeagueImageUrl2, WeeklyLeagueImageUrl weeklyLeagueImageUrl3, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = weeklyChallengeLeagueAsset.level;
        }
        if ((i2 & 2) != 0) {
            str = weeklyChallengeLeagueAsset.title;
        }
        if ((i2 & 4) != 0) {
            weeklyLeagueImageUrl = weeklyChallengeLeagueAsset.imageUrl;
        }
        if ((i2 & 8) != 0) {
            weeklyLeagueImageUrl2 = weeklyChallengeLeagueAsset.lockedImageLightUrl;
        }
        if ((i2 & 16) != 0) {
            weeklyLeagueImageUrl3 = weeklyChallengeLeagueAsset.lockedImageAmoledUrl;
        }
        if ((i2 & 32) != 0) {
            str2 = weeklyChallengeLeagueAsset.hex;
        }
        WeeklyLeagueImageUrl weeklyLeagueImageUrl4 = weeklyLeagueImageUrl3;
        String str3 = str2;
        return weeklyChallengeLeagueAsset.copy(i, str, weeklyLeagueImageUrl, weeklyLeagueImageUrl2, weeklyLeagueImageUrl4, str3);
    }

    public static final /* synthetic */ void write$Self$model_release(WeeklyChallengeLeagueAsset self, wf3 output, SerialDescriptor serialDesc) {
        output.u(0, self.level, serialDesc);
        output.y(serialDesc, 1, self.title);
        WeeklyLeagueImageUrl$$serializer weeklyLeagueImageUrl$$serializer = WeeklyLeagueImageUrl$$serializer.INSTANCE;
        output.f(serialDesc, 2, weeklyLeagueImageUrl$$serializer, self.imageUrl);
        output.f(serialDesc, 3, weeklyLeagueImageUrl$$serializer, self.lockedImageLightUrl);
        output.f(serialDesc, 4, weeklyLeagueImageUrl$$serializer, self.lockedImageAmoledUrl);
        output.y(serialDesc, 5, self.hex);
    }

    /* renamed from: component1, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final WeeklyLeagueImageUrl getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final WeeklyLeagueImageUrl getLockedImageLightUrl() {
        return this.lockedImageLightUrl;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final WeeklyLeagueImageUrl getLockedImageAmoledUrl() {
        return this.lockedImageAmoledUrl;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getHex() {
        return this.hex;
    }

    @NotNull
    public final WeeklyChallengeLeagueAsset copy(int level, @NotNull String title, @NotNull WeeklyLeagueImageUrl imageUrl, @NotNull WeeklyLeagueImageUrl lockedImageLightUrl, @NotNull WeeklyLeagueImageUrl lockedImageAmoledUrl, @NotNull String hex) {
        title.getClass();
        imageUrl.getClass();
        lockedImageLightUrl.getClass();
        lockedImageAmoledUrl.getClass();
        hex.getClass();
        return new WeeklyChallengeLeagueAsset(level, title, imageUrl, lockedImageLightUrl, lockedImageAmoledUrl, hex);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeeklyChallengeLeagueAsset)) {
            return false;
        }
        WeeklyChallengeLeagueAsset weeklyChallengeLeagueAsset = (WeeklyChallengeLeagueAsset) other;
        return this.level == weeklyChallengeLeagueAsset.level && Intrinsics.c(this.title, weeklyChallengeLeagueAsset.title) && Intrinsics.c(this.imageUrl, weeklyChallengeLeagueAsset.imageUrl) && Intrinsics.c(this.lockedImageLightUrl, weeklyChallengeLeagueAsset.lockedImageLightUrl) && Intrinsics.c(this.lockedImageAmoledUrl, weeklyChallengeLeagueAsset.lockedImageAmoledUrl) && Intrinsics.c(this.hex, weeklyChallengeLeagueAsset.hex);
    }

    @NotNull
    public final String getHex() {
        return this.hex;
    }

    @NotNull
    public final WeeklyLeagueImageUrl getImageUrl() {
        return this.imageUrl;
    }

    public final int getLevel() {
        return this.level;
    }

    @NotNull
    public final WeeklyLeagueImageUrl getLockedImageAmoledUrl() {
        return this.lockedImageAmoledUrl;
    }

    @NotNull
    public final WeeklyLeagueImageUrl getLockedImageLightUrl() {
        return this.lockedImageLightUrl;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.hex.hashCode() + ((this.lockedImageAmoledUrl.hashCode() + ((this.lockedImageLightUrl.hashCode() + ((this.imageUrl.hashCode() + dmi.c(Integer.hashCode(this.level) * 31, 31, this.title)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        int i = this.level;
        String str = this.title;
        WeeklyLeagueImageUrl weeklyLeagueImageUrl = this.imageUrl;
        WeeklyLeagueImageUrl weeklyLeagueImageUrl2 = this.lockedImageLightUrl;
        WeeklyLeagueImageUrl weeklyLeagueImageUrl3 = this.lockedImageAmoledUrl;
        String str2 = this.hex;
        StringBuilder t = dmi.t(i, "WeeklyChallengeLeagueAsset(level=", ", title=", str, ", imageUrl=");
        t.append(weeklyLeagueImageUrl);
        t.append(", lockedImageLightUrl=");
        t.append(weeklyLeagueImageUrl2);
        t.append(", lockedImageAmoledUrl=");
        t.append(weeklyLeagueImageUrl3);
        t.append(", hex=");
        t.append(str2);
        t.append(")");
        return t.toString();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/weeklyChallenge/WeeklyChallengeLeagueAsset$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/weeklyChallenge/WeeklyChallengeLeagueAsset;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return WeeklyChallengeLeagueAsset$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public WeeklyChallengeLeagueAsset(int i, @NotNull String str, @NotNull WeeklyLeagueImageUrl weeklyLeagueImageUrl, @NotNull WeeklyLeagueImageUrl weeklyLeagueImageUrl2, @NotNull WeeklyLeagueImageUrl weeklyLeagueImageUrl3, @NotNull String str2) {
        str.getClass();
        weeklyLeagueImageUrl.getClass();
        weeklyLeagueImageUrl2.getClass();
        weeklyLeagueImageUrl3.getClass();
        str2.getClass();
        this.level = i;
        this.title = str;
        this.imageUrl = weeklyLeagueImageUrl;
        this.lockedImageLightUrl = weeklyLeagueImageUrl2;
        this.lockedImageAmoledUrl = weeklyLeagueImageUrl3;
        this.hex = str2;
    }
}
