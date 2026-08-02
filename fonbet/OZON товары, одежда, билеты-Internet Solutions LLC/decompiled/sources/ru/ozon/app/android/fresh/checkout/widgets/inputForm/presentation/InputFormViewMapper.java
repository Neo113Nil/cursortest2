package ru.ozon.app.android.fresh.checkout.widgets.inputForm.presentation;

import A00.a;
import Sc.o;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.fresh.checkout.widgets.inputForm.data.InputFormDTO;
import ru.ozon.app.android.fresh.checkout.widgets.inputForm.di.InputFormDIComponent;
import ru.ozon.app.android.fresh.checkout.widgets.inputForm.presentation.InputFormVO;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionDTO;
import ru.ozon.uni.android.textArea.TextAreaView;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR,\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\"\u0010+\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070(0'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/inputForm/presentation/InputFormViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/fresh/checkout/widgets/inputForm/di/InputFormDIComponent;", "Lru/ozon/app/android/fresh/checkout/widgets/inputForm/data/InputFormDTO;", "Lru/ozon/app/android/fresh/checkout/widgets/inputForm/presentation/InputFormVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/fresh/checkout/widgets/inputForm/presentation/InputFormVO;)Lru/ozon/app/android/fresh/checkout/widgets/inputForm/presentation/InputFormVO;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "Ljava/lang/Void;", "getLayout", "()Ljava/lang/Void;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/fresh/checkout/widgets/inputForm/presentation/InputFormViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/fresh/checkout/widgets/inputForm/presentation/InputFormMapper;", "getMapper", "()Lru/ozon/app/android/fresh/checkout/widgets/inputForm/presentation/InputFormMapper;", "mapper", "", "Ljava/lang/Class;", "getSupportedUpdates", "()Ljava/util/List;", "supportedUpdates", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InputFormViewMapper extends WidgetViewMapper2<InputFormDIComponent, InputFormDTO, InputFormVO> {

    @NotNull
    private final Function2<View, ComposerReferences, InputFormViewHolder> holderProducer = new InputFormViewMapper$holderProducer$1(this);
    private final Void layout;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ComposerActionWithActionDTO.MessageDTO.MessageTypeDTO.values().length];
            try {
                iArr[ComposerActionWithActionDTO.MessageDTO.MessageTypeDTO.TYPE_PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ComposerActionWithActionDTO.MessageDTO.MessageTypeDTO.TYPE_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ComposerActionWithActionDTO.MessageDTO.MessageTypeDTO.TYPE_WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new InputFormView(context, null, 0, 6, null);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, InputFormViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public /* bridge */ /* synthetic */ Integer getLayout() {
        return (Integer) getLayout();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return C7714v.a0(InputFormTextUpdate.class);
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<InputFormDIComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return InputFormDIComponent.INSTANCE.create(storage);
    }

    public Void getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public InputFormMapper getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public InputFormVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull InputFormVO oldItem) {
        TextAreaView.Status status;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(update instanceof InputFormTextUpdate)) {
            return oldItem;
        }
        InputFormTextUpdate inputFormTextUpdate = (InputFormTextUpdate) update;
        int i11 = WhenMappings.$EnumSwitchMapping$0[inputFormTextUpdate.getMessage().getType().ordinal()];
        if (i11 == 1) {
            status = TextAreaView.Status.NEUTRAL;
        } else if (i11 == 2) {
            status = TextAreaView.Status.SUCCESS;
        } else {
            if (i11 != 3) {
                throw new o();
            }
            status = TextAreaView.Status.ERROR;
        }
        TextAreaView.Status status2 = status;
        return InputFormVO.copy$default(oldItem, 0L, InputFormVO.TextArea.copy$default(oldItem.getTextArea(), null, inputFormTextUpdate.getText(), 0, 0, 0, inputFormTextUpdate.getMessage().getMessage(), status2, 29, null), null, null, null, null, 61, null);
    }
}
