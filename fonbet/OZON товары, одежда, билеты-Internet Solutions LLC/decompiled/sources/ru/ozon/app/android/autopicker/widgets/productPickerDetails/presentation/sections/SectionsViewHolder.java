package ru.ozon.app.android.autopicker.widgets.productPickerDetails.presentation.sections;

import GZ.g;
import LZ.b;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.af.holders.HeaderAtom;
import ru.ozon.app.android.atoms.data.deprecated.Cell;
import ru.ozon.app.android.atoms.data.deprecated.Header;
import ru.ozon.app.android.autopicker.databinding.WidgetSectionsProductPickerDetailsBinding;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchFragment;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomDecorator;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.VerticalAtomsDecorator;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.AtomDTO;
import sZ.c;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001)B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00022\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00100!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/autopicker/widgets/productPickerDetails/presentation/sections/SectionsViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/presentation/sections/SectionsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LGZ/g;", "router", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;Lru/ozon/app/android/composer/ComposerReferences;LGZ/g;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "processClick", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "openProductPickerSearchFragment", "(Lru/ozon/uni/atoms/af/AtomAction$Click;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/autopicker/widgets/productPickerDetails/presentation/sections/SectionsVO;Ll20/d;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "LGZ/g;", "Lru/ozon/app/android/autopicker/databinding/WidgetSectionsProductPickerDetailsBinding;", "binding", "Lru/ozon/app/android/autopicker/databinding/WidgetSectionsProductPickerDetailsBinding;", "Lkotlin/Function1;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "sectionsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "sectionsVO", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/presentation/sections/SectionsVO;", "CellsDecorator", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SectionsViewHolder extends k<SectionsVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetSectionsProductPickerDetailsBinding binding;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final g router;

    @NotNull
    private final AtomsAdapter sectionsAdapter;
    private SectionsVO sectionsVO;

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J(\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/autopicker/widgets/productPickerDetails/presentation/sections/SectionsViewHolder$CellsDecorator;", "Lru/ozon/uni/atoms/af/AtomDecorator;", "Lru/ozon/uni/atoms/af/VerticalAtomsDecorator;", "context", "Landroid/content/Context;", "<init>", "(Lru/ozon/app/android/autopicker/widgets/productPickerDetails/presentation/sections/SectionsViewHolder;Landroid/content/Context;)V", "margin", "", "dividerHeight", "paint", "Landroid/graphics/Paint;", "decorate", "", "canvas", "Landroid/graphics/Canvas;", "bounds", "Landroid/graphics/Rect;", "position", "last", "", "modifyVerticalLayoutParams", "Landroid/widget/LinearLayout$LayoutParams;", "lp", "data", "Lru/ozon/uni/atoms/data/AtomDTO;", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class CellsDecorator extends AtomDecorator implements VerticalAtomsDecorator {
        private final int dividerHeight;
        private final int margin;

        @NotNull
        private final Paint paint;
        final /* synthetic */ SectionsViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CellsDecorator(@NotNull SectionsViewHolder sectionsViewHolder, Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
            this.this$0 = sectionsViewHolder;
            this.margin = toPx(16);
            int px = toPx(1);
            this.dividerHeight = px;
            Paint paint = new Paint(1);
            paint.setColor(ThemeExtKt.themeColor(context, R$attr.oz_semantic_separator));
            paint.setStrokeWidth(px);
            this.paint = paint;
        }

        @Override // ru.ozon.uni.atoms.af.AtomDecorator, ru.ozon.uni.atoms.af.CommonAtomDecorator
        public void decorate(@NotNull Canvas canvas, @NotNull Rect bounds, int position, boolean last) {
            List<AtomDTO> sections;
            List<AtomDTO> sections2;
            List<Integer> separatorIndices;
            Intrinsics.checkNotNullParameter(canvas, "canvas");
            Intrinsics.checkNotNullParameter(bounds, "bounds");
            SectionsVO sectionsVO = this.this$0.sectionsVO;
            if (sectionsVO == null || (separatorIndices = sectionsVO.getSeparatorIndices()) == null || !separatorIndices.contains(Integer.valueOf(position))) {
                SectionsVO sectionsVO2 = this.this$0.sectionsVO;
                AtomDTO atomDTO = null;
                if (((sectionsVO2 == null || (sections2 = sectionsVO2.getSections()) == null) ? null : sections2.get(position)) instanceof Cell.CellToggle) {
                    return;
                }
                SectionsVO sectionsVO3 = this.this$0.sectionsVO;
                if (sectionsVO3 != null && (sections = sectionsVO3.getSections()) != null) {
                    atomDTO = sections.get(position);
                }
                if (atomDTO instanceof Header) {
                    return;
                }
                int i11 = bounds.bottom;
                int i12 = this.dividerHeight;
                canvas.drawLine(bounds.left + this.margin, i11 + i12, bounds.right, i11 + i12, this.paint);
            }
        }

        @Override // ru.ozon.uni.atoms.af.VerticalAtomsDecorator
        @NotNull
        public LinearLayout.LayoutParams modifyVerticalLayoutParams(@NotNull LinearLayout.LayoutParams lp, @NotNull AtomDTO data, int position, boolean last) {
            List<Integer> separatorIndices;
            Intrinsics.checkNotNullParameter(lp, "lp");
            Intrinsics.checkNotNullParameter(data, "data");
            SectionsVO sectionsVO = this.this$0.sectionsVO;
            if (sectionsVO != null && (separatorIndices = sectionsVO.getSeparatorIndices()) != null && separatorIndices.contains(Integer.valueOf(position))) {
                lp.bottomMargin = this.margin;
            }
            return lp;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectionsViewHolder(@NotNull View containerView, @NotNull HandlersInhibitor handlersInhibitor, @NotNull ComposerReferences refs, @NotNull g router) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(handlersInhibitor, "handlersInhibitor");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(router, "router");
        this.refs = refs;
        this.router = router;
        WidgetSectionsProductPickerDetailsBinding bind = WidgetSectionsProductPickerDetailsBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).enableClickThrottling(handlersInhibitor).onPreProcess(new SectionsViewHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        AtomsAdapter atomsAdapter = new AtomsAdapter(U.i(new Pair(new Atom.ConfCondition(Header.class, null, 2, null), new HeaderAtom.Configuration(0, 0, 8, 8, null, null, null, 0, false, null, 1011, null))), null, null, null, 14, null);
        atomsAdapter.setOnAction(buildHandler);
        this.sectionsAdapter = atomsAdapter;
        VerticalAtomsLayout verticalAtomsLayout = bind.sectionsVal;
        verticalAtomsLayout.setAdapter(atomsAdapter);
        Context context = verticalAtomsLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        verticalAtomsLayout.setDecorator(new CellsDecorator(this, context));
    }

    private final void openProductPickerSearchFragment(AtomAction.Click action) {
        SectionsVO sectionsVO = this.sectionsVO;
        if (sectionsVO == null) {
            return;
        }
        g gVar = this.router;
        Intrinsics.checkNotNullExpressionValue("ProductPickerSearchFragment", "getSimpleName(...)");
        ProductPickerSearchFragment.Companion companion = ProductPickerSearchFragment.INSTANCE;
        String actionType = sectionsVO.getCurrentState().getActionType();
        String link = action.getLink();
        Intrinsics.f(link);
        gVar.c(new b(new c("ProductPickerSearchFragment", companion.newInstance(actionType, link, new HashMap<>(sectionsVO.getCurrentState().getParams())), 1000, false, false, null, false, false, false, 504, null)), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processClick(AtomAction action) {
        if (action instanceof AtomAction.Move) {
            String link = ((AtomAction.Move) action).getLink();
            if (link != null) {
                ComposerNavigator.DefaultImpls.openDeeplink$default(this.refs.getNavigator(), link, null, 2, null);
                return;
            }
            return;
        }
        if (action instanceof AtomAction.Click) {
            AtomAction.Click click = (AtomAction.Click) action;
            if (Intrinsics.d(click.getId(), "nextStep")) {
                openProductPickerSearchFragment(click);
            } else {
                InterfaceC7851b.a.a(this.refs.getController(), click.getLink(), null, null, null, 14);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SectionsVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.sectionsVO = item;
        this.sectionsAdapter.bind(getContext(), item.getSections());
    }
}
