package com.vk.movika.sdk.base.observable;

import com.vk.api.generated.audioBooks.dto.AudioBooksBoolResponseDto;
import com.vk.api.generated.photos.dto.PhotosGetUserPhotosResponseDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.clips.coauthors.selector.presentation.state.ClipsCoauthorsSelectorMviState;
import com.vk.clips.sdk.models.SdkCoOwnerItem;
import com.vk.clips.sdk.models.SdkOwner;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.viewer.impl.adapters.ClipVideoFileAdapter;
import com.vk.dto.common.clips.ClipMainTabState;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.ecomm.cart.impl.cart.ui.emptycart.EmptyCartFragment;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.log.L;
import com.vk.video.ui.upload.impl.attachedclips.presentation.feature.entity.AttachedClipsState;
import io.reactivex.rxjava3.internal.operators.observable.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.ao8;
import xsna.c5g;
import xsna.e9k0;
import xsna.ekz;
import xsna.fnd;
import xsna.fzg;
import xsna.g9k;
import xsna.hyg0;
import xsna.iqt;
import xsna.irp;
import xsna.izs;
import xsna.j5g;
import xsna.jyf;
import xsna.kc5;
import xsna.kn00;
import xsna.kwg0;
import xsna.lc5;
import xsna.nd4;
import xsna.nrm;
import xsna.o490;
import xsna.pk50;
import xsna.qcy;
import xsna.qgi0;
import xsna.qyg0;
import xsna.r7a;
import xsna.s3q0;
import xsna.stf;
import xsna.t140;
import xsna.tgi0;
import xsna.tj50;
import xsna.xfa0;
import xsna.zc5;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class u implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ u(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        SdkCoOwnerItem.Status status;
        ekz ekzVar;
        switch (this.b) {
            case 0:
                ((com.vk.movika.sdk.base.listener.j) obj).o();
                return s3q0.a;
            case 1:
                PhotosGetUserPhotosResponseDto photosGetUserPhotosResponseDto = (PhotosGetUserPhotosResponseDto) obj;
                VKList vKList = new VKList(photosGetUserPhotosResponseDto.getCount(), 1);
                vKList.n(photosGetUserPhotosResponseDto.e());
                Iterator<T> it = photosGetUserPhotosResponseDto.d().iterator();
                while (it.hasNext()) {
                    vKList.add(xfa0.a((PhotosPhotoDto) it.next()));
                }
                return vKList;
            case 2:
                return AttachedClipsState.a((AttachedClipsState) obj, null, null, null, null, null, false, false, false, false, e9k0.d.a, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
            case 3:
                return new nd4(((AudioBooksBoolResponseDto) obj).d().i() == 1);
            case 4:
                tj50.a aVar = (tj50.a) obj;
                return new zc5.a(aVar.a(kc5.b, ao8.d), aVar.e(lc5.b));
            case 5:
                return (pk50) obj;
            case 6:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                return s3q0.a;
            case 7:
                return Boolean.valueOf(((iqt.a) obj) instanceof iqt.a.C3074a);
            case 8:
                return ((r7a.a) ((r7a) obj)).c;
            case 9:
                return new t140(0);
            case 10:
                L.e("ChannelUpdateMessagesNotificationsHandler", "updateNotification: error", (Throwable) obj);
                return g0.b;
            case 11:
                qcy<Object>[] qcyVarArr = ClipVideoFileAdapter.B;
                List<CoOwnerItem> list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (CoOwnerItem coOwnerItem : list) {
                    UserId userId = coOwnerItem.b;
                    SdkOwner a = o490.a(coOwnerItem.d);
                    boolean z = coOwnerItem.e;
                    int i = jyf.$EnumSwitchMapping$0[coOwnerItem.c.ordinal()];
                    if (i == 1) {
                        status = SdkCoOwnerItem.Status.PENDING;
                    } else {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        status = SdkCoOwnerItem.Status.APPROVED;
                    }
                    ClipMainTabState clipMainTabState = coOwnerItem.f;
                    arrayList.add(new SdkCoOwnerItem(userId, a, z, status, clipMainTabState != null ? Integer.valueOf(clipMainTabState.h()) : null));
                }
                return arrayList;
            case 12:
                return fnd.a(((ClipsCoauthorsSelectorMviState.d) obj).c.size());
            case 13:
                kwg0.b().accept((Throwable) obj);
                return s3q0.a;
            case 14:
                return Boolean.valueOf(((Group) obj).u());
            case 15:
                return ((stf) obj).a;
            case 16:
                return Boolean.valueOf(((fzg) obj).t);
            case 17:
                return (kn00) obj;
            case 18:
                int i2 = CommunityReviewsFragment.o0;
                qgi0.r((tgi0) obj, "MANAGE_PIN_SUBSCRIPTION_BUTON");
                return s3q0.a;
            case 19:
                return g9k.c.a;
            case 20:
                return new ArrayList();
            case 21:
                return String.valueOf(((Integer) obj).intValue());
            case 22:
                return com.vk.im.engine.models.dialogs.b.a((com.vk.im.engine.models.dialogs.b) obj, null, null, null, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, false, null, false, null, null, null, false, null, null, null, null, 0, false, false, null, null, 0, null, 0, -9, 2097151);
            case 23:
                return nrm.a((nrm) obj, null, null, 11);
            case 24:
                qgi0.r((tgi0) obj, "dzen_screen_toolbar_title");
                return s3q0.a;
            case 25:
                int i3 = EmptyCartFragment.Q;
                return s3q0.a;
            case 26:
                return Long.valueOf(-((irp.a) obj).d);
            case 27:
                L.i((Throwable) obj);
                return s3q0.a;
            case 28:
                qyg0 V0 = ((hyg0) obj).V0("DELETE FROM favorites_stickers");
                try {
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            default:
                ArrayList arrayList2 = new ArrayList();
                for (FeedItem feedItem : (List) obj) {
                    FeedItem.i iVar = feedItem instanceof FeedItem.i ? (FeedItem.i) feedItem : null;
                    if (iVar != null) {
                        SdkVideoFile sdkVideoFile = iVar.d;
                        ekzVar = new ekz(sdkVideoFile.I0(), sdkVideoFile.o0());
                    } else {
                        ekzVar = null;
                    }
                    if (ekzVar != null) {
                        arrayList2.add(ekzVar);
                    }
                }
                return j5g.S0(arrayList2);
        }
    }

    public /* synthetic */ u(fnd fndVar) {
        this.b = 12;
    }
}
