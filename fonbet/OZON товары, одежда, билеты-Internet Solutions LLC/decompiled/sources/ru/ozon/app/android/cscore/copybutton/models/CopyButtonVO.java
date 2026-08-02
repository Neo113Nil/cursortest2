package ru.ozon.app.android.cscore.copybutton.models;

import Ak.C2436a;
import G.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.copybutton.models.CopyButtonDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/cscore/copybutton/models/CopyButtonVO;", "Ll20/c;", "", "id", "", "icon", "Lru/ozon/app/android/cscore/copybutton/models/CopyButtonDTO$Action;", "copyAction", "<init>", "(JLjava/lang/String;Lru/ozon/app/android/cscore/copybutton/models/CopyButtonDTO$Action;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getIcon", "Lru/ozon/app/android/cscore/copybutton/models/CopyButtonDTO$Action;", "getCopyAction", "()Lru/ozon/app/android/cscore/copybutton/models/CopyButtonDTO$Action;", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CopyButtonVO implements c {

    @NotNull
    private final CopyButtonDTO.Action copyAction;

    @NotNull
    private final String icon;
    private final long id;

    public CopyButtonVO(long j11, @NotNull String icon, @NotNull CopyButtonDTO.Action copyAction) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(copyAction, "copyAction");
        this.id = j11;
        this.icon = icon;
        this.copyAction = copyAction;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CopyButtonVO)) {
            return false;
        }
        CopyButtonVO copyButtonVO = (CopyButtonVO) other;
        return this.id == copyButtonVO.id && Intrinsics.d(this.icon, copyButtonVO.icon) && Intrinsics.d(this.copyAction, copyButtonVO.copyAction);
    }

    @NotNull
    public final CopyButtonDTO.Action getCopyAction() {
        return this.copyAction;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
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
        return this.copyAction.hashCode() + g.a(Long.hashCode(this.id) * 31, 31, this.icon);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.icon;
        CopyButtonDTO.Action action = this.copyAction;
        StringBuilder c11 = C2436a.c(j11, "CopyButtonVO(id=", ", icon=", str);
        c11.append(", copyAction=");
        c11.append(action);
        c11.append(")");
        return c11.toString();
    }
}
