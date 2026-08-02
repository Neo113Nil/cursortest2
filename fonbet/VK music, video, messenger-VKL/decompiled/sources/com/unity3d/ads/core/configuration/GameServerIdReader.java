package com.unity3d.ads.core.configuration;

import com.unity3d.services.core.misc.JsonStorage;
import xsna.zcl;

/* compiled from: GameServerIdReader.kt */
/* loaded from: classes14.dex */
public final class GameServerIdReader extends MetadataReader<String> {
    public static final Companion Companion = new Companion(null);
    public static final String PLAYER_SERVER_ID_KEY = "player.server_id.value";

    /* compiled from: GameServerIdReader.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public GameServerIdReader(JsonStorage jsonStorage) {
        super(jsonStorage, PLAYER_SERVER_ID_KEY);
    }
}
