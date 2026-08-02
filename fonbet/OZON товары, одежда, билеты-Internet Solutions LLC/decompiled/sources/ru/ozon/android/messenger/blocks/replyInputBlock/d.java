package ru.ozon.android.messenger.blocks.replyInputBlock;

import a1.C4912a;
import android.content.Context;
import android.view.ViewGroup;
import java.util.List;
import kd.C7665d;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import ru.ozon.android.messenger.framework.presentation.models.g;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.databinding.MViewReplyInputBlockBinding;

/* loaded from: classes10.dex */
public final class d extends ru.ozon.android.messenger.framework.core.viewmapper.b<ReplyInputBlockDTO, e, MViewReplyInputBlockBinding> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final K f86344b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<String, ReplyInputBlockDTO> f86345c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function2<ReplyInputBlockDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<e>> f86346d;

    static final class a extends AbstractC7737t implements Function2<ReplyInputBlockDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends e>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f86347b = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final List<? extends e> invoke(ReplyInputBlockDTO replyInputBlockDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
            ReplyInputBlockDTO state = replyInputBlockDTO;
            ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(blockId, "blockId");
            return C7714v.a0(new e(blockId, state));
        }
    }

    static final class b extends AbstractC7737t implements Function1<String, ReplyInputBlockDTO> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f86348b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(JsonParser jsonParser) {
            super(1);
            this.f86348b = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final ReplyInputBlockDTO invoke(String str) {
            String state = str;
            Intrinsics.checkNotNullParameter(state, "state");
            return (ReplyInputBlockDTO) this.f86348b.fromJson(state, ReplyInputBlockDTO.class);
        }
    }

    public d(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f86344b = K.f71697a;
        this.f86345c = new b(deserializer);
        this.f86346d = a.f86347b;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void b(ViewGroup rootView, MViewReplyInputBlockBinding mViewReplyInputBlockBinding, ru.ozon.android.messenger.framework.core.d references, e eVar) {
        Object obj;
        MViewReplyInputBlockBinding binding = mViewReplyInputBlockBinding;
        e viewObject = eVar;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        ViewGroup e11 = ru.ozon.android.messenger.framework.core.viewmapper.b.e(rootView);
        C7665d it = h.o(0, e11.getChildCount()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            int id2 = e11.getChildAt(((Number) obj).intValue()).getId();
            if (id2 == R$id.attachmentRv || id2 == R$id.inputCl) {
                break;
            }
        }
        Integer num = (Integer) obj;
        e11.addView(binding.getConstraintLayout(), num != null ? num.intValue() : e11.getChildCount());
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void c(ViewGroup rootView, X4.a aVar, ru.ozon.android.messenger.framework.core.d references, g gVar) {
        MViewReplyInputBlockBinding binding = (MViewReplyInputBlockBinding) aVar;
        e viewObject = (e) gVar;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        binding.replyInputBlockComposeView.a(new C4912a(true, -900885349, new c(viewObject, references)));
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function2<ReplyInputBlockDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<e>> getMapper() {
        return this.f86346d;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, ReplyInputBlockDTO> getParser() {
        return this.f86345c;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final List<Class<? extends d.w.a>> getSupportedUpdateKeys() {
        return this.f86344b;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final MViewReplyInputBlockBinding j(ViewGroup rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Context context = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        MViewReplyInputBlockBinding inflate = MViewReplyInputBlockBinding.inflate(ru.ozon.android.messenger.utils.c.c(context), ru.ozon.android.messenger.framework.core.viewmapper.b.e(rootView), false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void l(ViewGroup rootView, MViewReplyInputBlockBinding mViewReplyInputBlockBinding, ru.ozon.android.messenger.framework.core.d references) {
        MViewReplyInputBlockBinding binding = mViewReplyInputBlockBinding;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        ru.ozon.android.messenger.framework.core.viewmapper.b.e(rootView).removeView(binding.getConstraintLayout());
    }
}
