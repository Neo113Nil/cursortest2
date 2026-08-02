package com.unity3d.ads.metadata;

import android.content.Context;
import com.sofascore.model.network.response.SearchResponseKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Deprecated
/* loaded from: classes6.dex */
public class PlayerMetaData extends MetaData {
    public static final String KEY_SERVER_ID = "server_id";

    @Deprecated
    public PlayerMetaData(Context context) {
        super(context);
        setCategory(SearchResponseKt.PLAYER_ENTITY);
    }

    @Deprecated
    public void setServerId(String str) {
        set(KEY_SERVER_ID, str);
    }
}
