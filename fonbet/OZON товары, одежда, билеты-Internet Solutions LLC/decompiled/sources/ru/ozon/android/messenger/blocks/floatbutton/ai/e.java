package ru.ozon.android.messenger.blocks.floatbutton.ai;

import a1.C4912a;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.databinding.MFloatButtonBinding;

/* loaded from: classes10.dex */
public final class e extends ru.ozon.android.messenger.framework.core.viewmapper.b<AiFloatingButtonDTO, g, MFloatButtonBinding> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<String, AiFloatingButtonDTO> f85165b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f85166c;

    static final class a extends AbstractC7737t implements Function0<ru.ozon.android.messenger.blocks.floatbutton.ai.a> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f85167b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.messenger.blocks.floatbutton.ai.a invoke() {
            return new ru.ozon.android.messenger.blocks.floatbutton.ai.a();
        }
    }

    static final class b extends AbstractC7737t implements Function1<String, AiFloatingButtonDTO> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f85168b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(JsonParser jsonParser) {
            super(1);
            this.f85168b = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final AiFloatingButtonDTO invoke(String str) {
            String state = str;
            Intrinsics.checkNotNullParameter(state, "state");
            return (AiFloatingButtonDTO) this.f85168b.fromJson(state, AiFloatingButtonDTO.class);
        }
    }

    public e(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f85165b = new b(deserializer);
        this.f85166c = ru.ozon.android.messenger.utils.f.b(a.f85167b);
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void b(ViewGroup rootView, MFloatButtonBinding mFloatButtonBinding, ru.ozon.android.messenger.framework.core.d references, g gVar) {
        MFloatButtonBinding binding = mFloatButtonBinding;
        g viewObject = gVar;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        View findViewById = rootView.findViewById(R$id.scrollButtonContainer);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ((ViewGroup) findViewById).addView(binding.getConstraintLayout());
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void c(ViewGroup rootView, X4.a aVar, ru.ozon.android.messenger.framework.core.d references, ru.ozon.android.messenger.framework.presentation.models.g gVar) {
        MFloatButtonBinding binding = (MFloatButtonBinding) aVar;
        g viewObject = (g) gVar;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        binding.floatButtonRoot.a(new C4912a(true, -331871223, new d(viewObject, references)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final Function2 getMapper() {
        return (ru.ozon.android.messenger.blocks.floatbutton.ai.a) this.f85166c.getValue();
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, AiFloatingButtonDTO> getParser() {
        return this.f85165b;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final MFloatButtonBinding j(ViewGroup rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Context context = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        LayoutInflater c11 = ru.ozon.android.messenger.utils.c.c(context);
        View findViewById = rootView.findViewById(R$id.scrollButtonContainer);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        MFloatButtonBinding inflate = MFloatButtonBinding.inflate(c11, (ViewGroup) findViewById, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void l(ViewGroup rootView, MFloatButtonBinding mFloatButtonBinding, ru.ozon.android.messenger.framework.core.d references) {
        MFloatButtonBinding binding = mFloatButtonBinding;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        View findViewById = rootView.findViewById(R$id.scrollButtonContainer);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ((ViewGroup) findViewById).removeView(binding.getConstraintLayout());
    }
}
