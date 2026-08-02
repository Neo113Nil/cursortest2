package ru.ozon.app.android.favorites.accesscontrol.presentation.users;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.favorites.accesscontrol.data.AccessControlDTO;
import ru.ozon.app.android.favorites.accesscontrol.data.UserDTO;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/ozon/app/android/favorites/accesscontrol/data/AccessControlDTO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "", "Lru/ozon/app/android/favorites/accesscontrol/presentation/users/AccessControlUserVO;", "invoke", "(Lru/ozon/app/android/favorites/accesscontrol/data/AccessControlDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class AccessControlUserViewMapper$mapper$1 extends AbstractC7737t implements Function2<AccessControlDTO, d, List<? extends AccessControlUserVO>> {
    final /* synthetic */ AccessControlUserViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccessControlUserViewMapper$mapper$1(AccessControlUserViewMapper accessControlUserViewMapper) {
        super(2);
        this.this$0 = accessControlUserViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<AccessControlUserVO> invoke(AccessControlDTO state, d widgetInfo) {
        ArrayList arrayList;
        AccessControlUserVO vo;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<UserDTO> users = state.getUsers();
        if (users != null) {
            List<UserDTO> list = users;
            AccessControlUserViewMapper accessControlUserViewMapper = this.this$0;
            arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                vo = accessControlUserViewMapper.toVo((UserDTO) it.next(), widgetInfo.d(), accessControlUserViewMapper.component().getContext(), state.getListName());
                arrayList.add(vo);
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? K.f71697a : arrayList;
    }
}
