package defpackage;

import android.widget.ImageView;
import com.blaze.blazesdk.custom_views.BlazeTextView;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerHeadingTextStyle;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerStyle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class xzm implements Function1 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ BlazeVideosPlayerStyle b;
    public final /* synthetic */ n4m c;

    public /* synthetic */ xzm(BlazeVideosPlayerStyle blazeVideosPlayerStyle, n4m n4mVar) {
        this.b = blazeVideosPlayerStyle;
        this.c = n4mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        n4m n4mVar = this.c;
        BlazeVideosPlayerStyle blazeVideosPlayerStyle = this.b;
        uxm uxmVar = (uxm) obj;
        switch (i) {
            case 0:
                boolean z = e0n.n;
                uxmVar.getClass();
                if (t0n.a[blazeVideosPlayerStyle.getHeadingText().getContentSource().ordinal()] != 1) {
                    zzl.b();
                    return null;
                }
                String str = n4mVar.d;
                BlazeTextView blazeTextView = uxmVar.q;
                blazeTextView.getClass();
                BlazeVideosPlayerHeadingTextStyle headingText = blazeVideosPlayerStyle.getHeadingText();
                boolean isVisible = blazeVideosPlayerStyle.getHeadingText().isVisible();
                blazeTextView.setTextSize(headingText.getTextSize());
                blazeTextView.setTextColor(headingText.getTextColor());
                izk.setTypefaceFromResource$default(blazeTextView, headingText.getFontResId(), null, null, 6, null);
                blazeTextView.setVisibility(isVisible ? 0 : 8);
                blazeTextView.setText(str);
                blazeTextView.setMaxLines(blazeVideosPlayerStyle.getHeadingText().getMaxLines());
                blazeTextView.setVisibility(0);
                return Unit.a;
            default:
                boolean z2 = e0n.n;
                uxmVar.getClass();
                ImageView imageView = uxmVar.u;
                imageView.getClass();
                ctl.setPlayerButtonUi$default(imageView, blazeVideosPlayerStyle.getButtons().getPlayPause(), false, n4mVar.b, mol.HIDE, 2, null);
                return Unit.a;
        }
    }

    public /* synthetic */ xzm(n4m n4mVar, e0n e0nVar, BlazeVideosPlayerStyle blazeVideosPlayerStyle) {
        this.b = blazeVideosPlayerStyle;
        this.c = n4mVar;
    }
}
