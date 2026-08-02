package ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.presentation.header;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.ui.molecules.header.HeaderV2VO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/header/NavigationSliderV3HeaderVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/fresh/main/ui/molecules/header/HeaderV2VO;", CommentV3DTO.HEADER_FIELD_NAME, "<init>", "(JLru/ozon/app/android/fresh/main/ui/molecules/header/HeaderV2VO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/fresh/main/ui/molecules/header/HeaderV2VO;", "getHeader", "()Lru/ozon/app/android/fresh/main/ui/molecules/header/HeaderV2VO;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class NavigationSliderV3HeaderVO implements c {
    private final HeaderV2VO header;
    private final long id;

    public NavigationSliderV3HeaderVO(long j11, HeaderV2VO headerV2VO) {
        this.id = j11;
        this.header = headerV2VO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NavigationSliderV3HeaderVO)) {
            return false;
        }
        NavigationSliderV3HeaderVO navigationSliderV3HeaderVO = (NavigationSliderV3HeaderVO) other;
        return this.id == navigationSliderV3HeaderVO.id && Intrinsics.d(this.header, navigationSliderV3HeaderVO.header);
    }

    public final HeaderV2VO getHeader() {
        return this.header;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        HeaderV2VO headerV2VO = this.header;
        return hashCode + (headerV2VO == null ? 0 : headerV2VO.hashCode());
    }

    @NotNull
    public String toString() {
        return "NavigationSliderV3HeaderVO(id=" + this.id + ", header=" + this.header + ")";
    }
}
