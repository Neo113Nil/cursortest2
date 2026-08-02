package com.vk.video.ui.discovery.minimizable.announce.author;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.button.VkButton;
import com.vkontakte.android.R;
import java.text.DecimalFormat;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.gpt0;
import xsna.iah0;
import xsna.mn9;
import xsna.n9m0;
import xsna.nn9;
import xsna.z8s;
import xsna.zrp;

/* compiled from: VideoAnnounceAuthorView.kt */
/* loaded from: classes7.dex */
public final class VideoAnnounceAuthorView extends ConstraintLayout {
    public static final /* synthetic */ int A = 0;
    public final VkAvatar t;
    public final TextView u;
    public final TextView v;
    public final VkButton w;
    public final VkButton x;
    public n9m0 y;
    public SubscribeState z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoAnnounceAuthorView.kt */
    public static final class SubscribeState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SubscribeState[] $VALUES;
        public static final SubscribeState Subscribed;
        public static final SubscribeState Unsubscribed;

        static {
            SubscribeState subscribeState = new SubscribeState("Subscribed", 0);
            Subscribed = subscribeState;
            SubscribeState subscribeState2 = new SubscribeState("Unsubscribed", 1);
            Unsubscribed = subscribeState2;
            SubscribeState[] subscribeStateArr = {subscribeState, subscribeState2};
            $VALUES = subscribeStateArr;
            $ENTRIES = new asp(subscribeStateArr);
        }

        public SubscribeState() {
            throw null;
        }

        public static SubscribeState valueOf(String str) {
            return (SubscribeState) Enum.valueOf(SubscribeState.class, str);
        }

        public static SubscribeState[] values() {
            return (SubscribeState[]) $VALUES.clone();
        }
    }

    /* compiled from: VideoAnnounceAuthorView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SubscribeState.values().length];
            try {
                iArr[SubscribeState.Unsubscribed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SubscribeState.Subscribed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VideoAnnounceAuthorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.z = SubscribeState.Unsubscribed;
        LayoutInflater.from(context).inflate(R.layout.video_announce_author_view, this);
        setBackgroundResource(R.drawable.author_announce_subscribe_background);
        setMinHeight(iah0.a(60));
        this.u = (TextView) findViewById(R.id.video_author_name);
        this.v = (TextView) findViewById(R.id.video_author_amount_of_views);
        VkButton vkButton = (VkButton) findViewById(R.id.video_author_subscribe_button);
        this.w = vkButton;
        VkButton vkButton2 = (VkButton) findViewById(R.id.video_author_subscribed_button);
        this.x = vkButton2;
        ViewStub viewStub = (ViewStub) findViewById(R.id.video_author_avatar_stub);
        viewStub.setLayoutResource(R.layout.video_author_avatar_with_stroke);
        viewStub.inflate();
        this.t = (VkAvatar) findViewById(R.id.video_author_avatar);
        vkButton.setOnClickListener(new mn9(this, 11));
        vkButton2.setOnClickListener(new nn9(this, 9));
    }

    public final void setSubscribeState(SubscribeState subscribeState) {
        if (this.z == subscribeState) {
            return;
        }
        this.z = subscribeState;
        int i = a.$EnumSwitchMapping$0[subscribeState.ordinal()];
        VkButton vkButton = this.x;
        VkButton vkButton2 = this.w;
        if (i == 1) {
            vkButton2.setVisibility(0);
            vkButton.setVisibility(8);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            vkButton2.setVisibility(8);
            vkButton.setVisibility(0);
        }
    }

    public final void setSubscribers(int i) {
        gpt0 gpt0Var = gpt0.a;
        Resources resources = getContext().getResources();
        long j = i;
        DecimalFormat decimalFormat = z8s.a;
        this.v.setText(z8s.b(resources, j, R.plurals.followers_count, R.string.video_subscribers_count_formatted));
    }

    public final void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        this.u.setText(charSequence);
    }

    public final void setTitleMaxLines(Integer num) {
        this.u.setMaxLines(num != null ? num.intValue() : 1);
    }
}
