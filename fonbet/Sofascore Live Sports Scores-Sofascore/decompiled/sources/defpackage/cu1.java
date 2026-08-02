package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.newNetwork.EventBestPlayer;
import com.sofascore.model.newNetwork.EventBestPlayersResponse;
import com.sofascore.results.R;
import com.sofascore.results.view.SofascoreSmallRatingView;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cu1 extends o8 {
    public static final Set g = ph0.a0(new String[]{Sports.ICE_HOCKEY, Sports.AMERICAN_FOOTBALL, Sports.HANDBALL});
    public final dd d;
    public String e;
    public Function0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu1(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.banner_player_rating_container;
        View B = nq8.B(R.id.banner_player_rating_container, root);
        if (B != null) {
            int i2 = R.id.banner_player_rating_click_area;
            ConstraintLayout constraintLayout = (ConstraintLayout) nq8.B(R.id.banner_player_rating_click_area, B);
            if (constraintLayout != null) {
                i2 = R.id.banner_player_rating_img_first;
                ImageView imageView = (ImageView) nq8.B(R.id.banner_player_rating_img_first, B);
                if (imageView != null) {
                    i2 = R.id.banner_player_rating_img_second;
                    ImageView imageView2 = (ImageView) nq8.B(R.id.banner_player_rating_img_second, B);
                    if (imageView2 != null) {
                        i2 = R.id.banner_player_rating_name_first;
                        TextView textView = (TextView) nq8.B(R.id.banner_player_rating_name_first, B);
                        if (textView != null) {
                            i2 = R.id.banner_player_rating_name_second;
                            TextView textView2 = (TextView) nq8.B(R.id.banner_player_rating_name_second, B);
                            if (textView2 != null) {
                                i2 = R.id.banner_player_rating_title;
                                TextView textView3 = (TextView) nq8.B(R.id.banner_player_rating_title, B);
                                if (textView3 != null) {
                                    i2 = R.id.banner_player_rating_triangle;
                                    if (((ImageView) nq8.B(R.id.banner_player_rating_triangle, B)) != null) {
                                        i2 = R.id.banner_player_rating_value_first;
                                        SofascoreSmallRatingView sofascoreSmallRatingView = (SofascoreSmallRatingView) nq8.B(R.id.banner_player_rating_value_first, B);
                                        if (sofascoreSmallRatingView != null) {
                                            i2 = R.id.banner_player_rating_value_second;
                                            SofascoreSmallRatingView sofascoreSmallRatingView2 = (SofascoreSmallRatingView) nq8.B(R.id.banner_player_rating_value_second, B);
                                            if (sofascoreSmallRatingView2 != null) {
                                                i2 = R.id.banner_player_stat_name_first;
                                                TextView textView4 = (TextView) nq8.B(R.id.banner_player_stat_name_first, B);
                                                if (textView4 != null) {
                                                    i2 = R.id.banner_player_stat_name_second;
                                                    TextView textView5 = (TextView) nq8.B(R.id.banner_player_stat_name_second, B);
                                                    if (textView5 != null) {
                                                        i2 = R.id.banner_player_stat_value_first;
                                                        TextView textView6 = (TextView) nq8.B(R.id.banner_player_stat_value_first, B);
                                                        if (textView6 != null) {
                                                            i2 = R.id.banner_player_stat_value_second;
                                                            TextView textView7 = (TextView) nq8.B(R.id.banner_player_stat_value_second, B);
                                                            if (textView7 != null) {
                                                                i2 = R.id.banner_player_statistics_middle_guideline;
                                                                if (((Guideline) nq8.B(R.id.banner_player_statistics_middle_guideline, B)) != null) {
                                                                    i2 = R.id.first_barrier;
                                                                    if (((Barrier) nq8.B(R.id.first_barrier, B)) != null) {
                                                                        i2 = R.id.second_barrier;
                                                                        if (((Barrier) nq8.B(R.id.second_barrier, B)) != null) {
                                                                            xz0 xz0Var = new xz0((FrameLayout) B, constraintLayout, imageView, imageView2, textView, textView2, textView3, sofascoreSmallRatingView, sofascoreSmallRatingView2, textView4, textView5, textView6, textView7);
                                                                            LinearLayout linearLayout = (LinearLayout) root;
                                                                            View B2 = nq8.B(R.id.information_layout, root);
                                                                            if (B2 != null) {
                                                                                nr1 e = nr1.e(B2);
                                                                                this.d = new dd(linearLayout, xz0Var, e, 2);
                                                                                o8.d(this, 0, 7);
                                                                                LinearLayout linearLayout2 = (LinearLayout) e.d;
                                                                                linearLayout2.getClass();
                                                                                linearLayout2.setPaddingRelative(0, 0, 0, 0);
                                                                                setVisibility(8);
                                                                                ((LinearLayout) e.i).setVisibility(8);
                                                                                constraintLayout.setOnClickListener(new s0(this, 7));
                                                                                return;
                                                                            }
                                                                            i = R.id.information_layout;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            yhk.s("Missing required view with ID: ".concat(B.getResources().getResourceName(i2)));
            throw null;
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    @Nullable
    public final Function0<Unit> getBannerClickListener() {
        return this.f;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.banner_player_statistics_container;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00bc, code lost:
    
        if (r12.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_DELAYED) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00d3, code lost:
    
        l(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d0, code lost:
    
        if (r12.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_NOT_STARTED) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00dd, code lost:
    
        if (r12.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_FINISHED) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00f2, code lost:
    
        l(true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e6, code lost:
    
        if (r12.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_IN_PROGRESS) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ef, code lost:
    
        if (r12.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_INTERRUPTED) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0059, code lost:
    
        if (r0.equals(com.sofascore.model.Sports.HANDBALL) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x006d, code lost:
    
        ((defpackage.xz0) r7.c).e.setText(getContext().getString(com.sofascore.results.R.string.player_statistics));
        ((android.widget.TextView) ((defpackage.nr1) r7.d).h).setText(getContext().getString(com.sofascore.results.R.string.player_statistics_not_available));
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0060, code lost:
    
        if (r0.equals(com.sofascore.model.Sports.AMERICAN_FOOTBALL) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0067, code lost:
    
        if (r0.equals(com.sofascore.model.Sports.ICE_HOCKEY) == false) goto L17;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(Event event, EventBestPlayersResponse eventBestPlayersResponse) {
        String slug = event.getTournament().getCategory().getSport().getSlug();
        int hashCode = slug.hashCode();
        dd ddVar = this.d;
        switch (hashCode) {
            case -2002238939:
                break;
            case -83759494:
                break;
            case 1767150:
                break;
            case 394668909:
                if (slug.equals(Sports.FOOTBALL)) {
                    ((xz0) ddVar.c).e.setText(getContext().getString(R.string.sofascore_ratings));
                    ((TextView) ((nr1) ddVar.d).h).setText(getContext().getString(R.string.player_rating_not_available));
                    break;
                }
                l(false, false);
                break;
            default:
                l(false, false);
                break;
        }
        if (eventBestPlayersResponse == null) {
            l(Intrinsics.c(event.getHasEventPlayerStatistics(), Boolean.TRUE) && g.contains(slug) && ph0.a0(new String[]{StatusKt.STATUS_NOT_STARTED, StatusKt.STATUS_DELAYED}).contains(event.getStatus().getType()), false);
            return;
        }
        String type = event.getStatus().getType();
        if (!Intrinsics.c(type, this.e)) {
            this.e = type;
            switch (type.hashCode()) {
                case -1947652542:
                    break;
                case -1411655086:
                    break;
                case -673660814:
                    break;
                case -500280754:
                    break;
                case -123173735:
                    if (type.equals(StatusKt.STATUS_CANCELED)) {
                        l(false, false);
                        break;
                    }
                    break;
                case 1550348642:
                    break;
            }
        }
        EventBestPlayer homeBestPlayer$default = EventBestPlayersResponse.getHomeBestPlayer$default(eventBestPlayersResponse, null, 1, null);
        EventBestPlayer awayBestPlayer$default = EventBestPlayersResponse.getAwayBestPlayer$default(eventBestPlayersResponse, null, 1, null);
        xz0 xz0Var = (xz0) ddVar.c;
        xz0 xz0Var2 = (xz0) ddVar.c;
        as9.l(xz0Var.c, homeBestPlayer$default.getPlayer().getId(), null);
        as9.l((ImageView) xz0Var2.f, awayBestPlayer$default.getPlayer().getId(), null);
        TextView textView = xz0Var2.b;
        String C = tba.C(homeBestPlayer$default.getPlayer());
        if (C == null) {
            C = tba.t(homeBestPlayer$default.getPlayer());
        }
        textView.setText(C);
        TextView textView2 = xz0Var2.d;
        String C2 = tba.C(awayBestPlayer$default.getPlayer());
        if (C2 == null) {
            C2 = tba.t(awayBestPlayer$default.getPlayer());
        }
        textView2.setText(C2);
        switch (slug.hashCode()) {
            case -2002238939:
                if (!slug.equals(Sports.ICE_HOCKEY)) {
                    return;
                }
                break;
            case -83759494:
                if (!slug.equals(Sports.AMERICAN_FOOTBALL)) {
                    return;
                }
                break;
            case 1767150:
                if (!slug.equals(Sports.HANDBALL)) {
                    return;
                }
                break;
            case 394668909:
                if (slug.equals(Sports.FOOTBALL)) {
                    ((SofascoreSmallRatingView) xz0Var2.l).setVisibility(0);
                    ((SofascoreSmallRatingView) xz0Var2.m).setVisibility(0);
                    SofascoreSmallRatingView.l((SofascoreSmallRatingView) xz0Var2.l, homeBestPlayer$default.getValue());
                    SofascoreSmallRatingView.l((SofascoreSmallRatingView) xz0Var2.m, awayBestPlayer$default.getValue());
                    return;
                }
                return;
            default:
                return;
        }
        ((SofascoreSmallRatingView) xz0Var2.l).setVisibility(8);
        ((SofascoreSmallRatingView) xz0Var2.m).setVisibility(8);
        ((TextView) xz0Var2.i).setText(homeBestPlayer$default.getValue());
        ((TextView) xz0Var2.g).setText(homeBestPlayer$default.getLabel());
        ((TextView) xz0Var2.k).setText(awayBestPlayer$default.getValue());
        ((TextView) xz0Var2.h).setText(awayBestPlayer$default.getLabel());
    }

    public final void l(boolean z, boolean z2) {
        setVisibility(z ? 0 : 8);
        if (z) {
            dd ddVar = this.d;
            ((FrameLayout) ((xz0) ddVar.c).j).setVisibility(z2 ? 0 : 8);
            LinearLayout linearLayout = (LinearLayout) ((nr1) ddVar.d).d;
            linearLayout.getClass();
            linearLayout.setVisibility(z2 ? 8 : 0);
        }
    }

    public final void setBannerClickListener(@Nullable Function0<Unit> function0) {
        this.f = function0;
    }
}
