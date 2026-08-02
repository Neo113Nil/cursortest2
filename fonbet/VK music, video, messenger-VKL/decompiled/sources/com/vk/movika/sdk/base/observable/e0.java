package com.vk.movika.sdk.base.observable;

import com.vk.api.generated.audio.dto.AudioArtistDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.articles.ArticleFragment;
import com.vk.clips.upload.vk.ui.impl.fragment.ClipsUploadFragmentImpl;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridDraftsListFragment;
import com.vk.core.fragments.internal.stack.FStack;
import com.vk.dto.group.Group;
import com.vk.dto.music.Playlist;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.im.engine.exceptions.ApiArgNotFoundException;
import com.vk.im.engine.exceptions.ImTaskExecutionException;
import com.vk.log.L;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import xsna.air;
import xsna.b0l0;
import xsna.bbv0;
import xsna.bn40;
import xsna.cvk;
import xsna.e430;
import xsna.ef00;
import xsna.fr10;
import xsna.h03;
import xsna.izs;
import xsna.jnj;
import xsna.js0;
import xsna.l1j;
import xsna.lyd;
import xsna.mcr0;
import xsna.n610;
import xsna.qgi0;
import xsna.s3q0;
import xsna.tam0;
import xsna.tgi0;
import xsna.vgg;
import xsna.wzb;
import xsna.xwg;
import xsna.yre;
import xsna.zgd;
import xsna.zk70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ e0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Throwable cause;
        Throwable cause2;
        switch (this.b) {
            case 0:
                ((com.vk.movika.sdk.base.listener.m) obj).a();
                return s3q0.a;
            case 1:
                return js0.a;
            case 2:
                return air.b('\'', "'", (String) obj);
            case 3:
                int i = ArticleFragment.E0;
                return ((Group) obj).e;
            case 4:
                ((vgg) obj).c();
                return s3q0.a;
            case 5:
                Group group = (Group) obj;
                String str = group.f;
                if (str == null) {
                    str = group.e;
                }
                return mcr0.f(5000L, str);
            case 6:
                L.g("An error occurred", (Throwable) obj);
                cvk.u(R.string.error, false);
                return s3q0.a;
            case 7:
                return ((File) obj).getAbsolutePath();
            case 8:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    if (!jnj.b(((Playlist) obj2).O)) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 9:
                Throwable th = (Throwable) obj;
                if (((th instanceof ImTaskExecutionException) || (th instanceof ApiArgNotFoundException)) && (cause = th.getCause()) != null) {
                    if (!((cause instanceof ImTaskExecutionException) || (cause instanceof ApiArgNotFoundException)) || (th = cause.getCause()) == null) {
                        th = cause;
                    } else if (((th instanceof ImTaskExecutionException) || (th instanceof ApiArgNotFoundException)) && (cause2 = th.getCause()) != null) {
                        th = wzb.a.b(cause2);
                    }
                }
                zk70.e(th);
                return s3q0.a;
            case 10:
                b0l0 b0l0Var = (b0l0) obj;
                if (!b0l0Var.b()) {
                    bbv0.a aVar = bbv0.g;
                    String obj3 = b0l0Var.a().toString();
                    aVar.getClass();
                    bbv0.a.d(obj3);
                }
                return s3q0.a;
            case 11:
                return ((zgd) obj).b;
            case 12:
                lyd.a.a("ClipsEditorProcessingDelegateImpl", (Throwable) obj);
                return s3q0.a;
            case 13:
                int i2 = ClipsGridDraftsListFragment.l0;
                h03.b((Throwable) obj);
                return s3q0.a;
            case 14:
                return yre.a.c.a;
            case 15:
                String str2 = ClipsUploadFragmentImpl.a0;
                return s3q0.a;
            case 16:
                return new xwg.b();
            case 17:
                return ((l1j.d) obj).c;
            case 18:
                return s3q0.a;
            case 19:
                return ((AudioArtistDto) obj).k();
            case 20:
                androidx.media3.common.a aVar2 = (androidx.media3.common.a) obj;
                String str3 = aVar2.a;
                if (str3 == null) {
                    str3 = "";
                }
                return new one.video.player.tracks.a(str3, fr10.a(aVar2));
            case 21:
                return ((FStack) obj).zb();
            case 22:
                return Boolean.valueOf(((BaseOkResponseDto) obj) == BaseOkResponseDto.OK);
            case 23:
                io.reactivex.rxjava3.core.q qVar = (io.reactivex.rxjava3.core.q) obj;
                return qVar.c(qVar.y(500L, TimeUnit.MILLISECONDS));
            case 24:
                int i3 = MarketItemReviewsFragment.w0;
                qgi0.r((tgi0) obj, "toolbar_image");
                return s3q0.a;
            case 25:
                return n610.d.a;
            case 26:
                return ((tam0) obj).d();
            case 27:
                return Boolean.valueOf(((ef00) obj).d);
            case 28:
                return ((e430) obj).d;
            default:
                bn40.c((Throwable) obj, new Object[0]);
                return s3q0.a;
        }
    }
}
