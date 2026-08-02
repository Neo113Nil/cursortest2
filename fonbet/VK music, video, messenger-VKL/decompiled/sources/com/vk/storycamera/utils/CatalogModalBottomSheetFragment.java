package com.vk.storycamera.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.ui.mvp.holder.stories.MusicClipsSelectorCatalogRootVh;
import com.vk.catalog2.common.ui.mvp.holder.stories.MusicSelectorCatalogRootVh;
import com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetBehavior;
import com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetFragment;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.music.AudioFromMusicCatalogInfo;
import com.vk.dto.music.MusicTrack;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import xsna.asp;
import xsna.bh6;
import xsna.bpn0;
import xsna.bwt0;
import xsna.e3m;
import xsna.i0q0;
import xsna.im0;
import xsna.izs;
import xsna.k840;
import xsna.kn4;
import xsna.ktr;
import xsna.l9a;
import xsna.m7m;
import xsna.m9a;
import xsna.n9a;
import xsna.ngj0;
import xsna.nle;
import xsna.pgn;
import xsna.ppk;
import xsna.qcy;
import xsna.r44;
import xsna.ra;
import xsna.rsg0;
import xsna.s3q0;
import xsna.sf;
import xsna.tf;
import xsna.tyd;
import xsna.yfb;
import xsna.yia;
import xsna.zrp;

/* compiled from: CatalogModalBottomSheetFragment.kt */
/* loaded from: classes6.dex */
public final class CatalogModalBottomSheetFragment extends CustomisableBottomSheetFragment<n9a> {
    public static final /* synthetic */ int X = 0;
    public final bpn0 T = new bpn0(new im0(this, 13));
    public final bpn0 U = new bpn0(new ra(this, 15));
    public final c V = new c();
    public final d W = new d();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogModalBottomSheetFragment.kt */
    public static final class Content {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Content[] $VALUES;
        public static final Content CLIPS;
        public static final a Companion;
        public static final Content STORY;
        private final String value;

        /* compiled from: CatalogModalBottomSheetFragment.kt */
        public static final class a {
        }

        static {
            Content content = new Content("STORY", 0, "story");
            STORY = content;
            Content content2 = new Content("CLIPS", 1, "clips");
            CLIPS = content2;
            Content[] contentArr = {content, content2};
            $VALUES = contentArr;
            $ENTRIES = new asp(contentArr);
            Companion = new a();
        }

        public Content(String str, int i, String str2) {
            this.value = str2;
        }

        public static Content valueOf(String str) {
            return (Content) Enum.valueOf(Content.class, str);
        }

        public static Content[] values() {
            return (Content[]) $VALUES.clone();
        }

        public final String h() {
            return this.value;
        }
    }

    /* compiled from: CatalogModalBottomSheetFragment.kt */
    public static final class a {
        public static void a(Context context, Content content, tyd tydVar, int i) {
            int i2 = CatalogModalBottomSheetFragment.X;
            if ((i & 8) != 0) {
                tydVar = null;
            }
            Activity h = context != null ? e3m.h(bwt0.u(context)) : null;
            AppCompatActivity appCompatActivity = h instanceof AppCompatActivity ? (AppCompatActivity) h : null;
            if (appCompatActivity == null) {
                return;
            }
            int i3 = CustomisableBottomSheetFragment.S;
            CatalogModalBottomSheetFragment catalogModalBottomSheetFragment = new CatalogModalBottomSheetFragment();
            Bundle bundle = new Bundle();
            bundle.putString("content_type_arg", content.h());
            catalogModalBottomSheetFragment.setArguments(bundle);
            catalogModalBottomSheetFragment.N = null;
            catalogModalBottomSheetFragment.O = tydVar;
            s3q0 s3q0Var = s3q0.a;
            CustomisableBottomSheetFragment.b.a(appCompatActivity, catalogModalBottomSheetFragment, null);
        }
    }

    /* compiled from: CatalogModalBottomSheetFragment.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Content.values().length];
            try {
                iArr[Content.CLIPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Content.STORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: CatalogModalBottomSheetFragment.kt */
    public static final class c implements MusicSelectorCatalogRootVh.a {
        public c() {
        }

        @Override // com.vk.catalog2.common.ui.mvp.holder.stories.MusicSelectorCatalogRootVh.a
        public final void a(boolean z) {
            CatalogModalBottomSheetFragment.this.fo().d = !z;
        }

        @Override // com.vk.catalog2.common.ui.mvp.holder.stories.MusicSelectorCatalogRootVh.a
        public final void b(MusicTrack musicTrack, AudioFromMusicCatalogInfo audioFromMusicCatalogInfo) {
            CatalogModalBottomSheetFragment catalogModalBottomSheetFragment = CatalogModalBottomSheetFragment.this;
            catalogModalBottomSheetFragment.fo().p = true;
            bh6.m.onNext(new n9a.b(musicTrack, audioFromMusicCatalogInfo));
            catalogModalBottomSheetFragment.dismiss();
        }

        @Override // com.vk.catalog2.common.ui.mvp.holder.stories.MusicSelectorCatalogRootVh.a
        public final void c() {
            CatalogModalBottomSheetFragment.this.fo().p = true;
            bh6.m.onNext(n9a.a.a);
        }

