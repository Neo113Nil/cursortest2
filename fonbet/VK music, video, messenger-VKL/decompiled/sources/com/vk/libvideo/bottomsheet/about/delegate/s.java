package com.vk.libvideo.bottomsheet.about.delegate;

import android.content.Context;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.dto.music.Thumb;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.c4;
import xsna.dko;
import xsna.epx;
import xsna.gko;
import xsna.gzs;
import xsna.h9;
import xsna.hfz;
import xsna.ho8;
import xsna.iah0;
import xsna.k1u0;
import xsna.oq;
import xsna.p1u0;
import xsna.tlo0;
import xsna.vfz;
import xsna.x7g;

/* compiled from: AboutVideoRelatedAudioCellDelegate.kt */
/* loaded from: classes2.dex */
public final class s extends p1u0<AboutVideoItem.s> {
    public static final int b = iah0.a(56);
    public final c4 a;

    /* compiled from: AboutVideoRelatedAudioCellDelegate.kt */
    public static final class a implements VkCell.d {
        public final VkPicture a;

        public a(Context context) {
            VkPicture vkPicture = new VkPicture(context, null, 6, 0);
            vkPicture.setCornerRadius(VkPicture.CornerRadius.Large);
            this.a = vkPicture;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            c cVar = fVar instanceof c ? (c) fVar : null;
            if (cVar != null) {
                this.a.o0(cVar.a, null);
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: AboutVideoRelatedAudioCellDelegate.kt */
    public static final class b implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new a(context);
        }
    }

    /* compiled from: AboutVideoRelatedAudioCellDelegate.kt */
    public static final class c implements VkCell.f {
        public final String a;

        public c(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("ImageViewParams(image="), this.a, ')');
        }
    }

    /* compiled from: AboutVideoRelatedAudioCellDelegate.kt */
    public static final class d extends vfz<AboutVideoItem.s> {
        public final c4 l;
        public final VkCell m;

        public d(View view, c4 c4Var) {
            super(view);
            this.l = c4Var;
            VkCell vkCell = (VkCell) this.itemView.findViewById(R.id.cell);
            this.m = vkCell;
            vkCell.setLeftMainViewController(new b());
        }

        @Override // xsna.vfz
        /* renamed from: W5 */
        public final void i6(AboutVideoItem.s sVar) {
            AboutVideoItem.s sVar2 = sVar;
            VkCell.Left.a aVar = VkCell.Left.Companion;
            Thumb thumb = sVar2.g;
            int i = s.b;
            Serializer.c<Thumb> cVar = Thumb.CREATOR;
            VkCell.Left.b a = VkCell.Left.a.a(aVar, new VkCell.Left.Main.e(new c(String.valueOf(thumb.Cb(i, false))), new Size(i, i)));
            VkCell vkCell = this.m;
            vkCell.setLeft(a);
            VkCell.Middle.a aVar2 = VkCell.Middle.Companion;
            tlo0.h d = oq.d(tlo0.Companion, sVar2.d);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            VkCell.Right.d dVar = null;
            vkCell.setMiddle(VkCell.Middle.a.a(aVar2, new VkCell.Middle.e(d, 1, truncateAt, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), new VkCell.Middle.d(new tlo0.h(sVar2.f), (gzs) null, 1, truncateAt, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50), null, 12));
            if (!sVar2.i) {
                VkCell.Right.c cVar2 = VkCell.Right.Companion;
                boolean z = sVar2.h;
                int i2 = z ? R.drawable.vk_icon_done_outline_28 : R.drawable.vk_icon_add_outline_28;
                gko.b bVar = gko.Companion;
                dVar = VkCell.Right.c.a(cVar2, null, new VkCell.Right.e.b((dko) new gko(i2), (k1u0) new k1u0.a(new x7g(R.attr.vk_ui_icon_primary)), (Size) null, (tlo0) new tlo0.f(z ? R.string.related_music_track_row_icon_remove : R.string.related_music_track_row_icon_add), false, (gzs) new h9(this, 0), 20), null, null, 29);
            }
            vkCell.setRight(dVar);
        }
    }

    public s(c4 c4Var) {
        this.a = c4Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.s> b(ViewGroup viewGroup) {
        return new d(bwt0.I(R.layout.video_related_audio_cell, viewGroup, false), this.a);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof AboutVideoItem.s;
    }
}
