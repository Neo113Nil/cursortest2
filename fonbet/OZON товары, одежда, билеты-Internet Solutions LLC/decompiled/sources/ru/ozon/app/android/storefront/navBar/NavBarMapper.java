package ru.ozon.app.android.storefront.navBar;

import T00.a;
import T00.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.navBar.NavBarDTO;
import ru.ozon.app.android.storefront.navBar.NavBarVO;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ*\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001c\u001a\u00020\u00022\n\u0010\u001e\u001a\u00060\u0003j\u0002`\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/storefront/navBar/NavBarMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/storefront/navBar/NavBarDTO;", "Ll20/d;", "", "Lru/ozon/app/android/storefront/navBar/NavBarVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "LT00/k;", "shared", "toVO", "(Lru/ozon/app/android/storefront/navBar/NavBarDTO;LT00/k;)Lru/ozon/app/android/storefront/navBar/NavBarVO;", "Lru/ozon/app/android/storefront/navBar/NavBarVO$State;", "mapStates", "(LT00/k;)Ljava/util/List;", "mapDefaultState", "(LT00/k;)Lru/ozon/app/android/storefront/navBar/NavBarVO$State;", "mapExpandedState", "Lru/ozon/app/android/storefront/navBar/NavBarDTO$Action;", "Lru/ozon/app/android/storefront/navBar/NavBarVO$Action;", "mapToVO", "(Lru/ozon/app/android/storefront/navBar/NavBarDTO$Action;)Lru/ozon/app/android/storefront/navBar/NavBarVO$Action;", "", "str", "Lru/ozon/app/android/storefront/navBar/NavBarVO$ActionType;", "actionFromString", "(Ljava/lang/String;)Lru/ozon/app/android/storefront/navBar/NavBarVO$ActionType;", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/storefront/navBar/NavBarDTO;Ll20/d;)Ljava/util/List;", "nav-bar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavBarMapper implements Function2<NavBarDTO, d, List<? extends NavBarVO>> {
    private final NavBarVO.ActionType actionFromString(String str) {
        NavBarVO.ActionType actionType;
        NavBarVO.ActionType[] values = NavBarVO.ActionType.values();
        int length = values.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                actionType = null;
                break;
            }
            actionType = values[i11];
            String name = actionType.name();
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String upperCase = str.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            if (Intrinsics.d(name, upperCase)) {
                break;
            }
            i11++;
        }
        return actionType == null ? NavBarVO.ActionType.UNKNOWN : actionType;
    }

    private final NavBarVO.State mapDefaultState(k shared) {
        return new NavBarVO.State.Default(shared != null ? shared.b() : null, shared != null ? shared.c() : null);
    }

    private final NavBarVO.State mapExpandedState(k shared) {
        k.a a11;
        if (shared == null || (a11 = shared.a()) == null) {
            return null;
        }
        return new NavBarVO.State.Expanded(a11.a(), a11.d(), shared.b(), a11.c());
    }

    private final List<NavBarVO.State> mapStates(k shared) {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(mapDefaultState(shared));
        arrayList.add(mapExpandedState(shared));
        List<NavBarVO.State> unmodifiableList = Collections.unmodifiableList(arrayList);
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(...)");
        return unmodifiableList;
    }

    private final NavBarVO.Action mapToVO(NavBarDTO.Action action) {
        return new NavBarVO.Action(action.getDeeplink(), action.getId(), action.getImage(), action.getTitle(), actionFromString(action.getType()));
    }

    private final NavBarVO toVO(NavBarDTO navBarDTO, k kVar) {
        List list;
        List list2;
        long hashCode = navBarDTO.toString().hashCode();
        boolean d11 = Intrinsics.d(navBarDTO.isHiding(), Boolean.TRUE);
        List<NavBarDTO.Action> actionPointsLeft = navBarDTO.getActionPointsLeft();
        if (actionPointsLeft != null) {
            List<NavBarDTO.Action> list3 = actionPointsLeft;
            list = new ArrayList(C7714v.z(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                list.add(mapToVO((NavBarDTO.Action) it.next()));
            }
        } else {
            list = K.f71697a;
        }
        List<NavBarDTO.Action> actionPointsRight = navBarDTO.getActionPointsRight();
        if (actionPointsRight != null) {
            List<NavBarDTO.Action> list4 = actionPointsRight;
            list2 = new ArrayList(C7714v.z(list4, 10));
            Iterator<T> it2 = list4.iterator();
            while (it2.hasNext()) {
                list2.add(mapToVO((NavBarDTO.Action) it2.next()));
            }
        } else {
            list2 = K.f71697a;
        }
        return new NavBarVO(hashCode, d11, list, list2, mapStates(kVar), (kVar != null ? kVar.a() : null) != null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<NavBarVO> invoke(@NotNull NavBarDTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        a b11 = widgetInfo.b();
        return C7714v.a0(toVO(dto, b11 != null ? b11.k() : null));
    }
}
