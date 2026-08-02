package ru.ozon.app.android.travel.feature.general.common.widgets.travelLinkButton.v1.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.linkButton.LinkButtonVO;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelLinkButton/v1/presentation/TravelLinkButtonVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "link", "<init>", "(JLru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;)V", "J", "getId", "()J", "Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "getLink", "()Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelLinkButtonVO implements c {
    public static final int $stable = LinkButtonVO.$stable;
    private final long id;

    @NotNull
    private final LinkButtonVO link;

    public TravelLinkButtonVO(long j11, @NotNull LinkButtonVO link) {
        Intrinsics.checkNotNullParameter(link, "link");
        this.id = j11;
        this.link = link;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final LinkButtonVO getLink() {
        return this.link;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }
}
