package ru.ozon.app.android.returns.ui.presentation.flexImages;

import Sc.o;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.presentation.flexImages.ImageVI;
import ru.ozon.app.android.returns.ui.presentation.flexImages.imageView.DeletableImageView;
import ru.ozon.app.android.returns.ui.presentation.flexImages.imageView.SimpleImageView;
import ru.ozon.app.android.returns.ui.presentation.flexImages.viewHolder.DeletableImageViewHolder;
import ru.ozon.app.android.returns.ui.presentation.flexImages.viewHolder.SimpleImageViewHolder;
import ru.ozon.app.android.utils.WhenExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\u00002\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00100\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/returns/ui/presentation/flexImages/FlexImagesAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/returns/ui/presentation/flexImages/ImageVI;", "Landroidx/recyclerview/widget/RecyclerView$C;", "<init>", "()V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$C;", "holder", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$C;I)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "withAction", "(Lkotlin/jvm/functions/Function1;)Lru/ozon/app/android/returns/ui/presentation/flexImages/FlexImagesAdapter;", "getViewItemOrNull", "(I)Lru/ozon/app/android/returns/ui/presentation/flexImages/ImageVI;", "Lkotlin/jvm/functions/Function1;", "ViewType", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FlexImagesAdapter extends t<ImageVI, RecyclerView.C> {

    @NotNull
    private Function1<? super AtomAction, Unit> actionHandler;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/returns/ui/presentation/flexImages/FlexImagesAdapter$ViewType;", "", "<init>", "(Ljava/lang/String;I)V", "SIMPLE", "DELETABLE", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ViewType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ViewType[] $VALUES;
        public static final ViewType SIMPLE = new ViewType("SIMPLE", 0);
        public static final ViewType DELETABLE = new ViewType("DELETABLE", 1);

        private static final /* synthetic */ ViewType[] $values() {
            return new ViewType[]{SIMPLE, DELETABLE};
        }

        static {
            ViewType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ViewType(String str, int i11) {
        }

        public static ViewType valueOf(String str) {
            return (ViewType) Enum.valueOf(ViewType.class, str);
        }

        public static ViewType[] values() {
            return (ViewType[]) $VALUES.clone();
        }
    }

    public FlexImagesAdapter() {
        super(new i.d<ImageVI>() { // from class: ru.ozon.app.android.returns.ui.presentation.flexImages.FlexImagesAdapter.1
            @Override // androidx.recyclerview.widget.i.d
            public boolean areContentsTheSame(ImageVI oldItem, ImageVI newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.d(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.i.d
            public boolean areItemsTheSame(ImageVI oldItem, ImageVI newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return oldItem.getId() == newItem.getId();
            }
        });
        this.actionHandler = FlexImagesAdapter$actionHandler$1.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        int ordinal;
        ImageVI item = getItem(position);
        if (item instanceof ImageVI.Simple) {
            ordinal = ViewType.SIMPLE.ordinal();
        } else {
            if (!(item instanceof ImageVI.Deletable)) {
                throw new o();
            }
            ordinal = ViewType.DELETABLE.ordinal();
        }
        return ((Number) WhenExtKt.getExhaustive(Integer.valueOf(ordinal))).intValue();
    }

    public final ImageVI getViewItemOrNull(int position) {
        if (position < 0 || position >= getCardsCount()) {
            return null;
        }
        return getItem(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull RecyclerView.C holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ImageVI item = getItem(position);
        Unit unit = null;
        if (item instanceof ImageVI.Simple) {
            SimpleImageViewHolder simpleImageViewHolder = holder instanceof SimpleImageViewHolder ? (SimpleImageViewHolder) holder : null;
            if (simpleImageViewHolder != null) {
                simpleImageViewHolder.bind((ImageVI.Simple) item);
                unit = Unit.f71690a;
            }
        } else {
            if (!(item instanceof ImageVI.Deletable)) {
                throw new o();
            }
            DeletableImageViewHolder deletableImageViewHolder = holder instanceof DeletableImageViewHolder ? (DeletableImageViewHolder) holder : null;
            if (deletableImageViewHolder != null) {
                deletableImageViewHolder.bind((ImageVI.Deletable) item);
                unit = Unit.f71690a;
            }
        }
        WhenExtKt.getExhaustive(unit);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public RecyclerView.C onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Object deletableImageViewHolder;
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == ViewType.SIMPLE.ordinal()) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            deletableImageViewHolder = new SimpleImageViewHolder(new SimpleImageView(context, null, 0, 6, null), this.actionHandler);
        } else {
            if (viewType != ViewType.DELETABLE.ordinal()) {
                throw new IllegalArgumentException("invalid viewType in FlexImagesAdapter");
            }
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            deletableImageViewHolder = new DeletableImageViewHolder(new DeletableImageView(context2, null, 0, 6, null), this.actionHandler);
        }
        return (RecyclerView.C) WhenExtKt.getExhaustive(deletableImageViewHolder);
    }

    @NotNull
    public final FlexImagesAdapter withAction(@NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
        return this;
    }
}
