package ru.ozon.app.android.pdp.widgets.badgeList.presentation.flex;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import androidx.core.view.C5316f0;
import com.google.android.flexbox.FlexboxLayout;
import java.util.Iterator;
import jk0.q;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C7747g;
import kotlin.sequences.l;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.R$drawable;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BaseWidgetPlaceholderBinder;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter;
import ru.ozon.app.android.pdp.widgets.badgeList.presentation.BadgeListVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.HorizontalFlexAtomsDecorator;
import ru.ozon.uni.atoms.af.layout.HorizontalFlexAtomsLayout;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0003j\b\u0012\u0004\u0012\u00020\u0002`\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ;\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR*\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0003j\b\u0012\u0004\u0012\u00020\u0002`\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00140 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/pdp/widgets/badgeList/presentation/flex/BadgeListBinder;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/BaseWidgetPlaceholderBinder;", "Lru/ozon/app/android/pdp/widgets/badgeList/presentation/BadgeListVO;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "viewHolderOwner", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;", "widgetImagePlaceholderAdapter", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/uni/atoms/af/layout/HorizontalFlexAtomsLayout;", "containerView", "<init>", "(Lru/ozon/composer/ui/widget/k;Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/uni/atoms/af/layout/HorizontalFlexAtomsLayout;)V", "item", "Ll20/d;", "info", "", "payload", "Lkotlin/Function0;", "", "onFinish", "bind", "(Lru/ozon/app/android/pdp/widgets/badgeList/presentation/BadgeListVO;Ll20/d;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)V", "Ljk0/q;", "onVisibleAreaChanged", "(Ljk0/q;)V", "Lru/ozon/composer/ui/widget/k;", "getViewHolderOwner", "()Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;", "Lru/ozon/uni/atoms/af/layout/HorizontalFlexAtomsLayout;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "atomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BadgeListBinder extends BaseWidgetPlaceholderBinder<BadgeListVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AtomsAdapter atomsAdapter;

    @NotNull
    private final HorizontalFlexAtomsLayout containerView;

    @NotNull
    private final k<BadgeListVO> viewHolderOwner;

    @NotNull
    private final WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter;

    public BadgeListBinder(@NotNull k<BadgeListVO> viewHolderOwner, @NotNull WidgetImagePlaceholderAdapter widgetImagePlaceholderAdapter, @NotNull ComposerReferences refs, @NotNull HorizontalFlexAtomsLayout containerView) {
        Intrinsics.checkNotNullParameter(viewHolderOwner, "viewHolderOwner");
        Intrinsics.checkNotNullParameter(widgetImagePlaceholderAdapter, "widgetImagePlaceholderAdapter");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.viewHolderOwner = viewHolderOwner;
        this.widgetImagePlaceholderAdapter = widgetImagePlaceholderAdapter;
        this.containerView = containerView;
        this.actionHandler = new ActionHandler.Builder(refs, getViewHolderOwner()).buildHandler();
        this.atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.BaseWidgetPlaceholderBinder
    public /* bridge */ /* synthetic */ void bind(BadgeListVO badgeListVO, d dVar, Object obj, Function0 function0) {
        bind2(badgeListVO, dVar, obj, (Function0<Unit>) function0);
    }

    @NotNull
    public k<BadgeListVO> getViewHolderOwner() {
        return this.viewHolderOwner;
    }

    public void onVisibleAreaChanged(@NotNull q info) {
        String stateId;
        Intrinsics.checkNotNullParameter(info, "info");
        String json = getJson();
        if (json == null || (stateId = getStateId()) == null) {
            return;
        }
        Pair pair = new Pair(json, stateId);
        WidgetImagePlaceholderAdapter.cacheViewIfNeeded$default(this.widgetImagePlaceholderAdapter, this.containerView, "BadgeListV1Widget", (String) pair.b(), info, (String) pair.a(), null, 32, null);
    }

    /* renamed from: bind, reason: avoid collision after fix types in other method */
    public void bind2(@NotNull BadgeListVO item, d info, Object payload, Function0<Unit> onFinish) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.bind((BadgeListBinder) item, info, payload, onFinish);
        HorizontalFlexAtomsLayout horizontalFlexAtomsLayout = this.containerView;
        ViewExtKt.show(horizontalFlexAtomsLayout);
        horizontalFlexAtomsLayout.setDecorator(new HorizontalFlexAtomsDecorator() { // from class: ru.ozon.app.android.pdp.widgets.badgeList.presentation.flex.BadgeListBinder$bind$1$1$1
            @Override // ru.ozon.uni.atoms.af.CommonAtomDecorator
            public void decorate(Canvas canvas, Rect rect, int i11, boolean z11) {
                HorizontalFlexAtomsDecorator.DefaultImpls.decorate(this, canvas, rect, i11, z11);
            }

            @Override // ru.ozon.uni.atoms.af.HorizontalFlexAtomsDecorator
            public int horizontalDividerDrawable() {
                return R$drawable.space_badge_list_atom;
            }

            @Override // ru.ozon.uni.atoms.af.HorizontalFlexAtomsDecorator
            public int justifyContent() {
                return HorizontalFlexAtomsDecorator.DefaultImpls.justifyContent(this);
            }

            @Override // ru.ozon.uni.atoms.af.HorizontalFlexAtomsDecorator
            public FlexboxLayout.a modifyVerticalLayoutParams(FlexboxLayout.a aVar, AtomDTO atomDTO, int i11, boolean z11) {
                return HorizontalFlexAtomsDecorator.DefaultImpls.modifyVerticalLayoutParams(this, aVar, atomDTO, i11, z11);
            }

            @Override // ru.ozon.uni.atoms.af.HorizontalFlexAtomsDecorator
            public int showDividerHorizontal() {
                return HorizontalFlexAtomsDecorator.DefaultImpls.showDividerHorizontal(this);
            }

            @Override // ru.ozon.uni.atoms.af.HorizontalFlexAtomsDecorator
            public int showDividerVertical() {
                return HorizontalFlexAtomsDecorator.DefaultImpls.showDividerVertical(this);
            }
        });
        this.atomsAdapter.setOnAction(this.actionHandler);
        horizontalFlexAtomsLayout.setAdapter(this.atomsAdapter);
        AtomsAdapter atomsAdapter = this.atomsAdapter;
        Context context = horizontalFlexAtomsLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        atomsAdapter.bind(context, item.getBadges());
        Iterator it = l.h(C5316f0.b(horizontalFlexAtomsLayout), BadgeListBinder$bind$lambda$2$lambda$1$$inlined$filterIsInstance$1.INSTANCE).iterator();
        while (true) {
            C7747g.a aVar = (C7747g.a) it;
            if (!aVar.hasNext()) {
                break;
            }
            BadgeView badgeView = (BadgeView) aVar.next();
            badgeView.setContentDescription(badgeView.getBadgeText());
        }
        if (onFinish != null) {
            onFinish.invoke();
        }
    }
}
