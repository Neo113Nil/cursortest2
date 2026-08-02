package com.vk.music.subscription;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.music.ui.subscription.BuyMusicSubscriptionButton;
import com.vkontakte.android.R;
import java.util.List;
import xsna.bwt0;
import xsna.e43;

/* compiled from: MusicSubscriptionDetailsContainer.kt */
/* loaded from: classes3.dex */
public final class MusicSubscriptionDetailsContainer extends ConstraintLayout {
    public static final /* synthetic */ int A = 0;
    public final List<TextView> t;
    public final TextView u;
    public final TextView v;
    public final View w;
    public final View x;
    public final View y;
    public final BuyMusicSubscriptionButton z;

    /* JADX WARN: Multi-variable type inference failed */
    public MusicSubscriptionDetailsContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.music_buy_subscription_details_list, this);
        this.u = (TextView) findViewById(R.id.music_subscription_title);
        this.v = (TextView) findViewById(R.id.music_subscription_subtitle);
        this.w = findViewById(R.id.active_indicator);
        this.x = findViewById(R.id.music_subscription_option_1_new_badge);
        this.t = e43.l(findViewById(R.id.music_subscription_option_1), findViewById(R.id.music_subscription_option_2), findViewById(R.id.music_subscription_option_3), findViewById(R.id.music_subscription_option_4), findViewById(R.id.music_subscription_option_5), findViewById(R.id.music_subscription_option_6));
        this.y = findViewById(R.id.music_cancel_dialog);
        this.z = (BuyMusicSubscriptionButton) findViewById(R.id.buy_music_subscription_btn);
    }

    public final void setButtonTitle(String str) {
        this.z.setTitle(str);
    }

    public final void setIsUpsell(boolean z) {
        this.z.setIsUpsell(z);
    }

    public final void setSubtitle(String str) {
        TextView textView = this.v;
        bwt0.p0(textView, true);
        textView.setText(str);
    }

    public final void setTitle(CharSequence charSequence) {
        this.u.setText(charSequence);
    }
}
