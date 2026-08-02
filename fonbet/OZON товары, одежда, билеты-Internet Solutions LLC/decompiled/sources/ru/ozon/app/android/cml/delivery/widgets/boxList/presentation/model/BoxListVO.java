package ru.ozon.app.android.cml.delivery.widgets.boxList.presentation.model;

import G.g;
import Lh.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cml.delivery.molecules.boxCard.presentation.BoxCardVO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/boxList/presentation/model/BoxListVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/cml/delivery/molecules/boxCard/presentation/BoxCardVO;", "boxList", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "boxRequirements", "LWZ/t;", "tokenizedEvent", "<init>", "(JLjava/util/List;Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getBoxList", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "getBoxRequirements", "()Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BoxListVO implements c {

    @NotNull
    private final List<BoxCardVO> boxList;
    private final DisclaimerDTO boxRequirements;
    private final long id;
    private final t tokenizedEvent;

    public BoxListVO(long j11, @NotNull List<BoxCardVO> boxList, DisclaimerDTO disclaimerDTO, t tVar) {
        Intrinsics.checkNotNullParameter(boxList, "boxList");
        this.id = j11;
        this.boxList = boxList;
        this.boxRequirements = disclaimerDTO;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoxListVO)) {
            return false;
        }
        BoxListVO boxListVO = (BoxListVO) other;
        return this.id == boxListVO.id && Intrinsics.d(this.boxList, boxListVO.boxList) && Intrinsics.d(this.boxRequirements, boxListVO.boxRequirements) && Intrinsics.d(this.tokenizedEvent, boxListVO.tokenizedEvent);
    }

    @NotNull
    public final List<BoxCardVO> getBoxList() {
        return this.boxList;
    }

    public final DisclaimerDTO getBoxRequirements() {
        return this.boxRequirements;
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
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.boxList);
        DisclaimerDTO disclaimerDTO = this.boxRequirements;
        int hashCode = (b11 + (disclaimerDTO == null ? 0 : disclaimerDTO.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<BoxCardVO> list = this.boxList;
        DisclaimerDTO disclaimerDTO = this.boxRequirements;
        t tVar = this.tokenizedEvent;
        StringBuilder b11 = b.b(j11, "BoxListVO(id=", ", boxList=", list);
        b11.append(", boxRequirements=");
        b11.append(disclaimerDTO);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(")");
        return b11.toString();
    }
}
