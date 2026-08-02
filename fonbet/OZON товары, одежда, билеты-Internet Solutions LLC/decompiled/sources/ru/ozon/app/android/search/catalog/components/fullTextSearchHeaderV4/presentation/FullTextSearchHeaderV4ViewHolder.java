package ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV4.presentation;

import B90.RunnableC2610l;
import B90.l0;
import NC.b;
import Tl.a;
import W10.c;
import WZ.l;
import WZ.t;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV4.crosslink.CrossLinkV4Adapter;
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV4.crosslink.CrossLinkV4Decoration;
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV4.presentation.FullTextSearchHeaderV4VO;
import ru.ozon.app.android.search.common.BindingViewHolder;
import ru.ozon.app.android.search.databinding.WidgetFullTextSearchHeaderV4Binding;
import ru.ozon.app.android.search.widgets.utils.SelectUtilsKt;
import ru.ozon.app.android.storefrontcommonwidgets.core.appType.AppTypeResolver;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ConstraintSetExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.html.spans.OzonUrlSpan;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0010\n\u001a\u00060\bj\u0002`\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010%\u001a\u00020\r2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020\u00102\u0006\u0010'\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b(\u0010\u0018J3\u0010/\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010+\u001a\u00060)j\u0002`*2\u000e\u0010.\u001a\n\u0018\u00010,j\u0004\u0018\u0001`-H\u0016¢\u0006\u0004\b/\u00100J#\u00104\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00022\n\u00103\u001a\u000601j\u0002`2H\u0014¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0010H\u0016¢\u0006\u0004\b6\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00107R\u0018\u0010\n\u001a\u00060\bj\u0002`\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010>R\u0014\u0010@\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010>R\u0014\u0010A\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010>R\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006E"}, d2 = {"Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/presentation/FullTextSearchHeaderV4ViewHolder;", "Lru/ozon/app/android/search/common/BindingViewHolder;", "Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/presentation/FullTextSearchHeaderV4VO;", "Lru/ozon/app/android/search/databinding/WidgetFullTextSearchHeaderV4Binding;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;LWZ/l;)V", "", "isTitleNotBlank", "item", "", "bindHeader", "(ZLru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/presentation/FullTextSearchHeaderV4VO;)V", "isCrosslinksNotEmpty", "addPreDrawListener", "(Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/presentation/FullTextSearchHeaderV4VO;ZZ)V", "updateConstraintsBasedOnContent", "showOrGoneContent", "(ZZ)V", "updateMixedConstraints", "(Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/presentation/FullTextSearchHeaderV4VO;Z)V", "constraintCrosslinks", "()V", "constraintTitle", "", "calculateNumberOfLines", "()F", "Landroid/widget/TextView;", "textView", "", "text", "canTextFitInTwoLines", "(Landroid/widget/TextView;Ljava/lang/String;)Z", "doesFitInSingleLine", "updateConstraints", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/presentation/FullTextSearchHeaderV4VO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/presentation/FullTextSearchHeaderV4VO;Ll20/d;)V", "onDetach", "Lru/ozon/app/android/composer/ComposerReferences;", "LWZ/l;", "Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/crosslink/CrossLinkV4Adapter;", "crosslinkV4Adapter", "Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/crosslink/CrossLinkV4Adapter;", "", "dp6", "I", "dp8", "dp12", "dp16", "Landroid/os/Handler;", "mHandler", "Landroid/os/Handler;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FullTextSearchHeaderV4ViewHolder extends BindingViewHolder<FullTextSearchHeaderV4VO, WidgetFullTextSearchHeaderV4Binding> {

    @NotNull
    private final CrossLinkV4Adapter crosslinkV4Adapter;
    private final int dp12;
    private final int dp16;
    private final int dp6;
    private final int dp8;

    @NotNull
    private final Handler mHandler;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV4.presentation.FullTextSearchHeaderV4ViewHolder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<View, WidgetFullTextSearchHeaderV4Binding> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1, WidgetFullTextSearchHeaderV4Binding.class, "bind", "bind(Landroid/view/View;)Lru/ozon/app/android/search/databinding/WidgetFullTextSearchHeaderV4Binding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final WidgetFullTextSearchHeaderV4Binding invoke(View p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return WidgetFullTextSearchHeaderV4Binding.bind(p02);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullTextSearchHeaderV4ViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull l tokenizedAnalytics) {
        super(containerView, AnonymousClass1.INSTANCE);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.refs = refs;
        this.tokenizedAnalytics = tokenizedAnalytics;
        CrossLinkV4Adapter crossLinkV4Adapter = new CrossLinkV4Adapter(this, tokenizedAnalytics, new FullTextSearchHeaderV4ViewHolder$crosslinkV4Adapter$1(this));
        this.crosslinkV4Adapter = crossLinkV4Adapter;
        this.dp6 = ResourceExtKt.toPx(6);
        this.dp8 = ResourceExtKt.toPx(8);
        this.dp12 = ResourceExtKt.toPx(12);
        this.dp16 = ResourceExtKt.toPx(16);
        this.mHandler = new Handler(Looper.getMainLooper());
        WidgetFullTextSearchHeaderV4Binding binding = getBinding();
        RecyclerView recyclerView = binding.crosslinksRv;
        recyclerView.setAdapter(crossLinkV4Adapter);
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.addItemDecoration(new CrossLinkV4Decoration(context));
        binding.headerTv.setMovementMethod(LinkMovementMethod.getInstance());
        binding.headerTv.setOnTouchListener(new b(this, 1));
    }

    private final void addPreDrawListener(final FullTextSearchHeaderV4VO item, final boolean isTitleNotBlank, final boolean isCrosslinksNotEmpty) {
        getBinding().headerTv.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV4.presentation.FullTextSearchHeaderV4ViewHolder$addPreDrawListener$1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                WidgetFullTextSearchHeaderV4Binding binding;
                WidgetFullTextSearchHeaderV4Binding binding2;
                binding = FullTextSearchHeaderV4ViewHolder.this.getBinding();
                binding.headerTv.getViewTreeObserver().removeOnPreDrawListener(this);
                binding2 = FullTextSearchHeaderV4ViewHolder.this.getBinding();
                binding2.headerTv.setTextColor(ResourceExtKt.color(FullTextSearchHeaderV4ViewHolder.this.getContext(), SelectUtilsKt.getColorByEnvironment(AppTypeResolver.INSTANCE.isSelect(FullTextSearchHeaderV4ViewHolder.this.getContext()), R$color.text_primary, R$color.text_action_on_dark_select)));
                FullTextSearchHeaderV4ViewHolder.this.updateConstraintsBasedOnContent(item, isTitleNotBlank, isCrosslinksNotEmpty);
                return true;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindHeader(boolean isTitleNotBlank, FullTextSearchHeaderV4VO item) {
        OzonSpannableString ozonSpannableString;
        FullTextSearchHeaderV4VO.Header header;
        OzonSpannableString title;
        AppCompatTextView appCompatTextView = getBinding().headerTv;
        if (isTitleNotBlank) {
            FullTextSearchHeaderV4VO.Header header2 = item.getHeader();
            if (header2 == null || (title = header2.getTitle()) == null) {
                ozonSpannableString = null;
            } else {
                OzonUrlSpan.Companion companion = OzonUrlSpan.INSTANCE;
                Intrinsics.f(appCompatTextView);
                ozonSpannableString = companion.setOnUrlSpanClick(title, appCompatTextView, new FullTextSearchHeaderV4ViewHolder$bindHeader$1$1(this));
            }
            appCompatTextView.setText(ozonSpannableString);
            FullTextSearchHeaderV4VO fullTextSearchHeaderV4VO = (FullTextSearchHeaderV4VO) getBoundData();
            if (fullTextSearchHeaderV4VO == null || (header = fullTextSearchHeaderV4VO.getHeader()) == null) {
                return;
            }
            appCompatTextView.setTextAppearance(header.getStyle());
        }
    }

    private final float calculateNumberOfLines() {
        return ResourceExtKt.toPxF(getBinding().headerTv.getHeight()) / ResourceExtKt.toPxF(getBinding().headerTv.getLineHeight());
    }

    private final boolean canTextFitInTwoLines(TextView textView, String text) {
        int i11 = ContextExtKt.getAppUsableScreenSize(getContext()).x;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i12 = i11 - (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0);
        ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        int width = (i12 - (marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0)) - getBinding().crosslinksRv.getWidth();
        RecyclerView crosslinksRv = getBinding().crosslinksRv;
        Intrinsics.checkNotNullExpressionValue(crosslinksRv, "crosslinksRv");
        ViewGroup.LayoutParams layoutParams3 = crosslinksRv.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        int i13 = width - (marginLayoutParams3 != null ? marginLayoutParams3.leftMargin : 0);
        RecyclerView crosslinksRv2 = getBinding().crosslinksRv;
        Intrinsics.checkNotNullExpressionValue(crosslinksRv2, "crosslinksRv");
        ViewGroup.LayoutParams layoutParams4 = crosslinksRv2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
        int i14 = i13 - (marginLayoutParams4 != null ? marginLayoutParams4.rightMargin : 0);
        TextPaint paint = textView.getPaint();
        return ((int) (((float) textView.getHeight()) / (paint.descent() - paint.ascent()))) <= 2 && paint.measureText(text) / ((float) 2) <= ((float) i14);
    }

    private final void constraintCrosslinks() {
        WidgetFullTextSearchHeaderV4Binding binding = getBinding();
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        d d11 = a.d(constraintLayout, "getRoot(...)", constraintLayout);
        ConstraintSetExtKt.topToTop(d11, binding.crosslinksRv.getId(), binding.getConstraintLayout().getId(), this.dp6);
        ConstraintSetExtKt.startToStart$default(d11, binding.crosslinksRv.getId(), binding.getConstraintLayout().getId(), 0, 4, null);
        ConstraintSetExtKt.bottomToBottom(d11, binding.crosslinksRv.getId(), binding.getConstraintLayout().getId(), this.dp12);
        ConstraintSetExtKt.endToEnd$default(d11, binding.crosslinksRv.getId(), binding.getConstraintLayout().getId(), 0, 4, null);
        d11.f(constraintLayout);
    }

    private final void constraintTitle() {
        WidgetFullTextSearchHeaderV4Binding binding = getBinding();
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        d d11 = a.d(constraintLayout, "getRoot(...)", constraintLayout);
        ConstraintSetExtKt.topToTop(d11, binding.headerTv.getId(), binding.getConstraintLayout().getId(), this.dp6);
        ConstraintSetExtKt.startToStart(d11, binding.headerTv.getId(), binding.getConstraintLayout().getId(), this.dp16);
        ConstraintSetExtKt.bottomToBottom(d11, binding.headerTv.getId(), binding.getConstraintLayout().getId(), this.dp12);
        ConstraintSetExtKt.endToEnd(d11, binding.headerTv.getId(), binding.getConstraintLayout().getId(), this.dp16);
        d11.f(constraintLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean lambda$2$lambda$1(FullTextSearchHeaderV4ViewHolder fullTextSearchHeaderV4ViewHolder, View view, MotionEvent motionEvent) {
        FullTextSearchHeaderV4VO fullTextSearchHeaderV4VO;
        FullTextSearchHeaderV4VO.Header header;
        t tokenizedEvent;
        if (motionEvent.getAction() == 1 && (fullTextSearchHeaderV4VO = (FullTextSearchHeaderV4VO) fullTextSearchHeaderV4ViewHolder.getBoundData()) != null && (header = fullTextSearchHeaderV4VO.getHeader()) != null && (tokenizedEvent = header.getTokenizedEvent()) != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(fullTextSearchHeaderV4ViewHolder.tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
        view.performClick();
        return false;
    }

    private final void showOrGoneContent(boolean isTitleNotBlank, boolean isCrosslinksNotEmpty) {
        AppCompatTextView appCompatTextView = getBinding().headerTv;
        if (isTitleNotBlank) {
            this.mHandler.post(new RunnableC2610l(appCompatTextView, 3));
        } else {
            Intrinsics.f(appCompatTextView);
            ViewExtKt.gone(appCompatTextView);
        }
        RecyclerView recyclerView = getBinding().crosslinksRv;
        if (isCrosslinksNotEmpty) {
            this.mHandler.post(new l0(recyclerView, 4));
        } else {
            Intrinsics.f(recyclerView);
            ViewExtKt.gone(recyclerView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showOrGoneContent$lambda$7$lambda$6(AppCompatTextView appCompatTextView) {
        Intrinsics.f(appCompatTextView);
        ViewExtKt.show(appCompatTextView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showOrGoneContent$lambda$9$lambda$8(RecyclerView recyclerView) {
        Intrinsics.f(recyclerView);
        ViewExtKt.show(recyclerView);
    }

    private final void updateConstraints(boolean doesFitInSingleLine, boolean isTitleNotBlank) {
        WidgetFullTextSearchHeaderV4Binding binding = getBinding();
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        d d11 = a.d(constraintLayout, "getRoot(...)", constraintLayout);
        int i11 = (!isTitleNotBlank || calculateNumberOfLines() > 1.0f) ? this.dp8 : this.dp6;
        if (doesFitInSingleLine) {
            ConstraintSetExtKt.topToTop$default(d11, binding.headerTv.getId(), binding.crosslinksRv.getId(), 0, 4, null);
            ConstraintSetExtKt.bottomToBottom$default(d11, binding.headerTv.getId(), binding.crosslinksRv.getId(), 0, 4, null);
            ConstraintSetExtKt.endToStart(d11, binding.headerTv.getId(), binding.crosslinksRv.getId(), this.dp12);
            ConstraintSetExtKt.topToTop(d11, binding.crosslinksRv.getId(), binding.getConstraintLayout().getId(), i11);
            ConstraintSetExtKt.bottomToBottom(d11, binding.crosslinksRv.getId(), binding.getConstraintLayout().getId(), this.dp12);
            ConstraintSetExtKt.endToEnd(d11, binding.crosslinksRv.getId(), binding.getConstraintLayout().getId(), this.dp16);
            ConstraintSetExtKt.clearStart(d11, binding.crosslinksRv.getId());
        } else {
            ConstraintSetExtKt.topToTop(d11, binding.headerTv.getId(), binding.getConstraintLayout().getId(), this.dp6);
            ConstraintSetExtKt.endToEnd(d11, binding.headerTv.getId(), binding.getConstraintLayout().getId(), this.dp16);
            ConstraintSetExtKt.clearBottom(d11, binding.headerTv.getId());
            ConstraintSetExtKt.topToBottom(d11, binding.crosslinksRv.getId(), binding.headerTv.getId(), i11);
            ConstraintSetExtKt.startToStart$default(d11, binding.crosslinksRv.getId(), binding.getConstraintLayout().getId(), 0, 4, null);
            ConstraintSetExtKt.bottomToBottom(d11, binding.crosslinksRv.getId(), binding.getConstraintLayout().getId(), this.dp12);
            ConstraintSetExtKt.endToEnd$default(d11, binding.crosslinksRv.getId(), binding.getConstraintLayout().getId(), 0, 4, null);
        }
        d11.f(constraintLayout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateConstraintsBasedOnContent(FullTextSearchHeaderV4VO item, boolean isTitleNotBlank, boolean isCrosslinksNotEmpty) {
        if (isTitleNotBlank && !isCrosslinksNotEmpty) {
            constraintTitle();
        } else if (isTitleNotBlank || !isCrosslinksNotEmpty) {
            updateMixedConstraints(item, isTitleNotBlank);
        } else {
            constraintCrosslinks();
        }
        showOrGoneContent(isTitleNotBlank, isCrosslinksNotEmpty);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002c, code lost:
    
        if (r3.getCrosslinks().size() <= 1) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void updateMixedConstraints(FullTextSearchHeaderV4VO item, boolean isTitleNotBlank) {
        AppCompatTextView headerTv = getBinding().headerTv;
        Intrinsics.checkNotNullExpressionValue(headerTv, "headerTv");
        FullTextSearchHeaderV4VO.Header header = item.getHeader();
        boolean z11 = canTextFitInTwoLines(headerTv, String.valueOf(header != null ? header.getTitle() : null));
        updateConstraints(z11, isTitleNotBlank);
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        this.mHandler.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull FullTextSearchHeaderV4VO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        FullTextSearchHeaderV4VO.Header header = item.getHeader();
        OzonSpannableString title = header != null ? header.getTitle() : null;
        boolean z11 = !(title == null || h.K(title));
        boolean isEmpty = true ^ item.getCrosslinks().isEmpty();
        getBinding().getConstraintLayout().setBackgroundColor(ThemeExtKt.themeColor(getContext(), SelectUtilsKt.getColorByEnvironment(AppTypeResolver.INSTANCE.isSelect(getContext()), R$attr.layerFloor1, R$attr.layerFloor0)));
        bindHeader(z11, item);
        this.crosslinkV4Adapter.submitList(item.getCrosslinks());
        addPreDrawListener(item, z11, isEmpty);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull FullTextSearchHeaderV4VO item, @NotNull c trackingData, f viewedPond) {
        t tokenizedEvent;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent2 = item.getTokenizedEvent();
        if (tokenizedEvent2 != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent2, null, 2, null);
        }
        FullTextSearchHeaderV4VO.Header header = item.getHeader();
        if (header == null || (tokenizedEvent = header.getTokenizedEvent()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.tokenizedAnalytics, tokenizedEvent, null, 2, null);
    }
}
