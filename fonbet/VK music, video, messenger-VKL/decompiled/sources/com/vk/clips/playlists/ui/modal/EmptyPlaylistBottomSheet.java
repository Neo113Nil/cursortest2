package com.vk.clips.playlists.ui.modal;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.clips.playlists.ClipsPlaylistContentLaunchParams;
import com.vk.clips.playlists.di.ClipsPlaylistsComponentImpl;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.core.ui.bottomsheet.actionsheet.a;
import com.vk.movika.sdk.base.logic.interactor.f;
import com.vk.movika.sdk.base.ui.s0;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.asp;
import xsna.asu0;
import xsna.c5g;
import xsna.dhr0;
import xsna.e43;
import xsna.fgm;
import xsna.ga;
import xsna.gzs;
import xsna.h7;
import xsna.ia;
import xsna.l9h;
import xsna.m3g;
import xsna.maj;
import xsna.msy;
import xsna.s3q0;
import xsna.s6k;
import xsna.ver0;
import xsna.w8i;
import xsna.wzf;
import xsna.xg5;
import xsna.xu20;
import xsna.y8g0;
import xsna.zrp;

/* compiled from: EmptyPlaylistBottomSheet.kt */
/* loaded from: classes16.dex */
public final class EmptyPlaylistBottomSheet extends a.C0785a implements w8i {
    public final Context h;
    public final ClipsPlaylistContentLaunchParams i;
    public final gzs<s3q0> j;
    public final m3g k;
    public final boolean l;
    public final Object m;
    public final Object n;
    public final Object o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EmptyPlaylistBottomSheet.kt */
    public static final class Item {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Item[] $VALUES;
        public static final Item AddClips;
        public static final Item DeletePlaylist;
        public static final Item SharePlaylist;
        private final int text;

        static {
            Item item = new Item("AddClips", 0, R.string.clips_playlist_no_clips_bs_add_clips);
            AddClips = item;
            Item item2 = new Item("SharePlaylist", 1, R.string.clips_playlist_no_clips_bs_share_playlist);
            SharePlaylist = item2;
            Item item3 = new Item("DeletePlaylist", 2, R.string.clips_playlist_no_clips_bs_delete_playlist);
            DeletePlaylist = item3;
            Item[] itemArr = {item, item2, item3};
            $VALUES = itemArr;
            $ENTRIES = new asp(itemArr);
        }

        public Item(String str, int i, int i2) {
            this.text = i2;
        }

        public static Item valueOf(String str) {
            return (Item) Enum.valueOf(Item.class, str);
        }

        public static Item[] values() {
            return (Item[]) $VALUES.clone();
        }

        public final int h() {
            return this.text;
        }
    }

    public EmptyPlaylistBottomSheet(Context context, ClipsPlaylistContentLaunchParams clipsPlaylistContentLaunchParams, gzs gzsVar, m3g m3gVar, boolean z) {
        int i;
        this.h = context;
        this.i = clipsPlaylistContentLaunchParams;
        this.j = gzsVar;
        this.k = m3gVar;
        this.l = z;
        l9h l9hVar = new l9h(this, 15);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Lazy a = msy.a(lazyThreadSafetyMode, l9hVar);
        this.m = a;
        this.n = msy.a(lazyThreadSafetyMode, new fgm(this, 4));
        this.o = msy.a(lazyThreadSafetyMode, new maj(this, 10));
        ClipsPlaylist clipsPlaylist = clipsPlaylistContentLaunchParams.b;
        boolean e = xg5.a().e(clipsPlaylist.f);
        int i2 = 12;
        if (e) {
            ver0.a(new i0(((ClipsPlaylistsComponentImpl) a.getValue()).Df().b(), new h7(new s6k(this, i2), 21)).a0(asu0.a.d()).subscribe(new ga(new wzf(this, 15), 27), new ia(new f(23), 29)));
        }
        ArrayList o = e43.o(new xu20(null, context.getString(R.string.clips_playlist_no_clips_bs_subtitle, clipsPlaylist.c), 0, null, 12));
        List<Item> l = e ? e43.l(Item.AddClips, Item.SharePlaylist, Item.DeletePlaylist) : Collections.singletonList(Item.AddClips);
        ArrayList arrayList = new ArrayList(c5g.u(l, 10));
        for (Item item : l) {
            arrayList.add(new ModalActionSheetListItem(item.ordinal(), null, y8g0.e(item.h()), null, null, 0, null, false, false, IronSourceError.ERROR_CODE_INVALID_KEY_VALUE));
        }
        o.addAll(arrayList);
        this.b = o;
        this.c = new s0(i2, this, clipsPlaylist);
        if (this.l) {
            dhr0.a.getClass();
            i = dhr0.u().c;
        } else {
            i = dhr0.C().c;
        }
        this.g = i;
    }
}
