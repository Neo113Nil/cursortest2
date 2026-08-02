package ru.ozon.fintech.features.offline.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Keep;
import androidx.recyclerview.widget.RecyclerView;
import com.detmir.recycli.adapters.RecyclerBinder;
import com.detmir.recycli.adapters.RecyclerItem;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.offline.ui.accountcard.AccountCardState;
import ru.ozon.fintech.features.offline.ui.accountcard.AccountCardView;
import ru.ozon.fintech.features.offline.ui.bank.OfflineBankState;
import ru.ozon.fintech.features.offline.ui.bank.OfflineBankView;
import ru.ozon.fintech.features.offline.ui.contact.OfflineContactState;
import ru.ozon.fintech.features.offline.ui.contact.OfflineContactView;
import ru.ozon.fintech.features.offline.ui.my.OfflineMyContactState;
import ru.ozon.fintech.features.offline.ui.my.OfflineMyContactView;
import ru.ozon.fintech.features.offline.ui.nobank.OfflineNoBankState;
import ru.ozon.fintech.features.offline.ui.nobank.OfflineNoBankView;
import ru.ozon.fintech.features.offline.ui.permisson.OfflinePermissionContactState;
import ru.ozon.fintech.features.offline.ui.permisson.OfflinePermissionContactView;

@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R&\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/fintech/features/offline/ui/RecyclerBinderImpl;", "Lcom/detmir/recycli/adapters/RecyclerBinder;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "Landroidx/recyclerview/widget/RecyclerView$C;", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$C;", "holder", "position", "", "state", "Lcom/detmir/recycli/adapters/RecyclerItem;", "item", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$C;ILjava/lang/String;Lcom/detmir/recycli/adapters/RecyclerItem;)V", "recyclerItemState", "getItemViewType", "(Ljava/lang/String;)I", "Ljava/util/HashMap;", "stateToIndexMap", "Ljava/util/HashMap;", "getStateToIndexMap", "()Ljava/util/HashMap;", "offline_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecyclerBinderImpl implements RecyclerBinder {

    @NotNull
    private final HashMap<String, Integer> stateToIndexMap = U.f(new Pair("ru.ozon.fintech.features.offline.ui.accountcard.AccountCardState#default", 0), new Pair("ru.ozon.fintech.features.offline.ui.accountcard.AccountCardState#ru.ozon.fintech.features.offline.ui.accountcard.AccountCardView", 0), new Pair("ru.ozon.fintech.features.offline.ui.bank.OfflineBankState#default", 1), new Pair("ru.ozon.fintech.features.offline.ui.bank.OfflineBankState#ru.ozon.fintech.features.offline.ui.bank.OfflineBankView", 1), new Pair("ru.ozon.fintech.features.offline.ui.contact.OfflineContactState#default", 2), new Pair("ru.ozon.fintech.features.offline.ui.contact.OfflineContactState#ru.ozon.fintech.features.offline.ui.contact.OfflineContactView", 2), new Pair("ru.ozon.fintech.features.offline.ui.my.OfflineMyContactState#default", 3), new Pair("ru.ozon.fintech.features.offline.ui.my.OfflineMyContactState#ru.ozon.fintech.features.offline.ui.my.OfflineMyContactView", 3), new Pair("ru.ozon.fintech.features.offline.ui.nobank.OfflineNoBankState#default", 4), new Pair("ru.ozon.fintech.features.offline.ui.nobank.OfflineNoBankState#ru.ozon.fintech.features.offline.ui.nobank.OfflineNoBankView", 4), new Pair("ru.ozon.fintech.features.offline.ui.permisson.OfflinePermissionContactState#default", 5), new Pair("ru.ozon.fintech.features.offline.ui.permisson.OfflinePermissionContactState#ru.ozon.fintech.features.offline.ui.permisson.OfflinePermissionContactView", 5));

    public static final class a extends RecyclerView.C {
    }

    public static final class b extends RecyclerView.C {
    }

    @Override // com.detmir.recycli.adapters.RecyclerBinder
    public int getItemViewType(@NotNull String recyclerItemState) {
        Intrinsics.checkNotNullParameter(recyclerItemState, "recyclerItemState");
        Integer num = getStateToIndexMap().get(recyclerItemState);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // com.detmir.recycli.adapters.RecyclerBinder
    @NotNull
    public HashMap<String, Integer> getStateToIndexMap() {
        return this.stateToIndexMap;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // com.detmir.recycli.adapters.RecyclerBinder
    public void onBindViewHolder(@NotNull RecyclerView.C holder, int position, @NotNull String state, @NotNull RecyclerItem item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(item, "item");
        switch (state.hashCode()) {
            case -1863113634:
                if (state.equals("ru.ozon.fintech.features.offline.ui.bank.OfflineBankState#default")) {
                    View view = holder.itemView;
                    Intrinsics.g(view, "null cannot be cast to non-null type ru.ozon.fintech.features.offline.ui.bank.OfflineBankView");
                    ((OfflineBankView) view).bindState((OfflineBankState) item);
                    break;
                }
                break;
            case -594028231:
                if (state.equals("ru.ozon.fintech.features.offline.ui.bank.OfflineBankState#ru.ozon.fintech.features.offline.ui.bank.OfflineBankView")) {
                    View view2 = holder.itemView;
                    Intrinsics.g(view2, "null cannot be cast to non-null type ru.ozon.fintech.features.offline.ui.bank.OfflineBankView");
                    ((OfflineBankView) view2).bindState((OfflineBankState) item);
                    break;
                }
                break;
            case -469849069:
                if (state.equals("ru.ozon.fintech.features.offline.ui.my.OfflineMyContactState#ru.ozon.fintech.features.offline.ui.my.OfflineMyContactView")) {
                    View view3 = holder.itemView;
                    Intrinsics.g(view3, "null cannot be cast to non-null type ru.ozon.fintech.features.offline.ui.my.OfflineMyContactView");
                    ((OfflineMyContactView) view3).bindState((OfflineMyContactState) item);
                    break;
                }
                break;
            case -424252547:
                if (state.equals("ru.ozon.fintech.features.offline.ui.nobank.OfflineNoBankState#ru.ozon.fintech.features.offline.ui.nobank.OfflineNoBankView")) {
                    View view4 = holder.itemView;
                    Intrinsics.g(view4, "null cannot be cast to non-null type ru.ozon.fintech.features.offline.ui.nobank.OfflineNoBankView");
                    ((OfflineNoBankView) view4).bindState((OfflineNoBankState) item);
                    break;
                }
                break;
            case -401151257:
                if (state.equals("ru.ozon.fintech.features.offline.ui.permisson.OfflinePermissionContactState#default")) {
                    View view5 = holder.itemView;
                    Intrinsics.g(view5, "null cannot be cast to non-null type ru.ozon.fintech.features.offline.ui.permisson.OfflinePermissionContactView");
                    ((OfflinePermissionContactView) view5).bindState((OfflinePermissionContactState) item);
                    break;
                }
                break;
            case -364713568:
                if (state.equals("ru.ozon.fintech.features.offline.ui.contact.OfflineContactState#default")) {
                    View view6 = holder.itemView;
                    Intrinsics.g(view6, "null cannot be cast to non-null type ru.ozon.fintech.features.offline.ui.contact.OfflineContactView");
                    ((OfflineContactView) view6).bindState((OfflineContactState) item);
                    break;
                }
                break;
            case 94684711:
                if (state.equals("ru.ozon.fintech.features.offline.ui.accountcard.AccountCardState#default")) {
                    View view7 = holder.itemView;
                    Intrinsics.g(view7, "null cannot be cast to non-null type ru.ozon.fintech.features.offline.ui.accountcard.AccountCardView");
                    ((AccountCardView) view7).bindState((AccountCardState) item);
                    break;
                }
                break;
            case 1035609011:
                if (state.equals("ru.ozon.fintech.features.offline.ui.accountcard.AccountCardState#ru.ozon.fintech.features.offline.ui.accountcard.AccountCardView")) {
                    View view8 = holder.itemView;
                    Intrinsics.g(view8, "null cannot be cast to non-null type ru.ozon.fintech.features.offline.ui.accountcard.AccountCardView");
                    ((AccountCardView) view8).bindState((AccountCardState) item);
                    break;
                }
                break;
            case 1093586172:
                if (state.equals("ru.ozon.fintech.features.offline.ui.nobank.OfflineNoBankState#default")) {
                    View view9 = holder.itemView;
                    Intrinsics.g(view9, "null cannot be cast to non-null type ru.ozon.fintech.features.offline.ui.nobank.OfflineNoBankView");
                    ((OfflineNoBankView) view9).bindState((OfflineNoBankState) item);
                    break;
                }
                break;
            case 1280684711:
                if (state.equals("ru.ozon.fintech.features.offline.ui.permisson.OfflinePermissionContactState#ru.ozon.fintech.features.offline.ui.permisson.OfflinePermissionContactView")) {
                    View view10 = holder.itemView;
                    Intrinsics.g(view10, "null cannot be cast to non-null type ru.ozon.fintech.features.offline.ui.permisson.OfflinePermissionContactView");
                    ((OfflinePermissionContactView) view10).bindState((OfflinePermissionContactState) item);
                    break;
                }
                break;
            case 1838992373:
                if (state.equals("ru.ozon.fintech.features.offline.ui.contact.OfflineContactState#ru.ozon.fintech.features.offline.ui.contact.OfflineContactView")) {
                    View view11 = holder.itemView;
                    Intrinsics.g(view11, "null cannot be cast to non-null type ru.ozon.fintech.features.offline.ui.contact.OfflineContactView");
                    ((OfflineContactView) view11).bindState((OfflineContactState) item);
                    break;
                }
                break;
            case 1890894400:
                if (state.equals("ru.ozon.fintech.features.offline.ui.my.OfflineMyContactState#default")) {
                    View view12 = holder.itemView;
                    Intrinsics.g(view12, "null cannot be cast to non-null type ru.ozon.fintech.features.offline.ui.my.OfflineMyContactView");
                    ((OfflineMyContactView) view12).bindState((OfflineMyContactState) item);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, ru.ozon.fintech.features.offline.ui.nobank.OfflineNoBankView] */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, ru.ozon.fintech.features.offline.ui.my.OfflineMyContactView] */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, ru.ozon.fintech.features.offline.ui.contact.OfflineContactView] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, ru.ozon.fintech.features.offline.ui.permisson.OfflinePermissionContactView] */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, ru.ozon.fintech.features.offline.ui.bank.OfflineBankView] */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, ru.ozon.fintech.features.offline.ui.accountcard.AccountCardView] */
    @Override // com.detmir.recycli.adapters.RecyclerBinder
    @NotNull
    public RecyclerView.C onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        M m11 = new M();
        if (viewType == 0) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            m11.f71787a = new AccountCardView(context, null, 0, 6, null);
        } else if (viewType == 1) {
            Context context2 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            m11.f71787a = new OfflineBankView(context2, null, 0, 6, null);
        } else if (viewType == 2) {
            Context context3 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            m11.f71787a = new OfflineContactView(context3, null, 0, 6, null);
        } else if (viewType == 3) {
            Context context4 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            m11.f71787a = new OfflineMyContactView(context4, null, 0, 6, null);
        } else if (viewType == 4) {
            Context context5 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            m11.f71787a = new OfflineNoBankView(context5, null, 0, 6, null);
        } else {
            if (viewType != 5) {
                throw new Exception("Recyclii can't find view for a RecyclerItem");
            }
            Context context6 = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
            m11.f71787a = new OfflinePermissionContactView(context6, null, 0, 6, null);
        }
        return m11.f71787a != 0 ? new a((View) m11.f71787a) : new b(new View(parent.getContext()));
    }
}
