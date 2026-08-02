package com.vk.profile.questions.impl;

import android.content.Context;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.photos.dto.PhotosPhotoSizesDto;
import com.vk.api.generated.questions.dto.QuestionsQuestionDto;
import com.vk.api.generated.stories.dto.StoriesStoryDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.imageloader.view.VKImageView;
import com.vk.profile.questions.impl.QuestionsListFragment;
import com.vk.profile.questions.impl.d;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import xsna.ba;
import xsna.bwt0;
import xsna.dhr0;
import xsna.dko;
import xsna.epx;
import xsna.fn9;
import xsna.gko;
import xsna.gzs;
import xsna.hkc;
import xsna.ho8;
import xsna.i68;
import xsna.iah0;
import xsna.ikc;
import xsna.j6;
import xsna.js5;
import xsna.k1u0;
import xsna.qqe0;
import xsna.tlo0;
import xsna.vfz;
import xsna.vq8;
import xsna.x7g;

/* compiled from: QuestionsAdapter.kt */
/* loaded from: classes5.dex */
public final class e extends vfz<d.c> {
    public final qqe0 l;
    public final VkCell m;
    public final TextView n;
    public final VkButton o;
    public final VkButton p;
    public final VKImageView q;

    /* compiled from: QuestionsAdapter.kt */
    public static final class a implements VkCell.d {
        public final VKImageView a;

        public a(Context context) {
            VKImageView vKImageView = new VKImageView(context, null, 6, 0);
            vKImageView.setRound(true);
            vKImageView.setPlaceholderImage(dhr0.w(R.drawable.user_placeholder, context));
            this.a = vKImageView;
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

    /* compiled from: QuestionsAdapter.kt */
    public static final class b implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new a(context);
        }
    }

