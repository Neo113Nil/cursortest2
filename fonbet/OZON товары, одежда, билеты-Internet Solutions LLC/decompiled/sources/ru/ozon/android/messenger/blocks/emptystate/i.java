package ru.ozon.android.messenger.blocks.emptystate;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.core.initialization.newinit.d;
import ru.ozon.android.messenger.framework.data.remote.models.blocks.BlockDTO;
import ru.ozon.android.messenger.framework.presentation.models.n;
import ru.ozon.android.messenger.utils.view.TripleBalancedCenterLayout;
import ru.ozon.android.messenger.utils.view.s;
import ru.ozon.app.android.messenger.R$drawable;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.databinding.MBlockEmptyStateBinding;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.buttons.LargeButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

/* loaded from: classes10.dex */
public final class i extends ru.ozon.android.messenger.framework.core.viewmapper.b<EmptyStateDTO, k, MBlockEmptyStateBinding> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<String, EmptyStateDTO> f85102b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function2<EmptyStateDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<k>> f85103c;

    static final class a extends AbstractC7737t implements Function2<EmptyStateDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends k>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f85104b = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final List<? extends k> invoke(EmptyStateDTO emptyStateDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
            EmptyStateDTO state = emptyStateDTO;
            ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(blockId, "blockId");
            String imageUrl = state.getImageUrl();
            return C7714v.a0(new k(blockId, imageUrl == null ? null : imageUrl.equals("errors") ? new n.a(R$drawable.m_message_crack_lighting_m) : new n.b(state.getImageUrl()), state.getTitle(), state.getDescription(), state.getLargeButton(), state.isFullScreen()));
        }
    }

    static final class b extends AbstractC7737t implements Function1<String, EmptyStateDTO> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f85105b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(JsonParser jsonParser) {
            super(1);
            this.f85105b = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final EmptyStateDTO invoke(String str) {
            String state = str;
            Intrinsics.checkNotNullParameter(state, "state");
            return (EmptyStateDTO) this.f85105b.fromJson(state, EmptyStateDTO.class);
        }
    }

    public i(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f85102b = new b(deserializer);
        this.f85103c = a.f85104b;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void b(ViewGroup rootView, MBlockEmptyStateBinding mBlockEmptyStateBinding, ru.ozon.android.messenger.framework.core.d references, k kVar) {
        MBlockEmptyStateBinding binding = mBlockEmptyStateBinding;
        k viewObject = kVar;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        boolean z11 = !(rootView instanceof ConstraintLayout) && Intrinsics.d(viewObject.e(), Boolean.FALSE);
        binding.headerView.backIv.setOnClickListener(new EX.c(rootView, 11));
        TripleBalancedCenterLayout constraintLayout = binding.headerView.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        s.e(constraintLayout, viewObject.e());
        if (z11) {
            ViewGroup h11 = ru.ozon.android.messenger.framework.core.viewmapper.b.h(rootView);
            s.d(h11);
            h11.addView(binding.getConstraintLayout());
            LinearLayout linearLayout = h11 instanceof LinearLayout ? (LinearLayout) h11 : null;
            if (linearLayout != null) {
                linearLayout.setGravity(17);
                return;
            }
            return;
        }
        rootView.addView(binding.getConstraintLayout());
        if (Intrinsics.d(viewObject.e(), Boolean.FALSE) && (rootView instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) rootView;
            int id2 = binding.getConstraintLayout().getId();
            androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
            dVar.p(constraintLayout2);
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            dVar.t(id2, 6, 0, 6, 0);
            ru.ozon.android.messenger.utils.view.a.a(dVar, id2, 0);
            int i11 = R$id.headerContainerLl;
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            dVar.t(id2, 3, i11, 4, 0);
            int i12 = R$id.bottomContainerLl;
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            dVar.t(id2, 4, i12, 3, 0);
            dVar.w(id2, 0);
            dVar.i0(id2);
            dVar.f(constraintLayout2);
        }
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void c(ViewGroup rootView, X4.a aVar, ru.ozon.android.messenger.framework.core.d references, ru.ozon.android.messenger.framework.presentation.models.g gVar) {
        MBlockEmptyStateBinding binding = (MBlockEmptyStateBinding) aVar;
        k viewObject = (k) gVar;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        d.a f7 = ru.ozon.android.messenger.utils.g.f(references.d());
        TextAtomView emptyStateTitleTv = binding.emptyStateTitleTv;
        Intrinsics.checkNotNullExpressionValue(emptyStateTitleTv, "emptyStateTitleTv");
        TextAtomHolderKt.bindOrGone$default(emptyStateTitleTv, viewObject.d(), null, 2, null);
        TextAtomView emptyStateDescriptionTv = binding.emptyStateDescriptionTv;
        Intrinsics.checkNotNullExpressionValue(emptyStateDescriptionTv, "emptyStateDescriptionTv");
        TextAtomHolderKt.bindOrGone$default(emptyStateDescriptionTv, viewObject.a(), null, 2, null);
        LargeButtonView emptyStateBtn = binding.emptyStateBtn;
        Intrinsics.checkNotNullExpressionValue(emptyStateBtn, "emptyStateBtn");
        LargeButtonHolderKt.bindOrGone(emptyStateBtn, viewObject.c(), new h(references));
        ImageView emptyStateIv = binding.emptyStateIv;
        Intrinsics.checkNotNullExpressionValue(emptyStateIv, "emptyStateIv");
        ru.ozon.android.messenger.utils.image.c.d(emptyStateIv, viewObject.b(), f7);
        ImageView emptyStateIv2 = binding.emptyStateIv;
        Intrinsics.checkNotNullExpressionValue(emptyStateIv2, "emptyStateIv");
        s.e(emptyStateIv2, Boolean.valueOf(viewObject.b() != null));
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final boolean canMap(Object obj) {
        if (obj instanceof ru.ozon.android.messenger.framework.presentation.models.e) {
            return ((ru.ozon.android.messenger.framework.presentation.models.e) obj).b() instanceof k;
        }
        if (obj instanceof BlockDTO) {
            long version = ((BlockDTO) obj).getVersion();
            long[] jArr = {1};
            Intrinsics.checkNotNullParameter(jArr, "<this>");
            if (version == Long.valueOf(jArr[0]).longValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function2<EmptyStateDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<k>> getMapper() {
        return this.f85103c;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, EmptyStateDTO> getParser() {
        return this.f85102b;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final long[] getSupportedVersions() {
        return new long[]{1};
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final MBlockEmptyStateBinding j(ViewGroup rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Context context = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        MBlockEmptyStateBinding inflate = MBlockEmptyStateBinding.inflate(ru.ozon.android.messenger.utils.c.c(context), rootView, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void l(ViewGroup rootView, MBlockEmptyStateBinding mBlockEmptyStateBinding, ru.ozon.android.messenger.framework.core.d references) {
        MBlockEmptyStateBinding binding = mBlockEmptyStateBinding;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        rootView.removeView(binding.getConstraintLayout());
        ViewGroup h11 = ru.ozon.android.messenger.framework.core.viewmapper.b.h(rootView);
        FrameLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        if (h11.indexOfChild(constraintLayout) != -1) {
            ru.ozon.android.messenger.framework.core.viewmapper.b.h(rootView).removeView(binding.getConstraintLayout());
            s.a(ru.ozon.android.messenger.framework.core.viewmapper.b.h(rootView));
        }
    }
}
