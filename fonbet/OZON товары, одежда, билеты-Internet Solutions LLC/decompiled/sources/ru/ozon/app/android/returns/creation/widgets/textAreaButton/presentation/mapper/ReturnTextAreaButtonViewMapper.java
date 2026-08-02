package ru.ozon.app.android.returns.creation.widgets.textAreaButton.presentation.mapper;

import DD.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.returns.creation.widgets.textAreaButton.data.ReturnTextAreaButtonDto;
import ru.ozon.app.android.returns.creation.widgets.textAreaButton.di.ReturnTextAreaButtonsComponent;
import ru.ozon.app.android.returns.creation.widgets.textAreaButton.presentation.ReturnTextAreaButtonViewHolder;
import ru.ozon.app.android.returns.creation.widgets.textAreaButton.presentation.view.ReturnTextAreaButtonView;
import ru.ozon.app.android.returns.creation.widgets.textAreaButton.viewObject.ReturnTextAreaButtonVO;
import ru.ozon.app.android.returns.ui.molecules.textarea.v2.mapper.RmsTextAreaV2MapperKt;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u0004*\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR2\u0010\u001d\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001c0\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R,\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 ¨\u0006%"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/textAreaButton/presentation/mapper/ReturnTextAreaButtonViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/returns/creation/widgets/textAreaButton/di/ReturnTextAreaButtonsComponent;", "Lru/ozon/app/android/returns/creation/widgets/textAreaButton/data/ReturnTextAreaButtonDto;", "Lru/ozon/app/android/returns/creation/widgets/textAreaButton/viewObject/ReturnTextAreaButtonVO;", "<init>", "()V", "Ll20/d;", "info", "toVO", "(Lru/ozon/app/android/returns/creation/widgets/textAreaButton/data/ReturnTextAreaButtonDto;Ll20/d;)Lru/ozon/app/android/returns/creation/widgets/textAreaButton/viewObject/ReturnTextAreaButtonVO;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/returns/creation/widgets/textAreaButton/presentation/ReturnTextAreaButtonViewHolder;", "holderProducer", "getHolderProducer", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReturnTextAreaButtonViewMapper extends WidgetViewMapper2<ReturnTextAreaButtonsComponent, ReturnTextAreaButtonDto, ReturnTextAreaButtonVO> {

    @NotNull
    private final Function2<ReturnTextAreaButtonDto, d, List<ReturnTextAreaButtonVO>> mapper = new ReturnTextAreaButtonViewMapper$mapper$1(this);

    @NotNull
    private final Function2<View, ComposerReferences, ReturnTextAreaButtonViewHolder> holderProducer = new ReturnTextAreaButtonViewMapper$holderProducer$1(this);

    /* JADX INFO: Access modifiers changed from: private */
    public final ReturnTextAreaButtonVO toVO(ReturnTextAreaButtonDto returnTextAreaButtonDto, d dVar) {
        return new ReturnTextAreaButtonVO(dVar.d().hashCode(), RmsTextAreaV2MapperKt.toVO(returnTextAreaButtonDto.getTextArea()), returnTextAreaButtonDto.getButton());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReturnTextAreaButtonsComponent widgetComponent$lambda$0(C7475g c7475g) {
        return ReturnTextAreaButtonsComponent.INSTANCE.create(c7475g);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof ReturnTextAreaButtonDto;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new ReturnTextAreaButtonView(context, null, 0, 6, null);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, ReturnTextAreaButtonViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<ReturnTextAreaButtonDto, d, List<ReturnTextAreaButtonVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ReturnTextAreaButtonsComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(ReturnTextAreaButtonsComponent.class), new a(storage, 10));
    }
}
