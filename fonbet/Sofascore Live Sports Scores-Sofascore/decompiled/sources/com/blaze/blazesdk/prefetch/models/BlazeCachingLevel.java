package com.blaze.blazesdk.prefetch.models;

import androidx.annotation.Keep;
import defpackage.gz8;
import defpackage.jp5;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.b;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\r\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B/\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/blaze/blazesdk/prefetch/models/BlazeCachingLevel;", "", "numOfItemsToPrefetchBeforePlaying", "", "numOfMomentsToPrefetchWhenPlaying", "numOfVideosToPrefetchWhenPlaying", "numOfPagesInEachStoryToPrefetchWhenPlaying", "", "<init>", "(Ljava/lang/String;IIIILjava/util/List;)V", "getNumOfItemsToPrefetchBeforePlaying$blazesdk_release", "()I", "getNumOfMomentsToPrefetchWhenPlaying$blazesdk_release", "getNumOfVideosToPrefetchWhenPlaying$blazesdk_release", "getNumOfPagesInEachStoryToPrefetchWhenPlaying$blazesdk_release", "()Ljava/util/List;", "LOW", "DEFAULT", "HIGH", "EXTREME", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazeCachingLevel {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ BlazeCachingLevel[] $VALUES;
    private final int numOfItemsToPrefetchBeforePlaying;
    private final int numOfMomentsToPrefetchWhenPlaying;

    @NotNull
    private final List<Integer> numOfPagesInEachStoryToPrefetchWhenPlaying;
    private final int numOfVideosToPrefetchWhenPlaying;

    @Keep
    public static final BlazeCachingLevel LOW = new BlazeCachingLevel("LOW", 0, 0, 1, 1, b.j(1, 1));

    @Keep
    public static final BlazeCachingLevel DEFAULT = new BlazeCachingLevel("DEFAULT", 1, 1, 2, 2, b.j(2, 2, 1));

    @Keep
    public static final BlazeCachingLevel HIGH = new BlazeCachingLevel("HIGH", 2, 3, 3, 3, b.j(3, 2, 2));

    @Keep
    public static final BlazeCachingLevel EXTREME = new BlazeCachingLevel("EXTREME", 3, 5, 4, 4, b.j(4, 3, 2, 1));

    private static final /* synthetic */ BlazeCachingLevel[] $values() {
        return new BlazeCachingLevel[]{LOW, DEFAULT, HIGH, EXTREME};
    }

    static {
        BlazeCachingLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private BlazeCachingLevel(String str, int i, int i2, int i3, int i4, List list) {
        this.numOfItemsToPrefetchBeforePlaying = i2;
        this.numOfMomentsToPrefetchWhenPlaying = i3;
        this.numOfVideosToPrefetchWhenPlaying = i4;
        this.numOfPagesInEachStoryToPrefetchWhenPlaying = list;
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static BlazeCachingLevel valueOf(String str) {
        return (BlazeCachingLevel) Enum.valueOf(BlazeCachingLevel.class, str);
    }

    public static BlazeCachingLevel[] values() {
        return (BlazeCachingLevel[]) $VALUES.clone();
    }

    /* renamed from: getNumOfItemsToPrefetchBeforePlaying$blazesdk_release, reason: from getter */
    public final int getNumOfItemsToPrefetchBeforePlaying() {
        return this.numOfItemsToPrefetchBeforePlaying;
    }

    /* renamed from: getNumOfMomentsToPrefetchWhenPlaying$blazesdk_release, reason: from getter */
    public final int getNumOfMomentsToPrefetchWhenPlaying() {
        return this.numOfMomentsToPrefetchWhenPlaying;
    }

    @NotNull
    public final List<Integer> getNumOfPagesInEachStoryToPrefetchWhenPlaying$blazesdk_release() {
        return this.numOfPagesInEachStoryToPrefetchWhenPlaying;
    }

    /* renamed from: getNumOfVideosToPrefetchWhenPlaying$blazesdk_release, reason: from getter */
    public final int getNumOfVideosToPrefetchWhenPlaying() {
        return this.numOfVideosToPrefetchWhenPlaying;
    }
}
