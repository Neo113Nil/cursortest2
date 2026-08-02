package ru.ozon.app.android.abtool.presentation.features.recycler;

import Ej.b;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.domain.ValueType;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 *2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001:\u0002*+B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R6\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR6\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR0\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0010\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lru/ozon/app/android/abtool/presentation/features/recycler/AbToggleAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/abtool/presentation/features/recycler/ListItem;", "Lru/ozon/app/android/abtool/presentation/features/recycler/BaseHolder;", "<init>", "()V", "", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/abtool/presentation/features/recycler/BaseHolder;", "holder", "", "onBindViewHolder", "(Lru/ozon/app/android/abtool/presentation/features/recycler/BaseHolder;I)V", "Lru/ozon/app/android/abtool/presentation/features/recycler/EditStateCache;", "editStateCache", "Lru/ozon/app/android/abtool/presentation/features/recycler/EditStateCache;", "Lkotlin/Function2;", "Lru/ozon/app/android/abtool/presentation/features/recycler/FeatureItem;", "", "onLocalValueChangeListener", "Lkotlin/jvm/functions/Function2;", "getOnLocalValueChangeListener", "()Lkotlin/jvm/functions/Function2;", "setOnLocalValueChangeListener", "(Lkotlin/jvm/functions/Function2;)V", "", "onToggleChangeListener", "getOnToggleChangeListener", "setOnToggleChangeListener", "Lkotlin/Function1;", "onResetClickListener", "Lkotlin/jvm/functions/Function1;", "getOnResetClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnResetClickListener", "(Lkotlin/jvm/functions/Function1;)V", "Companion", "FeatureEntitiesDiffCallback", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AbToggleAdapter extends t<ListItem, BaseHolder<ListItem>> {

    @NotNull
    private final EditStateCache editStateCache;
    private Function2<? super FeatureItem, ? super String, Unit> onLocalValueChangeListener;
    private Function1<? super String, Unit> onResetClickListener;
    private Function2<? super FeatureItem, ? super Boolean, Unit> onToggleChangeListener;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/abtool/presentation/features/recycler/AbToggleAdapter$FeatureEntitiesDiffCallback;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/abtool/presentation/features/recycler/ListItem;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/app/android/abtool/presentation/features/recycler/ListItem;Lru/ozon/app/android/abtool/presentation/features/recycler/ListItem;)Z", "areContentsTheSame", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class FeatureEntitiesDiffCallback extends i.d<ListItem> {
        @Override // androidx.recyclerview.widget.i.d
        public boolean areContentsTheSame(@NotNull ListItem oldItem, @NotNull ListItem newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.i.d
        public boolean areItemsTheSame(@NotNull ListItem oldItem, @NotNull ListItem newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem.getTitle(), newItem.getTitle());
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ValueType.values().length];
            try {
                iArr[ValueType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ValueType.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ValueType.INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ValueType.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ValueType.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AbToggleAdapter() {
        super(new FeatureEntitiesDiffCallback());
        this.editStateCache = new EditStateCache();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        ListItem item = getItem(position);
        if (item instanceof ServiceHeader) {
            return -1;
        }
        if (!(item instanceof FeatureItem)) {
            throw new IllegalStateException("Unknown view type");
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[((FeatureItem) item).getFeatureDebugModel().getValueType().ordinal()];
        if (i11 == 1) {
            return 0;
        }
        if (i11 == 2) {
            return 2;
        }
        if (i11 == 3 || i11 == 4 || i11 == 5) {
            return 1;
        }
        throw new IllegalStateException("Unknown view type");
    }

    public final void setOnLocalValueChangeListener(Function2<? super FeatureItem, ? super String, Unit> function2) {
        this.onLocalValueChangeListener = function2;
    }

    public final void setOnResetClickListener(Function1<? super String, Unit> function1) {
        this.onResetClickListener = function1;
    }

    public final void setOnToggleChangeListener(Function2<? super FeatureItem, ? super Boolean, Unit> function2) {
        this.onToggleChangeListener = function2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull BaseHolder<ListItem> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ListItem item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public BaseHolder<ListItem> onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == -1) {
            return new HeaderViewHolder(parent);
        }
        if (viewType == 0) {
            return new BooleanAbToggleHolder(parent, this.onToggleChangeListener, this.onResetClickListener);
        }
        if (viewType == 1) {
            return new NumberAbToggleHolder(parent, this.onResetClickListener, this.onLocalValueChangeListener, this.editStateCache);
        }
        if (viewType == 2) {
            return new StringAbToggleHolder(parent, this.onResetClickListener, this.onLocalValueChangeListener, this.editStateCache);
        }
        throw new IllegalStateException(b.a(viewType, "Unknown view type - "));
    }
}
