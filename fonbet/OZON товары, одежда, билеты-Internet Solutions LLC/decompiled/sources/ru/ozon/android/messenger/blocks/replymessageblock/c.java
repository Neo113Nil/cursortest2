package ru.ozon.android.messenger.blocks.replymessageblock;

import android.R;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.core.d;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.app.android.messenger.databinding.MViewReplyMessageBlockBinding;
import ru.ozon.uni.android.atom.productMedia.ProductMediaView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.v3.holders.productMedia.ProductMediaHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

/* loaded from: classes10.dex */
public final class c extends q<ru.ozon.android.messenger.blocks.replymessageblock.a, MViewReplyMessageBlockBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d f86373a;

    static final class a extends AbstractC7737t implements Function1<MViewReplyMessageBlockBinding, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.blocks.replymessageblock.a f86375c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ p f86376d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.d f86377e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f86378f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ru.ozon.android.messenger.blocks.replymessageblock.a aVar, p pVar, ru.ozon.android.messenger.framework.presentation.models.d dVar, Object obj) {
            super(1);
            this.f86375c = aVar;
            this.f86376d = pVar;
            this.f86377e = dVar;
            this.f86378f = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MViewReplyMessageBlockBinding mViewReplyMessageBlockBinding) {
            MViewReplyMessageBlockBinding withBinding = mViewReplyMessageBlockBinding;
            Intrinsics.checkNotNullParameter(withBinding, "$this$withBinding");
            ru.ozon.android.messenger.framework.presentation.models.d dVar = this.f86377e;
            Object obj = this.f86378f;
            c cVar = c.this;
            ru.ozon.android.messenger.blocks.replymessageblock.a aVar = this.f86375c;
            c.super.bind(aVar, this.f86376d, dVar, obj);
            Context context = withBinding.getConstraintLayout().getContext();
            VerticalLineStyleDTO verticalLineStyle = aVar.a().getVerticalLineStyle();
            StyleParser styleParser = StyleParser.INSTANCE;
            Intrinsics.f(context);
            Integer parseColor = styleParser.parseColor(context, verticalLineStyle != null ? verticalLineStyle.getColorToken() : null);
            int intValue = parseColor != null ? parseColor.intValue() : ThemeExtKt.themeColor(context, R.attr.colorAccent);
            View view = withBinding.replyDividerV;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(intValue);
            gradientDrawable.setCornerRadius(50.0f);
            view.setBackground(gradientDrawable);
            ProductMediaView replyMediaV = withBinding.replyMediaV;
            Intrinsics.checkNotNullExpressionValue(replyMediaV, "replyMediaV");
            ProductMediaHolderKt.bindOrGone$default(replyMediaV, aVar.a().getMessageMedia(), null, 2, null);
            TextAtomV2View textAtomV2View = withBinding.replyTitleTv;
            Intrinsics.f(textAtomV2View);
            TextHolderKt.bind$default(textAtomV2View, aVar.a().getTitleAtom(), null, 2, null);
            textAtomV2View.setTextIsSelectable(false);
            TextAtomV2View textAtomV2View2 = withBinding.replySubtitleTv;
            Intrinsics.f(textAtomV2View2);
            TextHolderKt.bindOrGone$default(textAtomV2View2, aVar.a().getSubtitleAtom(), null, 2, null);
            textAtomV2View2.setTextIsSelectable(false);
            withBinding.getConstraintLayout().setOnClickListener(new Lk.a(4, cVar, aVar));
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull MViewReplyMessageBlockBinding binding, @NotNull d references) {
        super(binding, references);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        this.f86373a = references;
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.q
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void bind(@NotNull ru.ozon.android.messenger.blocks.replymessageblock.a block, @NotNull p itemInfo, @NotNull ru.ozon.android.messenger.framework.presentation.models.d blockInfo, Object obj) {
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        Intrinsics.checkNotNullParameter(blockInfo, "blockInfo");
        withBinding(new a(block, itemInfo, blockInfo, obj));
    }
}
