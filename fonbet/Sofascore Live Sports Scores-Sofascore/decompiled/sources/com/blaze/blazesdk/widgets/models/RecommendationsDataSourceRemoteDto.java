package com.blaze.blazesdk.widgets.models;

import androidx.annotation.Keep;
import defpackage.b6h;
import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/blaze/blazesdk/widgets/models/RecommendationsDataSourceRemoteDto;", "", "<init>", "(Ljava/lang/String;I)V", "TRENDING", "FOR_YOU", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RecommendationsDataSourceRemoteDto {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ RecommendationsDataSourceRemoteDto[] $VALUES;

    @b6h("Trending")
    public static final RecommendationsDataSourceRemoteDto TRENDING = new RecommendationsDataSourceRemoteDto("TRENDING", 0);

    @b6h("ForYou")
    public static final RecommendationsDataSourceRemoteDto FOR_YOU = new RecommendationsDataSourceRemoteDto("FOR_YOU", 1);

    private static final /* synthetic */ RecommendationsDataSourceRemoteDto[] $values() {
        return new RecommendationsDataSourceRemoteDto[]{TRENDING, FOR_YOU};
    }

    static {
        RecommendationsDataSourceRemoteDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
    }

    private RecommendationsDataSourceRemoteDto(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static RecommendationsDataSourceRemoteDto valueOf(String str) {
        return (RecommendationsDataSourceRemoteDto) Enum.valueOf(RecommendationsDataSourceRemoteDto.class, str);
    }

    public static RecommendationsDataSourceRemoteDto[] values() {
        return (RecommendationsDataSourceRemoteDto[]) $VALUES.clone();
    }
}
