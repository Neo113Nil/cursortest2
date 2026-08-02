package ru.ozon.app.android.session.auth.presentation.viewHolder.adapter;

import Sc.o;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.R$layout;
import ru.ozon.app.android.session.auth.data.AuthVO;
import ru.ozon.app.android.session.auth.data.FieldAction;
import ru.ozon.app.android.session.auth.presentation.viewHolder.FieldVH;
import ru.ozon.app.android.session.auth.presentation.viewHolder.InputFieldVH;
import ru.ozon.app.android.session.auth.presentation.viewHolder.PasswordFieldVH;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ#\u0010!\u001a\u00020\u00052\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001d2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/session/auth/presentation/viewHolder/adapter/FieldsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/session/auth/presentation/viewHolder/FieldVH;", "Lkotlin/Function1;", "Lru/ozon/app/android/session/auth/data/FieldAction;", "", "onAction", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "position", "Lru/ozon/app/android/session/auth/data/AuthVO$Input;", "getItem", "(I)Lru/ozon/app/android/session/auth/data/AuthVO$Input;", "getItemCount", "()I", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/session/auth/presentation/viewHolder/FieldVH;", "holder", "onBindViewHolder", "(Lru/ozon/app/android/session/auth/presentation/viewHolder/FieldVH;I)V", "onViewAttachedToWindow", "(Lru/ozon/app/android/session/auth/presentation/viewHolder/FieldVH;)V", "onViewDetachedFromWindow", "", "items", "", "silent", "submitList", "(Ljava/util/List;Z)V", "Lkotlin/jvm/functions/Function1;", "", "Ljava/util/List;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FieldsAdapter extends RecyclerView.g<FieldVH> {

    @NotNull
    private final List<AuthVO.Input> items;

    @NotNull
    private final Function1<FieldAction, Unit> onAction;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AuthVO.Input.ViewType.values().length];
            try {
                iArr[AuthVO.Input.ViewType.INPUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AuthVO.Input.ViewType.PASSWORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FieldsAdapter(@NotNull Function1<? super FieldAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.onAction = onAction;
        this.items = new ArrayList();
    }

    private final AuthVO.Input getItem(int position) {
        return this.items.get(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getShimmersCount() {
        return this.items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return getItem(position).getViewType().getId();
    }

    public final void submitList(@NotNull List<AuthVO.Input> items, boolean silent) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items.clear();
        this.items.addAll(items);
        if (silent) {
            return;
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull FieldVH holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(getItem(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public FieldVH onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        for (AuthVO.Input.ViewType viewType2 : AuthVO.Input.ViewType.values()) {
            if (viewType2.getId() == viewType) {
                int i11 = WhenMappings.$EnumSwitchMapping$0[viewType2.ordinal()];
                if (i11 == 1) {
                    return new InputFieldVH(ViewGroupExtKt.inflate(parent, R$layout.item_auth_field_input));
                }
                if (i11 == 2) {
                    return new PasswordFieldVH(ViewGroupExtKt.inflate(parent, R$layout.item_auth_field_input_password));
                }
                throw new o();
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onViewAttachedToWindow(@NotNull FieldVH holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.setOnAction(this.onAction);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onViewDetachedFromWindow(@NotNull FieldVH holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.clearOnAction();
    }
}
