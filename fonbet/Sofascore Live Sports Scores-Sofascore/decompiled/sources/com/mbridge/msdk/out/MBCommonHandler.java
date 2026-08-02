package com.mbridge.msdk.out;

import android.content.Context;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class MBCommonHandler {
    protected Context context;
    protected Map<String, Object> properties;

    public MBCommonHandler(Map<String, Object> map, Context context) {
        this.properties = map;
        this.context = context;
    }

    public abstract boolean load();

    public abstract void release();

    public MBCommonHandler() {
    }
}
