package com.vk.catalog.mvi.block.impl.banner;

import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.catalog.dto.CatalogHintDto;
import com.vk.catalog.mvi.block.impl.banner.BannerView;
import com.vk.catalog.mvi.dto.CatalogExtraResponseObjectDto;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import java.util.Iterator;
import java.util.List;
import xsna.epx;
import xsna.yzs;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements yzs {
    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        List<CatalogHintDto> i;
        Object obj4;
        CatalogExtraResponseObjectDto catalogExtraResponseObjectDto = (CatalogExtraResponseObjectDto) obj;
        CatalogBlockDto catalogBlockDto = (CatalogBlockDto) obj2;
        CatalogBlockVariant catalogBlockVariant = (CatalogBlockVariant) obj3;
        String b1 = catalogBlockDto.b1();
        if (b1 != null && (i = catalogExtraResponseObjectDto.i()) != null) {
            Iterator<T> it = i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj4 = null;
                    break;
                }
                obj4 = it.next();
                if (epx.f(((CatalogHintDto) obj4).getId(), b1)) {
                    break;
                }
            }
            CatalogHintDto catalogHintDto = (CatalogHintDto) obj4;
            if (catalogHintDto != null) {
                String id = catalogBlockDto.getId();
                String id2 = catalogBlockDto.getId();
                String title = catalogHintDto.getTitle();
                if (title == null) {
                    title = "";
                }
                String f = catalogHintDto.f();
                return new BannerView.State(id, catalogBlockVariant, new BannerView.BannerViewState(id2, title, f != null ? f : "", catalogBlockVariant, null), null);
            }
        }
        return null;
    }
}
