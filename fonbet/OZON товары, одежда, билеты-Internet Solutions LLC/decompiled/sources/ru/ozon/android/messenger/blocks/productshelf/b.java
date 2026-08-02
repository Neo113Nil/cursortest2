package ru.ozon.android.messenger.blocks.productshelf;

import Sc.o;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import mj.ViewOnClickListenerC8342a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.i;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.android.messenger.framework.presentation.common.view.timestatus.TimeStatusView;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.android.messenger.framework.presentation.models.s;
import ru.ozon.android.messenger.framework.presentation.models.w;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.messenger.databinding.MBlockProductShelfBinding;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.productMedia.ProductMediaView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.price.PriceAtomHolderKt;
import ru.ozon.uni.atoms.v3.holders.productMedia.ProductMediaHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

/* loaded from: classes10.dex */
public final class b extends q<i, MBlockProductShelfBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.core.d f86053a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AtomsAdapter f86054b;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f86055a;

        static {
            int[] iArr = new int[i.a.values().length];
            try {
                iArr[i.a.STATUS_CHANGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f86055a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull MBlockProductShelfBinding binding, @NotNull ru.ozon.android.messenger.framework.core.d references) {
        super(binding, references);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        this.f86053a = references;
        this.f86054b = new AtomsAdapter(null, null, null, null, 15, null);
    }

    public static void b(b bVar, IconButtonV3DTO iconButtonV3DTO, AtomActionDTO atomActionDTO, String str) {
        ru.ozon.android.messenger.framework.navigation.controller.a c11 = bVar.f86053a.c();
        CommonControlSettings common = iconButtonV3DTO.getCommon();
        c11.m(ru.ozon.android.messenger.framework.analytics.h.a(common != null ? common.getTrackingInfo() : null));
        ru.ozon.android.messenger.framework.navigation.action.a c12 = ru.ozon.android.messenger.framework.navigation.action.b.c(atomActionDTO);
        AtomAction c13 = c12.c();
        AtomAction.Click click = c13 instanceof AtomAction.Click ? (AtomAction.Click) c13 : null;
        ru.ozon.android.messenger.framework.core.d dVar = bVar.f86053a;
        if (click != null) {
            Map<String, String> params = atomActionDTO.getParams();
            AtomAction.Click copy$default = AtomAction.Click.copy$default(click, null, null, null, params != null ? U.n(params, new Pair("itemId", str)) : null, null, null, 55, null);
            if (copy$default != null) {
                dVar.c().q(ru.ozon.android.messenger.framework.navigation.action.b.e(copy$default, null, 3));
                return;
            }
        }
        dVar.c().q(c12);
    }

    public static void c(b bVar, BadgeDTO badgeDTO, AtomActionDTO atomActionDTO) {
        ru.ozon.android.messenger.framework.navigation.controller.a c11 = bVar.f86053a.c();
        CommonControlSettings common = badgeDTO.getCommon();
        c11.m(ru.ozon.android.messenger.framework.analytics.h.a(common != null ? common.getTrackingInfo() : null));
        bVar.f86053a.c().q(ru.ozon.android.messenger.framework.navigation.action.b.c(atomActionDTO));
    }

    public static void d(Map map, b bVar, i iVar) {
        ru.ozon.android.messenger.framework.core.d dVar = bVar.f86053a;
        if (map != null) {
            dVar.c().m(map);
        }
        dVar.c().q(ru.ozon.android.messenger.framework.navigation.action.b.c(iVar.a()));
    }

    private final void f(i iVar, final String str) {
        final AtomActionDTO action;
        int i11;
        MBlockProductShelfBinding binding = getBinding();
        binding.productButtonsContainer.removeAllViews();
        List<IconButtonV3DTO> c11 = iVar.c();
        if (c11 != null) {
            int i12 = 0;
            for (Object obj : c11) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C7714v.O0();
                    throw null;
                }
                final IconButtonV3DTO iconButtonV3DTO = (IconButtonV3DTO) obj;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                if (i12 != C7714v.P(iVar.c())) {
                    i11 = ru.ozon.android.messenger.utils.e.f91908e;
                    layoutParams.setMarginEnd(i11);
                }
                IconButtonV3View iconButtonV3View = new IconButtonV3View(getContext(), null, 0, 0, 14, null);
                IconButtonV3HolderKt.bind(iconButtonV3View, iconButtonV3DTO, new c(this, iconButtonV3DTO));
                CommonControlSettings common = iconButtonV3DTO.getCommon();
                if (common != null && (action = common.getAction()) != null) {
                    iconButtonV3View.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.android.messenger.blocks.productshelf.a
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            AtomActionDTO atomActionDTO = action;
                            b.b(b.this, iconButtonV3DTO, atomActionDTO, str);
                        }
                    });
                }
                binding.productButtonsContainer.addView(iconButtonV3View, layoutParams);
                i12 = i13;
            }
            Unit unit = Unit.f71690a;
        }
    }

    private final void g(i iVar) {
        AtomActionDTO action;
        int i11;
        int i12 = 1;
        MBlockProductShelfBinding binding = getBinding();
        binding.productPriceBadgesContainer.removeAllViews();
        List<BadgeDTO> f7 = iVar.f();
        if (f7 != null) {
            int i13 = 0;
            for (Object obj : f7) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    C7714v.O0();
                    throw null;
                }
                BadgeDTO badgeDTO = (BadgeDTO) obj;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                if (i13 != C7714v.P(iVar.f())) {
                    i11 = ru.ozon.android.messenger.utils.e.f91910g;
                    layoutParams.setMarginEnd(i11);
                }
                BadgeView badgeView = new BadgeView(getContext(), null, 0, 0, 14, null);
                BadgeHolderKt.bind(badgeView, badgeDTO, new d(this, badgeDTO));
                CommonControlSettings common = badgeDTO.getCommon();
                if (common != null && (action = common.getAction()) != null) {
                    badgeView.setOnClickListener(new ViewOnClickListenerC8342a(this, badgeDTO, action, i12));
                }
                binding.productPriceBadgesContainer.addView(badgeView, layoutParams);
                i13 = i14;
            }
            Unit unit = Unit.f71690a;
        }
    }

    private static void h(MBlockProductShelfBinding mBlockProductShelfBinding, i iVar, s sVar) {
        String sendTime = iVar.getSendTime();
        if (sendTime == null) {
            sendTime = "";
        }
        ru.ozon.android.messenger.framework.presentation.common.view.timestatus.d dVar = new ru.ozon.android.messenger.framework.presentation.common.view.timestatus.d(sendTime, sVar.k(), sVar.n());
        TimeStatusView timeStatusView = mBlockProductShelfBinding.timeStatusView;
        Intrinsics.checkNotNullExpressionValue(timeStatusView, "timeStatusView");
        dVar.a(timeStatusView);
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.q
    public final void bind(i iVar, p itemInfo, ru.ozon.android.messenger.framework.presentation.models.d blockInfo, Object obj) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        i block = iVar;
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        Intrinsics.checkNotNullParameter(blockInfo, "blockInfo");
        super.bind(block, itemInfo, blockInfo, obj);
        boolean z11 = itemInfo instanceof s;
        if (!z11 && !(itemInfo instanceof w)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        MBlockProductShelfBinding binding = getBinding();
        if (z11) {
            ConstraintLayout constraintLayout = getBinding().getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            ru.ozon.android.messenger.utils.view.s.f(constraintLayout, new f(this));
        } else {
            ConstraintLayout constraintLayout2 = getBinding().getConstraintLayout();
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "getRoot(...)");
            ru.ozon.android.messenger.utils.view.s.f(constraintLayout2, new g(this));
        }
        ProductMediaView productImage = binding.productImage;
        Intrinsics.checkNotNullExpressionValue(productImage, "productImage");
        ProductMediaHolderKt.bind$default(productImage, block.d(), null, 2, null);
        PriceAtomView productPrice = binding.productPrice;
        Intrinsics.checkNotNullExpressionValue(productPrice, "productPrice");
        PriceAtomHolderKt.bindOrGone$default(productPrice, block.e(), null, 2, null);
        LinearLayout productButtonsContainer = binding.productButtonsContainer;
        Intrinsics.checkNotNullExpressionValue(productButtonsContainer, "productButtonsContainer");
        boolean z12 = false;
        ru.ozon.android.messenger.utils.view.s.e(productButtonsContainer, Boolean.valueOf(block.c() != null));
        LinearLayout productPriceBadgesContainer = binding.productPriceBadgesContainer;
        Intrinsics.checkNotNullExpressionValue(productPriceBadgesContainer, "productPriceBadgesContainer");
        ru.ozon.android.messenger.utils.view.s.e(productPriceBadgesContainer, Boolean.valueOf(block.f() != null));
        ProductMediaView productMediaView = binding.productImage;
        Map<String, TokenizedTrackingInfo> trackingInfo2 = block.d().getTrackingInfo();
        productMediaView.setOnClickListener(new Yt.c(trackingInfo2 != null ? ru.ozon.android.messenger.framework.analytics.h.a(trackingInfo2) : block.h(), this, block, 1));
        PriceAtomView priceAtomView = binding.productPrice;
        PriceDTO e11 = block.e();
        priceAtomView.setOnClickListener(new Yt.c((e11 == null || (trackingInfo = e11.getTrackingInfo()) == null) ? block.h() : ru.ozon.android.messenger.framework.analytics.h.a(trackingInfo), this, block, 1));
        TextAtomV2View textAtomV2View = binding.productName;
        Map<String, TokenizedTrackingInfo> trackingInfo3 = block.g().getTrackingInfo();
        textAtomV2View.setOnClickListener(new Yt.c(trackingInfo3 != null ? ru.ozon.android.messenger.framework.analytics.h.a(trackingInfo3) : block.h(), this, block, 1));
        MBlockProductShelfBinding binding2 = getBinding();
        TextAtomV2View productName = binding2.productName;
        Intrinsics.checkNotNullExpressionValue(productName, "productName");
        TextHolderKt.bind$default(productName, block.g(), null, 2, null);
        TextAtomV2View productName2 = binding2.productName;
        Intrinsics.checkNotNullExpressionValue(productName2, "productName");
        ru.ozon.android.messenger.utils.view.s.f(productName2, new e(block, this));
        MBlockProductShelfBinding binding3 = getBinding();
        TimeStatusView timeStatusView = binding3.timeStatusView;
        Intrinsics.checkNotNullExpressionValue(timeStatusView, "timeStatusView");
        if (z11 && ((s) itemInfo).a() == 1) {
            z12 = true;
        }
        ru.ozon.android.messenger.utils.view.s.e(timeStatusView, Boolean.valueOf(z12));
        s sVar = z11 ? (s) itemInfo : null;
        if (sVar != null) {
            if (obj != null) {
                List list = obj instanceof List ? (List) obj : null;
                if (list == null || list.isEmpty()) {
                    list = C7705l.f0(i.a.values());
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (a.f86055a[((i.a) ((Enum) it.next())).ordinal()] != 1) {
                        throw new o();
                    }
                    h(binding3, block, sVar);
                }
            } else {
                h(binding3, block, sVar);
            }
            Unit unit = Unit.f71690a;
        }
        f(block, block.getBlockId().a());
        g(block);
        MBlockProductShelfBinding binding4 = getBinding();
        if (block.b() != null) {
            binding4.productBottomBadgesContainer.removeAllViews();
            HorizontalFlexAtomsLayout horizontalFlexAtomsLayout = binding4.productBottomBadgesContainer;
            AtomsAdapter atomsAdapter = this.f86054b;
            horizontalFlexAtomsLayout.setAdapter(atomsAdapter);
            atomsAdapter.bind(getContext(), block.b());
        }
    }
}
