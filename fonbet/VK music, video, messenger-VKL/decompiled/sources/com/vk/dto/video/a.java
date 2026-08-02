package com.vk.dto.video;

import com.vk.dto.common.VideoFile;
import com.vk.dto.video.Doc2DocItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.c5g;

/* compiled from: Doc2DocItem.kt */
/* loaded from: classes18.dex */
public final class a {
    public static final ArrayList a(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new Doc2DocItem.Video(Collections.singletonList((VideoFile) it.next())));
        }
        return arrayList;
    }
}
