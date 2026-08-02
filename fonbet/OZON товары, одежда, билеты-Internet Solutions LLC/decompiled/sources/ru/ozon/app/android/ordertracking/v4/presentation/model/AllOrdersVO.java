package ru.ozon.app.android.ordertracking.v4.presentation.model;

import D40.c;
import El.C2971a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/ordertracking/v4/presentation/model/AllOrdersVO;", "Lru/ozon/app/android/ordertracking/v4/presentation/model/OrderTrackingItemVO;", "", "id", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "Lru/ozon/uni/atoms/data/text/TextDTO;", "text", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(JLru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "orderTracking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AllOrdersVO extends OrderTrackingItemVO {

    @NotNull
    private final AtomAction action;

    @NotNull
    private final IconDTO icon;
    private final long id;
    private final TextDTO text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllOrdersVO(long j11, @NotNull IconDTO icon, TextDTO textDTO, @NotNull AtomAction action) {
        super(j11, null);
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(action, "action");
        this.id = j11;
        this.icon = icon;
        this.text = textDTO;
        this.action = action;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AllOrdersVO)) {
            return false;
        }
        AllOrdersVO allOrdersVO = (AllOrdersVO) other;
        return this.id == allOrdersVO.id && Intrinsics.d(this.icon, allOrdersVO.icon) && Intrinsics.d(this.text, allOrdersVO.text) && Intrinsics.d(this.action, allOrdersVO.action);
    }

    @NotNull
    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final IconDTO getIcon() {
        return this.icon;
    }

    @Override // ru.ozon.app.android.ordertracking.v4.presentation.model.OrderTrackingItemVO
    public long getId() {
        return this.id;
    }

    public final TextDTO getText() {
        return this.text;
    }

    public int hashCode() {
        int a11 = C2971a.a(this.icon, Long.hashCode(this.id) * 31, 31);
        TextDTO textDTO = this.text;
        return this.action.hashCode() + ((a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        IconDTO iconDTO = this.icon;
        TextDTO textDTO = this.text;
        AtomAction atomAction = this.action;
        StringBuilder b11 = c.b("AllOrdersVO(id=", j11, ", icon=", iconDTO);
        b11.append(", text=");
        b11.append(textDTO);
        b11.append(", action=");
        b11.append(atomAction);
        b11.append(")");
        return b11.toString();
    }
}
