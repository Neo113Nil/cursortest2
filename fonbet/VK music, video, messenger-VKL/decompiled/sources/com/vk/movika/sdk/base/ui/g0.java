package com.vk.movika.sdk.base.ui;

import android.graphics.Path;
import android.view.animation.PathInterpolator;
import com.google.gson.Gson;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.catalog2.common.ui.mvp.holder.container.FirstPinnedTabLayoutVh;
import com.vk.clips.favorites.impl.di.ClipsFavoritesComponentImpl;
import com.vk.clips.playlists.di.stub.ClipsPlaylistsComponentStub;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.ecomm.cart.api.di.CartComponent$Companion$STUB$1;
import com.vk.im.ui.components.msg_search.analytics.ImSearchAnalytics;
import com.vk.newsfeed.impl.presentation.newsfeed_geo.presentation.fragment.GeoPostsFragment;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipImportContactsAction;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.voip.OKVoipEngine;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.Regex;
import ru.ok.android.externcalls.sdk.ConversationFactory;
import xsna.b29;
import xsna.bbv0;
import xsna.bo;
import xsna.drm0;
import xsna.e4e;
import xsna.fxc0;
import xsna.g0p0;
import xsna.gzs;
import xsna.i1t0;
import xsna.iid0;
import xsna.ky2;
import xsna.mie;
import xsna.od5;
import xsna.qcy;
import xsna.s3q0;
import xsna.zqu;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ g0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        UsersFieldsDto usersFieldsDto;
        MobileOfficialAppsCallsStat$TypeVoipImportContactsAction.EventType eventType;
        switch (this.b) {
            case 0:
                return new com.vk.movika.sdk.base.asset.a();
            case 1:
                return new Gson();
            case 2:
                return s3q0.a;
            case 3:
                List c0 = drm0.c0(ky2.b, new String[]{StringUtils.COMMA}, 0, 6);
                ArrayList arrayList = new ArrayList();
                Iterator it = c0.iterator();
                while (it.hasNext()) {
                    try {
                        usersFieldsDto = UsersFieldsDto.valueOf((String) it.next());
                    } catch (Throwable unused) {
                        usersFieldsDto = null;
                    }
                    if (usersFieldsDto != null) {
                        arrayList.add(usersFieldsDto);
                    }
                }
                return arrayList;
            case 4:
                return s3q0.a;
            case 5:
                return s3q0.a;
            case 6:
                bbv0.g.getClass();
                bbv0.a.f().d.c();
                return s3q0.a;
            case 7:
                return s3q0.a;
            case 8:
                int i = b29.j1;
                OKVoipEngine.b.getClass();
                ConversationFactory conversationFactory = OKVoipEngine.x;
                if (conversationFactory != null) {
                    return conversationFactory.getAnalyticsSender();
                }
                return null;
            case 9:
                return s3q0.a;
            case 10:
                qcy<Object>[] qcyVarArr = CartComponent$Companion$STUB$1.f;
                return new g0p0();
            case 11:
                return s3q0.a;
            case 12:
                qcy<Object>[] qcyVarArr2 = ClipsFavoritesComponentImpl.l;
                return new e4e();
            case 13:
                qcy<Object>[] qcyVarArr3 = ClipsPlaylistsComponentStub.d;
                return new ClipsPlaylistsComponentStub.b();
            case 14:
                qcy<Object>[] qcyVarArr4 = ClipsViewerComponentImpl.o0;
                return new mie();
            case 15:
                return Boolean.valueOf(fxc0.B().J().b());
            case 16:
                return new zqu();
            case 17:
                return Boolean.valueOf(com.vk.toggle.d.F());
            case 18:
                return new i1t0(true, bo.h());
            case 19:
                return s3q0.a;
            case 20:
                return s3q0.a;
            case 21:
                SchemeStat$EventItem schemeStat$EventItem = FirstPinnedTabLayoutVh.F;
                return Boolean.valueOf(fxc0.B().J().t1());
            case 22:
                qcy<Object>[] qcyVarArr5 = GeoPostsFragment.q0;
                return new AtomicReference("FEED_PLACE");
            case 23:
                return "    completedMarkers:";
            case 24:
                Path path = new Path();
                path.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                path.lineTo(0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                path.cubicTo(0.39583334f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.47484508f, 0.20679761f, 0.59166664f, 0.41708294f);
                path.cubicTo(0.715161f, 0.6393796f, 0.81625f, 0.9745569f, 1.0f, 1.0f);
                return new PathInterpolator(path);
            case 25:
                return new Regex("((m\\.)?vk\\.(com|ru))|((vk|vkontakte)\\.(com|ru|me))");
            case 26:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 27:
                return new od5();
            case 28:
                return new StringBuilder();
            default:
                int i2 = ImSearchAnalytics.a.$EnumSwitchMapping$0[ImSearchAnalytics.SyncContactsResult.DECLINED.ordinal()];
                if (i2 == 1) {
                    eventType = MobileOfficialAppsCallsStat$TypeVoipImportContactsAction.EventType.ACCEPT_IMPORT_CONTACTS;
                } else if (i2 == 2) {
                    eventType = MobileOfficialAppsCallsStat$TypeVoipImportContactsAction.EventType.DECLINE_IMPORT_CONTACTS;
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    eventType = MobileOfficialAppsCallsStat$TypeVoipImportContactsAction.EventType.IMPORT_CONTACTS_SUCCESS;
                }
                new iid0(MobileOfficialAppsCoreNavStat$EventScreen.IM_SEARCH_CHATS, SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsCallsStat$TypeVoipImportContactsAction(eventType, MobileOfficialAppsCallsStat$TypeVoipImportContactsAction.Source.CALLS_SERVICES), 3)).q();
                return s3q0.a;
        }
    }
}