    /* compiled from: QuestionsAdapter.kt */
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
            return ho8.a(new StringBuilder("AvatarViewParams(avatarUri="), this.a, ')');
        }
    }

    public e(ViewGroup viewGroup, QuestionsListFragment.b bVar) {
        super(R.layout.pds_item_question, viewGroup);
        this.l = bVar;
        VkCell vkCell = (VkCell) this.itemView.findViewById(R.id.user_cell);
        vkCell.setLeftMainAvatarController(new b());
        this.m = vkCell;
        this.n = (TextView) this.itemView.findViewById(R.id.question_text);
        this.o = (VkButton) this.itemView.findViewById(R.id.answer_button);
        this.p = (VkButton) this.itemView.findViewById(R.id.message_button);
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.question_story);
        vKImageView.setCornerRadius(iah0.b(4.0f));
        this.q = vKImageView;
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(d.c cVar) {
        VkCell.Middle.e.b.C0817b c0817b;
        PhotosPhotoDto x1;
        List<PhotosPhotoSizesDto> R;
        Object obj;
        d.c cVar2 = cVar;
        QuestionsQuestionDto questionsQuestionDto = cVar2.b;
        boolean z = cVar2.f;
        boolean z2 = cVar2.g;
        if (z) {
            if (z2) {
                h6(cVar2);
            } else {
                i6(cVar2);
            }
            VkButton vkButton = this.p;
            vkButton.setText(R.string.questions_action_answer_go_to_chat);
            vkButton.setMode(VkButton.Mode.Link);
            vkButton.setOnClickListener(new hkc(3, this, cVar2));
        } else if (z2) {
            h6(cVar2);
        } else {
            i6(cVar2);
        }
        this.o.setOnClickListener(new i68(4, this, cVar2));
        VkCell.Left.a aVar = VkCell.Left.Companion;
        UsersUserFullDto usersUserFullDto = cVar2.c;
        String a2 = js5.a(iah0.a(24), usersUserFullDto.r2());
        if (a2 == null && (a2 = usersUserFullDto.X1()) == null) {
            a2 = "";
        }
        VkCell.Left.b a3 = VkCell.Left.a.a(aVar, new VkCell.Left.Main.a(new c(a2), VkCell.Left.Main.Size.Small));
        VkCell vkCell = this.m;
        vkCell.setLeft(a3);
        VkCell.Middle.a aVar2 = VkCell.Middle.Companion;
        tlo0.a aVar3 = tlo0.Companion;
        String str = usersUserFullDto.D0() + ' ' + usersUserFullDto.x1();
        aVar3.getClass();
        tlo0.h hVar = new tlo0.h(str);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        Boolean l = questionsQuestionDto.l();
        String str2 = null;
        if (!epx.f(l, Boolean.TRUE)) {
            l = null;
        }
        if (l != null) {
            float f = 6;
            c0817b = new VkCell.Middle.e.b.C0817b(new gko(R.drawable.white_oval), new k1u0.a(new x7g(R.attr.vk_ui_icon_accent)), (tlo0.f) null, new Size(iah0.a(f), iah0.a(f)), 4);
        } else {
            c0817b = null;
        }
        vkCell.setMiddle(VkCell.Middle.a.a(aVar2, new VkCell.Middle.e(hVar, 1, truncateAt, (VkCell.Middle.e.b) null, c0817b, 18), (cVar2.d ? cVar2 : null) != null ? new VkCell.Middle.d(new tlo0.f(R.string.questions_user_banned), (gzs) null, 1, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 58) : null, null, 12));
        VkCell.Right.c cVar3 = VkCell.Right.Companion;
        gko.b bVar = gko.Companion;
        vkCell.setRight(VkCell.Right.c.a(cVar3, null, new VkCell.Right.e.b((dko) new gko(R.drawable.vk_icon_more_vertical_shadow_24), (k1u0) new k1u0.a(new x7g(R.attr.vk_ui_icon_secondary)), (Size) null, (tlo0) new tlo0.f(R.string.accessibility_more), false, (gzs) new j6(15, this, cVar2), 20), null, null, 29));
        if (cVar2.e) {
            vkCell.setOnClickListener(null);
        } else {
            vkCell.setOnClickListener(new vq8(2, this, cVar2));
        }
        this.n.setText(questionsQuestionDto.f());
        boolean z3 = questionsQuestionDto.e() != null;
        VKImageView vKImageView = this.q;
        bwt0.p0(vKImageView, z3);
        if (!bwt0.K(vKImageView)) {
            vKImageView.setOnClickListener(null);
            return;
        }
        vKImageView.setOnClickListener(new ba(4, this, cVar2));
        StoriesStoryDto e = questionsQuestionDto.e();
        if (e != null && (x1 = e.x1()) != null && (R = x1.R()) != null) {
            Iterator<T> it = R.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((PhotosPhotoSizesDto) obj).getHeight() >= 50) {
                        break;
                    }
                }
            }
            PhotosPhotoSizesDto photosPhotoSizesDto = (PhotosPhotoSizesDto) obj;
            if (photosPhotoSizesDto != null) {
                str2 = photosPhotoSizesDto.getUrl();
            }
        }
        vKImageView.load(str2);
    }

    public final void h6(d.c cVar) {
        VkButton vkButton = this.o;
        vkButton.setEnabled(false);
        vkButton.setText(R.string.questions_action_answered);
        vkButton.setMode(VkButton.Mode.Secondary);
        vkButton.setAppearance(VkButton.Appearance.Neutral);
        VkButton vkButton2 = this.p;
        vkButton2.setText(R.string.questions_action_answer_again);
        vkButton2.setMode(VkButton.Mode.Link);
        vkButton2.setOnClickListener(new fn9(2, this, cVar));
    }

    public final void i6(d.c cVar) {
        VkButton vkButton = this.o;
        vkButton.setEnabled(true);
        vkButton.setText(R.string.questions_action_answer_to_story);
        vkButton.setMode(VkButton.Mode.Primary);
        vkButton.setAppearance(VkButton.Appearance.Accent);
        boolean z = !cVar.e;
        VkButton vkButton2 = this.p;
        bwt0.p0(vkButton2, z);
        vkButton2.setText(R.string.questions_action_to_message);
        vkButton2.setMode(VkButton.Mode.Secondary);
        vkButton2.setOnClickListener(new ikc(3, this, cVar));
    }
}
