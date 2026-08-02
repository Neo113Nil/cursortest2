package ru.ozon.app.android.monetization.widgets.playerShowCase.v1.presentation.horizontal;

import D3.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.monetization.widgets.playerShowCase.v1.data.PlayerShowcaseDTO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/presentation/horizontal/PlayerShowcaseHorizontalVI;", "Ll20/c;", "", "id", "Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/data/PlayerShowcaseDTO$VideoFormat;", "videoFormat", "", "", "videoUrls", "<init>", "(JLru/ozon/app/android/monetization/widgets/playerShowCase/v1/data/PlayerShowcaseDTO$VideoFormat;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/data/PlayerShowcaseDTO$VideoFormat;", "getVideoFormat", "()Lru/ozon/app/android/monetization/widgets/playerShowCase/v1/data/PlayerShowcaseDTO$VideoFormat;", "Ljava/util/List;", "getVideoUrls", "()Ljava/util/List;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PlayerShowcaseHorizontalVI implements l20.c {
    private final long id;

    @NotNull
    private final PlayerShowcaseDTO.VideoFormat videoFormat;

    @NotNull
    private final List<String> videoUrls;

    public PlayerShowcaseHorizontalVI(long j11, @NotNull PlayerShowcaseDTO.VideoFormat videoFormat, @NotNull List<String> videoUrls) {
        Intrinsics.checkNotNullParameter(videoFormat, "videoFormat");
        Intrinsics.checkNotNullParameter(videoUrls, "videoUrls");
        this.id = j11;
        this.videoFormat = videoFormat;
        this.videoUrls = videoUrls;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerShowcaseHorizontalVI)) {
            return false;
        }
        PlayerShowcaseHorizontalVI playerShowcaseHorizontalVI = (PlayerShowcaseHorizontalVI) other;
        return this.id == playerShowcaseHorizontalVI.id && this.videoFormat == playerShowcaseHorizontalVI.videoFormat && Intrinsics.d(this.videoUrls, playerShowcaseHorizontalVI.videoUrls);
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
    public final List<String> getVideoUrls() {
        return this.videoUrls;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.videoUrls.hashCode() + ((this.videoFormat.hashCode() + (Long.hashCode(this.id) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        PlayerShowcaseDTO.VideoFormat videoFormat = this.videoFormat;
        List<String> list = this.videoUrls;
        StringBuilder sb2 = new StringBuilder("PlayerShowcaseHorizontalVI(id=");
        sb2.append(j11);
        sb2.append(", videoFormat=");
        sb2.append(videoFormat);
        return h.c(sb2, ", videoUrls=", list, ")");
    }
}
