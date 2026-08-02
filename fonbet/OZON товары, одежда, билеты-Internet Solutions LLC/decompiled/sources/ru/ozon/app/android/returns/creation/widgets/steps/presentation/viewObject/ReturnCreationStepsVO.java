package ru.ozon.app.android.returns.creation.widgets.steps.presentation.viewObject;

import G.g;
import Lh.b;
import Nh.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001e\u0010\rR\u0014\u0010!\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/steps/presentation/viewObject/ReturnCreationStepsVO;", "Ll20/c;", "", "id", "", "Lru/ozon/app/android/returns/creation/widgets/steps/presentation/viewObject/Step;", "steps", "", "separatorColor", "backgroundColor", "<init>", "(JLjava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getSteps", "()Ljava/util/List;", "Ljava/lang/String;", "getSeparatorColor", "getBackgroundColor", "getScrollWidgetKey", "()Ljava/lang/Integer;", "scrollWidgetKey", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReturnCreationStepsVO implements c {
    private final String backgroundColor;
    private final long id;
    private final String separatorColor;

    @NotNull
    private final List<Step> steps;

    public ReturnCreationStepsVO(long j11, @NotNull List<Step> steps, String str, String str2) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.id = j11;
        this.steps = steps;
        this.separatorColor = str;
        this.backgroundColor = str2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnCreationStepsVO)) {
            return false;
        }
        ReturnCreationStepsVO returnCreationStepsVO = (ReturnCreationStepsVO) other;
        return this.id == returnCreationStepsVO.id && Intrinsics.d(this.steps, returnCreationStepsVO.steps) && Intrinsics.d(this.separatorColor, returnCreationStepsVO.separatorColor) && Intrinsics.d(this.backgroundColor, returnCreationStepsVO.backgroundColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    @NotNull
    public Integer getScrollWidgetKey() {
        return Integer.valueOf(LinearLayoutManager.INVALID_OFFSET);
    }

    public final String getSeparatorColor() {
        return this.separatorColor;
    }

    @NotNull
    public final List<Step> getSteps() {
        return this.steps;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.steps);
        String str = this.separatorColor;
        int hashCode = (b11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backgroundColor;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<Step> list = this.steps;
        String str = this.separatorColor;
        String str2 = this.backgroundColor;
        StringBuilder b11 = b.b(j11, "ReturnCreationStepsVO(id=", ", steps=", list);
        a.h(b11, ", separatorColor=", str, ", backgroundColor=", str2);
        b11.append(")");
        return b11.toString();
    }
}
