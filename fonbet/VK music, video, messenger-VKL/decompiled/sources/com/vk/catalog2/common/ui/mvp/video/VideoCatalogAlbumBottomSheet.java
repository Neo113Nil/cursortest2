package com.vk.catalog2.common.ui.mvp.video;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoAlbum;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.internal.operators.observable.l0;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import java.util.Collections;
import java.util.List;
import xsna.a0u;
import xsna.af0;
import xsna.asp;
import xsna.av20;
import xsna.be80;
import xsna.da;
import xsna.dw20;
import xsna.e05;
import xsna.e43;
import xsna.epx;
import xsna.g74;
import xsna.he3;
import xsna.hij0;
import xsna.ho8;
import xsna.o25;
import xsna.rl3;
import xsna.rsg0;
import xsna.sua;
import xsna.t8s0;
import xsna.tra;
import xsna.w8s0;
import xsna.xg5;
import xsna.zrp;

/* compiled from: VideoCatalogAlbumBottomSheet.kt */
/* loaded from: classes16.dex */
public interface VideoCatalogAlbumBottomSheet {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoCatalogAlbumBottomSheet.kt */
    public static final class Action {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        public static final Action CopyLink;
        public static final Action GoToOwner;
        public static final Action PlayAll;
        public static final Action Share;
        public static final Action Subscribe;
        public static final Action Unsubscribe;

        static {
            Action action = new Action("Subscribe", 0);
            Subscribe = action;
            Action action2 = new Action("Unsubscribe", 1);
            Unsubscribe = action2;
            Action action3 = new Action("PlayAll", 2);
            PlayAll = action3;
            Action action4 = new Action("CopyLink", 3);
            CopyLink = action4;
            Action action5 = new Action("Share", 4);
            Share = action5;
            Action action6 = new Action("GoToOwner", 5);
            GoToOwner = action6;
            Action[] actionArr = {action, action2, action3, action4, action5, action6};
            $VALUES = actionArr;
            $ENTRIES = new asp(actionArr);
        }

