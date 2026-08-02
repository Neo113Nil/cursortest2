package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzaf;

/* loaded from: classes9.dex */
final class zzs implements TileProvider {
    private final zzaf zzel;
    private final /* synthetic */ TileOverlayOptions zzem;

    zzs(TileOverlayOptions tileOverlayOptions) {
        zzaf zzafVar;
        this.zzem = tileOverlayOptions;
        zzafVar = tileOverlayOptions.zzei;
        this.zzel = zzafVar;
    }

    @Override // com.google.android.gms.maps.model.TileProvider
    public final Tile getTile(int i11, int i12, int i13) {
        try {
            return this.zzel.getTile(i11, i12, i13);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
