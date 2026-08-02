package ru.ozon.app.android.fresh.main.widgets.scrollActionList.presentation;

import B0.C2454a;
import WZ.l;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.domain.flags.CategoryMainPageFreshPreCreateWidgetsNewConfiguration;
import ru.ozon.app.android.fresh.main.widgets.scrollActionList.di.ScrollActionListComponent;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/main/widgets/scrollActionList/presentation/ScrollActionListRootViewHolder;", "view", "Landroid/view/View;", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ScrollActionListViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, ScrollActionListRootViewHolder> {
    final /* synthetic */ ScrollActionListViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollActionListViewMapper$holderProducer$1(ScrollActionListViewMapper scrollActionListViewMapper) {
        super(2);
        this.this$0 = scrollActionListViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final ScrollActionListRootViewHolder invoke(View view, ComposerReferences references) {
        Object obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(references, "references");
        RecyclerView recyclerView = (RecyclerView) view;
        l tokenizedAnalytics = ((ScrollActionListComponent) this.this$0.component()).getTokenizedAnalytics();
        List m11 = h.m(((ScrollActionListComponent) this.this$0.component()).getFeatureService().getStringKey(CategoryMainPageFreshPreCreateWidgetsNewConfiguration.INSTANCE), new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList(C7714v.z(m11, 10));
        Iterator it = m11.iterator();
        while (it.hasNext()) {
            C2454a.g((String) it.next(), arrayList);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (Intrinsics.d((String) obj, "scrollActionList")) {
                break;
            }
        }
        return new ScrollActionListRootViewHolder(recyclerView, tokenizedAnalytics, references, obj != null);
    }
}
