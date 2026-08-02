package ru.ozon.android.composerCommonViewKit.compose.widget.commonpromobanner.presentation;

import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.compose.widget.commonpromobanner.data.CommonPromoBannerDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\t\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/presentation/CommonPromoBannerVO;", "Ll20/c;", "", "id", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/data/CommonPromoBannerDTO;", "banner", "LWZ/t;", "tokenizedEvent", "", "isClosed", "<init>", "(JLru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/data/CommonPromoBannerDTO;LWZ/t;Z)V", "copy", "(JLru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/data/CommonPromoBannerDTO;LWZ/t;Z)Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/presentation/CommonPromoBannerVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/data/CommonPromoBannerDTO;", "getBanner", "()Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/data/CommonPromoBannerDTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Z", "()Z", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CommonPromoBannerVO implements c {

    @NotNull
    private final CommonPromoBannerDTO banner;
    private final long id;
    private final boolean isClosed;
    private final t tokenizedEvent;

    public CommonPromoBannerVO(long j11, @NotNull CommonPromoBannerDTO banner, t tVar, boolean z11) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        this.id = j11;
        this.banner = banner;
        this.tokenizedEvent = tVar;
        this.isClosed = z11;
    }

    public static /* synthetic */ CommonPromoBannerVO copy$default(CommonPromoBannerVO commonPromoBannerVO, long j11, CommonPromoBannerDTO commonPromoBannerDTO, t tVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = commonPromoBannerVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            commonPromoBannerDTO = commonPromoBannerVO.banner;
        }
        CommonPromoBannerDTO commonPromoBannerDTO2 = commonPromoBannerDTO;
        if ((i11 & 4) != 0) {
            tVar = commonPromoBannerVO.tokenizedEvent;
        }
        t tVar2 = tVar;
        if ((i11 & 8) != 0) {
            z11 = commonPromoBannerVO.isClosed;
        }
        return commonPromoBannerVO.copy(j12, commonPromoBannerDTO2, tVar2, z11);
    }

    @NotNull
    public final CommonPromoBannerVO copy(long id2, @NotNull CommonPromoBannerDTO banner, t tokenizedEvent, boolean isClosed) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        return new CommonPromoBannerVO(id2, banner, tokenizedEvent, isClosed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonPromoBannerVO)) {
            return false;
        }
        CommonPromoBannerVO commonPromoBannerVO = (CommonPromoBannerVO) other;
        return this.id == commonPromoBannerVO.id && Intrinsics.d(this.banner, commonPromoBannerVO.banner) && Intrinsics.d(this.tokenizedEvent, commonPromoBannerVO.tokenizedEvent) && this.isClosed == commonPromoBannerVO.isClosed;
    }

    @NotNull
    public final CommonPromoBannerDTO getBanner() {
        return this.banner;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.banner.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        t tVar = this.tokenizedEvent;
        return Boolean.hashCode(this.isClosed) + ((hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31);
    }

    /* renamed from: isClosed, reason: from getter */
    public final boolean getIsClosed() {
        return this.isClosed;
    }

    @NotNull
    public String toString() {
        return "CommonPromoBannerVO(id=" + this.id + ", banner=" + this.banner + ", tokenizedEvent=" + this.tokenizedEvent + ", isClosed=" + this.isClosed + ")";
    }
}
