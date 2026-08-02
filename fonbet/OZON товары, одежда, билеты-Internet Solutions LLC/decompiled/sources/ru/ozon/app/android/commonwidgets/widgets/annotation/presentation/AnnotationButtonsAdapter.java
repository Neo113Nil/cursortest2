package ru.ozon.app.android.commonwidgets.widgets.annotation.presentation;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.R$id;
import ru.ozon.app.android.atoms.atom2.ButtonAtom;
import ru.ozon.app.android.commonwidgets.R$layout;
import ru.ozon.app.android.commonwidgets.databinding.ItemAnnotationButtonBinding;
import ru.ozon.app.android.storefrontcommonwidgets.core.appType.AppTypeResolver;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.deprecated.Button;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R6\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/annotation/presentation/AnnotationButtonsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/commonwidgets/widgets/annotation/presentation/AnnotationButtonsAdapter$ButtonViewHolder;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/commonwidgets/widgets/annotation/presentation/AnnotationButtonsAdapter$ButtonViewHolder;", "getItemCount", "()I", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/commonwidgets/widgets/annotation/presentation/AnnotationButtonsAdapter$ButtonViewHolder;I)V", "Lkotlin/jvm/functions/Function1;", "", "Lru/ozon/uni/atoms/data/deprecated/Button;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "ButtonViewHolder", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AnnotationButtonsAdapter extends RecyclerView.g<ButtonViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private List<Button> items;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/annotation/presentation/AnnotationButtonsAdapter$ButtonViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "Landroid/widget/TextView;", "Landroid/content/Context;", "context", "setSelectColor", "(Landroid/widget/TextView;Landroid/content/Context;)Landroid/widget/TextView;", "Lru/ozon/uni/atoms/data/deprecated/Button;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "bind", "(Lru/ozon/uni/atoms/data/deprecated/Button;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/commonwidgets/databinding/ItemAnnotationButtonBinding;", "binding", "Lru/ozon/app/android/commonwidgets/databinding/ItemAnnotationButtonBinding;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ButtonViewHolder extends RecyclerView.C {

        @NotNull
        private final ItemAnnotationButtonBinding binding;

        @NotNull
        private final View containerView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ButtonViewHolder(@NotNull View containerView) {
            super(containerView);
            Intrinsics.checkNotNullParameter(containerView, "containerView");
            this.containerView = containerView;
            ItemAnnotationButtonBinding bind = ItemAnnotationButtonBinding.bind(containerView);
            Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
            this.binding = bind;
            View findViewById = bind.buttonBa.findViewById(R$id.buttonAtomTitleTv);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
            Context context = containerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            setSelectColor((TextView) findViewById, context).setEllipsize(TextUtils.TruncateAt.MIDDLE);
        }

        private final TextView setSelectColor(TextView textView, Context context) {
            if (!AppTypeResolver.INSTANCE.isSelect(context)) {
                return textView;
            }
            textView.setTextColor(ThemeExtKt.themeColor(context, R$attr.textLightKey));
            return textView;
        }

        public final void bind(@NotNull Button item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
            ButtonAtom buttonAtom = this.binding.buttonBa;
            buttonAtom.setOnAction(actionHandler);
            buttonAtom.bind(item);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnnotationButtonsAdapter(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
        this.items = K.f71697a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return this.items.size();
    }

    public final void setItems(@NotNull List<Button> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.items = value;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ButtonViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.items.get(position), this.actionHandler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ButtonViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ButtonViewHolder(ViewGroupExtKt.inflate(parent, R$layout.item_annotation_button));
    }
}
