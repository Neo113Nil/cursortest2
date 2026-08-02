package hk0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C5468b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lk0.InterfaceC7968a;
import org.jetbrains.annotations.NotNull;

/* renamed from: hk0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6969b extends RecyclerView.g<d<? extends InterfaceC7968a>> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final e<? super d<? super InterfaceC7968a>, ? super InterfaceC7968a>[] f65627a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList f65628b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C5468b f65629c;

    /* renamed from: hk0.b$a */
    private static final class a extends d {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6969b(@NotNull e<? extends d<? extends InterfaceC7968a>, ? extends InterfaceC7968a>... delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f65627a = delegate;
        this.f65628b = new ArrayList();
        this.f65629c = new C5468b(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public final int getCardsCount() {
        return this.f65628b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final int getItemViewType(int i11) {
        InterfaceC7968a interfaceC7968a = (InterfaceC7968a) this.f65628b.get(i11);
        int itemType = interfaceC7968a.getItemType();
        for (e<? super d<? super InterfaceC7968a>, ? super InterfaceC7968a> eVar : this.f65627a) {
            eVar.onItemViewType(itemType, interfaceC7968a);
        }
        return itemType;
    }

    @NotNull
    protected final List<InterfaceC7968a> getItems() {
        return this.f65628b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onBindViewHolder(d<? extends InterfaceC7968a> dVar, int i11) {
        e<? super d<? super InterfaceC7968a>, ? super InterfaceC7968a> eVar;
        d<? extends InterfaceC7968a> holder = dVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        int itemViewType = holder.getItemViewType();
        e<? super d<? super InterfaceC7968a>, ? super InterfaceC7968a>[] eVarArr = this.f65627a;
        int length = eVarArr.length;
        int i12 = 0;
        while (true) {
            if (i12 >= length) {
                eVar = null;
                break;
            }
            eVar = eVarArr[i12];
            if (eVar.canBind(itemViewType)) {
                break;
            } else {
                i12++;
            }
        }
        if (eVar == null) {
            return;
        }
        eVar.bindViewHolder(holder, (InterfaceC7968a) this.f65628b.get(i11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final d<? extends InterfaceC7968a> onCreateViewHolder(ViewGroup parent, int i11) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        for (e<? super d<? super InterfaceC7968a>, ? super InterfaceC7968a> eVar : this.f65627a) {
            d createViewHolder = eVar.createViewHolder(parent, i11);
            d dVar = createViewHolder;
            if (createViewHolder == null) {
                dVar = null;
            }
            if (dVar != null) {
                return dVar;
            }
        }
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        return new a(new View(context));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onViewAttachedToWindow(d<? extends InterfaceC7968a> dVar) {
        d<? extends InterfaceC7968a> holder = dVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow(holder);
        holder.attach();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onViewDetachedFromWindow(d<? extends InterfaceC7968a> dVar) {
        d<? extends InterfaceC7968a> holder = dVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        holder.detach();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onViewRecycled(d<? extends InterfaceC7968a> dVar) {
        d<? extends InterfaceC7968a> holder = dVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewRecycled(holder);
        holder.recycle();
    }

    public void submitList(@NotNull List<? extends InterfaceC7968a> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        ArrayList arrayList = this.f65628b;
        i.c a11 = i.a(new C6970c(arrayList, list), false);
        Intrinsics.checkNotNullExpressionValue(a11, "calculateDiff(...)");
        arrayList.clear();
        arrayList.addAll(list);
        a11.b(this.f65629c);
    }
}
