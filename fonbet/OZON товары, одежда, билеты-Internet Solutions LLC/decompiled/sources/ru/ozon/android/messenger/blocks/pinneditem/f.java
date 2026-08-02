package ru.ozon.android.messenger.blocks.pinneditem;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.Y1;
import fd.InterfaceC6511n;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.core.viewmapper.e;
import ru.ozon.android.messenger.framework.data.remote.models.blocks.BlockDTO;
import ru.ozon.android.messenger.framework.presentation.models.h;
import ru.ozon.android.messenger.framework.presentation.models.q;
import ru.ozon.android.messenger.framework.presentation.models.u;
import ru.ozon.android.messenger.framework.presentation.models.w;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.databinding.MNouiviewPinnedItemBinding;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;

/* loaded from: classes10.dex */
public final class f extends ru.ozon.android.messenger.framework.core.viewmapper.b<PinnedItemDTO, g, MNouiviewPinnedItemBinding> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Jb.c f86041b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f86042c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<String, PinnedItemDTO> f86043d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Object f86044e;

    public f(@NotNull JsonParser deserializer, @NotNull Jb.c blocksItemMapperProvider) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(blocksItemMapperProvider, "blocksItemMapperProvider");
        this.f86041b = blocksItemMapperProvider;
        this.f86042c = ru.ozon.android.messenger.utils.f.b(new b(this));
        this.f86043d = new e(deserializer);
        this.f86044e = ru.ozon.android.messenger.utils.f.b(d.f86039b);
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void b(ViewGroup rootView, MNouiviewPinnedItemBinding mNouiviewPinnedItemBinding, ru.ozon.android.messenger.framework.core.d references, g gVar) {
        MNouiviewPinnedItemBinding binding = mNouiviewPinnedItemBinding;
        g viewObject = gVar;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        ru.ozon.android.messenger.framework.core.viewmapper.b.i(rootView).addView(binding.getConstraintLayout());
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [Sc.j, java.lang.Object] */
    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void c(ViewGroup rootView, X4.a aVar, ru.ozon.android.messenger.framework.core.d references, ru.ozon.android.messenger.framework.presentation.models.g gVar) {
        Object obj;
        List list;
        MNouiviewPinnedItemBinding binding = (MNouiviewPinnedItemBinding) aVar;
        g viewObject = (g) gVar;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        binding.pinnedItemBlockContainer.removeAllViews();
        BlockDTO a11 = viewObject.a();
        List<ru.ozon.android.messenger.framework.core.viewmapper.d<?, ? extends ru.ozon.android.messenger.framework.presentation.models.g>> c11 = ((ru.ozon.android.messenger.framework.data.remote.mapper.a) this.f86042c.getValue()).c(a11);
        if (c11 != null) {
            Iterator<T> it = c11.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((ru.ozon.android.messenger.framework.core.viewmapper.d) obj).canMap(a11)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            ru.ozon.android.messenger.framework.core.viewmapper.d dVar = (ru.ozon.android.messenger.framework.core.viewmapper.d) obj;
            if (dVar != null) {
                Object invoke = dVar.getParser().invoke(a11.getState());
                Function2 mapper = dVar.getMapper();
                if (mapper == null || (list = (List) mapper.invoke(invoke, viewObject.getBlockId())) == null) {
                    return;
                }
                u uVar = new u((ru.ozon.android.messenger.framework.presentation.models.g) C7714v.K(list), references.a().a(c11), e.b.f87375a);
                q qVar = new q(C7714v.a0(uVar), new w(h.b(viewObject), viewObject.c()));
                for (ru.ozon.android.messenger.framework.core.viewmapper.a aVar2 : ru.ozon.android.messenger.framework.data.d.b(references.a(), uVar.e())) {
                    InterfaceC6511n inflate = aVar2.getInflate();
                    Context context = rootView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    X4.a aVar3 = (X4.a) inflate.invoke(ru.ozon.android.messenger.utils.c.c(context), binding.pinnedItemBlockContainer, Boolean.FALSE);
                    binding.pinnedItemBlockContainer.addView(aVar3.getConstraintLayout());
                    ((ru.ozon.android.messenger.framework.presentation.common.view.recycler.q) aVar2.getViewProducer().invoke(aVar3, references)).bind(uVar.c(), qVar.c(), new ru.ozon.android.messenger.framework.presentation.models.d(0, a11.getName()), null);
                }
                ru.ozon.android.messenger.blocks.chat.common.h<?, ru.ozon.android.messenger.framework.presentation.models.g> f7 = ru.ozon.android.messenger.framework.data.d.f(references.a(), uVar.e(), a.f86035b);
                if (f7 != null) {
                    ComposeView composeView = new ComposeView(ru.ozon.android.messenger.framework.core.f.a(references), null, 6, 0);
                    composeView.setViewCompositionStrategy(Y1.c.f40794a);
                    composeView.a(f7.a(androidx.compose.ui.e.f40358c0, uVar.c(), references));
                    binding.pinnedItemBlockContainer.addView(composeView);
                }
                List<IconButtonV3DTO> b11 = viewObject.b();
                if (b11 != null) {
                    binding.pinnedItemButtonsContainer.removeAllViews();
                    for (IconButtonV3DTO iconButtonV3DTO : b11) {
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams.gravity = 48;
                        Context context2 = binding.getConstraintLayout().getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        IconButtonV3View iconButtonV3View = new IconButtonV3View(context2, null, 0, 0, 14, null);
                        IconButtonV3HolderKt.bind$default(iconButtonV3View, iconButtonV3DTO, null, 2, null);
                        Ni.b.a(iconButtonV3View, new c(iconButtonV3DTO, references));
                        binding.pinnedItemButtonsContainer.addView(iconButtonV3View, layoutParams);
                    }
                }
                androidx.constraintlayout.widget.d dVar2 = new androidx.constraintlayout.widget.d();
                dVar2.p(binding.getConstraintLayout());
                List<IconButtonV3DTO> b12 = viewObject.b();
                if (b12 == null || b12.isEmpty()) {
                    dVar2.s(R$id.pinnedItemBlockContainer, 7, 0, 7);
                } else {
                    dVar2.s(R$id.pinnedItemBlockContainer, 7, R$id.pinnedItemButtonsContainer, 6);
                }
                dVar2.f(binding.getConstraintLayout());
                return;
            }
        }
        throw new IllegalStateException("Could not find viewMapper for block: " + a11);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function2<PinnedItemDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<g>> getMapper() {
        return (Function2) this.f86044e.getValue();
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.d
    @NotNull
    public final Function1<String, PinnedItemDTO> getParser() {
        return this.f86043d;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final MNouiviewPinnedItemBinding j(ViewGroup rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Context context = rootView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        MNouiviewPinnedItemBinding inflate = MNouiviewPinnedItemBinding.inflate(ru.ozon.android.messenger.utils.c.c(context), ru.ozon.android.messenger.framework.core.viewmapper.b.i(rootView), false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return inflate;
    }

    @Override // ru.ozon.android.messenger.framework.core.viewmapper.b
    public final void l(ViewGroup rootView, MNouiviewPinnedItemBinding mNouiviewPinnedItemBinding, ru.ozon.android.messenger.framework.core.d references) {
        MNouiviewPinnedItemBinding binding = mNouiviewPinnedItemBinding;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        ru.ozon.android.messenger.framework.core.viewmapper.b.i(rootView).removeView(binding.getConstraintLayout());
    }
}
