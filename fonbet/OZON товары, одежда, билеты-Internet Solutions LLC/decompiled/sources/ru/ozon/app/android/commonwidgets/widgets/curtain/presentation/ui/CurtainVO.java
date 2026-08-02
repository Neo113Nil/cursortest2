package ru.ozon.app.android.commonwidgets.widgets.curtain.presentation.ui;

import Bl.C2639a;
import Bl.b;
import Ih.a;
import Kk.C3532b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001*B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u0006\u0010\u001e\"\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&R%\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtain/presentation/ui/CurtainVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "isShown", "Lru/ozon/app/android/commonwidgets/widgets/curtain/presentation/ui/CurtainVO$Condition;", "showCondition", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(JZLru/ozon/app/android/commonwidgets/widgets/curtain/presentation/ui/CurtainVO$Condition;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Z", "()Z", "setShown", "(Z)V", "Lru/ozon/app/android/commonwidgets/widgets/curtain/presentation/ui/CurtainVO$Condition;", "getShowCondition", "()Lru/ozon/app/android/commonwidgets/widgets/curtain/presentation/ui/CurtainVO$Condition;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "Condition", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CurtainVO implements c {

    @NotNull
    private final AtomActionDTO action;
    private final long id;
    private boolean isShown;

    @NotNull
    private final Condition showCondition;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtain/presentation/ui/CurtainVO$Condition;", "", "<init>", "()V", "ViewPort", "Lru/ozon/app/android/commonwidgets/widgets/curtain/presentation/ui/CurtainVO$Condition$ViewPort;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Condition {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtain/presentation/ui/CurtainVO$Condition$ViewPort;", "Lru/ozon/app/android/commonwidgets/widgets/curtain/presentation/ui/CurtainVO$Condition;", "<init>", "()V", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class ViewPort extends Condition {

            @NotNull
            public static final ViewPort INSTANCE = new ViewPort();

            private ViewPort() {
                super(null);
            }
        }

        public /* synthetic */ Condition(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Condition() {
        }
    }

    public CurtainVO(long j11, boolean z11, @NotNull Condition showCondition, @NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(showCondition, "showCondition");
        Intrinsics.checkNotNullParameter(action, "action");
        this.id = j11;
        this.isShown = z11;
        this.showCondition = showCondition;
        this.action = action;
        this.trackingInfo = map;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurtainVO)) {
            return false;
        }
        CurtainVO curtainVO = (CurtainVO) other;
        return this.id == curtainVO.id && this.isShown == curtainVO.isShown && Intrinsics.d(this.showCondition, curtainVO.showCondition) && Intrinsics.d(this.action, curtainVO.action) && Intrinsics.d(this.trackingInfo, curtainVO.trackingInfo);
    }

    @NotNull
    public final AtomActionDTO getAction() {
        return this.action;
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
    public final Condition getShowCondition() {
        return this.showCondition;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = a.b(this.action, (this.showCondition.hashCode() + C3532b.a(Long.hashCode(this.id) * 31, 31, this.isShown)) * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return b11 + (map == null ? 0 : map.hashCode());
    }

    /* renamed from: isShown, reason: from getter */
    public final boolean getIsShown() {
        return this.isShown;
    }

    public final void setShown(boolean z11) {
        this.isShown = z11;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        boolean z11 = this.isShown;
        Condition condition = this.showCondition;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder c11 = b.c(j11, "CurtainVO(id=", ", isShown=", z11);
        c11.append(", showCondition=");
        c11.append(condition);
        c11.append(", action=");
        c11.append(atomActionDTO);
        return C2639a.b(c11, ", trackingInfo=", map, ")");
    }
}
