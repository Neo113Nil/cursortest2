package com.vk.clips.viewer.impl.grid;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.clips.entrypoints.di.ClipsEntryPointsComponent;
import com.vk.clips.entrypoints.params.ClipsEntryPointsParams;
import com.vk.clips.playlists.di.ClipsPlaylistsComponent;
import com.vk.clips.viewer.impl.grid.lists.ClipsGridTabData;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.view.components.tabs.VkTabs;
import com.vk.dto.common.id.UserId;
import com.vk.dto.masks.Mask;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.dto.shortvideo.ClipCameraParams;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.shortvideo.ClipsAuthor;
import com.vk.movika.sdk.base.logic.processor.actions.d;
import com.vk.movika.sdk.base.logic.processor.actions.f;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vkontakte.android.R;
import defpackage.q0;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.operators.single.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.a5p0;
import xsna.ahn;
import xsna.asu0;
import xsna.av20;
import xsna.bde;
import xsna.bpn0;
import xsna.c5g;
import xsna.cde;
import xsna.dz2;
import xsna.e3m;
import xsna.e43;
import xsna.e520;
import xsna.epx;
import xsna.fc1;
import xsna.ffj;
import xsna.fkq0;
import xsna.g620;
import xsna.gzs;
import xsna.h20;
import xsna.h7;
import xsna.hg;
import xsna.hxe;
import xsna.j5g;
import xsna.kp5;
import xsna.krv0;
import xsna.l14;
import xsna.lz2;
import xsna.msy;
import xsna.o25;
import xsna.pkd;
import xsna.qa;
import xsna.qoy;
import xsna.r1r0;
import xsna.rm0;
import xsna.rsg0;
import xsna.s1r0;
import xsna.snu0;
import xsna.tde;
import xsna.tlo0;
import xsna.tq;
import xsna.ux20;
import xsna.vx20;
import xsna.xk;
import xsna.yfb;
import xsna.z63;
import xsna.zq3;

/* compiled from: ClipsGridFragmentHelper.kt */
/* loaded from: classes17.dex */
public final class a {
    public final ClipsGridFragment a;
    public final Object b;
    public final Object c;
    public final bpn0 d;
    public final Object e = msy.a(LazyThreadSafetyMode.NONE, new zq3(8));

