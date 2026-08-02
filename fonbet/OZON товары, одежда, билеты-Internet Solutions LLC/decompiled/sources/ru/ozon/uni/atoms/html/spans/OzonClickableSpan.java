package ru.ozon.uni.atoms.html.spans;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$id;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\u0004\b\u0014\u0010\u0015R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u0005\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R$\u0010\"\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0012\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/uni/atoms/html/spans/OzonClickableSpan;", "Landroid/text/style/ClickableSpan;", "", "color", "", "isUnderlined", "<init>", "(Ljava/lang/Integer;Z)V", "Landroid/text/TextPaint;", "ds", "", "updateDrawState", "(Landroid/text/TextPaint;)V", "Landroid/view/View;", "widget", "onClick", "(Landroid/view/View;)V", "view", "Lkotlin/Function0;", "newOnClick", "setOnClick", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "Ljava/lang/Integer;", "getColor", "()Ljava/lang/Integer;", "setColor", "(Ljava/lang/Integer;)V", "Z", "()Z", "setUnderlined", "(Z)V", "clickHolderId", "I", "Ljava/lang/ref/WeakReference;", "onClickRef", "Ljava/lang/ref/WeakReference;", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OzonClickableSpan extends ClickableSpan {
    private final int clickHolderId;
    private Integer color;
    private boolean isUnderlined;
    private WeakReference<Function0<Unit>> onClickRef;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/uni/atoms/html/spans/OzonClickableSpan$Companion;", "", "<init>", "()V", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "Landroid/view/View;", "view", "Lkotlin/Function0;", "", "newOnClick", "setOnClickableSpanClick", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Landroid/view/View;Lkotlin/jvm/functions/Function0;)Lru/ozon/uni/atoms/utils/OzonSpannableString;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final OzonSpannableString setOnClickableSpanClick(@NotNull OzonSpannableString ozonSpannableString, @NotNull View view, @NotNull Function0<Unit> newOnClick) {
            Intrinsics.checkNotNullParameter(ozonSpannableString, "<this>");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(newOnClick, "newOnClick");
            Object[] spans = ozonSpannableString.getSpans(0, ozonSpannableString.length(), OzonClickableSpan.class);
            Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
            for (Object obj : spans) {
                ((OzonClickableSpan) obj).setOnClick(view, newOnClick);
            }
            return ozonSpannableString;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OzonClickableSpan() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@NotNull View widget) {
        Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(widget, "widget");
        WeakReference<Function0<Unit>> weakReference = this.onClickRef;
        if (weakReference == null || (function0 = weakReference.get()) == null) {
            return;
        }
        function0.invoke();
    }

    public final void setColor(Integer num) {
        this.color = num;
    }

    public final void setOnClick(@NotNull View view, @NotNull Function0<Unit> newOnClick) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(newOnClick, "newOnClick");
        view.setTag(this.clickHolderId, newOnClick);
        this.onClickRef = new WeakReference<>(newOnClick);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        Integer num = this.color;
        ds.setColor(num != null ? num.intValue() : ds.linkColor);
        ds.setUnderlineText(this.isUnderlined);
    }

    public /* synthetic */ OzonClickableSpan(Integer num, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? false : z11);
    }

    public OzonClickableSpan(Integer num, boolean z11) {
        this.color = num;
        this.isUnderlined = z11;
        this.clickHolderId = R$id.ozon_clickable_span_click_holder_id;
    }
}
