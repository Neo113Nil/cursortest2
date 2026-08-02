package com.vk.video.playlist.playlistscreen.catalog;

import com.vk.api.generated.base.dto.BaseLinkButtonActionTypeDto;
import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog.mvi.section.domain.CatalogFilterDo;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.e43;
import xsna.p4a;
import xsna.yzs;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class h implements yzs {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (r4 != (-1)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        r10 = java.lang.Integer.valueOf(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (r10 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        r9 = r10.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        return new com.vk.video.playlist.playlistscreen.catalog.PlaylistHorizontalFiltersWithScrollView$State(r1, r2, r3, r9, null);
     */
    @Override // xsna.yzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CatalogBlockDto catalogBlockDto = (CatalogBlockDto) obj2;
        CatalogBlockVariant catalogBlockVariant = (CatalogBlockVariant) obj3;
        ArrayList a = p4a.a(catalogBlockDto, BaseLinkButtonActionTypeDto.VIDEO_SEASONS_BLOCK_FILTER);
        Integer num = null;
        if (!a.isEmpty()) {
            String id = catalogBlockDto.getId();
            Iterator it = a.iterator();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                Object next = it.next();
                if (i2 < 0) {
                    e43.t();
                    throw null;
                }
                if (((CatalogFilterDo) next).c) {
                    break;
                }
                i2++;
            }
        } else {
            return null;
        }
    }
}
