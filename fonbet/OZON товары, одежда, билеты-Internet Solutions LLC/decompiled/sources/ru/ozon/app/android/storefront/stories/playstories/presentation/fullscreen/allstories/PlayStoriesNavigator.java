package ru.ozon.app.android.storefront.stories.playstories.presentation.fullscreen.allstories;

import EZ.e;
import EZ.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tZ.C9786a;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstories/presentation/fullscreen/allstories/PlayStoriesNavigator;", "LEZ/g;", "Lru/ozon/app/android/storefront/stories/playstories/presentation/fullscreen/allstories/PlayStoriesActivity;", "activity", "<init>", "(Lru/ozon/app/android/storefront/stories/playstories/presentation/fullscreen/allstories/PlayStoriesActivity;)V", "LEZ/e;", "response", "", "requestCode", "", "navigate", "(LEZ/e;I)V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlayStoriesNavigator extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayStoriesNavigator(@NotNull PlayStoriesActivity activity) {
        super(activity, null, null, null, 14, null);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // EZ.g
    public void navigate(@NotNull e<?> response, int requestCode) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.b() instanceof C9786a) {
            super.navigate(response, requestCode);
        } else {
            getActivity().finish();
            next(response, requestCode);
        }
    }
}
