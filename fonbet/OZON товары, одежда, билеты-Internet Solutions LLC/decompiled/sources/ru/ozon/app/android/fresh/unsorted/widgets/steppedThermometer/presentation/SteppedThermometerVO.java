package ru.ozon.app.android.fresh.unsorted.widgets.steppedThermometer.presentation;

import Bi.b;
import D3.h;
import G.g;
import Nh.a;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010\u0015R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010&\u001a\u0004\b+\u0010(R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/SteppedThermometerVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/PaddingsVO;", "paddings", "", "", "progresses", "", "progressLineColor", "Lru/ozon/uni/atoms/data/text/TextDTO;", "marks", "LWZ/t;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/PaddingsVO;Ljava/util/List;Ljava/lang/String;Ljava/util/List;LWZ/t;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/PaddingsVO;", "getPaddings", "()Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/PaddingsVO;", "Ljava/util/List;", "getProgresses", "()Ljava/util/List;", "Ljava/lang/String;", "getProgressLineColor", "getMarks", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SteppedThermometerVO implements c {

    @NotNull
    private final CellDTO cell;
    private final long id;

    @NotNull
    private final List<TextDTO> marks;

    @NotNull
    private final PaddingsVO paddings;
    private final String progressLineColor;

    @NotNull
    private final List<Integer> progresses;
    private final t tokenizedEvent;

    public SteppedThermometerVO(long j11, @NotNull CellDTO cell, @NotNull PaddingsVO paddings, @NotNull List<Integer> progresses, String str, @NotNull List<TextDTO> marks, t tVar) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(progresses, "progresses");
        Intrinsics.checkNotNullParameter(marks, "marks");
        this.id = j11;
        this.cell = cell;
        this.paddings = paddings;
        this.progresses = progresses;
        this.progressLineColor = str;
        this.marks = marks;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SteppedThermometerVO)) {
            return false;
        }
        SteppedThermometerVO steppedThermometerVO = (SteppedThermometerVO) other;
        return this.id == steppedThermometerVO.id && Intrinsics.d(this.cell, steppedThermometerVO.cell) && Intrinsics.d(this.paddings, steppedThermometerVO.paddings) && Intrinsics.d(this.progresses, steppedThermometerVO.progresses) && Intrinsics.d(this.progressLineColor, steppedThermometerVO.progressLineColor) && Intrinsics.d(this.marks, steppedThermometerVO.marks) && Intrinsics.d(this.tokenizedEvent, steppedThermometerVO.tokenizedEvent);
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<TextDTO> getMarks() {
        return this.marks;
    }

    @NotNull
    public final PaddingsVO getPaddings() {
        return this.paddings;
    }

    public final String getProgressLineColor() {
        return this.progressLineColor;
    }

    @NotNull
    public final List<Integer> getProgresses() {
        return this.progresses;
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
        int b11 = g.b((this.paddings.hashCode() + b.c(this.cell, Long.hashCode(this.id) * 31, 31)) * 31, 31, this.progresses);
        String str = this.progressLineColor;
        int b12 = g.b((b11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.marks);
        t tVar = this.tokenizedEvent;
        return b12 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        CellDTO cellDTO = this.cell;
        PaddingsVO paddingsVO = this.paddings;
        List<Integer> list = this.progresses;
        String str = this.progressLineColor;
        List<TextDTO> list2 = this.marks;
        t tVar = this.tokenizedEvent;
        StringBuilder e11 = h.e("SteppedThermometerVO(id=", j11, ", cell=", cellDTO);
        e11.append(", paddings=");
        e11.append(paddingsVO);
        e11.append(", progresses=");
        e11.append(list);
        a.g(", progressLineColor=", str, ", marks=", e11, list2);
        return Lh.a.b(e11, ", tokenizedEvent=", tVar, ")");
    }
}
