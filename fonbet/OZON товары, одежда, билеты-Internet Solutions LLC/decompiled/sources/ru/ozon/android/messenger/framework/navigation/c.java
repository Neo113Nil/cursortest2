package ru.ozon.android.messenger.framework.navigation;

import Fi.e;
import android.content.Intent;
import fd.InterfaceC6512o;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.gallery.media.view.GalleryActivity;

/* loaded from: classes10.dex */
final class c extends AbstractC7737t implements InterfaceC6512o<GalleryActivity, Integer, Integer, Intent, Unit> {

    /* renamed from: b, reason: collision with root package name */
    public static final c f89175b = new c(4);

    @Override // fd.InterfaceC6512o
    public final Unit invoke(GalleryActivity galleryActivity, Integer num, Integer num2, Intent intent) {
        GalleryActivity activity = galleryActivity;
        Intrinsics.checkNotNullParameter(activity, "activity");
        e.b(activity, num.intValue(), num2.intValue(), intent);
        return Unit.f71690a;
    }
}
