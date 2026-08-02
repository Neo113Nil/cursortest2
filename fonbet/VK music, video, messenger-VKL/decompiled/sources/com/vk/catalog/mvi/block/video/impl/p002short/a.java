package com.vk.catalog.mvi.block.video.impl.p002short;

import com.huawei.hms.framework.common.BundleUtil;
import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.catalog.dto.CatalogPinnedVideosItemDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.video.impl.p002short.ClipListView;
import com.vk.catalog.mvi.dto.CatalogExtraResponseObjectDto;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.c5g;
import xsna.drm0;
import xsna.epx;
import xsna.f2a;
import xsna.iah0;
import xsna.j5g;
import xsna.ums0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class a implements f2a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0013 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.ArrayList] */
    @Override // xsna.f2a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List a(CatalogExtraResponseObjectDto catalogExtraResponseObjectDto, CatalogBlockDto catalogBlockDto, CatalogBlockVariant catalogBlockVariant) {
        ?? r3;
        boolean z;
        VideoVideoFullDto videoVideoFullDto;
        Object obj;
        Integer s1;
        List<String> f3 = catalogBlockDto.f3();
        if (f3 != null) {
            r3 = new ArrayList();
            Iterator it = f3.iterator();
            while (it.hasNext()) {
                List c0 = drm0.c0((String) it.next(), new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6);
                String str = (String) j5g.k0(c0);
                if (str != null) {
                    int parseInt = Integer.parseInt(str);
                    String str2 = (String) j5g.a0(c0);
                    Long valueOf = str2 != null ? Long.valueOf(Long.parseLong(str2)) : null;
                    List<VideoVideoFullDto> list = catalogExtraResponseObjectDto.h;
                    if (list != null) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            VideoVideoFullDto videoVideoFullDto2 = (VideoVideoFullDto) obj;
                            UserId q = videoVideoFullDto2.q();
                            if (epx.f(q != null ? Long.valueOf(q.b) : null, valueOf) && (s1 = videoVideoFullDto2.s1()) != null && s1.intValue() == parseInt) {
                                break;
                            }
                        }
                        videoVideoFullDto = (VideoVideoFullDto) obj;
                        if (videoVideoFullDto == null) {
                            r3.add(videoVideoFullDto);
                        }
                    }
                }
                videoVideoFullDto = null;
                if (videoVideoFullDto == null) {
                }
            }
        } else {
            r3 = EmptyList.b;
        }
        Iterable<VideoVideoFullDto> iterable = (Iterable) r3;
        ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
        for (VideoVideoFullDto videoVideoFullDto3 : iterable) {
            VideoFile videoFile = (VideoFile) j5g.Y(ums0.e(ums0.a, Collections.singletonList(videoVideoFullDto3), null, null, false, 62));
            boolean z2 = true;
            ImageSize Cb = videoFile.getImage().Cb(iah0.f().widthPixels, true, false);
            String str3 = Cb != null ? Cb.d.d : null;
            List<CatalogPinnedVideosItemDto> X1 = catalogBlockDto.X1();
            if (X1 != null) {
                List<CatalogPinnedVideosItemDto> list2 = X1;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    for (CatalogPinnedVideosItemDto catalogPinnedVideosItemDto : list2) {
                        if (epx.f(catalogPinnedVideosItemDto.e(), videoFile.a1()) && catalogPinnedVideosItemDto.d() == CatalogPinnedVideosItemDto.PinTypeDto.CLIP) {
                            break;
                        }
                    }
                }
                z2 = false;
                z = z2;
            } else {
                z = false;
            }
            String id = catalogBlockDto.getId();
            UserId q2 = videoVideoFullDto3.q();
            if (q2 == null) {
                q2 = UserId.d;
            }
            Integer s12 = videoVideoFullDto3.s1();
            BlockId.CompositeId a = com.vk.catalog.mvi.block.a.a(s12 != null ? s12.intValue() : 0, q2, id);
            if (str3 == null) {
                str3 = "";
            }
            CatalogBlockVariant catalogBlockVariant2 = catalogBlockVariant;
            arrayList.add(new ClipListView.ClipListState(a, catalogBlockVariant2, str3, videoFile, z));
            catalogBlockVariant = catalogBlockVariant2;
        }
        return arrayList;
    }
}
