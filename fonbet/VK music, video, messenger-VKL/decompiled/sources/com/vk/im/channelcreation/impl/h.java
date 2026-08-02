package com.vk.im.channelcreation.impl;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Size;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.BottomConfirmButton;
import com.vk.core.view.components.cell.VkCell;
import com.vk.core.view.components.cell.button.VkCellButton;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.core.view.components.formitem.VkInputSelectEditText;
import com.vk.dto.common.im.ImageList;
import com.vk.im.channelcreation.impl.e;
import com.vk.im.channelcreation.impl.g;
import com.vk.im.channelcreation.impl.i;
import com.vk.im.channelcreation.impl.j;
import com.vk.im.ui.components.common.AvatarAction;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.ao50;
import xsna.bwt0;
import xsna.bxa;
import xsna.bzb0;
import xsna.cn70;
import xsna.cwb0;
import xsna.cxa;
import xsna.dhr0;
import xsna.dxa;
import xsna.e3m;
import xsna.epx;
import xsna.exa;
import xsna.fi6;
import xsna.fxa;
import xsna.gzs;
import xsna.h7u0;
import xsna.h9;
import xsna.hd;
import xsna.hxa;
import xsna.ikv0;
import xsna.j1;
import xsna.krv0;
import xsna.l1;
import xsna.m33;
import xsna.o1;
import xsna.o40;
import xsna.p1;
import xsna.p40;
import xsna.r9;
import xsna.s3q0;
import xsna.s5;
import xsna.sm9;
import xsna.t9;
import xsna.tlo0;
import xsna.tq;
import xsna.ts8;
import xsna.utj;
import xsna.vw0;
import xsna.w0v0;
import xsna.yn50;
import xsna.zk70;

/* compiled from: ChannelCreationViewController.kt */
/* loaded from: classes2.dex */
public final class h extends fi6<j, g> {
    public final Context f;
    public a g;
    public j h;
    public final Handler i;
    public final bzb0 j;
    public w0v0 k;

    /* compiled from: ChannelCreationViewController.kt */
    public static final class a {
        public final Toolbar a;
        public final VkInputSelect b;
        public final BottomConfirmButton c;
        public final AvatarView d;
        public final LinearLayout e;
        public final VkCell f;
        public final VkCellButton g;

        public a(View view) {
            this.a = (Toolbar) view.findViewById(R.id.im_toolbar);
            this.b = (VkInputSelect) view.findViewById(R.id.im_channel_name);
            this.c = (BottomConfirmButton) view.findViewById(R.id.im_confirm_btn);
            this.d = (AvatarView) view.findViewById(R.id.im_avatar);
            this.e = (LinearLayout) view.findViewById(R.id.snackbar_container);
            this.f = (VkCell) view.findViewById(R.id.im_switch_comments);
            this.g = (VkCellButton) view.findViewById(R.id.im_delete);
        }
    }

