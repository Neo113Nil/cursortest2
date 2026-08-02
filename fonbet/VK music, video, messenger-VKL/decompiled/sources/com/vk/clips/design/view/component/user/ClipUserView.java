package com.vk.clips.design.view.component.user;

import android.content.Context;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.clips.tool.view.component.user.ClipUserHorizontalScrollView;
import com.vk.clips.tool.view.component.user.UserStackAvatarClippingView;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.picture.c;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.awt0;
import xsna.bt;
import xsna.cpy;
import xsna.dko;
import xsna.e3m;
import xsna.eko;
import xsna.epx;
import xsna.ey2;
import xsna.f4m;
import xsna.gko;
import xsna.hdu0;
import xsna.iah0;
import xsna.j5g;
import xsna.k590;
import xsna.m33;
import xsna.rzt0;
import xsna.s3q0;
import xsna.t43;
import xsna.tlo0;
import xsna.vut0;
import xsna.wed;
import xsna.wut0;

/* compiled from: ClipUserView.kt */
/* loaded from: classes16.dex */
public final class ClipUserView extends ConstraintLayout {
    public static final float I = iah0.b(24.0f);
    public static final float J = iah0.b(30.0f);
    public static final float K = iah0.b(16.0f);
    public static final float L = iah0.b(16.0f);
    public static final float M = iah0.b(1.5f);
    public static final int N = iah0.a(16);
    public final VkText A;
    public final VkText B;
    public final VkText C;
    public final VkImage D;
    public final VkImage E;
    public final d F;
    public a G;
    public c H;
    public final FrameLayout t;
    public VkAvatar u;
    public UserStackAvatarClippingView v;
    public VkAvatar w;
    public vut0 x;
    public final VkText y;
    public final ClipUserHorizontalScrollView z;

    /* compiled from: ClipUserView.kt */
    public interface a extends rzt0 {

        /* compiled from: ClipUserView.kt */
        /* renamed from: com.vk.clips.design.view.component.user.ClipUserView$a$a, reason: collision with other inner class name */
        public static final class C0573a implements a {
            public final b a;
            public final gko b;

            public C0573a(b bVar) {
                gko gkoVar = new gko(R.drawable.user_placeholder);
                this.a = bVar;
                this.b = gkoVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0573a)) {
                    return false;
                }
                C0573a c0573a = (C0573a) obj;
                return epx.f(this.a, c0573a.a) && epx.f(this.b, c0573a.b);
            }

            public final int hashCode() {
                b bVar = this.a;
                int hashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
                gko gkoVar = this.b;
                return hashCode + (gkoVar != null ? Integer.hashCode(gkoVar.a) : 0);
            }

