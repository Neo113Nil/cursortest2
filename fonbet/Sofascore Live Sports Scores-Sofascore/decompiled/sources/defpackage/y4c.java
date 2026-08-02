package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.sofascore.results.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class y4c extends g7 {
    public final LayoutInflater l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4c(Context context) {
        super(context);
        context.getClass();
        this.l = LayoutInflater.from(context);
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return true;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new th(arrayList2, arrayList, 22);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        ((r5c) obj).getClass();
        return 1;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View inflate = this.l.inflate(R.layout.event_media_youtube_highlight_item, viewGroup, false);
        int i2 = R.id.highlights_image;
        ImageView imageView = (ImageView) nq8.B(R.id.highlights_image, inflate);
        if (imageView != null) {
            i2 = R.id.highlights_label;
            TextView textView = (TextView) nq8.B(R.id.highlights_label, inflate);
            if (textView != null) {
                i2 = R.id.highlights_subtitle;
                TextView textView2 = (TextView) nq8.B(R.id.highlights_subtitle, inflate);
                if (textView2 != null) {
                    i2 = R.id.highlights_title;
                    TextView textView3 = (TextView) nq8.B(R.id.highlights_title, inflate);
                    if (textView3 != null) {
                        i2 = R.id.info_container;
                        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.info_container, inflate);
                        if (linearLayout != null) {
                            i2 = R.id.now_playing_overlay;
                            FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.now_playing_overlay, inflate);
                            if (frameLayout != null) {
                                i2 = R.id.now_playing_text;
                                if (((TextView) nq8.B(R.id.now_playing_text, inflate)) != null) {
                                    i2 = R.id.official_mark;
                                    LinearLayout linearLayout2 = (LinearLayout) nq8.B(R.id.official_mark, inflate);
                                    if (linearLayout2 != null) {
                                        i2 = R.id.play_icon;
                                        ImageView imageView2 = (ImageView) nq8.B(R.id.play_icon, inflate);
                                        if (imageView2 != null) {
                                            return new rnl(new bv1((MaterialCardView) inflate, imageView, textView, textView2, textView3, linearLayout, frameLayout, linearLayout2, imageView2));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }
}
