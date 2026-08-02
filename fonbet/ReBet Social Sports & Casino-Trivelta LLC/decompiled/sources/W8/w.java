package W8;

import U8.a;
import V8.a0;
import android.animation.ValueAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.giphy.sdk.analytics.models.enums.ActionType;
import com.giphy.sdk.core.models.Media;
import com.giphy.sdk.core.models.User;
import com.giphy.sdk.ui.views.GPHVideoPlayerView;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class w {
    public static final void e(final a aVar) {
        ConstraintLayout constraintLayout;
        Button button;
        LinearLayout linearLayout;
        aVar.setVideoAttributionViewBinding$giphy_ui_2_3_17_release(P8.i.c(LayoutInflater.from(aVar.getContext()), aVar.getBaseView$giphy_ui_2_3_17_release(), false));
        P8.i videoAttributionViewBinding$giphy_ui_2_3_17_release = aVar.getVideoAttributionViewBinding$giphy_ui_2_3_17_release();
        aVar.setVideoAttributionView$giphy_ui_2_3_17_release(videoAttributionViewBinding$giphy_ui_2_3_17_release != null ? videoAttributionViewBinding$giphy_ui_2_3_17_release.b() : null);
        View videoAttributionView$giphy_ui_2_3_17_release = aVar.getVideoAttributionView$giphy_ui_2_3_17_release();
        if (videoAttributionView$giphy_ui_2_3_17_release != null) {
            videoAttributionView$giphy_ui_2_3_17_release.setTranslationX(aVar.getBaseView$giphy_ui_2_3_17_release().getWidth());
        }
        aVar.getBaseView$giphy_ui_2_3_17_release().addView(aVar.getVideoAttributionView$giphy_ui_2_3_17_release(), -1, -1);
        aVar.getVideoAttributionAnimator$giphy_ui_2_3_17_release().setFloatValues(aVar.getBaseView$giphy_ui_2_3_17_release().getWidth(), 0.0f);
        aVar.getVideoAttributionAnimator$giphy_ui_2_3_17_release().setDuration(200L);
        aVar.getVideoAttributionAnimator$giphy_ui_2_3_17_release().addUpdateListener(i(aVar));
        P8.i videoAttributionViewBinding$giphy_ui_2_3_17_release2 = aVar.getVideoAttributionViewBinding$giphy_ui_2_3_17_release();
        if (videoAttributionViewBinding$giphy_ui_2_3_17_release2 != null && (linearLayout = videoAttributionViewBinding$giphy_ui_2_3_17_release2.f8901f) != null) {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: W8.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    w.f(a.this, view);
                }
            });
        }
        P8.i videoAttributionViewBinding$giphy_ui_2_3_17_release3 = aVar.getVideoAttributionViewBinding$giphy_ui_2_3_17_release();
        if (videoAttributionViewBinding$giphy_ui_2_3_17_release3 != null && (button = videoAttributionViewBinding$giphy_ui_2_3_17_release3.f8905j) != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: W8.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    w.g(a.this, view);
                }
            });
        }
        P8.i videoAttributionViewBinding$giphy_ui_2_3_17_release4 = aVar.getVideoAttributionViewBinding$giphy_ui_2_3_17_release();
        if (videoAttributionViewBinding$giphy_ui_2_3_17_release4 != null && (constraintLayout = videoAttributionViewBinding$giphy_ui_2_3_17_release4.f8904i) != null) {
            constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: W8.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    w.h(view);
                }
            });
        }
        P8.i videoAttributionViewBinding$giphy_ui_2_3_17_release5 = aVar.getVideoAttributionViewBinding$giphy_ui_2_3_17_release();
        if (videoAttributionViewBinding$giphy_ui_2_3_17_release5 != null) {
            ConstraintLayout constraintLayout2 = videoAttributionViewBinding$giphy_ui_2_3_17_release5.f8897b;
            O8.k kVar = O8.k.f8390a;
            constraintLayout2.setBackgroundColor(kVar.h().a());
            videoAttributionViewBinding$giphy_ui_2_3_17_release5.f8902g.setColorFilter(kVar.h().b());
            videoAttributionViewBinding$giphy_ui_2_3_17_release5.f8903h.setTextColor(kVar.h().b());
            videoAttributionViewBinding$giphy_ui_2_3_17_release5.f8899d.setTextColor(kVar.h().w());
            videoAttributionViewBinding$giphy_ui_2_3_17_release5.f8900e.setTextColor(kVar.h().k());
        }
    }

    public static final void f(a this_createVideoAttributionView, View view) {
        Intrinsics.checkNotNullParameter(this_createVideoAttributionView, "$this_createVideoAttributionView");
        k(this_createVideoAttributionView);
    }

    public static final void g(a this_createVideoAttributionView, View view) {
        Media e10;
        Intrinsics.checkNotNullParameter(this_createVideoAttributionView, "$this_createVideoAttributionView");
        U8.b videoPlayer$giphy_ui_2_3_17_release = this_createVideoAttributionView.getVideoPlayer$giphy_ui_2_3_17_release();
        if (videoPlayer$giphy_ui_2_3_17_release == null || (e10 = videoPlayer$giphy_ui_2_3_17_release.e()) == null) {
            return;
        }
        this_createVideoAttributionView.getGifsRecyclerView$giphy_ui_2_3_17_release().getGifTrackingManager$giphy_ui_2_3_17_release().h(e10, ActionType.SENT);
        this_createVideoAttributionView.a(e10);
    }

    public static final ValueAnimator.AnimatorUpdateListener i(final a aVar) {
        return new ValueAnimator.AnimatorUpdateListener() { // from class: W8.v
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                w.j(a.this, valueAnimator);
            }
        };
    }

    public static final void j(a this_getVideoAttributionAnimatorListener, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(this_getVideoAttributionAnimatorListener, "$this_getVideoAttributionAnimatorListener");
        Intrinsics.checkNotNullParameter(it, "it");
        View videoAttributionView$giphy_ui_2_3_17_release = this_getVideoAttributionAnimatorListener.getVideoAttributionView$giphy_ui_2_3_17_release();
        if (videoAttributionView$giphy_ui_2_3_17_release == null) {
            return;
        }
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        videoAttributionView$giphy_ui_2_3_17_release.setTranslationX(((Float) animatedValue).floatValue());
    }

    public static final void k(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        aVar.setVideoAttributionVisible$giphy_ui_2_3_17_release(false);
        U8.b videoPlayer$giphy_ui_2_3_17_release = aVar.getVideoPlayer$giphy_ui_2_3_17_release();
        if (videoPlayer$giphy_ui_2_3_17_release != null) {
            videoPlayer$giphy_ui_2_3_17_release.n();
        }
        ValueAnimator videoAttributionAnimator$giphy_ui_2_3_17_release = aVar.getVideoAttributionAnimator$giphy_ui_2_3_17_release();
        if (videoAttributionAnimator$giphy_ui_2_3_17_release != null) {
            videoAttributionAnimator$giphy_ui_2_3_17_release.reverse();
        }
    }

    public static final void l(a aVar, Media media) {
        U8.b bVar;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(media, "media");
        if (aVar.getVideoAttributionView$giphy_ui_2_3_17_release() == null) {
            e(aVar);
        }
        aVar.getVideoAttributionView$giphy_ui_2_3_17_release();
        aVar.setVideoAttributionVisible$giphy_ui_2_3_17_release(true);
        P8.i videoAttributionViewBinding$giphy_ui_2_3_17_release = aVar.getVideoAttributionViewBinding$giphy_ui_2_3_17_release();
        if (videoAttributionViewBinding$giphy_ui_2_3_17_release != null) {
            videoAttributionViewBinding$giphy_ui_2_3_17_release.f8904i.setVisibility(media.getUser() != null ? 0 : 8);
            User user = media.getUser();
            if (user != null) {
                videoAttributionViewBinding$giphy_ui_2_3_17_release.f8908m.setVisibility(user.getVerified() ? 0 : 8);
                videoAttributionViewBinding$giphy_ui_2_3_17_release.f8898c.m(U8.a.f12117a.a(user.getAvatarUrl(), a.EnumC0251a.Medium));
                videoAttributionViewBinding$giphy_ui_2_3_17_release.f8899d.setText('@' + user.getUsername());
            }
            videoAttributionViewBinding$giphy_ui_2_3_17_release.f8906k.setVideoTitle(media.getTitle());
            videoAttributionViewBinding$giphy_ui_2_3_17_release.f8906k.o(media);
            videoAttributionViewBinding$giphy_ui_2_3_17_release.f8905j.setText(O8.u.f8548b);
            Button button = videoAttributionViewBinding$giphy_ui_2_3_17_release.f8905j;
            O8.k kVar = O8.k.f8390a;
            button.setTextColor(kVar.h().d());
            videoAttributionViewBinding$giphy_ui_2_3_17_release.f8905j.setBackgroundColor(kVar.h().c());
            U8.b videoPlayer$giphy_ui_2_3_17_release = aVar.getVideoPlayer$giphy_ui_2_3_17_release();
            if (videoPlayer$giphy_ui_2_3_17_release != null) {
                videoPlayer$giphy_ui_2_3_17_release.n();
            }
            Function3 i10 = kVar.i();
            if (i10 != null) {
                GPHVideoPlayerView gPHVideoPlayerView = videoAttributionViewBinding$giphy_ui_2_3_17_release.f8906k;
                Boolean bool = Boolean.TRUE;
                bVar = (U8.b) i10.invoke(gPHVideoPlayerView, bool, bool);
            } else {
                bVar = null;
            }
            aVar.setVideoPlayer$giphy_ui_2_3_17_release(bVar);
            U8.b videoPlayer$giphy_ui_2_3_17_release2 = aVar.getVideoPlayer$giphy_ui_2_3_17_release();
            if (videoPlayer$giphy_ui_2_3_17_release2 != null) {
                U8.b.m(videoPlayer$giphy_ui_2_3_17_release2, media, false, null, null, 14, null);
            }
        }
        a0 searchBar$giphy_ui_2_3_17_release = aVar.getSearchBar$giphy_ui_2_3_17_release();
        if (searchBar$giphy_ui_2_3_17_release != null) {
            searchBar$giphy_ui_2_3_17_release.I();
        }
        aVar.getVideoAttributionAnimator$giphy_ui_2_3_17_release().start();
        aVar.getGifsRecyclerView$giphy_ui_2_3_17_release().getGifTrackingManager$giphy_ui_2_3_17_release().g();
    }

    public static final void h(View view) {
    }
}