        public Action() {
            throw null;
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    /* compiled from: VideoCatalogAlbumBottomSheet.kt */
    public static final class a implements VideoCatalogAlbumBottomSheet {
        public static final /* synthetic */ a a = new a();
        public static dw20 b;
        public static VideoAlbum c;
        public static boolean d;
        public static String e;
        public static c f;
        public static w8s0 g;
        public static b h;
        public static be80 i;
        public static com.vk.video.ui.share.api.b j;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: VideoCatalogAlbumBottomSheet.kt */
        /* renamed from: com.vk.catalog2.common.ui.mvp.video.VideoCatalogAlbumBottomSheet$a$a, reason: collision with other inner class name */
        public static final class EnumC0516a {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ EnumC0516a[] $VALUES;
            public static final EnumC0516a COPY_LINK;
            public static final EnumC0516a COPY_PLAYLIST_LINK;
            public static final EnumC0516a EDIT_PLAYLIST;
            public static final EnumC0516a GO_TO_AUTHOR;
            public static final EnumC0516a PLAYLIST_ADD_VIDEO;
            public static final EnumC0516a REMOVE_PLAYLIST;
            public static final EnumC0516a SHARE;
            public static final EnumC0516a SHARE_PLAYLIST;
            public static final EnumC0516a SUBSCRIBE;
            public static final EnumC0516a UNSUBSCRIBE;
            private final int iconResId;
            private final int id;
            private final int nameResId;

            static {
                EnumC0516a enumC0516a = new EnumC0516a("PLAYLIST_ADD_VIDEO", 0, R.id.video_playlist_add_video, R.drawable.vk_icon_video_add_square_outline_28, R.string.video_playlist_bottom_menu_playlist_add_video);
                PLAYLIST_ADD_VIDEO = enumC0516a;
                EnumC0516a enumC0516a2 = new EnumC0516a("EDIT_PLAYLIST", 1, R.id.video_edit_playlist, R.drawable.vk_icon_edit_outline_28, R.string.video_playlist_bottom_menu_edit_playlist);
                EDIT_PLAYLIST = enumC0516a2;
                EnumC0516a enumC0516a3 = new EnumC0516a("REMOVE_PLAYLIST", 2, R.id.video_remove_playlist, R.drawable.vk_icon_delete_outline_28, R.string.video_playlist_bottom_menu_delete_playlist);
                REMOVE_PLAYLIST = enumC0516a3;
                EnumC0516a enumC0516a4 = new EnumC0516a("COPY_LINK", 3, R.id.video_copy_link, R.drawable.vk_icon_copy_outline_28, R.string.copy_link);
                COPY_LINK = enumC0516a4;
                EnumC0516a enumC0516a5 = new EnumC0516a("COPY_PLAYLIST_LINK", 4, R.id.video_copy_link, R.drawable.vk_icon_chain_outline_28, R.string.copy_link);
                COPY_PLAYLIST_LINK = enumC0516a5;
                EnumC0516a enumC0516a6 = new EnumC0516a("SHARE", 5, R.id.share, R.drawable.vk_icon_share_outline_28, R.string.video_share);
                SHARE = enumC0516a6;
                EnumC0516a enumC0516a7 = new EnumC0516a("SHARE_PLAYLIST", 6, R.id.share, R.drawable.vk_icon_share_outline_28, R.string.video_share_playlist);
                SHARE_PLAYLIST = enumC0516a7;
                EnumC0516a enumC0516a8 = new EnumC0516a("UNSUBSCRIBE", 7, R.id.video_unsubscribe_playlist, R.drawable.vk_icon_minus_square_outline_28, R.string.video_album_unsubscribe);
                UNSUBSCRIBE = enumC0516a8;
                EnumC0516a enumC0516a9 = new EnumC0516a("SUBSCRIBE", 8, R.id.video_subscribe_playlist, R.drawable.vk_icon_done_outline_28, R.string.video_album_subscribe);
                SUBSCRIBE = enumC0516a9;
                EnumC0516a enumC0516a10 = new EnumC0516a("GO_TO_AUTHOR", 9, R.id.video_go_to_owner, R.drawable.vk_icon_profile_28, R.string.video_playlist_go_to_owner);
                GO_TO_AUTHOR = enumC0516a10;
                EnumC0516a[] enumC0516aArr = {enumC0516a, enumC0516a2, enumC0516a3, enumC0516a4, enumC0516a5, enumC0516a6, enumC0516a7, enumC0516a8, enumC0516a9, enumC0516a10};
                $VALUES = enumC0516aArr;
                $ENTRIES = new asp(enumC0516aArr);
            }

            public EnumC0516a(String str, int i, int i2, int i3, int i4) {
                this.id = i2;
                this.iconResId = i3;
                this.nameResId = i4;
            }

            public static EnumC0516a valueOf(String str) {
                return (EnumC0516a) Enum.valueOf(EnumC0516a.class, str);
            }

            public static EnumC0516a[] values() {
                return (EnumC0516a[]) $VALUES.clone();
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
        }

        public static void b(Context context, VideoAlbum videoAlbum) {
            w8s0 w8s0Var = g;
            if (w8s0Var != null) {
                w8s0Var.a(Action.Subscribe);
            }
            c cVar = f;
            if (cVar == null || cVar.h()) {
                o25.a().getClass();
                UserId userId = videoAlbum.c;
                int i2 = videoAlbum.b;
                UiTracker uiTracker = UiTracker.a;
                String d2 = UiTracker.d();
                String str = e;
                if (str == null) {
                    str = "";
                }
                m1 y0 = rsg0.y0(new a0u(userId, i2, d2, str, true, 32), null, null, 3);
                hij0 hij0Var = new hij0(context, videoAlbum);
                af0 af0Var = new af0(6);
                f = new l0(y0, new e05(new he3(4, context, videoAlbum), 7)).subscribe(new tra(af0Var, 0), new da(new g74(hij0Var, 1), 6));
            }
        }

        @Override // com.vk.catalog2.common.ui.mvp.video.VideoCatalogAlbumBottomSheet
        public final void a(Activity activity, VideoAlbum videoAlbum, b bVar, com.vk.video.ui.share.api.b bVar2, String str, w8s0 w8s0Var, be80 be80Var, boolean z) {
            List I;
            d = true;
            c = videoAlbum;
            e = str;
            j = bVar2;
            g = w8s0Var;
            h = bVar;
            i = be80Var;
            av20.a aVar = new av20.a();
            aVar.d(R.layout.bottom_menu_simple_item_view, LayoutInflater.from(activity));
            aVar.d = new com.vk.catalog2.common.ui.mvp.video.a(activity);
            aVar.e = new com.vk.catalog2.common.ui.mvp.video.b(activity);
            av20 b2 = aVar.b();
            if (z) {
                I = Collections.singletonList(EnumC0516a.COPY_LINK);
            } else if (xg5.a().d(videoAlbum.c)) {
                I = sua.p(videoAlbum) ? e43.l(EnumC0516a.PLAYLIST_ADD_VIDEO, EnumC0516a.EDIT_PLAYLIST, EnumC0516a.SHARE_PLAYLIST, EnumC0516a.COPY_PLAYLIST_LINK, EnumC0516a.REMOVE_PLAYLIST) : e43.l(EnumC0516a.EDIT_PLAYLIST, EnumC0516a.REMOVE_PLAYLIST, EnumC0516a.SHARE, EnumC0516a.COPY_LINK);
            } else {
                I = rl3.I(new EnumC0516a[]{EnumC0516a.GO_TO_AUTHOR, EnumC0516a.COPY_LINK, EnumC0516a.SHARE, videoAlbum.l ? EnumC0516a.UNSUBSCRIBE : EnumC0516a.SUBSCRIBE});
            }
            b2.setItems(I);
            b = ((dw20.b) dw20.a.k(new dw20.b(activity, null).Z(new t8s0()), b2, 4)).I0("video_catalog_album_options");
        }
    }

    /* compiled from: VideoCatalogAlbumBottomSheet.kt */
    public static final class b {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("VideoAlbumPlaylistMeta(avatarUrl="), this.a, ')');
        }
    }

    void a(Activity activity, VideoAlbum videoAlbum, b bVar, com.vk.video.ui.share.api.b bVar2, String str, w8s0 w8s0Var, be80 be80Var, boolean z);
}
