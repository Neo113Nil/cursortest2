package com.vk.topics.impl.fragments;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.user.UserProfile;
import com.vk.imageloader.view.VKCircleImageView;
import com.vkontakte.android.R;
import xsna.drm0;
import xsna.epx;
import xsna.gzs;
import xsna.ho8;
import xsna.ii7;
import xsna.oq;
import xsna.pvo0;
import xsna.tlo0;
import xsna.vif0;

/* compiled from: DiscussionHolder.kt */
/* loaded from: classes6.dex */
public final class c extends vif0<ii7> implements View.OnClickListener, View.OnLongClickListener {
    public final d n;
    public final VkCell o;
    public final VkCell p;

    /* compiled from: DiscussionHolder.kt */
    public static final class a implements VkCell.d {
        public final VKCircleImageView a;

        public a(Context context) {
            VKCircleImageView vKCircleImageView = new VKCircleImageView(context);
            vKCircleImageView.setPlaceholderImage(R.drawable.photo_loading);
            this.a = vKCircleImageView;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            C1931c c1931c = fVar instanceof C1931c ? (C1931c) fVar : null;
            if (c1931c != null) {
                String str = c1931c.a;
                boolean N = drm0.N(str);
                VKCircleImageView vKCircleImageView = this.a;
                if (N) {
                    vKCircleImageView.clear();
                } else {
                    vKCircleImageView.o0(str, null);
                }
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: DiscussionHolder.kt */
    public static final class b implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new a(context);
        }
    }

    /* compiled from: DiscussionHolder.kt */
    /* renamed from: com.vk.topics.impl.fragments.c$c, reason: collision with other inner class name */
    public static final class C1931c implements VkCell.f {
        public final String a;

        public C1931c(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1931c) && epx.f(this.a, ((C1931c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("AvatarViewParams(photo="), this.a, ')');
        }
    }

    /* compiled from: DiscussionHolder.kt */
    public interface d {
        void L4(ii7 ii7Var);

        void a6(ii7 ii7Var, boolean z);
    }

    public c(Context context, d dVar) {
        super(R.layout.board_topic_row_new, context);
        this.n = dVar;
        VkCell vkCell = (VkCell) this.itemView.findViewById(R.id.board_topic_header);
        this.o = vkCell;
        VkCell vkCell2 = (VkCell) this.itemView.findViewById(R.id.board_topic_last_comment);
        this.p = vkCell2;
        vkCell.setOnClickListener(this);
        vkCell.setOnLongClickListener(this);
        vkCell2.setOnClickListener(this);
        vkCell2.setLeftMainAvatarController(new b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // xsna.vif0
    public final void i6(ii7 ii7Var) {
        String str;
        String str2;
        ii7 ii7Var2 = ii7Var;
        Resources b6 = b6();
        int i = ii7Var2.c;
        String quantityString = b6.getQuantityString(R.plurals.topic_posts, i, Integer.valueOf(i));
        int i2 = ii7Var2.g;
        int i3 = i2 & 1;
        if (i3 > 0 && (i2 & 2) > 0) {
            StringBuilder b2 = ho8.b(quantityString, ", ");
            b2.append(b6().getString(R.string.topic_info_fixed_closed));
            quantityString = b2.toString();
        } else if (i3 > 0) {
            StringBuilder b3 = ho8.b(quantityString, ", ");
            b3.append(b6().getString(R.string.topic_info_closed));
            quantityString = b3.toString();
        } else if ((i2 & 2) > 0) {
            StringBuilder b4 = ho8.b(quantityString, ", ");
            b4.append(b6().getString(R.string.topic_info_fixed));
            quantityString = b4.toString();
        }
        tlo0.a aVar = tlo0.Companion;
        String str3 = ii7Var2.b;
        if (str3 == null) {
            str3 = "";
        }
        this.o.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(oq.d(aVar, str3), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), new VkCell.Middle.d(new tlo0.h(quantityString), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62), (VkCell.Middle.c) null, (VkCell.Middle.Size) (0 == true ? 1 : 0), 12));
        UserProfile userProfile = ii7Var2.j;
        if (userProfile == null || (str = userProfile.e) == null) {
            str = "DELETED";
        }
        String k = pvo0.k(ii7Var2.e, b6(), false);
        if (userProfile == null || (str2 = userProfile.g) == null) {
            str2 = userProfile != null ? userProfile.h : null;
            if (str2 == null) {
                str2 = "";
            }
        }
        VkCell.Left.b a2 = VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.a(new C1931c(str2), VkCell.Left.Main.Size.Small));
        VkCell vkCell = this.p;
        vkCell.setLeft(a2);
        VkCell.Middle.e eVar = new VkCell.Middle.e(new tlo0.h(str), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62);
        ?? r1 = ii7Var2.i;
        vkCell.setMiddle(new VkCell.Middle.b(eVar, new VkCell.Middle.d(new tlo0.h(r1 != 0 ? r1 : ""), (gzs) null, 1, TextUtils.TruncateAt.END, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50), new VkCell.Middle.c(new tlo0.h(k), null, 0, 14), (VkCell.Middle.Size) (0 == true ? 1 : 0), 8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        d dVar = this.n;
        if (dVar != null) {
            dVar.a6((ii7) this.m, view.getId() == R.id.board_topic_last_comment);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        d dVar = this.n;
        if (dVar == null) {
            return false;
        }
        dVar.L4((ii7) this.m);
        return true;
    }
}
