package com.blaze.blazesdk.features.shared.models.shared_models;

import com.blaze.blazesdk.features.shared.models.shared_models.RenditionsDto;
import defpackage.n3m;
import defpackage.nfm;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class a {
    public static final nfm a(List list, RenditionsDto.FileTypeDto fileTypeDto) {
        n3m n3mVar;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((RenditionsDto) obj).getFileTypeEnum() == fileTypeDto) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List a = c.a(arrayList);
        fileTypeDto.getClass();
        int i = b.a[fileTypeDto.ordinal()];
        if (i == 1) {
            n3mVar = n3m.MP4;
        } else if (i == 2) {
            n3mVar = n3m.HLS;
        } else {
            if (i != 3) {
                zzl.b();
                return null;
            }
            n3mVar = n3m.DASH;
        }
        return new nfm(a, n3mVar);
    }
}