    /* compiled from: ChannelCreationViewController.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AvatarAction.values().length];
            try {
                iArr[AvatarAction.CHANGE_BY_GALLERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AvatarAction.CHANGE_BY_CAMERA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AvatarAction.REMOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public h(int i, ChannelCreationFragment channelCreationFragment) {
        super(i, null);
        Context requireContext = channelCreationFragment.requireContext();
        this.f = requireContext;
        this.i = new Handler(Looper.getMainLooper());
        this.j = new bzb0(requireContext);
    }

    @Override // xsna.fi6
    public final void Q(View view) {
        a aVar = new a(view);
        vw0 vw0Var = new vw0(this, 4);
        Toolbar toolbar = aVar.a;
        toolbar.setNavigationOnClickListener(vw0Var);
        toolbar.setOnMenuItemClickListener(new o40(this, 4));
        bwt0.i0(aVar.d, new p40(this, 19));
        r9 r9Var = new r9(this, 14);
        VkInputSelect vkInputSelect = aVar.b;
        VkInputSelectEditText vkInputSelectEditText = vkInputSelect.g;
        w0v0 w0v0Var = new w0v0(r9Var);
        vkInputSelectEditText.addTextChangedListener(w0v0Var);
        this.k = w0v0Var;
        this.i.postDelayed(new o1(aVar, 4), 100L);
        BottomConfirmButton bottomConfirmButton = aVar.c;
        if (bottomConfirmButton != null) {
            bottomConfirmButton.a(false);
            bwt0.i0(bottomConfirmButton, new p1(this, 18));
        }
        aVar.f.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(tq.h(tlo0.Companion, R.string.im_new_channel_comments_enables), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), (VkCell.Middle.d) null, (VkCell.Middle.c) null, VkCell.Middle.Size.Large, 6));
        VkCellButton vkCellButton = aVar.g;
        if (vkCellButton != null) {
            bwt0.i0(vkCellButton, new t9(this, 17));
        }
        vkInputSelect.b(new hxa(vkInputSelect));
        this.g = aVar;
    }

    @Override // xsna.ei6, xsna.wn50
    public final void j(yn50 yn50Var) {
        boolean z = yn50Var instanceof i.d;
        bzb0 bzb0Var = this.j;
        Context context = this.f;
        if (!z) {
            if (yn50Var instanceof i.a) {
                bzb0Var.a();
                return;
            }
            if (!(yn50Var instanceof i.c)) {
                if (yn50Var instanceof i.b) {
                    ikv0.a aVar = new ikv0.a(context);
                    aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_positive), (Size) null, 12);
                    aVar.u = new ikv0.d(context.getString(R.string.im_new_channel_deleted), (String) null, (ikv0.d.a) null, 6);
                    aVar.n();
                    return;
                }
                return;
            }
            String b2 = zk70.b(((i.c) yn50Var).a);
            ikv0.a aVar2 = new ikv0.a(context);
            aVar2.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_outline_24, Integer.valueOf(R.attr.vk_ui_background_negative), (Size) null, 12);
            aVar2.u = new ikv0.d(b2, (String) null, (ikv0.d.a) null, 6);
            aVar2.o = Integer.valueOf(cn70.b(8));
            ikv0 b3 = aVar2.b();
            a aVar3 = this.g;
            if (aVar3 == null) {
                aVar3 = null;
            }
            LinearLayout linearLayout = aVar3.e;
            utj utjVar = b3.b;
            utjVar.l = null;
            utjVar.m = new WeakReference<>(linearLayout);
            utjVar.e();
            return;
        }
        e eVar = ((i.d) yn50Var).a;
        if (eVar instanceof e.a) {
            e.a aVar4 = (e.a) eVar;
            a aVar5 = this.g;
            AvatarView avatarView = (aVar5 != null ? aVar5 : null).d;
            int l = krv0.l(R.attr.vk_ui_icon_accent);
            avatarView.getContext();
            e.b bVar = new e.b(avatarView, null, null, l, 6);
            bVar.w = R.layout.ds_internal_context_menu_item;
            Iterator it = aVar4.a.iterator();
            while (it.hasNext()) {
                int i = b.$EnumSwitchMapping$0[((AvatarAction) it.next()).ordinal()];
                if (i == 1) {
                    VkContextMenu.c.c(bVar, R.string.vkim_take_photo_from_gallery, m33.a(R.drawable.vk_icon_picture_outline_28, context), false, Integer.valueOf(dhr0.t.c(R.attr.vk_ui_icon_accent)), new j1(this, 16), 20);
                } else if (i == 2) {
                    VkContextMenu.c.c(bVar, R.string.vkim_take_photo_from_camera, m33.a(R.drawable.vk_icon_camera_outline_28, context), false, Integer.valueOf(dhr0.t.c(R.attr.vk_ui_icon_accent)), new hd(this, 13), 20);
                } else if (i != 3) {
                    s3q0 s3q0Var = s3q0.a;
                } else {
                    VkContextMenu.c.c(bVar, R.string.vkim_chat_settings_avatar_remove, m33.a(R.drawable.vk_icon_delete_outline_28, context), false, Integer.valueOf(dhr0.t.c(R.attr.vk_ui_icon_negative)), new l1(this, 14), 20);
                }
            }
            bVar.l(false);
            return;
        }
        if (eVar instanceof e.d) {
            h7u0.a aVar6 = new h7u0.a(context);
            aVar6.g0(R.string.im_channel_creation_exit_title);
            aVar6.U(R.string.im_channel_creation_exit_desc);
            aVar6.W(android.R.string.cancel, new fxa());
            aVar6.c0(R.string.im_channel_creation_exit_action, new DialogInterface.OnClickListener() { // from class: xsna.gxa
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    com.vk.im.channelcreation.impl.h.this.O(g.j.b);
                    dialogInterface.dismiss();
                }
            });
            aVar6.m();
            return;
        }
        if (eVar instanceof e.C1095e) {
            h7u0.a aVar7 = new h7u0.a(context);
            aVar7.g0(R.string.im_channel_creation_exit_editing_title);
            aVar7.U(R.string.im_channel_creation_exit_editing_desc);
            aVar7.c0(R.string.im_channel_creation_exit_editing_save, new DialogInterface.OnClickListener() { // from class: xsna.axa
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    com.vk.im.channelcreation.impl.h.this.O(g.i.b);
                    dialogInterface.dismiss();
                }
            });
            aVar7.W(R.string.im_channel_creation_exit_action, new ts8(this, 1));
            aVar7.m();
            return;
        }
        if (eVar instanceof e.f) {
            bzb0Var.c(new cwb0.s0(null, ((e.f) eVar).a, 5), new h9(this, 12));
            return;
        }
        if (epx.f(eVar, e.c.a)) {
            h7u0.a aVar8 = new h7u0.a(context);
            aVar8.g0(R.string.im_channel_delete_title);
            aVar8.U(R.string.im_channel_delete_desc);
            aVar8.W(android.R.string.cancel, new dxa(0));
            aVar8.c0(R.string.im_channel_delete_action, new exa(this, 0));
            aVar8.m();
            return;
        }
        if (!epx.f(eVar, e.b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        h7u0.a aVar9 = new h7u0.a(context);
        aVar9.g0(R.string.im_channel_delete_avatar_title);
        aVar9.W(android.R.string.cancel, new bxa());
        aVar9.c0(R.string.im_channel_delete_action, new cxa(this, 0));
        aVar9.m();
    }

    @Override // xsna.wn50
    public final void l(ao50 ao50Var) {
        j.a aVar;
        j.a aVar2;
        j jVar = (j) ao50Var;
        j.a aVar3 = jVar.b;
        a aVar4 = this.g;
        if (aVar4 == null) {
            aVar4 = null;
        }
        VkCell vkCell = aVar4.f;
        boolean z = aVar3.d;
        String str = aVar3.a;
        String str2 = aVar3.c;
        vkCell.setRight(new VkCell.Right.d(new VkCell.Right.a.f((gzs) new s5(this, 18), z, true), (VkCell.Right.e) null, (VkCell.Right.ExtraAction.a) null, (VkCell.Right.b) null, 30));
        j jVar2 = this.h;
        if (!epx.f((jVar2 == null || (aVar2 = jVar2.b) == null) ? null : aVar2.a, str)) {
            if (str.length() == 0) {
                a aVar5 = this.g;
                if (aVar5 == null) {
                    aVar5 = null;
                }
                AvatarView avatarView = aVar5.d;
                e3m.a aVar6 = e3m.a;
                avatarView.T0(null, m33.a(R.drawable.ic_avatar_outline_placeholder, this.f));
            } else {
                a aVar7 = this.g;
                if (aVar7 == null) {
                    aVar7 = null;
                }
                AvatarView avatarView2 = aVar7.d;
                Serializer.c<ImageList> cVar = ImageList.CREATOR;
                ImageList c = ImageList.a.c(-1, -1, str);
                AvatarView.a aVar8 = AvatarView.y;
                avatarView2.T0(c, null);
            }
            if (this.h != null) {
                this.i.postDelayed(new sm9(this, 2), 100L);
            }
        }
        j jVar3 = this.h;
        if (!epx.f((jVar3 == null || (aVar = jVar3.b) == null) ? null : aVar.c, str2)) {
            a aVar9 = this.g;
            if (aVar9 == null) {
                aVar9 = null;
            }
            VkInputSelect vkInputSelect = aVar9.b;
            if (!String.valueOf(vkInputSelect.getText()).equals(str2)) {
                vkInputSelect.e(this.k);
                vkInputSelect.setText(str2);
                vkInputSelect.setSelection(str2.length());
                vkInputSelect.b(this.k);
            }
        }
        j jVar4 = this.h;
        if (jVar4 == null || jVar4.b() != jVar.b()) {
            a aVar10 = this.g;
            if (aVar10 == null) {
                aVar10 = null;
            }
            BottomConfirmButton bottomConfirmButton = aVar10.c;
            if (bottomConfirmButton != null) {
                bottomConfirmButton.setEnabled(jVar.b());
            }
        }
        j jVar5 = this.h;
        if (jVar5 == null || jVar5.c() != jVar.c()) {
            a aVar11 = this.g;
            MenuItem findItem = (aVar11 != null ? aVar11 : null).a.getMenu().findItem(R.id.action_channel_editing_done);
            if (findItem != null) {
                findItem.setVisible(jVar.c());
            }
        }
        this.h = jVar;
    }

    @Override // xsna.fi6, xsna.wn50
    public final void onDestroyView() {
        this.i.removeCallbacksAndMessages(null);
        this.j.a();
        super.onDestroyView();
    }
}
