package com.vk.catalog.mvi.block.impl;

import com.huawei.hms.framework.common.BundleUtil;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.media.dto.MediaPopupDto;
import com.vk.catalog.mvi.block.impl.PlaceholderView;
import com.vk.catalog.mvi.dto.CatalogExtraResponseObjectDto;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.c5g;
import xsna.drm0;
import xsna.f2a;
import xsna.j5g;
import xsna.p4a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements f2a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
    @Override // xsna.f2a
    public final List a(CatalogExtraResponseObjectDto catalogExtraResponseObjectDto, CatalogBlockDto catalogBlockDto, CatalogBlockVariant catalogBlockVariant) {
        ?? r2;
        ArrayList arrayList;
        BaseLinkButtonDto baseLinkButtonDto;
        BaseLinkButtonDto baseLinkButtonDto2;
        List<MediaPopupDto> l;
        Object obj;
        MediaPopupDto mediaPopupDto;
        List<String> i2 = catalogBlockDto.i2();
        if (i2 != null) {
            r2 = new ArrayList();
            Iterator it = i2.iterator();
            while (it.hasNext()) {
                String str = (String) j5g.k0(drm0.c0((String) it.next(), new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6));
                if (str == null || (l = catalogExtraResponseObjectDto.l()) == null) {
                    mediaPopupDto = null;
                } else {
                    Iterator it2 = l.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        String id = ((MediaPopupDto) obj).getId();
                        if (id != null && drm0.D(id, str, false)) {
                            break;
                        }
                    }
                    mediaPopupDto = (MediaPopupDto) obj;
                }
                if (mediaPopupDto != null) {
                    r2.add(mediaPopupDto);
                }
            }
        } else {
            r2 = EmptyList.b;
        }
        Iterable<MediaPopupDto> iterable = (Iterable) r2;
        ArrayList arrayList2 = new ArrayList(c5g.u(iterable, 10));
        for (MediaPopupDto mediaPopupDto2 : iterable) {
            String id2 = catalogBlockDto.getId();
            String id3 = catalogBlockDto.getId();
            List<BaseImageDto> f = mediaPopupDto2.f();
            if (f != null) {
                List<BaseImageDto> list = f;
                ArrayList arrayList3 = new ArrayList(c5g.u(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(p4a.f((BaseImageDto) it3.next()));
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            Float valueOf = catalogBlockVariant == CatalogBlockVariant.PlaceHolderBig ? Float.valueOf(160.0f) : null;
            String title = mediaPopupDto2.getTitle();
            String i = mediaPopupDto2.i();
            List<BaseLinkButtonDto> e = mediaPopupDto2.e();
            PlaceholderView.ViewState viewState = new PlaceholderView.ViewState(id3, arrayList, valueOf, title, i, (e == null || (baseLinkButtonDto2 = (BaseLinkButtonDto) j5g.a0(e)) == null) ? null : baseLinkButtonDto2.getTitle(), null);
            List<BaseLinkButtonDto> e2 = mediaPopupDto2.e();
            arrayList2.add(new PlaceholderView.State(id2, catalogBlockVariant, viewState, (e2 == null || (baseLinkButtonDto = (BaseLinkButtonDto) j5g.a0(e2)) == null) ? null : p4a.e(baseLinkButtonDto), null));
        }
        return arrayList2;
    }
}
