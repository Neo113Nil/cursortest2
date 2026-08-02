package ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation;

import Sc.o;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.af.holders.HeaderAtom;
import ru.ozon.app.android.atoms.atom2.TextAtom;
import ru.ozon.app.android.atoms.data.deprecated.CommonText;
import ru.ozon.app.android.atoms.data.deprecated.Header;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormConfig;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.fields.FieldAction;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.fields.FieldsAdapter;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.map.R$dimen;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.Atom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomDecorator;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.VerticalAtomsDecorator;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.deprecated.Annotation;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u00015Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0006\u0012\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b\u0018\u00010\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001a\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u0017J\u0015\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\"R\u0016\u0010#\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\"R$\u0010%\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00148\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00066"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBlockVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormConfig;", "formConfig", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBlockView;", "view", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onTitleAction", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/FieldAction;", "onAction", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "Landroid/view/View;", "onOnboardingShow", "", "isTopItemDecorationEnabled", "<init>", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormConfig;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBlockView;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Z)V", "", "position", "isDrawTop", "(I)Z", "isDrawBottom", "isDrawLeft", "isLeftEdgeView", "isRightEdgeView", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO;", "item", "bind", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBuilderBlockVO;)V", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormConfig;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBlockView;", "Z", "drawLastBottomSeparator", AppMeasurementSdk.ConditionalUserProperty.VALUE, "gridSize", "I", "setGridSize", "(I)V", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/FieldsAdapter;", "fieldsAdapter", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/fields/FieldsAdapter;", "Landroidx/recyclerview/widget/GridLayoutManager;", "layoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "spanSizeLookup", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "titleAtomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "TitleAtomDecorator", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FormBlockVH extends RecyclerView.C {
    private boolean drawLastBottomSeparator;

    @NotNull
    private final FieldsAdapter fieldsAdapter;

    @NotNull
    private final FormConfig formConfig;
    private int gridSize;
    private final boolean isTopItemDecorationEnabled;

    @NotNull
    private final GridLayoutManager layoutManager;

    @NotNull
    private final GridLayoutManager.c spanSizeLookup;

    @NotNull
    private final AtomsAdapter titleAtomsAdapter;

    @NotNull
    private final FormBlockView view;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/FormBlockVH$TitleAtomDecorator;", "Lru/ozon/uni/atoms/af/AtomDecorator;", "Lru/ozon/uni/atoms/af/VerticalAtomsDecorator;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp8", "", "dp12", "dp16", "dp52", "modifyVerticalLayoutParams", "Landroid/widget/LinearLayout$LayoutParams;", "lp", "data", "Lru/ozon/uni/atoms/data/AtomDTO;", "position", "last", "", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TitleAtomDecorator extends AtomDecorator implements VerticalAtomsDecorator {
        private final int dp12;
        private final int dp16;
        private final int dp52;
        private final int dp8;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TitleAtomDecorator(@NotNull Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
            this.dp8 = toPx(8);
            this.dp12 = toPx(12);
            this.dp16 = toPx(16);
            this.dp52 = toPx(52);
        }

        @Override // ru.ozon.uni.atoms.af.VerticalAtomsDecorator
        @NotNull
        public LinearLayout.LayoutParams modifyVerticalLayoutParams(@NotNull LinearLayout.LayoutParams lp, @NotNull AtomDTO data, int position, boolean last) {
            Intrinsics.checkNotNullParameter(lp, "lp");
            Intrinsics.checkNotNullParameter(data, "data");
            if (data instanceof Annotation) {
                lp.topMargin = this.dp8;
            }
            if (!(data instanceof Header)) {
                lp.bottomMargin = data instanceof CommonText.TextMedium ? this.dp8 : last ? this.dp16 : this.dp12;
            }
            if (data instanceof ButtonV3Atom.SmallButton) {
                lp.leftMargin = this.dp52;
            }
            return lp;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FormConfig.Mode.values().length];
            try {
                iArr[FormConfig.Mode.BORDER_FIELD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FormConfig.Mode.BORDERLESS_GRAY_FIELD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FormConfig.Mode.BORDERLESS_FIELD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormBlockVH(@NotNull FormConfig formConfig, @NotNull FormBlockView view, @NotNull Function1<? super AtomAction, Unit> onTitleAction, @NotNull Function1<? super FieldAction, Unit> onAction, Function2<? super OnBoardingDTO, ? super View, Unit> function2, boolean z11) {
        super(view);
        int i11;
        Intrinsics.checkNotNullParameter(formConfig, "formConfig");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onTitleAction, "onTitleAction");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        this.formConfig = formConfig;
        this.view = view;
        this.isTopItemDecorationEnabled = z11;
        this.gridSize = 1;
        FieldsAdapter fieldsAdapter = new FieldsAdapter(formConfig, onAction, onTitleAction, function2);
        this.fieldsAdapter = fieldsAdapter;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.itemView.getContext(), this.gridSize);
        this.layoutManager = gridLayoutManager;
        GridLayoutManager.c cVar = new GridLayoutManager.c() { // from class: ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBlockVH$spanSizeLookup$1
            {
                setSpanIndexCacheEnabled(true);
                setSpanGroupIndexCacheEnabled(true);
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.c
            public int getSpanSize(int position) {
                FieldsAdapter fieldsAdapter2;
                fieldsAdapter2 = FormBlockVH.this.fieldsAdapter;
                return fieldsAdapter2.getSpanSize(position);
            }
        };
        this.spanSizeLookup = cVar;
        AtomsAdapter atomsAdapter = new AtomsAdapter(U.j(new Pair(new Atom.ConfCondition(Header.class, null, 2, null), new HeaderAtom.Configuration(0, 0, 0, 0, null, null, Integer.valueOf(R$style.TextStyle_Body_L_Bold_Black), 0, false, null, 831, null)), new Pair(new Atom.ConfCondition(CommonText.TextMedium.class, null, 2, null), new TextAtom.Configuration(0, 0, 0, 0, R$style.TextStyle_Body_L_Black, 0, 0, null, 0, false, false, 2, null, null, 0, 0, null, null, null, 522223, null))), null, null, null, 14, null);
        this.titleAtomsAdapter = atomsAdapter;
        view.getFieldsRv().setAdapter(fieldsAdapter);
        view.getFieldsRv().setLayoutManager(gridLayoutManager);
        RecyclerView fieldsRv = view.getFieldsRv();
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        fieldsRv.addItemDecoration(new FormBlockDecorator(context, formConfig, new FormBlockVH$1$3(this), new FormBlockVH$1$1(this), new FormBlockVH$1$2(this), new FormBlockVH$1$4(this), new FormBlockVH$1$5(this)));
        ViewGroup.LayoutParams layoutParams = view.getFieldsRv().getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i12 = WhenMappings.$EnumSwitchMapping$0[formConfig.getMode().ordinal()];
        if (i12 == 1 || i12 == 2) {
            i11 = 0;
        } else {
            if (i12 != 3) {
                throw new o();
            }
            i11 = view.getContext().getResources().getDimensionPixelSize(R$dimen.checkout_form_builder_borderless_mode_block_horizontal_edge_padding);
        }
        marginLayoutParams.leftMargin = i11;
        marginLayoutParams.rightMargin = i11;
        gridLayoutManager.n(cVar);
        VerticalAtomsLayout titleVAL = view.getTitleVAL();
        titleVAL.setAdapter(atomsAdapter);
        Context context2 = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        titleVAL.setDecorator(new TitleAtomDecorator(context2));
        atomsAdapter.setOnAction(onTitleAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isDrawBottom(int position) {
        if (this.drawLastBottomSeparator && this.spanSizeLookup.getSpanIndex(position, this.gridSize) == 0) {
            return this.spanSizeLookup.getSpanGroupIndex(position, this.gridSize) == this.spanSizeLookup.getSpanGroupIndex(this.fieldsAdapter.getCardsCount() - 1, this.gridSize);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isDrawLeft(int position) {
        return this.spanSizeLookup.getSpanIndex(position, this.gridSize) > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isDrawTop(int position) {
        return this.isTopItemDecorationEnabled && this.spanSizeLookup.getSpanIndex(position, this.gridSize) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isLeftEdgeView(int position) {
        return this.spanSizeLookup.getSpanIndex(position, this.gridSize) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isRightEdgeView(int position) {
        return this.spanSizeLookup.getSpanSize(position) + this.spanSizeLookup.getSpanIndex(position, this.gridSize) == this.gridSize;
    }

    private final void setGridSize(int i11) {
        this.gridSize = i11;
        this.layoutManager.m(i11);
    }

    public final void bind(@NotNull FormBuilderBlockVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.drawLastBottomSeparator = item.getDrawBottomSeparator();
        setGridSize(item.getBlockGridSize());
        this.fieldsAdapter.submitList(item.getFields());
        VerticalAtomsLayout titleVAL = this.view.getTitleVAL();
        ViewExtKt.showOrGone(titleVAL, Boolean.valueOf(item.getTitleElements() != null));
        List<AtomDTO> titleElements = item.getTitleElements();
        if (titleElements != null) {
            AtomsAdapter atomsAdapter = this.titleAtomsAdapter;
            Context context = titleVAL.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            atomsAdapter.bind(context, titleElements);
        }
    }
}
