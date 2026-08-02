package ru.ozon.android.messenger.blocks.originalText;

import Lw.ViewOnClickListenerC3600c;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.J;
import com.google.android.gms.wallet.WalletConstants;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import nm0.C8612b;
import org.jetbrains.annotations.NotNull;
import q10.ViewOnClickListenerC8975c;
import ru.ozon.android.messenger.blocks.originalText.f;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.core.initialization.newinit.d;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.android.messenger.framework.presentation.models.s;
import ru.ozon.app.android.messenger.R$drawable;
import ru.ozon.app.android.messenger.databinding.MBlockOriginalTextBinding;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

/* loaded from: classes10.dex */
public final class c extends q<f, MBlockOriginalTextBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.core.d f85987a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f85988b;

    static final class a extends AbstractC7737t implements Function1<MBlockOriginalTextBinding, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f85990c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ p f85991d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.d f85992e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f85993f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f fVar, p pVar, ru.ozon.android.messenger.framework.presentation.models.d dVar, Object obj) {
            super(1);
            this.f85990c = fVar;
            this.f85991d = pVar;
            this.f85992e = dVar;
            this.f85993f = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MBlockOriginalTextBinding mBlockOriginalTextBinding) {
            final MBlockOriginalTextBinding withBinding = mBlockOriginalTextBinding;
            Intrinsics.checkNotNullParameter(withBinding, "$this$withBinding");
            ru.ozon.android.messenger.framework.presentation.models.d dVar = this.f85992e;
            Object obj = this.f85993f;
            final c cVar = c.this;
            final f fVar = this.f85990c;
            p pVar = this.f85991d;
            c.super.bind(fVar, pVar, dVar, obj);
            if (!(pVar instanceof s)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            d.a f7 = ru.ozon.android.messenger.utils.g.f(cVar.f85987a.d());
            f.a b11 = fVar.b();
            TextDTO d11 = b11.d();
            TextAtomV2View titleOriginalText = withBinding.titleOriginalText;
            Intrinsics.checkNotNullExpressionValue(titleOriginalText, "titleOriginalText");
            TextHolderKt.bind$default(titleOriginalText, d11, null, 2, null);
            withBinding.titleOriginalText.setFocusable(false);
            withBinding.titleOriginalText.setFocusableInTouchMode(false);
            String b12 = b11.b();
            String c11 = b11.c();
            ImageView iconOriginalText = withBinding.iconOriginalText;
            Intrinsics.checkNotNullExpressionValue(iconOriginalText, "iconOriginalText");
            ru.ozon.android.messenger.utils.image.c.a(iconOriginalText, b12, f7);
            ImageView iconOriginalText2 = withBinding.iconOriginalText;
            Intrinsics.checkNotNullExpressionValue(iconOriginalText2, "iconOriginalText");
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = withBinding.getConstraintLayout().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ThemeExtKt.tint(iconOriginalText2, styleParser.parseColor(context, c11));
            withBinding.originalText.setFocusable(false);
            withBinding.originalText.setFocusableInTouchMode(false);
            TextAtomV2View originalText = withBinding.originalText;
            Intrinsics.checkNotNullExpressionValue(originalText, "originalText");
            TextHolderKt.bindOrGone$default(originalText, fVar.d(), null, 2, null);
            if (!cVar.f85988b) {
                TextAtomV2View originalText2 = withBinding.originalText;
                Intrinsics.checkNotNullExpressionValue(originalText2, "originalText");
                ru.ozon.android.messenger.utils.view.s.a(originalText2);
            }
            String c12 = fVar.c();
            if (c12 != null && !h.K(c12)) {
                withBinding.originalText.animate().setListener(null).rotation(0.0f).start();
                c.h(cVar, OzonSpannableStringKt.toOzonSpannableString(fVar.c()));
            }
            withBinding.titleOriginalText.setOnClickListener(new ViewOnClickListenerC8975c(cVar, withBinding, fVar, 1));
            withBinding.iconOriginalText.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.android.messenger.blocks.originalText.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    c.c(c.this, withBinding, fVar);
                }
            });
            withBinding.originalText.setOnClickListener(new ViewOnClickListenerC3600c(cVar, withBinding, fVar, 2));
            cVar.f85987a.c().s(fVar.e());
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(@NotNull MBlockOriginalTextBinding binding, @NotNull ru.ozon.android.messenger.framework.core.d references) {
        super(binding, references);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        this.f85987a = references;
    }

    public static void b(c cVar, MBlockOriginalTextBinding mBlockOriginalTextBinding, f fVar) {
        cVar.j(mBlockOriginalTextBinding, fVar);
    }

    public static void c(c cVar, MBlockOriginalTextBinding mBlockOriginalTextBinding, f fVar) {
        cVar.j(mBlockOriginalTextBinding, fVar);
    }

    public static void d(c cVar, MBlockOriginalTextBinding mBlockOriginalTextBinding, f fVar) {
        cVar.j(mBlockOriginalTextBinding, fVar);
    }

    public static final void h(c cVar, OzonSpannableString ozonSpannableString) {
        ru.ozon.android.messenger.framework.core.d dVar = cVar.f85987a;
        ViewGroup b11 = C8612b.b(dVar.d());
        if (b11 != null) {
            int i11 = R$drawable.ic_m_danger_filled;
            J viewLifecycleOwner = dVar.d().getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            ru.ozon.android.messenger.framework.presentation.common.view.flashbar.factory.b.c(b11, ozonSpannableString, Integer.valueOf(i11), "graphicNegativePrimary", viewLifecycleOwner, WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE).e();
        }
    }

    private final void j(MBlockOriginalTextBinding mBlockOriginalTextBinding, f fVar) {
        boolean z11 = this.f85988b;
        ru.ozon.android.messenger.framework.core.d dVar = this.f85987a;
        if (z11) {
            TextAtomV2View originalText = mBlockOriginalTextBinding.originalText;
            Intrinsics.checkNotNullExpressionValue(originalText, "originalText");
            ru.ozon.android.messenger.utils.view.s.a(originalText);
            mBlockOriginalTextBinding.iconOriginalText.animate().setListener(null).rotation(0.0f).start();
        } else {
            if (fVar.d() == null) {
                mBlockOriginalTextBinding.iconOriginalText.animate().setListener(null).rotation(0.0f).start();
            } else {
                TextAtomV2View originalText2 = mBlockOriginalTextBinding.originalText;
                Intrinsics.checkNotNullExpressionValue(originalText2, "originalText");
                TextHolderKt.bindOrGone$default(originalText2, fVar.d(), null, 2, null);
                TextAtomV2View originalText3 = mBlockOriginalTextBinding.originalText;
                Intrinsics.checkNotNullExpressionValue(originalText3, "originalText");
                ru.ozon.android.messenger.utils.view.s.d(originalText3);
            }
            mBlockOriginalTextBinding.iconOriginalText.animate().rotation(180.0f).setListener(new b(fVar, mBlockOriginalTextBinding, ru.ozon.android.messenger.utils.g.f(dVar.d()), this)).start();
        }
        this.f85988b = !this.f85988b;
        Map<String, MessengerTrackingInfo> e11 = fVar.e();
        if (e11 != null) {
            dVar.c().m(e11);
        }
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.view.recycler.q
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void bind(@NotNull f block, @NotNull p itemInfo, @NotNull ru.ozon.android.messenger.framework.presentation.models.d blockInfo, Object obj) {
        Intrinsics.checkNotNullParameter(block, "block");
        Intrinsics.checkNotNullParameter(itemInfo, "itemInfo");
        Intrinsics.checkNotNullParameter(blockInfo, "blockInfo");
        withBinding(new a(block, itemInfo, blockInfo, obj));
    }
}
