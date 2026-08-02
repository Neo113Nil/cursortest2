package ru.ozon.android.messenger.framework.navigation;

import Fi.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.gallery.media.view.GalleryActivity;

/* loaded from: classes10.dex */
final class b extends AbstractC7737t implements Function1<GalleryActivity, Unit> {

    /* renamed from: b, reason: collision with root package name */
    public static final b f89174b = new b(1);

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(GalleryActivity galleryActivity) {
        GalleryActivity activity = galleryActivity;
        Intrinsics.checkNotNullParameter(activity, "activity");
        e.d(activity);
        return Unit.f71690a;
    }
}
