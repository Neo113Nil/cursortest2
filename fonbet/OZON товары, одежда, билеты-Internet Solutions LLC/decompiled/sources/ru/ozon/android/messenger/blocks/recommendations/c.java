package ru.ozon.android.messenger.blocks.recommendations;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.blocks.recommendations.RecommendationsDTO;
import ru.ozon.android.messenger.blocks.recommendations.e;
import ru.ozon.android.messenger.framework.data.remote.models.blocks.BlockDTO;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.android.messenger.utils.view.s;
import ru.ozon.app.android.messenger.databinding.MViewRecomendationsBinding;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

/* loaded from: classes10.dex */
public final class c extends ru.ozon.android.messenger.framework.core.viewmapper.b<RecommendationsDTO, e, MViewRecomendationsBinding> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<String, RecommendationsDTO> f86264b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f86265c;

    static final class a extends AbstractC7737t implements Function0<d> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f86266b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final d invoke() {
            return new d();
        }
    }

    static final class b extends AbstractC7737t implements Function1<String, RecommendationsDTO> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f86267b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(JsonParser jsonParser) {
            super(1);
            this.f86267b = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final RecommendationsDTO invoke(String str) {
            String state = str;
            Intrinsics.checkNotNullParameter(state, "state");
            return (RecommendationsDTO) this.f86267b.fromJson(state, RecommendationsDTO.class);
        }
    }

    public c(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f86264b = new b(deserializer);
        this.f86265c = ru.ozon.android.messenger.utils.f.b(a.f86266b);
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void b(ViewGroup rootView, MViewRecomendationsBinding mViewRecomendationsBinding, ru.ozon.android.messenger.framework.core.d references, e eVar) {
        MViewRecomendationsBinding binding = mViewRecomendationsBinding;
        e viewObject = eVar;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        ru.ozon.android.messenger.framework.core.viewmapper.b.e(rootView).addView(binding.getConstraintLayout());
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void c(ViewGroup rootView, X4.a aVar, ru.ozon.android.messenger.framework.core.d references, g gVar) {
        List<e.c> g10;
        MViewRecomendationsBinding binding = (MViewRecomendationsBinding) aVar;
        e viewObject = (e) gVar;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        TextAtomV2View recommendationTitle = binding.recommendationTitle;
        Intrinsics.checkNotNullExpressionValue(recommendationTitle, "recommendationTitle");
        TextHolderKt.bindOrGone$default(recommendationTitle, viewObject.i(), null, 2, null);
        binding.recommendationTitle.setTextIsSelectable(false);
        BadgeView recommendationBadgeButton = binding.recommendationBadgeButton;
        Intrinsics.checkNotNullExpressionValue(recommendationBadgeButton, "recommendationBadgeButton");
        BadgeHolderKt.bindOrGone(recommendationBadgeButton, viewObject.c(), new ru.ozon.android.messenger.blocks.recommendations.a(references));
        binding.productContainer.removeAllViews();
        if (viewObject.d() != null || (g10 = viewObject.g()) == null) {
            return;
        }
        for (e.c cVar : g10) {
            LinearLayoutCompat linearLayoutCompat = binding.productContainer;
            Context context = binding.getConstraintLayout().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ru.ozon.android.messenger.blocks.recommendations.presentation.g gVar2 = new ru.ozon.android.messenger.blocks.recommendations.presentation.g(context);
            gVar2.a(cVar.d());
            gVar2.b(cVar.e());
            gVar2.c(cVar.f());
            s.c(gVar2, new ru.ozon.android.messenger.blocks.recommendations.b(references, cVar));
            linearLayoutCompat.addView(gVar2, new LinearLayout.LayoutParams(-2, -2));
        }
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final boolean canMap(Object obj) {
        String state;
        if (obj instanceof ru.ozon.android.messenger.framework.presentation.models.e) {
            ru.ozon.android.messenger.framework.presentation.models.e eVar = (ru.ozon.android.messenger.framework.presentation.models.e) obj;
            return (eVar.b() instanceof e) && ((e) eVar.b()).f() == RecommendationsDTO.a.FOOTER;
        }
        if (obj instanceof BlockDTO) {
            BlockDTO blockDTO = obj != null ? (BlockDTO) obj : null;
            if (blockDTO != null && (state = blockDTO.getState()) != null) {
                try {
                    Object invoke = ((b) this.f86264b).invoke(state);
                    RecommendationsDTO recommendationsDTO = invoke instanceof RecommendationsDTO ? (RecommendationsDTO) invoke : null;
                    if ((recommendationsDTO != null ? recommendationsDTO.getPlace() : null) == RecommendationsDTO.a.FOOTER) {
                        return true;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final Function2 getMapper() {
        return (d) this.f86265c.getValue();
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, RecommendationsDTO> getParser() {
        return this.f86264b;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final MViewRecomendationsBinding j(ViewGroup rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        ViewGroup e11 = ru.ozon.android.messenger.framework.core.viewmapper.b.e(rootView);
        Context context = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        MViewRecomendationsBinding inflate = MViewRecomendationsBinding.inflate(ru.ozon.android.messenger.utils.c.c(context), e11, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void l(ViewGroup rootView, MViewRecomendationsBinding mViewRecomendationsBinding, ru.ozon.android.messenger.framework.core.d references) {
        MViewRecomendationsBinding binding = mViewRecomendationsBinding;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        ru.ozon.android.messenger.framework.core.viewmapper.b.e(rootView).removeView(binding.getConstraintLayout());
    }
}
