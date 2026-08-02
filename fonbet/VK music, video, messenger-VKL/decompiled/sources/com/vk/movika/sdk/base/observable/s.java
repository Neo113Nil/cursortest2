package com.vk.movika.sdk.base.observable;

import android.location.Location;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.api.generated.owners.dto.OwnersGetContentTabsResponseDto;
import com.vk.api.generated.photos.dto.PhotosGetResponseDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetOwnerVideosResponseDto;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.core.serialize.Serializer;
import com.vk.core.util.NoLocation;
import com.vk.dto.clips.ClipsVideoItemLocation;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.clips.ClipVideoItem;
import com.vk.dto.common.data.VKList;
import com.vk.ecomm.cart.impl.checkout.feature.state.g;
import com.vk.ecomm.reviews.api.model.createreview.ProgressInfo;
import com.vk.ecomm.reviews.api.model.createreview.UploadImageModel;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.components.contacts.b;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.toggle.features.ClipsFeatures;
import com.vk.video.ui.upload.impl.attachedclips.presentation.feature.entity.AttachedClipsState;
import com.vk.video.ui.upload.impl.publish.presentation.albumchoose.feature.entity.AlbumChooseState;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.c5g;
import xsna.c9k;
import xsna.e9k0;
import xsna.epx;
import xsna.fnd;
import xsna.fzg;
import xsna.hfz;
import xsna.izs;
import xsna.k15;
import xsna.ms9;
import xsna.ptk;
import xsna.qgi0;
import xsna.qih0;
import xsna.r3i;
import xsna.s3q0;
import xsna.stf;
import xsna.sy40;
import xsna.tgi0;
import xsna.tlo0;
import xsna.tq;
import xsna.u0a;
import xsna.ums0;
import xsna.v7a;
import xsna.wih0;
import xsna.xaj;
import xsna.xfa0;
import xsna.xgl0;
import xsna.y280;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ s(int i) {
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ea, code lost:
    
        if (r1 != false) goto L48;
     */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        tlo0.a aVar;
        int i;
        boolean z;
        switch (this.b) {
            case 0:
                ((com.vk.movika.sdk.base.listener.i) obj).onStart();
                return s3q0.a;
            case 1:
                return AlbumChooseState.a((AlbumChooseState) obj, null, null, 0, false, false, false, 95);
            case 2:
                PhotosGetResponseDto photosGetResponseDto = (PhotosGetResponseDto) obj;
                VKList vKList = new VKList(photosGetResponseDto.getCount(), 1);
                vKList.n(photosGetResponseDto.e());
                Iterator<T> it = photosGetResponseDto.d().iterator();
                while (it.hasNext()) {
                    vKList.add(xfa0.a((PhotosPhotoDto) it.next()));
                }
                return vKList;
            case 3:
                return AttachedClipsState.a((AttachedClipsState) obj, null, null, null, null, null, false, false, false, false, e9k0.b.a, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
            case 4:
                return Boolean.valueOf(((sy40) obj).e.f);
            case 5:
                return PublishState.a((PublishState) obj, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, false, null, null, false, false, null, false, false, null, false, false, false, true, -1, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
            case 6:
                return s3q0.a;
            case 7:
                return Boolean.valueOf(((Long) obj).longValue() >= 0);
            case 8:
                Pair pair = (Pair) obj;
                if (epx.f(pair.j(), NoLocation.b)) {
                    return (ClipVideoItem) pair.i();
                }
                ClipVideoItem clipVideoItem = (ClipVideoItem) pair.i();
                Serializer.c<ClipsVideoItemLocation> cVar = ClipsVideoItemLocation.CREATOR;
                return ClipVideoItem.a(clipVideoItem, null, 0, 0, ClipsVideoItemLocation.a.a((Location) pair.j()), 196607);
            case 9:
                qgi0.r((tgi0) obj, "cart_summary_delivery_info");
                return s3q0.a;
            case 10:
                return v7a.a;
            case 11:
                return com.vk.channels.impl.comments.g.a((com.vk.channels.impl.comments.g) obj, null, null, null, true, 7);
            case 12:
                xgl0 xgl0Var = (xgl0) obj;
                xgl0Var.system().w(xgl0Var.a().e0(false));
                return s3q0.a;
            case 13:
                return Boolean.valueOf(((Msg) obj).Mb());
            case 14:
                return com.vk.ecomm.cart.impl.checkout.feature.state.g.d((com.vk.ecomm.cart.impl.checkout.feature.state.g) obj, g.a.b.a);
            case 15:
                u0a u0aVar = (u0a) obj;
                return Boolean.valueOf((u0aVar instanceof y280) && ((y280) u0aVar).a.z.contains("local_block_id"));
            case 16:
                ClipsFeatures clipsFeatures = ClipsFeatures.COAUTHORS_REDESIGN;
                clipsFeatures.getClass();
                if (com.vk.toggle.b.A.a(clipsFeatures)) {
                    aVar = tlo0.Companion;
                    i = R.string.clips_coauthors_selection_list_title_redesign;
                } else {
                    aVar = tlo0.Companion;
                    i = R.string.clips_coauthors_selection_list_title;
                }
                return tq.h(aVar, i);
            case 17:
                ShortVideoGetOwnerVideosResponseDto shortVideoGetOwnerVideosResponseDto = (ShortVideoGetOwnerVideosResponseDto) obj;
                List e = ums0.e(ums0.a, shortVideoGetOwnerVideosResponseDto.e(), shortVideoGetOwnerVideosResponseDto.j(), shortVideoGetOwnerVideosResponseDto.d(), false, 52);
                ArrayList arrayList = new ArrayList(c5g.u(e, 10));
                Iterator it2 = e.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new wih0.a(k15.B((VideoFile) it2.next()), null));
                }
                PaginationKey paginationKey = PaginationKey.LoadedFull.b;
                String g = shortVideoGetOwnerVideosResponseDto.g();
                return new qih0(arrayList, paginationKey, (g == null || g.length() == 0 || g.equals("null")) ? paginationKey : new PaginationKey.Next(g), null, null);
            case 18:
                qgi0.r((tgi0) obj, "upload_cell_right_chevron");
                return s3q0.a;
            case 19:
                return Integer.valueOf(((stf) obj).c.b);
            case 20:
                fzg fzgVar = (fzg) obj;
                if (fzgVar.i > 0) {
                    List<UploadImageModel> list = fzgVar.j;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator<T> it3 = list.iterator();
                        while (it3.hasNext()) {
                            if (((UploadImageModel) it3.next()).e instanceof ProgressInfo.Loading) {
                            }
                        }
                    }
                    if (!fzgVar.c()) {
                        z = true;
                        break;
                    } else {
                        z = fzgVar.h();
                        break;
                    }
                }
                r2 = false;
                return Boolean.valueOf(r2);
            case 21:
                return s3q0.a;
            case 22:
                List list2 = (List) obj;
                List<hfz> list3 = ((b.a) list2.get(0)).c;
                List<hfz> list4 = ((b.a) list2.get(1)).c;
                b.a aVar2 = (b.a) list2.get(1);
                return new b.a(aVar2.a, aVar2.b, aVar2.c, androidx.recyclerview.widget.m.a(new xaj(list3, list4), true));
            case 23:
                return Boolean.valueOf(((c9k) obj).c != null);
            case 24:
                Throwable th = (Throwable) obj;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.e, new Object[]{ms9.b("Draft couldn't save. Exception: ", th)});
                }
                return s3q0.a;
            case 25:
                qgi0.r((tgi0) obj, "dzen_screen_toolbar_back");
                return s3q0.a;
            case 26:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 27:
                Pair pair2 = (Pair) obj;
                ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) pair2.d();
                extendedCommunityProfile.U2 = r3i.c((OwnersGetContentTabsResponseDto) pair2.g());
                return new ptk(extendedCommunityProfile, false);
            default:
                return s3q0.a;
        }
    }

    public /* synthetic */ s(fnd fndVar) {
        this.b = 16;
    }
}
