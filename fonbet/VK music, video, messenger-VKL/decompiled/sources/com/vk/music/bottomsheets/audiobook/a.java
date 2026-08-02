package com.vk.music.bottomsheets.audiobook;

import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import xsna.jnj;
import xsna.msy;
import xsna.od4;
import xsna.pd4;
import xsna.s10;
import xsna.u2b0;
import xsna.xl40;

/* compiled from: AudioBookBottomSheetActionsFactory.kt */
/* loaded from: classes3.dex */
public final class a {
    public final u2b0 a;
    public final int b;
    public final xl40 c;
    public final Object d = msy.a(LazyThreadSafetyMode.NONE, new pd4(0));

    public a(u2b0 u2b0Var, boolean z, int i, xl40 xl40Var) {
        this.a = u2b0Var;
        this.b = i;
        this.c = xl40Var;
    }

    public final void a(ArrayList<s10> arrayList) {
        if (this.c.isEnabled().getValue().booleanValue()) {
            return;
        }
        arrayList.add(new s10(R.drawable.vk_icon_copy_outline_28, R.string.copy_link, od4.a.b));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void b(ArrayList<s10> arrayList) {
        arrayList.add(new s10(R.drawable.vk_icon_download_outline_28, R.string.music_track_menu_download, od4.b.b, Integer.valueOf(((Boolean) this.d.getValue()).booleanValue() ? R.string.audio_book_menu_download_unavailable_subtitle : R.string.audio_book_menu_download_unavailable_subtitle_toggle), true));
    }

    public final void c(ArrayList<s10> arrayList) {
        arrayList.add(new s10(R.drawable.vk_icon_share_outline_28, R.string.audio_book_share, this.c.isEnabled().getValue().booleanValue() ? od4.a.b : od4.h.b));
    }

    public final void d(ArrayList<s10> arrayList, boolean z) {
        int i = this.b;
        if (jnj.f(i)) {
            return;
        }
        xl40 xl40Var = this.c;
        if (z) {
            arrayList.add(new s10(xl40Var.isEnabled().getValue().booleanValue() ? R.drawable.vk_icon_delete_outline_28 : R.drawable.vk_icon_remove_circle_outline_28, jnj.d(i) ? R.string.music_remove_from_my_collection : R.string.audio_book_remove_from_favorite, od4.k.b));
        } else {
            arrayList.add(new s10(xl40Var.isEnabled().getValue().booleanValue() ? R.drawable.vk_icon_like_outline_28 : R.drawable.vk_icon_add_outline_28, jnj.d(i) ? R.string.music_add_to_my_collection : R.string.audio_book_add_in_collection, od4.i.b));
        }
    }

    public final void e(ArrayList<s10> arrayList) {
        if (this.a.m0().i()) {
            return;
        }
        arrayList.add(new s10(R.drawable.vk_icon_moon_outline_28, R.string.music_sleep_timer, od4.j.b));
    }
}
