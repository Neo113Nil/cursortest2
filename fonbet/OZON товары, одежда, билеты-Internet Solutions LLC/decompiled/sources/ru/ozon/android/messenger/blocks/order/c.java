package ru.ozon.android.messenger.blocks.order;

import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q10.ViewOnClickListenerC8974b;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.core.initialization.newinit.d;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.android.messenger.framework.presentation.models.s;
import ru.ozon.android.messenger.utils.g;
import ru.ozon.app.android.messenger.databinding.MBlockOrderBinding;
import ru.ozon.uni.android.atom.productMedia.ProductMediaView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.productMedia.ProductMediaHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

/* loaded from: classes10.dex */
public final class c extends q<b, MBlockOrderBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.core.d f85968a;

    static final class a extends AbstractC7737t implements Function1<MBlockOrderBinding, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextAtomV2View f85969b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f85970c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(TextAtomV2View textAtomV2View, b bVar) {
            super(1);
            this.f85969b = textAtomV2View;
            this.f85970c = bVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MBlockOrderBinding mBlockOrderBinding) {
            MBlockOrderBinding withBinding = mBlockOrderBinding;
            Intrinsics.checkNotNullParameter(withBinding, "$this$withBinding");
            TextDTO e11 = this.f85970c.e();
            TextAtomV2View textAtomV2View = this.f85969b;
            TextHolderKt.bindOrGone$default(textAtomV2View, e11, null, 2, null);
            textAtomV2View.setTextIsSelectable(false);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull MBlockOrderBinding binding, @NotNull ru.ozon.android.messenger.framework.core.d references) {
        super(binding, references);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        this.f85968a = references;
    }

    private final void b(TextAtomV2View textAtomV2View, b bVar) {
        withBinding(new a(textAtomV2View, bVar));
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.q
    public final void bind(b bVar, p itemInfo, ru.ozon.android.messenger.framework.presentation.models.d blockInfo, Object obj) {
        b block = bVar;
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        Intrinsics.checkNotNullParameter(blockInfo, "blockInfo");
        super.bind(block, itemInfo, blockInfo, obj);
        if (!(itemInfo instanceof s)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        ru.ozon.android.messenger.framework.core.d dVar = this.f85968a;
        d.a f7 = g.f(dVar.d());
        MBlockOrderBinding binding = getBinding();
        ProductMediaView orderProductMedia = binding.orderProductMedia;
        Intrinsics.checkNotNullExpressionValue(orderProductMedia, "orderProductMedia");
        ProductMediaHolderKt.bindOrGone$default(orderProductMedia, block.c(), null, 2, null);
        TextAtomV2View orderTitle = binding.orderTitle;
        Intrinsics.checkNotNullExpressionValue(orderTitle, "orderTitle");
        b(orderTitle, block);
        binding.orderLabeledIcon.b(block.b(), f7);
        TextAtomV2View textAtomV2View = binding.orderSubtitle;
        Intrinsics.f(textAtomV2View);
        TextHolderKt.bindOrGone$default(textAtomV2View, block.d(), null, 2, null);
        textAtomV2View.setTextIsSelectable(false);
        ConstraintLayout orderRoot = binding.orderRoot;
        Intrinsics.checkNotNullExpressionValue(orderRoot, "orderRoot");
        AtomActionDTO a11 = block.a();
        if (a11 != null) {
            orderRoot.setOnClickListener(new ViewOnClickListenerC8974b(this, block, dVar, a11));
        }
        s sVar = (s) itemInfo;
        if (sVar.a() == 1) {
            TextView orderSendTime = binding.orderSendTime;
            Intrinsics.checkNotNullExpressionValue(orderSendTime, "orderSendTime");
            ru.ozon.android.messenger.blocks.common.a.b(orderSendTime, block.getSendTime(), sVar);
            TextView orderSendTime2 = binding.orderSendTime;
            Intrinsics.checkNotNullExpressionValue(orderSendTime2, "orderSendTime");
            ru.ozon.android.messenger.utils.view.s.d(orderSendTime2);
            AppCompatImageView orderStatus = binding.orderStatus;
            Intrinsics.checkNotNullExpressionValue(orderStatus, "orderStatus");
            ru.ozon.android.messenger.blocks.common.a.a(orderStatus, sVar.k());
        } else {
            TextView orderSendTime3 = binding.orderSendTime;
            Intrinsics.checkNotNullExpressionValue(orderSendTime3, "orderSendTime");
            ru.ozon.android.messenger.utils.view.s.a(orderSendTime3);
            AppCompatImageView orderStatus2 = binding.orderStatus;
            Intrinsics.checkNotNullExpressionValue(orderStatus2, "orderStatus");
            ru.ozon.android.messenger.utils.view.s.a(orderStatus2);
        }
        Map<String, MessengerTrackingInfo> f11 = block.f();
        if (f11 != null) {
            dVar.c().s(f11);
        }
    }
}
