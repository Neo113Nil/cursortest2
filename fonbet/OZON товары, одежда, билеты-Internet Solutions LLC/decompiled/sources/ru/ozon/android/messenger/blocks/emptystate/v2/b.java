package ru.ozon.android.messenger.blocks.emptystate.v2;

import B0.C2454a;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.blocks.emptystate.g;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.core.initialization.newinit.d;
import ru.ozon.android.messenger.framework.presentation.models.n;
import ru.ozon.android.messenger.utils.view.s;
import ru.ozon.app.android.messenger.R$drawable;
import ru.ozon.app.android.messenger.databinding.MBlockEmptyStateV2Binding;
import ru.ozon.tracker.model.EventEntity;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.tracker.sendEvent.Cell;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

/* loaded from: classes10.dex */
public abstract class b extends ru.ozon.android.messenger.framework.core.viewmapper.b<EmptyStateV2DTO, g, MBlockEmptyStateV2Binding> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final JsonParser f85112b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function1<String, EmptyStateV2DTO> f85113c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function2<EmptyStateV2DTO, ru.ozon.android.messenger.framework.presentation.models.c, List<g>> f85114d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ArrayList f85115e;

    static final class a extends AbstractC7737t implements Function2<EmptyStateV2DTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends g>> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f85116b = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final List<? extends g> invoke(EmptyStateV2DTO emptyStateV2DTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
            EmptyStateV2DTO state = emptyStateV2DTO;
            ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(blockId, "blockId");
            ImageDTO image = state.getImage();
            n.a aVar = Intrinsics.d(state.getImage().getImage(), "errors") ? new n.a(R$drawable.m_message_crack_lighting_m) : null;
            TextDTO title = state.getTitle();
            TextDTO description = state.getDescription();
            List<ButtonV3DTO> buttons = state.getButtons();
            ru.ozon.android.messenger.blocks.emptystate.v2.a buttonLayout = state.getButtonLayout();
            if (buttonLayout == null) {
                buttonLayout = ru.ozon.android.messenger.blocks.emptystate.v2.a.HORIZONTAL;
            }
            return C7714v.a0(new g(blockId, image, aVar, title, description, Boolean.valueOf(state.isFullScreen()), buttons, buttonLayout, state.getTrackingInfo(), null, 2208));
        }
    }

    /* renamed from: ru.ozon.android.messenger.blocks.emptystate.v2.b$b, reason: collision with other inner class name */
    static final class C1495b extends AbstractC7737t implements Function1<String, EmptyStateV2DTO> {
        C1495b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final EmptyStateV2DTO invoke(String str) {
            String state = str;
            Intrinsics.checkNotNullParameter(state, "state");
            return (EmptyStateV2DTO) b.this.f85112b.fromJson(state, EmptyStateV2DTO.class);
        }
    }

    public b(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f85112b = deserializer;
        this.f85113c = new C1495b();
        this.f85114d = a.f85116b;
        this.f85115e = new ArrayList();
    }

    private static ru.ozon.android.messenger.framework.analytics.d p(ActionType actionType, String str) {
        return new ru.ozon.android.messenger.framework.analytics.d(actionType, new EventEntity.Obj("button", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147483646, null), new EventEntity.Properties(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, "search_ai_assistant_error_no_chat", null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, 16381, null), new Cell.CustomCell(C2454a.b("dimension1", str == null ? "null" : str)));
    }

    protected static void q(@NotNull ru.ozon.android.messenger.framework.core.d references, @NotNull g viewObject, @NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(action, "action");
        if ((viewObject.c() instanceof g.a) && (action instanceof AtomAction.Refresh)) {
            references.c().k(p(ActionType.CLICK.INSTANCE, ((g.a) viewObject.c()).a()));
        }
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void b(ViewGroup rootView, MBlockEmptyStateV2Binding mBlockEmptyStateV2Binding, ru.ozon.android.messenger.framework.core.d references, g gVar) {
        MBlockEmptyStateV2Binding binding = mBlockEmptyStateV2Binding;
        g viewObject = gVar;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        ViewGroup h11 = ru.ozon.android.messenger.framework.core.viewmapper.b.h(rootView);
        h11.addView(binding.getConstraintLayout());
        s.d(h11);
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function2<EmptyStateV2DTO, ru.ozon.android.messenger.framework.presentation.models.c, List<g>> getMapper() {
        return this.f85114d;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, EmptyStateV2DTO> getParser() {
        return this.f85113c;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final long[] getSupportedVersions() {
        return new long[]{2};
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final MBlockEmptyStateV2Binding j(ViewGroup rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Context context = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        MBlockEmptyStateV2Binding inflate = MBlockEmptyStateV2Binding.inflate(ru.ozon.android.messenger.utils.c.c(context), ru.ozon.android.messenger.framework.core.viewmapper.b.h(rootView), false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void l(ViewGroup rootView, MBlockEmptyStateV2Binding mBlockEmptyStateV2Binding, ru.ozon.android.messenger.framework.core.d references) {
        MBlockEmptyStateV2Binding binding = mBlockEmptyStateV2Binding;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        this.f85115e.clear();
        ViewGroup h11 = ru.ozon.android.messenger.framework.core.viewmapper.b.h(rootView);
        h11.removeView(binding.getConstraintLayout());
        s.a(h11);
    }

    protected void o(@NotNull ViewGroup rootView, @NotNull MBlockEmptyStateV2Binding binding, @NotNull ru.ozon.android.messenger.framework.core.d references, @NotNull g viewObject) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        d.a f7 = ru.ozon.android.messenger.utils.g.f(references.d());
        Map<String, MessengerTrackingInfo> h11 = viewObject.h();
        if (h11 != null) {
            references.c().s(h11);
        }
        if (Intrinsics.d(viewObject.i(), Boolean.FALSE)) {
            binding.getConstraintLayout().setLayoutParams(new LinearLayout.LayoutParams(binding.getConstraintLayout().getLayoutParams().width, -2));
            ViewGroup h12 = ru.ozon.android.messenger.framework.core.viewmapper.b.h(rootView);
            LinearLayout linearLayout = h12 instanceof LinearLayout ? (LinearLayout) h12 : null;
            if (linearLayout != null) {
                linearLayout.setGravity(17);
            }
        }
        TextAtomV2View emptyStateTitleTv = binding.emptyStateTitleTv;
        Intrinsics.checkNotNullExpressionValue(emptyStateTitleTv, "emptyStateTitleTv");
        TextHolderKt.bindOrGone$default(emptyStateTitleTv, viewObject.g(), null, 2, null);
        TextAtomV2View emptyStateDescriptionTv = binding.emptyStateDescriptionTv;
        Intrinsics.checkNotNullExpressionValue(emptyStateDescriptionTv, "emptyStateDescriptionTv");
        TextHolderKt.bindOrGone$default(emptyStateDescriptionTv, viewObject.d(), null, 2, null);
        ImageDTO e11 = viewObject.e();
        if (e11 != null) {
            Image emptyStateIv = binding.emptyStateIv;
            Intrinsics.checkNotNullExpressionValue(emptyStateIv, "emptyStateIv");
            ImageHolderKt.bind$default(emptyStateIv, e11, null, 2, null);
        }
        n f11 = viewObject.f();
        if (f11 != null) {
            Image emptyStateIv2 = binding.emptyStateIv;
            Intrinsics.checkNotNullExpressionValue(emptyStateIv2, "emptyStateIv");
            ru.ozon.android.messenger.utils.image.c.d(emptyStateIv2, f11, f7);
        }
    }

    protected final void r(@NotNull ru.ozon.android.messenger.framework.core.d references, @NotNull g viewObject) {
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        if (viewObject.c() instanceof g.a) {
            ru.ozon.android.messenger.framework.analytics.d p11 = p(ActionType.VIEW.INSTANCE, ((g.a) viewObject.c()).a());
            ArrayList arrayList = this.f85115e;
            if (arrayList.contains(p11)) {
                return;
            }
            references.c().k(p11);
            arrayList.add(p11);
        }
    }
}
