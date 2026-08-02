package ru.ozon.app.android.travel.feature.oldwidgets.widgets.reportDocument.presentation;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/reportDocument/presentation/ReportDocumentsResponseVO;", "", "", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;", "inputs", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/uni/android/flashbar/model/Restriction;", "notification", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/android/flashbar/model/Restriction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getInputs", "()Ljava/util/List;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/android/flashbar/model/Restriction;", "getNotification", "()Lru/ozon/uni/android/flashbar/model/Restriction;", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ReportDocumentsResponseVO {
    private final AtomAction action;

    @NotNull
    private final List<CommonInputVO> inputs;
    private final Restriction notification;

    /* JADX WARN: Multi-variable type inference failed */
    public ReportDocumentsResponseVO(@NotNull List<? extends CommonInputVO> inputs, AtomAction atomAction, Restriction restriction) {
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        this.inputs = inputs;
        this.action = atomAction;
        this.notification = restriction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportDocumentsResponseVO)) {
            return false;
        }
        ReportDocumentsResponseVO reportDocumentsResponseVO = (ReportDocumentsResponseVO) other;
        return Intrinsics.d(this.inputs, reportDocumentsResponseVO.inputs) && Intrinsics.d(this.action, reportDocumentsResponseVO.action) && Intrinsics.d(this.notification, reportDocumentsResponseVO.notification);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final List<CommonInputVO> getInputs() {
        return this.inputs;
    }

    public final Restriction getNotification() {
        return this.notification;
    }

    public int hashCode() {
        int hashCode = this.inputs.hashCode() * 31;
        AtomAction atomAction = this.action;
        int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        Restriction restriction = this.notification;
        return hashCode2 + (restriction != null ? restriction.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ReportDocumentsResponseVO(inputs=" + this.inputs + ", action=" + this.action + ", notification=" + this.notification + ")";
    }
}
