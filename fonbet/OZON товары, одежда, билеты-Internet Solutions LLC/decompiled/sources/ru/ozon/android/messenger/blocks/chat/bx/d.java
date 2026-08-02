package ru.ozon.android.messenger.blocks.chat.bx;

import B90.D;
import Sc.o;
import android.view.View;
import au.ViewOnClickListenerC5489a;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.chat.bx.e;
import ru.ozon.android.messenger.blocks.chat.common.g;
import ru.ozon.android.messenger.blocks.chat.common.m;
import ru.ozon.android.messenger.framework.data.remote.models.items.ContextMenuDTO;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.B;
import ru.ozon.android.messenger.framework.presentation.models.h;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.app.android.messenger.databinding.MBlockChatBinding;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;

/* loaded from: classes10.dex */
public final class d extends B<b, MBlockChatBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.core.d f84494a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final g f84495b;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f84496a;

        static {
            int[] iArr = new int[e.a.values().length];
            try {
                iArr[e.a.PREVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.a.TITLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.a.UNREAD_COUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.a.AVATAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e.a.MENU_ITEMS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f84496a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@NotNull MBlockChatBinding binding, @NotNull ru.ozon.android.messenger.framework.core.d references) {
        super(binding, references);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        g chatViewDelegate = new g(binding, references);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(chatViewDelegate, "chatViewDelegate");
        this.f84494a = references;
        this.f84495b = chatViewDelegate;
        chatViewDelegate.o();
    }

    public static boolean c(b bVar, d dVar) {
        ContextMenuDTO b11 = bVar.b();
        if (b11 == null) {
            return false;
        }
        if (b11.getAdditionalMenuItems().isEmpty()) {
            b11 = null;
        }
        if (b11 == null) {
            return false;
        }
        dVar.f84494a.c().u(h.b(bVar), b11);
        return true;
    }

    public static void d(d dVar, b bVar, p pVar) {
        dVar.f84494a.c().p(bVar.i(), pVar.getId(), bVar.a());
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.A
    public final int a() {
        return this.f84495b.a();
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.B
    public final void b(D d11) {
        this.f84495b.m(d11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.q
    public final void bind(ru.ozon.android.messenger.framework.presentation.models.g gVar, p itemInfo, ru.ozon.android.messenger.framework.presentation.models.d blockInfo, Object obj) {
        final b block = (b) gVar;
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        Intrinsics.checkNotNullParameter(blockInfo, "blockInfo");
        super.bind(block, itemInfo, blockInfo, obj);
        MBlockChatBinding mBlockChatBinding = (MBlockChatBinding) getBinding();
        List list = obj instanceof List ? (List) obj : null;
        if (list == null || list.isEmpty()) {
            list = C7705l.f0(e.a.values());
        }
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            g gVar2 = this.f84495b;
            if (!hasNext) {
                gVar2.d(block.f());
                mBlockChatBinding.blockChatRootCl.setOnClickListener(new ViewOnClickListenerC5489a(this, block, itemInfo, 1));
                mBlockChatBinding.blockChatRootCl.setOnLongClickListener(new View.OnLongClickListener() { // from class: ru.ozon.android.messenger.blocks.chat.bx.c
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        return d.c(b.this, this);
                    }
                });
                return;
            }
            int i11 = a.f84496a[((e.a) ((Enum) it.next())).ordinal()];
            if (i11 == 1) {
                gVar2.g(block.j());
            } else if (i11 == 2) {
                String title = block.k();
                List<Icon> titleIcons = block.l();
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(titleIcons, "titleIcons");
                gVar2.h(title, titleIcons);
            } else if (i11 == 3) {
                m unreadCountIndicator = block.d();
                Intrinsics.checkNotNullParameter(unreadCountIndicator, "unreadCountIndicator");
                gVar2.j(unreadCountIndicator);
            } else if (i11 == 4) {
                IconView avatarIv = mBlockChatBinding.avatarIv;
                Intrinsics.checkNotNullExpressionValue(avatarIv, "avatarIv");
                IconHolderKt.bindOrGone$default(avatarIv, block.g(), null, 2, null);
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
