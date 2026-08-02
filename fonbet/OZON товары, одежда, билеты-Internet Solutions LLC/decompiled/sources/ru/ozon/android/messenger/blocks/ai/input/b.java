package ru.ozon.android.messenger.blocks.ai.input;

import C.o0;
import a1.C4912a;
import android.content.Context;
import android.view.ViewGroup;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.blocks.ai.input.data.AiInputDTO;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.android.messenger.utils.f;
import ru.ozon.app.android.messenger.databinding.MAiNoUiContainerBinding;

/* loaded from: classes10.dex */
public final class b extends ru.ozon.android.messenger.framework.core.viewmapper.b<AiInputDTO, ru.ozon.android.messenger.blocks.ai.input.presentation.a, MAiNoUiContainerBinding> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<String, AiInputDTO> f84185b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f84186c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<Class<? extends d.w.a>> f84187d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function2<d.w.a, ru.ozon.android.messenger.blocks.ai.input.presentation.a, ru.ozon.android.messenger.blocks.ai.input.presentation.a> f84188e;

    public static final class a implements d.w.a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ru.ozon.android.messenger.blocks.ai.input.data.a f84189a;

        public a(@NotNull ru.ozon.android.messenger.blocks.ai.input.data.a mode) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.f84189a = mode;
        }

        @NotNull
        public final ru.ozon.android.messenger.blocks.ai.input.data.a a() {
            return this.f84189a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f84189a == ((a) obj).f84189a;
        }

        public final int hashCode() {
            return this.f84189a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "AiAssistantModeUpdate(mode=" + this.f84189a + ")";
        }
    }

    /* renamed from: ru.ozon.android.messenger.blocks.ai.input.b$b, reason: collision with other inner class name */
    public static final class C1460b implements d.w.a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f84190a;

        public C1460b(@NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.f84190a = text;
        }

        @NotNull
        public final String a() {
            return this.f84190a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1460b) && Intrinsics.d(this.f84190a, ((C1460b) obj).f84190a);
        }

        public final int hashCode() {
            return this.f84190a.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("AiAssistantTextUpdate(text="), this.f84190a, ")");
        }
    }

    static final class c extends AbstractC7737t implements Function0<ru.ozon.android.messenger.blocks.ai.input.a> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f84191b = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.messenger.blocks.ai.input.a invoke() {
            return new ru.ozon.android.messenger.blocks.ai.input.a();
        }
    }

    static final class d extends AbstractC7737t implements Function1<String, AiInputDTO> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f84192b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(JsonParser jsonParser) {
            super(1);
            this.f84192b = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final AiInputDTO invoke(String str) {
            String state = str;
            Intrinsics.checkNotNullParameter(state, "state");
            return (AiInputDTO) this.f84192b.fromJson(state, AiInputDTO.class);
        }
    }

    static final class e extends AbstractC7737t implements Function2<d.w.a, ru.ozon.android.messenger.blocks.ai.input.presentation.a, ru.ozon.android.messenger.blocks.ai.input.presentation.a> {

        /* renamed from: b, reason: collision with root package name */
        public static final e f84193b = new e(2);

        @Override // kotlin.jvm.functions.Function2
        public final ru.ozon.android.messenger.blocks.ai.input.presentation.a invoke(d.w.a aVar, ru.ozon.android.messenger.blocks.ai.input.presentation.a aVar2) {
            d.w.a update = aVar;
            ru.ozon.android.messenger.blocks.ai.input.presentation.a vo = aVar2;
            Intrinsics.checkNotNullParameter(update, "update");
            Intrinsics.checkNotNullParameter(vo, "vo");
            String str = null;
            if (!(update instanceof a)) {
                return update instanceof C1460b ? ru.ozon.android.messenger.blocks.ai.input.presentation.a.a(vo, ((C1460b) update).a(), null, 509) : vo;
            }
            a aVar3 = (a) update;
            if (aVar3.a() != ru.ozon.android.messenger.blocks.ai.input.data.a.AI_INPUT_MODE_PROCESSING && aVar3.a() != ru.ozon.android.messenger.blocks.ai.input.data.a.AI_INPUT_MODE_PROCESSING_EMPTY) {
                str = vo.h();
            }
            return ru.ozon.android.messenger.blocks.ai.input.presentation.a.a(vo, str, aVar3.a(), 477);
        }
    }

    public b(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f84185b = new d(deserializer);
        this.f84186c = f.b(c.f84191b);
        this.f84187d = C7714v.b0(a.class, C1460b.class);
        this.f84188e = e.f84193b;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void b(ViewGroup rootView, MAiNoUiContainerBinding mAiNoUiContainerBinding, ru.ozon.android.messenger.framework.core.d references, ru.ozon.android.messenger.blocks.ai.input.presentation.a aVar) {
        MAiNoUiContainerBinding binding = mAiNoUiContainerBinding;
        ru.ozon.android.messenger.blocks.ai.input.presentation.a viewObject = aVar;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        ru.ozon.android.messenger.framework.core.viewmapper.b.e(rootView).addView(binding.getConstraintLayout(), 0);
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void c(ViewGroup rootView, X4.a aVar, ru.ozon.android.messenger.framework.core.d references, g gVar) {
        MAiNoUiContainerBinding binding = (MAiNoUiContainerBinding) aVar;
        ru.ozon.android.messenger.blocks.ai.input.presentation.a viewObject = (ru.ozon.android.messenger.blocks.ai.input.presentation.a) gVar;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        binding.aiNoUiRoot.a(new C4912a(true, 337813449, new ru.ozon.android.messenger.blocks.ai.input.e(references, viewObject)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final Function2 getMapper() {
        return (ru.ozon.android.messenger.blocks.ai.input.a) this.f84186c.getValue();
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, AiInputDTO> getParser() {
        return this.f84185b;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final List<Class<? extends d.w.a>> getSupportedUpdateKeys() {
        return this.f84187d;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function2<d.w.a, ru.ozon.android.messenger.blocks.ai.input.presentation.a, ru.ozon.android.messenger.blocks.ai.input.presentation.a> getUpdateConsumer() {
        return this.f84188e;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final MAiNoUiContainerBinding j(ViewGroup rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Context context = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        MAiNoUiContainerBinding inflate = MAiNoUiContainerBinding.inflate(ru.ozon.android.messenger.utils.c.c(context), ru.ozon.android.messenger.framework.core.viewmapper.b.e(rootView), false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void l(ViewGroup rootView, MAiNoUiContainerBinding mAiNoUiContainerBinding, ru.ozon.android.messenger.framework.core.d references) {
        MAiNoUiContainerBinding binding = mAiNoUiContainerBinding;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        ru.ozon.android.messenger.framework.core.viewmapper.b.e(rootView).removeView(binding.getConstraintLayout());
    }
}
