package ru.ozon.app.android.monetization.widgets.playerShowCase.v1.presentation.vertical;

import g.C6594f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.monetization.widgets.playerShowCase.v1.data.PlayerShowcaseDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/presentation/vertical/PlayerShowcaseVerticalVI;", "Ll20/c;", "", "id", "Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/data/PlayerShowcaseDTO$VideoFormat;", "videoFormat", "", "videoUrl", "<init>", "(JLru/ozon/app/android/monetization/widgets/playerShowCase/v1/data/PlayerShowcaseDTO$VideoFormat;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/data/PlayerShowcaseDTO$VideoFormat;", "getVideoFormat", "()Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/data/PlayerShowcaseDTO$VideoFormat;", "Ljava/lang/String;", "getVideoUrl", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PlayerShowcaseVerticalVI implements l20.c {
    private final long id;

    @NotNull
    private final PlayerShowcaseDTO.VideoFormat videoFormat;

    @NotNull
    private final String videoUrl;

    public PlayerShowcaseVerticalVI(long j11, @NotNull PlayerShowcaseDTO.VideoFormat videoFormat, @NotNull String videoUrl) {
        Intrinsics.checkNotNullParameter(videoFormat, "videoFormat");
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        this.id = j11;
        this.videoFormat = videoFormat;
        this.videoUrl = videoUrl;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerShowcaseVerticalVI)) {
            return false;
        }
        PlayerShowcaseVerticalVI playerShowcaseVerticalVI = (PlayerShowcaseVerticalVI) other;
        return this.id == playerShowcaseVerticalVI.id && this.videoFormat == playerShowcaseVerticalVI.videoFormat && Intrinsics.d(this.videoUrl, playerShowcaseVerticalVI.videoUrl);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final PlayerShowcaseDTO.VideoFormat getVideoFormat() {
        return this.videoFormat;
    }

    @NotNull
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.videoUrl.hashCode() + ((this.videoFormat.hashCode() + (Long.hashCode(this.id) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        PlayerShowcaseDTO.VideoFormat videoFormat = this.videoFormat;
        String str = this.videoUrl;
        StringBuilder sb2 = new StringBuilder("PlayerShowcaseVerticalVI(id=");
        sb2.append(j11);
        sb2.append(", videoFormat=");
        sb2.append(videoFormat);
        return C6594f.a(", videoUrl=", str, ")", sb2);
    }
}
