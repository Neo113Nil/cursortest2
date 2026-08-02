package ru.ozon.app.android.atoms.html.spans;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import com.google.android.gms.common.internal.ImagesContract;
import java.lang.ref.WeakReference;
import ji.C7430a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0018R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u0007\u0010\u001f\"\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R*\u0010'\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020&0%\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/atoms/html/spans/OzonUrlSpan;", "Landroid/text/style/URLSpan;", "", ImagesContract.URL, "", "linkColor", "", "isUnderlined", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Z)V", "Landroid/text/TextPaint;", "ds", "", "updateDrawState", "(Landroid/text/TextPaint;)V", "getURL", "()Ljava/lang/String;", "Landroid/view/View;", "widget", "onClick", "(Landroid/view/View;)V", "Ljava/lang/String;", "getUrl", "setUrl", "(Ljava/lang/String;)V", "Ljava/lang/Integer;", "getLinkColor", "()Ljava/lang/Integer;", "setLinkColor", "(Ljava/lang/Integer;)V", "Z", "()Z", "setUnderlined", "(Z)V", "clickHolderId", "I", "Ljava/lang/ref/WeakReference;", "Lkotlin/Function1;", "", "onClickRef", "Ljava/lang/ref/WeakReference;", "Companion", "design-system_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OzonUrlSpan extends URLSpan {
    private final int clickHolderId;
    private boolean isUnderlined;
    private Integer linkColor;
    private WeakReference<Function1<String, Object>> onClickRef;

    @NotNull
    private String url;
    public static final int $stable = 8;

    public /* synthetic */ OzonUrlSpan(String str, Integer num, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? false : z11);
    }

    @Override // android.text.style.URLSpan
    @NotNull
    public String getURL() {
        return this.url;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(@NotNull View widget) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        WeakReference<Function1<String, Object>> weakReference = this.onClickRef;
        Function1<String, Object> function1 = weakReference != null ? weakReference.get() : null;
        int i11 = C7430a.f70125b;
        if (function1 == null || Intrinsics.d(function1.invoke(this.url), Boolean.FALSE)) {
            super.onClick(widget);
        }
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
        this.clickHolderId = R.id.ozon_url_span_click_holder_id;
    }
}
