package ru.ozon.android.messenger.blocks.curtain;

import android.content.Context;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.android.messenger.utils.f;
import ru.ozon.app.android.messenger.databinding.MBlockStubBinding;

/* loaded from: classes10.dex */
public final class d extends ru.ozon.android.messenger.framework.core.viewmapper.b<CurtainModalWrapperDTO, c, MBlockStubBinding> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<String, CurtainModalWrapperDTO> f84978b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f84979c;

    static final class a extends AbstractC7737t implements Function0<ru.ozon.android.messenger.blocks.curtain.b> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f84980b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.messenger.blocks.curtain.b invoke() {
            return new ru.ozon.android.messenger.blocks.curtain.b();
        }
    }

    static final class b extends AbstractC7737t implements Function1<String, CurtainModalWrapperDTO> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f84981b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(JsonParser jsonParser) {
            super(1);
            this.f84981b = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final CurtainModalWrapperDTO invoke(String str) {
            String state = str;
            Intrinsics.checkNotNullParameter(state, "state");
            return (CurtainModalWrapperDTO) this.f84981b.fromJson(state, CurtainModalWrapperDTO.class);
        }
    }

    public d(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f84978b = new b(deserializer);
        this.f84979c = f.b(a.f84980b);
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void b(ViewGroup rootView, MBlockStubBinding mBlockStubBinding, ru.ozon.android.messenger.framework.core.d references, c cVar) {
        MBlockStubBinding binding = mBlockStubBinding;
        c viewObject = cVar;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void c(ViewGroup rootView, X4.a aVar, ru.ozon.android.messenger.framework.core.d references, g gVar) {
        MBlockStubBinding binding = (MBlockStubBinding) aVar;
        c viewObject = (c) gVar;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final Function2 getMapper() {
        return (ru.ozon.android.messenger.blocks.curtain.b) this.f84979c.getValue();
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, CurtainModalWrapperDTO> getParser() {
        return this.f84978b;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final MBlockStubBinding j(ViewGroup rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Context context = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        MBlockStubBinding inflate = MBlockStubBinding.inflate(ru.ozon.android.messenger.utils.c.c(context), ru.ozon.android.messenger.framework.core.viewmapper.b.e(rootView), false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void l(ViewGroup rootView, MBlockStubBinding mBlockStubBinding, ru.ozon.android.messenger.framework.core.d references) {
        MBlockStubBinding binding = mBlockStubBinding;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
    }
}
