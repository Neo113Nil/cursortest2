package com.vk.ecomm.market.album.compose;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EditStorefrontAlbumErrorContent.kt */
/* loaded from: classes18.dex */
public final class EditStorefrontAlbumError {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ EditStorefrontAlbumError[] $VALUES;
    public static final EditStorefrontAlbumError Internet;
    public static final EditStorefrontAlbumError Server;

    static {
        EditStorefrontAlbumError editStorefrontAlbumError = new EditStorefrontAlbumError("Internet", 0);
        Internet = editStorefrontAlbumError;
        EditStorefrontAlbumError editStorefrontAlbumError2 = new EditStorefrontAlbumError("Server", 1);
        Server = editStorefrontAlbumError2;
        EditStorefrontAlbumError[] editStorefrontAlbumErrorArr = {editStorefrontAlbumError, editStorefrontAlbumError2};
        $VALUES = editStorefrontAlbumErrorArr;
        $ENTRIES = new asp(editStorefrontAlbumErrorArr);
    }

    public EditStorefrontAlbumError() {
        throw null;
    }

    public static EditStorefrontAlbumError valueOf(String str) {
        return (EditStorefrontAlbumError) Enum.valueOf(EditStorefrontAlbumError.class, str);
    }

    public static EditStorefrontAlbumError[] values() {
        return (EditStorefrontAlbumError[]) $VALUES.clone();
    }
}
