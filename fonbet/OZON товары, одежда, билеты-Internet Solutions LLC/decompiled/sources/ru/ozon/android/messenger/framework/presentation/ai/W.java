package ru.ozon.android.messenger.framework.presentation.ai;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<ru.ozon.android.messenger.framework.presentation.models.q> f89398a;

    /* renamed from: b, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.C0 f89399b;

    /* renamed from: c, reason: collision with root package name */
    private final ru.ozon.android.messenger.framework.presentation.ai.delegates.a f89400c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f89401d;

    public W() {
        this(null, 15);
    }

    public static W a(W w11, String text) {
        List<ru.ozon.android.messenger.framework.presentation.models.q> noUiItems = w11.f89398a;
        ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.C0 c02 = w11.f89399b;
        ru.ozon.android.messenger.framework.presentation.ai.delegates.a aVar = w11.f89400c;
        w11.getClass();
        Intrinsics.checkNotNullParameter(noUiItems, "noUiItems");
        Intrinsics.checkNotNullParameter(text, "text");
        return new W(noUiItems, c02, aVar, text);
    }

    public final ru.ozon.android.messenger.framework.presentation.ai.delegates.a b() {
        return this.f89400c;
    }

    @NotNull
    public final List<ru.ozon.android.messenger.framework.presentation.models.q> c() {
        return this.f89398a;
    }

    @NotNull
    public final String d() {
        return this.f89401d;
    }

    public final ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.C0 e() {
        return this.f89399b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W)) {
            return false;
        }
        W w11 = (W) obj;
        return Intrinsics.d(this.f89398a, w11.f89398a) && Intrinsics.d(this.f89399b, w11.f89399b) && Intrinsics.d(this.f89400c, w11.f89400c) && Intrinsics.d(this.f89401d, w11.f89401d);
    }

    public final int hashCode() {
        int hashCode = this.f89398a.hashCode() * 31;
        ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.C0 c02 = this.f89399b;
        int hashCode2 = (hashCode + (c02 == null ? 0 : c02.hashCode())) * 31;
        ru.ozon.android.messenger.framework.presentation.ai.delegates.a aVar = this.f89400c;
        return this.f89401d.hashCode() + ((hashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31);
    }

    @NotNull
    public final String toString() {
        return "AiAssistantScreenState(noUiItems=" + this.f89398a + ", widgets=" + this.f89399b + ", aiContext=" + this.f89400c + ", text=" + this.f89401d + ")";
    }

    public W(@NotNull List<ru.ozon.android.messenger.framework.presentation.models.q> noUiItems, ru.ozon.android.messenger.framework.presentation.chatdetail.viewmodel.C0 c02, ru.ozon.android.messenger.framework.presentation.ai.delegates.a aVar, @NotNull String text) {
        Intrinsics.checkNotNullParameter(noUiItems, "noUiItems");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f89398a = noUiItems;
        this.f89399b = c02;
        this.f89400c = aVar;
        this.f89401d = text;
    }

    public W(List list, int i11) {
        this((i11 & 1) != 0 ? kotlin.collections.K.f71697a : list, null, null, "");
    }
}
