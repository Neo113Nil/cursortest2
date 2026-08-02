package ru.ozon.app.android.returns.listEmpty.presentation.instruction.mapper;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import k20.C7471c;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.returns.listEmpty.presentation.instruction.InstructionViewHolder;
import ru.ozon.app.android.returns.listEmpty.presentation.util.TextBlockDecoration;
import ru.ozon.app.android.returns.listEmpty.presentation.view.ReturnInstructionTextBlockView;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0019\u001a\u00020\u00182\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001eR,\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/returns/listEmpty/presentation/instruction/mapper/InstructionViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "", "Lru/ozon/app/android/returns/listEmpty/data/ReturnListEmptyDto;", "Lru/ozon/app/android/returns/listEmpty/presentation/TextBlockVO$Instruction;", "Lru/ozon/app/android/returns/listEmpty/presentation/instruction/mapper/InstructionMapper;", "mapper", "Lru/ozon/app/android/returns/listEmpty/presentation/util/TextBlockDecoration;", "decoration", "<init>", "(Lru/ozon/app/android/returns/listEmpty/presentation/instruction/mapper/InstructionMapper;Lru/ozon/app/android/returns/listEmpty/presentation/util/TextBlockDecoration;)V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/content/Context;", "context", "", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/c;", "widgetComponent", "(Lk20/g;)Lk20/c;", "Lru/ozon/app/android/returns/listEmpty/presentation/instruction/mapper/InstructionMapper;", "getMapper", "()Lru/ozon/app/android/returns/listEmpty/presentation/instruction/mapper/InstructionMapper;", "Lru/ozon/app/android/returns/listEmpty/presentation/util/TextBlockDecoration;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/returns/listEmpty/presentation/instruction/InstructionViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InstructionViewMapper extends WidgetViewMapper2 {

    @NotNull
    private final TextBlockDecoration decoration;

    @NotNull
    private final Function2<View, ComposerReferences, InstructionViewHolder> holderProducer;

    @NotNull
    private final InstructionMapper mapper;

    public InstructionViewMapper(@NotNull InstructionMapper mapper, @NotNull TextBlockDecoration decoration) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(decoration, "decoration");
        this.mapper = mapper;
        this.decoration = decoration;
        this.holderProducer = InstructionViewMapper$holderProducer$1.INSTANCE;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new ReturnInstructionTextBlockView(context, null, 0, 0, 14, null);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<TextBlockDecoration> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(this.decoration);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, InstructionViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public InstructionMapper getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7471c widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return C7471c.f70357c;
    }
}
