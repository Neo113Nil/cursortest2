package ru.ozon.android.messenger.blocks.floatbutton;

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
public final class e extends ru.ozon.android.messenger.framework.core.viewmapper.b<FloatButtonDTO, f, MFloatButtonBinding> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<String, FloatButtonDTO> f85212b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f85213c;

    static final class a extends AbstractC7737t implements Function0<ru.ozon.android.messenger.blocks.floatbutton.a> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f85214b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.messenger.blocks.floatbutton.a invoke() {
            return new ru.ozon.android.messenger.blocks.floatbutton.a();
        }
    }

    static final class b extends AbstractC7737t implements Function1<String, FloatButtonDTO> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f85215b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(JsonParser jsonParser) {
            super(1);
            this.f85215b = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final FloatButtonDTO invoke(String str) {
            String state = str;
            Intrinsics.checkNotNullParameter(state, "state");
            return (FloatButtonDTO) this.f85215b.fromJson(state, FloatButtonDTO.class);
        }
    }

    public e(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f85212b = new b(deserializer);
        this.f85213c = ru.ozon.android.messenger.utils.f.b(a.f85214b);
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void b(ViewGroup rootView, MFloatButtonBinding mFloatButtonBinding, ru.ozon.android.messenger.framework.core.d references, f fVar) {
        MFloatButtonBinding binding = mFloatButtonBinding;
        f viewObject = fVar;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        View findViewById = rootView.findViewById(R$id.floatButtonContainer);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ((ViewGroup) findViewById).addView(binding.getConstraintLayout());
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void c(ViewGroup rootView, X4.a aVar, ru.ozon.android.messenger.framework.core.d references, ru.ozon.android.messenger.framework.presentation.models.g gVar) {
        MFloatButtonBinding binding = (MFloatButtonBinding) aVar;
        f viewObject = (f) gVar;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        binding.floatButtonRoot.a(new C4912a(true, -1396543671, new d(viewObject, references)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final Function2 getMapper() {
        return (ru.ozon.android.messenger.blocks.floatbutton.a) this.f85213c.getValue();
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, FloatButtonDTO> getParser() {
        return this.f85212b;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final MFloatButtonBinding j(ViewGroup rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Context context = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        LayoutInflater c11 = ru.ozon.android.messenger.utils.c.c(context);
        View findViewById = rootView.findViewById(R$id.floatButtonContainer);
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
        View findViewById = rootView.findViewById(R$id.floatButtonContainer);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ((ViewGroup) findViewById).removeView(binding.getConstraintLayout());
    }
}
