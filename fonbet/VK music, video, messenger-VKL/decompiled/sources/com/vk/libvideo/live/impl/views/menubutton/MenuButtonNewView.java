package com.vk.libvideo.live.impl.views.menubutton;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.live.impl.views.menubutton.MenuButtonNewView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import one.video.player.OneVideoPlayer;
import one.video.player.tracks.c;
import xsna.asp;
import xsna.av20;
import xsna.bpn0;
import xsna.d3b0;
import xsna.dhr0;
import xsna.dw20;
import xsna.e3m;
import xsna.fxc0;
import xsna.g520;
import xsna.gpt0;
import xsna.h520;
import xsna.jgp;
import xsna.kn9;
import xsna.l7s;
import xsna.m33;
import xsna.yg5;
import xsna.zrp;

/* compiled from: MenuButtonNewView.kt */
/* loaded from: classes3.dex */
public final class MenuButtonNewView extends AppCompatImageButton implements h520 {
    public static final /* synthetic */ int h = 0;
    public g520 e;
    public final String f;
    public dw20 g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MenuButtonNewView.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a ADD_TO_MY;
        public static final a BLOCK_NOTIFICATION;
        public static final a COPY;
        public static final a HIDE_FROM_RECOMENDATIONS;
        public static final a HIDE_FROM_STORIES;
        public static final a LICENSE_DISCLAIMER;
        public static final a QUALITY;
        public static final a REMOVE_FROM_MY;
        public static final a REPORT;
        public static final a RESUME_TO_RECOMENDATIONS;
        public static final a SHARE;
        public static final a UNBLOCK_NOTIFICATION;
        private final int iconResId;
        private final int id;
        private final int nameResId;
        private CharSequence subtitle;

