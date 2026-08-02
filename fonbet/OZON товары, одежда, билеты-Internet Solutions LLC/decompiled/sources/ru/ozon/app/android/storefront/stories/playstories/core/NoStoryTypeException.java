package ru.ozon.app.android.storefront.stories.playstories.core;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstories/core/NoStoryTypeException;", "", "<init>", "()V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NoStoryTypeException extends Throwable {

    @NotNull
    public static final NoStoryTypeException INSTANCE = new NoStoryTypeException();

    private NoStoryTypeException() {
        super("Cannot open a Story without StoryType.");
    }
}
