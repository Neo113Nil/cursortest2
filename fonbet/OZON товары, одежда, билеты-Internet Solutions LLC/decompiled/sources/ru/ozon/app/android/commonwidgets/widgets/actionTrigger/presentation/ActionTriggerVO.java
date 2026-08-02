package ru.ozon.app.android.commonwidgets.widgets.actionTrigger.presentation;

import Ih.a;
import g.C6594f;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/actionTrigger/presentation/ActionTriggerVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "", "uuid", "<init>", "(JLru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Ljava/lang/String;", "getUuid", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ActionTriggerVO implements c {

    @NotNull
    private final AtomActionDTO action;
    private final long id;

    @NotNull
    private final String uuid;

    public ActionTriggerVO(long j11, @NotNull AtomActionDTO action, @NotNull String uuid) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.id = j11;
        this.action = action;
        this.uuid = uuid;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionTriggerVO)) {
            return false;
        }
        ActionTriggerVO actionTriggerVO = (ActionTriggerVO) other;
        return this.id == actionTriggerVO.id && Intrinsics.d(this.action, actionTriggerVO.action) && Intrinsics.d(this.uuid, actionTriggerVO.uuid);
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

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.uuid.hashCode() + a.b(this.action, Long.hashCode(this.id) * 31, 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        AtomActionDTO atomActionDTO = this.action;
        String str = this.uuid;
        StringBuilder sb2 = new StringBuilder("ActionTriggerVO(id=");
        sb2.append(j11);
        sb2.append(", action=");
        sb2.append(atomActionDTO);
        return C6594f.a(", uuid=", str, ")", sb2);
    }

    public /* synthetic */ ActionTriggerVO(long j11, AtomActionDTO atomActionDTO, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, atomActionDTO, (i11 & 4) != 0 ? UUID.randomUUID().toString() : str);
    }
}
