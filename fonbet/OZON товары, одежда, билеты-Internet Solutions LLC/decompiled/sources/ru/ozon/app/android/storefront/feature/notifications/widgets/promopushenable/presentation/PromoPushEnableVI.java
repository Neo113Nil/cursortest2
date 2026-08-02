package ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.presentation;

import G.g;
import Lh.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.data.PromoPushEnableCellDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ4\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/storefront/feature/notifications/widgets/promopushenable/presentation/PromoPushEnableVI;", "Ll20/c;", "", "id", "", "Lru/ozon/app/android/storefront/feature/notifications/widgets/promopushenable/data/PromoPushEnableCellDTO;", "cells", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "<init>", "(JLjava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "copy", "(JLjava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)Lru/ozon/app/android/storefront/feature/notifications/widgets/promopushenable/presentation/PromoPushEnableVI;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getCells", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "notifications_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PromoPushEnableVI implements c {

    @NotNull
    private final ButtonV3DTO button;

    @NotNull
    private final List<PromoPushEnableCellDTO> cells;
    private final long id;

    public PromoPushEnableVI(long j11, @NotNull List<PromoPushEnableCellDTO> cells, @NotNull ButtonV3DTO button) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(button, "button");
        this.id = j11;
        this.cells = cells;
        this.button = button;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PromoPushEnableVI copy$default(PromoPushEnableVI promoPushEnableVI, long j11, List list, ButtonV3DTO buttonV3DTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = promoPushEnableVI.id;
        }
        if ((i11 & 2) != 0) {
            list = promoPushEnableVI.cells;
        }
        if ((i11 & 4) != 0) {
            buttonV3DTO = promoPushEnableVI.button;
        }
        return promoPushEnableVI.copy(j11, list, buttonV3DTO);
    }

    @NotNull
    public final PromoPushEnableVI copy(long id2, @NotNull List<PromoPushEnableCellDTO> cells, @NotNull ButtonV3DTO button) {
        Intrinsics.checkNotNullParameter(cells, "cells");
        Intrinsics.checkNotNullParameter(button, "button");
        return new PromoPushEnableVI(id2, cells, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoPushEnableVI)) {
            return false;
        }
        PromoPushEnableVI promoPushEnableVI = (PromoPushEnableVI) other;
        return this.id == promoPushEnableVI.id && Intrinsics.d(this.cells, promoPushEnableVI.cells) && Intrinsics.d(this.button, promoPushEnableVI.button);
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final List<PromoPushEnableCellDTO> getCells() {
        return this.cells;
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
        return this.button.hashCode() + g.b(Long.hashCode(this.id) * 31, 31, this.cells);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<PromoPushEnableCellDTO> list = this.cells;
        ButtonV3DTO buttonV3DTO = this.button;
        StringBuilder b11 = b.b(j11, "PromoPushEnableVI(id=", ", cells=", list);
        b11.append(", button=");
        b11.append(buttonV3DTO);
        b11.append(")");
        return b11.toString();
    }
}
