package ru.ozon.app.android.storefront.core.socialAtoms.text;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012*\b\u0002\u0010\t\u001a$\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0006\u0010\u0015\u001a\u00020\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R0\u0010\t\u001a$\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/text/ClickableTagSpan;", "Landroid/text/style/ClickableSpan;", "deeplink", "", "tagColor", "", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "onTagClick", "Lkotlin/Function2;", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;Lkotlin/jvm/functions/Function2;)V", "Ljava/lang/Integer;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "onClick", "widget", "Landroid/view/View;", "copy", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ClickableTagSpan extends ClickableSpan {
    private final String deeplink;
    private final Function2<String, Map<String, TokenizedTrackingInfo>, Unit> onTagClick;
    private final Integer tagColor;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public ClickableTagSpan(String str, Integer num, Map<String, TokenizedTrackingInfo> map, Function2<? super String, ? super Map<String, TokenizedTrackingInfo>, Unit> function2) {
        this.deeplink = str;
        this.tagColor = num;
        this.trackingInfo = map;
        this.onTagClick = function2;
    }

    @NotNull
    public final ClickableTagSpan copy() {
        return new ClickableTagSpan(this.deeplink, this.tagColor, this.trackingInfo, this.onTagClick);
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@NotNull View widget) {
        Function2<String, Map<String, TokenizedTrackingInfo>, Unit> function2;
        Intrinsics.checkNotNullParameter(widget, "widget");
        String str = this.deeplink;
        if (str == null || (function2 = this.onTagClick) == null) {
            return;
        }
        function2.invoke(str, this.trackingInfo);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        super.updateDrawState(ds);
        ds.setUnderlineText(false);
        Integer num = this.tagColor;
        if (num != null) {
            ds.setColor(num.intValue());
        }
    }
}
