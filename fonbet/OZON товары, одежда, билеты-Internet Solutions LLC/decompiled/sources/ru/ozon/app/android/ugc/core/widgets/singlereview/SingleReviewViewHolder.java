package ru.ozon.app.android.ugc.core.widgets.singlereview;

import Sc.InterfaceC4008j;
import Tc.b;
import WZ.l;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ComponentCallbacksC5392m;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.composer.view.multiframebinder.BindStep;
import ru.ozon.app.android.composer.view.multiframebinder.FrameBinder;
import ru.ozon.app.android.ugc.core.R$string;
import ru.ozon.app.android.ugc.core.databinding.ItemSingleReviewBinding;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.LazyUtilsKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.html.spans.OzonClickableSpan;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u000fJ\u000f\u0010\u001c\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u000fJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010$R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R'\u0010/\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\r0)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u00102\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/SingleReviewViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/SingleReviewVO;", "Lru/ozon/app/android/ugc/core/databinding/ItemSingleReviewBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "frameBinder", "<init>", "(Lru/ozon/app/android/ugc/core/databinding/ItemSingleReviewBinding;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;)V", "", "bindBody", "()V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "body", "setSpanColor", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "bindMargins", "()Lru/ozon/app/android/ugc/core/widgets/singlereview/SingleReviewVO;", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/SingleReviewVO;Ll20/d;)V", "onAttach", "onDetach", "", "offscreenOffsetPercent", "onOffscreenPositionChanged", "(F)V", "onRecycle", "Lru/ozon/app/android/ugc/core/databinding/ItemSingleReviewBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/composer/view/multiframebinder/FrameBinder;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "bodyAtomsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Lkotlin/Function1;", "Landroid/view/View;", "bodyAtomsClickListener$delegate", "LSc/j;", "getBodyAtomsClickListener", "()Lkotlin/jvm/functions/Function1;", "bodyAtomsClickListener", "", "Lru/ozon/app/android/composer/view/multiframebinder/BindStep;", "steps", "Ljava/util/List;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingleReviewViewHolder extends k<SingleReviewVO> {

    @NotNull
    private final ItemSingleReviewBinding binding;

    @NotNull
    private final AtomsAdapter bodyAtomsAdapter;

    /* renamed from: bodyAtomsClickListener$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j bodyAtomsClickListener;

    @NotNull
    private final FrameBinder frameBinder;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final List<BindStep> steps;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SingleReviewViewHolder(@NotNull ItemSingleReviewBinding binding, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics, @NotNull FrameBinder frameBinder) {
        super(r0);
        View view;
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(frameBinder, "frameBinder");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.frameBinder = frameBinder;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.bodyAtomsAdapter = atomsAdapter;
        this.bodyAtomsClickListener = LazyUtilsKt.unsafeLazy(new SingleReviewViewHolder$bodyAtomsClickListener$2(this));
        b builder = C7714v.B();
        builder.add(new SingleReviewViewHolder$steps$1$1(this));
        builder.add(new SingleReviewViewHolder$sam$ru_ozon_app_android_composer_view_multiframebinder_BindStep$0(new SingleReviewViewHolder$steps$1$2(this)));
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.steps = builder.B();
        View itemView = this.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        frameBinder.init(itemView);
        ComponentCallbacksC5392m c11 = refs.getContainer().c();
        frameBinder.applyRecycler((c11 == null || (view = c11.getView()) == null) ? null : ComposerViewExtensionKt.composerRecyclerView(view));
        binding.bodyAtomsVAL.setAdapter(atomsAdapter);
        binding.bodyAtomsVAL.setDecorator(new SingleReviewBodyAtomDecorator(getContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindBody() {
        SingleReviewVO boundData = getBoundData();
        if (boundData != null) {
            List<TextDTO> bodyCollapsedAtoms = boundData.getBodyCollapsedAtoms();
            if (bodyCollapsedAtoms != null) {
                TextDTO textDTO = (TextDTO) C7714v.Z(bodyCollapsedAtoms);
                if (textDTO != null) {
                    setSpanColor(textDTO);
                }
            } else {
                bodyCollapsedAtoms = boundData.getBodyAtoms();
            }
            VerticalAtomsLayout verticalAtomsLayout = this.binding.bodyAtomsVAL;
            AtomsAdapter atomsAdapter = this.bodyAtomsAdapter;
            Context context = verticalAtomsLayout.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            atomsAdapter.bind(context, bodyCollapsedAtoms);
            boolean z11 = boundData.getBodyCollapsedAtoms() != null;
            if (z11) {
                ViewExtKt.setOnClickListenerThrottle$default(verticalAtomsLayout, 0L, getBodyAtomsClickListener(), 1, null);
            }
            for (View view : ViewGroupExtKt.children(verticalAtomsLayout)) {
                TextAtomV2View textAtomV2View = view instanceof TextAtomV2View ? (TextAtomV2View) view : null;
                if (textAtomV2View != null) {
                    textAtomV2View.setTextIsSelectable(!z11);
                    textAtomV2View.setClickable(!z11);
                    textAtomV2View.setLongClickable(!z11);
                    textAtomV2View.setEnabled(!z11);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        if (r9 != (r3 != null ? r3.bottomMargin : 0)) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final SingleReviewVO bindMargins() {
        ItemSingleReviewBinding itemSingleReviewBinding = this.binding;
        SingleReviewVO boundData = getBoundData();
        if (boundData == null) {
            return null;
        }
        VerticalAtomsLayout bodyAtomsVAL = itemSingleReviewBinding.bodyAtomsVAL;
        Intrinsics.checkNotNullExpressionValue(bodyAtomsVAL, "bodyAtomsVAL");
        ViewGroup.LayoutParams layoutParams = bodyAtomsVAL.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int i11 = marginLayoutParams.leftMargin;
            int i12 = marginLayoutParams.topMargin;
            int i13 = marginLayoutParams.rightMargin;
            int i14 = marginLayoutParams.bottomMargin;
            marginLayoutParams.setMarginStart(boundData.getLeftMargin());
            marginLayoutParams.topMargin = boundData.getTopMargin();
            if (i11 == marginLayoutParams.leftMargin) {
                ViewGroup.LayoutParams layoutParams2 = bodyAtomsVAL.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (i12 == (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams3 = bodyAtomsVAL.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (i13 == (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams4 = bodyAtomsVAL.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    }
                }
            }
            bodyAtomsVAL.setLayoutParams(marginLayoutParams);
        }
        ConstraintLayout singleReviewCl = itemSingleReviewBinding.singleReviewCl;
        Intrinsics.checkNotNullExpressionValue(singleReviewCl, "singleReviewCl");
        ViewExtKt.updatePadding$default(singleReviewCl, 0, 0, 0, boundData.getBottomMargin(), 7, null);
        return boundData;
    }

    private final Function1<View, Unit> getBodyAtomsClickListener() {
        return (Function1) this.bodyAtomsClickListener.getValue();
    }

    private final void setSpanColor(TextDTO body) {
        int length = StringProvider.getString(R$string.common_more).length();
        Integer parseColor = StyleParser.INSTANCE.parseColor(getContext(), UniColors.TEXT_TERTIARY.getToken());
        if (parseColor != null) {
            Object[] spans = body.getText().getSpans(body.getText().length() - length, body.getText().length(), OzonClickableSpan.class);
            Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
            OzonClickableSpan ozonClickableSpan = (OzonClickableSpan) C7705l.R(spans);
            if (ozonClickableSpan != null) {
                ozonClickableSpan.setColor(parseColor);
            }
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        FrameBinder.DefaultImpls.onAttach$default(this.frameBinder, null, 1, null);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        this.frameBinder.onDetach();
    }

    @Override // jk0.j, lk0.b
    public void onOffscreenPositionChanged(float offscreenOffsetPercent) {
        super.onOffscreenPositionChanged(offscreenOffsetPercent);
        this.frameBinder.onOffscreenPositionChanged(offscreenOffsetPercent);
    }

    @Override // jk0.j
    public void onRecycle() {
        super.onRecycle();
        this.frameBinder.onRecycle();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SingleReviewVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.frameBinder.bind(this.steps, item.getViewItemKey());
    }
}
