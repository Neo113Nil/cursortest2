package ru.ozon.uni.ozi.components.navBar.addons;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.ozi.components.navBar.addons.OziNavBarScope;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarBottomStartScope;", "Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarScope;", "<init>", "()V", "Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarScope$AddonMarker;", "addonMarker", "Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarScope$AddonMarker;", "getAddonMarker$uni_release", "()Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarScope$AddonMarker;", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziNavBarBottomStartScope extends OziNavBarScope {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final OziNavBarBottomStartScope INSTANCE = new OziNavBarBottomStartScope();

    @NotNull
    private final OziNavBarScope.AddonMarker addonMarker;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarBottomStartScope$Companion;", "", "<init>", "()V", "INSTANCE", "Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarBottomStartScope;", "getINSTANCE$uni_release", "()Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarBottomStartScope;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OziNavBarBottomStartScope getINSTANCE$uni_release() {
            return OziNavBarBottomStartScope.INSTANCE;
        }

        private Companion() {
        }
    }

    private OziNavBarBottomStartScope() {
        super(null);
        this.addonMarker = OziNavBarScope.AddonMarker.BottomStart;
    }

    @Override // ru.ozon.uni.ozi.components.navBar.addons.OziNavBarScope
    @NotNull
    /* renamed from: getAddonMarker$uni_release, reason: from getter */
    public OziNavBarScope.AddonMarker getAddonMarker() {
        return this.addonMarker;
    }
}
