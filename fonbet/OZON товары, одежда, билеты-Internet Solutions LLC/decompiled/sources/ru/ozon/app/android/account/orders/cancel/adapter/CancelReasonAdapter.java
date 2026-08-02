package ru.ozon.app.android.account.orders.cancel.adapter;

import Sc.o;
import Ve.C4636t5;
import Xc.a;
import Xc.b;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.cancel.adapter.holders.AnnotationVH;
import ru.ozon.app.android.account.orders.cancel.adapter.holders.CommentVH;
import ru.ozon.app.android.account.orders.cancel.adapter.holders.ReasonVH;
import ru.ozon.app.android.account.orders.cancel.presentation.CancelReasonVO;
import ru.ozon.app.android.cs_orders.R$layout;
import ru.ozon.app.android.cs_orders.databinding.ItemAnnotationBinding;
import ru.ozon.app.android.cs_orders.databinding.ItemCancelReasonBinding;
import ru.ozon.app.android.cs_orders.databinding.ItemDescribeProblemBinding;
import ru.ozon.app.android.uikit.view.recycler.adapter.BaseViewHolder;
import ru.ozon.app.android.uikit.view.recycler.adapter.lifecycle.LifecycleListAdapter;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0002\b\t\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001:\u0001\u001dB#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0017\u001a\u00020\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0017\u001a\u00020\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/account/orders/cancel/adapter/CancelReasonAdapter;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleListAdapter;", "Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVO;", "Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;", "Landroidx/lifecycle/J;", "containerViewLifecycleOwner", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Landroidx/lifecycle/J;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;", "holder", "position", "", "", "payloads", "onBindViewHolder", "(Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;ILjava/util/List;)V", "(Lru/ozon/app/android/uikit/view/recycler/adapter/BaseViewHolder;I)V", "getItemViewType", "(I)I", "Lkotlin/jvm/functions/Function1;", "CancelReasonViewType", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CancelReasonAdapter extends LifecycleListAdapter<CancelReasonVO, BaseViewHolder<? super CancelReasonVO>> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0013\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lru/ozon/app/android/account/orders/cancel/adapter/CancelReasonAdapter$CancelReasonViewType;", "", "viewType", "", "<init>", "(Ljava/lang/String;II)V", "getViewType", "()I", "REASON", "COMMENT", "ANNOTATION", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CancelReasonViewType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ CancelReasonViewType[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;

        @NotNull
        private static final Map<Integer, CancelReasonViewType> map;
        private final int viewType;
        public static final CancelReasonViewType REASON = new CancelReasonViewType("REASON", 0, R$layout.item_cancel_reason);
        public static final CancelReasonViewType COMMENT = new CancelReasonViewType("COMMENT", 1, R$layout.item_describe_problem);
        public static final CancelReasonViewType ANNOTATION = new CancelReasonViewType("ANNOTATION", 2, R$layout.item_annotation);

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/account/orders/cancel/adapter/CancelReasonAdapter$CancelReasonViewType$Companion;", "", "<init>", "()V", "map", "", "", "Lru/ozon/app/android/account/orders/cancel/adapter/CancelReasonAdapter$CancelReasonViewType;", "fromLayoutRes", "layoutRes", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final CancelReasonViewType fromLayoutRes(int layoutRes) {
                return (CancelReasonViewType) U.e(CancelReasonViewType.map, Integer.valueOf(layoutRes));
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ CancelReasonViewType[] $values() {
            return new CancelReasonViewType[]{REASON, COMMENT, ANNOTATION};
        }

        static {
            CancelReasonViewType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
            INSTANCE = new Companion(null);
            CancelReasonViewType[] values = values();
            int h11 = U.h(values.length);
            LinkedHashMap linkedHashMap = new LinkedHashMap(h11 < 16 ? 16 : h11);
            for (CancelReasonViewType cancelReasonViewType : values) {
                linkedHashMap.put(Integer.valueOf(cancelReasonViewType.viewType), cancelReasonViewType);
            }
            map = linkedHashMap;
        }

        private CancelReasonViewType(String str, int i11, int i12) {
            this.viewType = i12;
        }

        public static CancelReasonViewType valueOf(String str) {
            return (CancelReasonViewType) Enum.valueOf(CancelReasonViewType.class, str);
        }

        public static CancelReasonViewType[] values() {
            return (CancelReasonViewType[]) $VALUES.clone();
        }

        public final int getViewType() {
            return this.viewType;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CancelReasonViewType.values().length];
            try {
                iArr[CancelReasonViewType.REASON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CancelReasonViewType.COMMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CancelReasonViewType.ANNOTATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CancelReasonAdapter(@NotNull J containerViewLifecycleOwner, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(new CancelReasonItemCallback(), containerViewLifecycleOwner, null, 4, null);
        Intrinsics.checkNotNullParameter(containerViewLifecycleOwner, "containerViewLifecycleOwner");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.actionHandler = actionHandler;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        CancelReasonViewType cancelReasonViewType;
        CancelReasonVO item = getItem(position);
        if (item instanceof CancelReasonVO.Reason) {
            cancelReasonViewType = CancelReasonViewType.REASON;
        } else if (item instanceof CancelReasonVO.Comment) {
            cancelReasonViewType = CancelReasonViewType.COMMENT;
        } else {
            if (!(item instanceof CancelReasonVO.Annotation)) {
                throw new o();
            }
            cancelReasonViewType = CancelReasonViewType.ANNOTATION;
        }
        return cancelReasonViewType.getViewType();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public BaseViewHolder<CancelReasonVO> onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        LayoutInflater a11 = C4636t5.a(parent, "parent");
        int i11 = WhenMappings.$EnumSwitchMapping$0[CancelReasonViewType.INSTANCE.fromLayoutRes(viewType).ordinal()];
        if (i11 == 1) {
            ItemCancelReasonBinding inflate = ItemCancelReasonBinding.inflate(a11, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
            return new ReasonVH(inflate, this.actionHandler);
        }
        if (i11 == 2) {
            ItemDescribeProblemBinding inflate2 = ItemDescribeProblemBinding.inflate(a11, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate2, "inflate(...)");
            return new CommentVH(inflate2, this.actionHandler);
        }
        if (i11 != 3) {
            throw new o();
        }
        ItemAnnotationBinding inflate3 = ItemAnnotationBinding.inflate(a11, parent, false);
        Intrinsics.checkNotNullExpressionValue(inflate3, "inflate(...)");
        return new AnnotationVH(inflate3, this.actionHandler);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.C c11, int i11, List list) {
        onBindViewHolder((BaseViewHolder<? super CancelReasonVO>) c11, i11, (List<Object>) list);
    }

    public void onBindViewHolder(@NotNull BaseViewHolder<? super CancelReasonVO> holder, int position, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        CancelReasonVO item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item, payloads);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull BaseViewHolder<? super CancelReasonVO> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        onBindViewHolder(holder, position, (List<Object>) new ArrayList());
    }
}
