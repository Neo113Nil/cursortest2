package ru.ozon.android.messenger.blocks.input.messagesender;

import Sc.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.input.CustomBlockDTO;
import ru.ozon.android.messenger.blocks.input.attachments.presentation.b;
import ru.ozon.android.messenger.blocks.messagefile.FileDTO;
import ru.ozon.android.messenger.blocks.messageimage.ImageDTO;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.u0;
import ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.z0;
import ru.ozon.android.messenger.framework.presentation.models.B;
import ru.ozon.android.messenger.utils.n;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.navigation.controller.a f85536a;

    public b(@NotNull ru.ozon.android.messenger.framework.navigation.controller.a messengerController, @NotNull B.a guidGenerator) {
        Intrinsics.checkNotNullParameter(messengerController, "messengerController");
        Intrinsics.checkNotNullParameter(guidGenerator, "guidGenerator");
        this.f85536a = messengerController;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.z0$c] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.z0$d] */
    @NotNull
    public final a a(@NotNull String text, CustomBlockDTO customBlockDTO, @NotNull List<? extends ru.ozon.android.messenger.blocks.input.attachments.presentation.b> attachments) {
        ?? cVar;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(attachments, "attachments");
        List<? extends ru.ozon.android.messenger.blocks.input.attachments.presentation.b> list = attachments;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!Intrinsics.d(((ru.ozon.android.messenger.blocks.input.attachments.presentation.b) it.next()).f(), b.c.a.f85479a)) {
                    return a.ATTACHMENTS_ISSUE;
                }
            }
        }
        if (attachments.isEmpty() && text.length() == 0 && customBlockDTO == null) {
            return a.EMPTY_TEXT_ISSUE;
        }
        String obj = h.z0(text).toString();
        ArrayList arrayList = new ArrayList();
        if (obj.length() > 0 || customBlockDTO != null) {
            z0.e eVar = new z0.e(obj);
            if (customBlockDTO != null) {
                eVar.e(customBlockDTO);
            }
            arrayList.add(eVar);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : attachments) {
            if (Intrinsics.d(((ru.ozon.android.messenger.blocks.input.attachments.presentation.b) obj2).f(), b.c.a.f85479a)) {
                arrayList2.add(obj2);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            FileDTO fileDTO = null;
            r13 = null;
            ImageDTO imageDTO = null;
            fileDTO = null;
            fileDTO = null;
            fileDTO = null;
            if (!it2.hasNext()) {
                String a11 = n.a();
                Iterator it3 = arrayList.iterator();
                int i11 = 0;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        C7714v.O0();
                        throw null;
                    }
                    z0 z0Var = (z0) next;
                    z0Var.a(new u0(a11, i12, arrayList.size()));
                    this.f85536a.j(z0Var);
                    i11 = i12;
                }
                return a.MESSAGES_SENT;
            }
            ru.ozon.android.messenger.blocks.input.attachments.presentation.b bVar = (ru.ozon.android.messenger.blocks.input.attachments.presentation.b) it2.next();
            if (bVar instanceof b.C1500b) {
                b.C1500b c1500b = (b.C1500b) bVar;
                cVar = new z0.d(c1500b.c());
                Intrinsics.checkNotNullParameter(c1500b, "<this>");
                if (c1500b.g() != null && c1500b.d() != null) {
                    imageDTO = new ImageDTO(c1500b.g(), c1500b.c().toString(), c1500b.d(), c1500b.getWidth(), c1500b.getHeight(), null);
                }
                cVar.d(imageDTO);
            } else {
                if (!(bVar instanceof b.a)) {
                    throw new o();
                }
                b.a aVar = (b.a) bVar;
                cVar = new z0.c(aVar.c());
                Intrinsics.checkNotNullParameter(aVar, "<this>");
                if (aVar.g() != null && aVar.d() != null && aVar.j() != null && aVar.k() != null) {
                    fileDTO = new FileDTO(aVar.g(), aVar.c().toString(), aVar.j(), aVar.d(), aVar.k());
                }
                cVar.d(fileDTO);
            }
            arrayList.add(cVar);
        }
    }
}
