package ru.ozon.android.messenger.blocks.chat.sx;

import B90.D;
import Sc.o;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Group;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.chat.common.m;
import ru.ozon.android.messenger.blocks.chat.sx.b;
import ru.ozon.android.messenger.blocks.chat.sx.g;
import ru.ozon.android.messenger.framework.data.remote.models.items.ContextMenuDTO;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.B;
import ru.ozon.android.messenger.framework.presentation.models.h;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.android.messenger.utils.view.s;
import ru.ozon.app.android.messenger.databinding.MBlockChatBinding;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

/* loaded from: classes10.dex */
public final class e extends B<b, MBlockChatBinding> {

    /* renamed from: c, reason: collision with root package name */
    private static final int f84640c;

    /* renamed from: d, reason: collision with root package name */
    private static final int f84641d;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.core.d f84642a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.blocks.chat.common.g f84643b;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f84644a;

        static {
            int[] iArr = new int[g.a.values().length];
            try {
                iArr[g.a.DISPLAY_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.a.PREVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.a.TITLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g.a.UNREAD_COUNT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[g.a.CONVERSATION_ID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[g.a.MENU_ITEMS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[g.a.PREVIEW_BADGES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f84644a = iArr;
        }
    }

    static {
        int i11;
        int i12;
        i11 = ru.ozon.android.messenger.utils.e.f91907d;
        f84640c = i11;
        i12 = ru.ozon.android.messenger.utils.e.f91906c;
        f84641d = i12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull MBlockChatBinding binding, @NotNull ru.ozon.android.messenger.framework.core.d references) {
        super(binding, references);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        ru.ozon.android.messenger.blocks.chat.common.g chatViewDelegate = new ru.ozon.android.messenger.blocks.chat.common.g(binding, references);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(chatViewDelegate, "chatViewDelegate");
        this.f84642a = references;
        this.f84643b = chatViewDelegate;
        IconView avatarIv = binding.avatarIv;
        Intrinsics.checkNotNullExpressionValue(avatarIv, "avatarIv");
        s.a(avatarIv);
    }

    public static void c(e eVar, b bVar, p pVar) {
        eVar.f84642a.c().p(bVar.i(), pVar.getId(), bVar.a());
    }

    public static boolean d(b bVar, e eVar) {
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
        eVar.f84642a.c().u(h.b(bVar), b11);
        return true;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.A
    public final int a() {
        return this.f84643b.a();
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.B
    public final void b(D d11) {
        this.f84643b.m(d11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.q
    public final void bind(ru.ozon.android.messenger.framework.presentation.models.g gVar, final p itemInfo, ru.ozon.android.messenger.framework.presentation.models.d blockInfo, Object obj) {
        int i11;
        final b block = (b) gVar;
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        Intrinsics.checkNotNullParameter(blockInfo, "blockInfo");
        super.bind(block, itemInfo, blockInfo, obj);
        MBlockChatBinding mBlockChatBinding = (MBlockChatBinding) getBinding();
        List list = obj instanceof List ? (List) obj : null;
        if (list == null || list.isEmpty()) {
            list = C7705l.f0(g.a.values());
        }
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            ru.ozon.android.messenger.blocks.chat.common.g gVar2 = this.f84643b;
            if (!hasNext) {
                gVar2.d(block.f());
                mBlockChatBinding.blockChatRootCl.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.android.messenger.blocks.chat.sx.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        e.c(e.this, block, itemInfo);
                    }
                });
                mBlockChatBinding.blockChatRootCl.setOnLongClickListener(new View.OnLongClickListener() { // from class: ru.ozon.android.messenger.blocks.chat.sx.d
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        return e.d(b.this, this);
                    }
                });
                return;
            }
            switch (a.f84644a[((g.a) ((Enum) it.next())).ordinal()]) {
                case 1:
                    if (block.j() == b.a.EXTENDED) {
                        MBlockChatBinding mBlockChatBinding2 = (MBlockChatBinding) getBinding();
                        mBlockChatBinding2.barrierChatTitleTop.e(f84640c);
                        TextView chatPreviewTextTv = mBlockChatBinding2.chatPreviewTextTv;
                        Intrinsics.checkNotNullExpressionValue(chatPreviewTextTv, "chatPreviewTextTv");
                        s.f(chatPreviewTextTv, f.f84645b);
                        Group sxExtendedInfoGroup = mBlockChatBinding2.sxExtendedInfoGroup;
                        Intrinsics.checkNotNullExpressionValue(sxExtendedInfoGroup, "sxExtendedInfoGroup");
                        s.d(sxExtendedInfoGroup);
                        mBlockChatBinding2.chatTitleTv.setMaxLines(2);
                        break;
                    } else {
                        gVar2.o();
                        break;
                    }
                case 2:
                    gVar2.g(block.k());
                    break;
                case 3:
                    String title = block.m();
                    List<Icon> titleIcons = block.n();
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(titleIcons, "titleIcons");
                    gVar2.h(title, titleIcons);
                    break;
                case 4:
                    m unreadCountIndicator = block.d();
                    Intrinsics.checkNotNullParameter(unreadCountIndicator, "unreadCountIndicator");
                    gVar2.j(unreadCountIndicator);
                    break;
                case 5:
                    ((MBlockChatBinding) getBinding()).conversationIdTv.setText(block.h());
                    break;
                case 6:
                    List<ru.ozon.android.messenger.blocks.chat.common.menuItems.b> items = block.c();
                    Intrinsics.checkNotNullParameter(items, "items");
                    gVar2.f(items);
                    break;
                case 7:
                    List<BadgeDTO> l11 = block.l();
                    LinearLayoutCompat linearLayoutCompat = ((MBlockChatBinding) getBinding()).statusBadgesContainer;
                    linearLayoutCompat.removeAllViews();
                    List<BadgeDTO> list2 = l11;
                    int i12 = 0;
                    linearLayoutCompat.setVisibility((list2 == null || list2.isEmpty()) ? 8 : 0);
                    if (l11 != null) {
                        for (Object obj2 : l11) {
                            int i13 = i12 + 1;
                            if (i12 < 0) {
                                C7714v.O0();
                                throw null;
                            }
                            BadgeDTO badgeDTO = (BadgeDTO) obj2;
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                            if (i12 != C7714v.P(l11)) {
                                i11 = ru.ozon.android.messenger.utils.e.f91908e;
                                layoutParams.setMarginEnd(i11);
                            }
                            Context context = linearLayoutCompat.getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                            BadgeView badgeView = new BadgeView(context, null, 0, 0, 14, null);
                            BadgeHolderKt.bind$default(badgeView, badgeDTO, (Function1) null, 2, (Object) null);
                            linearLayoutCompat.addView(badgeView, layoutParams);
                            i12 = i13;
                        }
                        Unit unit = Unit.f71690a;
                        break;
                    } else {
                        continue;
                    }
                default:
                    throw new o();
            }
        }
    }
}
