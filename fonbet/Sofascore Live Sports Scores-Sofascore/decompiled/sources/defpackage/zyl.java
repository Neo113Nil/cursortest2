package defpackage;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.blaze.blazesdk.custom_views.BlazeExpandableAndScrollableTextView;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zyl extends ClickableSpan {
    public final /* synthetic */ BlazeExpandableAndScrollableTextView a;
    public final /* synthetic */ String b;

    public zyl(BlazeExpandableAndScrollableTextView blazeExpandableAndScrollableTextView, String str) {
        this.a = blazeExpandableAndScrollableTextView;
        this.b = str;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        view.getClass();
        Function1 function1 = this.a.m;
        if (function1 != null) {
            String str = this.b;
            str.getClass();
            function1.invoke(str);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.getClass();
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
