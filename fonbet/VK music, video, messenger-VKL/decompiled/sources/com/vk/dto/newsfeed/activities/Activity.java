package com.vk.dto.newsfeed.activities;

import com.vk.core.serialize.Serializer;
import java.util.ArrayList;
import xsna.zcl;

/* compiled from: Activity.kt */
/* loaded from: classes18.dex */
public abstract class Activity extends Serializer.StreamParcelableAdapter {
    public final int b;
    public final ArrayList<String> c;

    /* JADX WARN: Multi-variable type inference failed */
    public Activity() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ Activity(int i, ArrayList arrayList, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? new ArrayList() : arrayList);
    }

    public Activity(int i, ArrayList<String> arrayList) {
        this.b = i;
        this.c = arrayList;
    }
}
