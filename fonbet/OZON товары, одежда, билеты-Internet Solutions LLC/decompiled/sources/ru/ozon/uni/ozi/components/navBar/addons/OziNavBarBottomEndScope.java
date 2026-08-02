package ru.ozon.uni.ozi.components.navBar.addons;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.ozi.components.navBar.addons.OziNavBarScope;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0014X\u0094D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarBottomEndScope;", "Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarEndScope;", "<init>", "()V", "", "blueprintId", "Ljava/lang/String;", "getBlueprintId", "()Ljava/lang/String;", "Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarScope$AddonMarker;", "addonMarker", "Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarScope$AddonMarker;", "getAddonMarker$uni_release", "()Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarScope$AddonMarker;", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziNavBarBottomEndScope extends OziNavBarEndScope {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final OziNavBarBottomEndScope INSTANCE = new OziNavBarBottomEndScope();

    @NotNull
    private final String blueprintId = "BOTTOM_END";

    @NotNull
    private final OziNavBarScope.AddonMarker addonMarker = OziNavBarScope.AddonMarker.BottomEndScope;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarBottomEndScope$Companion;", "", "<init>", "()V", "INSTANCE", "Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarBottomEndScope;", "getINSTANCE$uni_release", "()Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarBottomEndScope;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OziNavBarBottomEndScope getINSTANCE$uni_release() {
            return OziNavBarBottomEndScope.INSTANCE;
        }

        private Companion() {
        }
    }

    private OziNavBarBottomEndScope() {
    }

    @Override // ru.ozon.uni.ozi.components.navBar.addons.OziNavBarScope
    @NotNull
    /* renamed from: getAddonMarker$uni_release, reason: from getter */
    public OziNavBarScope.AddonMarker getAddonMarker() {
        return this.addonMarker;
    }
}
