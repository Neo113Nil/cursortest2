package ru.ozon.android.messenger.framework.navigation;

import Fi.e;
import Hi.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.gallery.media.view.GalleryActivity;

/* loaded from: classes10.dex */
final class a extends AbstractC7737t implements Function2<GalleryActivity, k, Unit> {

    /* renamed from: b, reason: collision with root package name */
    public static final a f89158b = new a(2);

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(GalleryActivity galleryActivity, k kVar) {
        GalleryActivity activity = galleryActivity;
        k media = kVar;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(media, "media");
        e.f(activity, media);
        return Unit.f71690a;
    }
}
