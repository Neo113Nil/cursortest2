package ru.ozon.app.android.fresh.common.widgets;

import YZ.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/common/widgets/FreshSupportedPayloadTypesModule;", "", "<init>", "()V", "", "LYZ/a;", "provideSupportedPayloadTypes$widgets_prodGoogleAllVendorsRelease", "()Ljava/util/Set;", "provideSupportedPayloadTypes", "Companion", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FreshSupportedPayloadTypesModule {
    @NotNull
    public final Set<a> provideSupportedPayloadTypes$widgets_prodGoogleAllVendorsRelease() {
        Intrinsics.checkNotNullParameter("beak_pull", "type");
        a a11 = a.a("beak_pull");
        Intrinsics.checkNotNullParameter("select", "type");
        a a12 = a.a("select");
        Intrinsics.checkNotNullParameter("unselect", "type");
        a a13 = a.a("unselect");
        Intrinsics.checkNotNullParameter("inputClick", "type");
        return e0.a(a11, a12, a13, a.a("inputClick"));
    }
}
