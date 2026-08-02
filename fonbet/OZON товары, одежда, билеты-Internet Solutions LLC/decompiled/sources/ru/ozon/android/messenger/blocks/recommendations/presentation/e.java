package ru.ozon.android.messenger.blocks.recommendations.presentation;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.recommendations.e;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.android.messenger.utils.view.s;
import ru.ozon.app.android.messenger.databinding.MBlockRecomendationsBinding;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

/* loaded from: classes10.dex */
public final class e extends q<ru.ozon.android.messenger.blocks.recommendations.e, MBlockRecomendationsBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.core.d f86328a;

    static final class a extends AbstractC7737t implements Function1<AtomAction, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.blocks.recommendations.e f86330c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ru.ozon.android.messenger.blocks.recommendations.e eVar) {
            super(1);
            this.f86330c = eVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AtomAction atomAction) {
            AtomAction it = atomAction;
            Intrinsics.checkNotNullParameter(it, "it");
            e.this.f86328a.c().q(ru.ozon.android.messenger.framework.navigation.action.b.c(this.f86330c.k()));
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function1<AtomAction, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f86331b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e f86332c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, e eVar) {
            super(1);
            this.f86331b = str;
            this.f86332c = eVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AtomAction atomAction) {
            AtomAction it = atomAction;
            Intrinsics.checkNotNullParameter(it, "it");
            AtomAction.Click click = it instanceof AtomAction.Click ? (AtomAction.Click) it : null;
            if (click != null) {
                Map<String, String> params = ((AtomAction.Click) it).getParams();
                AtomAction.Click copy$default = AtomAction.Click.copy$default(click, null, null, null, params != null ? U.n(params, new Pair("itemId", this.f86331b)) : null, null, null, 55, null);
                if (copy$default != null) {
                    this.f86332c.f86328a.c().q(ru.ozon.android.messenger.framework.navigation.action.b.e(copy$default, null, 3));
                }
            }
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function1<View, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e.c f86334c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(e.c cVar) {
            super(1);
            this.f86334c = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            e.this.f86328a.c().q(ru.ozon.android.messenger.framework.navigation.action.b.c(this.f86334c.a()));
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull MBlockRecomendationsBinding binding, @NotNull ru.ozon.android.messenger.framework.core.d references) {
        super(binding, references);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        this.f86328a = references;
    }

    public static void b(e eVar, AtomActionDTO atomActionDTO) {
        eVar.f86328a.c().q(ru.ozon.android.messenger.framework.navigation.action.b.c(atomActionDTO));
    }

    private final f d(ru.ozon.android.messenger.blocks.recommendations.e eVar) {
        f fVar = new f(getContext());
        e.b d11 = eVar.d();
        fVar.c(d11 != null ? d11.b() : null);
        e.b d12 = eVar.d();
        fVar.a(d12 != null ? d12.a() : null, new a(eVar));
        e.b d13 = eVar.d();
        fVar.b(new ImageDTO(d13 != null ? d13.c() : null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, 65534, null));
        return fVar;
    }

    private final h e(e.c cVar, String str) {
        h hVar = new h(getContext());
        hVar.c(cVar.d());
        hVar.d(cVar.e());
        hVar.e(cVar.f());
        hVar.a(cVar.b(), new b(str, this));
        hVar.b(cVar.c());
        s.c(hVar, new c(cVar));
        return hVar;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.q
    public final void bind(ru.ozon.android.messenger.blocks.recommendations.e eVar, p itemInfo, ru.ozon.android.messenger.framework.presentation.models.d blockInfo, Object obj) {
        CommonControlSettings common;
        AtomActionDTO action;
        ru.ozon.android.messenger.blocks.recommendations.e block = eVar;
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        Intrinsics.checkNotNullParameter(blockInfo, "blockInfo");
        super.bind(block, itemInfo, blockInfo, obj);
        if (!(itemInfo instanceof ru.ozon.android.messenger.framework.presentation.models.s)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        MBlockRecomendationsBinding binding = getBinding();
        TextAtomV2View recommendationTitle = binding.recommendationTitle;
        Intrinsics.checkNotNullExpressionValue(recommendationTitle, "recommendationTitle");
        TextHolderKt.bindOrGone$default(recommendationTitle, block.i(), null, 2, null);
        TextAtomV2View recommendationSubTitle = binding.recommendationSubTitle;
        Intrinsics.checkNotNullExpressionValue(recommendationSubTitle, "recommendationSubTitle");
        TextHolderKt.bindOrGone$default(recommendationSubTitle, block.h(), null, 2, null);
        BadgeView recommendationBadgeButton = binding.recommendationBadgeButton;
        Intrinsics.checkNotNullExpressionValue(recommendationBadgeButton, "recommendationBadgeButton");
        BadgeHolderKt.bindOrGone$default(recommendationBadgeButton, block.c(), (Function1) null, 2, (Object) null);
        BadgeDTO c11 = block.c();
        if (c11 != null && (common = c11.getCommon()) != null && (action = common.getAction()) != null) {
            binding.recommendationBadgeButton.setOnClickListener(new XT.a(7, this, action));
        }
        MBlockRecomendationsBinding binding2 = getBinding();
        binding2.recommendationBadgeList.removeAllViews();
        List<e.a> b11 = block.b();
        if (b11 != null) {
            for (e.a aVar : b11) {
                if (aVar.b() != null) {
                    FlexboxLayout flexboxLayout = binding2.recommendationBadgeList;
                    d dVar = new d(getContext());
                    Intrinsics.checkNotNullParameter(dVar, "<this>");
                    dVar.setVisibility(0);
                    dVar.f(aVar);
                    flexboxLayout.addView(dVar);
                } else {
                    FlexboxLayout flexboxLayout2 = binding2.recommendationBadgeList;
                    BadgeView badgeView = new BadgeView(getContext(), null, 0, 0, 14, null);
                    BadgeHolderKt.bindOrGone$default(badgeView, aVar.a(), (Function1) null, 2, (Object) null);
                    flexboxLayout2.addView(badgeView);
                }
            }
            Unit unit = Unit.f71690a;
        }
        MBlockRecomendationsBinding binding3 = getBinding();
        binding3.productContainer.removeAllViews();
        if (block.d() != null) {
            binding3.productContainer.addView(d(block));
            Unit unit2 = Unit.f71690a;
        } else {
            List<e.c> g10 = block.g();
            if (g10 != null) {
                Iterator<T> it = g10.iterator();
                while (it.hasNext()) {
                    binding3.productContainer.addView(e((e.c) it.next(), block.getBlockId().a()), new LinearLayout.LayoutParams(-1, -2));
                }
                Unit unit3 = Unit.f71690a;
            }
        }
        TextView sendTimeTv = binding.sendTimeTv;
        Intrinsics.checkNotNullExpressionValue(sendTimeTv, "sendTimeTv");
        ru.ozon.android.messenger.blocks.common.a.b(sendTimeTv, block.getSendTime(), (ru.ozon.android.messenger.framework.presentation.models.s) itemInfo);
        ViewGroup findBubbleMsgContainer = findBubbleMsgContainer();
        if (findBubbleMsgContainer != null) {
            s.h(findBubbleMsgContainer, -1);
        }
        boolean d11 = Intrinsics.d(block.e(), Boolean.TRUE);
        ru.ozon.android.messenger.framework.core.d dVar2 = this.f86328a;
        if (d11) {
            dVar2.c().q(ru.ozon.android.messenger.framework.navigation.action.b.c(block.k()));
        }
        ru.ozon.android.messenger.framework.navigation.controller.a c12 = dVar2.c();
        ru.ozon.android.messenger.blocks.recommendations.e boundedData = getBoundedData();
        c12.s(boundedData != null ? boundedData.j() : null);
    }
}
