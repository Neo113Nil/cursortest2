package com.vk.catalog2.common.ui.mvp.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.CatalogCustomAttributes$Values;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionAddVideos;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionCuratorSubscription;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionMarketEditAlbum;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayAudiosFromBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSwitchSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionTextButton;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionToggleAlbumSubscription;
import com.vk.catalog2.common.dto.ui.actions.UIBlockMusicUnfollowOwnerButton;
import com.vk.catalog2.common.dto.ui.actions.UIBlockPlayMixAction;
import com.vk.catalog2.common.dto.ui.actions.UIBlockUnfollowArtistButton;
import com.vk.catalog2.common.dto.ui.actions.UiBlockActionUploadVideoButton;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.mvp.holder.placeholder.VkPlaceholderVh;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicCurator;
import com.vk.clips.entrypoints.di.ClipsEntryPointsComponent;
import com.vk.clips.entrypoints.params.ClipsEntryPointsParams;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.cell.button.group.VkGroupItem;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.dto.common.actions.ActionOpenEditMarketAlbum;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Artist;
import com.vk.dto.music.Curator;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.video.VideoAlbum;
import com.vk.movika.sdk.base.logic.interactor.p;
import com.vk.movika.sdk.base.logic.processor.actions.d;
import com.vk.movika.sdk.base.logic.processor.h;
import com.vk.movika.sdk.base.model.b;
import com.vk.movika.sdk.base.model.e;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayCatalogSource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.t0;
import com.vk.toggle.Features;
import com.vk.toggle.features.MusicFeatures;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.c;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import xsna.ams;
import xsna.ava0;
import xsna.ay0;
import xsna.b60;
import xsna.ber;
import xsna.bpn0;
import xsna.c06;
import xsna.c60;
import xsna.db;
import xsna.e3m;
import xsna.epx;
import xsna.eu0;
import xsna.f750;
import xsna.fkq0;
import xsna.fxc0;
import xsna.g20;
import xsna.g7s0;
import xsna.gko;
import xsna.gzs;
import xsna.iah0;
import xsna.j20;
import xsna.ji3;
import xsna.lda;
import xsna.lqk0;
import xsna.lyd;
import xsna.mot0;
import xsna.msy;
import xsna.nda;
import xsna.nt;
import xsna.o25;
import xsna.oq;
import xsna.pf;
import xsna.pt;
import xsna.q4v0;
import xsna.q9h;
import xsna.sa;
import xsna.sf;
import xsna.sf1;
import xsna.sh6;
import xsna.snn0;
import xsna.tf;
import xsna.tlo0;
import xsna.u2b0;
import xsna.u4t0;
import xsna.w8i;
import xsna.wha;
import xsna.x7g;
import xsna.xha;
import xsna.xwk;
import xsna.y50;
import xsna.yha;
import xsna.yr8;
import xsna.zvr0;

/* compiled from: CatalogUniversalButtonsHandler.kt */
/* loaded from: classes16.dex */
public final class a implements w8i {
    public final lda b;
    public final u2b0 c;
    public final f750 d;
    public final SearchStatInfoProvider e;
    public final u4t0 f;
    public final bpn0 g;
    public final bpn0 h;
    public c i;
    public final Object j;
    public final Object k;

