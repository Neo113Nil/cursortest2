package ru.ozon.android.messenger.blocks.chat.old;

import B90.D;
import Sc.o;
import android.view.View;
import bE.ViewOnClickListenerC5598a;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.chat.common.g;
import ru.ozon.android.messenger.blocks.chat.common.m;
import ru.ozon.android.messenger.blocks.chat.old.f;
import ru.ozon.android.messenger.framework.data.remote.models.items.ContextMenuDTO;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.B;
import ru.ozon.android.messenger.framework.presentation.models.h;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.app.android.messenger.databinding.MBlockChatBinding;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public final class e extends B<c, MBlockChatBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.core.d f84572a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final g f84573b;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f84574a;

        static {
            int[] iArr = new int[f.a.values().length];
            try {
                iArr[f.a.PREVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.a.TITLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.a.UNREAD_COUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f.a.AVATAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[f.a.MENU_ITEMS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f84574a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull MBlockChatBinding binding, @NotNull ru.ozon.android.messenger.framework.core.d references) {
        super(binding, references);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        g chatViewDelegate = new g(binding, references);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(chatViewDelegate, "chatViewDelegate");
        this.f84572a = references;
        this.f84573b = chatViewDelegate;
        chatViewDelegate.o();
    }

    public static boolean c(c cVar, e eVar) {
        ContextMenuDTO b11 = cVar.b();
        if (b11 == null) {
            return false;
        }
        if (b11.getAdditionalMenuItems().isEmpty()) {
            b11 = null;
        }
        if (b11 == null) {
            return false;
        }
        eVar.f84572a.c().u(h.b(cVar), b11);
        return true;
    }

    public static void d(e eVar, c cVar, p pVar) {
        eVar.f84572a.c().p(cVar.j(), pVar.getId(), cVar.a());
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.A
    public final int a() {
        return this.f84573b.a();
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.B
    public final void b(D d11) {
        this.f84573b.m(d11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.q
    public final void bind(ru.ozon.android.messenger.framework.presentation.models.g gVar, p itemInfo, ru.ozon.android.messenger.framework.presentation.models.d blockInfo, Object obj) {
        final c block = (c) gVar;
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        Intrinsics.checkNotNullParameter(blockInfo, "blockInfo");
        super.bind(block, itemInfo, blockInfo, obj);
        MBlockChatBinding mBlockChatBinding = (MBlockChatBinding) getBinding();
        List list = obj instanceof List ? (List) obj : null;
        if (list == null || list.isEmpty()) {
            list = C7705l.f0(f.a.values());
        }
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            g gVar2 = this.f84573b;
            if (!hasNext) {
                gVar2.d(block.f());
                mBlockChatBinding.blockChatRootCl.setOnClickListener(new ViewOnClickListenerC5598a(this, block, itemInfo, 1));
                mBlockChatBinding.blockChatRootCl.setOnLongClickListener(new View.OnLongClickListener() { // from class: ru.ozon.android.messenger.blocks.chat.old.d
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        return e.c(c.this, this);
                    }
                });
                return;
            }
            int i11 = a.f84574a[((f.a) ((Enum) it.next())).ordinal()];
            if (i11 == 1) {
                gVar2.g(block.k());
            } else if (i11 == 2) {
                TextDTO titleAtom = block.l();
                List<Icon> titleIcons = block.m();
                Intrinsics.checkNotNullParameter(titleAtom, "titleAtom");
                Intrinsics.checkNotNullParameter(titleIcons, "titleIcons");
                gVar2.i(titleAtom, titleIcons);
            } else if (i11 == 3) {
                m unreadCountIndicator = block.d();
                Intrinsics.checkNotNullParameter(unreadCountIndicator, "unreadCountIndicator");
                gVar2.j(unreadCountIndicator);
            } else if (i11 == 4) {
                gVar2.e(block.g(), block.h());
            } else {
                if (i11 != 5) {
                    throw new o();
                }
                List<ru.ozon.android.messenger.blocks.chat.common.menuItems.b> items = block.c();
                Intrinsics.checkNotNullParameter(items, "items");
                gVar2.f(items);
            }
        }
    }
}
