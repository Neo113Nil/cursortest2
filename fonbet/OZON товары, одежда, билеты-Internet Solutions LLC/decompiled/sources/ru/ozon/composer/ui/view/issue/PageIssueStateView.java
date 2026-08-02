package ru.ozon.composer.ui.view.issue;

import Sc.k;
import Sc.n;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import j.C7232a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import me.zhanghai.android.materialprogressbar.MaterialProgressBar;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.app.android.composer.view.screenState.PageIssueListener;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedButtonHolderKt;
import z00.f;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/composer/ui/view/issue/PageIssueStateView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "a", "composer-recycler-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PageIssueStateView extends ConstraintLayout {

    /* renamed from: i, reason: collision with root package name */
    private static final int f94847i = UiExtKt.toPx(86);

    /* renamed from: j, reason: collision with root package name */
    private static final int f94848j = UiExtKt.toPx(8);

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f94849k = 0;

    /* renamed from: c, reason: collision with root package name */
    private f f94850c;

    /* renamed from: d, reason: collision with root package name */
    private AbstractC7737t f94851d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f94852e;

    /* renamed from: f, reason: collision with root package name */
    private PageIssueListener f94853f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final Object f94854g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final Object f94855h;

    public interface a {
        void onErrorSummaryClick();
    }

    final class b extends AbstractC7737t implements Function0<B10.a> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f94856b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ PageIssueStateView f94857c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, PageIssueStateView pageIssueStateView) {
            super(0);
            this.f94856b = context;
            this.f94857c = pageIssueStateView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final B10.a invoke() {
            Context context = this.f94856b;
            PageIssueStateView pageIssueStateView = this.f94857c;
            B10.a a11 = B10.a.a(View.inflate(context, R.layout.view_layout_screen_state, pageIssueStateView));
            a11.f2182g.setOnClickListener(new BQ.b(pageIssueStateView, 2));
            a11.f2179d.setOnClickListener(new DS.a(pageIssueStateView, 7));
            Intrinsics.checkNotNullExpressionValue(a11, "apply(...)");
            return a11;
        }
    }

    final class c extends AbstractC7737t implements Function0<T10.c> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final T10.c invoke() {
            MaterialProgressBar progress = PageIssueStateView.e(PageIssueStateView.this).f2181f;
            Intrinsics.checkNotNullExpressionValue(progress, "progress");
            return new T10.c(progress);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageIssueStateView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        n nVar = n.NONE;
        this.f94854g = k.a(nVar, new b(context, this));
        this.f94855h = k.a(nVar, new c());
        if (isInEditMode()) {
            return;
        }
        setClickable(true);
        setFocusable(true);
        setBackgroundColor(androidx.core.content.a.getColor(context, R$color.oz_semantic_bg_secondary));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    public static void b(PageIssueStateView pageIssueStateView) {
        ?? r02 = pageIssueStateView.f94851d;
        if (r02 != 0) {
            r02.invoke();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    public static void c(PageIssueStateView pageIssueStateView) {
        ?? r02 = pageIssueStateView.f94851d;
        if (r02 != 0) {
            r02.invoke();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    public static void d(f fVar, PageIssueStateView pageIssueStateView) {
        Function0<Unit> a11 = ((V10.c) fVar).a();
        if (a11 != null) {
            a11.invoke();
            return;
        }
        ?? r02 = pageIssueStateView.f94851d;
        if (r02 != 0) {
            r02.invoke();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final B10.a e(PageIssueStateView pageIssueStateView) {
        return (B10.a) pageIssueStateView.f94854g.getValue();
    }

    private static void f(TextView textView, String str, Function1 function1, boolean z11) {
        if (function1 == null) {
            Intrinsics.checkNotNullParameter(textView, "<this>");
            textView.setFocusable(false);
            textView.setFocusableInTouchMode(false);
            p(textView, str);
            return;
        }
        p(textView, (CharSequence) function1.invoke(str));
        if (z11) {
            Intrinsics.checkNotNullParameter(textView, "<this>");
            textView.setFocusable(true);
            textView.setFocusableInTouchMode(true);
        } else {
            Intrinsics.checkNotNullParameter(textView, "<this>");
            textView.setFocusable(false);
            textView.setFocusableInTouchMode(false);
        }
    }

    static /* synthetic */ void g(PageIssueStateView pageIssueStateView, TextView textView, String str, Function1 function1, int i11) {
        if ((i11 & 2) != 0) {
            function1 = null;
        }
        pageIssueStateView.getClass();
        f(textView, str, function1, false);
    }

    private final void k(B10.a aVar) {
        SmallButtonView smallButtonView = aVar.f2182g;
        smallButtonView.setText(smallButtonView.getContext().getString(R.string.error_refresh_action));
        smallButtonView.setOnClickListener(new CX.a(this, 4));
        smallButtonView.setVisibility(0);
    }

    static void n(PageIssueStateView pageIssueStateView, B10.a aVar) {
        pageIssueStateView.getClass();
        SmallButtonView screenStateSecondaryActionBtn = aVar.f2184i;
        Intrinsics.checkNotNullExpressionValue(screenStateSecondaryActionBtn, "screenStateSecondaryActionBtn");
        screenStateSecondaryActionBtn.setVisibility(8);
    }

    private static void p(TextView textView, CharSequence charSequence) {
        int i11;
        if (charSequence != null) {
            if (h.z0(charSequence).length() <= 0) {
                charSequence = null;
            }
            if (charSequence != null) {
                textView.setText(charSequence);
                i11 = 0;
                textView.setVisibility(i11);
            }
        }
        i11 = 8;
        textView.setVisibility(i11);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.internal.t] */
    public final Function0<Unit> h() {
        return this.f94851d;
    }

    /* renamed from: i, reason: from getter */
    public final f getF94850c() {
        return this.f94850c;
    }

    public final a j() {
        return this.f94853f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(Function0<Unit> function0) {
        this.f94851d = (AbstractC7737t) function0;
    }

    public final void m(PageIssueListener pageIssueListener) {
        this.f94853f = pageIssueListener;
    }

    public final void o(boolean z11) {
        this.f94852e = z11;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Sc.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [Sc.j, java.lang.Object] */
    public final void q(f fVar) {
        View.OnClickListener onClickListener;
        if (fVar == null && this.f94850c == null) {
            return;
        }
        B10.a aVar = (B10.a) this.f94854g.getValue();
        boolean z11 = this.f94852e;
        setBackgroundColor(androidx.core.content.a.getColor(getContext(), R$color.oz_semantic_bg_secondary));
        this.f94850c = fVar;
        boolean z12 = fVar instanceof f.a;
        ?? r62 = this.f94855h;
        if (z12) {
            ImageView errorLogoIv = aVar.f2178c;
            Intrinsics.checkNotNullExpressionValue(errorLogoIv, "errorLogoIv");
            errorLogoIv.setImageDrawable(C7232a.a(errorLogoIv.getContext(), R.drawable.ic_no_network_state));
            ImageView errorLogoIv2 = aVar.f2178c;
            Intrinsics.checkNotNullExpressionValue(errorLogoIv2, "errorLogoIv");
            errorLogoIv2.setVisibility(0);
            TextView errorTitleTv = aVar.f2180e;
            Intrinsics.checkNotNullExpressionValue(errorTitleTv, "errorTitleTv");
            p(errorTitleTv, getContext().getString(R.string.error_no_connection_title));
            errorTitleTv.setGravity(17);
            TextView errorDescTv = aVar.f2177b;
            Intrinsics.checkNotNullExpressionValue(errorDescTv, "errorDescTv");
            String string = getContext().getString(R.string.error_no_connection_description);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            g(this, errorDescTv, string, null, 6);
            errorDescTv.setGravity(17);
            errorDescTv.setTextIsSelectable(false);
            errorDescTv.setOnClickListener(null);
            k(aVar);
            n(this, aVar);
            ((T10.c) r62.getValue()).c();
            setVisibility(0);
            return;
        }
        if (fVar instanceof f.c) {
            ImageView errorLogoIv3 = aVar.f2178c;
            Intrinsics.checkNotNullExpressionValue(errorLogoIv3, "errorLogoIv");
            errorLogoIv3.setImageDrawable(C7232a.a(errorLogoIv3.getContext(), R.drawable.ic_errors_state));
            ImageView errorLogoIv4 = aVar.f2178c;
            Intrinsics.checkNotNullExpressionValue(errorLogoIv4, "errorLogoIv");
            errorLogoIv4.setVisibility(0);
            TextView errorTitleTv2 = aVar.f2180e;
            Intrinsics.checkNotNullExpressionValue(errorTitleTv2, "errorTitleTv");
            p(errorTitleTv2, getContext().getString(R.string.technical_error_title));
            errorTitleTv2.setGravity(17);
            f.c cVar = (f.c) fVar;
            String c11 = cVar.c();
            TextView errorDescTv2 = aVar.f2177b;
            if (c11 == null || h.K(c11) || cVar.d()) {
                Intrinsics.checkNotNullExpressionValue(errorDescTv2, "errorDescTv");
                String string2 = getContext().getString(R.string.technical_error_description);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                onClickListener = null;
                g(this, errorDescTv2, string2, null, 6);
                errorDescTv2.setTextIsSelectable(false);
            } else {
                Intrinsics.checkNotNullExpressionValue(errorDescTv2, "errorDescTv");
                String string3 = getContext().getString(R.string.error_trace_description, cVar.c());
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                g(this, errorDescTv2, string3, ru.ozon.composer.ui.view.issue.a.f94859b, 4);
                errorDescTv2.setTextIsSelectable(true);
                onClickListener = null;
            }
            errorDescTv2.setOnClickListener(onClickListener);
            errorDescTv2.setGravity(17);
            SmallButtonView errorSummaryBtn = aVar.f2179d;
            Intrinsics.checkNotNullExpressionValue(errorSummaryBtn, "errorSummaryBtn");
            errorSummaryBtn.setVisibility(z11 ? 0 : 8);
            k(aVar);
            n(this, aVar);
            aVar.f2182g.setOnClickListener(new EI.a(this, 4));
            ((T10.c) r62.getValue()).c();
            setVisibility(0);
            return;
        }
        boolean z13 = fVar instanceof V10.a;
        int i11 = f94847i;
        if (z13) {
            ImageView errorLogoIv5 = aVar.f2178c;
            Intrinsics.checkNotNullExpressionValue(errorLogoIv5, "errorLogoIv");
            ((V10.a) fVar).getClass();
            errorLogoIv5.setImageDrawable(C7232a.a(errorLogoIv5.getContext(), 0));
            ImageView errorLogoIv6 = aVar.f2178c;
            Intrinsics.checkNotNullExpressionValue(errorLogoIv6, "errorLogoIv");
            errorLogoIv6.setVisibility(0);
            ViewGroup.LayoutParams layoutParams = errorLogoIv6.getLayoutParams();
            layoutParams.width = i11;
            layoutParams.height = i11;
            errorLogoIv6.setLayoutParams(layoutParams);
            errorLogoIv6.setOnClickListener(null);
            Intrinsics.checkNotNullExpressionValue(aVar.f2180e, "errorTitleTv");
            throw null;
        }
        if (!(fVar instanceof V10.c)) {
            if (!(fVar instanceof V10.b)) {
                if (fVar instanceof f.b) {
                    setVisibility(8);
                    return;
                } else {
                    setVisibility(8);
                    return;
                }
            }
            ImageView errorLogoIv7 = aVar.f2178c;
            Intrinsics.checkNotNullExpressionValue(errorLogoIv7, "errorLogoIv");
            errorLogoIv7.setImageDrawable(C7232a.a(errorLogoIv7.getContext(), R.drawable.ic_errors_state));
            aVar.f2178c.setOnClickListener(null);
            ((V10.b) fVar).getClass();
            String string4 = getContext().getString(R.string.technical_error_title);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            String string5 = getContext().getString(R.string.technical_error_description);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            TextView errorTitleTv3 = aVar.f2180e;
            Intrinsics.checkNotNullExpressionValue(errorTitleTv3, "errorTitleTv");
            p(errorTitleTv3, string4);
            errorTitleTv3.setGravity(17);
            TextView errorDescTv3 = aVar.f2177b;
            Intrinsics.checkNotNullExpressionValue(errorDescTv3, "errorDescTv");
            g(this, errorDescTv3, string5, null, 6);
            errorDescTv3.setTextIsSelectable(false);
            errorDescTv3.setOnClickListener(null);
            errorDescTv3.setGravity(17);
            k(aVar);
            n(this, aVar);
            ((T10.c) r62.getValue()).c();
            setVisibility(0);
            return;
        }
        ImageView errorLogoIv8 = aVar.f2178c;
        Intrinsics.checkNotNullExpressionValue(errorLogoIv8, "errorLogoIv");
        V10.c cVar2 = (V10.c) fVar;
        cVar2.getClass();
        errorLogoIv8.setImageDrawable(C7232a.a(errorLogoIv8.getContext(), R.drawable.ic_errors_state));
        ImageView errorLogoIv9 = aVar.f2178c;
        errorLogoIv9.setOnClickListener(null);
        ViewGroup.LayoutParams layoutParams2 = errorLogoIv9.getLayoutParams();
        layoutParams2.width = i11;
        layoutParams2.height = i11;
        errorLogoIv9.setLayoutParams(layoutParams2);
        Intrinsics.checkNotNullExpressionValue(errorLogoIv9, "errorLogoIv");
        errorLogoIv9.setVisibility(0);
        TextView errorTitleTv4 = aVar.f2180e;
        Intrinsics.checkNotNullExpressionValue(errorTitleTv4, "errorTitleTv");
        p(errorTitleTv4, cVar2.getTitle());
        errorTitleTv4.setGravity(17);
        String e11 = cVar2.e();
        TextView errorDescTv4 = aVar.f2177b;
        if (e11 != null) {
            Intrinsics.checkNotNullExpressionValue(errorDescTv4, "errorDescTv");
            errorDescTv4.setVisibility(0);
            Intrinsics.checkNotNullExpressionValue(errorDescTv4, "errorDescTv");
            f(errorDescTv4, e11, new ru.ozon.composer.ui.view.issue.b(e11), cVar2.f() != null);
            errorDescTv4.setTextIsSelectable(false);
            if (cVar2.f() != null) {
                errorDescTv4.setOnClickListener(new EJ.a(fVar, 2));
            } else {
                errorDescTv4.setOnClickListener(null);
            }
            errorDescTv4.setGravity(17);
        } else {
            Intrinsics.checkNotNullExpressionValue(errorDescTv4, "errorDescTv");
            errorDescTv4.setVisibility(8);
        }
        String b11 = cVar2.b();
        SmallButtonView screenStateActionBtn = aVar.f2182g;
        if (b11 != null) {
            screenStateActionBtn.setText(b11);
            Intrinsics.checkNotNullExpressionValue(screenStateActionBtn, "screenStateActionBtn");
            screenStateActionBtn.setVisibility(0);
        } else {
            Intrinsics.checkNotNullExpressionValue(screenStateActionBtn, "screenStateActionBtn");
            screenStateActionBtn.setVisibility(8);
        }
        screenStateActionBtn.setOnClickListener(new BP.a(3, fVar, this));
        LinearLayout linearLayout = aVar.f2183h;
        linearLayout.removeAllViews();
        for (ButtonV3Atom.SmallButton smallButton : cVar2.c()) {
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            int i12 = ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin;
            int i13 = ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin;
            int i14 = f94848j;
            layoutParams3.setMargins(i12, i14, i13, i14);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            SmallButtonView smallButtonView = new SmallButtonView(context, null, 0, 6, null);
            WrappedButtonHolderKt.bind(smallButtonView, smallButton, cVar2.d());
            linearLayout.addView(smallButtonView, layoutParams3);
        }
        n(this, aVar);
        ((T10.c) r62.getValue()).c();
        setVisibility(0);
    }
}
