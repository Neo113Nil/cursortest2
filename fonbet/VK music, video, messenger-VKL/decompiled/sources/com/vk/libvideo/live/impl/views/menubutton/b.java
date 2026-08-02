package com.vk.libvideo.live.impl.views.menubutton;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.vk.libvideo.live.impl.views.menubutton.MenuButtonNewView;
import com.vkontakte.android.R;
import xsna.av20;
import xsna.kv2;
import xsna.o25;
import xsna.wmg;

/* compiled from: MenuButtonNewView.kt */
/* loaded from: classes3.dex */
public final class b implements av20.b<MenuButtonNewView.a> {
    public final /* synthetic */ MenuButtonNewView a;
    public final /* synthetic */ Context b;

    public b(MenuButtonNewView menuButtonNewView, Activity activity) {
        this.a = menuButtonNewView;
        this.b = activity;
    }

    @Override // xsna.av20.b
    public final void a(View view, Object obj, int i, wmg wmgVar) {
        int i2 = MenuButtonNewView.h;
        int i3 = ((MenuButtonNewView.a) obj).i();
        MenuButtonNewView menuButtonNewView = this.a;
        if (i3 == R.id.live_video_save_to_my_videos) {
            o25.a().getClass();
            menuButtonNewView.getPresenterLocal().P();
        } else if (i3 == R.id.live_video_remove_from_my_videos) {
            menuButtonNewView.getPresenterLocal().a1();
        } else if (i3 == R.id.live_video_report) {
            menuButtonNewView.getPresenterLocal().L1();
        } else if (i3 == R.id.live_video_repost) {
            menuButtonNewView.getPresenterLocal().Z();
        } else if (i3 == R.id.live_video_quality) {
            menuButtonNewView.getPresenterLocal().K1();
        } else if (i3 == R.id.live_video_block_notifications) {
            menuButtonNewView.getPresenterLocal().f1(true);
        } else if (i3 == R.id.live_video_unblock_notifications) {
            menuButtonNewView.getPresenterLocal().f1(false);
        } else if (i3 == R.id.live_video_add_ban) {
            o25.a().getClass();
            menuButtonNewView.getPresenterLocal().N1();
        } else if (i3 == R.id.live_video_remove_ban) {
            menuButtonNewView.getPresenterLocal().d2();
        } else if (i3 == R.id.live_video_copy) {
            menuButtonNewView.getPresenterLocal().s1();
        } else if (i3 == R.id.live_video_hide_from_stories) {
            menuButtonNewView.getPresenterLocal().s();
        } else if (i3 == R.id.live_video_license_disclaimer) {
            menuButtonNewView.getPresenterLocal().X1();
        }
        view.postDelayed(new kv2(menuButtonNewView, 5), this.b.getResources().getInteger(android.R.integer.config_shortAnimTime));
    }
}
