package com.vk.movika.sdk.base.observable;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.util.SparseArray;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.audio.dto.AudioAudioDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.channels.api.Channel;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorsException;
import com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState;
import com.vk.clips.sdk.models.ImageUrl;
import com.vk.clips.sdk.models.SdkArtist;
import com.vk.clips.sdk.models.SdkImages;
import com.vk.clips.sdk.models.SdkMusicTrack;
import com.vk.clips.viewer.impl.adapters.ClipVideoFileAdapter;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Artist;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Thumb;
import com.vk.dzenarticle.impl.ui.entity.DzenArticleState;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.log.L;
import com.vk.profile.community.details.impl.name_history.e;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import xsna.ao8;
import xsna.asu0;
import xsna.b8g;
import xsna.brm0;
import xsna.drm0;
import xsna.e3m;
import xsna.gte;
import xsna.hda;
import xsna.hte;
import xsna.ikv0;
import xsna.it80;
import xsna.izs;
import xsna.j5g;
import xsna.k60;
import xsna.kpp;
import xsna.lu4;
import xsna.mcr0;
import xsna.ms9;
import xsna.nwa0;
import xsna.on00;
import xsna.opp;
import xsna.pno0;
import xsna.pqc;
import xsna.qcy;
import xsna.qgi0;
import xsna.s3q0;
import xsna.tgi0;
import xsna.tj50;
import xsna.tlo0;
import xsna.tq;
import xsna.w5w0;
import xsna.x4;
import xsna.zqc;
import xsna.zze;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ i(int i) {
        this.b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x021f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0235 A[SYNTHETIC] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        io.reactivex.rxjava3.core.x<byte[]> a;
        String str;
        SdkImages sdkImages;
        ArrayList arrayList;
        ArrayList arrayList2;
        SdkArtist sdkArtist;
        SdkArtist sdkArtist2;
        tlo0.a aVar;
        int i;
        Object failure;
        switch (this.b) {
            case 0:
                ((com.vk.movika.sdk.base.listener.f) obj).k();
                return s3q0.a;
            case 1:
                return s3q0.a;
            case 2:
                w5w0 w5w0Var = (w5w0) ((it80) obj).a;
                return (w5w0Var == null || (a = w5w0Var.a()) == null) ? io.reactivex.rxjava3.core.x.i(new RuntimeException("no svg data")) : a;
            case 3:
                L.l(ms9.b("loading attach config error: ", (Throwable) obj));
                return s3q0.a;
            case 4:
                return lu4.a.b.a;
            case 5:
                ((ikv0) obj).a();
                return s3q0.a;
            case 6:
                return mcr0.h((Uri) obj).r0(asu0.a.c()).K();
            case 7:
                int i2 = ChannelFragment.a1;
                return Boolean.valueOf(((Channel) obj).N);
            case 8:
                return new pqc.a.b((hda) obj);
            case 9:
                L.i((Throwable) obj);
                return s3q0.a;
            case 10:
                MusicTrack musicTrack = (MusicTrack) obj;
                qcy<Object>[] qcyVarArr = ClipVideoFileAdapter.B;
                if (musicTrack == null) {
                    return null;
                }
                String str2 = musicTrack.d;
                if (str2 == null) {
                    str2 = "";
                    str = str2;
                } else {
                    str = "";
                }
                UserId userId = musicTrack.c;
                Thumb Jb = musicTrack.Jb();
                if (Jb != null) {
                    ArrayList arrayList3 = new ArrayList();
                    SparseArray<Uri> sparseArray = Jb.e;
                    int size = sparseArray.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        arrayList3.add(new ImageUrl(sparseArray.valueAt(i3).toString(), sparseArray.keyAt(i3), false, 4, null));
                    }
                    sdkImages = new SdkImages(arrayList3, null, 2, null);
                } else {
                    sdkImages = null;
                }
                List<Artist> list = musicTrack.t;
                if (list != null) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        String str3 = ((Artist) it.next()).c;
                        if (str3 != null) {
                            if (drm0.N(str3)) {
                                str3 = null;
                            }
                            if (str3 != null) {
                                sdkArtist2 = new SdkArtist(str3);
                                if (sdkArtist2 == null) {
                                    arrayList4.add(sdkArtist2);
                                }
                            }
                        }
                        sdkArtist2 = null;
                        if (sdkArtist2 == null) {
                        }
                    }
                    arrayList = arrayList4;
                } else {
                    arrayList = null;
                }
                List<Artist> list2 = musicTrack.u;
                if (list2 != null) {
                    ArrayList arrayList5 = new ArrayList();
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        String str4 = ((Artist) it2.next()).c;
                        if (str4 != null) {
                            if (drm0.N(str4)) {
                                str4 = null;
                            }
                            if (str4 != null) {
                                sdkArtist = new SdkArtist(str4);
                                if (sdkArtist == null) {
                                    arrayList5.add(sdkArtist);
                                }
                            }
                        }
                        sdkArtist = null;
                        if (sdkArtist == null) {
                        }
                    }
                    arrayList2 = arrayList5;
                } else {
                    arrayList2 = null;
                }
                String str5 = musicTrack.h;
                return new SdkMusicTrack(str2, userId, sdkImages, arrayList, arrayList2, str5 == null ? str : str5, musicTrack.e, musicTrack.K, musicTrack.q, musicTrack.X, musicTrack);
            case 11:
                ClipsCoauthorsException clipsCoauthorsException = ((ClipsCoauthorsSelectorMviState.a) obj).f;
                if (clipsCoauthorsException instanceof ClipsCoauthorsException.CoauthorsEmptyResponseException) {
                    aVar = tlo0.Companion;
                    i = R.string.clips_coauthors_selection_empty_response_text;
                } else {
                    if (!(clipsCoauthorsException instanceof ClipsCoauthorsException.CoauthorsNetworkException)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar = tlo0.Companion;
                    i = R.string.clips_coauthors_selection_network_error_text;
                }
                return tq.h(aVar, i);
            case 12:
                L.l("ClipsCurrentAuthorPresenter");
                return s3q0.a;
            case 13:
                List<AudioAudioDto> B = ((CatalogCatalogResponseObjectDto) obj).B();
                return io.reactivex.rxjava3.core.q.O(B != null ? j5g.W0(B) : null);
            case 14:
                return hte.a(((gte.a) obj).d);
            case 15:
                zze.a aVar2 = (zze.a) obj;
                long j = aVar2.c;
                long j2 = aVar2.e;
                return new nwa0(j, j2 == 0 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : j / j2, aVar2.i);
            case 16:
                try {
                    String obj2 = drm0.p0((String) obj).toString();
                    if (!brm0.B(obj2, "#", false)) {
                        obj2 = "#".concat(obj2);
                    }
                    failure = Integer.valueOf(Color.parseColor(obj2));
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                if (failure instanceof Result.Failure) {
                    failure = null;
                }
                Integer num = (Integer) failure;
                if (num != null) {
                    return new b8g(num.intValue());
                }
                return null;
            case 17:
                return (zqc) obj;
            case 18:
                return Boolean.valueOf(!((List) obj).isEmpty());
            case 19:
                tj50.a aVar3 = (tj50.a) obj;
                x4 x4Var = new x4(22);
                ao8 ao8Var = ao8.d;
                return new e.a(aVar3.a(x4Var, ao8Var), aVar3.a(new k60(20), ao8Var));
            case 20:
                int i4 = CommunityReviewsFragment.o0;
                qgi0.r((tgi0) obj, "ERROR_TITLE");
                return s3q0.a;
            case 21:
                return s3q0.a;
            case 22:
                return ((Pair) obj).i();
            case 23:
                qgi0.r((tgi0) obj, "delivery_points_search_button");
                return s3q0.a;
            case 24:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                return e3m.e(R.attr.im_ic_group_profile, (Context) obj);
            case 25:
                com.vk.metrics.eventtracking.b.a.q((Throwable) obj);
                return s3q0.a;
            case 26:
                Map map = (Map) obj;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(on00.e(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    linkedHashMap2.put(Peer.a.b(((Number) entry.getKey()).longValue()), entry.getValue());
                }
                return linkedHashMap2;
            case 27:
                qgi0.r((tgi0) obj, "drafts_list_delete_dialog_confirm");
                return s3q0.a;
            case 28:
                return DzenArticleState.a((DzenArticleState) obj, null, null, null, null, null, false, 95);
            default:
                kpp kppVar = opp.T;
                return ((pno0) obj).d().toString();
        }
    }

    public /* synthetic */ i(Object obj, int i) {
        this.b = i;
    }
}