    /* compiled from: ClipsGridFragmentHelper.kt */
    /* renamed from: com.vk.clips.viewer.impl.grid.a$a, reason: collision with other inner class name */
    public static final class C0712a {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public C0712a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = z4;
            this.e = z5;
            this.f = z6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0712a)) {
                return false;
            }
            C0712a c0712a = (C0712a) obj;
            return this.a == c0712a.a && this.b == c0712a.b && this.c == c0712a.c && this.d == c0712a.d && this.e == c0712a.e && this.f == c0712a.f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f) + qoy.b(qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TabListSetting(darkTheme=");
            sb.append(this.a);
            sb.append(", ownerGrid=");
            sb.append(this.b);
            sb.append(", showDelayedPublications=");
            sb.append(this.c);
            sb.append(", showDrafts=");
            sb.append(this.d);
            sb.append(", showLikedClips=");
            sb.append(this.e);
            sb.append(", showFavorites=");
            return q0.a(sb, this.f, ')');
        }
    }

    /* compiled from: ClipsGridFragmentHelper.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsGridTabData.values().length];
            try {
                iArr[ClipsGridTabData.OwnerClips.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsGridTabData.CommonClips.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipsGridTabData.DelayedPublications.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ClipsGridTabData.Drafts.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ClipsGridTabData.Favorites.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ClipsGridTabData.LikedClips.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a(ClipsGridFragment clipsGridFragment, Lazy lazy, Lazy lazy2, bpn0 bpn0Var) {
        this.a = clipsGridFragment;
        this.b = lazy;
        this.c = lazy2;
        this.d = bpn0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        if (r10.e != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        if (r10.f != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        if (r10.d != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
    
        if (r10.c != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
    
        if (r0 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
    
        if (r0 != false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<Pair<ClipsGridTabData, gzs<FragmentImpl>>> a(C0712a c0712a) {
        Object h20Var;
        boolean z = c0712a.b;
        if (!o25.a().b() && z) {
            return EmptyList.b;
        }
        ClipsGridTabData[] values = ClipsGridTabData.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (ClipsGridTabData clipsGridTabData : values) {
            Pair pair = null;
            switch (b.$EnumSwitchMapping$0[clipsGridTabData.ordinal()]) {
                case 1:
                    h20Var = new h20(c0712a, 18);
                    break;
                case 2:
                    h20Var = new d(c0712a, 21);
                    break;
                case 3:
                    h20Var = new hg(c0712a, 22);
                    if (z) {
                        break;
                    }
                    h20Var = null;
                    if (h20Var != null) {
                        pair = new Pair(clipsGridTabData, h20Var);
                    }
                    arrayList.add(pair);
                case 4:
                    h20Var = new f(c0712a, 21);
                    if (z) {
                        break;
                    }
                    h20Var = null;
                    if (h20Var != null) {
                    }
                    arrayList.add(pair);
                    break;
                case 5:
                    h20Var = new xk(6, this, c0712a);
                    if (z) {
                        break;
                    }
                    h20Var = null;
                    if (h20Var != null) {
                    }
                    arrayList.add(pair);
                    break;
                case 6:
                    h20Var = new lz2(5);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return j5g.V(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x009b  */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ClipGridParams.Data data, ClipCameraParams clipCameraParams, String str, MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint, UserId userId) {
        Boolean bool;
        Mask mask;
        MusicTrack musicTrack;
        MusicTrack musicTrack2;
        int i;
        MusicTrack musicTrack3;
        UserId userId2;
        MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint2;
        ClipsGridFragment clipsGridFragment;
        StoryMusicInfo storyMusicInfo;
        ClipsAuthor clipsAuthor;
        int i2 = 0;
        if (clipCameraParams != null) {
            bool = Boolean.valueOf(clipCameraParams.d == null && clipCameraParams.c == null && clipCameraParams.b == null && clipCameraParams.e == 0);
        } else {
            bool = null;
        }
        if (clipCameraParams != null && !epx.f(bool, Boolean.TRUE)) {
            musicTrack3 = clipCameraParams.d;
            if (musicTrack3 != null) {
                i2 = clipCameraParams.e;
            } else {
                musicTrack3 = data instanceof ClipGridParams.Data.Music ? ((ClipGridParams.Data.Music) data).b : null;
            }
            mask = clipCameraParams.c;
            if (mask == null) {
                ClipGridParams.Data.CameraMask cameraMask = data instanceof ClipGridParams.Data.CameraMask ? (ClipGridParams.Data.CameraMask) data : null;
                mask = cameraMask != null ? cameraMask.b : null;
            }
            musicTrack = clipCameraParams.b;
        } else {
            if (!(data instanceof ClipGridParams.Data.Music)) {
                if (data instanceof ClipGridParams.Data.Hashtag) {
                    musicTrack = ((ClipGridParams.Data.Hashtag) data).b;
                    mask = null;
                    musicTrack2 = null;
                } else {
                    if (data instanceof ClipGridParams.Data.CameraMask) {
                        mask = ((ClipGridParams.Data.CameraMask) data).b;
                        musicTrack = null;
                    } else {
                        if (!(data instanceof ClipGridParams.Data.ClipCompilation) && !(data instanceof ClipGridParams.Data.Profile) && !(data instanceof ClipGridParams.Data.GeoPlace)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        mask = null;
                        musicTrack = null;
                    }
                    musicTrack2 = musicTrack;
                }
                i = 0;
                ClipGridParams.Data.Profile profile = !(data instanceof ClipGridParams.Data.Profile) ? (ClipGridParams.Data.Profile) data : null;
                userId2 = userId != null ? (profile != null || (clipsAuthor = profile.b) == null) ? null : clipsAuthor.b.b : userId;
                creationEntryPoint2 = MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.CLIPS_GRID_EFFECT;
                clipsGridFragment = this.a;
                if (creationEntryPoint != creationEntryPoint2 || mask != null) {
                    ?? r5 = musicTrack;
                    pkd f = g620.f();
                    FragmentActivity kn = clipsGridFragment.kn();
                    if (!o25.a().b()) {
                        mask = null;
                    }
                    f.i(kn, str, creationEntryPoint, mask, (r23 & 16) != 0 ? null : userId2, null, null, (r23 & 128) != 0 ? null : !o25.a().b() ? musicTrack2 : null, (r23 & 256) != 0 ? 0 : i, (r23 & 512) != 0 ? null : r5);
                }
                Context mo2getContext = clipsGridFragment.mo2getContext();
                if (mo2getContext == null) {
                    return;
                }
                if (musicTrack2 != null) {
                    String str2 = musicTrack2.i;
                    if (str2 == null) {
                        str2 = "";
                    }
                    storyMusicInfo = new StoryMusicInfo(musicTrack2, str2, i, musicTrack2.c0 + i, 0, null, false, i, false, false, null, false, false, 8032, null);
                } else {
                    storyMusicInfo = null;
                }
                ((ClipsEntryPointsComponent) this.d.getValue()).e().a(mo2getContext, new ClipsEntryPointsParams(creationEntryPoint, storyMusicInfo, musicTrack, false, false, null, false, null, 248, null));
                return;
            }
            musicTrack3 = ((ClipGridParams.Data.Music) data).b;
            mask = null;
            musicTrack = null;
        }
        i = i2;
        musicTrack2 = musicTrack3;
        if (!(data instanceof ClipGridParams.Data.Profile)) {
        }
        if (userId != null) {
        }
        creationEntryPoint2 = MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.CLIPS_GRID_EFFECT;
        clipsGridFragment = this.a;
        if (creationEntryPoint != creationEntryPoint2) {
        }
        ?? r52 = musicTrack;
        pkd f2 = g620.f();
        FragmentActivity kn2 = clipsGridFragment.kn();
        if (!o25.a().b()) {
        }
        f2.i(kn2, str, creationEntryPoint, mask, (r23 & 16) != 0 ? null : userId2, null, null, (r23 & 128) != 0 ? null : !o25.a().b() ? musicTrack2 : null, (r23 & 256) != 0 ? 0 : i, (r23 & 512) != 0 ? null : r52);
    }

    public final void c(VkTabs vkTabs, tde tdeVar) {
        FragmentActivity kn = this.a.kn();
        List<VkTabs.c> tabs = vkTabs.getTabs();
        ArrayList arrayList = new ArrayList(c5g.u(tabs, 10));
        Iterator<T> it = tabs.iterator();
        while (it.hasNext()) {
            arrayList.add(((VkTabs.c) it.next()).a);
        }
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            a5p0.a.a((com.vk.core.view.components.tabs.d) obj, kn.getString(tdeVar.k.get(i).i().i()));
            i = i2;
        }
    }

    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    public final s d(Context context, ClipGridParams.Data data, l14 l14Var) {
        x k;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        fc1 fc1Var = new fc1(2, l14Var, ref$ObjectRef);
        int f = e3m.f(R.attr.vk_ui_text_primary, context);
        int f2 = e3m.f(R.attr.vk_ui_text_primary, context);
        int f3 = e3m.f(R.attr.vk_ui_background_negative, context);
        av20.a aVar = new av20.a();
        aVar.d(R.layout.ds_internal_actions_popup_item, LayoutInflater.from(context));
        aVar.d = new ux20(f2, context, f3, f, null);
        aVar.e = new vx20(fc1Var);
        av20 b2 = aVar.b();
        if (data instanceof ClipGridParams.Data.Profile) {
            ClipsAuthor clipsAuthor = ((ClipGridParams.Data.Profile) data).b;
            if (fkq0.d(clipsAuthor.b.b)) {
                dz2 x = yfb.x(r1r0.a.b((s1r0) this.e.getValue(), Collections.singletonList(clipsAuthor.b.b), Collections.singletonList(UsersFieldsDto.BLACKLISTED_BY_ME), null, null, 58));
                ahn.D(x);
                k = rsg0.w0(x).l(new qa(new com.vk.movika.sdk.base.utils.b(12), 9));
                return new s(k.m(asu0.a.d()), new h7(new z63(b2, context, ref$ObjectRef, 2), 11));
            }
        }
        ArrayList arrayList = new ArrayList();
        if (data instanceof ClipGridParams.Data.Music) {
            ClipGridParams.Data.Music music = (ClipGridParams.Data.Music) data;
            MusicTrack musicTrack = music.b;
            if (musicTrack.K != null) {
                if (!o25.a().a(musicTrack.c) && music.i) {
                    arrayList.add(new e520(R.id.grid_more_menu_action_share, R.drawable.vk_icon_share_outline_28, R.string.share, 1, false, 0, 0, false, null, 0, null, false, 8176));
                }
            }
        }
        arrayList.add(new e520(R.id.grid_more_menu_action_report, R.drawable.vk_icon_report_outline_28, R.string.report_content, 0, false, 0, 0, false, null, 0, null, false, 8176));
        k = x.k(arrayList);
        return new s(k.m(asu0.a.d()), new h7(new z63(b2, context, ref$ObjectRef, 2), 11));
    }

    /* JADX WARN: Type inference failed for: r12v6, types: [T, com.vk.core.view.components.context.menu.VkContextMenu] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void e(View view, Rect rect, Context context, UserId userId, boolean z, boolean z2, gzs gzsVar, kp5 kp5Var) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ArrayList arrayList = new ArrayList();
        if (z2) {
            arrayList.add(hxe.a.C3026a.c);
        }
        if (fkq0.d(userId)) {
            arrayList.add(0, hxe.a.c.c);
        }
        if (((ClipsPlaylistsComponent) this.c.getValue()).b().e(userId) > 0) {
            arrayList.add(new hxe.a.d(userId));
        }
        if (z) {
            arrayList.add(hxe.a.e.c);
        }
        arrayList.add(new hxe.a.b(userId));
        int l = krv0.l(R.attr.vk_ui_icon_accent);
        view.getContext();
        e.c cVar = new e.c(null, rect, view, l, 1);
        cVar.e = context;
        cVar.i(Integer.valueOf(e3m.a(R.dimen.clips_profile_popup_max_width, context)));
        snu0 snu0Var = new snu0(new cde(new rm0(7, kp5Var, ref$ObjectRef)));
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hxe.a aVar = (hxe.a) it.next();
            arrayList2.add(new ffj.c(tq.h(tlo0.Companion, aVar.b), aVar, new ffj.c.a(aVar.a, Integer.valueOf(R.attr.colorAccent))));
        }
        snu0Var.setItems(arrayList2);
        cVar.l = snu0Var;
        ?? l2 = cVar.l(false);
        l2.e(new bde(0, gzsVar));
        ref$ObjectRef.element = l2;
    }
}
