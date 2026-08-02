package ru.ozon.app.android.regulardraw.widgets.morkovskMenu.presentation;

import CD.a;
import Sc.InterfaceC4008j;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.regulardraw.R$style;
import ru.ozon.app.android.regulardraw.databinding.ItemMorkovskMenuBinding;
import ru.ozon.app.android.regulardraw.utils.UtilKt;
import ru.ozon.app.android.regulardraw.widgets.morkovskMenu.data.MorkovskMenuIconVO;
import ru.ozon.app.android.regulardraw.widgets.morkovskMenu.data.MorkovskMenuItemVO;
import ru.ozon.app.android.regulardraw.widgets.morkovskMenu.data.MorkovskMenuTextVO;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/presentation/MorkovskMenuAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/presentation/MorkovskMenuAdapter$MorkovskItemHolder;", "", "Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuItemVO;", "items", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "action", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/presentation/MorkovskMenuAdapter$MorkovskItemHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/presentation/MorkovskMenuAdapter$MorkovskItemHolder;I)V", "getItemCount", "()I", "Ljava/util/List;", "Lkotlin/jvm/functions/Function1;", "MorkovskItemHolder", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MorkovskMenuAdapter extends RecyclerView.g<MorkovskItemHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> action;

    @NotNull
    private final List<MorkovskMenuItemVO> items;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000f\u001a\u00020\u0006*\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u0006*\u00020\u00112\u0006\u0010\f\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001b\u0010 \u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/presentation/MorkovskMenuAdapter$MorkovskItemHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/regulardraw/databinding/ItemMorkovskMenuBinding;", "view", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lru/ozon/app/android/regulardraw/databinding/ItemMorkovskMenuBinding;Lkotlin/jvm/functions/Function1;)V", "Landroidx/appcompat/widget/AppCompatTextView;", "Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuTextVO;", "item", "", "maximumWidth", "bindTitle", "(Landroidx/appcompat/widget/AppCompatTextView;Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuTextVO;Ljava/lang/Integer;)V", "Landroidx/appcompat/widget/AppCompatImageView;", "Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuIconVO;", "bindOrGone", "(Landroidx/appcompat/widget/AppCompatImageView;Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuIconVO;)V", "Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuItemVO;", "bind", "(Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuItemVO;)V", "Lru/ozon/app/android/regulardraw/databinding/ItemMorkovskMenuBinding;", "Lkotlin/jvm/functions/Function1;", "boundData", "Lru/ozon/app/android/regulardraw/widgets/morkovskMenu/data/MorkovskMenuItemVO;", "screenWidth$delegate", "LSc/j;", "getScreenWidth", "()I", "screenWidth", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MorkovskItemHolder extends RecyclerView.C {

        @NotNull
        private final Function1<AtomAction, Unit> actionHandler;
        private MorkovskMenuItemVO boundData;

        /* renamed from: screenWidth$delegate, reason: from kotlin metadata */
        @NotNull
        private final InterfaceC4008j screenWidth;

        @NotNull
        private final ItemMorkovskMenuBinding view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public MorkovskItemHolder(@NotNull ItemMorkovskMenuBinding view, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
            super(view.getConstraintLayout());
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
            this.view = view;
            this.actionHandler = actionHandler;
            this.screenWidth = LazyUtilsKt.unsafeLazy(new MorkovskMenuAdapter$MorkovskItemHolder$screenWidth$2(this));
            view.getConstraintLayout().setOnClickListener(new a(this, 6));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$0(MorkovskItemHolder morkovskItemHolder, View view) {
            AtomAction action;
            MorkovskMenuItemVO morkovskMenuItemVO = morkovskItemHolder.boundData;
            if (morkovskMenuItemVO == null || (action = morkovskMenuItemVO.getAction()) == null) {
                return;
            }
            morkovskItemHolder.actionHandler.invoke(action);
        }

        private final void bindOrGone(AppCompatImageView appCompatImageView, MorkovskMenuIconVO morkovskMenuIconVO) {
            ImageViewExtKt.load$default(appCompatImageView, morkovskMenuIconVO.getIcon(), null, null, null, null, false, null, 126, null);
            String tintColor = morkovskMenuIconVO.getTintColor();
            Context context = appCompatImageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ThemeExtKt.tint(appCompatImageView, Integer.valueOf(UtilKt.parseColor(tintColor, context)));
        }

        private final void bindTitle(AppCompatTextView appCompatTextView, MorkovskMenuTextVO morkovskMenuTextVO, Integer num) {
            appCompatTextView.setVisibility(morkovskMenuTextVO != null ? 0 : 8);
            if (morkovskMenuTextVO == null) {
                return;
            }
            Context context = appCompatTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            TextViewExtKt.applyStyle(appCompatTextView, context, R$style.Text_Body_Large);
            if (num != null) {
                appCompatTextView.setMaxWidth(num.intValue());
            }
            appCompatTextView.setText(morkovskMenuTextVO.getText());
            String tintColor = morkovskMenuTextVO.getTintColor();
            Context context2 = appCompatTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            appCompatTextView.setTextColor(UtilKt.parseColor(tintColor, context2));
        }

        static /* synthetic */ void bindTitle$default(MorkovskItemHolder morkovskItemHolder, AppCompatTextView appCompatTextView, MorkovskMenuTextVO morkovskMenuTextVO, Integer num, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                num = null;
            }
            morkovskItemHolder.bindTitle(appCompatTextView, morkovskMenuTextVO, num);
        }

        private final int getScreenWidth() {
            return ((Number) this.screenWidth.getValue()).intValue();
        }

        public final void bind(@NotNull MorkovskMenuItemVO item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.boundData = item;
            AppCompatImageView icon = this.view.icon;
            Intrinsics.checkNotNullExpressionValue(icon, "icon");
            bindOrGone(icon, item.getIcon());
            AppCompatTextView menuText = this.view.menuText;
            Intrinsics.checkNotNullExpressionValue(menuText, "menuText");
            bindTitle$default(this, menuText, item.getTitle(), null, 2, null);
            AppCompatTextView menuInfo = this.view.menuInfo;
            Intrinsics.checkNotNullExpressionValue(menuInfo, "menuInfo");
            bindTitle(menuInfo, item.getInfo(), Integer.valueOf(getScreenWidth() / 2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MorkovskMenuAdapter(@NotNull List<MorkovskMenuItemVO> items, @NotNull Function1<? super AtomAction, Unit> action) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(action, "action");
        this.items = items;
        this.action = action;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getCardsCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull MorkovskItemHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.items.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public MorkovskItemHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemMorkovskMenuBinding inflate = ItemMorkovskMenuBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        return new MorkovskItemHolder(inflate, this.action);
    }
}