            public final String toString() {
                return "Avatar(avatar=" + this.a + ", placeholder=" + this.b + ')';
            }
        }

        /* compiled from: ClipUserView.kt */
        public static final class b implements a {
            public final List<b> a;
            public final gko b;

            public b() {
                this(null, 3);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                gko gkoVar = this.b;
                return hashCode + (gkoVar == null ? 0 : Integer.hashCode(gkoVar.a));
            }

            public final String toString() {
                return "MultiAvatar(avatars=" + this.a + ", placeholder=" + this.b + ')';
            }

            public b(ArrayList arrayList, int i) {
                List list = (i & 1) != 0 ? EmptyList.b : arrayList;
                gko gkoVar = new gko(R.drawable.user_placeholder);
                this.a = list;
                this.b = gkoVar;
            }
        }
    }

    /* compiled from: ClipUserView.kt */
    public interface b {
        hdu0 d();

        String e(int i);
    }

    /* compiled from: ClipUserView.kt */
    public static final class c {
        public final a a;
        public final tlo0 b;
        public final b c;
        public final dko d;

        /* compiled from: ClipUserView.kt */
        public interface a {

            /* compiled from: ClipUserView.kt */
            /* renamed from: com.vk.clips.design.view.component.user.ClipUserView$c$a$a, reason: collision with other inner class name */
            public static final class C0574a implements a {
                public final tlo0 a;
                public final tlo0 b;

                public C0574a() {
                    this((tlo0.h) null, 3);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0574a)) {
                        return false;
                    }
                    C0574a c0574a = (C0574a) obj;
                    return epx.f(this.a, c0574a.a) && epx.f(this.b, c0574a.b);
                }

                public final int hashCode() {
                    tlo0 tlo0Var = this.a;
                    int hashCode = (tlo0Var == null ? 0 : tlo0Var.hashCode()) * 31;
                    tlo0 tlo0Var2 = this.b;
                    return hashCode + (tlo0Var2 != null ? tlo0Var2.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Ellipsized(text=");
                    sb.append(this.a);
                    sb.append(", coauthorsCountTitle=");
                    return bt.a(sb, this.b, ')');
                }

                public /* synthetic */ C0574a(tlo0.h hVar, int i) {
                    this((tlo0.h) null, (i & 1) != 0 ? null : hVar);
                }

                public C0574a(tlo0.h hVar, tlo0 tlo0Var) {
                    this.a = tlo0Var;
                    this.b = hVar;
                }
            }

            /* compiled from: ClipUserView.kt */
            public static final class b implements a {
                public final tlo0 a;

                public b() {
                    this(3, null);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
                }

                public final int hashCode() {
                    tlo0 tlo0Var = this.a;
                    return (tlo0Var == null ? 0 : tlo0Var.hashCode()) * 31;
                }

                public final String toString() {
                    return "Fade(text=" + this.a + ", coauthorsCountTitle=null)";
                }

                public b(int i, tlo0 tlo0Var) {
                    this.a = (i & 1) != 0 ? null : tlo0Var;
                }
            }
        }

        public c() {
            this(null, 15);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d);
        }

        public final int hashCode() {
            a aVar = this.a;
            int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            tlo0 tlo0Var = this.b;
            int hashCode2 = (hashCode + (tlo0Var == null ? 0 : tlo0Var.hashCode())) * 31;
            b bVar = this.c;
            int hashCode3 = (hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            dko dkoVar = this.d;
            return hashCode3 + (dkoVar != null ? dkoVar.hashCode() : 0);
        }

        public final String toString() {
            return "Middle(title=" + this.a + ", subtitle=" + this.b + ", statusImage=" + this.c + ", verifiedIcon=" + this.d + ')';
        }

        public /* synthetic */ c(a.C0574a c0574a, int i) {
            this((i & 1) != 0 ? null : c0574a, null, null, null);
        }

        public c(a aVar, tlo0.h hVar, k590 k590Var, eko ekoVar) {
            this.a = aVar;
            this.b = hVar;
            this.c = k590Var;
            this.d = ekoVar;
        }
    }

    /* compiled from: ClipUserView.kt */
    public final class d implements ClipUserHorizontalScrollView.b {
        public boolean a;

        @Override // com.vk.clips.tool.view.component.user.ClipUserHorizontalScrollView.b
        public final void a() {
            this.a = true;
        }
    }

    public ClipUserView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        d dVar = new d();
        this.F = dVar;
        LayoutInflater.from(context).inflate(R.layout.clip_user_view, (ViewGroup) this, true);
        this.t = (FrameLayout) findViewById(R.id.clip_user_avatar_container);
        this.u = (VkAvatar) findViewById(R.id.clip_user_avatar);
        this.v = (UserStackAvatarClippingView) findViewById(R.id.clip_second_avatar_clipping_view);
        this.w = (VkAvatar) findViewById(R.id.clip_second_avatar);
        ClipUserHorizontalScrollView clipUserHorizontalScrollView = (ClipUserHorizontalScrollView) findViewById(R.id.clip_user_title_scroll_view);
        this.z = clipUserHorizontalScrollView;
        this.y = (VkText) findViewById(R.id.clip_user_title);
        this.A = (VkText) findViewById(R.id.clip_user_title_ellipsized);
        this.B = (VkText) findViewById(R.id.clip_user_coauthors_count);
        this.E = (VkImage) findViewById(R.id.clip_user_status_icon);
        this.D = (VkImage) findViewById(R.id.clip_user_verified_icon);
        this.C = (VkText) findViewById(R.id.clip_user_subtitle_vertical_text);
        e3m.a aVar = e3m.a;
        setForeground(m33.a(R.drawable.highlight_radius_10_white, context));
        setClickable(true);
        setFocusable(true);
        clipUserHorizontalScrollView.setOwnerScrollListener(dVar);
        clipUserHorizontalScrollView.setOnTouchListener(new t43(this, 1));
    }

    public final void P4(dko dkoVar, b bVar, boolean z) {
        hdu0 d2 = bVar != null ? bVar.d() : null;
        int i = (int) ((d2 == null || !z) ? I : J);
        String e = bVar != null ? bVar.e(i) : null;
        f4m.z(i, i, this.t);
        VkAvatar vkAvatar = this.u;
        if (vkAvatar != null) {
            vkAvatar.setVisibility(0);
        }
        UserStackAvatarClippingView userStackAvatarClippingView = this.v;
        if (userStackAvatarClippingView != null) {
            f4m.j(userStackAvatarClippingView);
        }
        VkAvatar vkAvatar2 = this.u;
        if (vkAvatar2 != null) {
            FrameLayout.LayoutParams a2 = cpy.a(i, i, 0, 0, 0, 0, 60);
            a2.gravity = 8388627;
            vkAvatar2.setLayoutParams(a2);
            vkAvatar2.setFixedSize(i);
            vkAvatar2.setContent(e != null ? new c.d(e, dkoVar) : new c.b(dkoVar));
            if (z) {
                vkAvatar2.W0(d2, true);
            }
        }
    }

    public final a getBefore() {
        return this.G;
    }

    public final c getMiddle() {
        return this.H;
    }

    public final void setBefore(a aVar) {
        if (epx.f(this.G, aVar)) {
            return;
        }
        this.G = aVar;
        vut0 vut0Var = this.x;
        if (vut0Var != null) {
            vut0Var.c(aVar);
            return;
        }
        if (aVar instanceof a.C0573a) {
            a.C0573a c0573a = (a.C0573a) aVar;
            P4(c0573a.b, c0573a.a, true);
        } else if (aVar instanceof a.b) {
            a.b bVar = (a.b) aVar;
            List<b> list = bVar.a;
            gko gkoVar = bVar.b;
            b bVar2 = (b) j5g.A0(list);
            if (bVar2 != null) {
                P4(gkoVar, bVar2, true);
            } else {
                List<b> list2 = bVar.a;
                P4(gkoVar, (b) j5g.a0(list2), false);
                int i = (int) K;
                VkAvatar vkAvatar = this.u;
                if (vkAvatar != null) {
                    FrameLayout.LayoutParams a2 = cpy.a(i, i, 0, 0, 0, 0, 60);
                    a2.gravity = 83;
                    vkAvatar.setLayoutParams(a2);
                }
                VkAvatar vkAvatar2 = this.u;
                if (vkAvatar2 != null) {
                    vkAvatar2.setFixedSize(i);
                }
                b bVar3 = (b) j5g.b0(0, list2);
                String e = bVar3 != null ? bVar3.e(i) : null;
                VkAvatar vkAvatar3 = this.u;
                if (vkAvatar3 != null) {
                    vkAvatar3.setContent(e != null ? new c.d(e, gkoVar) : new c.b(gkoVar));
                }
                UserStackAvatarClippingView userStackAvatarClippingView = this.v;
                if (userStackAvatarClippingView != null) {
                    userStackAvatarClippingView.setVisibility(0);
                }
                float f = L;
                int i2 = (int) f;
                VkAvatar vkAvatar4 = this.w;
                if (vkAvatar4 != null) {
                    vkAvatar4.setFixedSize(i2);
                }
                b bVar4 = (b) j5g.b0(1, list2);
                String e2 = bVar4 != null ? bVar4.e(i2) : null;
                VkAvatar vkAvatar5 = this.w;
                if (vkAvatar5 != null) {
                    vkAvatar5.setContent(e2 != null ? new c.d(e2, gkoVar) : new c.b(gkoVar));
                }
                UserStackAvatarClippingView userStackAvatarClippingView2 = this.v;
                if (userStackAvatarClippingView2 != null) {
                    Path path = new Path();
                    float f2 = f / 2.0f;
                    float f3 = f2 - (I - f);
                    path.addCircle(f3, f - f3, f2 + M, Path.Direction.CW);
                    userStackAvatarClippingView2.setClippingOutPath(path);
                }
            }
        } else {
            VkAvatar vkAvatar6 = this.u;
            if (vkAvatar6 != null) {
                f4m.j(vkAvatar6);
            }
            UserStackAvatarClippingView userStackAvatarClippingView3 = this.v;
            if (userStackAvatarClippingView3 != null) {
                f4m.j(userStackAvatarClippingView3);
            }
        }
        requestLayout();
    }

    public final void setLeftAvatarView(wut0 wut0Var) {
        FrameLayout frameLayout = this.t;
        frameLayout.removeAllViews();
        AttributeSet attributeSet = null;
        if (wut0Var == null) {
            this.x = null;
            s3q0 s3q0Var = s3q0.a;
        } else {
            vut0 create = wut0Var.create(frameLayout.getContext());
            this.x = create;
            s3q0 s3q0Var2 = s3q0.a;
            View view = create.getView();
            frameLayout.removeAllViews();
            frameLayout.addView(view);
        }
        if (wut0Var == null) {
            int a2 = e3m.a(R.dimen.vk_ui_avatar_x_s, getContext());
            int a3 = e3m.a(R.dimen.clip_user_multi_avatar_image_size, getContext());
            int i = 6;
            int i2 = 0;
            VkAvatar vkAvatar = new VkAvatar(getContext(), attributeSet, i, i2);
            vkAvatar.setId(R.id.clip_user_avatar);
            vkAvatar.setLayoutParams(cpy.a(a2, a2, 0, 0, 0, 0, 60));
            this.u = vkAvatar;
            VkAvatar vkAvatar2 = new VkAvatar(getContext(), attributeSet, i, i2);
            vkAvatar2.setId(R.id.clip_second_avatar);
            vkAvatar2.setLayoutParams(cpy.a(a3, a3, 0, 0, 0, 0, 60));
            this.w = vkAvatar2;
            UserStackAvatarClippingView userStackAvatarClippingView = new UserStackAvatarClippingView(getContext(), null, 6);
            userStackAvatarClippingView.setId(R.id.clip_second_avatar_clipping_view);
            FrameLayout.LayoutParams a4 = cpy.a(a3, a3, 0, 0, 0, 0, 60);
            a4.gravity = 8388661;
            userStackAvatarClippingView.setLayoutParams(a4);
            userStackAvatarClippingView.setVisibility(8);
            userStackAvatarClippingView.addView(this.w, 0);
            this.v = userStackAvatarClippingView;
            frameLayout.addView(this.u, 0);
            frameLayout.addView(this.v, 1);
        }
    }

    public final void setMiddle(c cVar) {
        if (epx.f(this.H, cVar)) {
            return;
        }
        this.H = cVar;
        c.a aVar = cVar != null ? cVar.a : null;
        boolean z = aVar instanceof c.a.b;
        ClipUserHorizontalScrollView clipUserHorizontalScrollView = this.z;
        VkText vkText = this.A;
        if (z) {
            clipUserHorizontalScrollView.setVisibility(0);
            f4m.j(vkText);
            tlo0 tlo0Var = ((c.a.b) aVar).a;
            this.y.setText(tlo0Var != null ? tlo0Var.a(getContext()) : null);
        } else if (aVar instanceof c.a.C0574a) {
            f4m.j(clipUserHorizontalScrollView);
            vkText.setVisibility(0);
            c.a.C0574a c0574a = (c.a.C0574a) aVar;
            tlo0 tlo0Var2 = c0574a.a;
            vkText.setText(tlo0Var2 != null ? tlo0Var2.a(getContext()) : null);
            tlo0 tlo0Var3 = c0574a.b;
            this.B.setText(tlo0Var3 != null ? tlo0Var3.a(getContext()) : null);
        } else {
            f4m.j(clipUserHorizontalScrollView);
            f4m.j(vkText);
        }
        c cVar2 = this.H;
        tlo0 tlo0Var4 = cVar2 != null ? cVar2.b : null;
        ey2.i(this.C, tlo0Var4 != null ? tlo0Var4.a(getContext()) : null);
        c cVar3 = this.H;
        b bVar = cVar3 != null ? cVar3.c : null;
        String e = bVar != null ? bVar.e(N) : null;
        VkImage vkImage = this.E;
        vkImage.o0(e, null);
        awt0.v(vkImage, e != null);
        c cVar4 = this.H;
        dko dkoVar = cVar4 != null ? cVar4.d : null;
        Drawable a2 = dkoVar != null ? dkoVar.a(getContext()) : null;
        VkImage vkImage2 = this.D;
        vkImage2.setImageDrawable(a2);
        awt0.v(vkImage2, a2 != null);
        requestLayout();
    }

    public final void setOnAvatarClickListener(View.OnClickListener onClickListener) {
        FrameLayout frameLayout = this.t;
        if (onClickListener == null) {
            frameLayout.setOnClickListener(onClickListener);
        } else {
            frameLayout.setOnClickListener(new wed(0, this, onClickListener));
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(new com.vk.im.video.c(2, this, onClickListener));
    }
}
