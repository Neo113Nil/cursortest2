package ru.ozon.app.android.commonwidgets.widgets.curtainContent.presentation.adapter;

import Ej.b;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.commonwidgets.widgets.curtainContent.presentation.adapter.holders.AtomType;
import ru.ozon.app.android.commonwidgets.widgets.curtainContent.presentation.adapter.holders.CurtainContentButtonViewHolder;
import ru.ozon.app.android.commonwidgets.widgets.curtainContent.presentation.adapter.holders.CurtainContentTextViewHolder;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtainContent/presentation/adapter/AtomsAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/uni/atoms/data/AtomDTO;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$C;", "holder", "position", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$C;I)V", "getItemViewType", "(I)I", "Lkotlin/jvm/functions/Function1;", "Landroid/view/ViewGroup$MarginLayoutParams;", "layoutAtomParams$delegate", "LSc/j;", "getLayoutAtomParams", "()Landroid/view/ViewGroup$MarginLayoutParams;", "layoutAtomParams", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AtomsAdapter extends t<AtomDTO, RecyclerView.C> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    /* renamed from: layoutAtomParams$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j layoutAtomParams;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AtomsAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(new AtomDiffCallback());
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
        this.layoutAtomParams = LazyUtilsKt.unsafeLazy(AtomsAdapter$layoutAtomParams$2.INSTANCE);
    }

    private final ViewGroup.MarginLayoutParams getLayoutAtomParams() {
        return (ViewGroup.MarginLayoutParams) this.layoutAtomParams.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        AtomDTO item = getItem(position);
        return item instanceof TextDTO ? AtomType.TEXT.ordinal() : item instanceof ButtonV3DTO ? AtomType.BUTTON.ordinal() : AtomType.NOT_SUPPORTED.ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull RecyclerView.C holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        AtomDTO item = getItem(position);
        if (holder instanceof CurtainContentButtonViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO");
            ((CurtainContentButtonViewHolder) holder).bind((ButtonV3DTO) item);
        } else if (holder instanceof CurtainContentTextViewHolder) {
            Intrinsics.g(item, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.text.TextDTO");
            ((CurtainContentTextViewHolder) holder).bind((TextDTO) item);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public RecyclerView.C onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == AtomType.TEXT.ordinal()) {
            TextAtomV2View textAtomV2View = (TextAtomV2View) q.f64554a.i(N.b(TextAtomV2View.class), parent.getContext());
            if (textAtomV2View == null) {
                Context context = parent.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
            }
            textAtomV2View.setLayoutParams(getLayoutAtomParams());
            return new CurtainContentTextViewHolder(textAtomV2View);
        }
        if (viewType != AtomType.BUTTON.ordinal()) {
            throw new IllegalArgumentException(b.a(viewType, "Not support type "));
        }
        ButtonV3View buttonV3View = (ButtonV3View) q.f64554a.i(N.b(ButtonV3View.class), parent.getContext());
        if (buttonV3View == null) {
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            buttonV3View = new ButtonV3View(context2, null, 0, 0, 14, null);
        }
        buttonV3View.setLayoutParams(getLayoutAtomParams());
        return new CurtainContentButtonViewHolder(buttonV3View, new AtomsAdapter$onCreateViewHolder$3(this.actionHandler));
    }
}
