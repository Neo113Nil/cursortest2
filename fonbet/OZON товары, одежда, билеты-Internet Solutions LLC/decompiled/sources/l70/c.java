package l70;

import Ve.Om;
import com.detmir.recycli.adapters.RecyclerItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.badgekit.BadgeKitState;
import ru.ozon.fintech.ui.toolbar.FinToolbarState;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final b f72955a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final FinToolbarState f72956b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final BadgeKitState f72957c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final BadgeKitState f72958d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ArrayList f72959e;

    public c(@NotNull b inputState, @NotNull FinToolbarState finToolbarState, @NotNull BadgeKitState badgeKitStateLeft, @NotNull BadgeKitState badgeKitStateRight, @NotNull ArrayList listData) {
        Intrinsics.checkNotNullParameter(inputState, "inputState");
        Intrinsics.checkNotNullParameter(finToolbarState, "finToolbarState");
        Intrinsics.checkNotNullParameter(badgeKitStateLeft, "badgeKitStateLeft");
        Intrinsics.checkNotNullParameter(badgeKitStateRight, "badgeKitStateRight");
        Intrinsics.checkNotNullParameter(listData, "listData");
        this.f72955a = inputState;
        this.f72956b = finToolbarState;
        this.f72957c = badgeKitStateLeft;
        this.f72958d = badgeKitStateRight;
        this.f72959e = listData;
    }

    @NotNull
    public final BadgeKitState a() {
        return this.f72957c;
    }

    @NotNull
    public final BadgeKitState b() {
        return this.f72958d;
    }

    @NotNull
    public final FinToolbarState c() {
        return this.f72956b;
    }

    @NotNull
    public final b d() {
        return this.f72955a;
    }

    @NotNull
    public final List<RecyclerItem> e() {
        return this.f72959e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f72955a.equals(cVar.f72955a) && this.f72956b.equals(cVar.f72956b) && this.f72957c.equals(cVar.f72957c) && this.f72958d.equals(cVar.f72958d) && this.f72959e.equals(cVar.f72959e);
    }

    public final int hashCode() {
        return this.f72959e.hashCode() + ((this.f72958d.hashCode() + ((this.f72957c.hashCode() + ((this.f72956b.hashCode() + (this.f72955a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OfflineSelectUI(inputState=");
        sb2.append(this.f72955a);
        sb2.append(", finToolbarState=");
        sb2.append(this.f72956b);
        sb2.append(", badgeKitStateLeft=");
        sb2.append(this.f72957c);
        sb2.append(", badgeKitStateRight=");
        sb2.append(this.f72958d);
        sb2.append(", listData=");
        return Om.a(")", sb2, this.f72959e);
    }
}
