package ru.ozon.app.android.universalwidgets.widgets.uw.sku.mapper;

import android.content.Context;
import android.view.View;
import androidx.appcompat.view.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.R$style;
import ru.ozon.app.android.universalwidgets.widgets.uw.sku.decorators.ScrollProductsContainerStateDecorator;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u00020\t2\u0014\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u0006¢\u0006\u0004\b\r\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/mapper/StateMeasurer;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "state", "", "measureState", "(Ljava/util/List;)I", "states", "measure", "Landroidx/appcompat/view/d;", "contextThemeWrapper", "Landroidx/appcompat/view/d;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "atomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/decorators/ScrollProductsContainerStateDecorator;", "atomsDecorator", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/decorators/ScrollProductsContainerStateDecorator;", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "atomsLayout", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "Companion", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StateMeasurer {
    private static final int width = ResourceExtKt.toPx(108);

    @NotNull
    private final AtomsAdapter atomsAdapter;

    @NotNull
    private final ScrollProductsContainerStateDecorator atomsDecorator;

    @NotNull
    private final VerticalAtomsLayout atomsLayout;

    @NotNull
    private final d contextThemeWrapper;

    public StateMeasurer(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        d dVar = new d(context, R$style.OzonTheme);
        this.contextThemeWrapper = dVar;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.atomsAdapter = atomsAdapter;
        ScrollProductsContainerStateDecorator scrollProductsContainerStateDecorator = new ScrollProductsContainerStateDecorator(dVar);
        this.atomsDecorator = scrollProductsContainerStateDecorator;
        VerticalAtomsLayout verticalAtomsLayout = new VerticalAtomsLayout(dVar, null, 0, 6, null);
        verticalAtomsLayout.setAdapter(atomsAdapter);
        verticalAtomsLayout.setDecorator(scrollProductsContainerStateDecorator);
        this.atomsLayout = verticalAtomsLayout;
    }

    private final int measureState(List<? extends AtomDTO> state) {
        AtomsAdapter atomsAdapter = this.atomsAdapter;
        d dVar = this.contextThemeWrapper;
        if (state == null) {
            state = K.f71697a;
        }
        atomsAdapter.bind(dVar, state);
        this.atomsLayout.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), 0);
        return this.atomsLayout.getMeasuredHeight();
    }

    public final synchronized int measure(@NotNull List<? extends List<? extends AtomDTO>> states) {
        Integer num;
        try {
            Intrinsics.checkNotNullParameter(states, "states");
            List<? extends List<? extends AtomDTO>> list = states;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(measureState((List) it.next())));
            }
            num = (Integer) C7714v.d0(arrayList);
        } catch (Throwable th2) {
            throw th2;
        }
        return num != null ? num.intValue() : 0;
    }
}
