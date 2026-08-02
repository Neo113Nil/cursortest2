package ru.ozon.app.android.debugmenu.analytics.ui;

import FK.b;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.debugmenu.R$id;
import ru.ozon.app.android.debugmenu.R$layout;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001c\u001dB%\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R(\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001b¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/debugmenu/analytics/ui/DataLayerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/debugmenu/analytics/ui/DataLayerAdapter$MainViewHolder;", "", "", "", "data", "Lru/ozon/app/android/debugmenu/analytics/ui/DataLayerAdapter$OnItemClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Ljava/util/Map;Lru/ozon/app/android/debugmenu/analytics/ui/DataLayerAdapter$OnItemClickListener;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/debugmenu/analytics/ui/DataLayerAdapter$MainViewHolder;", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/debugmenu/analytics/ui/DataLayerAdapter$MainViewHolder;I)V", "getItemCount", "()I", "Lru/ozon/app/android/debugmenu/analytics/ui/DataLayerAdapter$OnItemClickListener;", "", "Landroid/util/Pair;", "Ljava/util/List;", "MainViewHolder", "OnItemClickListener", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DataLayerAdapter extends RecyclerView.g<MainViewHolder> {

    @NotNull
    private final List<Pair<String, Object>> data;

    @NotNull
    private final OnItemClickListener listener;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\u00020\b2\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/debugmenu/analytics/ui/DataLayerAdapter$MainViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "itemView", "<init>", "(Lru/ozon/app/android/debugmenu/analytics/ui/DataLayerAdapter;Landroid/view/View;)V", "", "key", "", "setKey", "(Ljava/lang/String;)V", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "setValue", "(Ljava/lang/Object;)V", "element", "", "isRootElement", "(Ljava/lang/Object;)Z", "Landroid/util/Pair;", "item", "bind", "(Landroid/util/Pair;)V", "Landroid/widget/TextView;", "keyView", "Landroid/widget/TextView;", "valueView", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class MainViewHolder extends RecyclerView.C {

        @NotNull
        private final TextView keyView;
        final /* synthetic */ DataLayerAdapter this$0;

        @NotNull
        private final TextView valueView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MainViewHolder(@NotNull DataLayerAdapter dataLayerAdapter, View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            this.this$0 = dataLayerAdapter;
            View findViewById = itemView.findViewById(R$id.key);
            Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
            this.keyView = (TextView) findViewById;
            View findViewById2 = itemView.findViewById(R$id.value);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
            this.valueView = (TextView) findViewById2;
            itemView.setOnClickListener(new b(3, dataLayerAdapter, this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$0(DataLayerAdapter dataLayerAdapter, MainViewHolder mainViewHolder, View view) {
            Object obj;
            Pair pair = (Pair) C7714v.Q(mainViewHolder.getAdapterPosition(), dataLayerAdapter.data);
            if (pair == null || (obj = pair.second) == null || !mainViewHolder.isRootElement(obj)) {
                return;
            }
            String str = (String) pair.first;
            OnItemClickListener onItemClickListener = dataLayerAdapter.listener;
            Intrinsics.f(str);
            onItemClickListener.onItemClick(str);
        }

        private final boolean isRootElement(Object element) {
            return element instanceof Map;
        }

        private final void setKey(String key) {
            this.keyView.setText(key);
        }

        private final void setValue(Object value) {
            if (value == null) {
                this.valueView.setVisibility(8);
                return;
            }
            this.valueView.setVisibility(0);
            if (isRootElement(value)) {
                this.valueView.setText(">");
            } else {
                this.valueView.setText(value.toString());
            }
        }

        public final void bind(@NotNull Pair<String, Object> item) {
            Intrinsics.checkNotNullParameter(item, "item");
            setKey((String) item.first);
            setValue(item.second);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/debugmenu/analytics/ui/DataLayerAdapter$OnItemClickListener;", "", "onItemClick", "", "key", "", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnItemClickListener {
        void onItemClick(@NotNull String key);
    }

    public DataLayerAdapter(@NotNull Map<String, ? extends Object> data, @NotNull OnItemClickListener listener) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = listener;
        this.data = new ArrayList();
        for (String str : data.keySet()) {
            ((ArrayList) this.data).add(new Pair(str, data.get(str)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getCardsCount() {
        return this.data.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull MainViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.data.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public MainViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new MainViewHolder(this, ViewGroupExtKt.inflate(parent, R$layout.data_layer_list_item));
    }
}
