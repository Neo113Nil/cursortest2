package com.vk.catalog.mvi.block.video.impl.catalog.banner;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.api.generated.catalog.dto.CatalogBannerDto;
import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.catalog.mvi.block.video.impl.catalog.banner.CatalogBannerView;
import com.vk.catalog.mvi.dto.CatalogExtraResponseObjectDto;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import java.util.Iterator;
import java.util.List;
import xsna.j5g;
import xsna.yzs;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements yzs {
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Integer num;
        Object obj4;
        BaseImageDto baseImageDto;
        BaseLinkButtonDto baseLinkButtonDto;
        CatalogExtraResponseObjectDto catalogExtraResponseObjectDto = (CatalogExtraResponseObjectDto) obj;
        CatalogBlockDto catalogBlockDto = (CatalogBlockDto) obj2;
        CatalogBlockVariant catalogBlockVariant = (CatalogBlockVariant) obj3;
        List<Integer> K = catalogBlockDto.K();
        String str = null;
        if (K == null || (num = (Integer) j5g.a0(K)) == null) {
            return null;
        }
        int intValue = num.intValue();
        List<CatalogBannerDto> f = catalogExtraResponseObjectDto.f();
        if (f == null) {
            return null;
        }
        Iterator<T> it = f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj4 = null;
                break;
            }
            obj4 = it.next();
            if (((CatalogBannerDto) obj4).getId() == intValue) {
                break;
            }
        }
        CatalogBannerDto catalogBannerDto = (CatalogBannerDto) obj4;
        if (catalogBannerDto == null) {
            return null;
        }
        String id = catalogBlockDto.getId();
        List<BaseLinkButtonDto> d = catalogBannerDto.d();
        String i = (d == null || (baseLinkButtonDto = (BaseLinkButtonDto) j5g.a0(d)) == null) ? null : baseLinkButtonDto.i();
        String id2 = catalogBlockDto.getId();
        String l = catalogBannerDto.l();
        if (l == null) {
            l = "";
        }
        String title = catalogBannerDto.getTitle();
        String str2 = title != null ? title : "";
        List<BaseImageDto> i2 = catalogBannerDto.i();
        if (i2 != null && (baseImageDto = (BaseImageDto) j5g.a0(i2)) != null) {
            str = baseImageDto.getUrl();
        }
        return new CatalogBannerView.State(id, catalogBlockVariant, i, new CatalogBannerView.BannerViewState(id2, l, str2, str, catalogBlockVariant, null), null);
    }
}
