package ru.ozon.android.messenger.blocks.disclaimer;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.h;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.android.messenger.utils.view.s;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.messenger.databinding.MBlockDisclaimerBinding;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.SmallBorderlessButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedBorderlessButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

/* loaded from: classes10.dex */
public final class c extends q<a, MBlockDisclaimerBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.core.d f85042a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull MBlockDisclaimerBinding binding, @NotNull ru.ozon.android.messenger.framework.core.d references) {
        super(binding, references);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        this.f85042a = references;
    }

    public static void b(ButtonV3Atom.SmallBorderlessButton smallBorderlessButton, c cVar, AtomActionDTO atomActionDTO) {
        Map<String, TokenizedTrackingInfo> trackingInfo = smallBorderlessButton.getTrackingInfo();
        ru.ozon.android.messenger.framework.core.d dVar = cVar.f85042a;
        if (trackingInfo != null) {
            dVar.c().m(h.a(trackingInfo));
        }
        dVar.c().q(ru.ozon.android.messenger.framework.navigation.action.b.c(atomActionDTO));
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.q
    public final void bind(a aVar, p itemInfo, ru.ozon.android.messenger.framework.presentation.models.d blockInfo, Object obj) {
        a block = aVar;
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        Intrinsics.checkNotNullParameter(blockInfo, "blockInfo");
        super.bind(block, itemInfo, blockInfo, obj);
        MBlockDisclaimerBinding binding = getBinding();
        binding.disclaimerRootCl.setClipToOutline(true);
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        s.b(constraintLayout, block.a());
        TextAtomView titleTv = binding.titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        TextAtomHolderKt.bindOrGone$default(titleTv, block.e(), null, 2, null);
        TextAtomView descriptionTv = binding.descriptionTv;
        Intrinsics.checkNotNullExpressionValue(descriptionTv, "descriptionTv");
        TextAtomHolderKt.bindOrGone$default(descriptionTv, block.d(), null, 2, null);
        ImageView disclaimerImage = binding.disclaimerImage;
        Intrinsics.checkNotNullExpressionValue(disclaimerImage, "disclaimerImage");
        ImageViewExtKt.loadImageOrGone(disclaimerImage, block.b());
        List<ButtonV3Atom.SmallBorderlessButton> c11 = block.c();
        Flow disclaimerButtonsFlow = binding.disclaimerButtonsFlow;
        Intrinsics.checkNotNullExpressionValue(disclaimerButtonsFlow, "disclaimerButtonsFlow");
        s.e(disclaimerButtonsFlow, c11 != null ? Boolean.valueOf(true ^ c11.isEmpty()) : null);
        int[] referencedIds = binding.disclaimerButtonsFlow.getReferencedIds();
        Intrinsics.checkNotNullExpressionValue(referencedIds, "getReferencedIds(...)");
        for (int i11 : referencedIds) {
            View findViewById = binding.getConstraintLayout().findViewById(i11);
            if (findViewById != null) {
                binding.getConstraintLayout().removeView(findViewById);
            }
        }
        binding.disclaimerButtonsFlow.setReferencedIds(new int[0]);
        if (c11 != null) {
            for (final ButtonV3Atom.SmallBorderlessButton smallBorderlessButton : c11) {
                int generateViewId = View.generateViewId();
                Context context = binding.getConstraintLayout().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                SmallBorderlessButtonView smallBorderlessButtonView = new SmallBorderlessButtonView(context, null, 0, 6, null);
                smallBorderlessButtonView.setId(generateViewId);
                WrappedBorderlessButtonHolderKt.bind$default(smallBorderlessButtonView, smallBorderlessButton, null, 2, null);
                final AtomActionDTO action = smallBorderlessButton.getAction();
                if (action != null) {
                    smallBorderlessButtonView.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.android.messenger.blocks.disclaimer.b
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            c.b(ButtonV3Atom.SmallBorderlessButton.this, this, action);
                        }
                    });
                }
                binding.getConstraintLayout().addView(smallBorderlessButtonView);
                Flow flow = binding.disclaimerButtonsFlow;
                int[] referencedIds2 = flow.getReferencedIds();
                Intrinsics.checkNotNullExpressionValue(referencedIds2, "getReferencedIds(...)");
                flow.setReferencedIds(C7705l.T(referencedIds2, generateViewId));
            }
        }
    }
}