        static {
            a aVar = new a("QUALITY", 0, R.id.live_video_quality, R.drawable.vk_icon_settings_outline_28, R.string.live_video_quality);
            QUALITY = aVar;
            a aVar2 = new a("SHARE", 1, R.id.live_video_repost, R.drawable.vk_icon_share_outline_28, R.string.live_video_menu_share);
            SHARE = aVar2;
            a aVar3 = new a("COPY", 2, R.id.live_video_copy, R.drawable.vk_icon_copy_outline_28, R.string.copy_link);
            COPY = aVar3;
            a aVar4 = new a("ADD_TO_MY", 3, R.id.live_video_save_to_my_videos, R.drawable.vk_icon_add_outline_28, R.string.video_add_to_added);
            ADD_TO_MY = aVar4;
            a aVar5 = new a("BLOCK_NOTIFICATION", 4, R.id.live_video_block_notifications, R.drawable.vk_icon_notifications_28, R.string.live_video_menu_block_notifications);
            BLOCK_NOTIFICATION = aVar5;
            a aVar6 = new a("UNBLOCK_NOTIFICATION", 5, R.id.live_video_unblock_notifications, R.drawable.vk_icon_notifications_28, R.string.live_video_menu_unblock_notifications);
            UNBLOCK_NOTIFICATION = aVar6;
            a aVar7 = new a("HIDE_FROM_STORIES", 6, R.id.live_video_hide_from_stories, R.drawable.vk_icon_hide_outline_28, R.string.live_hide_from_stories);
            HIDE_FROM_STORIES = aVar7;
            a aVar8 = new a("RESUME_TO_RECOMENDATIONS", 7, R.id.live_video_remove_ban, R.drawable.vk_icon_cancel_outline_28, R.string.live_unhide_from_recommendations);
            RESUME_TO_RECOMENDATIONS = aVar8;
            a aVar9 = new a("HIDE_FROM_RECOMENDATIONS", 8, R.id.live_video_add_ban, R.drawable.vk_icon_cancel_outline_28, R.string.live_hide_from_recommendations);
            HIDE_FROM_RECOMENDATIONS = aVar9;
            a aVar10 = new a("REPORT", 9, R.id.live_video_report, R.drawable.vk_icon_report_outline_28, R.string.report_content);
            REPORT = aVar10;
            a aVar11 = new a("REMOVE_FROM_MY", 10, R.id.live_video_remove_from_my_videos, R.drawable.vk_icon_delete_outline_28, R.string.video_remove_from_added);
            REMOVE_FROM_MY = aVar11;
            a aVar12 = new a("LICENSE_DISCLAIMER", 11, R.id.live_video_license_disclaimer, R.drawable.vk_icon_info_circle_outline_28, R.string.video_media_license_title);
            LICENSE_DISCLAIMER = aVar12;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a() {
            throw null;
        }

        public a(String str, int i, int i2, int i3, int i4) {
            this.id = i2;
            this.iconResId = i3;
            this.nameResId = i4;
            this.subtitle = null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final int h() {
            return this.iconResId;
        }

        public final int i() {
            return this.id;
        }

        public final int j() {
            return this.nameResId;
        }

        public final CharSequence k() {
            return this.subtitle;
        }

        public final void l(SpannableStringBuilder spannableStringBuilder) {
            this.subtitle = spannableStringBuilder;
        }
    }

    public MenuButtonNewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // xsna.h520
    public final void M0() {
        d3b0 v0;
        OneVideoPlayer a2;
        List<c> k0;
        Activity h2 = e3m.h(getContext());
        dhr0.a.getClass();
        int i = dhr0.u().c;
        l7s l7sVar = new l7s(h2, dhr0.u().c);
        av20.a aVar = new av20.a();
        aVar.d(R.layout.actions_popup_item, LayoutInflater.from(l7sVar));
        aVar.d = new com.vk.libvideo.live.impl.views.menubutton.a(l7sVar);
        aVar.e = new b(this, h2);
        av20 b = aVar.b();
        ArrayList arrayList = new ArrayList();
        if (getPresenterLocal().J()) {
            arrayList.add(a.SHARE);
            arrayList.add(a.COPY);
        } else {
            VideoFile k = getPresenterLocal().k();
            bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
            yg5 e = b.C1208b.a().e(k, null);
            boolean z = e.g0() == -5 || e.g0() == -3;
            if (!k.z0() && (v0 = e.v0()) != null && (a2 = v0.a()) != null && (k0 = a2.k0()) != null && (!k0.isEmpty()) && !z) {
                a aVar2 = a.QUALITY;
                gpt0 gpt0Var = gpt0.a;
                aVar2.l(gpt0.t(getContext(), e.g0(), jgp.b));
                arrayList.add(aVar2);
            }
            if (!fxc0.B().J().Q0() && getPresenterLocal().J1() && !getPresenterLocal().h1() && !getPresenterLocal().u() && !getPresenterLocal().w()) {
                arrayList.add(a.ADD_TO_MY);
            }
            if (getPresenterLocal().z1()) {
                arrayList.add(a.SHARE);
            }
            if (!getPresenterLocal().J1() && !getPresenterLocal().u()) {
                if (getPresenterLocal().F0()) {
                    arrayList.add(a.UNBLOCK_NOTIFICATION);
                } else {
                    arrayList.add(a.BLOCK_NOTIFICATION);
                }
            }
            if (getPresenterLocal().U0()) {
                arrayList.add(a.HIDE_FROM_STORIES);
            } else if (!getPresenterLocal().u() && !getPresenterLocal().w()) {
                if (getPresenterLocal().d0()) {
                    arrayList.add(a.RESUME_TO_RECOMENDATIONS);
                } else {
                    arrayList.add(a.HIDE_FROM_RECOMENDATIONS);
                }
            }
            arrayList.add(a.COPY);
            arrayList.add(a.REPORT);
            if (getPresenterLocal().J1() && getPresenterLocal().h1()) {
                arrayList.add(a.REMOVE_FROM_MY);
            }
            if (getPresenterLocal().X0()) {
                arrayList.add(a.LICENSE_DISCLAIMER);
            }
        }
        b.setItems(arrayList);
        this.g = ((dw20.b) dw20.a.k(new dw20.b(e3m.h(getContext()), null).u0(dhr0.u().c).Z(new DialogInterface.OnDismissListener() { // from class: xsna.i520
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                MenuButtonNewView.this.g = null;
            }
        }), b, 4)).I0(this.f);
    }

    public final g520 getPresenterLocal() {
        g520 g520Var = this.e;
        if (g520Var != null) {
            return g520Var;
        }
        return null;
    }

    @Override // xsna.rr6
    public Context getViewContext() {
        return getContext();
    }

    public final void setPresenterLocal(g520 g520Var) {
        this.e = g520Var;
    }

    public MenuButtonNewView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        setBackgroundColor(0);
        setImageDrawable(m33.a(R.drawable.vk_icon_more_vertical_shadow_medium_48, getContext()));
        setOnClickListener(new kn9(this, 6));
        this.f = "live_options";
        UserId.b bVar = UserId.c;
    }

    @Override // xsna.rr6
    public g520 getPresenter() {
        return getPresenterLocal();
    }

    @Override // xsna.rr6
    public void setPresenter(g520 g520Var) {
        setPresenterLocal(g520Var);
    }

    @Override // xsna.rr6
    public View getView() {
        return this;
    }

    @Override // xsna.rr6
    public final void pause() {
    }

    @Override // xsna.rr6
    public final void release() {
    }

    @Override // xsna.rr6
    public final void resume() {
    }

    public void setStatus(int i) {
    }
}
