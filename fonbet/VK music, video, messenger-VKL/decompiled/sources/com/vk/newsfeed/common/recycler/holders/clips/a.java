package com.vk.newsfeed.common.recycler.holders.clips;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.clips.tool.view.newsfeed.overlay.ClipEndOverlayView;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.imageloader.view.VKCircleImageView;
import com.vk.newsfeed.common.recycler.holders.clips.SingleClipV2Holder;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import xsna.cfd;
import xsna.cui;
import xsna.di60;
import xsna.dnt0;
import xsna.ent0;
import xsna.epx;
import xsna.fad;
import xsna.g620;
import xsna.gad;
import xsna.h170;
import xsna.i7o;
import xsna.j5g;
import xsna.ka0;
import xsna.la;
import xsna.p8d;
import xsna.qfd;
import xsna.qi6;
import xsna.r74;
import xsna.rp6;
import xsna.s6o;
import xsna.s980;
import xsna.u1c0;
import xsna.vf0;
import xsna.zof;

/* compiled from: ClipPostV2Holder.kt */
/* loaded from: classes4.dex */
public final class a extends rp6<fad, Post> implements ent0, i7o, cui, qfd {
    public static final /* synthetic */ int L = 0;
    public final ConstraintLayout E;
    public final VKCircleImageView F;
    public final TextView G;
    public final ImageView H;
    public final cfd I;
    public ClipVideoFile J;
    public Post K;

    public a(ViewGroup viewGroup, h170 h170Var, zof zofVar, ClipActionButtonStateRepository clipActionButtonStateRepository) {
        super(R.layout.clip_post_holder, viewGroup);
        FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.clip_post_container);
        ConstraintLayout constraintLayout = (ConstraintLayout) frameLayout.findViewById(R.id.clip_post_clip_owner_container);
        this.E = constraintLayout;
        this.F = (VKCircleImageView) frameLayout.findViewById(R.id.clip_post_clip_owner_avatar);
        this.G = (TextView) frameLayout.findViewById(R.id.clip_post_clip_owner_name);
        this.H = (ImageView) frameLayout.findViewById(R.id.clip_post_clip_owner_verified);
        cfd cfdVar = new cfd(frameLayout, new p8d(this.itemView.getContext(), g620.f().a(), zofVar, new gad(this, a.class, "displayContext", "getDisplayContext()Lcom/vk/newsfeed/presentation/model/PostDisplayContext;", 0), clipActionButtonStateRepository, true), null, null, h170Var, 60);
        this.I = cfdVar;
        viewGroup.getContext();
        frameLayout.addView(cfdVar.itemView, 0);
        constraintLayout.setOnClickListener(new la(this, 1));
        ka0 ka0Var = new ka0(this, 20);
        ClipEndOverlayView clipEndOverlayView = cfdVar.L0;
        clipEndOverlayView.m.add(ka0Var);
        clipEndOverlayView.n.add(new vf0(this, 20));
    }

    @Override // xsna.qfd
    public final View F1() {
        return this.I.W;
    }

    @Override // xsna.qfd
    public final boolean J5() {
        return this.I.K7();
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        this.I.Q6(s6oVar);
    }

    @Override // xsna.rp6
    public final /* bridge */ /* synthetic */ void R6(fad fadVar) {
    }

    @Override // xsna.rp6
    public final void U6(Post post) {
        super.U6(post);
        u1c0 J0 = J0();
        if (J0 == null) {
            return;
        }
        r74 r74Var = J0 instanceof r74 ? (r74) J0 : null;
        Attachment attachment = r74Var != null ? r74Var.q : null;
        VideoAttachment videoAttachment = attachment instanceof VideoAttachment ? (VideoAttachment) attachment : null;
        Parcelable parcelable = videoAttachment != null ? videoAttachment.k : null;
        this.J = parcelable instanceof ClipVideoFile ? (ClipVideoFile) parcelable : null;
        this.K = di60.R(J0.a);
        this.I.J7(J0, c7(), J0.l);
        b7();
    }

    @Override // xsna.qfd
    public final String W0() {
        return this.I.W0();
    }

    @Override // xsna.rp6, xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        super.a6(u1c0Var);
        r74 r74Var = u1c0Var instanceof r74 ? (r74) u1c0Var : null;
        Attachment attachment = r74Var != null ? r74Var.q : null;
        VideoAttachment videoAttachment = attachment instanceof VideoAttachment ? (VideoAttachment) attachment : null;
        Parcelable parcelable = videoAttachment != null ? videoAttachment.k : null;
        this.J = parcelable instanceof ClipVideoFile ? (ClipVideoFile) parcelable : null;
        this.K = di60.R(u1c0Var.a);
        this.I.J7(u1c0Var, c7(), u1c0Var.l);
        b7();
    }

    @Override // xsna.rp6, xsna.qi6
    public final void b6(u1c0 u1c0Var, Object obj) {
        if ((obj instanceof Iterable ? j5g.Z((Iterable) obj) : obj) == SingleClipV2Holder.BindConfig.HEADER) {
            super.b6(u1c0Var, obj);
        } else {
            a6(u1c0Var);
        }
    }

    public final void b7() {
        ClipVideoFile clipVideoFile = this.J;
        if (clipVideoFile == null) {
            return;
        }
        boolean c7 = c7();
        ConstraintLayout constraintLayout = this.E;
        if (!c7) {
            constraintLayout.setVisibility(8);
            return;
        }
        constraintLayout.setVisibility(0);
        this.F.o0(clipVideoFile.q0, null);
        this.G.setText(clipVideoFile.p0);
        this.H.setVisibility(di60.A(clipVideoFile.o0) ? 0 : 8);
    }

    public final boolean c7() {
        Owner owner;
        Owner owner2;
        ClipVideoFile clipVideoFile = this.J;
        UserId userId = null;
        UserId userId2 = (clipVideoFile == null || (owner2 = clipVideoFile.v0) == null) ? null : owner2.b;
        Post post = this.K;
        if (post != null && (owner = post.o) != null) {
            userId = owner.b;
        }
        return !epx.f(userId2, userId);
    }

    @Override // xsna.ent0
    public final dnt0 q3() {
        return this.I.L;
    }

    @Override // xsna.cui
    public final void q5(s980 s980Var, qi6.b bVar) {
        cfd cfdVar = this.I;
        cfdVar.y = s980Var;
        if (s980Var != null) {
            cfdVar.D = s980Var;
        }
        cfdVar.A = bVar;
    }
}
