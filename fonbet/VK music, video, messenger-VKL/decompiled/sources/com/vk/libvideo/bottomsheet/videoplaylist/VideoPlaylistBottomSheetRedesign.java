package com.vk.libvideo.bottomsheet.videoplaylist;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.f;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.vk.dto.video.VideoAlbum;
import com.vk.stat.scheme.SchemeStat$EventItem;
import xsna.asp;
import xsna.c8k;
import xsna.dq;
import xsna.epx;
import xsna.ez7;
import xsna.fh1;
import xsna.gzs;
import xsna.idh;
import xsna.izs;
import xsna.jai;
import xsna.kai;
import xsna.lye;
import xsna.rcg0;
import xsna.rrv0;
import xsna.s3q0;
import xsna.tzp0;
import xsna.zrp;

/* compiled from: VideoPlaylistBottomSheetRedesign.kt */
/* loaded from: classes2.dex */
public final class VideoPlaylistBottomSheetRedesign {
    public final a a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoPlaylistBottomSheetRedesign.kt */
    public static final class Action {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        public static final Action CopyLink;
        public static final Action Share;
        public static final Action ShowAuthor;

        static {
            Action action = new Action("ShowAuthor", 0);
            ShowAuthor = action;
            Action action2 = new Action("CopyLink", 1);
            CopyLink = action2;
            Action action3 = new Action("Share", 2);
            Share = action3;
            Action[] actionArr = {action, action2, action3};
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

    /* compiled from: VideoPlaylistBottomSheetRedesign.kt */
    public static final class a {
        public final VideoAlbum a;
        public final izs<Context, s3q0> b;
        public final izs<Action, s3q0> c;
        public final rcg0 d;
        public final com.vk.video.ui.share.api.b e;

        public /* synthetic */ a(VideoAlbum videoAlbum, izs izsVar, fh1 fh1Var, com.vk.video.ui.share.api.b bVar, int i) {
            this(videoAlbum, (izs<? super Context, s3q0>) izsVar, (i & 4) != 0 ? null : fh1Var, (rcg0) null, (i & 16) != 0 ? null : bVar);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            int c = dq.c(this.a.hashCode() * 31, 31, this.b);
            izs<Action, s3q0> izsVar = this.c;
            int hashCode = (c + (izsVar == null ? 0 : izsVar.hashCode())) * 31;
            rcg0 rcg0Var = this.d;
            int hashCode2 = (hashCode + (rcg0Var == null ? 0 : rcg0Var.hashCode())) * 31;
            com.vk.video.ui.share.api.b bVar = this.e;
            return hashCode2 + (bVar != null ? bVar.hashCode() : 0);
        }

        public final String toString() {
            return "VideoPlaylistBottomSheetParams(album=" + this.a + ", onUploadClicked=" + this.b + ", trackActionToAnalytics=" + this.c + ", restrictedUserActions=" + this.d + ", videoShareLinkModifier=" + this.e + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(VideoAlbum videoAlbum, izs<? super Context, s3q0> izsVar, izs<? super Action, s3q0> izsVar2, rcg0 rcg0Var, com.vk.video.ui.share.api.b bVar) {
            this.a = videoAlbum;
            this.b = izsVar;
            this.c = izsVar2;
            this.d = rcg0Var;
            this.e = bVar;
        }
    }

    /* compiled from: VideoPlaylistBottomSheetRedesign.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoPlaylistActionItem.values().length];
            try {
                iArr[VideoPlaylistActionItem.GO_TO_AUTHOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoPlaylistActionItem.SHARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoPlaylistActionItem.SHARE_PLAYLIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoPlaylistActionItem.COPY_LINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VideoPlaylistActionItem.COPY_PLAYLIST_LINK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VideoPlaylistActionItem.UPLOAD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VideoPlaylistActionItem.EDIT_PLAYLIST.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[VideoPlaylistActionItem.REMOVE_PLAYLIST.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[VideoPlaylistActionItem.ADD_VIDEO_BY_LINK.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VideoPlaylistBottomSheetRedesign(a aVar) {
        this.a = aVar;
    }

    public final void a(FragmentActivity fragmentActivity, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1345681937);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1345681937, i, -1, "com.vk.libvideo.bottomsheet.videoplaylist.VideoPlaylistBottomSheetRedesign.Content (VideoPlaylistBottomSheetRedesign.kt:72)");
        }
        b(6, M, kai.c(882156585, new ez7(gzsVar, this, fragmentActivity, 7), M));
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        f s = M.s();
        if (s != null) {
            s.d = new lye(i, 4, this, fragmentActivity, gzsVar);
        }
    }

    public final void b(int i, androidx.compose.runtime.a aVar, jai jaiVar) {
        int i2;
        jai jaiVar2;
        androidx.compose.runtime.a M = aVar.M(1372152285);
        if ((i & 6) == 0) {
            i2 = (M.y(jaiVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1372152285, i2, -1, "com.vk.libvideo.bottomsheet.videoplaylist.VideoPlaylistBottomSheetRedesign.VkThemeRedesign (VideoPlaylistBottomSheetRedesign.kt:94)");
            }
            M.K(-1709758316);
            jaiVar2 = jaiVar;
            rrv0.d(null, null, null, null, jaiVar2, M, (i2 << 12) & 57344, 15);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            jaiVar2 = jaiVar;
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new c8k(this, jaiVar2, i, 2);
        }
    }

    public final void c(Activity activity) {
        FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
        if (fragmentActivity == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) fragmentActivity.getWindow().getDecorView();
        ComposeView composeView = new ComposeView(fragmentActivity, null, 6);
        composeView.setContent(new jai(1858022329, new idh(composeView, this, fragmentActivity, viewGroup), true));
        viewGroup.addView(composeView);
        tzp0.a(new SchemeStat$EventItem(SchemeStat$EventItem.Type.ALBUM, Long.valueOf(r15.b), Long.valueOf(this.a.a.c.b), null, null, null, 56, null), 2).d();
    }
}
