package ru.ozon.fintech.ui.container;

import com.detmir.recycli.adapters.RecyclerAdapter;
import com.detmir.recycli.adapters.RecyclerItem;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/fintech/ui/container/AttachItemViewToWindowCallback;", "", "Lcom/detmir/recycli/adapters/RecyclerItem;", "items", "", "", "Lcom/detmir/recycli/adapters/RecyclerAdapter$b;", "getAttachListeners", "(Lru/ozon/fintech/ui/container/AttachItemViewToWindowCallback;Ljava/util/List;)Ljava/util/Map;", "fintech-ui_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AttachItemViewToWindowCallbackKt {
    public static final Map<String, RecyclerAdapter.b> getAttachListeners(@NotNull final AttachItemViewToWindowCallback attachItemViewToWindowCallback, List<? extends RecyclerItem> list) {
        Intrinsics.checkNotNullParameter(attachItemViewToWindowCallback, "<this>");
        List<? extends RecyclerItem> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            final K k11 = new K();
            final int i11 = 0;
            for (final RecyclerItem recyclerItem : list) {
                int i12 = i11 + 1;
                if (attachItemViewToWindowCallback.isNeedCreateCallback(k11.f71785a, i11, recyclerItem)) {
                    linkedHashMap.put(recyclerItem.provideId(), new RecyclerAdapter.b(k11, i11, recyclerItem, attachItemViewToWindowCallback) { // from class: ru.ozon.fintech.ui.container.AttachItemViewToWindowCallbackKt$getAttachListeners$1
                        final /* synthetic */ AttachItemViewToWindowCallback $this_getAttachListeners;
                        private final int absolutePosition;
                        private final RecyclerItem item;
                        private final int position;

                        {
                            this.$this_getAttachListeners = attachItemViewToWindowCallback;
                            this.position = k11.f71785a;
                            this.absolutePosition = i11;
                            this.item = recyclerItem;
                        }

                        public final int getAbsolutePosition() {
                            return this.absolutePosition;
                        }

                        public final RecyclerItem getItem() {
                            return this.item;
                        }

                        public final int getPosition() {
                            return this.position;
                        }

                        @Override // com.detmir.recycli.adapters.RecyclerAdapter.b
                        public void onViewAttachedToWindow() {
                            this.$this_getAttachListeners.onAttachViewToWindow(this.position, this.absolutePosition, this.item);
                        }

                        @Override // com.detmir.recycli.adapters.RecyclerAdapter.b
                        public void onViewDetachedFromWindow() {
                            this.$this_getAttachListeners.onDetachViewToWindow(this.position, this.absolutePosition, this.item);
                        }
                    });
                    k11.f71785a++;
                }
                i11 = i12;
            }
            if (!linkedHashMap.isEmpty()) {
                return linkedHashMap;
            }
        }
        return null;
    }
}
