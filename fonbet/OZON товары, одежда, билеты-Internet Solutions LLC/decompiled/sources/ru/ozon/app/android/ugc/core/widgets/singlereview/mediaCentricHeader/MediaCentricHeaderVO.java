package ru.ozon.app.android.ugc.core.widgets.singlereview.mediaCentricHeader;

import kotlin.Metadata;
import l20.c;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/mediaCentricHeader/MediaCentricHeaderVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "ratingIcon", "Lru/ozon/uni/atoms/data/text/TextDTO;", "ratingValue", "separator", "date", "<init>", "(JLru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getRatingIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getRatingValue", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSeparator", "getDate", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MediaCentricHeaderVO implements c {
    public static final int $stable = IconDTO.$stable;
    private final TextDTO date;
    private final long id;
    private final IconDTO ratingIcon;
    private final TextDTO ratingValue;
    private final TextDTO separator;

    public MediaCentricHeaderVO(long j11, IconDTO iconDTO, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3) {
        this.id = j11;
        this.ratingIcon = iconDTO;
        this.ratingValue = textDTO;
        this.separator = textDTO2;
        this.date = textDTO3;
    }

    public final TextDTO getDate() {
        return this.date;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final IconDTO getRatingIcon() {
        return this.ratingIcon;
    }

    public final TextDTO getRatingValue() {
        return this.ratingValue;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final TextDTO getSeparator() {
        return this.separator;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }
}
