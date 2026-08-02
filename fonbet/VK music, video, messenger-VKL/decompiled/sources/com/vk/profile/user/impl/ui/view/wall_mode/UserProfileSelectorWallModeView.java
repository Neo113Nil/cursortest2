package com.vk.profile.user.impl.ui.view.wall_mode;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.dto.newsfeed.WallGetMode;
import com.vk.profile.core.content.ContentTabView;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.epx;
import xsna.slq0;

/* compiled from: UserProfileSelectorWallModeView.kt */
/* loaded from: classes5.dex */
public final class UserProfileSelectorWallModeView extends ConstraintLayout implements View.OnClickListener {
    public final ContentTabView t;
    public final ContentTabView u;
    public final ContentTabView v;
    public final TextView w;
    public final View x;
    public final View y;
    public slq0 z;

    public UserProfileSelectorWallModeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.view_user_profile_wall_mode_selector, (ViewGroup) this, true);
        ContentTabView contentTabView = (ContentTabView) findViewById(R.id.profile_wall_all_posts);
        contentTabView.setShadowColor(R.color.vk_black_alpha35);
        contentTabView.setText(context.getString(R.string.wall_all_posts));
        this.t = contentTabView;
        ContentTabView contentTabView2 = (ContentTabView) findViewById(R.id.profile_wall_owner_posts);
        contentTabView2.setShadowColor(R.color.vk_black_alpha35);
        this.u = contentTabView2;
        ContentTabView contentTabView3 = (ContentTabView) findViewById(R.id.profile_wall_archived_posts);
        contentTabView3.setShadowColor(R.color.vk_black_alpha35);
        contentTabView3.setText(context.getString(R.string.wall_tab_archived_posts));
        this.v = contentTabView3;
        this.w = (TextView) findViewById(R.id.profile_wall_post_counter);
        this.x = findViewById(R.id.profile_wall_post_counter_separator);
        View findViewById = findViewById(R.id.profile_wall_post_btn);
        this.y = findViewById;
        bwt0.h0(this, contentTabView);
        bwt0.h0(this, contentTabView2);
        bwt0.h0(this, contentTabView3);
        bwt0.h0(this, findViewById);
    }

    public final slq0 getActionSender() {
        slq0 slq0Var = this.z;
        if (slq0Var != null) {
            return slq0Var;
        }
        return null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (epx.f(view, this.t)) {
            getActionSender().a(new UserProfileAction.d0.e.a(WallGetMode.ALL));
            return;
        }
        if (epx.f(view, this.u)) {
            getActionSender().a(new UserProfileAction.d0.e.a(WallGetMode.OWNER));
        } else if (epx.f(view, this.v)) {
            getActionSender().a(new UserProfileAction.d0.e.a(WallGetMode.ARCHIVED));
        } else if (epx.f(view, this.y)) {
            getActionSender().a(UserProfileAction.d0.e.b.a.b);
        }
    }

    public final void setActionSender(slq0 slq0Var) {
        this.z = slq0Var;
    }

    public final void setup(UserProfileAdapterItem.q qVar) {
        ContentTabView contentTabView = this.v;
        bwt0.p0(contentTabView, false);
        bwt0.p0(this.u, false);
        bwt0.p0(this.t, false);
        TextView textView = this.w;
        bwt0.p0(textView, true);
        bwt0.p0(this.x, true);
        textView.setText(getResources().getString(R.string.no_posts));
        contentTabView.setTabSelected(WallGetMode.ARCHIVED == null);
    }
}
