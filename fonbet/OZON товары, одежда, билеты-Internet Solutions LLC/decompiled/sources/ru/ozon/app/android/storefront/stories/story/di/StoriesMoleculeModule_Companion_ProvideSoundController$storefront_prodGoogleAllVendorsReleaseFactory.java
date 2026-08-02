package ru.ozon.app.android.storefront.stories.story.di;

import Jb.e;
import Jb.j;
import Pc.a;
import ru.ozon.app.android.video.player.soundservice.SoundController;
import ru.ozon.app.android.video.player.soundservice.SoundService;

/* loaded from: classes2.dex */
public final class StoriesMoleculeModule_Companion_ProvideSoundController$storefront_prodGoogleAllVendorsReleaseFactory implements e<SoundController> {
    private final a<SoundService> soundServiceProvider;

    public StoriesMoleculeModule_Companion_ProvideSoundController$storefront_prodGoogleAllVendorsReleaseFactory(a<SoundService> aVar) {
        this.soundServiceProvider = aVar;
    }

    public static StoriesMoleculeModule_Companion_ProvideSoundController$storefront_prodGoogleAllVendorsReleaseFactory create(a<SoundService> aVar) {
        return new StoriesMoleculeModule_Companion_ProvideSoundController$storefront_prodGoogleAllVendorsReleaseFactory(aVar);
    }

    public static SoundController provideSoundController$storefront_prodGoogleAllVendorsRelease(SoundService soundService) {
        SoundController provideSoundController$storefront_prodGoogleAllVendorsRelease = StoriesMoleculeModule.INSTANCE.provideSoundController$storefront_prodGoogleAllVendorsRelease(soundService);
        j.d(provideSoundController$storefront_prodGoogleAllVendorsRelease);
        return provideSoundController$storefront_prodGoogleAllVendorsRelease;
    }

    @Override // Pc.a
    public SoundController get() {
        return provideSoundController$storefront_prodGoogleAllVendorsRelease(this.soundServiceProvider.get());
    }
}
