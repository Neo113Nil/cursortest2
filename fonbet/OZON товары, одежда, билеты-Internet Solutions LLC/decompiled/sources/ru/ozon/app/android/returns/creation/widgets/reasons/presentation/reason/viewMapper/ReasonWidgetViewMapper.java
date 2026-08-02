package ru.ozon.app.android.returns.creation.widgets.reasons.presentation.reason.viewMapper;

import A00.a;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.di.ComposerWidgetComponentStorageKt;
import ru.ozon.app.android.returns.creation.R$layout;
import ru.ozon.app.android.returns.creation.widgets.reasons.data.ReasonDTO;
import ru.ozon.app.android.returns.creation.widgets.reasons.di.ReturnCreationReasonsComponent;
import ru.ozon.app.android.returns.creation.widgets.reasons.presentation.reason.viewHolder.ReasonDecoration;
import ru.ozon.app.android.returns.creation.widgets.reasons.presentation.reason.viewItem.NestedReasons;
import ru.ozon.app.android.returns.creation.widgets.reasons.presentation.reason.viewItem.ReasonVI;
import ru.ozon.app.android.returns.ui.molecules.textarea.viewObject.ReasonRow;
import ru.ozon.app.android.returns.ui.molecules.textarea.viewObject.TextAreaVO;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001aj\b\u0012\u0004\u0012\u00020\u0002`\u001b2\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R&\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070&0\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R2\u0010/\u001a\u001a\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040.0+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R,\u00105\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u000203\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000e0+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00102¨\u00066"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/reason/viewMapper/ReasonWidgetViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/returns/creation/widgets/reasons/di/ReturnCreationReasonsComponent;", "Lru/ozon/app/android/returns/creation/widgets/reasons/data/ReasonDTO;", "Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/reason/viewItem/ReasonVI;", "<init>", "()V", "Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/reason/viewMapper/ReasonWidgetViewMapperUpdateCommentKey;", "update", "oldItem", "copyReasonViewItemWithNewComment", "(Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/reason/viewMapper/ReasonWidgetViewMapperUpdateCommentKey;Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/reason/viewItem/ReasonVI;)Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/reason/viewItem/ReasonVI;", "Landroid/content/Context;", "context", "", "Landroidx/recyclerview/widget/RecyclerView$n;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "LA00/a$J$a;", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/reason/viewItem/ReasonVI;)Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/reason/viewItem/ReasonVI;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ll20/d;", "getMapper", "mapper", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReasonWidgetViewMapper extends WidgetViewMapper2<ReturnCreationReasonsComponent, ReasonDTO, ReasonVI> {
    private final int layout = R$layout.return_creation_reasons_reason;

    @NotNull
    private final List<Class<ReasonWidgetViewMapperUpdateCommentKey>> supportedUpdates = C7714v.a0(ReasonWidgetViewMapperUpdateCommentKey.class);

    @NotNull
    private final Function2<View, ComposerReferences, k<ReasonVI>> holderProducer = new ReasonWidgetViewMapper$holderProducer$1(this);

    private final ReasonVI copyReasonViewItemWithNewComment(ReasonWidgetViewMapperUpdateCommentKey update, ReasonVI oldItem) {
        Integer num;
        List<ReasonRow> reasons;
        NestedReasons nestedReasons = oldItem.getNestedReasons();
        if (nestedReasons == null || (reasons = nestedReasons.getReasons()) == null) {
            num = null;
        } else {
            Iterator<ReasonRow> it = reasons.iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                }
                ReasonRow next = it.next();
                if ((next instanceof ReasonRow.InputRow) && update.getId() == ((ReasonRow.InputRow) next).getId()) {
                    break;
                }
                i11++;
            }
            num = Integer.valueOf(i11);
        }
        if (num != null && num.intValue() != -1) {
            ReasonRow reasonRow = oldItem.getNestedReasons().getReasons().get(num.intValue());
            if (reasonRow instanceof ReasonRow.InputRow) {
                ReasonRow.InputRow inputRow = (ReasonRow.InputRow) reasonRow;
                TextAreaVO copy$default = TextAreaVO.copy$default(inputRow.getTextArea(), update.getComment(), null, null, 6, null);
                ArrayList W02 = C7714v.W0(oldItem.getNestedReasons().getReasons());
                W02.set(num.intValue(), ReasonRow.InputRow.copy$default(inputRow, 0L, copy$default, null, false, null, 29, null));
                return ReasonVI.copy$default(oldItem, 0L, null, NestedReasons.copy$default(oldItem.getNestedReasons(), W02, null, null, 6, null), 3, null);
            }
        }
        return null;
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof ReasonDTO;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<RecyclerView.n> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new ReasonDecoration());
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<ReasonVI>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<ReasonDTO, d, List<ReasonVI>> getMapper() {
        return component().getReasonMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<ReasonWidgetViewMapperUpdateCommentKey>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ReturnCreationReasonsComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return ReturnCreationReasonsComponent.INSTANCE.create(ComposerWidgetComponentStorageKt.getContext(storage));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public ReasonVI handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull ReasonVI oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(update instanceof ReasonWidgetViewMapperUpdateCommentKey)) {
            return (ReasonVI) super.handleUpdate(update, (a.J.InterfaceC0007a) oldItem);
        }
        ReasonVI copyReasonViewItemWithNewComment = copyReasonViewItemWithNewComment((ReasonWidgetViewMapperUpdateCommentKey) update, oldItem);
        return copyReasonViewItemWithNewComment == null ? (ReasonVI) super.handleUpdate(update, (a.J.InterfaceC0007a) oldItem) : copyReasonViewItemWithNewComment;
    }
}
