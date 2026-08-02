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
import com.giphy.sdk.core.models.enums.RenditionType;
import com.giphy.sdk.ui.views.GifView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class g {
    public static final void e(final a aVar) {
        ConstraintLayout constraintLayout;
        Button button;
        LinearLayout linearLayout;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        aVar.setAttributionViewBinding$giphy_ui_2_3_17_release(P8.b.c(LayoutInflater.from(aVar.getContext()), aVar.getBaseView$giphy_ui_2_3_17_release(), false));
        P8.b attributionViewBinding$giphy_ui_2_3_17_release = aVar.getAttributionViewBinding$giphy_ui_2_3_17_release();
        aVar.setAttributionView$giphy_ui_2_3_17_release(attributionViewBinding$giphy_ui_2_3_17_release != null ? attributionViewBinding$giphy_ui_2_3_17_release.b() : null);
        View attributionView$giphy_ui_2_3_17_release = aVar.getAttributionView$giphy_ui_2_3_17_release();
        if (attributionView$giphy_ui_2_3_17_release != null) {
            attributionView$giphy_ui_2_3_17_release.setTranslationX(aVar.getBaseView$giphy_ui_2_3_17_release().getWidth());
        }
        aVar.getBaseView$giphy_ui_2_3_17_release().addView(aVar.getAttributionView$giphy_ui_2_3_17_release(), -1, -1);
        aVar.getAttributionAnimator$giphy_ui_2_3_17_release().setFloatValues(aVar.getBaseView$giphy_ui_2_3_17_release().getWidth(), 0.0f);
        aVar.getAttributionAnimator$giphy_ui_2_3_17_release().setDuration(200L);
        aVar.getAttributionAnimator$giphy_ui_2_3_17_release().addUpdateListener(i(aVar));
        P8.b attributionViewBinding$giphy_ui_2_3_17_release2 = aVar.getAttributionViewBinding$giphy_ui_2_3_17_release();
        if (attributionViewBinding$giphy_ui_2_3_17_release2 != null && (linearLayout = attributionViewBinding$giphy_ui_2_3_17_release2.f8833f) != null) {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: W8.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    g.f(a.this, view);
                }
            });
        }
        P8.b attributionViewBinding$giphy_ui_2_3_17_release3 = aVar.getAttributionViewBinding$giphy_ui_2_3_17_release();
        if (attributionViewBinding$giphy_ui_2_3_17_release3 != null && (button = attributionViewBinding$giphy_ui_2_3_17_release3.f8838k) != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: W8.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    g.g(a.this, view);
                }
            });
        }
        P8.b attributionViewBinding$giphy_ui_2_3_17_release4 = aVar.getAttributionViewBinding$giphy_ui_2_3_17_release();
        if (attributionViewBinding$giphy_ui_2_3_17_release4 != null && (constraintLayout = attributionViewBinding$giphy_ui_2_3_17_release4.f8836i) != null) {
            constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: W8.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    g.h(view);
                }
            });
        }
        P8.b attributionViewBinding$giphy_ui_2_3_17_release5 = aVar.getAttributionViewBinding$giphy_ui_2_3_17_release();
        if (attributionViewBinding$giphy_ui_2_3_17_release5 != null) {
            ConstraintLayout constraintLayout2 = attributionViewBinding$giphy_ui_2_3_17_release5.f8829b;
            O8.k kVar = O8.k.f8390a;
            constraintLayout2.setBackgroundColor(kVar.h().a());
            attributionViewBinding$giphy_ui_2_3_17_release5.f8834g.setColorFilter(kVar.h().b());
            attributionViewBinding$giphy_ui_2_3_17_release5.f8835h.setTextColor(kVar.h().b());
            attributionViewBinding$giphy_ui_2_3_17_release5.f8831d.setTextColor(kVar.h().w());
            attributionViewBinding$giphy_ui_2_3_17_release5.f8832e.setTextColor(kVar.h().k());
            attributionViewBinding$giphy_ui_2_3_17_release5.f8838k.setBackgroundColor(kVar.h().c());
            attributionViewBinding$giphy_ui_2_3_17_release5.f8838k.setTextColor(kVar.h().d());
        }
    }

    public static final void f(a this_createConfirmationView, View view) {
        Intrinsics.checkNotNullParameter(this_createConfirmationView, "$this_createConfirmationView");
        k(this_createConfirmationView);
    }

    public static final void g(a this_createConfirmationView, View view) {
        GifView gifView;
        Media media;
        Intrinsics.checkNotNullParameter(this_createConfirmationView, "$this_createConfirmationView");
        P8.b attributionViewBinding$giphy_ui_2_3_17_release = this_createConfirmationView.getAttributionViewBinding$giphy_ui_2_3_17_release();
        if (attributionViewBinding$giphy_ui_2_3_17_release == null || (gifView = attributionViewBinding$giphy_ui_2_3_17_release.f8837j) == null || (media = gifView.getMedia()) == null) {
            return;
        }
        this_createConfirmationView.getGifsRecyclerView$giphy_ui_2_3_17_release().getGifTrackingManager$giphy_ui_2_3_17_release().h(media, ActionType.SENT);
        this_createConfirmationView.a(media);
    }

    public static final ValueAnimator.AnimatorUpdateListener i(final a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new ValueAnimator.AnimatorUpdateListener() { // from class: W8.f
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                g.j(a.this, valueAnimator);
            }
        };
    }

    public static final void j(a this_getAttributionAnimatorListener, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(this_getAttributionAnimatorListener, "$this_getAttributionAnimatorListener");
        Intrinsics.checkNotNullParameter(it, "it");
        View attributionView$giphy_ui_2_3_17_release = this_getAttributionAnimatorListener.getAttributionView$giphy_ui_2_3_17_release();
        if (attributionView$giphy_ui_2_3_17_release == null) {
            return;
        }
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        attributionView$giphy_ui_2_3_17_release.setTranslationX(((Float) animatedValue).floatValue());
    }

    public static final void k(a aVar) {
        GifView gifView;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        aVar.setAttributionVisible$giphy_ui_2_3_17_release(false);
        P8.b attributionViewBinding$giphy_ui_2_3_17_release = aVar.getAttributionViewBinding$giphy_ui_2_3_17_release();
        if (attributionViewBinding$giphy_ui_2_3_17_release != null && (gifView = attributionViewBinding$giphy_ui_2_3_17_release.f8837j) != null) {
            GifView.z(gifView, null, null, null, 2, null);
        }
        ValueAnimator attributionAnimator$giphy_ui_2_3_17_release = aVar.getAttributionAnimator$giphy_ui_2_3_17_release();
        if (attributionAnimator$giphy_ui_2_3_17_release != null) {
            attributionAnimator$giphy_ui_2_3_17_release.reverse();
        }
    }

    public static final void l(a aVar, Media media) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(media, "media");
        if (aVar.getAttributionView$giphy_ui_2_3_17_release() == null) {
            e(aVar);
        }
        aVar.setAttributionVisible$giphy_ui_2_3_17_release(true);
        P8.b attributionViewBinding$giphy_ui_2_3_17_release = aVar.getAttributionViewBinding$giphy_ui_2_3_17_release();
        if (attributionViewBinding$giphy_ui_2_3_17_release != null) {
            attributionViewBinding$giphy_ui_2_3_17_release.f8836i.setVisibility(media.getUser() != null ? 0 : 8);
            User user = media.getUser();
            if (user != null) {
                attributionViewBinding$giphy_ui_2_3_17_release.f8840m.setVisibility(user.getVerified() ? 0 : 8);
                attributionViewBinding$giphy_ui_2_3_17_release.f8830c.m(U8.a.f12117a.a(user.getAvatarUrl(), a.EnumC0251a.Medium));
                attributionViewBinding$giphy_ui_2_3_17_release.f8831d.setText('@' + user.getUsername());
            }
            if (Intrinsics.areEqual(N8.j.a(media), Boolean.TRUE)) {
                attributionViewBinding$giphy_ui_2_3_17_release.f8838k.setText(O8.u.f8549c);
                attributionViewBinding$giphy_ui_2_3_17_release.f8837j.setBackgroundVisible(false);
            } else if (media.getIsSticker()) {
                attributionViewBinding$giphy_ui_2_3_17_release.f8838k.setText(O8.u.f8551e);
                attributionViewBinding$giphy_ui_2_3_17_release.f8837j.setBackgroundVisible(true);
            } else {
                attributionViewBinding$giphy_ui_2_3_17_release.f8838k.setText(O8.u.f8550d);
                attributionViewBinding$giphy_ui_2_3_17_release.f8837j.setBackgroundVisible(false);
            }
            GifView gifView = attributionViewBinding$giphy_ui_2_3_17_release.f8837j;
            RenditionType confirmationRenditionType = aVar.getGiphySettings$giphy_ui_2_3_17_release().getConfirmationRenditionType();
            if (confirmationRenditionType == null) {
                confirmationRenditionType = RenditionType.original;
            }
            gifView.y(media, confirmationRenditionType, null);
        }
        a0 searchBar$giphy_ui_2_3_17_release = aVar.getSearchBar$giphy_ui_2_3_17_release();
        if (searchBar$giphy_ui_2_3_17_release != null) {
            searchBar$giphy_ui_2_3_17_release.I();
        }
        aVar.getAttributionAnimator$giphy_ui_2_3_17_release().start();
        aVar.getGifsRecyclerView$giphy_ui_2_3_17_release().getGifTrackingManager$giphy_ui_2_3_17_release().g();
    }

    public static final void h(View view) {
    }
}