        @Override // com.vk.catalog2.common.ui.mvp.holder.stories.MusicSelectorCatalogRootVh.a
        public final void d() {
            FrameLayout frameLayout;
            CustomisableBottomSheetBehavior<FrameLayout> customisableBottomSheetBehavior;
            CatalogModalBottomSheetFragment catalogModalBottomSheetFragment = CatalogModalBottomSheetFragment.this;
            CustomisableBottomSheetBehavior<FrameLayout> customisableBottomSheetBehavior2 = catalogModalBottomSheetFragment.P;
            if (customisableBottomSheetBehavior2 != null) {
                customisableBottomSheetBehavior2.J(3);
            }
            Dialog dialog = catalogModalBottomSheetFragment.s;
            ppk ppkVar = dialog instanceof ppk ? (ppk) dialog : null;
            if (ppkVar == null || (frameLayout = ppkVar.j) == null || (customisableBottomSheetBehavior = ppkVar.h) == null) {
                return;
            }
            customisableBottomSheetBehavior.G(frameLayout);
        }

        @Override // com.vk.catalog2.common.ui.mvp.holder.stories.MusicSelectorCatalogRootVh.a
        public final void e(MusicTrack musicTrack, izs<? super Boolean, s3q0> izsVar) {
            io.reactivex.rxjava3.disposables.c subscribe;
            n9a fo = CatalogModalBottomSheetFragment.this.fo();
            kn4 kn4Var = fo.o;
            if (!musicTrack.L) {
                izsVar.invoke(Boolean.FALSE);
                return;
            }
            if (musicTrack.M) {
                List singletonList = Collections.singletonList(musicTrack.Fb());
                kn4Var.getClass();
                subscribe = ktr.d(rsg0.w0(yfb.x(new ngj0().u(singletonList)))).subscribe(new tf(new m9a(izsVar, 0), 7));
            } else {
                List singletonList2 = Collections.singletonList(musicTrack.Fb());
                kn4Var.getClass();
                subscribe = ktr.d(rsg0.w0(yfb.x(new ngj0().e(singletonList2)))).subscribe(new sf(new l9a(izsVar, 0), 11));
            }
            pgn pgnVar = fo.t;
            qcy<Object> qcyVar = n9a.x[0];
            pgnVar.b(subscribe);
        }

        @Override // com.vk.catalog2.common.ui.mvp.holder.stories.MusicSelectorCatalogRootVh.a
        public final void f(MusicTrack musicTrack) {
            n9a fo = CatalogModalBottomSheetFragment.this.fo();
            boolean z = true;
            if (!musicTrack.equals(fo.r)) {
                fo.r = musicTrack;
            } else if (fo.q) {
                z = false;
            }
            fo.q = z;
            bh6.m.onNext(new n9a.c(z));
        }
    }

    /* compiled from: CatalogModalBottomSheetFragment.kt */
    public static final class d implements yia.a {
        public d() {
        }

        @Override // xsna.yia.a
        public final void a() {
            CatalogModalBottomSheetFragment catalogModalBottomSheetFragment = CatalogModalBottomSheetFragment.this;
            CustomisableBottomSheetBehavior<FrameLayout> customisableBottomSheetBehavior = catalogModalBottomSheetFragment.P;
            if (customisableBottomSheetBehavior != null) {
                customisableBottomSheetBehavior.J(3);
            }
            i0q0.d(1000L, new r44(catalogModalBottomSheetFragment, 6));
        }

        @Override // xsna.yia.a
        public final boolean a0() {
            CatalogModalBottomSheetFragment.this.dismiss();
            return true;
        }
    }

    @Override // com.vk.core.dialogs.bottomsheet.modern.impl.CustomisableBottomSheetFragment
    public final n9a eo() {
        MusicClipsSelectorCatalogRootVh musicClipsSelectorCatalogRootVh;
        Content content = (Content) this.T.getValue();
        FragmentActivity kn = kn();
        com.vk.music.notifications.restriction.a aVar = k840.a.d;
        if (aVar == null) {
            aVar = null;
        }
        com.vk.music.notifications.restriction.a aVar2 = aVar;
        int i = b.$EnumSwitchMapping$0[content.ordinal()];
        bpn0 bpn0Var = this.U;
        d dVar = this.W;
        if (i == 2) {
            yia yiaVar = new yia(kn, dVar);
            nle nleVar = (nle) bpn0Var.getValue();
            Bundle bundle = new Bundle();
            bundle.putBoolean("use_for_stories", true);
            musicClipsSelectorCatalogRootVh = new MusicClipsSelectorCatalogRootVh(kn, yiaVar, bundle, aVar2, this.V, nleVar, m7m.d(this));
        } else {
            yia yiaVar2 = new yia(kn, dVar);
            nle nleVar2 = (nle) bpn0Var.getValue();
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("need_clips_audio_from_video", content == Content.CLIPS);
            musicClipsSelectorCatalogRootVh = new MusicClipsSelectorCatalogRootVh(kn, yiaVar2, bundle2, aVar2, this.V, nleVar2, m7m.d(this));
        }
        n9a n9aVar = new n9a(musicClipsSelectorCatalogRootVh, new kn4());
        n9aVar.b = R.style.StoryViewActivityThemeDark;
        return n9aVar;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = b.$EnumSwitchMapping$0[((Content) this.T.getValue()).ordinal()] == 1 ? MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_AUDIO_PICKER : MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_MUSIC;
    }
}
