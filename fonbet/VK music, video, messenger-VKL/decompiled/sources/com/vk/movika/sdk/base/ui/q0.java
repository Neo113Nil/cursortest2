package com.vk.movika.sdk.base.ui;

import android.net.Uri;
import com.vk.core.compose.component.alert.Alert$Button;
import com.vk.donut.design.compose.banner.DonutBannerKt;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKImageView;
import com.vk.log.L;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vkontakte.android.R;
import xsna.cq;
import xsna.hzn;
import xsna.jai;
import xsna.kkm;
import xsna.n0t0;
import xsna.ne7;
import xsna.q630;
import xsna.s3q0;
import xsna.t7u0;
import xsna.tyq;
import xsna.u150;
import xsna.wzs;
import xsna.ypz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class q0 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                com.vk.movika.sdk.player.base.components.a aVar = ((v0) obj3).d;
                break;
            case 1:
                AlbumDetailsFragment albumDetailsFragment = (AlbumDetailsFragment) obj3;
                ((Integer) obj2).getClass();
                int i2 = AlbumDetailsFragment.p0;
                break;
            case 2:
                jai jaiVar = (jai) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1171611617, intValue, -1, "com.vk.clips.compose.ClipsComposeThemeProvider.Theme.<anonymous>.<anonymous> (ClipsComposeThemeProvider.kt:21)");
                    }
                    if (cq.i(0, aVar2, jaiVar)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                DonutBannerKt.c((hzn) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((tyq) obj3).g(ne7.I(1), (androidx.compose.runtime.a) obj);
                break;
            case 5:
                Integer num = (Integer) obj;
                num.intValue();
                ((com.vk.attachpicker.fragment.gallery.c) obj3).a.jo((MediaStoreEntry) obj2, num);
                break;
            case 6:
                ((ypz) obj3).l.setBarColor(((kkm) obj2).f(R.attr.vk_legacy_accent));
                break;
            case 7:
                ((Integer) obj2).getClass();
                u150.j((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 8:
                Uri uri = (Uri) obj;
                Throwable th = (Throwable) obj2;
                VKImageView vKImageView = ((n0t0) obj3).t;
                vKImageView.setVisibility(0);
                if (th == null) {
                    vKImageView.L0(uri, ImageScreenSize.MID);
                    break;
                } else {
                    vKImageView.clear();
                    L.i(th);
                    break;
                }
            default:
                Alert$Button alert$Button = (Alert$Button) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(966722764, intValue2, -1, "com.vk.core.compose.component.VkAlertNew.<anonymous> (VkAlertNew.kt:86)");
                    }
                    t7u0.a(alert$Button, aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ q0(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
