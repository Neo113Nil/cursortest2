package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.newNetwork.Highlight;
import com.sofascore.results.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class la9 extends p8 {
    public final nr1 c;
    public final Function1 d;
    public final Drawable e;
    public final Drawable f;
    public final Drawable g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public la9(nr1 nr1Var, s26 s26Var) {
        super(r0);
        ConstraintLayout constraintLayout = (ConstraintLayout) nr1Var.c;
        constraintLayout.getClass();
        this.c = nr1Var;
        this.d = s26Var;
        this.e = this.b.getDrawable(R.drawable.ic_highlights_white);
        this.f = this.b.getDrawable(R.drawable.ic_placeholder_image);
        this.g = this.b.getDrawable(R.drawable.placeholder_rectangle);
    }

    @Override // defpackage.p8
    public final void b(int i, int i2, Object obj) {
        r5c r5cVar = (r5c) obj;
        r5cVar.getClass();
        nr1 nr1Var = this.c;
        ConstraintLayout constraintLayout = (ConstraintLayout) nr1Var.c;
        constraintLayout.getClass();
        Integer valueOf = Integer.valueOf(i);
        Function1 function1 = this.d;
        sea.v(constraintLayout, false, ((Boolean) function1.invoke(valueOf)).booleanValue(), 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
        constraintLayout.getClass();
        boolean booleanValue = ((Boolean) function1.invoke(Integer.valueOf(i))).booleanValue();
        Context context = this.b;
        constraintLayout.setPaddingRelative(constraintLayout.getPaddingStart(), constraintLayout.getPaddingTop(), constraintLayout.getPaddingEnd(), booleanValue ? ao2.s(8, context) + ao2.s(12, context) : ao2.s(12, context));
        ImageView imageView = (ImageView) nr1Var.e;
        TextView textView = (TextView) nr1Var.i;
        TextView textView2 = (TextView) nr1Var.h;
        ImageView imageView2 = (ImageView) nr1Var.f;
        imageView.setClipToOutline(true);
        Highlight highlight = r5cVar.a;
        textView2.setText(highlight.getTitle());
        if (highlight.getWatched()) {
            haa.D(textView2);
            textView.setVisibility(0);
        } else {
            haa.C(textView2);
            textView.setVisibility(8);
        }
        ((TextView) nr1Var.d).setText(z8e.K(highlight.getCreatedAtTimestamp(), context));
        nr1Var.b.setText(highlight.getSubtitle());
        String thumbnailUrl = highlight.getThumbnailUrl();
        Drawable drawable = this.e;
        Drawable drawable2 = this.g;
        if (thumbnailUrl == null || thumbnailUrl.length() == 0) {
            int mediaType = highlight.getMediaType();
            if (mediaType == 1 || mediaType == 6) {
                imageView2.setVisibility(0);
                imageView2.setImageDrawable(drawable);
            } else {
                imageView2.setVisibility(0);
                imageView2.setImageDrawable(this.f);
            }
            imageView.setImageDrawable(drawable2);
            return;
        }
        as9.f(imageView, (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/") + "proxy/media-thumbnail/" + highlight.getId(), drawable2);
        if (highlight.getMediaType() != 1 && highlight.getMediaType() != 6) {
            imageView2.setVisibility(8);
        } else {
            imageView2.setVisibility(0);
            imageView2.setImageDrawable(drawable);
        }
    }
}
