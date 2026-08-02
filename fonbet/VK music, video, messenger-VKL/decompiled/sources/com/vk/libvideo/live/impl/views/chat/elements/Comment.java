package com.vk.libvideo.live.impl.views.chat.elements;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.d;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.avatar.api.VKAvatarView;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.group.Group;
import com.vk.dto.live.LiveEventModel;
import com.vk.dto.user.UserProfile;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import xsna.awt0;
import xsna.baf0;
import xsna.dqz0;
import xsna.etf0;
import xsna.fag;
import xsna.iah0;
import xsna.kr5;
import xsna.m33;
import xsna.os9;
import xsna.pxo0;
import xsna.qpb;

/* loaded from: classes3.dex */
public class Comment extends FrameLayout implements etf0 {
    public static final /* synthetic */ int l = 0;
    public final VKAvatarView b;
    public final VkText c;
    public final VkText d;
    public final View e;
    public final View f;
    public d g;
    public LiveEventModel h;
    public WeakReference<qpb> i;
    public final pxo0 j;
    public boolean k;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Comment comment = Comment.this;
            if (comment.j.a()) {
                return;
            }
            d dVar = comment.g;
            if (dVar != null) {
                dVar.dismiss();
                comment.g = null;
            }
            boolean z = comment.h.c == 17;
            qpb qpbVar = comment.i.get();
            LiveEventModel liveEventModel = comment.h;
            qpbVar.p0(liveEventModel.m, liveEventModel.j, z).subscribe(new fag(comment));
        }
    }

    public Comment(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.j = new pxo0(700L);
        this.k = false;
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.live_chat_comment, (ViewGroup) this, true);
        this.c = (VkText) findViewById(R.id.liveCommentText);
        this.b = (VKAvatarView) findViewById(R.id.liveCommentUserPic);
        this.d = (VkText) findViewById(R.id.liveCommentUser);
        this.e = findViewById(R.id.liveCommentAuthorBadge);
        this.f = findViewById(R.id.liveCommentLike);
        setLayoutParams(new RecyclerView.p(-1, -2));
        setPadding(iah0.a(12.0f), iah0.a(6.0f), iah0.a(12.0f), iah0.a(6.0f));
        setBackground(m33.a(R.drawable.live_comment_ripple_bg, getContext()));
    }

    @Override // xsna.etf0
    public final void release() {
        d dVar = this.g;
        if (dVar != null) {
            dVar.dismiss();
            this.g = null;
        }
    }

    public void setLikesEnabled(boolean z) {
        this.k = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00c1, code lost:
    
        if (r0.m0(r10.m, r10.d) != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setModel(LiveEventModel liveEventModel) {
        baf0 baf0Var;
        this.h = liveEventModel;
        qpb qpbVar = this.i.get();
        Group group = liveEventModel.l;
        UserProfile userProfile = liveEventModel.k;
        this.b.Y0(group != null ? new kr5.a(new os9(group, 1)).a() : userProfile != null ? new kr5.a(new dqz0(userProfile)).a() : new kr5.a(null).a());
        this.c.setText(liveEventModel.q);
        CharSequence charSequence = liveEventModel.r;
        VkText vkText = this.d;
        vkText.setText(charSequence);
        boolean z = true;
        if (liveEventModel.c == 17) {
            baf0Var = new baf0(m33.a(R.drawable.vk_icon_pin_16, getContext()), getContext().getColor(R.color.vk_white));
        } else {
            boolean z2 = userProfile != null && userProfile.B.b;
            Group group2 = liveEventModel.l;
            baf0Var = (z2 || (group2 != null && group2.y.b)) ? new baf0(m33.a(R.drawable.vk_icon_check_outline_16, getContext()), getContext().getColor(R.color.vk_white)) : null;
        }
        vkText.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, baf0Var, (Drawable) null);
        awt0.v(this.e, liveEventModel.s);
        if (this.k) {
            LiveEventModel liveEventModel2 = this.h;
        }
        z = false;
        awt0.v(this.f, z);
    }

    public void setPresenter(qpb qpbVar) {
        this.i = new WeakReference<>(qpbVar);
        setOnClickListener(new a());
    }
}
