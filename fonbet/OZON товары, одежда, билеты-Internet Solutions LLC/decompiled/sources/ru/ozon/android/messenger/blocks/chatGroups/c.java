package ru.ozon.android.messenger.blocks.chatGroups;

import B0.C2454a;
import Sc.o;
import android.view.View;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.chat.common.m;
import ru.ozon.android.messenger.blocks.chatGroups.d;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.navigation.action.d;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.android.messenger.utils.view.s;
import ru.ozon.app.android.messenger.R$attr;
import ru.ozon.app.android.messenger.databinding.MBlockChatGroupBinding;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.indicator.ui.IndicatorView;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.indicator.IndicatorHolderKt;
import ru.ozon.uni.core.UniTextStyles;

/* loaded from: classes10.dex */
public final class c extends q<ru.ozon.android.messenger.blocks.chatGroups.a, MBlockChatGroupBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.core.d f84666a;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f84667a;

        static {
            int[] iArr = new int[d.a.values().length];
            try {
                iArr[d.a.UNREAD_COUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.a.CHECKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f84667a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull MBlockChatGroupBinding binding, @NotNull ru.ozon.android.messenger.framework.core.d references) {
        super(binding, references);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        this.f84666a = references;
    }

    public static void b(String str, ru.ozon.android.messenger.blocks.chatGroups.a aVar, c cVar) {
        Map b11 = C2454a.b(d.c.SELECTED_CHAT_GROUP_ID.a(), str);
        Map<String, MessengerTrackingInfo> e11 = aVar.e();
        ru.ozon.android.messenger.framework.core.d dVar = cVar.f84666a;
        if (e11 != null) {
            dVar.c().m(e11);
        }
        dVar.c().q(new ru.ozon.android.messenger.framework.navigation.action.a(new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, null, ru.ozon.android.messenger.framework.navigation.action.d.CHAT_GROUP_SELECTED.a(), b11, 2, null), null, null, 6));
    }

    private final void c(boolean z11) {
        int i11;
        getBinding().groupNameTv.setTextColor(androidx.core.content.a.getColor(getContext(), ThemeExtKt.themeColorRes(getContext(), z11 ? R$attr.textPrimary : R$attr.textSecondary)));
        View groupIndicator = getBinding().groupIndicator;
        Intrinsics.checkNotNullExpressionValue(groupIndicator, "groupIndicator");
        Intrinsics.checkNotNullParameter(groupIndicator, "<this>");
        if (z11) {
            i11 = 0;
        } else {
            if (z11) {
                throw new o();
            }
            i11 = 4;
        }
        groupIndicator.setVisibility(i11);
    }

    private final void d(m mVar) {
        IndicatorView indicatorView = getBinding().groupUnreadCountIndicator;
        if (mVar == null || mVar.b() <= 0) {
            Intrinsics.f(indicatorView);
            s.a(indicatorView);
        } else {
            Intrinsics.f(indicatorView);
            int b11 = mVar.b();
            IndicatorHolderKt.bind$default(indicatorView, new IndicatorDTO(b11 <= 0 ? "0" : b11 <= 99 ? Integer.valueOf(b11).toString() : "99+", null, IndicatorDTO.IndicatorSize.SIZE_600, IndicatorDTO.Style.ACCENT, null, IndicatorDTO.IndicatorContent.TEXT, null, null, null, null, null, 2002, null), null, 2, null);
        }
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.q
    public final void bind(ru.ozon.android.messenger.blocks.chatGroups.a aVar, p itemInfo, ru.ozon.android.messenger.framework.presentation.models.d blockInfo, Object obj) {
        final ru.ozon.android.messenger.blocks.chatGroups.a block = aVar;
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        Intrinsics.checkNotNullParameter(blockInfo, "blockInfo");
        super.bind(block, itemInfo, blockInfo, obj);
        if (obj != null) {
            List list = obj instanceof List ? (List) obj : null;
            if (list == null || list.isEmpty()) {
                list = C7705l.f0(d.a.values());
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int i11 = a.f84667a[((d.a) ((Enum) it.next())).ordinal()];
                if (i11 == 1) {
                    d(block.f());
                } else {
                    if (i11 != 2) {
                        throw new o();
                    }
                    c(block.g());
                }
            }
            return;
        }
        String name = block.getName();
        TextView textView = getBinding().groupNameTv;
        textView.setTextAppearance(UniTextStyles.BODY_300_X_SMALL.getResId());
        textView.setText(name);
        d(block.f());
        final String id2 = itemInfo.getId();
        getBinding().chatGroupRoot.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.android.messenger.blocks.chatGroups.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c.b(id2, block, this);
            }
        });
        IconDTO c11 = block.c();
        IconView groupIcon = getBinding().groupIcon;
        Intrinsics.checkNotNullExpressionValue(groupIcon, "groupIcon");
        IconHolderKt.bindOrGone$default(groupIcon, c11, null, 2, null);
        c(block.g());
    }
}
