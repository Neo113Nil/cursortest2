package com.sofascore.model;

import com.appsflyer.internal.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/sofascore/model/SeasonSpinnerData;", "", "id", "", "year", "", "<init>", "(ILjava/lang/String;)V", "getId", "()I", "getYear", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SeasonSpinnerData {
    private final int id;

    @NotNull
    private final String year;

    public SeasonSpinnerData(int i, @NotNull String str) {
        str.getClass();
        this.id = i;
        this.year = str;
    }

    public static /* synthetic */ SeasonSpinnerData copy$default(SeasonSpinnerData seasonSpinnerData, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = seasonSpinnerData.id;
        }
        if ((i2 & 2) != 0) {
            str = seasonSpinnerData.year;
        }
        return seasonSpinnerData.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getYear() {
        return this.year;
    }

    @NotNull
    public final SeasonSpinnerData copy(int id, @NotNull String year) {
        year.getClass();
        return new SeasonSpinnerData(id, year);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeasonSpinnerData)) {
            return false;
        }
        SeasonSpinnerData seasonSpinnerData = (SeasonSpinnerData) other;
        return this.id == seasonSpinnerData.id && Intrinsics.c(this.year, seasonSpinnerData.year);
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getYear() {
        return this.year;
    }

    public int hashCode() {
        return this.year.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        return i.g(this.id, "SeasonSpinnerData(id=", ", year=", this.year, ")");
    }
}
