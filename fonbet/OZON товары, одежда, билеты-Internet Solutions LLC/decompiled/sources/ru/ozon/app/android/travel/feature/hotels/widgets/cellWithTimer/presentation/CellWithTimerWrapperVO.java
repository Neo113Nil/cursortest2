package ru.ozon.app.android.travel.feature.hotels.widgets.cellWithTimer.presentation;

import A00.a;
import B90.C2619v;
import Bi.b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.cellWithTimer.CellWithTimerVO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003BA\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011JT\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b'\u0010 R\u001f\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b\u000f\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/cellWithTimer/presentation/CellWithTimerWrapperVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "LA00/a$J$a;", "", "id", "Lru/ozon/app/android/travel/molecules/view/cellWithTimer/CellWithTimerVO;", "cellVo", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "prefix", "remainingSeconds", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "", "isNotInitialVo", "<init>", "(JLru/ozon/app/android/travel/molecules/view/cellWithTimer/CellWithTimerVO;Lru/ozon/uni/atoms/data/texts/TextAtom;JLWZ/t;Z)V", "copy", "(JLru/ozon/app/android/travel/molecules/view/cellWithTimer/CellWithTimerVO;Lru/ozon/uni/atoms/data/texts/TextAtom;JLWZ/t;Z)Lru/ozon/app/android/travel/feature/hotels/widgets/cellWithTimer/presentation/CellWithTimerWrapperVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/molecules/view/cellWithTimer/CellWithTimerVO;", "getCellVo", "()Lru/ozon/app/android/travel/molecules/view/cellWithTimer/CellWithTimerVO;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getPrefix", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getRemainingSeconds", "LWZ/t;", "getViewEvent", "()LWZ/t;", "Z", "()Z", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CellWithTimerWrapperVO implements c, a.J.InterfaceC0007a {

    @NotNull
    private final CellWithTimerVO cellVo;
    private final long id;
    private final boolean isNotInitialVo;

    @NotNull
    private final TextAtom prefix;
    private final long remainingSeconds;
    private final t viewEvent;

    public CellWithTimerWrapperVO(long j11, @NotNull CellWithTimerVO cellVo, @NotNull TextAtom prefix, long j12, t tVar, boolean z11) {
        Intrinsics.checkNotNullParameter(cellVo, "cellVo");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        this.id = j11;
        this.cellVo = cellVo;
        this.prefix = prefix;
        this.remainingSeconds = j12;
        this.viewEvent = tVar;
        this.isNotInitialVo = z11;
    }

    public static /* synthetic */ CellWithTimerWrapperVO copy$default(CellWithTimerWrapperVO cellWithTimerWrapperVO, long j11, CellWithTimerVO cellWithTimerVO, TextAtom textAtom, long j12, t tVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = cellWithTimerWrapperVO.id;
        }
        long j13 = j11;
        if ((i11 & 2) != 0) {
            cellWithTimerVO = cellWithTimerWrapperVO.cellVo;
        }
        CellWithTimerVO cellWithTimerVO2 = cellWithTimerVO;
        if ((i11 & 4) != 0) {
            textAtom = cellWithTimerWrapperVO.prefix;
        }
        TextAtom textAtom2 = textAtom;
        if ((i11 & 8) != 0) {
            j12 = cellWithTimerWrapperVO.remainingSeconds;
        }
        return cellWithTimerWrapperVO.copy(j13, cellWithTimerVO2, textAtom2, j12, (i11 & 16) != 0 ? cellWithTimerWrapperVO.viewEvent : tVar, (i11 & 32) != 0 ? cellWithTimerWrapperVO.isNotInitialVo : z11);
    }

    @NotNull
    public final CellWithTimerWrapperVO copy(long id2, @NotNull CellWithTimerVO cellVo, @NotNull TextAtom prefix, long remainingSeconds, t viewEvent, boolean isNotInitialVo) {
        Intrinsics.checkNotNullParameter(cellVo, "cellVo");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return new CellWithTimerWrapperVO(id2, cellVo, prefix, remainingSeconds, viewEvent, isNotInitialVo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CellWithTimerWrapperVO)) {
            return false;
        }
        CellWithTimerWrapperVO cellWithTimerWrapperVO = (CellWithTimerWrapperVO) other;
        return this.id == cellWithTimerWrapperVO.id && Intrinsics.d(this.cellVo, cellWithTimerWrapperVO.cellVo) && Intrinsics.d(this.prefix, cellWithTimerWrapperVO.prefix) && this.remainingSeconds == cellWithTimerWrapperVO.remainingSeconds && Intrinsics.d(this.viewEvent, cellWithTimerWrapperVO.viewEvent) && this.isNotInitialVo == cellWithTimerWrapperVO.isNotInitialVo;
    }

    @NotNull
    public final CellWithTimerVO getCellVo() {
        return this.cellVo;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final long getRemainingSeconds() {
        return this.remainingSeconds;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = Pk0.c.a(C2619v.b((this.cellVo.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31, this.prefix), 31, this.remainingSeconds);
        t tVar = this.viewEvent;
        return Boolean.hashCode(this.isNotInitialVo) + ((a11 + (tVar == null ? 0 : tVar.hashCode())) * 31);
    }

    /* renamed from: isNotInitialVo, reason: from getter */
    public final boolean getIsNotInitialVo() {
        return this.isNotInitialVo;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        CellWithTimerVO cellWithTimerVO = this.cellVo;
        TextAtom textAtom = this.prefix;
        long j12 = this.remainingSeconds;
        t tVar = this.viewEvent;
        boolean z11 = this.isNotInitialVo;
        StringBuilder sb2 = new StringBuilder("CellWithTimerWrapperVO(id=");
        sb2.append(j11);
        sb2.append(", cellVo=");
        sb2.append(cellWithTimerVO);
        sb2.append(", prefix=");
        sb2.append(textAtom);
        sb2.append(", remainingSeconds=");
        sb2.append(j12);
        sb2.append(", viewEvent=");
        sb2.append(tVar);
        return b.f(sb2, ", isNotInitialVo=", z11, ")");
    }

    public /* synthetic */ CellWithTimerWrapperVO(long j11, CellWithTimerVO cellWithTimerVO, TextAtom textAtom, long j12, t tVar, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, cellWithTimerVO, textAtom, j12, tVar, (i11 & 32) != 0 ? false : z11);
    }
}
