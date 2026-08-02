package com.vk.photos.ui.editalbum.domain;

import xsna.epx;

/* compiled from: EditAlbumChangesStore.kt */
/* loaded from: classes3.dex */
public final class b {
    public final h a;
    public h b;

    public b(h hVar, h hVar2) {
        this.a = hVar;
        this.b = hVar2;
    }

    public static boolean a(PrivacySettingData privacySettingData, PrivacySettingData privacySettingData2) {
        return !epx.f(privacySettingData != null ? privacySettingData.b : null, privacySettingData2 != null ? privacySettingData2.b : null);
    }
}
