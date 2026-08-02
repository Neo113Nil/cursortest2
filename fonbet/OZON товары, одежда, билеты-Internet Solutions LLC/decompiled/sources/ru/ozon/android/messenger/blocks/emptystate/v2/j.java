package ru.ozon.android.messenger.blocks.emptystate.v2;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.core.viewmapper.a;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.android.messenger.framework.presentation.models.n;
import ru.ozon.app.android.messenger.R$drawable;
import ru.ozon.app.android.messenger.databinding.MBlockEmptyStateV2Binding;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
public final class j extends ru.ozon.android.messenger.framework.core.viewmapper.a<EmptyStateV2DTO, g, MBlockEmptyStateV2Binding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<String, EmptyStateV2DTO> f85138a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<EmptyStateV2DTO, ru.ozon.android.messenger.framework.presentation.models.c, List<g>> f85139b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function2<MBlockEmptyStateV2Binding, ru.ozon.android.messenger.framework.core.d, q<g, MBlockEmptyStateV2Binding>> f85140c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final a.AbstractC1563a.C1564a f85141d;

    /* synthetic */ class a extends C7735q implements InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockEmptyStateV2Binding> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f85142a = new a(3, MBlockEmptyStateV2Binding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lru/ozon/app/android/messenger/databinding/MBlockEmptyStateV2Binding;", 0);

        @Override // fd.InterfaceC6511n
        public final MBlockEmptyStateV2Binding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p02 = layoutInflater;
            boolean booleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p02, "p0");
            return MBlockEmptyStateV2Binding.inflate(p02, viewGroup, booleanValue);
        }
    }

    static final class b extends AbstractC7737t implements Function2<EmptyStateV2DTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends g>> {

        /* renamed from: b, reason: collision with root package name */
        public static final b f85143b = new b(2);

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

    static final class c extends AbstractC7737t implements Function1<String, EmptyStateV2DTO> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f85144b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(JsonParser jsonParser) {
            super(1);
            this.f85144b = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final EmptyStateV2DTO invoke(String str) {
            String state = str;
            Intrinsics.checkNotNullParameter(state, "state");
            return (EmptyStateV2DTO) this.f85144b.fromJson(state, EmptyStateV2DTO.class);
        }
    }

    /* synthetic */ class d extends C7735q implements Function2<MBlockEmptyStateV2Binding, ru.ozon.android.messenger.framework.core.d, i> {

        /* renamed from: a, reason: collision with root package name */
        public static final d f85145a = new d(2, i.class, "<init>", "<init>(Lru/ozon/app/android/messenger/databinding/MBlockEmptyStateV2Binding;Lru/ozon/android/messenger/framework/core/References;)V", 0);

        @Override // kotlin.jvm.functions.Function2
        public final i invoke(MBlockEmptyStateV2Binding mBlockEmptyStateV2Binding, ru.ozon.android.messenger.framework.core.d dVar) {
            MBlockEmptyStateV2Binding p02 = mBlockEmptyStateV2Binding;
            ru.ozon.android.messenger.framework.core.d p12 = dVar;
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            return new i(p02, p12);
        }
    }

    public j(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        this.f85138a = new c(deserializer);
        this.f85139b = b.f85143b;
        this.f85140c = d.f85145a;
        this.f85141d = a.AbstractC1563a.C1564a.f87356a;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    public final boolean canMap(Object obj) {
        if (obj instanceof ru.ozon.android.messenger.framework.presentation.models.e) {
            return ((ru.ozon.android.messenger.framework.presentation.models.e) obj).b() instanceof g;
        }
        return false;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final a.AbstractC1563a getBlockContainerSettings() {
        return this.f85141d;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockEmptyStateV2Binding> getInflate() {
        return a.f85142a;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function2<EmptyStateV2DTO, ru.ozon.android.messenger.framework.presentation.models.c, List<g>> getMapper() {
        return this.f85139b;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, EmptyStateV2DTO> getParser() {
        return this.f85138a;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final Function2<MBlockEmptyStateV2Binding, ru.ozon.android.messenger.framework.core.d, q<g, MBlockEmptyStateV2Binding>> getViewProducer() {
        return this.f85140c;
    }
}