    /* compiled from: CatalogUniversalButtonsHandler.kt */
    /* renamed from: com.vk.catalog2.common.ui.mvp.util.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0515a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_ADD_FRIEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_IMPORT_CONTACTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_CREATE_GROUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_CREATE_PLAYLIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_CREATE_ALBUM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_OPEN_URL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_OPEN_URL_SLIDER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_SWITCH_SECTION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_PLAY_SHUFFLED_AUDIO_FROM_BLOCK.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_PLAY_AUDIO_FROM_BLOCK.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_UPLOAD_VIDEO.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_UPLOAD_CLIP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_UNFOLLOW_ARTIST.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_UNFOLLOW_CURATOR.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_TOGGLE_SUBSCRIPTION_CURATOR.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_TOGGLE_PLAYLIST_SUBSCRIPTION.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_UNFOLLOW_OWNER.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_OPEN_SECTION.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_LOGIN.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_START_LIVE_STREAM.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_MARKET_EDIT_ALBUM.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_ADD_VIDEOS.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_PLAY_MIX.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_OFFLINE_MUSIC_SUBSCRIPTION_BTN.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a(lda ldaVar, u2b0 u2b0Var, f750 f750Var, SearchStatInfoProvider searchStatInfoProvider) {
        u4t0 u4t0Var = new u4t0();
        this.b = ldaVar;
        this.c = u2b0Var;
        this.d = f750Var;
        this.e = searchStatInfoProvider;
        this.f = u4t0Var;
        this.g = new bpn0(new d(this, 8));
        this.h = new bpn0(new h(this, 9));
        b bVar = new b(this, 12);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.j = msy.a(lazyThreadSafetyMode, bVar);
        this.k = msy.a(lazyThreadSafetyMode, new e(this, 10));
    }

    public static VkButton.Mode b(UIBlockAction uIBlockAction) {
        Object obj = null;
        CatalogViewType catalogViewType = uIBlockAction != null ? uIBlockAction.d : null;
        int i = catalogViewType == null ? -1 : C0515a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
        if (i == 6) {
            Iterator<E> it = VkButton.Mode.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                String lowerCase = ((VkButton.Mode) next).name().toLowerCase(Locale.ROOT);
                UIBlockActionOpenUrl uIBlockActionOpenUrl = uIBlockAction instanceof UIBlockActionOpenUrl ? (UIBlockActionOpenUrl) uIBlockAction : null;
                if (lowerCase.equals(uIBlockActionOpenUrl != null ? uIBlockActionOpenUrl.B : null)) {
                    obj = next;
                    break;
                }
            }
            VkButton.Mode mode = (VkButton.Mode) obj;
            return mode == null ? VkButton.Mode.Primary : mode;
        }
        if (i == 24) {
            Iterator<E> it2 = VkButton.Mode.h().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                String lowerCase2 = ((VkButton.Mode) next2).name().toLowerCase(Locale.ROOT);
                UIBlockActionTextButton uIBlockActionTextButton = uIBlockAction instanceof UIBlockActionTextButton ? (UIBlockActionTextButton) uIBlockAction : null;
                if (lowerCase2.equals(uIBlockActionTextButton != null ? uIBlockActionTextButton.A : null)) {
                    obj = next2;
                    break;
                }
            }
            VkButton.Mode mode2 = (VkButton.Mode) obj;
            return mode2 == null ? VkButton.Mode.Primary : mode2;
        }
        if (i == 17) {
            return VkButton.Mode.Secondary;
        }
        if (i != 18) {
            return VkButton.Mode.Primary;
        }
        Iterator<E> it3 = VkButton.Mode.h().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next3 = it3.next();
            String lowerCase3 = ((VkButton.Mode) next3).name().toLowerCase(Locale.ROOT);
            UIBlockActionOpenSection uIBlockActionOpenSection = uIBlockAction instanceof UIBlockActionOpenSection ? (UIBlockActionOpenSection) uIBlockAction : null;
            if (lowerCase3.equals(uIBlockActionOpenSection != null ? uIBlockActionOpenSection.C : null)) {
                obj = next3;
                break;
            }
        }
        VkButton.Mode mode3 = (VkButton.Mode) obj;
        return mode3 == null ? VkButton.Mode.Primary : mode3;
    }

    public static String c(UIBlockAction uIBlockAction) {
        if (uIBlockAction instanceof UIBlockActionPlayAudiosFromBlock) {
            return ((UIBlockActionPlayAudiosFromBlock) uIBlockAction).A;
        }
        if (uIBlockAction instanceof UIBlockActionTextButton) {
            return ((UIBlockActionTextButton) uIBlockAction).z;
        }
        if (uIBlockAction instanceof UIBlockActionSwitchSection) {
            return ((UIBlockActionSwitchSection) uIBlockAction).z;
        }
        if (uIBlockAction instanceof UIBlockUnfollowArtistButton) {
            return ((UIBlockUnfollowArtistButton) uIBlockAction).A;
        }
        if (uIBlockAction instanceof UIBlockActionCuratorSubscription) {
            return ((UIBlockActionCuratorSubscription) uIBlockAction).B;
        }
        if (uIBlockAction instanceof UIBlockMusicUnfollowOwnerButton) {
            return ((UIBlockMusicUnfollowOwnerButton) uIBlockAction).A;
        }
        if (uIBlockAction instanceof UIBlockActionOpenSection) {
            return ((UIBlockActionOpenSection) uIBlockAction).z;
        }
        if (uIBlockAction instanceof UIBlockActionMarketEditAlbum) {
            return ((UIBlockActionMarketEditAlbum) uIBlockAction).z;
        }
        if (uIBlockAction instanceof UIBlockActionToggleAlbumSubscription) {
            return ((UIBlockActionToggleAlbumSubscription) uIBlockAction).z;
        }
        if (uIBlockAction instanceof UIBlockActionOpenUrl) {
            return ((UIBlockActionOpenUrl) uIBlockAction).z;
        }
        if (uIBlockAction instanceof UIBlockActionAddVideos) {
            return ((UIBlockActionAddVideos) uIBlockAction).z;
        }
        if (uIBlockAction instanceof UIBlockPlayMixAction) {
            return ((UIBlockPlayMixAction) uIBlockAction).C.a;
        }
        return null;
    }

    public static boolean d(UIBlockAction uIBlockAction) {
        CatalogViewType catalogViewType = uIBlockAction != null ? uIBlockAction.d : null;
        switch (catalogViewType == null ? -1 : C0515a.$EnumSwitchMapping$0[catalogViewType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 24:
                return true;
            case 7:
            case 23:
            default:
                return false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, kotlin.Lazy] */
    public static void e(a aVar, Context context, UIBlock uIBlock, UIBlockAction uIBlockAction, nda ndaVar, int i) {
        ActionOpenUrl actionOpenUrl;
        String str;
        String str2;
        Object obj;
        nda ndaVar2 = (i & 8) != 0 ? null : ndaVar;
        c06 c06Var = new c06();
        wha whaVar = new wha(0);
        lda ldaVar = aVar.b;
        u2b0 u2b0Var = aVar.c;
        f750 f750Var = aVar.d;
        String str3 = uIBlock.f;
        UserId userId = uIBlock.g;
        CatalogViewType catalogViewType = uIBlockAction != null ? uIBlockAction.d : null;
        int i2 = 12;
        int i3 = 9;
        switch (catalogViewType == null ? -1 : C0515a.$EnumSwitchMapping$0[catalogViewType.ordinal()]) {
            case 1:
                ams.a().a(context, false);
                break;
            case 2:
                ams.a().e(context);
                break;
            case 3:
                xwk.e().p(context);
                break;
            case 4:
                lyd.g().g().e(context, userId, MusicPlaybackLaunchContext.Fb(str3).t());
                break;
            case 5:
                g7s0 B = fxc0.B();
                fkq0.b(userId);
                int i4 = g7s0.G7;
                B.n(context, userId);
                break;
            case 6:
            case 7:
                UIBlockActionOpenUrl uIBlockActionOpenUrl = uIBlockAction instanceof UIBlockActionOpenUrl ? (UIBlockActionOpenUrl) uIBlockAction : null;
                if (uIBlockActionOpenUrl != null && (actionOpenUrl = uIBlockActionOpenUrl.A) != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("launch_origin", uIBlock.p.h());
                    String str4 = ((UIBlockActionOpenUrl) uIBlockAction).E;
                    xwk.d().e().e(context, actionOpenUrl, uIBlock.f, str4 != null ? aVar.e.b(SchemeStat$EventItem.Type.LINK, str4, false) : null, bundle);
                    break;
                }
                break;
            case 8:
                UIBlockActionSwitchSection uIBlockActionSwitchSection = uIBlockAction instanceof UIBlockActionSwitchSection ? (UIBlockActionSwitchSection) uIBlockAction : null;
                if (uIBlockActionSwitchSection != null && (str = uIBlockActionSwitchSection.c) != null) {
                    ldaVar.b(new snn0(str), true);
                    String str5 = ((UIBlockActionSwitchSection) uIBlockAction).A;
                    if (str5 != null) {
                        Features.Type type = Features.Type.FEATURE_VIDEO_CATALOG_NEW_FILTER_SWITCH;
                        type.getClass();
                        if (com.vk.toggle.b.A.a(type)) {
                            ldaVar.b(new ber(str5), false);
                            break;
                        }
                    }
                }
                break;
            case 9:
            case 10:
                UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock = uIBlockAction instanceof UIBlockActionPlayAudiosFromBlock ? (UIBlockActionPlayAudiosFromBlock) uIBlockAction : null;
                if (uIBlockActionPlayAudiosFromBlock != null && (str2 = uIBlockActionPlayAudiosFromBlock.z) != null) {
                    UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock2 = (UIBlockActionPlayAudiosFromBlock) uIBlockAction;
                    boolean z = uIBlockActionPlayAudiosFromBlock2.B;
                    StartPlayCatalogSource startPlayCatalogSource = new StartPlayCatalogSource(str2, uIBlockActionPlayAudiosFromBlock2.c, null, null, false, null, 60, null);
                    ShuffleMode shuffleMode = z ? ShuffleMode.SHUFFLE_ON : ShuffleMode.SHUFFLE_OFF;
                    MusicPlaybackLaunchContext Fb = MusicPlaybackLaunchContext.Fb(str3);
                    if (z) {
                        Fb = Fb.Ab();
                    }
                    u2b0Var.N0(new lqk0(startPlayCatalogSource, (MusicTrack) null, (List) null, Fb, 0, shuffleMode, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 822));
                    break;
                }
                break;
            case 11:
                UiBlockActionUploadVideoButton uiBlockActionUploadVideoButton = uIBlockAction instanceof UiBlockActionUploadVideoButton ? (UiBlockActionUploadVideoButton) uIBlockAction : null;
                Activity h = e3m.h(context);
                if (uiBlockActionUploadVideoButton != null && h != null) {
                    mot0.b(mot0.a.a, h, uiBlockActionUploadVideoButton.g, uiBlockActionUploadVideoButton.B, null, 24);
                    break;
                }
                break;
            case 12:
                UiBlockActionUploadVideoButton uiBlockActionUploadVideoButton2 = uIBlockAction instanceof UiBlockActionUploadVideoButton ? (UiBlockActionUploadVideoButton) uIBlockAction : null;
                Activity h2 = e3m.h(context);
                if (uiBlockActionUploadVideoButton2 != null && h2 != null) {
                    ((ClipsEntryPointsComponent) aVar.k.getValue()).e().a(context, new ClipsEntryPointsParams(MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.COMMUNITY, null, null, false, false, null, true, null, 190, null));
                    break;
                }
                break;
            case 13:
                UIBlockUnfollowArtistButton uIBlockUnfollowArtistButton = uIBlockAction instanceof UIBlockUnfollowArtistButton ? (UIBlockUnfollowArtistButton) uIBlockAction : null;
                if (uIBlockUnfollowArtistButton != null) {
                    f750Var.b(new Artist(uIBlockUnfollowArtistButton.z, null, null, null, null, false, false, false, null, false, null, 0, null, 8190, null), str3).subscribe(new yha(new nt(i2), 0), new eu0(new db(16), 8));
                    break;
                }
                break;
            case 14:
                UIBlockActionCuratorSubscription uIBlockActionCuratorSubscription = uIBlockAction instanceof UIBlockActionCuratorSubscription ? (UIBlockActionCuratorSubscription) uIBlockAction : null;
                if (uIBlockActionCuratorSubscription != null) {
                    f750Var.f(new Curator(uIBlockActionCuratorSubscription.z, null, null, null, null, false, false, null, 254, null)).subscribe(new xha(new pt(14), 0), new sh6(new pf(8), 2));
                    break;
                }
                break;
            case 15:
                UIBlockMusicCurator uIBlockMusicCurator = uIBlock instanceof UIBlockMusicCurator ? (UIBlockMusicCurator) uIBlock : null;
                if (uIBlockMusicCurator != null) {
                    Curator curator = uIBlockMusicCurator.z;
                    if (aVar.i == null) {
                        if (!curator.g) {
                            if (curator.h) {
                                int i5 = 8;
                                aVar.i = f750Var.c(curator).subscribe(new ji3(new g20(aVar, c06Var), i5), new y50(new sa(17, aVar, whaVar), i5));
                                break;
                            }
                        } else {
                            aVar.i = f750Var.f(curator).subscribe(new sf(new p(aVar, c06Var), i2), new tf(new ay0(aVar, whaVar), i3));
                            break;
                        }
                    }
                }
                break;
            case 16:
                VideoAlbum videoAlbum = ((UIBlockActionToggleAlbumSubscription) uIBlockAction).A;
                if (videoAlbum != null) {
                    aVar.f.c(videoAlbum);
                    break;
                }
                break;
            case 17:
                UIBlockMusicUnfollowOwnerButton uIBlockMusicUnfollowOwnerButton = uIBlockAction instanceof UIBlockMusicUnfollowOwnerButton ? (UIBlockMusicUnfollowOwnerButton) uIBlockAction : null;
                if (uIBlockMusicUnfollowOwnerButton != null && aVar.i == null) {
                    aVar.i = f750Var.e(uIBlockMusicUnfollowOwnerButton.g).subscribe(new b60(new j20(aVar, ndaVar2, c06Var), i3), new c60(new sf1(aVar, whaVar), 7));
                    break;
                }
                break;
            case 18:
                ldaVar.b(new snn0(((UIBlockActionOpenSection) uIBlockAction).B), true);
                break;
            case 19:
                o25.a().getClass();
                break;
            case 20:
                Activity h3 = e3m.h(context);
                if (h3 != null) {
                    ((zvr0) aVar.j.getValue()).getClass();
                    fxc0.B().a0(h3, userId, null, null, "catalog_add", t0.a(MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_CATALOG));
                    break;
                }
                break;
            case 21:
                ActionOpenEditMarketAlbum actionOpenEditMarketAlbum = ((UIBlockActionMarketEditAlbum) uIBlockAction).A;
                if (actionOpenEditMarketAlbum != null) {
                    ((q9h) aVar.g.getValue()).a(actionOpenEditMarketAlbum.d, context, actionOpenEditMarketAlbum.c);
                    break;
                }
                break;
            case 22:
                UIBlockPlaceholder uIBlockPlaceholder = uIBlock instanceof UIBlockPlaceholder ? (UIBlockPlaceholder) uIBlock : null;
                if (uIBlockPlaceholder != null) {
                    Iterator<T> it = uIBlockPlaceholder.G.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((UIBlockAction) obj) instanceof UIBlockActionAddVideos) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    UIBlockAction uIBlockAction2 = (UIBlockAction) obj;
                    UIBlockActionAddVideos uIBlockActionAddVideos = uIBlockAction2 instanceof UIBlockActionAddVideos ? (UIBlockActionAddVideos) uIBlockAction2 : null;
                    if (uIBlockActionAddVideos != null && uIBlockActionAddVideos.A != null) {
                        fxc0.B().getClass();
                        break;
                    }
                }
                break;
            case 23:
                new ava0(u2b0Var, (q4v0) aVar.h.getValue(), null).a((UIBlockPlayMixAction) uIBlockAction);
                break;
        }
    }

    public static VkPlaceholder.a.C0857a g(a aVar, UIBlockAction uIBlockAction, VkButton.Mode mode, VkButton.Appearance appearance, boolean z, VkPlaceholderVh.c cVar, gzs gzsVar, int i) {
        VkButton.Mode mode2;
        VkPlaceholder.a.C0857a.C0858a c0858a;
        VkPlaceholder.a.C0857a.C0858a c0858a2;
        VkPlaceholder.a.C0857a.C0858a c0858a3;
        boolean z2 = false;
        boolean z3 = (i & 8) != 0 ? false : z;
        VkPlaceholderVh.c cVar2 = (i & 16) != 0 ? null : cVar;
        aVar.getClass();
        if (uIBlockAction.d == CatalogViewType.SYNTHETIC_ACTION_CLOSE_BANNER) {
            return null;
        }
        tlo0.a aVar2 = tlo0.Companion;
        String c = c(uIBlockAction);
        if (c == null) {
            c = "";
        }
        tlo0 d = oq.d(aVar2, c);
        if (mode == null && (mode = b(uIBlockAction)) == null) {
            mode = VkButton.Mode.Primary;
        }
        if (uIBlockAction instanceof UIBlockActionOpenUrl) {
            UIBlockActionOpenUrl uIBlockActionOpenUrl = (UIBlockActionOpenUrl) uIBlockAction;
            String str = uIBlockActionOpenUrl.C;
            d = new tlo0.h(uIBlockActionOpenUrl.z);
            if (CatalogCustomAttributes$Values.OUTLINE_WITH_CHEVRON.i(uIBlockActionOpenUrl.B)) {
                if (!epx.f(str, "recoms_onboarding_heart") || !MusicFeatures.ONBOARDING_MUSIC.h()) {
                    c0858a2 = new VkPlaceholder.a.C0857a.C0858a(new gko(R.drawable.vk_icon_chevron_16), null, new x7g(R.attr.vk_ui_icon_accent_themed));
                    mode2 = mode;
                    c0858a = null;
                    return new VkPlaceholder.a.C0857a(d, gzsVar, c0858a, c0858a2, (VkButton.Size) null, mode2, appearance, z3, 48);
                }
                c0858a3 = new VkPlaceholder.a.C0857a.C0858a(new gko(R.drawable.vk_icon_heart_settings_outline_20), null, new x7g(R.attr.vk_ui_icon_accent_themed));
            } else if (str != null && str.equals("switch_24")) {
                c0858a3 = new VkPlaceholder.a.C0857a.C0858a(new gko(R.drawable.vk_icon_switch_24), null, new x7g(R.attr.vk_ui_icon_accent_themed));
            }
            c0858a = c0858a3;
            mode2 = mode;
            c0858a2 = null;
            return new VkPlaceholder.a.C0857a(d, gzsVar, c0858a, c0858a2, (VkButton.Size) null, mode2, appearance, z3, 48);
        }
        if ((uIBlockAction instanceof UIBlockActionToggleAlbumSubscription) && cVar2 != null) {
            u4t0 u4t0Var = aVar.f;
            u4t0Var.k = uIBlockAction.f;
            u4t0Var.e = cVar2;
            VideoAlbum videoAlbum = ((UIBlockActionToggleAlbumSubscription) uIBlockAction).A;
            if (videoAlbum != null && videoAlbum.l) {
                z2 = true;
            }
            Pair pair = new Pair(Integer.valueOf(z2 ? R.string.video_catalog_subscribed : R.string.video_catalog_subscribe), z2 ? VkButton.Mode.Secondary : VkButton.Mode.Primary);
            int intValue = ((Number) pair.d()).intValue();
            mode = (VkButton.Mode) pair.g();
            d = new tlo0.f(intValue);
        }
        mode2 = mode;
        c0858a = null;
        c0858a2 = null;
        return new VkPlaceholder.a.C0857a(d, gzsVar, c0858a, c0858a2, (VkButton.Size) null, mode2, appearance, z3, 48);
    }

    public final void a(View view, UIBlockAction uIBlockAction) {
        yr8 yr8Var = new yr8(view);
        if ((uIBlockAction != null ? uIBlockAction.d : null) == CatalogViewType.SYNTHETIC_ACTION_CLOSE_BANNER) {
            view.setVisibility(8);
            return;
        }
        if (uIBlockAction != null) {
            String c = c(uIBlockAction);
            String str = c == null ? "" : c;
            if (view instanceof TextView) {
                ((TextView) view).setText(str);
            }
            if (view instanceof VkGroupItem) {
                ((VkGroupItem) view).setText(str);
            }
            view.setVisibility(c != null ? 0 : 8);
        }
        if (!(uIBlockAction instanceof UIBlockActionOpenUrl)) {
            if (uIBlockAction instanceof UIBlockActionToggleAlbumSubscription) {
                UIBlockActionToggleAlbumSubscription uIBlockActionToggleAlbumSubscription = (UIBlockActionToggleAlbumSubscription) uIBlockAction;
                String str2 = uIBlockActionToggleAlbumSubscription.f;
                u4t0 u4t0Var = this.f;
                u4t0Var.k = str2;
                u4t0Var.b = view instanceof TextView ? (TextView) view : null;
                VideoAlbum videoAlbum = uIBlockActionToggleAlbumSubscription.A;
                u4t0Var.g(videoAlbum != null && videoAlbum.l);
                view.setVisibility(0);
                return;
            }
            return;
        }
        UIBlockActionOpenUrl uIBlockActionOpenUrl = (UIBlockActionOpenUrl) uIBlockAction;
        if (CatalogCustomAttributes$Values.OUTLINE_WITH_CHEVRON.i(uIBlockActionOpenUrl.B)) {
            if (epx.f(uIBlockActionOpenUrl.C, "recoms_onboarding_heart") && com.vk.toggle.b.A.a(MusicFeatures.ONBOARDING_MUSIC)) {
                yr8Var.a(R.drawable.vk_icon_heart_settings_outline_20, true);
                return;
            } else {
                yr8Var.a(R.drawable.vk_icon_chevron_16, false);
                return;
            }
        }
        String str3 = uIBlockActionOpenUrl.C;
        if (str3 == null || !str3.equals("switch_24")) {
            if (view instanceof TextView) {
                ((TextView) view).setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        } else {
            yr8Var.a(R.drawable.vk_icon_switch_24, true);
            int a = iah0.a(8);
            if (view instanceof TextView) {
                ((TextView) view).setCompoundDrawablePadding(a);
            }
        }
    }

    public final void f() {
        this.f.a();
        c cVar = this.i;
        if (cVar != null) {
            cVar.dispose();
        }
        this.i = null;
    }
}
