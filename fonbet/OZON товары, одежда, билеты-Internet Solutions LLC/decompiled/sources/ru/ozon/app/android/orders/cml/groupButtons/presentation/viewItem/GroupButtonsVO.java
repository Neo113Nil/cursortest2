package ru.ozon.app.android.orders.cml.groupButtons.presentation.viewItem;

import G.g;
import Lh.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orders.cml.common.data.VerticalPadding;
import ru.ozon.app.android.orders.cml.groupButtons.data.TextAndIconButtonDTO;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u001f\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/orders/cml/groupButtons/presentation/viewItem/GroupButtonsVO;", "Ll20/c;", "", "id", "", "Lru/ozon/app/android/orders/cml/groupButtons/data/TextAndIconButtonDTO;", "buttons", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/app/android/orders/cml/common/data/VerticalPadding;", "verticalPadding", "<init>", "(JLjava/util/List;Lru/ozon/uni/atoms/data/TestInfo;LWZ/t;Lru/ozon/app/android/orders/cml/common/data/VerticalPadding;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/app/android/orders/cml/common/data/VerticalPadding;", "getVerticalPadding", "()Lru/ozon/app/android/orders/cml/common/data/VerticalPadding;", "orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GroupButtonsVO implements c {

    @NotNull
    private final List<TextAndIconButtonDTO> buttons;
    private final long id;
    private final TestInfo testInfo;
    private final t tokenizedEvent;
    private final VerticalPadding verticalPadding;

    public GroupButtonsVO(long j11, @NotNull List<TextAndIconButtonDTO> buttons, TestInfo testInfo, t tVar, VerticalPadding verticalPadding) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.id = j11;
        this.buttons = buttons;
        this.testInfo = testInfo;
        this.tokenizedEvent = tVar;
        this.verticalPadding = verticalPadding;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupButtonsVO)) {
            return false;
        }
        GroupButtonsVO groupButtonsVO = (GroupButtonsVO) other;
        return this.id == groupButtonsVO.id && Intrinsics.d(this.buttons, groupButtonsVO.buttons) && Intrinsics.d(this.testInfo, groupButtonsVO.testInfo) && Intrinsics.d(this.tokenizedEvent, groupButtonsVO.tokenizedEvent) && Intrinsics.d(this.verticalPadding, groupButtonsVO.verticalPadding);
    }

    @NotNull
    public final List<TextAndIconButtonDTO> getButtons() {
        return this.buttons;
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

    public final VerticalPadding getVerticalPadding() {
        return this.verticalPadding;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.buttons);
        TestInfo testInfo = this.testInfo;
        int hashCode = (b11 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode2 = (hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
        VerticalPadding verticalPadding = this.verticalPadding;
        return hashCode2 + (verticalPadding != null ? verticalPadding.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<TextAndIconButtonDTO> list = this.buttons;
        TestInfo testInfo = this.testInfo;
        t tVar = this.tokenizedEvent;
        VerticalPadding verticalPadding = this.verticalPadding;
        StringBuilder b11 = b.b(j11, "GroupButtonsVO(id=", ", buttons=", list);
        b11.append(", testInfo=");
        b11.append(testInfo);
        b11.append(", tokenizedEvent=");
        b11.append(tVar);
        b11.append(", verticalPadding=");
        b11.append(verticalPadding);
        b11.append(")");
        return b11.toString();
    }
}
