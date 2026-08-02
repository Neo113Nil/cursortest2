package ru.ozon.uni.ozi.components.navBar.addons;

import Sc.o;
import Xc.a;
import Xc.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078F¢\u0006\u0006\u001a\u0004\b\t\u0010\nj\u0002\b\u0004j\u0002\b\u0005¨\u0006\u000b"}, d2 = {"Lru/ozon/uni/ozi/components/navBar/addons/NavBarFloor;", "", "<init>", "(Ljava/lang/String;I)V", "Top", "Bottom", "scopes", "", "Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarScope;", "getScopes", "()Ljava/util/List;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NavBarFloor {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ NavBarFloor[] $VALUES;
    public static final NavBarFloor Top = new NavBarFloor("Top", 0);
    public static final NavBarFloor Bottom = new NavBarFloor("Bottom", 1);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NavBarFloor.values().length];
            try {
                iArr[NavBarFloor.Top.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NavBarFloor.Bottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ NavBarFloor[] $values() {
        return new NavBarFloor[]{Top, Bottom};
    }

    static {
        NavBarFloor[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private NavBarFloor(String str, int i11) {
    }

    public static NavBarFloor valueOf(String str) {
        return (NavBarFloor) Enum.valueOf(NavBarFloor.class, str);
    }

    public static NavBarFloor[] values() {
        return (NavBarFloor[]) $VALUES.clone();
    }

    @NotNull
    public final List<OziNavBarScope> getScopes() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i11 == 1) {
            return C7714v.b0(OziNavBarTopStartScope.INSTANCE.getINSTANCE$uni_release(), OziNavBarTopCenterScope.INSTANCE.getINSTANCE$uni_release(), OziNavBarTopEndScope.INSTANCE.getINSTANCE$uni_release());
        }
        if (i11 == 2) {
            return C7714v.b0(OziNavBarBottomStartScope.INSTANCE.getINSTANCE$uni_release(), OziNavBarBottomCenterScope.INSTANCE.getINSTANCE$uni_release(), OziNavBarBottomEndScope.INSTANCE.getINSTANCE$uni_release());
        }
        throw new o();
    }
}
