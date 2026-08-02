package ru.ozon.app.android.returns.details.presentation.viewHolder.delegate.components;

import Sc.o;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.returns.details.data.dto.ReturnDetailsDto;
import ru.ozon.app.android.returns.details.data.dto.ReturnMethodDto;
import ru.ozon.app.android.returns.details.data.dto.ReturnTrackingInfoDto;
import ru.ozon.app.android.returns.details.presentation.viewModel.ReturnDetailsViewModel;
import ru.ozon.app.android.returns.details.presentation.views.ReturnMethodView;
import ru.ozon.app.android.returns.details.presentation.views.ReturnTrackingInfoView;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001e\u001fB/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR$\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001d¨\u0006 "}, d2 = {"Lru/ozon/app/android/returns/details/presentation/viewHolder/delegate/components/ComponentsAdapter;", "Landroidx/recyclerview/widget/t;", "Lru/ozon/app/android/returns/details/data/dto/ReturnDetailsDto$Component;", "Lru/ozon/app/android/returns/details/presentation/viewHolder/delegate/components/ComponentViewHolder;", "Lru/ozon/app/android/returns/details/presentation/viewModel/ReturnDetailsViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "<init>", "(Lru/ozon/app/android/returns/details/presentation/viewModel/ReturnDetailsViewModel;Lru/ozon/app/android/composer/ComposerReferences;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/returns/details/presentation/viewHolder/delegate/components/ComponentViewHolder;", "holder", "position", "onBindViewHolder", "(Lru/ozon/app/android/returns/details/presentation/viewHolder/delegate/components/ComponentViewHolder;I)V", "getItemViewType", "(I)I", "Lru/ozon/app/android/returns/details/presentation/viewModel/ReturnDetailsViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/jvm/functions/Function1;", "DiffCallback", "ViewType", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ComponentsAdapter extends t<ReturnDetailsDto.Component, ComponentViewHolder> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final ReturnDetailsViewModel viewModel;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/returns/details/presentation/viewHolder/delegate/components/ComponentsAdapter$DiffCallback;", "Landroidx/recyclerview/widget/i$d;", "Lru/ozon/app/android/returns/details/data/dto/ReturnDetailsDto$Component;", "<init>", "()V", "oldItem", "newItem", "", "areItemsTheSame", "(Lru/ozon/app/android/returns/details/data/dto/ReturnDetailsDto$Component;Lru/ozon/app/android/returns/details/data/dto/ReturnDetailsDto$Component;)Z", "areContentsTheSame", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class DiffCallback extends i.d<ReturnDetailsDto.Component> {

        @NotNull
        public static final DiffCallback INSTANCE = new DiffCallback();

        private DiffCallback() {
        }

        @Override // androidx.recyclerview.widget.i.d
        public boolean areContentsTheSame(@NotNull ReturnDetailsDto.Component oldItem, @NotNull ReturnDetailsDto.Component newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.d(oldItem, newItem);
        }

        @Override // androidx.recyclerview.widget.i.d
        public boolean areItemsTheSame(@NotNull ReturnDetailsDto.Component oldItem, @NotNull ReturnDetailsDto.Component newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.getClass() == newItem.getClass();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/returns/details/presentation/viewHolder/delegate/components/ComponentsAdapter$ViewType;", "", "<init>", "(Ljava/lang/String;I)V", "RETURN_METHOD", "TRACKING_INFO", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class ViewType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ViewType[] $VALUES;
        public static final ViewType RETURN_METHOD = new ViewType("RETURN_METHOD", 0);
        public static final ViewType TRACKING_INFO = new ViewType("TRACKING_INFO", 1);

        private static final /* synthetic */ ViewType[] $values() {
            return new ViewType[]{RETURN_METHOD, TRACKING_INFO};
        }

        static {
            ViewType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ViewType(String str, int i11) {
        }

        @NotNull
        public static a<ViewType> getEntries() {
            return $ENTRIES;
        }

        public static ViewType valueOf(String str) {
            return (ViewType) Enum.valueOf(ViewType.class, str);
        }

        public static ViewType[] values() {
            return (ViewType[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ViewType.values().length];
            try {
                iArr[ViewType.RETURN_METHOD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ViewType.TRACKING_INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ComponentsAdapter(@NotNull ReturnDetailsViewModel viewModel, @NotNull ComposerReferences refs, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(DiffCallback.INSTANCE);
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.viewModel = viewModel;
        this.refs = refs;
        this.actionHandler = actionHandler;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        ViewType viewType;
        ReturnDetailsDto.Component item = getItem(position);
        if (item instanceof ReturnMethodDto) {
            viewType = ViewType.RETURN_METHOD;
        } else {
            if (!(item instanceof ReturnTrackingInfoDto)) {
                throw new o();
            }
            viewType = ViewType.TRACKING_INFO;
        }
        return viewType.ordinal();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull ComponentViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ReturnDetailsDto.Component item = getItem(position);
        if (item instanceof ReturnMethodDto) {
            ((ReturnMethodViewHolder) holder).bind((ReturnMethodDto) item);
        } else {
            if (!(item instanceof ReturnTrackingInfoDto)) {
                throw new o();
            }
            ((TrackingInfoViewHolder) holder).bind((ReturnTrackingInfoDto) item);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public ComponentViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        int i11 = WhenMappings.$EnumSwitchMapping$0[((ViewType) ViewType.getEntries().get(viewType)).ordinal()];
        if (i11 == 1) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return new ReturnMethodViewHolder(new ReturnMethodView(context, null, 0, 6, null), this.viewModel, this.refs, this.actionHandler);
        }
        if (i11 != 2) {
            throw new o();
        }
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return new TrackingInfoViewHolder(new ReturnTrackingInfoView(context2, null, 0, 0, 14, null));
    }
}
