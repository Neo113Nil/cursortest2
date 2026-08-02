package ru.ozon.composer.compose.widget;

import S0.H0;
import androidx.lifecycle.J;
import b00.C5497a;
import c00.InterfaceC5696a;
import e3.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.C7854a;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a5\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001aC\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u0006*\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aA\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006*\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00070\u00062\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/lifecycle/J;", "owner", "Ll10/i;", "container", "", "extraSize", "", "LS0/H0;", "c", "(Landroidx/lifecycle/J;Ll10/i;I)[LS0/H0;", "count", "b", "([LS0/H0;Landroidx/lifecycle/J;Ll10/i;I)[LS0/H0;", "Lru/ozon/composer/compose/widget/e;", "providers", "Ll20/a;", "viewItem", "a", "([LS0/H0;[Lru/ozon/composer/compose/widget/e;Ll20/a;)[LS0/H0;", "I", "INTERNAL_PROVIDERS_SIZE", "composer-compose-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final int f94633a = 7;

    @InterfaceC5696a
    @NotNull
    public static final H0<?>[] a(@NotNull H0<?>[] h0Arr, @NotNull e[] providers, @NotNull C7854a viewItem) {
        Intrinsics.checkNotNullParameter(h0Arr, "<this>");
        Intrinsics.checkNotNullParameter(providers, "providers");
        Intrinsics.checkNotNullParameter(viewItem, "viewItem");
        if (providers.length == 0) {
            return h0Arr;
        }
        int length = h0Arr.length - providers.length;
        int length2 = providers.length;
        for (int i11 = 0; i11 < length2; i11++) {
            h0Arr[length + i11] = providers[i11].a(viewItem);
        }
        return h0Arr;
    }

    @InterfaceC5696a
    @NotNull
    public static final H0<?>[] b(@NotNull H0<?>[] h0Arr, @NotNull J owner, @NotNull l10.i container, int i11) {
        Intrinsics.checkNotNullParameter(h0Arr, "<this>");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(container, "container");
        h0Arr[i11 - 1] = r.a().c(owner);
        h0Arr[i11 - 2] = b00.f.a().c(container.J());
        h0Arr[i11 - 3] = b00.f.c().c(container.M());
        h0Arr[i11 - 4] = b00.f.e().c(container.X());
        h0Arr[i11 - 5] = b00.f.d().c(container.Q());
        h0Arr[i11 - 6] = b00.f.f().c(container.a0());
        h0Arr[i11 - 7] = b00.f.b().c(C5497a.a(C5497a.b(container)));
        return h0Arr;
    }

    @InterfaceC5696a
    @NotNull
    public static final H0<?>[] c(@NotNull J owner, @NotNull l10.i container, int i11) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(container, "container");
        return b(new H0[i11 + 7], owner, container, 7);
    }

    public static /* synthetic */ H0[] d(J j11, l10.i iVar, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        return c(j11, iVar, i11);
    }
}
