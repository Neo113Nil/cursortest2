package ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.di;

import YZ.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryV2/di/ReviewsOzonTrackerSupportedPayloadTypesModule;", "", "<init>", "()V", "", "LYZ/a;", "provideSupportedPayloadTypes$core_prodGoogleAllVendorsRelease", "()Ljava/util/Set;", "provideSupportedPayloadTypes", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReviewsOzonTrackerSupportedPayloadTypesModule {
    @NotNull
    public final Set<a> provideSupportedPayloadTypes$core_prodGoogleAllVendorsRelease() {
        Intrinsics.checkNotNullParameter("video_view", "type");
        a a11 = a.a("video_view");
        Intrinsics.checkNotNullParameter("video_view_finish", "type");
        a a12 = a.a("video_view_finish");
        Intrinsics.checkNotNullParameter("pause", "type");
        a a13 = a.a("pause");
        Intrinsics.checkNotNullParameter("continue", "type");
        a a14 = a.a("continue");
        Intrinsics.checkNotNullParameter("next", "type");
        a a15 = a.a("next");
        Intrinsics.checkNotNullParameter("autoscroll", "type");
        return e0.a(a11, a12, a13, a14, a15, a.a("autoscroll"));
    }
}
