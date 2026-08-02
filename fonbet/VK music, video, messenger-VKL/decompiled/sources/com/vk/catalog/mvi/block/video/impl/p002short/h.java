package com.vk.catalog.mvi.block.video.impl.p002short;

import com.huawei.hms.framework.common.BundleUtil;
import com.vk.api.generated.catalog.dto.CatalogBlockDto;
import com.vk.api.generated.catalog.dto.CatalogPinnedVideosItemDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.catalog.mvi.block.a;
import com.vk.catalog.mvi.block.video.impl.p002short.ShortVideoListView;
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
import xsna.qwe;
import xsna.ums0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements f2a {
    public final /* synthetic */ qwe a;

    public /* synthetic */ h(qwe qweVar) {
        this.a = qweVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0013 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
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
                    List<VideoVideoFullDto> p = catalogExtraResponseObjectDto.p();
                    if (p != null) {
                        Iterator it2 = p.iterator();
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
            String url = Cb != null ? Cb.getUrl() : null;
            List<CatalogPinnedVideosItemDto> X1 = catalogBlockDto.X1();
            if (X1 != null) {
                List<CatalogPinnedVideosItemDto> list = X1;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (CatalogPinnedVideosItemDto catalogPinnedVideosItemDto : list) {
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
            arrayList.add(new ShortVideoListView.State(a.a(s12 != null ? s12.intValue() : 0, q2, id), catalogBlockVariant, videoFile.L8(), url, this.a.d(videoFile), videoFile, videoVideoFullDto3.r(), z));
        }
        return arrayList;
    }
}
