package defpackage;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.u;
import com.blaze.blazesdk.custom_views.BlazeTextView;
import com.blaze.blazesdk.style.players.BlazeFirstTimeSlideTextStyle;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class i0m extends tbb {
    public i0m() {
        super(isl.a);
    }

    @Override // androidx.recyclerview.widget.l
    public final void onBindViewHolder(u uVar, int i) {
        gwl gwlVar = (gwl) uVar;
        gwlVar.getClass();
        Object o = o(i);
        o.getClass();
        fwl fwlVar = (fwl) o;
        gwlVar.getClass();
        fwlVar.getClass();
        hmm hmmVar = gwlVar.b;
        hmmVar.d.setBackgroundResource(fwlVar.c);
        BlazeTextView blazeTextView = hmmVar.c;
        BlazeFirstTimeSlideTextStyle blazeFirstTimeSlideTextStyle = fwlVar.a;
        blazeTextView.setText(blazeFirstTimeSlideTextStyle.getText());
        blazeTextView.setTextSize(blazeFirstTimeSlideTextStyle.getTextSize());
        BlazeTextView blazeTextView2 = hmmVar.b;
        BlazeFirstTimeSlideTextStyle blazeFirstTimeSlideTextStyle2 = fwlVar.b;
        blazeTextView2.setText(blazeFirstTimeSlideTextStyle2.getText());
        blazeTextView2.setTextSize(blazeFirstTimeSlideTextStyle2.getTextSize());
        ConstraintLayout constraintLayout = hmmVar.a;
        blazeTextView.setTextColor(constraintLayout.getContext().getColor(blazeFirstTimeSlideTextStyle.getTextColorResId()));
        blazeTextView2.setTextColor(constraintLayout.getContext().getColor(blazeFirstTimeSlideTextStyle2.getTextColorResId()));
        blazeTextView2.getClass();
        Integer fontResId = blazeFirstTimeSlideTextStyle2.getFontResId();
        Typeface typeface = Typeface.DEFAULT;
        typeface.getClass();
        izk.setTypefaceFromResource$default(blazeTextView2, fontResId, null, typeface, 2, null);
        blazeTextView.getClass();
        izk.setTypefaceFromResource$default(blazeTextView, blazeFirstTimeSlideTextStyle.getFontResId(), null, typeface, 2, null);
    }

    @Override // androidx.recyclerview.widget.l
    public final u onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.blaze_layout_player_first_time_slide_holder, viewGroup, false);
        int i2 = R.id.blaze_firstTimeSlideDescription;
        BlazeTextView blazeTextView = (BlazeTextView) nq8.B(R.id.blaze_firstTimeSlideDescription, inflate);
        if (blazeTextView != null) {
            i2 = R.id.blaze_firstTimeSlideHeader;
            BlazeTextView blazeTextView2 = (BlazeTextView) nq8.B(R.id.blaze_firstTimeSlideHeader, inflate);
            if (blazeTextView2 != null) {
                i2 = R.id.blaze_firstTimeSlideIcon;
                ImageView imageView = (ImageView) nq8.B(R.id.blaze_firstTimeSlideIcon, inflate);
                if (imageView != null) {
                    return new gwl(new hmm((ConstraintLayout) inflate, blazeTextView, blazeTextView2, imageView));
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }
}
