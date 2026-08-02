package ru.ozon.app.android.search.aiMessenger.blocks.markdown.presentation;

import Hf.y;
import Ub.d;
import Ub.f;
import Ub.j;
import Ub.r;
import Ub.t;
import Vb.p;
import Vb.q;
import Vb.r;
import Zb.C4899b;
import ac.C4994c;
import android.content.Context;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.util.TypedValue;
import android.widget.TextView;
import hc.C6909a;
import jc.C7336c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.search.aiMessenger.blocks.markdown.presentation.AIMarkdownChatView;
import ru.ozon.app.android.search.aiMessenger.blocks.markdown.presentation.AIMarkdownChatView$markWon$2;
import ru.ozon.app.android.search.aiMessenger.blocks.markdown.presentation.spans.BulletSpan;
import ru.ozon.app.android.search.aiMessenger.blocks.markdown.presentation.spans.RemoveHeadingSpacingSpan;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.html.spans.CustomTypefaceSpan;
import ru.ozon.uni.core.R$color;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LUb/d;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "()LUb/d;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes13.dex */
public final class AIMarkdownChatView$markWon$2 extends AbstractC7737t implements Function0<d> {
    final /* synthetic */ AIMarkdownChatView this$0;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"ru/ozon/app/android/search/aiMessenger/blocks/markdown/presentation/AIMarkdownChatView$markWon$2$2", "LUb/a;", "Landroid/widget/TextView;", "textView", "Landroid/text/Spanned;", "markdown", "", "beforeSetText", "(Landroid/widget/TextView;Landroid/text/Spanned;)V", "LVb/r$a;", "builder", "configureTheme", "(LVb/r$a;)V", "LUb/j$a;", "configureSpansFactory", "(LUb/j$a;)V", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.search.aiMessenger.blocks.markdown.presentation.AIMarkdownChatView$markWon$2$2, reason: invalid class name */
    public static final class AnonymousClass2 extends Ub.a {
        final /* synthetic */ AIMarkdownChatView this$0;

        AnonymousClass2(AIMarkdownChatView aIMarkdownChatView) {
            this.this$0 = aIMarkdownChatView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object configureSpansFactory$lambda$1(AIMarkdownChatView aIMarkdownChatView, f fVar, r rVar) {
            Typeface typeface;
            Intrinsics.checkNotNullParameter(fVar, "<unused var>");
            Intrinsics.checkNotNullParameter(rVar, "<unused var>");
            typeface = aIMarkdownChatView.headingFont;
            return new CustomTypefaceSpan[]{new CustomTypefaceSpan(typeface)};
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object configureSpansFactory$lambda$2(f fVar, r rVar) {
            Intrinsics.checkNotNullParameter(fVar, "<unused var>");
            Intrinsics.checkNotNullParameter(rVar, "<unused var>");
            return new RemoveHeadingSpacingSpan();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object configureSpansFactory$lambda$3(AIMarkdownChatView aIMarkdownChatView, t tVar, f configuration, r props) {
            Context context;
            Context context2;
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(props, "props");
            if (q.f28492a.a(props) != q.a.BULLET) {
                return tVar.a(configuration, props);
            }
            context = aIMarkdownChatView.getContext();
            int applyDimension = (int) TypedValue.applyDimension(1, 2.5f, context.getResources().getDisplayMetrics());
            context2 = aIMarkdownChatView.getContext();
            return new BulletSpan(applyDimension, (int) TypedValue.applyDimension(1, 20.0f, context2.getResources().getDisplayMetrics()));
        }

        @Override // Ub.a, Ub.h
        public void beforeSetText(TextView textView, Spanned markdown) {
            Intrinsics.checkNotNullParameter(textView, "textView");
            Intrinsics.checkNotNullParameter(markdown, "markdown");
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setTextIsSelectable(true);
        }

        @Override // Ub.a, Ub.h
        public void configureSpansFactory(j.a builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            final AIMarkdownChatView aIMarkdownChatView = this.this$0;
            builder.b(y.class, new t() { // from class: HH.a
                @Override // Ub.t
                public final Object a(f fVar, r rVar) {
                    Object configureSpansFactory$lambda$1;
                    configureSpansFactory$lambda$1 = AIMarkdownChatView$markWon$2.AnonymousClass2.configureSpansFactory$lambda$1(AIMarkdownChatView.this, fVar, rVar);
                    return configureSpansFactory$lambda$1;
                }
            });
            builder.c(new HH.b());
            final t a11 = builder.a();
            Intrinsics.checkNotNullExpressionValue(a11, "requireFactory(...)");
            final AIMarkdownChatView aIMarkdownChatView2 = this.this$0;
            builder.b(Hf.t.class, new t() { // from class: HH.c
                @Override // Ub.t
                public final Object a(f fVar, r rVar) {
                    Object configureSpansFactory$lambda$3;
                    configureSpansFactory$lambda$3 = AIMarkdownChatView$markWon$2.AnonymousClass2.configureSpansFactory$lambda$3(AIMarkdownChatView.this, a11, fVar, rVar);
                    return configureSpansFactory$lambda$3;
                }
            });
        }

        @Override // Ub.a, Ub.h
        public void configureTheme(r.a builder) {
            Typeface typeface;
            Intrinsics.checkNotNullParameter(builder, "builder");
            typeface = this.this$0.headingFont;
            if (typeface != null) {
                builder.n(typeface);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AIMarkdownChatView$markWon$2(AIMarkdownChatView aIMarkdownChatView) {
        super(0);
        this.this$0 = aIMarkdownChatView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(AIMarkdownChatView aIMarkdownChatView, C4899b.a tableThemeBuilder) {
        Context context;
        Context context2;
        Context context3;
        Intrinsics.checkNotNullParameter(tableThemeBuilder, "tableThemeBuilder");
        tableThemeBuilder.getClass();
        context = aIMarkdownChatView.getContext();
        tableThemeBuilder.e(ResourceExtKt.color(context, R$color.layer_floor_1));
        context2 = aIMarkdownChatView.getContext();
        tableThemeBuilder.d(ResourceExtKt.color(context2, R$color.layer_floor_1));
        context3 = aIMarkdownChatView.getContext();
        tableThemeBuilder.f(ResourceExtKt.color(context3, R$color.layer_floor_1));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final d invoke() {
        Context context;
        Context context2;
        context = this.this$0.getContext();
        d.a a11 = d.a(context);
        a11.a(p.c());
        a11.a(new Yb.a());
        a11.a(C6909a.b());
        a11.a(C7336c.a(new b(this.this$0)));
        a11.a(new AnonymousClass2(this.this$0));
        context2 = this.this$0.getContext();
        a11.a(C4994c.a(context2));
        return a11.build();
    }
}
