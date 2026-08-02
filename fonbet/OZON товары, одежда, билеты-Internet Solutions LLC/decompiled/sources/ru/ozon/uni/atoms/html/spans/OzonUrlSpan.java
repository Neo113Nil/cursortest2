package ru.ozon.uni.atoms.html.spans;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import com.google.android.gms.common.internal.ImagesContract;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$id;
import ru.ozon.uni.android.ds.UniGlobalConfig;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001/B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00112\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010\"\u0004\b\u001f\u0010 R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010&\u001a\u0004\b\u0007\u0010'\"\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R*\u0010-\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00170\u0016\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lru/ozon/uni/atoms/html/spans/OzonUrlSpan;", "Landroid/text/style/URLSpan;", "", ImagesContract.URL, "", "linkColor", "", "isUnderlined", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Z)V", "Landroid/text/TextPaint;", "ds", "", "updateDrawState", "(Landroid/text/TextPaint;)V", "getURL", "()Ljava/lang/String;", "Landroid/view/View;", "widget", "onClick", "(Landroid/view/View;)V", "view", "Lkotlin/Function1;", "", "newOnClick", "setOnClick", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Z)Lru/ozon/uni/atoms/html/spans/OzonUrlSpan;", "Ljava/lang/String;", "getUrl", "setUrl", "(Ljava/lang/String;)V", "Ljava/lang/Integer;", "getLinkColor", "()Ljava/lang/Integer;", "setLinkColor", "(Ljava/lang/Integer;)V", "Z", "()Z", "setUnderlined", "(Z)V", "clickHolderId", "I", "Ljava/lang/ref/WeakReference;", "onClickRef", "Ljava/lang/ref/WeakReference;", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OzonUrlSpan extends URLSpan {
    private final int clickHolderId;
    private boolean isUnderlined;
    private Integer linkColor;
    private WeakReference<Function1<String, Object>> onClickRef;

    @NotNull
    private String url;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJe\u0010\u0012\u001a\u00020\u0004*\u00020\u00042\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\"\b\u0002\u0010\t\u001a\u001c\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/uni/atoms/html/spans/OzonUrlSpan$Companion;", "", "<init>", "()V", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "Landroid/view/View;", "view", "Lkotlin/Function1;", "", "newOnClick", "setOnUrlSpanClick", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Landroid/view/View;Lkotlin/jvm/functions/Function1;)Lru/ozon/uni/atoms/utils/OzonSpannableString;", "urlMapper", "", "newLinkColor", "", "newIsUnderlined", "Lkotlin/Pair;", "configUrlSpans", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;Ljava/lang/Boolean;Lkotlin/Pair;)Lru/ozon/uni/atoms/utils/OzonSpannableString;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ OzonSpannableString configUrlSpans$default(Companion companion, OzonSpannableString ozonSpannableString, Function1 function1, Integer num, Boolean bool, Pair pair, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                function1 = null;
            }
            if ((i11 & 2) != 0) {
                num = null;
            }
            if ((i11 & 4) != 0) {
                bool = null;
            }
            if ((i11 & 8) != 0) {
                pair = null;
            }
            return companion.configUrlSpans(ozonSpannableString, function1, num, bool, pair);
        }

        @NotNull
        public final OzonSpannableString configUrlSpans(@NotNull OzonSpannableString ozonSpannableString, Function1<? super String, String> function1, Integer num, Boolean bool, Pair<? extends View, ? extends Function1<? super String, ? extends Object>> pair) {
            Intrinsics.checkNotNullParameter(ozonSpannableString, "<this>");
            boolean z11 = function1 != null;
            boolean z12 = bool != null;
            boolean z13 = pair != null;
            Object[] spans = ozonSpannableString.getSpans(0, ozonSpannableString.length(), OzonUrlSpan.class);
            Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
            for (Object obj : spans) {
                OzonUrlSpan ozonUrlSpan = (OzonUrlSpan) obj;
                if (z11) {
                    ozonUrlSpan.setUrl(function1.invoke(ozonUrlSpan.getUrl()));
                }
                if (num != null) {
                    ozonUrlSpan.setLinkColor(num);
                }
                if (z12) {
                    ozonUrlSpan.setUnderlined(bool.booleanValue());
                }
                if (z13) {
                    ozonUrlSpan.setOnClick(pair.e(), pair.f());
                }
            }
            return ozonSpannableString;
        }

        @NotNull
        public final OzonSpannableString setOnUrlSpanClick(@NotNull OzonSpannableString ozonSpannableString, @NotNull View view, @NotNull Function1<? super String, ? extends Object> newOnClick) {
            Intrinsics.checkNotNullParameter(ozonSpannableString, "<this>");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(newOnClick, "newOnClick");
            Object[] spans = ozonSpannableString.getSpans(0, ozonSpannableString.length(), OzonUrlSpan.class);
            Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
            for (Object obj : spans) {
                ((OzonUrlSpan) obj).setOnClick(view, newOnClick);
            }
            return ozonSpannableString;
        }

        private Companion() {
        }
    }

    public /* synthetic */ OzonUrlSpan(String str, Integer num, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? false : z11);
    }

    public static /* synthetic */ OzonUrlSpan copy$default(OzonUrlSpan ozonUrlSpan, String str, Integer num, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = ozonUrlSpan.url;
        }
        if ((i11 & 2) != 0) {
            num = ozonUrlSpan.linkColor;
        }
        if ((i11 & 4) != 0) {
            z11 = ozonUrlSpan.isUnderlined;
        }
        return ozonUrlSpan.copy(str, num, z11);
    }

    @NotNull
    public final OzonUrlSpan copy(@NotNull String url, Integer linkColor, boolean isUnderlined) {
        Intrinsics.checkNotNullParameter(url, "url");
        OzonUrlSpan ozonUrlSpan = new OzonUrlSpan(url, linkColor, isUnderlined);
        ozonUrlSpan.onClickRef = this.onClickRef;
        return ozonUrlSpan;
    }

    public final Integer getLinkColor() {
        return this.linkColor;
    }

    @Override // android.text.style.URLSpan
    @NotNull
    public String getURL() {
        return this.url;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(@NotNull View widget) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        WeakReference<Function1<String, Object>> weakReference = this.onClickRef;
        Function1<String, Object> function1 = weakReference != null ? weakReference.get() : null;
        Function1<String, Object> urlSpanClickHandler = UniGlobalConfig.INSTANCE.getUrlSpanClickHandler();
        if (function1 == null || Intrinsics.d(function1.invoke(this.url), Boolean.FALSE)) {
            if (urlSpanClickHandler == null || Intrinsics.d(urlSpanClickHandler.invoke(this.url), Boolean.FALSE)) {
                super.onClick(widget);
            }
        }
    }

    public final void setLinkColor(Integer num) {
        this.linkColor = num;
    }

    public final void setOnClick(@NotNull View view, @NotNull Function1<? super String, ? extends Object> newOnClick) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(newOnClick, "newOnClick");
        view.setTag(this.clickHolderId, newOnClick);
        this.onClickRef = new WeakReference<>(newOnClick);
    }

    public final void setUnderlined(boolean z11) {
        this.isUnderlined = z11;
    }

    public final void setUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.url = str;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        Integer num = this.linkColor;
        ds.setColor(num != null ? num.intValue() : ds.linkColor);
        ds.setUnderlineText(this.isUnderlined);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OzonUrlSpan(@NotNull String url, Integer num, boolean z11) {
        super(url);
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
        this.linkColor = num;
        this.isUnderlined = z11;
        this.clickHolderId = R$id.ozon_url_span_click_holder_id;
    }
}
