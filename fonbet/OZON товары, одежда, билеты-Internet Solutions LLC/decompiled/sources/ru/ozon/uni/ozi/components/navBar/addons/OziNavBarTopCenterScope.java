package ru.ozon.uni.ozi.components.navBar.addons;

import P9.a;
import S0.InterfaceC3967k;
import a1.c;
import androidx.compose.ui.e;
import e1.InterfaceC6250b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.ozi.components.navBar.addons.OziNavBarScope;
import ru.ozon.uni.ozi.components.navBar.presets.OziNavBarTextAlignment;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarTopCenterScope;", "Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarScope;", "<init>", "()V", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Landroidx/compose/ui/e;", "modifier", "Lru/ozon/uni/ozi/components/navBar/presets/OziNavBarTextAlignment;", "alignment", "", "titleLinesLimit", "subtitleLinesLimit", "", "TitleSubtitle", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/e;Lru/ozon/uni/ozi/components/navBar/presets/OziNavBarTextAlignment;IILS0/k;II)V", "Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarScope$AddonMarker;", "addonMarker", "Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarScope$AddonMarker;", "getAddonMarker$uni_release", "()Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarScope$AddonMarker;", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OziNavBarTopCenterScope extends OziNavBarScope {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final OziNavBarTopCenterScope INSTANCE = new OziNavBarTopCenterScope();

    @NotNull
    private final OziNavBarScope.AddonMarker addonMarker;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarTopCenterScope$Companion;", "", "<init>", "()V", "INSTANCE", "Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarTopCenterScope;", "getINSTANCE$uni_release", "()Lru/ozon/uni/ozi/components/navBar/addons/OziNavBarTopCenterScope;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OziNavBarTopCenterScope getINSTANCE$uni_release() {
            return OziNavBarTopCenterScope.INSTANCE;
        }

        private Companion() {
        }
    }

    private OziNavBarTopCenterScope() {
        super(null);
        this.addonMarker = OziNavBarScope.AddonMarker.TopCenter;
    }

    public final void TitleSubtitle(@NotNull String title, String str, e eVar, OziNavBarTextAlignment oziNavBarTextAlignment, int i11, int i12, InterfaceC3967k interfaceC3967k, int i13, int i14) {
        Intrinsics.checkNotNullParameter(title, "title");
        interfaceC3967k.o(-578066067);
        if ((i14 & 2) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i14 & 4) != 0) {
            eVar = e.f40358c0;
        }
        e eVar2 = eVar;
        OziNavBarTextAlignment oziNavBarTextAlignment2 = (i14 & 8) != 0 ? OziNavBarTextAlignment.Center : oziNavBarTextAlignment;
        int i15 = (i14 & 16) != 0 ? 1 : i11;
        int i16 = (i14 & 32) != 0 ? 1 : i12;
        InterfaceC6250b interfaceC6250b = (InterfaceC6250b) interfaceC3967k.m(OziNavBarScopeKt.getLocalNavBarCenterScopeAlignment());
        e.a aVar = e.f40358c0;
        a.b(aVar, "TOP_CENTER");
        AddonBuilder(interfaceC6250b, aVar, c.c(824938935, new OziNavBarTopCenterScope$TitleSubtitle$1(eVar2, oziNavBarTextAlignment2, title, i15, str2, i16), interfaceC3967k), interfaceC3967k, ((i13 >> 9) & 7168) | 432, 0);
        interfaceC3967k.k();
    }

    @Override // ru.ozon.uni.ozi.components.navBar.addons.OziNavBarScope
    @NotNull
    /* renamed from: getAddonMarker$uni_release, reason: from getter */
    public OziNavBarScope.AddonMarker getAddonMarker() {
        return this.addonMarker;
    }
}
