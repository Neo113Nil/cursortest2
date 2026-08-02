package org.chromium.net.impl;

import android.content.Context;
import org.chromium.net.impl.I;

/* loaded from: classes6.dex */
public final class V extends U {
    public V(Context context) {
        super(context, !org.chromium.net.i.class.getClassLoader().equals(E.class.getClassLoader()) ? I.d.CRONET_SOURCE_PLAY_SERVICES : I.d.CRONET_SOURCE_STATICALLY_LINKED);
    }
}
