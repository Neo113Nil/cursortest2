package ru.ozon.android.messenger.blocks.buttons;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import kotlin.text.h;
import ru.ozon.android.messenger.blocks.buttons.a;
import ru.ozon.android.messenger.blocks.buttons.f;

/* loaded from: classes10.dex */
public final class c implements Function2<ChatButtonsDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends f>> {
    private static ArrayList a(List list) {
        List<ButtonTextDTO> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        for (ButtonTextDTO buttonTextDTO : list2) {
            arrayList.add(new g(buttonTextDTO.getBody(), buttonTextDTO.getColor(), buttonTextDTO.getStyle()));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [ru.ozon.android.messenger.blocks.buttons.a$a] */
    /* JADX WARN: Type inference failed for: r7v14, types: [T, java.util.List] */
    @Override // kotlin.jvm.functions.Function2
    public final List<? extends f> invoke(ChatButtonsDTO chatButtonsDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
        String str;
        ChatButtonsDTO state = chatButtonsDTO;
        ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        List<ButtonsGroupDTO> buttonsGroups = state.getButtonsGroups();
        ArrayList arrayList = new ArrayList(C7714v.z(buttonsGroups, 10));
        for (ButtonsGroupDTO buttonsGroupDTO : buttonsGroups) {
            b layout = buttonsGroupDTO.getLayout();
            List<ChatButtonDTO> buttons = buttonsGroupDTO.getButtons();
            ArrayList arrayList2 = new ArrayList();
            for (ChatButtonDTO chatButtonDTO : buttons) {
                Fixed fixed = chatButtonDTO.getFixed();
                a.b bVar = null;
                if (fixed != null) {
                    ImagesDTO images = fixed.getImages();
                    M m11 = new M();
                    if (images != null) {
                        String plus = images.getPlus();
                        str = (plus == null || h.K(plus)) ? null : Nk.a.b("+", h.X(images.getPlus(), "+", "", false));
                        int i11 = str != null ? 3 : 4;
                        List<String> urls = images.getUrls();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : urls) {
                            if (!h.K((String) obj)) {
                                arrayList3.add(obj);
                            }
                        }
                        m11.f71787a = C7714v.K0(arrayList3, i11);
                    } else {
                        str = null;
                    }
                    Pair pair = new Pair(m11.f71787a, str);
                    bVar = new a.C1471a(a(fixed.getText()), new ru.ozon.android.messenger.framework.navigation.action.a(fixed.getAction(), null, null, 6), (List) pair.e(), (String) pair.f(), fixed.getExternalButton());
                } else {
                    Flex flex = chatButtonDTO.getFlex();
                    if (flex != null) {
                        bVar = new a.b(new ru.ozon.android.messenger.framework.navigation.action.a(flex.getAction(), null, null, 6), a(flex.getText()), flex.getIcon());
                    }
                }
                if (bVar != null) {
                    arrayList2.add(bVar);
                }
            }
            arrayList.add(new f.a(layout, arrayList2));
        }
        return C7714v.a0(new f(blockId, arrayList, true));
    }
}
