package ru.ozon.android.messenger.blocks.actionButton;

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
import ru.ozon.app.android.messenger.databinding.MChatActionButtonBinding;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;

/* loaded from: classes10.dex */
public final class c extends ru.ozon.android.messenger.framework.core.viewmapper.b<ActionButtonDTO, d, MChatActionButtonBinding> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function1<String, ActionButtonDTO> f83918b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f83919c;

    static final class a extends AbstractC7737t implements Function0<ru.ozon.android.messenger.blocks.actionButton.a> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f83920b = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.messenger.blocks.actionButton.a invoke() {
            return new ru.ozon.android.messenger.blocks.actionButton.a();
        }
    }

    static final class b extends AbstractC7737t implements Function1<String, ActionButtonDTO> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f83921b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(JsonParser jsonParser) {
            super(1);
            this.f83921b = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final ActionButtonDTO invoke(String str) {
            String state = str;
            Intrinsics.checkNotNullParameter(state, "state");
            return (ActionButtonDTO) this.f83921b.fromJson(state, ActionButtonDTO.class);
        }
    }

    public c(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f83918b = new b(deserializer);
        this.f83919c = f.b(a.f83920b);
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void b(ViewGroup rootView, MChatActionButtonBinding mChatActionButtonBinding, ru.ozon.android.messenger.framework.core.d references, d dVar) {
        MChatActionButtonBinding binding = mChatActionButtonBinding;
        d viewObject = dVar;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        ru.ozon.android.messenger.framework.core.viewmapper.b.d(rootView).addView(binding.getConstraintLayout());
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void c(ViewGroup rootView, X4.a aVar, ru.ozon.android.messenger.framework.core.d references, g gVar) {
        MChatActionButtonBinding binding = (MChatActionButtonBinding) aVar;
        d viewObject = (d) gVar;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        IconButtonV3View actionButton = binding.actionButton;
        Intrinsics.checkNotNullExpressionValue(actionButton, "actionButton");
        IconButtonV3HolderKt.bind(actionButton, viewObject.a(), new ru.ozon.android.messenger.blocks.actionButton.b(references));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final Function2 getMapper() {
        return (ru.ozon.android.messenger.blocks.actionButton.a) this.f83919c.getValue();
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, ActionButtonDTO> getParser() {
        return this.f83918b;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final MChatActionButtonBinding j(ViewGroup rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Context context = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        MChatActionButtonBinding inflate = MChatActionButtonBinding.inflate(ru.ozon.android.messenger.utils.c.c(context), ru.ozon.android.messenger.framework.core.viewmapper.b.d(rootView), false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void l(ViewGroup rootView, MChatActionButtonBinding mChatActionButtonBinding, ru.ozon.android.messenger.framework.core.d references) {
        MChatActionButtonBinding binding = mChatActionButtonBinding;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        ru.ozon.android.messenger.framework.core.viewmapper.b.d(rootView).removeView(binding.getConstraintLayout());
    }
}
