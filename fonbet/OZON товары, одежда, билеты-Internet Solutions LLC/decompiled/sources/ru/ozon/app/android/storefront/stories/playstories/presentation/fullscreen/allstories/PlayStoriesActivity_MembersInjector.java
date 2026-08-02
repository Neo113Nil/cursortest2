package ru.ozon.app.android.storefront.stories.playstories.presentation.fullscreen.allstories;

import EZ.h;
import GZ.g;
import Ib.b;
import Pc.a;

/* loaded from: classes2.dex */
public final class PlayStoriesActivity_MembersInjector implements b<PlayStoriesActivity> {
    public static void injectNavigatorHolder(PlayStoriesActivity playStoriesActivity, h hVar) {
        playStoriesActivity.navigatorHolder = hVar;
    }

    public static void injectOzonRouter(PlayStoriesActivity playStoriesActivity, g gVar) {
        playStoriesActivity.ozonRouter = gVar;
    }

    public static void injectViewModelProvider(PlayStoriesActivity playStoriesActivity, a<PlayStoriesViewModelImpl> aVar) {
        playStoriesActivity.viewModelProvider = aVar;
    }
}
