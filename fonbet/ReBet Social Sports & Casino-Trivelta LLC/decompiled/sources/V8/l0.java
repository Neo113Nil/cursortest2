package V8;

import U8.a;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.giphy.sdk.core.models.User;
import com.giphy.sdk.ui.views.GifView;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12769a;

    /* renamed from: b, reason: collision with root package name */
    public final User f12770b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12771c;

    public l0(Context context, User user) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(user, "user");
        this.f12769a = context;
        this.f12770b = user;
    }

    public static final void k(l0 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.r(this$0.f12770b.getWebsiteUrl());
    }

    public static final void l(l0 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.r(this$0.f12770b.getFacebookUrl());
    }

    public static final void m(l0 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.r(this$0.f12770b.getTwitterUrl());
    }

    public static final void n(l0 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.r(this$0.f12770b.getInstagramUrl());
    }

    public static final void o(l0 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.r(this$0.f12770b.getTumblrUrl());
    }

    public final View f(int i10, LinearLayout linearLayout) {
        ImageView imageView = new ImageView(this.f12769a);
        imageView.setImageResource(i10);
        int dimensionPixelSize = this.f12769a.getResources().getDimensionPixelSize(O8.q.f8409h);
        int dimensionPixelSize2 = this.f12769a.getResources().getDimensionPixelSize(O8.q.f8408g);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams.leftMargin = dimensionPixelSize2;
        layoutParams.rightMargin = dimensionPixelSize2;
        linearLayout.addView(imageView, layoutParams);
        return imageView;
    }

    public final void g(TextView displayName) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        String displayName2 = this.f12770b.getDisplayName();
        if (displayName2 == null || displayName2.length() == 0) {
            displayName.setText(this.f12770b.getUsername());
        } else {
            displayName.setText(this.f12770b.getDisplayName());
        }
    }

    public final void h(GifView userChannelGifAvatar) {
        Intrinsics.checkNotNullParameter(userChannelGifAvatar, "userChannelGifAvatar");
        String avatarUrl = this.f12770b.getAvatarUrl();
        if (avatarUrl == null || avatarUrl.length() == 0) {
            return;
        }
        userChannelGifAvatar.m(U8.a.f12117a.a(this.f12770b.getAvatarUrl(), a.EnumC0251a.Big));
    }

    public final void i(TextView displayName, TextView channelName, ImageView verifiedBadge, GifView userChannelGifAvatar) {
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(channelName, "channelName");
        Intrinsics.checkNotNullParameter(verifiedBadge, "verifiedBadge");
        Intrinsics.checkNotNullParameter(userChannelGifAvatar, "userChannelGifAvatar");
        p(channelName);
        q(verifiedBadge);
        h(userChannelGifAvatar);
        g(displayName);
    }

    public final void j(TextView channelDescription, TextView websiteUrl, LinearLayout socialContainer) {
        Intrinsics.checkNotNullParameter(channelDescription, "channelDescription");
        Intrinsics.checkNotNullParameter(websiteUrl, "websiteUrl");
        Intrinsics.checkNotNullParameter(socialContainer, "socialContainer");
        String description = this.f12770b.getDescription();
        if (description != null && description.length() != 0) {
            channelDescription.setVisibility(0);
            channelDescription.setText(this.f12770b.getDescription());
        }
        if (this.f12771c) {
            String websiteUrl2 = this.f12770b.getWebsiteUrl();
            if (websiteUrl2 != null && websiteUrl2.length() != 0) {
                websiteUrl.setText(new URL(this.f12770b.getWebsiteUrl()).getHost());
                websiteUrl.setVisibility(0);
                websiteUrl.setOnClickListener(new View.OnClickListener() { // from class: V8.g0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        l0.k(l0.this, view);
                    }
                });
            }
            String facebookUrl = this.f12770b.getFacebookUrl();
            if (facebookUrl != null && facebookUrl.length() != 0) {
                f(O8.r.f8438z, socialContainer).setOnClickListener(new View.OnClickListener() { // from class: V8.h0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        l0.l(l0.this, view);
                    }
                });
            }
            String twitterUrl = this.f12770b.getTwitterUrl();
            if (twitterUrl != null && twitterUrl.length() != 0) {
                f(O8.r.f8412C, socialContainer).setOnClickListener(new View.OnClickListener() { // from class: V8.i0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        l0.m(l0.this, view);
                    }
                });
            }
            String instagramUrl = this.f12770b.getInstagramUrl();
            if (instagramUrl != null && instagramUrl.length() != 0) {
                f(O8.r.f8410A, socialContainer).setOnClickListener(new View.OnClickListener() { // from class: V8.j0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        l0.n(l0.this, view);
                    }
                });
            }
            String tumblrUrl = this.f12770b.getTumblrUrl();
            if (tumblrUrl != null && tumblrUrl.length() != 0) {
                f(O8.r.f8411B, socialContainer).setOnClickListener(new View.OnClickListener() { // from class: V8.k0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        l0.o(l0.this, view);
                    }
                });
            }
        }
        if (socialContainer.getChildCount() > 0) {
            socialContainer.setVisibility(0);
        } else {
            socialContainer.setVisibility(8);
        }
    }

    public final void p(TextView channelName) {
        Intrinsics.checkNotNullParameter(channelName, "channelName");
        String displayName = this.f12770b.getDisplayName();
        channelName.setVisibility((displayName == null || displayName.length() == 0) ? 4 : 0);
        channelName.setText('@' + this.f12770b.getUsername());
    }

    public final void q(ImageView imageView) {
        imageView.setVisibility(s() ? 0 : 4);
    }

    public final void r(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.setFlags(268435456);
        this.f12769a.startActivity(intent);
    }

    public final boolean s() {
        String displayName;
        return (!this.f12770b.getVerified() || (displayName = this.f12770b.getDisplayName()) == null || displayName.length() == 0) ? false : true;
    }
}
