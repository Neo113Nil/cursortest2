package ru.ozon.app.android.marketing.widgets.hammersV3.oldHammers.presentation.binders;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.marketing.widgets.hammersV3.oldHammers.presentation.binders.OldHammerMultiFrameBinderDelegate;
import ru.ozon.app.android.marketing.widgets.hammersV3.oldHammers.presentation.model.OldHammersV3BodyVO;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 32\u00020\u0001:\u00013B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0002\b\u00030\u000ej\u0006\u0012\u0002\b\u0003`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J5\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\n\u0010\u001b\u001a\u00060\u0019j\u0002`\u001a2\u0012\u0010\u0010\u001a\u000e\u0012\u0002\b\u00030\u000ej\u0006\u0012\u0002\b\u0003`\u000f¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u000b¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010#\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010&R\u001e\u0010\u001b\u001a\n\u0018\u00010\u0019j\u0004\u0018\u0001`\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010'R&\u0010(\u001a\u0012\u0012\u0002\b\u0003\u0018\u00010\u000ej\b\u0012\u0002\b\u0003\u0018\u0001`\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020*0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u000b008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/presentation/binders/OldHammerMultiFrameBinderDelegate;", "", "", "Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/presentation/binders/OldHammerBinderFrameWrapper;", "productPropertyBinder", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "<init>", "(Ljava/util/Set;Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;)V", "Landroid/view/View;", "itemView", "", "init", "(Landroid/view/View;)V", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "viewHolder", "onAttach", "(Lru/ozon/composer/ui/widget/k;)V", "", "offscreenOffsetPercent", "onOffscreenPositionChanged", "(F)V", "Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/presentation/model/OldHammersV3BodyVO;", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/presentation/model/OldHammersV3BodyVO;Ll20/d;Lru/ozon/composer/ui/widget/k;)V", "onDetach", "()V", "onRecycle", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "applyRecycler", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "Lru/ozon/app/android/marketing/widgets/hammersV3/oldHammers/presentation/model/OldHammersV3BodyVO;", "Ll20/d;", "vh", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/view/multiframebinder/BindStep;", "mainStep", "Lru/ozon/app/android/composer/view/multiframebinder/BindStep;", "", "multiFrameSteps", "Ljava/util/List;", "Lkotlin/Function0;", "onAttachAction", "Lkotlin/jvm/functions/Function0;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OldHammerMultiFrameBinderDelegate {

    @NotNull
    private final FrameBinder frameBinder;
    private d info;
    private OldHammersV3BodyVO item;
    private BindStep mainStep;

    @NotNull
    private final List<BindStep> multiFrameSteps;

    @NotNull
    private final Function0<Unit> onAttachAction;
    private k<?> vh;
    public static final int $stable = 8;

    public OldHammerMultiFrameBinderDelegate(@NotNull Set<OldHammerBinderFrameWrapper> productPropertyBinder, @NotNull FrameBinder frameBinder) {
        Intrinsics.checkNotNullParameter(productPropertyBinder, "productPropertyBinder");
        Intrinsics.checkNotNullParameter(frameBinder, "frameBinder");
        this.frameBinder = frameBinder;
        this.multiFrameSteps = new ArrayList();
        this.onAttachAction = new OldHammerMultiFrameBinderDelegate$onAttachAction$1(this, productPropertyBinder);
        TreeMap q11 = U.q(new Pair[0]);
        for (Object obj : productPropertyBinder) {
            Integer valueOf = Integer.valueOf(((OldHammerBinderFrameWrapper) obj).getFrameOrder());
            Object obj2 = q11.get(valueOf);
            if (obj2 == null) {
                obj2 = new ArrayList();
                q11.put(valueOf, obj2);
            }
            ((List) obj2).add(obj);
        }
        for (final Map.Entry entry : q11.entrySet()) {
            Object value = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
            if (!((Collection) value).isEmpty()) {
                BindStep bindStep = new BindStep() { // from class: Ez.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Unit invoke() {
                        Unit lambda$3$lambda$2;
                        lambda$3$lambda$2 = OldHammerMultiFrameBinderDelegate.lambda$3$lambda$2(entry, this);
                        return lambda$3$lambda$2;
                    }
                };
                Integer num = (Integer) entry.getKey();
                if (num != null && num.intValue() == 0) {
                    this.mainStep = bindStep;
                } else {
                    this.multiFrameSteps.add(bindStep);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda$3$lambda$2(Map.Entry entry, OldHammerMultiFrameBinderDelegate oldHammerMultiFrameBinderDelegate) {
        d dVar;
        k<?> kVar;
        Object value = entry.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
        Iterator it = ((Iterable) value).iterator();
        while (it.hasNext()) {
            OldHammerProductPropertyBinder binder = ((OldHammerBinderFrameWrapper) it.next()).getBinder();
            OldHammersV3BodyVO oldHammersV3BodyVO = oldHammerMultiFrameBinderDelegate.item;
            if (oldHammersV3BodyVO != null && (dVar = oldHammerMultiFrameBinderDelegate.info) != null && (kVar = oldHammerMultiFrameBinderDelegate.vh) != null) {
                binder.bind(oldHammersV3BodyVO, dVar, kVar);
            }
            return Unit.f71690a;
        }
        return Unit.f71690a;
    }

    public final void applyRecycler(RecyclerView recyclerView) {
        this.frameBinder.applyRecycler(recyclerView);
    }

    public final void bind(@NotNull OldHammersV3BodyVO item, @NotNull d info, @NotNull k<?> viewHolder) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        this.item = item;
        this.info = info;
        this.vh = viewHolder;
        BindStep bindStep = this.mainStep;
        if (bindStep != null) {
            bindStep.invoke();
        }
        this.frameBinder.bind(this.multiFrameSteps, item.getViewItemKey());
    }

    public final void init(@NotNull View itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.frameBinder.init(itemView);
    }

    public final void onAttach(@NotNull k<?> viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        this.vh = viewHolder;
        this.frameBinder.onAttach(this.onAttachAction);
    }

    public final void onDetach() {
        this.frameBinder.onDetach();
    }

    public final void onOffscreenPositionChanged(float offscreenOffsetPercent) {
        this.frameBinder.onOffscreenPositionChanged(offscreenOffsetPercent);
    }

    public final void onRecycle() {
        this.frameBinder.onRecycle();
    }
}
