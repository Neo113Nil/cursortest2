package ru.ozon.android.messenger.blocks.rateoperator.message;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.rateoperator.message.c;
import ru.ozon.android.messenger.framework.core.d;
import ru.ozon.android.messenger.framework.core.initialization.newinit.d;
import ru.ozon.android.messenger.framework.presentation.common.screen.h;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.android.messenger.utils.e;
import ru.ozon.android.messenger.utils.g;
import ru.ozon.android.messenger.utils.view.j;
import ru.ozon.android.messenger.utils.view.s;
import ru.ozon.app.android.messenger.databinding.MBlockRateOperatorMessageBinding;
import ru.ozon.uni.android.uikit.view.atoms.rating.VectorRatingBar;
import ru.ozon.uni.atoms.data.button.Icon;

/* loaded from: classes10.dex */
public final class a extends q<ru.ozon.android.messenger.blocks.rateoperator.b, MBlockRateOperatorMessageBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d f86254a;

    /* renamed from: ru.ozon.android.messenger.blocks.rateoperator.message.a$a, reason: collision with other inner class name */
    static final class C1524a extends AbstractC7737t implements Function1<Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.blocks.rateoperator.b f86255b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ a f86256c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1524a(ru.ozon.android.messenger.blocks.rateoperator.b bVar, a aVar) {
            super(1);
            this.f86255b = bVar;
            this.f86256c = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            ru.ozon.android.messenger.blocks.rateoperator.b a11 = ru.ozon.android.messenger.blocks.rateoperator.b.a(this.f86255b, num.intValue(), null, 383);
            ru.ozon.android.messenger.blocks.rateoperator.bottomsheet.a aVar = new ru.ozon.android.messenger.blocks.rateoperator.bottomsheet.a();
            h.w(a11, aVar);
            aVar.show(this.f86256c.f86254a.d().getParentFragmentManager(), (String) null);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull MBlockRateOperatorMessageBinding binding, @NotNull d references) {
        super(binding, references);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        this.f86254a = references;
    }

    private final void c(ru.ozon.android.messenger.blocks.rateoperator.b bVar) {
        int i11;
        Integer num;
        int i12;
        int i13 = getContext().getResources().getDisplayMetrics().widthPixels;
        i11 = b.f86258b;
        if (i13 > i11) {
            i12 = b.f86257a;
            num = Integer.valueOf(i12);
        } else {
            num = null;
        }
        MBlockRateOperatorMessageBinding binding = getBinding();
        if (num != null) {
            int intValue = num.intValue();
            LinearLayout rateOperatorRatingLl = binding.rateOperatorRatingLl;
            Intrinsics.checkNotNullExpressionValue(rateOperatorRatingLl, "rateOperatorRatingLl");
            s.h(rateOperatorRatingLl, intValue);
        } else {
            LinearLayout rateOperatorRatingLl2 = binding.rateOperatorRatingLl;
            Intrinsics.checkNotNullExpressionValue(rateOperatorRatingLl2, "rateOperatorRatingLl");
            s.h(rateOperatorRatingLl2, -2);
        }
        LinearLayout rateOperatorRatingLl3 = binding.rateOperatorRatingLl;
        Intrinsics.checkNotNullExpressionValue(rateOperatorRatingLl3, "rateOperatorRatingLl");
        s.d(rateOperatorRatingLl3);
        LinearLayout rateOperatorSuccessCl = binding.rateOperatorSuccessCl;
        Intrinsics.checkNotNullExpressionValue(rateOperatorSuccessCl, "rateOperatorSuccessCl");
        s.a(rateOperatorSuccessCl);
        binding.rateOperatorRatingVrb.setRating(0.0f);
        binding.rateOperatorRatingTitleTv.setText(bVar.getTitle());
        VectorRatingBar rateOperatorRatingVrb = binding.rateOperatorRatingVrb;
        Intrinsics.checkNotNullExpressionValue(rateOperatorRatingVrb, "rateOperatorRatingVrb");
        j.b(rateOperatorRatingVrb, new C1524a(bVar, this));
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.q
    public final void bind(ru.ozon.android.messenger.blocks.rateoperator.b bVar, p itemInfo, ru.ozon.android.messenger.framework.presentation.models.d blockInfo, Object obj) {
        int i11;
        int i12;
        ru.ozon.android.messenger.blocks.rateoperator.b block = bVar;
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        Intrinsics.checkNotNullParameter(blockInfo, "blockInfo");
        super.bind(block, itemInfo, blockInfo, obj);
        if (!(block.g() instanceof c.b)) {
            c(block);
            return;
        }
        MBlockRateOperatorMessageBinding binding = getBinding();
        d.a f7 = g.f(this.f86254a.d());
        LinearLayout rateOperatorRatingLl = binding.rateOperatorRatingLl;
        Intrinsics.checkNotNullExpressionValue(rateOperatorRatingLl, "rateOperatorRatingLl");
        s.a(rateOperatorRatingLl);
        LinearLayout rateOperatorSuccessCl = binding.rateOperatorSuccessCl;
        Intrinsics.checkNotNullExpressionValue(rateOperatorSuccessCl, "rateOperatorSuccessCl");
        s.d(rateOperatorSuccessCl);
        binding.rateOperatorSuccessTitleTV.setText(block.e().b());
        Icon a11 = block.e().a();
        if (a11 == null) {
            TextView rateOperatorSuccessTitleTV = binding.rateOperatorSuccessTitleTV;
            Intrinsics.checkNotNullExpressionValue(rateOperatorSuccessTitleTV, "rateOperatorSuccessTitleTV");
            i11 = e.f91911h;
            s.g(rateOperatorSuccessTitleTV, i11, 0, 0, 0, 14);
            return;
        }
        ImageView rateOperatorSuccessIV = binding.rateOperatorSuccessIV;
        Intrinsics.checkNotNullExpressionValue(rateOperatorSuccessIV, "rateOperatorSuccessIV");
        ru.ozon.android.messenger.utils.image.c.b(rateOperatorSuccessIV, a11, null, f7);
        TextView rateOperatorSuccessTitleTV2 = binding.rateOperatorSuccessTitleTV;
        Intrinsics.checkNotNullExpressionValue(rateOperatorSuccessTitleTV2, "rateOperatorSuccessTitleTV");
        i12 = e.f91908e;
        s.g(rateOperatorSuccessTitleTV2, i12, 0, 0, 0, 14);
    }
}
