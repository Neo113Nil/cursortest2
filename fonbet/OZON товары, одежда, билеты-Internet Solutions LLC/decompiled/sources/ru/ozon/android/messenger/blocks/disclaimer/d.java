package ru.ozon.android.messenger.blocks.disclaimer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import fd.InterfaceC6511n;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.core.viewmapper.a;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.q;
import ru.ozon.app.android.messenger.R$attr;
import ru.ozon.app.android.messenger.databinding.MBlockDisclaimerBinding;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

/* loaded from: classes10.dex */
public final class d extends ru.ozon.android.messenger.framework.core.viewmapper.a<DisclaimerDTO, ru.ozon.android.messenger.blocks.disclaimer.a, MBlockDisclaimerBinding> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<String, DisclaimerDTO> f85043a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function2<DisclaimerDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<ru.ozon.android.messenger.blocks.disclaimer.a>> f85044b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockDisclaimerBinding> f85045c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final h<ru.ozon.android.messenger.blocks.disclaimer.c> f85046d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final a.AbstractC1563a.C1564a f85047e;

    /* synthetic */ class a extends C7735q implements InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockDisclaimerBinding> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f85048a = new a(3, MBlockDisclaimerBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lru/ozon/app/android/messenger/databinding/MBlockDisclaimerBinding;", 0);

        @Override // fd.InterfaceC6511n
        public final MBlockDisclaimerBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            LayoutInflater p02 = layoutInflater;
            boolean booleanValue = bool.booleanValue();
            Intrinsics.checkNotNullParameter(p02, "p0");
            return MBlockDisclaimerBinding.inflate(p02, viewGroup, booleanValue);
        }
    }

    static final class b extends AbstractC7737t implements Function2<DisclaimerDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends ru.ozon.android.messenger.blocks.disclaimer.a>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f85049b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context) {
            super(2);
            this.f85049b = context;
        }

        @Override // kotlin.jvm.functions.Function2
        public final List<? extends ru.ozon.android.messenger.blocks.disclaimer.a> invoke(DisclaimerDTO disclaimerDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
            DisclaimerDTO state = disclaimerDTO;
            ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(blockId, "blockId");
            TextAtom title = state.getTitle();
            TextAtom description = state.getDescription();
            List<ButtonV3Atom.SmallBorderlessButton> buttons = state.getButtons();
            if (buttons == null) {
                buttons = K.f71697a;
            }
            List<ButtonV3Atom.SmallBorderlessButton> list = buttons;
            StyleParser styleParser = StyleParser.INSTANCE;
            String backgroundColor = state.getBackgroundColor();
            int i11 = R$attr.bgSecondary;
            Context context = this.f85049b;
            return C7714v.a0(new ru.ozon.android.messenger.blocks.disclaimer.a(blockId, title, description, list, styleParser.parseColor(context, backgroundColor, ThemeExtKt.themeColorRes(context, i11)), state.getBackgroundImage()));
        }
    }

    static final class c extends AbstractC7737t implements Function1<String, DisclaimerDTO> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ JsonParser f85050b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(JsonParser jsonParser) {
            super(1);
            this.f85050b = jsonParser;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisclaimerDTO invoke(String str) {
            String state = str;
            Intrinsics.checkNotNullParameter(state, "state");
            return (DisclaimerDTO) this.f85050b.fromJson(state, DisclaimerDTO.class);
        }
    }

    /* renamed from: ru.ozon.android.messenger.blocks.disclaimer.d$d, reason: collision with other inner class name */
    /* synthetic */ class C1490d extends C7735q implements Function2<MBlockDisclaimerBinding, ru.ozon.android.messenger.framework.core.d, ru.ozon.android.messenger.blocks.disclaimer.c> {

        /* renamed from: a, reason: collision with root package name */
        public static final C1490d f85051a = new C1490d(2, ru.ozon.android.messenger.blocks.disclaimer.c.class, "<init>", "<init>(Lru/ozon/app/android/messenger/databinding/MBlockDisclaimerBinding;Lru/ozon/android/messenger/framework/core/References;)V", 0);

        @Override // kotlin.jvm.functions.Function2
        public final ru.ozon.android.messenger.blocks.disclaimer.c invoke(MBlockDisclaimerBinding mBlockDisclaimerBinding, ru.ozon.android.messenger.framework.core.d dVar) {
            MBlockDisclaimerBinding p02 = mBlockDisclaimerBinding;
            ru.ozon.android.messenger.framework.core.d p12 = dVar;
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            return new ru.ozon.android.messenger.blocks.disclaimer.c(p02, p12);
        }
    }

    public d(@NotNull JsonParser deserializer, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f85043a = new c(deserializer);
        this.f85044b = new b(context);
        this.f85045c = a.f85048a;
        this.f85046d = C1490d.f85051a;
        this.f85047e = a.AbstractC1563a.C1564a.f87356a;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final a.AbstractC1563a getBlockContainerSettings() {
        return this.f85047e;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    @NotNull
    public final InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, MBlockDisclaimerBinding> getInflate() {
        return this.f85045c;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function2<DisclaimerDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<ru.ozon.android.messenger.blocks.disclaimer.a>> getMapper() {
        return this.f85044b;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, DisclaimerDTO> getParser() {
        return this.f85043a;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.a
    public final Function2<MBlockDisclaimerBinding, ru.ozon.android.messenger.framework.core.d, q<ru.ozon.android.messenger.blocks.disclaimer.a, MBlockDisclaimerBinding>> getViewProducer() {
        return (Function2) this.f85046d;
    }
}
