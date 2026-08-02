package ru.ozon.android.messenger.blocks.input;

import C.o0;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.z0;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.blocks.input.e;
import ru.ozon.android.messenger.blocks.input.viewdelegates.n;
import ru.ozon.android.messenger.blocks.input.viewmodel.h;
import ru.ozon.android.messenger.framework.data.remote.models.ActionCurtainDTO;
import ru.ozon.android.messenger.framework.navigation.controller.d;
import ru.ozon.android.messenger.framework.presentation.models.C9514a;
import ru.ozon.android.messenger.utils.g;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.messenger.databinding.MViewChatInputBinding;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

/* loaded from: classes10.dex */
public final class c extends ru.ozon.android.messenger.framework.core.viewmapper.b<InputDTO, ru.ozon.android.messenger.blocks.input.d, MViewChatInputBinding> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.composer.navigation.router.a f85501b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<Class<? extends d.w.a>> f85502c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<String, InputDTO> f85503d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function2<InputDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<ru.ozon.android.messenger.blocks.input.d>> f85504e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Function2<d.w.a, ru.ozon.android.messenger.blocks.input.d, ru.ozon.android.messenger.blocks.input.d> f85505f;

    /* renamed from: g, reason: collision with root package name */
    private ru.ozon.android.messenger.blocks.input.viewdelegates.f f85506g;

    public static final class a implements d.w.a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f85507a = new a();

        private a() {
        }
    }

    public static final class b implements d.w.a {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(false);
        }

        @NotNull
        public final String toString() {
            return "UpdateFocusEvent(isFocused=false)";
        }
    }

    /* renamed from: ru.ozon.android.messenger.blocks.input.c$c, reason: collision with other inner class name */
    public static final class C1504c implements d.w.a {

        /* renamed from: a, reason: collision with root package name */
        private final String f85508a;

        public C1504c(String str) {
            this.f85508a = str;
        }

        public final String a() {
            return this.f85508a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1504c) && Intrinsics.d(this.f85508a, ((C1504c) obj).f85508a);
        }

        public final int hashCode() {
            String str = this.f85508a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("UpdateInputEvent(message="), this.f85508a, ")");
        }
    }

    static final class d extends AbstractC7737t implements Function2<InputDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends ru.ozon.android.messenger.blocks.input.d>> {
        d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final List<? extends ru.ozon.android.messenger.blocks.input.d> invoke(InputDTO inputDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
            C9514a c9514a;
            InputDTO state = inputDTO;
            ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(blockId, "blockId");
            Boolean isDisabled = state.isDisabled();
            boolean booleanValue = isDisabled != null ? isDisabled.booleanValue() : false;
            String text = state.getText();
            String chatId = state.getChatId();
            String placeholder = state.getPlaceholder();
            Map<String, String> lexemes = state.getLexemes();
            ConfigDTO config = state.getConfig();
            c.this.getClass();
            ru.ozon.android.messenger.blocks.input.a aVar = new ru.ozon.android.messenger.blocks.input.a(config.getAcceptedMimeTypes(), config.getMaxFileSize(), config.getMaxFilesCount(), config.getUploadUrl());
            List<CustomBlockDTO> customBlocks = state.getCustomBlocks();
            ru.ozon.android.messenger.blocks.input.e eVar = null;
            CustomBlockDTO customBlockDTO = customBlocks != null ? (CustomBlockDTO) C7714v.M(customBlocks) : null;
            ActionCurtainDTO actionCurtain = state.getActionCurtain();
            if (actionCurtain != null) {
                Intrinsics.checkNotNullParameter(actionCurtain, "<this>");
                c9514a = new C9514a(actionCurtain.getTitle(), actionCurtain.getCells(), actionCurtain.getButtons());
            } else {
                c9514a = null;
            }
            List<SendButtonModeDTO> sendButtonModes = state.getSendButtonModes();
            if (sendButtonModes == null) {
                sendButtonModes = C7714v.a0(new SendButtonModeDTO("DEFAULT", new IconButtonV3DTO(IconButtonV3DTO.Sizes.SIZE_500, ButtonV3DTO.StyleTypes.CUSTOM, IconButtonV3DTO.IconButtonShape.SHAPE_SQUARE, "ic_m_send_filled", null, "graphicActionPrimary", "clearLightKey0", new CommonControlSettings(new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, null, "sendChatMessage", null, 10, null), null, null, 6, null), null, null, null, null, null, null, 16144, null)));
            }
            String currentModeName = state.getCurrentModeName();
            boolean d11 = Intrinsics.d(currentModeName, "DEFAULT");
            ru.ozon.android.messenger.blocks.input.e eVar2 = e.a.f85533a;
            if (d11) {
                eVar = eVar2;
            } else if (Intrinsics.d(currentModeName, "EDIT")) {
                eVar = e.b.f85534a;
            } else if (Intrinsics.d(currentModeName, "REPLY")) {
                eVar = e.c.f85535a;
            }
            return C7714v.a0(new ru.ozon.android.messenger.blocks.input.d(blockId, booleanValue, placeholder, chatId, text, lexemes, aVar, customBlockDTO, c9514a, sendButtonModes, eVar == null ? eVar2 : eVar, false, null));
        }
    }

    static final class e extends AbstractC7737t implements Function1<String, InputDTO> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f85510b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(JsonParser jsonParser) {
            super(1);
            this.f85510b = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final InputDTO invoke(String str) {
            String state = str;
            Intrinsics.checkNotNullParameter(state, "state");
            return (InputDTO) this.f85510b.fromJson(state, InputDTO.class);
        }
    }

    static final class f extends AbstractC7737t implements Function2<d.w.a, ru.ozon.android.messenger.blocks.input.d, ru.ozon.android.messenger.blocks.input.d> {

        /* renamed from: b, reason: collision with root package name */
        public static final f f85511b = new f(2);

        @Override // kotlin.jvm.functions.Function2
        public final ru.ozon.android.messenger.blocks.input.d invoke(d.w.a aVar, ru.ozon.android.messenger.blocks.input.d dVar) {
            String k11;
            d.w.a update = aVar;
            ru.ozon.android.messenger.blocks.input.d oldVO = dVar;
            Intrinsics.checkNotNullParameter(update, "update");
            Intrinsics.checkNotNullParameter(oldVO, "oldVO");
            return ((update instanceof C1504c) && ((k11 = oldVO.k()) == null || k11.length() == 0)) ? ru.ozon.android.messenger.blocks.input.d.a(oldVO, ((C1504c) update).a(), null, null, false, null, 8175) : update instanceof a ? ru.ozon.android.messenger.blocks.input.d.a(oldVO, "", null, null, false, null, 8047) : oldVO;
        }
    }

    public c(@NotNull JsonParser deserializer, @NotNull ru.ozon.android.messenger.framework.composer.navigation.router.a composerScreenRouter) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(composerScreenRouter, "composerScreenRouter");
        this.f85501b = composerScreenRouter;
        this.f85502c = C7714v.b0(C1504c.class, b.class, a.class);
        this.f85503d = new e(deserializer);
        this.f85504e = new d();
        this.f85505f = f.f85511b;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void b(ViewGroup rootView, MViewChatInputBinding mViewChatInputBinding, ru.ozon.android.messenger.framework.core.d references, ru.ozon.android.messenger.blocks.input.d dVar) {
        MViewChatInputBinding binding = mViewChatInputBinding;
        ru.ozon.android.messenger.blocks.input.d viewObject = dVar;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        ViewGroup e11 = ru.ozon.android.messenger.framework.core.viewmapper.b.e(rootView);
        ru.ozon.android.messenger.blocks.input.viewdelegates.f fVar = new ru.ozon.android.messenger.blocks.input.viewdelegates.f((h) new z0(references.d(), new ru.ozon.android.messenger.blocks.input.di.c(g.d(references.d()))).a(h.class), new n(references.c(), new ru.ozon.android.messenger.framework.navigation.d(this.f85501b)), references);
        this.f85506g = fVar;
        fVar.a(e11, binding, viewObject);
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void c(ViewGroup rootView, X4.a aVar, ru.ozon.android.messenger.framework.core.d references, ru.ozon.android.messenger.framework.presentation.models.g gVar) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        MViewChatInputBinding binding = (MViewChatInputBinding) aVar;
        ru.ozon.android.messenger.blocks.input.d viewObject = (ru.ozon.android.messenger.blocks.input.d) gVar;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        ru.ozon.android.messenger.blocks.input.viewdelegates.f fVar = this.f85506g;
        if (fVar != null) {
            fVar.b(binding, references, viewObject);
        }
        CustomBlockDTO f7 = viewObject.f();
        if (f7 == null || (trackingInfo = f7.getTrackingInfo()) == null) {
            return;
        }
        references.c().s(ru.ozon.android.messenger.framework.analytics.h.a(trackingInfo));
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function2<InputDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<ru.ozon.android.messenger.blocks.input.d>> getMapper() {
        return this.f85504e;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, InputDTO> getParser() {
        return this.f85503d;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final List<Class<? extends d.w.a>> getSupportedUpdateKeys() {
        return this.f85502c;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function2<d.w.a, ru.ozon.android.messenger.blocks.input.d, ru.ozon.android.messenger.blocks.input.d> getUpdateConsumer() {
        return this.f85505f;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final MViewChatInputBinding j(ViewGroup rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Context context = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        MViewChatInputBinding inflate = MViewChatInputBinding.inflate(ru.ozon.android.messenger.utils.c.c(context), ru.ozon.android.messenger.framework.core.viewmapper.b.e(rootView), false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void l(ViewGroup rootView, MViewChatInputBinding mViewChatInputBinding, ru.ozon.android.messenger.framework.core.d references) {
        MViewChatInputBinding binding = mViewChatInputBinding;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        ru.ozon.android.messenger.blocks.input.viewdelegates.f fVar = this.f85506g;
        if (fVar != null) {
            fVar.c(ru.ozon.android.messenger.framework.core.viewmapper.b.e(rootView), binding);
        }
        this.f85506g = null;
    }
}
