package ru.ozon.android.messenger.framework.presentation.common.view.flashbar.main;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private ViewGroup f91169a;

    /* renamed from: b, reason: collision with root package name */
    private OzonSpannableString f91170b;

    /* renamed from: c, reason: collision with root package name */
    private long f91171c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f91172d;

    /* renamed from: e, reason: collision with root package name */
    private String f91173e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f91174f;

    public a(@NotNull ViewGroup rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        this.f91169a = rootView;
        this.f91171c = 10000L;
    }

    @NotNull
    public final void a(long j11) {
        this.f91171c = j11;
    }

    @NotNull
    public final void b() {
        this.f91174f = true;
    }

    public final long c() {
        return this.f91171c;
    }

    public final boolean d() {
        return this.f91174f;
    }

    public final Integer e() {
        return this.f91172d;
    }

    public final String f() {
        return this.f91173e;
    }

    public final OzonSpannableString g() {
        return this.f91170b;
    }

    @NotNull
    public final ViewGroup h() {
        return this.f91169a;
    }

    @NotNull
    public final void i(int i11) {
        this.f91172d = Integer.valueOf(i11);
    }

    @NotNull
    public final void j(String str) {
        this.f91173e = str;
    }

    @NotNull
    public final void k(@NotNull OzonSpannableString message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f91170b = message;
    }
}
