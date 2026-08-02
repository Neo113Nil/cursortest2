package ru.ozon.app.android.travel.feature.general.common.widgets.travelSorting.v2.presentation;

import El.C2971a;
import Gl.C3124a;
import Kk.C3532b;
import Ns.b;
import TY.a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u000e\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b\r\u0010*R\u001f\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelSorting/v2/presentation/TravelSortingV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "trainOption", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "sortingButton", "", "Lru/ozon/uni/atoms/data/controls/tag/TagButtonDTO;", "fastSortingButtons", "", "isFastSortingButtonsVisible", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;ZLWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTrainOption", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getSortingButton", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "Ljava/util/List;", "getFastSortingButtons", "()Ljava/util/List;", "Z", "()Z", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelSortingV2VO implements c {
    private final List<TagButtonDTO> fastSortingButtons;
    private final long id;
    private final boolean isFastSortingButtonsVisible;

    @NotNull
    private final BadgeDTO sortingButton;
    private final t tokenizedEvent;

    @NotNull
    private final TextDTO trainOption;

    public TravelSortingV2VO(long j11, @NotNull TextDTO trainOption, @NotNull BadgeDTO sortingButton, List<TagButtonDTO> list, boolean z11, t tVar) {
        Intrinsics.checkNotNullParameter(trainOption, "trainOption");
        Intrinsics.checkNotNullParameter(sortingButton, "sortingButton");
        this.id = j11;
        this.trainOption = trainOption;
        this.sortingButton = sortingButton;
        this.fastSortingButtons = list;
        this.isFastSortingButtonsVisible = z11;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelSortingV2VO)) {
            return false;
        }
        TravelSortingV2VO travelSortingV2VO = (TravelSortingV2VO) other;
        return this.id == travelSortingV2VO.id && Intrinsics.d(this.trainOption, travelSortingV2VO.trainOption) && Intrinsics.d(this.sortingButton, travelSortingV2VO.sortingButton) && Intrinsics.d(this.fastSortingButtons, travelSortingV2VO.fastSortingButtons) && this.isFastSortingButtonsVisible == travelSortingV2VO.isFastSortingButtonsVisible && Intrinsics.d(this.tokenizedEvent, travelSortingV2VO.tokenizedEvent);
    }

    public final List<TagButtonDTO> getFastSortingButtons() {
        return this.fastSortingButtons;
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
    public final BadgeDTO getSortingButton() {
        return this.sortingButton;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @NotNull
    public final TextDTO getTrainOption() {
        return this.trainOption;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int c11 = C3124a.c(this.sortingButton, b.a(this.trainOption, Long.hashCode(this.id) * 31, 31), 31);
        List<TagButtonDTO> list = this.fastSortingButtons;
        int a11 = C3532b.a((c11 + (list == null ? 0 : list.hashCode())) * 31, 31, this.isFastSortingButtonsVisible);
        t tVar = this.tokenizedEvent;
        return a11 + (tVar != null ? tVar.hashCode() : 0);
    }

    /* renamed from: isFastSortingButtonsVisible, reason: from getter */
    public final boolean getIsFastSortingButtonsVisible() {
        return this.isFastSortingButtonsVisible;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.trainOption;
        BadgeDTO badgeDTO = this.sortingButton;
        List<TagButtonDTO> list = this.fastSortingButtons;
        boolean z11 = this.isFastSortingButtonsVisible;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = a.b("TravelSortingV2VO(id=", j11, ", trainOption=", textDTO);
        b11.append(", sortingButton=");
        b11.append(badgeDTO);
        b11.append(", fastSortingButtons=");
        b11.append(list);
        C2971a.d(b11, ", isFastSortingButtonsVisible=", z11, ", tokenizedEvent=", tVar);
        b11.append(")");
        return b11.toString();
    }
}
