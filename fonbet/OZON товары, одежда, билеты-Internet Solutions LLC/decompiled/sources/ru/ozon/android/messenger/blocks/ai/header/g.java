package ru.ozon.android.messenger.blocks.ai.header;

import a1.C4912a;
import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.messenger.databinding.MAiNoUiContainerBinding;

/* loaded from: classes10.dex */
public final class g extends ru.ozon.android.messenger.framework.core.viewmapper.b<AiHeaderDTO, ru.ozon.android.messenger.blocks.ai.header.presentation.a, MAiNoUiContainerBinding> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<String, AiHeaderDTO> f84116b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f84117c;

    static final class a extends AbstractC7737t implements Function0<ru.ozon.android.messenger.blocks.ai.header.a> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f84118b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.messenger.blocks.ai.header.a invoke() {
            return new ru.ozon.android.messenger.blocks.ai.header.a();
        }
    }

    static final class b extends AbstractC7737t implements Function1<String, AiHeaderDTO> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f84119b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(JsonParser jsonParser) {
            super(1);
            this.f84119b = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final AiHeaderDTO invoke(String str) {
            String state = str;
            Intrinsics.checkNotNullParameter(state, "state");
            return (AiHeaderDTO) this.f84119b.fromJson(state, AiHeaderDTO.class);
        }
    }

    public g(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f84116b = new b(deserializer);
        this.f84117c = ru.ozon.android.messenger.utils.f.b(a.f84118b);
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void b(ViewGroup rootView, MAiNoUiContainerBinding mAiNoUiContainerBinding, ru.ozon.android.messenger.framework.core.d references, ru.ozon.android.messenger.blocks.ai.header.presentation.a aVar) {
        MAiNoUiContainerBinding binding = mAiNoUiContainerBinding;
        ru.ozon.android.messenger.blocks.ai.header.presentation.a viewObject = aVar;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        ru.ozon.android.messenger.framework.core.viewmapper.b.f(rootView).addView(binding.getConstraintLayout(), 0);
        ComposeView constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = -1;
        constraintLayout.setLayoutParams(layoutParams);
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void c(ViewGroup rootView, X4.a aVar, ru.ozon.android.messenger.framework.core.d references, ru.ozon.android.messenger.framework.presentation.models.g gVar) {
        MAiNoUiContainerBinding binding = (MAiNoUiContainerBinding) aVar;
        ru.ozon.android.messenger.blocks.ai.header.presentation.a viewObject = (ru.ozon.android.messenger.blocks.ai.header.presentation.a) gVar;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        binding.aiNoUiRoot.a(new C4912a(true, 1854852167, new f(viewObject, this, references)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final Function2 getMapper() {
        return (ru.ozon.android.messenger.blocks.ai.header.a) this.f84117c.getValue();
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, AiHeaderDTO> getParser() {
        return this.f84116b;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final MAiNoUiContainerBinding j(ViewGroup rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Context context = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        MAiNoUiContainerBinding inflate = MAiNoUiContainerBinding.inflate(ru.ozon.android.messenger.utils.c.c(context), ru.ozon.android.messenger.framework.core.viewmapper.b.f(rootView), false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void l(ViewGroup rootView, MAiNoUiContainerBinding mAiNoUiContainerBinding, ru.ozon.android.messenger.framework.core.d references) {
        MAiNoUiContainerBinding binding = mAiNoUiContainerBinding;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        ru.ozon.android.messenger.framework.core.viewmapper.b.f(rootView).removeView(binding.getConstraintLayout());
    }
}
