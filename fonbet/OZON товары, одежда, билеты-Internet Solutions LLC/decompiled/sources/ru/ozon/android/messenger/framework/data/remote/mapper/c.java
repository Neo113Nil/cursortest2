package ru.ozon.android.messenger.framework.data.remote.mapper;

import Sc.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.remote.models.SocketEventDTO;
import ru.ozon.android.messenger.framework.data.remote.models.items.ItemDTO;
import ru.ozon.android.messenger.framework.presentation.models.A;
import ru.ozon.android.messenger.framework.presentation.models.q;
import ru.ozon.android.messenger.framework.presentation.models.x;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.remote.mapper.a f87796a;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f87797a;

        static {
            int[] iArr = new int[ru.ozon.android.messenger.framework.data.remote.models.b.values().length];
            try {
                iArr[ru.ozon.android.messenger.framework.data.remote.models.b.CHATS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.data.remote.models.b.MESSAGES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.data.remote.models.b.FOOTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.data.remote.models.b.GROUP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.data.remote.models.b.ALERT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ru.ozon.android.messenger.framework.data.remote.models.b.CURTAIN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f87797a = iArr;
        }
    }

    public c(@NotNull ru.ozon.android.messenger.framework.data.remote.mapper.a blocksItemMapper) {
        Intrinsics.checkNotNullParameter(blocksItemMapper, "blocksItemMapper");
        this.f87796a = blocksItemMapper;
    }

    public final A a(@NotNull SocketEventDTO eventDTO) {
        x xVar;
        Intrinsics.checkNotNullParameter(eventDTO, "eventDTO");
        boolean z11 = eventDTO instanceof SocketEventDTO.AddItem;
        ru.ozon.android.messenger.framework.data.remote.mapper.a aVar = this.f87796a;
        A a11 = null;
        if (z11) {
            SocketEventDTO.AddItem addItem = (SocketEventDTO.AddItem) eventDTO;
            q f7 = aVar.f(addItem.getModel().getId(), addItem.getModel().getItem());
            if (f7 != null) {
                switch (a.f87797a[addItem.getModel().getPlace().ordinal()]) {
                    case 1:
                        xVar = x.CHATS;
                        break;
                    case 2:
                        xVar = x.MESSAGES;
                        break;
                    case 3:
                        xVar = x.FOOTER;
                        break;
                    case 4:
                        xVar = x.GROUP;
                        break;
                    case 5:
                        xVar = x.ALERT;
                        break;
                    case 6:
                        xVar = x.CURTAIN;
                        break;
                    default:
                        throw new o();
                }
                a11 = new A.a(f7, xVar, addItem.getModel().getId());
            }
        } else if (eventDTO instanceof SocketEventDTO.PinItems) {
            List<ItemDTO> items = ((SocketEventDTO.PinItems) eventDTO).getModel().getItems();
            ArrayList arrayList = new ArrayList();
            for (Object obj : items) {
                if (((ItemDTO) obj).getType() == ru.ozon.android.messenger.framework.data.remote.models.items.b.MESSAGE) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                q f11 = aVar.f(null, (ItemDTO) it.next());
                if (f11 != null) {
                    arrayList2.add(f11);
                }
            }
            a11 = new A.c(arrayList2);
        } else if (eventDTO instanceof SocketEventDTO.UpdateItem) {
            q f12 = aVar.f(null, ((SocketEventDTO.UpdateItem) eventDTO).getModel().getItem());
            if (f12 != null) {
                a11 = new A.g(f12);
            }
        } else if (eventDTO instanceof SocketEventDTO.RemoveItem) {
            a11 = new A.e(((SocketEventDTO.RemoveItem) eventDTO).getModel().getId());
        } else if (eventDTO instanceof SocketEventDTO.UserIsTyping) {
            a11 = new A.i(0);
        } else if (eventDTO instanceof SocketEventDTO.ResetCache) {
            a11 = A.f.f91420a;
        } else if (eventDTO instanceof SocketEventDTO.UpdateGlobalCounter) {
            a11 = A.h.f91422a;
        } else if (eventDTO instanceof SocketEventDTO.RedirectToChatList) {
            a11 = A.d.f91418a;
        } else {
            if (!(eventDTO instanceof SocketEventDTO.Notify)) {
                throw new o();
            }
            q f13 = aVar.f(null, ((SocketEventDTO.Notify) eventDTO).getModel().getItem());
            if (f13 != null) {
                a11 = new A.b(f13);
            }
        }
        if (a11 == null) {
            Lm0.a.f17149a.w("Failed to map event " + eventDTO, new Object[0]);
        }
        return a11;
    }
}
