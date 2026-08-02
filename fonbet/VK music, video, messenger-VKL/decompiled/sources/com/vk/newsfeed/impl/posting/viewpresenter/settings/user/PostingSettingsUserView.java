package com.vk.newsfeed.impl.posting.viewpresenter.settings.user;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.movika.tools.controls.seekbar.n;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.abg0;
import xsna.bwt0;
import xsna.cn70;
import xsna.dhr0;
import xsna.f370;
import xsna.f4m;
import xsna.gib0;
import xsna.h7v;
import xsna.jjc;
import xsna.msy;
import xsna.yhu;

/* compiled from: PostingSettingsUserView.kt */
/* loaded from: classes4.dex */
public final class PostingSettingsUserView extends ConstraintLayout {
    public static final /* synthetic */ int A = 0;
    public final int t;
    public final int u;
    public final int v;
    public a w;
    public final Object x;
    public final TextView y;
    public final TextView z;

    /* compiled from: PostingSettingsUserView.kt */
    public interface a {
        void b();

        void c();
    }

    /* compiled from: PostingSettingsUserView.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PostingVisibilityMode.values().length];
            try {
                iArr[PostingVisibilityMode.FRIENDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PostingVisibilityMode.BEST_FRIENDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PostingVisibilityMode.ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PostingSettingsUserView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        abg0 abg0Var = dhr0.t;
        this.t = abg0Var.c(R.attr.vk_ui_text_secondary);
        this.u = abg0Var.c(R.attr.vk_ui_text_accent);
        this.v = context.getColor(R.color.vk_green);
        this.x = msy.a(LazyThreadSafetyMode.NONE, new n(27));
        LayoutInflater.from(context).inflate(R.layout.view_posting_settings_user, (ViewGroup) this, true);
        f4m.B(cn70.b(12), cn70.b(11), this);
        f4m.l(cn70.b(16), cn70.b(16), this);
        TextView textView = (TextView) findViewById(R.id.tv_privacy);
        this.y = textView;
        TextView textView2 = (TextView) findViewById(R.id.tv_settings);
        this.z = textView2;
        bwt0.s0(textView, 0.96f);
        bwt0.s0(textView2, 0.96f);
        jjc.g(textView, new gib0(this, 4));
        jjc.g(textView2, new yhu(this, 24));
        f370.H(textView, context.getString(R.string.posting_settings_action_privacy));
        f370.H(textView2, context.getString(R.string.posting_settings_action_to_settings));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final h7v getHintsManager() {
        return (h7v) this.x.getValue();
    }

    public final void setCallback(a aVar) {
        this.w = aVar;
    }
}
