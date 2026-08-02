package ru.ozon.app.android.orderdetails.orderactions.v2.presentation;

import Kk.C3532b;
import Ns.b;
import Pk0.h;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001aB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/orderdetails/orderactions/v2/presentation/OrderActionsV2VO;", "Ll20/c;", "", "id", "", "Lru/ozon/app/android/orderdetails/orderactions/v2/presentation/OrderActionsV2VO$OrderActionV2VO;", "actions", "<init>", "(JLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getActions", "()Ljava/util/List;", "OrderActionV2VO", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OrderActionsV2VO implements c {

    @NotNull
    private final List<OrderActionV2VO> actions;
    private final long id;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0013R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b\r\u0010)R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/orderdetails/orderactions/v2/presentation/OrderActionsV2VO$OrderActionV2VO;", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "backgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "", "isVertical", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;ZLru/ozon/uni/atoms/data/TestInfo;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Z", "()Z", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OrderActionV2VO {
        private final AtomAction action;
        private final String backgroundColor;

        @NotNull
        private final IconDTO icon;
        private final boolean isVertical;

        @NotNull
        private final TestInfo testInfo;

        @NotNull
        private final TextDTO title;
        private final t tokenizedEvent;

        public OrderActionV2VO(@NotNull IconDTO icon, @NotNull TextDTO title, String str, AtomAction atomAction, t tVar, boolean z11, @NotNull TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(testInfo, "testInfo");
            this.icon = icon;
            this.title = title;
            this.backgroundColor = str;
            this.action = atomAction;
            this.tokenizedEvent = tVar;
            this.isVertical = z11;
            this.testInfo = testInfo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OrderActionV2VO)) {
                return false;
            }
            OrderActionV2VO orderActionV2VO = (OrderActionV2VO) other;
            return Intrinsics.d(this.icon, orderActionV2VO.icon) && Intrinsics.d(this.title, orderActionV2VO.title) && Intrinsics.d(this.backgroundColor, orderActionV2VO.backgroundColor) && Intrinsics.d(this.action, orderActionV2VO.action) && Intrinsics.d(this.tokenizedEvent, orderActionV2VO.tokenizedEvent) && this.isVertical == orderActionV2VO.isVertical && Intrinsics.d(this.testInfo, orderActionV2VO.testInfo);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int a11 = b.a(this.title, this.icon.hashCode() * 31, 31);
            String str = this.backgroundColor;
            int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            AtomAction atomAction = this.action;
            int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            t tVar = this.tokenizedEvent;
            return this.testInfo.hashCode() + C3532b.a((hashCode2 + (tVar != null ? tVar.hashCode() : 0)) * 31, 31, this.isVertical);
        }

        /* renamed from: isVertical, reason: from getter */
        public final boolean getIsVertical() {
            return this.isVertical;
        }

        @NotNull
        public String toString() {
            IconDTO iconDTO = this.icon;
            TextDTO textDTO = this.title;
            String str = this.backgroundColor;
            AtomAction atomAction = this.action;
            t tVar = this.tokenizedEvent;
            boolean z11 = this.isVertical;
            TestInfo testInfo = this.testInfo;
            StringBuilder i11 = Bi.b.i("OrderActionV2VO(icon=", ", title=", ", backgroundColor=", iconDTO, textDTO);
            b.d(str, ", action=", ", tokenizedEvent=", i11, atomAction);
            i11.append(tVar);
            i11.append(", isVertical=");
            i11.append(z11);
            i11.append(", testInfo=");
            return h.c(i11, testInfo, ")");
        }
    }

    public OrderActionsV2VO(long j11, @NotNull List<OrderActionV2VO> actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.id = j11;
        this.actions = actions;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderActionsV2VO)) {
            return false;
        }
        OrderActionsV2VO orderActionsV2VO = (OrderActionsV2VO) other;
        return this.id == orderActionsV2VO.id && Intrinsics.d(this.actions, orderActionsV2VO.actions);
    }

    @NotNull
    public final List<OrderActionV2VO> getActions() {
        return this.actions;
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
        return this.actions.hashCode() + (Long.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder b11 = Lh.b.b(this.id, "OrderActionsV2VO(id=", ", actions=", this.actions);
        b11.append(")");
        return b11.toString();
    }
}
