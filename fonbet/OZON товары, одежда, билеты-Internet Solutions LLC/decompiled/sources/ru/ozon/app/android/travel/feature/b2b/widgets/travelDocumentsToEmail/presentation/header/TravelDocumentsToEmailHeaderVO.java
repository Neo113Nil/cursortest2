package ru.ozon.app.android.travel.feature.b2b.widgets.travelDocumentsToEmail.presentation.header;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/travelDocumentsToEmail/presentation/header/TravelDocumentsToEmailHeaderVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "annotation", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggle;", "receiveEmailToggle", "<init>", "(JLru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggle;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getAnnotation", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggle;", "getReceiveEmailToggle", "()Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleToggle;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TravelDocumentsToEmailHeaderVO implements c {

    @NotNull
    private final DisclaimerAtom annotation;
    private final long id;

    @NotNull
    private final CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle receiveEmailToggle;

    public TravelDocumentsToEmailHeaderVO(long j11, @NotNull DisclaimerAtom annotation, @NotNull CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle receiveEmailToggle) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Intrinsics.checkNotNullParameter(receiveEmailToggle, "receiveEmailToggle");
        this.id = j11;
        this.annotation = annotation;
        this.receiveEmailToggle = receiveEmailToggle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelDocumentsToEmailHeaderVO)) {
            return false;
        }
        TravelDocumentsToEmailHeaderVO travelDocumentsToEmailHeaderVO = (TravelDocumentsToEmailHeaderVO) other;
        return this.id == travelDocumentsToEmailHeaderVO.id && Intrinsics.d(this.annotation, travelDocumentsToEmailHeaderVO.annotation) && Intrinsics.d(this.receiveEmailToggle, travelDocumentsToEmailHeaderVO.receiveEmailToggle);
    }

    @NotNull
    public final DisclaimerAtom getAnnotation() {
        return this.annotation;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final CellAtom.CellAtomWithSubtitle.CellWithSubtitleToggle getReceiveEmailToggle() {
        return this.receiveEmailToggle;
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
        return this.receiveEmailToggle.hashCode() + ((this.annotation.hashCode() + (Long.hashCode(this.id) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "TravelDocumentsToEmailHeaderVO(id=" + this.id + ", annotation=" + this.annotation + ", receiveEmailToggle=" + this.receiveEmailToggle + ")";
    }
}
