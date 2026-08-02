package com.vk.video.ui.search.filters.api.di;

import com.vk.di.component.DiScopedComponent;
import xsna.c8m;
import xsna.g8m;
import xsna.pwj0;

/* compiled from: VideoSearchFiltersComponent.kt */
/* loaded from: classes7.dex */
public interface VideoSearchFiltersComponent extends DiScopedComponent<pwj0> {
    public static final Companion Companion = Companion.a;

    /* compiled from: VideoSearchFiltersComponent.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
        public static final VideoSearchFiltersComponent$Companion$DISABLED$1 b = new VideoSearchFiltersComponent() { // from class: com.vk.video.ui.search.filters.api.di.VideoSearchFiltersComponent$Companion$DISABLED$1
        };
        public static final a c = new a();

        /* compiled from: VideoSearchFiltersComponent.kt */
        public static final class a implements c8m<VideoSearchFiltersComponent, pwj0> {
            @Override // xsna.c8m
            public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
                return Companion.b;
            }
        }

        public static a a() {
            return c;
        }
    }
}
