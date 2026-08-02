package ru.ozon.android.messenger.blocks.chatlistheader.search;

import a1.C4912a;
import android.content.Context;
import android.view.ViewGroup;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.blocks.chatlistheader.ChatListHeaderDTO;
import ru.ozon.android.messenger.blocks.chatlistheader.f;
import ru.ozon.android.messenger.framework.core.initialization.d;
import ru.ozon.android.messenger.framework.data.remote.models.blocks.BlockDTO;
import ru.ozon.app.android.messenger.databinding.MChatListHeaderSearchBinding;

/* renamed from: ru.ozon.android.messenger.blocks.chatlistheader.search.g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9327g extends ru.ozon.android.messenger.framework.core.viewmapper.b<ChatListHeaderDTO, ru.ozon.android.messenger.blocks.chatlistheader.f, MChatListHeaderSearchBinding> {

    /* renamed from: b, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.logger.b f84806b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<String, ChatListHeaderDTO> f84807c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Object f84808d;

    /* renamed from: ru.ozon.android.messenger.blocks.chatlistheader.search.g$a */
    static final class a extends AbstractC7737t implements Function0<ru.ozon.android.messenger.blocks.chatlistheader.c> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ d.b f84809b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(d.b bVar) {
            super(0);
            this.f84809b = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ru.ozon.android.messenger.blocks.chatlistheader.c invoke() {
            return new ru.ozon.android.messenger.blocks.chatlistheader.c(this.f84809b);
        }
    }

    /* renamed from: ru.ozon.android.messenger.blocks.chatlistheader.search.g$b */
    static final class b extends AbstractC7737t implements Function1<String, ChatListHeaderDTO> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f84810b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(JsonParser jsonParser) {
            super(1);
            this.f84810b = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final ChatListHeaderDTO invoke(String str) {
            String state = str;
            Intrinsics.checkNotNullParameter(state, "state");
            return (ChatListHeaderDTO) this.f84810b.fromJson(state, ChatListHeaderDTO.class);
        }
    }

    public C9327g(@NotNull JsonParser deserializer, @NotNull d.b blockCustomSettings, ru.ozon.android.messenger.framework.logger.b bVar) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(blockCustomSettings, "blockCustomSettings");
        this.f84806b = bVar;
        this.f84807c = new b(deserializer);
        this.f84808d = ru.ozon.android.messenger.utils.f.b(new a(blockCustomSettings));
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void b(ViewGroup rootView, MChatListHeaderSearchBinding mChatListHeaderSearchBinding, ru.ozon.android.messenger.framework.core.d references, ru.ozon.android.messenger.blocks.chatlistheader.f fVar) {
        MChatListHeaderSearchBinding binding = mChatListHeaderSearchBinding;
        ru.ozon.android.messenger.blocks.chatlistheader.f viewObject = fVar;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        ru.ozon.android.messenger.framework.core.viewmapper.b.f(rootView).addView(binding.getConstraintLayout(), 0);
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void c(ViewGroup rootView, X4.a aVar, ru.ozon.android.messenger.framework.core.d references, ru.ozon.android.messenger.framework.presentation.models.g gVar) {
        MChatListHeaderSearchBinding binding = (MChatListHeaderSearchBinding) aVar;
        ru.ozon.android.messenger.blocks.chatlistheader.f viewObject = (ru.ozon.android.messenger.blocks.chatlistheader.f) gVar;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        if (!(viewObject.d() instanceof f.c.a)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        binding.chatListHeaderRoot.a(new C4912a(true, 1289427213, new C9326f(viewObject, ((f.c.a) viewObject.d()).l() ? 0 : 16, references)));
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final boolean canMap(Object obj) {
        if (obj instanceof BlockDTO) {
            try {
                return ((ChatListHeaderDTO) ((b) this.f84807c).invoke(((BlockDTO) obj).getState())).getMainItem().getSearchBar() != null;
            } catch (Throwable th2) {
                ru.ozon.android.messenger.framework.logger.b bVar = this.f84806b;
                if (bVar != null) {
                    bVar.log(th2);
                }
                return false;
            }
        }
        if (obj instanceof ru.ozon.android.messenger.framework.presentation.models.e) {
            ru.ozon.android.messenger.framework.presentation.models.e eVar = (ru.ozon.android.messenger.framework.presentation.models.e) obj;
            if ((eVar.b() instanceof ru.ozon.android.messenger.blocks.chatlistheader.f) && (((ru.ozon.android.messenger.blocks.chatlistheader.f) eVar.b()).d() instanceof f.c.a)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final Function2 getMapper() {
        return (ru.ozon.android.messenger.blocks.chatlistheader.c) this.f84808d.getValue();
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, ChatListHeaderDTO> getParser() {
        return this.f84807c;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final MChatListHeaderSearchBinding j(ViewGroup rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Context context = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        MChatListHeaderSearchBinding inflate = MChatListHeaderSearchBinding.inflate(ru.ozon.android.messenger.utils.c.c(context), ru.ozon.android.messenger.framework.core.viewmapper.b.f(rootView), false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void l(ViewGroup rootView, MChatListHeaderSearchBinding mChatListHeaderSearchBinding, ru.ozon.android.messenger.framework.core.d references) {
        MChatListHeaderSearchBinding binding = mChatListHeaderSearchBinding;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        ru.ozon.android.messenger.framework.core.viewmapper.b.f(rootView).removeView(binding.getConstraintLayout());
    }
}
