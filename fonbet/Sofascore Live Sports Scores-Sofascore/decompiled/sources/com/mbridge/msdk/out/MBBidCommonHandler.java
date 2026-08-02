package com.mbridge.msdk.out;

import android.content.Context;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class MBBidCommonHandler {
    protected Context context;
    protected Map<String, Object> properties;

    public MBBidCommonHandler(Map<String, Object> map, Context context) {
        this.properties = map;
        this.context = context;
    }

    public abstract void bidLoad(String str);

    public abstract void bidRelease();

    public MBBidCommonHandler() {
    }
}
